package com.sofascore.results.ads.iml.banner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.controller.a;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.vungle.ads.internal.task.g;
import defpackage.hkg;
import defpackage.jf;
import defpackage.kf;
import defpackage.lf;
import defpackage.lm5;
import defpackage.p2g;
import defpackage.pz0;
import defpackage.u2g;
import defpackage.w2g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001c\u00100\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/sofascore/results/ads/iml/banner/AdBannerView;", "Landroid/widget/LinearLayout;", "", "visibility", "", "setVisibility", "(I)V", "getVisibility", "()I", "Landroid/graphics/drawable/Drawable;", "getBackground", "()Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "Lcom/sofascore/model/firebase/AdType$Banner;", a.q, "Lcom/sofascore/model/firebase/AdType$Banner;", "getAdType", "()Lcom/sofascore/model/firebase/AdType$Banner;", "setAdType", "(Lcom/sofascore/model/firebase/AdType$Banner;)V", "adType", "", "", "d", "Ljava/util/Map;", "getCustomTargeting", "()Ljava/util/Map;", "setCustomTargeting", "(Ljava/util/Map;)V", "customTargeting", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getAdClickedListener", "()Lkotlin/jvm/functions/Function0;", "setAdClickedListener", "(Lkotlin/jvm/functions/Function0;)V", "adClickedListener", InneractiveMediationDefs.GENDER_FEMALE, "getAdLoadedListener", "setAdLoadedListener", "adLoadedListener", g.e, "Landroid/widget/LinearLayout;", "get_childContainer$annotations", "()V", "_childContainer", "getChildContainer", "()Landroid/widget/LinearLayout;", "childContainer", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdBannerView extends LinearLayout {
    public pz0 a;
    public boolean b;

    /* renamed from: c, reason: from kotlin metadata */
    public AdType.Banner adType;

    /* renamed from: d, reason: from kotlin metadata */
    public Map customTargeting;

    /* renamed from: e, reason: from kotlin metadata */
    public Function0 adClickedListener;

    /* renamed from: f, reason: from kotlin metadata */
    public Function0 adLoadedListener;

    /* renamed from: g, reason: from kotlin metadata */
    public final LinearLayout _childContainer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(17);
        linearLayout.setMinimumHeight(0);
        this._childContainer = linearLayout;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        setMinimumHeight(0);
        addView(getChildContainer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout getChildContainer() {
        LinearLayout linearLayout = this._childContainer;
        linearLayout.getClass();
        return linearLayout;
    }

    public final void b() {
        this.b = true;
        LinearLayout linearLayout = this._childContainer;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        pz0 pz0Var = this.a;
        if (pz0Var != null) {
            pz0Var.i(false);
        }
    }

    public final void c(AdType.Banner banner) {
        Object u2gVar;
        this.adType = banner;
        pz0 pz0Var = this.a;
        if (pz0Var != null || banner == null) {
            if (banner == null || pz0Var == null) {
                return;
            }
            pz0Var.j(banner);
            return;
        }
        LinearLayout childContainer = getChildContainer();
        if (!childContainer.isAttachedToWindow()) {
            childContainer.addOnAttachStateChangeListener(new jf(childContainer, this, banner, 0));
            return;
        }
        Context context = getContext();
        context.getClass();
        FragmentActivity K = hkg.K(context);
        pz0 pz0Var2 = null;
        BaseActivity baseActivity = K instanceof BaseActivity ? (BaseActivity) K : null;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = (AbstractFragment) s.D(this);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        AbstractFragment abstractFragment = (AbstractFragment) u2gVar;
        if (abstractFragment != null) {
            LinearLayout childContainer2 = getChildContainer();
            Map<String, String> customTargeting = getCustomTargeting();
            if (customTargeting == null) {
                customTargeting = lm5.a;
                customTargeting.getClass();
            }
            pz0Var2 = new pz0(childContainer2, abstractFragment, customTargeting);
        } else if (baseActivity != null) {
            LinearLayout childContainer3 = getChildContainer();
            Map<String, String> customTargeting2 = getCustomTargeting();
            if (customTargeting2 == null) {
                customTargeting2 = lm5.a;
                customTargeting2.getClass();
            }
            pz0Var2 = new pz0(childContainer3, baseActivity, customTargeting2, null);
        }
        this.a = pz0Var2;
        if (pz0Var2 != null) {
            pz0Var2.o = new kf(this);
            pz0Var2.p = new lf(this);
            pz0Var2.j(banner);
        }
    }

    @Nullable
    public final Function0<Unit> getAdClickedListener() {
        return this.adClickedListener;
    }

    @Nullable
    public final Function0<Unit> getAdLoadedListener() {
        return this.adLoadedListener;
    }

    @Nullable
    public final AdType.Banner getAdType() {
        return this.adType;
    }

    @Override // android.view.View
    @Nullable
    public Drawable getBackground() {
        LinearLayout linearLayout = this._childContainer;
        if (linearLayout != null) {
            return linearLayout.getBackground();
        }
        return null;
    }

    @Nullable
    public final Map<String, String> getCustomTargeting() {
        return this.customTargeting;
    }

    @Override // android.view.View
    public int getVisibility() {
        LinearLayout linearLayout = this._childContainer;
        return linearLayout != null ? linearLayout.getVisibility() : super.getVisibility();
    }

    public final void setAdClickedListener(@Nullable Function0<Unit> function0) {
        this.adClickedListener = function0;
    }

    public final void setAdLoadedListener(@Nullable Function0<Unit> function0) {
        this.adLoadedListener = function0;
    }

    public final void setAdType(@Nullable AdType.Banner banner) {
        this.adType = banner;
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable background) {
        LinearLayout linearLayout = this._childContainer;
        if (linearLayout != null) {
            linearLayout.setBackground(background);
        }
    }

    public final void setCustomTargeting(@Nullable Map<String, String> map) {
        this.customTargeting = map;
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        LinearLayout linearLayout = this._childContainer;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        LinearLayout linearLayout = this._childContainer;
        if (linearLayout != null) {
            linearLayout.setVisibility(visibility);
        }
    }

    private static /* synthetic */ void get_childContainer$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
