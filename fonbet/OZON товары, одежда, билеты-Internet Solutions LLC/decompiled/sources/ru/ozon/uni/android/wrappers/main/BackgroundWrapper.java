package ru.ozon.uni.android.wrappers.main;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperPreset;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperSettings;
import ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding;
import ru.ozon.uni.core.R$color;

@InterfaceC3999a
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R*\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010)\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R.\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R$\u0010>\u001a\u0002092\u0006\u0010\u0015\u001a\u0002098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lru/ozon/uni/android/wrappers/main/BackgroundWrapper;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "child", "", "addView", "(Landroid/view/View;)V", "", "isContentCentered", "(Landroid/view/View;Z)V", "Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "settings", "Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "getSettings", "()Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "setSettings", "(Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;)V", "defaultBackgroundColor", "I", "getDefaultBackgroundColor", "()I", "setDefaultBackgroundColor", "(I)V", "Lru/ozon/uni/android/uikitsdk/Color;", "currentBackgroundColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getCurrentBackgroundColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setCurrentBackgroundColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "borderWidth", "getBorderWidth", "setBorderWidth", "currentBorderColor", "Ljava/lang/Integer;", "getCurrentBorderColor", "()Ljava/lang/Integer;", "setCurrentBorderColor", "(Ljava/lang/Integer;)V", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "", "getRadiuses", "()[F", "radiuses", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "getPadding", "()Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "setPadding", "(Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;)V", "padding", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class BackgroundWrapper extends FrameLayout {

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private int borderWidth;

    @NotNull
    private Color currentBackgroundColor;
    private Integer currentBorderColor;
    private int defaultBackgroundColor;

    @NotNull
    private BackgroundWrapperSettings settings;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackgroundWrapper(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float[] getRadiuses() {
        BackgroundWrapperSettings settings = getSettings();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float pxF = UiExtKt.toPxF(UniGlobalConfigKt.getRoundCornersFlag(context) ? 99 : settings.getBackgroundWrapperSize().getCornerRadius());
        float f7 = settings.getCorners().getTopLeft() ? pxF : 0.0f;
        float f11 = settings.getCorners().getTopRight() ? pxF : 0.0f;
        float f12 = settings.getCorners().getBottomLeft() ? pxF : 0.0f;
        if (!settings.getCorners().getBottomRight()) {
            pxF = 0.0f;
        }
        return new float[]{f7, f7, f11, f11, pxF, pxF, f12, f12};
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        addView(child, true);
    }

    public final int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    @NotNull
    public BackgroundWrapperSettings getSettings() {
        return this.settings;
    }

    protected final void setBorderWidth(int i11) {
        this.borderWidth = UiExtKt.toPx(i11);
        Integer num = this.currentBorderColor;
        if (num != null) {
            this.backgroundDrawable.setStroke(this.borderWidth, num.intValue());
        }
    }

    public final void setCurrentBackgroundColor(@NotNull Color value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.currentBackgroundColor = value;
        value.applyTo(this.backgroundDrawable);
    }

    public final void setCurrentBorderColor(Integer num) {
        if (Intrinsics.d(this.currentBorderColor, num)) {
            return;
        }
        this.currentBorderColor = num;
        if (num != null) {
            this.backgroundDrawable.setStroke(this.borderWidth, num.intValue());
        }
    }

    public final void setPadding(@NotNull LayoutPadding value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setPadding(UiExtKt.toPx(value.getStart()), UiExtKt.toPx(value.getTop()), UiExtKt.toPx(value.getEnd()), UiExtKt.toPx(value.getBottom()));
    }

    public void setSettings(@NotNull BackgroundWrapperSettings value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.settings = value;
        this.backgroundDrawable.setCornerRadii(getRadiuses());
        setPadding(new LayoutPadding.padding(this.settings.getPaddingLeft().getPadding(), this.settings.getPaddingTop().getPadding(), this.settings.getPaddingRight().getPadding(), this.settings.getPaddingBottom().getPadding()));
    }

    public /* synthetic */ BackgroundWrapper(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void addView(View child, boolean isContentCentered) {
        super.addView(child, new FrameLayout.LayoutParams(isContentCentered ? -2 : -1, -2, 17));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundWrapper(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.settings = BackgroundWrapperPreset.INSTANCE.getButton400$uni_release();
        this.defaultBackgroundColor = a.getColor(context, R$color.bg_secondary);
        this.currentBackgroundColor = new Color.Solid(this.defaultBackgroundColor);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(getRadiuses());
        this.backgroundDrawable = gradientDrawable;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BackgroundWrapper);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setCurrentBackgroundColor(new Color.Solid(obtainStyledAttributes.getColor(R$styleable.BackgroundWrapper_backgroundColor, this.defaultBackgroundColor)));
        obtainStyledAttributes.recycle();
        setBackground(gradientDrawable);
    }
}
