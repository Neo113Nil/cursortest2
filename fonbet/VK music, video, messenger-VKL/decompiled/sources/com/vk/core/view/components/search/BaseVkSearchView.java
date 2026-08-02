package com.vk.core.view.components.search;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vkontakte.android.R;
import xsna.aj6;
import xsna.d3m;
import xsna.e0i0;
import xsna.e3m;
import xsna.ec;
import xsna.f3a0;
import xsna.f4m;
import xsna.gzs;
import xsna.hbh0;
import xsna.iz0;
import xsna.izs;
import xsna.jjc;
import xsna.js6;
import xsna.krv0;
import xsna.mhy;
import xsna.ns6;
import xsna.os6;
import xsna.pcv0;
import xsna.s3q0;
import xsna.td0;
import xsna.vb;
import xsna.w2o0;

/* compiled from: BaseVkSearchView.kt */
/* loaded from: classes17.dex */
public class BaseVkSearchView extends ConstraintLayout {
    public static final /* synthetic */ int P = 0;
    public final View A;
    public final View B;
    public final ImageView C;
    public final ProgressBar D;
    public final View E;
    public final e0i0 F;
    public final int G;
    public final int H;
    public View.OnClickListener I;
    public gzs<s3q0> J;
    public boolean K;
    public izs<? super String, s3q0> L;
    public boolean M;
    public final int N;
    public int O;
    public final ImageView t;
    public final ImageView u;
    public TextView.OnEditorActionListener v;
    public final EditText w;
    public final View x;
    public final View y;
    public final View z;

    /* compiled from: BaseVkSearchView.kt */
    public final class a extends pcv0 {
        public a() {
            super(new io.michaelrocks.libphonenumber.android.a(f3a0.a.a(BaseVkSearchView.this.getContext()), f3a0.c), false, true);
        }

