package com.reactnativecommunity.cameraroll;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.FileUtils;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.share.internal.ShareConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.reactnativecommunity.cameraroll.CameraRollModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@ReactModule(name = CameraRollModule.NAME)
/* loaded from: classes8.dex */
public class CameraRollModule extends ReactContextBaseJavaModule {
    private static final String ASSET_TYPE_ALL = "All";
    private static final String ASSET_TYPE_PHOTOS = "Photos";
    private static final String ASSET_TYPE_VIDEOS = "Videos";
    private static final String ERROR_UNABLE_TO_DELETE = "E_UNABLE_TO_DELETE";
    private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    private static final String INCLUDE_FILENAME = "filename";
    private static final String INCLUDE_FILE_EXTENSION = "fileExtension";
    private static final String INCLUDE_FILE_SIZE = "fileSize";
    private static final String INCLUDE_IMAGE_SIZE = "imageSize";
    private static final String INCLUDE_LOCATION = "location";
    private static final String INCLUDE_PLAYABLE_DURATION = "playableDuration";
    public static final String NAME = "RNCCameraRoll";
    private static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "date_added", "date_modified", "width", "height", "_size", "_data"};
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";

    public CameraRollModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void saveToCameraRoll(String str, ReadableMap readableMap, Promise promise) {
        new SaveToCameraRoll(getReactApplicationContext(), Uri.parse(str), readableMap, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class SaveToCameraRoll extends GuardedAsyncTask<Void, Void> {
        private final Context mContext;
        private final ReadableMap mOptions;
        private final Promise mPromise;
        private final Uri mUri;

        public SaveToCameraRoll(ReactContext reactContext, Uri uri, ReadableMap readableMap, Promise promise) {
            super(reactContext);
            this.mContext = reactContext;
            this.mUri = uri;
            this.mPromise = promise;
            this.mOptions = readableMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v20, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v23 */
        /* JADX WARN: Type inference failed for: r10v24 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Boolean, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.io.FileInputStream] */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void doInBackgroundGuarded(Void... voidArr) {
            Throwable th;
            OutputStream outputStream;
            FileInputStream fileInputStream;
            OutputStream outputStream2;
            File externalStoragePublicDirectory;
            String str;
            Uri insert;
            File file = new File(this.mUri.getPath());
            String mimeType = Utils.getMimeType(this.mUri.getPath());
            int i = 0;
            ?? r10 = (mimeType == null || !mimeType.contains("video")) ? 0 : 1;
            ?? valueOf = Boolean.valueOf((boolean) r10);
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    String string = this.mOptions.getString("album");
                    boolean isEmpty = TextUtils.isEmpty(string);
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            ContentValues contentValues = new ContentValues();
                            if (!isEmpty) {
                                contentValues.put("relative_path", Environment.DIRECTORY_DCIM + File.separator + string);
                            }
                            contentValues.put("mime_type", mimeType);
                            contentValues.put("_display_name", file.getName());
                            contentValues.put("is_pending", (Integer) 1);
                            ContentResolver contentResolver = this.mContext.getContentResolver();
                            valueOf.getClass();
                            if (r10 != 0) {
                                insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                            } else {
                                insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            }
                            r10 = contentResolver.openOutputStream(insert);
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(file);
                                FileUtils.copy(fileInputStream3, (OutputStream) r10);
                                contentValues.clear();
                                contentValues.put("is_pending", (Integer) 0);
                                contentResolver.update(insert, contentValues, null, null);
                                this.mPromise.resolve(insert.toString());
                                r10 = r10;
                                valueOf = fileInputStream3;
                            } catch (IOException e) {
                                e = e;
                                this.mPromise.reject(e);
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e2) {
                                        FLog.e("ReactNative", "Could not close input channel", e2);
                                    }
                                }
                                if (r10 == 0) {
                                    return;
                                }
                                r10.close();
                            }
                        } else {
                            if (!isEmpty) {
                                if ("video".equals(this.mOptions.getString("type"))) {
                                    externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
                                } else {
                                    externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                                }
                            } else {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                            }
                            if (!isEmpty) {
                                File file2 = new File(externalStoragePublicDirectory, string);
                                if (!file2.exists() && !file2.mkdirs()) {
                                    this.mPromise.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD, "Album Directory not created. Did you request WRITE_EXTERNAL_STORAGE?");
                                    return;
                                }
                                externalStoragePublicDirectory = file2;
                            }
                            if (!externalStoragePublicDirectory.isDirectory()) {
                                this.mPromise.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD, "External media storage directory not available");
                                return;
                            }
                            File file3 = new File(externalStoragePublicDirectory, file.getName());
                            String name = file.getName();
                            if (name.indexOf(46) >= 0) {
                                String substring = name.substring(0, name.lastIndexOf(46));
                                str = name.substring(name.lastIndexOf(46));
                                name = substring;
                            } else {
                                str = "";
                            }
                            while (!file3.createNewFile()) {
                                file3 = new File(externalStoragePublicDirectory, name + "_" + i + str);
                                i++;
                            }
                            valueOf = new FileInputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                FileOutputStream fileOutputStream2 = fileOutputStream;
                                fileOutputStream.getChannel().transferFrom(valueOf.getChannel(), 0L, valueOf.getChannel().size());
                                valueOf.close();
                                fileOutputStream.close();
                                MediaScannerConnection.scanFile(this.mContext, new String[]{file3.getAbsolutePath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.reactnativecommunity.cameraroll.CameraRollModule$SaveToCameraRoll$$ExternalSyntheticLambda1
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str2, Uri uri) {
                                        CameraRollModule.SaveToCameraRoll.this.lambda$doInBackgroundGuarded$0(str2, uri);
                                    }
                                });
                                r10 = fileOutputStream;
                                valueOf = valueOf;
                            } catch (IOException e3) {
                                e = e3;
                                r10 = 0;
                                fileInputStream2 = valueOf;
                                this.mPromise.reject(e);
                                if (fileInputStream2 != null) {
                                }
                                if (r10 == 0) {
                                }
                                r10.close();
                            } catch (Throwable th2) {
                                th = th2;
                                outputStream2 = null;
                                fileInputStream = valueOf;
                                fileInputStream2 = fileInputStream;
                                outputStream = outputStream2;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e4) {
                                        FLog.e("ReactNative", "Could not close input channel", e4);
                                    }
                                }
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                        throw th;
                                    } catch (IOException e5) {
                                        FLog.e("ReactNative", "Could not close output channel", e5);
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        }
                        try {
                            valueOf.close();
                        } catch (IOException e6) {
                            FLog.e("ReactNative", "Could not close input channel", e6);
                        }
                        if (r10 == 0) {
                            return;
                        }
                    } catch (IOException e7) {
                        e = e7;
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream2 = r10;
                        fileInputStream = valueOf;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = r10;
                }
            } catch (IOException e8) {
                e = e8;
                r10 = 0;
            } catch (Throwable th5) {
                th = th5;
                outputStream = null;
            }
            try {
                r10.close();
            } catch (IOException e9) {
                FLog.e("ReactNative", "Could not close output channel", e9);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doInBackgroundGuarded$0(String str, Uri uri) {
            if (uri != null) {
                this.mPromise.resolve(uri.toString());
            } else {
                this.mPromise.reject(CameraRollModule.ERROR_UNABLE_TO_SAVE, "Could not add image to gallery");
            }
        }
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        int i = readableMap.getInt("first");
        String string = readableMap.hasKey(TtmlNode.ANNOTATION_POSITION_AFTER) ? readableMap.getString(TtmlNode.ANNOTATION_POSITION_AFTER) : null;
        String string2 = readableMap.hasKey("groupName") ? readableMap.getString("groupName") : null;
        String string3 = readableMap.hasKey("assetType") ? readableMap.getString("assetType") : ASSET_TYPE_PHOTOS;
        long j = readableMap.hasKey("fromTime") ? (long) readableMap.getDouble("fromTime") : 0L;
        long j2 = readableMap.hasKey("toTime") ? (long) readableMap.getDouble("toTime") : 0L;
        new GetMediaTask(getReactApplicationContext(), i, string, string2, readableMap.hasKey("mimeTypes") ? readableMap.getArray("mimeTypes") : null, string3, j, j2, readableMap.hasKey("include") ? readableMap.getArray("include") : null, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private static class GetMediaTask extends GuardedAsyncTask<Void, Void> {

        @Nullable
        private final String mAfter;
        private final String mAssetType;
        private final Context mContext;
        private final int mFirst;
        private final long mFromTime;

        @Nullable
        private final String mGroupName;
        private final Set<String> mInclude;

        @Nullable
        private final ReadableArray mMimeTypes;
        private final Promise mPromise;
        private final long mToTime;

        private GetMediaTask(ReactContext reactContext, int i, @Nullable String str, @Nullable String str2, @Nullable ReadableArray readableArray, String str3, long j, long j2, @Nullable ReadableArray readableArray2, Promise promise) {
            super(reactContext);
            this.mContext = reactContext;
            this.mFirst = i;
            this.mAfter = str;
            this.mGroupName = str2;
            this.mMimeTypes = readableArray;
            this.mPromise = promise;
            this.mAssetType = str3;
            this.mFromTime = j;
            this.mToTime = j2;
            this.mInclude = createSetFromIncludeArray(readableArray2);
        }

        private static Set<String> createSetFromIncludeArray(@Nullable ReadableArray readableArray) {
            HashSet hashSet = new HashSet();
            if (readableArray != null) {
                for (int i = 0; i < readableArray.size(); i++) {
                    String string = readableArray.getString(i);
                    if (string != null) {
                        hashSet.add(string);
                    }
                }
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            Cursor query;
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.mGroupName)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.mGroupName);
            }
            if (this.mAssetType.equals(CameraRollModule.ASSET_TYPE_PHOTOS)) {
                sb.append(" AND media_type = 1");
            } else if (this.mAssetType.equals(CameraRollModule.ASSET_TYPE_VIDEOS)) {
                sb.append(" AND media_type = 3");
            } else if (this.mAssetType.equals(CameraRollModule.ASSET_TYPE_ALL)) {
                sb.append(" AND media_type IN (3,1)");
            } else {
                this.mPromise.reject(CameraRollModule.ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + this.mAssetType + "'. Expected one of 'Photos', 'Videos' or 'All'.");
                return;
            }
            ReadableArray readableArray = this.mMimeTypes;
            if (readableArray != null && readableArray.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.mMimeTypes.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.mMimeTypes.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), ")");
            }
            long j = this.mFromTime;
            if (j > 0) {
                sb.append(" AND (datetaken > ? OR ( datetaken IS NULL AND date_added> ? ))");
                arrayList.add(this.mFromTime + "");
                arrayList.add((j / 1000) + "");
            }
            long j2 = this.mToTime;
            if (j2 > 0) {
                sb.append(" AND (datetaken <= ? OR ( datetaken IS NULL AND date_added <= ? ))");
                arrayList.add(this.mToTime + "");
                arrayList.add((j2 / 1000) + "");
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.mContext.getContentResolver();
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    Bundle bundle = new Bundle();
                    bundle.putString("android:query-arg-sql-selection", sb.toString());
                    bundle.putStringArray("android:query-arg-sql-selection-args", (String[]) arrayList.toArray(new String[arrayList.size()]));
                    bundle.putString("android:query-arg-sql-sort-order", "date_added DESC, date_modified DESC");
                    bundle.putInt("android:query-arg-limit", this.mFirst + 1);
                    if (!TextUtils.isEmpty(this.mAfter)) {
                        bundle.putInt("android:query-arg-offset", Integer.parseInt(this.mAfter));
                    }
                    query = contentResolver.query(MediaStore.Files.getContentUri("external"), CameraRollModule.PROJECTION, bundle, null);
                } else {
                    String str = "limit=" + (this.mFirst + 1);
                    if (!TextUtils.isEmpty(this.mAfter)) {
                        str = "limit=" + this.mAfter + "," + (this.mFirst + 1);
                    }
                    query = contentResolver.query(MediaStore.Files.getContentUri("external").buildUpon().encodedQuery(str).build(), CameraRollModule.PROJECTION, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), "date_added DESC, date_modified DESC");
                }
                if (query == null) {
                    this.mPromise.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD, "Could not get media");
                    return;
                }
                try {
                    CameraRollModule.putEdges(contentResolver, query, writableNativeMap, this.mFirst, this.mInclude);
                    CameraRollModule.putPageInfo(query, writableNativeMap, this.mFirst, TextUtils.isEmpty(this.mAfter) ? 0 : Integer.parseInt(this.mAfter));
                } finally {
                    query.close();
                    this.mPromise.resolve(writableNativeMap);
                }
            } catch (SecurityException e) {
                this.mPromise.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e);
            }
        }
    }

    @ReactMethod
    public void getAlbums(ReadableMap readableMap, Promise promise) {
        String string = readableMap.hasKey("assetType") ? readableMap.getString("assetType") : ASSET_TYPE_ALL;
        StringBuilder sb = new StringBuilder("1");
        ArrayList arrayList = new ArrayList();
        if (string.equals(ASSET_TYPE_PHOTOS)) {
            sb.append(" AND media_type = 1");
        } else if (string.equals(ASSET_TYPE_VIDEOS)) {
            sb.append(" AND media_type = 3");
        } else {
            if (!string.equals(ASSET_TYPE_ALL)) {
                promise.reject(ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + string + "'. Expected one of 'Photos', 'Videos' or 'All'.");
                return;
            }
            sb.append(" AND media_type IN (3,1)");
        }
        try {
            Cursor query = getReactApplicationContext().getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"bucket_display_name"}, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), null);
            if (query == null) {
                promise.reject(ERROR_UNABLE_TO_LOAD, "Could not get media");
                return;
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            try {
                if (query.moveToFirst()) {
                    HashMap hashMap = new HashMap();
                    do {
                        int columnIndex = query.getColumnIndex("bucket_display_name");
                        if (columnIndex < 0) {
                            throw new IndexOutOfBoundsException();
                        }
                        String string2 = query.getString(columnIndex);
                        if (string2 != null) {
                            Integer num = (Integer) hashMap.get(string2);
                            if (num == null) {
                                hashMap.put(string2, 1);
                            } else {
                                hashMap.put(string2, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    } while (query.moveToNext());
                    for (Map.Entry entry : hashMap.entrySet()) {
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString("title", (String) entry.getKey());
                        writableNativeMap.putInt("count", ((Integer) entry.getValue()).intValue());
                        writableNativeArray.pushMap(writableNativeMap);
                    }
                }
            } finally {
                query.close();
                promise.resolve(writableNativeArray);
            }
        } catch (Exception e) {
            promise.reject(ERROR_UNABLE_TO_LOAD, "Could not get media", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            writableNativeMap.putString("end_cursor", Integer.toString(i2 + i));
        }
        writableMap.putMap("page_info", writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, Set<String> set) {
        int i2;
        int i3;
        int i4;
        int i5;
        Cursor cursor2 = cursor;
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        cursor2.moveToFirst();
        int columnIndex = cursor2.getColumnIndex("mime_type");
        int columnIndex2 = cursor2.getColumnIndex("bucket_display_name");
        int columnIndex3 = cursor2.getColumnIndex("datetaken");
        int columnIndex4 = cursor2.getColumnIndex("date_added");
        int columnIndex5 = cursor2.getColumnIndex("date_modified");
        int columnIndex6 = cursor2.getColumnIndex("width");
        int columnIndex7 = cursor2.getColumnIndex("height");
        int columnIndex8 = cursor2.getColumnIndex("_size");
        int columnIndex9 = cursor2.getColumnIndex("_data");
        boolean contains = set.contains("location");
        boolean contains2 = set.contains("filename");
        boolean contains3 = set.contains(INCLUDE_FILE_SIZE);
        boolean contains4 = set.contains(INCLUDE_FILE_EXTENSION);
        boolean contains5 = set.contains(INCLUDE_IMAGE_SIZE);
        boolean contains6 = set.contains(INCLUDE_PLAYABLE_DURATION);
        int i6 = 0;
        while (i6 < i && !cursor2.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            boolean z = contains;
            int i7 = columnIndex;
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            int i8 = columnIndex3;
            int i9 = i6;
            boolean putImageInfo = putImageInfo(contentResolver, cursor2, writableNativeMap2, columnIndex6, columnIndex7, columnIndex8, columnIndex9, i7, contains2, contains3, contains4, contains5, contains6);
            boolean z2 = contains3;
            boolean z3 = contains4;
            boolean z4 = contains5;
            boolean z5 = contains6;
            int i10 = columnIndex7;
            int i11 = columnIndex8;
            int i12 = columnIndex9;
            boolean z6 = contains2;
            int i13 = columnIndex6;
            if (putImageInfo) {
                cursor2 = cursor;
                i2 = columnIndex4;
                i3 = columnIndex5;
                i4 = i8;
                putBasicNodeInfo(cursor2, writableNativeMap2, i7, columnIndex2, i4, i2, i3);
                putLocationInfo(cursor2, writableNativeMap2, i12, z);
                writableNativeMap.putMap("node", writableNativeMap2);
                writableNativeArray.pushMap(writableNativeMap);
                i5 = i9;
            } else {
                cursor2 = cursor;
                i2 = columnIndex4;
                i3 = columnIndex5;
                i4 = i8;
                i5 = i9 - 1;
            }
            cursor2.moveToNext();
            i6 = i5 + 1;
            columnIndex4 = i2;
            columnIndex5 = i3;
            columnIndex = i7;
            columnIndex6 = i13;
            columnIndex8 = i11;
            columnIndex9 = i12;
            contains2 = z6;
            contains = z;
            contains4 = z3;
            contains5 = z4;
            contains6 = z5;
            columnIndex3 = i4;
            columnIndex7 = i10;
            contains3 = z2;
        }
        writableMap.putArray("edges", writableNativeArray);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        long j = cursor.getLong(i3);
        if (j == 0) {
            j = cursor.getLong(i4) * 1000;
        }
        writableMap.putDouble("timestamp", j / 1000.0d);
        writableMap.putDouble("modified", cursor.getLong(i5));
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse("file://" + cursor.getString(i4));
        writableNativeMap.putString("uri", parse.toString());
        String string = cursor.getString(i5);
        boolean z6 = string != null && string.startsWith("video");
        boolean putImageSize = putImageSize(contentResolver, cursor, writableNativeMap, i, i2, parse, z6, z4);
        boolean putPlayableDuration = putPlayableDuration(contentResolver, writableNativeMap, parse, z6, z5);
        if (z) {
            writableNativeMap.putString("filename", new File(cursor.getString(i4)).getName());
        } else {
            writableNativeMap.putNull("filename");
        }
        if (z2) {
            writableNativeMap.putDouble(INCLUDE_FILE_SIZE, cursor.getLong(i3));
        } else {
            writableNativeMap.putNull(INCLUDE_FILE_SIZE);
        }
        if (z3) {
            writableNativeMap.putString(ShareConstants.MEDIA_EXTENSION, Utils.getExtension(string));
        } else {
            writableNativeMap.putNull(ShareConstants.MEDIA_EXTENSION);
        }
        writableMap.putMap("image", writableNativeMap);
        return putImageSize && putPlayableDuration;
    }

    private static boolean putPlayableDuration(ContentResolver contentResolver, WritableMap writableMap, Uri uri, boolean z, boolean z2) {
        AssetFileDescriptor assetFileDescriptor;
        writableMap.putNull(INCLUDE_PLAYABLE_DURATION);
        boolean z3 = true;
        if (z2 && z) {
            boolean z4 = false;
            Integer num = null;
            try {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            } catch (FileNotFoundException e) {
                FLog.e("ReactNative", "Could not open asset file " + uri.toString(), e);
                z3 = false;
                assetFileDescriptor = null;
            }
            if (assetFileDescriptor != null) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor());
                } catch (RuntimeException unused) {
                }
                try {
                    num = Integer.valueOf(Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                    z4 = z3;
                } catch (NumberFormatException e2) {
                    FLog.e("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + uri.toString(), e2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused2) {
                }
                z3 = z4;
            }
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            if (num != null) {
                writableMap.putInt(INCLUDE_PLAYABLE_DURATION, num.intValue());
            }
        }
        return z3;
    }

    private static boolean putImageSize(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, Uri uri, boolean z, boolean z2) {
        boolean z3;
        AssetFileDescriptor assetFileDescriptor;
        writableMap.putNull("width");
        writableMap.putNull("height");
        boolean z4 = true;
        if (!z2) {
            return true;
        }
        int i3 = cursor.getInt(i);
        int i4 = cursor.getInt(i2);
        if (i3 <= 0 || i4 <= 0) {
            boolean z5 = false;
            try {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
                z3 = true;
            } catch (FileNotFoundException e) {
                FLog.e("ReactNative", "Could not open asset file " + uri.toString(), e);
                z3 = false;
                assetFileDescriptor = null;
            }
            if (assetFileDescriptor != null) {
                if (z) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor());
                    } catch (RuntimeException unused) {
                    }
                    try {
                        i3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        z5 = z3;
                    } catch (NumberFormatException e2) {
                        FLog.e("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + uri.toString(), e2);
                    }
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused2) {
                    }
                    z4 = z5;
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(assetFileDescriptor.getFileDescriptor(), null, options);
                    i3 = options.outWidth;
                    i4 = options.outHeight;
                    z4 = z3;
                }
                try {
                    assetFileDescriptor.close();
                } catch (IOException e3) {
                    FLog.e("ReactNative", "Can't close media descriptor " + uri.toString(), e3);
                }
            } else {
                z4 = z3;
            }
        }
        writableMap.putInt("width", i3);
        writableMap.putInt("height", i4);
        return z4;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, boolean z) {
        writableMap.putNull("location");
        if (z) {
            try {
                ExifInterface exifInterface = new ExifInterface(cursor.getString(i));
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    double d = fArr[1];
                    double d2 = fArr[0];
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("longitude", d);
                    writableNativeMap.putDouble("latitude", d2);
                    writableMap.putMap("location", writableNativeMap);
                }
            } catch (IOException e) {
                FLog.e("ReactNative", "Could not read the metadata", e);
            }
        }
    }

    @ReactMethod
    public void deletePhotos(ReadableArray readableArray, Promise promise) {
        if (readableArray.size() == 0) {
            promise.reject(ERROR_UNABLE_TO_DELETE, "Need at least one URI to delete");
        } else {
            new DeletePhotos(getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    private static class DeletePhotos extends GuardedAsyncTask<Void, Void> {
        private final Context mContext;
        private final Promise mPromise;
        private final ReadableArray mUris;

        public DeletePhotos(ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext);
            this.mContext = reactContext;
            this.mUris = readableArray;
            this.mPromise = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            ContentResolver contentResolver = this.mContext.getContentResolver();
            String[] strArr = {"_id"};
            String str = "?";
            for (int i = 1; i < this.mUris.size(); i++) {
                str = str + ", ?";
            }
            String str2 = "_data IN (" + str + ")";
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = new String[this.mUris.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < this.mUris.size(); i3++) {
                strArr2[i3] = Uri.parse(this.mUris.getString(i3)).getPath();
            }
            Cursor query = contentResolver.query(uri, strArr, str2, strArr2, null);
            while (query.moveToNext()) {
                if (contentResolver.delete(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id"))), null, null) == 1) {
                    i2++;
                }
            }
            query.close();
            if (i2 == this.mUris.size()) {
                this.mPromise.resolve(true);
                return;
            }
            this.mPromise.reject(CameraRollModule.ERROR_UNABLE_TO_DELETE, "Could not delete all media, only deleted " + i2 + " photos.");
        }
    }
}
