package com.vk.clips.tool.view.newsfeed.mytarget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.tool.view.newsfeed.mytarget.ClipEndOverlayAdWrapperView;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.picture.VkImage;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.util.a;
import com.vkontakte.android.R;
import defpackage.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.anj;
import xsna.b520;
import xsna.bp50;
import xsna.bwt0;
import xsna.cw50;
import xsna.d3m;
import xsna.e3m;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.f5;
import xsna.g7u0;
import xsna.gmc;
import xsna.gzs;
import xsna.iah0;
import xsna.ikv0;
import xsna.kiw;
import xsna.l0n;
import xsna.lv50;
import xsna.lvc;
import xsna.msy;
import xsna.oh3;
import xsna.s4e0;
import xsna.tkp;
import xsna.vi0;
import xsna.z960;
import xsna.zu50;

/* compiled from: ClipEndOverlayAdWrapperView.kt */
/* loaded from: classes17.dex */
public final class ClipEndOverlayAdWrapperView extends FrameLayout {
    public static final /* synthetic */ int m = 0;
    public final Object b;
    public final bp50 c;
    public final a d;
    public final d e;
    public final g7u0 f;
    public c g;
    public gmc h;
    public ClipEndOverlayView.b i;
    public final Object j;
    public NewsEntry k;
    public final e l;

    /* compiled from: ClipEndOverlayAdWrapperView.kt */
    public final class a implements bp50.a {
        public String a;

        public a() {
        }

