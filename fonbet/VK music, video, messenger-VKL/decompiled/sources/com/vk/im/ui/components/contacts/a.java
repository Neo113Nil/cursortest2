package com.vk.im.ui.components.contacts;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Ad;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.contacts.AndroidContact;
import com.vk.contacts.ContactSyncState;
import com.vk.contacts.d;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SelectedMembers;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.im.ui.utils.CreateChannelFlowTracker;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vkontakte.android.R;
import defpackage.n;
import defpackage.p;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.m;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a1w;
import xsna.a6p;
import xsna.aeg0;
import xsna.akh;
import xsna.asu0;
import xsna.b00;
import xsna.bpn0;
import xsna.bv1;
import xsna.bw;
import xsna.c5g;
import xsna.cau0;
import xsna.cq8;
import xsna.cw;
import xsna.d40;
import xsna.d980;
import xsna.dcj;
import xsna.de9;
import xsna.dh5;
import xsna.dp0;
import xsna.dwg;
import xsna.e1w;
import xsna.e3m;
import xsna.e40;
import xsna.e43;
import xsna.ebj;
import xsna.eph;
import xsna.epx;
import xsna.ew;
import xsna.f40;
import xsna.fcj;
import xsna.fnj;
import xsna.fpf0;
import xsna.fr;
import xsna.g2v;
import xsna.g9e0;
import xsna.gbh;
import xsna.gdj;
import xsna.gzs;
import xsna.h6;
import xsna.hcj;
import xsna.hfz;
import xsna.hg1;
import xsna.iah0;
import xsna.icj;
import xsna.igh;
import xsna.izi0;
import xsna.izs;
import xsna.j8i;
import xsna.jcj;
import xsna.jh;
import xsna.jon0;
import xsna.jpf;
import xsna.k5h;
import xsna.k9u0;
import xsna.ka80;
import xsna.kcj;
import xsna.kpd;
import xsna.kwg0;
import xsna.kz0;
import xsna.l3f;
import xsna.ldi0;
import xsna.lpd;
import xsna.m380;
import xsna.m40;
import xsna.mre;
import xsna.msy;
import xsna.mxv;
import xsna.n1;
import xsna.n9;
import xsna.ns6;
import xsna.o0r0;
import xsna.o25;
import xsna.o40;
import xsna.o680;
import xsna.obj;
import xsna.od3;
import xsna.owi;
import xsna.ozf;
import xsna.p680;
import xsna.p9k;
import xsna.pbj;
import xsna.pbm;
import xsna.ph3;
import xsna.pw;
import xsna.q2a0;
import xsna.qbj;
import xsna.qcy;
import xsna.qg2;
import xsna.qtd0;
import xsna.qzg;
import xsna.s3q0;
import xsna.sbj;
import xsna.sfg;
import xsna.sje;
import xsna.ss3;
import xsna.sv;
import xsna.swa;
import xsna.sxp;
import xsna.sz;
import xsna.szv;
import xsna.t080;
import xsna.t8j;
import xsna.tb0;
import xsna.u4e;
import xsna.u90;
import xsna.uaj;
import xsna.uh3;
import xsna.uqc;
import xsna.v40;
import xsna.vej;
import xsna.vj0;
import xsna.w8i;
import xsna.w8j;
import xsna.wej;
import xsna.wzs;
import xsna.x5i;
import xsna.x8;
import xsna.x8j;
import xsna.xg2;
import xsna.xqf;
import xsna.y34;
import xsna.y3i;
import xsna.y89;
import xsna.yce;
import xsna.yq1;
import xsna.yqw;
import xsna.zuh;

