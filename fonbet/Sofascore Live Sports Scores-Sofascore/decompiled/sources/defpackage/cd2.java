package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cd2 extends dd2 {
    public ArrayList e;

    public cd2(char[] cArr) {
        super(cArr);
        this.e = new ArrayList();
    }

    public final boolean A(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            dd2 dd2Var = (dd2) it.next();
            if ((dd2Var instanceof ed2) && ((ed2) dd2Var).e().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList B() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            dd2 dd2Var = (dd2) it.next();
            if (dd2Var instanceof ed2) {
                arrayList.add(((ed2) dd2Var).e());
            }
        }
        return arrayList;
    }

    public final void C(String str, dd2 dd2Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ed2 ed2Var = (ed2) ((dd2) it.next());
            if (ed2Var.e().equals(str)) {
                int size = ed2Var.e.size();
                ArrayList arrayList = ed2Var.e;
                if (size > 0) {
                    arrayList.set(0, dd2Var);
                    return;
                } else {
                    arrayList.add(dd2Var);
                    return;
                }
            }
        }
        ed2 ed2Var2 = new ed2(str.toCharArray());
        ed2Var2.b = 0L;
        ed2Var2.p(str.length() - 1);
        int size2 = ed2Var2.e.size();
        ArrayList arrayList2 = ed2Var2.e;
        if (size2 > 0) {
            arrayList2.set(0, dd2Var);
        } else {
            arrayList2.add(dd2Var);
        }
        this.e.add(ed2Var2);
    }

    public final void D(String str) {
        kd2 kd2Var = new kd2(str.toCharArray());
        kd2Var.b = 0L;
        kd2Var.p(str.length() - 1);
        C("type", kd2Var);
    }

    @Override // defpackage.dd2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cd2) {
            return this.e.equals(((cd2) obj).e);
        }
        return false;
    }

    public final float getFloat(int i) {
        dd2 s = s(i);
        if (s != null) {
            return s.m();
        }
        throw new id2(ljg.j(i, "no float at index "), this);
    }

    public final int getInt(int i) {
        dd2 s = s(i);
        if (s != null) {
            return s.n();
        }
        throw new id2(ljg.j(i, "no int at index "), this);
    }

    @Override // defpackage.dd2
    public int hashCode() {
        return Objects.hash(this.e, Integer.valueOf(super.hashCode()));
    }

    public final void q(dd2 dd2Var) {
        this.e.add(dd2Var);
    }

    @Override // defpackage.dd2
    /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cd2 clone() {
        cd2 cd2Var = (cd2) super.clone();
        ArrayList arrayList = new ArrayList(this.e.size());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            dd2 clone = ((dd2) it.next()).clone();
            clone.d = cd2Var;
            arrayList.add(clone);
        }
        cd2Var.e = arrayList;
        return cd2Var;
    }

    public final dd2 s(int i) {
        if (i < 0 || i >= this.e.size()) {
            throw new id2(ljg.j(i, "no element at index "), this);
        }
        return (dd2) this.e.get(i);
    }

    public final dd2 t(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ed2 ed2Var = (ed2) ((dd2) it.next());
            if (ed2Var.e().equals(str)) {
                if (ed2Var.e.size() > 0) {
                    return (dd2) ed2Var.e.get(0);
                }
                return null;
            }
        }
        throw new id2(lnb.o("no element for key <", str, ">"), this);
    }

    @Override // defpackage.dd2
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            dd2 dd2Var = (dd2) it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(dd2Var);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public final float u(String str) {
        dd2 t = t(str);
        if (t != null) {
            return t.m();
        }
        StringBuilder q = wt3.q("no float found for key <", str, ">, found [");
        q.append(t.o());
        q.append("] : ");
        q.append(t);
        throw new id2(q.toString(), this);
    }

    public final dd2 v(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return (dd2) this.e.get(i);
    }

    public final dd2 w(String str) {
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ed2 ed2Var = (ed2) ((dd2) it.next());
            if (ed2Var.e().equals(str)) {
                if (ed2Var.e.size() > 0) {
                    return (dd2) ed2Var.e.get(0);
                }
            }
        }
        return null;
    }

    public final String x(int i) {
        dd2 s = s(i);
        if (s instanceof kd2) {
            return s.e();
        }
        throw new id2(ljg.j(i, "no string at index "), this);
    }

    public final String y(String str) {
        dd2 t = t(str);
        if (t instanceof kd2) {
            return t.e();
        }
        StringBuilder s = mz1.s("no string found for key <", str, ">, found [", t != null ? t.o() : null, "] : ");
        s.append(t);
        throw new id2(s.toString(), this);
    }

    public final String z(String str) {
        dd2 w = w(str);
        if (w instanceof kd2) {
            return w.e();
        }
        return null;
    }
}
