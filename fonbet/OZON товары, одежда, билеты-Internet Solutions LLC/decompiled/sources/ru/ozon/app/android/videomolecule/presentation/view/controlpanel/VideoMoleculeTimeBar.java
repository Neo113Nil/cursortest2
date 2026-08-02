package ru.ozon.app.android.videomolecule.presentation.view.controlpanel;

import Bi.a;
import EY.b;
import Gl.C3124a;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.y;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import m3.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.extensions.AttrsExtensionKt;
import ru.ozon.app.android.storefront.ui.videomolecule.R$styleable;
import x4.c;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 ¶\u00012\u00020\u00012\u00020\u0002:\u0002¶\u0001B3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\"2\u0006\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010'\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u000100H\u0014¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u00105J\u001f\u00109\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0014¢\u0006\u0004\b9\u0010:J7\u0010@\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0007H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ!\u0010S\u001a\u00020\"2\u0006\u0010P\u001a\u00020\u00072\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u0011H\u0002¢\u0006\u0004\bV\u0010\u0014J\u0017\u0010W\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u0011H\u0002¢\u0006\u0004\bW\u0010\u0014J\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\"H\u0002¢\u0006\u0004\bY\u0010%J\u0017\u0010[\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\u0011H\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u000eH\u0002¢\u0006\u0004\b]\u00105J\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u00020c2\u0006\u0010b\u001a\u00020&H\u0002¢\u0006\u0004\bd\u0010eJ\u001f\u0010h\u001a\u00020\"2\u0006\u0010f\u001a\u00020^2\u0006\u0010g\u001a\u00020^H\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bj\u0010EJ\u0017\u0010k\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bk\u0010EJ\u000f\u0010l\u001a\u00020\u000eH\u0002¢\u0006\u0004\bl\u00105J\u001f\u0010o\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020\u00072\u0006\u0010n\u001a\u00020\u0007H\u0003¢\u0006\u0004\bo\u0010:J\u0017\u0010r\u001a\u00020\"2\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\br\u0010sR\u0014\u0010t\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010v\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010uR\u0014\u0010w\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010uR\u0014\u0010x\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010uR\u0014\u0010y\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010uR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010|R\u0014\u0010~\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R\u0014\u0010\u007f\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010|R\u0016\u0010\u0080\u0001\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010|R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0085\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0085\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0085\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0085\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0085\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0085\u0001R\u001d\u0010\u0091\u0001\u001a\b0\u008f\u0001j\u0003`\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001e\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009c\u0001\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010\u009e\u0001\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010 \u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0085\u0001R\u0019\u0010¡\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010£\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0085\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u009f\u0001R\u0019\u0010¨\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010©\u0001R\u0017\u0010U\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010¢\u0001R\u0017\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0017\u0010¢\u0001R\u0017\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010¢\u0001R\u0017\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010¢\u0001R\u0017\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0085\u0001R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010«\u0001R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010¬\u0001R\u001a\u0010\u00ad\u0001\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010uR\u0016\u0010¯\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\u001aR\u0018\u0010³\u0001\u001a\u00030°\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0016\u0010µ\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u001a¨\u0006·\u0001"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar;", "Landroid/view/View;", "Landroidx/media3/ui/y;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "timebarAttrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V", "Landroidx/media3/ui/y$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Landroidx/media3/ui/y$a;)V", "", "position", "setPosition", "(J)V", "bufferedPosition", "setBufferedPosition", "duration", "setDuration", "getPreferredUpdateDelay", "()J", "", "adGroupTimesMs", "", "playedAdGroups", "adGroupCount", "setAdGroupTimesMs", "([J[ZI)V", "", "enabled", "setEnabled", "(Z)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "keyCode", "Landroid/view/KeyEvent;", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "gainFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "drawableStateChanged", "()V", "jumpDrawablesToCurrentState", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "Landroid/view/accessibility/AccessibilityEvent;", "onInitializeAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "action", "Landroid/os/Bundle;", "args", "performAccessibilityAction", "(ILandroid/os/Bundle;)Z", "scrubPosition", "startScrubbing", "updateScrubbing", "canceled", "stopScrubbing", "positionChange", "scrubIncrementally", "(J)Z", "update", "", "xPosition", "positionScrubber", "(F)V", "motionEvent", "Landroid/graphics/Point;", "resolveRelativeTouchPosition", "(Landroid/view/MotionEvent;)Landroid/graphics/Point;", "x", "y", "isInSeekBar", "(FF)Z", "drawTimeBar", "drawPlayhead", "updateDrawableState", "width", "height", "setSystemGestureExclusionRectsV29", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawableLayoutDirection", "(Landroid/graphics/drawable/Drawable;)Z", "seekBounds", "Landroid/graphics/Rect;", "progressBar", "scrubberProgressBar", "bufferedBar", "scrubberBar", "Landroid/graphics/Paint;", "playedPaint", "Landroid/graphics/Paint;", "bufferedPaint", "unplayedPaint", "adMarkerPaint", "playedAdMarkerPaint", "scrubberPaint", "scrubberDrawable", "Landroid/graphics/drawable/Drawable;", "barHeight", "I", "scrubbedBarHeight", "touchTargetHeight", "barGravity", "adMarkerWidth", "scrubberEnabledSize", "scrubberDisabledSize", "scrubberDraggedSize", "scrubberPadding", "fineScrubYThreshold", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "formatBuilder", "Ljava/lang/StringBuilder;", "Ljava/util/Formatter;", "formatter", "Ljava/util/Formatter;", "Ljava/lang/Runnable;", "stopScrubbingRunnable", "Ljava/lang/Runnable;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "touchPosition", "Landroid/graphics/Point;", "density", "F", "keyCountIncrement", "keyTimeIncrement", "J", "lastCoarseScrubXPosition", "Landroid/animation/ValueAnimator;", "scrubberScalingAnimator", "Landroid/animation/ValueAnimator;", "scrubberScale", "scrubberPaddingDisabled", "Z", "scrubbing", "[J", "[Z", "lastExclusionRectangle", "getScrubberPosition", "scrubberPosition", "", "getProgressText", "()Ljava/lang/String;", "progressText", "getPositionIncrement", "positionIncrement", "Companion", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"PrivateResource"})
/* loaded from: classes2.dex */
public final class VideoMoleculeTimeBar extends View implements y {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int adGroupCount;
    private long[] adGroupTimesMs;

    @NotNull
    private final Paint adMarkerPaint;
    private int adMarkerWidth;
    private int barGravity;
    private int barHeight;

    @NotNull
    private final Rect bufferedBar;

    @NotNull
    private final Paint bufferedPaint;
    private long bufferedPosition;
    private final float density;
    private long duration;
    private final int fineScrubYThreshold;

    @NotNull
    private final StringBuilder formatBuilder;

    @NotNull
    private final Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private Rect lastExclusionRectangle;

    @NotNull
    private final CopyOnWriteArraySet<y.a> listeners;
    private boolean[] playedAdGroups;

    @NotNull
    private final Paint playedAdMarkerPaint;

    @NotNull
    private final Paint playedPaint;
    private long position;

    @NotNull
    private final Rect progressBar;
    private long scrubPosition;
    private int scrubbedBarHeight;

    @NotNull
    private final Rect scrubberBar;
    private int scrubberDisabledSize;
    private int scrubberDraggedSize;
    private Drawable scrubberDrawable;
    private int scrubberEnabledSize;
    private int scrubberPadding;
    private boolean scrubberPaddingDisabled;

    @NotNull
    private final Paint scrubberPaint;

    @NotNull
    private final Rect scrubberProgressBar;
    private float scrubberScale;

    @NotNull
    private final ValueAnimator scrubberScalingAnimator;
    private boolean scrubbing;

    @NotNull
    private final Rect seekBounds;

    @NotNull
    private final Runnable stopScrubbingRunnable;

    @NotNull
    private final Point touchPosition;
    private int touchTargetHeight;

    @NotNull
    private final Paint unplayedPaint;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "a", "Landroid/content/res/TypedArray;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.videomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<TypedArray, Unit> {
        final /* synthetic */ int $defaultAdMarkerWidth;
        final /* synthetic */ int $defaultBarHeight;
        final /* synthetic */ int $defaultScrubberDisabledSize;
        final /* synthetic */ int $defaultScrubberDraggedSize;
        final /* synthetic */ int $defaultScrubberEnabledSize;
        final /* synthetic */ K $defaultTouchTargetHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i11, K k11, int i12, int i13, int i14, int i15) {
            super(1);
            this.$defaultBarHeight = i11;
            this.$defaultTouchTargetHeight = k11;
            this.$defaultAdMarkerWidth = i12;
            this.$defaultScrubberEnabledSize = i13;
            this.$defaultScrubberDisabledSize = i14;
            this.$defaultScrubberDraggedSize = i15;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TypedArray typedArray) {
            invoke2(typedArray);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TypedArray a11) {
            Intrinsics.checkNotNullParameter(a11, "a");
            VideoMoleculeTimeBar videoMoleculeTimeBar = VideoMoleculeTimeBar.this;
            Drawable drawable = a11.getDrawable(10);
            if (drawable != null) {
                VideoMoleculeTimeBar videoMoleculeTimeBar2 = VideoMoleculeTimeBar.this;
                K k11 = this.$defaultTouchTargetHeight;
                videoMoleculeTimeBar2.setDrawableLayoutDirection(drawable);
                k11.f71785a = Math.max(drawable.getMinimumHeight(), k11.f71785a);
            } else {
                drawable = null;
            }
            videoMoleculeTimeBar.scrubberDrawable = drawable;
            VideoMoleculeTimeBar.this.barHeight = a11.getDimensionPixelSize(3, this.$defaultBarHeight);
            VideoMoleculeTimeBar.this.touchTargetHeight = a11.getDimensionPixelSize(12, this.$defaultTouchTargetHeight.f71785a);
            VideoMoleculeTimeBar.this.barGravity = a11.getInt(2, 0);
            VideoMoleculeTimeBar.this.adMarkerWidth = a11.getDimensionPixelSize(1, this.$defaultAdMarkerWidth);
            VideoMoleculeTimeBar.this.scrubberEnabledSize = a11.getDimensionPixelSize(11, this.$defaultScrubberEnabledSize);
            VideoMoleculeTimeBar.this.scrubberDisabledSize = a11.getDimensionPixelSize(8, this.$defaultScrubberDisabledSize);
            VideoMoleculeTimeBar.this.scrubberDraggedSize = a11.getDimensionPixelSize(9, this.$defaultScrubberDraggedSize);
            int i11 = a11.getInt(6, -1);
            int i12 = a11.getInt(7, -1);
            int i13 = a11.getInt(4, -855638017);
            int i14 = a11.getInt(13, 872415231);
            int i15 = a11.getInt(0, -1291845888);
            int i16 = a11.getInt(5, 872414976);
            VideoMoleculeTimeBar.this.playedPaint.setColor(i11);
            VideoMoleculeTimeBar.this.scrubberPaint.setColor(i12);
            VideoMoleculeTimeBar.this.bufferedPaint.setColor(i13);
            VideoMoleculeTimeBar.this.unplayedPaint.setColor(i14);
            VideoMoleculeTimeBar.this.adMarkerPaint.setColor(i15);
            VideoMoleculeTimeBar.this.playedAdMarkerPaint.setColor(i16);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "typedArray", "Landroid/content/res/TypedArray;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.videomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<TypedArray, Unit> {
        final /* synthetic */ int $defaultBarHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i11) {
            super(1);
            this.$defaultBarHeight = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TypedArray typedArray) {
            invoke2(typedArray);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TypedArray typedArray) {
            Intrinsics.checkNotNullParameter(typedArray, "typedArray");
            VideoMoleculeTimeBar.this.scrubbedBarHeight = typedArray.getDimensionPixelSize(R$styleable.VideoMoleculeTimeBar_scrubbed_bar_height, this.$defaultBarHeight);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0002J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0018\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/view/controlpanel/VideoMoleculeTimeBar$Companion;", "", "<init>", "()V", "DEFAULT_BAR_HEIGHT_DP", "", "DEFAULT_TOUCH_TARGET_HEIGHT_DP", "DEFAULT_AD_MARKER_WIDTH_DP", "DEFAULT_SCRUBBER_ENABLED_SIZE_DP", "DEFAULT_SCRUBBER_DISABLED_SIZE_DP", "DEFAULT_SCRUBBER_DRAGGED_SIZE_DP", "DEFAULT_PLAYED_COLOR", "DEFAULT_UNPLAYED_COLOR", "DEFAULT_BUFFERED_COLOR", "DEFAULT_SCRUBBER_COLOR", "DEFAULT_AD_MARKER_COLOR", "DEFAULT_PLAYED_AD_MARKER_COLOR", "BAR_GRAVITY_CENTER", "BAR_GRAVITY_BOTTOM", "FINE_SCRUB_Y_THRESHOLD_DP", "FINE_SCRUB_RATIO", "STOP_SCRUBBING_TIMEOUT_MS", "", "DEFAULT_INCREMENT_COUNT", "SHOWN_SCRUBBER_SCALE", "", "HIDDEN_SCRUBBER_SCALE", "ACCESSIBILITY_CLASS_NAME", "", "setDrawableLayoutDirection", "", "drawable", "Landroid/graphics/drawable/Drawable;", "layoutDirection", "dpToPx", "density", "dps", "pxToDp", "px", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int dpToPx(float density, int dps) {
            return (int) ((dps * density) + 0.5f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int pxToDp(float density, int px) {
            return (int) (px / density);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean setDrawableLayoutDirection(Drawable drawable, int layoutDirection) {
            return N.f74289a >= 23 && drawable.setLayoutDirection(layoutDirection);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeTimeBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(VideoMoleculeTimeBar videoMoleculeTimeBar, ValueAnimator valueAnimator) {
        videoMoleculeTimeBar.scrubberScale = ((Float) a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        videoMoleculeTimeBar.invalidate();
    }

    private final void drawPlayhead(Canvas canvas) {
        if (this.duration <= 0) {
            return;
        }
        Rect rect = this.scrubberBar;
        int i11 = N.i(rect.right, rect.left, this.progressBar.right);
        int centerY = this.scrubberBar.centerY();
        if (this.scrubberDrawable == null) {
            canvas.drawCircle(i11, centerY, (int) ((((this.scrubbing || isFocused()) ? this.scrubberDraggedSize : isEnabled() ? this.scrubberEnabledSize : this.scrubberDisabledSize) * this.scrubberScale) / 2), this.scrubberPaint);
            return;
        }
        int intrinsicWidth = (int) (r2.getIntrinsicWidth() * this.scrubberScale);
        int intrinsicHeight = (int) (r2.getIntrinsicHeight() * this.scrubberScale);
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            int i12 = intrinsicWidth / 2;
            int i13 = intrinsicHeight / 2;
            drawable.setBounds(i11 - i12, centerY - i13, i11 + i12, centerY + i13);
        }
        Drawable drawable2 = this.scrubberDrawable;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    private final void drawTimeBar(Canvas canvas) {
        int height = ((this.scrubbing || isFocused()) ? this.scrubberProgressBar : this.progressBar).height();
        int centerY = this.progressBar.centerY() - (height / 2);
        int i11 = height + centerY;
        if (this.duration <= 0) {
            Rect rect = this.progressBar;
            float f7 = 66;
            canvas.drawRoundRect(rect.left, centerY, rect.right, i11, f7, f7, this.unplayedPaint);
            return;
        }
        Rect rect2 = this.bufferedBar;
        int i12 = rect2.left;
        int i13 = rect2.right;
        int max = Math.max(this.progressBar.left, this.scrubberBar.right);
        int i14 = this.progressBar.right;
        if (max < i14) {
            float f11 = 66;
            canvas.drawRoundRect(max, centerY, i14, i11, f11, f11, this.unplayedPaint);
        }
        int max2 = Math.max(i12, this.scrubberBar.right);
        if (i13 > max2) {
            float f12 = 66;
            canvas.drawRoundRect(max2, centerY, i13, i11, f12, f12, this.bufferedPaint);
        }
        if (this.scrubberBar.width() > 0) {
            Rect rect3 = this.scrubberBar;
            float f13 = 66;
            canvas.drawRoundRect(rect3.left, centerY, rect3.right, i11, f13, f13, this.playedPaint);
        }
        if (this.adGroupCount == 0) {
            return;
        }
        long[] jArr = this.adGroupTimesMs;
        jArr.getClass();
        Intrinsics.checkNotNullExpressionValue(jArr, "checkNotNull(...)");
        boolean[] zArr = this.playedAdGroups;
        zArr.getClass();
        Intrinsics.checkNotNullExpressionValue(zArr, "checkNotNull(...)");
        int i15 = this.adMarkerWidth / 2;
        int i16 = this.adGroupCount;
        for (int i17 = 0; i17 < i16; i17++) {
            int width = ((int) ((this.progressBar.width() * N.j(jArr[i17], 0L, this.duration)) / this.duration)) - i15;
            Rect rect4 = this.progressBar;
            float f14 = 66;
            canvas.drawRoundRect(Math.min(rect4.width() - this.adMarkerWidth, Math.max(0, width)) + rect4.left, centerY, r10 + this.adMarkerWidth, i11, f14, f14, zArr[i17] ? this.playedAdMarkerPaint : this.adMarkerPaint);
        }
    }

    private final long getPositionIncrement() {
        long j11 = this.keyTimeIncrement;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        long j12 = this.duration;
        if (j12 == -9223372036854775807L) {
            return 0L;
        }
        return j12 / this.keyCountIncrement;
    }

    private final String getProgressText() {
        String E11 = N.E(this.formatBuilder, this.formatter, this.position);
        Intrinsics.checkNotNullExpressionValue(E11, "getStringForTime(...)");
        return E11;
    }

    private final long getScrubberPosition() {
        if (this.progressBar.width() <= 0 || this.duration == -9223372036854775807L) {
            return 0L;
        }
        return (this.scrubberBar.width() * this.duration) / this.progressBar.width();
    }

    private final boolean isInSeekBar(float x11, float y11) {
        return this.seekBounds.contains((int) x11, (int) y11);
    }

    private final void positionScrubber(float xPosition) {
        Rect rect = this.scrubberBar;
        Rect rect2 = this.progressBar;
        rect.right = N.i((int) xPosition, rect2.left, rect2.right);
    }

    private final Point resolveRelativeTouchPosition(MotionEvent motionEvent) {
        this.touchPosition.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.touchPosition;
    }

    private final boolean scrubIncrementally(long positionChange) {
        long j11 = this.duration;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.scrubbing ? this.scrubPosition : this.position;
        long j13 = N.j(j12 + positionChange, 0L, j11);
        if (j13 == j12) {
            return false;
        }
        if (this.scrubbing) {
            updateScrubbing(j13);
        } else {
            startScrubbing(j13);
        }
        update();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setDrawableLayoutDirection(Drawable drawable) {
        return N.f74289a >= 23 && INSTANCE.setDrawableLayoutDirection(drawable, getLayoutDirection());
    }

    private final void setSystemGestureExclusionRectsV29(int width, int height) {
        Rect rect = this.lastExclusionRectangle;
        if (rect == null || rect.width() == width || rect.height() == height) {
            Rect rect2 = new Rect(0, 0, width, height);
            setSystemGestureExclusionRects(C7714v.a0(rect2));
            this.lastExclusionRectangle = rect2;
        }
    }

    private final void startScrubbing(long scrubPosition) {
        this.scrubPosition = scrubPosition;
        this.scrubbing = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<y.a> it = this.listeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onScrubStart(this, scrubPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopScrubbing(boolean canceled) {
        removeCallbacks(this.stopScrubbingRunnable);
        this.scrubbing = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<y.a> it = this.listeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.scrubPosition, canceled);
        }
    }

    private final void update() {
        this.bufferedBar.set(this.progressBar);
        this.scrubberBar.set(this.progressBar);
        long j11 = this.scrubbing ? this.scrubPosition : this.position;
        if (this.duration > 0) {
            int width = (int) ((this.progressBar.width() * this.bufferedPosition) / this.duration);
            Rect rect = this.bufferedBar;
            Rect rect2 = this.progressBar;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.progressBar.width() * j11) / this.duration);
            Rect rect3 = this.scrubberBar;
            Rect rect4 = this.progressBar;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.bufferedBar;
            int i11 = this.progressBar.left;
            rect5.right = i11;
            this.scrubberBar.right = i11;
        }
        invalidate();
    }

    private final void updateDrawableState() {
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private final void updateScrubbing(long scrubPosition) {
        if (this.scrubPosition == scrubPosition) {
            return;
        }
        this.scrubPosition = scrubPosition;
        Iterator<y.a> it = this.listeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onScrubMove(this, scrubPosition);
        }
    }

    @Override // androidx.media3.ui.y
    public void addListener(@NotNull y.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.getClass();
        this.listeners.add(listener);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    @Override // androidx.media3.ui.y
    public long getPreferredUpdateDelay() {
        int pxToDp = INSTANCE.pxToDp(this.density, this.progressBar.width());
        if (pxToDp == 0) {
            return Long.MAX_VALUE;
        }
        long j11 = this.duration;
        if (j11 == 0 || j11 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j11 / pxToDp;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        drawTimeBar(canvas);
        drawPlayhead(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (!this.scrubbing || gainFocus) {
            return;
        }
        stopScrubbing(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(event);
        if (event.getEventType() == 4) {
            event.getText().add(getProgressText());
        }
        event.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName("android.widget.SeekBar");
        info.setContentDescription(getProgressText());
        if (this.duration <= 0) {
            return;
        }
        if (N.f74289a >= 21) {
            info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            info.addAction(4096);
            info.addAction(8192);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (keyCode != 66) {
                switch (keyCode) {
                    case 21:
                        if (scrubIncrementally(-positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                }
            }
            if (this.scrubbing) {
                stopScrubbing(false);
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i11;
        int i12;
        int i13 = right - left;
        int i14 = bottom - top;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i13 - getPaddingRight();
        int i15 = this.scrubberPaddingDisabled ? 0 : this.scrubberPadding;
        if (this.barGravity == 1) {
            i11 = (i14 - getPaddingBottom()) - this.touchTargetHeight;
            int paddingBottom = i14 - getPaddingBottom();
            int i16 = this.barHeight;
            i12 = (paddingBottom - i16) - Math.max(i15 - (i16 / 2), 0);
        } else {
            i11 = (i14 - this.touchTargetHeight) / 2;
            i12 = (i14 - this.barHeight) / 2;
        }
        this.seekBounds.set(paddingLeft, i11, paddingRight, this.touchTargetHeight + i11);
        Rect rect = this.progressBar;
        Rect rect2 = this.seekBounds;
        rect.set(rect2.left + i15, i12, rect2.right - i15, this.barHeight + i12);
        Rect rect3 = this.scrubberProgressBar;
        Rect rect4 = this.seekBounds;
        rect3.set(rect4.left + i15, i12, rect4.right - i15, this.scrubbedBarHeight + i12);
        if (N.f74289a >= 29) {
            setSystemGestureExclusionRectsV29(i13, i14);
        }
        update();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == 0) {
            size = this.touchTargetHeight;
        } else if (mode != 1073741824) {
            size = Math.min(this.touchTargetHeight, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), size);
        updateDrawableState();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null || !INSTANCE.setDrawableLayoutDirection(drawable, layoutDirection)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isEnabled() && this.duration > 0) {
            Point resolveRelativeTouchPosition = resolveRelativeTouchPosition(event);
            int i11 = resolveRelativeTouchPosition.x;
            int i12 = resolveRelativeTouchPosition.y;
            int action = event.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.scrubbing) {
                            if (i12 < this.fineScrubYThreshold) {
                                int i13 = this.lastCoarseScrubXPosition;
                                positionScrubber(C3124a.a(i11, i13, 3, i13));
                            } else {
                                this.lastCoarseScrubXPosition = i11;
                                positionScrubber(i11);
                            }
                            updateScrubbing(getScrubberPosition());
                            update();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.scrubbing) {
                    stopScrubbing(event.getAction() == 3);
                    return true;
                }
            } else {
                float f7 = i11;
                if (isInSeekBar(f7, i12)) {
                    positionScrubber(f7);
                    startScrubbing(getScrubberPosition());
                    update();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int action, Bundle args) {
        if (super.performAccessibilityAction(action, args)) {
            return true;
        }
        if (this.duration <= 0) {
            return false;
        }
        if (action != 4096) {
            if (action != 8192) {
                return false;
            }
            if (scrubIncrementally(-getPositionIncrement())) {
                stopScrubbing(false);
            }
        } else if (scrubIncrementally(getPositionIncrement())) {
            stopScrubbing(false);
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // androidx.media3.ui.y
    public void setAdGroupTimesMs(long[] adGroupTimesMs, boolean[] playedAdGroups, int adGroupCount) {
        G10.a.c(adGroupCount == 0 || !(adGroupTimesMs == null || playedAdGroups == null));
        this.adGroupCount = adGroupCount;
        this.adGroupTimesMs = adGroupTimesMs;
        this.playedAdGroups = playedAdGroups;
        update();
    }

    @Override // androidx.media3.ui.y
    public void setBufferedPosition(long bufferedPosition) {
        if (this.bufferedPosition == bufferedPosition) {
            return;
        }
        this.bufferedPosition = bufferedPosition;
        update();
    }

    @Override // androidx.media3.ui.y
    public void setDuration(long duration) {
        if (this.duration == duration) {
            return;
        }
        this.duration = duration;
        if (this.scrubbing && duration == -9223372036854775807L) {
            stopScrubbing(true);
        }
        update();
    }

    @Override // android.view.View, androidx.media3.ui.y
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!this.scrubbing || enabled) {
            return;
        }
        stopScrubbing(true);
    }

    @Override // androidx.media3.ui.y
    public void setPosition(long position) {
        if (this.position == position) {
            return;
        }
        this.position = position;
        setContentDescription(getProgressText());
        update();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ VideoMoleculeTimeBar(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? attributeSet : attributeSet2);
        attributeSet = (i12 & 2) != 0 ? null : attributeSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeTimeBar(@NotNull Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2) {
        super(context, attributeSet, i11);
        VideoMoleculeTimeBar videoMoleculeTimeBar;
        int max;
        Intrinsics.checkNotNullParameter(context, "context");
        this.seekBounds = new Rect();
        this.progressBar = new Rect();
        this.scrubberProgressBar = new Rect();
        this.bufferedBar = new Rect();
        this.scrubberBar = new Rect();
        Paint paint = new Paint();
        this.playedPaint = paint;
        Paint paint2 = new Paint();
        this.bufferedPaint = paint2;
        Paint paint3 = new Paint();
        this.unplayedPaint = paint3;
        Paint paint4 = new Paint();
        this.adMarkerPaint = paint4;
        Paint paint5 = new Paint();
        this.playedAdMarkerPaint = paint5;
        Paint paint6 = new Paint();
        this.scrubberPaint = paint6;
        paint6.setAntiAlias(true);
        this.listeners = new CopyOnWriteArraySet<>();
        this.touchPosition = new Point();
        float f7 = context.getResources().getDisplayMetrics().density;
        this.density = f7;
        Companion companion = INSTANCE;
        this.fineScrubYThreshold = companion.dpToPx(f7, -50);
        int dpToPx = companion.dpToPx(f7, 4);
        K k11 = new K();
        k11.f71785a = companion.dpToPx(f7, 26);
        int dpToPx2 = companion.dpToPx(f7, 4);
        int dpToPx3 = companion.dpToPx(f7, 12);
        int dpToPx4 = companion.dpToPx(f7, 0);
        int dpToPx5 = companion.dpToPx(f7, 16);
        if (attributeSet2 != null) {
            int[] DefaultTimeBar = c.f105019b;
            Intrinsics.checkNotNullExpressionValue(DefaultTimeBar, "DefaultTimeBar");
            videoMoleculeTimeBar = this;
            AttrsExtensionKt.obtain(attributeSet2, context, DefaultTimeBar, i11, videoMoleculeTimeBar.new AnonymousClass1(dpToPx, k11, dpToPx2, dpToPx3, dpToPx4, dpToPx5));
            int[] VideoMoleculeTimeBar = R$styleable.VideoMoleculeTimeBar;
            Intrinsics.checkNotNullExpressionValue(VideoMoleculeTimeBar, "VideoMoleculeTimeBar");
            AttrsExtensionKt.obtain(attributeSet2, context, VideoMoleculeTimeBar, i11, videoMoleculeTimeBar.new AnonymousClass2(dpToPx));
        } else {
            videoMoleculeTimeBar = this;
            videoMoleculeTimeBar.barHeight = dpToPx;
            videoMoleculeTimeBar.scrubbedBarHeight = dpToPx;
            videoMoleculeTimeBar.touchTargetHeight = k11.f71785a;
            videoMoleculeTimeBar.barGravity = 0;
            videoMoleculeTimeBar.adMarkerWidth = dpToPx2;
            videoMoleculeTimeBar.scrubberEnabledSize = dpToPx3;
            videoMoleculeTimeBar.scrubberDisabledSize = dpToPx4;
            videoMoleculeTimeBar.scrubberDraggedSize = dpToPx5;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            videoMoleculeTimeBar.scrubberDrawable = null;
        }
        StringBuilder sb2 = new StringBuilder();
        videoMoleculeTimeBar.formatBuilder = sb2;
        videoMoleculeTimeBar.formatter = new Formatter(sb2, Locale.getDefault());
        videoMoleculeTimeBar.stopScrubbingRunnable = new b(videoMoleculeTimeBar, 0);
        Drawable drawable = videoMoleculeTimeBar.scrubberDrawable;
        if (drawable != null) {
            max = (drawable.getMinimumWidth() + 1) / 2;
        } else {
            max = (Math.max(videoMoleculeTimeBar.scrubberDisabledSize, Math.max(videoMoleculeTimeBar.scrubberEnabledSize, videoMoleculeTimeBar.scrubberDraggedSize)) + 1) / 2;
        }
        videoMoleculeTimeBar.scrubberPadding = max;
        videoMoleculeTimeBar.scrubberScale = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        videoMoleculeTimeBar.scrubberScalingAnimator = valueAnimator;
        valueAnimator.addUpdateListener(new EY.c(videoMoleculeTimeBar, 0));
        videoMoleculeTimeBar.duration = -9223372036854775807L;
        videoMoleculeTimeBar.keyTimeIncrement = -9223372036854775807L;
        videoMoleculeTimeBar.keyCountIncrement = 20;
        videoMoleculeTimeBar.setFocusable(true);
        if (videoMoleculeTimeBar.getImportantForAccessibility() == 0) {
            videoMoleculeTimeBar.setImportantForAccessibility(1);
        }
    }
}
