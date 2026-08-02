package com.vk.im.ui.components.dialogs_list;

import android.content.Context;
import android.util.ArraySet;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.ui.components.dialogs_list.e;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.movika.sdk.base.observable.o;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.a1w;
import xsna.asu0;
import xsna.c0q0;
import xsna.c5g;
import xsna.cau0;
import xsna.cz;
import xsna.e8;
import xsna.e9w;
import xsna.f1e0;
import xsna.f680;
import xsna.f9w;
import xsna.fsm;
import xsna.gkx0;
import xsna.gyp;
import xsna.hv;
import xsna.hwg0;
import xsna.i6o0;
import xsna.io1;
import xsna.jgp;
import xsna.ji;
import xsna.k9u0;
import xsna.krl0;
import xsna.kwg0;
import xsna.ltm;
import xsna.mxv;
import xsna.o5e0;
import xsna.oce;
import xsna.odw;
import xsna.ok6;
import xsna.ov2;
import xsna.p8v;
import xsna.pbw;
import xsna.q490;
import xsna.qdw;
import xsna.qsm;
import xsna.rc80;
import xsna.s3q0;
import xsna.u3c0;
import xsna.ugm;
import xsna.uoh;
import xsna.vsm;
import xsna.vtm;
import xsna.wze;
import xsna.xf1;
import xsna.y3i;
import xsna.yrm;
import xsna.zdw;
import xsna.zzp0;

