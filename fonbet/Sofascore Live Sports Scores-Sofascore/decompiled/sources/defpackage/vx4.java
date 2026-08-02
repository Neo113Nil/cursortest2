package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class vx4 implements rx4 {
    public final v7l d;
    public int f;
    public int g;
    public v7l a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public b35 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public vx4(v7l v7lVar) {
        this.d = v7lVar;
    }

    @Override // defpackage.rx4
    public final void a(rx4 rx4Var) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((vx4) it.next()).j) {
                return;
            }
        }
        this.c = true;
        v7l v7lVar = this.a;
        if (v7lVar != null) {
            v7lVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        vx4 vx4Var = null;
        int i = 0;
        while (it2.hasNext()) {
            vx4 vx4Var2 = (vx4) it2.next();
            if (!(vx4Var2 instanceof b35)) {
                i++;
                vx4Var = vx4Var2;
            }
        }
        if (vx4Var != null && i == 1 && vx4Var.j) {
            b35 b35Var = this.i;
            if (b35Var != null) {
                if (!b35Var.j) {
                    return;
                } else {
                    this.f = this.h * b35Var.g;
                }
            }
            d(vx4Var.g + this.f);
        }
        v7l v7lVar2 = this.a;
        if (v7lVar2 != null) {
            v7lVar2.a(this);
        }
    }

    public final void b(v7l v7lVar) {
        this.k.add(v7lVar);
        if (this.j) {
            v7lVar.a(v7lVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            rx4 rx4Var = (rx4) it.next();
            rx4Var.a(rx4Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.i0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
