package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class b8m extends yzf {
    public final /* synthetic */ yzf c;

    public b8m(yzf yzfVar) {
        this.c = yzfVar;
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return this.c.contentType();
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        kof kofVar = new kof(new y49(k62Var));
        try {
            this.c.writeTo(kofVar);
            Unit unit = Unit.a;
            kofVar.close();
        } finally {
        }
    }
}
