package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.Nullable;
import defpackage.q1p;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_JavaScriptUiConfigData.class)
/* loaded from: classes2.dex */
public abstract class JavaScriptUiConfigData {
    @Nullable
    public abstract JavaScriptUiLinkData adTitle();

    @Nullable
    public abstract JavaScriptUiLabelData attribution();

    @Nullable
    public abstract JavaScriptUiIconData authorIcon();

    @Nullable
    public abstract JavaScriptUiLinkData authorName();

    @Nullable
    public abstract JavaScriptUiButtonData callToAction();

    @Nullable
    public abstract List<JavaScriptUiVastIconData> icons();

    @Nullable
    public abstract JavaScriptUiSkipData skip();

    @Nullable
    public abstract JavaScriptUiElementData videoOverlay();
}