/* compiled from: DialogsListPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends ok6<vtm> {
    public static final f9w B = e9w.a(c.class);
    public io.reactivex.rxjava3.disposables.c A;
    public final a1w d;
    public final fsm e;
    public final Context f;
    public final ltm g;
    public final e h;
    public DialogsFilter i;
    public final mxv j;
    public final krl0 k;
    public final pbw l;
    public final io.reactivex.rxjava3.disposables.b m;
    public io.reactivex.rxjava3.disposables.c n;
    public final io.reactivex.rxjava3.disposables.b o;
    public final io.reactivex.rxjava3.disposables.b p;
    public final io.reactivex.rxjava3.disposables.b q;
    public final rc80 r;
    public c0q0 s;
    public c0q0 t;
    public com.vk.im.ui.components.dialogs_list.a u;
    public final gyp v;
    public final yrm w;
    public final odw x;
    public io.reactivex.rxjava3.disposables.c y;
    public final o5e0 z;

    /* compiled from: DialogsListPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InfoBar.Style.values().length];
            try {
                iArr[InfoBar.Style.OUTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoBar.Style.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfoBar.ButtonType.values().length];
            try {
                iArr2[InfoBar.ButtonType.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InfoBar.ButtonType.GIFTS_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InfoBar.ButtonType.CALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InfoBar.ButtonType.OPEN_MSG_PUSH_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InfoBar.ButtonType.SYNC_CONTACTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InfoBar.ButtonType.OPEN_EDU_AUTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InfoBar.ButtonType.POPUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public c(a1w a1wVar, fsm fsmVar) {
        odw qdwVar;
        this.d = a1wVar;
        this.e = fsmVar;
        Context context = fsmVar.a;
        this.f = context;
        this.g = fsmVar.l;
        a1wVar.a.getClass();
        this.i = DialogsFilter.MAIN;
        zdw zdwVar = fsmVar.b;
        mxv d = zdwVar.d();
        this.j = d;
        krl0 krl0Var = fsmVar.c;
        this.k = krl0Var;
        this.l = zdwVar.d;
        this.m = new io.reactivex.rxjava3.disposables.b();
        this.o = new io.reactivex.rxjava3.disposables.b();
        this.p = new io.reactivex.rxjava3.disposables.b();
        this.q = new io.reactivex.rxjava3.disposables.b();
        this.r = new rc80(this);
        this.s = new c0q0();
        this.t = new c0q0();
        this.v = new gyp(this);
        Peer q = a1wVar.q();
        q.getClass();
        if (q.Ab(Peer.Type.GROUP)) {
            odw.a.getClass();
            qdwVar = odw.a.b;
        } else {
            qdwVar = new qdw(a1wVar, d.g());
        }
        this.x = qdwVar;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.y = emptyDisposable;
        this.z = new o5e0(a1wVar);
        this.A = emptyDisposable;
        DisplayNameFormatter displayNameFormatter = new DisplayNameFormatter(null, 2, context.getString(R.string.vkim_loading));
        boolean z = fsmVar.d;
        boolean z2 = fsmVar.e;
        boolean z3 = fsmVar.f;
        boolean z4 = fsmVar.g;
        boolean z5 = fsmVar.h;
        boolean z6 = fsmVar.i;
        cau0 cau0Var = a1wVar.r().h;
        this.h = new e(displayNameFormatter, krl0Var, new e.c(z, z2, z3, z4, z5, z6, true, fsmVar.k, new y3i(this, 4)));
        this.w = new yrm(context, d);
        this.u = null;
    }

    public final void A(boolean z) {
        e eVar = this.h;
        if (eVar.o != z) {
            eVar.o = z;
            if (eVar.d) {
                t(this);
            }
        }
    }

    public final void B(Object obj) {
        vtm f = f();
        if (f == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        vtm vtmVar = f;
        e eVar = this.h;
        if (!eVar.y && eVar.z) {
            vtmVar.k(obj, eVar.b());
            return;
        }
        vtmVar.D = qsm.i;
        vtmVar.C = 1;
        vtmVar.h("Show progress");
    }

    public final void C() {
        e eVar = this.h;
        if (eVar.d) {
            throw new IllegalStateException("Already observing");
        }
        a1w a1wVar = this.d;
        if (a1wVar.u()) {
            this.s = new c0q0();
            this.t = new c0q0();
            eVar.d = false;
            eVar.e = DialogsFilter.MAIN;
            eVar.a();
            eVar.v = null;
            eVar.t.clear();
            eVar.w = jgp.b;
            eVar.C = false;
            eVar.D = false;
            eVar.e = this.i;
            eVar.d = true;
            com.vk.im.ui.components.dialogs_list.a aVar = this.u;
            if (aVar != null) {
                aVar.h(false);
                s3q0 s3q0Var = s3q0.a;
            }
            com.vk.im.ui.components.dialogs_list.a aVar2 = this.u;
            if (aVar2 != null) {
                aVar2.k(true);
                s3q0 s3q0Var2 = s3q0.a;
            }
            u();
            D();
            m1 a2 = a1wVar.l.a();
            asu0 asu0Var = asu0.a;
            int i = 18;
            m1 a0 = a2.a0(asu0Var.c()).b0(f680.class).U(new e8(new wze(this, i), i)).a0(asu0Var.d());
            io1 io1Var = new io1(new uoh(this, 8), 24);
            int i2 = kwg0.a;
            this.p.b(a0.subscribe(io1Var, new hwg0()));
            this.j.getClass();
            this.q.b(k9u0.a.c(this.f).a0(asu0Var.d()).subscribe(new ov2(new ugm(this, 2), 15)));
            this.y = this.x.a().a0(asu0Var.d()).subscribe(new cz(new oce(this, i), 21));
            if (this.e.m) {
                this.A = this.z.a().a0(asu0Var.d()).subscribe(new hv(new o(this, 29), 17));
            }
        }
    }

    public final void D() {
        io.reactivex.rxjava3.disposables.b bVar = this.o;
        if (bVar.g() > 0) {
            return;
        }
        m1 a0 = this.d.l.a().a0(asu0.a.d());
        int i = kwg0.a;
        bVar.b(a0.subscribe(this.v, new hwg0()));
    }

    public final void E() {
        this.q.e();
        this.p.e();
        this.o.e();
        c0q0 c0q0Var = this.s;
        c0q0Var.getClass();
        f9w f9wVar = c0q0.h;
        int i = 3;
        f9wVar.debug(new u3c0(i));
        c0q0Var.d();
        c0q0Var.a = false;
        this.s = new c0q0();
        c0q0 c0q0Var2 = this.t;
        c0q0Var2.getClass();
        f9wVar.debug(new u3c0(i));
        c0q0Var2.d();
        c0q0Var2.a = false;
        this.t = new c0q0();
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.n = null;
        this.y.dispose();
        this.A.dispose();
        e eVar = this.h;
        eVar.d = false;
        eVar.e = DialogsFilter.MAIN;
        eVar.a();
        eVar.v = null;
        eVar.t.clear();
        eVar.w = jgp.b;
        eVar.C = false;
        eVar.D = false;
        com.vk.im.ui.components.dialogs_list.a aVar = this.u;
        if (aVar != null) {
            aVar.h(false);
            s3q0 s3q0Var = s3q0.a;
        }
        com.vk.im.ui.components.dialogs_list.a aVar2 = this.u;
        if (aVar2 != null) {
            aVar2.k(true);
            s3q0 s3q0Var2 = s3q0.a;
        }
        ok6.a();
        b();
        if (this.c != 0) {
            B(this);
        }
    }

    public final void F(Object obj, zzp0 zzp0Var) {
        this.s.g(obj, zzp0Var);
    }

    @Override // xsna.ok6
    public final void i() {
        if (this.h.d) {
            E();
        }
    }

    @Override // xsna.ok6
    public final void j() {
        this.o.e();
    }

    @Override // xsna.ok6
    public final void k() {
        D();
        this.j.getClass();
        boolean b = k9u0.a.b(this.f);
        e eVar = this.h;
        if (b != eVar.D) {
            eVar.D = b;
            B(this);
        }
        if (eVar.y) {
            return;
        }
        this.s.g(this, new f(this, false));
    }

    @Override // xsna.ok6
    public final void l(vtm vtmVar) {
        vtmVar.F = this.r;
        B(this);
    }

    @Override // xsna.ok6
    public final void m(vtm vtmVar) {
        vtm vtmVar2 = vtmVar;
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.n = null;
        vtmVar2.F = null;
    }

    public final void n(DialogsFilter dialogsFilter) {
        if (dialogsFilter == this.i) {
            return;
        }
        this.i = dialogsFilter;
        e eVar = this.h;
        eVar.e = dialogsFilter;
        if (!eVar.d || eVar.y) {
            return;
        }
        F(this, new f(this, true));
    }

    public final DialogsFilter o() {
        return this.i;
    }

    public final void p(InfoBar infoBar, String str) {
        this.d.D(this, new vsm(infoBar.b, str));
    }

    public final void q(q490 q490Var, Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (this.h.g.s().get(Long.valueOf(((Number) it.next()).longValue())) != null) {
                t(q490Var);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1 A[LOOP:1: B:65:0x019b->B:67:0x01a1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj) {
        p8v p8vVar;
        p8v p8vVar2;
        Iterator<Number> it;
        e eVar = this.h;
        DialogsHistory dialogsHistory = eVar.g;
        if (!dialogsHistory.isEmpty() || !dialogsHistory.u()) {
            boolean isEmpty = eVar.g.isEmpty();
            com.vk.im.ui.components.dialogs_list.a aVar = this.u;
            if (aVar != null) {
                aVar.k(isEmpty);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        if (eVar.B) {
            return;
        }
        if (eVar.h.Gb()) {
            boolean z = eVar.y;
            ProfilesInfo profilesInfo = eVar.h;
            if (!z && !eVar.B && profilesInfo.Gb()) {
                e.b bVar = !profilesInfo.Gb() ? new e.b(eVar, new f1e0()) : new e.b(eVar, profilesInfo.Ab());
                if (!eVar.y && !eVar.B && profilesInfo.Gb()) {
                    eVar.B = true;
                    this.t.g(obj, new j(this, bVar.b));
                }
            }
        }
        DialogsHistory dialogsHistory2 = eVar.g;
        if (dialogsHistory2.isEmpty() && dialogsHistory2.u()) {
            u();
        }
        if (this.b) {
            boolean z2 = eVar.y;
            DialogsHistory dialogsHistory3 = eVar.g;
            if (z2 || eVar.B || !eVar.f()) {
                return;
            }
            eVar.B = true;
            eVar.C = true;
            com.vk.im.ui.components.dialogs_list.a aVar2 = this.u;
            if (aVar2 != null) {
                aVar2.h(true);
                s3q0 s3q0Var2 = s3q0.a;
            }
            StringBuilder sb = new StringBuilder("h:");
            sb.append(!dialogsHistory3.d().isEmpty() ? 1 : 0);
            sb.append(",bn:");
            e.a aVar3 = eVar.F;
            sb.append((aVar3.b.d() || aVar3.c.d()) ? 1 : 0);
            sb.append("[e:");
            sb.append(eVar.F.b);
            sb.append(",u:");
            sb.append(eVar.F.c);
            sb.append(']');
            String sb2 = sb.toString();
            boolean f = eVar.f();
            gkx0 gkx0Var = gkx0.e;
            if (f) {
                List<Dialog> k = dialogsHistory3.k();
                int size = k.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        i = -1;
                        break;
                    } else {
                        if (dialogsHistory3.d().contains(k.get(i).Sb())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (i >= 0) {
                    if (i != 0) {
                        gkx0Var = k.get(i - 1).nc();
                    }
                    int min = Math.min((k.size() - i) + 2, 30);
                    p8vVar = new p8v(0);
                    p8vVar.c = gkx0Var;
                    p8vVar.b = min;
                } else if (k.isEmpty()) {
                    p8vVar2 = new p8v(0);
                    p8vVar2.c = gkx0Var;
                    p8vVar2.b = 30;
                    ArraySet<Number> d = dialogsHistory3.d();
                    ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                    it = d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(it.next().longValue()));
                    }
                    ArraySet arraySet = new ArraySet();
                    arraySet.addAll(arrayList);
                    p8vVar2.d = arraySet;
                } else {
                    gkx0 nc = ((Dialog) ji.a(1, k)).nc();
                    p8vVar = new p8v(0);
                    p8vVar.c = nc;
                    p8vVar.b = 30;
                }
                p8vVar2 = p8vVar;
                ArraySet<Number> d2 = dialogsHistory3.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
                it = d2.iterator();
                while (it.hasNext()) {
                }
                ArraySet arraySet2 = new ArraySet();
                arraySet2.addAll(arrayList2);
                p8vVar2.d = arraySet2;
            } else {
                p8vVar2 = new p8v(0);
                p8vVar2.c = gkx0Var;
                p8vVar2.b = 0;
            }
            this.t.g(obj, new i6o0(this, p8vVar2, sb2));
        }
    }

    public final void s(DialogsFilter dialogsFilter) {
        if (this.h.d) {
            E();
        }
        this.i = dialogsFilter;
        C();
    }

    public final void t(Object obj) {
        if (this.h.y) {
            return;
        }
        F(obj, new f(this, false));
    }

    public final void u() {
        this.s.d();
        this.s.d();
        e eVar = this.h;
        eVar.a();
        eVar.v = null;
        eVar.t.clear();
        eVar.w = jgp.b;
        eVar.y = true;
        eVar.z = false;
        eVar.A = false;
        eVar.B = false;
        ok6.a();
        b();
        if (this.c != 0) {
            B(this);
        }
        a1w a1wVar = this.d;
        if (a1wVar.u()) {
            a1wVar.a.getClass();
            d dVar = new d(this.i);
            ltm ltmVar = this.g;
            if (ltmVar.isEnabled()) {
                ltmVar.e();
            }
            this.m.b(this.d.B(this, dVar, 80L, new b(this, 0), new xf1(this, 18)));
        }
    }

    public final boolean v() {
        ok6.a();
        b();
        if (this.c != 0) {
            return f().j();
        }
        return false;
    }

    public final void w(boolean z) {
        e eVar = this.h;
        e.a aVar = eVar.F;
        if (aVar.a != z) {
            eVar.F = e.a.a(aVar, z, null, null, null, null, null, 62);
            if (!eVar.d || eVar.y) {
                return;
            }
            F(this, new f(this, false));
        }
    }

    public final void x(com.vk.im.ui.components.dialogs_list.a aVar) {
        this.u = aVar;
    }

    public final void y(boolean z) {
        e eVar = this.h;
        if (eVar.n != z) {
            eVar.n = z;
            if (eVar.d) {
                t(this);
            }
        }
    }

    public final void z(boolean z) {
        e eVar = this.h;
        e.d dVar = eVar.E;
        if (dVar.a != z) {
            eVar.E = e.d.a(dVar, z, null, 0, null, null, null, 62);
            if (!eVar.d || eVar.y) {
                return;
            }
            F(this, new f(this, false));
        }
    }
}
