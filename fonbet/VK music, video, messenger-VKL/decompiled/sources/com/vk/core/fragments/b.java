package com.vk.core.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.a;
import com.vk.core.fragments.b;
import com.vk.core.fragments.internal.data.FragmentNavigationControllerState;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.core.fragments.internal.stack.FStackGroup;
import com.vk.core.serialize.Serializer;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.movika.sdk.base.observable.e0;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ayo;
import xsna.bpn0;
import xsna.c5g;
import xsna.cg1;
import xsna.cor;
import xsna.epx;
import xsna.eu2;
import xsna.f53;
import xsna.g5g;
import xsna.gb;
import xsna.gzs;
import xsna.i5;
import xsna.i5g;
import xsna.izs;
import xsna.k49;
import xsna.kcs;
import xsna.lcs;
import xsna.mh3;
import xsna.oi90;
import xsna.or50;
import xsna.ozl;
import xsna.p1p0;
import xsna.p5;
import xsna.pro0;
import xsna.rl3;
import xsna.rli0;
import xsna.s3q0;
import xsna.ui90;
import xsna.vbs;
import xsna.vd1;
import xsna.wcg;
import xsna.wy50;
import xsna.wzs;
import xsna.xas;
import xsna.xq1;
import xsna.xsq;

/* compiled from: FragmentNavigationControllerImpl.kt */
/* loaded from: classes.dex */
public final class b implements com.vk.core.fragments.a {
    public final vbs a;
    public final kcs b;
    public final a.InterfaceC0769a c;
    public final a d;
    public FragmentNavigationControllerState e;
    public final lcs f;
    public final c g;
    public final f h;
    public final wy50 i;
    public final ArrayList<gzs<s3q0>> j;
    public final int k;
    public final bpn0 l;

    /* compiled from: FragmentNavigationControllerImpl.kt */
    public static final class a implements xas {
        @Override // xsna.xas
        public final boolean a(FragmentEntry fragmentEntry, FragmentEntry fragmentEntry2) {
            return epx.f(fragmentEntry != null ? fragmentEntry.b : null, fragmentEntry2 != null ? fragmentEntry2.b : null);
        }
    }

    /* compiled from: FragmentNavigationControllerImpl.kt */
    /* renamed from: com.vk.core.fragments.b$b, reason: collision with other inner class name */
    /* loaded from: classes17.dex */
    public static final class C0770b {
        public final int a;
        public final Intent b;

        public C0770b(int i, Intent intent) {
            this.a = i;
            this.b = intent;
        }

        public final int a() {
            return this.a;
        }

        public final Intent b() {
            return this.b;
        }
    }

    /* compiled from: FragmentNavigationControllerImpl.kt */
    public interface c {
        void a(FragmentEntry fragmentEntry, boolean z, or50 or50Var, gb gbVar);
    }

    /* compiled from: FragmentNavigationControllerImpl.kt */
    /* loaded from: classes17.dex */
    public final class d implements c {
        public d() {
        }

