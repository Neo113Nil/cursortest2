package defpackage;

import com.google.android.gms.internal.measurement.zzaaa;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.google.android.gms.internal.measurement.zzzj;
import com.google.android.gms.internal.measurement.zzzq;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mgp extends zzaaa {
    public final zzzj b;
    public final zzzj c;
    public final int[] d;
    public final int e;

    public mgp(zzzj zzzjVar, zzzj zzzjVar2) {
        this.b = zzzjVar;
        this.c = zzzjVar2;
        int a = zzzjVar2.a();
        if (!(a <= 28)) {
            a70.p("metadata size too large");
            throw null;
        }
        int[] iArr = new int[a];
        this.d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < a) {
            zzyl d = d(i);
            long j2 = d.e | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (d.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = d.c ? iArr[i3] | (1 << (i + 4)) : i;
                    i++;
                    j = j2;
                }
            }
            iArr[i2] = i;
            i2++;
            i++;
            j = j2;
        }
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void a(zzzq zzzqVar, zzzc zzzcVar) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            zzyl d = d(i2 & 31);
            if (d.c) {
                zzzqVar.b(d, new kgp(this, d, i2), zzzcVar);
            } else {
                zzzj zzzjVar = this.b;
                int a = zzzjVar.a();
                if (i2 >= a) {
                    zzzjVar = this.c;
                    i2 -= a;
                }
                zzzqVar.a(d, d.b.cast(zzzjVar.c(i2)), zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int b() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set c() {
        return new yg0(this, 13);
    }

    public final zzyl d(int i) {
        zzzj zzzjVar = this.b;
        int a = zzzjVar.a();
        return i >= a ? this.c.b(i - a) : zzzjVar.b(i);
    }
}
