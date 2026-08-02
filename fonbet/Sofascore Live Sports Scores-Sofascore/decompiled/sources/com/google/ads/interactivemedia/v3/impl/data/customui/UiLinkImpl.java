package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import defpackage.j9k;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiLinkImpl extends UiLabelImpl implements j9k {
    private String clickUrl;

    public UiLinkImpl(@NonNull String str, boolean z, @NonNull String str2, @NonNull String str3) {
        super(str, z, str2);
        this.clickUrl = str3;
    }

    @NonNull
    public static UiLinkImpl createFromJavaScriptMessage(@NonNull JavaScriptUiLinkData javaScriptUiLinkData) {
        return new UiLinkImpl(javaScriptUiLinkData.id(), javaScriptUiLinkData.required(), javaScriptUiLinkData.text(), javaScriptUiLinkData.clickUrl());
    }

    @NonNull
    public String getClickUrl() {
        return this.clickUrl;
    }

    public void setClickUrl(@NonNull String str) {
        this.clickUrl = str;
    }
}
