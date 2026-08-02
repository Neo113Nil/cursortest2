package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.ma4;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_CustomUiOptionsData.class)
/* loaded from: classes2.dex */
public abstract class CustomUiOptionsData {
    @NonNull
    public static CustomUiOptionsData createFromCustomUiOptions(@NonNull ma4 ma4Var) {
        return new AutoValue_CustomUiOptionsData(ma4Var.getSkippableSupport(), ma4Var.getAboutThisAdSupport());
    }

    public abstract boolean aboutThisAdSupport();

    public abstract boolean skippableSupport();
}
