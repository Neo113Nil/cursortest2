package com.vungle.ads.internal.downloader;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Okio__JvmOkioKt;

/* compiled from: AssetDownloader.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\"\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010$\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u001a\u0010&\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\"\u0010'\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010*\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader;", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Lcom/vungle/ads/internal/util/PathProvider;)V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lkotlin/Lazy;", "transitioning", "", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "cancel", "", "request", "cancelAll", "checkSpaceAvailable", "", "downloadRequest", "decodeGzipIfNeeded", "Lokhttp3/ResponseBody;", "networkResponse", "Lokhttp3/Response;", "deliverError", "downloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "downloadError", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "deliverSuccess", "file", "Ljava/io/File;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, NativeAdPresenter.DOWNLOAD, "launchRequest", "launchRequestWithRetry", "onProgressChanged", "progress", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "shouldRetryDownload", k.M, "OkHttpSingleton", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AssetDownloader implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final long DOWNLOAD_RETRY_FAILURE = 2;
    private static final long DOWNLOAD_RETRY_SUCCESS = 1;
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;
    private static final String TAG = "AssetDownloader";
    private final VungleThreadPoolExecutor downloadExecutor;

    /* renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    private final Lazy okHttpClient;
    private final PathProvider pathProvider;
    private final List<DownloadRequest> transitioning;

    public AssetDownloader(VungleThreadPoolExecutor downloadExecutor, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient = LazyKt.lazy(new Function0<OkHttpClient>() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$okHttpClient$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final OkHttpClient invoke() {
                PathProvider pathProvider2;
                AssetDownloader.OkHttpSingleton okHttpSingleton = AssetDownloader.OkHttpSingleton.INSTANCE;
                pathProvider2 = AssetDownloader.this.pathProvider;
                return okHttpSingleton.createOkHttpClient(pathProvider2);
            }
        });
        this.transitioning = new ArrayList();
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) this.okHttpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AssetDownloader.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader$OkHttpSingleton;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "createOkHttpClient", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class OkHttpSingleton {
        public static final OkHttpSingleton INSTANCE = new OkHttpSingleton();
        private static OkHttpClient client;

        private OkHttpSingleton() {
        }

        public final OkHttpClient createOkHttpClient(PathProvider pathProvider) {
            Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
            OkHttpClient okHttpClient = client;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            OkHttpClient.Builder followSslRedirects = new OkHttpClient.Builder().readTimeout(60L, TimeUnit.SECONDS).connectTimeout(60L, TimeUnit.SECONDS).cache(null).followRedirects(true).followSslRedirects(true);
            long cleverCacheDiskSize = ConfigManager.INSTANCE.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = ConfigManager.INSTANCE.getCleverCacheDiskPercentage();
            String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long min = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * cleverCacheDiskPercentage) / 100);
            if (min > 0) {
                followSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), min));
            } else {
                Logger.INSTANCE.w(AssetDownloader.TAG, "cache disk capacity size <=0, no clever cache active.");
            }
            OkHttpClient build = followSslRedirects.build();
            client = build;
            return build;
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final DownloadRequest downloadRequest, final AssetDownloadListener downloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$download$1
            @Override // java.lang.Runnable
            public void run() {
                AssetDownloader.this.launchRequestWithRetry(downloadRequest, downloadListener);
            }

            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }
        }, new Runnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AssetDownloader.m10673download$lambda0(DownloadRequest.this, this, downloadListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: download$lambda-0, reason: not valid java name */
    public static final void m10673download$lambda0(DownloadRequest downloadRequest, AssetDownloader this$0, AssetDownloadListener assetDownloadListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener downloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (downloadListener != null) {
            downloadListener.onError(downloadError, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchRequestWithRetry(DownloadRequest downloadRequest, AssetDownloadListener downloadListener) {
        if (downloadListener != null) {
            downloadListener.onStart(downloadRequest);
        }
        AssetDownloadListener.DownloadError launchRequest = launchRequest(downloadRequest, downloadListener);
        while (launchRequest != null && shouldRetryDownload(downloadRequest, launchRequest)) {
            downloadRequest.incrementRetryAttempt$vungle_ads_release();
            downloadRequest.recordRetryReason$vungle_ads_release("Error: " + launchRequest.getCause().getMessage() + ", Code: " + launchRequest.getServerCode() + ", Reason: " + launchRequest.getReason());
            Logger.INSTANCE.w(TAG, "Download failed, retrying immediately. Attempt " + downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + FileSystemKt.UnixPathSeparator + downloadRequest.getMaxRetries() + ". URL: " + downloadRequest.getAsset().getServerPath() + ", Error: " + launchRequest.getCause().getMessage());
            launchRequest = launchRequest(downloadRequest, downloadListener);
        }
        if (launchRequest != null) {
            Logger.INSTANCE.e(TAG, "Download failed after " + (downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + 1) + " attempts. URL: " + downloadRequest.getAsset().getServerPath() + ". Retry history: " + downloadRequest.getRetryReasons$vungle_ads_release());
            if (downloadRequest.getCurrentRetryAttempt$vungle_ads_release() > 0) {
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 2L, downloadRequest.getLogEntry(), "retryCount=" + downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + " url=" + downloadRequest.getAsset().getServerPath());
            }
            deliverError(downloadRequest, downloadListener, launchRequest);
        }
    }

    private final boolean shouldRetryDownload(DownloadRequest downloadRequest, AssetDownloadListener.DownloadError downloadError) {
        if (downloadRequest.isCancelled()) {
            Logger.INSTANCE.d(TAG, "Download cancelled, not retrying");
            return false;
        }
        Integer percentage = downloadRequest.getAsset().getPercentage();
        if (percentage != null && percentage.intValue() < 100) {
            Logger.INSTANCE.d(TAG, "Partial download asset (percentage=" + percentage + "), not retrying");
            return false;
        }
        if (!downloadRequest.canRetry$vungle_ads_release()) {
            Logger.INSTANCE.d(TAG, "Max retry attempts reached (" + downloadRequest.getMaxRetries() + ')');
            return false;
        }
        if (AssetDownloadListener.DownloadError.INSTANCE.shouldRetry(downloadError)) {
            return true;
        }
        Logger.INSTANCE.d(TAG, "Error reason " + downloadError.getReason() + " is not retryable");
        return false;
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(DownloadRequest request) {
        if (request == null || request.isCancelled()) {
            return;
        }
        request.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x02bf, code lost:
    
        r6.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AssetDownloadListener.DownloadError launchRequest(DownloadRequest downloadRequest, AssetDownloadListener downloadListener) {
        Call call;
        AdAsset adAsset;
        Response response;
        ResponseBody responseBody;
        BufferedSource bufferedSource;
        ResponseBody okhttp3Response_body;
        AssetDownloadListener.DownloadError downloadError;
        int status;
        ResponseBody okhttp3Response_body2;
        Response response2;
        long contentLength;
        Response response3;
        int i;
        int i2;
        int i3;
        long j;
        long j2;
        ResponseBody okhttp3Response_body3;
        AssetDownloader assetDownloader = this;
        AdAsset asset = downloadRequest.getAsset();
        Logger.INSTANCE.d(TAG, "launch request in thread: " + Thread.currentThread().getId() + " request: " + asset.getServerPath());
        BufferedSink bufferedSink = null;
        if (downloadRequest.isCancelled()) {
            Logger.INSTANCE.d(TAG, "Request " + asset.getServerPath() + " is cancelled before starting");
            new AssetDownloadListener.Progress().setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
            return null;
        }
        AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
        progress.setTimestampDownloadStart(System.currentTimeMillis());
        String serverPath = asset.getServerPath();
        String localPath = asset.getLocalPath();
        int i4 = -1;
        if (serverPath.length() == 0 || !FileUtility.INSTANCE.isValidUrl(serverPath)) {
            return new AssetDownloadListener.DownloadError(-1, new InvalidAssetUrlError("invalid url: " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR());
        }
        if (localPath.length() == 0) {
            return new AssetDownloadListener.DownloadError(-1, new AssetWriteError("invalid path: " + localPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR());
        }
        if (!checkSpaceAvailable(downloadRequest)) {
            return new AssetDownloadListener.DownloadError(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getDISK_ERROR());
        }
        File file = new File(localPath);
        if (file.exists()) {
            Logger.INSTANCE.d(TAG, "Deleting existing file before download: " + file.getAbsolutePath());
            if (!file.delete()) {
                return new AssetDownloadListener.DownloadError(-1, new AssetWriteError("Cannot delete partial file for restart").setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getDISK_ERROR());
            }
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                try {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                } catch (Exception e) {
                    e = e;
                    adAsset = asset;
                    call = null;
                    response = null;
                    bufferedSource = null;
                    try {
                        Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                        downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                        if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                        }
                        if (call != null) {
                        }
                        FileUtility.INSTANCE.closeQuietly(bufferedSink);
                        FileUtility.INSTANCE.closeQuietly(bufferedSource);
                        Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                        status = progress.getStatus();
                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                        }
                        return downloadError;
                    } catch (Throwable th) {
                        th = th;
                        responseBody = null;
                        if (response != null) {
                        }
                        if (responseBody != null) {
                            okhttp3Response_body.close();
                            Unit unit = Unit.INSTANCE;
                        }
                        if (call != null) {
                        }
                        FileUtility.INSTANCE.closeQuietly(bufferedSink);
                        FileUtility.INSTANCE.closeQuietly(bufferedSource);
                        Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    call = null;
                    response = null;
                    responseBody = null;
                    bufferedSource = null;
                    if (response != null) {
                    }
                    if (responseBody != null) {
                    }
                    if (call != null) {
                    }
                    FileUtility.INSTANCE.closeQuietly(bufferedSink);
                    FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                    throw th;
                }
            }
            call = assetDownloader.getOkHttpClient().newCall(new Request.Builder().url(serverPath).build());
            try {
                response = LiftoffMonetizeNetworkBridge.okhttp3CallExecute(call);
                try {
                    try {
                        i4 = response.code();
                    } catch (Exception e2) {
                        e = e2;
                        adAsset = asset;
                    }
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        adAsset = asset;
                        bufferedSink = null;
                        bufferedSource = null;
                        Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                        downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                        if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                            okhttp3Response_body2.close();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        if (call != null) {
                        }
                        FileUtility.INSTANCE.closeQuietly(bufferedSink);
                        FileUtility.INSTANCE.closeQuietly(bufferedSource);
                        Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                        status = progress.getStatus();
                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                        }
                        return downloadError;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e4) {
                e = e4;
                adAsset = asset;
                bufferedSink = null;
                response = null;
                bufferedSource = null;
                Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                }
                if (call != null) {
                }
                FileUtility.INSTANCE.closeQuietly(bufferedSink);
                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                status = progress.getStatus();
                if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                }
                return downloadError;
            } catch (Throwable th4) {
                th = th4;
                bufferedSink = null;
                response = null;
                responseBody = null;
                bufferedSource = null;
                if (response != null) {
                }
                if (responseBody != null) {
                }
                if (call != null) {
                }
                FileUtility.INSTANCE.closeQuietly(bufferedSink);
                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            adAsset = asset;
            bufferedSink = null;
            call = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedSink = null;
            call = null;
        }
        if (!response.isSuccessful()) {
            adAsset = asset;
            try {
                throw new Downloader.RequestException(response.message());
            } catch (Exception e6) {
                e = e6;
                call = call;
                i4 = i4;
                response = response;
                bufferedSink = null;
                bufferedSource = null;
                Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                }
                if (call != null) {
                }
                FileUtility.INSTANCE.closeQuietly(bufferedSink);
                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                status = progress.getStatus();
                if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                }
                return downloadError;
            } catch (Throwable th6) {
                th = th6;
                call = call;
                response = response;
                bufferedSink = null;
                responseBody = null;
                bufferedSource = null;
                if (response != null) {
                }
                if (responseBody != null) {
                }
                if (call != null) {
                }
                FileUtility.INSTANCE.closeQuietly(bufferedSink);
                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                throw th;
            }
        }
        if (response.cacheResponse() != null) {
            try {
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry(), serverPath);
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            } catch (Exception e7) {
                e = e7;
                adAsset = asset;
                bufferedSink = null;
                bufferedSource = null;
                Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                }
                if (call != null) {
                }
                FileUtility.INSTANCE.closeQuietly(bufferedSink);
                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                status = progress.getStatus();
                if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                }
                return downloadError;
            } catch (Throwable th7) {
                th = th7;
                bufferedSink = null;
                responseBody = null;
                bufferedSource = null;
                if (response != null) {
                }
                if (responseBody != null) {
                }
                if (call != null) {
                }
                FileUtility.INSTANCE.closeQuietly(bufferedSink);
                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                throw th;
            }
        }
        ResponseBody decodeGzipIfNeeded = assetDownloader.decodeGzipIfNeeded(response);
        String header$default = Response.header$default(response, "Content-Type", null, 2, null);
        if (header$default != null) {
            downloadRequest.getAsset().setMimeType(header$default);
            Unit unit5 = Unit.INSTANCE;
            Unit unit6 = Unit.INSTANCE;
        }
        BufferedSource retrofitExceptionCatchingRequestBody_source = decodeGzipIfNeeded != null ? LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(decodeGzipIfNeeded) : null;
        try {
        } catch (Exception e8) {
            e = e8;
            adAsset = asset;
            bufferedSource = retrofitExceptionCatchingRequestBody_source;
        } catch (Throwable th8) {
            th = th8;
            bufferedSource = retrofitExceptionCatchingRequestBody_source;
        }
        try {
            Logger.INSTANCE.d(TAG, "Start download from url: " + serverPath + " mimeType=" + header$default);
            BufferedSink buffer = Okio.buffer(Okio__JvmOkioKt.sink$default(file, false, 1, null));
            if (decodeGzipIfNeeded != null) {
                try {
                    response2 = response;
                    contentLength = decodeGzipIfNeeded.getContentLength();
                } catch (Exception e9) {
                    e = e9;
                    assetDownloader = this;
                    adAsset = asset;
                    bufferedSource = retrofitExceptionCatchingRequestBody_source;
                    bufferedSink = buffer;
                    call = call;
                    Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                    downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                    if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                    }
                    if (call != null) {
                    }
                    FileUtility.INSTANCE.closeQuietly(bufferedSink);
                    FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                    status = progress.getStatus();
                    if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                    }
                    return downloadError;
                } catch (Throwable th9) {
                    th = th9;
                    bufferedSource = retrofitExceptionCatchingRequestBody_source;
                    bufferedSink = buffer;
                    call = call;
                    responseBody = null;
                    if (response != null) {
                    }
                    if (responseBody != null) {
                    }
                    if (call != null) {
                    }
                    FileUtility.INSTANCE.closeQuietly(bufferedSink);
                    FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                    throw th;
                }
            } else {
                response2 = response;
                contentLength = 0;
            }
            try {
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED());
                progress.setSizeBytes(contentLength);
                progress.setReadBytes(0L);
                if (contentLength > 0) {
                    try {
                        i = (int) (0 / contentLength);
                    } catch (Exception e10) {
                        e = e10;
                        assetDownloader = this;
                        adAsset = asset;
                        bufferedSource = retrofitExceptionCatchingRequestBody_source;
                        bufferedSink = buffer;
                        response = response2;
                        call = call;
                        Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                        downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                        if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                        }
                        if (call != null) {
                        }
                        FileUtility.INSTANCE.closeQuietly(bufferedSink);
                        FileUtility.INSTANCE.closeQuietly(bufferedSource);
                        Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                        status = progress.getStatus();
                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                        }
                        return downloadError;
                    } catch (Throwable th10) {
                        th = th10;
                        bufferedSource = retrofitExceptionCatchingRequestBody_source;
                        bufferedSink = buffer;
                        response = response2;
                        call = call;
                        responseBody = null;
                        if (response != null) {
                        }
                        if (responseBody != null) {
                        }
                        if (call != null) {
                        }
                        FileUtility.INSTANCE.closeQuietly(bufferedSink);
                        FileUtility.INSTANCE.closeQuietly(bufferedSource);
                        Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                        throw th;
                    }
                } else {
                    i = 0;
                }
                progress.setProgressPercent(i);
                asset.setContentLength(contentLength);
                assetDownloader = this;
                try {
                    try {
                        assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                        int i5 = 0;
                        long j3 = 0;
                        while (true) {
                            if (retrofitExceptionCatchingRequestBody_source != null) {
                                i2 = i5;
                                try {
                                    try {
                                        i3 = i4;
                                        j = contentLength;
                                    } catch (Exception e11) {
                                        e = e11;
                                        adAsset = asset;
                                        bufferedSource = retrofitExceptionCatchingRequestBody_source;
                                        bufferedSink = buffer;
                                        response = response2;
                                        call = call;
                                        Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                        downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                        if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                        }
                                        if (call != null) {
                                        }
                                        FileUtility.INSTANCE.closeQuietly(bufferedSink);
                                        FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                        Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                                        status = progress.getStatus();
                                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                        }
                                        return downloadError;
                                    }
                                    try {
                                        j2 = retrofitExceptionCatchingRequestBody_source.read(buffer.getBuffer(), PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                                    } catch (Exception e12) {
                                        e = e12;
                                        adAsset = asset;
                                        bufferedSource = retrofitExceptionCatchingRequestBody_source;
                                        bufferedSink = buffer;
                                        response = response2;
                                        call = call;
                                        i4 = i3;
                                        Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                        downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                        if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                        }
                                        if (call != null) {
                                        }
                                        FileUtility.INSTANCE.closeQuietly(bufferedSink);
                                        FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                        Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                                        status = progress.getStatus();
                                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                        }
                                        return downloadError;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    bufferedSource = retrofitExceptionCatchingRequestBody_source;
                                    bufferedSink = buffer;
                                    response = response2;
                                    call = call;
                                    responseBody = null;
                                    if (response != null) {
                                    }
                                    if (responseBody != null) {
                                    }
                                    if (call != null) {
                                    }
                                    FileUtility.INSTANCE.closeQuietly(bufferedSink);
                                    FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                    Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                                    throw th;
                                }
                            } else {
                                i2 = i5;
                                i3 = i4;
                                j = contentLength;
                                j2 = -1;
                            }
                            try {
                                Unit unit7 = Unit.INSTANCE;
                                if (j2 <= 0) {
                                    break;
                                }
                                if (!file.exists()) {
                                    new AssetWriteError("Asset save error " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                    throw new Downloader.RequestException("File is not existing");
                                }
                                if (downloadRequest.isCancelled()) {
                                    break;
                                }
                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                                buffer.emit();
                                buffer.flush();
                                long j4 = j3 + j2;
                                progress.setReadBytes(j4);
                                Long rangeEnd = asset.getRangeEnd();
                                response3 = response2;
                                long longValue = rangeEnd != null ? rangeEnd.longValue() : asset.getRangeStart();
                                try {
                                    try {
                                        if (!asset.isWaitingForDownload() || j4 < longValue) {
                                            adAsset = asset;
                                            bufferedSource = retrofitExceptionCatchingRequestBody_source;
                                        } else {
                                            adAsset = asset;
                                            try {
                                                bufferedSource = retrofitExceptionCatchingRequestBody_source;
                                            } catch (Exception e13) {
                                                e = e13;
                                                bufferedSource = retrofitExceptionCatchingRequestBody_source;
                                                bufferedSink = buffer;
                                                call = call;
                                                i4 = i3;
                                                response = response3;
                                                Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                                downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                                }
                                                if (call != null) {
                                                }
                                                FileUtility.INSTANCE.closeQuietly(bufferedSink);
                                                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                                Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                                                status = progress.getStatus();
                                                if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                                }
                                                return downloadError;
                                            }
                                            try {
                                                Logger.INSTANCE.e(TAG, "Downloader totalRead=" + j4 + " requiredBytes=" + longValue);
                                                adAsset.notifyDownloadEnough();
                                            } catch (Exception e14) {
                                                e = e14;
                                                bufferedSink = buffer;
                                                call = call;
                                                i4 = i3;
                                                response = response3;
                                                Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                                downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                                }
                                                if (call != null) {
                                                }
                                                FileUtility.INSTANCE.closeQuietly(bufferedSink);
                                                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                                Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                                                status = progress.getStatus();
                                                if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                                }
                                                return downloadError;
                                            } catch (Throwable th12) {
                                                th = th12;
                                                bufferedSink = buffer;
                                                call = call;
                                                response = response3;
                                                responseBody = null;
                                                if (response != null) {
                                                }
                                                if (responseBody != null) {
                                                }
                                                if (call != null) {
                                                }
                                                FileUtility.INSTANCE.closeQuietly(bufferedSink);
                                                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                                Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                                                throw th;
                                            }
                                        }
                                        int i6 = contentLength > 0 ? (int) ((100 * j4) / j) : i2;
                                        while (progress.getProgressPercent() + 1 <= Math.min(i6, 100)) {
                                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                                            progress.setProgressPercent(progress.getProgressPercent() + 1);
                                            if (progress.getProgressPercent() >= 100) {
                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getDONE());
                                            }
                                            assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                        }
                                        i5 = i6;
                                        asset = adAsset;
                                        retrofitExceptionCatchingRequestBody_source = bufferedSource;
                                        response2 = response3;
                                        j3 = j4;
                                        i4 = i3;
                                        contentLength = j;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        bufferedSource = retrofitExceptionCatchingRequestBody_source;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    adAsset = asset;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                adAsset = asset;
                                bufferedSource = retrofitExceptionCatchingRequestBody_source;
                                response3 = response2;
                            }
                        }
                        BufferedSource bufferedSource2 = retrofitExceptionCatchingRequestBody_source;
                        Response response4 = response2;
                        buffer.flush();
                        if (progress.getStatus() == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS()) {
                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getDONE());
                            assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                        }
                        if ((response4 != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response4) : null) != null && (okhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response4)) != null) {
                            okhttp3Response_body3.close();
                            Unit unit8 = Unit.INSTANCE;
                        }
                        if (call != null) {
                            call.cancel();
                            Unit unit9 = Unit.INSTANCE;
                        }
                        FileUtility.INSTANCE.closeQuietly(buffer);
                        FileUtility.INSTANCE.closeQuietly(bufferedSource2);
                        Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                        downloadError = null;
                    } catch (Exception e17) {
                        e = e17;
                        adAsset = asset;
                        bufferedSource = retrofitExceptionCatchingRequestBody_source;
                        response3 = response2;
                        bufferedSink = buffer;
                        call = call;
                        response = response3;
                        Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                        downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                        if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null && (okhttp3Response_body2 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response)) != null) {
                            okhttp3Response_body2.close();
                            Unit unit22 = Unit.INSTANCE;
                        }
                        if (call != null) {
                            call.cancel();
                            Unit unit10 = Unit.INSTANCE;
                        }
                        FileUtility.INSTANCE.closeQuietly(bufferedSink);
                        FileUtility.INSTANCE.closeQuietly(bufferedSource);
                        Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                        status = progress.getStatus();
                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                            if (status != AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                            }
                        }
                        return downloadError;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    bufferedSource = retrofitExceptionCatchingRequestBody_source;
                    response3 = response2;
                    bufferedSink = buffer;
                    call = call;
                    response = response3;
                    responseBody = null;
                    if (response != null) {
                        responseBody = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response);
                    }
                    if (responseBody != null && (okhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response)) != null) {
                        okhttp3Response_body.close();
                        Unit unit11 = Unit.INSTANCE;
                    }
                    if (call != null) {
                        call.cancel();
                        Unit unit12 = Unit.INSTANCE;
                    }
                    FileUtility.INSTANCE.closeQuietly(bufferedSink);
                    FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                    throw th;
                }
            } catch (Exception e18) {
                e = e18;
                assetDownloader = this;
            } catch (Throwable th15) {
                th = th15;
            }
        } catch (Exception e19) {
            e = e19;
            adAsset = asset;
            bufferedSource = retrofitExceptionCatchingRequestBody_source;
            call = call;
            bufferedSink = null;
            Logger.INSTANCE.e(TAG, "Download exception for " + adAsset.getServerPath() + ": " + e);
            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
            downloadError = new AssetDownloadListener.DownloadError(i4, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
            if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
            }
            if (call != null) {
            }
            FileUtility.INSTANCE.closeQuietly(bufferedSink);
            FileUtility.INSTANCE.closeQuietly(bufferedSource);
            Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
            status = progress.getStatus();
            if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
            }
            return downloadError;
        } catch (Throwable th16) {
            th = th16;
            bufferedSource = retrofitExceptionCatchingRequestBody_source;
            call = call;
            bufferedSink = null;
            responseBody = null;
            if (response != null) {
            }
            if (responseBody != null) {
            }
            if (call != null) {
            }
            FileUtility.INSTANCE.closeQuietly(bufferedSink);
            FileUtility.INSTANCE.closeQuietly(bufferedSource);
            Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
            throw th;
        }
        status = progress.getStatus();
        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR() || status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED()) {
            return downloadError;
        }
        if (status != AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
            Logger.INSTANCE.d(TAG, "On cancel " + downloadRequest);
            assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
            return null;
        }
        assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
        int currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
        if (currentRetryAttempt$vungle_ads_release > 0) {
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
        }
        return null;
    }

    private final ResponseBody decodeGzipIfNeeded(Response networkResponse) {
        ResponseBody okhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(networkResponse);
        if (!StringsKt.equals(GZIP, Response.header$default(networkResponse, "Content-Encoding", null, 2, null), true) || okhttp3Response_body == null) {
            return okhttp3Response_body;
        }
        return new RealResponseBody(Response.header$default(networkResponse, "Content-Type", null, 2, null), -1L, Okio.buffer(new GzipSource(LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(okhttp3Response_body))));
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener listener) {
        Logger.INSTANCE.d(TAG, "On success " + downloadRequest);
        if (listener != null) {
            listener.onSuccess(file, downloadRequest);
        }
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener downloadListener) {
        if (downloadListener != null) {
            downloadListener.onProgress(progress, downloadRequest);
        }
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }
}
