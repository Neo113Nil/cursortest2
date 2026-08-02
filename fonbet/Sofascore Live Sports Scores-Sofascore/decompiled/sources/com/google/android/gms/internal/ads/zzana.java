package com.google.android.gms.internal.ads;

import defpackage.mz1;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzana implements zzaho {
    public final int a;
    public final zzhbf b;

    public zzana(int i, int[] iArr) {
        zzhbf zzhbfVar;
        this.a = i;
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            zzhbfVar = new zzhbf(copyOf, copyOf.length);
        } else {
            zzhbfVar = zzhbf.c;
        }
        this.b = zzhbfVar;
    }

    public final String toString() {
        zzhbf zzhbfVar = this.b;
        int i = zzhbfVar.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(zzfm.a(zzhbfVar.a(i2)));
        }
        String a = zzfm.a(this.a);
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder(mz1.d(a.length() + 37, 1, obj));
        sb.append("UnsupportedBrands{major=");
        sb.append(a);
        sb.append(", compatible=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
