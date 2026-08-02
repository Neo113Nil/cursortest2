package com.vk.core.view.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.themes.ThemeKeyAttributes;
import com.vk.core.view.search.ModernSearchView;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import com.vkontakte.android.R;
import defpackage.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d3m;
import xsna.dd6;
import xsna.dhr0;
import xsna.e0i0;
import xsna.e3m;
import xsna.e810;
import xsna.f4m;
import xsna.fnj;
import xsna.gzs;
import xsna.h94;
import xsna.iah0;
import xsna.izs;
import xsna.jjc;
import xsna.l500;
import xsna.m630;
import xsna.mhy;
import xsna.ov;
import xsna.ozl;
import xsna.r1q0;
import xsna.s3q0;
import xsna.sxq;
import xsna.to2;
import xsna.w2o0;
import xsna.xut0;
import xsna.yb;
import xsna.ywn;

/* compiled from: ModernSearchView.kt */
@ozl
/* loaded from: classes17.dex */
public final class ModernSearchView extends FrameLayout {
    public final ImageView b;
    public final ProgressBar c;
    public View d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public final View h;
    public final TextView i;
    public final EditText j;
    public final TextView k;
    public final xut0 l;
    public final ViewGroup m;
    public final ViewGroup n;
    public final bpn0 o;
    public final e0i0 p;
    public View.OnClickListener q;
    public izs<? super String, s3q0> r;
    public gzs<Boolean> s;
    public gzs<s3q0> t;
    public boolean u;
    public boolean v;
    public final LinkedHashMap w;
    public boolean x;
    public static final h94 y = w2o0.a.a(R.drawable.vk_icon_arrow_left_outline_28, R.string.talkback_ic_back);
    public static final h94 z = new h94(R.drawable.vk_icon_voice_outline_24, R.string.talkback_ic_voice, R.attr.vk_ui_icon_medium);
    public static final h94 A = new h94(R.drawable.vk_icon_cancel_24, R.string.talkback_ic_cancel, R.attr.vk_ui_icon_medium);
    public static final h94 B = new h94(R.drawable.vk_icon_search_outline_16, R.string.talkback_ic_search, R.attr.vk_ui_icon_medium);

