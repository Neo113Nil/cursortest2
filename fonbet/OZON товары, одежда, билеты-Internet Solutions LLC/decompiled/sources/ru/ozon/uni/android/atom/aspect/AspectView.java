package ru.ozon.uni.android.atom.aspect;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001eJ\u0019\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b&\u0010$J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\fH\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b+\u0010,R.\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010.\u001a\u0004\u0018\u00010\u00078\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010.\u001a\u0004\u0018\u00010\u00078\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\u0016\u00106\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@¨\u0006C"}, d2 = {"Lru/ozon/uni/android/atom/aspect/AspectView;", "Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundColor", "", "opacity", "strokeColor", "strokeWidth", "", "isDottedStroke", "", "updateState", "(IFIIZ)V", "changeStrokeColor", "(ZII)V", "changeBackgroundColor", "(I)V", "Lru/ozon/uni/android/atom/aspect/AspectViewState;", "state", "getOpacityByState", "(Lru/ozon/uni/android/atom/aspect/AspectViewState;)F", "getStrokeWidthByState", "(Lru/ozon/uni/android/atom/aspect/AspectViewState;)I", "getBackgroundColorByState", "getStrokeColorByState", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "event", "onTouchEvent", "cornerRadius", "setCornerRadius$uni_release", "(F)V", "setCornerRadius", "setState$uni_release", "(Lru/ozon/uni/android/atom/aspect/AspectViewState;)V", "setState", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/Integer;", "getBackgroundColor$uni_release", "()Ljava/lang/Integer;", "setBackgroundColor$uni_release", "(Ljava/lang/Integer;)V", "getStrokeColor$uni_release", "setStrokeColor$uni_release", "currentState", "Lru/ozon/uni/android/atom/aspect/AspectViewState;", "dp1", "I", "dp2", "dash", "F", "innerPadding", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "foregroundDrawable", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AspectView extends FrameLayout implements AtomView {
    private Integer backgroundColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private AspectViewState currentState;
    private final float dash;
    private final int dp1;
    private final int dp2;

    @NotNull
    private final GradientDrawable foregroundDrawable;
    private final int innerPadding;
    private Integer strokeColor;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AspectViewState.values().length];
            try {
                iArr[AspectViewState.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AspectViewState.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AspectViewState.PARTIALLY_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AspectViewState.UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AspectViewState.SELECTED_UNAVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void changeBackgroundColor(int backgroundColor) {
        if (AspectViewStateKt.isCustomBackgroundColorDisabled(this.currentState)) {
            this.backgroundDrawable.setColor(backgroundColor);
            return;
        }
        GradientDrawable gradientDrawable = this.backgroundDrawable;
        Integer num = this.backgroundColor;
        if (num != null) {
            backgroundColor = num.intValue();
        }
        gradientDrawable.setColor(backgroundColor);
    }

    private final void changeStrokeColor(boolean isDottedStroke, int strokeColor, int strokeWidth) {
        if (!isDottedStroke) {
            GradientDrawable gradientDrawable = this.backgroundDrawable;
            Integer num = this.strokeColor;
            if (num != null) {
                strokeColor = num.intValue();
            }
            gradientDrawable.setStroke(strokeWidth, strokeColor);
            return;
        }
        GradientDrawable gradientDrawable2 = this.backgroundDrawable;
        Integer num2 = this.strokeColor;
        if (num2 != null) {
            strokeColor = num2.intValue();
        }
        float f7 = this.dash;
        gradientDrawable2.setStroke(strokeWidth, strokeColor, f7, f7);
    }

    private final int getBackgroundColorByState(AspectViewState state) {
        int i11;
        Context context = getContext();
        int i12 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i12 == 1 || i12 == 2 || i12 == 3) {
            i11 = R$color.layer_floor_2;
        } else {
            if (i12 != 4 && i12 != 5) {
                throw new o();
            }
            i11 = R$color.bg_secondary;
        }
        return a.getColor(context, i11);
    }

    private final float getOpacityByState(AspectViewState state) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return 1.0f;
        }
        if (i11 == 4 || i11 == 5) {
            return 0.4f;
        }
        throw new o();
    }

    private final int getStrokeColorByState(AspectViewState state) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return a.getColor(getContext(), R$color.clear_light_key_0);
                    }
                    if (i11 != 5) {
                        throw new o();
                    }
                }
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return ThemeExtKt.themeColor(context, R$attr.graphicActionPrimary);
        }
        return a.getColor(getContext(), R$color.graphic_neutral);
    }

    private final int getStrokeWidthByState(AspectViewState state) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    if (i11 != 5) {
                        throw new o();
                    }
                }
            }
            return this.dp2;
        }
        return this.dp1;
    }

    private final void updateState(int backgroundColor, float opacity, int strokeColor, int strokeWidth, boolean isDottedStroke) {
        changeBackgroundColor(backgroundColor);
        changeStrokeColor(isDottedStroke, strokeColor, strokeWidth);
        if (getChildCount() == 1) {
            getChildAt(0).setAlpha(opacity);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            setForeground(this.foregroundDrawable);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            setForeground(null);
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            setForeground(null);
        }
        return true;
    }

    public final void setBackgroundColor$uni_release(Integer num) {
        this.backgroundColor = num;
        changeBackgroundColor(getBackgroundColorByState(this.currentState));
    }

    public final void setCornerRadius$uni_release(float cornerRadius) {
        this.backgroundDrawable.setCornerRadius(cornerRadius);
        this.foregroundDrawable.setCornerRadius(cornerRadius);
    }

    public final void setState$uni_release(@NotNull AspectViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.currentState = state;
        updateState(getBackgroundColorByState(state), getOpacityByState(state), getStrokeColorByState(state), getStrokeWidthByState(state), AspectViewStateKt.isDottedLine(state));
    }

    public final void setStrokeColor$uni_release(Integer num) {
        this.strokeColor = num;
        changeStrokeColor(AspectViewStateKt.isDottedLine(this.currentState), getStrokeColorByState(this.currentState), getStrokeWidthByState(this.currentState));
    }

    public /* synthetic */ AspectView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentState = AspectViewState.ENABLED;
        this.dp1 = ResourceExtKt.toPx(1);
        this.dp2 = ResourceExtKt.toPx(2);
        this.dash = ResourceExtKt.toPxF(6);
        int px = ResourceExtKt.toPx(6);
        this.innerPadding = px;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setAlpha(13);
        gradientDrawable2.setColor(a.getColor(context, R$color.graphic_primary));
        this.foregroundDrawable = gradientDrawable2;
        setPadding(px, px, px, px);
        setBackground(gradientDrawable);
    }
}
