package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j00 implements View.OnDragListener, f85 {
    public final g85 a = new g85(null, 3);
    public final gh0 b = new gh0(0);
    public final i00 c = new i00(this);

    public j00(py pyVar) {
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        a85 a85Var = new a85(dragEvent);
        int action = dragEvent.getAction();
        gh0 gh0Var = this.b;
        g85 g85Var = this.a;
        switch (action) {
            case 1:
                asf asfVar = new asf();
                x40 x40Var = new x40(2, a85Var, g85Var, asfVar);
                if (x40Var.invoke(g85Var) == iyj.a) {
                    jca.a0(g85Var, x40Var);
                }
                boolean z = asfVar.a;
                zg0 zg0Var = new zg0(gh0Var);
                while (zg0Var.hasNext()) {
                    ((h85) zg0Var.next()).a0(a85Var);
                }
                break;
            case 2:
                g85Var.N0(a85Var);
                break;
            case 4:
                g85Var.G(a85Var);
                gh0Var.clear();
                break;
            case 5:
                g85Var.w(a85Var);
                break;
            case 6:
                g85Var.I0(a85Var);
                break;
        }
        return false;
    }
}
