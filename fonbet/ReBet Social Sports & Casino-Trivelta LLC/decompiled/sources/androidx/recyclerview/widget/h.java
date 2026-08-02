package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f23069a = new a();

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f23071a - dVar2.f23071a;
        }
    }

    public static abstract class b {
        public abstract boolean areContentsTheSame(int i10, int i11);

        public abstract boolean areItemsTheSame(int i10, int i11);

        public Object getChangePayload(int i10, int i11) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f23070a;
        private final int[] mData;

        public c(int i10) {
            int[] iArr = new int[i10];
            this.mData = iArr;
            this.f23070a = iArr.length / 2;
        }

        public int[] a() {
            return this.mData;
        }

        public int b(int i10) {
            return this.mData[i10 + this.f23070a];
        }

        public void c(int i10, int i11) {
            this.mData[i10 + this.f23070a] = i11;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f23071a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23072b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23073c;

        public d(int i10, int i11, int i12) {
            this.f23071a = i10;
            this.f23072b = i11;
            this.f23073c = i12;
        }

        public int a() {
            return this.f23071a + this.f23073c;
        }

        public int b() {
            return this.f23072b + this.f23073c;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final List f23074a;

        /* renamed from: b, reason: collision with root package name */
        public final b f23075b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23076c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23077d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f23078e;
        private final int[] mNewItemStatuses;
        private final int[] mOldItemStatuses;

        public e(b bVar, List list, int[] iArr, int[] iArr2, boolean z10) {
            this.f23074a = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f23075b = bVar;
            this.f23076c = bVar.getOldListSize();
            this.f23077d = bVar.getNewListSize();
            this.f23078e = z10;
            a();
            e();
        }

        public static g g(Collection collection, int i10, boolean z10) {
            g gVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (g) it.next();
                if (gVar.f23079a == i10 && gVar.f23081c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                if (z10) {
                    gVar2.f23080b--;
                } else {
                    gVar2.f23080b++;
                }
            }
            return gVar;
        }

        public final void a() {
            d dVar = this.f23074a.isEmpty() ? null : (d) this.f23074a.get(0);
            if (dVar == null || dVar.f23071a != 0 || dVar.f23072b != 0) {
                this.f23074a.add(0, new d(0, 0, 0));
            }
            this.f23074a.add(new d(this.f23076c, this.f23077d, 0));
        }

        public void b(q qVar) {
            int i10;
            androidx.recyclerview.widget.e eVar = qVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) qVar : new androidx.recyclerview.widget.e(qVar);
            int i11 = this.f23076c;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f23076c;
            int i13 = this.f23077d;
            for (int size = this.f23074a.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f23074a.get(size);
                int a10 = dVar.a();
                int b10 = dVar.b();
                while (true) {
                    if (i12 <= a10) {
                        break;
                    }
                    i12--;
                    int i14 = this.mOldItemStatuses[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g g10 = g(arrayDeque, i15, false);
                        if (g10 != null) {
                            int i16 = (i11 - g10.f23080b) - 1;
                            eVar.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                eVar.c(i16, 1, this.f23075b.getChangePayload(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        eVar.b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > b10) {
                    i13--;
                    int i17 = this.mNewItemStatuses[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g g11 = g(arrayDeque, i18, true);
                        if (g11 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            eVar.d((i11 - g11.f23080b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                eVar.c(i12, 1, this.f23075b.getChangePayload(i18, i13));
                            }
                        }
                    } else {
                        eVar.a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f23071a;
                int i20 = dVar.f23072b;
                for (i10 = 0; i10 < dVar.f23073c; i10++) {
                    if ((this.mOldItemStatuses[i19] & 15) == 2) {
                        eVar.c(i19, 1, this.f23075b.getChangePayload(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f23071a;
                i13 = dVar.f23072b;
            }
            eVar.e();
        }

        public void c(RecyclerView.h hVar) {
            b(new androidx.recyclerview.widget.b(hVar));
        }

        public final void d(int i10) {
            int size = this.f23074a.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = (d) this.f23074a.get(i12);
                while (i11 < dVar.f23072b) {
                    if (this.mNewItemStatuses[i11] == 0 && this.f23075b.areItemsTheSame(i10, i11)) {
                        int i13 = this.f23075b.areContentsTheSame(i10, i11) ? 8 : 4;
                        this.mOldItemStatuses[i10] = (i11 << 4) | i13;
                        this.mNewItemStatuses[i11] = (i10 << 4) | i13;
                        return;
                    }
                    i11++;
                }
                i11 = dVar.b();
            }
        }

        public final void e() {
            for (d dVar : this.f23074a) {
                for (int i10 = 0; i10 < dVar.f23073c; i10++) {
                    int i11 = dVar.f23071a + i10;
                    int i12 = dVar.f23072b + i10;
                    int i13 = this.f23075b.areContentsTheSame(i11, i12) ? 1 : 2;
                    this.mOldItemStatuses[i11] = (i12 << 4) | i13;
                    this.mNewItemStatuses[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f23078e) {
                f();
            }
        }

        public final void f() {
            int i10 = 0;
            for (d dVar : this.f23074a) {
                while (i10 < dVar.f23071a) {
                    if (this.mOldItemStatuses[i10] == 0) {
                        d(i10);
                    }
                    i10++;
                }
                i10 = dVar.a();
            }
        }
    }

    public static abstract class f {
        public abstract boolean a(Object obj, Object obj2);

        public abstract boolean b(Object obj, Object obj2);

        public Object c(Object obj, Object obj2) {
            return null;
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public int f23079a;

        /* renamed from: b, reason: collision with root package name */
        public int f23080b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f23081c;

        public g(int i10, int i11, boolean z10) {
            this.f23079a = i10;
            this.f23080b = i11;
            this.f23081c = z10;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    public static class C0399h {

        /* renamed from: a, reason: collision with root package name */
        public int f23082a;

        /* renamed from: b, reason: collision with root package name */
        public int f23083b;

        /* renamed from: c, reason: collision with root package name */
        public int f23084c;

        /* renamed from: d, reason: collision with root package name */
        public int f23085d;

        public C0399h() {
        }

        public int a() {
            return this.f23085d - this.f23084c;
        }

        public int b() {
            return this.f23083b - this.f23082a;
        }

        public C0399h(int i10, int i11, int i12, int i13) {
            this.f23082a = i10;
            this.f23083b = i11;
            this.f23084c = i12;
            this.f23085d = i13;
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f23086a;

        /* renamed from: b, reason: collision with root package name */
        public int f23087b;

        /* renamed from: c, reason: collision with root package name */
        public int f23088c;

        /* renamed from: d, reason: collision with root package name */
        public int f23089d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f23090e;

        public int a() {
            return Math.min(this.f23088c - this.f23086a, this.f23089d - this.f23087b);
        }

        public boolean b() {
            return this.f23089d - this.f23087b != this.f23088c - this.f23086a;
        }

        public boolean c() {
            return this.f23089d - this.f23087b > this.f23088c - this.f23086a;
        }

        public d d() {
            if (b()) {
                return this.f23090e ? new d(this.f23086a, this.f23087b, a()) : c() ? new d(this.f23086a, this.f23087b + 1, a()) : new d(this.f23086a + 1, this.f23087b, a());
            }
            int i10 = this.f23086a;
            return new d(i10, this.f23087b, this.f23088c - i10);
        }
    }

    public static i a(C0399h c0399h, b bVar, c cVar, c cVar2, int i10) {
        int b10;
        int i11;
        int i12;
        boolean z10 = (c0399h.b() - c0399h.a()) % 2 == 0;
        int b11 = c0399h.b() - c0399h.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.b(i14 + 1) < cVar2.b(i14 - 1))) {
                b10 = cVar2.b(i14 + 1);
                i11 = b10;
            } else {
                b10 = cVar2.b(i14 - 1);
                i11 = b10 - 1;
            }
            int i15 = c0399h.f23085d - ((c0399h.f23083b - i11) - i14);
            int i16 = (i10 == 0 || i11 != b10) ? i15 : i15 + 1;
            while (i11 > c0399h.f23082a && i15 > c0399h.f23084c && bVar.areItemsTheSame(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.c(i14, i11);
            if (z10 && (i12 = b11 - i14) >= i13 && i12 <= i10 && cVar.b(i12) >= i11) {
                i iVar = new i();
                iVar.f23086a = i11;
                iVar.f23087b = i15;
                iVar.f23088c = b10;
                iVar.f23089d = i16;
                iVar.f23090e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z10) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0399h(0, oldListSize, 0, newListSize));
        int i10 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0399h c0399h = (C0399h) arrayList2.remove(arrayList2.size() - 1);
            i e10 = e(c0399h, bVar, cVar, cVar2);
            if (e10 != null) {
                if (e10.a() > 0) {
                    arrayList.add(e10.d());
                }
                C0399h c0399h2 = arrayList3.isEmpty() ? new C0399h() : (C0399h) arrayList3.remove(arrayList3.size() - 1);
                c0399h2.f23082a = c0399h.f23082a;
                c0399h2.f23084c = c0399h.f23084c;
                c0399h2.f23083b = e10.f23086a;
                c0399h2.f23085d = e10.f23087b;
                arrayList2.add(c0399h2);
                c0399h.f23083b = c0399h.f23083b;
                c0399h.f23085d = c0399h.f23085d;
                c0399h.f23082a = e10.f23088c;
                c0399h.f23084c = e10.f23089d;
                arrayList2.add(c0399h);
            } else {
                arrayList3.add(c0399h);
            }
        }
        Collections.sort(arrayList, f23069a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    public static i d(C0399h c0399h, b bVar, c cVar, c cVar2, int i10) {
        int b10;
        int i11;
        int i12;
        boolean z10 = Math.abs(c0399h.b() - c0399h.a()) % 2 == 1;
        int b11 = c0399h.b() - c0399h.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.b(i14 + 1) > cVar.b(i14 - 1))) {
                b10 = cVar.b(i14 + 1);
                i11 = b10;
            } else {
                b10 = cVar.b(i14 - 1);
                i11 = b10 + 1;
            }
            int i15 = (c0399h.f23084c + (i11 - c0399h.f23082a)) - i14;
            int i16 = (i10 == 0 || i11 != b10) ? i15 : i15 - 1;
            while (i11 < c0399h.f23083b && i15 < c0399h.f23085d && bVar.areItemsTheSame(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.c(i14, i11);
            if (z10 && (i12 = b11 - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.b(i12) <= i11) {
                i iVar = new i();
                iVar.f23086a = b10;
                iVar.f23087b = i16;
                iVar.f23088c = i11;
                iVar.f23089d = i15;
                iVar.f23090e = false;
                return iVar;
            }
        }
        return null;
    }

    public static i e(C0399h c0399h, b bVar, c cVar, c cVar2) {
        if (c0399h.b() >= 1 && c0399h.a() >= 1) {
            int b10 = ((c0399h.b() + c0399h.a()) + 1) / 2;
            cVar.c(1, c0399h.f23082a);
            cVar2.c(1, c0399h.f23083b);
            for (int i10 = 0; i10 < b10; i10++) {
                i d10 = d(c0399h, bVar, cVar, cVar2, i10);
                if (d10 != null) {
                    return d10;
                }
                i a10 = a(c0399h, bVar, cVar, cVar2, i10);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return null;
    }
}
