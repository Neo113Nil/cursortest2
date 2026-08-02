package defpackage;

import com.google.android.gms.internal.ads.zzun;
import com.google.android.gms.internal.ads.zzuo;
import com.google.android.gms.internal.ads.zzww;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzxz;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hbp implements zzxz, zzuo {
    public final Object a;
    public zzxy b;
    public zzun c;
    public final /* synthetic */ zzww d;

    public hbp(zzww zzwwVar, Object obj) {
        this.d = zzwwVar;
        this.b = new zzxy(zzwwVar.c.b, null);
        this.c = new zzun(zzwwVar.d.b, null);
        this.a = obj;
    }

    public final boolean a(zzxo zzxoVar) {
        zzxo zzxoVar2;
        Object obj = this.a;
        zzww zzwwVar = this.d;
        if (zzxoVar != null) {
            zzxoVar2 = zzwwVar.v(obj, zzxoVar);
            if (zzxoVar2 == null) {
                return false;
            }
        } else {
            zzxoVar2 = null;
        }
        zzwwVar.u(obj);
        if (!Objects.equals(this.b.a, zzxoVar2)) {
            this.b = new zzxy(zzwwVar.c.b, zzxoVar2);
        }
        if (Objects.equals(this.c.a, zzxoVar2)) {
            return true;
        }
        this.c = new zzun(zzwwVar.d.b, zzxoVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void b(int i, zzxo zzxoVar, zzxk zzxkVar) {
        if (a(zzxoVar)) {
            zzxy zzxyVar = this.b;
            c(zzxkVar, zzxoVar);
            zzxyVar.a(new gvo(16, zzxyVar, zzxkVar));
        }
    }

    public final void c(zzxk zzxkVar, zzxo zzxoVar) {
        long j = zzxkVar.c;
        zzww zzwwVar = this.d;
        Object obj = this.a;
        zzwwVar.w(obj, j);
        zzwwVar.w(obj, zzxkVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void e(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, int i2) {
        if (a(zzxoVar)) {
            zzxy zzxyVar = this.b;
            c(zzxkVar, zzxoVar);
            zzxyVar.a(new fig(zzxyVar, zzxfVar, zzxkVar, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void g(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, IOException iOException, boolean z) {
        if (a(zzxoVar)) {
            zzxy zzxyVar = this.b;
            c(zzxkVar, zzxoVar);
            zzxyVar.a(new n72(zzxyVar, zzxfVar, zzxkVar, iOException, z));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void k(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        if (a(zzxoVar)) {
            zzxy zzxyVar = this.b;
            c(zzxkVar, zzxoVar);
            zzxyVar.a(new yjo(zzxyVar, zzxfVar, zzxkVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void l(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        if (a(zzxoVar)) {
            zzxy zzxyVar = this.b;
            c(zzxkVar, zzxoVar);
            zzxyVar.a(new pcp(zzxyVar, zzxfVar, zzxkVar));
        }
    }
}
