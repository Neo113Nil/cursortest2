package com.vk.content.design.view.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.core.ui.CircularProgressView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.log.L;
import com.vk.masks.MasksController;
import com.vk.masks.MasksEffectNotAvailableException;
import com.vk.masks.MasksEffectUpdateAppRequiredException;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import xsna.am9;
import xsna.cvk;
import xsna.di10;
import xsna.iah0;
import xsna.izs;
import xsna.j5;
import xsna.k5;
import xsna.l5;
import xsna.m5;
import xsna.o0r0;
import xsna.o25;
import xsna.pxo0;
import xsna.qj4;
import xsna.rsg0;
import xsna.s3q0;
import xsna.szb0;
import xsna.wz5;
import xsna.xh10;
import xsna.yg10;

/* compiled from: BaseMasksWrap.kt */
/* loaded from: classes17.dex */
public abstract class a extends FrameLayout {
    public static final szb0.a E;
    public static final szb0.a F;
    public io.reactivex.rxjava3.disposables.c A;
    public io.reactivex.rxjava3.disposables.c B;
    public io.reactivex.rxjava3.disposables.c C;
    public String D;
    public o0r0 b;
    public izs<? super UserId, s3q0> c;
    public yg10 d;
    public di10 e;
    public boolean f;
    public InterfaceC0730a g;
    public am9 h;
    public boolean i;
    public b j;
    public FrameLayout k;
    public VKCircleImageView l;
    public TextView m;
    public TextView n;
    public FrameLayout o;
    public FrameLayout p;
    public CircularProgressView q;
    public pxo0 r;
    public final szb0 s;
    public final MasksController t;
    public com.vk.lists.c u;
    public io.reactivex.rxjava3.disposables.c v;
    public io.reactivex.rxjava3.disposables.c w;
    public io.reactivex.rxjava3.disposables.c x;
    public io.reactivex.rxjava3.disposables.c y;
    public io.reactivex.rxjava3.disposables.c z;

    /* compiled from: BaseMasksWrap.kt */
    public interface b {
        void a(Mask mask);

        j1 b();

        void c();
    }

    static {
        int i = 0;
        long j = 0;
        int i2 = 127;
        szb0.a aVar = new szb0.a(i, j, i2);
        aVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.e = 8;
        E = aVar;
        szb0.a aVar2 = new szb0.a(i, j, i2);
        aVar2.d = 1.0f;
        aVar2.e = 0;
        F = aVar2;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = true;
        this.i = true;
        this.r = new pxo0(1000L);
        szb0 szb0Var = new szb0();
        this.s = szb0Var;
        this.t = MasksController.f();
        LayoutInflater.from(context).inflate(R.layout.masks_wrap_view, (ViewGroup) this, true);
        this.k = (FrameLayout) findViewById(R.id.masks_wrap_author);
        this.l = (VKCircleImageView) findViewById(R.id.masks_wrap_author_image);
        this.m = (TextView) findViewById(R.id.masks_wrap_author_name);
        this.n = (TextView) findViewById(R.id.masks_wrap_action_text);
        this.p = (FrameLayout) findViewById(R.id.masks_wrap_author_action_holder);
        this.o = (FrameLayout) findViewById(R.id.masks_wrap_progress);
        this.q = (CircularProgressView) findViewById(R.id.masks_wrap_progress_circular);
        this.o.setOnClickListener(new wz5((MasksWrap) this, 1));
        TextView textView = this.n;
        szb0.a aVar = E;
        szb0Var.e(textView, aVar, false, null);
        j(false);
        szb0Var.e(this.k, aVar, false, null);
    }

    public static void k() {
        Preference.I("stories_default", "story_masks", true);
    }

    public static void o(a aVar) {
        com.vk.lists.c cVar = aVar.u;
        if (cVar != null) {
            cVar.p(true);
        }
    }

    public final boolean a() {
        this.t.getClass();
        return o25.a().i().m;
    }

    public final io.reactivex.rxjava3.disposables.c getActionHideDisposable() {
        return this.A;
    }

    public final TextView getActionText() {
        return this.n;
    }

    public final FrameLayout getAuthor() {
        return this.k;
    }

    public final FrameLayout getAuthorActionHolder() {
        return this.p;
    }

    public final boolean getAuthorClickEnabled() {
        return this.f;
    }

    public final io.reactivex.rxjava3.disposables.c getAuthorHideDisposable() {
        return this.B;
    }

    public final VKCircleImageView getAuthorImage() {
        return this.l;
    }

    public final TextView getAuthorName() {
        return this.m;
    }

    public final InterfaceC0730a getCamera1View() {
        return this.g;
    }

