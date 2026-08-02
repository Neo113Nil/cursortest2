package com.mbridge.msdk.out;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface OnMBMediaViewListener {
    void onEnterFullscreen();

    void onExitFullscreen();

    void onFinishRedirection(Campaign campaign, String str);

    void onRedirectionFailed(Campaign campaign, String str);

    void onStartRedirection(Campaign campaign, String str);

    void onVideoAdClicked(Campaign campaign);

    void onVideoStart();
}
