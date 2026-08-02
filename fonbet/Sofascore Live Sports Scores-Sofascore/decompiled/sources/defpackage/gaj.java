package defpackage;

import android.content.ClipData;
import android.view.DragEvent;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gaj implements h85 {
    public final /* synthetic */ x9j a;
    public final /* synthetic */ q8i b;
    public final /* synthetic */ x9j c;
    public final /* synthetic */ x9j d;
    public final /* synthetic */ x9j e;
    public final /* synthetic */ x9j f;

    public gaj(x9j x9jVar, q8i q8iVar, x9j x9jVar2, x9j x9jVar3, x9j x9jVar4, x9j x9jVar5) {
        this.a = x9jVar;
        this.b = q8iVar;
        this.c = x9jVar2;
        this.d = x9jVar3;
        this.e = x9jVar4;
        this.f = x9jVar5;
    }

    @Override // defpackage.h85
    public final void G(a85 a85Var) {
        this.f.invoke(a85Var);
    }

    @Override // defpackage.h85
    public final void I0(a85 a85Var) {
        this.e.invoke(a85Var);
    }

    @Override // defpackage.h85
    public final void N0(a85 a85Var) {
        DragEvent dragEvent = a85Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        long floatToRawIntBits = (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
        caj cajVar = this.d.b;
        dma b = cajVar.r.b();
        if (b != null && b.f()) {
            floatToRawIntBits = b.g(floatToRawIntBits);
        }
        int d = cajVar.r.d(floatToRawIntBits, true);
        if (d >= 0) {
            cajVar.q.j(t6a.g(d, d));
        }
        cajVar.s.A(k69.a, floatToRawIntBits);
        Unit unit = Unit.a;
    }

    @Override // defpackage.h85
    public final boolean i0(a85 a85Var) {
        String str;
        this.a.invoke(a85Var);
        DragEvent dragEvent = a85Var.a;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        caj cajVar = (caj) this.b.b;
        cajVar.p1();
        cajVar.s.b();
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData.getItemAt(i).getText() != null;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < itemCount2; i2++) {
                CharSequence text = clipData.getItemAt(i2).getText();
                if (text != null) {
                    if (z2) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z2 = true;
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        upf.a(cajVar);
        if (str != null) {
            jwj.h(cajVar.q, str, false, 14);
        }
        return true;
    }

    @Override // defpackage.h85
    public final void w(a85 a85Var) {
        this.c.invoke(a85Var);
    }

    @Override // defpackage.h85
    public final void a0(a85 a85Var) {
    }
}