    public final am9 getCameraTracker() {
        return this.h;
    }

    public final io.reactivex.rxjava3.disposables.c getCheckMaskForUpdatesDisposable() {
        return this.x;
    }

    public final io.reactivex.rxjava3.disposables.c getCurrentMaskDownload() {
        return this.v;
    }

    public final String getCurrentMaskId() {
        return this.D;
    }

    public final io.reactivex.rxjava3.disposables.c getFavoriteDisposable() {
        return this.C;
    }

    public final io.reactivex.rxjava3.disposables.c getLocationDisposable() {
        return this.y;
    }

    public final io.reactivex.rxjava3.disposables.c getMarkMaskAsViewedDisposable() {
        return this.z;
    }

    public final yg10 getMasksAnalytics() {
        return this.d;
    }

    public final MasksController getMasksController() {
        return this.t;
    }

    public final com.vk.lists.c getMasksPaginatedHelper() {
        return this.u;
    }

    public final di10 getMasksProvider() {
        return this.e;
    }

    public final boolean getNeedMaskBageReload() {
        return this.i;
    }

    public final izs<UserId, s3q0> getOnAuthorClicked() {
        return this.c;
    }

    public final szb0 getPositioner() {
        return this.s;
    }

    public final FrameLayout getProgress() {
        return this.o;
    }

    public final CircularProgressView getProgressCircular() {
        return this.q;
    }

    public final io.reactivex.rxjava3.disposables.c getReloadMasksNewBadgeDisposable() {
        return this.w;
    }

    public abstract Mask getSelectedMask();

    public final pxo0 getTimeoutLock() {
        return this.r;
    }

    public final o0r0 getUsersBridge() {
        o0r0 o0r0Var = this.b;
        if (o0r0Var != null) {
            return o0r0Var;
        }
        return null;
    }

    public final b getVirtualBackground() {
        return this.j;
    }

    public abstract com.vk.lists.c i(MasksController.MasksCatalogType masksCatalogType);

    public final void j(boolean z) {
        this.s.e(this.o, E, z, null);
    }

    public final void l(Mask mask, Throwable th) {
        yg10 yg10Var = this.d;
        if (yg10Var != null) {
            yg10Var.h(mask);
        }
        u();
        q(false);
        if (th instanceof MasksEffectUpdateAppRequiredException) {
            InterfaceC0730a interfaceC0730a = this.g;
            if (interfaceC0730a != null) {
                interfaceC0730a.f();
            }
        } else {
            cvk.u(th instanceof MasksEffectNotAvailableException ? R.string.masks_effect_not_available : R.string.masks_mask_error, false);
        }
        L.i(th);
    }

    public abstract void m();