        @Override // xsna.bp50.a
        public final void a(final Context context, ArrayList arrayList) {
            final ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView = ClipEndOverlayAdWrapperView.this;
            final bp50 bp50Var = clipEndOverlayAdWrapperView.c;
            final com.vk.newsfeed.common.util.d dVar = new com.vk.newsfeed.common.util.d();
            dVar.b = true;
            dVar.c = true;
            dVar.d = bp50Var.c;
            dVar.e = this.a;
            dVar.f = new z960() { // from class: xsna.jvc
                /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
                @Override // xsna.z960
                public final void g(VkContextMenu vkContextMenu, int i) {
                    NewsfeedRouter newsfeedRouter;
                    int h = PostActions.ACTION_SHOW_AD_DEBUG_INFO.h();
                    bp50 bp50Var2 = bp50.this;
                    if (i == h) {
                        bp50Var2.c("debug");
                    } else {
                        int h2 = PostActions.ACTION_COPY_ADS_URL.h();
                        ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView2 = clipEndOverlayAdWrapperView;
                        if (i == h2) {
                            ClipEndOverlayAdWrapperView.e(clipEndOverlayAdWrapperView2, R.string.ads_snackbar_link_copied);
                            bp50Var2.c("ads_copy_url");
                        } else if (i == PostActions.ACTION_SHOW_ADVERTISER_INFO.h()) {
                            bp50Var2.c("show_advertiser_info");
                        } else if (i == PostActions.ACTION_OPEN_RECOMMENDATION_URL.h()) {
                            bp50Var2.c("ads_recommendations_info");
                        } else if (i == PostActions.ACTION_COPY_AD_MARKER.h()) {
                            ClipEndOverlayAdWrapperView.e(clipEndOverlayAdWrapperView2, R.string.ads_snackbar_erid_copied);
                            bp50Var2.c("ad_marker_template");
                        } else {
                            int h3 = PostActions.ACTION_HIDE_AD_MY_TARGET_NATIVE_AD.h();
                            Context context2 = context;
                            VkContextMenu vkContextMenu2 = null;
                            if (i == h3) {
                                if (vkContextMenu != null) {
                                    vkContextMenu.e(null);
                                }
                                if (vkContextMenu != null) {
                                    vkContextMenu.b();
                                }
                                a.AbstractC1374a.C1375a a = ClipEndOverlayAdWrapperView.a(clipEndOverlayAdWrapperView2, clipEndOverlayAdWrapperView2.getAdChoicesAnchorView());
                                defpackage.o oVar = new defpackage.o(9, clipEndOverlayAdWrapperView2, bp50Var2);
                                ArrayList arrayList2 = dVar.d;
                                if (arrayList2 != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj : arrayList2) {
                                        b520 b520Var = (b520) obj;
                                        if (epx.f(b520Var.b, "hide") && b520Var.a.length() > 0) {
                                            arrayList3.add(obj);
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        fmc fmcVar = new fmc();
                                        Iterator it = arrayList3.iterator();
                                        int i2 = 0;
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            int i3 = i2 + 1;
                                            if (i2 < 0) {
                                                e43.t();
                                                throw null;
                                            }
                                            fmcVar.K0(i2, ((b520) next).a, null, ((Number) fmcVar.j.getValue()).intValue(), ((Number) fmcVar.k.getValue()).intValue());
                                            i2 = i3;
                                        }
                                        fmcVar.e = new ex0(1, arrayList3, oVar);
                                        gpu0 c = com.vk.newsfeed.common.util.d.c(context2, fmcVar);
                                        View view = a.a;
                                        Rect rect = a.b;
                                        int l = krv0.l(R.attr.vk_ui_icon_accent);
                                        view.getContext();
                                        e.c cVar = new e.c(null, rect, view, l, 1);
                                        cVar.e = context2;
                                        cVar.l = fmcVar;
                                        cVar.o = c;
                                        cVar.r = cn70.b(19);
                                        cVar.t = cn70.b(21);
                                        vkContextMenu2 = cVar.a();
                                        fmcVar.f = new WeakReference<>(vkContextMenu2);
                                    }
                                }
                                if (vkContextMenu2 != null) {
                                    ((com.vk.core.view.components.context.menu.e) vkContextMenu2).q = new km1(5, bp50Var2, this);
                                }
                                if (vkContextMenu2 != null) {
                                    vkContextMenu2.i(false);
                                    return;
                                }
                                return;
                            }
                            if (i == PostActions.ACTION_REPORT.h()) {
                                if (vkContextMenu != null) {
                                    vkContextMenu.e(null);
                                }
                                NewsEntry newsEntry = clipEndOverlayAdWrapperView2.k;
                                if (newsEntry != null) {
                                    newsfeedRouter = clipEndOverlayAdWrapperView2.getNewsfeedRouter();
                                    ArrayList<b520> arrayList4 = bp50Var2.c;
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator<b520> it2 = arrayList4.iterator();
                                    while (it2.hasNext()) {
                                        b520 next2 = it2.next();
                                        if (epx.f(next2.b, "complain")) {
                                            arrayList5.add(next2);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                                    Iterator it3 = arrayList5.iterator();
                                    while (it3.hasNext()) {
                                        arrayList6.add(((b520) it3.next()).a);
                                    }
                                    newsfeedRouter.U(context2, newsEntry, (String[]) arrayList6.toArray(new String[0]));
                                }
                            }
                        }
                    }
                    if (vkContextMenu != null) {
                        vkContextMenu.b();
                    }
                }
            };
            VkContextMenu a = dVar.a(context, ClipEndOverlayAdWrapperView.a(clipEndOverlayAdWrapperView, clipEndOverlayAdWrapperView.getAdChoicesAnchorView()));
            ((com.vk.core.view.components.context.menu.e) a).q = new f5(bp50Var, 18);
            a.i(false);
        }
    }

    /* compiled from: ClipEndOverlayAdWrapperView.kt */
    public interface b {

        /* compiled from: ClipEndOverlayAdWrapperView.kt */
        public static final class a implements b {
            public final NewsEntry a;
            public final lvc b;
            public final gzs<Boolean> c;

            public a(NewsEntry newsEntry, lvc lvcVar, gzs gzsVar) {
                this.a = newsEntry;
                this.b = lvcVar;
                this.c = gzsVar;
            }
        }

