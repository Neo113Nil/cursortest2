package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.dmi;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzc {
    public static final zzc b = new zzc(new zza[0]);
    public static final zza c;
    public final zza[] a;

    static {
        zza zzaVar = new zza(-1, new int[0], new zzak[0], new long[0], new String[0], new zzb[0]);
        int[] iArr = zzaVar.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = zzaVar.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, C.TIME_UNSET);
        zzak[] zzakVarArr = (zzak[]) Arrays.copyOf(zzaVar.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(zzaVar.f, 0);
        zzb[] zzbVarArr = zzaVar.g;
        c = new zza(0, copyOf, zzakVarArr, copyOf2, strArr, (zzb[]) Arrays.copyOf(zzbVarArr, Math.max(0, zzbVarArr.length)));
        String str = zzfm.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzc(zza[] zzaVarArr) {
        this.a = zzaVarArr;
    }

    public final zza a(int i) {
        return i < 0 ? c : this.a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzc.class == obj.getClass() && Arrays.equals(this.a, ((zzc) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 961;
    }

    public final String toString() {
        return dmi.q("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
