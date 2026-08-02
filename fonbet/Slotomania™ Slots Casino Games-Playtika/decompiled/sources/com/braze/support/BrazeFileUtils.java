package com.braze.support;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.TrafficStats;
import android.net.Uri;
import bo.app.v1;
import bo.app.v6;
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
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0007\u001aH\u0010\u000e\u001a \u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001\u001a\n\u0010\u0019\u001a\u00020\u001a*\u00020\u001b\u001a\n\u0010\u001c\u001a\u00020\u001a*\u00020\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"FILE_SCHEME", "", "REMOTE_SCHEMES", "", "SHARED_PREFERENCES_FILENAME_SUFFIX", "TAG", "deleteFileOrDirectory", "", "fileOrDirectory", "Ljava/io/File;", "deleteSharedPreferencesFile", "context", "Landroid/content/Context;", "file", "downloadFileToPath", "Lkotlin/Pair;", "", "Lcom/braze/communication/HttpHeaders;", "downloadDirectoryAbsolutePath", "remoteFileUrl", "outputFilename", ShareConstants.MEDIA_EXTENSION, "getAssetFileStringContents", "Landroid/content/res/AssetManager;", "assetPath", "isLocalUri", "", "Landroid/net/Uri;", "isRemoteUri", "android-sdk-base_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BrazeFileUtils {
    private static final String FILE_SCHEME = "file";
    private static final String SHARED_PREFERENCES_FILENAME_SUFFIX = ".xml";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
    public static final List<String> REMOTE_SCHEMES = CollectionsKt.listOf((Object[]) new String[]{"http", "https", "ftp", "ftps", "about", "javascript"});

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(File file) {
            super(0);
            this.b = file;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not recursively delete ", this.b.getName());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file) {
            super(0);
            this.b = file;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Cannot delete SharedPreferences that does not exist. Path: ", this.b.getAbsolutePath());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.b = file;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("SharedPreferences file is expected to end in .xml. Path: ", this.b.getAbsolutePath());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("SDK is offline. File not downloaded for url: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        public static final e b = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Download directory null or blank. File not downloaded.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Zip file url null or blank. File not downloaded.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        public static final g b = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Output filename null or blank. File not downloaded.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i, String str) {
            super(0);
            this.b = i;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "HTTP response code was " + this.b + ". File with url " + this.c + " could not be downloaded.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Exception during download of file from url : ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        public static final j b = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Null or blank Uri scheme.";
        }
    }

    public static final void deleteFileOrDirectory(File fileOrDirectory) {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        if (FilesKt.deleteRecursively(fileOrDirectory)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) new a(fileOrDirectory), 4, (Object) null);
    }

    public static final void deleteSharedPreferencesFile(Context context, File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) new b(file), 4, (Object) null);
            return;
        }
        String fileName = file.getName();
        Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
        if (StringsKt.endsWith$default(fileName, SHARED_PREFERENCES_FILENAME_SUFFIX, false, 2, (Object) null)) {
            context.deleteSharedPreferences(StringsKt.removeSuffix(fileName, (CharSequence) SHARED_PREFERENCES_FILENAME_SUFFIX));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) new c(file), 4, (Object) null);
        }
    }

    public static final Pair<File, Map<String, String>> downloadFileToPath(String downloadDirectoryAbsolutePath, String remoteFileUrl, String outputFilename, String str) {
        Throwable th;
        Exception exc;
        File file;
        HttpURLConnection a2;
        Intrinsics.checkNotNullParameter(downloadDirectoryAbsolutePath, "downloadDirectoryAbsolutePath");
        Intrinsics.checkNotNullParameter(remoteFileUrl, "remoteFileUrl");
        Intrinsics.checkNotNullParameter(outputFilename, "outputFilename");
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Function0) new d(remoteFileUrl), 4, (Object) null);
            throw new Exception(Intrinsics.stringPlus("SDK is offline. File not downloaded for url: ", remoteFileUrl));
        }
        if (StringsKt.isBlank(downloadDirectoryAbsolutePath)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Function0) e.b, 4, (Object) null);
            throw new Exception("Download directory is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(remoteFileUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Function0) f.b, 4, (Object) null);
            throw new Exception("Zip file url is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(outputFilename)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Function0) g.b, 4, (Object) null);
            throw new Exception("Output filename is blank. File not downloaded.");
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                new File(downloadDirectoryAbsolutePath).mkdirs();
                if (str != null && !StringsKt.isBlank(str)) {
                    outputFilename = Intrinsics.stringPlus(outputFilename, str);
                }
                file = new File(downloadDirectoryAbsolutePath, outputFilename);
                a2 = v6.a.a(new URL(remoteFileUrl));
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int responseCode = a2.getResponseCode();
            if (responseCode != 200) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) new h(responseCode, remoteFileUrl), 6, (Object) null);
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
                    Intrinsics.checkNotNullExpressionValue(headerFields, "urlConnection.headerFields");
                    Map<String, String> a3 = v1.a(headerFields);
                    a2.disconnect();
                    return new Pair<>(file, a3);
                } finally {
                }
            } finally {
            }
        } catch (Exception e3) {
            httpURLConnection = a2;
            exc = e3;
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) exc, (Function0<String>) new i(remoteFileUrl));
            throw new Exception(Intrinsics.stringPlus("Exception during download of file from url : ", remoteFileUrl));
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

    public static /* synthetic */ Pair downloadFileToPath$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String assetPath) {
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        InputStream open = assetManager.open(assetPath);
        Intrinsics.checkNotNullExpressionValue(open, "this.open(assetPath)");
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
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Function0) j.b, 4, (Object) null);
        return false;
    }
}