        /* compiled from: ClipEndOverlayAdWrapperView.kt */
        /* renamed from: com.vk.clips.tool.view.newsfeed.mytarget.ClipEndOverlayAdWrapperView$b$b, reason: collision with other inner class name */
        public static final class C0697b implements b {
            public final gmc a;

            public C0697b(gmc gmcVar) {
                this.a = gmcVar;
            }
        }
    }

    /* compiled from: ClipEndOverlayAdWrapperView.kt */
    public static final class c implements lv50 {
        public final g7u0 b;

        public c(g7u0 g7u0Var) {
            this.b = g7u0Var;
        }

        @Override // xsna.lv50
        public final View c() {
            return this.b.getBadgeTextView();
        }

        @Override // xsna.lv50
        public final ViewGroup d() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View e() {
            return this.b.getBadgeContainerView();
        }

        @Override // xsna.lv50
        public final View f() {
            return this.b.getBadgeTextView();
        }

        @Override // xsna.lv50
        public final View g() {
            return this.b.getButtonView();
        }

        @Override // xsna.lv50
        public final View getDescriptionView() {
            return null;
        }

        @Override // xsna.lv50
        public final IconAdView getIconView() {
            return null;
        }

        @Override // xsna.lv50
        public final View getTitleView() {
            return this.b.getTitleView();
        }

        @Override // xsna.lv50
        public final View h() {
            return null;
        }

        @Override // xsna.lv50
        public final View i() {
            return this.b.getTitleView();
        }

        @Override // xsna.lv50
        public final s4e0 j0() {
            return null;
        }

        @Override // xsna.lv50
        public final MediaAdView o() {
            return null;
        }
    }

