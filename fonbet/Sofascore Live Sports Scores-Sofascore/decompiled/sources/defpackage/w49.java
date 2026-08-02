package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w49 extends yzf {
    public final /* synthetic */ qzf c;
    public final /* synthetic */ x49 d;

    public w49(qzf qzfVar, x49 x49Var) {
        this.c = qzfVar;
        this.d = x49Var;
    }

    @Override // defpackage.yzf
    public final long contentLength() {
        return -1L;
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        zdc contentType;
        yzf yzfVar = this.c.d;
        return (yzfVar == null || (contentType = yzfVar.contentType()) == null) ? this.d.a : contentType;
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        kof kofVar = new kof(new y49(k62Var));
        try {
            yzf yzfVar = this.c.d;
            if (yzfVar != null) {
                yzfVar.writeTo(kofVar);
                Unit unit = Unit.a;
            }
            kofVar.close();
        } finally {
        }
    }
}
