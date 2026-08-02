package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.q1p;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_IconsViewData.class)
/* loaded from: classes2.dex */
public abstract class IconsViewData {
    @NonNull
    public static IconsViewData create(@NonNull List<IconData> list) {
        return new AutoValue_IconsViewData(list);
    }

    @NonNull
    public abstract List<IconData> icons();
}
