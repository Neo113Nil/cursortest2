package com.vungle.ads.internal.load;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DefaultPrivacyIconInjector;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.DeviceCheckUtils;
import com.vungle.ads.internal.util.Logger;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: BaseAdLoader.kt */
@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"com/vungle/ads/internal/load/BaseAdLoader$assetDownloadListener$1", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "partialDownloadRecorded", "", "onError", "", "error", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "downloadRequest", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "onProgress", "progress", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "onStart", "onSuccess", "file", "Ljava/io/File;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BaseAdLoader$assetDownloadListener$1 implements AssetDownloadListener {
    private boolean partialDownloadRecorded;
    final /* synthetic */ BaseAdLoader this$0;

    BaseAdLoader$assetDownloadListener$1(BaseAdLoader baseAdLoader) {
        this.this$0 = baseAdLoader;
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onStart(DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        Logger.INSTANCE.w("BaseAdLoader", "onStart called: " + downloadRequest.getAsset().getServerPath());
        downloadRequest.startPartialDownloadRecord();
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        final AdAsset asset = downloadRequest.getAsset();
        Integer percentage = asset.getPercentage();
        Logger.INSTANCE.d("BaseAdLoader", "Download progress: " + progress + " url: " + asset.getServerPath());
        if (this.partialDownloadRecorded || percentage == null || progress.getProgressPercent() < percentage.intValue()) {
            return;
        }
        this.partialDownloadRecorded = true;
        if (new IntRange(1, 99).contains(percentage.intValue())) {
            downloadRequest.stopPartialDownloadRecord();
        }
        Logger.INSTANCE.w("BaseAdLoader", "Download progress: hit chunk percentage=" + percentage + " for url: " + asset.getServerPath());
        if (asset.getIsRequired()) {
            VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
            final BaseAdLoader baseAdLoader = this.this$0;
            background_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseAdLoader$assetDownloadListener$1.m10685onProgress$lambda0(BaseAdLoader.this, asset);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onProgress$lambda-0, reason: not valid java name */
    public static final void m10685onProgress$lambda0(BaseAdLoader this$0, AdAsset adAsset) {
        Set set;
        Set set2;
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adAsset, "$adAsset");
        set = this$0.downloadRequiredAssets;
        set.remove(adAsset.getServerPath());
        set2 = this$0.downloadRequiredAssets;
        if (set2.isEmpty()) {
            atomicBoolean = this$0.requiredAssetDownloaded;
            if (atomicBoolean.get()) {
                this$0.onRequiredDownloadCompleted();
            } else {
                this$0.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                this$0.cancel();
            }
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onError(final AssetDownloadListener.DownloadError error, final DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        Logger.INSTANCE.e("BaseAdLoader", "onError called: " + error);
        VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader$assetDownloadListener$1.m10684onError$lambda1(DownloadRequest.this, baseAdLoader, this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onError$lambda-1, reason: not valid java name */
    public static final void m10684onError$lambda1(DownloadRequest downloadRequest, BaseAdLoader this$0, BaseAdLoader$assetDownloadListener$1 this$1, AssetDownloadListener.DownloadError downloadError) {
        AtomicBoolean atomicBoolean;
        AtomicLong atomicLong;
        Set set;
        Set set2;
        AtomicBoolean atomicBoolean2;
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        AdAsset asset = downloadRequest.getAsset();
        if (asset.isPrivacyIcon()) {
            File injectPrivacyIcon = DefaultPrivacyIconInjector.INSTANCE.injectPrivacyIcon(this$0.getPathProvider().getVmDir());
            if (injectPrivacyIcon != null && injectPrivacyIcon.exists()) {
                this$1.onSuccess(injectPrivacyIcon, downloadRequest);
                return;
            }
            new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
        asset.setStatus(AdAsset.Status.DOWNLOAD_FAILED);
        atomicBoolean = this$0.fullyDownloaded;
        atomicBoolean.set(false);
        if (asset.getIsRequired()) {
            atomicBoolean2 = this$0.requiredAssetDownloaded;
            atomicBoolean2.set(false);
        }
        new AssetRequestError("Failed to download assets " + asset.getServerPath() + ". error: " + downloadError + " proxyEnabled=" + DeviceCheckUtils.INSTANCE.isProxyEnabled(this$0.getContext())).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (asset.getIsRequired()) {
            set = this$0.downloadRequiredAssets;
            set.remove(downloadRequest.getAsset().getServerPath());
            set2 = this$0.downloadRequiredAssets;
            if (set2.isEmpty()) {
                this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download required assets."));
                this$0.cancel();
                return;
            }
        }
        atomicLong = this$0.downloadCount;
        if (atomicLong.decrementAndGet() <= 0) {
            this$0.onAdLoadFailed(new AssetRequestError("Error: Failed to download assets."));
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onSuccess(final File file, final DownloadRequest downloadRequest) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader$assetDownloadListener$1.m10686onSuccess$lambda2(file, this, downloadRequest, baseAdLoader);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-2, reason: not valid java name */
    public static final void m10686onSuccess$lambda2(File file, BaseAdLoader$assetDownloadListener$1 this$0, DownloadRequest downloadRequest, BaseAdLoader this$1) {
        SingleValueMetric singleValueMetric;
        SingleValueMetric singleValueMetric2;
        AtomicLong atomicLong;
        AtomicBoolean atomicBoolean;
        Set set;
        Set set2;
        AtomicBoolean atomicBoolean2;
        boolean processVmTemplate;
        AtomicBoolean atomicBoolean3;
        AtomicBoolean atomicBoolean4;
        SingleValueMetric singleValueMetric3;
        SingleValueMetric singleValueMetric4;
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        if (!file.exists()) {
            this$0.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR()), downloadRequest);
            return;
        }
        AdAsset asset = downloadRequest.getAsset();
        asset.setFileSize(file.length());
        asset.setStatus(AdAsset.Status.DOWNLOAD_SUCCESS);
        Integer percentage = asset.getPercentage();
        if (percentage == null || percentage.intValue() == 0 || percentage.intValue() == 100) {
            downloadRequest.stopPartialDownloadRecord();
        }
        if (asset.isHtmlTemplate()) {
            downloadRequest.stopTemplateRecord();
            singleValueMetric3 = this$1.templateHtmlSizeMetric;
            singleValueMetric3.setValue(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            singleValueMetric4 = this$1.templateHtmlSizeMetric;
            analyticsClient.logMetric$vungle_ads_release(singleValueMetric4, this$1.getLogEntry(), asset.getServerPath());
        } else if (asset.isMainVideo()) {
            singleValueMetric = this$1.mainVideoSizeMetric;
            singleValueMetric.setValue(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            singleValueMetric2 = this$1.mainVideoSizeMetric;
            analyticsClient2.logMetric$vungle_ads_release(singleValueMetric2, this$1.getLogEntry(), asset.getServerPath());
        }
        AdPayload advertisement = this$1.getAdvertisement();
        if (advertisement != null) {
            advertisement.updateAdAssetPath(asset.getAdIdentifier(), file);
        }
        if (asset.isHtmlTemplate()) {
            processVmTemplate = this$1.processVmTemplate(asset, this$1.getAdvertisement());
            if (!processVmTemplate) {
                atomicBoolean3 = this$1.fullyDownloaded;
                atomicBoolean3.set(false);
                if (asset.getIsRequired()) {
                    atomicBoolean4 = this$1.requiredAssetDownloaded;
                    atomicBoolean4.set(false);
                }
            }
        }
        if (asset.getIsRequired()) {
            set = this$1.downloadRequiredAssets;
            set.remove(asset.getServerPath());
            set2 = this$1.downloadRequiredAssets;
            if (set2.isEmpty()) {
                atomicBoolean2 = this$1.requiredAssetDownloaded;
                if (atomicBoolean2.get()) {
                    this$1.onRequiredDownloadCompleted();
                } else {
                    this$1.onAdLoadFailed(new AssetRequestError("Failed to download required assets."));
                    this$1.cancel();
                    return;
                }
            }
        }
        atomicLong = this$1.downloadCount;
        if (atomicLong.decrementAndGet() <= 0) {
            atomicBoolean = this$1.fullyDownloaded;
            if (atomicBoolean.get()) {
                this$1.onDownloadCompleted(this$1.getAdRequest());
            } else {
                this$1.onAdLoadFailed(new AssetRequestError("Failed to download assets."));
            }
        }
    }
}
