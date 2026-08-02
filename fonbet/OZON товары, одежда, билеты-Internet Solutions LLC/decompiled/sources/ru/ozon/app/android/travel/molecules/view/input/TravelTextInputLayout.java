package ru.ozon.app.android.travel.molecules.view.input;

import FN.g;
import Lw.C3599b;
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
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import ca0.C5795b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oU.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;
import ru.ozon.app.android.travel.ui.molecules.R$color;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$styleable;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ImageViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 w2\u00020\u0001:\u0002wxB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u00062\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u00062\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010!J!\u0010%\u001a\u00020\u000f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0#¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u000f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0#¢\u0006\u0004\b(\u0010&J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u0010.J\u0017\u00103\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104R\"\u00105\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b5\u00107\"\u0004\b8\u0010.R*\u0010:\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00106\u001a\u0004\b:\u00107\"\u0004\b;\u0010.R*\u0010<\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00107\"\u0004\b>\u0010.R\"\u0010?\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b@\u00107\"\u0004\bA\u0010.R\u0016\u0010B\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010IR\u0014\u0010N\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010IR\u0014\u0010O\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010R\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010IR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR\u0014\u0010Z\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010PR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010IR\u0014\u0010b\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010XR\u001b\u0010g\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001b\u0010j\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010d\u001a\u0004\bi\u0010fR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010pR$\u0010v\u001a\u00020[2\u0006\u00109\u001a\u00020[8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010u¨\u0006y"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "vectorResId", "tintColor", "showLeftImageView", "(ILjava/lang/Integer;)V", "showRightImageView", "hideLeftImageView", "()V", "hideRightImageView", "Lkotlin/Function1;", "onClickListener", "setRightImageviewClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onFocusChangeListener", "addOnFocusChangeListener", "Landroid/widget/TextView;", "setInputLayout", "(Landroid/widget/TextView;)V", "withAnimation", "updateLayout", "(Z)V", "riseHint", "centerHint", "", "sp", "spToPx", "(F)F", "isEditable", "Z", "()Z", "setEditable", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isMultiline", "setMultiline", "showError", "getShowError", "setShowError", "autoClearError", "getAutoClearError", "setAutoClearError", "inputView", "Landroid/widget/TextView;", "isHintRisen", "Ljava/lang/Boolean;", "customOnFocusChangeListener", "Lkotlin/jvm/functions/Function1;", "hintAnimationProgress", "F", "Landroid/animation/FloatEvaluator;", "floatEvaluator", "Landroid/animation/FloatEvaluator;", "focusedHintSize", "unfocusedHintSize", "enabledBgColor", "I", "disabledBgColor", "bgCornerRadius", "Landroid/graphics/RectF;", "bgRect", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "errorBgPaint", "errorHeight", "", "_hint", "Ljava/lang/String;", "Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayout$HintPosition;", "hintPosition", "Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayout$HintPosition;", "hintLeftIconMargin", "hintPaint", "enabledHintPaintColor$delegate", "LSc/j;", "getEnabledHintPaintColor", "()I", "enabledHintPaintColor", "disabledHintPaintColor$delegate", "getDisabledHintPaintColor", "disabledHintPaintColor", "Landroid/animation/ValueAnimator;", "hintAnimation", "Landroid/animation/ValueAnimator;", "Landroid/widget/ImageView;", "leftImageView", "Landroid/widget/ImageView;", "rightImageView", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "hint", "Companion", "HintPosition", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"UseKtx"})
/* loaded from: classes2.dex */
public final class TravelTextInputLayout extends ConstraintLayout {

    @NotNull
    private String _hint;
    private boolean autoClearError;
    private final float bgCornerRadius;

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final RectF bgRect;
    private Function1<? super Boolean, Unit> customOnFocusChangeListener;
    private final int disabledBgColor;

