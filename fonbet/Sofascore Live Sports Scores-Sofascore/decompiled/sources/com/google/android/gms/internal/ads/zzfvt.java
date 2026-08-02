package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfvt {
    public static final zzfvt a;
    public static final /* synthetic */ zzfvt[] b;

    /* JADX INFO: Fake field, exist only in values array */
    zzfvt EF0;

    static {
        zzfvt zzfvtVar = new zzfvt("VIDEO_CONTROLS", 0);
        zzfvt zzfvtVar2 = new zzfvt("CLOSE_AD", 1);
        zzfvt zzfvtVar3 = new zzfvt("NOT_VISIBLE", 2);
        a = zzfvtVar3;
        b = new zzfvt[]{zzfvtVar, zzfvtVar2, zzfvtVar3, new zzfvt(NativeAdContent.ViewTag.OTHER, 3)};
    }

    public static zzfvt[] values() {
        return (zzfvt[]) b.clone();
    }
}
