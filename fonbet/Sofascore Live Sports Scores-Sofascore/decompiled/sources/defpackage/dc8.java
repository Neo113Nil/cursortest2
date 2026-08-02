package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dc8 extends n3 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc8(ob8 ob8Var, int i) {
        super(ob8Var);
        this.c = i;
    }

    @Override // defpackage.ob8
    public final void e(ed8 ed8Var) {
        int i = this.c;
        ob8 ob8Var = this.b;
        switch (i) {
            case 0:
                ob8Var.d(new cc8(ed8Var));
                break;
            default:
                try {
                    ArrayList arrayList = new ArrayList();
                    fd8 fd8Var = new fd8(ed8Var);
                    fd8Var.b = arrayList;
                    ob8Var.d(fd8Var);
                    break;
                } catch (Throwable th) {
                    td4.w0(th);
                    xm5.b(th, ed8Var);
                    return;
                }
        }
    }
}
