package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.superapp.design.view.multiaccount.avatar.VkProfileAvatarView;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.be6;
import xsna.bih;
import xsna.bvd0;
import xsna.cfl;
import xsna.e43;
import xsna.e89;
import xsna.ecm;
import xsna.en9;
import xsna.f5z;
import xsna.fdi;
import xsna.gm50;
import xsna.h1j;
import xsna.jzq0;
import xsna.krv0;
import xsna.l1i;
import xsna.m33;
import xsna.mag;
import xsna.msy;
import xsna.rbe;
import xsna.sfg;
import xsna.ufk;
import xsna.vjv0;
import xsna.wzh;

/* compiled from: EcosystemProfileRenderer.kt */
/* loaded from: classes6.dex */
public final class f implements gm50 {
    public final EcosystemProfileView b;
    public final View c;
    public final e89 d;
    public final jzq0 e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final fdi j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final bvd0 p;
    public final ThemableShimmer q;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    public f(EcosystemProfileView ecosystemProfileView, View view, e89 e89Var, jzq0 jzq0Var) {
        this.b = ecosystemProfileView;
        this.c = view;
        this.d = e89Var;
        this.e = jzq0Var;
        sfg sfgVar = new sfg(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, sfgVar);
        this.g = msy.a(lazyThreadSafetyMode, new mag(this, 18));
        this.h = msy.a(lazyThreadSafetyMode, new cfl(this, 6));
        Lazy a = msy.a(lazyThreadSafetyMode, new ufk(this, 3));
        this.i = a;
        this.j = new fdi();
        this.k = msy.a(lazyThreadSafetyMode, new bih(this, 15));
        this.l = msy.a(lazyThreadSafetyMode, new h1j(this, 9));
        this.m = msy.a(lazyThreadSafetyMode, new wzh(this, 11));
        this.n = msy.a(lazyThreadSafetyMode, new l1i(this, 6));
        this.o = msy.a(lazyThreadSafetyMode, new ecm(this, 5));
        this.p = new bvd0(ecosystemProfileView.getContext(), jzq0Var);
        Context context = e43.a;
        ThemableShimmer.a aVar = new ThemableShimmer.a(context == null ? null : context);
        ThemableShimmer themableShimmer = aVar.a;
        themableShimmer.getClass();
        themableShimmer.i = R.attr.vk_ui_transparent_active;
        themableShimmer.j = 0.08f;
        themableShimmer.f = R.attr.vk_ui_transparent_hover;
        themableShimmer.g = 0.2f;
        this.q = aVar.a();
        ViewGroup viewGroup = (ViewGroup) a.getValue();
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            int i2 = i + 1;
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            vjv0 vjv0Var = childAt instanceof vjv0 ? (vjv0) childAt : null;
            if (vjv0Var != null) {
                vjv0Var.setShimmer(this.q);
                vjv0Var.setShimmerManagedExternally(true);
                vjv0Var.setArea(new a.C0863a((ViewGroup) this.i.getValue()));
            }
            i = i2;
        }
        ((VkEcosystemLogoutButtonView) this.k.getValue()).setOnClickListener(new rbe(this, 1));
        a().setOnClickListener(new en9(this, 5));
        Drawable a2 = m33.a(R.drawable.vk_icon_door_arrow_right_outline_24, ecosystemProfileView.getContext());
        if (a2 != null) {
            a2.setTint(krv0.m(R.attr.vk_ui_icon_primary, ecosystemProfileView.getContext()));
        }
        ((VkSimpleButton) this.n.getValue()).setOnClickListener(new be6(this, 4));
        ((VkEcosystemLogoutButtonView) this.k.getValue()).setIcon(a2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkProfileAvatarView a() {
        return (VkProfileAvatarView) this.o.getValue();
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b.getViewOwner();
    }
}
