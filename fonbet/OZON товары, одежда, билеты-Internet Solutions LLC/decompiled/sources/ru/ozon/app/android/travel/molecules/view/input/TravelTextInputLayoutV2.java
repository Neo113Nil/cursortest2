package ru.ozon.app.android.travel.molecules.view.input;

import Sc.InterfaceC4008j;
import Sc.o;
import Xc.a;
import Xc.b;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oU.g;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayoutV2;
import ru.ozon.app.android.travel.ui.molecules.R$color;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$styleable;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ImageViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 s2\u00020\u0001:\u0002stB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u00062\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u00062\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u000f2\b\b\u0002\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010(R\"\u0010+\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010(R*\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b0\u0010-\"\u0004\b1\u0010(R*\u00102\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010-\"\u0004\b4\u0010(R\"\u00105\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010,\u001a\u0004\b6\u0010-\"\u0004\b7\u0010(R\u0016\u00108\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010C\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010ER\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010AR\u0014\u0010M\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010AR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010ER\u0014\u0010O\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010ER\u0014\u0010P\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010AR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010AR\u0014\u0010^\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010VR\u001b\u0010c\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001b\u0010f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010`\u001a\u0004\be\u0010bR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR$\u0010r\u001a\u00020W2\u0006\u0010/\u001a\u00020W8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q¨\u0006u"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayoutV2;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "vectorResId", "tintColor", "showLeftImageView", "(ILjava/lang/Integer;)V", "showRightImageView", "hideLeftImageView", "()V", "hideRightImageView", "Landroid/widget/TextView;", "setInputLayout", "(Landroid/widget/TextView;)V", "withAnimation", "updateLayout", "(Z)V", "riseHint", "centerHint", "isEditable", "Z", "()Z", "setEditable", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isMultiline", "setMultiline", "showError", "getShowError", "setShowError", "autoClearError", "getAutoClearError", "setAutoClearError", "inputView", "Landroid/widget/TextView;", "isHintRisen", "Ljava/lang/Boolean;", "Lkotlin/Function1;", "customOnFocusChangeListener", "Lkotlin/jvm/functions/Function1;", "", "hintAnimationProgress", "F", "strokeWidth1dp", "strokeWidth2dp", "inputTopMargin", "I", "leftImageSize", "rightImageSize", "inputMarginStart", "Landroid/animation/FloatEvaluator;", "floatEvaluator", "Landroid/animation/FloatEvaluator;", "focusedHintSize", "unfocusedHintSize", "enabledBgColor", "disabledBgColor", "bgCornerRadius", "Landroid/graphics/RectF;", "bgRect", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "strokeBgPaint", "Landroid/graphics/Paint;", "", "_hint", "Ljava/lang/String;", "Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayoutV2$HintPosition;", "hintPosition", "Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayoutV2$HintPosition;", "hintLeftIconMargin", "hintPaint", "errorStrokeColor$delegate", "LSc/j;", "getErrorStrokeColor", "()I", "errorStrokeColor", "unfocusedStrokeColor$delegate", "getUnfocusedStrokeColor", "unfocusedStrokeColor", "Landroid/animation/ValueAnimator;", "hintAnimation", "Landroid/animation/ValueAnimator;", "Landroidx/appcompat/widget/AppCompatImageView;", "leftImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "rightImageView", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "hint", "Companion", "HintPosition", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"UseKtx", "CustomViewStyleable"})
/* loaded from: classes2.dex */
public final class TravelTextInputLayoutV2 extends ConstraintLayout {

    @NotNull
    private String _hint;
    private boolean autoClearError;
    private final float bgCornerRadius;

    @NotNull
    private final RectF bgRect;
    private Function1<? super Boolean, Unit> customOnFocusChangeListener;
    private final int disabledBgColor;
    private final int enabledBgColor;

