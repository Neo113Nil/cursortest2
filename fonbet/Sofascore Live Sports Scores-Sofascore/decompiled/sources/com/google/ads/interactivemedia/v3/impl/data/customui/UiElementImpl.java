package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import defpackage.d9k;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiElementImpl implements d9k {
    private String id;
    private boolean required;

    public UiElementImpl(@NonNull String str, boolean z) {
        this.id = str;
        this.required = z;
    }

    @NonNull
    public static UiElementImpl createFromJavaScriptMessage(@NonNull JavaScriptUiElementData javaScriptUiElementData) {
        return new UiElementImpl(javaScriptUiElementData.id(), javaScriptUiElementData.required());
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    public boolean getRequired() {
        return this.required;
    }

    public void setId(@NonNull String str) {
        this.id = str;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }
}
