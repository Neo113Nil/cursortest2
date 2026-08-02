package com.vk.clips.entrypoints.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.clips.entrypoints.feature.ClipsEntryPointAnalyticsEvent;
import com.vk.clips.entrypoints.feature.ClipsEntryPointsState;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.params.ClipsMediaPickerTab;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsViewState;
import com.vk.clips.entrypoints.ui.a;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.movika.sdk.base.ui.t;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.Iterator;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ab;
import xsna.ao50;
import xsna.asu0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d9f;
import xsna.e3m;
import xsna.eqd;
import xsna.gm50;
import xsna.gr3;
import xsna.hg1;
import xsna.i0q0;
import xsna.izs;
import xsna.j1e;
import xsna.ka0;
import xsna.kbk;
import xsna.km50;
import xsna.kod;
import xsna.lbk;
import xsna.lk;
import xsna.lpj;
import xsna.m1e;
import xsna.mhd;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.n1d;
import xsna.n1e;
import xsna.n4a0;
import xsna.nds;
import xsna.no;
import xsna.o1e;
import xsna.obs;
import xsna.oo;
import xsna.oz50;
import xsna.p3t;
import xsna.pds;
import xsna.px0;
import xsna.r7;
import xsna.rj1;
import xsna.rzp0;
import xsna.s3q0;
import xsna.sf1;
import xsna.sx0;
import xsna.t3t;
import xsna.tb4;
import xsna.uds;
import xsna.v6;
import xsna.vds;
import xsna.vk50;
import xsna.wm1;
import xsna.xm1;
import xsna.xn50;
import xsna.y6;
import xsna.yiz;
import xsna.yl0;
import xsna.yrn0;
import xsna.yw90;
import xsna.zj;
import xsna.zrd0;
import xsna.zx;

