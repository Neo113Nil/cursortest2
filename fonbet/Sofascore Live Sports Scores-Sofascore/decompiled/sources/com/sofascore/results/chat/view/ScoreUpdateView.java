package com.sofascore.results.chat.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.Ua;
import com.sofascore.common.widget.NestedHorizontalScrollView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ab;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.b2;
import defpackage.hkg;
import defpackage.ht9;
import defpackage.j12;
import defpackage.jrg;
import defpackage.lnb;
import defpackage.m35;
import defpackage.n35;
import defpackage.nq8;
import defpackage.o8;
import defpackage.pco;
import defpackage.ptg;
import defpackage.qfg;
import defpackage.rfe;
import defpackage.tba;
import defpackage.v9g;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/chat/view/ScoreUpdateView;", "Lo8;", "", "getLayoutId", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScoreUpdateView extends o8 {
    public static final /* synthetic */ int l = 0;
    public final rfe d;
    public final int e;
    public final int f;
    public final AnimatorSet g;
    public ObjectAnimator h;
    public Bitmap i;
    public int j;
    public float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreUpdateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.score_update_additional_info;
        TextView textView = (TextView) nq8.B(R.id.score_update_additional_info, root);
        if (textView != null) {
            i = R.id.score_update_group;
            NestedHorizontalScrollView nestedHorizontalScrollView = (NestedHorizontalScrollView) nq8.B(R.id.score_update_group, root);
            if (nestedHorizontalScrollView != null) {
                i = R.id.score_update_text_container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.score_update_text_container, root);
                if (linearLayout != null) {
                    this.d = new rfe((ConstraintLayout) root, textView, nestedHorizontalScrollView, linearLayout, 4);
                    this.e = ao2.s(4, context);
                    this.f = ao2.s(6, context);
                    this.g = new AnimatorSet();
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.score_update_view;
    }

    public final void j() {
        LinearLayout linearLayout = (LinearLayout) this.d.d;
        Context context = getContext();
        context.getClass();
        boolean c0 = hkg.c0(context);
        int i = this.e;
        float f = c0 ? -this.k : this.j - (i * 12);
        Context context2 = getContext();
        context2.getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.TRANSLATION_X, f, hkg.c0(context2) ? ((LinearLayout) r0.d).getMeasuredWidth() + (this.j - (i * 12)) : -this.k);
        if (ofFloat != null) {
            ofFloat.setStartDelay(800L);
            ofFloat.setDuration(Ua.s);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
            ofFloat.addListener(new ptg(this, 1));
            ofFloat.addListener(new ptg(this, 0));
        } else {
            ofFloat = null;
        }
        this.h = ofFloat;
    }

    public final void l() {
        rfe rfeVar = this.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) rfeVar.b;
        constraintLayout.getClass();
        if (constraintLayout.getVisibility() == 0) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) rfeVar.b;
            constraintLayout2.getClass();
            tba.j(constraintLayout2, n35.TO_BOTTOM, 400L, 4);
            ((LinearLayout) rfeVar.d).setVisibility(4);
        }
    }

    public final void n(String str, String str2, String str3, Integer num, int i) {
        rfe rfeVar;
        BitmapDrawable bitmapDrawable;
        str.getClass();
        str2.getClass();
        final AnimatorSet animatorSet = this.g;
        animatorSet.cancel();
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.h;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.h = null;
        SpannableString spannableString = new SpannableString("   ".concat(str3 == null ? "" : str3));
        Context context = getContext();
        context.getClass();
        int i2 = this.e;
        int i3 = i2 * 4;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = i4 >= 29 ? 2 : 1;
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            drawable.setBounds(0, 0, i3, i3);
            v9g.K(drawable, context.getColor(R.color.on_color_primary));
            drawable.setAlpha(229);
        } else {
            drawable = null;
        }
        spannableString.setSpan(drawable != null ? new ImageSpan(drawable, i5) : null, 0, 1, 34);
        rfe rfeVar2 = this.d;
        TextView textView = (TextView) rfeVar2.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) rfeVar2.b;
        final TextView textView2 = (TextView) rfeVar2.e;
        LinearLayout linearLayout = (LinearLayout) rfeVar2.d;
        textView.setText(spannableString);
        int length = str.length();
        int i6 = length + 4;
        SpannableString spannableString2 = new SpannableString(lnb.o(str, c.q(9, " "), str2));
        Context context2 = getContext();
        context2.getClass();
        int i7 = i2 * 2;
        int i8 = length + 5;
        int i9 = i4 >= 29 ? 2 : 1;
        Drawable drawable2 = context2.getDrawable(R.drawable.ic_timeline_dot);
        if (drawable2 != null) {
            rfeVar = rfeVar2;
            drawable2.setBounds(0, 0, this.f, i7);
            v9g.K(drawable2, context2.getColor(R.color.on_color_primary));
            drawable2.setAlpha(153);
        } else {
            rfeVar = rfeVar2;
            drawable2 = null;
        }
        spannableString2.setSpan(drawable2 != null ? new ImageSpan(drawable2, i9) : null, i6, i8, 34);
        linearLayout.removeAllViews();
        this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (num != null) {
            String R = pco.R(num.intValue());
            qfg qfgVar = new qfg(this, 6);
            Context context3 = getContext();
            context3.getClass();
            ht9 ht9Var = new ht9(context3);
            ht9Var.c = R;
            ht9Var.q = jrg.b;
            ht9Var.f = R;
            ht9Var.c(R);
            Context context4 = getContext();
            context4.getClass();
            z8e.Q(ht9Var, context4, R.drawable.team_logo_placeholder, null, Integer.valueOf(R.color.neutral_default));
            ht9Var.d = new j12(qfgVar, i3, qfgVar, i3);
            Context context5 = getContext();
            context5.getClass();
            ajh.a(context5).a(ht9Var.a());
            bitmapDrawable = new BitmapDrawable(getContext().getResources(), this.i);
            bitmapDrawable.setBounds(0, 0, i3, i3);
            this.k += i3;
        } else {
            bitmapDrawable = null;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(spannableString2);
            Context context6 = textView3.getContext();
            context6.getClass();
            BitmapDrawable bitmapDrawable2 = hkg.c0(context6) ? null : bitmapDrawable;
            Context context7 = textView3.getContext();
            context7.getClass();
            textView3.setCompoundDrawables(bitmapDrawable2, null, hkg.c0(context7) ? bitmapDrawable : null, null);
            textView3.setCompoundDrawablePadding(i7);
            textView3.setTextAppearance(R.style.AssistiveDefault);
            textView3.setTextColor(getContext().getColor(R.color.surface_1));
            linearLayout.addView(textView3);
            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int i11 = i2 * 12;
            layoutParams2.setMarginStart(i11);
            textView3.setLayoutParams(layoutParams2);
            this.k = textView3.getPaint().measureText(spannableString2, 0, spannableString2.length()) + i11 + this.k;
        }
        textView2.setVisibility(8);
        constraintLayout.getClass();
        tba.i(constraintLayout, m35.FROM_BOTTOM, 400L, 4);
        final float f = (-16.0f) * i2;
        Context context8 = getContext();
        context8.getClass();
        final boolean c0 = hkg.c0(context8);
        animatorSet.getClass();
        textView2.postDelayed(new Runnable() { // from class: clh
            @Override // java.lang.Runnable
            public final void run() {
                View view = textView2;
                view.setVisibility(0);
                AnimatorSet animatorSet2 = animatorSet;
                animatorSet2.cancel();
                Property property = View.TRANSLATION_X;
                boolean z = c0;
                float f2 = f;
                if (z) {
                    f2 = -f2;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                animatorSet2.setDuration(400L);
                animatorSet2.start();
            }
        }, 400L);
        ((NestedHorizontalScrollView) rfeVar.c).setOnTouchListener(new ab(7));
        int measuredWidth = constraintLayout.getMeasuredWidth();
        this.j = measuredWidth;
        if (measuredWidth != 0) {
            j();
        } else if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
            constraintLayout.addOnLayoutChangeListener(new b2(this, 11));
        } else {
            this.j = constraintLayout.getMeasuredWidth();
            j();
        }
    }
}
