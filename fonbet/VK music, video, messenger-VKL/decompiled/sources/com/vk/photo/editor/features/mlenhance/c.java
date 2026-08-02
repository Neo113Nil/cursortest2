package com.vk.photo.editor.features.mlenhance;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.lifecycle.j;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.base.ui.z;
import com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate;
import com.vk.photo.editor.features.mlenhance.b;
import com.vk.photo.editor.views.TinyProgressbarView;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.bdn;
import xsna.bpn0;
import xsna.bt20;
import xsna.cr20;
import xsna.ct20;
import xsna.d0u0;
import xsna.d5p;
import xsna.f5p;
import xsna.ft20;
import xsna.fyt0;
import xsna.g5p;
import xsna.g5z;
import xsna.gt20;
import xsna.h5p;
import xsna.i4p;
import xsna.iou;
import xsna.jrh;
import xsna.kmp;
import xsna.l290;
import xsna.l500;
import xsna.m3p;
import xsna.mij;
import xsna.myc0;
import xsna.nij;
import xsna.o3p;
import xsna.o44;
import xsna.ogp;
import xsna.ot20;
import xsna.p290;
import xsna.rij;
import xsna.rsz;
import xsna.spj;
import xsna.v0g;
import xsna.v3p;
import xsna.vae0;
import xsna.wae0;
import xsna.yok0;
import xsna.z00;

/* compiled from: MlEnhanceTool.kt */
/* loaded from: classes4.dex */
public final class c extends m3p<ct20> implements p290, v0g {
    public final v3p c;
    public final MlEnhanceDelegate d;
    public final ot20 e;
    public boolean f;
    public View g;
    public View h;
    public View i;
    public rsz j;
    public yok0 k;
    public final FrameLayout l;
    public final FrameLayout m;
    public kmp n;
    public o3p o;
    public final bpn0 p;
    public boolean q;

    /* compiled from: MlEnhanceTool.kt */
    public static final class a implements d5p.a<ct20> {
        public final MlEnhanceDelegate a;

        public a(gt20 gt20Var) {
            this.a = gt20Var;
        }

        @Override // xsna.d5p.a
        public final d5p<ct20> a(v3p v3pVar) {
            return new c(v3pVar, this.a);
        }
    }

    /* compiled from: MlEnhanceTool.kt */
    public static final class b implements l290 {
        public final rsz a;

        public b(c cVar) {
            this.a = cVar.j;
        }

        @Override // xsna.l290
        public final View a() {
            return null;
        }

        @Override // xsna.l290
        public final View b() {
            return this.a;
        }

        @Override // xsna.l290
        public final View c() {
            return null;
        }
    }

    public c() {
        throw null;
    }

    public c(v3p v3pVar, MlEnhanceDelegate mlEnhanceDelegate) {
        this.c = v3pVar;
        this.d = mlEnhanceDelegate;
        this.e = ot20.a;
        FrameLayout frameLayout = new FrameLayout(v3pVar.x());
        v3pVar.getView().addView(frameLayout);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        this.l = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(v3pVar.x());
        v3pVar.getView().addView(frameLayout2);
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        frameLayout2.setLayoutParams(layoutParams2);
        this.m = frameLayout2;
        this.p = new bpn0(new cr20(this, 1));
    }

    @Override // xsna.m3p
    public final /* bridge */ /* synthetic */ void G(ct20 ct20Var) {
    }

