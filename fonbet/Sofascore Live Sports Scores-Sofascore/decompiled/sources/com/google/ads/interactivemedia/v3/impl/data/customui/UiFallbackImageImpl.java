package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiFallbackImageImpl extends UiImageImpl {
    private String id;
    private String program;

    public UiFallbackImageImpl(@NonNull String str, @NonNull String str2, @NonNull String str3, int i, int i2, @Nullable String str4) {
        super(str3, i, i2, str4);
        this.id = str;
        this.program = str2;
    }

    @NonNull
    public static UiFallbackImageImpl createFromJavaScriptMessage(@NonNull JavaScriptUiFallbackImageData javaScriptUiFallbackImageData) {
        return new UiFallbackImageImpl(javaScriptUiFallbackImageData.id(), javaScriptUiFallbackImageData.program(), javaScriptUiFallbackImageData.url(), javaScriptUiFallbackImageData.width(), javaScriptUiFallbackImageData.height(), javaScriptUiFallbackImageData.altText());
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    @NonNull
    public String getProgram() {
        return this.program;
    }

    public void setId(@NonNull String str) {
        this.id = str;
    }

    public void setProgram(@NonNull String str) {
        this.program = str;
    }
}