/* compiled from: ContactsListComponent.kt */
/* loaded from: classes2.dex */
public final class a extends j8i implements f<Object>, w8i {
    public static final /* synthetic */ qcy<Object>[] d0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final Set<Long> D;
    public final Peer E;
    public final String F;
    public final izs<w8j, e1w<pbm>> G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final Object M;
    public final long N;
    public final Object O;
    public final long P;
    public final Object Q;
    public final bpn0 R;
    public final bpn0 S;
    public final bpn0 T;
    public Set<Long> U;
    public final io.reactivex.rxjava3.disposables.b V;
    public final io.reactivex.rxjava3.subjects.f<hfz> W;
    public final b X;
    public final LayoutInflater Y;
    public final g9e0 Z;
    public vej a0;
    public final p9k b0;
    public final obj c0;
    public final a1w i;
    public final mxv j;
    public final cau0 k;
    public final u90 l;
    public final InterfaceC1144a m;
    public final Set<ContactsViews> n;
    public final boolean o;
    public final boolean p;
    public final izs<x8j, e1w<ContactsList>> q;
    public final boolean r;
    public final SortOrder s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final String x;
    public final SelectedMembers y;
    public final List<String> z;

    /* compiled from: ContactsListComponent.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ContactSyncState.values().length];
            try {
                iArr[ContactSyncState.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContactsList.ChangeMode.values().length];
            try {
                iArr2[ContactsList.ChangeMode.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ContactsList.ChangeMode.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "vc", "getVc()Lcom/vk/im/ui/components/contacts/vc/ContactsVc;", 0);
        fpf0.a.getClass();
        d0 = new qcy[]{propertyReference1Impl};
    }

    public a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.obj, xsna.tb0] */
    public a(a1w a1wVar, mxv mxvVar, cau0 cau0Var, u90 u90Var, InterfaceC1144a interfaceC1144a, Set set, boolean z, boolean z2, izs izsVar, SortOrder sortOrder, int i, boolean z3, int i2, String str, SelectedMembers selectedMembers, List list, boolean z4, boolean z5, boolean z6, Set set2, Peer peer, String str2, izs izsVar2, boolean z7, boolean z8, boolean z9, int i3) {
        boolean z10 = (i3 & 128) != 0 ? false : z2;
        boolean z11 = (i3 & 512) == 0;
        int i4 = (i3 & 2048) != 0 ? 1 : i;
        boolean z12 = (i3 & 4096) != 0 ? false : z3;
        int i5 = (i3 & 16384) != 0 ? Integer.MAX_VALUE : i2;
        String str3 = (32768 & i3) != 0 ? "" : str;
        SelectedMembers selectedMembers2 = (65536 & i3) != 0 ? SelectedMembers.d : selectedMembers;
        List list2 = (131072 & i3) != 0 ? EmptyList.b : list;
        boolean z13 = (262144 & i3) != 0 ? false : z4;
        boolean z14 = (524288 & i3) != 0 ? true : z5;
        boolean z15 = (1048576 & i3) != 0 ? true : z6;
        Set set3 = (i3 & 2097152) != 0 ? EmptySet.b : set2;
        Peer peer2 = (i3 & 4194304) != 0 ? null : peer;
        String str4 = (i3 & 8388608) != 0 ? null : str2;
        izs izsVar3 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : izsVar2;
        boolean z16 = (i3 & 67108864) == 0;
        boolean z17 = (i3 & 134217728) == 0;
        boolean z18 = (i3 & 268435456) != 0 ? false : z7;
        boolean z19 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? false : z8;
        boolean z20 = (i3 & 1073741824) != 0 ? false : z9;
        this.i = a1wVar;
        this.j = mxvVar;
        this.k = cau0Var;
        this.l = u90Var;
        this.m = interfaceC1144a;
        this.n = set;
        this.o = z;
        this.p = z10;
        this.q = izsVar;
        this.r = z11;
        this.s = sortOrder;
        this.t = i4;
        this.u = z12;
        this.v = false;
        this.w = i5;
        this.x = str3;
        this.y = selectedMembers2;
        this.z = list2;
        this.A = z13;
        this.B = z14;
        this.C = z15;
        this.D = set3;
        this.E = peer2;
        this.F = str4;
        this.G = izsVar3;
        this.H = z16;
        this.I = z17;
        this.J = z18;
        this.K = z19;
        this.L = z20;
        this.M = new Object();
        this.N = 300L;
        this.O = new Object();
        this.P = 100L;
        this.Q = msy.a(LazyThreadSafetyMode.NONE, new v40(this, 29));
        this.R = new bpn0(new y3i(this, 1));
        this.S = new bpn0(new x5i(this, 3));
        this.T = new bpn0(new xqf(this, 8));
        this.V = new io.reactivex.rxjava3.disposables.b();
        this.W = new io.reactivex.rxjava3.subjects.f<>();
        this.X = new b();
        this.Y = LayoutInflater.from(u90Var.B());
        this.Z = new g9e0(new sje(this, 13));
        Context B = u90Var.B();
        HashSet hashSet = iah0.a;
        fnj.d(B);
        this.a0 = new com.vk.movika.sdk.android.defaultplayer.layout.a(u90Var.B());
        g2v.c().getClass();
        this.b0 = new p9k(a1wVar, k9u0.a, com.vk.contacts.b.a);
        ?? r1 = new tb0() { // from class: xsna.obj
            @Override // xsna.tb0
            public final void onActivityResult(int i6, int i7, Intent intent) {
                com.vk.im.ui.components.contacts.a aVar = com.vk.im.ui.components.contacts.a.this;
                Activity h = e3m.h(aVar.l.B());
                if (h != null) {
                    aVar.b0.b(h, i6, i7, intent);
                }
            }
        };
        this.c0 = r1;
        ComponentCallbacks2 h = e3m.h(u90Var.B());
        aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
        if (aeg0Var != 0) {
            aeg0Var.Li(r1);
        }
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        if (this.Z.c()) {
            wej c1 = c1();
            RecyclerView recyclerView = c1.k;
            RecyclerView recyclerView2 = recyclerView != null ? recyclerView : null;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView2.setLayoutManager(c1.a(recyclerView.getContext()));
            c1.e(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.recyclerview.widget.RecyclerView$n, xsna.vaj] */
    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        this.Z.d();
        View b2 = c1().b(layoutInflater, viewGroup);
        wej c1 = c1();
        c1.j.e(this.a0);
        RecyclerView recyclerView = c1.k;
        if (recyclerView != null) {
            recyclerView.invalidateItemDecorations();
        }
        return b2;
    }

    @Override // xsna.j8i
    public final void M0() {
        ComponentCallbacks2 h = e3m.h(this.l.B());
        aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this.c0);
        }
        this.V.dispose();
        p9k p9kVar = this.b0;
        if (p9kVar.e.N0()) {
            return;
        }
        p9kVar.e.onError(new IllegalStateException("CreatePhonebookContactDelegate destroyed before got result"));
    }

    @Override // xsna.j8i
    public final void N0() {
        owi.b(this.M);
        owi.b(this.O);
        this.Z.a();
    }

    @Override // xsna.j8i
    public final void O0(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("is_contact_creation_started", false)) {
            return;
        }
        this.V.b(io.reactivex.rxjava3.kotlin.c.e(this.b0.e.m0().m(io.reactivex.rxjava3.android.schedulers.a.b()), new igh(this, 5), new dwg(this, 5)));
    }

    @Override // xsna.j8i
    public final void P0(Bundle bundle) {
        bundle.putBoolean("is_contact_creation_started", !this.b0.e.N0());
    }

    @Override // xsna.j8i
    public final void S0(View view) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        I0(bVar);
        I0(this.i.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(this));
        I0(d.a.a().subscribe(this));
        j1 U = b1().o.U(new m40(new od3(22), 9));
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        y yVar = new y(U, qVar, aVar);
        asu0 asu0Var = asu0.a;
        bVar.b(yVar.a0(asu0Var.d()).subscribe(new x8(new mre(this, 11), 14)));
        int i = 15;
        m1 a0 = new y(b1().o.U(new o40(new dh5(i), 13)), qVar, aVar).a0(asu0Var.d());
        int i2 = 20;
        n nVar = new n(new eph(this, 2), i2);
        int i3 = kwg0.a;
        bVar.b(a0.subscribe(nVar, new de9(1)));
        bVar.b(b1().p.a0(asu0Var.d()).subscribe(new p(new u4e(this, 7), i2), new de9(1)));
        bVar.b(b1().q.a0(asu0Var.d()).subscribe(new sv(new sz(this, 29), 23), new de9(1)));
        f1(new jh(10), new ph3(this, 22));
        f1(new fr(11), new ew(this, i));
        e1(Source.CACHE, true);
    }

    public final void X0(List<? extends Peer> list, Source source, wzs<? super List<? extends Peer>, ? super Boolean, s3q0> wzsVar) {
        izs<w8j, e1w<pbm>> izsVar;
        e1w<pbm> e1wVar = null;
        Peer peer = this.E;
        if (peer != null && (izsVar = this.G) != null) {
            e1wVar = izsVar.invoke(new w8j(peer, source, list));
        }
        if (e1wVar == null) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.c C = this.i.C(this, e1wVar);
        asu0 asu0Var = asu0.a;
        I0(hg1.i(C.q(asu0Var.c()).m(asu0Var.d()), new n9(6, this, wzsVar)));
    }

    public final void Y0(List<? extends qtd0> list) {
        List<? extends qtd0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            long G3 = ((qtd0) it.next()).G3();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(G3));
        }
        X0(arrayList, Source.CACHE, new uqc(2, arrayList, this));
    }

    public final void Z0() {
        com.vk.im.ui.components.contacts.b b1 = b1();
        b1.getClass();
        com.vk.im.ui.components.contacts.b.c(new jpf(b1, 9));
    }

    public final void a1(CharSequence charSequence) {
        com.vk.im.ui.components.contacts.b b1 = b1();
        b1.getClass();
        com.vk.im.ui.components.contacts.b.c(new yq1(6, charSequence, b1));
        int length = charSequence.length();
        Object obj = this.O;
        if (length > 1) {
            owi.a(obj, this.P, new pw(7, this, charSequence));
            return;
        }
        owi.b(obj);
        if (this.t == 2) {
            com.vk.im.ui.components.contacts.b b12 = b1();
            EmptyList emptyList = EmptyList.b;
            b12.getClass();
            com.vk.im.ui.components.contacts.b.c(new jcj(b12, emptyList, b12));
        }
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        boolean z = obj instanceof uaj;
        long j = this.N;
        Object obj2 = this.M;
        if (z) {
            owi.a(obj2, j, new qbj(this, 0));
            return;
        }
        if (obj instanceof yqw) {
            com.vk.im.ui.components.contacts.b b1 = b1();
            boolean z2 = ((yqw) obj).a;
            b1.getClass();
            com.vk.im.ui.components.contacts.b.c(new qg2(b1, z2));
            return;
        }
        if (obj instanceof jon0) {
            ContactSyncState contactSyncState = ((jon0) obj).a;
            if (c.$EnumSwitchMapping$0[contactSyncState.ordinal()] == 1) {
                owi.a(obj2, j, new h6(this, 27));
                return;
            }
            com.vk.im.ui.components.contacts.b b12 = b1();
            b12.getClass();
            com.vk.im.ui.components.contacts.b.c(new hcj(b12, contactSyncState));
            return;
        }
        if ((obj instanceof sxp) && !epx.f(((sxp) obj).a(), "ContactsListComponent")) {
            if (obj instanceof p680) {
                owi.a(obj2, j, new qzg(this, 4));
                return;
            }
            if (obj instanceof OnCacheInvalidateEvent) {
                owi.a(obj2, j, new ozf(this, 9));
                return;
            }
            if (obj instanceof m380) {
                owi.a(obj2, j, new gbh(this, 2));
                return;
            }
            if (obj instanceof ka80) {
                com.vk.im.ui.components.contacts.b b13 = b1();
                ProfilesInfo profilesInfo = ((ka80) obj).c;
                b13.getClass();
                com.vk.im.ui.components.contacts.b.c(new uh3(11, b13, profilesInfo));
                return;
            }
            if (obj instanceof o680) {
                List<qtd0> list = ((o680) obj).b;
                Y0(list);
                com.vk.im.ui.components.contacts.b b14 = b1();
                b14.getClass();
                com.vk.im.ui.components.contacts.b.c(new icj(0, b14, list));
                return;
            }
            if (!(obj instanceof d980)) {
                if (obj instanceof t080) {
                    throw null;
                }
            } else {
                com.vk.im.ui.components.contacts.b b15 = b1();
                List<qtd0> list2 = ((d980) obj).b;
                b15.getClass();
                com.vk.im.ui.components.contacts.b.c(new kcj(b15, list2));
            }
        }
    }

    public final com.vk.im.ui.components.contacts.b b1() {
        return (com.vk.im.ui.components.contacts.b) this.T.getValue();
    }

    public final wej c1() {
        qcy<Object> qcyVar = d0[0];
        return (wej) this.Z.b();
    }

    public final boolean d1() {
        Peer peer = this.E;
        return peer != null && peer.Ab(Peer.Type.USER);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void e1(Source source, boolean z) {
        if (((Boolean) this.Q.getValue()).booleanValue()) {
            r rVar = new r(((a6p) this.R.getValue()).c(), new y34(new bv1(10, this, source), 16));
            asu0 asu0Var = asu0.a;
            int i = 0;
            int i2 = 1;
            I0(io.reactivex.rxjava3.kotlin.c.e(rVar.q(asu0Var.c()).m(asu0Var.d()), new kpd(i2, this, a.class, "onLoadError", "onLoadError(Ljava/lang/Throwable;)V", i, 3), new lpd(i2, this, a.class, Ad.f, "onLoadSuccess(Lcom/vk/im/ui/components/contacts/ContactsList;)V", i, 2)));
            return;
        }
        SelectedMembers selectedMembers = this.y;
        e1w<ContactsList> invoke = this.q.invoke(new x8j(source, this.s, z, izi0.j(selectedMembers.b, (Iterable) selectedMembers.c), this.E, d1()));
        Source source2 = Source.CACHE;
        a1w a1wVar = this.i;
        if (source == source2) {
            I0(a1wVar.B(this, invoke, a1wVar.r().H, new f40(this, 13), new b00(this, 17)));
            return;
        }
        int i3 = 0;
        I0(a1wVar.C(this, invoke).q(asu0.a.c()).subscribe(new bw(new y89(1, this, a.class, Ad.f, "onLoadSuccess(Lcom/vk/im/ui/components/contacts/ContactsList;)V", i3, 4), 20), new cw(new l3f(1, this, a.class, "onLoadError", "onLoadError(Ljava/lang/Throwable;)V", i3, 3), 15)));
    }

    public final void f1(m<t8j> mVar, f<Set<Long>> fVar) {
        i0 i0Var = new i0(new i0(this.W.b0(t8j.class), mVar).U(new vj0(new kz0(16), 12)).d(2000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.a.a(), Integer.MAX_VALUE, new pbj()), new e40(new d40(23), 9));
        int i = kwg0.a;
        I0(i0Var.subscribe(fVar, new de9(1)));
    }

    public final void g1(Throwable th) {
        com.vk.im.ui.components.contacts.b b1 = b1();
        b1.getClass();
        int i = 7;
        com.vk.im.ui.components.contacts.b.c(new sfg(b1, i));
        com.vk.im.ui.components.contacts.b b12 = b1();
        b12.getClass();
        com.vk.im.ui.components.contacts.b.c(new dp0(i, b12, th));
    }

    public final void h1(ContactsList contactsList) {
        sbj sbjVar = contactsList.c;
        ProfilesSimpleInfo profilesSimpleInfo = contactsList.b;
        List<qtd0> list = contactsList.a;
        boolean z = sbjVar.l;
        int i = c.$EnumSwitchMapping$1[contactsList.d.ordinal()];
        if (i == 1) {
            com.vk.im.ui.components.contacts.b b1 = b1();
            b1.getClass();
            com.vk.im.ui.components.contacts.b.c(new zuh(contactsList, b1, z));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            com.vk.im.ui.components.contacts.b b12 = b1();
            b12.getClass();
            com.vk.im.ui.components.contacts.b.c(new fcj(contactsList, b12, z, 0));
        }
        if (!sbjVar.l) {
            owi.a(this.M, this.N, new yce(this, 9));
            return;
        }
        Y0(list);
        com.vk.im.ui.components.contacts.b b13 = b1();
        SelectedMembers selectedMembers = this.y;
        LinkedHashSet linkedHashSet = selectedMembers.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            qtd0 zb = profilesSimpleInfo.zb((Peer) it.next());
            if (zb != null) {
                arrayList.add(zb);
            }
        }
        b13.getClass();
        com.vk.im.ui.components.contacts.b.c(new com.vk.newsfeed.common.recycler.holders.attachments.a(11, arrayList, b13));
        com.vk.im.ui.components.contacts.b b14 = b1();
        Iterable iterable = (Iterable) selectedMembers.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            qtd0 zb2 = profilesSimpleInfo.zb((Peer) it2.next());
            if (zb2 != null) {
                arrayList2.add(zb2);
            }
        }
        b14.getClass();
        com.vk.im.ui.components.contacts.b.c(new com.vk.newsfeed.common.recycler.holders.attachments.a(11, arrayList2, b14));
        com.vk.im.ui.components.contacts.b b15 = b1();
        List<String> list2 = this.z;
        ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
        for (String str : list2) {
            arrayList3.add(new com.vk.im.engine.models.contacts.a(new AndroidContact(null, str, false, Collections.singleton(str), Collections.singleton(str), null, 33, null)));
        }
        b15.getClass();
        com.vk.im.ui.components.contacts.b.c(new com.vk.newsfeed.common.recycler.holders.attachments.a(11, arrayList3, b15));
        if (d1()) {
            final com.vk.im.ui.components.contacts.b b16 = b1();
            final int i2 = sbjVar.n;
            final int i3 = sbjVar.o;
            b16.getClass();
            com.vk.im.ui.components.contacts.b.c(new gzs() { // from class: xsna.ecj
                @Override // xsna.gzs
                public final Object invoke() {
                    com.vk.im.ui.components.contacts.b bVar = com.vk.im.ui.components.contacts.b.this;
                    bVar.s = i2;
                    bVar.t = i3;
                    bVar.o.onNext(bVar.d());
                    return s3q0.a;
                }
            });
        }
        InterfaceC1144a interfaceC1144a = this.m;
        interfaceC1144a.c();
        gdj d = b1().d();
        List l = e43.l(ContactSyncState.DONE, ContactSyncState.PERMITTED);
        if (b1().d().j && l.contains(d.e.a)) {
            com.vk.im.ui.components.contacts.b b17 = b1();
            b17.getClass();
            com.vk.im.ui.components.contacts.b.c(new sfg(b17, 7));
            interfaceC1144a.f();
        }
        selectedMembers.c = EmptySet.b;
        if (!this.p || b1().d().e.f.isEmpty()) {
            return;
        }
        List<? extends qtd0> list3 = b1().d().e.f;
        ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((qtd0) it3.next()).B7());
        }
        this.i.D(this, new ebj("ContactsListComponent", arrayList4));
    }

    public final void i1(gzs<s3q0> gzsVar) {
        Activity h = e3m.h(this.l.B());
        if (h == null) {
            return;
        }
        this.j.getClass();
        szv.a(k9u0.a, h, o25.b(o25.a()) ? ContactsPermissionMessage.EDU : ContactsPermissionMessage.DEFAULT, gzsVar, null, null, 24);
    }

    public final boolean j1() {
        wej c1 = c1();
        RecyclerView recyclerView = c1.k;
        if (recyclerView == null) {
            recyclerView = null;
        }
        if (!recyclerView.canScrollVertically(-1)) {
            return false;
        }
        RecyclerView recyclerView2 = c1.k;
        (recyclerView2 != null ? recyclerView2 : null).scrollToPosition(0);
        return true;
    }

    /* compiled from: ContactsListComponent.kt */
    /* renamed from: com.vk.im.ui.components.contacts.a$a, reason: collision with other inner class name */
    public interface InterfaceC1144a {
        static {
            int i = C1145a.a;
        }

        default boolean h(qtd0 qtd0Var) {
            return true;
        }

        /* compiled from: ContactsListComponent.kt */
        /* renamed from: com.vk.im.ui.components.contacts.a$a$a, reason: collision with other inner class name */
        public static final class C1145a {
            public static final /* synthetic */ int a = 0;

            /* compiled from: ContactsListComponent.kt */
            /* renamed from: com.vk.im.ui.components.contacts.a$a$a$a, reason: collision with other inner class name */
            public static final class C1146a implements InterfaceC1144a {
                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final boolean h(qtd0 qtd0Var) {
                    return true;
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void c() {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void f() {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void g() {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void j() {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void l() {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void m() {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void a(boolean z) {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void b(q2a0 q2a0Var) {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void d(boolean z) {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void e(Peer peer) {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void i(qtd0 qtd0Var) {
                }

                @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
                public final void k(int i, List list) {
                }
            }
        }

        default void c() {
        }

        default void f() {
        }

        default void g() {
        }

        default void j() {
        }

        default void l() {
        }

        default void m() {
        }

        default void a(boolean z) {
        }

        default void b(q2a0 q2a0Var) {
        }

        default void d(boolean z) {
        }

        default void e(Peer peer) {
        }

        default void i(qtd0 qtd0Var) {
        }

        default void k(int i, List list) {
        }
    }

    /* compiled from: ContactsListComponent.kt */
    public final class b implements wej.a {
        public b() {
        }

        @Override // xsna.wej.a
        public final void a(boolean z) {
            a.this.m.a(z);
        }

        @Override // xsna.l270, xsna.e8g0
        public final void b() {
            a.this.i1(new n1(14));
        }

        @Override // xsna.i8j
        public final void c(t8j t8jVar) {
            qtd0 qtd0Var = t8jVar.b;
            InterfaceC1144a interfaceC1144a = a.this.m;
            if (interfaceC1144a.h(qtd0Var)) {
                return;
            }
            interfaceC1144a.i(qtd0Var);
        }

        @Override // xsna.i8j
        public final boolean d() {
            return a.this.u;
        }

        @Override // xsna.l270
        public final void e() {
            a aVar = a.this;
            com.vk.im.ui.components.contacts.b b1 = aVar.b1();
            b1.getClass();
            com.vk.im.ui.components.contacts.b.c(new k5h(b1, 4));
            aVar.e1(Source.NETWORK, true);
        }

        @Override // xsna.e960
        public final void f(List<? extends qtd0> list) {
            List<? extends qtd0> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((qtd0) it.next()).B7());
            }
            a.this.i.D(this, new ebj("ContactsListComponent", arrayList));
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
        @Override // xsna.i8j
        public final void h(t8j t8jVar) {
            a aVar = a.this;
            com.vk.im.ui.components.contacts.b b1 = aVar.b1();
            qtd0 qtd0Var = t8jVar.b;
            if (!b1.h(qtd0Var) && aVar.b1().r.size() >= aVar.w) {
                aVar.m.getClass();
                return;
            }
            com.vk.im.ui.components.contacts.b b12 = aVar.b1();
            b12.getClass();
            com.vk.im.ui.components.contacts.b.c(new ss3(7, b12, qtd0Var));
        }

        @Override // xsna.gei0
        public final void j(ldi0 ldi0Var) {
            boolean z = ldi0Var instanceof ldi0.b;
            a aVar = a.this;
            if (z) {
                com.vk.im.ui.components.contacts.b b1 = aVar.b1();
                qtd0 qtd0Var = ((ldi0.b) ldi0Var).a;
                b1.getClass();
                com.vk.im.ui.components.contacts.b.c(new ss3(7, b1, qtd0Var));
                return;
            }
            com.vk.im.ui.components.contacts.b b12 = aVar.b1();
            b12.getClass();
            com.vk.im.ui.components.contacts.b.c(new ns6(b12, false, 2));
        }

        @Override // xsna.i8j
        public final boolean k(t8j t8jVar) {
            return true;
        }

        @Override // xsna.i8j
        public final boolean m(qtd0 qtd0Var) {
            return o25.b(o25.a()) && qtd0Var.q9().b;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.i8j
        public final boolean n() {
            return ((Boolean) a.this.Q.getValue()).booleanValue();
        }

        @Override // xsna.leb
        public final void o(swa swaVar) {
            boolean z = swaVar instanceof swa.a;
            a aVar = a.this;
            if (z) {
                com.vk.im.ui.components.contacts.b b1 = aVar.b1();
                boolean z2 = !((swa.a) swaVar).b;
                b1.getClass();
                com.vk.im.ui.components.contacts.b.c(new dcj(b1, z2, 0));
                return;
            }
            if (!(swaVar instanceof swa.b)) {
                throw new NoWhenBranchMatchedException();
            }
            com.vk.im.ui.components.contacts.b b12 = aVar.b1();
            boolean z3 = !((swa.b) swaVar).b;
            b12.getClass();
            com.vk.im.ui.components.contacts.b.c(new ns6(b12, z3, 2));
        }

        @Override // xsna.wej.a
        public final void p(List<? extends hfz> list) {
            io.reactivex.rxjava3.subjects.f<hfz> fVar = a.this.W;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                fVar.onNext((hfz) it.next());
            }
        }

        @Override // xsna.dp8
        public final void q(cq8 cq8Var) {
            a aVar = a.this;
            u90 u90Var = aVar.l;
            InterfaceC1144a interfaceC1144a = aVar.m;
            if (cq8Var instanceof cq8.f) {
                interfaceC1144a.d(false);
                return;
            }
            if (cq8Var instanceof cq8.d) {
                interfaceC1144a.d(true);
                return;
            }
            if (cq8Var instanceof cq8.e) {
                CreateChannelFlowTracker.a(CreateChannelFlowTracker.CreateChannelFlowTrackEvent.BUTTON_CREATE_CHANNEL);
                interfaceC1144a.l();
                return;
            }
            if (cq8Var instanceof cq8.c) {
                interfaceC1144a.g();
                return;
            }
            if (cq8Var instanceof cq8.g) {
                aVar.i1(new xg2(3, aVar, this));
                return;
            }
            if (cq8Var instanceof cq8.h) {
                interfaceC1144a.e(aVar.E);
                return;
            }
            if (cq8Var instanceof cq8.i) {
                interfaceC1144a.m();
                return;
            }
            if (cq8Var instanceof cq8.a) {
                Activity h = e3m.h(u90Var.B());
                if (h != null) {
                    aVar.V.b(io.reactivex.rxjava3.kotlin.c.e(aVar.b0.a(h, "").m(io.reactivex.rxjava3.android.schedulers.a.b()), new igh(aVar, 5), new dwg(aVar, 5)));
                    return;
                }
                return;
            }
            if (!(cq8Var instanceof cq8.b)) {
                throw new UnsupportedOperationException("Unsupported item " + cq8Var);
            }
            if (!aVar.b1().d().e.l) {
                aVar.i1(new akh(aVar, 3));
                return;
            }
            aVar.j.getClass();
            ContactsListFragmentRedesign.a aVar2 = new ContactsListFragmentRedesign.a();
            ContactsListFactory contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKAPP;
            Bundle bundle = aVar2.j;
            bundle.putSerializable("factory", contactsListFactory);
            aVar2.s(true);
            aVar2.y(R.attr.im_ic_back_toolbar);
            bundle.putString("force_entry_point_for_new", null);
            bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
            aVar2.m(u90Var);
        }

        @Override // xsna.l270
        public final void s() {
            a aVar = a.this;
            aVar.j.k();
            Context B = aVar.l.B();
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            B.startActivity(intent);
        }

        @Override // xsna.gei0
        public final boolean t(ldi0.b bVar) {
            return !a.this.y.b.contains(bVar.a.B7());
        }

        @Override // xsna.e960
        public final void u(List<? extends qtd0> list) {
            a aVar = a.this;
            o0r0 d = aVar.j.d();
            List<? extends qtd0> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((qtd0) it.next()).G3()));
            }
            d.l();
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((qtd0) it2.next()).B7());
            }
            aVar.i.D(this, new ebj("ContactsListComponent", arrayList2));
        }

        @Override // xsna.lfp
        public final void v() {
            g2v.c().getClass();
            Context B = a.this.l.B();
            DiscoverSearchFragment.a aVar = new DiscoverSearchFragment.a();
            aVar.F();
            aVar.k(B);
        }

        @Override // xsna.i8j
        public final void w(t8j t8jVar, boolean z) {
            InterfaceC1144a interfaceC1144a = a.this.m;
            qtd0 qtd0Var = t8jVar.b;
            interfaceC1144a.j();
        }

        @Override // xsna.i8j
        public final boolean x(t8j t8jVar) {
            a aVar = a.this;
            return (!aVar.v || aVar.u || t8jVar.c == 5) ? false : true;
        }

        @Override // xsna.i8j
        public final void l(String str) {
        }
    }
}
