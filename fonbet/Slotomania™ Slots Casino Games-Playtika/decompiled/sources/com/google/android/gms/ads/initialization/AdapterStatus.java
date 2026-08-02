package com.google.android.gms.ads.initialization;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes4.dex */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
    public enum State {
        NOT_READY,
        READY
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
