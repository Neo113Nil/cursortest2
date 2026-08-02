package defpackage;

import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzagu;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rhn extends qgi {
    public zzagu o;
    public c78 p;

    @Override // defpackage.qgi
    public final void g(boolean z) {
        super.g(z);
        if (z) {
            this.o = null;
            this.p = null;
        }
    }

    @Override // defpackage.qgi
    public final long h(zzeu zzeuVar) {
        byte[] bArr = zzeuVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int b = zzagp.b(i, zzeuVar);
            zzeuVar.D(0);
            return b;
        }
        zzeuVar.E(4);
        zzeuVar.o();
        int b2 = zzagp.b(i, zzeuVar);
        zzeuVar.D(0);
        return b2;
    }

    @Override // defpackage.qgi
    public final boolean i(zzeu zzeuVar, long j, c0l c0lVar) {
        byte[] bArr = zzeuVar.a;
        zzagu zzaguVar = this.o;
        if (zzaguVar == null) {
            zzagu zzaguVar2 = new zzagu(bArr, 17);
            this.o = zzaguVar2;
            zzt zztVar = new zzt(zzaguVar2.b(Arrays.copyOfRange(bArr, 9, zzeuVar.c), null));
            zztVar.c("audio/ogg");
            c0lVar.b = new zzv(zztVar);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            zzagt a = zzagr.a(zzeuVar);
            zzagu zzaguVar3 = new zzagu(zzaguVar.a, zzaguVar.b, zzaguVar.c, zzaguVar.d, zzaguVar.e, zzaguVar.g, zzaguVar.h, zzaguVar.j, a, zzaguVar.l);
            this.o = zzaguVar3;
            this.p = new c78(zzaguVar3, a);
            return true;
        }
        if (b != -1) {
            return true;
        }
        c78 c78Var = this.p;
        if (c78Var != null) {
            c78Var.b = j;
            c0lVar.c = c78Var;
        }
        ((zzv) c0lVar.b).getClass();
        return false;
    }
}
