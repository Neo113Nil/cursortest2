package ru.ozon.uni.android.uikit.view.atoms.badge;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 «\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004«\u0001¬\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u001dJ\u0019\u0010'\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0011H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b7\u00106J!\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010<J\u0013\u0010=\u001a\u00020\u0011*\u000201H\u0002¢\u0006\u0004\b=\u00104J\u0017\u0010>\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b>\u00104J\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\u00020\u0011*\u00020\u00142\b\u0010B\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bC\u0010\u001aJ\u000f\u0010D\u001a\u00020\u0011H\u0002¢\u0006\u0004\bD\u00106J\u000f\u0010E\u001a\u00020\u0011H\u0002¢\u0006\u0004\bE\u00106J\u000f\u0010F\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010GJ\u000f\u0010I\u001a\u00020\bH\u0002¢\u0006\u0004\bI\u0010GJ\u000f\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bJ\u0010GJ\u0013\u0010K\u001a\u00020\u0011*\u000201H\u0002¢\u0006\u0004\bK\u00104J\u000f\u0010L\u001a\u00020\u0011H\u0002¢\u0006\u0004\bL\u00106J)\u0010O\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\bO\u0010PR.\u0010S\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010Q8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010Y\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010\u001dR.\u0010]\u001a\u0004\u0018\u00010\b2\b\u0010R\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010(R\u0016\u0010b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010ZR\u0016\u0010c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010ZR\u0016\u0010d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010ZR\u0016\u0010e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010ZR\u0016\u0010f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010ZR\u0018\u0010g\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010i\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010m\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0016\u0010n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010ZR\u0016\u0010o\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010qR\u0018\u0010B\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010^R\u0016\u0010r\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010qR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010ZR\u0016\u0010}\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010ZR\u0016\u0010~\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010ZR\u0016\u0010\u007f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010ZR\u001a\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010pR\u0018\u0010\u0087\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010pR\u0018\u0010\u0088\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010qR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0089\u0001R \u0010\u008e\u0001\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0091\u0001\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u008b\u0001\u001a\u0006\b\u0090\u0001\u0010\u008d\u0001R \u0010\u0094\u0001\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u008b\u0001\u001a\u0006\b\u0093\u0001\u0010\u008d\u0001R \u0010\u0097\u0001\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u008b\u0001\u001a\u0006\b\u0096\u0001\u0010\u008d\u0001R \u0010\u009a\u0001\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u008b\u0001\u001a\u0006\b\u0099\u0001\u0010\u008d\u0001R \u0010\u009d\u0001\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u008b\u0001\u001a\u0006\b\u009c\u0001\u0010\u008d\u0001R \u0010 \u0001\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u008b\u0001\u001a\u0006\b\u009f\u0001\u0010\u008d\u0001R \u0010£\u0001\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u008b\u0001\u001a\u0006\b¢\u0001\u0010\u008d\u0001R!\u0010¨\u0001\u001a\u00030¤\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u008b\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010ª\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010\u008d\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/android/uikit/view/atoms/badge/Badge;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "resourceId", "Lru/ozon/uni/android/uikit/view/atoms/badge/ImagePosition;", "imagePosition", "", "isLarge", "", "setImageResource", "(ILru/ozon/uni/android/uikit/view/atoms/badge/ImagePosition;Z)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;Lru/ozon/uni/android/uikit/view/atoms/badge/ImagePosition;Z)V", "tintColor", "setAccessoryDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)V", "color", "setBackgroundColor", "(I)V", "", "gradientColors", "setBadgeGradientBackground", "([I)V", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeStyleType;", "textStyle", "setTextStyle", "(Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeStyleType;)V", "setTextTintColor", "setImageColorFilter", "(Ljava/lang/Integer;)V", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$BadgeTheme;", "theme", "setTheme", "(Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$BadgeTheme;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "calculateActualTextWidth", "()V", "updateOnDrawCoordinates", "textWidth", "dxVerticalPadding", "Landroid/graphics/Rect;", "calculateAccessoryRect", "(II)Landroid/graphics/Rect;", "drawIcon", "drawAccessoryIcon", "", "getStartPoint", "()F", "iconTint", "applyTint", "updatePreferredTextWidth", "updateStaticLayout", "getPreferredViewWidth", "()I", "getIconWidthWithPadding", "getIconSize", "getAccessoryIconSize", "drawText", "updatePaddings", "isGradient", "width", "updateBackgroundGradientPaint", "(ZI[I)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "gravity", "I", "getGravity", "setGravity", "maxWidth", "Ljava/lang/Integer;", "getMaxWidth", "()Ljava/lang/Integer;", "setMaxWidth", "activeVerticalPadding", "activeIconOuterPadding", "activeIconInnerPadding", "activeTextPadding", "activeTextPaddingWithAccessoryImage", "currentTheme", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$BadgeTheme;", "currentImagePosition", "Lru/ozon/uni/android/uikit/view/atoms/badge/ImagePosition;", "image", "Landroid/graphics/drawable/Drawable;", "accessoryImage", "mHeight", "radius", "F", "Z", "isAllCaps", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Landroid/text/StaticLayout;", "staticLayout", "Landroid/text/StaticLayout;", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "preferredTextWidth", "actualTextWidth", "mRightPadding", "mLeftPadding", "Landroid/graphics/RectF;", "backgroundRect", "Landroid/graphics/RectF;", "iconBoundRect", "Landroid/graphics/Rect;", "accessoryIconBoundRect", "textStartPointX", "textStartPointY", "isGradientBg", "[I", "textStyleBodyMBgSecondary$delegate", "LSc/j;", "getTextStyleBodyMBgSecondary", "()Landroid/text/TextPaint;", "textStyleBodyMBgSecondary", "textStyleBodyMBold$delegate", "getTextStyleBodyMBold", "textStyleBodyMBold", "textStyleBodyMBoldWhite$delegate", "getTextStyleBodyMBoldWhite", "textStyleBodyMBoldWhite", "textStyleCaptionBoldWhite$delegate", "getTextStyleCaptionBoldWhite", "textStyleCaptionBoldWhite", "textStyleCaptionBold$delegate", "getTextStyleCaptionBold", "textStyleCaptionBold", "textStyleCaptionWhite$delegate", "getTextStyleCaptionWhite", "textStyleCaptionWhite", "textStyleCaptionACWhite$delegate", "getTextStyleCaptionACWhite", "textStyleCaptionACWhite", "textStyleBadgeBoldAC$delegate", "getTextStyleBadgeBoldAC", "textStyleBadgeBoldAC", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeGradientPaint;", "gradientBgPaint$delegate", "getGradientBgPaint", "()Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeGradientPaint;", "gradientBgPaint", "getBaseTextPaint", "baseTextPaint", "Companion", "BadgeTheme", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BadgeView extends View implements AtomView, Badge {
    private Rect accessoryIconBoundRect;
    private Drawable accessoryImage;
    private int activeIconInnerPadding;
    private int activeIconOuterPadding;
    private int activeTextPadding;
    private int activeTextPaddingWithAccessoryImage;
    private int activeVerticalPadding;
    private int actualTextWidth;

    @NotNull
    private Paint backgroundPaint;

    @NotNull
    private RectF backgroundRect;
    private ImagePosition currentImagePosition;
    private BadgeTheme currentTheme;

    /* renamed from: gradientBgPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientBgPaint;
    private int[] gradientColors;
    private int gravity;

    @NotNull
    private Rect iconBoundRect;
    private Integer iconTint;
    private Drawable image;
    private boolean isAllCaps;
    private boolean isGradientBg;
    private boolean isLarge;
    private int mHeight;
    private int mLeftPadding;
    private int mRightPadding;
    private Integer maxWidth;
    private int preferredTextWidth;
    private float radius;
    private StaticLayout staticLayout;
    private String text;

    @NotNull
    private TextPaint textPaint;
    private float textStartPointX;
    private float textStartPointY;

    /* renamed from: textStyleBadgeBoldAC$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textStyleBadgeBoldAC;

    /* renamed from: textStyleBodyMBgSecondary$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textStyleBodyMBgSecondary;

    /* renamed from: textStyleBodyMBold$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textStyleBodyMBold;

    /* renamed from: textStyleBodyMBoldWhite$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textStyleBodyMBoldWhite;

    /* renamed from: textStyleCaptionACWhite$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textStyleCaptionACWhite;

    /* renamed from: textStyleCaptionBold$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textStyleCaptionBold;

    /* renamed from: textStyleCaptionBoldWhite$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textStyleCaptionBoldWhite;

    /* renamed from: textStyleCaptionWhite$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textStyleCaptionWhite;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int ICON_SIZE_DEFAULT_PX = ResourceExtKt.toPx(16);
    private static final int ICON_SIZE_L_PX = ResourceExtKt.toPx(24);
    private static final int TEXT_PADDING_8DP = ResourceExtKt.toPx(8);
    private static final int ICON_PADDING_4DP = ResourceExtKt.toPx(4);
    private static final int ICON_PADDING_2DP = ResourceExtKt.toPx(2);
    private static final int VERTICAL_PADDING_3PX = ResourceExtKt.toPx(3);
    private static final int ICON_PADDING_XSMALL = ResourceExtKt.toPx(2);
    private static final int VERTICAL_PADDING_XSMALL = ResourceExtKt.toPx(1);
    private static final int TEXT_PADDING_XSMALL = ResourceExtKt.toPx(4);
    private static final float CORNER_RADIUS_XSMALL = ResourceExtKt.toPxF(4);
    private static final int HEIGHT_XSMALL = ResourceExtKt.toPx(16);
    private static final int ICON_PADDING_SMALL = ResourceExtKt.toPx(6);
    private static final int VERTICAL_PADDING_SMALL = ResourceExtKt.toPx(2);
    private static final int TEXT_PADDING_SMALL = ResourceExtKt.toPx(8);
    private static final float CORNER_RADIUS_SMALL = ResourceExtKt.toPxF(6);
    private static final int HEIGHT_SMALL = ResourceExtKt.toPx(20);
    private static final int ICON_PADDING_MEDIUM = ResourceExtKt.toPx(8);
    private static final int VERTICAL_PADDING_MEDIUM = ResourceExtKt.toPx(3);
    private static final int TEXT_PADDING_MEDIUM = ResourceExtKt.toPx(8);
    private static final float CORNER_RADIUS_MEDIUM = ResourceExtKt.toPxF(8);
    private static final int HEIGHT_MEDIUM = ResourceExtKt.toPx(24);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$BadgeTheme;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "SMALL", "MEDIUM", "LARGE", "XSMALL", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BadgeTheme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BadgeTheme[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int id;
        public static final BadgeTheme SMALL = new BadgeTheme("SMALL", 0, 0);
        public static final BadgeTheme MEDIUM = new BadgeTheme("MEDIUM", 1, 1);
        public static final BadgeTheme LARGE = new BadgeTheme("LARGE", 2, 2);
        public static final BadgeTheme XSMALL = new BadgeTheme("XSMALL", 3, 3);

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$BadgeTheme$Companion;", "", "<init>", "()V", "getTheme", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$BadgeTheme;", "id", "", "(Ljava/lang/Integer;)Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$BadgeTheme;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BadgeTheme getTheme(Integer id2) {
                Object obj;
                Iterator<E> it = BadgeTheme.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    int id3 = ((BadgeTheme) obj).getId();
                    if (id2 != null && id3 == id2.intValue()) {
                        break;
                    }
                }
                return (BadgeTheme) obj;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ BadgeTheme[] $values() {
            return new BadgeTheme[]{SMALL, MEDIUM, LARGE, XSMALL};
        }

        static {
            BadgeTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private BadgeTheme(String str, int i11, int i12) {
            this.id = i12;
        }

        @NotNull
        public static a<BadgeTheme> getEntries() {
            return $ENTRIES;
        }

        public static BadgeTheme valueOf(String str) {
            return (BadgeTheme) Enum.valueOf(BadgeTheme.class, str);
        }

        public static BadgeTheme[] values() {
            return (BadgeTheme[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$Companion;", "", "<init>", "()V", "ICON_SIZE_DEFAULT_PX", "", "getICON_SIZE_DEFAULT_PX", "()I", "ICON_SIZE_L_PX", "TEXT_PADDING_8DP", "ICON_PADDING_4DP", "ICON_PADDING_2DP", "VERTICAL_PADDING_3PX", "ICON_PADDING_XSMALL", "VERTICAL_PADDING_XSMALL", "TEXT_PADDING_XSMALL", "CORNER_RADIUS_XSMALL", "", "HEIGHT_XSMALL", "ICON_PADDING_SMALL", "VERTICAL_PADDING_SMALL", "TEXT_PADDING_SMALL", "CORNER_RADIUS_SMALL", "HEIGHT_SMALL", "ICON_PADDING_MEDIUM", "VERTICAL_PADDING_MEDIUM", "TEXT_PADDING_MEDIUM", "CORNER_RADIUS_MEDIUM", "HEIGHT_MEDIUM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getICON_SIZE_DEFAULT_PX() {
            return BadgeView.ICON_SIZE_DEFAULT_PX;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[BadgeStyleType.values().length];
            try {
                iArr[BadgeStyleType.STYLE_TYPE_BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeStyleType.STYLE_TYPE_DISCOUNT_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeStyleType.STYLE_TYPE_DISCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeStyleType.STYLE_TYPE_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeStyleType.STYLE_TYPE_PREMIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BadgeStyleType.STYLE_TYPE_PREMIUM_SMALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BadgeStyleType.STYLE_TYPE_XSMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BadgeStyleType.STYLE_TYPE_DEFAULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BadgeTheme.values().length];
            try {
                iArr2[BadgeTheme.XSMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BadgeTheme.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BadgeTheme.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BadgeTheme.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ImagePosition.values().length];
            try {
                iArr3[ImagePosition.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ImagePosition.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public /* synthetic */ BadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyTint(Drawable drawable, Integer num) {
        drawable.mutate();
        drawable.setTint(num != null ? num.intValue() : 0);
        postInvalidate();
    }

    private final Rect calculateAccessoryRect(int textWidth, int dxVerticalPadding) {
        if (this.accessoryImage == null || this.isLarge || this.currentImagePosition == ImagePosition.RIGHT) {
            return null;
        }
        int iconSize = this.image != null ? getIconSize() : -this.activeIconInnerPadding;
        int i11 = this.mLeftPadding;
        return new Rect(iconSize + i11 + textWidth, this.activeVerticalPadding - dxVerticalPadding, iconSize + i11 + textWidth + getAccessoryIconSize(), (this.activeVerticalPadding - dxVerticalPadding) + getAccessoryIconSize());
    }

    private final void calculateActualTextWidth() {
        int measuredWidth = ((getMeasuredWidth() - this.mLeftPadding) - this.mRightPadding) - getIconWidthWithPadding();
        int i11 = this.preferredTextWidth;
        if (i11 < measuredWidth) {
            measuredWidth = i11;
        }
        this.actualTextWidth = Math.max(0, measuredWidth);
    }

    private final void drawAccessoryIcon(Canvas canvas) {
        Rect rect = this.accessoryIconBoundRect;
        if (rect != null) {
            Drawable drawable = this.accessoryImage;
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            Drawable drawable2 = this.accessoryImage;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        }
    }

    private final void drawIcon(Canvas canvas) {
        Drawable drawable = this.image;
        if (drawable != null) {
            drawable.setBounds(this.iconBoundRect);
            drawable.draw(canvas);
        }
    }

    private final void drawText(Canvas canvas) {
        canvas.save();
        canvas.translate(this.textStartPointX, this.textStartPointY);
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    private final int getAccessoryIconSize() {
        if (this.isLarge || this.currentImagePosition == ImagePosition.RIGHT || this.accessoryImage == null) {
            return 0;
        }
        return ICON_SIZE_DEFAULT_PX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextPaint getBaseTextPaint() {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        return textPaint;
    }

    private final BadgeGradientPaint getGradientBgPaint() {
        return (BadgeGradientPaint) this.gradientBgPaint.getValue();
    }

    private final int getIconSize() {
        return this.isLarge ? ICON_SIZE_L_PX : ICON_SIZE_DEFAULT_PX;
    }

    private final int getIconWidthWithPadding() {
        if (this.image == null && this.accessoryImage == null) {
            return 0;
        }
        int accessoryIconSize = getAccessoryIconSize();
        String str = this.text;
        return (this.image != null ? getIconSize() : 0) + ((str == null || h.K(str) || (accessoryIconSize != 0 && this.image == null)) ? 0 : this.activeIconInnerPadding) + getAccessoryIconSize();
    }

    private final int getPreferredViewWidth() {
        return this.preferredTextWidth + this.mRightPadding + this.mLeftPadding + getIconWidthWithPadding();
    }

    private final float getStartPoint() {
        if (this.gravity == 17) {
            return ((((getMeasuredWidth() - this.mLeftPadding) - this.mRightPadding) - this.actualTextWidth) - getIconWidthWithPadding()) / 2.0f;
        }
        return 0.0f;
    }

    private final TextPaint getTextStyleBadgeBoldAC() {
        return (TextPaint) this.textStyleBadgeBoldAC.getValue();
    }

    private final TextPaint getTextStyleBodyMBgSecondary() {
        return (TextPaint) this.textStyleBodyMBgSecondary.getValue();
    }

    private final TextPaint getTextStyleBodyMBold() {
        return (TextPaint) this.textStyleBodyMBold.getValue();
    }

    private final TextPaint getTextStyleBodyMBoldWhite() {
        return (TextPaint) this.textStyleBodyMBoldWhite.getValue();
    }

    private final TextPaint getTextStyleCaptionACWhite() {
        return (TextPaint) this.textStyleCaptionACWhite.getValue();
    }

    private final TextPaint getTextStyleCaptionBold() {
        return (TextPaint) this.textStyleCaptionBold.getValue();
    }

    private final TextPaint getTextStyleCaptionBoldWhite() {
        return (TextPaint) this.textStyleCaptionBoldWhite.getValue();
    }

    private final TextPaint getTextStyleCaptionWhite() {
        return (TextPaint) this.textStyleCaptionWhite.getValue();
    }

    private final void updateBackgroundGradientPaint(boolean isGradient, int width, int[] gradientColors) {
        if (!isGradient || gradientColors == null || gradientColors.length <= 1) {
            return;
        }
        getGradientBgPaint().setGradientColor(gradientColors, width);
    }

    private final void updateOnDrawCoordinates() {
        int i11;
        float startPoint = getStartPoint();
        this.backgroundRect = new RectF(0.0f, 0.0f, getMeasuredWidth(), this.mHeight);
        int i12 = this.actualTextWidth;
        int i13 = i12 + (i12 > 0 ? this.activeIconInnerPadding : 0);
        ImagePosition imagePosition = this.currentImagePosition;
        int i14 = (imagePosition == null ? -1 : WhenMappings.$EnumSwitchMapping$2[imagePosition.ordinal()]) == 1 ? i13 : 0;
        int measuredHeight = ((this.activeVerticalPadding * 2) - (getMeasuredHeight() - getIconSize())) / 2;
        int i15 = (int) startPoint;
        this.iconBoundRect = new Rect(this.mLeftPadding + i15 + i14, this.activeVerticalPadding - measuredHeight, getIconSize() + this.mLeftPadding + i15 + i14, (this.activeVerticalPadding - measuredHeight) + getIconSize());
        this.accessoryIconBoundRect = calculateAccessoryRect(i13, measuredHeight);
        ImagePosition imagePosition2 = this.currentImagePosition;
        if ((imagePosition2 != null ? WhenMappings.$EnumSwitchMapping$2[imagePosition2.ordinal()] : -1) == 2) {
            startPoint += this.mLeftPadding;
            i11 = this.image != null ? getIconSize() + this.activeIconInnerPadding : 0;
        } else {
            i11 = this.mLeftPadding;
        }
        this.textStartPointX = startPoint + i11;
        int measuredHeight2 = getMeasuredHeight() - (this.activeVerticalPadding * 2);
        this.textStartPointY = ((measuredHeight2 - (this.staticLayout != null ? r1.getHeight() : 0)) / 2.0f) + this.activeVerticalPadding;
    }

    private final void updatePaddings() {
        String str = this.text;
        if (str != null && str.length() != 0) {
            ImagePosition imagePosition = this.currentImagePosition;
            int i11 = imagePosition == null ? -1 : WhenMappings.$EnumSwitchMapping$2[imagePosition.ordinal()];
            if (i11 == -1) {
                int i12 = this.activeTextPadding;
                this.mRightPadding = i12;
                this.mLeftPadding = i12;
            } else if (i11 == 1) {
                this.mRightPadding = this.activeIconOuterPadding;
                this.mLeftPadding = this.activeTextPadding;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                this.mRightPadding = this.activeTextPadding;
                this.mLeftPadding = this.activeIconOuterPadding;
            }
        } else if (this.currentImagePosition != null) {
            int i13 = this.activeIconOuterPadding;
            this.mRightPadding = i13;
            this.mLeftPadding = i13;
        } else {
            int i14 = this.activeTextPadding;
            this.mRightPadding = i14;
            this.mLeftPadding = i14;
        }
        if (this.accessoryImage != null) {
            this.mRightPadding = this.activeTextPaddingWithAccessoryImage;
        }
        updateOnDrawCoordinates();
    }

    private final void updatePreferredTextWidth() {
        String str = this.text;
        this.preferredTextWidth = str == null ? 0 : (int) this.textPaint.measureText(str);
    }

    private final void updateStaticLayout() {
        String str = this.text;
        this.staticLayout = str != null ? StaticLayout.Builder.obtain(str, 0, str.length(), this.textPaint, this.actualTextWidth).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build() : null;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.backgroundRect;
        float f7 = this.radius;
        canvas.drawRoundRect(rectF, f7, f7, this.isGradientBg ? getGradientBgPaint() : this.backgroundPaint);
        drawText(canvas);
        drawIcon(canvas);
        drawAccessoryIcon(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getLayoutParams().width == -2) {
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            int mode = View.MeasureSpec.getMode(widthMeasureSpec);
            int min = (mode == Integer.MIN_VALUE || mode == 1073741824) ? Math.min(size, getPreferredViewWidth()) : getPreferredViewWidth();
            Integer num = this.maxWidth;
            if (num != null) {
                min = Math.min(num.intValue(), min);
            }
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, LinearLayoutManager.INVALID_OFFSET);
        }
        if (getLayoutParams().height == -2) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        calculateActualTextWidth();
        updatePreferredTextWidth();
        updateStaticLayout();
        updateOnDrawCoordinates();
        updateBackgroundGradientPaint(this.isGradientBg, getMeasuredWidth(), this.gradientColors);
    }

    public void setAccessoryDrawable(Drawable drawable, Integer tintColor) {
        this.accessoryImage = drawable;
        if (drawable != null) {
            applyTint(drawable, tintColor);
        }
        updatePaddings();
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.isGradientBg = false;
        this.backgroundPaint.setColor(color);
    }

    public final void setBadgeGradientBackground(@NotNull int[] gradientColors) {
        Intrinsics.checkNotNullParameter(gradientColors, "gradientColors");
        boolean z11 = gradientColors.length > 1;
        this.isGradientBg = z11;
        if (z11) {
            this.gradientColors = gradientColors;
        } else {
            this.gradientColors = null;
        }
    }

    @Override // ru.ozon.uni.android.uikit.view.atoms.badge.Badge
    public void setImageColorFilter(Integer color) {
        this.iconTint = color;
        Drawable drawable = this.image;
        if (drawable != null) {
            applyTint(drawable, color);
        }
    }

    public void setImageDrawable(Drawable drawable, @NotNull ImagePosition imagePosition, boolean isLarge) {
        Intrinsics.checkNotNullParameter(imagePosition, "imagePosition");
        this.image = drawable;
        if (drawable == null) {
            imagePosition = null;
        }
        this.currentImagePosition = imagePosition;
        this.isLarge = isLarge;
        if (drawable != null) {
            applyTint(drawable, this.iconTint);
        }
        updatePaddings();
        requestLayout();
    }

    public void setImageResource(int resourceId, @NotNull ImagePosition imagePosition, boolean isLarge) {
        Intrinsics.checkNotNullParameter(imagePosition, "imagePosition");
        setImageDrawable(androidx.core.content.a.getDrawable(getContext(), resourceId), imagePosition, isLarge);
    }

    public final void setText(String str) {
        if (Intrinsics.d(this.text, str)) {
            return;
        }
        if (this.isAllCaps) {
            if (str != null) {
                str = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            } else {
                str = null;
            }
        }
        if (Intrinsics.d(this.text, str)) {
            return;
        }
        this.text = str;
        setContentDescription(str);
        updatePaddings();
        updatePreferredTextWidth();
        requestLayout();
    }

    public void setTextStyle(BadgeStyleType textStyle) {
        TextPaint textStyleCaptionACWhite;
        String str;
        switch (textStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()]) {
            case -1:
            case 8:
                textStyleCaptionACWhite = getTextStyleCaptionACWhite();
                break;
            case 0:
            default:
                throw new o();
            case 1:
                textStyleCaptionACWhite = getTextStyleBodyMBgSecondary();
                break;
            case 2:
                textStyleCaptionACWhite = getTextStyleCaptionBoldWhite();
                break;
            case 3:
                textStyleCaptionACWhite = getTextStyleBodyMBoldWhite();
                break;
            case 4:
                textStyleCaptionACWhite = getTextStyleCaptionWhite();
                break;
            case 5:
                textStyleCaptionACWhite = getTextStyleBodyMBold();
                break;
            case 6:
                textStyleCaptionACWhite = getTextStyleCaptionBold();
                break;
            case 7:
                textStyleCaptionACWhite = getTextStyleBadgeBoldAC();
                break;
        }
        this.textPaint = textStyleCaptionACWhite;
        if (Intrinsics.d(textStyleCaptionACWhite, getTextStyleCaptionACWhite()) || Intrinsics.d(this.textPaint, getTextStyleBadgeBoldAC())) {
            String str2 = this.text;
            if (str2 != null) {
                str = str2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            } else {
                str = null;
            }
            setText(str);
            this.isAllCaps = true;
        } else {
            this.isAllCaps = false;
        }
        updatePreferredTextWidth();
        requestLayout();
    }

    @Override // ru.ozon.uni.android.uikit.view.atoms.badge.Badge
    public void setTextTintColor(int color) {
        this.textPaint.setColor(color);
        postInvalidate();
    }

    public void setTheme(BadgeTheme theme) {
        if (this.currentTheme != theme) {
            this.currentTheme = theme;
            int i11 = theme == null ? -1 : WhenMappings.$EnumSwitchMapping$1[theme.ordinal()];
            if (i11 == 1) {
                this.mHeight = HEIGHT_XSMALL;
                this.radius = CORNER_RADIUS_XSMALL;
                this.activeVerticalPadding = VERTICAL_PADDING_XSMALL;
                this.activeIconOuterPadding = ICON_PADDING_XSMALL;
                this.activeIconInnerPadding = ICON_PADDING_2DP;
                this.activeTextPadding = TEXT_PADDING_XSMALL;
            } else if (i11 == 2) {
                this.mHeight = HEIGHT_SMALL;
                this.radius = CORNER_RADIUS_SMALL;
                this.activeVerticalPadding = VERTICAL_PADDING_SMALL;
                this.activeIconOuterPadding = ICON_PADDING_SMALL;
                this.activeIconInnerPadding = ICON_PADDING_4DP;
                this.activeTextPadding = TEXT_PADDING_SMALL;
            } else if (i11 == 3) {
                this.mHeight = HEIGHT_MEDIUM;
                this.radius = CORNER_RADIUS_MEDIUM;
                this.activeVerticalPadding = VERTICAL_PADDING_MEDIUM;
                this.activeIconOuterPadding = ICON_PADDING_MEDIUM;
                this.activeIconInnerPadding = ICON_PADDING_4DP;
                this.activeTextPadding = TEXT_PADDING_MEDIUM;
            } else if (i11 == 4) {
                this.mHeight = ResourceExtKt.toPx(40);
                this.radius = ResourceExtKt.toPxF(4);
                this.activeVerticalPadding = VERTICAL_PADDING_3PX;
                int i12 = ICON_PADDING_4DP;
                this.activeIconOuterPadding = i12;
                this.activeIconInnerPadding = i12;
                this.activeTextPadding = TEXT_PADDING_8DP;
            }
            updatePaddings();
            requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gravity = 3;
        this.activeVerticalPadding = ResourceExtKt.toPx(3);
        this.activeIconOuterPadding = ResourceExtKt.toPx(4);
        this.activeIconInnerPadding = ResourceExtKt.toPx(4);
        this.activeTextPadding = ResourceExtKt.toPx(8);
        this.activeTextPaddingWithAccessoryImage = ResourceExtKt.toPx(2);
        this.backgroundPaint = Pk0.h.a(true);
        this.textPaint = new TextPaint();
        int i12 = this.activeTextPadding;
        this.mRightPadding = i12;
        this.mLeftPadding = i12;
        this.backgroundRect = new RectF();
        this.iconBoundRect = new Rect();
        n nVar = n.NONE;
        this.textStyleBodyMBgSecondary = k.a(nVar, new BadgeView$textStyleBodyMBgSecondary$2(this, context));
        this.textStyleBodyMBold = k.a(nVar, new BadgeView$textStyleBodyMBold$2(this, context));
        this.textStyleBodyMBoldWhite = k.a(nVar, new BadgeView$textStyleBodyMBoldWhite$2(this, context));
        this.textStyleCaptionBoldWhite = k.a(nVar, new BadgeView$textStyleCaptionBoldWhite$2(this, context));
        this.textStyleCaptionBold = k.a(nVar, new BadgeView$textStyleCaptionBold$2(this, context));
        this.textStyleCaptionWhite = k.a(nVar, new BadgeView$textStyleCaptionWhite$2(this, context));
        this.textStyleCaptionACWhite = k.a(nVar, new BadgeView$textStyleCaptionACWhite$2(this, context));
        this.textStyleBadgeBoldAC = k.a(nVar, new BadgeView$textStyleBadgeBoldAC$2(this, context));
        this.gradientBgPaint = k.a(nVar, BadgeView$gradientBgPaint$2.INSTANCE);
        if (attributeSet == null) {
            setId(R$id.TextTv);
            setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BadgeViewAttrs, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setTheme(BadgeTheme.INSTANCE.getTheme(Integer.valueOf(obtainStyledAttributes.getInt(R$styleable.BadgeViewAttrs_badgeTheme, BadgeTheme.SMALL.getId()))));
            obtainStyledAttributes.recycle();
        }
        updateOnDrawCoordinates();
    }
}
