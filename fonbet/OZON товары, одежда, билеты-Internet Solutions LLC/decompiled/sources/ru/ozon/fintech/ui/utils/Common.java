package ru.ozon.fintech.ui.utils;

import Bk.C2638a;
import D3.h;
import De.C2860c;
import Ef0.c;
import G.g;
import I1.w;
import N3.C3660k;
import T7.P;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.ActionResult2UI;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\bX\b\u0086\b\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B\u008b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010,\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010,¢\u0006\u0004\b.\u0010/J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010_\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010`\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00107J\u0015\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rHÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010g\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010h\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010i\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010l\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0011\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010u\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010v\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010w\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010{\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010,HÆ\u0003J\u0017\u0010|\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010,HÆ\u0003JÊ\u0003\u0010}\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010,2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010,HÆ\u0001¢\u0006\u0002\u0010~J\u0014\u0010\u007f\u001a\u00020\b2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0006HÖ\u0001J\n\u0010\u0082\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b:\u00107R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b;\u00107R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00105\u001a\u0004\b>\u00104R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00105\u001a\u0004\b?\u00104R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00105\u001a\u0004\b@\u00104R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00105\u001a\u0004\bA\u00104R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010D\u001a\u0004\bI\u0010CR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010FR\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bK\u0010HR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bM\u0010HR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00101R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00105\u001a\u0004\bQ\u00104R\u0015\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00105\u001a\u0004\bR\u00104R\u0015\u0010$\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00105\u001a\u0004\bS\u00104R\u0015\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u00105\u001a\u0004\bT\u00104R\u0015\u0010&\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010D\u001a\u0004\bU\u0010CR\u0015\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00108\u001a\u0004\b'\u00107R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00101R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00101R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00101R\u001f\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u001f\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b[\u0010Z¨\u0006\u0084\u0001"}, d2 = {"Lru/ozon/fintech/ui/utils/Common;", "", "cbottomId", "", "widgetId", "version", "", "clickable", "", "touchDown", "skeletonable", "disableHighlightAnimation", "actionListener", "Lkotlin/Function1;", "Lru/ozon/fintech/ui/ActionResult2UI;", "", "width", "height", "ratioW", "ratioH", "percentW", "", "margins", "Landroid/graphics/Rect;", "layoutGravity", "", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "backgroundGradientOrientation", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "alpha", "isHidden", "composerActionBehavior", "composerActionLink", "composerActionId", "composerActionParams", "", "composerTrackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/Float;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Landroid/graphics/drawable/GradientDrawable$Orientation;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getCbottomId", "()Ljava/lang/String;", "getWidgetId", "getVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClickable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTouchDown", "getSkeletonable", "getDisableHighlightAnimation", "getActionListener", "()Lkotlin/jvm/functions/Function1;", "getWidth", "getHeight", "getRatioW", "getRatioH", "getPercentW", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMargins", "()Landroid/graphics/Rect;", "getLayoutGravity", "()Ljava/util/List;", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundColor", "getBackgroundGradient", "getBackgroundGradientOrientation", "()Landroid/graphics/drawable/GradientDrawable$Orientation;", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getAlpha", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "getComposerActionParams", "()Ljava/util/Map;", "getComposerTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/Float;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Landroid/graphics/drawable/GradientDrawable$Orientation;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/ui/utils/Common;", "equals", "other", "hashCode", "toString", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Common {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Function1<ActionResult2UI, Unit> actionListener;
    private final Float alpha;
    private final String backgroundColor;
    private final List<String> backgroundGradient;
    private final GradientDrawable.Orientation backgroundGradientOrientation;
    private final List<Integer> backgroundRadius;

    @NotNull
    private final String cbottomId;
    private final Boolean clickable;
    private final String composerActionBehavior;
    private final String composerActionId;
    private final String composerActionLink;
    private final Map<String, String> composerActionParams;
    private final Map<String, Object> composerTrackingInfo;
    private final Integer dashGap;
    private final Integer dashWidth;
    private final Boolean disableHighlightAnimation;
    private final Integer elevation;
    private final Integer height;
    private final Boolean isHidden;
    private final List<Integer> layoutGravity;
    private final Float layoutWeight;
    private final Rect margins;
    private final Rect paddings;
    private final Float percentW;
    private final Integer ratioH;
    private final Integer ratioW;
    private final Boolean skeletonable;
    private final String strokeColor;
    private final Integer strokeWidth;
    private final Boolean touchDown;
    private final Integer version;

    @NotNull
    private final String widgetId;
    private final Integer width;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/fintech/ui/utils/Common$Companion;", "", "<init>", "()V", "build", "Lru/ozon/fintech/ui/utils/Common;", "actionListener", "Lkotlin/Function1;", "Lru/ozon/fintech/ui/ActionResult2UI;", "", "paddings", "Landroid/graphics/Rect;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Common build$default(Companion companion, Function1 function1, Rect rect, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                rect = null;
            }
            return companion.build(function1, rect);
        }

        @NotNull
        public final Common build(@NotNull Function1<? super ActionResult2UI, Unit> actionListener, Rect paddings) {
            Intrinsics.checkNotNullParameter(actionListener, "actionListener");
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            int i11 = -3;
            return new Common("", "", 2, bool, bool2, bool2, bool2, actionListener, i11, i11, null, null, null, null, null, null, paddings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435456, 1, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Common(@NotNull String cbottomId, @NotNull String widgetId, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, @NotNull Function1<? super ActionResult2UI, Unit> actionListener, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, Rect rect, List<Integer> list, Float f11, Rect rect2, List<Integer> list2, String str, List<String> list3, GradientDrawable.Orientation orientation, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, String str3, String str4, String str5, Map<String, String> map, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        this.cbottomId = cbottomId;
        this.widgetId = widgetId;
        this.version = num;
        this.clickable = bool;
        this.touchDown = bool2;
        this.skeletonable = bool3;
        this.disableHighlightAnimation = bool4;
        this.actionListener = actionListener;
        this.width = num2;
        this.height = num3;
        this.ratioW = num4;
        this.ratioH = num5;
        this.percentW = f7;
        this.margins = rect;
        this.layoutGravity = list;
        this.layoutWeight = f11;
        this.paddings = rect2;
        this.backgroundRadius = list2;
        this.backgroundColor = str;
        this.backgroundGradient = list3;
        this.backgroundGradientOrientation = orientation;
        this.strokeColor = str2;
        this.strokeWidth = num6;
        this.dashWidth = num7;
        this.dashGap = num8;
        this.elevation = num9;
        this.alpha = f12;
        this.isHidden = bool5;
        this.composerActionBehavior = str3;
        this.composerActionLink = str4;
        this.composerActionId = str5;
        this.composerActionParams = map;
        this.composerTrackingInfo = map2;
    }

    public static /* synthetic */ Common copy$default(Common common, String str, String str2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Function1 function1, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, Rect rect, List list, Float f11, Rect rect2, List list2, String str3, List list3, GradientDrawable.Orientation orientation, String str4, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, String str5, String str6, String str7, Map map, Map map2, int i11, int i12, Object obj) {
        Map map3;
        Map map4;
        Rect rect3;
        List list4;
        String str8;
        List list5;
        GradientDrawable.Orientation orientation2;
        String str9;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        Float f13;
        Boolean bool6;
        String str10;
        String str11;
        String str12;
        List list6;
        String str13;
        Integer num14;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Function1 function12;
        Integer num15;
        Integer num16;
        Integer num17;
        Integer num18;
        Float f14;
        Rect rect4;
        Float f15;
        String str14 = (i11 & 1) != 0 ? common.cbottomId : str;
        String str15 = (i11 & 2) != 0 ? common.widgetId : str2;
        Integer num19 = (i11 & 4) != 0 ? common.version : num;
        Boolean bool11 = (i11 & 8) != 0 ? common.clickable : bool;
        Boolean bool12 = (i11 & 16) != 0 ? common.touchDown : bool2;
        Boolean bool13 = (i11 & 32) != 0 ? common.skeletonable : bool3;
        Boolean bool14 = (i11 & 64) != 0 ? common.disableHighlightAnimation : bool4;
        Function1 function13 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? common.actionListener : function1;
        Integer num20 = (i11 & 256) != 0 ? common.width : num2;
        Integer num21 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? common.height : num3;
        Integer num22 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? common.ratioW : num4;
        Integer num23 = (i11 & 2048) != 0 ? common.ratioH : num5;
        Float f16 = (i11 & 4096) != 0 ? common.percentW : f7;
        Rect rect5 = (i11 & 8192) != 0 ? common.margins : rect;
        String str16 = str14;
        List list7 = (i11 & 16384) != 0 ? common.layoutGravity : list;
        Float f17 = (i11 & 32768) != 0 ? common.layoutWeight : f11;
        Rect rect6 = (i11 & 65536) != 0 ? common.paddings : rect2;
        List list8 = (i11 & 131072) != 0 ? common.backgroundRadius : list2;
        String str17 = (i11 & 262144) != 0 ? common.backgroundColor : str3;
        List list9 = (i11 & 524288) != 0 ? common.backgroundGradient : list3;
        GradientDrawable.Orientation orientation3 = (i11 & 1048576) != 0 ? common.backgroundGradientOrientation : orientation;
        String str18 = (i11 & 2097152) != 0 ? common.strokeColor : str4;
        Integer num24 = (i11 & 4194304) != 0 ? common.strokeWidth : num6;
        Integer num25 = (i11 & 8388608) != 0 ? common.dashWidth : num7;
        Integer num26 = (i11 & 16777216) != 0 ? common.dashGap : num8;
        Integer num27 = (i11 & 33554432) != 0 ? common.elevation : num9;
        Float f18 = (i11 & 67108864) != 0 ? common.alpha : f12;
        Boolean bool15 = (i11 & 134217728) != 0 ? common.isHidden : bool5;
        String str19 = (i11 & 268435456) != 0 ? common.composerActionBehavior : str5;
        String str20 = (i11 & 536870912) != 0 ? common.composerActionLink : str6;
        String str21 = (i11 & 1073741824) != 0 ? common.composerActionId : str7;
        Map map5 = (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? common.composerActionParams : map;
        if ((i12 & 1) != 0) {
            map4 = map5;
            map3 = common.composerTrackingInfo;
            list4 = list8;
            str8 = str17;
            list5 = list9;
            orientation2 = orientation3;
            str9 = str18;
            num10 = num24;
            num11 = num25;
            num12 = num26;
            num13 = num27;
            f13 = f18;
            bool6 = bool15;
            str10 = str19;
            str11 = str20;
            str12 = str21;
            list6 = list7;
            num14 = num19;
            bool7 = bool11;
            bool8 = bool12;
            bool9 = bool13;
            bool10 = bool14;
            function12 = function13;
            num15 = num20;
            num16 = num21;
            num17 = num22;
            num18 = num23;
            f14 = f16;
            rect4 = rect5;
            f15 = f17;
            rect3 = rect6;
            str13 = str15;
        } else {
            map3 = map2;
            map4 = map5;
            rect3 = rect6;
            list4 = list8;
            str8 = str17;
            list5 = list9;
            orientation2 = orientation3;
            str9 = str18;
            num10 = num24;
            num11 = num25;
            num12 = num26;
            num13 = num27;
            f13 = f18;
            bool6 = bool15;
            str10 = str19;
            str11 = str20;
            str12 = str21;
            list6 = list7;
            str13 = str15;
            num14 = num19;
            bool7 = bool11;
            bool8 = bool12;
            bool9 = bool13;
            bool10 = bool14;
            function12 = function13;
            num15 = num20;
            num16 = num21;
            num17 = num22;
            num18 = num23;
            f14 = f16;
            rect4 = rect5;
            f15 = f17;
        }
        return common.copy(str16, str13, num14, bool7, bool8, bool9, bool10, function12, num15, num16, num17, num18, f14, rect4, list6, f15, rect3, list4, str8, list5, orientation2, str9, num10, num11, num12, num13, f13, bool6, str10, str11, str12, map4, map3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCbottomId() {
        return this.cbottomId;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getRatioW() {
        return this.ratioW;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getRatioH() {
        return this.ratioH;
    }

    /* renamed from: component13, reason: from getter */
    public final Float getPercentW() {
        return this.percentW;
    }

    /* renamed from: component14, reason: from getter */
    public final Rect getMargins() {
        return this.margins;
    }

    public final List<Integer> component15() {
        return this.layoutGravity;
    }

    /* renamed from: component16, reason: from getter */
    public final Float getLayoutWeight() {
        return this.layoutWeight;
    }

    /* renamed from: component17, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final List<Integer> component18() {
        return this.backgroundRadius;
    }

    /* renamed from: component19, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<String> component20() {
        return this.backgroundGradient;
    }

    /* renamed from: component21, reason: from getter */
    public final GradientDrawable.Orientation getBackgroundGradientOrientation() {
        return this.backgroundGradientOrientation;
    }

    /* renamed from: component22, reason: from getter */
    public final String getStrokeColor() {
        return this.strokeColor;
    }

    /* renamed from: component23, reason: from getter */
    public final Integer getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: component24, reason: from getter */
    public final Integer getDashWidth() {
        return this.dashWidth;
    }

    /* renamed from: component25, reason: from getter */
    public final Integer getDashGap() {
        return this.dashGap;
    }

    /* renamed from: component26, reason: from getter */
    public final Integer getElevation() {
        return this.elevation;
    }

    /* renamed from: component27, reason: from getter */
    public final Float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component28, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: component29, reason: from getter */
    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component30, reason: from getter */
    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    /* renamed from: component31, reason: from getter */
    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final Map<String, String> component32() {
        return this.composerActionParams;
    }

    public final Map<String, Object> component33() {
        return this.composerTrackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getClickable() {
        return this.clickable;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getTouchDown() {
        return this.touchDown;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getSkeletonable() {
        return this.skeletonable;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getDisableHighlightAnimation() {
        return this.disableHighlightAnimation;
    }

    @NotNull
    public final Function1<ActionResult2UI, Unit> component8() {
        return this.actionListener;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @NotNull
    public final Common copy(@NotNull String cbottomId, @NotNull String widgetId, Integer version, Boolean clickable, Boolean touchDown, Boolean skeletonable, Boolean disableHighlightAnimation, @NotNull Function1<? super ActionResult2UI, Unit> actionListener, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, Rect margins, List<Integer> layoutGravity, Float layoutWeight, Rect paddings, List<Integer> backgroundRadius, String backgroundColor, List<String> backgroundGradient, GradientDrawable.Orientation backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Float alpha, Boolean isHidden, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ? extends Object> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        return new Common(cbottomId, widgetId, version, clickable, touchDown, skeletonable, disableHighlightAnimation, actionListener, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundColor, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, alpha, isHidden, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Common)) {
            return false;
        }
        Common common = (Common) other;
        return Intrinsics.d(this.cbottomId, common.cbottomId) && Intrinsics.d(this.widgetId, common.widgetId) && Intrinsics.d(this.version, common.version) && Intrinsics.d(this.clickable, common.clickable) && Intrinsics.d(this.touchDown, common.touchDown) && Intrinsics.d(this.skeletonable, common.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, common.disableHighlightAnimation) && Intrinsics.d(this.actionListener, common.actionListener) && Intrinsics.d(this.width, common.width) && Intrinsics.d(this.height, common.height) && Intrinsics.d(this.ratioW, common.ratioW) && Intrinsics.d(this.ratioH, common.ratioH) && Intrinsics.d(this.percentW, common.percentW) && Intrinsics.d(this.margins, common.margins) && Intrinsics.d(this.layoutGravity, common.layoutGravity) && Intrinsics.d(this.layoutWeight, common.layoutWeight) && Intrinsics.d(this.paddings, common.paddings) && Intrinsics.d(this.backgroundRadius, common.backgroundRadius) && Intrinsics.d(this.backgroundColor, common.backgroundColor) && Intrinsics.d(this.backgroundGradient, common.backgroundGradient) && this.backgroundGradientOrientation == common.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, common.strokeColor) && Intrinsics.d(this.strokeWidth, common.strokeWidth) && Intrinsics.d(this.dashWidth, common.dashWidth) && Intrinsics.d(this.dashGap, common.dashGap) && Intrinsics.d(this.elevation, common.elevation) && Intrinsics.d(this.alpha, common.alpha) && Intrinsics.d(this.isHidden, common.isHidden) && Intrinsics.d(this.composerActionBehavior, common.composerActionBehavior) && Intrinsics.d(this.composerActionLink, common.composerActionLink) && Intrinsics.d(this.composerActionId, common.composerActionId) && Intrinsics.d(this.composerActionParams, common.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, common.composerTrackingInfo);
    }

    @NotNull
    public final Function1<ActionResult2UI, Unit> getActionListener() {
        return this.actionListener;
    }

    public final Float getAlpha() {
        return this.alpha;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<String> getBackgroundGradient() {
        return this.backgroundGradient;
    }

    public final GradientDrawable.Orientation getBackgroundGradientOrientation() {
        return this.backgroundGradientOrientation;
    }

    public final List<Integer> getBackgroundRadius() {
        return this.backgroundRadius;
    }

    @NotNull
    public final String getCbottomId() {
        return this.cbottomId;
    }

    public final Boolean getClickable() {
        return this.clickable;
    }

    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    public final Map<String, String> getComposerActionParams() {
        return this.composerActionParams;
    }

    public final Map<String, Object> getComposerTrackingInfo() {
        return this.composerTrackingInfo;
    }

    public final Integer getDashGap() {
        return this.dashGap;
    }

    public final Integer getDashWidth() {
        return this.dashWidth;
    }

    public final Boolean getDisableHighlightAnimation() {
        return this.disableHighlightAnimation;
    }

    public final Integer getElevation() {
        return this.elevation;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final List<Integer> getLayoutGravity() {
        return this.layoutGravity;
    }

    public final Float getLayoutWeight() {
        return this.layoutWeight;
    }

    public final Rect getMargins() {
        return this.margins;
    }

    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Float getPercentW() {
        return this.percentW;
    }

    public final Integer getRatioH() {
        return this.ratioH;
    }

    public final Integer getRatioW() {
        return this.ratioW;
    }

    public final Boolean getSkeletonable() {
        return this.skeletonable;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final Integer getStrokeWidth() {
        return this.strokeWidth;
    }

    public final Boolean getTouchDown() {
        return this.touchDown;
    }

    public final Integer getVersion() {
        return this.version;
    }

    @NotNull
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int a11 = g.a(this.cbottomId.hashCode() * 31, 31, this.widgetId);
        Integer num = this.version;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.clickable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.touchDown;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.skeletonable;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.disableHighlightAnimation;
        int hashCode5 = (this.actionListener.hashCode() + ((hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31)) * 31;
        Integer num2 = this.width;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.ratioW;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.ratioH;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f7 = this.percentW;
        int hashCode10 = (hashCode9 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Rect rect = this.margins;
        int hashCode11 = (hashCode10 + (rect == null ? 0 : rect.hashCode())) * 31;
        List<Integer> list = this.layoutGravity;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Float f11 = this.layoutWeight;
        int hashCode13 = (hashCode12 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Rect rect2 = this.paddings;
        int hashCode14 = (hashCode13 + (rect2 == null ? 0 : rect2.hashCode())) * 31;
        List<Integer> list2 = this.backgroundRadius;
        int hashCode15 = (hashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode16 = (hashCode15 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list3 = this.backgroundGradient;
        int hashCode17 = (hashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        GradientDrawable.Orientation orientation = this.backgroundGradientOrientation;
        int hashCode18 = (hashCode17 + (orientation == null ? 0 : orientation.hashCode())) * 31;
        String str2 = this.strokeColor;
        int hashCode19 = (hashCode18 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num6 = this.strokeWidth;
        int hashCode20 = (hashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.dashWidth;
        int hashCode21 = (hashCode20 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.dashGap;
        int hashCode22 = (hashCode21 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.elevation;
        int hashCode23 = (hashCode22 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Float f12 = this.alpha;
        int hashCode24 = (hashCode23 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Boolean bool5 = this.isHidden;
        int hashCode25 = (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str3 = this.composerActionBehavior;
        int hashCode26 = (hashCode25 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.composerActionLink;
        int hashCode27 = (hashCode26 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.composerActionId;
        int hashCode28 = (hashCode27 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode29 = (hashCode28 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.composerTrackingInfo;
        return hashCode29 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isHidden() {
        return this.isHidden;
    }

    @NotNull
    public String toString() {
        String str = this.cbottomId;
        String str2 = this.widgetId;
        Integer num = this.version;
        Boolean bool = this.clickable;
        Boolean bool2 = this.touchDown;
        Boolean bool3 = this.skeletonable;
        Boolean bool4 = this.disableHighlightAnimation;
        Function1<ActionResult2UI, Unit> function1 = this.actionListener;
        Integer num2 = this.width;
        Integer num3 = this.height;
        Integer num4 = this.ratioW;
        Integer num5 = this.ratioH;
        Float f7 = this.percentW;
        Rect rect = this.margins;
        List<Integer> list = this.layoutGravity;
        Float f11 = this.layoutWeight;
        Rect rect2 = this.paddings;
        List<Integer> list2 = this.backgroundRadius;
        String str3 = this.backgroundColor;
        List<String> list3 = this.backgroundGradient;
        GradientDrawable.Orientation orientation = this.backgroundGradientOrientation;
        String str4 = this.strokeColor;
        Integer num6 = this.strokeWidth;
        Integer num7 = this.dashWidth;
        Integer num8 = this.dashGap;
        Integer num9 = this.elevation;
        Float f12 = this.alpha;
        Boolean bool5 = this.isHidden;
        String str5 = this.composerActionBehavior;
        String str6 = this.composerActionLink;
        String str7 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, Object> map2 = this.composerTrackingInfo;
        StringBuilder d11 = C3660k.d("Common(cbottomId=", str, ", widgetId=", str2, ", version=");
        C2860c.f(bool, num, ", clickable=", ", touchDown=", d11);
        h.h(d11, bool2, ", skeletonable=", bool3, ", disableHighlightAnimation=");
        d11.append(bool4);
        d11.append(", actionListener=");
        d11.append(function1);
        d11.append(", width=");
        c.e(d11, num2, ", height=", num3, ", ratioW=");
        c.e(d11, num4, ", ratioH=", num5, ", percentW=");
        d11.append(f7);
        d11.append(", margins=");
        d11.append(rect);
        d11.append(", layoutGravity=");
        d11.append(list);
        d11.append(", layoutWeight=");
        d11.append(f11);
        d11.append(", paddings=");
        d11.append(rect2);
        d11.append(", backgroundRadius=");
        d11.append(list2);
        d11.append(", backgroundColor=");
        w.d(str3, ", backgroundGradient=", ", backgroundGradientOrientation=", d11, list3);
        d11.append(orientation);
        d11.append(", strokeColor=");
        d11.append(str4);
        d11.append(", strokeWidth=");
        c.e(d11, num6, ", dashWidth=", num7, ", dashGap=");
        c.e(d11, num8, ", elevation=", num9, ", alpha=");
        d11.append(f12);
        d11.append(", isHidden=");
        d11.append(bool5);
        d11.append(", composerActionBehavior=");
        Nh.a.h(d11, str5, ", composerActionLink=", str6, ", composerActionId=");
        C2638a.e(d11, str7, ", composerActionParams=", map, ", composerTrackingInfo=");
        return P.f(d11, map2, ")");
    }

    public /* synthetic */ Common(String str, String str2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Function1 function1, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, Rect rect, List list, Float f11, Rect rect2, List list2, String str3, List list3, GradientDrawable.Orientation orientation, String str4, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, String str5, String str6, String str7, Map map, Map map2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, bool, bool2, bool3, bool4, function1, num2, num3, num4, num5, f7, rect, list, f11, rect2, list2, str3, list3, orientation, str4, num6, num7, num8, num9, f12, bool5, (i11 & 268435456) != 0 ? null : str5, (i11 & 536870912) != 0 ? null : str6, (i11 & 1073741824) != 0 ? null : str7, (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : map, (i12 & 1) != 0 ? null : map2);
    }
}
