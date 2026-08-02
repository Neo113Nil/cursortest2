package ru.ozon.app.android.travel.molecules.view.input;

import Sc.InterfaceC4008j;
import Sc.o;
import Xc.a;
import Xc.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hL.ViewOnLayoutChangeListenerC6887a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.input.TravelEditTextInputLayoutV2;
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

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 }2\u00020\u0001:\u0002}~B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001aJ!\u0010 \u001a\u00020\u00112\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u001aJ\u0019\u0010$\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010%R\"\u0010(\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010%R*\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b-\u0010*\"\u0004\b.\u0010%R*\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u0010*\"\u0004\b1\u0010%R.\u00103\u001a\u0004\u0018\u0001022\b\u0010,\u001a\u0004\u0018\u0001028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010)\u001a\u0004\b:\u0010*\"\u0004\b;\u0010%R\u0018\u0010<\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010E\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010I\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u0014\u0010J\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010BR\u0014\u0010O\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010BR\u0014\u0010P\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010BR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00104R\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010BR\u0014\u0010\\\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010VR\u001b\u0010a\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001b\u0010d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010`R\u001b\u0010g\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010^\u001a\u0004\bf\u0010`R\u001b\u0010j\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010^\u001a\u0004\bi\u0010`R\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010pR\u0017\u0010s\u001a\u00020r8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR$\u0010|\u001a\u0002022\u0006\u0010,\u001a\u0002028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u00106\"\u0004\b{\u00108¨\u0006\u007f"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/input/TravelEditTextInputLayoutV2;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "vectorResId", "tintColor", "showLeftImageView", "(ILjava/lang/Integer;)V", "showRightImageView", "showMaskPatternView", "()V", "hideLeftImageView", "hideRightImageView", "hideMaskPatternView", "Lkotlin/Function1;", "onFocusChangeListener", "addOnFocusChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "setEditTextInputLayout", "withAnimation", "updateLayout", "(Z)V", "riseHint", "centerHint", "isEditable", "Z", "()Z", "setEditable", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isMultiline", "setMultiline", "showError", "getShowError", "setShowError", "", "maskPattern", "Ljava/lang/String;", "getMaskPattern", "()Ljava/lang/String;", "setMaskPattern", "(Ljava/lang/String;)V", "autoClearError", "getAutoClearError", "setAutoClearError", "isHintRisen", "Ljava/lang/Boolean;", "customOnFocusChangeListener", "Lkotlin/jvm/functions/Function1;", "", "animationProgress", "F", "strokeWidth1dp", "strokeWidth2dp", "inputTopMargin", "I", "inputMaskMargin", "leftImageSize", "rightImageSize", "inputMarginStart", "Landroid/animation/FloatEvaluator;", "floatEvaluator", "Landroid/animation/FloatEvaluator;", "focusedHintSize", "unfocusedHintSize", "bgCornerRadius", "Landroid/graphics/RectF;", "bgRect", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "strokeBgPaint", "Landroid/graphics/Paint;", "_hint", "Lru/ozon/app/android/travel/molecules/view/input/TravelEditTextInputLayoutV2$HintPosition;", "hintPosition", "Lru/ozon/app/android/travel/molecules/view/input/TravelEditTextInputLayoutV2$HintPosition;", "hintLeftIconMargin", "hintPaint", "maskPatternColor$delegate", "LSc/j;", "getMaskPatternColor", "()I", "maskPatternColor", "errorStrokeColor$delegate", "getErrorStrokeColor", "errorStrokeColor", "focusedStrokeColor$delegate", "getFocusedStrokeColor", "focusedStrokeColor", "unfocusedStrokeColor$delegate", "getUnfocusedStrokeColor", "unfocusedStrokeColor", "Landroid/animation/ValueAnimator;", "hintAnimation", "Landroid/animation/ValueAnimator;", "Landroidx/appcompat/widget/AppCompatImageView;", "leftImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "rightImageView", "Landroidx/appcompat/widget/AppCompatEditText;", "editTextInputView", "Landroidx/appcompat/widget/AppCompatEditText;", "getEditTextInputView", "()Landroidx/appcompat/widget/AppCompatEditText;", "Landroidx/appcompat/widget/AppCompatTextView;", "maskPatternView", "Landroidx/appcompat/widget/AppCompatTextView;", "getHint", "setHint", "hint", "Companion", "HintPosition", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes2.dex */
public final class TravelEditTextInputLayoutV2 extends ConstraintLayout {

