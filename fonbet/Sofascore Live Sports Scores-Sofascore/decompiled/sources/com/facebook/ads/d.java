package com.facebook.ads;

import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d implements Runnable {
    public final /* synthetic */ MediaView a;

    public d(MediaView mediaView) {
        this.a = mediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdViewConstructorParams adViewConstructorParams;
        MediaViewApi mediaViewApi;
        MediaViewApi mediaViewApi2;
        AdViewConstructorParams adViewConstructorParams2;
        MediaView mediaView = this.a;
        mediaView.removeAllViews();
        ((AdNativeComponentView) mediaView).mAdComponentViewApi = null;
        adViewConstructorParams = mediaView.mConstructorParams;
        mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewApi();
        mediaViewApi = mediaView.mMediaViewApi;
        mediaView.attachAdComponentViewApi(mediaViewApi);
        mediaViewApi2 = mediaView.mMediaViewApi;
        adViewConstructorParams2 = mediaView.mConstructorParams;
        mediaViewApi2.initialize(adViewConstructorParams2, mediaView);
    }
}
