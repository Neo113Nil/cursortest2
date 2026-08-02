package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.q1p;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_JavaScriptUiVastIconData.class)
/* loaded from: classes2.dex */
public abstract class JavaScriptUiVastIconData {
    @NonNull
    public abstract String clickUrl();

    public abstract boolean clickable();

    @NonNull
    public abstract List<JavaScriptUiFallbackImageData> fallbackImages();

    @NonNull
    public abstract String id();

    @NonNull
    public abstract JavaScriptUiImageData image();

    @NonNull
    public abstract String program();

    public abstract boolean required();

    @Nullable
    public abstract String xPosition();

    @Nullable
    public abstract String yPosition();
}
