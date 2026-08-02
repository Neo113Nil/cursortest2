package com.vk.core.view.search;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.movika.sdk.base.presenter.c;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;
import xsna.ef2;
import xsna.epx;
import xsna.f4m;
import xsna.gzs;
import xsna.iah0;
import xsna.r1q0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.vtk0;
import xsna.xo2;

/* compiled from: AnimStartSearchView.kt */
/* loaded from: classes17.dex */
public final class AnimStartSearchView extends FrameLayout implements View.OnClickListener {
    public static final float t = iah0.a(42);
    public static final int u = iah0.a(48);
    public final EditText b;
    public final View c;
    public final View d;
    public final View e;
    public final ImageView f;
    public final View g;
    public final ViewGroup h;
    public final View i;
    public final View j;
    public final View k;
    public View l;
    public ValueAnimator m;
    public gzs<s3q0> n;
    public gzs<s3q0> o;
    public gzs<s3q0> p;
    public gzs<s3q0> q;
    public gzs<s3q0> r;
    public gzs<s3q0> s;

    /* compiled from: AnimStartSearchView.kt */
    public interface a {
    }

    public AnimStartSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.search_view_with_anim_start, this);
        EditText editText = (EditText) findViewById(R.id.etv_search);
        this.b = editText;
        View findViewById = findViewById(R.id.v_back_btn);
        this.c = findViewById;
        this.d = findViewById(R.id.iv_icon_search);
        View findViewById2 = findViewById(R.id.iv_icon_voice);
        this.e = findViewById2;
        this.k = findViewById(R.id.v_icon_container);
        ImageView imageView = (ImageView) findViewById(R.id.iv_icon_params);
        this.f = imageView;
        View findViewById3 = findViewById(R.id.iv_icon_cancel);
        this.g = findViewById3;
        this.h = (ViewGroup) findViewById(R.id.ll_search_container);
        this.i = findViewById(R.id.fl_bg_left_part);
        this.j = findViewById(R.id.fl_bg_right_part);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        bwt0.p0(findViewById2, vtk0.d().b(context));
        this.l = bwt0.K(findViewById2) ? findViewById2 : null;
        c();
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: xsna.cf2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                float f = AnimStartSearchView.t;
                boolean z = keyEvent.getAction() == 0 && i == 66;
                if (z) {
                    AnimStartSearchView animStartSearchView = AnimStartSearchView.this;
                    EditText editText2 = animStartSearchView.b;
                    mhy.d(editText2);
                    editText2.clearFocus();
                    gzs<s3q0> gzsVar = animStartSearchView.s;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                return z;
            }
        });
        setFocusableInTouchMode(true);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.df2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                gzs<s3q0> gzsVar;
                float f = AnimStartSearchView.t;
                AnimStartSearchView animStartSearchView = AnimStartSearchView.this;
                animStartSearchView.getClass();
                if (!z || (gzsVar = animStartSearchView.r) == null) {
                    return;
                }
                gzsVar.invoke();
            }
        });
    }

    public final void a(boolean z) {
        EditText editText = this.b;
        float translationX = editText.getTranslationX();
        float f = t;
        boolean z2 = false;
        boolean z3 = z && translationX == f;
        boolean z4 = !z && translationX == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z3 && !z4) {
            z2 = true;
        }
        if (z2) {
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = z ? f : 0.0f;
            this.i.setTranslationX(f3);
            editText.setTranslationX(f3);
            if (f3 >= f * 0.5d) {
                f2 = f3 / f;
            }
            this.c.setAlpha(f2);
            if (!z) {
                f = -f;
            }
            f4m.w(editText.getPaddingEnd() + ((int) f), editText);
        }
    }

    public final void b(boolean z) {
        boolean b = vtk0.d().b(getContext());
        final View view = null;
        View view2 = this.e;
        View view3 = this.g;
        final View view4 = (z && b) ? view2 : z ? null : view3;
        if (view4 == this.l) {
            return;
        }
        this.l = view4;
        if (z) {
            view = view3;
        } else if (b) {
            view = view2;
        }
        if (view4 == null) {
            view3.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new ef2(this, 0)).start();
            return;
        }
        if (view4.equals(view3) && view == null) {
            bwt0.p0(view3, true);
            view3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            bwt0.p0(view2, false);
            c();
            view3.animate().alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            return;
        }
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (!bwt0.K(view4)) {
            view4.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            bwt0.p0(view4, true);
            c();
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.ff2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float f = AnimStartSearchView.t;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f2 = floatValue > 0.5f ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (0.5f - floatValue) * 2.0f;
                View view5 = view;
                if (view5 != null) {
                    view5.setAlpha(floatValue);
                }
                view4.setAlpha(f2);
            }
        });
        xo2.h(ofFloat, new c(3, view, this));
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.start();
        this.m = ofFloat;
    }

    public final void c() {
        bwt0.p0(this.k, bwt0.K(this.e) || bwt0.K(this.g));
    }

    public final gzs<s3q0> getBackButtonAction() {
        return this.n;
    }

    public final gzs<s3q0> getCancelButtonAction() {
        return this.q;
    }

    public final gzs<s3q0> getEnterButtonAction() {
        return this.s;
    }

    public final gzs<s3q0> getFilterButtonAction() {
        return this.p;
    }

    public final String getQuery() {
        return this.b.getText().toString();
    }

    public final gzs<s3q0> getSearchClickedAction() {
        return this.r;
    }

    public final gzs<s3q0> getVoiceButtonAction() {
        return this.o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gzs<s3q0> gzsVar;
        if (epx.f(view, this.c)) {
            gzs<s3q0> gzsVar2 = this.n;
            if (gzsVar2 != null) {
                gzsVar2.invoke();
                return;
            }
            return;
        }
        if (epx.f(view, this.e)) {
            gzs<s3q0> gzsVar3 = this.o;
            if (gzsVar3 != null) {
                gzsVar3.invoke();
            }
            r1q0.a.a(SchemeStat$TypeClickItem.Subtype.VOICE_SEARCH_ICON);
            return;
        }
        if (epx.f(view, this.f)) {
            gzs<s3q0> gzsVar4 = this.p;
            if (gzsVar4 != null) {
                gzsVar4.invoke();
                return;
            }
            return;
        }
        if (!epx.f(view, this.g) || (gzsVar = this.q) == null) {
            return;
        }
        gzsVar.invoke();
    }

    public final void setBackButtonAction(gzs<s3q0> gzsVar) {
        this.n = gzsVar;
    }

    public final void setCancelButtonAction(gzs<s3q0> gzsVar) {
        this.q = gzsVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
        this.d.setEnabled(z);
        this.e.setEnabled(z);
        this.g.setEnabled(z);
        this.h.setEnabled(z);
        this.i.setEnabled(z);
        this.j.setEnabled(z);
    }

    public final void setEnterButtonAction(gzs<s3q0> gzsVar) {
        this.s = gzsVar;
    }

    public final void setFilterButtonAction(gzs<s3q0> gzsVar) {
        if (epx.f(this.p, gzsVar)) {
            return;
        }
        bwt0.p0(this.f, gzsVar != null);
        boolean z = gzsVar != null;
        int i = u;
        if (!z) {
            i = -i;
        }
        EditText editText = this.b;
        f4m.w(editText.getPaddingEnd() + i, editText);
        c();
        this.p = gzsVar;
    }

    public final void setFiltersIconActive(boolean z) {
        this.f.setImageTintList(dhr0.r(z ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_medium));
    }

    public final void setHint(tlo0 tlo0Var) {
        this.b.setHint(tlo0Var.a(getContext()));
    }

    public final void setHintTextColor(int i) {
        this.b.setHintTextColor(i);
    }

    public final void setMaxTextLength(int i) {
        this.b.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    public final void setSearchClickedAction(gzs<s3q0> gzsVar) {
        this.r = gzsVar;
    }

    public final void setSelection(int i) {
        this.b.setSelection(i);
    }

    public final void setVoiceButtonAction(gzs<s3q0> gzsVar) {
        this.o = gzsVar;
    }

    public final void setFocusChangedListener(a aVar) {
    }
}
