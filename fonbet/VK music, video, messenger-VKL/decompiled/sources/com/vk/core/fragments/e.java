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
import com.vk.core.fragments.internal.data.FragmentNavigationControllerState;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.core.fragments.internal.stack.FStackGroup;
import com.vk.core.serialize.Serializer;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.movika.sdk.base.ui.k;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import defpackage.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bpn0;
import xsna.byo;
import xsna.c5g;
import xsna.cor;
import xsna.dnh;
import xsna.dp0;
import xsna.egg0;
import xsna.epx;
import xsna.eu2;
import xsna.g5g;
import xsna.gb;
import xsna.gzs;
import xsna.i5g;
import xsna.izs;
import xsna.j6;
import xsna.k49;
import xsna.kcs;
import xsna.l2k;
import xsna.lcs;
import xsna.mo0;
import xsna.nj;
import xsna.oi90;
import xsna.or50;
import xsna.ozl;
import xsna.p1p0;
import xsna.pro0;
import xsna.rl3;
import xsna.rli0;
import xsna.s3q0;
import xsna.t3h;
import xsna.tc;
import xsna.uh3;
import xsna.ui90;
import xsna.vbs;
import xsna.wy50;
import xsna.wzs;
import xsna.xas;
import xsna.zv;

/* compiled from: FragmentNavigationControllerImpl2.kt */
/* loaded from: classes17.dex */
public final class e implements com.vk.core.fragments.a {
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

    /* compiled from: FragmentNavigationControllerImpl2.kt */
    public static final class a implements xas {
        @Override // xsna.xas
        public final boolean a(FragmentEntry fragmentEntry, FragmentEntry fragmentEntry2) {
            return epx.f(fragmentEntry != null ? fragmentEntry.b : null, fragmentEntry2 != null ? fragmentEntry2.b : null);
        }
    }

    /* compiled from: FragmentNavigationControllerImpl2.kt */
    public static final class b {
        public final int a;
        public final Intent b;

        public b(int i, Intent intent) {
            this.a = i;
            this.b = intent;
        }
    }

    /* compiled from: FragmentNavigationControllerImpl2.kt */
    public interface c {
        void a(FragmentEntry fragmentEntry, boolean z, or50 or50Var, gb gbVar);
    }

    /* compiled from: FragmentNavigationControllerImpl2.kt */
    public final class d implements c {
        public d() {
        }