        @Override // com.vk.core.fragments.b.c
        public final void a(final FragmentEntry fragmentEntry, final boolean z, final or50 or50Var, final gb gbVar) {
            final b bVar = b.this;
            bVar.L(new gzs() { // from class: xsna.ecs
                @Override // xsna.gzs
                public final Object invoke() {
                    FragmentEntry Kn;
                    Object obj;
                    com.vk.core.fragments.b bVar2 = com.vk.core.fragments.b.this;
                    FragmentNavigationControllerState fragmentNavigationControllerState = bVar2.e;
                    vbs vbsVar = bVar2.a;
                    FStack Ob = fragmentNavigationControllerState.c.Ob();
                    int size = Ob.c.size();
                    FragmentImpl c = com.vk.core.fragments.b.c(bVar2, or50Var);
                    FragmentEntry Kn2 = c != null ? c.Kn() : null;
                    FStack Db = bVar2.e.c.Db(Kn2);
                    FragmentEntry fragmentEntry2 = fragmentEntry;
                    if (Kn2 != null) {
                        if ((Db != null ? Db.b : null) != null) {
                            Kn2.c.putAll(fragmentEntry2.c);
                            boolean Mb = bVar2.e.c.Mb(Db.b, new com.vk.core.fragments.c(2, bVar2.d, xas.class, "areFragmentsEquals", "areFragmentsEquals(Lcom/vk/core/fragments/FragmentEntry;Lcom/vk/core/fragments/FragmentEntry;)Z", 0));
                            if (z) {
                                LinkedList Ab = bVar2.e.c.Ab(Kn2);
                                vbsVar.c();
                                com.vk.core.fragments.b bVar3 = com.vk.core.fragments.b.this;
                                Iterator it = Ab.iterator();
                                while (it.hasNext()) {
                                    FragmentImpl b = vbsVar.b(((FragmentEntry) it.next()).d);
                                    if (b != null && (Kn = b.Kn()) != null) {
                                        Iterator<T> it2 = bVar3.e.b.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it2.next();
                                            if (epx.f(((LaunchForResultInfo) obj).c, Kn.d)) {
                                                break;
                                            }
                                        }
                                        LaunchForResultInfo launchForResultInfo = (LaunchForResultInfo) obj;
                                        if (launchForResultInfo != null) {
                                            bVar3.e.b.remove(launchForResultInfo);
                                        }
                                        bVar3.K(Kn);
                                        bVar3.e.c.Fb(Kn);
                                        bVar3.J();
                                    }
                                }
                                vbsVar.d();
                            } else {
                                bVar2.e.c.Hb(Kn2);
                            }
                            vbsVar.c();
                            FragmentImpl d = bVar2.d(Kn2, null);
                            bVar2.f(vbsVar);
                            gbVar.invoke(d);
                            if (Mb) {
                                FStack Ob2 = bVar2.e.c.Ob();
                                bVar2.I(Ob2.b, Ob != Ob2, size, Ob2.c.size());
                            }
                            return s3q0.a;
                        }
                    }
                    bVar2.q(fragmentEntry2);
                    return s3q0.a;
                }
            });
        }
    }

    /* compiled from: FragmentNavigationControllerImpl.kt */
    @ozl
    public final class e implements c {
        public e() {
        }

        @Override // com.vk.core.fragments.b.c
        public final void a(final FragmentEntry fragmentEntry, final boolean z, final or50 or50Var, final gb gbVar) {
            final b bVar = b.this;
            bVar.L(new gzs(or50Var, fragmentEntry, z, this, gbVar) { // from class: xsna.fcs
                public final /* synthetic */ or50 c;
                public final /* synthetic */ FragmentEntry d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gb f;

                {
                    this.f = gbVar;
                }

                @Override // xsna.gzs
                public final Object invoke() {
                    com.vk.core.fragments.a aVar;
                    com.vk.core.fragments.b bVar2 = com.vk.core.fragments.b.this;
                    FragmentNavigationControllerState fragmentNavigationControllerState = bVar2.e;
                    vbs vbsVar = bVar2.a;
                    FStack Ob = fragmentNavigationControllerState.c.Ob();
                    int size = Ob.c.size();
                    FragmentImpl c = com.vk.core.fragments.b.c(bVar2, this.c);
                    FragmentEntry Kn = c != null ? c.Kn() : null;
                    FStack Db = bVar2.e.c.Db(Kn);
                    FragmentEntry fragmentEntry2 = this.d;
                    if (Kn != null) {
                        if ((Db != null ? Db.b : null) != null) {
                            Kn.c.putAll(fragmentEntry2.c);
                            bVar2.e.c.Mb(Db.b, new com.vk.core.fragments.d(2, bVar2.d, xas.class, "areFragmentsEquals", "areFragmentsEquals(Lcom/vk/core/fragments/FragmentEntry;Lcom/vk/core/fragments/FragmentEntry;)Z", 0));
                            if (this.e) {
                                LinkedList Ab = bVar2.e.c.Ab(Kn);
                                vbsVar.c();
                                Iterator it = Ab.iterator();
                                while (it.hasNext()) {
                                    FragmentImpl b = vbsVar.b(((FragmentEntry) it.next()).d);
                                    if (b != null && (aVar = vbsVar.h) != null) {
                                        aVar.G(b);
                                    }
                                }
                                vbsVar.d();
                            } else {
                                bVar2.e.c.Hb(Kn);
                            }
                            vbsVar.c();
                            FragmentImpl d = bVar2.d(Kn, null);
                            bVar2.f(vbsVar);
                            this.f.invoke(d);
                            FStack Db2 = bVar2.e.c.Db(Kn);
                            if (!epx.f(Db.b, Db2 != null ? Db2.b : null)) {
                                FStack Ob2 = bVar2.e.c.Ob();
                                bVar2.I(Ob2.b, Ob != Ob2, size, Ob2.c.size());
                            }
                            return s3q0.a;
                        }
                    }
                    bVar2.q(fragmentEntry2);
                    return s3q0.a;
                }
            });
        }
    }

    /* compiled from: FragmentNavigationControllerImpl.kt */
    public final class f {
        public f() {
        }
    }

    /* compiled from: FragmentNavigationControllerImpl.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements wzs<FragmentEntry, FragmentEntry, Boolean> {
        @Override // xsna.wzs
        public final Boolean invoke(FragmentEntry fragmentEntry, FragmentEntry fragmentEntry2) {
            return Boolean.valueOf(((xas) this.receiver).a(fragmentEntry, fragmentEntry2));
        }
    }

    /* compiled from: FragmentNavigationControllerImpl.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements wzs<FragmentEntry, FragmentEntry, Boolean> {
        @Override // xsna.wzs
        public final Boolean invoke(FragmentEntry fragmentEntry, FragmentEntry fragmentEntry2) {
            return Boolean.valueOf(((xas) this.receiver).a(fragmentEntry, fragmentEntry2));
        }
    }

    public b(vbs vbsVar, ArrayList arrayList, kcs kcsVar, a.InterfaceC0769a interfaceC0769a) {
        a aVar = new a();
        this.a = vbsVar;
        this.b = kcsVar;
        this.c = interfaceC0769a;
        this.d = aVar;
        this.e = new FragmentNavigationControllerState(arrayList, false, false);
        this.f = new lcs();
        this.g = p1p0.a(com.vk.toggle.b.A.i(CoreFeatures.FIX_CLEAR_TOP_NAV)) ? new d() : new e();
        this.h = new f();
        this.i = new wy50(kcsVar);
        this.j = new ArrayList<>();
        this.k = -1;
        this.l = new bpn0(new f53(this, 7));
        vbsVar.h = this;
    }

    public static final FragmentImpl c(b bVar, or50 or50Var) {
        Object obj;
        Iterator<T> it = bVar.a.a.c.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) or50Var.invoke(obj)).booleanValue()) {
                break;
            }
        }
        if (obj instanceof FragmentImpl) {
            return (FragmentImpl) obj;
        }
        return null;
    }

    @Override // com.vk.core.fragments.a
    public final boolean A(Class<? extends FragmentImpl> cls) {
        Object obj;
        Iterator<T> it = b.this.e.c.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((FStack) obj).b.b, cls)) {
                break;
            }
        }
        return obj != null;
    }

    @Override // com.vk.core.fragments.a
    public final void B() {
        C(new xsq(2), true);
    }

    @Override // com.vk.core.fragments.a
    public final void C(final izs izsVar, final boolean z) {
        L(new gzs() { // from class: xsna.bcs
            @Override // xsna.gzs
            public final Object invoke() {
                izs izsVar2 = izsVar;
                com.vk.core.fragments.b bVar = com.vk.core.fragments.b.this;
                vbs vbsVar = bVar.a;
                vbsVar.c();
                try {
                    LinkedList<FragmentEntry> linkedList = new LinkedList<>();
                    bVar.e.c.zb(linkedList);
                    if (z) {
                        Iterator<T> it = bVar.e.c.b.iterator();
                        while (it.hasNext()) {
                            linkedList.add(((FStack) it.next()).b);
                        }
                    }
                    for (FragmentEntry fragmentEntry : linkedList) {
                        if (((Boolean) izsVar2.invoke(fragmentEntry)).booleanValue()) {
                            g5g.D(bVar.e.b, true, new sop(fragmentEntry, 6));
                            FragmentImpl b = vbsVar.b(fragmentEntry.d);
                            if (b != null) {
                                vbsVar.k(b);
                            }
                            bVar.e.c.Fb(fragmentEntry);
                            if (epx.f(bVar.e.d, fragmentEntry)) {
                                bVar.e.d = null;
                            }
                        }
                    }
                    bVar.f(vbsVar);
                    bVar.e.c.Gb();
                    FragmentNavigationControllerState fragmentNavigationControllerState = bVar.e;
                    if (fragmentNavigationControllerState.d != null || fragmentNavigationControllerState.c.Ob().c.isEmpty()) {
                        FragmentEntry fragmentEntry2 = bVar.e.d;
                        if (fragmentEntry2 != null) {
                            bVar.d(fragmentEntry2, null);
                        }
                    } else {
                        bVar.k(bVar.e.c.Ob().b, false);
                    }
                    return s3q0.a;
                } catch (Throwable th) {
                    bVar.f(vbsVar);
                    throw th;
                }
            }
        });
    }

    @Override // com.vk.core.fragments.a
    public final void D(final FragmentImpl fragmentImpl, final FragmentEntry fragmentEntry, final int i) {
        L(new gzs() { // from class: xsna.ccs
            @Override // xsna.gzs
            public final Object invoke() {
                com.vk.core.fragments.b bVar = com.vk.core.fragments.b.this;
                FStackGroup fStackGroup = bVar.e.c;
                FragmentEntry fragmentEntry2 = fragmentEntry;
                boolean Nb = fStackGroup.Nb(fragmentEntry2.e);
                bVar.e.c.b.getFirst().Bb(fragmentEntry2);
                vbs vbsVar = bVar.a;
                vbsVar.c();
                Bundle arguments = bVar.d(fragmentEntry2, null).getArguments();
                if (arguments != null) {
                    arguments.putBoolean("_fragment_impl_key_started_for_result", true);
                }
                bVar.f(vbsVar);
                Serializer.c<FragmentEntry> cVar = FragmentEntry.CREATOR;
                String a2 = FragmentEntry.a.a(fragmentImpl);
                if (a2 != null) {
                    bVar.e.b.add(new LaunchForResultInfo(a2, fragmentEntry2.d, i));
                }
                if (Nb) {
                    bVar.b.b(bVar.e.c.Ob().b);
                }
                bVar.e();
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.core.fragments.a
    public final boolean E(FragmentImpl fragmentImpl) {
        FStack Db = this.e.c.Db(fragmentImpl.Kn());
        if (Db == null || Db.c.size() != 1) {
            return false;
        }
        FragmentEntry Cb = Db.Cb();
        return epx.f(Cb != null ? Cb.b : null, fragmentImpl.getClass());
    }

    @Override // com.vk.core.fragments.a
    public final ArrayList F() {
        LinkedList<FStack> linkedList = this.e.c.b;
        ArrayList arrayList = new ArrayList(c5g.u(linkedList, 10));
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((FStack) it.next()).b);
        }
        return arrayList;
    }

    @Override // com.vk.core.fragments.a
    public final void G(FragmentImpl fragmentImpl) {
        L(new mh3(7, this, fragmentImpl));
    }

    @Override // com.vk.core.fragments.a
    public final void H(ArrayList arrayList) {
        b bVar = b.this;
        bVar.B();
        bVar.L(new i5(14, bVar, arrayList));
    }

    public final void I(FragmentEntry fragmentEntry, boolean z, int i, int i2) {
        kcs kcsVar = this.b;
        kcsVar.b(fragmentEntry);
        if (!z || i <= 0) {
            return;
        }
        kcsVar.h(fragmentEntry, i != i2, i2 == 1);
    }

    public final boolean J() {
        ArrayList<gzs<s3q0>> arrayList = this.j;
        if (arrayList.isEmpty()) {
            return false;
        }
        vbs vbsVar = this.a;
        vbsVar.c();
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((gzs) it.next()).invoke();
        }
        vbsVar.d();
        return true;
    }

    public final C0770b K(FragmentEntry fragmentEntry) {
        if (fragmentEntry != null) {
            String str = fragmentEntry.d;
            vbs vbsVar = this.a;
            FragmentImpl b = vbsVar.b(str);
            if (b != null) {
                if (fragmentEntry.equals(this.e.d)) {
                    this.e.d = null;
                }
                vbsVar.k(b);
                return new C0770b(b.A, b.B);
            }
        }
        return null;
    }

    public final void L(gzs<s3q0> gzsVar) {
        pro0.a();
        ArrayList<gzs<s3q0>> arrayList = this.j;
        if (arrayList.isEmpty()) {
            gzsVar.invoke();
        } else {
            arrayList.add(gzsVar);
        }
    }

    @Override // com.vk.core.fragments.a
    public final void a(FragmentEntry fragmentEntry, boolean z, or50 or50Var, gb gbVar) {
        this.g.a(fragmentEntry, z, or50Var, gbVar);
    }

    @Override // com.vk.core.fragments.a
    public final boolean a0() {
        Object obj;
        Object obj2;
        FStack Ob = this.e.c.Ob();
        int size = Ob.c.size();
        if (!J()) {
            int Pb = this.e.c.Pb();
            if (Pb <= 0 || Pb == 1) {
                return false;
            }
            vbs vbsVar = this.a;
            vbsVar.c();
            FragmentEntry Ab = this.e.c.Ob().Ab();
            C0770b K = K(Ab);
            this.e.c.Gb();
            FragmentEntry Cb = this.e.c.Ob().Cb();
            Object obj3 = null;
            if (Cb == null) {
                J();
                this.b.b(null);
                f(vbsVar);
                return true;
            }
            FragmentImpl d2 = d(Cb, Ab);
            FStack Ob2 = this.e.c.Ob();
            I(Ob2.b, Ob != Ob2, size, Ob2.c.size());
            f(vbsVar);
            if (K != null) {
                Iterator<T> it = this.e.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((LaunchForResultInfo) obj).Ab(), Ab != null ? Ab.d : null)) {
                        break;
                    }
                }
                LaunchForResultInfo launchForResultInfo = (LaunchForResultInfo) obj;
                if (launchForResultInfo != null) {
                    FragmentImpl b = vbsVar.b(launchForResultInfo.zb());
                    if (b == null) {
                        b = d2.In().b(launchForResultInfo.zb());
                        if (b == null) {
                            Iterator<T> it2 = d2.In().a.c.f().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                Fragment fragment = (Fragment) obj2;
                                if (fragment instanceof FragmentImpl) {
                                    Serializer.c<FragmentEntry> cVar = FragmentEntry.CREATOR;
                                    if (epx.f(FragmentEntry.a.a((FragmentImpl) fragment), launchForResultInfo.zb())) {
                                        break;
                                    }
                                }
                            }
                            Fragment fragment2 = (Fragment) obj2;
                            if (fragment2 instanceof FragmentImpl) {
                                b = (FragmentImpl) fragment2;
                            }
                        }
                        if (b == null) {
                            Iterator it3 = d2.In().h().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next = it3.next();
                                if (((oi90) next).b(launchForResultInfo.zb()) != null) {
                                    obj3 = next;
                                    break;
                                }
                            }
                            oi90 oi90Var = (oi90) obj3;
                            if (oi90Var != null) {
                                b = (FragmentImpl) oi90Var.b(launchForResultInfo.zb());
                            }
                        }
                    }
                    if (b != null) {
                        b.onActivityResult(launchForResultInfo.Bb(), K.a(), K.b());
                    }
                    this.e.b.remove(launchForResultInfo);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // com.vk.core.fragments.a
    public final FragmentImpl b(String str) {
        return this.a.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FragmentImpl d(FragmentEntry fragmentEntry, FragmentEntry fragmentEntry2) {
        String str;
        FragmentImpl b;
        FragmentImpl fragmentImpl;
        FragmentEntry fragmentEntry3;
        FragmentEntry g2;
        List I;
        boolean z;
        FragmentImpl b2;
        FragmentImpl fragmentImpl2;
        boolean z2;
        FragmentImpl b3;
        BottomFragmentHandler bottomFragmentHandler;
        FragmentEntry fragmentEntry4 = this.e.d;
        vbs vbsVar = this.a;
        if (fragmentEntry2 != null) {
            b = vbsVar.b(fragmentEntry2.d);
        } else {
            if (epx.f(fragmentEntry, fragmentEntry4) || fragmentEntry4 == null || (str = fragmentEntry4.d) == null) {
                fragmentImpl = null;
                fragmentEntry3 = fragmentEntry4 != null ? fragmentEntry2 : fragmentEntry4;
                g2 = g(fragmentEntry);
                FragmentEntry g3 = g(fragmentEntry3);
                I = rl3.I(new Class[]{g2 == null ? g2.b : null, g3 == null ? g3.b : null});
                if (!I.isEmpty()) {
                    Iterator it = I.iterator();
                    while (it.hasNext()) {
                        if (!A((Class) it.next())) {
                            break;
                        }
                    }
                }
                if (!epx.f(g2, g(fragmentEntry3))) {
                    z = true;
                    b2 = vbsVar.b(fragmentEntry.d);
                    if (b2 == null) {
                        b2 = fragmentEntry.Ab();
                        vbsVar.a(this.c.a(b2), b2, fragmentEntry.d, z);
                    } else {
                        vbsVar.n(b2, fragmentImpl, z);
                        View view = b2.getView();
                        ViewParent parent = view != null ? view.getParent() : null;
                        TransitionManager.endTransitions(parent instanceof ViewGroup ? (ViewGroup) parent : null);
                    }
                    fragmentImpl2 = b2;
                    vbsVar.m(fragmentImpl2);
                    z2 = (fragmentEntry.c.getBoolean("_fragment_impl_key_hide_bottom_fragment", true) || epx.f(fragmentImpl2.Kn(), fragmentEntry4)) ? false : true;
                    if (com.vk.toggle.d.J() && (bottomFragmentHandler = (BottomFragmentHandler) this.l.getValue()) != null) {
                        bottomFragmentHandler.a(fragmentImpl, fragmentImpl2, fragmentEntry4, z2, fragmentEntry2 != null);
                    }
                    if (z2 && fragmentEntry4 != null && (b3 = vbsVar.b(fragmentEntry4.d)) != null) {
                        if (fragmentEntry4.equals(this.e.d)) {
                            this.e.d = null;
                        }
                        vbsVar.i(b3, fragmentImpl2, z);
                    }
                    this.e.d = fragmentEntry;
                    boolean z3 = fragmentEntry2 == null;
                    wy50 wy50Var = this.i;
                    wy50Var.c = z3;
                    wy50Var.b = new k49(wy50Var, fragmentImpl, fragmentImpl2, z3);
                    return fragmentImpl2;
                }
                z = false;
                b2 = vbsVar.b(fragmentEntry.d);
                if (b2 == null) {
                }
                fragmentImpl2 = b2;
                vbsVar.m(fragmentImpl2);
                if (fragmentEntry.c.getBoolean("_fragment_impl_key_hide_bottom_fragment", true)) {
                }
                if (com.vk.toggle.d.J()) {
                    bottomFragmentHandler.a(fragmentImpl, fragmentImpl2, fragmentEntry4, z2, fragmentEntry2 != null);
                }
                if (z2) {
                    if (fragmentEntry4.equals(this.e.d)) {
                    }
                    vbsVar.i(b3, fragmentImpl2, z);
                }
                this.e.d = fragmentEntry;
                if (fragmentEntry2 == null) {
                }
                wy50 wy50Var2 = this.i;
                wy50Var2.c = z3;
                wy50Var2.b = new k49(wy50Var2, fragmentImpl, fragmentImpl2, z3);
                return fragmentImpl2;
            }
            b = vbsVar.b(str);
        }
        fragmentImpl = b;
        if (fragmentEntry4 != null) {
        }
        g2 = g(fragmentEntry);
        FragmentEntry g32 = g(fragmentEntry3);
        I = rl3.I(new Class[]{g2 == null ? g2.b : null, g32 == null ? g32.b : null});
        if (!I.isEmpty()) {
        }
        if (!epx.f(g2, g(fragmentEntry3))) {
        }
        z = false;
        b2 = vbsVar.b(fragmentEntry.d);
        if (b2 == null) {
        }
        fragmentImpl2 = b2;
        vbsVar.m(fragmentImpl2);
        if (fragmentEntry.c.getBoolean("_fragment_impl_key_hide_bottom_fragment", true)) {
        }
        if (com.vk.toggle.d.J()) {
        }
        if (z2) {
        }
        this.e.d = fragmentEntry;
        if (fragmentEntry2 == null) {
        }
        wy50 wy50Var22 = this.i;
        wy50Var22.c = z3;
        wy50Var22.b = new k49(wy50Var22, fragmentImpl, fragmentImpl2, z3);
        return fragmentImpl2;
    }

    public final void e() {
        int size = this.e.c.Ob().c.size();
        int i = this.k;
        if (i == -1 || size <= i) {
            return;
        }
        FragmentEntry fragmentEntry = this.e.c.Ob().b;
        for (FragmentEntry fragmentEntry2 : this.e.c.Ob().zb()) {
            if (!fragmentEntry.b.getName().equals(fragmentEntry2.b.getName())) {
                FragmentImpl zb = fragmentEntry2.zb(this.a);
                if (zb != null) {
                    zb.finish();
                    return;
                }
                return;
            }
        }
    }

    public final void f(vbs vbsVar) {
        wy50 wy50Var = this.i;
        if (wy50Var.c) {
            vbsVar.d();
            k49 k49Var = wy50Var.b;
            if (k49Var != null) {
                k49Var.invoke();
            }
            wy50Var.b = null;
            return;
        }
        k49 k49Var2 = wy50Var.b;
        if (k49Var2 != null) {
            k49Var2.invoke();
        }
        wy50Var.b = null;
        vbsVar.d();
    }

    public final FragmentEntry g(FragmentEntry fragmentEntry) {
        Object obj = null;
        if (fragmentEntry == null) {
            return null;
        }
        Class<? extends FragmentImpl> cls = fragmentEntry.e;
        if (cls == null) {
            return fragmentEntry;
        }
        LinkedList<FStack> linkedList = this.e.c.b;
        ArrayList arrayList = new ArrayList(c5g.u(linkedList, 10));
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((FStack) it.next()).b);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (epx.f(((FragmentEntry) next).b, cls)) {
                obj = next;
                break;
            }
        }
        return (FragmentEntry) obj;
    }

    @Override // com.vk.core.fragments.a
    public final void h(Bundle bundle) {
        FragmentNavigationControllerState fragmentNavigationControllerState = this.e;
        this.f.getClass();
        com.vk.core.util.state.a.c(bundle, "_fragment_navigation_controller_key_state", fragmentNavigationControllerState);
        BottomFragmentHandler bottomFragmentHandler = (BottomFragmentHandler) this.l.getValue();
        if (bottomFragmentHandler != null) {
            bottomFragmentHandler.d(bundle);
        }
    }

    @Override // com.vk.core.fragments.a
    public final FragmentImpl i(Class<? extends FragmentImpl> cls) {
        LinkedList<FragmentEntry> linkedList = new LinkedList<>();
        this.e.c.zb(linkedList);
        FragmentImpl fragmentImpl = null;
        for (FragmentEntry fragmentEntry : linkedList) {
            boolean z = false;
            if (epx.f(fragmentEntry.b, cls) && (fragmentImpl = fragmentEntry.zb(this.a)) != null) {
                z = true;
            }
            if (z) {
                break;
            }
        }
        return fragmentImpl;
    }

    @Override // com.vk.core.fragments.a
    public final boolean j(ChatFragment chatFragment) {
        FStack Db = this.e.c.Db(chatFragment.Kn());
        if (Db == null) {
            return false;
        }
        FragmentEntry Cb = Db.Cb();
        return epx.f(Cb != null ? Cb.b : null, ChatFragment.class);
    }

    @Override // com.vk.core.fragments.a
    public final void k(final FragmentEntry fragmentEntry, final boolean z) {
        L(new gzs() { // from class: xsna.dcs
            @Override // xsna.gzs
            public final Object invoke() {
                com.vk.core.fragments.b bVar = com.vk.core.fragments.b.this;
                FStack Ob = bVar.e.c.Ob();
                int size = Ob.c.size();
                vbs vbsVar = bVar.a;
                vbsVar.c();
                b.a aVar = bVar.d;
                FragmentEntry fragmentEntry2 = bVar.e.c.Ob().b;
                FragmentEntry fragmentEntry3 = fragmentEntry;
                FragmentEntry fragmentEntry4 = null;
                if (!aVar.a(fragmentEntry2, fragmentEntry3) || bVar.e.c.Ob().c.isEmpty()) {
                    bVar.e.c.Mb(fragmentEntry3, new b.g(2, aVar, xas.class, "areFragmentsEquals", "areFragmentsEquals(Lcom/vk/core/fragments/FragmentEntry;Lcom/vk/core/fragments/FragmentEntry;)Z", 0));
                    FStack Ob2 = bVar.e.c.Ob();
                    FragmentEntry fragmentEntry5 = Ob2.b;
                    if (z) {
                        bVar.L(new wf9(Ob2, fragmentEntry5, bVar, 5));
                    }
                    if (Ob2.c.isEmpty()) {
                        Bundle bundle = new Bundle(fragmentEntry3.c);
                        fragmentEntry5.c.clear();
                        fragmentEntry5.c.putAll(bundle);
                        Ob2.Bb(fragmentEntry5);
                    }
                    bVar.d(Ob2.Cb(), null);
                } else {
                    FStack Ob3 = bVar.e.c.Ob();
                    LinkedList<FragmentEntry> linkedList = Ob3.c;
                    FragmentEntry fragmentEntry6 = Ob3.b;
                    if (!linkedList.isEmpty() && !epx.f(Ob3.Cb(), fragmentEntry6)) {
                        fragmentEntry4 = Ob3.Cb();
                    }
                    bVar.L(new wf9(Ob3, fragmentEntry6, bVar, 5));
                    if (linkedList.isEmpty()) {
                        Ob3.Bb(fragmentEntry6);
                    }
                    bVar.d(Ob3.Cb(), fragmentEntry4);
                }
                bVar.f(vbsVar);
                FStack Ob4 = bVar.e.c.Ob();
                bVar.I(Ob4.b, Ob != Ob4, size, Ob4.c.size());
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.core.fragments.a
    public final void l(Bundle bundle) {
        this.f.getClass();
        FragmentNavigationControllerState a2 = lcs.a(bundle);
        if (a2 != null) {
            this.e = a2;
        }
        BottomFragmentHandler bottomFragmentHandler = (BottomFragmentHandler) this.l.getValue();
        if (bottomFragmentHandler != null) {
            bottomFragmentHandler.c(bundle);
        }
    }

    @Override // com.vk.core.fragments.a
    public final FragmentImpl m() {
        FragmentEntry fragmentEntry = this.e.d;
        if (fragmentEntry != null) {
            return this.a.b(fragmentEntry.d);
        }
        return null;
    }

    @Override // com.vk.core.fragments.a
    public final void n(ArrayList arrayList, FragmentEntry fragmentEntry) {
        b bVar = b.this;
        vbs vbsVar = bVar.a;
        vbsVar.c();
        try {
            LinkedList linkedList = new LinkedList();
            for (FStack fStack : bVar.e.c.b) {
                if (epx.f(fragmentEntry.b, fStack.b.b)) {
                    linkedList.add(fStack);
                }
            }
            cor.a aVar = new cor.a(rli0.p(new i5g(linkedList), new vd1(19)));
            while (aVar.hasNext()) {
                FragmentEntry fragmentEntry2 = (FragmentEntry) aVar.next();
                g5g.D(bVar.e.b, true, new wcg(fragmentEntry2, 15));
                FragmentImpl zb = fragmentEntry2.zb(vbsVar);
                if (zb != null) {
                    vbsVar.k(zb);
                }
                bVar.e.c.Fb(fragmentEntry2);
            }
            bVar.f(vbsVar);
            bVar.L(new com.vk.newsfeed.common.recycler.holders.attachments.a(15, bVar, arrayList));
            bVar.J();
            FragmentNavigationControllerState fragmentNavigationControllerState = bVar.e;
            if (fragmentNavigationControllerState.d == null && !fragmentNavigationControllerState.c.Ob().c.isEmpty()) {
                bVar.k(bVar.e.c.Ob().b, false);
                return;
            }
            FragmentEntry fragmentEntry3 = bVar.e.d;
            if (fragmentEntry3 != null) {
                bVar.d(fragmentEntry3, null);
            }
        } catch (Throwable th) {
            bVar.f(vbsVar);
            bVar.L(new com.vk.newsfeed.common.recycler.holders.attachments.a(15, bVar, arrayList));
            bVar.J();
            throw th;
        }
    }

    @Override // com.vk.core.fragments.a
    public final FragmentImpl o() {
        return this.a.f(R.id.fragment_wrapper);
    }

    @Override // com.vk.core.fragments.a
    public final Class<? extends FragmentImpl> p(FragmentImpl fragmentImpl) {
        FragmentEntry fragmentEntry;
        FStack Db = this.e.c.Db(fragmentImpl.Kn());
        if (Db == null || (fragmentEntry = Db.b) == null) {
            return null;
        }
        return fragmentEntry.b;
    }

    @Override // com.vk.core.fragments.a
    public final void q(FragmentEntry fragmentEntry) {
        L(new xq1(6, this, fragmentEntry));
    }

    @Override // com.vk.core.fragments.a
    public final void r(eu2 eu2Var) {
        this.a.c = eu2Var;
    }

    @Override // com.vk.core.fragments.a
    public final boolean s(FragmentImpl fragmentImpl, boolean z) {
        FragmentEntry Cb;
        String str;
        FragmentImpl b;
        FStack Db = this.e.c.Db(fragmentImpl.Kn());
        if (Db == null) {
            return false;
        }
        FStack Ob = this.e.c.Ob();
        if (!z && Db.equals(Ob)) {
            return false;
        }
        vbs vbsVar = this.a;
        vbsVar.c();
        while (!Db.c.isEmpty() && !epx.f(Db.Cb(), Db.b) && (Cb = Db.Cb()) != null && (str = Cb.d) != null && (b = b(str)) != null) {
            G(b);
        }
        f(vbsVar);
        return true;
    }

    @Override // com.vk.core.fragments.a
    public final void t(ArrayList arrayList, boolean z) {
        f fVar = this.h;
        fVar.getClass();
        int size = arrayList.size();
        b bVar = b.this;
        FragmentNavigationControllerState fragmentNavigationControllerState = bVar.e;
        vbs vbsVar = bVar.a;
        if (size != fragmentNavigationControllerState.c.b.size() && z) {
            bVar.B();
            bVar.L(new i5(14, bVar, arrayList));
            return;
        }
        vbsVar.c();
        try {
            LinkedList linkedList = new LinkedList();
            for (FStack fStack : bVar.e.c.b) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((FragmentEntry) it.next()).b, fStack.b.b)) {
                            break;
                        }
                    }
                }
                linkedList.add(fStack);
            }
            cor.a aVar = new cor.a(rli0.p(new i5g(linkedList), new e0(21)));
            while (aVar.hasNext()) {
                FragmentEntry fragmentEntry = (FragmentEntry) aVar.next();
                g5g.D(bVar.e.b, true, new ayo(fragmentEntry, 4));
                FragmentImpl b = vbsVar.b(fragmentEntry.d);
                if (b != null) {
                    vbsVar.k(b);
                }
                bVar.e.c.Fb(fragmentEntry);
                if (epx.f(bVar.e.d, fragmentEntry)) {
                    bVar.e.d = null;
                }
            }
            bVar.f(vbsVar);
            bVar.L(new p5(10, bVar, arrayList));
            bVar.J();
            FragmentNavigationControllerState fragmentNavigationControllerState2 = bVar.e;
            if (fragmentNavigationControllerState2.d == null && !fragmentNavigationControllerState2.c.Ob().c.isEmpty()) {
                bVar.k(bVar.e.c.Ob().b, false);
                return;
            }
            FragmentEntry fragmentEntry2 = bVar.e.d;
            if (fragmentEntry2 != null) {
                bVar.d(fragmentEntry2, null);
            }
        } catch (Throwable th) {
            bVar.f(vbsVar);
            bVar.L(new p5(10, bVar, arrayList));
            bVar.J();
            throw th;
        }
    }

    @Override // com.vk.core.fragments.a
    public final void u(ui90.a aVar) {
        this.a.l(aVar);
    }

    @Override // com.vk.core.fragments.a
    public final int v() {
        return this.e.c.Pb();
    }

    @Override // com.vk.core.fragments.a
    public final void w(FragmentEntry fragmentEntry) {
        L(new cg1(13, this, fragmentEntry));
    }

    @Override // com.vk.core.fragments.a
    public final int x(FragmentImpl fragmentImpl) {
        Integer num;
        FragmentEntry Kn = fragmentImpl.Kn();
        if (Kn == null) {
            return -1;
        }
        Iterator<T> it = this.e.c.b.iterator();
        do {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            int indexOf = ((FStack) it.next()).c.indexOf(Kn);
            Integer valueOf = Integer.valueOf(indexOf);
            if (indexOf < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                num = Integer.valueOf((r1.c.size() - 1) - valueOf.intValue());
            }
        } while (num == null);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.vk.core.fragments.a
    public final boolean y(FragmentImpl fragmentImpl) {
        boolean f2;
        FStack Db = this.e.c.Db(fragmentImpl.Kn());
        FragmentEntry fragmentEntry = Db != null ? Db.b : null;
        if (Db == null || Db.c.size() <= 1) {
            FragmentEntry Kn = fragmentImpl.Kn();
            f2 = epx.f(Kn != null ? Kn.b : null, fragmentEntry != null ? fragmentEntry.b : null);
        } else {
            f2 = epx.f(fragmentImpl.Kn(), fragmentEntry);
        }
        return f2 || fragmentEntry == null;
    }

    @Override // com.vk.core.fragments.a
    public final void z(ui90.a aVar) {
        this.a.e.add(aVar);
        ui90.j();
    }
}
