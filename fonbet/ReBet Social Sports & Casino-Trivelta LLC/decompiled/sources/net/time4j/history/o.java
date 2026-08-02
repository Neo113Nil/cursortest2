package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final o f58233d = new o(n.f58224a, Integer.MAX_VALUE);

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator f58234e = new b();

    /* renamed from: a, reason: collision with root package name */
    public final List f58235a;

    /* renamed from: b, reason: collision with root package name */
    public final n f58236b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58237c;

    public static class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(o oVar, o oVar2) {
            if (oVar.f58237c < oVar2.f58237c) {
                return -1;
            }
            return oVar.f58237c > oVar2.f58237c ? 1 : 0;
        }
    }

    public o(n nVar, int i10) {
        this.f58235a = Collections.EMPTY_LIST;
        this.f58236b = nVar;
        this.f58237c = i10;
    }

    public static o e(DataInput dataInput) {
        int readInt = dataInput.readInt();
        if (readInt == 0) {
            n valueOf = n.valueOf(dataInput.readUTF());
            int readInt2 = dataInput.readInt();
            return (readInt2 == Integer.MAX_VALUE && valueOf == n.f58224a) ? f58233d : new o(valueOf, readInt2);
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new o(n.valueOf(dataInput.readUTF()), dataInput.readInt()));
        }
        return new o(arrayList);
    }

    public o b(o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f58235a);
        if (arrayList.isEmpty()) {
            arrayList.add(this);
        }
        if (oVar.f58235a.isEmpty()) {
            arrayList.add(oVar);
        } else {
            arrayList.addAll(oVar.f58235a);
        }
        return new o(arrayList);
    }

    public int c(h hVar) {
        int a10 = hVar.c().a(hVar.e());
        int size = this.f58235a.size();
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) this.f58235a.get(i11);
            if (a10 >= i10 && a10 < oVar.f58237c) {
                return oVar.f58236b.a(this, hVar);
            }
            i10 = oVar.f58237c;
        }
        return this.f58236b.a(this, hVar);
    }

    public h d(j jVar, int i10) {
        return f(jVar, i10).b(jVar, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f58235a.equals(oVar.f58235a) && this.f58236b == oVar.f58236b && this.f58237c == oVar.f58237c) {
                return true;
            }
        }
        return false;
    }

    public n f(j jVar, int i10) {
        int a10 = jVar.a(i10);
        int size = this.f58235a.size();
        int i11 = Integer.MIN_VALUE;
        n nVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            o oVar = (o) this.f58235a.get(i12);
            if (a10 >= i11 && a10 < oVar.f58237c) {
                return oVar.f58236b;
            }
            i11 = oVar.f58237c;
            nVar = oVar.f58236b;
        }
        return (a10 == i11 && jVar == j.BYZANTINE && nVar == n.f58226c) ? nVar : this.f58236b;
    }

    public void g(DataOutput dataOutput) {
        int size = this.f58235a.size();
        dataOutput.writeInt(size);
        if (size == 0) {
            dataOutput.writeUTF(this.f58236b.name());
            dataOutput.writeInt(this.f58237c);
            return;
        }
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) this.f58235a.get(i10);
            dataOutput.writeUTF(oVar.f58236b.name());
            dataOutput.writeInt(oVar.f58237c);
        }
    }

    public int hashCode() {
        return (this.f58235a.hashCode() * 17) + (this.f58236b.hashCode() * 37) + this.f58237c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f58235a.isEmpty()) {
            sb2.append('[');
            sb2.append(this.f58236b);
            if (this.f58237c != Integer.MAX_VALUE) {
                sb2.append("->");
                sb2.append(this.f58237c);
            }
        } else {
            boolean z10 = true;
            for (o oVar : this.f58235a) {
                if (z10) {
                    sb2.append('[');
                    z10 = false;
                } else {
                    sb2.append(',');
                }
                sb2.append(oVar.f58236b);
                sb2.append("->");
                sb2.append(oVar.f58237c);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    public o(List list) {
        Collections.sort(list, f58234e);
        Iterator it = list.iterator();
        o oVar = null;
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            if (oVar == null || oVar2.f58237c != oVar.f58237c) {
                oVar = oVar2;
            } else if (oVar2.f58236b == oVar.f58236b) {
                it.remove();
            } else {
                throw new IllegalArgumentException("Multiple strategies with overlapping validity range: " + list);
            }
        }
        this.f58235a = Collections.unmodifiableList(list);
        this.f58236b = n.f58224a;
        this.f58237c = Integer.MAX_VALUE;
    }
}
