package com.vk.im.ui.views.msg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.im.ImageList;
import com.vk.superapp.ui.FixTextView;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import xsna.am;
import xsna.baf0;
import xsna.e3m;
import xsna.his0;
import xsna.hk;
import xsna.hux0;
import xsna.iah0;
import xsna.iut0;
import xsna.lhg;
import xsna.lr;
import xsna.ot30;
import xsna.pt30;
import xsna.qt30;
import xsna.sd;
import xsna.sjo;
import xsna.tr;

/* loaded from: classes2.dex */
public class MsgPartSnippetView extends ViewGroup implements hux0 {
    public static final /* synthetic */ int w = 0;
    public FrescoImageView b;
    public FixTextView c;
    public FixTextView d;
    public FixTextView e;
    public FixTextView f;
    public FixTextView g;
    public View h;
    public FixTextView i;
    public FixTextView j;
    public FixTextView k;
    public FixTextView l;
    public TimeAndStatusView m;
    public ImageView n;
    public int o;
    public int p;
    public Rect q;
    public int r;
    public int s;
    public final Handler t;
    public final ArrayList u;
    public final Runnable v;

    public static class a extends hk {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            amVar.r(this.b);
        }
    }

    public MsgPartSnippetView(Context context) {
        super(context);
        this.t = new Handler(Looper.getMainLooper());
        this.u = new ArrayList();
        this.v = new sd(this, 10);
        e(context, null, 0, 0);
    }

    public static void a(MsgPartSnippetView msgPartSnippetView) {
        iut0.q(msgPartSnippetView, new a(TextUtils.join(", ", (List) msgPartSnippetView.u.stream().map(new ot30()).filter(new pt30(0)).collect(Collectors.toList()))));
    }

    public static ViewGroup.MarginLayoutParams b() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public static int c(int i, int i2, int i3, int i4) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        return (mode == 1073741824 || mode == Integer.MIN_VALUE) ? size < i2 ? Math.max(0, i2 - i4) : size > i3 ? Math.max(0, i3 - i4) : Math.max(0, size - i4) : Math.max(0, i3 - i4);
    }

    public static int d(int i, int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (size < i2 || size < i4) ? size : Math.max(i2, Math.min(i4, i3));
        }
        if (mode == 0) {
            return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
    }

    public static int f(int i) {
        return tr.a(i, 1073741823, 0, Integer.MIN_VALUE);
    }

    public static int g(int i) {
        return tr.a(i, 1073741823, 0, 1073741824);
    }

    private void setMiddotText(CharSequence charSequence) {
        this.g.setText(charSequence);
        this.g.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // xsna.hux0
    public final void X3() {
        requestLayout();
        invalidate();
    }

    public final void e(Context context, AttributeSet attributeSet, int i, int i2) {
        FrescoImageView frescoImageView = new FrescoImageView(context, null, 6, 0);
        this.b = frescoImageView;
        frescoImageView.setLayoutParams(b());
        this.b.setScaleType(ScaleType.CENTER_CROP);
        this.b.setImportantForAccessibility(2);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setLayoutParams(b());
        this.n.setImportantForAccessibility(2);
        FixTextView fixTextView = new FixTextView(context);
        this.c = fixTextView;
        fixTextView.setLayoutParams(b());
        FixTextView fixTextView2 = this.c;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fixTextView2.setEllipsize(truncateAt);
        this.c.setLineSpacing((int) iah0.y(r8), 1.0f);
        FixTextView fixTextView3 = new FixTextView(context);
        this.d = fixTextView3;
        fixTextView3.setLayoutParams(b());
        this.d.setEllipsize(truncateAt);
        this.d.setImportantForAccessibility(2);
        FixTextView fixTextView4 = new FixTextView(context);
        this.e = fixTextView4;
        fixTextView4.setLayoutParams(b());
        this.e.setGravity(16);
        this.e.setIncludeFontPadding(false);
        this.e.setLines(1);
        this.e.setEllipsize(truncateAt);
        this.e.setImportantForAccessibility(2);
        this.e.setCompoundDrawablePadding(iah0.a(1));
        his0.t(this.e, R.drawable.vk_icon_favorite_12, R.color.vk_gray_300);
        FixTextView fixTextView5 = new FixTextView(context);
        this.f = fixTextView5;
        fixTextView5.setLayoutParams(b());
        this.f.setGravity(16);
        this.f.setIncludeFontPadding(false);
        this.f.setLines(1);
        this.f.setEllipsize(truncateAt);
        this.f.setImportantForAccessibility(2);
        FixTextView fixTextView6 = new FixTextView(context);
        this.g = fixTextView6;
        fixTextView6.setLayoutParams(b());
        this.g.setGravity(16);
        this.g.setIncludeFontPadding(false);
        this.g.setLines(1);
        this.g.setImportantForAccessibility(2);
        View view = new View(context);
        this.h = view;
        view.setLayoutParams(b());
        FixTextView fixTextView7 = new FixTextView(context);
        this.i = fixTextView7;
        fixTextView7.setLayoutParams(b());
        this.i.setLines(1);
        this.i.setEllipsize(truncateAt);
        this.i.setImportantForAccessibility(2);
        FixTextView fixTextView8 = new FixTextView(context);
        this.j = fixTextView8;
        fixTextView8.setLayoutParams(b());
        this.j.setLines(1);
        this.j.setEllipsize(truncateAt);
        this.j.setImportantForAccessibility(2);
        this.j.setPaintFlags(17);
        FixTextView fixTextView9 = new FixTextView(context);
        this.k = fixTextView9;
        fixTextView9.setLayoutParams(b());
        this.k.setLines(1);
        this.k.setEllipsize(truncateAt);
        this.k.setImportantForAccessibility(2);
        this.k.setIncludeFontPadding(false);
        FixTextView fixTextView10 = new FixTextView(context);
        this.l = fixTextView10;
        fixTextView10.setLayoutParams(b());
        this.l.setLines(1);
        this.l.setEllipsize(truncateAt);
        this.l.setCompoundDrawablePadding(iah0.a(6));
        TimeAndStatusView timeAndStatusView = new TimeAndStatusView(context);
        this.m = timeAndStatusView;
        timeAndStatusView.setLayoutParams(b());
        this.m.setImportantForAccessibility(2);
        this.q = new Rect();
        addView(this.b);
        addView(this.n);
        addView(this.c);
        addView(this.d);
        addView(this.e);
        addView(this.f);
        addView(this.g);
        addView(this.h);
        addView(this.i);
        addView(this.j);
        addView(this.k);
        addView(this.l);
        addView(this.m);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.s, i, i2);
        setMaximumWidth(obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE));
        setImageMinWidth(obtainStyledAttributes.getDimensionPixelSize(29, 0));
        setImageMaxWidth(obtainStyledAttributes.getDimensionPixelSize(27, Integer.MAX_VALUE));
        setImageMinHeight(obtainStyledAttributes.getDimensionPixelSize(28, 0));
        setImageMaxHeight(obtainStyledAttributes.getDimensionPixelSize(26, Integer.MAX_VALUE));
        setImageWidth(obtainStyledAttributes.getDimensionPixelSize(31, -1));
        setImageHeight(obtainStyledAttributes.getDimensionPixelSize(25, -1));
        setImageCornerRadius(obtainStyledAttributes.getDimensionPixelSize(24, 0));
        setImagePlaceholder(obtainStyledAttributes.getDrawable(30));
        setContentPaddingLeft(obtainStyledAttributes.getDimensionPixelSize(16, 0));
        setContentPaddingTop(obtainStyledAttributes.getDimensionPixelSize(18, 0));
        setContentPaddingRight(obtainStyledAttributes.getDimensionPixelSize(17, 0));
        setContentPaddingBottom(obtainStyledAttributes.getDimensionPixelSize(15, 0));
        j(1, obtainStyledAttributes.getString(63));
        setTitleTextColor(obtainStyledAttributes.getColor(64, -16777216));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(65, 12);
        String string = obtainStyledAttributes.getString(62);
        obtainStyledAttributes.getInteger(66, 0);
        TextSizeUnit textSizeUnit = TextSizeUnit.PX;
        setTitleTitleFont(a.C1933a.b(context, string, dimensionPixelSize, textSizeUnit));
        i(1, obtainStyledAttributes.getString(20));
        setDescriptionTextColor(obtainStyledAttributes.getColor(21, -16777216));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(22, 12);
        obtainStyledAttributes.getInteger(23, 0);
        b.i(this.d, obtainStyledAttributes.getString(19), Float.valueOf(dimensionPixelSize2), textSizeUnit);
        setRatingText(obtainStyledAttributes.getString(56));
        setRatingTextColor(obtainStyledAttributes.getColor(57, -16777216));
        setRatingHeight(obtainStyledAttributes.getDimensionPixelSize(55, -1));
        b.i(this.e, obtainStyledAttributes.getString(54), Float.valueOf(obtainStyledAttributes.getDimensionPixelSize(58, 12)), TextSizeUnit.SP);
        setOrdersCountText(obtainStyledAttributes.getString(46));
        setOrdersCountTextColor(obtainStyledAttributes.getColor(47, -16777216));
        setOrdersCountHeight(obtainStyledAttributes.getDimensionPixelSize(45, -1));
        b.i(this.f, obtainStyledAttributes.getString(44), Float.valueOf(obtainStyledAttributes.getDimensionPixelSize(48, 12)), textSizeUnit);
        setMiddotText(obtainStyledAttributes.getString(37));
        setMiddotTextColor(obtainStyledAttributes.getColor(38, -16777216));
        setMiddotHeight(obtainStyledAttributes.getDimensionPixelSize(36, -1));
        b.i(this.g, obtainStyledAttributes.getString(35), Float.valueOf(obtainStyledAttributes.getDimensionPixelSize(39, 12)), textSizeUnit);
        setMerchantLogoWidth(obtainStyledAttributes.getDimensionPixelSize(34, -1));
        setMerchantLogoHeight(obtainStyledAttributes.getDimensionPixelSize(33, -1));
        setMerchantLogoDrawable(obtainStyledAttributes.getDrawable(32));
        setPriceText(obtainStyledAttributes.getString(51));
        setPriceTextColor(obtainStyledAttributes.getColor(52, -16777216));
        setPriceSpaceWidth(obtainStyledAttributes.getDimensionPixelSize(50, 0));
        b.i(this.i, obtainStyledAttributes.getString(49), Float.valueOf(obtainStyledAttributes.getDimensionPixelSize(53, 12)), textSizeUnit);
        setOldPriceText(obtainStyledAttributes.getString(41));
        setOldPriceTextColor(obtainStyledAttributes.getColor(42, -16777216));
        b.i(this.j, obtainStyledAttributes.getString(40), Float.valueOf(obtainStyledAttributes.getDimensionPixelSize(43, 12)), textSizeUnit);
        setCaptionText(obtainStyledAttributes.getString(12));
        setCaptionTextColor(obtainStyledAttributes.getColor(13, -16777216));
        b.i(this.k, obtainStyledAttributes.getString(11), Float.valueOf(obtainStyledAttributes.getDimensionPixelSize(14, 12)), textSizeUnit);
        setButtonText(obtainStyledAttributes.getString(7));
        setButtonTextColor(obtainStyledAttributes.getColor(8, -16777216));
        setButtonTextSize(obtainStyledAttributes.getDimensionPixelSize(9, 12));
        setButtonFontFamily(obtainStyledAttributes.getString(4));
        setButtonBackground(obtainStyledAttributes.getDrawable(2));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
        marginLayoutParams.leftMargin = dimensionPixelSize3;
        marginLayoutParams.topMargin = dimensionPixelSize4;
        marginLayoutParams.rightMargin = dimensionPixelSize5;
        marginLayoutParams.bottomMargin = dimensionPixelSize6;
        this.l.setLayoutParams(marginLayoutParams);
        setTimeTextAppearance(obtainStyledAttributes.getResourceId(61, 0));
        setTimeMargin(obtainStyledAttributes.getDimensionPixelSize(59, 0));
        obtainStyledAttributes.recycle();
        TextView[] textViewArr = {this.c, this.d, this.e, this.f, this.g, this.i, this.j, this.k, this.l};
        ArrayList arrayList = this.u;
        Collections.addAll(arrayList, textViewArr);
        qt30 qt30Var = new qt30(this);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).addTextChangedListener(qt30Var);
        }
    }

    public int getMaximumHeight() {
        return this.p;
    }

    public int getMaximumWidth() {
        return this.o;
    }

    @Override // xsna.hux0
    @NonNull
    public TimeAndStatusView getTimeAndStatusView() {
        return this.m;
    }

    public final void h(@Nullable Drawable drawable) {
        ColorStateList textColors = this.l.getTextColors();
        if (textColors != null && drawable != null) {
            drawable = new baf0(drawable, textColors);
        }
        this.l.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void i(int i, String str) {
        this.d.setText(str);
        this.d.setMaxLines(i);
        this.d.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public final void j(int i, CharSequence charSequence) {
        this.c.setText(charSequence);
        this.c.setMaxLines(i);
        this.c.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void k() {
        setMiddotText(" · ");
    }

    public final void l(Drawable drawable) {
        if (drawable == null) {
            this.l.setBackground(null);
            return;
        }
        Drawable mutate = drawable.mutate();
        int currentTextColor = this.l.getCurrentTextColor();
        if (mutate instanceof GradientDrawable) {
            sjo.a(mutate, currentTextColor, e3m.d(R.attr.im_msg_part_button_outline_stroke_width, getContext()));
        } else {
            mutate.setTintMode(PorterDuff.Mode.SRC_IN);
            mutate.setTint(currentTextColor);
        }
        this.l.setBackground(mutate);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        FrescoImageView frescoImageView = this.b;
        frescoImageView.layout(paddingLeft, paddingTop, frescoImageView.getMeasuredWidth() + paddingLeft, this.b.getMeasuredHeight() + paddingTop);
        this.n.layout(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
        int right = this.b.getRight();
        Rect rect = this.q;
        int i5 = right + rect.left;
        int i6 = rect.top + paddingTop;
        int i7 = measuredWidth - rect.right;
        int i8 = measuredHeight - rect.bottom;
        if (this.c.getVisibility() != 8) {
            FixTextView fixTextView = this.c;
            fixTextView.layout(i5, i6, fixTextView.getMeasuredWidth() + i5, this.c.getMeasuredHeight() + i6);
            paddingTop = i6;
            i6 = this.c.getBottom();
            paddingLeft = i5;
        }
        if (this.d.getVisibility() != 8) {
            FixTextView fixTextView2 = this.d;
            fixTextView2.layout(i5, i6, fixTextView2.getMeasuredWidth() + i5, this.d.getMeasuredHeight() + i6);
            paddingTop = i6;
            i6 = this.d.getBottom();
            paddingLeft = i5;
        }
        boolean z2 = this.e.getVisibility() != 8;
        if (z2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            int i9 = marginLayoutParams.leftMargin + i5;
            int i10 = i6 + marginLayoutParams.topMargin;
            FixTextView fixTextView3 = this.e;
            fixTextView3.layout(i9, i10, fixTextView3.getMeasuredWidth() + i9, this.e.getMeasuredHeight() + i10);
            int right2 = this.e.getRight() + marginLayoutParams.rightMargin;
            int bottom = this.e.getBottom() + marginLayoutParams.bottomMargin;
            paddingTop = i10 - marginLayoutParams.topMargin;
            paddingLeft = right2;
            i6 = bottom;
        }
        boolean z3 = this.f.getVisibility() != 8;
        if (z3) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
            if (!z2) {
                paddingLeft = i5;
            }
            if (!z2) {
                paddingTop = i6;
            }
            int i11 = paddingLeft + marginLayoutParams2.leftMargin;
            int i12 = paddingTop + marginLayoutParams2.topMargin;
            FixTextView fixTextView4 = this.f;
            fixTextView4.layout(i11, i12, fixTextView4.getMeasuredWidth() + i11, this.f.getMeasuredHeight() + i12);
            paddingLeft = this.f.getRight() + marginLayoutParams2.rightMargin;
            i6 = Math.max(i6, this.f.getBottom() + marginLayoutParams2.bottomMargin);
            paddingTop = i12 - marginLayoutParams2.topMargin;
        }
        if (this.g.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            if (!z2 && !z3) {
                paddingLeft = i5;
            }
            if (!z2 && !z3) {
                paddingTop = i6;
            }
            int i13 = paddingLeft + marginLayoutParams3.leftMargin;
            int i14 = paddingTop + marginLayoutParams3.topMargin;
            FixTextView fixTextView5 = this.g;
            fixTextView5.layout(i13, i14, fixTextView5.getMeasuredWidth() + i13, this.g.getMeasuredHeight() + i14);
            paddingLeft = this.g.getRight() + marginLayoutParams3.rightMargin;
            i6 = Math.max(i6, this.g.getBottom() + marginLayoutParams3.bottomMargin);
            paddingTop = i14 - marginLayoutParams3.topMargin;
        }
        if (this.h.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            if (!z2 && !z3) {
                paddingLeft = i5;
            }
            if (!z2 && !z3) {
                paddingTop = i6;
            }
            int i15 = paddingLeft + marginLayoutParams4.leftMargin;
            int i16 = paddingTop + marginLayoutParams4.topMargin;
            if (this.h.getMeasuredWidth() + marginLayoutParams4.rightMargin > i7 - i15) {
                i15 = marginLayoutParams4.leftMargin + i5;
                i16 = marginLayoutParams4.topMargin + i6;
                setMiddotVisibility(4);
            }
            View view = this.h;
            view.layout(i15, i16, view.getMeasuredWidth() + i15, this.h.getMeasuredHeight() + i16);
            paddingLeft = this.h.getRight() + marginLayoutParams4.rightMargin;
            i6 = Math.max(i6, this.h.getBottom() + marginLayoutParams4.bottomMargin);
            paddingTop = i16 - marginLayoutParams4.topMargin;
        }
        boolean z4 = this.i.getVisibility() != 8;
        if (z4) {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int i17 = marginLayoutParams5.leftMargin + i5;
            int i18 = i6 + marginLayoutParams5.topMargin;
            FixTextView fixTextView6 = this.i;
            fixTextView6.layout(i17, i18, fixTextView6.getMeasuredWidth() + i17, this.i.getMeasuredHeight() + i18);
            int right3 = this.i.getRight() + marginLayoutParams5.rightMargin;
            int bottom2 = this.i.getBottom() + marginLayoutParams5.bottomMargin;
            paddingTop = i18 - marginLayoutParams5.topMargin;
            paddingLeft = right3;
            i6 = bottom2;
        }
        if (this.j.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            int i19 = z4 ? paddingLeft + this.s : i5;
            if (!z4) {
                paddingTop = i6;
            }
            int i20 = i19 + marginLayoutParams6.leftMargin;
            int i21 = paddingTop + marginLayoutParams6.topMargin;
            FixTextView fixTextView7 = this.j;
            fixTextView7.layout(i20, i21, fixTextView7.getMeasuredWidth() + i20, this.j.getMeasuredHeight() + i21);
            this.j.getRight();
            i6 = Math.max(i6, this.j.getBottom() + marginLayoutParams6.bottomMargin);
        }
        if (this.k.getVisibility() != 8) {
            FixTextView fixTextView8 = this.k;
            fixTextView8.layout(i5, i6, fixTextView8.getMeasuredWidth() + i5, this.k.getMeasuredHeight() + i6);
            this.k.getBottom();
        }
        if (this.l.getVisibility() != 8) {
            int i22 = i5 + ((ViewGroup.MarginLayoutParams) this.l.getLayoutParams()).leftMargin;
            int measuredHeight2 = i8 - this.l.getMeasuredHeight();
            FixTextView fixTextView9 = this.l;
            fixTextView9.layout(i22, measuredHeight2, fixTextView9.getMeasuredWidth() + i22, this.l.getMeasuredHeight() + measuredHeight2);
        }
        if (this.m.getVisibility() != 8) {
            int measuredWidth2 = measuredWidth - this.m.getMeasuredWidth();
            int measuredHeight3 = measuredHeight - this.m.getMeasuredHeight();
            TimeAndStatusView timeAndStatusView = this.m;
            timeAndStatusView.layout(measuredWidth2, measuredHeight3, timeAndStatusView.getMeasuredWidth() + measuredWidth2, this.m.getMeasuredHeight() + measuredHeight3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int maximumWidth = getMaximumWidth();
        int maximumHeight = getMaximumHeight();
        int c = c(i, suggestedMinimumWidth, maximumWidth, paddingRight);
        int c2 = c(i2, suggestedMinimumHeight, maximumHeight, paddingBottom);
        measureChildWithMargins(this.b, f(c), paddingRight, f(c2), paddingBottom);
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredHeight = this.b.getMeasuredHeight();
        this.n.measure(measuredWidth, measuredHeight);
        Rect rect = this.q;
        int max = Math.max(0, ((c - measuredWidth) - rect.left) - rect.right);
        Rect rect2 = this.q;
        int max2 = Math.max(0, (c2 - rect2.top) - rect2.bottom);
        if (this.m.getVisibility() != 8) {
            TimeAndStatusView timeAndStatusView = this.m;
            int f = f(max);
            i3 = measuredWidth;
            int f2 = f(max2);
            i4 = max;
            i6 = measuredHeight;
            i5 = max2;
            i7 = 8;
            measureChildWithMargins(timeAndStatusView, f, 0, f2, 0);
            i9 = this.m.getMeasuredWidth();
            i8 = this.m.getMeasuredHeight();
        } else {
            i3 = measuredWidth;
            i4 = max;
            i5 = max2;
            i6 = measuredHeight;
            i7 = 8;
            i8 = 0;
            i9 = 0;
        }
        if (this.c.getVisibility() != i7) {
            i10 = i8;
            i11 = i9;
            measureChildWithMargins(this.c, f(i4), 0, f(i5), 0);
            i12 = this.c.getMeasuredWidth();
            i13 = this.c.getMeasuredHeight();
        } else {
            i10 = i8;
            i11 = i9;
            i12 = 0;
            i13 = 0;
        }
        if (this.d.getVisibility() != i7) {
            i14 = i12;
            measureChildWithMargins(this.d, f(i4), 0, f(i5), 0);
            i15 = this.d.getMeasuredWidth();
            i16 = this.d.getMeasuredHeight();
        } else {
            i14 = i12;
            i15 = 0;
            i16 = 0;
        }
        if (this.e.getVisibility() != i7) {
            i17 = i15;
            measureChildWithMargins(this.e, f(i4), 0, f(i5), 0);
            int measuredWidth2 = this.e.getMeasuredWidth();
            int measuredHeight2 = this.e.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            int i53 = measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i54 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + measuredHeight2;
            i19 = i53;
            i18 = i54;
        } else {
            i17 = i15;
            i18 = 0;
            i19 = 0;
        }
        if (this.g.getVisibility() != i7) {
            i20 = i18;
            i21 = i19;
            measureChildWithMargins(this.g, f(i4 - i19), 0, f(i5), 0);
            int measuredWidth3 = this.g.getMeasuredWidth();
            this.g.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            i22 = marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + measuredWidth3;
        } else {
            i20 = i18;
            i21 = i19;
            i22 = 0;
        }
        if (this.f.getVisibility() != i7) {
            int i55 = i21;
            i23 = i22;
            i24 = i55;
            measureChildWithMargins(this.f, f((i4 - i55) - i22), 0, f(i5), 0);
            int measuredWidth4 = this.f.getMeasuredWidth();
            int measuredHeight3 = this.f.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
            int i56 = measuredWidth4 + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
            int i57 = marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin + measuredHeight3;
            i26 = i56;
            i25 = i57;
        } else {
            i23 = i22;
            i24 = i21;
            i25 = 0;
            i26 = 0;
        }
        if (this.h.getVisibility() != i7) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            i30 = i25;
            i27 = i26;
            i29 = paddingBottom;
            i28 = paddingRight;
            measureChildWithMargins(this.h, g(marginLayoutParams4.width), 0, g(marginLayoutParams4.height), 0);
            int measuredWidth5 = this.h.getMeasuredWidth();
            int measuredHeight4 = this.h.getMeasuredHeight();
            i32 = marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin + measuredWidth5;
            i31 = marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin + measuredHeight4;
        } else {
            i27 = i26;
            i28 = paddingRight;
            i29 = paddingBottom;
            i30 = i25;
            i31 = 0;
            i32 = 0;
        }
        if (this.i.getVisibility() != 8) {
            i33 = i31;
            measureChildWithMargins(this.i, f(i4), 0, f(i5), 0);
            int measuredWidth6 = this.i.getMeasuredWidth();
            int measuredHeight5 = this.i.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int i58 = measuredWidth6 + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
            i34 = marginLayoutParams5.topMargin + marginLayoutParams5.bottomMargin + measuredHeight5;
            i35 = i58;
        } else {
            i33 = i31;
            i34 = 0;
            i35 = 0;
        }
        if (this.j.getVisibility() != 8) {
            i36 = suggestedMinimumHeight;
            i37 = i34;
            measureChildWithMargins(this.j, f((i4 - i35) - (i35 != 0 ? this.s : 0)), 0, f(i5), 0);
            int measuredWidth7 = this.j.getMeasuredWidth();
            int measuredHeight6 = this.j.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            int i59 = measuredWidth7 + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
            i38 = marginLayoutParams6.topMargin + marginLayoutParams6.bottomMargin + measuredHeight6;
            i39 = i59;
        } else {
            i36 = suggestedMinimumHeight;
            i37 = i34;
            i38 = 0;
            i39 = 0;
        }
        if (this.k.getVisibility() != 8) {
            i40 = maximumHeight;
            i41 = i38;
            measureChildWithMargins(this.k, f(i4), 0, f(i5), 0);
            i42 = this.k.getMeasuredWidth();
            i43 = this.k.getMeasuredHeight();
        } else {
            i40 = maximumHeight;
            i41 = i38;
            i42 = 0;
            i43 = 0;
        }
        if (this.m.getVisibility() != 8) {
            i44 = 0;
            i4 = Math.max(0, (i4 - this.r) - i11);
        } else {
            i44 = 0;
        }
        if (this.l.getVisibility() != 8) {
            i45 = i44;
            i46 = suggestedMinimumWidth;
            i48 = i42;
            i47 = i11;
            measureChildWithMargins(this.l, f(i4), 0, f(i5), 0);
            int measuredWidth8 = this.l.getMeasuredWidth();
            int measuredHeight7 = this.l.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            int i60 = measuredWidth8 + marginLayoutParams7.leftMargin + marginLayoutParams7.rightMargin;
            int i61 = marginLayoutParams7.topMargin + marginLayoutParams7.bottomMargin + measuredHeight7;
            i50 = i60;
            i49 = i61;
        } else {
            i45 = i44;
            i46 = suggestedMinimumWidth;
            i47 = i11;
            i48 = i42;
            i49 = i45;
            i50 = i49;
        }
        int i62 = i35 + (i35 != 0 ? this.s : i45) + i39;
        int i63 = i24;
        int a2 = lr.a(i63, i27, i23, i32);
        int i64 = i14;
        if (a2 > i64) {
            i45 = 1;
        }
        int max3 = Math.max(Math.max(Math.max(i64, i17), Math.max(i62, i48)), i63);
        if (this.l.getVisibility() != 8 && this.m.getVisibility() != 8) {
            max3 = Math.max(max3, i50 + this.r + i47);
        } else if (this.l.getVisibility() != 8) {
            max3 = Math.max(max3, i50);
        } else if (this.m.getVisibility() != 8) {
            max3 = Math.max(max3, i47);
        }
        int max4 = Math.max(i20, i30);
        int max5 = Math.max(i49, i10) + i13 + i16 + (i45 == 0 ? Math.max(max4, i33) : max4 + i33) + Math.max(i37, i41) + i43;
        Rect rect3 = this.q;
        int i65 = rect3.left + max3 + rect3.right;
        int i66 = rect3.top + max5 + rect3.bottom;
        if (i66 > i6) {
            this.b.measure(g(i3), g(i66));
            i52 = this.b.getMeasuredWidth();
            i51 = this.b.getMeasuredHeight();
        } else {
            i51 = i6;
            i52 = i3;
        }
        setMeasuredDimension(d(i, i46, maximumWidth, i52 + i65 + i28), d(i2, i36, i40, Math.max(i51, i66) + i29));
    }

    public void setButtonAllCaps(boolean z) {
        this.l.setAllCaps(z);
    }

    public void setButtonBackground(Drawable drawable) {
        l(drawable);
    }

    public void setButtonCompoundDrawablePadding(int i) {
        this.l.setCompoundDrawablePadding(i);
    }

    public void setButtonEllipsize(TextUtils.TruncateAt truncateAt) {
        this.l.setEllipsize(truncateAt);
    }

    public void setButtonFontFamily(String str) {
        b.i(this.l, str, null, TextSizeUnit.SP);
    }

    public void setButtonText(int i) {
        setButtonText(i == 0 ? "" : getContext().getString(i));
    }

    public void setButtonTextColor(int i) {
        this.l.setTextColor(i);
        l(this.l.getBackground());
    }

    public void setButtonTextSize(int i) {
        this.l.setTextSize(0, i);
    }

    public void setCaptionText(CharSequence charSequence) {
        this.k.setText(charSequence);
        this.k.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setCaptionTextColor(int i) {
        this.k.setTextColor(i);
    }

    public void setContentPadding(Rect rect) {
        this.q.set(rect);
        requestLayout();
        invalidate();
    }

    public void setContentPaddingBottom(int i) {
        this.q.bottom = i;
        requestLayout();
        invalidate();
    }

    public void setContentPaddingLeft(int i) {
        this.q.left = i;
        requestLayout();
        invalidate();
    }

    public void setContentPaddingRight(int i) {
        this.q.right = i;
        requestLayout();
        invalidate();
    }

    public void setContentPaddingTop(int i) {
        this.q.top = i;
        requestLayout();
        invalidate();
    }

    public void setDescriptionTextColor(int i) {
        this.d.setTextColor(i);
    }

    public void setDescriptionTranslationY(float f) {
        this.d.setTranslationY(f);
    }

    public void setImageCornerRadius(int i) {
        this.b.setCornerRadius(i);
    }

    public void setImageHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (i < 0) {
            i = -2;
        }
        layoutParams.height = i;
        this.b.setLayoutParams(layoutParams);
    }

    public void setImageList(ImageList imageList) {
        this.b.setRemoteImage(imageList);
    }

    public void setImageMaxHeight(int i) {
        this.b.setMaximumHeight(i);
    }

    public void setImageMaxWidth(int i) {
        this.b.setMaximumWidth(i);
    }

    public void setImageMinHeight(int i) {
        this.b.setMinimumHeight(i);
    }

    public void setImageMinWidth(int i) {
        this.b.setMinimumWidth(i);
    }

    public void setImageOverlay(Drawable drawable) {
        this.n.setImageDrawable(drawable);
    }

    public void setImageOverlayPadding(int i) {
        this.n.setPadding(i, i, i, i);
    }

    public void setImagePlaceholder(Drawable drawable) {
        this.b.setPlaceholder(drawable);
        this.b.setEmptyPlaceholder(drawable);
    }

    public void setImageScaleType(ScaleType scaleType) {
        this.b.setScaleType(scaleType);
    }

    public void setImageWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (i < 0) {
            i = -2;
        }
        layoutParams.width = i;
        this.b.setLayoutParams(layoutParams);
    }

    public void setMaximumHeight(int i) {
        this.p = i;
        requestLayout();
        invalidate();
    }

    public void setMaximumWidth(int i) {
        this.o = i;
        requestLayout();
        invalidate();
    }

    public void setMerchantLogoDrawable(@Nullable Drawable drawable) {
        this.h.setBackground(drawable);
        this.h.setVisibility(drawable == null ? 8 : 0);
    }

    public void setMerchantLogoHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (i < 0) {
            i = -2;
        }
        layoutParams.height = i;
        this.h.setLayoutParams(layoutParams);
    }

    public void setMerchantLogoTint(@Nullable ColorStateList colorStateList) {
        this.h.setBackgroundTintList(colorStateList);
    }

    public void setMerchantLogoWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (i < 0) {
            i = -2;
        }
        layoutParams.width = i;
        this.h.setLayoutParams(layoutParams);
    }

    public void setMiddotHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        if (i < 0) {
            i = -2;
        }
        layoutParams.height = i;
        this.g.setLayoutParams(layoutParams);
    }

    public void setMiddotTextColor(int i) {
        this.g.setTextColor(i);
    }

    public void setMiddotVisibility(int i) {
        this.g.setVisibility(i);
    }

    public void setOldPriceText(CharSequence charSequence) {
        this.j.setText(charSequence);
        this.j.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setOldPriceTextColor(int i) {
        this.j.setTextColor(i);
    }

    public void setOrdersCountHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        if (i < 0) {
            i = -2;
        }
        layoutParams.height = i;
        this.f.setLayoutParams(layoutParams);
    }

    public void setOrdersCountText(CharSequence charSequence) {
        this.f.setText(charSequence);
        this.f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setOrdersCountTextColor(int i) {
        this.f.setTextColor(i);
    }

    public void setPriceFont(FontFamily fontFamily) {
        b.f(this.i, fontFamily);
    }

    public void setPriceSpaceWidth(int i) {
        this.s = i;
        requestLayout();
        invalidate();
    }

    public void setPriceText(CharSequence charSequence) {
        this.i.setText(charSequence);
        this.i.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setPriceTextColor(int i) {
        this.i.setTextColor(i);
    }

    public void setRatingHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (i < 0) {
            i = -2;
        }
        layoutParams.height = i;
        this.e.setLayoutParams(layoutParams);
    }

    public void setRatingText(CharSequence charSequence) {
        this.e.setText(charSequence);
        this.e.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setRatingTextColor(int i) {
        this.e.setTextColor(i);
    }

    public void setTimeMargin(int i) {
        this.r = i;
        requestLayout();
        invalidate();
    }

    public void setTimeTextAppearance(int i) {
        this.m.setTimeTextAppearance(i);
    }

    public void setTimeTextColor(int i) {
        this.m.setTimeTextColor(i);
    }

    public void setTitleTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setTitleTitleFont(com.vk.typography.a aVar) {
        b.h(this.c, aVar, 0);
    }

    public void setTitleTranslationY(float f) {
        this.c.setTranslationY(f);
    }

    public void setButtonText(CharSequence charSequence) {
        this.l.setText(charSequence);
        this.l.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public MsgPartSnippetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = new Handler(Looper.getMainLooper());
        this.u = new ArrayList();
        this.v = new sd(this, 10);
        e(context, attributeSet, 0, 0);
    }

    public MsgPartSnippetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new Handler(Looper.getMainLooper());
        this.u = new ArrayList();
        this.v = new sd(this, 10);
        e(context, attributeSet, i, 0);
    }

    public MsgPartSnippetView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.t = new Handler(Looper.getMainLooper());
        this.u = new ArrayList();
        this.v = new sd(this, 10);
        e(context, attributeSet, i, i2);
    }
}
