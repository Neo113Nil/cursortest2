package com.sofascore.results.view.header;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import defpackage.as9;
import defpackage.bv1;
import defpackage.jca;
import defpackage.l4a;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.ua0;
import defpackage.v61;
import defpackage.yhk;
import defpackage.yj1;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u001b\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/sofascore/results/view/header/CollapsibleProfileHeaderView;", "Landroid/widget/LinearLayout;", "Lua0;", "Lkotlin/Function0;", "", "onBadgeOrRoleClicked", "setOnBadgeRoleClickListener", "(Lkotlin/jvm/functions/Function0;)V", "", "name", "setUserName", "(Ljava/lang/String;)V", "Lcom/google/android/material/appbar/AppBarLayout;", "b", "Ljoa;", "getAppBarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollapsibleProfileHeaderView extends LinearLayout implements ua0 {
    public static final /* synthetic */ int c = 0;
    public final bv1 a;
    public final mqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsibleProfileHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.layout_collapsible_profile_header, this);
        int i = R.id.anonymous;
        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.anonymous, this);
        if (frameLayout != null) {
            i = R.id.logged_in_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.logged_in_container, this);
            if (constraintLayout != null) {
                i = R.id.role_badge;
                ImageView imageView = (ImageView) nq8.B(R.id.role_badge, this);
                if (imageView != null) {
                    i = R.id.role_name;
                    TextView textView = (TextView) nq8.B(R.id.role_name, this);
                    if (textView != null) {
                        i = R.id.share_button;
                        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.share_button, this);
                        if (materialButton != null) {
                            i = R.id.user_icon;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.user_icon, this);
                            if (imageView2 != null) {
                                i = R.id.user_join_info;
                                TextView textView2 = (TextView) nq8.B(R.id.user_join_info, this);
                                if (textView2 != null) {
                                    i = R.id.user_name;
                                    TextView textView3 = (TextView) nq8.B(R.id.user_name, this);
                                    if (textView3 != null) {
                                        this.a = new bv1(this, frameLayout, constraintLayout, imageView, textView, materialButton, imageView2, textView2, textView3);
                                        this.b = ypa.b(new yj1(this, 22));
                                        setOrientation(1);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final AppBarLayout getAppBarLayout() {
        return (AppBarLayout) this.b.getValue();
    }

    @Override // defpackage.ua0
    public final void a(AppBarLayout appBarLayout, int i) {
        float totalScrollRange = (-i) / appBarLayout.getTotalScrollRange();
        float f = i * (-0.25f);
        float f2 = 1.0f - (totalScrollRange * 2.0f);
        bv1 bv1Var = this.a;
        ImageView imageView = (ImageView) bv1Var.f;
        imageView.setAlpha(f2);
        imageView.setTranslationY(f);
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        constraintLayout.setAlpha(f2);
        constraintLayout.setTranslationY(f);
        TextView textView = (TextView) bv1Var.d;
        textView.setAlpha(f2);
        textView.setTranslationY(f);
        ((FrameLayout) bv1Var.h).setAlpha(f2);
    }

    public final void b(UserBadge userBadge, boolean z, String str) {
        bv1 bv1Var = this.a;
        as9.r((ImageView) bv1Var.e, userBadge, 6);
        Context context = getContext();
        context.getClass();
        String K = jca.K(context, userBadge);
        TextView textView = (TextView) bv1Var.c;
        textView.setText(K);
        textView.setVisibility(K.length() > 0 ? 0 : 8);
        Context context2 = getContext();
        context2.getClass();
        textView.setText(jca.K(context2, userBadge).concat((z && userBadge == UserBadge.EDITOR && str != null) ? ": ".concat(str) : ""));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.a(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.g(true, false, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.f(this);
        }
    }

    public final void setOnBadgeRoleClickListener(@NotNull Function0<Unit> onBadgeOrRoleClicked) {
        onBadgeOrRoleClicked.getClass();
        bv1 bv1Var = this.a;
        z8e.a0((ImageView) bv1Var.e, 1000L, new v61(5, onBadgeOrRoleClicked));
        z8e.a0((TextView) bv1Var.c, 1000L, new v61(6, onBadgeOrRoleClicked));
    }

    public final void setUserName(@Nullable String name) {
        TextView textView = (TextView) this.a.g;
        if (name == null) {
            name = "";
        }
        l4a.K(textView, name);
    }
}
