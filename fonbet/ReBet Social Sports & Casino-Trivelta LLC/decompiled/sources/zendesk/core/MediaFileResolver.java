package zendesk.core;

import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.inject.Inject;
import l0.AbstractC5339d;
import ld.AbstractC5459a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public class MediaFileResolver {
    private static final String ATTACHMENT_NAME = "attachment_%s";
    private static final String CAMERA_DATETIME_STRING_FORMAT = "yyyyMMddHHmmssSSS";
    private static final String CAMERA_IMG_NAME = "camera_image_%s";
    private static final String CAMERA_IMG_SUFFIX = ".jpg";
    private static final String FILE_DIR_MEDIA = "media";
    private static final String FILE_DIR_USER = "user";
    private static final String FILE_DIR_USER_MEDIA = "zendesk-user-media-data";
    private static final String LOG_TAG = "MediaFileUtility";
    private static final String MEDIA_FILE_PROVIDER_AUTHORITY_SUFFIX = ".zendesk.sdk.user.attachments";
    private static final String MEDIA_FORMATTED_BASE_PATH;
    private static final String PATH_PLACEHOLDER = "%s%s%s";
    private static final String REQUEST_FORMATTED_MEDIA_PATH;
    private final Context context;

    static {
        Locale locale = Locale.US;
        String str = File.separator;
        String format = String.format(locale, PATH_PLACEHOLDER, "zendesk", str, "support");
        MEDIA_FORMATTED_BASE_PATH = format;
        REQUEST_FORMATTED_MEDIA_PATH = String.format(locale, PATH_PLACEHOLDER, format, str, "request");
    }

    @Inject
    public MediaFileResolver(Context context) {
        this.context = context;
    }

    private void clearDirectory(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                clearDirectory(file2);
            }
        }
        file.delete();
    }

    private File createTempFile(File file, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb2.append(str2);
        return new File(file, sb2.toString());
    }

    private File getAttachmentDir(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str + File.separator;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDir(this.context));
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(FILE_DIR_USER_MEDIA);
        sb2.append(str3);
        sb2.append(str2);
        File file = new File(sb2.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return file;
        }
        return null;
    }

    private String getExtension(Uri uri, boolean z10) {
        String lastPathSegment;
        int lastIndexOf;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String scheme = uri.getScheme();
        String extensionFromMimeType = "content".equals(scheme) ? singleton.getExtensionFromMimeType(this.context.getContentResolver().getType(uri)) : (!"file".equals(scheme) || (lastIndexOf = (lastPathSegment = uri.getLastPathSegment()).lastIndexOf(".")) == -1) ? "tmp" : lastPathSegment.substring(lastIndexOf + 1, lastPathSegment.length());
        return z10 ? String.format(Locale.US, ".%s", extensionFromMimeType) : extensionFromMimeType;
    }

    private String getFileNameFromUri(Uri uri) {
        String scheme = uri.getScheme();
        if ("content".equals(scheme)) {
            Cursor query = this.context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (query != null) {
                try {
                    return query.moveToFirst() ? query.getString(0) : "";
                } finally {
                    query.close();
                }
            }
        } else if ("file".equals(scheme)) {
            return uri.getLastPathSegment();
        }
        return "";
    }

    private String getRootDir(Context context) {
        return context.getCacheDir().getAbsolutePath();
    }

    public void clearStorage() {
        File file = new File(getRootDir(this.context) + File.separator + FILE_DIR_USER_MEDIA);
        if (file.isDirectory()) {
            clearDirectory(file);
        }
    }

    public File createCacheFile(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str3 = FILE_DIR_USER;
        if (!isEmpty) {
            str3 = FILE_DIR_USER + File.separator + str;
        }
        File attachmentDir = getAttachmentDir(str3);
        if (attachmentDir != null) {
            return createTempFile(attachmentDir, str2, null);
        }
        Log.w(LOG_TAG, "Error creating cache directory");
        return null;
    }

    public String createTakenPictureFileName() {
        Locale locale = Locale.US;
        return String.format(locale, CAMERA_IMG_NAME, new SimpleDateFormat(CAMERA_DATETIME_STRING_FORMAT, locale).format(new Date(System.currentTimeMillis()))) + CAMERA_IMG_SUFFIX;
    }

    public Uri createUriToSaveTakenPicture() {
        return getFileProviderUri(this.context, createCacheFile(getTemporaryRequestCacheDir(), createTakenPictureFileName()));
    }

    public List<File> fetchFilesFromUris(List<Uri> list) {
        Throwable th2;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[PKIFailureInfo.badCertTemplate];
        String str = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        for (Uri uri : list) {
            try {
                try {
                    inputStream = this.context.getContentResolver().openInputStream(uri);
                    File fileForUri = getFileForUri(uri, str);
                    if (inputStream == null || fileForUri == null) {
                        Locale locale = Locale.US;
                        boolean z10 = true;
                        Boolean valueOf = Boolean.valueOf(inputStream == null);
                        if (fileForUri != null) {
                            z10 = false;
                        }
                        AbstractC5459a.i(LOG_TAG, String.format(locale, "Unable to resolve uri. InputStream null = %s, File null = %s", valueOf, Boolean.valueOf(z10)), new Object[0]);
                    } else {
                        AbstractC5459a.b(LOG_TAG, String.format(Locale.US, "Copying media file into private cache - Uri: %s - Dest: %s", uri, fileForUri), new Object[0]);
                        FileOutputStream fileOutputStream2 = new FileOutputStream(fileForUri);
                        while (true) {
                            try {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, read);
                            } catch (FileNotFoundException e10) {
                                e = e10;
                                fileOutputStream = fileOutputStream2;
                                AbstractC5459a.c(LOG_TAG, String.format(Locale.US, "File not found error copying file, uri: %s", uri), e, new Object[0]);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e11) {
                                        AbstractC5459a.c(LOG_TAG, "Error closing InputStream", e11, new Object[0]);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e12) {
                                        AbstractC5459a.c(LOG_TAG, "Error closing FileOutputStream", e12, new Object[0]);
                                    }
                                }
                                str = null;
                            } catch (IOException e13) {
                                e = e13;
                                fileOutputStream = fileOutputStream2;
                                AbstractC5459a.c(LOG_TAG, String.format(Locale.US, "IO Error copying file, uri: %s", uri), e, new Object[0]);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e14) {
                                        AbstractC5459a.c(LOG_TAG, "Error closing InputStream", e14, new Object[0]);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e15) {
                                        AbstractC5459a.c(LOG_TAG, "Error closing FileOutputStream", e15, new Object[0]);
                                    }
                                }
                                str = null;
                            } catch (IllegalStateException e16) {
                                e = e16;
                                fileOutputStream = fileOutputStream2;
                                AbstractC5459a.c(LOG_TAG, String.format(Locale.US, "The file is either partially downloaded or corrupted, uri: %s", uri), e, new Object[0]);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e17) {
                                        AbstractC5459a.c(LOG_TAG, "Error closing InputStream", e17, new Object[0]);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e18) {
                                        AbstractC5459a.c(LOG_TAG, "Error closing FileOutputStream", e18, new Object[0]);
                                    }
                                }
                                str = null;
                            } catch (Throwable th3) {
                                th2 = th3;
                                fileOutputStream = fileOutputStream2;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e19) {
                                        AbstractC5459a.c(LOG_TAG, "Error closing InputStream", e19, new Object[0]);
                                    }
                                }
                                if (fileOutputStream == null) {
                                    throw th2;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th2;
                                } catch (IOException e20) {
                                    AbstractC5459a.c(LOG_TAG, "Error closing FileOutputStream", e20, new Object[0]);
                                    throw th2;
                                }
                            }
                        }
                        fileOutputStream = fileOutputStream2;
                    }
                    arrayList.add(fileForUri);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e21) {
                            AbstractC5459a.c(LOG_TAG, "Error closing InputStream", e21, new Object[0]);
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e22) {
                            AbstractC5459a.c(LOG_TAG, "Error closing FileOutputStream", e22, new Object[0]);
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (FileNotFoundException e23) {
                e = e23;
            } catch (IOException e24) {
                e = e24;
            } catch (IllegalStateException e25) {
                e = e25;
            }
            str = null;
        }
        return arrayList;
    }

    public File getFileForUri(Uri uri, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = FILE_DIR_MEDIA;
        } else {
            str2 = FILE_DIR_USER + File.separator + str;
        }
        File attachmentDir = getAttachmentDir(str2);
        String str3 = null;
        if (attachmentDir == null) {
            Log.w(LOG_TAG, "Error creating cache directory");
            return null;
        }
        String fileNameFromUri = getFileNameFromUri(uri);
        if (TextUtils.isEmpty(fileNameFromUri)) {
            Locale locale = Locale.US;
            fileNameFromUri = String.format(locale, ATTACHMENT_NAME, new SimpleDateFormat(CAMERA_DATETIME_STRING_FORMAT, locale).format(new Date(System.currentTimeMillis())));
            str3 = getExtension(uri, true);
        }
        return createTempFile(attachmentDir, fileNameFromUri, str3);
    }

    public String getFileProviderAuthority(Context context) {
        return String.format(Locale.US, "%s%s", context.getPackageName(), MEDIA_FILE_PROVIDER_AUTHORITY_SUFFIX);
    }

    public Uri getFileProviderUri(Context context, File file) {
        String fileProviderAuthority = getFileProviderAuthority(context);
        try {
            return AbstractC5339d.getUriForFile(context, fileProviderAuthority, file);
        } catch (IllegalArgumentException unused) {
            Log.e(LOG_TAG, String.format(Locale.US, "The selected file can't be shared %s", file.toString()));
            return null;
        } catch (NullPointerException e10) {
            String format = String.format(Locale.US, "=====================\nFileProvider failed to retrieve file uri. There might be an issue with the FileProvider \nPlease make sure that manifest-merger is working, and that you have defined the applicationId (package name) in the build.gradle\nManifest merger: http://tools.android.com/tech-docs/new-build-system/user-guide/manifest-merger\nIf your are not able to use gradle or the manifest merger, please add the following to your AndroidManifest.xml:\n        <provider\n            android:name=\".MediaFileProvider\"\n            android:authorities=\"${applicationId}%s\"\n            android:exported=\"false\"\n            android:grantUriPermissions=\"true\">\n            <meta-data\n                android:name=\"android.support.FILE_PROVIDER_PATHS\"\n                android:resource=\"@xml/zendesk_user_attachments\" />\n        </provider>\n=====================", fileProviderAuthority);
            Log.e(LOG_TAG, format, e10);
            Log.e(LOG_TAG, format, e10);
            throw new RuntimeException("Please specify your application id");
        }
    }

    public Pair<Integer, Integer> getImageDimensions(@NonNull File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public String getTemporaryRequestCacheDir() {
        return String.format(Locale.US, PATH_PLACEHOLDER, REQUEST_FORMATTED_MEDIA_PATH, File.separator, UUID.randomUUID().toString());
    }
}
