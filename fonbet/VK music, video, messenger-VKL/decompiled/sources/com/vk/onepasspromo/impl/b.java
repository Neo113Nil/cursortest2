package com.vk.onepasspromo.impl;

import android.app.Activity;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.onepasspromo.impl.OnePassPromoFragment;
import kotlin.LazyThreadSafetyMode;
import xsna.azs;
import xsna.c63;
import xsna.cty;
import xsna.ej80;
import xsna.msy;
import xsna.w8i;
import xsna.zys;

/* compiled from: OnePassPromoPresenter.kt */
/* loaded from: classes4.dex */
public final class b extends azs implements w8i {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new cty(this, 19));

    /* compiled from: OnePassPromoPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a implements azs.a {
        @Override // xsna.azs.a
        public final azs a(zys zysVar) {
            return new b();
        }
    }

    /* compiled from: FullscreenPromoPresenter.kt */
    /* renamed from: com.vk.onepasspromo.impl.b$b, reason: collision with other inner class name */
    public static final class C1449b extends c63.b {
        public final /* synthetic */ PromoSessionInfo c;

        public C1449b(PromoSessionInfo promoSessionInfo) {
            this.c = promoSessionInfo;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.c63.b
        public final void p(Activity activity) {
            c63 c63Var = c63.a;
            c63.c(this);
            ((ej80) b.this.b.getValue()).c();
            OnePassPromoFragment.a aVar = new OnePassPromoFragment.a();
            aVar.j.putParcelable("bundle_key_promo_session", this.c);
            aVar.s(true);
            aVar.k(activity);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.azs
    public final void a(PromoSessionInfo promoSessionInfo) {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null) {
            c63.a(new C1449b(promoSessionInfo));
            return;
        }
        ((ej80) this.b.getValue()).c();
        OnePassPromoFragment.a aVar = new OnePassPromoFragment.a();
        aVar.j.putParcelable("bundle_key_promo_session", promoSessionInfo);
        aVar.s(true);
        aVar.k(b);
    }
}
