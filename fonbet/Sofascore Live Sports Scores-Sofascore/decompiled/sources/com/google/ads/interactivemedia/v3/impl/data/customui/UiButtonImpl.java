package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import defpackage.b9k;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiButtonImpl extends UiLabelImpl implements b9k {
    public UiButtonImpl(@NonNull String str, boolean z, @NonNull String str2) {
        super(str, z, str2);
    }

    @NonNull
    public static UiButtonImpl createFromJavaScriptMessage(@NonNull JavaScriptUiButtonData javaScriptUiButtonData) {
        return new UiButtonImpl(javaScriptUiButtonData.id(), javaScriptUiButtonData.required(), javaScriptUiButtonData.text());
    }
}
