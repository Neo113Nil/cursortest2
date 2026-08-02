package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sxb extends u4 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public sxb(List list) {
        list.getClass();
        this.b = list;
    }

    @Override // defpackage.v2, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                String group = ((txb) obj).a.group(i);
                return group == null ? "" : group;
            default:
                return ((List) obj).get(p13.G(i, this));
        }
    }

    @Override // defpackage.v2
    public final int getSize() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((txb) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.u4, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.u4, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new k4g(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.u4, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.u4, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new k4g(this, 0);
            default:
                return super.listIterator();
        }
    }

    public sxb(txb txbVar) {
        this.b = txbVar;
    }

    @Override // defpackage.u4, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new k4g(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