        @Override // xsna.pcv0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            BaseVkSearchView.this.i5(false);
        }
    }

    public BaseVkSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static void P4(BaseVkSearchView baseVkSearchView) {
        baseVkSearchView.setQueryPadding(90);
    }

    public static /* synthetic */ void d5(BaseVkSearchView baseVkSearchView, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        baseVkSearchView.c5(i, -1, i2, -1);
    }

    private final void setQueryPadding(int i) {
        EditText editText = this.w;
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), hbh0.b(i, getContext()), editText.getPaddingBottom());
    }

    public final void T4() {
        this.w.clearFocus();
    }

    public final void U4() {
        setQuery("");
        gzs<s3q0> gzsVar = this.J;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    public final void V4() {
        this.M = true;
        i5(true);
    }

    public final void X4(boolean z) {
        float a2 = hbh0.a(getContext(), 48.0f);
        if (!z) {
            a2 = 0.0f;
        }
        this.w.setTranslationX(a2);
        this.x.setTranslationX(a2);
        this.E.setTranslationX(a2);
        int i = this.H;
        View view = this.B;
        View view2 = this.z;
        if (z) {
            f4m.s(i, view);
            view2.setAlpha(1.0f);
            view2.setVisibility(0);
        } else {
            f4m.s(this.G - i, view);
            view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            f4m.j(view2);
        }
    }

    public final void Y4(boolean z) {
        this.F.a(z);
    }

    public boolean Z4() {
        return false;
    }

    public final void a5() {
        mhy.j(this.w);
    }

    public final void b5(long j) {
        postDelayed(new vb(this, 2), j);
    }

    public final void c5(int i, int i2, int i3, int i4) {
        View view = this.B;
        if (i != -1) {
            f4m.s(i, view);
        }
        if (i2 != -1) {
            f4m.t(i2, view);
        }
        if (i3 != -1) {
            f4m.r(i3, view);
        }
        if (i4 != -1) {
            f4m.q(i4, view);
        }
    }

    public final void d0() {
        EditText editText = this.w;
        mhy.d(editText);
        editText.clearFocus();
    }

    public final void e5() {
        this.w.requestFocus();
    }

    public final void f5(boolean z) {
        final float a2 = hbh0.a(getContext(), 48.0f);
        float translationX = this.w.getTranslationX();
        float f = z ? a2 : 0.0f;
        if (z && translationX == a2) {
            return;
        }
        if (z || translationX != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i = 0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationX, f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.ms6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i2 = BaseVkSearchView.P;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BaseVkSearchView baseVkSearchView = BaseVkSearchView.this;
                    baseVkSearchView.w.setTranslationX(floatValue);
                    baseVkSearchView.x.setTranslationX(floatValue);
                    baseVkSearchView.E.setTranslationX(floatValue);
                    View view = baseVkSearchView.z;
                    double d = floatValue;
                    float f2 = a2;
                    view.setAlpha(d < ((double) f2) * 0.5d ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : floatValue / f2);
                }
            });
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            d3m.g(ofFloat, new ns6(z, this));
            int i2 = this.G;
            int i3 = this.H;
            int i4 = z ? i2 - i3 : i3;
            if (!z) {
                i3 = i2 - i3;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i4, i3);
            ofInt.addUpdateListener(new os6(this, i));
            ofInt.setDuration(200L);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofInt);
            animatorSet.start();
        }
    }

    public final void g5(boolean z) {
        this.F.c(z);
    }

    public final ImageView getActionView() {
        return this.t;
    }

    public final View getActionsContainer() {
        return this.A;
    }

    public final View getBackButton() {
        return this.z;
    }

    public final View getBackgroundContainer() {
        return this.B;
    }

    public final EditText getEditView() {
        return this.w;
    }

    public final View getLeftBackgroundContainer() {
        return this.x;
    }

    public final View getLeftIconContainerView() {
        return this.E;
    }

    public final ProgressBar getLeftProgressView() {
        return this.D;
    }

    public final gzs<s3q0> getOnActionClearListener() {
        return this.J;
    }

    public final View.OnClickListener getOnActionSearchQueryClick() {
        return this.I;
    }

    public final izs<String, s3q0> getOnVoiceInputListener() {
        return this.L;
    }

    public final String getQuery() {
        return this.w.getText().toString();
    }

    public final View getRightBackgroundContainer() {
        return this.y;
    }

    public final ImageView getSearchIconImageView() {
        return this.C;
    }

    public final int getSelfMargin() {
        return this.H;
    }

    public final int getSideMargin() {
        return this.G;
    }

    public final void h5(boolean z, boolean z2) {
        if (z) {
            setQueryPadding(128);
            d3m.c(this.u, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(this.u, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new js6(this, 0), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        krv0.l(R.attr.vk_connect_accent);
        krv0.o(this.u, z2 ? this.N : R.attr.vk_ui_vkontakte_color_search_bar_field_tint);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i5(boolean z) {
        int i;
        if (!this.M) {
            if (this.w.getText().length() > 0) {
                i = 1;
            } else if (Z4() && this.K) {
                i = 2;
            }
            if (z && this.O == i) {
                return;
            }
            this.O = i;
            ImageView imageView = this.t;
            if (i != 0) {
                f4m.j(imageView);
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                setUpVoiceInput(imageView);
                return;
            } else {
                imageView.setVisibility(0);
                TypedValue typedValue = krv0.a;
                krv0.p(imageView, R.drawable.vk_icon_cancel_24, R.attr.vk_ui_vkontakte_color_search_bar_field_tint);
                imageView.setContentDescription(imageView.getContext().getString(R.string.vk_clear_input));
                jjc.g(imageView, new ec(this, 9));
                return;
            }
        }
        i = 0;
        if (z) {
        }
        this.O = i;
        ImageView imageView2 = this.t;
        if (i != 0) {
        }
    }

    public final void j5(w2o0 w2o0Var) {
        if (w2o0Var == null) {
            d3m.e(this.u, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
            setQueryPadding(90);
        } else {
            w2o0Var.a(this.u, true);
            d3m.c(this.u, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            setQueryPadding(128);
        }
    }

    public final void setHint(int i) {
        this.w.setHint(i);
    }

    public final void setInputFocusable(boolean z) {
        this.w.setFocusable(z);
    }

    public final void setMaxInputLength(int i) {
        this.w.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    public final void setOnActionClearListener(gzs<s3q0> gzsVar) {
        this.J = gzsVar;
    }

    public final void setOnActionSearchQueryClick(View.OnClickListener onClickListener) {
        this.I = onClickListener;
    }

    public final void setOnBackClickListener(gzs<s3q0> gzsVar) {
        View view = this.z;
        if (gzsVar == null) {
            view.setOnClickListener(null);
        } else {
            jjc.g(view, new td0(2, this, gzsVar));
        }
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.w.setOnKeyListener(onKeyListener);
    }

    public final void setOnVoiceInputListener(izs<? super String, s3q0> izsVar) {
        this.L = izsVar;
    }

    public final void setQuery(String str) {
        EditText editText = this.w;
        editText.setText(str);
        editText.setSelection(editText.getText().toString().length());
    }

    public final void setSearchBoxColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        this.x.setBackgroundTintList(valueOf);
        this.y.setBackgroundTintList(valueOf);
    }

    public final void setSecondaryActionListener(gzs<s3q0> gzsVar) {
        this.u.setOnClickListener(new aj6(gzsVar, 1));
    }

    public final void setSecondaryOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.v = onEditorActionListener;
    }

    public final void setVoiceInputEnabled(boolean z) {
        if (this.K != z) {
            this.K = z;
            i5(false);
        }
    }

    public /* synthetic */ BaseVkSearchView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final void setHint(String str) {
        this.w.setHint(str);
    }

    public BaseVkSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        int g;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.vk_post_side_padding);
        this.G = dimensionPixelSize;
        int b = hbh0.b(4, context);
        this.H = b;
        this.K = true;
        this.N = R.attr.vk_ui_icon_accent;
        LayoutInflater.from(context).inflate(R.layout.vk_milkshake_search_view, (ViewGroup) this, true);
        if (attributeSet != null && (g = krv0.g("vk_search_view_icon_highlighted_tint", attributeSet)) != 0) {
            this.N = g;
        }
        this.z = findViewById(R.id.msv_back_btn);
        final EditText editText = (EditText) findViewById(R.id.msv_query);
        this.w = editText;
        editText.setInputType(1);
        editText.addTextChangedListener(new a());
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.ks6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                int i3 = BaseVkSearchView.P;
                BaseVkSearchView baseVkSearchView = BaseVkSearchView.this;
                if (i2 == 3) {
                    baseVkSearchView.d0();
                } else if (i2 == 6) {
                    baseVkSearchView.d0();
                    return true;
                }
                TextView.OnEditorActionListener onEditorActionListener = baseVkSearchView.v;
                if (onEditorActionListener == null) {
                    return true;
                }
                onEditorActionListener.onEditorAction(textView, i2, keyEvent);
                return true;
            }
        });
        this.t = (ImageView) findViewById(R.id.msv_action);
        this.u = (ImageView) findViewById(R.id.msv_secondary_action);
        this.x = findViewById(R.id.msv_bg_left_part);
        this.y = findViewById(R.id.msv_bg_right_part);
        this.A = findViewById(R.id.msv_actions_container);
        View findViewById = findViewById(R.id.msv_inner_container);
        this.B = findViewById;
        ImageView imageView = (ImageView) findViewById(R.id.msv_icon_search);
        this.C = imageView;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.msv_progress_left);
        this.D = progressBar;
        this.E = findViewById(R.id.msv_left_icon_container);
        progressBar.setIndeterminateTintList(e3m.c(R.attr.vk_ui_icon_medium, context));
        this.F = new e0i0(imageView, progressBar);
        int i2 = dimensionPixelSize - b;
        f4m.s(i2, findViewById);
        f4m.r(i2, findViewById);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.ls6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                BaseVkSearchView baseVkSearchView = BaseVkSearchView.this;
                if (z) {
                    View.OnClickListener onClickListener = baseVkSearchView.I;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                } else {
                    int i3 = BaseVkSearchView.P;
                }
                if (editText.isShown()) {
                    return;
                }
                mhy.d(baseVkSearchView.w);
            }
        });
        jjc.g(editText, new iz0(this, 4));
        X4(true);
        i5(true);
    }

    private static /* synthetic */ void getActionMode$annotations() {
    }

    public void setUpVoiceInput(ImageView imageView) {
    }
}
