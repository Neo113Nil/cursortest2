package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.d5;
import com.sports.insider.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j1 {
    public final b1 A;
    public final c1 B;
    public g.f C;
    public g.f D;
    public g.f E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public m1 O;
    public final t P;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1964b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1967e;

    /* renamed from: g, reason: collision with root package name */
    public e.d0 f1969g;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1975n;

    /* renamed from: o, reason: collision with root package name */
    public final q0 f1976o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f1977p;
    public final x0 q;

    /* renamed from: r, reason: collision with root package name */
    public final x0 f1978r;

    /* renamed from: s, reason: collision with root package name */
    public final x0 f1979s;

    /* renamed from: t, reason: collision with root package name */
    public final x0 f1980t;

    /* renamed from: u, reason: collision with root package name */
    public final a1 f1981u;

    /* renamed from: v, reason: collision with root package name */
    public int f1982v;

    /* renamed from: w, reason: collision with root package name */
    public t0 f1983w;

    /* renamed from: x, reason: collision with root package name */
    public s0 f1984x;

    /* renamed from: y, reason: collision with root package name */
    public Fragment f1985y;

    /* renamed from: z, reason: collision with root package name */
    public Fragment f1986z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1963a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final q1 f1965c = new q1();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1966d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final v0 f1968f = new v0(this);

    /* renamed from: h, reason: collision with root package name */
    public a f1970h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1971i = false;
    public final z0 j = new z0(this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f1972k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f1973l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f1974m = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.x0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.x0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.x0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.x0] */
    public j1() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.f1975n = new ArrayList();
        this.f1976o = new q0(this);
        this.f1977p = new CopyOnWriteArrayList();
        final int i5 = 0;
        this.q = new p0.a(this) { // from class: androidx.fragment.app.x0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f2111b;

            {
                this.f2111b = this;
            }

            @Override // p0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j1 j1Var = this.f2111b;
                        if (j1Var.N()) {
                            j1Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j1 j1Var2 = this.f2111b;
                        if (j1Var2.N() && num.intValue() == 80) {
                            j1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.p pVar = (c0.p) obj;
                        j1 j1Var3 = this.f2111b;
                        if (j1Var3.N()) {
                            j1Var3.n(pVar.f3295a, false);
                            break;
                        }
                        break;
                    default:
                        c0.k0 k0Var = (c0.k0) obj;
                        j1 j1Var4 = this.f2111b;
                        if (j1Var4.N()) {
                            j1Var4.s(k0Var.f3281a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f1978r = new p0.a(this) { // from class: androidx.fragment.app.x0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f2111b;

            {
                this.f2111b = this;
            }

            @Override // p0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j1 j1Var = this.f2111b;
                        if (j1Var.N()) {
                            j1Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j1 j1Var2 = this.f2111b;
                        if (j1Var2.N() && num.intValue() == 80) {
                            j1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.p pVar = (c0.p) obj;
                        j1 j1Var3 = this.f2111b;
                        if (j1Var3.N()) {
                            j1Var3.n(pVar.f3295a, false);
                            break;
                        }
                        break;
                    default:
                        c0.k0 k0Var = (c0.k0) obj;
                        j1 j1Var4 = this.f2111b;
                        if (j1Var4.N()) {
                            j1Var4.s(k0Var.f3281a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f1979s = new p0.a(this) { // from class: androidx.fragment.app.x0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f2111b;

            {
                this.f2111b = this;
            }

            @Override // p0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j1 j1Var = this.f2111b;
                        if (j1Var.N()) {
                            j1Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j1 j1Var2 = this.f2111b;
                        if (j1Var2.N() && num.intValue() == 80) {
                            j1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.p pVar = (c0.p) obj;
                        j1 j1Var3 = this.f2111b;
                        if (j1Var3.N()) {
                            j1Var3.n(pVar.f3295a, false);
                            break;
                        }
                        break;
                    default:
                        c0.k0 k0Var = (c0.k0) obj;
                        j1 j1Var4 = this.f2111b;
                        if (j1Var4.N()) {
                            j1Var4.s(k0Var.f3281a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f1980t = new p0.a(this) { // from class: androidx.fragment.app.x0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f2111b;

            {
                this.f2111b = this;
            }

            @Override // p0.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j1 j1Var = this.f2111b;
                        if (j1Var.N()) {
                            j1Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j1 j1Var2 = this.f2111b;
                        if (j1Var2.N() && num.intValue() == 80) {
                            j1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        c0.p pVar = (c0.p) obj;
                        j1 j1Var3 = this.f2111b;
                        if (j1Var3.N()) {
                            j1Var3.n(pVar.f3295a, false);
                            break;
                        }
                        break;
                    default:
                        c0.k0 k0Var = (c0.k0) obj;
                        j1 j1Var4 = this.f2111b;
                        if (j1Var4.N()) {
                            j1Var4.s(k0Var.f3281a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1981u = new a1(this);
        this.f1982v = -1;
        this.A = new b1(this);
        this.B = new c1();
        this.F = new ArrayDeque();
        this.P = new t(2, this);
    }

    public static HashSet G(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < aVar.f2069a.size(); i5++) {
            Fragment fragment = ((r1) aVar.f2069a.get(i5)).f2061b;
            if (fragment != null && aVar.f2075g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean L(int i5) {
        return Log.isLoggable("FragmentManager", i5);
    }

    public static boolean M(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.f1965c.e().iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z5 = M(fragment2);
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j1 j1Var = fragment.mFragmentManager;
        return fragment.equals(j1Var.f1986z) && O(j1Var.f1985y);
    }

    public static void e0(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void A(a aVar, boolean z5) {
        if (z5 && (this.f1983w == null || this.J)) {
            return;
        }
        y(z5);
        a aVar2 = this.f1970h;
        if (aVar2 != null) {
            aVar2.f1861s = false;
            aVar2.e();
            if (L(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f1970h + " as part of execSingleAction for action " + aVar);
            }
            this.f1970h.g(false, false);
            this.f1970h.a(this.L, this.M);
            Iterator it = this.f1970h.f2069a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((r1) it.next()).f2061b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f1970h = null;
        }
        aVar.a(this.L, this.M);
        this.f1964b = true;
        try {
            W(this.L, this.M);
            d();
            g0();
            boolean z7 = this.K;
            q1 q1Var = this.f1965c;
            if (z7) {
                this.K = false;
                Iterator it2 = q1Var.d().iterator();
                while (it2.hasNext()) {
                    p1 p1Var = (p1) it2.next();
                    Fragment fragment2 = p1Var.f2041c;
                    if (fragment2.mDeferStart) {
                        if (this.f1964b) {
                            this.K = true;
                        } else {
                            fragment2.mDeferStart = false;
                            p1Var.k();
                        }
                    }
                }
            }
            q1Var.f2050b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i5, int i10) {
        int i11;
        boolean z5;
        int i12;
        boolean z7;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17 = i5;
        boolean z11 = ((a) arrayList.get(i17)).f2083p;
        ArrayList arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.N;
        q1 q1Var = this.f1965c;
        arrayList4.addAll(q1Var.f());
        Fragment fragment = this.f1986z;
        int i18 = i17;
        boolean z12 = false;
        while (true) {
            int i19 = 1;
            if (i18 >= i10) {
                boolean z13 = z11;
                boolean z14 = z12;
                this.N.clear();
                if (!z13 && this.f1982v >= 1) {
                    for (int i20 = i17; i20 < i10; i20++) {
                        Iterator it = ((a) arrayList.get(i20)).f2069a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = ((r1) it.next()).f2061b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                q1Var.g(g(fragment2));
                            }
                        }
                    }
                }
                int i21 = i17;
                while (i21 < i10) {
                    a aVar = (a) arrayList.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue()) {
                        aVar.d(-1);
                        j1 j1Var = aVar.f1860r;
                        ArrayList arrayList5 = aVar.f2069a;
                        boolean z15 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            r1 r1Var = (r1) arrayList5.get(size);
                            Fragment fragment3 = r1Var.f2061b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = aVar.f1863u;
                                fragment3.setPopDirection(z15);
                                int i22 = aVar.f2074f;
                                int i23 = 8194;
                                int i24 = 4097;
                                if (i22 != 4097) {
                                    if (i22 != 8194) {
                                        i23 = 4100;
                                        if (i22 != 8197) {
                                            i24 = 4099;
                                            if (i22 != 4099) {
                                                i23 = i22 != 4100 ? 0 : 8197;
                                            }
                                        }
                                    }
                                    i23 = i24;
                                }
                                fragment3.setNextTransition(i23);
                                fragment3.setSharedElementNames(aVar.f2082o, aVar.f2081n);
                            }
                            switch (r1Var.f2060a) {
                                case 1:
                                    fragment3.setAnimations(r1Var.f2063d, r1Var.f2064e, r1Var.f2065f, r1Var.f2066g);
                                    z15 = true;
                                    j1Var.a0(fragment3, true);
                                    j1Var.V(fragment3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r1Var.f2060a);
                                case 3:
                                    fragment3.setAnimations(r1Var.f2063d, r1Var.f2064e, r1Var.f2065f, r1Var.f2066g);
                                    j1Var.a(fragment3);
                                    z15 = true;
                                case 4:
                                    fragment3.setAnimations(r1Var.f2063d, r1Var.f2064e, r1Var.f2065f, r1Var.f2066g);
                                    j1Var.getClass();
                                    e0(fragment3);
                                    z15 = true;
                                case 5:
                                    fragment3.setAnimations(r1Var.f2063d, r1Var.f2064e, r1Var.f2065f, r1Var.f2066g);
                                    j1Var.a0(fragment3, true);
                                    j1Var.K(fragment3);
                                    z15 = true;
                                case 6:
                                    fragment3.setAnimations(r1Var.f2063d, r1Var.f2064e, r1Var.f2065f, r1Var.f2066g);
                                    j1Var.c(fragment3);
                                    z15 = true;
                                case 7:
                                    fragment3.setAnimations(r1Var.f2063d, r1Var.f2064e, r1Var.f2065f, r1Var.f2066g);
                                    j1Var.a0(fragment3, true);
                                    j1Var.h(fragment3);
                                    z15 = true;
                                case 8:
                                    j1Var.c0(null);
                                    z15 = true;
                                case 9:
                                    j1Var.c0(fragment3);
                                    z15 = true;
                                case 10:
                                    r1Var.f2068i = fragment3.mMaxState;
                                    j1Var.b0(fragment3, r1Var.f2067h);
                                    z15 = true;
                            }
                        }
                    } else {
                        aVar.d(1);
                        j1 j1Var2 = aVar.f1860r;
                        ArrayList arrayList6 = aVar.f2069a;
                        int size2 = arrayList6.size();
                        int i25 = 0;
                        while (i25 < size2) {
                            r1 r1Var2 = (r1) arrayList6.get(i25);
                            Fragment fragment4 = r1Var2.f2061b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = aVar.f1863u;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(aVar.f2074f);
                                fragment4.setSharedElementNames(aVar.f2081n, aVar.f2082o);
                            }
                            switch (r1Var2.f2060a) {
                                case 1:
                                    i11 = i21;
                                    fragment4.setAnimations(r1Var2.f2063d, r1Var2.f2064e, r1Var2.f2065f, r1Var2.f2066g);
                                    j1Var2.a0(fragment4, false);
                                    j1Var2.a(fragment4);
                                    i25++;
                                    i21 = i11;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + r1Var2.f2060a);
                                case 3:
                                    i11 = i21;
                                    fragment4.setAnimations(r1Var2.f2063d, r1Var2.f2064e, r1Var2.f2065f, r1Var2.f2066g);
                                    j1Var2.V(fragment4);
                                    i25++;
                                    i21 = i11;
                                case 4:
                                    i11 = i21;
                                    fragment4.setAnimations(r1Var2.f2063d, r1Var2.f2064e, r1Var2.f2065f, r1Var2.f2066g);
                                    j1Var2.K(fragment4);
                                    i25++;
                                    i21 = i11;
                                case 5:
                                    i11 = i21;
                                    fragment4.setAnimations(r1Var2.f2063d, r1Var2.f2064e, r1Var2.f2065f, r1Var2.f2066g);
                                    j1Var2.a0(fragment4, false);
                                    e0(fragment4);
                                    i25++;
                                    i21 = i11;
                                case 6:
                                    i11 = i21;
                                    fragment4.setAnimations(r1Var2.f2063d, r1Var2.f2064e, r1Var2.f2065f, r1Var2.f2066g);
                                    j1Var2.h(fragment4);
                                    i25++;
                                    i21 = i11;
                                case 7:
                                    i11 = i21;
                                    fragment4.setAnimations(r1Var2.f2063d, r1Var2.f2064e, r1Var2.f2065f, r1Var2.f2066g);
                                    j1Var2.a0(fragment4, false);
                                    j1Var2.c(fragment4);
                                    i25++;
                                    i21 = i11;
                                case 8:
                                    j1Var2.c0(fragment4);
                                    i11 = i21;
                                    i25++;
                                    i21 = i11;
                                case 9:
                                    j1Var2.c0(null);
                                    i11 = i21;
                                    i25++;
                                    i21 = i11;
                                case 10:
                                    r1Var2.f2067h = fragment4.mMaxState;
                                    j1Var2.b0(fragment4, r1Var2.f2068i);
                                    i11 = i21;
                                    i25++;
                                    i21 = i11;
                            }
                        }
                    }
                    i21++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
                ArrayList arrayList7 = this.f1975n;
                if (z14 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(G((a) it2.next()));
                    }
                    if (this.f1970h == null) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            a2.o oVar = (a2.o) it3.next();
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                oVar.b((Fragment) it4.next(), booleanValue);
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            a2.o oVar2 = (a2.o) it5.next();
                            Iterator it6 = linkedHashSet.iterator();
                            while (it6.hasNext()) {
                                oVar2.a((Fragment) it6.next(), booleanValue);
                            }
                        }
                    }
                }
                for (int i26 = i17; i26 < i10; i26++) {
                    a aVar2 = (a) arrayList.get(i26);
                    if (booleanValue) {
                        for (int size3 = aVar2.f2069a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = ((r1) aVar2.f2069a.get(size3)).f2061b;
                            if (fragment5 != null) {
                                g(fragment5).k();
                            }
                        }
                    } else {
                        Iterator it7 = aVar2.f2069a.iterator();
                        while (it7.hasNext()) {
                            Fragment fragment6 = ((r1) it7.next()).f2061b;
                            if (fragment6 != null) {
                                g(fragment6).k();
                            }
                        }
                    }
                }
                Q(this.f1982v, true);
                Iterator it8 = f(arrayList, i17, i10).iterator();
                while (it8.hasNext()) {
                    k2 k2Var = (k2) it8.next();
                    k2Var.f1992e = booleanValue;
                    k2Var.l();
                    k2Var.f();
                }
                while (i17 < i10) {
                    a aVar3 = (a) arrayList.get(i17);
                    if (((Boolean) arrayList2.get(i17)).booleanValue() && aVar3.f1862t >= 0) {
                        aVar3.f1862t = -1;
                    }
                    if (aVar3.q != null) {
                        for (int i27 = 0; i27 < aVar3.q.size(); i27++) {
                            ((Runnable) aVar3.q.get(i27)).run();
                        }
                        aVar3.q = null;
                    }
                    i17++;
                }
                if (z14) {
                    for (int i28 = 0; i28 < arrayList7.size(); i28++) {
                        ((a2.o) arrayList7.get(i28)).getClass();
                    }
                    return;
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i18);
            if (((Boolean) arrayList2.get(i18)).booleanValue()) {
                z5 = z11;
                i12 = i18;
                z7 = z12;
                int i29 = 1;
                ArrayList arrayList8 = this.N;
                ArrayList arrayList9 = aVar4.f2069a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    r1 r1Var3 = (r1) arrayList9.get(size4);
                    int i30 = r1Var3.f2060a;
                    if (i30 != i29) {
                        if (i30 != 3) {
                            switch (i30) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = r1Var3.f2061b;
                                    break;
                                case 10:
                                    r1Var3.f2068i = r1Var3.f2067h;
                                    break;
                            }
                            size4--;
                            i29 = 1;
                        }
                        arrayList8.add(r1Var3.f2061b);
                        size4--;
                        i29 = 1;
                    }
                    arrayList8.remove(r1Var3.f2061b);
                    size4--;
                    i29 = 1;
                }
            } else {
                ArrayList arrayList10 = this.N;
                ArrayList arrayList11 = aVar4.f2069a;
                int i31 = 0;
                while (i31 < arrayList11.size()) {
                    r1 r1Var4 = (r1) arrayList11.get(i31);
                    boolean z16 = z11;
                    int i32 = r1Var4.f2060a;
                    if (i32 != i19) {
                        i13 = i18;
                        if (i32 != 2) {
                            if (i32 == 3 || i32 == 6) {
                                arrayList10.remove(r1Var4.f2061b);
                                Fragment fragment7 = r1Var4.f2061b;
                                if (fragment7 == fragment) {
                                    arrayList11.add(i31, new r1(fragment7, 9));
                                    i31++;
                                    z10 = z12;
                                    fragment = null;
                                    i14 = 1;
                                }
                            } else if (i32 == 7) {
                                i14 = 1;
                            } else if (i32 == 8) {
                                arrayList11.add(i31, new r1(9, fragment, 0));
                                r1Var4.f2062c = true;
                                i31++;
                                fragment = r1Var4.f2061b;
                            }
                            z10 = z12;
                            i14 = 1;
                        } else {
                            Fragment fragment8 = r1Var4.f2061b;
                            int i33 = fragment8.mContainerId;
                            int size5 = arrayList10.size() - 1;
                            boolean z17 = false;
                            while (size5 >= 0) {
                                int i34 = size5;
                                Fragment fragment9 = (Fragment) arrayList10.get(size5);
                                boolean z18 = z12;
                                if (fragment9.mContainerId != i33) {
                                    i15 = i33;
                                } else if (fragment9 == fragment8) {
                                    i15 = i33;
                                    z17 = true;
                                } else {
                                    if (fragment9 == fragment) {
                                        i15 = i33;
                                        i16 = 0;
                                        arrayList11.add(i31, new r1(9, fragment9, 0));
                                        i31++;
                                        fragment = null;
                                    } else {
                                        i15 = i33;
                                        i16 = 0;
                                    }
                                    r1 r1Var5 = new r1(3, fragment9, i16);
                                    r1Var5.f2063d = r1Var4.f2063d;
                                    r1Var5.f2065f = r1Var4.f2065f;
                                    r1Var5.f2064e = r1Var4.f2064e;
                                    r1Var5.f2066g = r1Var4.f2066g;
                                    arrayList11.add(i31, r1Var5);
                                    arrayList10.remove(fragment9);
                                    i31++;
                                    fragment = fragment;
                                }
                                size5 = i34 - 1;
                                i33 = i15;
                                z12 = z18;
                            }
                            z10 = z12;
                            i14 = 1;
                            if (z17) {
                                arrayList11.remove(i31);
                                i31--;
                            } else {
                                r1Var4.f2060a = 1;
                                r1Var4.f2062c = true;
                                arrayList10.add(fragment8);
                            }
                        }
                        i31 += i14;
                        i19 = i14;
                        z11 = z16;
                        i18 = i13;
                        z12 = z10;
                    } else {
                        i13 = i18;
                        i14 = i19;
                    }
                    z10 = z12;
                    arrayList10.add(r1Var4.f2061b);
                    i31 += i14;
                    i19 = i14;
                    z11 = z16;
                    i18 = i13;
                    z12 = z10;
                }
                z5 = z11;
                i12 = i18;
                z7 = z12;
            }
            z12 = z7 || aVar4.f2075g;
            i18 = i12 + 1;
            z11 = z5;
        }
    }

    public final int C(String str, int i5, boolean z5) {
        if (this.f1966d.isEmpty()) {
            return -1;
        }
        if (str == null && i5 < 0) {
            if (z5) {
                return 0;
            }
            return this.f1966d.size() - 1;
        }
        int size = this.f1966d.size() - 1;
        while (size >= 0) {
            a aVar = (a) this.f1966d.get(size);
            if ((str != null && str.equals(aVar.f2077i)) || (i5 >= 0 && i5 == aVar.f1862t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z5) {
            if (size == this.f1966d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            a aVar2 = (a) this.f1966d.get(size - 1);
            if ((str == null || !str.equals(aVar2.f2077i)) && (i5 < 0 || i5 != aVar2.f1862t)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment D(int i5) {
        q1 q1Var = this.f1965c;
        ArrayList arrayList = q1Var.f2049a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i5) {
                return fragment;
            }
        }
        for (p1 p1Var : q1Var.f2050b.values()) {
            if (p1Var != null) {
                Fragment fragment2 = p1Var.f2041c;
                if (fragment2.mFragmentId == i5) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment E(String str) {
        q1 q1Var = this.f1965c;
        ArrayList arrayList = q1Var.f2049a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (p1 p1Var : q1Var.f2050b.values()) {
            if (p1Var != null) {
                Fragment fragment2 = p1Var.f2041c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void F() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            k2 k2Var = (k2) it.next();
            if (k2Var.f1993f) {
                if (L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                k2Var.f1993f = false;
                k2Var.f();
            }
        }
    }

    public final ViewGroup H(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f1984x.k()) {
            return null;
        }
        View e7 = this.f1984x.e(fragment.mContainerId);
        if (e7 instanceof ViewGroup) {
            return (ViewGroup) e7;
        }
        return null;
    }

    public final b1 I() {
        Fragment fragment = this.f1985y;
        return fragment != null ? fragment.mFragmentManager.I() : this.A;
    }

    public final c1 J() {
        Fragment fragment = this.f1985y;
        return fragment != null ? fragment.mFragmentManager.J() : this.B;
    }

    public final void K(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        d0(fragment);
    }

    public final boolean N() {
        Fragment fragment = this.f1985y;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f1985y.getParentFragmentManager().N();
    }

    public final boolean P() {
        return this.H || this.I;
    }

    public final void Q(int i5, boolean z5) {
        t0 t0Var;
        if (this.f1983w == null && i5 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z5 || i5 != this.f1982v) {
            this.f1982v = i5;
            q1 q1Var = this.f1965c;
            HashMap hashMap = q1Var.f2050b;
            Iterator it = q1Var.f2049a.iterator();
            while (it.hasNext()) {
                p1 p1Var = (p1) hashMap.get(((Fragment) it.next()).mWho);
                if (p1Var != null) {
                    p1Var.k();
                }
            }
            for (p1 p1Var2 : hashMap.values()) {
                if (p1Var2 != null) {
                    p1Var2.k();
                    Fragment fragment = p1Var2.f2041c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !q1Var.f2051c.containsKey(fragment.mWho)) {
                            q1Var.i(p1Var2.n(), fragment.mWho);
                        }
                        q1Var.h(p1Var2);
                    }
                }
            }
            Iterator it2 = q1Var.d().iterator();
            while (it2.hasNext()) {
                p1 p1Var3 = (p1) it2.next();
                Fragment fragment2 = p1Var3.f2041c;
                if (fragment2.mDeferStart) {
                    if (this.f1964b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        p1Var3.k();
                    }
                }
            }
            if (this.G && (t0Var = this.f1983w) != null && this.f1982v == 7) {
                ((o0) t0Var).f2018e.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void R() {
        if (this.f1983w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f2008g = false;
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i5, int i10) {
        z(false);
        y(true);
        Fragment fragment = this.f1986z;
        if (fragment != null && i5 < 0 && fragment.getChildFragmentManager().S()) {
            return true;
        }
        boolean U = U(this.L, this.M, null, i5, i10);
        if (U) {
            this.f1964b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
        g0();
        boolean z5 = this.K;
        q1 q1Var = this.f1965c;
        if (z5) {
            this.K = false;
            Iterator it = q1Var.d().iterator();
            while (it.hasNext()) {
                p1 p1Var = (p1) it.next();
                Fragment fragment2 = p1Var.f2041c;
                if (fragment2.mDeferStart) {
                    if (this.f1964b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        p1Var.k();
                    }
                }
            }
        }
        q1Var.f2050b.values().removeAll(Collections.singleton(null));
        return U;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, String str, int i5, int i10) {
        int C = C(str, i5, (i10 & 1) != 0);
        if (C < 0) {
            return false;
        }
        for (int size = this.f1966d.size() - 1; size >= C; size--) {
            arrayList.add((a) this.f1966d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        q1 q1Var = this.f1965c;
        synchronized (q1Var.f2049a) {
            q1Var.f2049a.remove(fragment);
        }
        fragment.mAdded = false;
        if (M(fragment)) {
            this.G = true;
        }
        fragment.mRemoving = true;
        d0(fragment);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i5 = 0;
        int i10 = 0;
        while (i5 < size) {
            if (!((a) arrayList.get(i5)).f2083p) {
                if (i10 != i5) {
                    B(arrayList, arrayList2, i10, i5);
                }
                i10 = i5 + 1;
                if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).f2083p) {
                        i10++;
                    }
                }
                B(arrayList, arrayList2, i5, i10);
                i5 = i10 - 1;
            }
            i5++;
        }
        if (i10 != size) {
            B(arrayList, arrayList2, i10, size);
        }
    }

    public final void X(Bundle bundle) {
        q0 q0Var;
        p1 p1Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f1983w.f2087b.getClassLoader());
                this.f1974m.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f1983w.f2087b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        q1 q1Var = this.f1965c;
        HashMap hashMap2 = q1Var.f2051c;
        HashMap hashMap3 = q1Var.f2050b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        hashMap3.clear();
        Iterator it = fragmentManagerState.f1837a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            q0Var = this.f1976o;
            if (!hasNext) {
                break;
            }
            Bundle i5 = q1Var.i(null, (String) it.next());
            if (i5 != null) {
                Fragment fragment = (Fragment) this.O.f2003b.get(((FragmentState) i5.getParcelable("state")).f1846b);
                if (fragment != null) {
                    if (L(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    p1Var = new p1(q0Var, q1Var, fragment, i5);
                } else {
                    p1Var = new p1(this.f1976o, this.f1965c, this.f1983w.f2087b.getClassLoader(), I(), i5);
                }
                Fragment fragment2 = p1Var.f2041c;
                fragment2.mSavedFragmentState = i5;
                fragment2.mFragmentManager = this;
                if (L(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                p1Var.l(this.f1983w.f2087b.getClassLoader());
                q1Var.g(p1Var);
                p1Var.f2043e = this.f1982v;
            }
        }
        m1 m1Var = this.O;
        m1Var.getClass();
        Iterator it2 = new ArrayList(m1Var.f2003b.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) == null) {
                if (L(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f1837a);
                }
                this.O.i(fragment3);
                fragment3.mFragmentManager = this;
                p1 p1Var2 = new p1(q0Var, q1Var, fragment3);
                p1Var2.f2043e = 1;
                p1Var2.k();
                fragment3.mRemoving = true;
                p1Var2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f1838b;
        q1Var.f2049a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b10 = q1Var.b(str3);
                if (b10 == null) {
                    throw new IllegalStateException(androidx.appcompat.widget.c1.n("No instantiated fragment for (", str3, ")"));
                }
                if (L(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b10);
                }
                q1Var.a(b10);
            }
        }
        if (fragmentManagerState.f1839c != null) {
            this.f1966d = new ArrayList(fragmentManagerState.f1839c.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f1839c;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i10];
                ArrayList arrayList2 = backStackRecordState.f1816b;
                a aVar = new a(this);
                backStackRecordState.a(aVar);
                aVar.f1862t = backStackRecordState.f1821g;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String str4 = (String) arrayList2.get(i11);
                    if (str4 != null) {
                        ((r1) aVar.f2069a.get(i11)).f2061b = q1Var.b(str4);
                    }
                }
                aVar.d(1);
                if (L(2)) {
                    StringBuilder r5 = androidx.appcompat.widget.c1.r(i10, "restoreAllState: back stack #", " (index ");
                    r5.append(aVar.f1862t);
                    r5.append("): ");
                    r5.append(aVar);
                    Log.v("FragmentManager", r5.toString());
                    PrintWriter printWriter = new PrintWriter(new c2());
                    aVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1966d.add(aVar);
                i10++;
            }
        } else {
            this.f1966d = new ArrayList();
        }
        this.f1972k.set(fragmentManagerState.f1840d);
        String str5 = fragmentManagerState.f1841e;
        if (str5 != null) {
            Fragment b11 = q1Var.b(str5);
            this.f1986z = b11;
            r(b11);
        }
        ArrayList arrayList3 = fragmentManagerState.f1842f;
        if (arrayList3 != null) {
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                this.f1973l.put((String) arrayList3.get(i12), (BackStackState) fragmentManagerState.f1843g.get(i12));
            }
        }
        this.F = new ArrayDeque(fragmentManagerState.f1844h);
    }

    public final Bundle Y() {
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        F();
        w();
        z(true);
        this.H = true;
        this.O.f2008g = true;
        q1 q1Var = this.f1965c;
        q1Var.getClass();
        HashMap hashMap = q1Var.f2050b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (p1 p1Var : hashMap.values()) {
            if (p1Var != null) {
                Fragment fragment = p1Var.f2041c;
                q1Var.i(p1Var.n(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (L(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.f1965c.f2051c;
        if (!hashMap2.isEmpty()) {
            q1 q1Var2 = this.f1965c;
            synchronized (q1Var2.f2049a) {
                try {
                    if (q1Var2.f2049a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(q1Var2.f2049a.size());
                        Iterator it = q1Var2.f2049a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = (Fragment) it.next();
                            arrayList.add(fragment2.mWho);
                            if (L(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f1966d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i5 = 0; i5 < size; i5++) {
                    backStackRecordStateArr[i5] = new BackStackRecordState((a) this.f1966d.get(i5));
                    if (L(2)) {
                        StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "saveAllState: adding back stack #", ": ");
                        r5.append(this.f1966d.get(i5));
                        Log.v("FragmentManager", r5.toString());
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f1841e = null;
            ArrayList arrayList3 = new ArrayList();
            fragmentManagerState.f1842f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.f1843g = arrayList4;
            fragmentManagerState.f1837a = arrayList2;
            fragmentManagerState.f1838b = arrayList;
            fragmentManagerState.f1839c = backStackRecordStateArr;
            fragmentManagerState.f1840d = this.f1972k.get();
            Fragment fragment3 = this.f1986z;
            if (fragment3 != null) {
                fragmentManagerState.f1841e = fragment3.mWho;
            }
            arrayList3.addAll(this.f1973l.keySet());
            arrayList4.addAll(this.f1973l.values());
            fragmentManagerState.f1844h = new ArrayList(this.F);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f1974m.keySet()) {
                bundle.putBundle(androidx.appcompat.widget.c1.m("result_", str), (Bundle) this.f1974m.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(androidx.appcompat.widget.c1.m("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        } else if (L(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void Z() {
        synchronized (this.f1963a) {
            try {
                if (this.f1963a.size() == 1) {
                    this.f1983w.f2088c.removeCallbacks(this.P);
                    this.f1983w.f2088c.post(this.P);
                    g0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final p1 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            o1.d.d(fragment, str);
        }
        if (L(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        p1 g10 = g(fragment);
        fragment.mFragmentManager = this;
        q1 q1Var = this.f1965c;
        q1Var.g(g10);
        if (!fragment.mDetached) {
            q1Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (M(fragment)) {
                this.G = true;
            }
        }
        return g10;
    }

    public final void a0(Fragment fragment, boolean z5) {
        ViewGroup H = H(fragment);
        if (H == null || !(H instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) H).setDrawDisappearingViewsLast(!z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(t0 t0Var, s0 s0Var, Fragment fragment) {
        if (this.f1983w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1983w = t0Var;
        this.f1984x = s0Var;
        this.f1985y = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1977p;
        if (fragment != null) {
            copyOnWriteArrayList.add(new d1(fragment));
        } else if (t0Var instanceof n1) {
            copyOnWriteArrayList.add((n1) t0Var);
        }
        if (this.f1985y != null) {
            g0();
        }
        if (t0Var instanceof e.e0) {
            e.e0 e0Var = (e.e0) t0Var;
            e.d0 onBackPressedDispatcher = e0Var.getOnBackPressedDispatcher();
            this.f1969g = onBackPressedDispatcher;
            androidx.lifecycle.e0 e0Var2 = e0Var;
            if (fragment != null) {
                e0Var2 = fragment;
            }
            onBackPressedDispatcher.a(e0Var2, this.j);
        }
        if (fragment != null) {
            m1 m1Var = fragment.mFragmentManager.O;
            HashMap hashMap = m1Var.f2004c;
            m1 m1Var2 = (m1) hashMap.get(fragment.mWho);
            if (m1Var2 == null) {
                m1Var2 = new m1(m1Var.f2006e);
                hashMap.put(fragment.mWho, m1Var2);
            }
            this.O = m1Var2;
        } else if (t0Var instanceof androidx.lifecycle.p1) {
            androidx.lifecycle.o1 store = ((androidx.lifecycle.p1) t0Var).getViewModelStore();
            Intrinsics.checkNotNullParameter(store, "store");
            l1 factory = m1.f2002h;
            Intrinsics.checkNotNullParameter(factory, "factory");
            t1.a defaultCreationExtras = t1.a.f23739b;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(store, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(m1.class, "modelClass");
            Intrinsics.checkNotNullParameter(m1.class, "<this>");
            ag.c modelClass = Reflection.getOrCreateKotlinClass(m1.class);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            String r5 = d5.r(modelClass);
            if (r5 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.O = (m1) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        } else {
            this.O = new m1(false);
        }
        this.O.f2008g = P();
        this.f1965c.f2052d = this.O;
        Object obj = this.f1983w;
        if ((obj instanceof q2.f) && fragment == null) {
            q2.d savedStateRegistry = ((q2.f) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new l0(1, this));
            Bundle a7 = savedStateRegistry.a("android:support:fragments");
            if (a7 != null) {
                X(a7);
            }
        }
        Object obj2 = this.f1983w;
        if (obj2 instanceof g.h) {
            g.g d10 = ((g.h) obj2).d();
            String m6 = androidx.appcompat.widget.c1.m("FragmentManager:", fragment != null ? d9.e.l(new StringBuilder(), fragment.mWho, StringUtils.PROCESS_POSTFIX_DELIMITER) : "");
            this.C = d10.d(r4.k.l(m6, "StartActivityForResult"), new e1(4), new y0(this, 1));
            this.D = d10.d(r4.k.l(m6, "StartIntentSenderForResult"), new e1(0), new y0(this, 2));
            this.E = d10.d(r4.k.l(m6, "RequestPermissions"), new e1(2), new y0(this, 0));
        }
        Object obj3 = this.f1983w;
        if (obj3 instanceof d0.e) {
            ((d0.e) obj3).c(this.q);
        }
        Object obj4 = this.f1983w;
        if (obj4 instanceof d0.f) {
            ((d0.f) obj4).g(this.f1978r);
        }
        Object obj5 = this.f1983w;
        if (obj5 instanceof c0.i0) {
            ((c0.i0) obj5).i(this.f1979s);
        }
        Object obj6 = this.f1983w;
        if (obj6 instanceof c0.j0) {
            ((c0.j0) obj6).h(this.f1980t);
        }
        Object obj7 = this.f1983w;
        if ((obj7 instanceof androidx.core.view.n) && fragment == null) {
            ((androidx.core.view.n) obj7).addMenuProvider(this.f1981u);
        }
    }

    public final void b0(Fragment fragment, androidx.lifecycle.x xVar) {
        if (fragment.equals(this.f1965c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = xVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f1965c.a(fragment);
            if (L(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (M(fragment)) {
                this.G = true;
            }
        }
    }

    public final void c0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f1965c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f1986z;
        this.f1986z = fragment;
        r(fragment2);
        r(this.f1986z);
    }

    public final void d() {
        this.f1964b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(Fragment fragment) {
        ViewGroup H = H(fragment);
        if (H != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (H.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    H.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) H.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final HashSet e() {
        Object sVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f1965c.d().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((p1) it.next()).f2041c.mContainer;
            if (container != null) {
                c1 factory = J();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof k2) {
                    sVar = (k2) tag;
                } else {
                    factory.getClass();
                    Intrinsics.checkNotNullParameter(container, "container");
                    sVar = new s(container);
                    Intrinsics.checkNotNullExpressionValue(sVar, "factory.createController(container)");
                    container.setTag(R.id.special_effects_controller_view_tag, sVar);
                }
                hashSet.add(sVar);
            }
        }
        return hashSet;
    }

    public final HashSet f(ArrayList arrayList, int i5, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i5 < i10) {
            Iterator it = ((a) arrayList.get(i5)).f2069a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((r1) it.next()).f2061b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(k2.j(viewGroup, this));
                }
            }
            i5++;
        }
        return hashSet;
    }

    public final void f0(RuntimeException runtimeException) {
        io.sentry.android.core.w0.d("FragmentManager", runtimeException.getMessage());
        io.sentry.android.core.w0.d("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new c2());
        t0 t0Var = this.f1983w;
        if (t0Var == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e7) {
                io.sentry.android.core.w0.e("FragmentManager", "Failed dumping state", e7);
                throw runtimeException;
            }
        }
        try {
            ((o0) t0Var).f2018e.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e9) {
            io.sentry.android.core.w0.e("FragmentManager", "Failed dumping state", e9);
            throw runtimeException;
        }
    }

    public final p1 g(Fragment fragment) {
        String str = fragment.mWho;
        q1 q1Var = this.f1965c;
        p1 p1Var = (p1) q1Var.f2050b.get(str);
        if (p1Var != null) {
            return p1Var;
        }
        p1 p1Var2 = new p1(this.f1976o, q1Var, fragment);
        p1Var2.l(this.f1983w.f2087b.getClassLoader());
        p1Var2.f2043e = this.f1982v;
        return p1Var2;
    }

    public final void g0() {
        synchronized (this.f1963a) {
            try {
                if (!this.f1963a.isEmpty()) {
                    this.j.f(true);
                    if (L(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z5 = this.f1966d.size() + (this.f1970h != null ? 1 : 0) > 0 && O(this.f1985y);
                if (L(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z5);
                }
                this.j.f(z5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (L(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            q1 q1Var = this.f1965c;
            synchronized (q1Var.f2049a) {
                q1Var.f2049a.remove(fragment);
            }
            fragment.mAdded = false;
            if (M(fragment)) {
                this.G = true;
            }
            d0(fragment);
        }
    }

    public final void i(boolean z5, Configuration configuration) {
        if (z5 && (this.f1983w instanceof d0.e)) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z5) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f1982v < 1) {
            return false;
        }
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f1982v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z5 = false;
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z5 = true;
            }
        }
        if (this.f1967e != null) {
            for (int i5 = 0; i5 < this.f1967e.size(); i5++) {
                Fragment fragment2 = (Fragment) this.f1967e.get(i5);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1967e = arrayList;
        return z5;
    }

    public final void l() {
        boolean z5 = true;
        this.J = true;
        z(true);
        w();
        t0 t0Var = this.f1983w;
        boolean z7 = t0Var instanceof androidx.lifecycle.p1;
        q1 q1Var = this.f1965c;
        if (z7) {
            z5 = q1Var.f2052d.f2007f;
        } else {
            p0 p0Var = t0Var.f2087b;
            if (androidx.appcompat.widget.c1.v(p0Var)) {
                z5 = true ^ p0Var.isChangingConfigurations();
            }
        }
        if (z5) {
            Iterator it = this.f1973l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f1828a.iterator();
                while (it2.hasNext()) {
                    q1Var.f2052d.g((String) it2.next(), false);
                }
            }
        }
        u(-1);
        Object obj = this.f1983w;
        if (obj instanceof d0.f) {
            ((d0.f) obj).b(this.f1978r);
        }
        Object obj2 = this.f1983w;
        if (obj2 instanceof d0.e) {
            ((d0.e) obj2).j(this.q);
        }
        Object obj3 = this.f1983w;
        if (obj3 instanceof c0.i0) {
            ((c0.i0) obj3).f(this.f1979s);
        }
        Object obj4 = this.f1983w;
        if (obj4 instanceof c0.j0) {
            ((c0.j0) obj4).l(this.f1980t);
        }
        Object obj5 = this.f1983w;
        if ((obj5 instanceof androidx.core.view.n) && this.f1985y == null) {
            ((androidx.core.view.n) obj5).removeMenuProvider(this.f1981u);
        }
        this.f1983w = null;
        this.f1984x = null;
        this.f1985y = null;
        if (this.f1969g != null) {
            this.j.e();
            this.f1969g = null;
        }
        g.f fVar = this.C;
        if (fVar != null) {
            fVar.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z5) {
        if (z5 && (this.f1983w instanceof d0.f)) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z5) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z5, boolean z7) {
        if (z7 && (this.f1983w instanceof c0.i0)) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z5);
                if (z7) {
                    fragment.mChildFragmentManager.n(z5, true);
                }
            }
        }
    }

    public final void o() {
        Iterator it = this.f1965c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f1982v < 1) {
            return false;
        }
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f1982v < 1) {
            return;
        }
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f1965c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z5, boolean z7) {
        if (z7 && (this.f1983w instanceof c0.j0)) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z5);
                if (z7) {
                    fragment.mChildFragmentManager.s(z5, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z5 = false;
        if (this.f1982v < 1) {
            return false;
        }
        for (Fragment fragment : this.f1965c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z5 = true;
            }
        }
        return z5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f1985y;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1985y)));
            sb2.append("}");
        } else {
            t0 t0Var = this.f1983w;
            if (t0Var != null) {
                sb2.append(t0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1983w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i5) {
        try {
            this.f1964b = true;
            for (p1 p1Var : this.f1965c.f2050b.values()) {
                if (p1Var != null) {
                    p1Var.f2043e = i5;
                }
            }
            Q(i5, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((k2) it.next()).i();
            }
            this.f1964b = false;
            z(true);
        } catch (Throwable th2) {
            this.f1964b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String l6 = r4.k.l(str, "    ");
        q1 q1Var = this.f1965c;
        ArrayList arrayList = q1Var.f2049a;
        String l10 = r4.k.l(str, "    ");
        HashMap hashMap = q1Var.f2050b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (p1 p1Var : hashMap.values()) {
                printWriter.print(str);
                if (p1Var != null) {
                    Fragment fragment = p1Var.f2041c;
                    printWriter.println(fragment);
                    fragment.dump(l10, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i5 = 0; i5 < size2; i5++) {
                Fragment fragment2 = (Fragment) arrayList.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f1967e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment3 = (Fragment) this.f1967e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.f1966d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                a aVar = (a) this.f1966d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(l6, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1972k.get());
        synchronized (this.f1963a) {
            try {
                int size4 = this.f1963a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (f1) this.f1963a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1983w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1984x);
        if (this.f1985y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1985y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1982v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((k2) it.next()).i();
        }
    }

    public final void x(f1 f1Var, boolean z5) {
        if (!z5) {
            if (this.f1983w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1963a) {
            try {
                if (this.f1983w == null) {
                    if (!z5) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1963a.add(f1Var);
                    Z();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(boolean z5) {
        if (this.f1964b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1983w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1983w.f2088c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z5 && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean z(boolean z5) {
        boolean z7;
        a aVar;
        y(z5);
        if (!this.f1971i && (aVar = this.f1970h) != null) {
            aVar.f1861s = false;
            aVar.e();
            if (L(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f1970h + " as part of execPendingActions for actions " + this.f1963a);
            }
            this.f1970h.g(false, false);
            this.f1963a.add(0, this.f1970h);
            Iterator it = this.f1970h.f2069a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((r1) it.next()).f2061b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f1970h = null;
        }
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.M;
            synchronized (this.f1963a) {
                if (this.f1963a.isEmpty()) {
                    z7 = false;
                } else {
                    try {
                        int size = this.f1963a.size();
                        z7 = false;
                        for (int i5 = 0; i5 < size; i5++) {
                            z7 |= ((f1) this.f1963a.get(i5)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z7) {
                break;
            }
            this.f1964b = true;
            try {
                W(this.L, this.M);
                d();
                z10 = true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        g0();
        if (this.K) {
            this.K = false;
            Iterator it2 = this.f1965c.d().iterator();
            while (it2.hasNext()) {
                p1 p1Var = (p1) it2.next();
                Fragment fragment2 = p1Var.f2041c;
                if (fragment2.mDeferStart) {
                    if (this.f1964b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        p1Var.k();
                    }
                }
            }
        }
        this.f1965c.f2050b.values().removeAll(Collections.singleton(null));
        return z10;
    }
}
