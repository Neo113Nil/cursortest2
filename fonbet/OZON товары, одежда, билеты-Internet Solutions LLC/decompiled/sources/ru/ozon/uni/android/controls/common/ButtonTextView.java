package ru.ozon.uni.android.controls.common;

import Sc.o;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.Color;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/android/controls/common/ButtonTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "gradient", "", "applyGradient", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;)V", "applyGradientInternal", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "", "textWidth", "", "getCoordinates", "(Landroid/graphics/drawable/GradientDrawable$Orientation;F)[F", AppMeasurementSdk.ConditionalUserProperty.VALUE, "textGradient", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "getTextGradient", "()Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "setTextGradient", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonTextView extends AppCompatTextView {
    private Color.Gradient textGradient;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            try {
                iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientDrawable.Orientation.TL_BR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GradientDrawable.Orientation.TR_BL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GradientDrawable.Orientation.BL_TR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GradientDrawable.Orientation.BR_TL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ButtonTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyGradient(final Color.Gradient gradient) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: ru.ozon.uni.android.controls.common.ButtonTextView$applyGradient$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    ButtonTextView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (ButtonTextView.this.getWidth() <= 0 || ButtonTextView.this.getHeight() <= 0) {
                        return true;
                    }
                    ButtonTextView.this.applyGradientInternal(gradient);
                    return true;
                }
            });
        } else {
            applyGradientInternal(gradient);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGradientInternal(Color.Gradient gradient) {
        float[] coordinates = getCoordinates(gradient.getOrientation(), getWidth());
        getPaint().setShader(new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], gradient.getColors(), gradient.getPositions(), Shader.TileMode.CLAMP));
    }

    private final float[] getCoordinates(GradientDrawable.Orientation orientation, float f7) {
        switch (WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()]) {
            case 1:
                return new float[]{0.0f, 0.0f, 0.0f, f7};
            case 2:
                return new float[]{0.0f, f7, 0.0f, 0.0f};
            case 3:
                return new float[]{0.0f, 0.0f, f7, 0.0f};
            case 4:
                return new float[]{f7, 0.0f, 0.0f, 0.0f};
            case 5:
                return new float[]{0.0f, 0.0f, f7, f7};
            case 6:
                return new float[]{f7, 0.0f, 0.0f, f7};
            case 7:
                return new float[]{0.0f, f7, f7, 0.0f};
            case 8:
                return new float[]{f7, f7, 0.0f, 0.0f};
            default:
                throw new o();
        }
    }

    public final void setTextGradient(Color.Gradient gradient) {
        this.textGradient = gradient;
        if (gradient != null) {
            applyGradient(gradient);
        } else {
            getPaint().setShader(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonTextView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}
