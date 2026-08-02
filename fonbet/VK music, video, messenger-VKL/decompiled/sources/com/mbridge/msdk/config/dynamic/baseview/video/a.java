package com.mbridge.msdk.config.dynamic.baseview.video;

/* compiled from: ComponentPlayerEventListener.java */
/* loaded from: classes13.dex */
public interface a {
    void a(long j);

    void a(long j, long j2);

    void onBufferingEnd();

    void onBufferingStart();

    void onBufferingTimeOut(String str);

    void onPlayCompleted();

    void onPlayError(String str);
}
