package ru.ozon.uni.android.uikit.view.atoms.rating;

import E0.C2942q;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import T7.E;
import V.e;
import Xc.a;
import Xc.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$drawable;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0006²\u0001³\u0001´\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u00103J\u001f\u0010:\u001a\u0002092\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010\rJ/\u0010A\u001a\u00020\b2\u0006\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u0002092\u0006\u0010@\u001a\u00020\u0014H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020\b2\u0006\u0010=\u001a\u0002092\u0006\u0010@\u001a\u00020\u0014H\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\bE\u0010\rJ\u000f\u0010F\u001a\u00020\u000bH\u0002¢\u0006\u0004\bF\u00103J\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u001cH\u0002¢\u0006\u0004\bH\u0010\u001fJ\u0017\u0010I\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u001cH\u0002¢\u0006\u0004\bI\u0010\u001fJ7\u0010O\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010J\u001a\u0002092\u0006\u0010K\u001a\u0002092\u0006\u0010L\u001a\u0002092\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u000b2\u0006\u0010J\u001a\u000209H\u0002¢\u0006\u0004\bQ\u0010RJ!\u0010U\u001a\u0002092\u0006\u0010S\u001a\u0002092\b\b\u0001\u0010T\u001a\u00020\bH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u0002092\u0006\u0010W\u001a\u000209H\u0002¢\u0006\u0004\bX\u0010YR*\u0010Z\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010`\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010[\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\"\u0010c\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010[\u001a\u0004\bd\u0010]\"\u0004\be\u0010_R*\u0010f\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010[\u001a\u0004\bg\u0010]\"\u0004\bh\u0010_R\"\u0010i\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bi\u0010[\u001a\u0004\bj\u0010]\"\u0004\bk\u0010_R*\u0010l\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010[\u001a\u0004\bm\u0010]\"\u0004\bn\u0010_R*\u0010>\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010[\u001a\u0004\bo\u0010]\"\u0004\bp\u0010_R*\u0010?\u001a\u0002092\u0006\u0010S\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010RR\"\u0010u\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010q\u001a\u0004\bv\u0010s\"\u0004\bw\u0010RR*\u0010x\u001a\u0002092\u0006\u0010S\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010q\u001a\u0004\by\u0010s\"\u0004\bz\u0010RR*\u0010{\u001a\u0002092\u0006\u0010S\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010q\u001a\u0004\b|\u0010s\"\u0004\b}\u0010RR*\u0010W\u001a\u0002092\u0006\u0010S\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010q\u001a\u0004\b~\u0010s\"\u0004\b\u007f\u0010RR1\u0010\u0080\u0001\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0080\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R3\u0010N\u001a\u0004\u0018\u00010M2\b\u0010S\u001a\u0004\u0018\u00010M8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bN\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R.\u0010\u008a\u0001\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010[\u001a\u0005\b\u008b\u0001\u0010]\"\u0005\b\u008c\u0001\u0010_R\u0018\u0010\u008d\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010qR\u0018\u0010\u008e\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010qR!\u0010\u0094\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R!\u0010\u0097\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0091\u0001\u001a\u0006\b\u0096\u0001\u0010\u0093\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R(\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b/\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0005\b\u009e\u0001\u00101R\u001b\u0010\u009f\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u0010¡\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0081\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¤\u0001R\u0019\u0010G\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bG\u0010¦\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R#\u0010®\u0001\u001a\u0005\u0018\u00010ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0091\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010¯\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¯\u0001\u0010[R&\u0010=\u001a\u0002092\u0006\u0010=\u001a\u0002098F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b°\u0001\u0010s\"\u0005\b±\u0001\u0010R¨\u0006µ\u0001"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$OnRatingBarChangeListener;", "ratingListener", "setOnRatingBarChangeListener", "(Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$OnRatingBarChangeListener;)V", "initView", "()V", "parseAttrs", "(Landroid/util/AttributeSet;)V", "validateAttrs", "width", "height", "", "calculateBestStarSize", "(II)F", "performStarSizeAssociatedCalculations", "starSize", "numberOfStars", "starsSeparation", "padding", "calculateTotalWidth", "(FIFZ)I", "calculateTotalHeight", "(FZ)I", "generateInternalCanvas", "setupColorsInPaint", "internalCanvas", "drawFromLeftToRight", "drawFromRightToLeft", "x", "y", "filled", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$Gravity;", "gravity", "drawStar", "(Landroid/graphics/Canvas;FFFLru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$Gravity;)V", "setNewRatingFromTouch", "(F)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "dimen", "valueToPixels", "(FI)F", "rating", "normalizeRating", "(F)F", "fillColor", "I", "getFillColor", "()I", "setFillColor", "(I)V", "bgColor", "getBgColor", "setBgColor", "starBackgroundColor", "getStarBackgroundColor", "setStarBackgroundColor", "pressedFillColor", "getPressedFillColor", "setPressedFillColor", "pressedBackgroundColor", "getPressedBackgroundColor", "setPressedBackgroundColor", "pressedStarBackgroundColor", "getPressedStarBackgroundColor", "setPressedStarBackgroundColor", "getNumberOfStars", "setNumberOfStars", "F", "getStarsSeparation", "()F", "setStarsSeparation", "desiredStarSize", "getDesiredStarSize", "setDesiredStarSize", "maxStarSize", "getMaxStarSize", "setMaxStarSize", "stepSize", "getStepSize", "setStepSize", "getRating", "setRating", "isIndicator", "Z", "()Z", "setIndicator", "(Z)V", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$Gravity;", "getGravity", "()Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$Gravity;", "setGravity", "(Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$Gravity;)V", "starIcon", "getStarIcon", "setStarIcon", "currentStarSize", "defaultStarSize", "Landroid/graphics/Paint;", "paintStarFill$delegate", "LSc/j;", "getPaintStarFill", "()Landroid/graphics/Paint;", "paintStarFill", "paintStarBackground$delegate", "getPaintStarBackground", "paintStarBackground", "Landroid/animation/ValueAnimator;", "ratingAnimator", "Landroid/animation/ValueAnimator;", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$OnRatingBarChangeListener;", "getRatingListener", "()Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$OnRatingBarChangeListener;", "setRatingListener", "clickListener", "Landroid/view/View$OnClickListener;", "touchInProgress", "Landroid/graphics/RectF;", "starsDrawingSpace", "Landroid/graphics/RectF;", "starsTouchSpace", "Landroid/graphics/Canvas;", "Landroid/graphics/Bitmap;", "internalBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "starDrawable$delegate", "getStarDrawable", "()Landroid/graphics/drawable/Drawable;", "starDrawable", "defaultFillColor", "getStarSize", "setStarSize", "OnRatingBarChangeListener", "Gravity", "SavedState", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VectorRatingBar extends View {
    private int bgColor;
    private View.OnClickListener clickListener;
    private float currentStarSize;
    private final int defaultFillColor;
    private float defaultStarSize;
    private float desiredStarSize;
    private int fillColor;
    private Gravity gravity;
    private Bitmap internalBitmap;
    private Canvas internalCanvas;
    private boolean isIndicator;
    private float maxStarSize;
    private int numberOfStars;

    /* renamed from: paintStarBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paintStarBackground;

    /* renamed from: paintStarFill$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paintStarFill;
    private int pressedBackgroundColor;
    private int pressedFillColor;
    private int pressedStarBackgroundColor;
    private float rating;
    private ValueAnimator ratingAnimator;
    private OnRatingBarChangeListener ratingListener;
    private int starBackgroundColor;

    /* renamed from: starDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j starDrawable;
    private int starIcon;
    private RectF starsDrawingSpace;
    private float starsSeparation;
    private RectF starsTouchSpace;
    private float stepSize;
    private boolean touchInProgress;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$Gravity;", "", "", "id", "<init>", "(Ljava/lang/String;II)V", "I", "getId", "()I", "setId", "(I)V", "Companion", "LEFT", "RIGHT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gravity {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Gravity[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Gravity LEFT = new Gravity("LEFT", 0, 0);
        public static final Gravity RIGHT = new Gravity("RIGHT", 1, 1);
        private int id;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$Gravity$Companion;", "", "<init>", "()V", "fromId", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$Gravity;", "id", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Gravity fromId(int id2) {
                for (Gravity gravity : Gravity.getEntries()) {
                    if (gravity.getId() == id2) {
                        return gravity;
                    }
                }
                return Gravity.LEFT;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Gravity[] $values() {
            return new Gravity[]{LEFT, RIGHT};
        }

        static {
            Gravity[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private Gravity(String str, int i11, int i12) {
            this.id = i12;
        }

        @NotNull
        public static a<Gravity> getEntries() {
            return $ENTRIES;
        }

        public static Gravity valueOf(String str) {
            return (Gravity) Enum.valueOf(Gravity.class, str);
        }

        public static Gravity[] values() {
            return (Gravity[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$OnRatingBarChangeListener;", "", "onRatingChanged", "", "vectorRatingBar", "Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar;", "rating", "", "fromUser", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface OnRatingBarChangeListener {
        void onRatingChanged(VectorRatingBar vectorRatingBar, float rating, boolean fromUser);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/rating/VectorRatingBar$SavedState;", "Landroid/os/Parcelable;", "rating", "", "parent", "<init>", "(FLandroid/os/Parcelable;)V", "getRating", "()F", "getParent", "()Landroid/os/Parcelable;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class SavedState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final Parcelable parent;
        private final float rating;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readFloat(), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(float f7, Parcelable parcelable) {
            this.rating = f7;
            this.parent = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Parcelable getParent() {
            return this.parent;
        }

        public final float getRating() {
            return this.rating;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.rating);
            dest.writeParcelable(this.parent, flags);
        }
    }

    public VectorRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.starIcon = R$drawable.ic_m_star_filled;
        this.paintStarFill = k.b(VectorRatingBar$paintStarFill$2.INSTANCE);
        this.paintStarBackground = k.b(VectorRatingBar$paintStarBackground$2.INSTANCE);
        this.starDrawable = k.b(new VectorRatingBar$starDrawable$2(this));
        this.defaultFillColor = androidx.core.content.a.getColor(getContext(), R$color.graphic_rating);
        parseAttrs(attributeSet);
        initView();
    }

    private final float calculateBestStarSize(int width, int height) {
        float f7 = this.maxStarSize;
        if (f7 == 2.1474836E9f) {
            float paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
            float f11 = this.starsSeparation;
            return Math.min((paddingLeft - (f11 * (r1 - 1))) / this.numberOfStars, (height - getPaddingTop()) - getPaddingBottom());
        }
        float calculateTotalWidth = calculateTotalWidth(f7, this.numberOfStars, this.starsSeparation, true);
        float calculateTotalHeight = calculateTotalHeight(this.maxStarSize, true);
        if (calculateTotalWidth < width && calculateTotalHeight < height) {
            return this.maxStarSize;
        }
        float paddingLeft2 = (width - getPaddingLeft()) - getPaddingRight();
        float f12 = this.starsSeparation;
        return Math.min((paddingLeft2 - (f12 * (r1 - 1))) / this.numberOfStars, (height - getPaddingTop()) - getPaddingBottom());
    }

    private final int calculateTotalHeight(float starSize, boolean padding) {
        int i11;
        int c11 = C6915b.c(starSize);
        if (padding) {
            i11 = getPaddingBottom() + getPaddingTop();
        } else {
            i11 = 0;
        }
        return c11 + i11;
    }

    private final int calculateTotalWidth(float starSize, int numberOfStars, float starsSeparation, boolean padding) {
        int i11;
        int c11 = C6915b.c((starsSeparation * (numberOfStars - 1)) + (starSize * numberOfStars));
        if (padding) {
            i11 = getPaddingRight() + getPaddingLeft();
        } else {
            i11 = 0;
        }
        return c11 + i11;
    }

    private final void drawFromLeftToRight(Canvas internalCanvas) {
        Canvas canvas;
        VectorRatingBar vectorRatingBar;
        float f7 = this.rating;
        RectF rectF = this.starsDrawingSpace;
        Intrinsics.f(rectF);
        float f11 = rectF.left;
        float f12 = rectF.top;
        int i11 = this.numberOfStars;
        float f13 = f11;
        int i12 = 0;
        while (i12 < i11) {
            if (f7 >= 1.0f) {
                vectorRatingBar = this;
                canvas = internalCanvas;
                vectorRatingBar.drawStar(canvas, f13, f12, 1.0f, Gravity.LEFT);
                f7 -= 1.0f;
            } else {
                canvas = internalCanvas;
                vectorRatingBar = this;
                vectorRatingBar.drawStar(canvas, f13, f12, f7, Gravity.LEFT);
                f7 = 0.0f;
            }
            f13 += vectorRatingBar.starsSeparation + vectorRatingBar.currentStarSize;
            i12++;
            internalCanvas = canvas;
        }
    }

    private final void drawFromRightToLeft(Canvas internalCanvas) {
        Canvas canvas;
        VectorRatingBar vectorRatingBar;
        float f7 = this.rating;
        RectF rectF = this.starsDrawingSpace;
        Intrinsics.f(rectF);
        float f11 = rectF.right - this.currentStarSize;
        RectF rectF2 = this.starsDrawingSpace;
        Intrinsics.f(rectF2);
        float f12 = rectF2.top;
        int i11 = this.numberOfStars;
        float f13 = f11;
        int i12 = 0;
        while (i12 < i11) {
            if (f7 >= 1.0f) {
                vectorRatingBar = this;
                canvas = internalCanvas;
                vectorRatingBar.drawStar(canvas, f13, f12, 1.0f, Gravity.RIGHT);
                f7 -= 1.0f;
            } else {
                canvas = internalCanvas;
                vectorRatingBar = this;
                vectorRatingBar.drawStar(canvas, f13, f12, f7, Gravity.RIGHT);
                f7 = 0.0f;
            }
            f13 -= vectorRatingBar.starsSeparation + vectorRatingBar.currentStarSize;
            i12++;
            internalCanvas = canvas;
        }
    }

    private final void drawStar(Canvas canvas, float x11, float y11, float filled, Gravity gravity) {
        canvas.save();
        canvas.translate(x11, y11);
        Drawable starDrawable = getStarDrawable();
        if (starDrawable != null) {
            starDrawable.draw(canvas);
        }
        canvas.restore();
        float f7 = this.currentStarSize;
        float f11 = f7 * filled;
        if (gravity != Gravity.LEFT) {
            canvas.drawRect((x11 + f7) - ((0.02f * f7) + f11), y11, x11 + f7, y11 + f7, getPaintStarFill());
            float f12 = this.currentStarSize;
            canvas.drawRect(x11, y11, (x11 + f12) - f11, y11 + f12, getPaintStarBackground());
        } else {
            float f13 = f11 + x11;
            canvas.drawRect(x11, y11, (0.02f * f7) + f13, y11 + f7, getPaintStarFill());
            float f14 = this.currentStarSize;
            canvas.drawRect(f13, y11, x11 + f14, y11 + f14, getPaintStarBackground());
        }
    }

    private final void generateInternalCanvas(int w11, int h11) {
        Bitmap bitmap = this.internalBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (w11 <= 0 || h11 <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(w11, h11, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        this.internalCanvas = new Canvas(createBitmap);
        this.internalBitmap = createBitmap;
    }

    private final Paint getPaintStarBackground() {
        return (Paint) this.paintStarBackground.getValue();
    }

    private final Paint getPaintStarFill() {
        return (Paint) this.paintStarFill.getValue();
    }

    private final Drawable getStarDrawable() {
        return (Drawable) this.starDrawable.getValue();
    }

    private final void initView() {
        this.defaultStarSize = TypedValue.applyDimension(1, 30.0f, getResources().getDisplayMetrics());
    }

    private final float normalizeRating(float rating) {
        if (rating < 0.0f) {
            return 0.0f;
        }
        int i11 = this.numberOfStars;
        return rating > ((float) i11) ? i11 : rating;
    }

    private final void parseAttrs(AttributeSet attrs) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R$styleable.RatingBar, 0, R$style.Rating_Default);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setFillColor(obtainStyledAttributes.getColor(R$styleable.RatingBar_rb_fillColor, this.defaultFillColor));
        this.starBackgroundColor = obtainStyledAttributes.getColor(R$styleable.RatingBar_rb_starBackgroundColor, 0);
        this.bgColor = obtainStyledAttributes.getColor(R$styleable.RatingBar_rb_backgroundColor, 0);
        setPressedFillColor(obtainStyledAttributes.getColor(R$styleable.RatingBar_rb_pressedFillColor, this.fillColor));
        setPressedStarBackgroundColor(obtainStyledAttributes.getColor(R$styleable.RatingBar_rb_pressedStarBackgroundColor, this.starBackgroundColor));
        this.pressedBackgroundColor = obtainStyledAttributes.getColor(R$styleable.RatingBar_rb_pressedBackgroundColor, this.bgColor);
        setNumberOfStars(obtainStyledAttributes.getInteger(R$styleable.RatingBar_rb_numberOfStars, 5));
        setStarsSeparation(obtainStyledAttributes.getDimensionPixelSize(R$styleable.RatingBar_rb_starsSeparation, (int) valueToPixels(4.0f, 0)));
        setMaxStarSize(obtainStyledAttributes.getDimensionPixelSize(R$styleable.RatingBar_rb_maxStarSize, Integer.MAX_VALUE));
        this.desiredStarSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RatingBar_rb_starSize, Integer.MAX_VALUE);
        setStepSize(obtainStyledAttributes.getFloat(R$styleable.RatingBar_rb_stepSize, 0.1f));
        setRating(normalizeRating(obtainStyledAttributes.getFloat(R$styleable.RatingBar_rb_rating, 0.0f)));
        setIndicator(obtainStyledAttributes.getBoolean(R$styleable.RatingBar_rb_isIndicator, false));
        setGravity(Gravity.INSTANCE.fromId(obtainStyledAttributes.getInt(R$styleable.RatingBar_rb_gravity, Gravity.LEFT.getId())));
        setStarIcon(obtainStyledAttributes.getResourceId(R$styleable.RatingBar_rb_starIcon, R$drawable.ic_m_star_filled));
        obtainStyledAttributes.recycle();
        validateAttrs();
    }

    private final void performStarSizeAssociatedCalculations(int width, int height) {
        float calculateTotalWidth = calculateTotalWidth(this.currentStarSize, this.numberOfStars, this.starsSeparation, false);
        float calculateTotalHeight = calculateTotalHeight(this.currentStarSize, false);
        float f7 = 2;
        float paddingLeft = ((((width - getPaddingLeft()) - getPaddingRight()) / 2) - (calculateTotalWidth / f7)) + getPaddingLeft();
        float paddingTop = ((((height - getPaddingTop()) - getPaddingBottom()) / 2) - (calculateTotalHeight / f7)) + getPaddingTop();
        RectF rectF = new RectF(paddingLeft, paddingTop, calculateTotalWidth + paddingLeft, calculateTotalHeight + paddingTop);
        this.starsDrawingSpace = rectF;
        float width2 = rectF.width() * 0.05f;
        this.starsTouchSpace = new RectF(rectF.left - width2, rectF.top, rectF.right + width2, rectF.bottom);
    }

    private final void setNewRatingFromTouch(float x11) {
        if (this.gravity != Gravity.LEFT) {
            x11 = getWidth() - x11;
        }
        RectF rectF = this.starsDrawingSpace;
        Intrinsics.f(rectF);
        float f7 = rectF.left;
        if (x11 < f7) {
            setRating(0.0f);
            return;
        }
        if (x11 > rectF.right) {
            setRating(this.numberOfStars);
            return;
        }
        setRating((this.numberOfStars / rectF.width()) * (x11 - f7));
        float f11 = this.rating;
        float f12 = this.stepSize;
        float f13 = f11 % f12;
        if (f13 < f12 / 4) {
            setRating(f11 - f13);
            setRating(Math.max(0.0f, this.rating));
        } else {
            setRating((f11 - f13) + f12);
            setRating(Math.min(this.numberOfStars, this.rating));
        }
    }

    private final void setupColorsInPaint() {
        if (this.touchInProgress) {
            Paint paintStarFill = getPaintStarFill();
            if (paintStarFill != null) {
                paintStarFill.setColor(this.pressedFillColor);
                paintStarFill.setXfermode(this.pressedFillColor != 0 ? new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP) : new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            Paint paintStarBackground = getPaintStarBackground();
            if (paintStarBackground != null) {
                paintStarBackground.setColor(this.pressedStarBackgroundColor);
                paintStarBackground.setXfermode(this.pressedStarBackgroundColor != 0 ? new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP) : new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                return;
            }
            return;
        }
        Paint paintStarFill2 = getPaintStarFill();
        if (paintStarFill2 != null) {
            paintStarFill2.setColor(this.fillColor);
            paintStarFill2.setXfermode(this.fillColor != 0 ? new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP) : new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        Paint paintStarBackground2 = getPaintStarBackground();
        if (paintStarBackground2 != null) {
            paintStarBackground2.setColor(this.starBackgroundColor);
            paintStarBackground2.setXfermode(this.starBackgroundColor != 0 ? new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP) : new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    private final void validateAttrs() {
        int i11 = this.numberOfStars;
        if (i11 <= 0) {
            throw new IllegalArgumentException(E.a(i11, "VectorRatingBar initialized with invalid value for numberOfStars. Found ", ", but should be greater than 0").toString());
        }
        float f7 = this.stepSize;
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException(C2942q.b(f7, "VectorRatingBar initialized with invalid value for stepSize. Found ", ", but should be greater than 0").toString());
        }
    }

    private final float valueToPixels(float value, int dimen) {
        return dimen != 0 ? dimen != 2 ? value : TypedValue.applyDimension(2, value, getResources().getDisplayMetrics()) : TypedValue.applyDimension(1, value, getResources().getDisplayMetrics());
    }

    public final int getStarIcon() {
        return this.starIcon;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int height = getHeight();
        if (getWidth() == 0 || height == 0) {
            return;
        }
        Canvas canvas2 = this.internalCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        setupColorsInPaint();
        Canvas canvas3 = this.internalCanvas;
        if (canvas3 != null) {
            if (this.gravity == Gravity.LEFT) {
                drawFromLeftToRight(canvas3);
            } else {
                drawFromRightToLeft(canvas3);
            }
        }
        if (this.touchInProgress) {
            canvas.drawColor(this.pressedBackgroundColor);
        } else {
            canvas.drawColor(this.bgColor);
        }
        Bitmap bitmap = this.internalBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int width = getWidth();
        int height = getHeight();
        float f7 = this.desiredStarSize;
        if (f7 == 2.1474836E9f) {
            f7 = calculateBestStarSize(width, height);
        }
        this.currentStarSize = f7;
        performStarSizeAssociatedCalculations(width, height);
        Drawable starDrawable = getStarDrawable();
        if (starDrawable != null) {
            starDrawable.setBounds(0, 0, C6915b.c(this.currentStarSize), C6915b.c(this.currentStarSize));
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            float f7 = this.desiredStarSize;
            if (f7 == 2.1474836E9f) {
                float f11 = this.maxStarSize;
                size = f11 == 2.1474836E9f ? Math.min(calculateTotalWidth(this.defaultStarSize, this.numberOfStars, this.starsSeparation, true), size) : Math.min(calculateTotalWidth(f11, this.numberOfStars, this.starsSeparation, true), size);
            } else {
                size = Math.min(calculateTotalWidth(f7, this.numberOfStars, this.starsSeparation, true), size);
            }
        } else if (mode != 1073741824) {
            float f12 = this.desiredStarSize;
            if (f12 == 2.1474836E9f) {
                float f13 = this.maxStarSize;
                size = f13 == 2.1474836E9f ? calculateTotalWidth(this.defaultStarSize, this.numberOfStars, this.starsSeparation, true) : calculateTotalWidth(f13, this.numberOfStars, this.starsSeparation, true);
            } else {
                size = calculateTotalWidth(f12, this.numberOfStars, this.starsSeparation, true);
            }
        }
        float paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        float f14 = this.starsSeparation;
        float f15 = (paddingLeft - (f14 * (r7 - 1))) / this.numberOfStars;
        if (mode2 == Integer.MIN_VALUE) {
            float f16 = this.desiredStarSize;
            if (f16 == 2.1474836E9f) {
                float f17 = this.maxStarSize;
                size2 = f17 == 2.1474836E9f ? Math.min(calculateTotalHeight(f15, true), size2) : Math.min(calculateTotalHeight(f17, true), size2);
            } else {
                size2 = Math.min(calculateTotalHeight(f16, true), size2);
            }
        } else if (mode2 != 1073741824) {
            float f18 = this.desiredStarSize;
            if (f18 == 2.1474836E9f) {
                float f19 = this.maxStarSize;
                size2 = f19 == 2.1474836E9f ? calculateTotalHeight(f15, true) : calculateTotalHeight(f19, true);
            } else {
                size2 = calculateTotalHeight(f18, true);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (state instanceof SavedState) {
            SavedState savedState = (SavedState) state;
            setRating(savedState.getRating());
            state = savedState.getParent();
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    @NotNull
    protected Parcelable onSaveInstanceState() {
        return new SavedState(this.rating, super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        generateInternalCanvas(w11, h11);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        ValueAnimator valueAnimator;
        OnRatingBarChangeListener onRatingBarChangeListener;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isIndicator && ((valueAnimator = this.ratingAnimator) == null || !valueAnimator.isRunning())) {
            int action = event.getAction() & 255;
            if (action != 0) {
                if (action == 1) {
                    setNewRatingFromTouch(event.getX());
                    View.OnClickListener onClickListener = this.clickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    OnRatingBarChangeListener onRatingBarChangeListener2 = this.ratingListener;
                    if (onRatingBarChangeListener2 != null) {
                        onRatingBarChangeListener2.onRatingChanged(this, this.rating, true);
                    }
                    this.touchInProgress = false;
                } else if (action != 2) {
                    if (action == 3) {
                        OnRatingBarChangeListener onRatingBarChangeListener3 = this.ratingListener;
                        if (onRatingBarChangeListener3 != null) {
                            onRatingBarChangeListener3.onRatingChanged(this, this.rating, true);
                        }
                        this.touchInProgress = false;
                    }
                }
                invalidate();
                return true;
            }
            RectF rectF = this.starsTouchSpace;
            if (rectF != null && rectF.contains(event.getX(), event.getY())) {
                this.touchInProgress = true;
                setNewRatingFromTouch(event.getX());
                invalidate();
                return true;
            }
            if (this.touchInProgress && (onRatingBarChangeListener = this.ratingListener) != null) {
                onRatingBarChangeListener.onRatingChanged(this, this.rating, true);
            }
            this.touchInProgress = false;
        }
        return false;
    }

    public final void setFillColor(int i11) {
        this.fillColor = i11;
        invalidate();
    }

    public final void setGravity(Gravity gravity) {
        this.gravity = gravity;
        invalidate();
    }

    public final void setIndicator(boolean z11) {
        this.isIndicator = z11;
        this.touchInProgress = false;
    }

    public final void setMaxStarSize(float f7) {
        this.maxStarSize = f7;
        if (this.currentStarSize > f7) {
            requestLayout();
            generateInternalCanvas(getWidth(), getHeight());
            invalidate();
        }
    }

    public final void setNumberOfStars(int i11) {
        this.numberOfStars = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException(e.b(new Object[]{Integer.valueOf(i11)}, 1, "VectorRatingBar initialized with invalid value for numberOfStars. Found %d, but should be greater than 0", "format(...)").toString());
        }
        setRating(0.0f);
        requestLayout();
        generateInternalCanvas(getWidth(), getHeight());
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        this.clickListener = listener;
    }

    public final void setOnRatingBarChangeListener(@NotNull OnRatingBarChangeListener ratingListener) {
        Intrinsics.checkNotNullParameter(ratingListener, "ratingListener");
        this.ratingListener = ratingListener;
    }

    public final void setPressedFillColor(int i11) {
        this.pressedFillColor = i11;
        invalidate();
    }

    public final void setPressedStarBackgroundColor(int i11) {
        this.pressedStarBackgroundColor = i11;
        invalidate();
    }

    public final void setRating(float f7) {
        OnRatingBarChangeListener onRatingBarChangeListener;
        this.rating = normalizeRating(f7);
        invalidate();
        ValueAnimator valueAnimator = this.ratingAnimator;
        if ((valueAnimator == null || !valueAnimator.isRunning()) && (onRatingBarChangeListener = this.ratingListener) != null) {
            onRatingBarChangeListener.onRatingChanged(this, this.rating, false);
        }
    }

    public final void setStarIcon(int i11) {
        this.starIcon = i11;
        invalidate();
    }

    public final void setStarSize(float f7) {
        this.desiredStarSize = f7;
        requestLayout();
        generateInternalCanvas(getWidth(), getHeight());
        invalidate();
    }

    public final void setStarsSeparation(float f7) {
        this.starsSeparation = f7;
        requestLayout();
        generateInternalCanvas(getWidth(), getHeight());
        invalidate();
    }

    public final void setStepSize(float f7) {
        this.stepSize = f7;
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException(e.b(new Object[]{Float.valueOf(f7)}, 1, "VectorRatingBar initialized with invalid value for stepSize. Found %f, but should be greater than 0", "format(...)").toString());
        }
        invalidate();
    }
}
