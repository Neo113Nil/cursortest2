package com.vk.clips.tool.view.newsfeed.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.tool.view.newsfeed.mytarget.ClipEndOverlayAdWrapperView;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import defpackage.r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1p0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d3m;
import xsna.dmx0;
import xsna.enj;
import xsna.f4m;
import xsna.g7u0;
import xsna.gmc;
import xsna.gzs;
import xsna.h9;
import xsna.i0q0;
import xsna.iah0;
import xsna.ic;
import xsna.j5g;
import xsna.j70;
import xsna.kvc;
import xsna.lvc;
import xsna.lyk0;
import xsna.msy;
import xsna.mvc;
import xsna.o25;
import xsna.qcy;
import xsna.qnk;
import xsna.xme;
import xsna.yh;
import xsna.zu50;

/* compiled from: ClipEndOverlayView.kt */
/* loaded from: classes17.dex */
public final class ClipEndOverlayView extends FrameLayout implements View.OnClickListener, a1p0 {
    public static final /* synthetic */ int u = 0;
    public final AtomicBoolean b;
    public mvc c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public View.OnClickListener j;
    public a k;
    public lyk0 l;
    public final ArrayList m;
    public final ArrayList n;
    public View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final bpn0 s;
    public boolean t;

    /* compiled from: ClipEndOverlayView.kt */
    public interface a {
        void a(View view);

        void b();
    }

    /* compiled from: ClipEndOverlayView.kt */
    public static final class b {
        public b() {
        }

        public final void a() {
            lyk0 lyk0Var = ClipEndOverlayView.this.l;
            if (lyk0Var != null) {
                ((xme) lyk0Var.b).f((String) lyk0Var.c);
            }
        }
    }

