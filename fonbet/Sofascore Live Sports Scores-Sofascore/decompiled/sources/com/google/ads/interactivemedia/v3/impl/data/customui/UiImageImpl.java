package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.b2p;
import defpackage.h9k;
import defpackage.u1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiImageImpl implements h9k {
    private b2p altText;
    private int height;
    private String url;
    private int width;

    public UiImageImpl(@NonNull String str, int i, int i2, @Nullable String str2) {
        this.width = 0;
        this.height = 0;
        this.altText = u1p.a;
        this.url = str;
        this.width = i;
        this.height = i2;
        this.altText = b2p.l(str2);
    }

    @NonNull
    public static UiImageImpl createFromJavaScriptMessage(@NonNull JavaScriptUiImageData javaScriptUiImageData) {
        return new UiImageImpl(javaScriptUiImageData.url(), javaScriptUiImageData.width(), javaScriptUiImageData.height(), javaScriptUiImageData.altText());
    }

    @Nullable
    public String getAltText() {
        return (String) this.altText.i();
    }

    public int getHeight() {
        return this.height;
    }

    @NonNull
    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAltText(@NonNull String str) {
        this.altText = b2p.k(str);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setUrl(@NonNull String str) {
        this.url = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
