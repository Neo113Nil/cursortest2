package com.blaze.blazesdk.widgets.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemDurationElementStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemEventTimeElementStyle;
import com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStateStyle;
import com.blaze.blazesdk.widgets.contracts.BlazeWidgetTimeElementStyle;
import com.blaze.blazesdk.widgets.contracts.TimeElementIconStyle;
import com.sofascore.results.R;
import defpackage.evl;
import defpackage.fej;
import defpackage.izk;
import defpackage.joa;
import defpackage.nq8;
import defpackage.tam;
import defpackage.td4;
import defpackage.tgm;
import defpackage.u7g;
import defpackage.upl;
import defpackage.uvm;
import defpackage.w1l;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/widgets/ui/WidgetTimeElementCustomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/blaze/blazesdk/widgets/contracts/BlazeWidgetTimeElementStyle;", "elementStyle", "Lcom/blaze/blazesdk/widgets/contracts/BlazeWidgetTimeElementStateStyle;", "stateStyle", "", "timeText", "", "setupView", "(Lcom/blaze/blazesdk/widgets/contracts/BlazeWidgetTimeElementStyle;Lcom/blaze/blazesdk/widgets/contracts/BlazeWidgetTimeElementStateStyle;Ljava/lang/String;)V", "Luvm;", "binding$delegate", "Ljoa;", "getBinding", "()Luvm;", "binding", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WidgetTimeElementCustomView extends ConstraintLayout {
    private static final int DEFAULT_DRAWABLE_PADDING_DP = 4;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa binding;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ BlazeWidgetTimeElementStateStyle a;
        public final /* synthetic */ WidgetTimeElementCustomView b;

        public b(BlazeWidgetTimeElementStateStyle blazeWidgetTimeElementStateStyle, WidgetTimeElementCustomView widgetTimeElementCustomView) {
            this.a = blazeWidgetTimeElementStateStyle;
            this.b = widgetTimeElementCustomView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            int width = view.getWidth();
            int height = view.getHeight();
            BlazeWidgetTimeElementStateStyle blazeWidgetTimeElementStateStyle = this.a;
            blazeWidgetTimeElementStateStyle.getClass();
            float a = tam.a(blazeWidgetTimeElementStateStyle.getCornerRadius(), blazeWidgetTimeElementStateStyle.getCornerRadiusRatio(), width, height);
            int backgroundColor = blazeWidgetTimeElementStateStyle.getBackgroundColor();
            int borderColor = blazeWidgetTimeElementStateStyle.getBorderColor();
            int toPx$blazesdk_release = blazeWidgetTimeElementStateStyle.getBorderWidth().getToPx$blazesdk_release();
            GradientDrawable b = w1l.b(0);
            b.setCornerRadii(new float[]{a, a, a, a, a, a, a, a});
            b.setColor(backgroundColor);
            b.setStroke(toPx$blazesdk_release, borderColor);
            WidgetTimeElementCustomView widgetTimeElementCustomView = this.b;
            widgetTimeElementCustomView.setBackground(b);
            ImageView imageView = widgetTimeElementCustomView.getBinding().b;
            imageView.getClass();
            Integer backgroundImageResId = blazeWidgetTimeElementStateStyle.getBackgroundImageResId();
            evl.loadAndCacheImage$default(imageView, blazeWidgetTimeElementStateStyle.getBackgroundImageUrl(), backgroundImageResId != null ? td4.d0(backgroundImageResId.intValue(), widgetTimeElementCustomView.getContext()) : null, null, null, false, null, a.c(new u7g(a, a, a, a)), null, null, null, null, 1980, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetTimeElementCustomView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.binding = ypa.b(new fej(23, context, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uvm binding_delegate$lambda$0(Context context, WidgetTimeElementCustomView widgetTimeElementCustomView) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_time_element, (ViewGroup) widgetTimeElementCustomView, false);
        widgetTimeElementCustomView.addView(inflate);
        int i = R.id.blaze_time_element_image;
        ImageView imageView = (ImageView) nq8.B(R.id.blaze_time_element_image, inflate);
        if (imageView != null) {
            i = R.id.blaze_time_element_text;
            BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_time_element_text, inflate);
            if (blazeTextView != null) {
                return new uvm((ConstraintLayout) inflate, imageView, blazeTextView);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uvm getBinding() {
        return (uvm) this.binding.getValue();
    }

    public final void setupView(@NotNull BlazeWidgetTimeElementStyle elementStyle, @NotNull BlazeWidgetTimeElementStateStyle stateStyle, @Nullable String timeText) {
        TimeElementIconStyle.IconPositioning iconPositioning;
        elementStyle.getClass();
        stateStyle.getClass();
        setVisibility(8);
        if (!elementStyle.isVisible() || !stateStyle.isVisible() || timeText == null || timeText.length() == 0) {
            return;
        }
        BlazeTextView blazeTextView = getBinding().c;
        blazeTextView.getClass();
        izk.a(blazeTextView, stateStyle.getTextStyle(), new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0)), null);
        getBinding().c.setText(timeText);
        TimeElementIconStyle icon = elementStyle.getIcon();
        if (icon != null) {
            Drawable drawable = getContext().getDrawable(icon.getIconResId());
            if (drawable != null) {
                Integer iconTint = icon.getIconTint();
                drawable.setTint(iconTint != null ? iconTint.intValue() : stateStyle.getTextStyle().getTextColor());
            } else {
                drawable = null;
            }
            if (icon instanceof BlazeWidgetItemDurationElementStyle.BlazeWidgetItemDurationElementIconStyle) {
                if (upl.a[((BlazeWidgetItemDurationElementStyle.BlazeWidgetItemDurationElementIconStyle) icon).getIconPositioning().ordinal()] != 1) {
                    zzl.b();
                    return;
                }
                iconPositioning = TimeElementIconStyle.IconPositioning.START;
            } else if (icon instanceof BlazeWidgetItemEventTimeElementStyle.BlazeWidgetItemEventTimeElementIconStyle) {
                if (upl.b[((BlazeWidgetItemEventTimeElementStyle.BlazeWidgetItemEventTimeElementIconStyle) icon).getIconPositioning().ordinal()] != 1) {
                    zzl.b();
                    return;
                }
                iconPositioning = TimeElementIconStyle.IconPositioning.START;
            } else {
                iconPositioning = TimeElementIconStyle.IconPositioning.START;
            }
            if (tgm.a[iconPositioning.ordinal()] != 1) {
                zzl.b();
                return;
            }
            getBinding().c.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            BlazeTextView blazeTextView2 = getBinding().c;
            Context context = getContext();
            context.getClass();
            blazeTextView2.setCompoundDrawablePadding(evl.a(context, 4));
        }
        getBinding().c.setPadding(stateStyle.getBorderWidth().getToPx$blazesdk_release() + elementStyle.getPadding().getStart().getToPx$blazesdk_release(), stateStyle.getBorderWidth().getToPx$blazesdk_release() + elementStyle.getPadding().getTop().getToPx$blazesdk_release(), stateStyle.getBorderWidth().getToPx$blazesdk_release() + elementStyle.getPadding().getEnd().getToPx$blazesdk_release(), stateStyle.getBorderWidth().getToPx$blazesdk_release() + elementStyle.getPadding().getBottom().getToPx$blazesdk_release());
        getBinding().b.setPadding(stateStyle.getBorderWidth().getToPx$blazesdk_release() + elementStyle.getPadding().getStart().getToPx$blazesdk_release(), stateStyle.getBorderWidth().getToPx$blazesdk_release() + elementStyle.getPadding().getTop().getToPx$blazesdk_release(), stateStyle.getBorderWidth().getToPx$blazesdk_release() + elementStyle.getPadding().getEnd().getToPx$blazesdk_release(), stateStyle.getBorderWidth().getToPx$blazesdk_release() + elementStyle.getPadding().getBottom().getToPx$blazesdk_release());
        evl.h(this, elementStyle.getMargins());
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new b(stateStyle, this));
        } else {
            float a = tam.a(stateStyle.getCornerRadius(), stateStyle.getCornerRadiusRatio(), getWidth(), getHeight());
            setBackground(tam.b(a, stateStyle.getBorderColor(), stateStyle.getBorderWidth().getToPx$blazesdk_release(), Integer.valueOf(stateStyle.getBackgroundColor())));
            ImageView imageView = getBinding().b;
            imageView.getClass();
            Integer backgroundImageResId = stateStyle.getBackgroundImageResId();
            evl.loadAndCacheImage$default(imageView, stateStyle.getBackgroundImageUrl(), backgroundImageResId != null ? td4.d0(backgroundImageResId.intValue(), getContext()) : null, null, null, false, null, a.c(new u7g(a, a, a, a)), null, null, null, null, 1980, null);
        }
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetTimeElementCustomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ WidgetTimeElementCustomView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetTimeElementCustomView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
