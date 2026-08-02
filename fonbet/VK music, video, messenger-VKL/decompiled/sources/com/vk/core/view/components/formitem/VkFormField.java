package com.vk.core.view.components.formitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.vk.core.view.components.R$styleable;
import com.vk.movika.sdk.base.ui.r;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.c98;
import xsna.e43;
import xsna.ei50;
import xsna.en9;
import xsna.f4m;
import xsna.fem0;
import xsna.fxp;
import xsna.gpo0;
import xsna.hri0;
import xsna.izs;
import xsna.j8s;
import xsna.jir0;
import xsna.lq2;
import xsna.m0t0;
import xsna.mll0;
import xsna.msy;
import xsna.pvh0;
import xsna.q80;
import xsna.s200;
import xsna.s3q0;
import xsna.sgt0;
import xsna.too0;
import xsna.vev0;
import xsna.w2a0;
import xsna.wrl0;
import xsna.ww;
import xsna.wzs;
import xsna.xbj0;

/* compiled from: VkFormField.kt */
/* loaded from: classes17.dex */
public final class VkFormField extends LinearLayout implements too0 {
    public static final List<Class<? extends View>> C = e43.l(EditText.class, CheckBox.class, RadioButton.class, VkTextArea.class, VkInputSelect.class);
    public boolean A;
    public wzs<? super VkFormField, ? super View, Boolean> B;
    public ForegroundColorSpan b;
    public final bpn0 c;
    public final bpn0 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public View j;
    public final Object k;
    public final Object l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public Drawable w;
    public CharSequence x;
    public Drawable y;
    public CharSequence z;

