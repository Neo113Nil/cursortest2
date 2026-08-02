package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.ap8;
import defpackage.b8;
import defpackage.bo8;
import defpackage.bp8;
import defpackage.bq8;
import defpackage.ce;
import defpackage.cp8;
import defpackage.dmi;
import defpackage.dp8;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fc6;
import defpackage.fp4;
import defpackage.fq8;
import defpackage.g6b;
import defpackage.g7h;
import defpackage.gqd;
import defpackage.hg6;
import defpackage.ie;
import defpackage.ilg;
import defpackage.je;
import defpackage.jqd;
import defpackage.jy3;
import defpackage.lnb;
import defpackage.lp8;
import defpackage.me;
import defpackage.mz1;
import defpackage.no8;
import defpackage.nqg;
import defpackage.op8;
import defpackage.qb3;
import defpackage.qo8;
import defpackage.qqg;
import defpackage.stk;
import defpackage.ttk;
import defpackage.u6b;
import defpackage.uic;
import defpackage.upd;
import defpackage.vo8;
import defpackage.vpd;
import defpackage.vqd;
import defpackage.wn8;
import defpackage.wo8;
import defpackage.xib;
import defpackage.xo8;
import defpackage.xpd;
import defpackage.yec;
import defpackage.yhk;
import defpackage.yn3;
import defpackage.yo8;
import defpackage.zo8;
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
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class s {
    public Fragment A;
    public ie D;
    public ie E;
    public ie F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public t P;
    public boolean b;
    public ArrayList e;
    public upd g;
    public final vo8 r;
    public final vo8 s;
    public final vo8 t;
    public final vo8 u;
    public no8 x;
    public bo8 y;
    public Fragment z;
    public final ArrayList a = new ArrayList();
    public final v c = new v();
    public ArrayList d = new ArrayList();
    public final n f = new n(this);
    public a h = null;
    public boolean i = false;
    public final p j = new p(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final Map n = Collections.synchronizedMap(new HashMap());
    public final ArrayList o = new ArrayList();
    public final fp4 p = new fp4(this);
    public final CopyOnWriteArrayList q = new CopyOnWriteArrayList();
    public final wo8 v = new wo8(this);
    public int w = -1;
    public final xo8 B = new xo8(this);
    public final uic C = new uic(24);
    public ArrayDeque G = new ArrayDeque();
    public final b8 Q = new b8(this, 17);

    /* JADX WARN: Type inference failed for: r0v17, types: [vo8] */
    /* JADX WARN: Type inference failed for: r0v18, types: [vo8] */
    /* JADX WARN: Type inference failed for: r0v19, types: [vo8] */
    /* JADX WARN: Type inference failed for: r0v20, types: [vo8] */
    public s() {
        final int i = 0;
        this.r = new yn3(this) { // from class: vo8
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // defpackage.yn3
            public final void accept(Object obj) {
                int i2 = i;
                s sVar = this.b;
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (sVar.Q()) {
                            sVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (sVar.Q() && num.intValue() == 80) {
                            sVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        vyc vycVar = (vyc) obj;
                        if (sVar.Q()) {
                            sVar.n(vycVar.a, false);
                            break;
                        }
                        break;
                    default:
                        qge qgeVar = (qge) obj;
                        if (sVar.Q()) {
                            sVar.s(qgeVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.s = new yn3(this) { // from class: vo8
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // defpackage.yn3
            public final void accept(Object obj) {
                int i22 = i2;
                s sVar = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (sVar.Q()) {
                            sVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (sVar.Q() && num.intValue() == 80) {
                            sVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        vyc vycVar = (vyc) obj;
                        if (sVar.Q()) {
                            sVar.n(vycVar.a, false);
                            break;
                        }
                        break;
                    default:
                        qge qgeVar = (qge) obj;
                        if (sVar.Q()) {
                            sVar.s(qgeVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.t = new yn3(this) { // from class: vo8
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // defpackage.yn3
            public final void accept(Object obj) {
                int i22 = i3;
                s sVar = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (sVar.Q()) {
                            sVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (sVar.Q() && num.intValue() == 80) {
                            sVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        vyc vycVar = (vyc) obj;
                        if (sVar.Q()) {
                            sVar.n(vycVar.a, false);
                            break;
                        }
                        break;
                    default:
                        qge qgeVar = (qge) obj;
                        if (sVar.Q()) {
                            sVar.s(qgeVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.u = new yn3(this) { // from class: vo8
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // defpackage.yn3
            public final void accept(Object obj) {
                int i22 = i4;
                s sVar = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (sVar.Q()) {
                            sVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (sVar.Q() && num.intValue() == 80) {
                            sVar.m(false);
                            break;
                        }
                        break;
                    case 2:
                        vyc vycVar = (vyc) obj;
                        if (sVar.Q()) {
                            sVar.n(vycVar.a, false);
                            break;
                        }
                        break;
                    default:
                        qge qgeVar = (qge) obj;
                        if (sVar.Q()) {
                            sVar.s(qgeVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static Fragment D(View view) {
        Fragment G = G(view);
        if (G != null) {
            return G;
        }
        ilg.f(view, " does not have a Fragment set", "View ");
        return null;
    }

    public static Fragment G(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet I(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aVar.c.size(); i++) {
            Fragment fragment = ((fq8) aVar.c.get(i)).b;
            if (fragment != null && aVar.i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean O(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean P(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.c.e().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z = P(fragment2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        s sVar = fragment.mFragmentManager;
        return fragment.equals(sVar.A) && R(sVar.z);
    }

    public final void A(a aVar, boolean z) {
        if (z && (this.x == null || this.K)) {
            return;
        }
        y(z);
        a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.u = false;
            aVar2.e();
            if (O(3)) {
                Objects.toString(this.h);
                Objects.toString(aVar);
            }
            this.h.g(false, false);
            this.h.a(this.M, this.N);
            Iterator it = this.h.c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((fq8) it.next()).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
        }
        aVar.a(this.M, this.N);
        this.b = true;
        try {
            b0(this.M, this.N);
            d();
            o0();
            boolean z2 = this.L;
            v vVar = this.c;
            if (z2) {
                this.L = false;
                Iterator it2 = vVar.d().iterator();
                while (it2.hasNext()) {
                    u uVar = (u) it2.next();
                    Fragment fragment2 = uVar.c;
                    if (fragment2.mDeferStart) {
                        if (this.b) {
                            this.L = true;
                        } else {
                            fragment2.mDeferStart = false;
                            uVar.i();
                        }
                    }
                }
            }
            vVar.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9 = i;
        boolean z4 = ((a) arrayList.get(i9)).r;
        ArrayList arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.O;
        v vVar = this.c;
        arrayList4.addAll(vVar.f());
        Fragment fragment = this.A;
        int i10 = i9;
        boolean z5 = false;
        while (true) {
            int i11 = 1;
            if (i10 >= i2) {
                boolean z6 = z4;
                boolean z7 = z5;
                this.O.clear();
                if (!z6 && this.w >= 1) {
                    for (int i12 = i9; i12 < i2; i12++) {
                        Iterator it = ((a) arrayList.get(i12)).c.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = ((fq8) it.next()).b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                vVar.g(g(fragment2));
                            }
                        }
                    }
                }
                int i13 = i9;
                while (i13 < i2) {
                    a aVar = (a) arrayList.get(i13);
                    if (!((Boolean) arrayList2.get(i13)).booleanValue()) {
                        aVar.d(1);
                        s sVar = aVar.t;
                        ArrayList arrayList5 = aVar.c;
                        int size = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size) {
                            fq8 fq8Var = (fq8) arrayList5.get(i14);
                            Fragment fragment3 = fq8Var.b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = aVar.w;
                                fragment3.setPopDirection(false);
                                fragment3.setNextTransition(aVar.h);
                                fragment3.setSharedElementNames(aVar.p, aVar.q);
                            }
                            switch (fq8Var.a) {
                                case 1:
                                    i3 = i13;
                                    fragment3.setAnimations(fq8Var.d, fq8Var.e, fq8Var.f, fq8Var.g);
                                    sVar.g0(fragment3, false);
                                    sVar.a(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 2:
                                default:
                                    hg6.d(fq8Var.a, "Unknown cmd: ");
                                    break;
                                case 3:
                                    i3 = i13;
                                    fragment3.setAnimations(fq8Var.d, fq8Var.e, fq8Var.f, fq8Var.g);
                                    sVar.a0(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 4:
                                    i3 = i13;
                                    fragment3.setAnimations(fq8Var.d, fq8Var.e, fq8Var.f, fq8Var.g);
                                    sVar.getClass();
                                    if (O(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (!fragment3.mHidden) {
                                        fragment3.mHidden = true;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                        sVar.l0(fragment3);
                                    }
                                    i14++;
                                    i13 = i3;
                                case 5:
                                    i3 = i13;
                                    fragment3.setAnimations(fq8Var.d, fq8Var.e, fq8Var.f, fq8Var.g);
                                    sVar.g0(fragment3, false);
                                    if (O(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (fragment3.mHidden) {
                                        fragment3.mHidden = false;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                    }
                                    i14++;
                                    i13 = i3;
                                case 6:
                                    i3 = i13;
                                    fragment3.setAnimations(fq8Var.d, fq8Var.e, fq8Var.f, fq8Var.g);
                                    sVar.h(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 7:
                                    i3 = i13;
                                    fragment3.setAnimations(fq8Var.d, fq8Var.e, fq8Var.f, fq8Var.g);
                                    sVar.g0(fragment3, false);
                                    sVar.c(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 8:
                                    sVar.k0(fragment3);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                                case 9:
                                    sVar.k0(null);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                                case 10:
                                    fq8Var.h = fragment3.mMaxState;
                                    sVar.j0(fragment3, fq8Var.i);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                            }
                            return;
                        }
                    }
                    aVar.d(-1);
                    s sVar2 = aVar.t;
                    ArrayList arrayList6 = aVar.c;
                    boolean z8 = true;
                    for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                        fq8 fq8Var2 = (fq8) arrayList6.get(size2);
                        Fragment fragment4 = fq8Var2.b;
                        if (fragment4 != null) {
                            fragment4.mBeingSaved = aVar.w;
                            fragment4.setPopDirection(z8);
                            int i15 = aVar.h;
                            int i16 = 8194;
                            int i17 = 4097;
                            if (i15 != 4097) {
                                if (i15 != 8194) {
                                    i16 = 4100;
                                    if (i15 != 8197) {
                                        i17 = 4099;
                                        if (i15 != 4099) {
                                            i16 = i15 != 4100 ? 0 : 8197;
                                        }
                                    }
                                }
                                i16 = i17;
                            }
                            fragment4.setNextTransition(i16);
                            fragment4.setSharedElementNames(aVar.q, aVar.p);
                        }
                        switch (fq8Var2.a) {
                            case 1:
                                fragment4.setAnimations(fq8Var2.d, fq8Var2.e, fq8Var2.f, fq8Var2.g);
                                z8 = true;
                                sVar2.g0(fragment4, true);
                                sVar2.a0(fragment4);
                            case 2:
                            default:
                                hg6.d(fq8Var2.a, "Unknown cmd: ");
                                break;
                            case 3:
                                fragment4.setAnimations(fq8Var2.d, fq8Var2.e, fq8Var2.f, fq8Var2.g);
                                sVar2.a(fragment4);
                                z8 = true;
                            case 4:
                                fragment4.setAnimations(fq8Var2.d, fq8Var2.e, fq8Var2.f, fq8Var2.g);
                                sVar2.getClass();
                                if (O(2)) {
                                    Objects.toString(fragment4);
                                }
                                if (fragment4.mHidden) {
                                    fragment4.mHidden = false;
                                    fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                }
                                z8 = true;
                            case 5:
                                fragment4.setAnimations(fq8Var2.d, fq8Var2.e, fq8Var2.f, fq8Var2.g);
                                sVar2.g0(fragment4, true);
                                if (O(2)) {
                                    Objects.toString(fragment4);
                                }
                                if (!fragment4.mHidden) {
                                    fragment4.mHidden = true;
                                    fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                    sVar2.l0(fragment4);
                                }
                                z8 = true;
                            case 6:
                                fragment4.setAnimations(fq8Var2.d, fq8Var2.e, fq8Var2.f, fq8Var2.g);
                                sVar2.c(fragment4);
                                z8 = true;
                            case 7:
                                fragment4.setAnimations(fq8Var2.d, fq8Var2.e, fq8Var2.f, fq8Var2.g);
                                sVar2.g0(fragment4, true);
                                sVar2.h(fragment4);
                                z8 = true;
                            case 8:
                                sVar2.k0(null);
                                z8 = true;
                            case 9:
                                sVar2.k0(fragment4);
                                z8 = true;
                            case 10:
                                fq8Var2.i = fragment4.mMaxState;
                                sVar2.j0(fragment4, fq8Var2.h);
                                z8 = true;
                        }
                        return;
                    }
                    i13++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList arrayList7 = this.o;
                if (z7 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(I((a) it2.next()));
                    }
                    if (this.h == null) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            cp8 cp8Var = (cp8) it3.next();
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                cp8Var.b((Fragment) it4.next(), booleanValue);
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            cp8 cp8Var2 = (cp8) it5.next();
                            Iterator it6 = linkedHashSet.iterator();
                            while (it6.hasNext()) {
                                cp8Var2.a((Fragment) it6.next(), booleanValue);
                            }
                        }
                    }
                }
                for (int i18 = i9; i18 < i2; i18++) {
                    a aVar2 = (a) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size3 = aVar2.c.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = ((fq8) aVar2.c.get(size3)).b;
                            if (fragment5 != null) {
                                g(fragment5).i();
                            }
                        }
                    } else {
                        Iterator it7 = aVar2.c.iterator();
                        while (it7.hasNext()) {
                            Fragment fragment6 = ((fq8) it7.next()).b;
                            if (fragment6 != null) {
                                g(fragment6).i();
                            }
                        }
                    }
                }
                T(this.w, true);
                Iterator it8 = f(arrayList, i9, i2).iterator();
                while (it8.hasNext()) {
                    h hVar = (h) it8.next();
                    hVar.e = booleanValue;
                    hVar.l();
                    hVar.e();
                }
                while (i9 < i2) {
                    a aVar3 = (a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue() && aVar3.v >= 0) {
                        aVar3.v = -1;
                    }
                    if (aVar3.s != null) {
                        for (int i19 = 0; i19 < aVar3.s.size(); i19++) {
                            ((Runnable) aVar3.s.get(i19)).run();
                        }
                        aVar3.s = null;
                    }
                    i9++;
                }
                if (z7) {
                    for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                        ((cp8) arrayList7.get(i20)).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i10);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i10)).booleanValue();
            ArrayList arrayList8 = this.O;
            if (booleanValue2) {
                z = z4;
                i4 = i10;
                z2 = z5;
                int i21 = 1;
                ArrayList arrayList9 = aVar4.c;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    fq8 fq8Var3 = (fq8) arrayList9.get(size4);
                    int i22 = fq8Var3.a;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = fq8Var3.b;
                                    break;
                                case 10:
                                    fq8Var3.i = fq8Var3.h;
                                    break;
                            }
                            size4--;
                            i21 = 1;
                        }
                        arrayList8.add(fq8Var3.b);
                        size4--;
                        i21 = 1;
                    }
                    arrayList8.remove(fq8Var3.b);
                    size4--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList10 = aVar4.c;
                int i23 = 0;
                while (i23 < arrayList10.size()) {
                    fq8 fq8Var4 = (fq8) arrayList10.get(i23);
                    boolean z9 = z4;
                    int i24 = fq8Var4.a;
                    if (i24 != i11) {
                        if (i24 != 2) {
                            if (i24 == 3 || i24 == 6) {
                                i5 = i10;
                                arrayList8.remove(fq8Var4.b);
                                Fragment fragment7 = fq8Var4.b;
                                if (fragment7 == fragment) {
                                    arrayList10.add(i23, new fq8(fragment7, 9));
                                    i23++;
                                    z3 = z5;
                                    fragment = null;
                                    i6 = 1;
                                }
                            } else if (i24 == 7) {
                                i5 = i10;
                                i6 = 1;
                            } else if (i24 != 8) {
                                i5 = i10;
                            } else {
                                i5 = i10;
                                arrayList10.add(i23, new fq8(9, fragment, 0));
                                fq8Var4.c = true;
                                i23++;
                                fragment = fq8Var4.b;
                            }
                            z3 = z5;
                            i6 = 1;
                        } else {
                            i5 = i10;
                            Fragment fragment8 = fq8Var4.b;
                            int i25 = fragment8.mContainerId;
                            int size5 = arrayList8.size() - 1;
                            boolean z10 = false;
                            while (size5 >= 0) {
                                boolean z11 = z5;
                                Fragment fragment9 = (Fragment) arrayList8.get(size5);
                                int i26 = size5;
                                if (fragment9.mContainerId != i25) {
                                    i7 = i25;
                                } else if (fragment9 == fragment8) {
                                    i7 = i25;
                                    z10 = true;
                                } else {
                                    if (fragment9 == fragment) {
                                        i7 = i25;
                                        i8 = 0;
                                        arrayList10.add(i23, new fq8(9, fragment9, 0));
                                        i23++;
                                        fragment = null;
                                    } else {
                                        i7 = i25;
                                        i8 = 0;
                                    }
                                    fq8 fq8Var5 = new fq8(3, fragment9, i8);
                                    fq8Var5.d = fq8Var4.d;
                                    fq8Var5.f = fq8Var4.f;
                                    fq8Var5.e = fq8Var4.e;
                                    fq8Var5.g = fq8Var4.g;
                                    arrayList10.add(i23, fq8Var5);
                                    arrayList8.remove(fragment9);
                                    i23++;
                                    fragment = fragment;
                                }
                                size5 = i26 - 1;
                                i25 = i7;
                                z5 = z11;
                            }
                            z3 = z5;
                            i6 = 1;
                            if (z10) {
                                arrayList10.remove(i23);
                                i23--;
                            } else {
                                fq8Var4.a = 1;
                                fq8Var4.c = true;
                                arrayList8.add(fragment8);
                            }
                        }
                        i23 += i6;
                        i11 = i6;
                        z4 = z9;
                        i10 = i5;
                        z5 = z3;
                    } else {
                        i5 = i10;
                        i6 = i11;
                    }
                    z3 = z5;
                    arrayList8.add(fq8Var4.b);
                    i23 += i6;
                    i11 = i6;
                    z4 = z9;
                    i10 = i5;
                    z5 = z3;
                }
                z = z4;
                i4 = i10;
                z2 = z5;
            }
            z5 = z2 || aVar4.i;
            i10 = i4 + 1;
            z4 = z;
        }
    }

    public final int C(int i, String str, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            a aVar = (a) this.d.get(size);
            if ((str != null && str.equals(aVar.k)) || (i >= 0 && i == aVar.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            a aVar2 = (a) this.d.get(size - 1);
            if ((str == null || !str.equals(aVar2.k)) && (i < 0 || i != aVar2.v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment E(int i) {
        v vVar = this.c;
        ArrayList arrayList = vVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (u uVar : vVar.b.values()) {
            if (uVar != null) {
                Fragment fragment2 = uVar.c;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment F(String str) {
        v vVar = this.c;
        ArrayList arrayList = vVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (u uVar : vVar.b.values()) {
            if (uVar != null) {
                Fragment fragment2 = uVar.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void H() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.f) {
                hVar.f = false;
                hVar.e();
            }
        }
    }

    public final int J() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final Fragment K(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment b = this.c.b(string);
        if (b != null) {
            return b;
        }
        m0(new IllegalStateException(fc6.n("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup L(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.y.c()) {
            return null;
        }
        View b = this.y.b(fragment.mContainerId);
        if (b instanceof ViewGroup) {
            return (ViewGroup) b;
        }
        return null;
    }

    public final xo8 M() {
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.M() : this.B;
    }

    public final uic N() {
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.N() : this.C;
    }

    public final boolean Q() {
        Fragment fragment = this.z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.z.getParentFragmentManager().Q();
    }

    public final boolean S() {
        return this.I || this.J;
    }

    public final void T(int i, boolean z) {
        no8 no8Var;
        if (this.x == null && i != -1) {
            a70.r("No activity");
            return;
        }
        if (z || i != this.w) {
            this.w = i;
            v vVar = this.c;
            HashMap hashMap = vVar.b;
            Iterator it = vVar.a.iterator();
            while (it.hasNext()) {
                u uVar = (u) hashMap.get(((Fragment) it.next()).mWho);
                if (uVar != null) {
                    uVar.i();
                }
            }
            for (u uVar2 : hashMap.values()) {
                if (uVar2 != null) {
                    uVar2.i();
                    Fragment fragment = uVar2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !vVar.c.containsKey(fragment.mWho)) {
                            vVar.i(uVar2.l(), fragment.mWho);
                        }
                        vVar.h(uVar2);
                    }
                }
            }
            Iterator it2 = vVar.d().iterator();
            while (it2.hasNext()) {
                u uVar3 = (u) it2.next();
                Fragment fragment2 = uVar3.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        uVar3.i();
                    }
                }
            }
            if (this.H && (no8Var = this.x) != null && this.w == 7) {
                ((wn8) no8Var).e.invalidateMenu();
                this.H = false;
            }
        }
    }

    public final void U() {
        if (this.x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.g = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean V() {
        return W(-1, 0);
    }

    public final boolean W(int i, int i2) {
        z(false);
        y(true);
        Fragment fragment = this.A;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().V()) {
            return true;
        }
        boolean X = X(this.M, this.N, null, i, i2);
        if (X) {
            this.b = true;
            try {
                b0(this.M, this.N);
            } finally {
                d();
            }
        }
        o0();
        boolean z = this.L;
        v vVar = this.c;
        if (z) {
            this.L = false;
            Iterator it = vVar.d().iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                Fragment fragment2 = uVar.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        uVar.i();
                    }
                }
            }
        }
        vVar.b.values().removeAll(Collections.singleton(null));
        return X;
    }

    public final boolean X(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int C = C(i, str, (i2 & 1) != 0);
        if (C < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= C; size--) {
            arrayList.add((a) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Y(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            m0(new IllegalStateException(fc6.m("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void Z(ap8 ap8Var, boolean z) {
        fp4 fp4Var = this.p;
        fp4Var.getClass();
        ((CopyOnWriteArrayList) fp4Var.c).add(new qo8(ap8Var, z));
    }

    public final u a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            bq8.d(fragment, str);
        }
        if (O(2)) {
            fragment.toString();
        }
        u g = g(fragment);
        fragment.mFragmentManager = this;
        v vVar = this.c;
        vVar.g(g);
        if (!fragment.mDetached) {
            vVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (P(fragment)) {
                this.H = true;
            }
        }
        return g;
    }

    public final void a0(Fragment fragment) {
        if (O(2)) {
            Objects.toString(fragment);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        v vVar = this.c;
        synchronized (vVar.a) {
            vVar.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (P(fragment)) {
            this.H = true;
        }
        fragment.mRemoving = true;
        l0(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(no8 no8Var, bo8 bo8Var, Fragment fragment) {
        t tVar;
        if (this.x != null) {
            a70.r("Already attached");
            return;
        }
        this.x = no8Var;
        this.y = bo8Var;
        this.z = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (fragment != null) {
            copyOnWriteArrayList.add(new zo8(fragment));
        } else if (no8Var instanceof lp8) {
            copyOnWriteArrayList.add((lp8) no8Var);
        }
        if (this.z != null) {
            o0();
        }
        if (no8Var instanceof vpd) {
            vpd vpdVar = (vpd) no8Var;
            upd onBackPressedDispatcher = vpdVar.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            u6b u6bVar = vpdVar;
            if (fragment != null) {
                u6bVar = fragment;
            }
            onBackPressedDispatcher.a(u6bVar, this.j);
        }
        int i = 0;
        if (fragment != null) {
            t tVar2 = fragment.mFragmentManager.P;
            HashMap hashMap = tVar2.c;
            tVar = (t) hashMap.get(fragment.mWho);
            if (tVar == null) {
                tVar = new t(tVar2.e);
                hashMap.put(fragment.mWho, tVar);
            }
            this.P = tVar;
        } else if (no8Var instanceof ttk) {
            stk viewModelStore = ((ttk) no8Var).getViewModelStore();
            viewModelStore.getClass();
            jy3 jy3Var = jy3.b;
            jy3Var.getClass();
            g7h g7hVar = new g7h(viewModelStore, t.h, jy3Var);
            KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(t.class);
            orCreateKotlinClass.getClass();
            String qualifiedName = orCreateKotlinClass.getQualifiedName();
            if (qualifiedName == null) {
                a70.p("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                tVar = (t) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                this.P = tVar;
            }
        } else {
            tVar = new t(false);
            this.P = tVar;
        }
        tVar.g = S();
        this.c.d = this.P;
        Object obj = this.x;
        int i2 = 3;
        if ((obj instanceof qqg) && fragment == null) {
            nqg savedStateRegistry = ((qqg) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new qb3(this, i2));
            Bundle a = savedStateRegistry.a("android:support:fragments");
            if (a != null) {
                c0(a);
            }
        }
        Object obj2 = this.x;
        if (obj2 instanceof me) {
            je activityResultRegistry = ((me) obj2).getActivityResultRegistry();
            String concat = "FragmentManager:".concat(fragment != null ? mz1.o(new StringBuilder(), fragment.mWho, ":") : "");
            int i3 = 1;
            this.D = activityResultRegistry.c(concat.concat("StartActivityForResult"), new ce(i2), new o(this, i3));
            this.E = activityResultRegistry.c(concat.concat("StartIntentSenderForResult"), new ce(5), new o(this, 2));
            this.F = activityResultRegistry.c(concat.concat("RequestPermissions"), new ce(i3), new o(this, i));
        }
        Object obj3 = this.x;
        if (obj3 instanceof xpd) {
            ((xpd) obj3).addOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof vqd) {
            ((vqd) obj4).addOnTrimMemoryListener(this.s);
        }
        Object obj5 = this.x;
        if (obj5 instanceof gqd) {
            ((gqd) obj5).addOnMultiWindowModeChangedListener(this.t);
        }
        Object obj6 = this.x;
        if (obj6 instanceof jqd) {
            ((jqd) obj6).addOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj7 = this.x;
        if ((obj7 instanceof yec) && fragment == null) {
            ((yec) obj7).addMenuProvider(this.v);
        }
    }

    public final void b0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            a70.r("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((a) arrayList.get(i)).r) {
                if (i2 != i) {
                    B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((a) arrayList.get(i2)).r) {
                        i2++;
                    }
                }
                B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(arrayList, arrayList2, i2, size);
        }
    }

    public final void c(Fragment fragment) {
        if (O(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (O(2)) {
                fragment.toString();
            }
            if (P(fragment)) {
                this.H = true;
            }
        }
    }

    public final void c0(Bundle bundle) {
        fp4 fp4Var;
        u uVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.x.b.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.x.b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        v vVar = this.c;
        HashMap hashMap2 = vVar.c;
        HashMap hashMap3 = vVar.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        hashMap3.clear();
        Iterator it = fragmentManagerState.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fp4Var = this.p;
            if (!hasNext) {
                break;
            }
            Bundle i = vVar.i(null, (String) it.next());
            if (i != null) {
                Fragment fragment = (Fragment) this.P.b.get(((FragmentState) i.getParcelable("state")).b);
                if (fragment != null) {
                    if (O(2)) {
                        fragment.toString();
                    }
                    uVar = new u(fp4Var, vVar, fragment, i);
                } else {
                    uVar = new u(this.p, this.c, this.x.b.getClassLoader(), M(), i);
                }
                Fragment fragment2 = uVar.c;
                fragment2.mSavedFragmentState = i;
                fragment2.mFragmentManager = this;
                if (O(2)) {
                    fragment2.toString();
                }
                uVar.j(this.x.b.getClassLoader());
                vVar.g(uVar);
                uVar.e = this.w;
            }
        }
        t tVar = this.P;
        tVar.getClass();
        Iterator it2 = new ArrayList(tVar.b.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) == null) {
                if (O(2)) {
                    fragment3.toString();
                    Objects.toString(fragmentManagerState.a);
                }
                this.P.h(fragment3);
                fragment3.mFragmentManager = this;
                u uVar2 = new u(fp4Var, vVar, fragment3);
                uVar2.e = 1;
                uVar2.i();
                fragment3.mRemoving = true;
                uVar2.i();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.b;
        vVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b = vVar.b(str3);
                if (b == null) {
                    a70.r(lnb.o("No instantiated fragment for (", str3, ")"));
                    return;
                } else {
                    if (O(2)) {
                        b.toString();
                    }
                    vVar.a(b);
                }
            }
        }
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList(fragmentManagerState.c.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i2];
                ArrayList arrayList2 = backStackRecordState.b;
                a aVar = new a(this);
                backStackRecordState.a(aVar);
                aVar.v = backStackRecordState.g;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    String str4 = (String) arrayList2.get(i3);
                    if (str4 != null) {
                        ((fq8) aVar.c.get(i3)).b = vVar.b(str4);
                    }
                }
                aVar.d(1);
                if (O(2)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new xib());
                    aVar.j("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i2++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(fragmentManagerState.d);
        String str5 = fragmentManagerState.e;
        if (str5 != null) {
            Fragment b2 = vVar.b(str5);
            this.A = b2;
            r(b2);
        }
        ArrayList arrayList3 = fragmentManagerState.f;
        if (arrayList3 != null) {
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                this.l.put((String) arrayList3.get(i4), (BackStackState) fragmentManagerState.g.get(i4));
            }
        }
        this.G = new ArrayDeque(fragmentManagerState.h);
    }

    public final void d() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final Bundle d0() {
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        H();
        w();
        z(true);
        this.I = true;
        this.P.g = true;
        v vVar = this.c;
        vVar.getClass();
        HashMap hashMap = vVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (u uVar : hashMap.values()) {
            if (uVar != null) {
                Fragment fragment = uVar.c;
                vVar.i(uVar.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (O(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.c.c;
        if (!hashMap2.isEmpty()) {
            v vVar2 = this.c;
            synchronized (vVar2.a) {
                try {
                    if (vVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(vVar2.a.size());
                        Iterator it = vVar2.a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = (Fragment) it.next();
                            arrayList.add(fragment2.mWho);
                            if (O(2)) {
                                fragment2.toString();
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((a) this.d.get(i));
                    if (O(2)) {
                        Objects.toString(this.d.get(i));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.e = null;
            ArrayList arrayList3 = new ArrayList();
            fragmentManagerState.f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.g = arrayList4;
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.k.get();
            Fragment fragment3 = this.A;
            if (fragment3 != null) {
                fragmentManagerState.e = fragment3.mWho;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            fragmentManagerState.h = new ArrayList(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.m.keySet()) {
                bundle.putBundle(dmi.q("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(dmi.q("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final HashSet e() {
        h hVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((u) it.next()).c.mContainer;
            if (viewGroup != null) {
                N().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof h) {
                    hVar = (h) tag;
                } else {
                    hVar = new h(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
                }
                hashSet.add(hVar);
            }
        }
        return hashSet;
    }

    public final Fragment.SavedState e0(Fragment fragment) {
        u uVar = (u) this.c.b.get(fragment.mWho);
        if (uVar != null) {
            Fragment fragment2 = uVar.c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(uVar.l());
                }
                return null;
            }
        }
        m0(new IllegalStateException(fc6.m("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((a) arrayList.get(i)).c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((fq8) it.next()).b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(h.j(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.c.removeCallbacks(this.Q);
                    this.x.c.post(this.Q);
                    o0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u g(Fragment fragment) {
        String str = fragment.mWho;
        v vVar = this.c;
        u uVar = (u) vVar.b.get(str);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this.p, vVar, fragment);
        uVar2.j(this.x.b.getClassLoader());
        uVar2.e = this.w;
        return uVar2;
    }

    public final void g0(Fragment fragment, boolean z) {
        ViewGroup L = L(fragment);
        if (L == null || !(L instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) L).setDrawDisappearingViewsLast(!z);
    }

    public final void h(Fragment fragment) {
        if (O(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (O(2)) {
                fragment.toString();
            }
            v vVar = this.c;
            synchronized (vVar.a) {
                vVar.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (P(fragment)) {
                this.H = true;
            }
            l0(fragment);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(Bundle bundle, String str) {
        bp8 bp8Var = (bp8) this.n.get(str);
        if (bp8Var != null) {
            if (bp8Var.a.b().compareTo(e6b.d) >= 0) {
                bp8Var.b(bundle, str);
                if (O(2)) {
                    return;
                }
                Objects.toString(bundle);
                return;
            }
        }
        this.m.put(str, bundle);
        if (O(2)) {
        }
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && (this.x instanceof xpd)) {
            m0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final void i0(String str, u6b u6bVar, op8 op8Var) {
        g6b lifecycle = u6bVar.getLifecycle();
        if (lifecycle.b() == e6b.a) {
            return;
        }
        yo8 yo8Var = new yo8(this, str, op8Var, lifecycle);
        bp8 bp8Var = (bp8) this.n.put(str, new bp8(lifecycle, op8Var, yo8Var));
        if (bp8Var != null) {
            bp8Var.a.d(bp8Var.c);
        }
        if (O(2)) {
            lifecycle.toString();
            Objects.toString(op8Var);
        }
        lifecycle.a(yo8Var);
    }

    public final boolean j(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void j0(Fragment fragment, e6b e6bVar) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = e6bVar;
        } else {
            yhk.m("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment2 = (Fragment) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                yhk.m("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.A;
        this.A = fragment;
        r(fragment2);
        r(this.A);
    }

    public final void l() {
        boolean z = true;
        this.K = true;
        z(true);
        w();
        no8 no8Var = this.x;
        boolean z2 = no8Var instanceof ttk;
        v vVar = this.c;
        if (z2) {
            z = vVar.d.f;
        } else {
            Context context = no8Var.b;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).a.iterator();
                while (it2.hasNext()) {
                    vVar.d.g((String) it2.next(), false);
                }
            }
        }
        u(-1);
        Object obj = this.x;
        if (obj instanceof vqd) {
            ((vqd) obj).removeOnTrimMemoryListener(this.s);
        }
        Object obj2 = this.x;
        if (obj2 instanceof xpd) {
            ((xpd) obj2).removeOnConfigurationChangedListener(this.r);
        }
        Object obj3 = this.x;
        if (obj3 instanceof gqd) {
            ((gqd) obj3).removeOnMultiWindowModeChangedListener(this.t);
        }
        Object obj4 = this.x;
        if (obj4 instanceof jqd) {
            ((jqd) obj4).removeOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj5 = this.x;
        if ((obj5 instanceof yec) && this.z == null) {
            ((yec) obj5).removeMenuProvider(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        ie ieVar = this.D;
        if (ieVar != null) {
            ieVar.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void l0(Fragment fragment) {
        ViewGroup L = L(fragment);
        if (L != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (L.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    L.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) L.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void m(boolean z) {
        if (z && (this.x instanceof vqd)) {
            m0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void m0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new xib());
        no8 no8Var = this.x;
        try {
            if (no8Var != null) {
                ((wn8) no8Var).e.dump("  ", null, printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final void n(boolean z, boolean z2) {
        if (z2 && (this.x instanceof gqd)) {
            m0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.n(z, true);
                }
            }
        }
    }

    public final void n0(ap8 ap8Var) {
        fp4 fp4Var = this.p;
        fp4Var.getClass();
        ap8Var.getClass();
        synchronized (((CopyOnWriteArrayList) fp4Var.c)) {
            try {
                int size = ((CopyOnWriteArrayList) fp4Var.c).size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((qo8) ((CopyOnWriteArrayList) fp4Var.c).get(i)).a == ap8Var) {
                        ((CopyOnWriteArrayList) fp4Var.c).remove(i);
                        break;
                    }
                    i++;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final void o0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.f(true);
                    if (O(3)) {
                        toString();
                    }
                } else {
                    boolean z = J() > 0 && R(this.z);
                    if (O(3)) {
                        toString();
                    }
                    this.j.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.w < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        if (z2 && (this.x instanceof jqd)) {
            m0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.s(z, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.z;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            no8 no8Var = this.x;
            if (no8Var != null) {
                sb.append(no8Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (u uVar : this.c.b.values()) {
                if (uVar != null) {
                    uVar.e = i;
                }
            }
            T(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((h) it.next()).i();
            }
            this.b = false;
            z(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String y = dmi.y(str, "    ");
        v vVar = this.c;
        ArrayList arrayList = vVar.a;
        String y2 = dmi.y(str, "    ");
        HashMap hashMap = vVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (u uVar : hashMap.values()) {
                printWriter.print(str);
                if (uVar != null) {
                    Fragment fragment = uVar.c;
                    printWriter.println(fragment);
                    fragment.dump(y2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment3 = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                a aVar = (a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(y, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (dp8) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((h) it.next()).i();
        }
    }

    public final void x(dp8 dp8Var, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (this.K) {
                    a70.r("FragmentManager has been destroyed");
                    return;
                } else {
                    a70.r("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (S()) {
                a70.r("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(dp8Var);
                    f0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z) {
        if (this.b) {
            a70.r("FragmentManager is already executing transactions");
            return;
        }
        if (this.x == null) {
            if (this.K) {
                a70.r("FragmentManager has been destroyed");
                return;
            } else {
                a70.r("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.x.c.getLooper()) {
            a70.r("Must be called from main thread of fragment host");
            return;
        }
        if (!z && S()) {
            a70.r("Can not perform this action after onSaveInstanceState");
        } else if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public final boolean z(boolean z) {
        boolean z2;
        ArrayList arrayList;
        a aVar;
        y(z);
        if (!this.i && (aVar = this.h) != null) {
            aVar.u = false;
            aVar.e();
            if (O(3)) {
                Objects.toString(this.h);
                Objects.toString(this.a);
            }
            this.h.g(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((fq8) it.next()).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.M;
            ArrayList arrayList3 = this.N;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            z2 |= ((dp8) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.x.c.removeCallbacks(this.Q);
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            this.b = true;
            try {
                b0(this.M, this.N);
                d();
                z3 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        o0();
        if (this.L) {
            this.L = false;
            Iterator it2 = this.c.d().iterator();
            while (it2.hasNext()) {
                u uVar = (u) it2.next();
                Fragment fragment2 = uVar.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        uVar.i();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z3;
    }
}
