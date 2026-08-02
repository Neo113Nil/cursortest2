package com.vk.core.tool.view.onboarding.highlighter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMode;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboarding.components.R$styleable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.an10;
import xsna.bpn0;
import xsna.e8v0;
import xsna.gzs;
import xsna.im30;
import xsna.kbe;
import xsna.krv0;
import xsna.mo00;
import xsna.no00;
import xsna.pis0;
import xsna.s3q0;
import xsna.u69;
import xsna.u7v0;
import xsna.v5n0;
import xsna.v5v;
import xsna.v7v0;
import xsna.xo8;

/* compiled from: VkOnboardingHighlighter.kt */
/* loaded from: classes17.dex */
public final class VkOnboardingHighlighter extends FrameLayout {
    public static final /* synthetic */ int m = 0;
    public boolean b;
    public int c;
    public int d;
    public VkOnboarding$HighlighterMarkerType e;
    public VkOnboarding$HighlighterMode f;
    public VkOnboarding$TintColor g;
    public Integer h;
    public VkOnboardingStat$Delegate i;
    public no00 j;
    public v5v k;
    public final bpn0 l;

    public VkOnboardingHighlighter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s3q0 a(VkOnboardingHighlighter vkOnboardingHighlighter, boolean z, Long l, gzs gzsVar) {
        Rect rect;
        no00 no00Var;
        no00 no00Var2;
        no00 no00Var3;
        View view = vkOnboardingHighlighter.j;
        if (view != null) {
            vkOnboardingHighlighter.removeView(view);
        }
        v5v v5vVar = vkOnboardingHighlighter.k;
        if (v5vVar != null) {
            int i = no00.f;
            TextView textView = vkOnboardingHighlighter.getTextView();
            Pair<Integer, Integer> pair = v5vVar.b;
            VkOnboarding$HighlighterMode vkOnboarding$HighlighterMode = vkOnboardingHighlighter.f;
            VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType = vkOnboardingHighlighter.e;
            VkOnboarding$TintColor vkOnboarding$TintColor = vkOnboardingHighlighter.g;
            int i2 = vkOnboardingHighlighter.d;
            int i3 = vkOnboardingHighlighter.c;
            int i4 = mo00.$EnumSwitchMapping$0[vkOnboarding$HighlighterMode.ordinal()];
            if (i4 == 1) {
                int lineHeight = textView.getLineHeight();
                Layout layout = textView.getLayout();
                if (layout != null) {
                    int intValue = pair.d().intValue();
                    int intValue2 = pair.g().intValue();
                    int lineForOffset = layout.getLineForOffset(intValue);
                    if (lineForOffset == layout.getLineForOffset(intValue2)) {
                        int b = an10.b(layout.getPrimaryHorizontal(intValue));
                        int b2 = an10.b(layout.getPrimaryHorizontal(intValue2));
                        double lineBaseline = layout.getLineBaseline(lineForOffset);
                        double d = lineHeight;
                        rect = new Rect(b, an10.a(lineBaseline - (0.7d * d)), b2, an10.a((d * 0.3d) + lineBaseline));
                        if (rect != null) {
                        }
                        if (no00Var == null) {
                        }
                        vkOnboardingHighlighter.j = no00Var3;
                    }
                }
                rect = null;
                if (rect != null) {
                }
                if (no00Var == null) {
                }
                vkOnboardingHighlighter.j = no00Var3;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Layout layout2 = textView.getLayout();
                if (layout2 != null) {
                    rect = new Rect(0, 0, layout2.getWidth(), layout2.getHeight());
                    if (rect != null) {
                        no00Var = null;
                        no00Var2 = null;
                    } else {
                        int width = (i2 * 2) + rect.width();
                        int height = (i3 * 2) + rect.height();
                        no00Var2 = null;
                        no00Var = new no00(textView.getContext(), null, 0);
                        no00Var.b = VkOnboarding$HighlighterMarkerType.Type4;
                        no00Var.c = VkOnboarding$HighlighterMode.Token;
                        no00Var.d = VkOnboarding$TintColor.Lime;
                        no00Var.setLayoutParams(new FrameLayout.LayoutParams(width, height));
                        no00Var.setTranslationX((rect.left + textView.getPaddingStart()) - i2);
                        no00Var.setTranslationY((textView.getY() + rect.top) - i3);
                        no00Var.setScaleType(ImageView.ScaleType.FIT_XY);
                        if (z) {
                            no00Var.setClipBounds(new Rect(0, 0, 0, height));
                        } else {
                            no00Var.e = true;
                        }
                        no00Var.setType(vkOnboarding$HighlighterMarkerType);
                        no00Var.setColor(vkOnboarding$TintColor);
                        no00Var.V();
                    }
                    if (no00Var == null) {
                        int i5 = 9;
                        if (z) {
                            no00Var.getViewTreeObserver().addOnGlobalLayoutListener(new v7v0(no00Var, new xo8(no00Var, l, gzsVar, i5)));
                        } else if (l != null) {
                            vkOnboardingHighlighter.postDelayed(new u69(i5, vkOnboardingHighlighter, no00Var), l.longValue());
                        }
                        if (!z && gzsVar != null) {
                            gzsVar.invoke();
                        }
                        vkOnboardingHighlighter.addView(no00Var, 0);
                        vkOnboardingHighlighter.g(true);
                        VkOnboardingStat$Delegate vkOnboardingStat$Delegate = vkOnboardingHighlighter.i;
                        if (vkOnboardingStat$Delegate != null) {
                            vkOnboardingStat$Delegate.d4(e8v0.m.b);
                        }
                        no00Var3 = no00Var;
                    } else {
                        no00Var3 = no00Var2;
                    }
                    vkOnboardingHighlighter.j = no00Var3;
                }
                rect = null;
                if (rect != null) {
                }
                if (no00Var == null) {
                }
                vkOnboardingHighlighter.j = no00Var3;
            }
        }
        return s3q0.a;
    }

