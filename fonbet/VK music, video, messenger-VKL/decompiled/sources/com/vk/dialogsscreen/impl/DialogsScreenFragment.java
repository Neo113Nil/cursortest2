package com.vk.dialogsscreen.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import android.view.ViewStub;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dialogsscreen.impl.a;
import com.vk.dialogstoolbar.impl.di.DialogsToolbarInternalFeatureComponent;
import com.vk.dialogtags.api.a;
import com.vk.im.business.notifications.api.BusinessNotificationComponent;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.education.EduMaxTransitionBannerLocalState$EntryPoint;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.managed_groups.api.ManagedGroupsComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.n0;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;
import xsna.a1w;
import xsna.b1s;
import xsna.b2s;
import xsna.bpn0;
import xsna.bu00;
import xsna.c4g0;
import xsna.cau0;
import xsna.d7p;
import xsna.dhr0;
import xsna.di3;
import xsna.dne;
import xsna.dx90;
import xsna.e43;
import xsna.f0c;
import xsna.fpf0;
import xsna.g2v;
import xsna.i5;
import xsna.i5f;
import xsna.i6p;
import xsna.i7o0;
import xsna.i9;
import xsna.iut0;
import xsna.iwm;
import xsna.jpm;
import xsna.jrh;
import xsna.jtm;
import xsna.jyv;
import xsna.kju0;
import xsna.km1;
import xsna.krh;
import xsna.l0s;
import xsna.l1s;
import xsna.lpj;
import xsna.m7m;
import xsna.mb80;
import xsna.mdz;
import xsna.msy;
import xsna.mxv;
import xsna.myh;
import xsna.mzp0;
import xsna.nbs;
import xsna.o25;
import xsna.oqx0;
import xsna.ow90;
import xsna.oz50;
import xsna.p1a0;
import xsna.p1s;
import xsna.pbw;
import xsna.pff;
import xsna.ptm;
import xsna.q1w;
import xsna.qhh0;
import xsna.qo0;
import xsna.rsr;
import xsna.rzp0;
import xsna.s3q0;
import xsna.sbw0;
import xsna.seb;
import xsna.szf0;
import xsna.too0;
import xsna.u4e;
import xsna.vi00;
import xsna.vmm;
import xsna.wuj;
import xsna.xds;
import xsna.xrj;
import xsna.y1z;
import xsna.y760;
import xsna.yj50;
import xsna.yw90;
import xsna.zdw;
import xsna.zeb;
import xsna.zrd0;
import xsna.zyv;

/* compiled from: DialogsScreenFragment.kt */
/* loaded from: classes.dex */
public final class DialogsScreenFragment extends MultiComponentFragment implements qhh0, xds, szf0, y760, ptm, too0 {
    public static final /* synthetic */ int p0 = 0;
    public final a1w U;
    public final io.reactivex.rxjava3.disposables.b V;
    public final nbs W;
    public final b X;
    public final Object Y;
    public final Object Z;
    public final OpenChatListReporter a0;
    public final mdz<OpenChatListReporter.Span> b0;
    public final Object c0;
    public final l0s d0;
    public final seb e0;
    public final Object f0;
    public i6p g0;
    public final Object h0;
    public final bpn0 i0;
    public c j0;
    public jpm k0;
    public yj50<?, ?, ?, ?, ?, ?, ?> l0;
    public int m0;
    public int n0;
    public l1s o0;