    /* compiled from: ModernSearchView.kt */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            h94 h94Var = ModernSearchView.y;
            ModernSearchView modernSearchView = ModernSearchView.this;
            modernSearchView.k();
            modernSearchView.e.animate().setDuration(150L).setListener(null).setUpdateListener(null).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
        }
    }

    /* compiled from: ModernSearchView.kt */
    public static final class b extends r1q0 {
        public final /* synthetic */ gzs<s3q0> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gzs<s3q0> gzsVar, SchemeStat$TypeClickItem.Subtype subtype) {
            super(subtype);
            this.c = gzsVar;
        }

        @Override // xsna.r1q0, android.view.View.OnClickListener
        public final void onClick(View view) {
            super.onClick(view);
            gzs<s3q0> gzsVar = this.c;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public ModernSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.o = new bpn0(new ywn(context, 1));
        this.u = true;
        this.v = true;
        m630 m630Var = new m630(this);
        this.w = new LinkedHashMap();
        this.x = true;
        int a2 = iah0.a(4);
        setPadding(a2, a2, a2, a2);
        LayoutInflater.from(context).inflate(R.layout.view_modern_search, (ViewGroup) this, true);
        this.d = findViewById(R.id.search_box);
        ImageView imageView = (ImageView) findViewById(R.id.iv_icon_left);
        this.b = imageView;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.iv_progress_left);
        this.c = progressBar;
        float f = 16;
        i(iah0.a(f), iah0.a(f));
        this.e = (ImageView) findViewById(R.id.iv_icon_right);
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_icon_params);
        this.f = imageView2;
        this.g = (ImageView) findViewById(R.id.iv_icon_third);
        this.h = findViewById(R.id.layout_icon_third);
        this.i = (TextView) findViewById(R.id.tv_icon_third_badge);
        this.l = new xut0(imageView2);
        this.k = (TextView) findViewById(R.id.query_static);
        this.n = (ViewGroup) findViewById(R.id.search_milkshake_background);
        EditText editText = (EditText) findViewById(R.id.query);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.k630
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                if (!z2) {
                    h94 h94Var = ModernSearchView.y;
                    return;
                }
                View.OnClickListener onClickListener = ModernSearchView.this.q;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
        jjc.g(editText, new e810(this, 5));
        editText.addTextChangedListener(m630Var);
        awt0.h(editText, new l500(this, 6), false);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.l630
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    h94 h94Var = ModernSearchView.y;
                    return false;
                }
                ModernSearchView modernSearchView = ModernSearchView.this;
                izs<? super String, s3q0> izsVar = modernSearchView.r;
                if (izsVar != null) {
                    izsVar.invoke(modernSearchView.getQuery());
                }
                modernSearchView.b(0L);
                return true;
            }
        });
        this.j = editText;
        this.m = (ViewGroup) findViewById(R.id.search_box);
        progressBar.setIndeterminateTintList(e3m.c(R.attr.vk_ui_icon_medium, context));
        this.p = new e0i0(imageView, progressBar);
        setStaticMode(null);
        this.v = !fnj.d(context);
    }

    private final w2o0 getRightDrawable() {
        Editable text;
        EditText editText = this.j;
        if (editText != null && (text = editText.getText()) != null && text.length() != 0) {
            return A;
        }
        if (((Boolean) this.o.getValue()).booleanValue() && this.u) {
            return z;
        }
        return null;
    }

    public final void a() {
        EditText editText = this.j;
        if (editText != null) {
            editText.setText("");
        }
    }

    public final void b(long j) {
        EditText editText = this.j;
        if (j > 0) {
            postDelayed(new ov(this, 9), j);
        } else {
            mhy.d(editText);
        }
        if (editText != null) {
            editText.clearFocus();
        }
    }

    public final void c(long j) {
        if (j > 0) {
            postDelayed(new to2(this, 9), j);
        } else {
            mhy.j(this.j);
        }
    }

    public final void e(gzs<Boolean> gzsVar, gzs<s3q0> gzsVar2) {
        TextView textView = this.k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        EditText editText = this.j;
        if (editText != null) {
            editText.setText("");
            editText.setVisibility(0);
        }
        ImageView imageView = this.b;
        if (imageView != null && this.v) {
            g(imageView, y);
            jjc.g(imageView, new sxq(1, gzsVar));
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            k();
            jjc.g(imageView2, new m(23, this, gzsVar2));
        }
    }

    public final void f() {
        EditText editText = this.j;
        if (editText != null) {
            editText.requestFocus();
        }
    }

    public final void g(ImageView imageView, w2o0 w2o0Var) {
        this.w.put(imageView, w2o0Var);
        if (this.x) {
            w2o0Var.a(imageView, true);
        } else {
            w2o0Var.a(imageView, false);
        }
    }

    public final boolean getFocused() {
        EditText editText = this.j;
        return editText != null && editText.isFocused();
    }

    public final gzs<Boolean> getOnActionBackListener() {
        return this.s;
    }

    public final gzs<s3q0> getOnActionClearListener() {
        return this.t;
    }

    public final izs<String, s3q0> getOnActionSearchListener() {
        return this.r;
    }

    public final View.OnClickListener getOnActionSearchQueryClick() {
        return this.q;
    }

    public final String getQuery() {
        Editable text;
        String obj;
        EditText editText = this.j;
        return (editText == null || (text = editText.getText()) == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final View getSearchBox() {
        return this.d;
    }

    public final View getThirdIconView() {
        return this.g;
    }

    public final boolean getVoiceIsAvailable() {
        return this.u;
    }

    public final void h() {
        ImageView imageView = this.b;
        if (imageView != null) {
            d3m.b(imageView, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        }
        if (imageView != null) {
            g(imageView, B);
        }
    }

    public final void i(int i, int i2) {
        ImageView imageView = this.b;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
            f4m.s(i2, imageView);
        }
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            progressBar.getLayoutParams();
            f4m.s(i2, progressBar);
        }
    }

    public final void j(boolean z2, boolean z3) {
        xut0 xut0Var = this.l;
        if (!z2) {
            if (xut0Var != null) {
                xut0Var.a(true);
            }
        } else {
            if (xut0Var != null) {
                xut0Var.b();
            }
            ImageView imageView = this.f;
            if (imageView != null) {
                imageView.setColorFilter(z3 ? -11433012 : -7301991, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    public final void k() {
        w2o0 rightDrawable = getRightDrawable();
        int a2 = iah0.a(40);
        ImageView imageView = this.e;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = a2;
            layoutParams.width = a2;
            f4m.r(0, imageView);
        }
        if (rightDrawable == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                g(imageView, rightDrawable);
            }
        }
    }

    public final void setBackArrowAllowedInEditMode(boolean z2) {
        this.v = z2;
    }

    public final void setDynamicIconsColoringEnabled(boolean z2) {
        this.x = z2;
        for (Map.Entry entry : this.w.entrySet()) {
            g((ImageView) entry.getKey(), (w2o0) entry.getValue());
        }
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        EditText editText = this.j;
        if (editText != null) {
            editText.setEllipsize(truncateAt);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setEnabled(z2);
        }
        View view = this.d;
        if (view != null) {
            view.setEnabled(z2);
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setEnabled(z2);
        }
        ImageView imageView3 = this.f;
        if (imageView3 != null) {
            imageView3.setEnabled(z2);
        }
        View view2 = this.h;
        if (view2 != null) {
            view2.setEnabled(z2);
        }
        EditText editText = this.j;
        if (editText != null) {
            editText.setEnabled(z2);
        }
        TextView textView = this.k;
        if (textView != null) {
            textView.setEnabled(z2);
        }
        ViewGroup viewGroup = this.m;
        if (viewGroup != null) {
            viewGroup.setEnabled(z2);
        }
    }

    public final void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        EditText editText = this.j;
        if (editText != null) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
    }

    public final void setHint(int i) {
        EditText editText = this.j;
        if (editText != null) {
            editText.setHint(i);
        }
        TextView textView = this.k;
        if (textView != null) {
            textView.setHint(i);
        }
    }

    public final void setIsFiltersAvailable(boolean z2) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setEnabled(z2);
        }
        xut0 xut0Var = this.l;
        if (z2) {
            if (xut0Var != null) {
                xut0Var.d = 1.0f;
            }
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            if (xut0Var != null) {
                xut0Var.d = 0.6f;
            }
        }
    }

    public final void setOnActionBackListener(gzs<Boolean> gzsVar) {
        this.s = gzsVar;
    }

    public final void setOnActionClearListener(gzs<s3q0> gzsVar) {
        this.t = gzsVar;
    }

    public final void setOnActionSearchListener(izs<? super String, s3q0> izsVar) {
        this.r = izsVar;
    }

    public final void setOnActionSearchQueryClick(View.OnClickListener onClickListener) {
        this.q = onClickListener;
    }

    public final void setParamsClickListener(gzs<s3q0> gzsVar) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setOnClickListener(new dd6(gzsVar, 7));
        }
    }

    public final void setQuery(String str) {
        EditText editText = this.j;
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(editText.getText().length());
            b(0L);
        }
    }

    public final void setRightIconEnabled(boolean z2) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z2);
        }
        if (imageView != null) {
            imageView.setAlpha(z2 ? 1.0f : 0.4f);
        }
    }

    public final void setRightIconVoice(boolean z2) {
        ImageView imageView = this.e;
        if (imageView != null) {
            d3m.b(imageView, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        }
        if (z2) {
            imageView.animate().alpha(0.3f).scaleX(0.7f).scaleY(0.7f).setDuration(150L).setListener(new a()).start();
        } else {
            k();
        }
    }

    public final void setSearchBox(View view) {
        this.d = view;
    }

    public final void setSearchBoxBackground(Drawable drawable) {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setBackground(drawable);
        SparseIntArray m = dhr0.m(view, false);
        if (m == null) {
            return;
        }
        m.delete(ThemeKeyAttributes.BACKGROUND_RES.h());
        dhr0.a.getClass();
        dhr0.D().getClass();
        view.setTag(R.id.theme_tag_key, m);
    }

    public final void setStaticMode(gzs<s3q0> gzsVar) {
        EditText editText = this.j;
        if (editText != null) {
            editText.setVisibility(8);
        }
        TextView textView = this.k;
        if (textView != null) {
            textView.setVisibility(0);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            g(imageView, B);
        }
        k();
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            jjc.f(new b(gzsVar, SchemeStat$TypeClickItem.Subtype.VOICE_SEARCH_ICON), imageView2);
        }
    }

    public final void setStaticModeRightIcon(w2o0 w2o0Var) {
        ImageView imageView = this.e;
        if (imageView != null) {
            g(imageView, w2o0Var);
        }
    }

    public final void setThirdIconClickListener(gzs<s3q0> gzsVar) {
        View view = this.h;
        if (view != null) {
            view.setOnClickListener(new yb(gzsVar, 8));
        }
    }

    public final void setThirdIconCounter(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        if (textView != null) {
            bwt0.p0(textView, i > 0);
        }
    }

    public final void setThirdIconVisibility(boolean z2) {
        View view = this.h;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    public final void setVoiceIsAvailable(boolean z2) {
        this.u = z2;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 4);
        }
    }

    public final void setHint(String str) {
        EditText editText = this.j;
        if (editText != null) {
            editText.setHint(str);
        }
        TextView textView = this.k;
        if (textView != null) {
            textView.setHint(str);
        }
    }
}
