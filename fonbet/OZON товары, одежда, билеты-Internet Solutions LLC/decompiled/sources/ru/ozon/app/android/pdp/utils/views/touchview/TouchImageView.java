package ru.ozon.app.android.pdp.utils.views.touchview;

import B90.N;
import Hj.C3143a;
import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000 £\u00012\u00020\u0001:\u0012£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010/J\u0015\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\fH\u0002¢\u0006\u0004\b;\u0010:J'\u0010?\u001a\u0002052\u0006\u0010<\u001a\u0002052\u0006\u0010=\u001a\u0002052\u0006\u0010>\u001a\u000205H\u0002¢\u0006\u0004\b?\u0010@J'\u0010B\u001a\u0002052\u0006\u0010A\u001a\u0002052\u0006\u0010=\u001a\u0002052\u0006\u0010>\u001a\u000205H\u0002¢\u0006\u0004\bB\u0010@J\u000f\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bC\u0010:J\u000f\u0010D\u001a\u00020\fH\u0002¢\u0006\u0004\bD\u0010:J'\u0010H\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010IJ?\u0010N\u001a\u0002052\u0006\u0010<\u001a\u0002052\u0006\u0010J\u001a\u0002052\u0006\u0010K\u001a\u0002052\u0006\u0010L\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\f2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ/\u0010Y\u001a\u00020\f2\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u0002052\u0006\u0010W\u001a\u0002052\u0006\u0010X\u001a\u00020-H\u0002¢\u0006\u0004\bY\u0010ZJ\u001f\u0010^\u001a\u00020]2\u0006\u0010[\u001a\u0002052\u0006\u0010\\\u001a\u000205H\u0002¢\u0006\u0004\b^\u0010_J\u001f\u0010b\u001a\u00020]2\u0006\u0010`\u001a\u0002052\u0006\u0010a\u001a\u000205H\u0002¢\u0006\u0004\bb\u0010_R\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010gR\u0016\u0010h\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010iR\u0016\u0010k\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010iR\u0016\u0010n\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010iR\u0016\u0010o\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010iR\u0016\u0010p\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010iR\u0016\u0010r\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001c\u0010u\u001a\b\u0018\u00010tR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010lR\u0016\u0010|\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010lR\u0016\u0010}\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010xR\u0016\u0010~\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010xR\u0016\u0010\u007f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010xR\u0018\u0010\u0080\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010xR\u0018\u0010\u0081\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010iR\u0018\u0010\u0082\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010iR\u0018\u0010\u0083\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010iR\u0018\u0010\u0084\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010iR\u001a\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R'\u0010\u008d\u0001\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u008d\u0001\u0010i\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0005\b\u0090\u0001\u00108R)\u0010\u0092\u0001\u001a\u0002052\u0007\u0010\u0091\u0001\u001a\u0002058\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010i\u001a\u0006\b\u0093\u0001\u0010\u008f\u0001R(\u0010\u0094\u0001\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0094\u0001\u0010l\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R(\u0010\u0098\u0001\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0098\u0001\u0010l\u001a\u0006\b\u0098\u0001\u0010\u0095\u0001\"\u0006\b\u0099\u0001\u0010\u0097\u0001R\u0014\u0010\u009a\u0001\u001a\u00020-8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u0095\u0001R)\u0010\u009e\u0001\u001a\u0002052\u0007\u0010\u009b\u0001\u001a\u0002058F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u009c\u0001\u0010\u008f\u0001\"\u0005\b\u009d\u0001\u00108R\u0017\u0010 \u0001\u001a\u0002058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u008f\u0001R\u0017\u0010¢\u0001\u001a\u0002058BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u008f\u0001¨\u0006¬\u0001"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "newW", "newH", "oldw", "oldh", "onSizeChanged", "(IIII)V", "resId", "setImageResource", "(I)V", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/net/Uri;", "uri", "setImageURI", "(Landroid/net/Uri;)V", "Landroid/widget/ImageView$ScaleType;", "type", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "direction", "", "canScrollHorizontally", "(I)Z", "canScrollVertically", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$OnTouchImageViewListener;", "onTouchImageViewListener", "setOnTouchImageViewListener", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$OnTouchImageViewListener;)V", "", "max", "setMaxZoomRatio", "(F)V", "fixTrans", "()V", "fixScaleTrans", "trans", "viewSize", "contentSize", "getFixTrans", "(FFF)F", "delta", "getFixDragTrans", "fitImageToView", "savePreviousImageValues", "mode", "size", "drawableWidth", "setViewSize", "(III)I", "prevImageSize", "imageSize", "prevViewSize", "drawableSize", "newTranslationAfterChange", "(FFFIII)F", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$ImageActionState;", "imageActionState", "setState", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$ImageActionState;)V", "", "deltaScale", "focusX", "focusY", "stretchImageToSuper", "scaleImage", "(DFFZ)V", "x", "y", "Landroid/graphics/PointF;", "transformCoordTouchToBitmap", "(FF)Landroid/graphics/PointF;", "bx", "by", "transformCoordBitmapToTouch", "Landroid/graphics/Matrix;", "touchMatrix", "Landroid/graphics/Matrix;", "prevMatrix", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$ImageActionState;", "userSpecifiedMinScale", "F", "minScale", "maxScaleIsSetByMultiplier", "Z", "maxScaleMultiplier", "maxScale", "superMinScale", "superMaxScale", "", "floatMatrix", "[F", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$Fling;", "fling", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$Fling;", "orientation", "I", "touchScaleType", "Landroid/widget/ImageView$ScaleType;", "imageRenderedAtLeastOnce", "onDrawReady", "viewWidth", "viewHeight", "prevViewWidth", "prevViewHeight", "matchViewWidth", "matchViewHeight", "prevMatchViewWidth", "prevMatchViewHeight", "Landroid/view/ScaleGestureDetector;", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "touchImageViewListener", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$OnTouchImageViewListener;", "doubleTapScale", "getDoubleTapScale", "()F", "setDoubleTapScale", AppMeasurementSdk.ConditionalUserProperty.VALUE, "currentZoom", "getCurrentZoom", "isZoomEnabled", "()Z", "setZoomEnabled", "(Z)V", "isSuperZoomEnabled", "setSuperZoomEnabled", "isZoomed", "min", "getMinZoom", "setMinZoom", "minZoom", "getImageWidth", "imageWidth", "getImageHeight", "imageHeight", "Companion", "OnTouchImageViewListener", "GestureListener", "PrivateOnTouchListener", "ScaleListener", "DoubleTapZoom", "Fling", "CompatScroller", "ImageActionState", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class TouchImageView extends AppCompatImageView {
    private float currentZoom;
    private float doubleTapScale;
    private Fling fling;

    @NotNull
    private float[] floatMatrix;

    @NotNull
    private GestureDetector gestureDetector;
    private ImageActionState imageActionState;
    private boolean imageRenderedAtLeastOnce;
    private boolean isSuperZoomEnabled;
    private boolean isZoomEnabled;
    private float matchViewHeight;
    private float matchViewWidth;
    private float maxScale;
    private boolean maxScaleIsSetByMultiplier;
    private float maxScaleMultiplier;
    private float minScale;
    private boolean onDrawReady;
    private int orientation;
    private float prevMatchViewHeight;
    private float prevMatchViewWidth;

    @NotNull
    private Matrix prevMatrix;
    private int prevViewHeight;
    private int prevViewWidth;

    @NotNull
    private ScaleGestureDetector scaleDetector;
    private float superMaxScale;
    private float superMinScale;
    private OnTouchImageViewListener touchImageViewListener;

    @NotNull
    private Matrix touchMatrix;
    private ImageView.ScaleType touchScaleType;
    private float userSpecifiedMinScale;
    private int viewHeight;
    private int viewWidth;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\"\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$CompatScroller;", "", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;Landroid/content/Context;)V", "", "startX", "startY", "velocityX", "velocityY", "minX", "maxX", "minY", "maxY", "", "fling", "(IIIIIIII)V", "", "finished", "forceFinished", "(Z)V", "computeScrollOffset", "()Z", "Landroid/widget/OverScroller;", "overScroller", "Landroid/widget/OverScroller;", "getOverScroller", "()Landroid/widget/OverScroller;", "setOverScroller", "(Landroid/widget/OverScroller;)V", "isFinished", "getCurrX", "()I", "currX", "getCurrY", "currY", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class CompatScroller {

        @NotNull
        private OverScroller overScroller;

        public CompatScroller(Context context) {
            this.overScroller = new OverScroller(context);
        }

        public final boolean computeScrollOffset() {
            this.overScroller.computeScrollOffset();
            return this.overScroller.computeScrollOffset();
        }

        public final void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) {
            this.overScroller.fling(startX, startY, velocityX, velocityY, minX, maxX, minY, maxY);
        }

        public final void forceFinished(boolean finished) {
            this.overScroller.forceFinished(finished);
        }

        public final int getCurrX() {
            return this.overScroller.getCurrX();
        }

        public final int getCurrY() {
            return this.overScroller.getCurrY();
        }

        public final boolean isFinished() {
            return this.overScroller.isFinished();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0003H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$DoubleTapZoom;", "Ljava/lang/Runnable;", "targetZoom", "", "focusX", "focusY", "stretchImageToSuper", "", "<init>", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;FFFZ)V", "startTime", "", "startZoom", "bitmapX", "bitmapY", "interpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "startTouch", "Landroid/graphics/PointF;", "endTouch", "run", "", "translateImageToCenterTouchPosition", "interpolation", "toImageCenter", "interpolate", "calculateDeltaScale", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class DoubleTapZoom implements Runnable {
        private final float bitmapX;
        private final float bitmapY;

        @NotNull
        private final PointF endTouch;

        @NotNull
        private final AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();
        private final long startTime;

        @NotNull
        private final PointF startTouch;
        private final float startZoom;
        private final boolean stretchImageToSuper;
        private final float targetZoom;

        public DoubleTapZoom(float f7, float f11, float f12, boolean z11) {
            TouchImageView.this.setState(ImageActionState.ANIMATE_ZOOM);
            this.startTime = SystemClock.elapsedRealtime();
            this.startZoom = TouchImageView.this.getCurrentZoom();
            this.targetZoom = f7;
            this.stretchImageToSuper = z11;
            PointF transformCoordTouchToBitmap = TouchImageView.this.transformCoordTouchToBitmap(f11, f12);
            float f13 = transformCoordTouchToBitmap.x;
            this.bitmapX = f13;
            float f14 = transformCoordTouchToBitmap.y;
            this.bitmapY = f14;
            this.startTouch = TouchImageView.this.transformCoordBitmapToTouch(f13, f14);
            this.endTouch = new PointF(TouchImageView.this.viewWidth / 2, TouchImageView.this.viewHeight / 2);
        }

        private final double calculateDeltaScale(float interpolation) {
            return ((interpolation * (this.targetZoom - r0)) + this.startZoom) / TouchImageView.this.getCurrentZoom();
        }

        private final float interpolate() {
            return this.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.startTime) / 500.0f));
        }

        private final void translateImageToCenterTouchPosition(float interpolation, boolean toImageCenter) {
            float d11;
            float f7;
            PointF transformCoordBitmapToTouch;
            if (toImageCenter) {
                PointF pointF = new PointF(TouchImageView.this.viewWidth / 2.0f, TouchImageView.this.viewHeight / 2.0f);
                transformCoordBitmapToTouch = TouchImageView.this.transformCoordBitmapToTouch(r0.getDrawable().getIntrinsicWidth() / 2.0f, TouchImageView.this.getDrawable().getIntrinsicHeight() / 2.0f);
                float f11 = transformCoordBitmapToTouch.x;
                f7 = C3143a.d(pointF.x, f11, interpolation, f11);
                float f12 = transformCoordBitmapToTouch.y;
                d11 = C3143a.d(pointF.y, f12, interpolation, f12);
            } else {
                PointF pointF2 = this.startTouch;
                float f13 = pointF2.x;
                PointF pointF3 = this.endTouch;
                float d12 = C3143a.d(pointF3.x, f13, interpolation, f13);
                float f14 = pointF2.y;
                d11 = C3143a.d(pointF3.y, f14, interpolation, f14);
                f7 = d12;
                transformCoordBitmapToTouch = TouchImageView.this.transformCoordBitmapToTouch(this.bitmapX, this.bitmapY);
            }
            TouchImageView.this.touchMatrix.postTranslate(f7 - transformCoordBitmapToTouch.x, d11 - transformCoordBitmapToTouch.y);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TouchImageView.this.getDrawable() == null) {
                TouchImageView.this.setState(ImageActionState.NONE);
                return;
            }
            float interpolate = interpolate();
            TouchImageView.this.scaleImage(calculateDeltaScale(interpolate), this.bitmapX, this.bitmapY, this.stretchImageToSuper);
            translateImageToCenterTouchPosition(interpolate, this.targetZoom == TouchImageView.this.getMinScale());
            TouchImageView.this.fixScaleTrans();
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.setImageMatrix(touchImageView.touchMatrix);
            if (interpolate < 1.0f) {
                TouchImageView.this.postOnAnimation(this);
            } else {
                TouchImageView.this.setState(ImageActionState.NONE);
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tR&\u0010\r\u001a\u00060\u000bR\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$Fling;", "Ljava/lang/Runnable;", "", "velocityX", "velocityY", "<init>", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;II)V", "", "run", "()V", "cancelFling", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$CompatScroller;", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;", "scroller", "Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$CompatScroller;", "getScroller", "()Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$CompatScroller;", "setScroller", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$CompatScroller;)V", "currX", "I", "getCurrX", "()I", "setCurrX", "(I)V", "currY", "getCurrY", "setCurrY", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class Fling implements Runnable {
        private int currX;
        private int currY;

        @NotNull
        private CompatScroller scroller;

        public Fling(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            TouchImageView.this.setState(ImageActionState.FLING);
            this.scroller = TouchImageView.this.new CompatScroller(TouchImageView.this.getContext());
            TouchImageView.this.touchMatrix.getValues(TouchImageView.this.floatMatrix);
            int i17 = (int) TouchImageView.this.floatMatrix[2];
            int i18 = (int) TouchImageView.this.floatMatrix[5];
            if (TouchImageView.this.getImageWidth() > TouchImageView.this.viewWidth) {
                i13 = TouchImageView.this.viewWidth - ((int) TouchImageView.this.getImageWidth());
                i14 = 0;
            } else {
                i13 = i17;
                i14 = i13;
            }
            if (TouchImageView.this.getImageHeight() > TouchImageView.this.viewHeight) {
                i15 = TouchImageView.this.viewHeight - ((int) TouchImageView.this.getImageHeight());
                i16 = 0;
            } else {
                i15 = i18;
                i16 = i15;
            }
            this.scroller.fling(i17, i18, i11, i12, i13, i14, i15, i16);
            this.currX = i17;
            this.currY = i18;
        }

        public final void cancelFling() {
            TouchImageView.this.setState(ImageActionState.NONE);
            this.scroller.forceFinished(true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.scroller.isFinished() && this.scroller.computeScrollOffset()) {
                int currX = this.scroller.getCurrX();
                int currY = this.scroller.getCurrY();
                int i11 = currX - this.currX;
                int i12 = currY - this.currY;
                this.currX = currX;
                this.currY = currY;
                TouchImageView.this.touchMatrix.postTranslate(i11, i12);
                TouchImageView.this.fixTrans();
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.setImageMatrix(touchImageView.touchMatrix);
                TouchImageView.this.postOnAnimation(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;)V", "onFling", "", "event1", "Landroid/view/MotionEvent;", "event2", "velocityX", "", "velocityY", "onDoubleTap", "event", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!TouchImageView.this.getIsZoomEnabled() || TouchImageView.this.imageActionState != ImageActionState.NONE) {
                return false;
            }
            float doubleTapScale = TouchImageView.this.getDoubleTapScale() == 0.0f ? TouchImageView.this.maxScale : TouchImageView.this.getDoubleTapScale();
            if (TouchImageView.this.getCurrentZoom() != TouchImageView.this.minScale) {
                doubleTapScale = TouchImageView.this.minScale;
            }
            TouchImageView.this.postOnAnimation(TouchImageView.this.new DoubleTapZoom(doubleTapScale, event.getX(), event.getY(), false));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent event1, @NotNull MotionEvent event2, float velocityX, float velocityY) {
            Intrinsics.checkNotNullParameter(event2, "event2");
            if (!TouchImageView.this.isZoomed()) {
                return false;
            }
            Fling fling = TouchImageView.this.fling;
            if (fling != null) {
                fling.cancelFling();
            }
            TouchImageView touchImageView = TouchImageView.this;
            Fling fling2 = touchImageView.new Fling((int) velocityX, (int) velocityY);
            TouchImageView.this.postOnAnimation(fling2);
            touchImageView.fling = fling2;
            return super.onFling(event1, event2, velocityX, velocityY);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$ImageActionState;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "DRAG", "ZOOM", "FLING", "ANIMATE_ZOOM", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ImageActionState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ImageActionState[] $VALUES;
        public static final ImageActionState NONE = new ImageActionState("NONE", 0);
        public static final ImageActionState DRAG = new ImageActionState("DRAG", 1);
        public static final ImageActionState ZOOM = new ImageActionState("ZOOM", 2);
        public static final ImageActionState FLING = new ImageActionState("FLING", 3);
        public static final ImageActionState ANIMATE_ZOOM = new ImageActionState("ANIMATE_ZOOM", 4);

        private static final /* synthetic */ ImageActionState[] $values() {
            return new ImageActionState[]{NONE, DRAG, ZOOM, FLING, ANIMATE_ZOOM};
        }

        static {
            ImageActionState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ImageActionState(String str, int i11) {
        }

        public static ImageActionState valueOf(String str) {
            return (ImageActionState) Enum.valueOf(ImageActionState.class, str);
        }

        public static ImageActionState[] values() {
            return (ImageActionState[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$OnTouchImageViewListener;", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTouchImageViewListener {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$PrivateOnTouchListener;", "Landroid/view/View$OnTouchListener;", "<init>", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;)V", "last", "Landroid/graphics/PointF;", "onTouch", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class PrivateOnTouchListener implements View.OnTouchListener {

        @NotNull
        private final PointF last = new PointF();

        public PrivateOnTouchListener() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        
            if (r2 != 6) goto L40;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            if (TouchImageView.this.getDrawable() == null) {
                TouchImageView.this.setState(ImageActionState.NONE);
                return false;
            }
            if (!TouchImageView.this.onDrawReady) {
                return false;
            }
            if (TouchImageView.this.getIsZoomEnabled()) {
                TouchImageView.this.scaleDetector.onTouchEvent(event);
            }
            TouchImageView.this.gestureDetector.onTouchEvent(event);
            PointF pointF = new PointF(event.getX(), event.getY());
            if (TouchImageView.this.imageActionState != ImageActionState.ZOOM && TouchImageView.this.imageActionState != ImageActionState.ANIMATE_ZOOM) {
                int action = event.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            if (event.getPointerCount() > 1) {
                                TouchImageView.this.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            if (TouchImageView.this.imageActionState == ImageActionState.DRAG && TouchImageView.this.isZoomed()) {
                                float f7 = pointF.x;
                                PointF pointF2 = this.last;
                                float f11 = f7 - pointF2.x;
                                float f12 = pointF.y - pointF2.y;
                                TouchImageView.this.touchMatrix.postTranslate(TouchImageView.this.getFixDragTrans(f11, r2.viewWidth, TouchImageView.this.getImageWidth()), TouchImageView.this.getFixDragTrans(f12, r2.viewHeight, TouchImageView.this.getImageHeight()));
                                TouchImageView.this.fixTrans();
                                this.last.set(pointF.x, pointF.y);
                            }
                        }
                    }
                    if (event.getPointerCount() <= 1) {
                        TouchImageView.this.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    TouchImageView.this.setState(ImageActionState.NONE);
                } else {
                    this.last.set(pointF);
                    Fling fling = TouchImageView.this.fling;
                    if (fling != null) {
                        fling.cancelFling();
                    }
                    TouchImageView.this.setState(ImageActionState.DRAG);
                }
            }
            OnTouchImageViewListener onTouchImageViewListener = TouchImageView.this.touchImageViewListener;
            if (onTouchImageViewListener != null) {
                ReviewGalleryBaseWidgetVH._init_$lambda$17((ReviewGalleryBaseWidgetVH) ((N) onTouchImageViewListener).f3114a, view, event, TouchImageView.this.isZoomed());
            }
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.setImageMatrix(touchImageView.touchMatrix);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "<init>", "(Lru/ozon/app/android/pdp/utils/views/touchview/TouchImageView;)V", "onScaleBegin", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScale", "onScaleEnd", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            TouchImageView.this.scaleImage(detector.getScaleFactor(), detector.getFocusX(), detector.getFocusY(), TouchImageView.this.getIsSuperZoomEnabled());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            TouchImageView.this.setState(ImageActionState.ZOOM);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            super.onScaleEnd(detector);
            TouchImageView.this.setState(ImageActionState.NONE);
            float currentZoom = TouchImageView.this.getCurrentZoom();
            boolean z11 = true;
            if (TouchImageView.this.getCurrentZoom() > TouchImageView.this.maxScale) {
                currentZoom = TouchImageView.this.maxScale;
            } else if (TouchImageView.this.getCurrentZoom() < TouchImageView.this.minScale) {
                currentZoom = TouchImageView.this.minScale;
            } else {
                z11 = false;
            }
            float f7 = currentZoom;
            if (z11) {
                TouchImageView.this.postOnAnimation(TouchImageView.this.new DoubleTapZoom(f7, r3.viewWidth / 2, TouchImageView.this.viewHeight / 2, TouchImageView.this.getIsSuperZoomEnabled()));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TouchImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void fitImageToView() {
        TouchImageView touchImageView;
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0 || this.touchMatrix == null || this.prevMatrix == null) {
            return;
        }
        if (this.userSpecifiedMinScale == -1.0f) {
            setMinZoom(-1.0f);
            float f7 = this.currentZoom;
            float f11 = this.minScale;
            if (f7 < f11) {
                this.currentZoom = f11;
            }
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float f12 = intrinsicWidth;
        float f13 = this.viewWidth / f12;
        float f14 = intrinsicHeight;
        float f15 = this.viewHeight / f14;
        ImageView.ScaleType scaleType = this.touchScaleType;
        switch (scaleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()]) {
            case 1:
                f13 = 1.0f;
                break;
            case 2:
                f13 = Math.max(f13, f15);
                break;
            case 3:
                float min = Math.min(1.0f, Math.min(f13, f15));
                f13 = Math.min(min, min);
                break;
            case 4:
            case 5:
            case 6:
                f13 = Math.min(f13, f15);
                break;
        }
        f15 = f13;
        int i11 = this.viewWidth;
        float f16 = i11 - (f13 * f12);
        int i12 = this.viewHeight;
        float f17 = i12 - (f15 * f14);
        this.matchViewWidth = i11 - f16;
        this.matchViewHeight = i12 - f17;
        if (isZoomed() || this.imageRenderedAtLeastOnce) {
            if (this.prevMatchViewWidth == 0.0f || this.prevMatchViewHeight == 0.0f) {
                savePreviousImageValues();
            }
            this.prevMatrix.getValues(this.floatMatrix);
            float[] fArr = this.floatMatrix;
            float f18 = this.matchViewWidth / f12;
            float f19 = this.currentZoom;
            fArr[0] = f18 * f19;
            fArr[4] = (this.matchViewHeight / f14) * f19;
            float f21 = fArr[2];
            float f22 = fArr[5];
            this.floatMatrix[2] = newTranslationAfterChange(f21, this.prevMatchViewWidth * f19, getImageWidth(), this.prevViewWidth, this.viewWidth, intrinsicWidth);
            touchImageView = this;
            this.floatMatrix[5] = newTranslationAfterChange(f22, this.prevMatchViewHeight * this.currentZoom, getImageHeight(), this.prevViewHeight, this.viewHeight, intrinsicHeight);
            touchImageView.touchMatrix.setValues(touchImageView.floatMatrix);
        } else {
            this.touchMatrix.setScale(f13, f15);
            ImageView.ScaleType scaleType2 = this.touchScaleType;
            int i13 = scaleType2 != null ? WhenMappings.$EnumSwitchMapping$0[scaleType2.ordinal()] : -1;
            if (i13 == 5) {
                this.touchMatrix.postTranslate(0.0f, 0.0f);
            } else if (i13 != 6) {
                float f23 = 2;
                this.touchMatrix.postTranslate(f16 / f23, f17 / f23);
            } else {
                this.touchMatrix.postTranslate(f16, f17);
            }
            this.currentZoom = 1.0f;
            touchImageView = this;
        }
        fixTrans();
        setImageMatrix(touchImageView.touchMatrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fixScaleTrans() {
        fixTrans();
        this.touchMatrix.getValues(this.floatMatrix);
        float imageWidth = getImageWidth();
        int i11 = this.viewWidth;
        if (imageWidth < i11) {
            this.floatMatrix[2] = (i11 - getImageWidth()) / 2;
        }
        float imageHeight = getImageHeight();
        int i12 = this.viewHeight;
        if (imageHeight < i12) {
            this.floatMatrix[5] = (i12 - getImageHeight()) / 2;
        }
        this.touchMatrix.setValues(this.floatMatrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fixTrans() {
        this.touchMatrix.getValues(this.floatMatrix);
        float[] fArr = this.floatMatrix;
        this.touchMatrix.postTranslate(getFixTrans(fArr[2], this.viewWidth, getImageWidth()), getFixTrans(fArr[5], this.viewHeight, getImageHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getFixDragTrans(float delta, float viewSize, float contentSize) {
        if (contentSize <= viewSize) {
            return 0.0f;
        }
        return delta;
    }

    private final float getFixTrans(float trans, float viewSize, float contentSize) {
        float f7;
        float f11;
        if (contentSize <= viewSize) {
            f11 = viewSize - contentSize;
            f7 = 0.0f;
        } else {
            f7 = viewSize - contentSize;
            f11 = 0.0f;
        }
        if (trans < f7) {
            return (-trans) + f7;
        }
        if (trans > f11) {
            return (-trans) + f11;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageHeight() {
        return this.matchViewHeight * this.currentZoom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageWidth() {
        return this.matchViewWidth * this.currentZoom;
    }

    private final float newTranslationAfterChange(float trans, float prevImageSize, float imageSize, int prevViewSize, int viewSize, int drawableSize) {
        float f7 = viewSize;
        if (imageSize < f7) {
            return (f7 - (drawableSize * this.floatMatrix[0])) * 0.5f;
        }
        if (trans > 0.0f) {
            return -((imageSize - f7) * 0.5f);
        }
        return -(((((prevViewSize * 0.5f) + (-trans)) / prevImageSize) * imageSize) - (f7 * 0.5f));
    }

    private final void savePreviousImageValues() {
        if (this.viewHeight == 0 || this.viewWidth == 0) {
            return;
        }
        this.touchMatrix.getValues(this.floatMatrix);
        this.prevMatrix.setValues(this.floatMatrix);
        this.prevMatchViewHeight = this.matchViewHeight;
        this.prevMatchViewWidth = this.matchViewWidth;
        this.prevViewHeight = this.viewHeight;
        this.prevViewWidth = this.viewWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scaleImage(double deltaScale, float focusX, float focusY, boolean stretchImageToSuper) {
        float f7;
        float f11;
        double d11;
        if (stretchImageToSuper) {
            f7 = this.superMinScale;
            f11 = this.superMaxScale;
        } else {
            f7 = this.minScale;
            f11 = this.maxScale;
        }
        float f12 = this.currentZoom;
        float f13 = ((float) deltaScale) * f12;
        this.currentZoom = f13;
        if (f13 <= f11) {
            if (f13 < f7) {
                this.currentZoom = f7;
                d11 = f7;
            }
            float f14 = (float) deltaScale;
            this.touchMatrix.postScale(f14, f14, focusX, focusY);
            fixScaleTrans();
        }
        this.currentZoom = f11;
        d11 = f11;
        deltaScale = d11 / f12;
        float f142 = (float) deltaScale;
        this.touchMatrix.postScale(f142, f142, focusX, focusY);
        fixScaleTrans();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ImageActionState imageActionState) {
        this.imageActionState = imageActionState;
    }

    private final int setViewSize(int mode, int size, int drawableWidth) {
        return mode != Integer.MIN_VALUE ? mode != 0 ? size : drawableWidth : Math.min(drawableWidth, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PointF transformCoordBitmapToTouch(float bx2, float by) {
        this.touchMatrix.getValues(this.floatMatrix);
        return new PointF((getImageWidth() * (bx2 / getDrawable().getIntrinsicWidth())) + this.floatMatrix[2], (getImageHeight() * (by / getDrawable().getIntrinsicHeight())) + this.floatMatrix[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PointF transformCoordTouchToBitmap(float x11, float y11) {
        this.touchMatrix.getValues(this.floatMatrix);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float[] fArr = this.floatMatrix;
        return new PointF(((x11 - fArr[2]) * intrinsicWidth) / getImageWidth(), ((y11 - fArr[5]) * intrinsicHeight) / getImageHeight());
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        this.touchMatrix.getValues(this.floatMatrix);
        float f7 = this.floatMatrix[2];
        if (getImageWidth() < this.viewWidth || (f7 >= -1.0f && direction < 0)) {
            return false;
        }
        return (Math.abs(f7) + ((float) this.viewWidth)) + ((float) 1) < getImageWidth() || direction <= 0;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        this.touchMatrix.getValues(this.floatMatrix);
        float f7 = this.floatMatrix[5];
        if (getImageHeight() < this.viewWidth || (f7 >= -1.0f && direction < 0)) {
            return false;
        }
        return (Math.abs(f7) + ((float) this.viewHeight)) + ((float) 1) < getImageHeight() || direction <= 0;
    }

    public final float getCurrentZoom() {
        return this.currentZoom;
    }

    public final float getDoubleTapScale() {
        return this.doubleTapScale;
    }

    /* renamed from: getMinZoom, reason: from getter */
    public final float getMinScale() {
        return this.minScale;
    }

    /* renamed from: isSuperZoomEnabled, reason: from getter */
    public final boolean getIsSuperZoomEnabled() {
        return this.isSuperZoomEnabled;
    }

    /* renamed from: isZoomEnabled, reason: from getter */
    public final boolean getIsZoomEnabled() {
        return this.isZoomEnabled;
    }

    public final boolean isZoomed() {
        return !(this.currentZoom == 1.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.onDrawReady = true;
        this.imageRenderedAtLeastOnce = true;
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(setViewSize(mode, size, drawable.getIntrinsicWidth()), setViewSize(View.MeasureSpec.getMode(heightMeasureSpec), size2, drawable.getIntrinsicHeight()));
    }

    @Override // android.view.View
    protected void onSizeChanged(int newW, int newH, int oldw, int oldh) {
        super.onSizeChanged(newW, newH, oldw, oldh);
        this.viewWidth = (newW - getPaddingRight()) - getPaddingLeft();
        this.viewHeight = (newH - getPaddingTop()) - getPaddingBottom();
        fitImageToView();
    }

    public final void setDoubleTapScale(float f7) {
        this.doubleTapScale = f7;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageBitmap(bm);
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageDrawable(drawable);
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageResource(resId);
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageURI(uri);
        fitImageToView();
    }

    public final void setMaxZoomRatio(float max) {
        this.maxScaleMultiplier = max;
        float f7 = this.minScale * max;
        this.maxScale = f7;
        this.superMaxScale = f7 * 1.25f;
        this.maxScaleIsSetByMultiplier = true;
    }

    public final void setMinZoom(float f7) {
        this.userSpecifiedMinScale = f7;
        if (f7 == -1.0f) {
            ImageView.ScaleType scaleType = this.touchScaleType;
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
            if (scaleType == scaleType2 || scaleType == ImageView.ScaleType.CENTER_CROP) {
                Drawable drawable = getDrawable();
                if (drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                    float intrinsicWidth = this.viewWidth / drawable.getIntrinsicWidth();
                    float intrinsicHeight = this.viewHeight / drawable.getIntrinsicHeight();
                    this.minScale = this.touchScaleType == scaleType2 ? Math.min(intrinsicWidth, intrinsicHeight) : Math.min(intrinsicWidth, intrinsicHeight) / Math.max(intrinsicWidth, intrinsicHeight);
                }
            } else {
                this.minScale = 1.0f;
            }
        } else {
            this.minScale = f7;
        }
        if (this.maxScaleIsSetByMultiplier) {
            setMaxZoomRatio(this.maxScaleMultiplier);
        }
        this.superMinScale = this.minScale * 0.75f;
    }

    public final void setOnTouchImageViewListener(@NotNull OnTouchImageViewListener onTouchImageViewListener) {
        Intrinsics.checkNotNullParameter(onTouchImageViewListener, "onTouchImageViewListener");
        this.touchImageViewListener = onTouchImageViewListener;
    }

    @Override // android.widget.ImageView
    public void setScaleType(@NotNull ImageView.ScaleType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (type == scaleType) {
            super.setScaleType(scaleType);
        } else {
            this.touchScaleType = type;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isZoomEnabled = true;
        this.isSuperZoomEnabled = true;
        setClickable(true);
        this.orientation = getResources().getConfiguration().orientation;
        this.scaleDetector = new ScaleGestureDetector(context, new ScaleListener());
        this.gestureDetector = new GestureDetector(context, new GestureListener());
        this.touchMatrix = new Matrix();
        this.prevMatrix = new Matrix();
        this.floatMatrix = new float[9];
        this.currentZoom = 1.0f;
        if (this.touchScaleType == null) {
            this.touchScaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.minScale = 1.0f;
        this.maxScale = 3.0f;
        this.superMinScale = 1.0f * 0.75f;
        this.superMaxScale = 3.0f * 1.25f;
        setImageMatrix(this.touchMatrix);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        setState(ImageActionState.NONE);
        this.onDrawReady = false;
        setOnTouchListener(new PrivateOnTouchListener());
    }
}
