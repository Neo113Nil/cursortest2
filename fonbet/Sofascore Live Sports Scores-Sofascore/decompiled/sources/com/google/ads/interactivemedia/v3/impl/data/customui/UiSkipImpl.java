package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import defpackage.b9k;
import defpackage.i9k;
import defpackage.l9k;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiSkipImpl implements l9k {
    private b9k button;
    private i9k countdown;

    public UiSkipImpl(@NonNull b9k b9kVar, @NonNull i9k i9kVar) {
        this.button = b9kVar;
        this.countdown = i9kVar;
    }

    @NonNull
    public static UiSkipImpl createFromJavaScriptMessage(@NonNull JavaScriptUiSkipData javaScriptUiSkipData) {
        return new UiSkipImpl(UiButtonImpl.createFromJavaScriptMessage(javaScriptUiSkipData.button()), UiLabelImpl.createFromJavaScriptMessage(javaScriptUiSkipData.countdown()));
    }

    @NonNull
    public b9k getButton() {
        return this.button;
    }

    @NonNull
    public i9k getCountdown() {
        return this.countdown;
    }

    public void setButton(@NonNull b9k b9kVar) {
        this.button = b9kVar;
    }

    public void setCountdown(@NonNull i9k i9kVar) {
        this.countdown = i9kVar;
    }
}
