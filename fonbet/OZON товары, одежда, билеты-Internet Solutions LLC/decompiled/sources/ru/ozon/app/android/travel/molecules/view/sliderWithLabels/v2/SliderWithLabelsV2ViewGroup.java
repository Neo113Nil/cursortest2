package ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2;

import Hj.C3143a;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.ranges.h;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour;
import ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2ViewGroup;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\b\u0007\u0018\u0000 \u008d\u00012\u00020\u00012\u00020\u0002:\b\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\bH\u0014J(\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0014J0\u0010P\u001a\u00020H2\u0006\u0010Q\u001a\u00020:2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\bH\u0014J\u0010\u0010V\u001a\u00020H2\u0006\u0010W\u001a\u00020XH\u0014J\u0010\u0010Y\u001a\u00020:2\u0006\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020:H\u0016J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010^J\u0018\u0010_\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\b2\u0006\u0010a\u001a\u00020\bH\u0016J\u0016\u0010b\u001a\u00020\u00002\f\u0010c\u001a\b\u0012\u0004\u0012\u00020e0dH\u0016J\u0012\u0010f\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010gH\u0016J\u0010\u0010h\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\u0015H\u0016J\u0010\u0010i\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\u0017H\u0016J\b\u0010j\u001a\u00020HH\u0002J\u0010\u0010k\u001a\u00020H2\u0006\u0010W\u001a\u00020XH\u0002J\b\u0010l\u001a\u00020HH\u0002J\b\u0010m\u001a\u00020HH\u0002J\b\u0010n\u001a\u00020HH\u0002J\b\u0010o\u001a\u00020\bH\u0002J\b\u0010p\u001a\u00020\bH\u0002J\u0018\u0010q\u001a\u00020H2\u0006\u0010r\u001a\u00020\b2\u0006\u0010s\u001a\u00020\bH\u0002J\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00020\b01H\u0002J\u0010\u0010u\u001a\u00020H2\u0006\u0010v\u001a\u00020AH\u0002J\b\u0010w\u001a\u00020HH\u0002J \u0010x\u001a\u00020\u001a2\u0006\u0010y\u001a\u00020\b2\u0006\u0010z\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001aH\u0002J \u0010|\u001a\u00020\b2\u0006\u0010}\u001a\u00020\u001a2\u0006\u0010z\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001aH\u0002J \u0010~\u001a\u00020H2\u0006\u0010\u007f\u001a\u00020\u001a2\u0006\u0010z\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001aH\u0002J\u0012\u0010\u0080\u0001\u001a\u00020H2\u0007\u0010\u0081\u0001\u001a\u00020AH\u0002J \u0010\u0082\u0001\u001a\u00020\b2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\b0d2\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\u0084\u0001\u001a\u00020\b2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\b0d2\u0006\u0010\u0007\u001a\u00020\bH\u0002J)\u0010\u0085\u0001\u001a\u00020\b2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\b0d2\u0006\u0010\u0007\u001a\u00020\b2\u0007\u0010\u0086\u0001\u001a\u00020:H\u0002J \u0010\u0087\u0001\u001a\u00020\b2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\b0d2\u0006\u0010\u0007\u001a\u00020\bH\u0002J3\u0010\u0088\u0001\u001a\u00020A2\u0006\u0010}\u001a\u00020\u001a2\u0007\u0010\u0089\u0001\u001a\u00020\u001a2\u0006\u0010z\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001a2\u0007\u0010\u008a\u0001\u001a\u00020\u001aH\u0002J\u0011\u0010\u008b\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\t\u0010\u008c\u0001\u001a\u00020HH\u0002R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u000bR\u001e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u000bR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0014\u0010&\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0014\u0010(\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0014\u0010*\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010!R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\b01X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u001aX\u0082D¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020C01X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0091\u0001"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2Behaviour;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "min", "setMin", "(I)V", "max", "setMax", "initialMinValue", "initialMaxValue", "stepSize", "setStepSize", "maxRange", "setMaxRange", "onValueChanged", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2Behaviour$OnValueChangeListener;", "onFinalValueChanged", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2Behaviour$OnFinalValueListener;", "barHeight", "cornerRadius", "", "thumbRadius", "barPaint", "Landroid/graphics/Paint;", "barHighlightPaint", "thumbDiameter", "getThumbDiameter", "()F", "touchRadius", "getTouchRadius", "cornerR", "getCornerR", "startX", "getStartX", "endX", "getEndX", "barCenterY", "getBarCenterY", "trackRect", "Landroid/graphics/RectF;", "activeRect", "contentWidthPx", "steps", "", "minIndex", "maxIndex", "segmentWeights", "", "prefixSums", "totalWeight", "baseSegmentWeight", "touchOnlyOnThumbs", "", "touchSlop", "isDragging", "activePointerId", "downX", "downY", "activeThumb", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Thumb;", "visibleLabels", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$VisibleLabel;", "minThumbView", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/ThumbView;", "maxThumbView", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "newWidth", "newHeight", "oldWidth", "oldHeight", "onLayout", "changed", "left", "top", "right", "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "performClick", "setStep", "(Ljava/lang/Integer;)Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup;", "setInitialRange", "minValue", "maxValue", "setPoints", "pointsList", "", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;", "setAutomatizationId", "", "setOnValueChangedListener", "setOnFinalValueChangedListener", "computeLabelPositions", "drawLabels", "rebuildStepsAndInvalidate", "rebuildAllNow", "snapAndNormalize", "getMinValue", "getMaxValue", "applyBaseStepsAndIndices", "minV", "maxV", "buildBaseSteps", "rebuildStepsWithExtraStep", "inactiveThumb", "recomputeSegmentWeights", "indexToX", "index", "leftBound", "rightBound", "xToNearestIndex", "touchX", "updateIndexForX", "rawTouchX", "enforceMaxDistanceAfterMove", "moved", "firstIndexOf", "list", "lastIndexOf", "indexForValue", "preferRight", "nearestIndexByValue", "pickThumb", "touchY", "centerY", "clampToStep", "layoutThumbViews", "Companion", "Thumb", "Label", "VisibleLabel", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SliderWithLabelsV2ViewGroup extends ViewGroup implements SliderWithLabelsV2Behaviour {
    private int activePointerId;

    @NotNull
    private final RectF activeRect;

    @NotNull
    private Thumb activeThumb;
    private int barHeight;

    @NotNull
    private final Paint barHighlightPaint;

    @NotNull
    private final Paint barPaint;
    private final float baseSegmentWeight;
    private float contentWidthPx;
    private float cornerRadius;
    private float downX;
    private float downY;
    private int initialMaxValue;
    private int initialMinValue;
    private boolean isDragging;
    private int max;
    private int maxIndex;
    private int maxRange;

    @NotNull
    private final ThumbView maxThumbView;
    private int min;
    private int minIndex;

    @NotNull
    private final ThumbView minThumbView;
    private SliderWithLabelsV2Behaviour.OnFinalValueListener onFinalValueChanged;
    private SliderWithLabelsV2Behaviour.OnValueChangeListener onValueChanged;

    @NotNull
    private float[] prefixSums;

    @NotNull
    private float[] segmentWeights;
    private int stepSize;

    @NotNull
    private List<Integer> steps;
    private float thumbRadius;
    private float totalWeight;
    private boolean touchOnlyOnThumbs;
    private final int touchSlop;

    @NotNull
    private final RectF trackRect;

    @NotNull
    private final List<VisibleLabel> visibleLabels;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Companion;", "", "<init>", "()V", "LOCATOR_THUMB_MIN", "", "LOCATOR_THUMB_MAX", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "I", "getValue", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Label {

        @NotNull
        private final TextDTO text;
        private final int value;

        public Label(@NotNull TextDTO text, int i11) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.value = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Label)) {
                return false;
            }
            Label label = (Label) other;
            return Intrinsics.d(this.text, label.text) && this.value == label.value;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value) + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Label(text=" + this.text + ", value=" + this.value + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Thumb;", "", "<init>", "(Ljava/lang/String;I)V", "MIN", "MAX", "NONE", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Thumb {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Thumb[] $VALUES;
        public static final Thumb MIN = new Thumb("MIN", 0);
        public static final Thumb MAX = new Thumb("MAX", 1);
        public static final Thumb NONE = new Thumb("NONE", 2);

        private static final /* synthetic */ Thumb[] $values() {
            return new Thumb[]{MIN, MAX, NONE};
        }

        static {
            Thumb[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Thumb(String str, int i11) {
        }

        public static Thumb valueOf(String str) {
            return (Thumb) Enum.valueOf(Thumb.class, str);
        }

        public static Thumb[] values() {
            return (Thumb[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Thumb.values().length];
            try {
                iArr[Thumb.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Thumb.MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderWithLabelsV2ViewGroup(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.min = 2;
        this.max = 21;
        this.initialMinValue = 5;
        this.initialMaxValue = 7;
        this.stepSize = 1;
        this.maxRange = Integer.MAX_VALUE;
        this.barHeight = ResourceExtKt.toPx(Paddings.PADDING_200.getPx(), context);
        this.cornerRadius = ResourceExtKt.toPxF(2, context);
        this.thumbRadius = ResourceExtKt.toPxF(CornerRadius.RADIUS_400.getPx(), context);
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.bgOverlap));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.barPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        paint2.setStyle(style);
        this.barHighlightPaint = paint2;
        this.trackRect = new RectF();
        this.activeRect = new RectF();
        this.steps = new ArrayList();
        this.segmentWeights = new float[]{1.0f};
        this.prefixSums = new float[]{0.0f};
        this.totalWeight = 1.0f;
        this.baseSegmentWeight = 1.0f;
        this.touchOnlyOnThumbs = true;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.activePointerId = -1;
        this.activeThumb = Thumb.NONE;
        this.visibleLabels = new ArrayList();
        ThumbView thumbView = new ThumbView(context);
        thumbView.setLayoutParams(new ViewGroup.LayoutParams((int) getThumbDiameter(), (int) getThumbDiameter()));
        thumbView.setContentDescription("Slider_Thumb_Min");
        this.minThumbView = thumbView;
        ThumbView thumbView2 = new ThumbView(context);
        thumbView2.setLayoutParams(new ViewGroup.LayoutParams((int) getThumbDiameter(), (int) getThumbDiameter()));
        thumbView2.setContentDescription("Slider_Thumb_Max");
        this.maxThumbView = thumbView2;
        setWillNotDraw(false);
        snapAndNormalize();
        rebuildAllNow();
        addView(thumbView);
        addView(thumbView2);
    }

    private final void applyBaseStepsAndIndices(int minV, int maxV) {
        List<Integer> buildBaseSteps = buildBaseSteps();
        if (minV != maxV) {
            this.steps = buildBaseSteps;
            this.minIndex = indexForValue(buildBaseSteps, minV, false);
            this.maxIndex = indexForValue(this.steps, maxV, true);
            this.initialMinValue = this.steps.get(this.minIndex).intValue();
            this.initialMaxValue = this.steps.get(this.maxIndex).intValue();
            rebuildStepsWithExtraStep(Thumb.MIN);
            return;
        }
        int indexForValue = indexForValue(buildBaseSteps, minV, false);
        int intValue = buildBaseSteps.get(indexForValue).intValue();
        int i11 = indexForValue + 1;
        int size = buildBaseSteps.size();
        if (i11 <= size) {
            size = i11;
        }
        buildBaseSteps.add(size, Integer.valueOf(intValue));
        this.steps = buildBaseSteps;
        this.minIndex = indexForValue;
        this.maxIndex = i11;
        this.initialMinValue = buildBaseSteps.get(indexForValue).intValue();
        this.initialMaxValue = this.steps.get(this.maxIndex).intValue();
        recomputeSegmentWeights();
    }

    private final List<Integer> buildBaseSteps() {
        ArrayList arrayList = new ArrayList();
        int i11 = this.min;
        while (true) {
            arrayList.add(Integer.valueOf(i11));
            int i12 = this.max;
            if (i11 >= i12) {
                return arrayList;
            }
            i11 += this.stepSize;
            if (i11 > i12) {
                i11 = i12;
            }
        }
    }

    private final int clampToStep(int value) {
        float rint = ((float) Math.rint((value - this.min) / this.stepSize)) * this.stepSize;
        int i11 = this.min;
        return h.e((int) (rint + i11), i11, this.max);
    }

    private final void computeLabelPositions() {
        if (this.visibleLabels.isEmpty()) {
            return;
        }
        float paddingStart = getPaddingStart();
        float width = getWidth() - getPaddingEnd();
        VisibleLabel visibleLabel = (VisibleLabel) C7714v.Q(0, this.visibleLabels);
        if (visibleLabel != null) {
            visibleLabel.getTextPosition().x = paddingStart;
        }
        VisibleLabel visibleLabel2 = (VisibleLabel) C7714v.Q(1, this.visibleLabels);
        if (visibleLabel2 != null) {
            visibleLabel2.getTextPosition().x = width - visibleLabel2.getView().getMeasuredWidth();
        }
    }

    private final void drawLabels(Canvas canvas) {
        if (this.visibleLabels.isEmpty()) {
            return;
        }
        for (VisibleLabel visibleLabel : this.visibleLabels) {
            float f7 = visibleLabel.getTextPosition().x;
            float f11 = visibleLabel.getTextPosition().y;
            int save = canvas.save();
            canvas.translate(f7, f11);
            try {
                visibleLabel.getView().draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    private final void enforceMaxDistanceAfterMove(Thumb moved) {
        if (this.maxRange == Integer.MAX_VALUE) {
            return;
        }
        int intValue = this.steps.get(this.minIndex).intValue();
        int intValue2 = this.steps.get(this.maxIndex).intValue();
        int i11 = this.maxRange;
        if (intValue2 - intValue <= i11) {
            return;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[moved.ordinal()];
        if (i12 == 1) {
            int i13 = intValue + i11;
            int i14 = this.max;
            if (i13 > i14) {
                i13 = i14;
            }
            int indexForValue = indexForValue(this.steps, i13, true);
            this.maxIndex = indexForValue;
            this.initialMaxValue = this.steps.get(indexForValue).intValue();
            rebuildStepsWithExtraStep(Thumb.MAX);
            return;
        }
        if (i12 != 2) {
            return;
        }
        int i15 = intValue2 - i11;
        int i16 = this.min;
        if (i15 < i16) {
            i15 = i16;
        }
        int indexForValue2 = indexForValue(this.steps, i15, false);
        this.minIndex = indexForValue2;
        this.initialMinValue = this.steps.get(indexForValue2).intValue();
        rebuildStepsWithExtraStep(Thumb.MIN);
    }

    private final int firstIndexOf(List<Integer> list, int value) {
        int indexOf = list.indexOf(Integer.valueOf(value));
        return indexOf >= 0 ? indexOf : nearestIndexByValue(list, value);
    }

    private final float getBarCenterY() {
        return (getThumbDiameter() / 2.0f) + getPaddingTop();
    }

    private final float getCornerR() {
        float f7 = this.barHeight / 2.0f;
        float f11 = this.cornerRadius;
        return f7 < f11 ? f11 : f7;
    }

    private final float getEndX() {
        return (getWidth() - getPaddingEnd()) - this.thumbRadius;
    }

    private final int getMaxValue() {
        Integer num = (Integer) C7714v.Q(this.maxIndex, this.steps);
        return num != null ? num.intValue() : this.initialMaxValue;
    }

    private final int getMinValue() {
        Integer num = (Integer) C7714v.Q(this.minIndex, this.steps);
        return num != null ? num.intValue() : this.initialMinValue;
    }

    private final float getStartX() {
        return getPaddingStart() + this.thumbRadius;
    }

    private final float getThumbDiameter() {
        return this.thumbRadius * 2;
    }

    private final float getTouchRadius() {
        return getThumbDiameter();
    }

    private final int indexForValue(List<Integer> list, int value, boolean preferRight) {
        int indexOf = list.indexOf(Integer.valueOf(value));
        if (indexOf < 0) {
            return nearestIndexByValue(list, value);
        }
        int lastIndexOf = list.lastIndexOf(Integer.valueOf(value));
        return (indexOf != lastIndexOf && preferRight) ? lastIndexOf : indexOf;
    }

    private final float indexToX(int index, float leftBound, float rightBound) {
        return this.steps.size() <= 1 ? leftBound : C3143a.d(rightBound, leftBound, this.prefixSums[index] / this.totalWeight, leftBound);
    }

    private final int lastIndexOf(List<Integer> list, int value) {
        int lastIndexOf = list.lastIndexOf(Integer.valueOf(value));
        return lastIndexOf >= 0 ? lastIndexOf : nearestIndexByValue(list, value);
    }

    private final void layoutThumbViews() {
        float indexToX = indexToX(this.minIndex, getStartX(), getEndX());
        float indexToX2 = indexToX(this.maxIndex, getStartX(), getEndX());
        float barCenterY = getBarCenterY();
        this.minThumbView.layoutThumb(indexToX, barCenterY, this.thumbRadius);
        this.maxThumbView.layoutThumb(indexToX2, barCenterY, this.thumbRadius);
    }

    private final int nearestIndexByValue(List<Integer> list, int value) {
        int size = list.size();
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int abs = Math.abs(list.get(i13).intValue() - value);
            if (abs < i11) {
                i12 = i13;
                i11 = abs;
            }
        }
        return i12;
    }

    private final Thumb pickThumb(float touchX, float touchY, float leftBound, float rightBound, float centerY) {
        float indexToX = indexToX(this.minIndex, leftBound, rightBound);
        float indexToX2 = indexToX(this.maxIndex, leftBound, rightBound);
        if (!this.touchOnlyOnThumbs) {
            return Math.abs(touchY - centerY) <= getThumbDiameter() ? Math.abs(touchX - indexToX) <= Math.abs(touchX - indexToX2) ? Thumb.MIN : Thumb.MAX : Thumb.NONE;
        }
        double d11 = touchY - centerY;
        float hypot = (float) Math.hypot(touchX - indexToX, d11);
        float hypot2 = (float) Math.hypot(touchX - indexToX2, d11);
        if (hypot > getTouchRadius() && hypot2 > getTouchRadius()) {
            return Thumb.NONE;
        }
        if (hypot < hypot2) {
            return Thumb.MIN;
        }
        if (hypot2 >= hypot && touchX < indexToX) {
            return Thumb.MIN;
        }
        return Thumb.MAX;
    }

    private final void rebuildAllNow() {
        if (this.stepSize < 1) {
            throw new IllegalArgumentException("step must be >= 1");
        }
        if (this.min >= this.max) {
            throw new IllegalArgumentException("min must be < max");
        }
        applyBaseStepsAndIndices(Math.min(this.initialMinValue, this.initialMaxValue), Math.max(this.initialMinValue, this.initialMaxValue));
        recomputeSegmentWeights();
    }

    private final void rebuildStepsAndInvalidate() {
        rebuildAllNow();
        requestLayout();
    }

    private final void rebuildStepsWithExtraStep(Thumb inactiveThumb) {
        List<Integer> buildBaseSteps = buildBaseSteps();
        Integer num = (Integer) C7714v.Q(this.minIndex, this.steps);
        int intValue = num != null ? num.intValue() : this.initialMinValue;
        Integer num2 = (Integer) C7714v.Q(this.maxIndex, this.steps);
        int intValue2 = num2 != null ? num2.intValue() : this.initialMaxValue;
        int e11 = h.e(((inactiveThumb == Thumb.MIN ? intValue : intValue2) - this.min) / this.stepSize, 0, buildBaseSteps.size() - 1);
        int i11 = WhenMappings.$EnumSwitchMapping$0[inactiveThumb.ordinal()];
        if (i11 == 1) {
            int i12 = e11 + 1;
            int size = buildBaseSteps.size();
            if (i12 > size) {
                i12 = size;
            }
            buildBaseSteps.add(i12, buildBaseSteps.get(e11));
            this.minIndex = firstIndexOf(buildBaseSteps, intValue);
            this.maxIndex = indexForValue(buildBaseSteps, intValue2, true);
        } else if (i11 == 2) {
            buildBaseSteps.add(h.e(e11, 0, buildBaseSteps.size()), buildBaseSteps.get(e11));
            this.maxIndex = lastIndexOf(buildBaseSteps, intValue2);
            this.minIndex = indexForValue(buildBaseSteps, intValue, false);
        }
        this.steps = buildBaseSteps;
        this.initialMinValue = buildBaseSteps.get(this.minIndex).intValue();
        this.initialMaxValue = this.steps.get(this.maxIndex).intValue();
        int i13 = this.minIndex;
        int i14 = this.maxIndex;
        if (i13 > i14) {
            this.minIndex = i14;
            this.maxIndex = i13;
        }
        recomputeSegmentWeights();
        invalidate();
    }

    private final void recomputeSegmentWeights() {
        int size = this.steps.size();
        if (size <= 1) {
            this.segmentWeights = new float[]{1.0f};
            this.prefixSums = new float[]{0.0f};
            this.totalWeight = 1.0f;
            return;
        }
        int i11 = size - 1;
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = this.baseSegmentWeight;
        }
        this.segmentWeights = fArr;
        int i13 = 0;
        while (true) {
            if (i13 >= i11) {
                i13 = -1;
                break;
            }
            int i14 = i13 + 1;
            if (this.steps.get(i13).intValue() == this.steps.get(i14).intValue()) {
                break;
            } else {
                i13 = i14;
            }
        }
        if (i13 >= 0) {
            float length = (this.segmentWeights.length - 1) * this.baseSegmentWeight;
            float thumbDiameter = getThumbDiameter();
            float f7 = this.contentWidthPx;
            this.segmentWeights[i13] = f7 > thumbDiameter + 1.0f ? Math.max(this.baseSegmentWeight, (length * thumbDiameter) / (f7 - thumbDiameter)) : this.baseSegmentWeight;
        }
        float[] fArr2 = new float[size];
        this.prefixSums = fArr2;
        fArr2[0] = 0.0f;
        for (int i15 = 1; i15 < size; i15++) {
            float[] fArr3 = this.prefixSums;
            int i16 = i15 - 1;
            fArr3[i15] = fArr3[i16] + this.segmentWeights[i16];
        }
        Float valueOf = Float.valueOf(this.prefixSums[i11]);
        if (valueOf.floatValue() <= 0.0f) {
            valueOf = null;
        }
        this.totalWeight = valueOf != null ? valueOf.floatValue() : 1.0f;
    }

    private final void setStepSize(int i11) {
        if (i11 < 1) {
            i11 = 1;
        }
        this.stepSize = i11;
        int i12 = this.maxRange;
        if (i12 >= i11) {
            i11 = i12;
        }
        setMaxRange(i11);
        snapAndNormalize();
        rebuildStepsAndInvalidate();
    }

    private final void snapAndNormalize() {
        this.initialMinValue = h.e(clampToStep(this.initialMinValue), this.min, this.max);
        int e11 = h.e(clampToStep(this.initialMaxValue), this.min, this.max);
        this.initialMaxValue = e11;
        int i11 = this.initialMinValue;
        if (i11 > e11) {
            this.initialMinValue = e11;
            this.initialMaxValue = i11;
        }
        int i12 = this.maxRange;
        if (i12 != Integer.MAX_VALUE) {
            int i13 = this.initialMaxValue;
            int i14 = this.initialMinValue;
            if (i13 - i14 > i12) {
                int i15 = i14 + i12;
                int i16 = this.max;
                if (i15 > i16) {
                    i15 = i16;
                }
                this.initialMaxValue = i15;
            }
        }
    }

    private final void updateIndexForX(float rawTouchX, float leftBound, float rightBound) {
        int xToNearestIndex = xToNearestIndex(h.d(rawTouchX, leftBound, rightBound), leftBound, rightBound);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.activeThumb.ordinal()];
        if (i11 == 1) {
            int i12 = this.maxIndex - 1;
            if (i12 < 0) {
                i12 = 0;
            }
            int e11 = h.e(xToNearestIndex, 0, i12);
            if (e11 != this.minIndex) {
                this.minIndex = e11;
                this.initialMinValue = this.steps.get(e11).intValue();
                enforceMaxDistanceAfterMove(Thumb.MIN);
                layoutThumbViews();
                invalidate();
                return;
            }
            return;
        }
        if (i11 != 2) {
            return;
        }
        int i13 = this.minIndex + 1;
        int size = this.steps.size() - 1;
        if (i13 > size) {
            i13 = size;
        }
        int e12 = h.e(xToNearestIndex, i13, this.steps.size() - 1);
        if (e12 != this.maxIndex) {
            this.maxIndex = e12;
            this.initialMaxValue = this.steps.get(e12).intValue();
            enforceMaxDistanceAfterMove(Thumb.MAX);
            layoutThumbViews();
            invalidate();
        }
    }

    private final int xToNearestIndex(float touchX, float leftBound, float rightBound) {
        int i11 = 0;
        if (this.steps.size() <= 1) {
            return 0;
        }
        float f7 = rightBound == leftBound ? 0.0f : (touchX - leftBound) / (rightBound - leftBound);
        float f11 = this.totalWeight;
        float d11 = h.d(f7 * f11, 0.0f, f11);
        float[] fArr = this.prefixSums;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length - 1;
        while (i11 < length) {
            int i12 = ((i11 + length) + 1) / 2;
            if (this.prefixSums[i12] <= d11) {
                i11 = i12;
            } else {
                length = i12 - 1;
            }
        }
        float[] fArr2 = this.prefixSums;
        float f12 = d11 - fArr2[i11];
        Intrinsics.checkNotNullParameter(fArr2, "<this>");
        return (i11 < fArr2.length - 1 ? this.prefixSums[i11 + 1] - d11 : Float.POSITIVE_INFINITY) < f12 ? i11 + 1 : i11;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float barCenterY = getBarCenterY();
        int i11 = this.barHeight;
        float f7 = barCenterY - (i11 / 2.0f);
        float f11 = (i11 / 2.0f) + barCenterY;
        this.trackRect.set(getPaddingStart(), f7, getWidth() - getPaddingEnd(), f11);
        canvas.drawRoundRect(this.trackRect, getCornerR(), getCornerR(), this.barPaint);
        float indexToX = indexToX(this.minIndex, getStartX(), getEndX());
        float indexToX2 = indexToX(this.maxIndex, getStartX(), getEndX());
        this.activeRect.set(Math.min(indexToX, indexToX2), f7, Math.max(indexToX, indexToX2), f11);
        canvas.drawRoundRect(this.activeRect, getCornerR(), getCornerR(), this.barHighlightPaint);
        drawLabels(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        computeLabelPositions();
        for (VisibleLabel visibleLabel : this.visibleLabels) {
            int c11 = C6915b.c(visibleLabel.getTextPosition().x);
            int c12 = C6915b.c(visibleLabel.getTextPosition().y);
            visibleLabel.getView().layout(c11, c12, visibleLabel.getView().getMeasuredWidth() + c11, visibleLabel.getView().getMeasuredHeight() + c12);
        }
        layoutThumbViews();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11 = 0;
        for (VisibleLabel visibleLabel : this.visibleLabels) {
            MeasureExtKt.measureAtMost(visibleLabel.getView(), -2, -2);
            i11 = Math.max(i11, visibleLabel.getView().getMeasuredHeight());
        }
        float f7 = i11;
        float paddingTop = (getPaddingTop() + getThumbDiameter()) - (0.375f * f7);
        Iterator<T> it = this.visibleLabels.iterator();
        while (it.hasNext()) {
            ((VisibleLabel) it.next()).getTextPosition().y = paddingTop;
        }
        setMeasuredDimension(View.resolveSize(View.MeasureSpec.getSize(widthMeasureSpec), widthMeasureSpec), View.resolveSize(C6915b.c((f7 * 0.625f) + getPaddingTop() + getThumbDiameter() + getPaddingBottom()), heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onSizeChanged(int newWidth, int newHeight, int oldWidth, int oldHeight) {
        super.onSizeChanged(newWidth, newHeight, oldWidth, oldHeight);
        float endX = getEndX() - getStartX();
        if (endX < 0.0f) {
            endX = 0.0f;
        }
        this.contentWidthPx = endX;
        recomputeSegmentWeights();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r0 != 3) goto L48;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        SliderWithLabelsV2Behaviour.OnValueChangeListener onValueChangeListener;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.activePointerId = event.getPointerId(0);
            this.downX = event.getX();
            this.downY = event.getY();
            Thumb pickThumb = pickThumb(this.downX, this.downY, getStartX(), getEndX(), getBarCenterY());
            if (pickThumb == Thumb.NONE) {
                return false;
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.activeThumb = pickThumb;
            this.isDragging = false;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = event.findPointerIndex(this.activePointerId);
                if (findPointerIndex < 0) {
                    return false;
                }
                float x11 = event.getX(findPointerIndex);
                if (!this.isDragging) {
                    float abs = Math.abs(x11 - this.downX);
                    float abs2 = Math.abs(event.getY() - this.downY);
                    int i11 = this.touchSlop;
                    if (abs <= i11 && abs2 <= i11) {
                        return true;
                    }
                    this.isDragging = true;
                    Thumb thumb = this.activeThumb;
                    Thumb thumb2 = Thumb.MIN;
                    if (thumb == thumb2) {
                        thumb2 = Thumb.MAX;
                    }
                    rebuildStepsWithExtraStep(thumb2);
                }
                float startX = getStartX();
                float endX = getEndX();
                int minValue = getMinValue();
                int maxValue = getMaxValue();
                updateIndexForX(x11, startX, endX);
                if ((minValue != getMinValue() || maxValue != getMaxValue()) && (onValueChangeListener = this.onValueChanged) != null) {
                    onValueChangeListener.valueChanged(getMinValue(), getMaxValue());
                }
                return true;
            }
        }
        Thumb thumb3 = this.activeThumb;
        Thumb thumb4 = Thumb.NONE;
        if (thumb3 != thumb4) {
            if (!this.isDragging) {
                this.activeThumb = thumb4;
                this.isDragging = false;
                this.activePointerId = -1;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                return true;
            }
            updateIndexForX(event.getX(), getStartX(), getEndX());
            int minValue2 = getMinValue();
            int maxValue2 = getMaxValue();
            this.activeThumb = thumb4;
            this.isDragging = false;
            this.activePointerId = -1;
            ViewParent parent3 = getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(false);
            }
            rebuildStepsWithExtraStep(Thumb.MIN);
            invalidate();
            performClick();
            SliderWithLabelsV2Behaviour.OnFinalValueListener onFinalValueListener = this.onFinalValueChanged;
            if (onFinalValueListener != null) {
                onFinalValueListener.finalValueChanged(minValue2, maxValue2);
            }
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    public void setOnFinalValueChangedListener(@NotNull SliderWithLabelsV2Behaviour.OnFinalValueListener value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.onFinalValueChanged = value;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    public void setOnValueChangedListener(@NotNull SliderWithLabelsV2Behaviour.OnValueChangeListener value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.onValueChanged = value;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    public /* bridge */ /* synthetic */ SliderWithLabelsV2Behaviour setPoints(List list) {
        return setPoints((List<Label>) list);
    }

    private final void setMax(int i11) {
        this.max = i11;
        snapAndNormalize();
        rebuildStepsAndInvalidate();
    }

    private final void setMaxRange(int i11) {
        int i12 = this.stepSize;
        if (i11 < i12) {
            i11 = i12;
        }
        this.maxRange = i11;
        if (i11 != Integer.MAX_VALUE) {
            int i13 = this.initialMaxValue;
            int i14 = this.initialMinValue;
            if (i13 - i14 > i11) {
                this.initialMaxValue = h.e(i11 + i14, i14, this.max);
            }
        }
        invalidate();
    }

    private final void setMin(int i11) {
        this.min = i11;
        snapAndNormalize();
        rebuildStepsAndInvalidate();
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    @NotNull
    public SliderWithLabelsV2ViewGroup setAutomatizationId(String value) {
        setContentDescription(value);
        return this;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    @NotNull
    public SliderWithLabelsV2ViewGroup setInitialRange(int minValue, int maxValue) {
        this.initialMinValue = minValue;
        this.initialMaxValue = maxValue;
        snapAndNormalize();
        rebuildStepsAndInvalidate();
        return this;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    @NotNull
    public SliderWithLabelsV2ViewGroup setPoints(@NotNull List<Label> pointsList) {
        Intrinsics.checkNotNullParameter(pointsList, "pointsList");
        this.visibleLabels.clear();
        for (Label label : C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2ViewGroup$setPoints$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(Integer.valueOf(((SliderWithLabelsV2ViewGroup.Label) t2).getValue()), Integer.valueOf(((SliderWithLabelsV2ViewGroup.Label) t11).getValue()));
            }
        }, pointsList)) {
            q qVar = q.f64554a;
            d b11 = N.b(TextAtomV2View.class);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
            textAtomV2View.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            TextHolderKt.bind$default(textAtomV2View, label.getText(), null, 2, null);
            this.visibleLabels.add(new VisibleLabel(textAtomV2View, label, null, 4, null));
        }
        requestLayout();
        return this;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    @NotNull
    public SliderWithLabelsV2ViewGroup setStep(int value) {
        setStepSize(value);
        return this;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$VisibleLabel;", "", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "view", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;", "label", "Landroid/graphics/PointF;", "textPosition", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;Landroid/graphics/PointF;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;", "getLabel", "()Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;", "Landroid/graphics/PointF;", "getTextPosition", "()Landroid/graphics/PointF;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VisibleLabel {

        @NotNull
        private final Label label;

        @NotNull
        private final PointF textPosition;

        @NotNull
        private final TextAtomV2View view;

        public VisibleLabel(@NotNull TextAtomV2View view, @NotNull Label label, @NotNull PointF textPosition) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(textPosition, "textPosition");
            this.view = view;
            this.label = label;
            this.textPosition = textPosition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VisibleLabel)) {
                return false;
            }
            VisibleLabel visibleLabel = (VisibleLabel) other;
            return Intrinsics.d(this.view, visibleLabel.view) && Intrinsics.d(this.label, visibleLabel.label) && Intrinsics.d(this.textPosition, visibleLabel.textPosition);
        }

        @NotNull
        public final PointF getTextPosition() {
            return this.textPosition;
        }

        @NotNull
        public final TextAtomV2View getView() {
            return this.view;
        }

        public int hashCode() {
            return this.textPosition.hashCode() + ((this.label.hashCode() + (this.view.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "VisibleLabel(view=" + this.view + ", label=" + this.label + ", textPosition=" + this.textPosition + ")";
        }

        public /* synthetic */ VisibleLabel(TextAtomV2View textAtomV2View, Label label, PointF pointF, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textAtomV2View, label, (i11 & 4) != 0 ? new PointF() : pointF);
        }
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    @NotNull
    public SliderWithLabelsV2ViewGroup setMax(int value) {
        setMax(value);
        return this;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    @NotNull
    public SliderWithLabelsV2ViewGroup setMin(int value) {
        setMin(value);
        return this;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2Behaviour
    @NotNull
    public SliderWithLabelsV2ViewGroup setMaxRange(Integer value) {
        setMaxRange(value != null ? value.intValue() : Integer.MAX_VALUE);
        return this;
    }
}
