package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbd {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public boolean e;
    public zzc f = zzc.b;

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final void a(Object obj, Object obj2, int i, long j, boolean z) {
        zzc zzcVar = zzc.b;
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.f = zzcVar;
        this.e = z;
    }

    public final long b(int i, int i2) {
        zza a = this.f.a(i);
        return a.a != -1 ? a.e[i2] : C.TIME_UNSET;
    }

    public final void c(int i) {
        this.f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zzbd.class.equals(obj.getClass())) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return Objects.equals(this.a, zzbdVar.a) && Objects.equals(this.b, zzbdVar.b) && this.c == zzbdVar.c && this.d == zzbdVar.d && this.e == zzbdVar.e && Objects.equals(this.f, zzbdVar.f);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int hashCode2 = ((((hashCode + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c;
        long j = this.d;
        return this.f.hashCode() + (((((hashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.e ? 1 : 0)) * 31);
    }
}
