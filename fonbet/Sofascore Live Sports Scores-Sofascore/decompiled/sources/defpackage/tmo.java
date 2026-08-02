package defpackage;

import com.google.android.gms.internal.ads.zzhmc;
import com.google.android.gms.internal.ads.zzhmi;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class tmo {
    public final long[] a;
    public final long[] b;
    public final long[] c;

    public tmo() {
        tmo tmoVar = zzhmi.a;
        this.a = Arrays.copyOf(tmoVar.a, 10);
        this.b = Arrays.copyOf(tmoVar.b, 10);
        this.c = Arrays.copyOf(tmoVar.c, 10);
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(tmo tmoVar, int i) {
        zzhmc.a(this.a, tmoVar.a, i);
        zzhmc.a(this.b, tmoVar.b, i);
        zzhmc.a(this.c, tmoVar.c, i);
    }

    public tmo(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
