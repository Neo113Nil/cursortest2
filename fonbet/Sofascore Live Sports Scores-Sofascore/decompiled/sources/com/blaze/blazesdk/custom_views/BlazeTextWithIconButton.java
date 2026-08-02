package com.blaze.blazesdk.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.evl;
import defpackage.izk;
import defpackage.njf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0011J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/blaze/blazesdk/custom_views/BlazeTextWithIconButton;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setText", "(Ljava/lang/String;)V", "resId", "setDrawableStart", "(I)V", "setDrawableEnd", "", "size", "setTextSize", "(F)V", "color", "setTextColor", TtmlNode.TAG_STYLE, "setTextStyle", "tint", "setDrawableEndTintColor", "setDrawableStartTintColor", "letterSpacing", "setLetterSpacing", "(Ljava/lang/Float;)V", "lineHeight", "setLineHeight", "(Ljava/lang/Integer;)V", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeTextWithIconButton extends CardView {
    public final BlazeTextView g;
    public final ImageView h;
    public final ImageView i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlazeTextWithIconButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        BlazeTextView blazeTextView = new BlazeTextView(context, null, 0, 6, null);
        blazeTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.g = blazeTextView;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.h = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.i = imageView2;
        setClickable(true);
        setFocusable(true);
        linearLayout.addView(imageView);
        linearLayout.addView(blazeTextView);
        linearLayout.addView(imageView2);
        addView(linearLayout);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, njf.c, i, 0);
        blazeTextView.setText(obtainStyledAttributes.getString(3));
        imageView.setImageDrawable(obtainStyledAttributes.getDrawable(2));
        imageView2.setImageDrawable(obtainStyledAttributes.getDrawable(0));
        blazeTextView.setTextSize(0, obtainStyledAttributes.getDimension(5, blazeTextView.getTextSize()));
        blazeTextView.setTextColor(obtainStyledAttributes.getColor(4, blazeTextView.getCurrentTextColor()));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, evl.a(context, 8));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        layoutParams2.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(dimensionPixelSize);
        int i2 = obtainStyledAttributes.getInt(6, 0);
        if (i2 == 1) {
            blazeTextView.setTypeface(null, 1);
        } else if (i2 != 2) {
            blazeTextView.setTypeface(null, 0);
        } else {
            blazeTextView.setTypeface(null, 2);
        }
        obtainStyledAttributes.recycle();
    }

    public static void setDrawablePadding$default(BlazeTextWithIconButton blazeTextWithIconButton, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        blazeTextWithIconButton.getClass();
        if (num != null) {
            int intValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = blazeTextWithIconButton.h.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(intValue);
            }
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            ViewGroup.LayoutParams layoutParams2 = blazeTextWithIconButton.i.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMarginStart(intValue2);
            }
        }
        blazeTextWithIconButton.requestLayout();
    }

    public static void setTypefaceFromResource$default(BlazeTextWithIconButton blazeTextWithIconButton, Integer num, Integer num2, Typeface typeface, int i, Object obj) {
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            typeface = Typeface.DEFAULT_BOLD;
        }
        blazeTextWithIconButton.getClass();
        typeface.getClass();
        izk.b(blazeTextWithIconButton.g, num, num2, typeface);
    }

    public final void setDrawableEnd(int resId) {
        this.i.setImageResource(resId);
    }

    public final void setDrawableEndTintColor(int tint) {
        this.i.setColorFilter(tint, PorterDuff.Mode.SRC_IN);
    }

    public final void setDrawableStart(int resId) {
        this.h.setImageResource(resId);
    }

    public final void setDrawableStartTintColor(int tint) {
        this.h.setColorFilter(tint, PorterDuff.Mode.SRC_IN);
    }

    public final void setLetterSpacing(@Nullable Float letterSpacing) {
        if (letterSpacing != null) {
            this.g.setLetterSpacing(letterSpacing.floatValue());
        }
    }

    public final void setLineHeight(@Nullable Integer lineHeight) {
        if (Build.VERSION.SDK_INT < 29 || lineHeight == null) {
            return;
        }
        this.g.setLineHeight(lineHeight.intValue());
    }

    public final void setText(@Nullable String text) {
        this.g.setText(text);
    }

    public final void setTextColor(int color) {
        this.g.setTextColor(color);
    }

    public final void setTextSize(float size) {
        this.g.setTextSize(size);
    }

    public final void setTextStyle(int style) {
        BlazeTextView blazeTextView = this.g;
        if (style == 1) {
            blazeTextView.setTypeface(null, 1);
        } else if (style != 2) {
            blazeTextView.setTypeface(null, 0);
        } else {
            blazeTextView.setTypeface(null, 2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeTextWithIconButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ BlazeTextWithIconButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeTextWithIconButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