    public VkFormField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void c(int i, View view) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getAfterIconButton() {
        return (ImageView) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getAfterTextView() {
        return (TextView) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getCaptionTextView() {
        return (TextView) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getContentContainer() {
        return (FrameLayout) this.e.getValue();
    }

    private final j8s getDefaults() {
        getContext();
        return s200.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageButton getEndButton() {
        return (ImageButton) this.l.getValue();
    }

    private final int[] getErrorState() {
        return (int[]) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayout getLabelLinearLayout() {
        return (LinearLayout) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getLabelTextView() {
        return (TextView) this.g.getValue();
    }

    private final int[] getValidState() {
        return (int[]) this.d.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        getDefaults().getClass();
        this.b = new ForegroundColorSpan(gpo0.d(R.attr.vk_ui_text_negative, this));
        a();
        e();
        g();
        d();
        Drawable drawable = this.y;
        if (drawable != null) {
            getAfterIconButton().setImageDrawable(drawable);
        }
    }

    public final void a() {
        getDefaults().getClass();
        this.b = new ForegroundColorSpan(gpo0.d(R.attr.vk_ui_text_negative, this));
        getContext();
        getLabelTextView().setTextColor(gpo0.d(getDefaults().k(), this));
        getAfterTextView().setTextColor(gpo0.d(getDefaults().b(), this));
        ImageView afterIconButton = getAfterIconButton();
        getDefaults().getClass();
        afterIconButton.setColorFilter(gpo0.d(R.attr.vk_ui_icon_secondary, this), PorterDuff.Mode.SRC_IN);
        int i = getDefaults().i(getContext());
        ViewGroup.LayoutParams layoutParams = getLabelTextView().getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = i;
        }
        int h = getDefaults().h(getContext());
        ImageView afterIconButton2 = getAfterIconButton();
        ViewGroup.LayoutParams layoutParams3 = getAfterIconButton().getLayoutParams();
        layoutParams3.width = h;
        layoutParams3.height = h;
        afterIconButton2.setLayoutParams(layoutParams3);
        int c = getDefaults().c(getContext());
        int g = getDefaults().g(getContext());
        if (c > 0 || g > 0) {
            setPadding(g, c, g, c);
            LinearLayout labelLinearLayout = getLabelLinearLayout();
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.topMargin = 0;
            labelLinearLayout.setLayoutParams(layoutParams4);
            TextView captionTextView = getCaptionTextView();
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.topMargin = (int) vev0.g;
            layoutParams5.bottomMargin = 0;
            captionTextView.setLayoutParams(layoutParams5);
        }
        getCaptionTextView().setMinimumHeight(getDefaults().j(getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != 0) {
            List<Class<? extends View>> list = C;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(view)) {
                        FrameLayout contentContainer = getContentContainer();
                        if (layoutParams == null) {
                            return;
                        }
                        contentContainer.addView(view, new FrameLayout.LayoutParams(layoutParams));
                        this.j = view;
                        getLabelTextView().setLabelFor(view.getId());
                        if (view instanceof ei50) {
                            ((ei50) view).setOnContentChangedListener(new ww(25, view, this));
                        }
                        if (view instanceof q80) {
                            ((q80) view).setOnActiveStateChangeListener(new r(24, view, this));
                        }
                        f();
                        return;
                    }
                }
            }
        }
        super.addView(view, layoutParams);
    }

    public final void b(int i, String str) {
        getAfterIconButton().setTag(i, str);
    }

    public final void d() {
        if (this.t.length() == 0) {
            getAfterTextView().setVisibility(8);
        } else {
            getAfterTextView().setVisibility(0);
        }
        getAfterTextView().setText(this.t);
    }

    public final void e() {
        int i;
        CharSequence charSequence = this.o ? this.u : this.p ? this.v : this.s;
        if (charSequence.length() == 0) {
            getCaptionTextView().setVisibility(8);
        } else {
            getCaptionTextView().setVisibility(0);
        }
        getCaptionTextView().setText(charSequence);
        if (this.o) {
            getDefaults().getClass();
            i = R.attr.vk_ui_text_negative;
        } else if (this.p) {
            i = getDefaults().d();
        } else {
            getDefaults().getClass();
            i = R.attr.vk_ui_text_secondary;
        }
        getCaptionTextView().setTextColor(gpo0.d(i, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        boolean z;
        if (this.A) {
            return;
        }
        if (this.w != null) {
            KeyEvent.Callback callback = this.j;
            if (callback != null) {
                if (callback instanceof q80 ? ((q80) callback).a() : false) {
                    z = true;
                    if (z) {
                        View view = this.j;
                        if (view != null && this.B.invoke(this, view).booleanValue()) {
                            ImageButton endButton = getEndButton();
                            endButton.setImageDrawable(this.w);
                            endButton.setVisibility(0);
                            View view2 = this.j;
                            if (view2 != null) {
                                c(getDefaults().e(getContext()), view2);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        getEndButton().setVisibility(8);
        View view3 = this.j;
        if (view3 != null) {
            c(getDefaults().f(getContext()), view3);
        }
    }

    public final void g() {
        CharSequence charSequence;
        if (this.n) {
            SpannableString spannableString = new SpannableString(((Object) this.r) + " *");
            ForegroundColorSpan foregroundColorSpan = this.b;
            if (foregroundColorSpan == null) {
                foregroundColorSpan = null;
            }
            spannableString.setSpan(foregroundColorSpan, this.r.length(), this.r.length() + 2, 33);
            charSequence = spannableString;
        } else {
            charSequence = this.r;
        }
        if (charSequence.length() != 0) {
            getLabelTextView().setVisibility(0);
            getLabelTextView().setText(charSequence);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLabelTextView().getLayoutParams();
            layoutParams.height = -2;
            getLabelTextView().setLayoutParams(layoutParams);
        } else if (this.m) {
            getLabelTextView().setVisibility(4);
            getLabelTextView().setText("");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getLabelTextView().getLayoutParams();
            layoutParams2.height = getDefaults().a(getContext());
            getLabelTextView().setLayoutParams(layoutParams2);
        } else {
            getLabelTextView().setVisibility(8);
        }
        if (charSequence.length() > 0) {
            f4m.i(getLabelTextView(), this.n ? getContext().getString(R.string.ds_internal_vk_form_required_field_talkback, this.r) : this.r);
        }
    }

    public final CharSequence getActiveInputButtonContentDescription() {
        return this.x;
    }

    public final Drawable getActiveInputIconDrawable() {
        return this.w;
    }

    public final CharSequence getAfterIconButtonContentDescription() {
        return this.z;
    }

    public final Drawable getAfterIconButtonDrawable() {
        return this.y;
    }

    public final CharSequence getAfterText() {
        return this.t;
    }

    public final CharSequence getCaption() {
        return this.s;
    }

    public final CharSequence getError() {
        return this.u;
    }

    public final CharSequence getLabel() {
        return this.r;
    }

    public final wzs<VkFormField, View, Boolean> getShowActiveInputIconCondition() {
        return this.B;
    }

    public final CharSequence getValid() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.o) {
            View.mergeDrawableStates(onCreateDrawableState, getErrorState());
        }
        if (this.p) {
            View.mergeDrawableStates(onCreateDrawableState, getValidState());
        }
        return onCreateDrawableState;
    }

    public final void setActiveInputButtonContentDescription(CharSequence charSequence) {
        this.x = charSequence;
        getEndButton().setContentDescription(charSequence);
    }

    public final void setActiveInputIconDrawable(Drawable drawable) {
        this.w = drawable;
    }

    public final void setAfterIconButtonContentDescription(CharSequence charSequence) {
        this.z = charSequence;
        getAfterIconButton().setContentDescription(charSequence);
    }

    public final void setAfterIconButtonDrawable(Drawable drawable) {
        this.y = drawable;
        getAfterIconButton().setImageDrawable(drawable);
    }

    public final void setAfterIconButtonVisible(boolean z) {
        this.A = z;
        if (z) {
            getAfterIconButton().setVisibility(0);
            View view = this.j;
            if (view != null) {
                f4m.r(getDefaults().h(getContext()), view);
            }
            View view2 = this.j;
            if (view2 != null) {
                c(getDefaults().f(getContext()), view2);
                return;
            }
            return;
        }
        getAfterIconButton().setVisibility(8);
        View view3 = this.j;
        if (view3 != null) {
            f4m.r(0, view3);
        }
        View view4 = this.j;
        if (view4 != null) {
            c(getDefaults().f(getContext()), view4);
        }
    }

    public final void setAfterText(CharSequence charSequence) {
        this.t = charSequence;
        d();
    }

    public final void setCaption(CharSequence charSequence) {
        this.s = charSequence;
        e();
    }

    public final void setDisabled(boolean z) {
        if (this.q == z) {
            return;
        }
        if (z && this.o) {
            setError(false);
        }
        if (z && this.p) {
            setValid(false);
        }
        this.q = z;
        refreshDrawableState();
        f();
        View view = this.j;
        if (view != null) {
            view.setEnabled(!this.q);
        }
        View view2 = this.j;
        if (view2 != null) {
            view2.setAlpha(!this.q ? 1.0f : 0.64f);
        }
        getEndButton().setEnabled(!this.q);
        getEndButton().setAlpha(this.q ? 0.64f : 1.0f);
    }

    public final void setError(boolean z) {
        if (this.o == z || this.q) {
            return;
        }
        this.o = z;
        if (z && this.p) {
            setValid(false);
        }
        e();
        refreshDrawableState();
        f();
        KeyEvent.Callback callback = this.j;
        if (callback instanceof fxp) {
            ((fxp) callback).setError(z);
        }
    }

    public final void setInHorizontalGroup(boolean z) {
        this.m = z;
        g();
    }

    public final void setLabel(CharSequence charSequence) {
        this.r = charSequence;
        g();
    }

    public final void setOnActiveEndButtonClickListener(izs<? super View, s3q0> izsVar) {
        getEndButton().setOnClickListener(new c98(izsVar, 15));
    }

    public final void setOnAfterIconButtonClickListener(izs<? super View, s3q0> izsVar) {
        getAfterIconButton().setOnClickListener(new en9(izsVar, 12));
    }

    public final void setRequired(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        g();
    }

    public final void setShowActiveInputIconCondition(wzs<? super VkFormField, ? super View, Boolean> wzsVar) {
        this.B = wzsVar;
    }

    public final void setValid(boolean z) {
        if (this.p == z || this.q) {
            return;
        }
        if (z && this.o) {
            setError(false);
        }
        this.p = z;
        e();
        refreshDrawableState();
        f();
        KeyEvent.Callback callback = this.j;
        if (callback instanceof jir0) {
            ((jir0) callback).setValid(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkFormField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.c = new bpn0(new w2a0(16));
        this.d = new bpn0(new xbj0(7));
        sgt0 sgt0Var = new sgt0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, sgt0Var);
        this.f = msy.a(lazyThreadSafetyMode, new hri0(this, 19));
        this.g = msy.a(lazyThreadSafetyMode, new mll0(this, 18));
        this.h = msy.a(lazyThreadSafetyMode, new fem0(this, 12));
        this.i = msy.a(lazyThreadSafetyMode, new m0t0(this, 3));
        this.k = msy.a(lazyThreadSafetyMode, new wrl0(this, 23));
        this.l = msy.a(lazyThreadSafetyMode, new pvh0(this, 20));
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.x = "";
        this.z = "";
        this.B = new lq2(this);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_view_form_item, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.p);
        setRequired(obtainStyledAttributes.getBoolean(4, this.n));
        CharSequence string = obtainStyledAttributes.getString(5);
        setLabel(string == null ? this.r : string);
        CharSequence string2 = obtainStyledAttributes.getString(2);
        setAfterText(string2 == null ? this.t : string2);
        CharSequence string3 = obtainStyledAttributes.getString(3);
        setCaption(string3 == null ? this.s : string3);
        this.w = obtainStyledAttributes.getDrawable(0);
        String string4 = obtainStyledAttributes.getString(1);
        setActiveInputButtonContentDescription(string4 != null ? string4 : "");
        obtainStyledAttributes.recycle();
    }

    public final void setError(CharSequence charSequence) {
        this.u = charSequence;
        e();
    }

    public final void setValid(CharSequence charSequence) {
        this.v = charSequence;
        e();
    }

    private static /* synthetic */ void getDefaults$annotations() {
    }
}
