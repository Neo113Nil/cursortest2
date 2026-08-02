package defpackage;

import com.google.android.gms.internal.ads.zzafr;
import com.google.android.gms.internal.ads.zzafs;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzago;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzagu;
import com.google.android.gms.internal.ads.zzeu;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zfn implements zzafs {
    public final zzagu a;
    public final int b;
    public final zzago c = new zzago();

    public /* synthetic */ zfn(zzagu zzaguVar, int i) {
        this.a = zzaguVar;
        this.b = i;
    }

    public final long a(zzagi zzagiVar) {
        zzago zzagoVar;
        zzagu zzaguVar;
        int j;
        while (true) {
            long zzm = zzagiVar.zzm();
            long zzo = zzagiVar.zzo() - 6;
            zzagoVar = this.c;
            zzaguVar = this.a;
            if (zzm >= zzo) {
                break;
            }
            long zzm2 = zzagiVar.zzm();
            zzeu zzeuVar = new zzeu(17);
            int i = 0;
            zzagiVar.h(0, 2, zzeuVar.a);
            char r = zzeuVar.r(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.b;
            if (r != i2) {
                zzagiVar.zzl();
                zzagiVar.d((int) (zzm2 - zzagiVar.zzn()));
            } else {
                byte[] bArr = zzeuVar.a;
                while (i < 15 && (j = zzagiVar.j(2 + i, 15 - i, bArr)) != -1) {
                    i += j;
                }
                zzeuVar.C(i + 2);
                zzagiVar.zzl();
                zzagiVar.d((int) (zzm2 - zzagiVar.zzn()));
                if (zzagp.a(zzeuVar, zzaguVar, i2, zzagoVar)) {
                    break;
                }
            }
            zzagiVar.d(1);
        }
        if (zzagiVar.zzm() < zzagiVar.zzo() - 6) {
            return zzagoVar.a;
        }
        zzagiVar.d((int) (zzagiVar.zzo() - zzagiVar.zzm()));
        return zzaguVar.j;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzafr d(zzagi zzagiVar, long j) {
        long zzn = zzagiVar.zzn();
        long a = a(zzagiVar);
        long zzm = zzagiVar.zzm();
        zzagiVar.d(Math.max(6, this.a.c));
        long a2 = a(zzagiVar);
        return (a > j || a2 <= j) ? a2 <= j ? new zzafr(-2, a2, zzagiVar.zzm()) : new zzafr(-1, a, zzn) : new zzafr(0, C.TIME_UNSET, zzm);
    }
}