    public final void n() {
        if (a()) {
            MasksController masksController = this.t;
            synchronized (masksController) {
                io.reactivex.rxjava3.disposables.c cVar = masksController.i;
                if (cVar != null) {
                    cVar.dispose();
                    masksController.h = null;
                }
            }
        }
        u();
        io.reactivex.rxjava3.disposables.c cVar2 = this.v;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.w;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.x;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar5 = this.y;
        if (cVar5 != null) {
            cVar5.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar6 = this.z;
        if (cVar6 != null) {
            cVar6.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar7 = this.A;
        if (cVar7 != null) {
            cVar7.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar8 = this.B;
        if (cVar8 != null) {
            cVar8.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar9 = this.C;
        if (cVar9 != null) {
            cVar9.dispose();
        }
        yg10 yg10Var = this.d;
        if (yg10Var != null) {
            yg10Var.flush();
        }
        this.e = null;
        setCamera1View(null);
    }

    public final void p() {
        if (this.i) {
            this.w = rsg0.y0(new xh10("masks.hasNew"), null, null, 3).subscribe(new k5(new j5(this, 7), 3), new m5(new l5(this, 8), 5));
        }
    }

    public final void q(boolean z) {
        am9.a aVar;
        u();
        am9 am9Var = this.h;
        if (am9Var != null && (aVar = am9Var.a) != null) {
            aVar.m = null;
        }
        InterfaceC0730a interfaceC0730a = this.g;
        if (interfaceC0730a != null) {
            interfaceC0730a.e(z);
        }
        this.D = null;
        this.s.e(this.k, E, false, null);
    }

    public final void s(MasksController.MasksCatalogType masksCatalogType) {
        this.u = i(masksCatalogType);
        MasksController.MasksCatalogType masksCatalogType2 = MasksController.MasksCatalogType.VOIP_MASKS;
        if (masksCatalogType == masksCatalogType2 || masksCatalogType == MasksController.MasksCatalogType.VOIP_VIRTUAL_BACKGROUND) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.k.getLayoutParams());
            layoutParams.bottomMargin = iah0.a(156);
            layoutParams.gravity = 81;
            layoutParams.topMargin = 0;
            this.k.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.n.getLayoutParams());
            layoutParams2.bottomMargin = iah0.a(196);
            layoutParams2.gravity = 81;
            layoutParams2.topMargin = 0;
            this.n.setLayoutParams(layoutParams2);
        }
        if (masksCatalogType == masksCatalogType2) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.o.getLayoutParams());
            layoutParams3.bottomMargin = iah0.a(256);
            layoutParams3.gravity = 81;
            layoutParams3.topMargin = 0;
            this.o.setLayoutParams(layoutParams3);
        }
        p();
        m();
    }

    public final void setActionHideDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        this.A = cVar;
    }

    public final void setActionText(TextView textView) {
        this.n = textView;
    }

    public final void setAuthor(FrameLayout frameLayout) {
        this.k = frameLayout;
    }

    public final void setAuthorActionHolder(FrameLayout frameLayout) {
        this.p = frameLayout;
    }

    public final void setAuthorClickEnabled(boolean z) {
        this.f = z;
    }

    public final void setAuthorHideDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        this.B = cVar;
    }

    public final void setAuthorImage(VKCircleImageView vKCircleImageView) {
        this.l = vKCircleImageView;
    }

    public final void setAuthorName(TextView textView) {
        this.m = textView;
    }

    public final void setCamera1View(InterfaceC0730a interfaceC0730a) {
        this.g = interfaceC0730a;
        MasksController.f().j = interfaceC0730a != null ? new qj4(interfaceC0730a, this) : null;
    }

    public final void setCameraTracker(am9 am9Var) {
        this.h = am9Var;
    }

    public final void setCheckMaskForUpdatesDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        this.x = cVar;
    }

    public final void setCurrentMaskDownload(io.reactivex.rxjava3.disposables.c cVar) {
        this.v = cVar;
    }

    public final void setCurrentMaskId(String str) {
        this.D = str;
    }

    public final void setFavoriteDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        this.C = cVar;
    }

    public final void setLocationDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        this.y = cVar;
    }

    public final void setMarkMaskAsViewedDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        this.z = cVar;
    }

    public final void setMasksAnalytics(yg10 yg10Var) {
        this.d = yg10Var;
    }

    public final void setMasksPaginatedHelper(com.vk.lists.c cVar) {
        this.u = cVar;
    }

    public final void setMasksProvider(di10 di10Var) {
        this.e = di10Var;
    }

    public final void setNeedMaskBageReload(boolean z) {
        this.i = z;
    }

    public final void setOnAuthorClicked(izs<? super UserId, s3q0> izsVar) {
        this.c = izsVar;
    }

    public final void setProgress(FrameLayout frameLayout) {
        this.o = frameLayout;
    }

    public final void setProgressCircular(CircularProgressView circularProgressView) {
        this.q = circularProgressView;
    }

    public final void setReloadMasksNewBadgeDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        this.w = cVar;
    }

    public abstract void setSelectedMask(Mask mask);

    public final void setTimeoutLock(pxo0 pxo0Var) {
        this.r = pxo0Var;
    }

    public final void setUsersBridge(o0r0 o0r0Var) {
        this.b = o0r0Var;
    }

    public final void setVirtualBackground(b bVar) {
        this.j = bVar;
    }

    public final void u() {
        io.reactivex.rxjava3.disposables.c cVar = this.v;
        if (cVar != null) {
            cVar.dispose();
        }
        this.v = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.y;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.y = null;
        io.reactivex.rxjava3.disposables.c cVar3 = this.A;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.A = null;
        io.reactivex.rxjava3.disposables.c cVar4 = this.B;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        this.B = null;
        TextView textView = this.n;
        szb0 szb0Var = this.s;
        szb0.a aVar = E;
        szb0Var.e(textView, aVar, false, null);
        j(false);
        szb0Var.e(this.k, aVar, false, null);
        this.q.setProgressNoAnim(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* compiled from: BaseMasksWrap.kt */
    /* renamed from: com.vk.content.design.view.camera.a$a, reason: collision with other inner class name */
    public interface InterfaceC0730a {
        void e(boolean z);

        boolean g();

        void h(Mask mask, String str, boolean z);

        boolean i(int i);

        void j(String str);

        boolean k(int i);

        default void f() {
        }

        default void a(Mask mask) {
        }

        default void d(Mask mask) {
        }
    }
}
