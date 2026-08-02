package defpackage;

import com.google.android.gms.internal.ads.zzhmp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class umo extends tmo {
    public final long[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public umo(vmo vmoVar) {
        super(r1, r2, r4);
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        this.d = jArr3;
        x6k x6kVar = vmoVar.a;
        zzhmp.a(jArr, (long[]) x6kVar.c, (long[]) x6kVar.b);
        zzhmp.b(jArr2, (long[]) x6kVar.c, (long[]) x6kVar.b);
        System.arraycopy((long[]) x6kVar.d, 0, jArr3, 0, 10);
        zzhmp.e(jArr4, vmoVar.b, wmo.b);
    }

    @Override // defpackage.tmo
    public final void a(long[] jArr, long[] jArr2) {
        zzhmp.e(jArr, jArr2, this.d);
    }
}
