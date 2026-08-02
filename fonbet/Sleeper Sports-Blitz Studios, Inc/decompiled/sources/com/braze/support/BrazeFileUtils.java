package com.braze.support;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.TrafficStats;
import android.net.Uri;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.facebook.share.internal.ShareConstants;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0007\u001a\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0010*\u00020\u0011\u001aH\u0010\u0013\u001a \u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015j\u0002`\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"TAG", "", "REMOTE_SCHEMES", "", "FILE_SCHEME", "SHARED_PREFERENCES_FILENAME_SUFFIX", "deleteFileOrDirectory", "", "fileOrDirectory", "Ljava/io/File;", "deleteSharedPreferencesFile", "context", "Landroid/content/Context;", "file", "deleteDataStoreFile", "isRemoteUri", "", "Landroid/net/Uri;", "isLocalUri", "downloadFileToPath", "Lkotlin/Pair;", "", "Lcom/braze/communication/HttpHeaders;", "downloadDirectoryAbsolutePath", "remoteFileUrl", "outputFilename", ShareConstants.MEDIA_EXTENSION, "getAssetFileStringContents", "Landroid/content/res/AssetManager;", "assetPath", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeFileUtils {
    private static final String FILE_SCHEME = "file";
    private static final String SHARED_PREFERENCES_FILENAME_SUFFIX = ".xml";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
    public static final List<String> REMOTE_SCHEMES = CollectionsKt.listOf((Object[]) new String[]{"http", "https", "ftp", "ftps", "about", "javascript"});

    public static final void deleteDataStoreFile(final File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteDataStoreFile$lambda$3;
                    deleteDataStoreFile$lambda$3 = BrazeFileUtils.deleteDataStoreFile$lambda$3(file);
                    return deleteDataStoreFile$lambda$3;
                }
            }, 12, (Object) null);
        } else if (file.delete()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteDataStoreFile$lambda$4;
                    deleteDataStoreFile$lambda$4 = BrazeFileUtils.deleteDataStoreFile$lambda$4(file);
                    return deleteDataStoreFile$lambda$4;
                }
            }, 14, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteDataStoreFile$lambda$5;
                    deleteDataStoreFile$lambda$5 = BrazeFileUtils.deleteDataStoreFile$lambda$5(file);
                    return deleteDataStoreFile$lambda$5;
                }
            }, 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDataStoreFile$lambda$3(File file) {
        return "Cannot delete DataStore file that does not exist. Path: " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDataStoreFile$lambda$4(File file) {
        return "Successfully deleted DataStore file: " + file.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDataStoreFile$lambda$5(File file) {
        return "Failed to delete DataStore file: " + file.getAbsolutePath();
    }

    public static final void deleteFileOrDirectory(final File fileOrDirectory) {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        if (FilesKt.deleteRecursively(fileOrDirectory)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deleteFileOrDirectory$lambda$0;
                deleteFileOrDirectory$lambda$0 = BrazeFileUtils.deleteFileOrDirectory$lambda$0(fileOrDirectory);
                return deleteFileOrDirectory$lambda$0;
            }
        }, 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteFileOrDirectory$lambda$0(File file) {
        return "Could not recursively delete " + file.getName();
    }

    public static final void deleteSharedPreferencesFile(Context context, final File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteSharedPreferencesFile$lambda$1;
                    deleteSharedPreferencesFile$lambda$1 = BrazeFileUtils.deleteSharedPreferencesFile$lambda$1(file);
                    return deleteSharedPreferencesFile$lambda$1;
                }
            }, 12, (Object) null);
            return;
        }
        String name = file.getName();
        Intrinsics.checkNotNull(name);
        if (StringsKt.endsWith$default(name, SHARED_PREFERENCES_FILENAME_SUFFIX, false, 2, (Object) null)) {
            context.deleteSharedPreferences(StringsKt.removeSuffix(name, (CharSequence) SHARED_PREFERENCES_FILENAME_SUFFIX));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteSharedPreferencesFile$lambda$2;
                    deleteSharedPreferencesFile$lambda$2 = BrazeFileUtils.deleteSharedPreferencesFile$lambda$2(file);
                    return deleteSharedPreferencesFile$lambda$2;
                }
            }, 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$1(File file) {
        return "Cannot delete SharedPreferences that does not exist. Path: " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteSharedPreferencesFile$lambda$2(File file) {
        return "SharedPreferences file is expected to end in .xml. Path: " + file.getAbsolutePath();
    }

    public static final Pair<File, Map<String, String>> downloadFileToPath(String downloadDirectoryAbsolutePath, final String remoteFileUrl, String outputFilename, String str) {
        Exception exc;
        Throwable th;
        File file;
        HttpURLConnection a2;
        Intrinsics.checkNotNullParameter(downloadDirectoryAbsolutePath, "downloadDirectoryAbsolutePath");
        Intrinsics.checkNotNullParameter(remoteFileUrl, "remoteFileUrl");
        Intrinsics.checkNotNullParameter(outputFilename, "outputFilename");
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$7;
                    downloadFileToPath$lambda$7 = BrazeFileUtils.downloadFileToPath$lambda$7(remoteFileUrl);
                    return downloadFileToPath$lambda$7;
                }
            }, 12, (Object) null);
            throw new Exception("SDK is offline. File not downloaded for url: " + remoteFileUrl);
        }
        if (StringsKt.isBlank(downloadDirectoryAbsolutePath)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$8;
                    downloadFileToPath$lambda$8 = BrazeFileUtils.downloadFileToPath$lambda$8();
                    return downloadFileToPath$lambda$8;
                }
            }, 12, (Object) null);
            throw new Exception("Download directory is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(remoteFileUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$9;
                    downloadFileToPath$lambda$9 = BrazeFileUtils.downloadFileToPath$lambda$9();
                    return downloadFileToPath$lambda$9;
                }
            }, 12, (Object) null);
            throw new Exception("Zip file url is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(outputFilename)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$10;
                    downloadFileToPath$lambda$10 = BrazeFileUtils.downloadFileToPath$lambda$10();
                    return downloadFileToPath$lambda$10;
                }
            }, 12, (Object) null);
            throw new Exception("Output filename is blank. File not downloaded.");
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                new File(downloadDirectoryAbsolutePath).mkdirs();
                if (str != null && !StringsKt.isBlank(str)) {
                    outputFilename = outputFilename + str;
                }
                file = new File(downloadDirectoryAbsolutePath, outputFilename);
                a2 = com.braze.communication.g.f485a.a(new URL(remoteFileUrl));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            exc = e;
        }
        try {
            final int responseCode = a2.getResponseCode();
            if (responseCode != 200) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String downloadFileToPath$lambda$11;
                        downloadFileToPath$lambda$11 = BrazeFileUtils.downloadFileToPath$lambda$11(responseCode, remoteFileUrl);
                        return downloadFileToPath$lambda$11;
                    }
                }, 14, (Object) null);
                throw new Exception("HTTP response code was " + responseCode + ". File with url " + remoteFileUrl + " could not be downloaded.");
            }
            DataInputStream dataInputStream = new DataInputStream(a2.getInputStream());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ByteStreamsKt.copyTo$default(dataInputStream, fileOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(dataInputStream, null);
                    Map<String, List<String>> headerFields = a2.getHeaderFields();
                    Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
                    LinkedHashMap a3 = q.a(headerFields);
                    a2.disconnect();
                    return new Pair<>(file, a3);
                } finally {
                }
            } finally {
            }
        } catch (Exception e2) {
            httpURLConnection = a2;
            exc = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) exc, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String downloadFileToPath$lambda$14;
                    downloadFileToPath$lambda$14 = BrazeFileUtils.downloadFileToPath$lambda$14(remoteFileUrl);
                    return downloadFileToPath$lambda$14;
                }
            }, 8, (Object) null);
            throw new Exception("Exception during download of file from url : " + remoteFileUrl);
        } catch (Throwable th3) {
            httpURLConnection = a2;
            th = th3;
            if (httpURLConnection == null) {
                throw th;
            }
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public static /* synthetic */ Pair downloadFileToPath$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$10() {
        return "Output filename null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$11(int i, String str) {
        return "HTTP response code was " + i + ". File with url " + str + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$14(String str) {
        return "Exception during download of file from url : " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$7(String str) {
        return "SDK is offline. File not downloaded for url: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$8() {
        return "Download directory null or blank. File not downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String downloadFileToPath$lambda$9() {
        return "Zip file url null or blank. File not downloaded.";
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String assetPath) {
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        InputStream open = assetManager.open(assetPath);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String readText = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return readText;
        } finally {
        }
    }

    public static final boolean isLocalUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String scheme = uri.getScheme();
        return scheme == null || StringsKt.isBlank(scheme) || Intrinsics.areEqual(scheme, "file");
    }

    public static final boolean isRemoteUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null && !StringsKt.isBlank(scheme)) {
            return REMOTE_SCHEMES.contains(scheme);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeFileUtils$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isRemoteUri$lambda$6;
                isRemoteUri$lambda$6 = BrazeFileUtils.isRemoteUri$lambda$6();
                return isRemoteUri$lambda$6;
            }
        }, 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isRemoteUri$lambda$6() {
        return "Null or blank Uri scheme.";
    }
}
