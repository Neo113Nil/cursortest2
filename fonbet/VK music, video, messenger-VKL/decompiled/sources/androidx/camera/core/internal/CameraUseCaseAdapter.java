package androidx.camera.core.internal;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.d;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import xsna.a020;
import xsna.gjn0;
import xsna.go9;
import xsna.hf9;
import xsna.lf9;
import xsna.lhg;
import xsna.n52;
import xsna.n6m;
import xsna.obr;
import xsna.r0h0;
import xsna.re9;
import xsna.s100;
import xsna.sse0;
import xsna.su3;
import xsna.tg9;
import xsna.th9;
import xsna.ui9;
import xsna.vfq0;
import xsna.x170;
import xsna.xo9;

/* loaded from: classes11.dex */
public final class CameraUseCaseAdapter implements lf9 {

    @NonNull
    public final CameraInternal b;
    public final th9 c;
    public final UseCaseConfigFactory d;
    public final a e;
    public final ArrayList f = new ArrayList();

    @NonNull
    public final d.a g = d.a;
    public final Object h = new Object();
    public boolean i = true;
    public Config j = null;

    public static final class CameraException extends Exception {
    }

    public static final class a {
        public final ArrayList a = new ArrayList();

        public a(LinkedHashSet<CameraInternal> linkedHashSet) {
            Iterator<CameraInternal> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.a.add(it.next().c().a);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode() * 53;
        }
    }

    public static class b {
        public u<?> a;
        public u<?> b;

        public b() {
            throw null;
        }
    }

    public CameraUseCaseAdapter(@NonNull LinkedHashSet<CameraInternal> linkedHashSet, @NonNull th9 th9Var, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        this.b = linkedHashSet.iterator().next();
        this.e = new a(new LinkedHashSet(linkedHashSet));
        this.c = th9Var;
        this.d = useCaseConfigFactory;
    }