    @NotNull
    private String _hint;
    private float animationProgress;
    private boolean autoClearError;
    private final float bgCornerRadius;

    @NotNull
    private final RectF bgRect;
    private Function1<? super Boolean, Unit> customOnFocusChangeListener;

    @NotNull
    private final AppCompatEditText editTextInputView;

    /* renamed from: errorStrokeColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j errorStrokeColor;

    @NotNull
    private final FloatEvaluator floatEvaluator;
    private final float focusedHintSize;

    /* renamed from: focusedStrokeColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j focusedStrokeColor;
    private ValueAnimator hintAnimation;
    private final float hintLeftIconMargin;

    @NotNull
    private final Paint hintPaint;

    @NotNull
    private HintPosition hintPosition;
    private final int inputMarginStart;
    private final int inputMaskMargin;
    private final int inputTopMargin;
    private boolean isEditable;
    private Boolean isHintRisen;
    private boolean isMultiline;
    private final int leftImageSize;

    @NotNull
    private final AppCompatImageView leftImageView;
    private String maskPattern;

    /* renamed from: maskPatternColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j maskPatternColor;

    @NotNull
    private final AppCompatTextView maskPatternView;
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
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/input/TravelEditTextInputLayoutV2$HintPosition;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "getIntValue", "()I", "CENTER", "TOP", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HintPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ HintPosition[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int intValue;
        public static final HintPosition CENTER = new HintPosition("CENTER", 0, 0);
        public static final HintPosition TOP = new HintPosition("TOP", 1, 1);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/input/TravelEditTextInputLayoutV2$HintPosition$Companion;", "", "<init>", "()V", "fromInt", "Lru/ozon/app/android/travel/molecules/view/input/TravelEditTextInputLayoutV2$HintPosition;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public TravelEditTextInputLayoutV2(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$12(TravelEditTextInputLayoutV2 travelEditTextInputLayoutV2, Context context, View view) {
        travelEditTextInputLayoutV2.editTextInputView.requestFocus();
        Object systemService = context.getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(travelEditTextInputLayoutV2.editTextInputView, 1);
    }

    private final void centerHint(boolean withAnimation) {
        Editable text = this.editTextInputView.getText();
        if (text == null || text.length() == 0) {
            hideMaskPatternView();
        }
        if (!withAnimation) {
            this.animationProgress = 0.0f;
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.hintAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.animationProgress, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oU.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TravelEditTextInputLayoutV2.centerHint$lambda$28$lambda$27(TravelEditTextInputLayoutV2.this, valueAnimator2);
            }
        });
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void centerHint$lambda$28$lambda$27(TravelEditTextInputLayoutV2 travelEditTextInputLayoutV2, ValueAnimator valueAnimator) {
        travelEditTextInputLayoutV2.animationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        travelEditTextInputLayoutV2.invalidate();
    }

    private final int getErrorStrokeColor() {
        return ((Number) this.errorStrokeColor.getValue()).intValue();
    }

    private final int getFocusedStrokeColor() {
        return ((Number) this.focusedStrokeColor.getValue()).intValue();
    }

    private final int getMaskPatternColor() {
        return ((Number) this.maskPatternColor.getValue()).intValue();
    }

    private final int getUnfocusedStrokeColor() {
        return ((Number) this.unfocusedStrokeColor.getValue()).intValue();
    }

    private final void riseHint(boolean withAnimation) {
        int i11 = 1;
        ValueAnimator valueAnimator = this.hintAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!withAnimation) {
            this.animationProgress = 1.0f;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.animationProgress, 1.0f);
        ofFloat.addUpdateListener(new Lt.b(this, i11));
        ofFloat.setDuration(200L);
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.molecules.view.input.TravelEditTextInputLayoutV2$riseHint$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Editable text = TravelEditTextInputLayoutV2.this.getEditTextInputView().getText();
                if (text == null || text.length() == 0) {
                    TravelEditTextInputLayoutV2.this.showMaskPatternView();
                }
            }
        });
        this.hintAnimation = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void riseHint$lambda$26$lambda$25(TravelEditTextInputLayoutV2 travelEditTextInputLayoutV2, ValueAnimator valueAnimator) {
        travelEditTextInputLayoutV2.animationProgress = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        travelEditTextInputLayoutV2.invalidate();
    }

    private final void setEditTextInputLayout() {
        AppCompatEditText appCompatEditText = this.editTextInputView;
        appCompatEditText.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC6887a(this, 1));
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: oU.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                TravelEditTextInputLayoutV2.setEditTextInputLayout$lambda$21$lambda$20(TravelEditTextInputLayoutV2.this, view, z11);
            }
        });
        appCompatEditText.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.travel.molecules.view.input.TravelEditTextInputLayoutV2$setEditTextInputLayout$1$3
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Intrinsics.checkNotNullParameter(editable, "editable");
                TravelEditTextInputLayoutV2.this.updateLayout(false);
                if (TravelEditTextInputLayoutV2.this.getAutoClearError()) {
                    TravelEditTextInputLayoutV2.this.setShowError(false);
                }
            }
        });
        appCompatEditText.setInputType(appCompatEditText.getInputType() | 524288);
        appCompatEditText.setTextAppearance(R$style.OzonTextAppearance_Compact_500medium);
        appCompatEditText.setTextColor(appCompatEditText.getContext().getColorStateList(R$color.travel_text_input_v2_color_edit_text));
        if (!this.isMultiline) {
            appCompatEditText.setMaxLines(1);
        }
        appCompatEditText.setBackground(null);
        appCompatEditText.setPadding(0, 0, 0, 0);
        appCompatEditText.setMinHeight(0);
        this.hintPaint.setTextSize(this.focusedHintSize);
        Paint.FontMetrics fontMetrics = this.hintPaint.getFontMetrics();
        float abs = Math.abs((fontMetrics.descent + fontMetrics.ascent) - fontMetrics.bottom);
        ViewGroup.LayoutParams layoutParams = this.editTextInputView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) abs;
        bVar.setMarginStart(this.inputMarginStart);
        bVar.f41594A = 0;
        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
        d dVar = new d();
        dVar.p(this);
        dVar.s(this.editTextInputView.getId(), 6, this.leftImageView.getId(), 7);
        dVar.s(this.editTextInputView.getId(), 7, this.rightImageView.getId(), 6);
        dVar.s(this.editTextInputView.getId(), 3, 0, 3);
        dVar.s(this.editTextInputView.getId(), 4, 0, 4);
        dVar.f(this);
        updateLayout(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEditTextInputLayout$lambda$21$lambda$20(TravelEditTextInputLayoutV2 travelEditTextInputLayoutV2, View view, boolean z11) {
        Function1<? super Boolean, Unit> function1 = travelEditTextInputLayoutV2.customOnFocusChangeListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
        updateLayout$default(travelEditTextInputLayoutV2, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMaskPatternView$lambda$18$lambda$17(TravelEditTextInputLayoutV2 travelEditTextInputLayoutV2, ValueAnimator valueAnimator) {
        travelEditTextInputLayoutV2.maskPatternView.setAlpha(((Float) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
        travelEditTextInputLayoutV2.maskPatternView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayout(boolean withAnimation) {
        Editable text;
        boolean z11 = this.editTextInputView.isFocused() || !((text = this.editTextInputView.getText()) == null || text.length() == 0);
        if (Boolean.valueOf(z11).equals(this.isHintRisen)) {
            invalidate();
            return;
        }
        this.isHintRisen = Boolean.valueOf(z11);
        if (z11) {
            riseHint(withAnimation);
        } else {
            centerHint(withAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void updateLayout$default(TravelEditTextInputLayoutV2 travelEditTextInputLayoutV2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        travelEditTextInputLayoutV2.updateLayout(z11);
    }

    public final void addOnFocusChangeListener(@NotNull Function1<? super Boolean, Unit> onFocusChangeListener) {
        Intrinsics.checkNotNullParameter(onFocusChangeListener, "onFocusChangeListener");
        this.customOnFocusChangeListener = onFocusChangeListener;
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
        } else if (this.editTextInputView.isFocused()) {
            this.strokeBgPaint.setColor(getFocusedStrokeColor());
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
        this.hintPaint.setTextSize(this.floatEvaluator.evaluate(this.animationProgress, (Number) Float.valueOf(this.unfocusedHintSize), (Number) Float.valueOf(this.focusedHintSize)).floatValue());
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
        Float evaluate = this.floatEvaluator.evaluate(this.animationProgress, (Number) Float.valueOf(height), (Number) Float.valueOf(abs + this.inputTopMargin));
        String str = this._hint;
        int length = get_hint().length();
        Intrinsics.f(evaluate);
        canvas.drawText(str, 0, length, paddingLeft, evaluate.floatValue(), this.hintPaint);
    }

    public final boolean getAutoClearError() {
        return this.autoClearError;
    }

    @NotNull
    public final AppCompatEditText getEditTextInputView() {
        return this.editTextInputView;
    }

    @NotNull
    /* renamed from: getHint, reason: from getter */
    public final String get_hint() {
        return this._hint;
    }

