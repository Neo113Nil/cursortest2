package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ef0 {
    public ArrayList a;

    public ef0(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList(20);
                break;
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
            default:
                this.a = new ArrayList();
                break;
            case 4:
                this.a = new ArrayList(32);
                break;
        }
    }

    public void a(vm8 vm8Var) {
        ArrayList arrayList = this.a;
        if (vm8Var instanceof fed) {
            arrayList.add(vm8Var);
        } else {
            if (!(vm8Var instanceof oh3)) {
                zzl.b();
                return;
            }
            Iterator it = ((oh3) vm8Var).a.iterator();
            while (it.hasNext()) {
                arrayList.add((fed) it.next());
            }
        }
    }

    public void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        vha.x(str);
        vha.y(str2, str);
        vha.h(this, str, str2);
    }

    public void c(String str) {
        int O = StringsKt.O(str, ':', 1, 4);
        if (O != -1) {
            vha.h(this, str.substring(0, O), str.substring(O + 1));
        } else if (str.charAt(0) == ':') {
            vha.h(this, "", str.substring(1));
        } else {
            vha.h(this, "", str);
        }
    }

    public void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        vha.x(str);
        vha.h(this, str, str2);
    }

    public ibc e() {
        if (this.a == null) {
            return ibc.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new ibc(bundle, this.a);
    }

    public void f() {
        this.a.add(ebe.c);
    }

    public void g(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new nbe(f, f2, f3, f4, f5, f6));
    }

    public String h(String str) {
        str.getClass();
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 2;
        int v = vha.v(size, 0, -2);
        if (v > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == v) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public void i(float f) {
        this.a.add(new obe(f));
    }

    public void j(float f, float f2) {
        this.a.add(new hbe(f, f2));
    }

    public void k(float f, float f2) {
        this.a.add(new pbe(f, f2));
    }

    public void l(float f, float f2) {
        this.a.add(new ibe(f, f2));
    }

    public void m(String str) {
        str.getClass();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void n(float f) {
        this.a.add(new ube(f));
    }
}
