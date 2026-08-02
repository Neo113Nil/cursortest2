package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzuo;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzxz;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wxo implements zzxz, zzuo {
    public final ayo a;
    public final /* synthetic */ tdc b;

    public wxo(tdc tdcVar, ayo ayoVar) {
        this.b = tdcVar;
        this.a = ayoVar;
    }

    public final Pair a(zzxo zzxoVar) {
        zzxo zzxoVar2;
        ayo ayoVar = this.a;
        zzxo zzxoVar3 = null;
        if (zzxoVar != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = ayoVar.c;
                if (i >= arrayList.size()) {
                    zzxoVar2 = null;
                    break;
                }
                if (((zzxo) arrayList.get(i)).d == zzxoVar.d) {
                    Object obj = zzxoVar.a;
                    Object obj2 = ayoVar.b;
                    int i2 = tyo.k;
                    zzxoVar2 = zzxoVar.a(Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (zzxoVar2 == null) {
                return null;
            }
            zzxoVar3 = zzxoVar2;
        }
        return Pair.create(Integer.valueOf(ayoVar.d), zzxoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void b(int i, zzxo zzxoVar, zzxk zzxkVar) {
        Pair a = a(zzxoVar);
        if (a != null) {
            ((zzea) this.b.l).f(new jgo(12, this, a, zzxkVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void e(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, int i2) {
        Pair a = a(zzxoVar);
        if (a != null) {
            ((zzea) this.b.l).f(new hk0(this, a, zzxfVar, zzxkVar, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void g(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, IOException iOException, boolean z) {
        Pair a = a(zzxoVar);
        if (a != null) {
            ((zzea) this.b.l).f(new oco(this, a, zzxfVar, zzxkVar, iOException, z));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void k(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        Pair a = a(zzxoVar);
        if (a != null) {
            ((zzea) this.b.l).f(new oxo(this, a, zzxfVar, zzxkVar, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void l(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        Pair a = a(zzxoVar);
        if (a != null) {
            ((zzea) this.b.l).f(new oxo(this, a, zzxfVar, zzxkVar, 1));
        }
    }
}
