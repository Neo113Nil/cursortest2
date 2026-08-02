package com.google.ads.interactivemedia.v3.api;

/* loaded from: classes6.dex */
public abstract class AdErrorEvent {

    public interface AdErrorListener {
        void onAdError(AdErrorEvent adErrorEvent);
    }

    public abstract AdError getError();
}
