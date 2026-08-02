package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Collector f5549a;

    static {
        final int i5 = 0;
        final int i10 = 0;
        final int i11 = 1;
        final int i12 = 1;
        f5549a = Collector.CC.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i5) {
                    case 0:
                        return new z();
                    case 1:
                        return new i0();
                    default:
                        return new g0();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.p
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((z) obj).a(obj2);
                        return;
                    case 1:
                        i0 i0Var = (i0) obj;
                        i0Var.getClass();
                        obj2.getClass();
                        i0Var.a(obj2);
                        return;
                    default:
                        g0 g0Var = (g0) obj;
                        q0 q0Var = (q0) obj2;
                        g0Var.getClass();
                        if (q0Var.f5551a.equals(q0Var.f5552b)) {
                            throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", q0Var));
                        }
                        g0Var.f5455a.add(q0Var);
                        return;
                }
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i13 = i10;
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.n
            public /* synthetic */ BiFunction andThen(Function function) {
                int i13 = i11;
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        g0 g0Var = (g0) obj;
                        g0Var.getClass();
                        Iterator it = ((g0) obj2).f5455a.iterator();
                        while (it.hasNext()) {
                            q0 q0Var = (q0) it.next();
                            if (q0Var.f5551a.equals(q0Var.f5552b)) {
                                throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", q0Var));
                            }
                            g0Var.f5455a.add(q0Var);
                        }
                        return g0Var;
                    case 1:
                        z zVar = (z) obj;
                        z zVar2 = (z) obj2;
                        Object[] objArr = zVar2.f5627a;
                        int i13 = zVar2.f5628b;
                        for (int i14 = 0; i14 < i13; i14++) {
                            zVar.getClass();
                            if (objArr[i14] == null) {
                                throw new NullPointerException(androidx.appcompat.widget.c1.i(i14, "at index "));
                            }
                        }
                        zVar.c(i13);
                        System.arraycopy(objArr, 0, zVar.f5627a, zVar.f5628b, i13);
                        zVar.f5628b += i13;
                        return zVar;
                    default:
                        i0 i0Var = (i0) obj;
                        i0 i0Var2 = (i0) obj2;
                        Object[] objArr2 = i0Var2.f5627a;
                        int i15 = i0Var2.f5628b;
                        for (int i16 = 0; i16 < i15; i16++) {
                            i0Var.getClass();
                            if (objArr2[i16] == null) {
                                throw new NullPointerException(androidx.appcompat.widget.c1.i(i16, "at index "));
                            }
                        }
                        i0Var.c(i15);
                        System.arraycopy(objArr2, 0, i0Var.f5627a, i0Var.f5628b, i15);
                        i0Var.f5628b += i15;
                        return i0Var;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.o
            public /* synthetic */ Function andThen(Function function) {
                int i13 = i12;
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0136 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int b10;
                q0 q0Var;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = ((g0) obj).f5455a;
                        int size = arrayList.size();
                        d3.i(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, o0.f5526c);
                        Iterator it = arrayList.iterator();
                        l0 l0Var = it instanceof l0 ? (l0) it : new l0(it);
                        int i13 = 0;
                        while (l0Var.hasNext()) {
                            q0 q0Var2 = (q0) l0Var.next();
                            while (l0Var.hasNext()) {
                                if (!l0Var.f5495b) {
                                    l0Var.f5496c = l0Var.f5494a.next();
                                    l0Var.f5495b = true;
                                }
                                q0 q0Var3 = (q0) l0Var.f5496c;
                                w wVar = q0Var2.f5551a;
                                w wVar2 = q0Var2.f5552b;
                                w wVar3 = q0Var3.f5552b;
                                w wVar4 = q0Var3.f5551a;
                                if (wVar.a(wVar3) <= 0 && wVar4.a(wVar2) <= 0) {
                                    int a7 = wVar.a(wVar4);
                                    w wVar5 = q0Var3.f5552b;
                                    int a10 = wVar2.a(wVar5);
                                    if (a7 >= 0 && a10 <= 0) {
                                        q0Var = q0Var2;
                                    } else if (a7 > 0 || a10 < 0) {
                                        if (a7 >= 0) {
                                            wVar4 = wVar;
                                        }
                                        if (a10 <= 0) {
                                            wVar5 = wVar2;
                                        }
                                        if (!(wVar4.a(wVar5) <= 0)) {
                                            throw new IllegalArgumentException(d3.g("intersection is undefined for disconnected ranges %s and %s", q0Var2, q0Var3));
                                        }
                                        q0Var = new q0(wVar4, wVar5);
                                    } else {
                                        q0Var = q0Var3;
                                    }
                                    if (!q0Var.f5551a.equals(q0Var.f5552b)) {
                                        throw new IllegalArgumentException(d3.g("Overlapping ranges not permitted but found %s overlapping %s", q0Var2, q0Var3));
                                    }
                                    q0 q0Var4 = (q0) l0Var.next();
                                    int a11 = wVar.a(q0Var4.f5551a);
                                    int a12 = wVar2.a(q0Var4.f5552b);
                                    if (a11 > 0 || a12 < 0) {
                                        if (a11 < 0 || a12 > 0) {
                                            if (a11 > 0) {
                                                wVar = q0Var4.f5551a;
                                            }
                                            if (a12 < 0) {
                                                q0Var2 = q0Var4;
                                            }
                                            q0Var4 = new q0(wVar, q0Var2.f5552b);
                                        }
                                        q0Var2 = q0Var4;
                                    }
                                }
                                q0Var2.getClass();
                                length = objArr.length;
                                int i14 = i13 + 1;
                                b10 = x.b(length, i14);
                                if (b10 <= length) {
                                    objArr = Arrays.copyOf(objArr, b10);
                                }
                                objArr[i13] = q0Var2;
                                i13 = i14;
                            }
                            q0Var2.getClass();
                            length = objArr.length;
                            int i142 = i13 + 1;
                            b10 = x.b(length, i142);
                            if (b10 <= length) {
                            }
                            objArr[i13] = q0Var2;
                            i13 = i142;
                        }
                        s0 i15 = d0.i(i13, objArr);
                        if (i15.isEmpty()) {
                            return h0.f5462b;
                        }
                        if (i15.f5569d == 1) {
                            a0 listIterator = i15.listIterator(0);
                            Object next = listIterator.next();
                            if (listIterator.hasNext()) {
                                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                                sb2.append(next);
                                for (int i16 = 0; i16 < 4 && listIterator.hasNext(); i16++) {
                                    sb2.append(", ");
                                    sb2.append(listIterator.next());
                                }
                                if (listIterator.hasNext()) {
                                    sb2.append(", ...");
                                }
                                sb2.append('>');
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            if (((q0) next).equals(q0.f5550c)) {
                                return h0.f5463c;
                            }
                        }
                        return new h0(i15);
                    case 1:
                        z zVar = (z) obj;
                        zVar.f5629c = true;
                        return d0.i(zVar.f5628b, zVar.f5627a);
                    default:
                        i0 i0Var = (i0) obj;
                        int i17 = i0Var.f5628b;
                        if (i17 == 0) {
                            return y0.f5645i;
                        }
                        if (i17 == 1) {
                            Object obj2 = i0Var.f5627a[0];
                            Objects.requireNonNull(obj2);
                            return new a1(obj2);
                        }
                        j0 i18 = j0.i(i17, i0Var.f5627a);
                        i0Var.f5628b = i18.size();
                        i0Var.f5629c = true;
                        return i18;
                }
            }

            public /* synthetic */ Function compose(Function function) {
                int i13 = i12;
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
        final int i13 = 1;
        final int i14 = 1;
        final int i15 = 2;
        final int i16 = 2;
        Collector.CC.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i13) {
                    case 0:
                        return new z();
                    case 1:
                        return new i0();
                    default:
                        return new g0();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.p
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        ((z) obj).a(obj2);
                        return;
                    case 1:
                        i0 i0Var = (i0) obj;
                        i0Var.getClass();
                        obj2.getClass();
                        i0Var.a(obj2);
                        return;
                    default:
                        g0 g0Var = (g0) obj;
                        q0 q0Var = (q0) obj2;
                        g0Var.getClass();
                        if (q0Var.f5551a.equals(q0Var.f5552b)) {
                            throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", q0Var));
                        }
                        g0Var.f5455a.add(q0Var);
                        return;
                }
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i132 = i14;
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.n
            public /* synthetic */ BiFunction andThen(Function function) {
                int i132 = i15;
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i15) {
                    case 0:
                        g0 g0Var = (g0) obj;
                        g0Var.getClass();
                        Iterator it = ((g0) obj2).f5455a.iterator();
                        while (it.hasNext()) {
                            q0 q0Var = (q0) it.next();
                            if (q0Var.f5551a.equals(q0Var.f5552b)) {
                                throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", q0Var));
                            }
                            g0Var.f5455a.add(q0Var);
                        }
                        return g0Var;
                    case 1:
                        z zVar = (z) obj;
                        z zVar2 = (z) obj2;
                        Object[] objArr = zVar2.f5627a;
                        int i132 = zVar2.f5628b;
                        for (int i142 = 0; i142 < i132; i142++) {
                            zVar.getClass();
                            if (objArr[i142] == null) {
                                throw new NullPointerException(androidx.appcompat.widget.c1.i(i142, "at index "));
                            }
                        }
                        zVar.c(i132);
                        System.arraycopy(objArr, 0, zVar.f5627a, zVar.f5628b, i132);
                        zVar.f5628b += i132;
                        return zVar;
                    default:
                        i0 i0Var = (i0) obj;
                        i0 i0Var2 = (i0) obj2;
                        Object[] objArr2 = i0Var2.f5627a;
                        int i152 = i0Var2.f5628b;
                        for (int i162 = 0; i162 < i152; i162++) {
                            i0Var.getClass();
                            if (objArr2[i162] == null) {
                                throw new NullPointerException(androidx.appcompat.widget.c1.i(i162, "at index "));
                            }
                        }
                        i0Var.c(i152);
                        System.arraycopy(objArr2, 0, i0Var.f5627a, i0Var.f5628b, i152);
                        i0Var.f5628b += i152;
                        return i0Var;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.o
            public /* synthetic */ Function andThen(Function function) {
                int i132 = i16;
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0136 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int b10;
                q0 q0Var;
                switch (i16) {
                    case 0:
                        ArrayList arrayList = ((g0) obj).f5455a;
                        int size = arrayList.size();
                        d3.i(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, o0.f5526c);
                        Iterator it = arrayList.iterator();
                        l0 l0Var = it instanceof l0 ? (l0) it : new l0(it);
                        int i132 = 0;
                        while (l0Var.hasNext()) {
                            q0 q0Var2 = (q0) l0Var.next();
                            while (l0Var.hasNext()) {
                                if (!l0Var.f5495b) {
                                    l0Var.f5496c = l0Var.f5494a.next();
                                    l0Var.f5495b = true;
                                }
                                q0 q0Var3 = (q0) l0Var.f5496c;
                                w wVar = q0Var2.f5551a;
                                w wVar2 = q0Var2.f5552b;
                                w wVar3 = q0Var3.f5552b;
                                w wVar4 = q0Var3.f5551a;
                                if (wVar.a(wVar3) <= 0 && wVar4.a(wVar2) <= 0) {
                                    int a7 = wVar.a(wVar4);
                                    w wVar5 = q0Var3.f5552b;
                                    int a10 = wVar2.a(wVar5);
                                    if (a7 >= 0 && a10 <= 0) {
                                        q0Var = q0Var2;
                                    } else if (a7 > 0 || a10 < 0) {
                                        if (a7 >= 0) {
                                            wVar4 = wVar;
                                        }
                                        if (a10 <= 0) {
                                            wVar5 = wVar2;
                                        }
                                        if (!(wVar4.a(wVar5) <= 0)) {
                                            throw new IllegalArgumentException(d3.g("intersection is undefined for disconnected ranges %s and %s", q0Var2, q0Var3));
                                        }
                                        q0Var = new q0(wVar4, wVar5);
                                    } else {
                                        q0Var = q0Var3;
                                    }
                                    if (!q0Var.f5551a.equals(q0Var.f5552b)) {
                                        throw new IllegalArgumentException(d3.g("Overlapping ranges not permitted but found %s overlapping %s", q0Var2, q0Var3));
                                    }
                                    q0 q0Var4 = (q0) l0Var.next();
                                    int a11 = wVar.a(q0Var4.f5551a);
                                    int a12 = wVar2.a(q0Var4.f5552b);
                                    if (a11 > 0 || a12 < 0) {
                                        if (a11 < 0 || a12 > 0) {
                                            if (a11 > 0) {
                                                wVar = q0Var4.f5551a;
                                            }
                                            if (a12 < 0) {
                                                q0Var2 = q0Var4;
                                            }
                                            q0Var4 = new q0(wVar, q0Var2.f5552b);
                                        }
                                        q0Var2 = q0Var4;
                                    }
                                }
                                q0Var2.getClass();
                                length = objArr.length;
                                int i142 = i132 + 1;
                                b10 = x.b(length, i142);
                                if (b10 <= length) {
                                    objArr = Arrays.copyOf(objArr, b10);
                                }
                                objArr[i132] = q0Var2;
                                i132 = i142;
                            }
                            q0Var2.getClass();
                            length = objArr.length;
                            int i1422 = i132 + 1;
                            b10 = x.b(length, i1422);
                            if (b10 <= length) {
                            }
                            objArr[i132] = q0Var2;
                            i132 = i1422;
                        }
                        s0 i152 = d0.i(i132, objArr);
                        if (i152.isEmpty()) {
                            return h0.f5462b;
                        }
                        if (i152.f5569d == 1) {
                            a0 listIterator = i152.listIterator(0);
                            Object next = listIterator.next();
                            if (listIterator.hasNext()) {
                                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                                sb2.append(next);
                                for (int i162 = 0; i162 < 4 && listIterator.hasNext(); i162++) {
                                    sb2.append(", ");
                                    sb2.append(listIterator.next());
                                }
                                if (listIterator.hasNext()) {
                                    sb2.append(", ...");
                                }
                                sb2.append('>');
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            if (((q0) next).equals(q0.f5550c)) {
                                return h0.f5463c;
                            }
                        }
                        return new h0(i152);
                    case 1:
                        z zVar = (z) obj;
                        zVar.f5629c = true;
                        return d0.i(zVar.f5628b, zVar.f5627a);
                    default:
                        i0 i0Var = (i0) obj;
                        int i17 = i0Var.f5628b;
                        if (i17 == 0) {
                            return y0.f5645i;
                        }
                        if (i17 == 1) {
                            Object obj2 = i0Var.f5627a[0];
                            Objects.requireNonNull(obj2);
                            return new a1(obj2);
                        }
                        j0 i18 = j0.i(i17, i0Var.f5627a);
                        i0Var.f5628b = i18.size();
                        i0Var.f5629c = true;
                        return i18;
                }
            }

            public /* synthetic */ Function compose(Function function) {
                int i132 = i16;
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
        final int i17 = 2;
        final int i18 = 2;
        final int i19 = 0;
        final int i20 = 0;
        Collector.CC.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i17) {
                    case 0:
                        return new z();
                    case 1:
                        return new i0();
                    default:
                        return new g0();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.p
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i18) {
                    case 0:
                        ((z) obj).a(obj2);
                        return;
                    case 1:
                        i0 i0Var = (i0) obj;
                        i0Var.getClass();
                        obj2.getClass();
                        i0Var.a(obj2);
                        return;
                    default:
                        g0 g0Var = (g0) obj;
                        q0 q0Var = (q0) obj2;
                        g0Var.getClass();
                        if (q0Var.f5551a.equals(q0Var.f5552b)) {
                            throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", q0Var));
                        }
                        g0Var.f5455a.add(q0Var);
                        return;
                }
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i132 = i18;
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.n
            public /* synthetic */ BiFunction andThen(Function function) {
                int i132 = i19;
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i19) {
                    case 0:
                        g0 g0Var = (g0) obj;
                        g0Var.getClass();
                        Iterator it = ((g0) obj2).f5455a.iterator();
                        while (it.hasNext()) {
                            q0 q0Var = (q0) it.next();
                            if (q0Var.f5551a.equals(q0Var.f5552b)) {
                                throw new IllegalArgumentException(d3.g("range must not be empty, but was %s", q0Var));
                            }
                            g0Var.f5455a.add(q0Var);
                        }
                        return g0Var;
                    case 1:
                        z zVar = (z) obj;
                        z zVar2 = (z) obj2;
                        Object[] objArr = zVar2.f5627a;
                        int i132 = zVar2.f5628b;
                        for (int i142 = 0; i142 < i132; i142++) {
                            zVar.getClass();
                            if (objArr[i142] == null) {
                                throw new NullPointerException(androidx.appcompat.widget.c1.i(i142, "at index "));
                            }
                        }
                        zVar.c(i132);
                        System.arraycopy(objArr, 0, zVar.f5627a, zVar.f5628b, i132);
                        zVar.f5628b += i132;
                        return zVar;
                    default:
                        i0 i0Var = (i0) obj;
                        i0 i0Var2 = (i0) obj2;
                        Object[] objArr2 = i0Var2.f5627a;
                        int i152 = i0Var2.f5628b;
                        for (int i162 = 0; i162 < i152; i162++) {
                            i0Var.getClass();
                            if (objArr2[i162] == null) {
                                throw new NullPointerException(androidx.appcompat.widget.c1.i(i162, "at index "));
                            }
                        }
                        i0Var.c(i152);
                        System.arraycopy(objArr2, 0, i0Var.f5627a, i0Var.f5628b, i152);
                        i0Var.f5628b += i152;
                        return i0Var;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.o
            public /* synthetic */ Function andThen(Function function) {
                int i132 = i20;
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0136 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int b10;
                q0 q0Var;
                switch (i20) {
                    case 0:
                        ArrayList arrayList = ((g0) obj).f5455a;
                        int size = arrayList.size();
                        d3.i(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, o0.f5526c);
                        Iterator it = arrayList.iterator();
                        l0 l0Var = it instanceof l0 ? (l0) it : new l0(it);
                        int i132 = 0;
                        while (l0Var.hasNext()) {
                            q0 q0Var2 = (q0) l0Var.next();
                            while (l0Var.hasNext()) {
                                if (!l0Var.f5495b) {
                                    l0Var.f5496c = l0Var.f5494a.next();
                                    l0Var.f5495b = true;
                                }
                                q0 q0Var3 = (q0) l0Var.f5496c;
                                w wVar = q0Var2.f5551a;
                                w wVar2 = q0Var2.f5552b;
                                w wVar3 = q0Var3.f5552b;
                                w wVar4 = q0Var3.f5551a;
                                if (wVar.a(wVar3) <= 0 && wVar4.a(wVar2) <= 0) {
                                    int a7 = wVar.a(wVar4);
                                    w wVar5 = q0Var3.f5552b;
                                    int a10 = wVar2.a(wVar5);
                                    if (a7 >= 0 && a10 <= 0) {
                                        q0Var = q0Var2;
                                    } else if (a7 > 0 || a10 < 0) {
                                        if (a7 >= 0) {
                                            wVar4 = wVar;
                                        }
                                        if (a10 <= 0) {
                                            wVar5 = wVar2;
                                        }
                                        if (!(wVar4.a(wVar5) <= 0)) {
                                            throw new IllegalArgumentException(d3.g("intersection is undefined for disconnected ranges %s and %s", q0Var2, q0Var3));
                                        }
                                        q0Var = new q0(wVar4, wVar5);
                                    } else {
                                        q0Var = q0Var3;
                                    }
                                    if (!q0Var.f5551a.equals(q0Var.f5552b)) {
                                        throw new IllegalArgumentException(d3.g("Overlapping ranges not permitted but found %s overlapping %s", q0Var2, q0Var3));
                                    }
                                    q0 q0Var4 = (q0) l0Var.next();
                                    int a11 = wVar.a(q0Var4.f5551a);
                                    int a12 = wVar2.a(q0Var4.f5552b);
                                    if (a11 > 0 || a12 < 0) {
                                        if (a11 < 0 || a12 > 0) {
                                            if (a11 > 0) {
                                                wVar = q0Var4.f5551a;
                                            }
                                            if (a12 < 0) {
                                                q0Var2 = q0Var4;
                                            }
                                            q0Var4 = new q0(wVar, q0Var2.f5552b);
                                        }
                                        q0Var2 = q0Var4;
                                    }
                                }
                                q0Var2.getClass();
                                length = objArr.length;
                                int i1422 = i132 + 1;
                                b10 = x.b(length, i1422);
                                if (b10 <= length) {
                                    objArr = Arrays.copyOf(objArr, b10);
                                }
                                objArr[i132] = q0Var2;
                                i132 = i1422;
                            }
                            q0Var2.getClass();
                            length = objArr.length;
                            int i14222 = i132 + 1;
                            b10 = x.b(length, i14222);
                            if (b10 <= length) {
                            }
                            objArr[i132] = q0Var2;
                            i132 = i14222;
                        }
                        s0 i152 = d0.i(i132, objArr);
                        if (i152.isEmpty()) {
                            return h0.f5462b;
                        }
                        if (i152.f5569d == 1) {
                            a0 listIterator = i152.listIterator(0);
                            Object next = listIterator.next();
                            if (listIterator.hasNext()) {
                                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                                sb2.append(next);
                                for (int i162 = 0; i162 < 4 && listIterator.hasNext(); i162++) {
                                    sb2.append(", ");
                                    sb2.append(listIterator.next());
                                }
                                if (listIterator.hasNext()) {
                                    sb2.append(", ...");
                                }
                                sb2.append('>');
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            if (((q0) next).equals(q0.f5550c)) {
                                return h0.f5463c;
                            }
                        }
                        return new h0(i152);
                    case 1:
                        z zVar = (z) obj;
                        zVar.f5629c = true;
                        return d0.i(zVar.f5628b, zVar.f5627a);
                    default:
                        i0 i0Var = (i0) obj;
                        int i172 = i0Var.f5628b;
                        if (i172 == 0) {
                            return y0.f5645i;
                        }
                        if (i172 == 1) {
                            Object obj2 = i0Var.f5627a[0];
                            Objects.requireNonNull(obj2);
                            return new a1(obj2);
                        }
                        j0 i182 = j0.i(i172, i0Var.f5627a);
                        i0Var.f5628b = i182.size();
                        i0Var.f5629c = true;
                        return i182;
                }
            }

            public /* synthetic */ Function compose(Function function) {
                int i132 = i20;
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
    }
}