    /* compiled from: DialogsScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
        public a() {
            super(DialogsScreenFragment.class, null, null);
        }

        @Override // xsna.oz50
        public final Intent n(Context context) {
            this.j.putString("performance_track_id", UUID.randomUUID().toString());
            return super.n(context);
        }
    }

    /* compiled from: DialogsScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final class b extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public DialogsScreenFragment() {
        super(R.layout.im_dialogs_screen);
        a1w a1wVar = q1w.a;
        this.U = a1wVar == null ? null : a1wVar;
        this.V = new io.reactivex.rxjava3.disposables.b();
        this.W = new nbs(this.D);
        this.X = new b();
        jrh jrhVar = new jrh(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Y = msy.a(lazyThreadSafetyMode, jrhVar);
        Lazy a2 = msy.a(lazyThreadSafetyMode, new myh(this, 7));
        this.Z = a2;
        OpenChatListReporter g = ((pbw) a2.getValue()).n().g(c4g0.s());
        this.a0 = g;
        mdz<OpenChatListReporter.Span> a3 = mdz.a.a(OpenChatListReporter.Span.ROOT);
        g.c(a3);
        this.b0 = a3;
        this.c0 = msy.a(lazyThreadSafetyMode, new dne(this, 15));
        this.d0 = new l0s(a3, g, ((pbw) a2.getValue()).t().a());
        zdw zdwVar = i7o0.b;
        this.e0 = ((kju0) (zdwVar == null ? null : zdwVar).c()).l;
        this.f0 = msy.a(lazyThreadSafetyMode, new krh(this, 6));
        this.h0 = msy.a(lazyThreadSafetyMode, new i9(this, 20));
        this.i0 = new bpn0(new xrj(this, 2));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.IM, null, false, 62).j();
        mzp0Var.init();
        g.d(mzp0Var);
        this.J = mzp0Var;
        zrd0 zrd0Var = zrd0.a;
        this.L = (yw90) zrd0.a(PerformanceScoreProduct.IM).j();
        On().init();
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.X;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        this.X.b();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo() {
        ListBuilder e = e43.e();
        zdw zdwVar = i7o0.b;
        wuj wujVar = (wuj) (zdwVar != null ? zdwVar : null).m.a;
        b2s b2sVar = (b2s) (zdwVar != null ? zdwVar : null).p.a;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zeb c = zdwVar.c();
        zyv zyvVar = c != null ? ((kju0) c).h : null;
        vi00 g1 = ((ManagedGroupsComponent) m7m.d(this).a(fpf0.a(ManagedGroupsComponent.class))).g1();
        mxv c2 = g2v.c();
        ?? r12 = this.h0;
        l1s l1sVar = new l1s(this, wujVar, b2sVar, zyvVar, g1, this.U, c2, this.e0, this.d0, (d7p) r12.getValue());
        this.o0 = l1sVar;
        e.add(l1sVar);
        io.reactivex.rxjava3.disposables.b bVar = this.V;
        a1w a1wVar = this.U;
        jpm jpmVar = new jpm(this, g2v.c().b(), null, null, new p1a0((VkOnboardingComponent) m7m.d(this).a(fpf0.a(VkOnboardingComponent.class)), this.W, new f0c(a1wVar, bVar)), 12);
        this.k0 = jpmVar;
        e.add(jpmVar);
        iwm ra = ((DialogsToolbarInternalFeatureComponent) this.f0.getValue()).ra();
        a.b bVar2 = new a.b(g2v.c().b(), g2v.c().k());
        a.C0895a c0895a = new a.C0895a(new vmm(this, g2v.c().d(), ((VkClientMultiAccountComponent) m7m.d(this).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments(), new pff(this, 16)), new jyv(kn(), g2v.c().j(), ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).a()));
        di3 di3Var = new di3(a1wVar, this.e0);
        g2v.c().getClass();
        yj50<?, ?, ?, ?, ?, ?, ?> a2 = ra.a(this, new com.vk.dialogsscreen.impl.a(this.U, bVar2, c0895a, di3Var, a.C0896a.a.getSTUB(), ((BusinessNotificationComponent) m7m.d(this).mo408a(fpf0.a(BusinessNotificationComponent.class))).i4(), (d7p) r12.getValue(), this.o0.m()));
        this.l0 = a2;
        e.add(a2);
        e.add(new sbw0(this, this.U, new qo0(13), new u4e(this, 10), 2));
        return e.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.os.Parcelable] */
    @Override // xsna.y760
    public final void h9(Intent intent) {
        l1s l1sVar;
        b1s m;
        Parcelable parcelable;
        Object parcelable2;
        rsr rsrVar = oz50.k;
        FragmentEntry c = oz50.b.c(intent.getExtras());
        Bundle bundle = c != null ? c.c : null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("open_target_folder", FolderType.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = bundle.getParcelable("open_target_folder");
                parcelable = parcelable3 instanceof FolderType ? parcelable3 : null;
            }
            r0 = (FolderType) parcelable;
        }
        if (r0 == null || (l1sVar = this.o0) == null || (m = l1sVar.m()) == null) {
            return;
        }
        m.d(new mb80(r0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final void io() {
        this.a0.c((mdz) this.c0.getValue());
    }

    @Override // xsna.xoo0
    public final int l2() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.k.getClass();
        return dhr0.t.c(R.attr.vk_ui_background_content);
    }

    public final void lo() {
        oqx0 i = iut0.i(kn().getWindow().getDecorView());
        if (i != null) {
            i.b(!dhr0.M());
        }
        c cVar = this.j0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.j0 = null;
    }

    public final void mo(View view) {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.k.getClass();
        ((Number) this.i0.getValue()).intValue();
        dhr0.a.e0(R.attr.vk_ui_background_content, view.findViewById(R.id.dialogs_toolbar_container));
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OpenChatListReporter openChatListReporter = this.a0;
        bu00.m(openChatListReporter, bundle);
        mdz<OpenChatListReporter.Span> a2 = this.b0.a(OpenChatListReporter.Span.ON_CREATE);
        openChatListReporter.c(a2);
        super.onCreate(bundle);
        s3q0 s3q0Var = s3q0.a;
        openChatListReporter.f(a2, null);
        String string = requireArguments().getString("performance_track_id");
        if (string != null) {
            openChatListReporter.m(string);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.V.e();
        lo();
        i6p i6pVar = this.g0;
        if (i6pVar != null) {
            i6pVar.b();
        }
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.m0 = 0;
        this.n0 = 0;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.a0.b();
        lo();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        yj50<?, ?, ?, ?, ?, ?, ?> yj50Var = this.l0;
        if (yj50Var != null) {
            yj50Var.l(new i5f(this, 15));
        }
        ((pbw) this.Z.getValue()).h().a();
        this.a0.n(OpenChatListReporter.MeasuringPoint.RESUMED);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bu00.o(bundle);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable;
        l1s l1sVar;
        b1s m;
        Object parcelable2;
        jpm jpmVar = this.k0;
        if (jpmVar != null) {
            jpmVar.l(new km1(9, this, view));
        }
        if (o25.b(o25.a())) {
            i6p i6pVar = new i6p((ViewStub) view.findViewById(R.id.vkim_transtion_max_banner_stub), EduMaxTransitionBannerLocalState$EntryPoint.CHATS, m7m.d(this), new n0(17));
            this.g0 = i6pVar;
            i6pVar.a();
        }
        mo(view);
        yj50<?, ?, ?, ?, ?, ?, ?> yj50Var = this.l0;
        if (yj50Var != null) {
            yj50Var.l(new i5(12, this, view));
        }
        super.onViewCreated(view, bundle);
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        dx90Var.h = System.currentTimeMillis();
        dx90Var.r();
        this.a0.f((mdz) this.c0.getValue(), null);
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("open_target_folder", FolderType.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("open_target_folder");
            if (!(parcelable3 instanceof FolderType)) {
                parcelable3 = null;
            }
            parcelable = (FolderType) parcelable3;
        }
        FolderType folderType = (FolderType) parcelable;
        if (folderType == null || (l1sVar = this.o0) == null || (m = l1sVar.m()) == null) {
            return;
        }
        m.d(new mb80(folderType));
    }

    @Override // xsna.ptm
    public final jtm p2() {
        return this.d0.p2();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        ho(p1s.e.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        l1s l1sVar = this.o0;
        if (l1sVar != null) {
            l1sVar.n(uiTrackingScreen);
        }
    }
}
