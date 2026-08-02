package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.wt3;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzap {
    public final zzao[] a;

    public zzap(List list) {
        this.a = (zzao[]) list.toArray(new zzao[0]);
    }

    public final zzap a(zzap zzapVar) {
        return zzapVar == null ? this : b(zzapVar.a);
    }

    public final zzap b(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        String str = zzfm.a;
        zzao[] zzaoVarArr2 = this.a;
        int length2 = zzaoVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, copyOf, length2, length);
        return new zzap((zzao[]) copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzap.class == obj.getClass() && Arrays.equals(this.a, ((zzap) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(C.TIME_UNSET) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        return wt3.m("entries=", arrays, new StringBuilder(String.valueOf(arrays).length() + 8), "");
    }

    public zzap(zzao... zzaoVarArr) {
        this.a = zzaoVarArr;
    }
}