    public static s3q0 b(VkOnboardingHighlighter vkOnboardingHighlighter) {
        if (vkOnboardingHighlighter.b) {
            TextView textView = vkOnboardingHighlighter.getTextView();
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new v7v0(textView, new pis0(vkOnboardingHighlighter, 13)));
        }
        vkOnboardingHighlighter.f();
        return s3q0.a;
    }

    public static /* synthetic */ void e(VkOnboardingHighlighter vkOnboardingHighlighter, boolean z, Long l, boolean z2, kbe kbeVar, int i) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            kbeVar = null;
        }
        vkOnboardingHighlighter.d(z, l, z2, kbeVar);
    }

    private final TextView getTextView() {
        return (TextView) this.l.getValue();
    }

    public final void c(boolean z) {
        if (z) {
            no00 no00Var = this.j;
            if (no00Var != null) {
                no00Var.U();
            }
        } else {
            no00 no00Var2 = this.j;
            if (no00Var2 != null) {
                removeView(no00Var2);
            }
        }
        g(false);
    }

    public final void d(boolean z, Long l, boolean z2, gzs<s3q0> gzsVar) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = getTextView().getHeight();
        } else {
            layoutParams = null;
        }
        setLayoutParams(layoutParams);
        if (z2) {
            f();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new v7v0(this, new im30(this, z, l, gzsVar)));
    }

    public final void f() {
        bpn0 bpn0Var = v5v.c;
        v5v a = v5v.a.a(getTextView().getText().toString());
        Pair<Integer, Integer> pair = a.b;
        v5v v5vVar = null;
        if (pair.i().intValue() == -1 || pair.j().intValue() == -1) {
            a = null;
        }
        if (a != null) {
            getTextView().setText(a.a);
            v5vVar = a;
        }
        this.k = v5vVar;
    }

    public final void g(boolean z) {
        if (!z) {
            v5v v5vVar = this.k;
            if (v5vVar != null) {
                getTextView().setText(v5vVar.a);
                return;
            }
            return;
        }
        Integer num = this.h;
        v5v v5vVar2 = this.k;
        if (num == null || v5vVar2 == null) {
            return;
        }
        Pair<Integer, Integer> pair = v5vVar2.b;
        TextView textView = getTextView();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getTextView().getText());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), pair.i().intValue(), pair.j().intValue(), 33);
        textView.setText(spannableStringBuilder);
    }

    public final boolean getAutoHighlight() {
        return this.b;
    }

    public final int getHighlightHorizontalPadding() {
        return this.d;
    }

    public final int getHighlightVerticalPadding() {
        return this.c;
    }

    public final Integer getHighlightedTextColor() {
        return this.h;
    }

    public final VkOnboarding$TintColor getHighlighterColor() {
        return this.g;
    }

    public final VkOnboarding$HighlighterMode getHighlighterMode() {
        return this.f;
    }

    public final VkOnboarding$HighlighterMarkerType getHighlighterType() {
        return this.e;
    }

    public final VkOnboardingStat$Delegate getStatDelegate() {
        return this.i;
    }

    public final CharSequence getText() {
        return getTextView().getText();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = getTextView();
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        no00 no00Var = this.j;
        if (no00Var != null) {
            no00Var.layout(0, 0, no00Var.getLayoutParams().width, no00Var.getLayoutParams().height);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.resolveSizeAndState(getTextView().getMeasuredWidth(), i, 0), View.resolveSizeAndState(getTextView().getMeasuredHeight(), i2, 0));
    }

    public final void setAutoHighlight(boolean z) {
        this.b = z;
    }

    public final void setHighlightHorizontalPadding(int i) {
        this.d = i;
    }

    public final void setHighlightVerticalPadding(int i) {
        this.c = i;
    }

    public final void setHighlightedTextColor(Integer num) {
        this.h = num;
    }

    public final void setHighlighterColor(VkOnboarding$TintColor vkOnboarding$TintColor) {
        this.g = vkOnboarding$TintColor;
        no00 no00Var = this.j;
        if (no00Var != null) {
            no00Var.setColor(vkOnboarding$TintColor);
        }
    }

    public final void setHighlighterMode(VkOnboarding$HighlighterMode vkOnboarding$HighlighterMode) {
        this.f = vkOnboarding$HighlighterMode;
        no00 no00Var = this.j;
        if (no00Var != null) {
            no00Var.setMode(vkOnboarding$HighlighterMode);
        }
    }

    public final void setHighlighterType(VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType) {
        this.e = vkOnboarding$HighlighterMarkerType;
        no00 no00Var = this.j;
        if (no00Var != null) {
            no00Var.setType(vkOnboarding$HighlighterMarkerType);
        }
    }

    public final void setStatDelegate(VkOnboardingStat$Delegate vkOnboardingStat$Delegate) {
        this.i = vkOnboardingStat$Delegate;
    }

    public final void setText(CharSequence charSequence) {
        getTextView().setText(charSequence);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkOnboardingHighlighter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.b = true;
        this.c = 15;
        this.d = 20;
        VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType = VkOnboarding$HighlighterMarkerType.Type4;
        this.e = vkOnboarding$HighlighterMarkerType;
        this.f = VkOnboarding$HighlighterMode.Token;
        VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Lime;
        this.g = vkOnboarding$TintColor;
        this.l = new bpn0(new v5n0(this, 22));
        setClipChildren(false);
        setClipToPadding(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
        try {
            this.b = obtainStyledAttributes.getBoolean(0, true);
            this.c = obtainStyledAttributes.getInt(1, 15);
            int i2 = obtainStyledAttributes.getInt(4, 0);
            if (i2 == 1) {
                vkOnboarding$HighlighterMarkerType = VkOnboarding$HighlighterMarkerType.Type2;
            } else if (i2 == 2) {
                vkOnboarding$HighlighterMarkerType = VkOnboarding$HighlighterMarkerType.Type3;
            } else if (i2 != 3) {
                vkOnboarding$HighlighterMarkerType = VkOnboarding$HighlighterMarkerType.Type1;
            }
            setHighlighterType(vkOnboarding$HighlighterMarkerType);
            int i3 = obtainStyledAttributes.getInt(3, 0);
            if (i3 == 1) {
                vkOnboarding$TintColor = VkOnboarding$TintColor.Cyan;
            } else if (i3 == 2) {
                vkOnboarding$TintColor = VkOnboarding$TintColor.Azure;
            } else if (i3 == 3) {
                vkOnboarding$TintColor = VkOnboarding$TintColor.Pink;
            }
            setHighlighterColor(vkOnboarding$TintColor);
            if (obtainStyledAttributes.hasValue(2)) {
                this.h = Integer.valueOf(krv0.m(obtainStyledAttributes.getInt(2, 0), context));
            }
            obtainStyledAttributes.recycle();
            getViewTreeObserver().addOnGlobalLayoutListener(new v7v0(this, new u7v0(this, 0)));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
