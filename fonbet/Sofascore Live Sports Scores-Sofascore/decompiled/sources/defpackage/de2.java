package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class de2 extends kn8 {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ i2g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de2(bod bodVar, l62 l62Var) {
        super(l62Var);
        this.c = bodVar;
    }

    @Override // defpackage.kn8, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.b) {
            case 0:
                ((ee2) this.c).d.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // defpackage.kn8, defpackage.cwh
    public long read(x52 x52Var, long j) {
        switch (this.b) {
            case 1:
                try {
                    return super.read(x52Var, j);
                } catch (IOException e) {
                    ((bod) this.c).f = e;
                    throw e;
                }
            default:
                return super.read(x52Var, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de2(cwh cwhVar, ee2 ee2Var) {
        super(cwhVar);
        this.c = ee2Var;
    }
}
