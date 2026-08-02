package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.commons.http.Http;
import ru.ok.android.utils.Logger;
import xsna.er;
import xsna.go9;
import xsna.i6n0;
import xsna.qoy;
import xsna.z9r;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String[] COLUMNS;
    private static final File DEVICE_ROOT;
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static final HashMap<String, a> sCache;
    private String mAuthority;
    private a mLocalPathStrategy;
    private final Object mLock;
    private final int mResourceId;

    /* loaded from: classes11.dex */
    public interface a {
        Uri a(File file);

        File b(Uri uri);
    }

    /* loaded from: classes11.dex */
    public static class b implements a {
        public final String a;
        public final HashMap<String, File> b = new HashMap<>();

        public b(String str) {
            this.a = str;
        }

        @Override // androidx.core.content.FileProvider.a
        public final Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (FileProvider.removeTrailingSlash(canonicalPath).startsWith(FileProvider.removeTrailingSlash(path) + '/') && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(go9.b("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                return er.a(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith(DomExceptionUtils.SEPARATOR) ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), DomExceptionUtils.SEPARATOR)).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException(z9r.a(file, "Failed to resolve canonical path for "));
            }
        }

        @Override // androidx.core.content.FileProvider.a
        public final File b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            if (indexOf == -1) {
                throw new IllegalArgumentException(i6n0.a(uri, "Unable to find path from root: "));
            }
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException(i6n0.a(uri, "Unable to find configured root for "));
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                String path = canonicalFile.getPath();
                String path2 = file.getPath();
                if (FileProvider.removeTrailingSlash(path).startsWith(FileProvider.removeTrailingSlash(path2) + '/')) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException(z9r.a(file2, "Failed to resolve canonical path for "));
            }
        }

        public final void c(File file, String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException(z9r.a(file, "Failed to resolve canonical path for "), e);
            }
        }
    }

    static {
        com.vk.metrics.performance.appstart.content_provider.a.b("androidx.core.content.FileProvider.<clinit>(FileProvider.java:353)");
        try {
            COLUMNS = new String[]{"_display_name", "_size"};
            DEVICE_ROOT = new File(DomExceptionUtils.SEPARATOR);
            sCache = new HashMap<>();
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("androidx.core.content.FileProvider.<clinit>(FileProvider.java:353)");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileProvider() {
        this(0);
        com.vk.metrics.performance.appstart.content_provider.a.b("androidx.core.content.FileProvider.<init>(FileProvider.java:385)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("androidx.core.content.FileProvider.<init>(FileProvider.java:385)");
        }
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            throw new IllegalArgumentException(go9.b("Couldn't find meta-data for provider with authority ", str));
        }
        if (providerInfo.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private a getLocalPathStrategy() {
        a aVar;
        synchronized (this.mLock) {
            try {
                if (this.mAuthority == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
                }
                aVar = this.mLocalPathStrategy;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private static a getPathStrategy(Context context, String str, int i) {
        a aVar;
        HashMap<String, a> hashMap = sCache;
        synchronized (hashMap) {
            try {
                aVar = hashMap.get(str);
                if (aVar == null) {
                    try {
                        try {
                            aVar = parsePathStrategy(context, str, i);
                            hashMap.put(str, aVar);
                        } catch (IOException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str, 0).a(file);
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (Logger.METHOD_W.equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(go9.b("Invalid mode: ", str));
    }

    private static a parsePathStrategy(Context context, String str, int i) throws IOException, XmlPullParserException {
        b bVar = new b(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File file = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, "path");
                if (TAG_ROOT_PATH.equals(name)) {
                    file = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    file = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    file = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file != null) {
                    bVar.c(buildPath(file, attributeValue2), attributeValue);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String removeTrailingSlash(String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : qoy.c(1, 0, str);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        com.vk.metrics.performance.appstart.content_provider.a.b("androidx.core.content.FileProvider.attachInfo(FileProvider.java:626)");
        try {
            super.attachInfo(context, providerInfo);
            if (providerInfo.exported) {
                throw new SecurityException("Provider must not be exported");
            }
            if (!providerInfo.grantUriPermissions) {
                throw new SecurityException("Provider must grant uri permissions");
            }
            String str = providerInfo.authority;
            if (str == null || str.trim().isEmpty()) {
                throw new SecurityException("Provider must have a non-empty authority");
            }
            String str2 = providerInfo.authority.split(";")[0];
            synchronized (this.mLock) {
                this.mAuthority = str2;
            }
            HashMap<String, a> hashMap = sCache;
            synchronized (hashMap) {
                hashMap.remove(str2);
            }
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("androidx.core.content.FileProvider.attachInfo(FileProvider.java:626)");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return getLocalPathStrategy().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File b2 = getLocalPathStrategy().b(uri);
        int lastIndexOf = b2.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return Http.ContentType.APPLICATION_OCTET_STREAM;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b2.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : Http.ContentType.APPLICATION_OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return Http.ContentType.APPLICATION_OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.vk.metrics.performance.appstart.content_provider.a.b("androidx.core.content.FileProvider.onCreate(FileProvider.java:612)");
        try {
            return true;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("androidx.core.content.FileProvider.onCreate(FileProvider.java:612)");
        }
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(getLocalPathStrategy().b(uri), modeToMode(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        com.vk.metrics.performance.appstart.content_provider.a.b("androidx.core.content.FileProvider.query(FileProvider.java:687)");
        try {
            File b2 = getLocalPathStrategy().b(uri);
            String queryParameter = uri.getQueryParameter("displayName");
            if (strArr == null) {
                strArr = COLUMNS;
            }
            String[] strArr3 = new String[strArr.length];
            Object[] objArr = new Object[strArr.length];
            int i2 = 0;
            for (String str3 : strArr) {
                if ("_display_name".equals(str3)) {
                    strArr3[i2] = "_display_name";
                    i = i2 + 1;
                    objArr[i2] = queryParameter == null ? b2.getName() : queryParameter;
                } else if ("_size".equals(str3)) {
                    strArr3[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(b2.length());
                }
                i2 = i;
            }
            String[] copyOf = copyOf(strArr3, i2);
            Object[] copyOf2 = copyOf(objArr, i2);
            MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
            matrixCursor.addRow(copyOf2);
            com.vk.metrics.performance.appstart.content_provider.a.a("androidx.core.content.FileProvider.query(FileProvider.java:687)");
            return matrixCursor;
        } catch (Throwable th) {
            com.vk.metrics.performance.appstart.content_provider.a.a("androidx.core.content.FileProvider.query(FileProvider.java:687)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter("displayName", str2).build();
    }

    public FileProvider(int i) {
        this.mLock = new Object();
        this.mResourceId = i;
    }
}
