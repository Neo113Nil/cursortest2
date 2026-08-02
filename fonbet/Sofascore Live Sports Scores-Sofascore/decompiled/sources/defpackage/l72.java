package defpackage;

import android.util.SparseArray;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l72 implements pl6 {
    public static final b78 j = new b78();
    public final ll6 a;
    public final int b;
    public final b c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public z41 f;
    public long g;
    public b0h h;
    public b[] i;

    public l72(ll6 ll6Var, int i, b bVar) {
        this.a = ll6Var;
        this.b = i;
        this.c = bVar;
    }

    public final ou2 a() {
        b0h b0hVar = this.h;
        if (b0hVar instanceof ou2) {
            return (ou2) b0hVar;
        }
        if (b0hVar instanceof zzb) {
            return ((zzb) b0hVar).a;
        }
        return null;
    }

    public final void b(z41 z41Var, long j2, long j3) {
        this.f = z41Var;
        this.g = j3;
        boolean z = this.e;
        ll6 ll6Var = this.a;
        if (!z) {
            ll6Var.e(this);
            if (j2 != C.TIME_UNSET) {
                ll6Var.seek(0L, j2);
            }
            this.e = true;
            return;
        }
        if (j2 == C.TIME_UNSET) {
            j2 = 0;
        }
        ll6Var.seek(0L, j2);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            k72 k72Var = (k72) sparseArray.valueAt(i);
            if (z41Var == null) {
                k72Var.e = k72Var.c;
            } else {
                k72Var.f = j3;
                vsj B = z41Var.B(k72Var.a);
                k72Var.e = B;
                b bVar = k72Var.d;
                if (bVar != null) {
                    B.d(bVar);
                }
            }
            i++;
        }
    }

    @Override // defpackage.pl6
    public final void endTracks() {
        SparseArray sparseArray = this.d;
        b[] bVarArr = new b[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            b bVar = ((k72) sparseArray.valueAt(i)).d;
            bVar.getClass();
            bVarArr[i] = bVar;
        }
        this.i = bVarArr;
    }

    @Override // defpackage.pl6
    public final void m(b0h b0hVar) {
        this.h = b0hVar;
    }

    @Override // defpackage.pl6
    /* renamed from: track */
    public final vsj mo2track(int i, int i2) {
        SparseArray sparseArray = this.d;
        k72 k72Var = (k72) sparseArray.get(i);
        if (k72Var == null) {
            z1a.E(this.i == null);
            k72Var = new k72(i, i2, i2 == this.b ? this.c : null);
            z41 z41Var = this.f;
            long j2 = this.g;
            if (z41Var == null) {
                k72Var.e = k72Var.c;
            } else {
                k72Var.f = j2;
                vsj B = z41Var.B(i2);
                k72Var.e = B;
                b bVar = k72Var.d;
                if (bVar != null) {
                    B.d(bVar);
                }
            }
            sparseArray.put(i, k72Var);
        }
        return k72Var;
    }
}
