package defpackage;

import com.google.android.gms.internal.ads.zzifa;
import com.google.android.gms.internal.play_billing.zzgg;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class yg0 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yg0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((tlh) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((ulh) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((ncn) obj2).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((bdn) obj2).e((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            case 5:
                Map.Entry entry5 = (Map.Entry) obj;
                if (contains(entry5)) {
                    return false;
                }
                ((rdn) obj2).d((Comparable) entry5.getKey(), entry5.getValue());
                return true;
            case 6:
                Map.Entry entry6 = (Map.Entry) obj;
                if (contains(entry6)) {
                    return false;
                }
                ((i7o) obj2).d((Comparable) entry6.getKey(), entry6.getValue());
                return true;
            case 7:
            case 11:
            case 13:
            default:
                return super.add(obj);
            case 8:
                Map.Entry entry7 = (Map.Entry) obj;
                if (contains(entry7)) {
                    return false;
                }
                ((deo) obj2).put((Comparable) entry7.getKey(), entry7.getValue());
                return true;
            case 9:
                Map.Entry entry8 = (Map.Entry) obj;
                if (contains(entry8)) {
                    return false;
                }
                ((apo) obj2).c((zzgg) entry8.getKey(), entry8.getValue());
                return true;
            case 10:
                Map.Entry entry9 = (Map.Entry) obj;
                if (contains(entry9)) {
                    return false;
                }
                ((oqo) obj2).d((zzifa) entry9.getKey(), entry9.getValue());
                return true;
            case 12:
                Map.Entry entry10 = (Map.Entry) obj;
                if (contains(entry10)) {
                    return false;
                }
                ((k5p) obj2).put((Comparable) entry10.getKey(), entry10.getValue());
                return true;
            case 14:
                Map.Entry entry11 = (Map.Entry) obj;
                if (contains(entry11)) {
                    return false;
                }
                ((ggp) obj2).d((Comparable) entry11.getKey(), entry11.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ((tlh) obj).clear();
                break;
            case 2:
                ((ulh) obj).clear();
                break;
            case 3:
                ((ncn) obj).clear();
                break;
            case 4:
                ((bdn) obj).clear();
                break;
            case 5:
                ((rdn) obj).clear();
                break;
            case 6:
                ((i7o) obj).clear();
                break;
            case 7:
            case 11:
            case 13:
            default:
                super.clear();
                break;
            case 8:
                ((deo) obj).clear();
                break;
            case 9:
                ((apo) obj).clear();
                break;
            case 10:
                ((oqo) obj).clear();
                break;
            case 12:
                ((k5p) obj).clear();
                break;
            case 14:
                ((ggp) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((tlh) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 != value) {
                    return obj3 != null && obj3.equals(value);
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((ulh) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 != value2) {
                    return obj4 != null && obj4.equals(value2);
                }
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj5 = ((ncn) obj2).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj5 != value3) {
                    return obj5 != null && obj5.equals(value3);
                }
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj6 = ((bdn) obj2).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj6 != value4) {
                    return obj6 != null && obj6.equals(value4);
                }
                return true;
            case 5:
                Map.Entry entry5 = (Map.Entry) obj;
                Object obj7 = ((rdn) obj2).get(entry5.getKey());
                Object value5 = entry5.getValue();
                if (obj7 != value5) {
                    return obj7 != null && obj7.equals(value5);
                }
                return true;
            case 6:
                Map.Entry entry6 = (Map.Entry) obj;
                Object obj8 = ((i7o) obj2).get(entry6.getKey());
                Object value6 = entry6.getValue();
                if (obj8 != value6) {
                    return obj8 != null && obj8.equals(value6);
                }
                return true;
            case 7:
                s6n s6nVar = (s6n) obj2;
                return Arrays.binarySearch(s6nVar.b, 0, s6nVar.c[0], obj, s6n.h) >= 0;
            case 8:
                Map.Entry entry7 = (Map.Entry) obj;
                Object obj9 = ((deo) obj2).get(entry7.getKey());
                Object value7 = entry7.getValue();
                if (obj9 != value7) {
                    return obj9 != null && obj9.equals(value7);
                }
                return true;
            case 9:
                Map.Entry entry8 = (Map.Entry) obj;
                Object obj10 = ((apo) obj2).get(entry8.getKey());
                Object value8 = entry8.getValue();
                if (obj10 != value8) {
                    return obj10 != null && obj10.equals(value8);
                }
                return true;
            case 10:
                Map.Entry entry9 = (Map.Entry) obj;
                Object obj11 = ((oqo) obj2).get(entry9.getKey());
                Object value9 = entry9.getValue();
                if (obj11 != value9) {
                    return obj11 != null && obj11.equals(value9);
                }
                return true;
            case 11:
                s6n s6nVar2 = (s6n) obj2;
                return Arrays.binarySearch(s6nVar2.b, 0, s6nVar2.c[0], obj, s6n.i) >= 0;
            case 12:
                Map.Entry entry10 = (Map.Entry) obj;
                Object obj12 = ((k5p) obj2).get(entry10.getKey());
                Object value10 = entry10.getValue();
                if (obj12 != value10) {
                    return obj12 != null && obj12.equals(value10);
                }
                return true;
            case 13:
            default:
                return super.contains(obj);
            case 14:
                Map.Entry entry11 = (Map.Entry) obj;
                Object obj13 = ((ggp) obj2).get(entry11.getKey());
                Object value11 = entry11.getValue();
                if (obj13 != value11) {
                    return obj13 != null && obj13.equals(value11);
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.a;
        int i2 = 1;
        int i3 = 3;
        int i4 = 4;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bh0((dh0) obj);
            case 1:
                return new bmh((tlh) obj, 0);
            case 2:
                return new bmh((ulh) obj, i2);
            case 3:
                return new bmh((ncn) obj, 2);
            case 4:
                return new bmh((bdn) obj, i3);
            case 5:
                return new bmh((rdn) obj, i4);
            case 6:
                return new bmh((i7o) obj, 5);
            case 7:
                return new m6n(this, i2);
            case 8:
                return new bmh((deo) obj, 6);
            case 9:
                return new bmh((apo) obj, 7);
            case 10:
                return new bmh((oqo) obj, 8);
            case 11:
                return new m6n(this, i3);
            case 12:
                return new bmh((k5p) obj, 9);
            case 13:
                return new m6n(this, i4);
            default:
                return new bmh((ggp) obj, 10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((tlh) obj2).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((ulh) obj2).remove(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((ncn) obj2).remove(entry3.getKey());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((bdn) obj2).remove(entry4.getKey());
                return true;
            case 5:
                Map.Entry entry5 = (Map.Entry) obj;
                if (!contains(entry5)) {
                    return false;
                }
                ((rdn) obj2).remove(entry5.getKey());
                return true;
            case 6:
                Map.Entry entry6 = (Map.Entry) obj;
                if (!contains(entry6)) {
                    return false;
                }
                ((i7o) obj2).remove(entry6.getKey());
                return true;
            case 7:
            case 11:
            case 13:
            default:
                return super.remove(obj);
            case 8:
                Map.Entry entry7 = (Map.Entry) obj;
                if (!contains(entry7)) {
                    return false;
                }
                ((deo) obj2).remove(entry7.getKey());
                return true;
            case 9:
                Map.Entry entry8 = (Map.Entry) obj;
                if (!contains(entry8)) {
                    return false;
                }
                ((apo) obj2).remove(entry8.getKey());
                return true;
            case 10:
                Map.Entry entry9 = (Map.Entry) obj;
                if (!contains(entry9)) {
                    return false;
                }
                ((oqo) obj2).remove(entry9.getKey());
                return true;
            case 12:
                Map.Entry entry10 = (Map.Entry) obj;
                if (!contains(entry10)) {
                    return false;
                }
                ((k5p) obj2).remove(entry10.getKey());
                return true;
            case 14:
                Map.Entry entry11 = (Map.Entry) obj;
                if (!contains(entry11)) {
                    return false;
                }
                ((ggp) obj2).remove(entry11.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((dh0) obj).c;
            case 1:
                return ((tlh) obj).size();
            case 2:
                return ((ulh) obj).size();
            case 3:
                return ((ncn) obj).size();
            case 4:
                return ((bdn) obj).size();
            case 5:
                return ((rdn) obj).size();
            case 6:
                return ((i7o) obj).size();
            case 7:
                return ((s6n) obj).c[0];
            case 8:
                return ((deo) obj).size();
            case 9:
                return ((apo) obj).size();
            case 10:
                return ((oqo) obj).size();
            case 11:
                return ((s6n) obj).c[0];
            case 12:
                return ((k5p) obj).size();
            case 13:
                return ((mgp) obj).e;
            default:
                return ((ggp) obj).size();
        }
    }
}
