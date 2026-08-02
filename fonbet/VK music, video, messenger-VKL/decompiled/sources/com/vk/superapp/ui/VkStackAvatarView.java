package com.vk.superapp.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.superapp.ui.VkStackAvatarView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.bdu0;
import xsna.dgn;
import xsna.e43;
import xsna.i5g;
import xsna.iah0;
import xsna.krv0;
import xsna.olv0;
import xsna.rli0;
import xsna.s3q0;
import xsna.tqm0;
import xsna.wzs;

/* compiled from: VkStackAvatarView.kt */
/* loaded from: classes6.dex */
public class VkStackAvatarView<A> extends ViewGroup {
    public static final /* synthetic */ int x = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public float k;
    public float l;
    public int m;
    public float n;
    public int o;
    public int p;
    public FontFamily q;
    public boolean r;
    public int s;
    public int t;
    public final LinkedList u;
    public VkImage v;
    public boolean w;

    public VkStackAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final Drawable getTextViewBackground() {
        ShapeDrawable shapeDrawable;
        if (this.j) {
            int i = this.o;
            shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(i);
            shapeDrawable.setIntrinsicWidth(-1);
            shapeDrawable.setIntrinsicHeight(-1);
        } else {
            float[] fArr = new float[8];
            Arrays.fill(fArr, iah0.b(this.l));
            int i2 = this.o;
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable2.getPaint().setColor(i2);
            shapeDrawable2.setIntrinsicWidth(-1);
            shapeDrawable2.setIntrinsicHeight(-1);
            shapeDrawable = shapeDrawable2;
        }
        if (this.r) {
            shapeDrawable.setAlpha((int) (this.n * 255));
        }
        return shapeDrawable;
    }

    private final FrameLayout getTextViewContainer() {
        int i = this.r ? 0 : this.e;
        if (this.j) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(i);
            shapeDrawable.setIntrinsicWidth(-1);
            shapeDrawable.setIntrinsicHeight(-1);
            frameLayout.setBackground(shapeDrawable);
            b(frameLayout);
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        float[] fArr = new float[8];
        Arrays.fill(fArr, iah0.b(this.l));
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(i);
        shapeDrawable2.setIntrinsicWidth(-1);
        shapeDrawable2.setIntrinsicHeight(-1);
        frameLayout2.setBackground(shapeDrawable2);
        b(frameLayout2);
        return frameLayout2;
    }

    private final void setBorderLayer(View view) {
        if (this.j) {
            view.setBackgroundResource(R.drawable.vk_circle_border);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.e);
        gradientDrawable.setCornerRadius(iah0.a(this.l) + this.d);
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.mutate();
        view.setBackground(gradientDrawable);
    }

    @SuppressLint({"SetTextI18n"})
    public final void a(int i) {
        String valueOf;
        if (!this.h || i <= 0) {
            return;
        }
        bdu0 bdu0Var = new bdu0(getContext(), null, 0);
        bdu0Var.b = (int) iah0.y(12);
        bdu0Var.c = (int) iah0.y(16);
        bdu0Var.setSingleLine(true);
        bdu0Var.setMaxLines(1);
        FrameLayout textViewContainer = getTextViewContainer();
        textViewContainer.addView(bdu0Var);
        int i2 = this.b;
        addView(textViewContainer, new ViewGroup.LayoutParams(i2, i2));
        bdu0Var.setBackground(getTextViewBackground());
        bdu0Var.setGravity(17);
        com.vk.typography.b.k(bdu0Var, this.q, null, 6);
        int i3 = this.s;
        int i4 = this.t;
        bdu0Var.b = i3;
        bdu0Var.c = i4;
        StringBuilder sb = new StringBuilder("+");
        DecimalFormat decimalFormat = tqm0.a;
        if (i >= 1000000) {
            valueOf = decimalFormat.format(i / 1000000.0f) + 'M';
        } else if (i >= 1000) {
            valueOf = decimalFormat.format(i / 1000.0f) + 'K';
        } else {
            valueOf = String.valueOf(i);
        }
        sb.append(valueOf);
        bdu0Var.setText(sb.toString());
        bdu0Var.setTextColor(this.p);
    }

    public final void b(View view) {
        view.getBackground().setTint(this.e);
        int i = this.d;
        view.setPadding(i, i, i, i);
    }