    /* renamed from: errorStrokeColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j errorStrokeColor;

    @NotNull
    private final FloatEvaluator floatEvaluator;
    private final float focusedHintSize;
    private ValueAnimator hintAnimation;
    private float hintAnimationProgress;
    private final float hintLeftIconMargin;

    @NotNull
    private final Paint hintPaint;

    @NotNull
    private HintPosition hintPosition;
    private final int inputMarginStart;
    private final int inputTopMargin;
    private TextView inputView;
    private boolean isEditable;
    private Boolean isHintRisen;
    private boolean isMultiline;
    private final int leftImageSize;

    @NotNull
    private final AppCompatImageView leftImageView;
    private final int rightImageSize;

    @NotNull
    private final AppCompatImageView rightImageView;
    private boolean showError;

    @NotNull
    private final Paint strokeBgPaint;
    private final float strokeWidth1dp;
    private final float strokeWidth2dp;
    private final float unfocusedHintSize;

    /* renamed from: unfocusedStrokeColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j unfocusedStrokeColor;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayoutV2$HintPosition;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "getIntValue", "()I", "CENTER", "TOP", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HintPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ HintPosition[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int intValue;
        public static final HintPosition CENTER = new HintPosition("CENTER", 0, 0);
        public static final HintPosition TOP = new HintPosition("TOP", 1, 1);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayoutV2$HintPosition$Companion;", "", "<init>", "()V", "fromInt", "Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayoutV2$HintPosition;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final HintPosition fromInt(int value) {
                for (HintPosition hintPosition : HintPosition.values()) {
                    if (hintPosition.getIntValue() == value) {
                        return hintPosition;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ HintPosition[] $values() {
            return new HintPosition[]{CENTER, TOP};
        }

        static {
            HintPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private HintPosition(String str, int i11, int i12) {
            this.intValue = i12;
        }

        public static HintPosition valueOf(String str) {
            return (HintPosition) Enum.valueOf(HintPosition.class, str);
        }

        public static HintPosition[] values() {
            return (HintPosition[]) $VALUES.clone();
        }

        public final int getIntValue() {
            return this.intValue;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HintPosition.values().length];
            try {
                iArr[HintPosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HintPosition.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TravelTextInputLayoutV2(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void centerHint(boolean withAnimation) {
        if (!withAnimation) {
            this.hintAnimationProgress = 0.0f;
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.hintAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.hintAnimationProgress, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oU.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TravelTextInputLayoutV2.centerHint$lambda$19$lambda$18(TravelTextInputLayoutV2.this, valueAnimator2);
            }
        });
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void centerHint$lambda$19$lambda$18(TravelTextInputLayoutV2 travelTextInputLayoutV2, ValueAnimator valueAnimator) {
        travelTextInputLayoutV2.hintAnimationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        travelTextInputLayoutV2.invalidate();
    }

    private final int getErrorStrokeColor() {
        return ((Number) this.errorStrokeColor.getValue()).intValue();
    }

    private final int getUnfocusedStrokeColor() {
        return ((Number) this.unfocusedStrokeColor.getValue()).intValue();
    }

    private final void riseHint(boolean withAnimation) {
        int i11 = 0;
        ValueAnimator valueAnimator = this.hintAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!withAnimation) {
            this.hintAnimationProgress = 1.0f;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.hintAnimationProgress, 1.0f);
        ofFloat.addUpdateListener(new g(this, i11));
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void riseHint$lambda$17$lambda$16(TravelTextInputLayoutV2 travelTextInputLayoutV2, ValueAnimator valueAnimator) {
        travelTextInputLayoutV2.hintAnimationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        travelTextInputLayoutV2.invalidate();
    }

    private final void setInputLayout(TextView child) {
        this.inputView = child;
        if (child == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        child.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: oU.e
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                TravelTextInputLayoutV2.updateLayout$default(TravelTextInputLayoutV2.this, false, 1, null);
            }
        });
        child.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: oU.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                TravelTextInputLayoutV2.setInputLayout$lambda$12$lambda$11(TravelTextInputLayoutV2.this, view, z11);
            }
        });
        child.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayoutV2$setInputLayout$1$3
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Intrinsics.checkNotNullParameter(editable, "editable");
                TravelTextInputLayoutV2.this.updateLayout(false);
                if (TravelTextInputLayoutV2.this.getAutoClearError()) {
                    TravelTextInputLayoutV2.this.setShowError(false);
                }
            }
        });
        child.setInputType(child.getInputType() | 524288);
        child.setTextAppearance(R$style.TextStyle_Body_L);
        child.setTextColor(child.getContext().getColorStateList(R$color.travel_text_input_v2_color_edit_text));
        if (!this.isMultiline) {
            child.setMaxLines(1);
        }
        child.setBackground(null);
        child.setPadding(0, 0, 0, 0);
        child.setMinHeight(0);
        ViewExtensionsKt.performClickOnTargetView(child, this);
        this.hintPaint.setTextSize(this.focusedHintSize);
        Paint.FontMetrics fontMetrics = this.hintPaint.getFontMetrics();
        float abs = Math.abs((fontMetrics.descent + fontMetrics.ascent) - fontMetrics.bottom);
        TextView textView = this.inputView;
        if (textView == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) abs;
        bVar.setMarginStart(this.inputMarginStart);
        bVar.f41594A = 0;
        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
        d dVar = new d();
        dVar.p(this);
        TextView textView2 = this.inputView;
        if (textView2 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        dVar.s(textView2.getId(), 6, this.leftImageView.getId(), 7);
        TextView textView3 = this.inputView;
        if (textView3 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        dVar.s(textView3.getId(), 7, this.rightImageView.getId(), 6);
        TextView textView4 = this.inputView;
        if (textView4 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        dVar.s(textView4.getId(), 3, 0, 3);
        TextView textView5 = this.inputView;
        if (textView5 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        dVar.s(textView5.getId(), 4, 0, 4);
        dVar.f(this);
        updateLayout(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setInputLayout$lambda$12$lambda$11(TravelTextInputLayoutV2 travelTextInputLayoutV2, View view, boolean z11) {
        Function1<? super Boolean, Unit> function1 = travelTextInputLayoutV2.customOnFocusChangeListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
        updateLayout$default(travelTextInputLayoutV2, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateLayout(boolean withAnimation) {
        boolean z11;
        TextView textView = this.inputView;
        if (textView == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        if (!textView.isFocused()) {
            TextView textView2 = this.inputView;
            if (textView2 == null) {
                Intrinsics.n("inputView");
                throw null;
            }
            CharSequence text = textView2.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() <= 0) {
                z11 = false;
                if (Boolean.valueOf(z11).equals(this.isHintRisen)) {
                    this.isHintRisen = Boolean.valueOf(z11);
                    if (z11) {
                        riseHint(withAnimation);
                        return;
                    } else {
                        centerHint(withAnimation);
                        return;
                    }
                }
                return;
            }
        }
        z11 = true;
        if (Boolean.valueOf(z11).equals(this.isHintRisen)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void updateLayout$default(TravelTextInputLayoutV2 travelTextInputLayoutV2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        travelTextInputLayoutV2.updateLayout(z11);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof TextView) {
            setInputLayout((TextView) child);
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        float f7;
        float height;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.showError) {
            this.strokeBgPaint.setColor(getErrorStrokeColor());
            this.strokeBgPaint.setStrokeWidth(this.strokeWidth2dp);
            f7 = this.strokeWidth2dp;
        } else {
            this.strokeBgPaint.setColor(getUnfocusedStrokeColor());
            this.strokeBgPaint.setStrokeWidth(this.strokeWidth1dp);
            f7 = this.strokeWidth1dp;
        }
        this.bgRect.set(f7, f7, getWidth() - f7, getHeight() - f7);
        RectF rectF = this.bgRect;
        float f11 = this.bgCornerRadius;
        canvas.drawRoundRect(rectF, f11, f11, this.strokeBgPaint);
        super.draw(canvas);
        this.hintPaint.setTextSize(this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(this.unfocusedHintSize), (Number) Float.valueOf(this.focusedHintSize)).floatValue());
        float paddingLeft = this.leftImageView.getVisibility() == 0 ? this.hintLeftIconMargin + getPaddingLeft() : getPaddingLeft();
        Paint.FontMetrics fontMetrics = this.hintPaint.getFontMetrics();
        float abs = Math.abs(fontMetrics.descent + fontMetrics.ascent);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.hintPosition.ordinal()];
        if (i11 == 1) {
            height = (getHeight() / 2.0f) + (abs / 2);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            height = this.inputTopMargin + abs;
        }
        Float evaluate = this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(height), (Number) Float.valueOf(abs + this.inputTopMargin));
        String str = this._hint;
        int length = get_hint().length();
        Intrinsics.f(evaluate);
        canvas.drawText(str, 0, length, paddingLeft, evaluate.floatValue(), this.hintPaint);
    }

    public final boolean getAutoClearError() {
        return this.autoClearError;
    }

    @NotNull
    /* renamed from: getHint, reason: from getter */
    public final String get_hint() {
        return this._hint;
    }