    public final void H() {
        ViewGroup viewGroup;
        Button button;
        com.vk.photo.editor.features.mlenhance.a aVar = (com.vk.photo.editor.features.mlenhance.a) this.p.getValue();
        ViewGroup viewGroup2 = aVar.b;
        if (!aVar.e && !aVar.h) {
            View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.ml_enhance_help, viewGroup2, false);
            inflate.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            inflate.setPadding(0, aVar.a.f().b, 0, 0);
            inflate.setOnClickListener(new o44(0));
            aVar.f = inflate;
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.popup);
            if (viewGroup3 != null) {
                viewGroup3.setTranslationY(viewGroup2.getHeight());
            } else {
                viewGroup3 = null;
            }
            aVar.g = viewGroup3;
            View view = aVar.f;
            if (view != null && (button = (Button) view.findViewById(R.id.btn)) != null) {
                button.setOnClickListener(new z00(aVar, 5));
            }
            aVar.b(R.id.pic1original, MlEnhanceDelegate.OnboardingResource.Pic1Original);
            aVar.b(R.id.pic1enhanced, MlEnhanceDelegate.OnboardingResource.Pic1Enhanced);
            aVar.b(R.id.pic2original, MlEnhanceDelegate.OnboardingResource.Pic2Original);
            aVar.b(R.id.pic2enhanced, MlEnhanceDelegate.OnboardingResource.Pic2Enhanced);
            View view2 = aVar.f;
            if (view2 != null && (viewGroup = aVar.g) != null) {
                viewGroup2.addView(view2);
                aVar.h = true;
                view2.animate().alpha(1.0f).setDuration(200L).start();
                d0u0.a(viewGroup.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).setStartDelay(250L), new z(5, aVar, view2)).start();
                aVar.e = true;
            }
        }
        this.c.e().c(bt20.a);
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean a0() {
        bpn0 bpn0Var = this.p;
        if (!bpn0Var.isInitialized() || !((com.vk.photo.editor.features.mlenhance.a) bpn0Var.getValue()).e) {
            return false;
        }
        ((com.vk.photo.editor.features.mlenhance.a) bpn0Var.getValue()).a(true);
        return true;
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        if (!(g5pVar == null ? true : g5pVar instanceof ct20)) {
            return null;
        }
        if (!(g5pVar2 == null ? true : g5pVar2 instanceof ct20)) {
            return null;
        }
        ct20 ct20Var = (ct20) g5pVar;
        if ((ct20Var == null || ct20Var.I()) ? false : true) {
            return this.c.x().getString(R.string.editor_history_ml_enhance_undo);
        }
        return null;
    }

    @Override // xsna.d5p
    public final f5p getId() {
        return this.e;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ h5p getRenderer() {
        return null;
    }

    @Override // xsna.d5p
    public final void k() {
        c cVar = this;
        v3p v3pVar = cVar.c;
        v3pVar.b().b(b.c.a);
        View inflate = LayoutInflater.from(v3pVar.x()).inflate(R.layout.ml_enhance_bottom, (ViewGroup) v3pVar.getBottom(), false);
        v3pVar.getBottom().addView(inflate);
        cVar.g = inflate;
        ToolBottomView toolBottomView = (ToolBottomView) inflate.findViewById(R.id.tool_bottom_view);
        toolBottomView.setOnCancelClickListener(new l500(cVar, 5));
        toolBottomView.setOnDoneClickListener(new jrh(cVar, 28));
        MlEnhanceDelegate mlEnhanceDelegate = cVar.d;
        if (mlEnhanceDelegate.b()) {
            int i = 0;
            int i2 = 0;
            toolBottomView.setOnToolNameClickListener(new mij(i2, cVar, c.class, "showOnboarding", "showOnboarding()V", i, 3));
            cVar = this;
            toolBottomView.setOnHelpClickListener(new nij(i2, cVar, c.class, "showOnboarding", "showOnboarding()V", i, 2));
        }
        cVar.i = inflate.findViewById(R.id.stub);
        cVar.h = inflate.findViewById(R.id.infoPanel);
        cVar.f = true;
        rsz rszVar = cVar.j;
        if (rszVar != null) {
            fyt0.d(rszVar, null, 7);
            j a2 = g5z.a(v3pVar.w());
            iou iouVar = new iou(rszVar, 11);
            wae0 wae0Var = new wae0(iouVar, a2);
            wae0Var.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            iouVar.invoke(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            wae0Var.c = myc0.h(a2, bdn.b, null, new vae0(wae0Var, 1500L, new Ref$FloatRef(), 0.025f, null), 2);
            rszVar.f = wae0Var;
            rszVar.e.b();
            rszVar.sendAccessibilityEvent(8);
        }
        cVar.k = myc0.h(g5z.a(v3pVar.w()), bdn.b, null, new ft20(cVar, null), 2);
        if (mlEnhanceDelegate.b() && v3pVar.e().d(bt20.a)) {
            cVar.H();
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final rij m() {
        int floor = (int) Math.floor(8 * Resources.getSystem().getDisplayMetrics().density);
        return new rij(floor, floor, floor, floor);
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean o() {
        return true;
    }

    @Override // xsna.d5p
    public final void p() {
        yok0 yok0Var;
        this.f = false;
        bpn0 bpn0Var = this.p;
        if (bpn0Var.isInitialized() && ((com.vk.photo.editor.features.mlenhance.a) bpn0Var.getValue()).e) {
            ((com.vk.photo.editor.features.mlenhance.a) bpn0Var.getValue()).a(false);
        }
        View view = this.g;
        v3p v3pVar = this.c;
        if (view != null) {
            v3pVar.getBottom().removeView(view);
            this.g = null;
        }
        if (bpn0Var.isInitialized()) {
            ((com.vk.photo.editor.features.mlenhance.a) bpn0Var.getValue()).a(false);
        }
        rsz rszVar = this.j;
        if (rszVar != null) {
            wae0 wae0Var = rszVar.f;
            if (wae0Var != null && (yok0Var = wae0Var.c) != null) {
                yok0Var.b(null);
            }
            rszVar.e.c();
        }
        rsz rszVar2 = this.j;
        if (rszVar2 != null) {
            rszVar2.setVisibility(8);
        }
        yok0 yok0Var2 = this.k;
        if (yok0Var2 != null) {
            yok0Var2.b(null);
        }
        this.d.c();
        kmp kmpVar = this.n;
        if (kmpVar != null) {
            this.l.removeView(kmpVar);
            this.n = null;
        }
        o3p o3pVar = this.o;
        if (o3pVar != null) {
            v3pVar.u().a(o3pVar);
            this.o = null;
        }
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        if (!(g5pVar == null ? true : g5pVar instanceof ct20)) {
            return null;
        }
        if (!(g5pVar2 == null ? true : g5pVar2 instanceof ct20)) {
            return null;
        }
        ct20 ct20Var = (ct20) g5pVar2;
        if ((ct20Var == null || ct20Var.I()) ? false : true) {
            return this.c.x().getString(R.string.editor_history_ml_enhance_redo);
        }
        return null;
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_MlEnhance, R.style.EditorToolButton_MlEnhance, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_color_ml_enhance));
        return toolButton;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super ogp> spjVar) {
        return ogp.a;
    }

    @Override // xsna.p290
    public final l290 x(Context context) {
        v3p v3pVar = this.c;
        Context x = v3pVar.x();
        rsz rszVar = new rsz(x, null, 0);
        LayoutInflater.from(x).inflate(R.layout.ml_enhance_loader, (ViewGroup) rszVar, true);
        rszVar.b = (FrameLayout) rszVar.findViewById(R.id.loaderWrapper);
        rszVar.c = rszVar.findViewById(R.id.loader);
        rszVar.d = (TinyProgressbarView) rszVar.findViewById(R.id.progressbar);
        rszVar.e = (TextSwitcherView) rszVar.findViewById(R.id.textSwitcher);
        rszVar.setContentDescription(x.getString(R.string.editor_ml_enhance_accessibility_loader));
        rszVar.setVisibility(8);
        rszVar.setCustomLoadingIndicator(this.d.d());
        v3pVar.l().addView(rszVar);
        this.j = rszVar;
        return new b(this);
    }
}