    public final void a(@NonNull Collection<vfq0> collection) throws CameraException {
        synchronized (this.h) {
            try {
                ArrayList arrayList = new ArrayList();
                for (vfq0 vfq0Var : collection) {
                    if (!this.f.contains(vfq0Var)) {
                        arrayList.add(vfq0Var);
                    }
                }
                d.a.C0003a c0003a = this.g.s;
                UseCaseConfigFactory useCaseConfigFactory = this.d;
                HashMap hashMap = new HashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    vfq0 vfq0Var2 = (vfq0) it.next();
                    u<?> d = vfq0Var2.d(false, c0003a);
                    u<?> d2 = vfq0Var2.d(true, useCaseConfigFactory);
                    b bVar = new b();
                    bVar.a = d;
                    bVar.b = d2;
                    hashMap.put(vfq0Var2, bVar);
                }
                try {
                    HashMap i = i(this.b.c(), arrayList, this.f, hashMap);
                    synchronized (this.h) {
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        vfq0 vfq0Var3 = (vfq0) it2.next();
                        b bVar2 = (b) hashMap.get(vfq0Var3);
                        vfq0Var3.k(this.b, bVar2.a, bVar2.b);
                        Size size = (Size) i.get(vfq0Var3);
                        size.getClass();
                        vfq0Var3.g = vfq0Var3.r(size);
                    }
                    this.f.addAll(arrayList);
                    if (this.i) {
                        xo9.t().execute(new n52(this.f, 3));
                        this.b.g(arrayList);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((vfq0) it3.next()).j();
                    }
                } catch (IllegalArgumentException e) {
                    throw new CameraException(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.h) {
            try {
                if (!this.i) {
                    this.b.g(this.f);
                    xo9.t().execute(new n52(this.f, 3));
                    synchronized (this.h) {
                        try {
                            if (this.j != null) {
                                this.b.h().f(this.j);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((vfq0) it.next()).j();
                    }
                    this.i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0429, code lost:
    
        if (xsna.gjn0.e(java.lang.Math.max(0, r11 - 16), r12, r14) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02e5, code lost:
    
        if (r15 != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02e7, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02e9, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02ed, code lost:
    
        if (r15 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02ef, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02f1, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0343, code lost:
    
        if (r15 != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0346, code lost:
    
        if (r15 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f4, code lost:
    
        if (xsna.gjn0.c(r6) < (r12.getHeight() * r12.getWidth())) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0455 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap i(@NonNull ui9 ui9Var, @NonNull ArrayList arrayList, @NonNull ArrayList arrayList2, @NonNull HashMap hashMap) {
        th9 th9Var;
        Size[] sizeArr;
        HashMap hashMap2;
        Rational rational;
        HashMap hashMap3;
        HashMap hashMap4;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Size size;
        HashMap hashMap5;
        HashMap hashMap6;
        boolean e;
        Rational rational2;
        ArrayList arrayList3 = new ArrayList();
        String a2 = ui9Var.a();
        HashMap hashMap7 = new HashMap();
        Iterator it4 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it4.hasNext();
            th9Var = this.c;
            if (!hasNext) {
                break;
            }
            vfq0 vfq0Var = (vfq0) it4.next();
            int inputFormat = vfq0Var.f.getInputFormat();
            Size size2 = vfq0Var.g;
            gjn0 gjn0Var = (gjn0) ((hf9) th9Var).a.get(a2);
            arrayList3.add(gjn0Var != null ? gjn0Var.g(inputFormat, size2) : null);
            hashMap7.put(vfq0Var, vfq0Var.g);
        }
        if (arrayList.isEmpty()) {
            return hashMap7;
        }
        HashMap hashMap8 = new HashMap();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            vfq0 vfq0Var2 = (vfq0) it5.next();
            b bVar = (b) hashMap.get(vfq0Var2);
            hashMap8.put(vfq0Var2.h(ui9Var, bVar.a, bVar.b), vfq0Var2);
        }
        ArrayList arrayList4 = new ArrayList(hashMap8.keySet());
        hf9 hf9Var = (hf9) th9Var;
        hf9Var.getClass();
        HashMap hashMap9 = hf9Var.a;
        obr.a("No new use cases to be bound.", !arrayList4.isEmpty());
        ArrayList arrayList5 = new ArrayList(arrayList3);
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            int inputFormat2 = ((u) it6.next()).getInputFormat();
            Size size3 = new Size(640, 480);
            gjn0 gjn0Var2 = (gjn0) hashMap9.get(a2);
            arrayList5.add(gjn0Var2 != null ? gjn0Var2.g(inputFormat2, size3) : null);
        }
        gjn0 gjn0Var3 = (gjn0) hashMap9.get(a2);
        if (gjn0Var3 == null) {
            throw new IllegalArgumentException(go9.b("No such camera id in supported combination list: ", a2));
        }
        ArrayList arrayList6 = gjn0Var3.a;
        Iterator it7 = arrayList6.iterator();
        boolean z = false;
        while (it7.hasNext() && !(z = ((s) it7.next()).c(arrayList5))) {
        }
        if (!z) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + a2 + ".  May be attempting to bind too many use cases. Existing surfaces: " + arrayList3 + " New configs: " + arrayList4);
        }
        HashMap hashMap10 = new HashMap();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it8 = arrayList4.iterator();
        while (it8.hasNext()) {
            int n = ((u) it8.next()).n();
            if (!arrayList8.contains(Integer.valueOf(n))) {
                arrayList8.add(Integer.valueOf(n));
            }
        }
        Collections.sort(arrayList8);
        Collections.reverse(arrayList8);
        Iterator it9 = arrayList8.iterator();
        while (it9.hasNext()) {
            int intValue = ((Integer) it9.next()).intValue();
            Iterator it10 = arrayList4.iterator();
            while (it10.hasNext()) {
                u uVar = (u) it10.next();
                if (intValue == uVar.n()) {
                    arrayList7.add(Integer.valueOf(arrayList4.indexOf(uVar)));
                }
            }
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it11 = arrayList7.iterator();
        while (it11.hasNext()) {
            u uVar2 = (u) arrayList4.get(((Integer) it11.next()).intValue());
            Size size4 = gjn0.n;
            int inputFormat3 = uVar2.getInputFormat();
            l lVar = (l) uVar2;
            List<Pair> r = lVar.r();
            if (r != null) {
                for (Pair pair : r) {
                    if (((Integer) pair.first).intValue() == inputFormat3) {
                        sizeArr = (Size[]) pair.second;
                        break;
                    }
                }
            }
            sizeArr = null;
            if (sizeArr != null) {
                sizeArr = gjn0Var3.a(sizeArr, inputFormat3);
                hashMap2 = hashMap8;
                Arrays.sort(sizeArr, new gjn0.b(0));
            } else {
                hashMap2 = hashMap8;
            }
            if (sizeArr == null) {
                sizeArr = gjn0Var3.b(inputFormat3);
            }
            ArrayList arrayList10 = new ArrayList();
            Size k = lVar.k();
            ArrayList arrayList11 = arrayList6;
            Size size5 = (Size) Collections.max(Arrays.asList(gjn0Var3.b(inputFormat3)), new gjn0.b());
            Size size6 = k != null ? size5 : size5;
            k = size6;
            Arrays.sort(sizeArr, new gjn0.b(0));
            Size d = gjn0Var3.d(lVar);
            int c = gjn0.c(size4);
            Size size7 = gjn0.c(k) < c ? gjn0.o : (d == null || d.getWidth() * d.getHeight() >= c) ? size4 : d;
            int length = sizeArr.length;
            Size size8 = size7;
            int i = 0;
            while (i < length) {
                int i2 = i;
                Size size9 = sizeArr[i2];
                Size[] sizeArr2 = sizeArr;
                int i3 = length;
                if (gjn0.c(size9) <= k.getHeight() * k.getWidth()) {
                    if (size9.getHeight() * size9.getWidth() >= gjn0.c(size8) && !arrayList10.contains(size9)) {
                        arrayList10.add(size9);
                    }
                }
                i = i2 + 1;
                sizeArr = sizeArr2;
                length = i3;
            }
            if (arrayList10.isEmpty()) {
                throw new IllegalArgumentException(lhg.a(inputFormat3, "Can not get supported output size under supported maximum for the format: "));
            }
            Rational rational3 = gjn0.s;
            Rational rational4 = gjn0.r;
            Rational rational5 = gjn0.u;
            Rational rational6 = gjn0.t;
            boolean z2 = gjn0Var3.g;
            tg9 tg9Var = gjn0Var3.e;
            sse0 sse0Var = n6m.a;
            char c2 = (((r0h0) sse0Var.a(r0h0.class)) == null || !(lVar instanceof p)) ? (((x170) sse0Var.a(x170.class)) == null && ((su3) a020.n(tg9Var).a(su3.class)) == null) ? (char) 3 : (char) 2 : (char) 1;
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        if (c2 == 3) {
                            Size d2 = gjn0Var3.d(lVar);
                            if (lVar.t()) {
                                int m = lVar.m();
                                if (m != 0) {
                                    if (m != 1) {
                                        s100.a("SupportedSurfaceCombination", "Undefined target aspect ratio: " + m, null);
                                    }
                                }
                            } else {
                                rational2 = d2 != null ? new Rational(d2.getWidth(), d2.getHeight()) : null;
                            }
                            rational = rational2;
                        }
                        rational = null;
                    } else {
                        HashMap hashMap11 = gjn0Var3.b;
                        Size size10 = (Size) hashMap11.get(256);
                        if (size10 == null) {
                            size10 = (Size) Collections.max(Arrays.asList(gjn0Var3.b(256)), new gjn0.b());
                            hashMap11.put(256, size10);
                        }
                        rational = new Rational(size10.getWidth(), size10.getHeight());
                    }
                }
            }
            Size s = d == null ? lVar.s() : d;
            ArrayList arrayList12 = new ArrayList();
            new HashMap();
            if (rational == null) {
                arrayList12.addAll(arrayList10);
                if (s != null) {
                    gjn0.f(arrayList12, s);
                }
                hashMap3 = hashMap10;
                hashMap4 = hashMap7;
                it = it11;
            } else {
                HashMap hashMap12 = new HashMap();
                hashMap12.put(rational4, new ArrayList());
                hashMap12.put(rational6, new ArrayList());
                Iterator it12 = arrayList10.iterator();
                while (it12.hasNext()) {
                    Size size11 = (Size) it12.next();
                    Iterator it13 = hashMap12.keySet().iterator();
                    Rational rational7 = null;
                    while (it13.hasNext()) {
                        Iterator it14 = it12;
                        Rational rational8 = (Rational) it13.next();
                        if (rational8 == null) {
                            hashMap5 = hashMap10;
                            hashMap6 = hashMap7;
                            it2 = it11;
                            it3 = it13;
                            size = size4;
                        } else {
                            it2 = it11;
                            it3 = it13;
                            size = size4;
                            if (rational8.equals(new Rational(size11.getWidth(), size11.getHeight()))) {
                                hashMap5 = hashMap10;
                                hashMap6 = hashMap7;
                            } else if (size11.getHeight() * size11.getWidth() >= size.getHeight() * size.getWidth()) {
                                int width = size11.getWidth();
                                int height = size11.getHeight();
                                hashMap6 = hashMap7;
                                hashMap5 = hashMap10;
                                Rational rational9 = new Rational(rational8.getDenominator(), rational8.getNumerator());
                                int i4 = width % 16;
                                if (i4 != 0 || height % 16 != 0) {
                                    if (i4 == 0) {
                                        e = gjn0.e(height, width, rational8);
                                    } else if (height % 16 == 0) {
                                        e = gjn0.e(width, height, rational9);
                                    }
                                    if (e) {
                                        List list = (List) hashMap12.get(rational8);
                                        if (!list.contains(size11)) {
                                            list.add(size11);
                                        }
                                        rational7 = rational8;
                                    }
                                    it12 = it14;
                                    it11 = it2;
                                    it13 = it3;
                                    size4 = size;
                                    hashMap7 = hashMap6;
                                    hashMap10 = hashMap5;
                                } else if (!gjn0.e(Math.max(0, height - 16), width, rational8)) {
                                }
                            } else {
                                hashMap5 = hashMap10;
                                hashMap6 = hashMap7;
                            }
                            e = true;
                            if (e) {
                            }
                            it12 = it14;
                            it11 = it2;
                            it13 = it3;
                            size4 = size;
                            hashMap7 = hashMap6;
                            hashMap10 = hashMap5;
                        }
                        e = false;
                        if (e) {
                        }
                        it12 = it14;
                        it11 = it2;
                        it13 = it3;
                        size4 = size;
                        hashMap7 = hashMap6;
                        hashMap10 = hashMap5;
                    }
                    HashMap hashMap13 = hashMap10;
                    HashMap hashMap14 = hashMap7;
                    Iterator it15 = it12;
                    Iterator it16 = it11;
                    Size size12 = size4;
                    if (rational7 == null) {
                        hashMap12.put(new Rational(size11.getWidth(), size11.getHeight()), new ArrayList(Collections.singleton(size11)));
                    }
                    it12 = it15;
                    it11 = it16;
                    size4 = size12;
                    hashMap7 = hashMap14;
                    hashMap10 = hashMap13;
                }
                hashMap3 = hashMap10;
                hashMap4 = hashMap7;
                it = it11;
                if (s != null) {
                    Iterator it17 = hashMap12.keySet().iterator();
                    while (it17.hasNext()) {
                        gjn0.f((List) hashMap12.get((Rational) it17.next()), s);
                    }
                }
                ArrayList arrayList13 = new ArrayList(hashMap12.keySet());
                gjn0.a aVar = new gjn0.a();
                aVar.b = rational;
                Collections.sort(arrayList13, aVar);
                Iterator it18 = arrayList13.iterator();
                while (it18.hasNext()) {
                    for (Size size13 : (List) hashMap12.get((Rational) it18.next())) {
                        if (!arrayList12.contains(size13)) {
                            arrayList12.add(size13);
                        }
                    }
                }
            }
            arrayList9.add(arrayList12);
            hashMap8 = hashMap2;
            arrayList6 = arrayList11;
            it11 = it;
            hashMap7 = hashMap4;
            hashMap10 = hashMap3;
        }
        HashMap hashMap15 = hashMap10;
        HashMap hashMap16 = hashMap7;
        HashMap hashMap17 = hashMap8;
        ArrayList arrayList14 = arrayList6;
        Iterator it19 = arrayList9.iterator();
        int i5 = 1;
        while (it19.hasNext()) {
            i5 *= ((List) it19.next()).size();
        }
        if (i5 == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList15 = new ArrayList();
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList15.add(new ArrayList());
        }
        int size14 = i5 / ((List) arrayList9.get(0)).size();
        int i7 = i5;
        for (int i8 = 0; i8 < arrayList9.size(); i8++) {
            List list2 = (List) arrayList9.get(i8);
            for (int i9 = 0; i9 < i5; i9++) {
                ((List) arrayList15.get(i9)).add((Size) list2.get((i9 % i7) / size14));
            }
            if (i8 < arrayList9.size() - 1) {
                i7 = size14;
                size14 /= ((List) arrayList9.get(i8 + 1)).size();
            }
        }
        Iterator it20 = arrayList15.iterator();
        while (true) {
            if (!it20.hasNext()) {
                break;
            }
            List list3 = (List) it20.next();
            ArrayList arrayList16 = new ArrayList(arrayList3);
            for (int i10 = 0; i10 < list3.size(); i10++) {
                arrayList16.add(gjn0Var3.g(((u) arrayList4.get(((Integer) arrayList7.get(i10)).intValue())).getInputFormat(), (Size) list3.get(i10)));
            }
            Iterator it21 = arrayList14.iterator();
            boolean z3 = false;
            while (it21.hasNext() && !(z3 = ((s) it21.next()).c(arrayList16))) {
            }
            if (z3) {
                Iterator it22 = arrayList4.iterator();
                while (it22.hasNext()) {
                    u uVar3 = (u) it22.next();
                    hashMap15.put(uVar3, (Size) list3.get(arrayList7.indexOf(Integer.valueOf(arrayList4.indexOf(uVar3)))));
                }
            }
        }
        for (Map.Entry entry : hashMap17.entrySet()) {
            hashMap16.put((vfq0) entry.getValue(), (Size) hashMap15.get(entry.getKey()));
        }
        return hashMap16;
    }

    public final void j() {
        synchronized (this.h) {
            if (this.i) {
                this.b.e(new ArrayList(this.f));
                synchronized (this.h) {
                    re9 h = this.b.h();
                    this.j = h.m.a();
                    h.g();
                }
                this.i = false;
            }
        }
    }

    @NonNull
    public final List<vfq0> k() {
        ArrayList arrayList;
        synchronized (this.h) {
            arrayList = new ArrayList(this.f);
        }
        return arrayList;
    }

    public final void l(@NonNull ArrayList arrayList) {
        synchronized (this.h) {
            try {
                this.b.e(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    vfq0 vfq0Var = (vfq0) it.next();
                    if (this.f.contains(vfq0Var)) {
                        vfq0Var.n(this.b);
                    } else {
                        s100.a("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + vfq0Var, null);
                    }
                }
                this.f.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