/* compiled from: ClipsEntryPointsFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsEntryPointsFragment extends MviImplFragment<com.vk.clips.entrypoints.feature.b, ClipsEntryPointsViewState, com.vk.clips.entrypoints.ui.a> implements nds, uds, vds {
    public static final /* synthetic */ int i0 = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public pds Z;
    public int a0;
    public final d b0;
    public final Object c0;
    public final bpn0 d0;
    public final bpn0 e0;
    public VkText f0;
    public io.reactivex.rxjava3.disposables.c g0;
    public int h0;

    /* compiled from: ClipsEntryPointsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsEntryPointsFragment.kt */
    public static final class b {
        public final ConstraintLayout a;
        public final FrameLayout b;
        public final ViewPager2 c;
        public final Flow d;
        public final View e;
        public final RecyclerView f;
        public final VkButton g;
        public final VkText h;
        public final VkText i;
        public final VkText j;
        public final VkText k;
        public final VkText l;

        public b(View view) {
            this.a = (ConstraintLayout) view.findViewById(R.id.clips_entry_point_root_layout);
            this.b = (FrameLayout) view.findViewById(R.id.clips_entry_point_toolbar_container);
            this.c = (ViewPager2) view.findViewById(R.id.entry_points_view_pager);
            this.d = (Flow) view.findViewById(R.id.entry_points_tab_view);
            this.e = view.findViewById(R.id.entry_points_tab_photos_view);
            this.f = (RecyclerView) view.findViewById(R.id.entry_points_photos_recycler);
            this.g = (VkButton) view.findViewById(R.id.entry_points_photos_go);
            this.h = (VkText) view.findViewById(R.id.clips_gallery_tab);
            this.i = (VkText) view.findViewById(R.id.clips_drafts_tab);
            this.j = (VkText) view.findViewById(R.id.clips_templates_tab);
            this.k = (VkText) view.findViewById(R.id.clips_trends_tab);
            this.l = (VkText) view.findViewById(R.id.entry_points_drafts_counter);
        }
    }

    /* compiled from: ClipsEntryPointsFragment.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipsEntryPointAnalyticsEvent.TabSelectedEvent.EntryPointTabType.values().length];
            try {
                iArr[ClipsEntryPointAnalyticsEvent.TabSelectedEvent.EntryPointTabType.DRAFTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsEntryPointAnalyticsEvent.TabSelectedEvent.EntryPointTabType.TEMPLATES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsEntryPointAnalyticsEvent.TabSelectedEvent.EntryPointTabType.TRENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsEntryPointAnalyticsEvent.TabSelectedEvent.EntryPointTabType.GALLERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipsEntryPointsViewState.UIScreenMode.values().length];
            try {
                iArr2[ClipsEntryPointsViewState.UIScreenMode.PHOTO_PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClipsEntryPointsViewState.UIScreenMode.DRAFTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ClipsEntryPointsViewState.UIScreenMode.TEMPLATES.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ClipsEntryPointsViewState.UIScreenMode.TRENDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ClipsEntryPointsFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<com.vk.clips.entrypoints.ui.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.clips.entrypoints.ui.a aVar) {
            ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) this.receiver;
            clipsEntryPointsFragment.getClass();
            xn50.a.c(clipsEntryPointsFragment, aVar);
            return s3q0.a;
        }
    }

    public ClipsEntryPointsFragment() {
        t tVar = new t(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, tVar);
        int i = 16;
        this.R = msy.a(lazyThreadSafetyMode, new v6(this, i));
        int i2 = 23;
        this.S = msy.a(lazyThreadSafetyMode, new y6(this, i2));
        this.T = msy.a(lazyThreadSafetyMode, new rj1(this, i2));
        this.U = msy.a(lazyThreadSafetyMode, new no(this, i2));
        this.V = msy.a(lazyThreadSafetyMode, new oo(this, 17));
        this.W = msy.a(lazyThreadSafetyMode, new wm1(this, i));
        this.X = msy.a(lazyThreadSafetyMode, new lk(10));
        this.Y = msy.a(lazyThreadSafetyMode, new xm1(this, 22));
        this.b0 = new d();
        this.c0 = msy.a(lazyThreadSafetyMode, new ka0(this, i2));
        this.d0 = new bpn0(new sx0(this, i));
        this.e0 = new bpn0(new com.vk.movika.sdk.base.logic.interactor.b(this, 18));
        this.h0 = 8;
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.CLIPS_MEDIAPICKER_MEDIA, null, false, 62).j();
        mzp0Var.b();
        mzp0Var.init();
        this.J = mzp0Var;
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.CLIPS_MEDIAPICKER_MEDIA).j();
        yw90Var.init();
        this.L = yw90Var;
    }

    public static final void fo(ClipsEntryPointsFragment clipsEntryPointsFragment, b bVar, String str) {
        View inflate = LayoutInflater.from(clipsEntryPointsFragment.ko()).inflate(R.layout.clips_entry_point_toolbar, (ViewGroup) null);
        ((VkText) inflate.findViewById(R.id.clips_entry_point_toolbar_title)).setText(str);
        bwt0.i0(inflate.findViewById(R.id.clips_entry_point_toolbar_close_button), new zx(clipsEntryPointsFragment, 23));
        bVar.b.addView(inflate);
    }

    public static void go(b bVar) {
        bVar.h.setSelected(false);
        bVar.i.setSelected(false);
        bVar.j.setSelected(false);
        bVar.k.setSelected(false);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.clips_entry_points_fragment);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        ClipsEntryPointsViewState clipsEntryPointsViewState = (ClipsEntryPointsViewState) ao50Var;
        b bVar = new b(view);
        t3t t3tVar = (t3t) this.c0.getValue();
        lpj ko = ko();
        ClipsEntryPointsParams jo = jo();
        ?? r13 = this.X;
        yrn0 yrn0Var = new yrn0(this, bVar.c, this.D, t3tVar, ko, ((j1e) r13.getValue()).a(), jo, (mhd) this.V.getValue(), this.b0);
        v vVar = new v(new n1e());
        asu0 asu0Var = asu0.a;
        hg1.a(vVar.q(asu0Var.c()).subscribe(), this);
        ViewPager2 viewPager2 = bVar.c;
        viewPager2.setAdapter(yrn0Var);
        viewPager2.setUserInputEnabled(false);
        int i = 2;
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.b(new com.vk.clips.entrypoints.ui.b(this, bVar, yrn0Var));
        bwt0.i0(bVar.h, new sf1(this, 25));
        bwt0.i0(bVar.i, new o1e(this, 0));
        bwt0.i0(bVar.j, new r7(this, 29));
        bwt0.i0(bVar.k, new eqd(this, i));
        n4a0 n4a0Var = new n4a0();
        RecyclerView recyclerView = bVar.f;
        recyclerView.setAdapter(n4a0Var);
        ko();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        bwt0.i0(bVar.g, new ab(6, this, bVar));
        ?? r1 = this.T;
        ((d9f) r1.getValue()).e("ClipsEntryPointsFragment");
        this.g0 = hg1.h(((d9f) r1.getValue()).d(TemplatesFlowScreen.ENTRY_POINTS).a0(asu0Var.d()), new n1d(this, i));
        gm50.a.b(this, clipsEntryPointsViewState.a, new zj(11));
        gm50.a.b(this, clipsEntryPointsViewState.b, new yl0(3, this, bVar));
        gm50.a.b(this, clipsEntryPointsViewState.c, new tb4(6));
        ClipsEntryPointsParams jo2 = jo();
        if (jo2 == null || (creationEntryPoint = jo2.b) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        j1e j1eVar = (j1e) r13.getValue();
        j1eVar.getClass();
        UiTracker uiTracker = UiTracker.a;
        new kod(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem(MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType.OPEN_MEDIAPICKER, new MobileOfficialAppsClipsStat$ClipsCreateContext(j1eVar.a(), creationEntryPoint))).q();
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.clips.entrypoints.feature.b bVar = (com.vk.clips.entrypoints.feature.b) vk50Var;
        lo();
        bVar.g.a(new gr3(this, 15), this);
        bVar.h.a(new com.vk.im.engine.internal.api_commands.messages.a(this, 19), this);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, a.b.b);
        return true;
    }

    public final boolean ho() {
        return ((Boolean) this.e0.getValue()).booleanValue();
    }

    public final p3t io() {
        Object obj;
        Iterator<T> it = getChildFragmentManager().c.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Fragment) obj) instanceof p3t) {
                break;
            }
        }
        if (obj instanceof p3t) {
            return (p3t) obj;
        }
        return null;
    }

    public final ClipsEntryPointsParams jo() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (ClipsEntryPointsParams) arguments.getParcelable("arg_entry_points_params");
        }
        return null;
    }

    public final lpj ko() {
        Context mo2getContext = mo2getContext();
        return mo2getContext != null ? bwt0.u(mo2getContext) : new lpj();
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return e3m.f(R.attr.vk_ui_background_content, ko());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void lo() {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        ClipsEntryPointsParams jo = jo();
        if (jo == null || (creationEntryPoint = jo.b) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        lbk lbkVar = (lbk) this.U.getValue();
        int a2 = ((j1e) this.X.getValue()).a();
        ClipsEntryPointsParams jo2 = jo();
        lbkVar.j(new kbk(creationEntryPoint, a2, true, jo2 != null ? jo2.h : false));
    }

    @Override // xsna.woo0
    public final int o7() {
        return e3m.f(R.attr.vk_ui_background_content, ko());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 13 || i == 18940) {
                finish();
                ClipsEntryPointsParams jo = jo();
                if (jo == null || !jo.h) {
                    i0q0.f(new px0(ko(), 19));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((d9f) this.T.getValue()).a(TemplatesFlowScreen.ENTRY_POINTS);
        io.reactivex.rxjava3.disposables.c cVar = this.g0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g0 = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Z = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        pds pdsVar = this.Z;
        if (pdsVar != null) {
            pdsVar.J0();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        pds pdsVar = this.Z;
        if (pdsVar != null) {
            pdsVar.o1();
        }
        xn50.a.c(this, a.h.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        p3t io2 = io();
        if (io2 == null) {
            return;
        }
        yiz.j(io2, (t3t) this.c0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        ClipsMediaPickerTab clipsMediaPickerTab;
        ClipsEntryPointsParams jo = jo();
        if (jo == null || (clipsMediaPickerTab = jo.i) == null) {
            clipsMediaPickerTab = ClipsMediaPickerTab.Gallery;
        }
        return new com.vk.clips.entrypoints.feature.b(new com.vk.clips.entrypoints.feature.e(new ClipsEntryPointsState.b(clipsMediaPickerTab, ((Boolean) this.d0.getValue()).booleanValue(), ho())), (m1e) this.Q.getValue());
    }

    /* compiled from: ClipsEntryPointsFragment.kt */
    public static final class d implements obs {
        public d() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
            a.h hVar = a.h.b;
            ClipsEntryPointsFragment clipsEntryPointsFragment = ClipsEntryPointsFragment.this;
            clipsEntryPointsFragment.getClass();
            xn50.a.c(clipsEntryPointsFragment, hVar);
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroy() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onPause() {
        }

        @Override // xsna.obs
        public final void onResume() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