    /* renamed from: disabledHintPaintColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledHintPaintColor;
    private final int enabledBgColor;

    /* renamed from: enabledHintPaintColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j enabledHintPaintColor;

    @NotNull
    private final Paint errorBgPaint;
    private final int errorHeight;

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
    private TextView inputView;
    private boolean isEditable;
    private Boolean isHintRisen;
    private boolean isMultiline;

    @NotNull
    private final ImageView leftImageView;

    @NotNull
    private final ImageView rightImageView;
    private boolean showError;
    private final float unfocusedHintSize;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayout$HintPosition;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "getIntValue", "()I", "CENTER", "TOP", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HintPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ HintPosition[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int intValue;
        public static final HintPosition CENTER = new HintPosition("CENTER", 0, 0);
        public static final HintPosition TOP = new HintPosition("TOP", 1, 1);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayout$HintPosition$Companion;", "", "<init>", "()V", "fromInt", "Lru/ozon/app/android/travel/molecules/view/input/TravelTextInputLayout$HintPosition;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public TravelTextInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(TravelTextInputLayout travelTextInputLayout, Context context, View view) {
        TextView textView = travelTextInputLayout.inputView;
        if (textView == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        textView.requestFocus();
        Object systemService = context.getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        TextView textView2 = travelTextInputLayout.inputView;
        if (textView2 != null) {
            inputMethodManager.showSoftInput(textView2, 1);
        } else {
            Intrinsics.n("inputView");
            throw null;
        }
    }

    private final void centerHint(boolean withAnimation) {
        int i11 = 2;
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
        ofFloat.addUpdateListener(new C3599b(this, i11));
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void centerHint$lambda$23$lambda$22(TravelTextInputLayout travelTextInputLayout, ValueAnimator valueAnimator) {
        travelTextInputLayout.hintAnimationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        travelTextInputLayout.invalidate();
    }

    private final int getDisabledHintPaintColor() {
        return ((Number) this.disabledHintPaintColor.getValue()).intValue();
    }

    private final int getEnabledHintPaintColor() {
        return ((Number) this.enabledHintPaintColor.getValue()).intValue();
    }

    private final void riseHint(boolean withAnimation) {
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
        ofFloat.addUpdateListener(new C5795b(this, 3));
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void riseHint$lambda$21$lambda$20(TravelTextInputLayout travelTextInputLayout, ValueAnimator valueAnimator) {
        travelTextInputLayout.hintAnimationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        travelTextInputLayout.invalidate();
    }

    private final void setInputLayout(TextView child) {
        this.inputView = child;
        if (child == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        child.addOnLayoutChangeListener(new c(this, 0));
        child.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: oU.d
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                TravelTextInputLayout.setInputLayout$lambda$16$lambda$15(TravelTextInputLayout.this, view, z11);
            }
        });
        child.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout$setInputLayout$1$3
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Intrinsics.checkNotNullParameter(editable, "editable");
                TravelTextInputLayout.this.updateLayout(false);
                if (TravelTextInputLayout.this.getAutoClearError()) {
                    TravelTextInputLayout.this.setShowError(false);
                }
            }
        });
        child.setInputType(child.getInputType() | 524288);
        child.setTextAppearance(R$style.TextStyle_Body_L);
        child.setTextColor(child.getContext().getColorStateList(R$color.travel_text_input_color_edit_text));
        if (!this.isMultiline) {
            child.setMaxLines(1);
        }
        child.setBackground(null);
        child.setPadding(0, 0, 0, 0);
        child.setMinHeight(0);
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
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        bVar.setMarginStart(ResourceExtKt.toPx(8, context));
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
        dVar.f(this);
        updateLayout(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setInputLayout$lambda$16$lambda$15(TravelTextInputLayout travelTextInputLayout, View view, boolean z11) {
        Function1<? super Boolean, Unit> function1 = travelTextInputLayout.customOnFocusChangeListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
        updateLayout$default(travelTextInputLayout, false, 1, null);
    }

    public static /* synthetic */ void showLeftImageView$default(TravelTextInputLayout travelTextInputLayout, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            num = null;
        }
        travelTextInputLayout.showLeftImageView(i11, num);
    }

    public static /* synthetic */ void showRightImageView$default(TravelTextInputLayout travelTextInputLayout, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            num = null;
        }
        travelTextInputLayout.showRightImageView(i11, num);
    }

    private final float spToPx(float sp) {
        return TypedValue.applyDimension(2, sp, getContext().getResources().getDisplayMetrics());
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
    public static /* synthetic */ void updateLayout$default(TravelTextInputLayout travelTextInputLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        travelTextInputLayout.updateLayout(z11);
    }

    public final void addOnFocusChangeListener(@NotNull Function1<? super Boolean, Unit> onFocusChangeListener) {
        Intrinsics.checkNotNullParameter(onFocusChangeListener, "onFocusChangeListener");
        this.customOnFocusChangeListener = onFocusChangeListener;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof TextView) {
            setInputLayout((TextView) child);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(@NotNull Canvas canvas) {
        int i11;
        int i12;
        float height;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.bgRect.set(0.0f, 0.0f, getWidth(), getHeight());
        Paint paint = this.bgPaint;
        if (isEnabled()) {
            TextView textView = this.inputView;
            if (textView == null) {
                Intrinsics.n("inputView");
                throw null;
            }
            if (textView.isEnabled()) {
                i11 = this.enabledBgColor;
                paint.setColor(i11);
                RectF rectF = this.bgRect;
                float f7 = this.bgCornerRadius;
                canvas.drawRoundRect(rectF, f7, f7, this.bgPaint);
                if (this.showError) {
                    int save = canvas.save();
                    try {
                        this.bgRect.top = canvas.getHeight() - this.errorHeight;
                        canvas.clipRect(this.bgRect);
                        RectF rectF2 = this.bgRect;
                        rectF2.top = 0.0f;
                        float f11 = this.bgCornerRadius;
                        canvas.drawRoundRect(rectF2, f11, f11, this.errorBgPaint);
                    } finally {
                        canvas.restoreToCount(save);
                    }
                }
                super.draw(canvas);
                this.hintPaint.setColor(!isEnabled() ? getEnabledHintPaintColor() : getDisabledHintPaintColor());
                this.hintPaint.setTextSize(this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(this.unfocusedHintSize), (Number) Float.valueOf(this.focusedHintSize)).floatValue());
                float paddingLeft = this.leftImageView.getVisibility() != 0 ? this.hintLeftIconMargin + getPaddingLeft() : getPaddingLeft();
                Paint.FontMetrics fontMetrics = this.hintPaint.getFontMetrics();
                float abs = Math.abs(fontMetrics.descent + fontMetrics.ascent);
                i12 = WhenMappings.$EnumSwitchMapping$0[this.hintPosition.ordinal()];
                if (i12 != 1) {
                    height = (getHeight() / 2.0f) + (abs / 2);
                } else {
                    if (i12 != 2) {
                        throw new o();
                    }
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    height = ResourceExtKt.toPxF(13, context) + abs;
                }
                Float evaluate = this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(height), (Number) Float.valueOf(abs + getPaddingTop()));
                String str = this._hint;
                int length = get_hint().length();
                Intrinsics.f(evaluate);
                canvas.drawText(str, 0, length, paddingLeft, evaluate.floatValue(), this.hintPaint);
            }
        }
        i11 = this.disabledBgColor;
        paint.setColor(i11);
        RectF rectF3 = this.bgRect;
        float f72 = this.bgCornerRadius;
        canvas.drawRoundRect(rectF3, f72, f72, this.bgPaint);
        if (this.showError) {
        }
        super.draw(canvas);
        this.hintPaint.setColor(!isEnabled() ? getEnabledHintPaintColor() : getDisabledHintPaintColor());
        this.hintPaint.setTextSize(this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(this.unfocusedHintSize), (Number) Float.valueOf(this.focusedHintSize)).floatValue());
        float paddingLeft2 = this.leftImageView.getVisibility() != 0 ? this.hintLeftIconMargin + getPaddingLeft() : getPaddingLeft();
        Paint.FontMetrics fontMetrics2 = this.hintPaint.getFontMetrics();
        float abs2 = Math.abs(fontMetrics2.descent + fontMetrics2.ascent);
        i12 = WhenMappings.$EnumSwitchMapping$0[this.hintPosition.ordinal()];
        if (i12 != 1) {
        }
        Float evaluate2 = this.floatEvaluator.evaluate(this.hintAnimationProgress, (Number) Float.valueOf(height), (Number) Float.valueOf(abs2 + getPaddingTop()));
        String str2 = this._hint;
        int length2 = get_hint().length();
        Intrinsics.f(evaluate2);
        canvas.drawText(str2, 0, length2, paddingLeft2, evaluate2.floatValue(), this.hintPaint);
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

    public final void setRightImageviewClickListener(@NotNull Function1<? super View, Unit> onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.rightImageView.setOnClickListener(new g(onClickListener, 1));
    }

    public final void setShowError(boolean z11) {
        if (z11 != this.showError) {
            this.showError = z11;
            invalidate();
        }
    }

    public final void showLeftImageView(int vectorResId, Integer tintColor) {
        ImageView imageView = this.leftImageView;
        ImageViewExtKt.setVectorDrawable(imageView, vectorResId);
        ThemeExtKt.tint(imageView, tintColor);
        imageView.setVisibility(0);
    }

    public final void showRightImageView(int vectorResId, Integer tintColor) {
        ImageView imageView = this.rightImageView;
        ImageViewExtKt.setVectorDrawable(imageView, vectorResId);
        ThemeExtKt.tint(imageView, tintColor);
        imageView.setVisibility(0);
    }

    public /* synthetic */ TravelTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTextInputLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isEditable = true;
        this.hintAnimationProgress = 1.0f;
        this.floatEvaluator = new FloatEvaluator();
        this.focusedHintSize = spToPx(12.0f);
        this.unfocusedHintSize = spToPx(18.0f);
        this.bgCornerRadius = context.getResources().getDimensionPixelSize(R$dimen.mobilization_input_bg_radius);
        this.bgRect = new RectF();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ThemeExtKt.themeColor(context, R$attr.bgExpressPrimary));
        paint2.setStyle(style);
        this.errorBgPaint = paint2;
        this.errorHeight = context.getResources().getDimensionPixelSize(R$dimen.mobilization_input_error_width_selected);
        this._hint = "";
        HintPosition hintPosition = HintPosition.CENTER;
        this.hintPosition = hintPosition;
        this.hintLeftIconMargin = ResourceExtKt.toPxF(32, context);
        Paint paint3 = new Paint(1);
        paint3.setColor(ThemeExtKt.themeColor(context, R$attr.graphicSecondary));
        TextPaintExtKt.applyStyle(paint3, context, UniTextStyles.BODY_500_MEDIUM.getResId());
        this.hintPaint = paint3;
        this.enabledHintPaintColor = LazyUtilsKt.unsafeLazy(new TravelTextInputLayout$enabledHintPaintColor$2(context));
        this.disabledHintPaintColor = LazyUtilsKt.unsafeLazy(new TravelTextInputLayout$disabledHintPaintColor$2(context));
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.leftImageView);
        int px = ResourceExtKt.toPx(24, context);
        addView(imageView, new ViewGroup.LayoutParams(px, px));
        d dVar = new d();
        dVar.p(this);
        dVar.s(imageView.getId(), 6, 0, 6);
        dVar.s(imageView.getId(), 3, 0, 3);
        dVar.s(imageView.getId(), 4, 0, 4);
        dVar.f(this);
        imageView.setVisibility(8);
        this.leftImageView = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R$id.rightImageView);
        int px2 = ResourceExtKt.toPx(16, context);
        addView(imageView2, new ViewGroup.LayoutParams(px2, px2));
        d dVar2 = new d();
        dVar2.p(this);
        dVar2.s(imageView2.getId(), 7, 0, 7);
        dVar2.s(imageView2.getId(), 3, 0, 3);
        dVar2.s(imageView2.getId(), 4, 0, 4);
        dVar2.f(this);
        imageView2.setVisibility(8);
        this.rightImageView = imageView2;
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
        setOnClickListener(new QD.b(2, this, context));
        setWillNotDraw(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_side_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_top_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        int minHeight = getMinHeight();
        Integer valueOf = minHeight == 0 ? null : Integer.valueOf(minHeight);
        setMinHeight(valueOf != null ? valueOf.intValue() : getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
        if (this.isMultiline) {
            return;
        }
        setMaxHeight(getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
    }
}
