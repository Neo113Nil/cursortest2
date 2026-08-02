package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbmd extends zzbmn {
    public static final int i;
    public static final int j;
    public final String a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    static {
        int rgb = Color.rgb(12, 174, 206);
        i = Color.rgb(204, 204, 204);
        j = rgb;
    }

    public zzbmd(String str, List list, Integer num, Integer num2, Integer num3, int i2, int i3) {
        this.a = str;
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzbmg zzbmgVar = (zzbmg) list.get(i4);
            this.b.add(zzbmgVar);
            this.c.add(zzbmgVar);
        }
        this.d = num != null ? num.intValue() : i;
        this.e = num2 != null ? num2.intValue() : j;
        this.f = num3 != null ? num3.intValue() : 12;
        this.g = i2;
        this.h = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final String zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final ArrayList zzb() {
        return this.c;
    }
}