    public final void c(List<? extends Pair<String, ? extends A>> list, int i, final wzs<? super Integer, ? super A, s3q0> wzsVar) {
        VkImage vkImage = this.v;
        LinkedList linkedList = this.u;
        if (vkImage != null) {
            removeView(vkImage);
            linkedList.offer(vkImage);
        }
        removeAllViews();
        this.w = (list.size() > this.i || i > 0) && this.r;
        int size = list.size();
        int i2 = this.i;
        if ((size > i2 || i > 0) && !this.w) {
            i2--;
        }
        final int i3 = 0;
        for (Object obj : rli0.y(new i5g(list), i2)) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            Pair pair = (Pair) obj;
            String str = (String) pair.d();
            final Object g = pair.g();
            if (this.r && i3 == e43.h(list) && this.w) {
                a(i);
            }
            VkImage vkImage2 = (VkImage) linkedList.poll();
            if (vkImage2 == null) {
                vkImage2 = new VkImage(getContext(), null, 6, 0);
                setBorderLayer(vkImage2);
            }
            int i5 = this.b;
            addView(vkImage2, new ViewGroup.LayoutParams(i5, i5));
            b(vkImage2);
            if (this.j) {
                float f = this.k;
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    vkImage2.setElevation(f);
                    vkImage2.setOutlineProvider(new olv0());
                    setClipToPadding(false);
                    vkImage2.setClipToOutline(false);
                }
            }
            vkImage2.setPlaceholderImage(this.j ? R.drawable.vk_circle_placeholder : R.drawable.vk_default_placeholder_8);
            vkImage2.setCornerRadius(this.l);
            vkImage2.y0(this.m, krv0.m(R.attr.vk_ui_image_border_alpha, vkImage2.getContext()));
            vkImage2.setRound(this.j);
            vkImage2.o0(str, null);
            if (wzsVar != null && g != null) {
                vkImage2.setOnClickListener(new View.OnClickListener() { // from class: xsna.nlv0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = VkStackAvatarView.x;
                        wzs.this.invoke(Integer.valueOf(i3), g);
                    }
                });
            }
            this.v = vkImage2;
            i3 = i4;
        }
        if (this.r) {
            return;
        }
        a(i);
    }

    public final void d() {
        requestLayout();
        invalidate();
    }

    public final void e() {
        for (int i = 0; i < getChildCount(); i++) {
            b(getChildAt(i));
        }
    }

    public final float getAvatarElevation() {
        return this.k;
    }

    public final int getBorderWidth() {
        return this.m;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return this.g ? (i - i2) - 1 : i2;
    }

    public final FontFamily getCounterFontFamily() {
        return this.q;
    }

    public final boolean getCounterOverlayEnabled() {
        return this.r;
    }

    public final int getCounterOverlayTint() {
        return this.o;
    }

    public final int getCounterTextColor() {
        return this.p;
    }

    public final int getExtraColor() {
        return this.f;
    }

    public final int getIconSize() {
        return this.b;
    }

    public final int getImageLimit() {
        return this.i;
    }

    public final int getMaxCountTextSize() {
        return this.t;
    }

    public final int getMinCountTextSize() {
        return this.s;
    }

    public final int getOffset() {
        return this.c;
    }

    public final float getOverlayAlpha() {
        return this.n;
    }

    public final boolean getReverseDrawingOrder() {
        return this.g;
    }

    public final float getRounding() {
        return this.l;
    }

    public final int getStrokeColor() {
        return this.e;
    }

    public final int getStrokeWidth() {
        return this.d;
    }

    public final boolean getUseExtraView() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            int i6 = ref$IntRef.element;
            dgn.b(childAt, paddingTop, i6, paddingTop, childAt.getMeasuredWidth() + i6);
            if (!this.w || i5 != this.i - 1) {
                ref$IntRef.element = childAt.getRight() + this.c;
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = (this.d * 2) + this.b;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(makeMeasureSpec, makeMeasureSpec);
        }
        int childCount = this.w ? getChildCount() - 1 : getChildCount();
        setMeasuredDimension((Math.max(0, childCount - 1) * this.c) + (i3 * childCount) + paddingRight, paddingBottom + i3);
    }

    public final void setAvatarElevation(float f) {
        this.k = f;
        d();
    }

    public final void setBorderWidth(int i) {
        this.m = i;
        d();
    }

    public final void setCircle(boolean z) {
        this.j = z;
        d();
    }

    public final void setCounterFontFamily(FontFamily fontFamily) {
        this.q = fontFamily;
        e();
    }

    public final void setCounterOverlayEnabled(boolean z) {
        this.r = z;
        d();
    }

    public final void setCounterOverlayTint(int i) {
        this.o = i;
        e();
    }

    public final void setCounterOverlayTintRes(int i) {
        setCounterOverlayTint(getContext().getColor(i));
    }

    public final void setCounterTextColor(int i) {
        this.p = i;
        e();
    }

    public final void setCounterTextColorRes(int i) {
        setCounterTextColor(getContext().getColor(i));
    }

    public final void setExtraColor(int i) {
        this.f = i;
        e();
    }

    public final void setIconSize(int i) {
        this.b = i;
        d();
    }

    public final void setImageLimit(int i) {
        this.i = i;
        d();
    }

    public final void setMaxCountTextSize(int i) {
        this.t = i;
        d();
    }

    public final void setMinCountTextSize(int i) {
        this.s = i;
        d();
    }

    public final void setOffset(int i) {
        this.c = i;
        d();
    }

    public final void setOverlayAlpha(float f) {
        this.n = f;
        d();
    }

    public final void setReverseDrawingOrder(boolean z) {
        this.g = z;
        d();
    }

    public final void setRounding(float f) {
        this.l = f;
        d();
    }

    public final void setStrokeColor(int i) {
        this.e = i;
        e();
    }

    public final void setStrokeWidth(int i) {
        this.d = i;
        e();
    }

    public final void setUseExtraView(boolean z) {
        this.h = z;
        d();
    }

    public VkStackAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = iah0.a(24);
        this.c = -iah0.a(6);
        this.d = iah0.a(2);
        this.e = krv0.m(R.attr.vk_ui_field_background, getContext());
        this.f = krv0.m(R.attr.vk_ui_icon_secondary, getContext());
        this.g = true;
        this.h = true;
        this.i = 3;
        this.j = true;
        this.n = 1.0f;
        this.o = krv0.m(R.attr.vk_ui_icon_secondary, getContext());
        this.p = krv0.m(R.attr.vk_ui_field_background, getContext());
        this.q = FontFamily.MEDIUM;
        this.s = (int) iah0.y(8);
        this.t = (int) iah0.y(12);
        this.u = new LinkedList();
        setChildrenDrawingOrderEnabled(true);
        setClipToPadding(false);
        setClipChildren(false);
    }
}
