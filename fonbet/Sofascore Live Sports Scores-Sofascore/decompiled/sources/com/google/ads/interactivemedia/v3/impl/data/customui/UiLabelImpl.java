package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import defpackage.i9k;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiLabelImpl extends UiElementImpl implements i9k {
    private String text;

    public UiLabelImpl(@NonNull String str, boolean z, @NonNull String str2) {
        super(str, z);
        this.text = str2;
    }

    @NonNull
    public static UiLabelImpl createFromJavaScriptMessage(@NonNull JavaScriptUiLabelData javaScriptUiLabelData) {
        return new UiLabelImpl(javaScriptUiLabelData.id(), javaScriptUiLabelData.required(), javaScriptUiLabelData.text());
    }

    @NonNull
    public String getText() {
        return this.text;
    }

    public void setText(@NonNull String str) {
        this.text = str;
    }
}
