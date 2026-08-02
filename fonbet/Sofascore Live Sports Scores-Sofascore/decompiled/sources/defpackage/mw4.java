package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mw4 extends khh implements nli {
    public final zli n;

    public mw4(zli zliVar) {
        super(new uli[2], new tm2[2]);
        int i = this.g;
        im4[] im4VarArr = this.e;
        z1a.E(i == im4VarArr.length);
        for (im4 im4Var : im4VarArr) {
            im4Var.C(1024);
        }
        this.n = zliVar;
    }

    @Override // defpackage.khh
    public final im4 c() {
        return new uli(1);
    }

    @Override // defpackage.khh
    public final jm4 d() {
        return new tm2(this);
    }

    @Override // defpackage.khh
    public final dy3 e(Throwable th) {
        return new pli("Unexpected decode error", th);
    }

    @Override // defpackage.khh
    public final dy3 f(im4 im4Var, jm4 jm4Var, boolean z) {
        uli uliVar = (uli) im4Var;
        tm2 tm2Var = (tm2) jm4Var;
        try {
            ByteBuffer byteBuffer = uliVar.i;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            zli zliVar = this.n;
            if (z) {
                zliVar.reset();
            }
            lli j = zliVar.j(0, limit, array);
            long j2 = uliVar.k;
            long j3 = uliVar.n;
            tm2Var.g = j2;
            tm2Var.i = j;
            if (j3 != Long.MAX_VALUE) {
                j2 = j3;
            }
            tm2Var.j = j2;
            tm2Var.h = false;
            return null;
        } catch (pli e) {
            return e;
        }
    }

    @Override // defpackage.nli
    public final void setPositionUs(long j) {
    }
}