        @Override // com.vk.core.fragments.e.c
        public final void a(final FragmentEntry fragmentEntry, final boolean z, final or50 or50Var, final gb gbVar) {
            final e eVar = e.this;
            eVar.L(new gzs() { // from class: xsna.ics
                @Override // xsna.gzs
                public final Object invoke() {
                    FragmentEntry Kn;
                    Object obj;
                    com.vk.core.fragments.e eVar2 = com.vk.core.fragments.e.this;
                    FragmentNavigationControllerState fragmentNavigationControllerState = eVar2.e;
                    vbs vbsVar = eVar2.a;
                    FStack Ob = fragmentNavigationControllerState.c.Ob();
                    int size = Ob.c.size();
                    FragmentImpl c = com.vk.core.fragments.e.c(eVar2, or50Var);
                    FragmentEntry Kn2 = c != null ? c.Kn() : null;
                    FStack Db = eVar2.e.c.Db(Kn2);
                    FragmentEntry fragmentEntry2 = fragmentEntry;
                    if (Kn2 != null) {
                        if ((Db != null ? Db.b : null) != null) {
                            Kn2.c.putAll(fragmentEntry2.c);
                            boolean Mb = eVar2.e.c.Mb(Db.b, new com.vk.core.fragments.f(2, eVar2.d, xas.class, "areFragmentsEquals", "areFragmentsEquals(Lcom/vk/core/fragments/FragmentEntry;Lcom/vk/core/fragments/FragmentEntry;)Z", 0));
                            if (z) {
                                LinkedList Ab = eVar2.e.c.Ab(Kn2);
                                vbsVar.c();
                                com.vk.core.fragments.e eVar3 = com.vk.core.fragments.e.this;
                                Iterator it = Ab.iterator();
                                while (it.hasNext()) {
                                    FragmentImpl b = vbsVar.b(((FragmentEntry) it.next()).d);
                                    if (b != null && (Kn = b.Kn()) != null) {
                                        Iterator<T> it2 = eVar3.e.b.iterator();
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
                                            eVar3.e.b.remove(launchForResultInfo);
                                        }
                                        eVar3.K(Kn);
                                        eVar3.e.c.Fb(Kn);
                                        eVar3.J();
                                    }
                                }
                                vbsVar.d();
                            } else {
                                eVar2.e.c.Hb(Kn2);
                            }
                            vbsVar.c();
                            FragmentImpl d = eVar2.d(Kn2, null);
                            eVar2.f(vbsVar);
                            gbVar.invoke(d);
                            if (Mb) {
                                FStack Ob2 = eVar2.e.c.Ob();
                                eVar2.I(Ob2.b, Ob != Ob2, size, Ob2.c.size());
                            }
                            return s3q0.a;
                        }
                    }
                    eVar2.q(fragmentEntry2);
                    return s3q0.a;
                }
            });
        }
    }

    /* compiled from: FragmentNavigationControllerImpl2.kt */
    @ozl
    /* renamed from: com.vk.core.fragments.e$e, reason: collision with other inner class name */
    public final class C0771e implements c {
        public C0771e() {
        }

        @Override // com.vk.core.fragments.e.c
        public final void a(final FragmentEntry fragmentEntry, final boolean z, final or50 or50Var, final gb gbVar) {
            final e eVar = e.this;
            eVar.L(new gzs(or50Var, fragmentEntry, z, this, gbVar) { // from class: xsna.jcs
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
                    com.vk.core.fragments.e eVar2 = com.vk.core.fragments.e.this;
                    FragmentNavigationControllerState fragmentNavigationControllerState = eVar2.e;
                    vbs vbsVar = eVar2.a;
                    FStack Ob = fragmentNavigationControllerState.c.Ob();
                    int size = Ob.c.size();
                    FragmentImpl c = com.vk.core.fragments.e.c(eVar2, this.c);
                    FragmentEntry Kn = c != null ? c.Kn() : null;
                    FStack Db = eVar2.e.c.Db(Kn);
                    FragmentEntry fragmentEntry2 = this.d;
                    if (Kn != null) {
                        if ((Db != null ? Db.b : null) != null) {
                            Kn.c.putAll(fragmentEntry2.c);
                            eVar2.e.c.Mb(Db.b, new com.vk.core.fragments.g(2, eVar2.d, xas.class, "areFragmentsEquals", "areFragmentsEquals(Lcom/vk/core/fragments/FragmentEntry;Lcom/vk/core/fragments/FragmentEntry;)Z", 0));
                            if (this.e) {
                                LinkedList Ab = eVar2.e.c.Ab(Kn);
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
                                eVar2.e.c.Hb(Kn);
                            }
                            vbsVar.c();
                            FragmentImpl d = eVar2.d(Kn, null);
                            eVar2.f(vbsVar);
                            this.f.invoke(d);
                            FStack Db2 = eVar2.e.c.Db(Kn);
                            if (!epx.f(Db.b, Db2 != null ? Db2.b : null)) {
                                FStack Ob2 = eVar2.e.c.Ob();
                                eVar2.I(Ob2.b, Ob != Ob2, size, Ob2.c.size());
                            }
                            return s3q0.a;
                        }
                    }
                    eVar2.q(fragmentEntry2);
                    return s3q0.a;
                }
            });
        }
    }

    /* compiled from: FragmentNavigationControllerImpl2.kt */
    public final class f {
        public f() {
        }
    }

    /* compiled from: FragmentNavigationControllerImpl2.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements wzs<FragmentEntry, FragmentEntry, Boolean> {
        @Override // xsna.wzs
        public final Boolean invoke(FragmentEntry fragmentEntry, FragmentEntry fragmentEntry2) {
            return Boolean.valueOf(((xas) this.receiver).a(fragmentEntry, fragmentEntry2));
        }
    }

    /* compiled from: FragmentNavigationControllerImpl2.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements wzs<FragmentEntry, FragmentEntry, Boolean> {
        @Override // xsna.wzs
        public final Boolean invoke(FragmentEntry fragmentEntry, FragmentEntry fragmentEntry2) {
            return Boolean.valueOf(((xas) this.receiver).a(fragmentEntry, fragmentEntry2));
        }
    }

    public e(vbs vbsVar, ArrayList arrayList, boolean z, kcs kcsVar, a.InterfaceC0769a interfaceC0769a) {
        a aVar = new a();
        this.a = vbsVar;
        this.b = kcsVar;
        this.c = interfaceC0769a;
        this.d = aVar;
        this.e = new FragmentNavigationControllerState(arrayList, true, z);
        this.f = new lcs();
        this.g = p1p0.a(com.vk.toggle.b.A.i(CoreFeatures.FIX_CLEAR_TOP_NAV)) ? new d() : new C0771e();
        this.h = new f();
        this.i = new wy50(kcsVar);
        this.j = new ArrayList<>();
        this.k = -1;
        this.l = new bpn0(new dnh(this, 20));
        vbsVar.h = this;
    }

    public static final FragmentImpl c(e eVar, or50 or50Var) {
        Object obj;
        Iterator<T> it = eVar.a.a.c.f().iterator();
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
        Iterator<T> it = e.this.e.c.b.iterator();
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
        C(new tc(23), true);
    }

    @Override // com.vk.core.fragments.a
    public final void C(final izs izsVar, final boolean z) {
        L(new gzs() { // from class: xsna.gcs
            @Override // xsna.gzs
            public final Object invoke() {
                izs izsVar2 = izsVar;
                com.vk.core.fragments.e eVar = com.vk.core.fragments.e.this;
                vbs vbsVar = eVar.a;
                vbsVar.c();
                try {
                    LinkedList<FragmentEntry> linkedList = new LinkedList<>();
                    eVar.e.c.zb(linkedList);
                    if (z) {
                        Iterator<T> it = eVar.e.c.b.iterator();
                        while (it.hasNext()) {
                            linkedList.add(((FStack) it.next()).b);
                        }
                    }
                    for (FragmentEntry fragmentEntry : linkedList) {
                        if (((Boolean) izsVar2.invoke(fragmentEntry)).booleanValue()) {
                            g5g.D(eVar.e.b, true, new z8f(fragmentEntry, 14));
                            FragmentImpl b2 = vbsVar.b(fragmentEntry.d);
                            if (b2 != null) {
                                vbsVar.k(b2);
                            }
                            eVar.e.c.Fb(fragmentEntry);
                            if (epx.f(eVar.e.d, fragmentEntry)) {
                                eVar.e.d = null;
                            }
                        }
                    }
                    eVar.f(vbsVar);
                    eVar.e.c.Gb();
                    FragmentNavigationControllerState fragmentNavigationControllerState = eVar.e;
                    if (fragmentNavigationControllerState.d != null || fragmentNavigationControllerState.c.Ob().c.isEmpty()) {
                        FragmentEntry fragmentEntry2 = eVar.e.d;
                        if (fragmentEntry2 != null) {
                            eVar.d(fragmentEntry2, null);
                        }
                    } else {
                        eVar.k(eVar.e.c.Ob().b, false);
                    }
                    return s3q0.a;
                } catch (Throwable th) {
                    eVar.f(vbsVar);
                    throw th;
                }
            }
        });
    }

    @Override // com.vk.core.fragments.a
    public final void D(final FragmentImpl fragmentImpl, final FragmentEntry fragmentEntry, final int i) {
        L(new gzs() { // from class: xsna.hcs
            @Override // xsna.gzs
            public final Object invoke() {
                com.vk.core.fragments.e eVar = com.vk.core.fragments.e.this;
                FStackGroup fStackGroup = eVar.e.c;
                FragmentEntry fragmentEntry2 = fragmentEntry;
                boolean Nb = fStackGroup.Nb(fragmentEntry2.e);
                eVar.e.c.b.getFirst().Bb(fragmentEntry2);
                vbs vbsVar = eVar.a;
                vbsVar.c();
                Bundle arguments = eVar.d(fragmentEntry2, null).getArguments();
                if (arguments != null) {
                    arguments.putBoolean("_fragment_impl_key_started_for_result", true);
                }
                eVar.f(vbsVar);
                Serializer.c<FragmentEntry> cVar = FragmentEntry.CREATOR;
                String a2 = FragmentEntry.a.a(fragmentImpl);
                if (a2 != null) {
                    eVar.e.b.add(new LaunchForResultInfo(a2, fragmentEntry2.d, i));
                }
                if (Nb) {
                    eVar.b.b(eVar.e.c.Ob().b);
                }
                eVar.e();
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
        L(new zv(10, this, fragmentImpl));
    }

    @Override // com.vk.core.fragments.a
    public final void H(ArrayList arrayList) {
        e eVar = e.this;
        eVar.B();
        eVar.L(new k(10, eVar, arrayList));
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

    public final b K(FragmentEntry fragmentEntry) {
        if (fragmentEntry != null) {
            String str = fragmentEntry.d;
            vbs vbsVar = this.a;
            FragmentImpl b2 = vbsVar.b(str);
            if (b2 != null) {
                if (fragmentEntry.equals(this.e.d)) {
                    this.e.d = null;
                }
                vbsVar.k(b2);
                return new b(b2.A, b2.B);
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
        FragmentEntry Ab;
        boolean z;
        Object obj;
        Object obj2;
        if (!J()) {
            FStack Kb = this.e.c.Kb();
            int size = Kb.c.size();
            if (size == 1 && !epx.f(Kb.Cb(), Kb.b)) {
                if (this.e.c.Jb() > 1) {
                    Ab = Kb.Ab();
                    this.e.c.Ib();
                    z = true;
                }
                return false;
            }
            if (size <= 1) {
                if (this.e.c.Jb() > 1) {
                    Ab = Kb.Cb();
                    this.e.c.Ib();
                    z = false;
                }
                return false;
            }
            Ab = Kb.Ab();
            z = true;
            vbs vbsVar = this.a;
            vbsVar.c();
            Object obj3 = null;
            b K = z ? K(Ab) : null;
            FStack Kb2 = this.e.c.Kb();
            LinkedList<FragmentEntry> linkedList = Kb2.c;
            FragmentEntry fragmentEntry = Kb2.b;
            FragmentEntry Cb = linkedList.isEmpty() ? fragmentEntry : Kb2.Cb();
            if (Cb == null) {
                J();
                this.b.b(null);
                f(vbsVar);
                return true;
            }
            FragmentImpl d2 = d(Cb, Ab);
            I(fragmentEntry, Kb != Kb2, size, Kb2.c.size());
            f(vbsVar);
            if (K != null) {
                Iterator<T> it = this.e.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((LaunchForResultInfo) obj).c, Ab != null ? Ab.d : null)) {
                        break;
                    }
                }
                LaunchForResultInfo launchForResultInfo = (LaunchForResultInfo) obj;
                if (launchForResultInfo != null) {
                    String str = launchForResultInfo.b;
                    FragmentImpl b2 = vbsVar.b(str);
                    if (b2 == null) {
                        b2 = d2.In().b(str);
                        if (b2 == null) {
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
                                    if (epx.f(FragmentEntry.a.a((FragmentImpl) fragment), str)) {
                                        break;
                                    }
                                }
                            }
                            Fragment fragment2 = (Fragment) obj2;
                            if (fragment2 instanceof FragmentImpl) {
                                b2 = (FragmentImpl) fragment2;
                            }
                        }
                        if (b2 == null) {
                            Iterator it3 = d2.In().h().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next = it3.next();
                                if (((oi90) next).b(str) != null) {
                                    obj3 = next;
                                    break;
                                }
                            }
                            oi90 oi90Var = (oi90) obj3;
                            if (oi90Var != null) {
                                b2 = (FragmentImpl) oi90Var.b(str);
                            }
                        }
                    }
                    if (b2 != null) {
                        b2.onActivityResult(launchForResultInfo.d, K.a, K.b);
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
        FragmentImpl b2;
        FragmentImpl fragmentImpl;
        FragmentEntry fragmentEntry3;
        FragmentEntry g2;
        List I;
        boolean z;
        FragmentImpl b3;
        FragmentImpl fragmentImpl2;
        boolean z2;
        FragmentImpl b4;
        BottomFragmentHandler bottomFragmentHandler;
        FragmentEntry fragmentEntry4 = this.e.d;
        vbs vbsVar = this.a;
        if (fragmentEntry2 != null) {
            b2 = vbsVar.b(fragmentEntry2.d);
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
                    b3 = vbsVar.b(fragmentEntry.d);
                    if (b3 == null) {
                        b3 = fragmentEntry.Ab();
                        vbsVar.a(this.c.a(b3), b3, fragmentEntry.d, z);
                    } else {
                        vbsVar.n(b3, fragmentImpl, z);
                        View view = b3.getView();
                        ViewParent parent = view != null ? view.getParent() : null;
                        TransitionManager.endTransitions(parent instanceof ViewGroup ? (ViewGroup) parent : null);
                    }
                    fragmentImpl2 = b3;
                    vbsVar.m(fragmentImpl2);
                    z2 = (fragmentEntry.c.getBoolean("_fragment_impl_key_hide_bottom_fragment", true) || epx.f(fragmentImpl2.Kn(), fragmentEntry4)) ? false : true;
                    if (com.vk.toggle.d.J() && (bottomFragmentHandler = (BottomFragmentHandler) this.l.getValue()) != null) {
                        bottomFragmentHandler.a(fragmentImpl, fragmentImpl2, fragmentEntry4, z2, fragmentEntry2 != null);
                    }
                    if (z2 && fragmentEntry4 != null && (b4 = vbsVar.b(fragmentEntry4.d)) != null) {
                        if (fragmentEntry4.equals(this.e.d)) {
                            this.e.d = null;
                        }
                        vbsVar.i(b4, fragmentImpl2, z);
                    }
                    this.e.d = fragmentEntry;
                    boolean z3 = fragmentEntry2 == null;
                    wy50 wy50Var = this.i;
                    wy50Var.c = z3;
                    wy50Var.b = new k49(wy50Var, fragmentImpl, fragmentImpl2, z3);
                    return fragmentImpl2;
                }
                z = false;
                b3 = vbsVar.b(fragmentEntry.d);
                if (b3 == null) {
                }
                fragmentImpl2 = b3;
                vbsVar.m(fragmentImpl2);
                if (fragmentEntry.c.getBoolean("_fragment_impl_key_hide_bottom_fragment", true)) {
                }
                if (com.vk.toggle.d.J()) {
                    bottomFragmentHandler.a(fragmentImpl, fragmentImpl2, fragmentEntry4, z2, fragmentEntry2 != null);
                }
                if (z2) {
                    if (fragmentEntry4.equals(this.e.d)) {
                    }
                    vbsVar.i(b4, fragmentImpl2, z);
                }
                this.e.d = fragmentEntry;
                if (fragmentEntry2 == null) {
                }
                wy50 wy50Var2 = this.i;
                wy50Var2.c = z3;
                wy50Var2.b = new k49(wy50Var2, fragmentImpl, fragmentImpl2, z3);
                return fragmentImpl2;
            }
            b2 = vbsVar.b(str);
        }
        fragmentImpl = b2;
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
        b3 = vbsVar.b(fragmentEntry.d);
        if (b3 == null) {
        }
        fragmentImpl2 = b3;
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
    public final void k(FragmentEntry fragmentEntry, boolean z) {
        L(new mo0(this, fragmentEntry, z));
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
        e eVar = e.this;
        vbs vbsVar = eVar.a;
        vbsVar.c();
        try {
            LinkedList linkedList = new LinkedList();
            for (FStack fStack : eVar.e.c.b) {
                if (epx.f(fragmentEntry.b, fStack.b.b)) {
                    linkedList.add(fStack);
                }
            }
            cor.a aVar = new cor.a(rli0.p(new i5g(linkedList), new byo(3)));
            while (aVar.hasNext()) {
                FragmentEntry fragmentEntry2 = (FragmentEntry) aVar.next();
                g5g.D(eVar.e.b, true, new l2k(fragmentEntry2, 12));
                FragmentImpl zb = fragmentEntry2.zb(vbsVar);
                if (zb != null) {
                    vbsVar.k(zb);
                }
                eVar.e.c.Fb(fragmentEntry2);
            }
            eVar.f(vbsVar);
            eVar.L(new dp0(9, eVar, arrayList));
            eVar.J();
            FragmentNavigationControllerState fragmentNavigationControllerState = eVar.e;
            if (fragmentNavigationControllerState.d == null && !fragmentNavigationControllerState.c.Ob().c.isEmpty()) {
                eVar.k(eVar.e.c.Ob().b, false);
                return;
            }
            FragmentEntry fragmentEntry3 = eVar.e.d;
            if (fragmentEntry3 != null) {
                eVar.d(fragmentEntry3, null);
            }
        } catch (Throwable th) {
            eVar.f(vbsVar);
            eVar.L(new dp0(9, eVar, arrayList));
            eVar.J();
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
        L(new uh3(15, this, fragmentEntry));
    }

    @Override // com.vk.core.fragments.a
    public final void r(eu2 eu2Var) {
        this.a.c = eu2Var;
    }

    @Override // com.vk.core.fragments.a
    public final boolean s(FragmentImpl fragmentImpl, boolean z) {
        FragmentEntry Cb;
        String str;
        FragmentImpl b2;
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
        while (!Db.c.isEmpty() && !epx.f(Db.Cb(), Db.b) && (Cb = Db.Cb()) != null && (str = Cb.d) != null && (b2 = b(str)) != null) {
            G(b2);
        }
        f(vbsVar);
        return true;
    }

    @Override // com.vk.core.fragments.a
    public final void t(ArrayList arrayList, boolean z) {
        f fVar = this.h;
        fVar.getClass();
        int size = arrayList.size();
        e eVar = e.this;
        FragmentNavigationControllerState fragmentNavigationControllerState = eVar.e;
        vbs vbsVar = eVar.a;
        if (size != fragmentNavigationControllerState.c.b.size() && z) {
            eVar.B();
            eVar.L(new k(10, eVar, arrayList));
            return;
        }
        vbsVar.c();
        try {
            LinkedList linkedList = new LinkedList();
            for (FStack fStack : eVar.e.c.b) {
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
            cor.a aVar = new cor.a(rli0.p(new i5g(linkedList), new nj(22)));
            while (aVar.hasNext()) {
                FragmentEntry fragmentEntry = (FragmentEntry) aVar.next();
                g5g.D(eVar.e.b, true, new t3h(fragmentEntry, 20));
                FragmentImpl b2 = vbsVar.b(fragmentEntry.d);
                if (b2 != null) {
                    vbsVar.k(b2);
                }
                eVar.e.c.Fb(fragmentEntry);
                if (epx.f(eVar.e.d, fragmentEntry)) {
                    eVar.e.d = null;
                }
            }
            eVar.f(vbsVar);
            eVar.L(new j6(7, eVar, arrayList));
            eVar.J();
            FragmentNavigationControllerState fragmentNavigationControllerState2 = eVar.e;
            if (fragmentNavigationControllerState2.d == null && !fragmentNavigationControllerState2.c.Ob().c.isEmpty()) {
                eVar.k(eVar.e.c.Ob().b, false);
                return;
            }
            FragmentEntry fragmentEntry2 = eVar.e.d;
            if (fragmentEntry2 != null) {
                eVar.d(fragmentEntry2, null);
            }
        } catch (Throwable th) {
            eVar.f(vbsVar);
            eVar.L(new j6(7, eVar, arrayList));
            eVar.J();
            throw th;
        }
    }

    @Override // com.vk.core.fragments.a
    public final void u(ui90.a aVar) {
        this.a.l(aVar);
    }

    @Override // com.vk.core.fragments.a
    public final int v() {
        LinkedList<FStack> linkedList = this.e.c.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            FStack fStack = (FStack) obj;
            egg0 egg0Var = new egg0(this.e.c.c);
            if (!egg0Var.isEmpty()) {
                Iterator it = egg0Var.iterator();
                while (true) {
                    ListIterator<T> listIterator = ((egg0.a) it).b;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (epx.f((FStack) listIterator.previous(), fStack)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            FStack fStack2 = (FStack) it2.next();
            i += fStack2.c.size() <= 1 ? 0 : fStack2.c.size() - 1;
        }
        return this.e.c.Jb() + i;
    }

    @Override // com.vk.core.fragments.a
    public final void w(FragmentEntry fragmentEntry) {
        L(new e0(9, this, fragmentEntry));
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