    /* compiled from: ClipEndOverlayAdWrapperView.kt */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String str;
            ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView = ClipEndOverlayAdWrapperView.this;
            bp50 bp50Var = clipEndOverlayAdWrapperView.c;
            b520 b520Var = null;
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode == -42973149) {
                    if (action.equals("com.vkontakte.android.AD_REPORT_CANCELLED")) {
                        bp50Var.a();
                        return;
                    }
                    return;
                }
                if (hashCode == 1398742544 && action.equals("com.vkontakte.android.AD_REPORTED")) {
                    Bundle extras = intent.getExtras();
                    String string = extras != null ? extras.getString("adchoice_option_text") : null;
                    Iterator<b520> it = bp50Var.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b520 next = it.next();
                        if (epx.f(next.a, string)) {
                            b520Var = next;
                            break;
                        }
                    }
                    b520 b520Var2 = b520Var;
                    if (b520Var2 == null || (str = b520Var2.c) == null) {
                        return;
                    }
                    bp50Var.c(str);
                    d3m.e(clipEndOverlayAdWrapperView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    ClipEndOverlayView.b bVar = clipEndOverlayAdWrapperView.i;
                    if (bVar != null) {
                        bVar.a();
                    }
                }
            }
        }
    }

    public ClipEndOverlayAdWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k kVar = new k(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, kVar);
        this.c = new bp50();
        this.d = new a();
        this.e = new d();
        g7u0 g7u0Var = new g7u0(bwt0.u(context));
        this.f = g7u0Var;
        this.j = msy.a(lazyThreadSafetyMode, new vi0(8));
        this.l = new e();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = 16;
        layoutParams.setMargins(iah0.a(f), 0, iah0.a(f), iah0.a(f));
        addView(g7u0Var, layoutParams);
    }

    public static final a.AbstractC1374a.C1375a a(ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView, View view) {
        Rect F = bwt0.F(view);
        float f = 20;
        F.left -= iah0.a(f);
        F.right -= iah0.a(f);
        float f2 = 12;
        F.top = iah0.a(f2) + view.getMeasuredWidth() + F.top;
        F.bottom = iah0.a(f2) + view.getMeasuredWidth() + F.bottom;
        return new a.AbstractC1374a.C1375a(F, view);
    }

    public static final void e(ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView, int i) {
        ikv0.a aVar = new ikv0.a(clipEndOverlayAdWrapperView.getContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(clipEndOverlayAdWrapperView.getContext().getString(i), (String) null, (ikv0.d.a) null, 6);
        aVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getAdChoicesAnchorView() {
        return this.f.getBadgeContainerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final tkp getEndOverlayBannerAdConfig() {
        return (tkp) this.j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NewsfeedRouter getNewsfeedRouter() {
        return (NewsfeedRouter) this.b.getValue();
    }

    public final void f() {
        gmc gmcVar;
        c cVar = this.g;
        if (cVar == null || (gmcVar = this.h) == null) {
            return;
        }
        zu50 zu50Var = gmcVar.a;
        g7u0 g7u0Var = this.f;
        zu50Var.h(cVar, e43.l(g7u0Var.getTitleView(), g7u0Var.getButtonView(), g7u0Var.getImageView(), this));
    }

    public final void g(zu50 zu50Var, cw50 cw50Var, boolean z) {
        String str = cw50Var.g;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = cw50Var.i;
        if (z) {
            str3 = null;
        }
        String str4 = cw50Var.h;
        if (epx.f(str4, "Install") || epx.f(str4, "Visit")) {
            str4 = null;
        }
        g7u0.a aVar = new g7u0.a(str, str3, str4);
        g7u0 g7u0Var = this.f;
        g7u0Var.setMainContent(aVar);
        String str5 = cw50Var.o;
        String str6 = cw50Var.l;
        if (str5 != null && str6 != null) {
            str2 = g7u0Var.getContext().getString(R.string.ad_banner_label, str5, str6);
        } else if (str5 != null) {
            str2 = str5;
        }
        g7u0Var.y.setText(str2);
        kiw kiwVar = !z ? cw50Var.v : cw50Var.q;
        if (kiwVar != null) {
            Bitmap a2 = kiwVar.a();
            String str7 = kiwVar.a;
            int i = kiwVar.b;
            int i2 = kiwVar.c;
            VkImage vkImage = g7u0Var.w;
            if (i != 0 && i2 != 0) {
                float f = i / i2;
                if (f > 1.7777778f) {
                    f = 1.7777778f;
                }
                bwt0.r0((int) (e3m.a(R.dimen.ad_banner_content_height, g7u0Var.getContext()) * f), vkImage);
            }
            if (a2 != null) {
                g7u0Var.A = null;
                vkImage.setImageBitmap(a2);
            } else if (!vkImage.isImageLoaded() || !epx.f(str7, g7u0Var.A)) {
                vkImage.o0(str7, null);
                g7u0Var.A = str7;
            }
        }
        zu50Var.r = 5;
        zu50Var.l = this.e;
        l0n l0nVar = cw50Var.k;
        String str8 = l0nVar != null ? l0nVar.c : null;
        a aVar2 = this.d;
        aVar2.a = str8;
        this.c.d = aVar2;
        g7u0Var.setAdBadgeClickListener(new oh3(8, this, zu50Var));
        d3m.c(this, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void h() {
        gmc gmcVar = this.h;
        if (gmcVar != null) {
            gmcVar.a.a();
        }
        this.g = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.AD_REPORTED");
        intentFilter.addAction("com.vkontakte.android.AD_REPORT_CANCELLED");
        anj.d(getContext(), this.l, intentFilter, null, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        enj.s(getContext(), this.l);
    }

    /* compiled from: ClipEndOverlayAdWrapperView.kt */
    public final class d implements zu50.b {
        public d() {
        }

        @Override // xsna.zu50.b
        public final boolean e() {
            return false;
        }

        @Override // xsna.zu50.b
        public final void g(zu50 zu50Var) {
            ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView = ClipEndOverlayAdWrapperView.this;
            d3m.e(clipEndOverlayAdWrapperView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            int i = ClipEndOverlayAdWrapperView.m;
            clipEndOverlayAdWrapperView.h();
        }

        @Override // xsna.zu50.b
        public final void h(zu50 zu50Var) {
        }
    }
}