    public final void hideLeftImageView() {
        this.leftImageView.setVisibility(8);
    }

    public final void hideMaskPatternView() {
        this.maskPatternView.setVisibility(8);
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

    public final void setMaskPattern(String str) {
        this.maskPattern = str;
        AppCompatTextView appCompatTextView = this.maskPatternView;
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    public final void setMultiline(boolean z11) {
        if (this.isMultiline != z11) {
            this.isMultiline = z11;
            if (z11) {
                this.editTextInputView.setMaxLines(Integer.MAX_VALUE);
                setMaxHeight(Integer.MAX_VALUE);
            } else {
                this.editTextInputView.setMaxLines(1);
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

    public final void showMaskPatternView() {
        String str = this.maskPattern;
        if (str == null || str.length() == 0) {
            return;
        }
        this.maskPatternView.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.animationProgress);
        ofFloat.addUpdateListener(new AX.a(this, 4));
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    public final void showRightImageView(int vectorResId, Integer tintColor) {
        AppCompatImageView appCompatImageView = this.rightImageView;
        ImageViewExtKt.setVectorDrawable(appCompatImageView, vectorResId);
        ThemeExtKt.tint(appCompatImageView, tintColor);
        appCompatImageView.setVisibility(0);
    }

    public /* synthetic */ TravelEditTextInputLayoutV2(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelEditTextInputLayoutV2(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isEditable = true;
        this.animationProgress = 1.0f;
        float pxF = ResourceExtKt.toPxF(1, context);
        this.strokeWidth1dp = pxF;
        this.strokeWidth2dp = ResourceExtKt.toPxF(2, context);
        this.inputTopMargin = ResourceExtKt.toPx(12, context);
        int px = ResourceExtKt.toPx(4, context);
        this.inputMaskMargin = px;
        int px2 = ResourceExtKt.toPx(24, context);
        this.leftImageSize = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.rightImageSize = px3;
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
        this.maskPatternColor = LazyUtilsKt.unsafeLazy(new TravelEditTextInputLayoutV2$maskPatternColor$2(context));
        this.errorStrokeColor = LazyUtilsKt.unsafeLazy(new TravelEditTextInputLayoutV2$errorStrokeColor$2(context));
        this.focusedStrokeColor = LazyUtilsKt.unsafeLazy(new TravelEditTextInputLayoutV2$focusedStrokeColor$2(context));
        this.unfocusedStrokeColor = LazyUtilsKt.unsafeLazy(new TravelEditTextInputLayoutV2$unfocusedStrokeColor$2(context));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.leftImageView);
        addView(appCompatImageView, new ViewGroup.LayoutParams(px2, px2));
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
        addView(appCompatImageView2, new ViewGroup.LayoutParams(px3, px3));
        d dVar2 = new d();
        dVar2.p(this);
        dVar2.s(appCompatImageView2.getId(), 7, 0, 7);
        dVar2.s(appCompatImageView2.getId(), 3, 0, 3);
        dVar2.s(appCompatImageView2.getId(), 4, 0, 4);
        dVar2.f(this);
        appCompatImageView2.setVisibility(8);
        ViewExtensionsKt.performClickOnTargetView(this, this);
        this.rightImageView = appCompatImageView2;
        AppCompatEditText appCompatEditText = new AppCompatEditText(context);
        appCompatEditText.setId(R$id.editTextInputView);
        addView(appCompatEditText, new ViewGroup.LayoutParams(0, -2));
        this.editTextInputView = appCompatEditText;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.maskPatternView);
        appCompatTextView.setTextAppearance(R$style.OzonTextAppearance_Compact_500medium);
        appCompatTextView.setTextColor(getMaskPatternColor());
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setBackground(null);
        ViewExtensionsKt.performClickOnTargetView(appCompatTextView, this);
        addView(appCompatTextView, new ViewGroup.LayoutParams(0, -2));
        d dVar3 = new d();
        dVar3.p(this);
        dVar3.t(appCompatTextView.getId(), 6, appCompatEditText.getId(), 6, px);
        dVar3.s(appCompatTextView.getId(), 7, appCompatEditText.getId(), 7);
        dVar3.s(appCompatTextView.getId(), 3, appCompatEditText.getId(), 3);
        dVar3.s(appCompatTextView.getId(), 4, appCompatEditText.getId(), 4);
        dVar3.f(this);
        appCompatTextView.setVisibility(8);
        ViewExtensionsKt.performClickOnTargetView(this, this);
        this.maskPatternView = appCompatTextView;
        int[] TravelTextInputLayout = R$styleable.TravelTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(TravelTextInputLayout, "TravelTextInputLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TravelTextInputLayout, 0, 0);
        String string = obtainStyledAttributes.getString(R$styleable.TravelTextInputLayout_ttil_hint);
        this._hint = string != null ? string : "";
        this.autoClearError = obtainStyledAttributes.getBoolean(R$styleable.TravelTextInputLayout_ttil_auto_clear_error, false);
        this.hintPosition = HintPosition.INSTANCE.fromInt(obtainStyledAttributes.getInteger(R$styleable.TravelTextInputLayout_ttil_hintPosition, hintPosition.getIntValue()));
        this.isEditable = obtainStyledAttributes.getBoolean(R$styleable.TravelTextInputLayout_ttil_isEditable, true);
        setMultiline(obtainStyledAttributes.getBoolean(R$styleable.TravelTextInputLayout_ttil_isMultiline, false));
        obtainStyledAttributes.recycle();
        setOnClickListener(new Hx.b(5, this, context));
        setWillNotDraw(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_side_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.mobilization_edit_text_top_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        int minHeight = getMinHeight();
        Integer valueOf = minHeight == 0 ? null : Integer.valueOf(minHeight);
        setMinHeight(valueOf != null ? valueOf.intValue() : getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
        if (!this.isMultiline) {
            setMaxHeight(getResources().getDimensionPixelSize(R$dimen.mobilization_input_element_height));
        }
        setEditTextInputLayout();
    }
}