    public ClipEndOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new AtomicBoolean(false);
        j70 j70Var = new j70(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, j70Var);
        this.e = msy.a(lazyThreadSafetyMode, new r(this, 25));
        this.f = msy.a(lazyThreadSafetyMode, new yh(this, 22));
        this.g = msy.a(lazyThreadSafetyMode, new ic(this, 21));
        this.h = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 24));
        this.i = msy.a(lazyThreadSafetyMode, new h9(this, 18));
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.s = new bpn0(new com.vk.movika.sdk.base.presenter.b(context, 11));
        if (i0q0.b()) {
            return;
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipEndOverlayAdWrapperView getAdBanner() {
        return (ClipEndOverlayAdWrapperView) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkBlurView getBlurView() {
        return (VkBlurView) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getClipProductsContainer() {
        return (FrameLayout) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ConstraintLayout getLayout() {
        return (ConstraintLayout) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkButton getMoreButton() {
        return (VkButton) this.d.getValue();
    }

    private final int getOverlaySecondaryColor() {
        return ((Number) this.s.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkButton getReplayButton() {
        return (VkButton) this.e.getValue();
    }

    private final void setupAd(ClipEndOverlayAdWrapperView.b bVar) {
        ClipEndOverlayAdWrapperView adBanner = getAdBanner();
        b bVar2 = new b();
        adBanner.i = bVar2;
        g7u0 g7u0Var = adBanner.f;
        if (bVar instanceof ClipEndOverlayAdWrapperView.b.C0697b) {
            gmc gmcVar = ((ClipEndOverlayAdWrapperView.b.C0697b) bVar).a;
            adBanner.h = gmcVar;
            adBanner.g = new ClipEndOverlayAdWrapperView.c(g7u0Var);
            adBanner.f();
            adBanner.g(gmcVar.a, gmcVar.b, gmcVar.c);
            return;
        }
        if (!(bVar instanceof ClipEndOverlayAdWrapperView.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipEndOverlayAdWrapperView.b.a aVar = (ClipEndOverlayAdWrapperView.b.a) bVar;
        adBanner.k = aVar.a;
        Context context = adBanner.getContext();
        lvc lvcVar = aVar.b;
        gzs<Boolean> gzsVar = aVar.c;
        adBanner.g = new ClipEndOverlayAdWrapperView.c(g7u0Var);
        zu50 zu50Var = new zu50(1800185, adBanner.c, context);
        qnk qnkVar = zu50Var.a.a;
        qnkVar.i(String.valueOf(o25.a().c().b));
        HashMap<String, Object> hashMap = lvcVar.f;
        if (hashMap != null) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                qnkVar.g(entry.getKey(), entry.getValue().toString());
            }
        }
        if (dmx0.c()) {
            qnkVar.g("is_whitelist_internet", "1");
        }
        List<String> list = lvcVar.d;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                qnkVar.g("wb_item_id", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
            }
        }
        String str = lvcVar.e;
        if (str != null) {
            qnkVar.g("articles", str);
        }
        Integer num = lvcVar.a;
        if (num != null) {
            qnkVar.g("clip_id", String.valueOf(num.intValue()));
        }
        UserId userId = lvcVar.b;
        if (userId != null) {
            qnkVar.g("owner_id", String.valueOf(userId.b));
        }
        qnkVar.g("clip_end_banner_redesign", "1");
        zu50Var.i = new kvc(adBanner, lvcVar, gzsVar);
        lyk0 lyk0Var = ClipEndOverlayView.this.l;
        if (lyk0Var != null) {
            ((xme) lyk0Var.b).d((String) lyk0Var.c);
        }
        zu50Var.g();
    }

    @Override // xsna.a1p0
    public final void G(boolean z) {
        ArrayList arrayList = this.m;
        if (z && this.b.get()) {
            this.r = true;
            d3m.c(this, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            b();
            lyk0 lyk0Var = this.l;
            if (lyk0Var != null) {
                ((xme) lyk0Var.b).b((String) lyk0Var.c);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((gzs) it.next()).invoke();
            }
            d();
            return;
        }
        if (!z) {
            this.r = false;
            f4m.j(this);
            if (this.t) {
                this.q = false;
                lyk0 lyk0Var2 = this.l;
                if (lyk0Var2 != null) {
                    ((xme) lyk0Var2.b).e((String) lyk0Var2.c);
                }
            }
            Iterator it2 = this.n.iterator();
            while (it2.hasNext()) {
                ((gzs) it2.next()).invoke();
            }
            return;
        }
        this.r = true;
        a();
        d3m.c(this, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b();
        lyk0 lyk0Var3 = this.l;
        if (lyk0Var3 != null) {
            ((xme) lyk0Var3.b).b((String) lyk0Var3.c);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((gzs) it3.next()).invoke();
        }
        d();
    }

    public final void a() {
        if (this.b.compareAndSet(false, true)) {
            LayoutInflater.from(getContext()).inflate(R.layout.attach_clip_end_overlay, (ViewGroup) this, true);
            VkButton moreButton = getMoreButton();
            VkButton.Appearance appearance = VkButton.Appearance.Overlay;
            moreButton.setAppearance(appearance);
            moreButton.Z4(enj.e(R.drawable.vk_icon_logo_clips_outline_20, R.attr.vk_ui_background_contrast, moreButton.getContext()), true);
            bwt0.h0(this, moreButton);
            VkButton replayButton = getReplayButton();
            replayButton.setMode(VkButton.Mode.Tertiary);
            replayButton.setAppearance(appearance);
            bwt0.h0(this, replayButton);
        }
    }

    public final void b() {
        mvc mvcVar = this.c;
        ClipEndOverlayAdWrapperView.b bVar = mvcVar != null ? (ClipEndOverlayAdWrapperView.b) mvcVar.invoke() : null;
        if (bVar == null) {
            c();
            return;
        }
        if (bVar instanceof ClipEndOverlayAdWrapperView.b.a) {
            ClipEndOverlayAdWrapperView.b.a aVar = (ClipEndOverlayAdWrapperView.b.a) bVar;
            setupAd(new ClipEndOverlayAdWrapperView.b.a(aVar.a, aVar.b, aVar.c));
        } else {
            if (!(bVar instanceof ClipEndOverlayAdWrapperView.b.C0697b)) {
                throw new NoWhenBranchMatchedException();
            }
            setupAd(new ClipEndOverlayAdWrapperView.b.C0697b(((ClipEndOverlayAdWrapperView.b.C0697b) bVar).a));
        }
    }

    public final void c() {
        if (this.b.get()) {
            ClipEndOverlayAdWrapperView adBanner = getAdBanner();
            adBanner.h();
            adBanner.h = null;
            g7u0 g7u0Var = adBanner.f;
            g7u0Var.w.setImageBitmap(null);
            g7u0Var.A = null;
            g7u0Var.t.setText((CharSequence) null);
            g7u0Var.u.setText((CharSequence) null);
            VkButton vkButton = g7u0Var.v;
            vkButton.setText((CharSequence) null);
            g7u0Var.y.setText((CharSequence) null);
            FrameLayout frameLayout = g7u0Var.x;
            qcy<Object>[] qcyVarArr = bwt0.a;
            frameLayout.setOnClickListener(null);
            f4m.j(vkButton);
            g7u0Var.z = false;
            f4m.j(adBanner);
        }
        this.q = false;
    }

    public final void d() {
        FrameLayout clipProductsContainer;
        View view = this.o;
        if (view != null && ((clipProductsContainer = getClipProductsContainer()) == null || clipProductsContainer.indexOfChild(view) == -1)) {
            FrameLayout clipProductsContainer2 = getClipProductsContainer();
            if (clipProductsContainer2 != null) {
                clipProductsContainer2.removeAllViews();
            }
            FrameLayout clipProductsContainer3 = getClipProductsContainer();
            if (clipProductsContainer3 != null) {
                clipProductsContainer3.addView(view);
            }
        }
        if (this.p) {
            f4m.j(getMoreButton());
            FrameLayout clipProductsContainer4 = getClipProductsContainer();
            if (clipProductsContainer4 != null) {
                clipProductsContainer4.setVisibility(0);
            }
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(getLayout());
            bVar.k(R.id.attach_clip_end_overlay_button_container, 3, R.id.products_container, 4);
            bVar.G(R.id.attach_clip_end_overlay_button_container, 3, iah0.a(0));
            bVar.I(0.7f, R.id.attach_clip_end_overlay_button_container);
            bVar.b(getLayout());
            return;
        }
        getMoreButton().setVisibility(0);
        FrameLayout clipProductsContainer5 = getClipProductsContainer();
        if (clipProductsContainer5 != null) {
            f4m.j(clipProductsContainer5);
        }
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        bVar2.i(getLayout());
        bVar2.k(R.id.attach_clip_end_overlay_button_container, 3, R.id.attach_clip_end_overlay_container, 3);
        bVar2.G(R.id.attach_clip_end_overlay_button_container, 3, iah0.a(0));
        bVar2.I(0.5f, R.id.attach_clip_end_overlay_button_container);
        bVar2.b(getLayout());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == getMoreButton().getId()) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.b();
                return;
            }
            return;
        }
        if (id == getReplayButton().getId()) {
            a aVar2 = this.k;
            if (aVar2 != null) {
                aVar2.a(view);
                return;
            }
            return;
        }
        View.OnClickListener onClickListener = this.j;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void setButtonsClickListener(a aVar) {
        this.k = aVar;
    }

    public final void setIsLoadNewAdAfterRewatchEnabled(boolean z) {
        this.t = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.j = onClickListener;
    }

    public final void setupBlurContent(VkBlurContentView vkBlurContentView) {
    }
}