    public final void hideLeftImageView() {
        this.leftImageView.setVisibility(8);
    }

    public final void hideRightImageView() {
        this.rightImageView.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return !this.isEditable;
    }

    public final void setHint(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._hint = value;
        invalidate();
    }

    public final void setMultiline(boolean z11) {
        if (this.isMultiline != z11) {
            this.isMultiline = z11;
            if (z11) {
                TextView textView = this.inputView;
                if (textView != null) {
                    if (textView == null) {
                        Intrinsics.n("inputView");
                        throw null;
                    }
                    textView.setMaxLines(Integer.MAX_VALUE);
                }
                setMaxHeight(Integer.MAX_VALUE);
            } else {
                TextView textView2 = this.inputView;
                if (textView2 != null) {
                    if (textView2 == null) {
                        Intrinsics.n("inputView");
                        throw null;
                    }
                    textView2.setMaxLines(1);
                }
                setMaxHeight(getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
            }
            requestLayout();
        }
    }

    public final void setShowError(boolean z11) {
        if (z11 != this.showError) {
            this.showError = z11;
            invalidate();
        }
    }

    public final void showLeftImageView(int vectorResId, Integer tintColor) {
        AppCompatImageView appCompatImageView = this.leftImageView;
        ImageViewExtKt.setVectorDrawable(appCompatImageView, vectorResId);
        ThemeExtKt.tint(appCompatImageView, tintColor);
        appCompatImageView.setVisibility(0);
    }

    public final void showRightImageView(int vectorResId, Integer tintColor) {
        AppCompatImageView appCompatImageView = this.rightImageView;
        ImageViewExtKt.setVectorDrawable(appCompatImageView, vectorResId);
        ThemeExtKt.tint(appCompatImageView, tintColor);
        appCompatImageView.setVisibility(0);
    }

    public /* synthetic */ TravelTextInputLayoutV2(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTextInputLayoutV2(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isEditable = true;
        this.hintAnimationProgress = 1.0f;
        float pxF = ResourceExtKt.toPxF(1, context);
        this.strokeWidth1dp = pxF;
        this.strokeWidth2dp = ResourceExtKt.toPxF(2, context);
        this.inputTopMargin = ResourceExtKt.toPx(12, context);
        int px = ResourceExtKt.toPx(24, context);
        this.leftImageSize = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.rightImageSize = px2;
        this.inputMarginStart = ResourceExtKt.toPx(8, context);
        this.floatEvaluator = new FloatEvaluator();
        this.focusedHintSize = UiExtKt.toSpF(12.0f);
        this.unfocusedHintSize = UiExtKt.toSpF(18.0f);
        this.bgCornerRadius = ResourceExtKt.toPxF(12, context);
        this.bgRect = new RectF();
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(pxF);
        this.strokeBgPaint = paint;
        this._hint = "";
        HintPosition hintPosition = HintPosition.CENTER;
        this.hintPosition = hintPosition;
        this.hintLeftIconMargin = ResourceExtKt.toPxF(32, context);
        Paint paint2 = new Paint(1);
        paint2.setColor(ThemeExtKt.themeColor(context, R$attr.textTertiary));
        TextPaintExtKt.applyStyle(paint2, context, UniTextStyles.BODY_500_MEDIUM.getResId());
        this.hintPaint = paint2;
        this.errorStrokeColor = LazyUtilsKt.unsafeLazy(new TravelTextInputLayoutV2$errorStrokeColor$2(context));
        this.unfocusedStrokeColor = LazyUtilsKt.unsafeLazy(new TravelTextInputLayoutV2$unfocusedStrokeColor$2(context));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.leftImageView);
        addView(appCompatImageView, new ViewGroup.LayoutParams(px, px));
        d dVar = new d();
        dVar.p(this);
        dVar.s(appCompatImageView.getId(), 6, 0, 6);
        dVar.s(appCompatImageView.getId(), 3, 0, 3);
        dVar.s(appCompatImageView.getId(), 4, 0, 4);
        dVar.f(this);
        appCompatImageView.setVisibility(8);
        ViewExtensionsKt.performClickOnTargetView(this, this);
        this.leftImageView = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R$id.rightImageView);
        addView(appCompatImageView2, new ViewGroup.LayoutParams(px2, px2));
        d dVar2 = new d();
        dVar2.p(this);
        dVar2.s(appCompatImageView2.getId(), 7, 0, 7);
        dVar2.s(appCompatImageView2.getId(), 3, 0, 3);
        dVar2.s(appCompatImageView2.getId(), 4, 0, 4);
        dVar2.f(this);
        appCompatImageView2.setVisibility(8);
        ViewExtensionsKt.performClickOnTargetView(this, this);
        this.rightImageView = appCompatImageView2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TravelTextInputLayout, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(R$styleable.TravelTextInputLayout_ttil_hint);
        this._hint = string != null ? string : "";
        this.autoClearError = obtainStyledAttributes.getBoolean(R$styleable.TravelTextInputLayout_ttil_auto_clear_error, false);
        this.hintPosition = HintPosition.INSTANCE.fromInt(obtainStyledAttributes.getInteger(R$styleable.TravelTextInputLayout_ttil_hintPosition, hintPosition.getIntValue()));
        this.isEditable = obtainStyledAttributes.getBoolean(R$styleable.TravelTextInputLayout_ttil_isEditable, true);
        setMultiline(obtainStyledAttributes.getBoolean(R$styleable.TravelTextInputLayout_ttil_isMultiline, false));
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        this.disabledBgColor = obtainStyledAttributes.getColor(R$styleable.TravelTextInputLayout_ttil_disabledBackgroundColor, themeColor);
        this.enabledBgColor = obtainStyledAttributes.getColor(R$styleable.TravelTextInputLayout_ttil_enabledBackgroundColor, themeColor);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_side_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_top_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        Integer valueOf = Integer.valueOf(getMinHeight());
        valueOf = valueOf.intValue() == 0 ? null : valueOf;
        setMinHeight(valueOf != null ? valueOf.intValue() : getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
        if (this.isMultiline) {
            return;
        }
        setMaxHeight(getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
    }
}
