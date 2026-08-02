package com.mbridge.msdk.playercommon;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface VideoPlayerStatusListener {
    void onBufferingEnd();

    void onBufferingStart(String str);

    void onBufferingTimeOut(String str);

    void onPlayCompleted();

    void onPlayError(String str);

    void onPlayProgress(int i, int i2);

    void onPlayProgressMS(int i, int i2);

    void onPlaySetDataSourceError(String str);

    void onPlayStarted(int i);
}
