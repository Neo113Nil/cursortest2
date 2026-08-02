package ru.ozon.uni.android.atom.badge;

import Sc.o;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.content.a;
import androidx.core.graphics.drawable.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.CharSequenceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.DrawableExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextStyleExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.android.uikitsdk.resources.TokenizedResource;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0007\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¨\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0012¢\u0006\u0004\b9\u00108J\r\u0010:\u001a\u00020\u0012¢\u0006\u0004\b:\u00108J/\u0010A\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0012H\u0010¢\u0006\u0004\b?\u0010@J\u000f\u0010D\u001a\u00020\u000fH\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010F\u001a\u00020\u000fH\u0000¢\u0006\u0004\bE\u0010CJ\u000f\u0010G\u001a\u00020\u000fH\u0002¢\u0006\u0004\bG\u0010CJ\u000f\u0010H\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bJ\u0010IR*\u0010M\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR$\u0010V\u001a\u00020,2\u0006\u0010L\u001a\u00020,8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bV\u0010W\"\u0004\bX\u0010/R\"\u0010Y\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u00108\"\u0004\b\\\u0010 R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010ZR\u0016\u0010<\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010ZR\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010ZR\u0016\u0010>\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010ZR.\u0010]\u001a\u0004\u0018\u0001002\b\u0010L\u001a\u0004\u0018\u0001008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u00103R4\u0010b\u001a\u0004\u0018\u0001002\b\u0010L\u001a\u0004\u0018\u0001008\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0004\bb\u0010^\u0012\u0004\be\u0010C\u001a\u0004\bc\u0010`\"\u0004\bd\u00103R\u0018\u0010f\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010^R\u0016\u0010g\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010ZR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010ZR*\u0010k\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b8\u0016@VX\u0097\u000e¢\u0006\u0012\n\u0004\bk\u0010T\u001a\u0004\bl\u0010I\"\u0004\bm\u0010nR*\u0010o\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b8\u0016@VX\u0097\u000e¢\u0006\u0012\n\u0004\bo\u0010T\u001a\u0004\bp\u0010I\"\u0004\bq\u0010nR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010jR.\u0010w\u001a\u0004\u0018\u00010v2\b\u0010L\u001a\u0004\u0018\u00010v8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR3\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010L\u001a\u00030\u0080\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R.\u0010\u0087\u0001\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b8\u0016@VX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010T\u001a\u0005\b\u0088\u0001\u0010I\"\u0005\b\u0089\u0001\u0010nR\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0096\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010IR\u0016\u0010\u0098\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010IR\u0016\u0010\u009a\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010IR\u0016\u0010\u009c\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010IR\u0016\u0010\u009e\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010IR\u0016\u0010 \u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010IR\u0018\u0010¢\u0001\u001a\u00030\u0091\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u0093\u0001R\u0018\u0010¤\u0001\u001a\u00030\u0091\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010\u0093\u0001R\u0019\u0010§\u0001\u001a\u0004\u0018\u00010r8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001¨\u0006©\u0001"}, d2 = {"Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "clickable", "setClickable", "(Z)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Landroid/view/accessibility/AccessibilityEvent;", "onPopulateAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "size", "setSize", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "hideDisclosure", "setHideDisclosure", "(Ljava/lang/Boolean;)V", "hasLeftIcon", "()Z", "hasRightIcon", "hasText", "topLeftCornerDisabled", "topRightCornerDisabled", "bottomLeftCornerDisabled", "bottomRightCornerDisabled", "setCornerRadius$uni_release", "(ZZZZ)V", "setCornerRadius", "onBadgeTouch$uni_release", "()V", "onBadgeTouch", "onBadgeTouchEnd$uni_release", "onBadgeTouchEnd", "applyTextStyle", "getIconsWidth", "()I", "calculateRightPadding", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "defBackColor", "I", "defContentColor", "badgeSize", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "setBadgeSize", "roundCorners", "Z", "getRoundCorners$uni_release", "setRoundCorners$uni_release", "accessibilityContentDescription", "Ljava/lang/CharSequence;", "getAccessibilityContentDescription", "()Ljava/lang/CharSequence;", "setAccessibilityContentDescription", "badgeText", "getBadgeText", "setBadgeText", "getBadgeText$annotations", "formattedText", "allCaps", "Landroid/graphics/ColorFilter;", "rightIconColorFilter", "Landroid/graphics/ColorFilter;", "rightIconColor", "getRightIconColor", "setRightIconColor", "(I)V", "leftIconColor", "getLeftIconColor", "setLeftIconColor", "Landroid/graphics/Bitmap;", "leftIconBitmap", "Landroid/graphics/Bitmap;", "leftIconColorFilter", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "leftIconDrawable", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "getLeftIconDrawable", "()Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "setLeftIconDrawable", "(Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Lru/ozon/uni/android/uikitsdk/Color;", "backColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setBackColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "textColor", "getTextColor", "setTextColor", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "foregroundDrawable", "", "getRadius", "()F", "radius", "getMinHeight", "minHeight", "getLeftPadding", "leftPadding", "getLeftGap", "leftGap", "getRightGap", "rightGap", "getRightPadding", "rightPadding", "getIconSize", "iconSize", "getIconStartY", "iconStartY", "getTextStartX", "textStartX", "getRightIconBitmap", "()Landroid/graphics/Bitmap;", "rightIconBitmap", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BadgeView extends View implements AtomView, AtomLocatableView {
    private CharSequence accessibilityContentDescription;
    private boolean allCaps;

    @NotNull
    private Color backColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private BadgeDTO.BadgeSize badgeSize;
    private CharSequence badgeText;
    private boolean bottomLeftCornerDisabled;
    private boolean bottomRightCornerDisabled;
    private final int defBackColor;
    private final int defContentColor;

    @NotNull
    private final GradientDrawable foregroundDrawable;
    private CharSequence formattedText;
    private boolean hideDisclosure;
    private Bitmap leftIconBitmap;
    private int leftIconColor;
    private ColorFilter leftIconColorFilter;
    private DrawableResource leftIconDrawable;

    @NotNull
    private String locatorTag;

    @NotNull
    private final Paint paint;
    private int rightIconColor;
    private ColorFilter rightIconColorFilter;
    private boolean roundCorners;
    private int textColor;

    @NotNull
    private final TextPaint textPaint;
    private boolean topLeftCornerDisabled;
    private boolean topRightCornerDisabled;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeDTO.BadgeSize.values().length];
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyTextStyle() {
        int resId;
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.badgeSize.ordinal()];
        if (i11 == 1) {
            resId = UniTextStyles.BODY_200_X_SMALL.getResId();
        } else if (i11 == 2) {
            resId = UniTextStyles.BODY_ACCENT_250_CAPTION.getResId();
        } else if (i11 == 3) {
            resId = UniTextStyles.BODY_CONTROL_300_X_SMALL.getResId();
        } else if (i11 == 4) {
            resId = UniTextStyles.BODY_CONTROL_400_SMALL.getResId();
        } else {
            if (i11 != 5) {
                throw new o();
            }
            resId = UniTextStyles.BODY_CONTROL_500_MEDIUM.getResId();
        }
        TextPaint textPaint = this.textPaint;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextPaintExtKt.applyStyle(textPaint, context, resId);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.allCaps = TextStyleExtKt.isTextStyleAllCaps(context2, resId);
    }

    private final int calculateRightPadding() {
        if (!hasText()) {
            return getLeftPadding();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.badgeSize.ordinal()];
        if (i11 == 1) {
            CharSequence badgeText = getBadgeText();
            if (badgeText == null || badgeText.length() == 0) {
                return 1;
            }
            return !hasRightIcon() ? 3 : 0;
        }
        if (i11 == 2) {
            return !hasRightIcon() ? 5 : 0;
        }
        if (i11 == 3) {
            return !hasRightIcon() ? 6 : 2;
        }
        if (i11 == 4) {
            return !hasRightIcon() ? 8 : 2;
        }
        if (i11 == 5) {
            return !hasRightIcon() ? 12 : 4;
        }
        throw new o();
    }

    private final int getIconSize() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.badgeSize.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 12;
        }
        if (i11 == 3 || i11 == 4 || i11 == 5) {
            return 16;
        }
        throw new o();
    }

    private final float getIconStartY() {
        int minHeight = (getMinHeight() - getIconSize()) / 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ResourceExtKt.toPxF(minHeight, context);
    }

    private final int getIconsWidth() {
        int leftGap = hasText() ? getLeftGap() : 0;
        int rightGap = hasText() ? getRightGap() : 0;
        return getLeftPadding() + (hasLeftIcon() ? getIconSize() + leftGap : 0) + (hasRightIcon() ? getIconSize() + rightGap : 0) + getRightPadding();
    }

    private final int getLeftGap() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.badgeSize.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 3) {
                i12 = 4;
                if (i11 != 4 && i11 != 5) {
                    throw new o();
                }
            }
        }
        return i12;
    }

    private final int getLeftPadding() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.badgeSize.ordinal()];
        if (i11 == 1) {
            CharSequence badgeText = getBadgeText();
            if (badgeText == null || badgeText.length() == 0) {
                return 1;
            }
            return this.leftIconBitmap == null ? 3 : 2;
        }
        if (i11 == 2) {
            CharSequence badgeText2 = getBadgeText();
            if (badgeText2 == null || badgeText2.length() == 0) {
                return 2;
            }
            return this.leftIconBitmap == null ? 5 : 3;
        }
        if (i11 == 3) {
            CharSequence badgeText3 = getBadgeText();
            if (badgeText3 == null || badgeText3.length() == 0) {
                return 2;
            }
            return this.leftIconBitmap == null ? 6 : 4;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                return this.leftIconBitmap == null ? 12 : 8;
            }
            throw new o();
        }
        CharSequence badgeText4 = getBadgeText();
        if (badgeText4 == null || badgeText4.length() == 0) {
            return 4;
        }
        return this.leftIconBitmap == null ? 8 : 6;
    }

    private final int getMinHeight() {
        return BadgeCommonKt.getSize(this.badgeSize);
    }

    private final float getRadius() {
        int i11;
        if (this.roundCorners) {
            i11 = 99;
        } else {
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.badgeSize.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    i11 = 5;
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        i11 = 8;
                    } else {
                        if (i12 != 5) {
                            throw new o();
                        }
                        i11 = 12;
                    }
                }
            }
            i11 = 6;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ResourceExtKt.toPxF(i11, context);
    }

    private final int getRightGap() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.badgeSize.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return 0;
        }
        if (i11 == 4 || i11 == 5) {
            return 2;
        }
        throw new o();
    }

    private final Bitmap getRightIconBitmap() {
        Drawable drawable;
        if (!hasRightIcon() || (drawable = a.getDrawable(getContext(), R$drawable.ic_s_disclosure_compact)) == null) {
            return null;
        }
        int iconSize = getIconSize();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(iconSize, context);
        int iconSize2 = getIconSize();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return b.a(drawable, px, UiExtKt.toPx(iconSize2, context2), Bitmap.Config.ARGB_8888);
    }

    private final int getRightPadding() {
        return calculateRightPadding();
    }

    private final float getTextStartX() {
        int leftPadding = getLeftPadding() + (getLeftIconDrawable() == null ? 0 : getIconSize() + getLeftGap());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ResourceExtKt.toPxF(leftPadding, context);
    }

    private final void setBadgeSize(BadgeDTO.BadgeSize badgeSize) {
        this.badgeSize = badgeSize;
        setCornerRadius$uni_release(this.topLeftCornerDisabled, this.topRightCornerDisabled, this.bottomLeftCornerDisabled, this.bottomRightCornerDisabled);
        this.foregroundDrawable.setCornerRadius(getRadius());
        applyTextStyle();
    }

    @NotNull
    public Color getBackColor() {
        return this.backColor;
    }

    public CharSequence getBadgeText() {
        return this.badgeText;
    }

    public DrawableResource getLeftIconDrawable() {
        return this.leftIconDrawable;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    public final boolean hasLeftIcon() {
        return getLeftIconDrawable() != null;
    }

    public final boolean hasRightIcon() {
        return isClickable() && !this.hideDisclosure && hasText();
    }

    public final boolean hasText() {
        CharSequence badgeText = getBadgeText();
        return !(badgeText == null || badgeText.length() == 0);
    }

    public final void onBadgeTouch$uni_release() {
        setForeground(this.foregroundDrawable);
    }

    public final void onBadgeTouchEnd$uni_release() {
        setForeground(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        Bitmap rightIconBitmap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int minHeight = getMinHeight();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(minHeight, context);
        Bitmap bitmap = this.leftIconBitmap;
        if (bitmap != null) {
            Paint paint = this.paint;
            DrawableResource leftIconDrawable = getLeftIconDrawable();
            paint.setColorFilter((leftIconDrawable == null || !leftIconDrawable.getIsMulticolor()) ? this.leftIconColorFilter : null);
            float height = getHeight() != px ? (getHeight() - bitmap.getHeight()) / 2 : getIconStartY();
            int leftPadding = getLeftPadding();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            canvas.drawBitmap(bitmap, ResourceExtKt.toPxF(leftPadding, context2), height, this.paint);
        }
        CharSequence charSequence = this.formattedText;
        if (charSequence != null) {
            CharSequence charSequence2 = charSequence.length() > 0 ? charSequence : null;
            if (charSequence2 != null) {
                canvas2 = canvas;
                canvas2.drawText(charSequence2, 0, charSequence2.length(), getTextStartX(), (getHeight() / 2) - ((this.textPaint.ascent() + this.textPaint.descent()) / 2), this.textPaint);
                rightIconBitmap = getRightIconBitmap();
                if (rightIconBitmap == null) {
                    float height2 = getHeight() != px ? (getHeight() - rightIconBitmap.getHeight()) / 2 : getIconStartY();
                    float width = getWidth();
                    int iconSize = getIconSize();
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    float pxF = width - ResourceExtKt.toPxF(iconSize, context3);
                    int rightPadding = getRightPadding();
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    float pxF2 = pxF - ResourceExtKt.toPxF(rightPadding, context4);
                    Paint paint2 = this.paint;
                    paint2.setColorFilter(this.rightIconColorFilter);
                    Unit unit = Unit.f71690a;
                    canvas2.drawBitmap(rightIconBitmap, pxF2, height2, paint2);
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        rightIconBitmap = getRightIconBitmap();
        if (rightIconBitmap == null) {
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (info != null) {
            info.setText(getBadgeText());
        }
        if (info != null) {
            info.setClassName("android.widget.TextView");
        }
        if (info != null) {
            info.setFocusable(true);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int iconsWidth = getIconsWidth();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(iconsWidth, context);
        CharSequence badgeText = getBadgeText();
        if (badgeText == null) {
            badgeText = "";
        }
        float f7 = mode == Integer.MIN_VALUE ? size : Float.MAX_VALUE;
        float ceil = (float) Math.ceil(Layout.getDesiredWidth(badgeText, 0, badgeText.length(), this.textPaint));
        if (ceil <= f7) {
            f7 = ceil;
        }
        int i11 = (int) f7;
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        int i12 = (int) (fontMetrics.descent - fontMetrics.ascent);
        int minHeight = getMinHeight();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int max = Math.max(UiExtKt.toPx(minHeight, context2), i12);
        int min = mode == 0 ? i11 + px : Math.min(size, i11 + px);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (min < suggestedMinimumWidth) {
            min = suggestedMinimumWidth;
        }
        if (badgeText.length() > 0) {
            CharSequence ellipsize = TextUtils.ellipsize(badgeText, this.textPaint, min - px, TextUtils.TruncateAt.END);
            this.formattedText = ellipsize;
            CharSequence charSequence = ellipsize != null ? ellipsize : "";
            min = (int) Math.ceil(Math.min(min, this.textPaint.measureText(charSequence, 0, charSequence.length()) + px));
        } else {
            this.formattedText = null;
        }
        setMeasuredDimension(min, max);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        List<CharSequence> text;
        super.onPopulateAccessibilityEvent(event);
        if (event == null || (text = event.getText()) == null) {
            return;
        }
        CharSequence charSequence = this.accessibilityContentDescription;
        if (charSequence == null) {
            charSequence = getBadgeText();
        }
        text.add(charSequence);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!isClickable()) {
            return super.onTouchEvent(event);
        }
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            onBadgeTouch$uni_release();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            onBadgeTouchEnd$uni_release();
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            onBadgeTouchEnd$uni_release();
        }
        return true;
    }

    public final void setAccessibilityContentDescription(CharSequence charSequence) {
        this.accessibilityContentDescription = charSequence;
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            return;
        }
        setContentDescription(charSequence);
        sendAccessibilityEvent(2);
    }

    public void setBackColor(@NotNull Color value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.backColor, value)) {
            return;
        }
        this.backColor = value;
        value.applyTo(this.backgroundDrawable);
        invalidate();
    }

    public void setBadgeText(CharSequence charSequence) {
        if (this.allCaps) {
            charSequence = charSequence != null ? CharSequenceExtKt.uppercase$default(charSequence, false, null, 2, null) : null;
        }
        this.badgeText = charSequence;
        if (!UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription() && this.accessibilityContentDescription == null) {
            setContentDescription(this.badgeText);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean clickable) {
        super.setClickable(clickable);
    }

    public void setCornerRadius$uni_release(boolean topLeftCornerDisabled, boolean topRightCornerDisabled, boolean bottomLeftCornerDisabled, boolean bottomRightCornerDisabled) {
        this.topLeftCornerDisabled = topLeftCornerDisabled;
        this.topRightCornerDisabled = topRightCornerDisabled;
        this.bottomLeftCornerDisabled = bottomLeftCornerDisabled;
        this.bottomRightCornerDisabled = bottomRightCornerDisabled;
        float radius = topLeftCornerDisabled ? 0.0f : getRadius();
        float radius2 = topRightCornerDisabled ? 0.0f : getRadius();
        float radius3 = bottomLeftCornerDisabled ? 0.0f : getRadius();
        float radius4 = bottomRightCornerDisabled ? 0.0f : getRadius();
        this.backgroundDrawable.setCornerRadii(new float[]{radius, radius, radius2, radius2, radius4, radius4, radius3, radius3});
    }

    public void setHideDisclosure(Boolean hideDisclosure) {
        this.hideDisclosure = hideDisclosure != null ? hideDisclosure.booleanValue() : false;
    }

    public void setLeftIconColor(int i11) {
        if (this.leftIconColor != i11) {
            this.leftIconColor = i11;
            this.leftIconColorFilter = new PorterDuffColorFilter(this.leftIconColor, PorterDuff.Mode.SRC_IN);
            invalidate();
        }
    }

    public void setLeftIconDrawable(DrawableResource drawableResource) {
        this.leftIconDrawable = drawableResource;
        Bitmap bitmap = null;
        if (drawableResource != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawable = (Drawable) TokenizedResource.DefaultImpls.getValue$default(drawableResource, context, null, 2, null);
            if (drawable != null) {
                int iconSize = getIconSize();
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                bitmap = DrawableExtKt.toBitmap(drawable, UiExtKt.toPx(iconSize, context2));
            }
        }
        this.leftIconBitmap = bitmap;
        invalidate();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            setContentDescription(this.locatorTag);
        }
    }

    public void setRightIconColor(int i11) {
        if (this.rightIconColor != i11) {
            this.rightIconColor = i11;
            this.rightIconColorFilter = new PorterDuffColorFilter(this.rightIconColor, PorterDuff.Mode.SRC_IN);
            invalidate();
        }
    }

    public final void setRoundCorners$uni_release(boolean z11) {
        this.roundCorners = z11;
    }

    public void setSize(@NotNull BadgeDTO.BadgeSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        setBadgeSize(size);
        requestLayout();
    }

    public final void setText(CharSequence text) {
        setBadgeText(text);
        sendAccessibilityEvent(2);
        requestLayout();
    }

    public void setTextColor(int i11) {
        if (this.textColor != i11) {
            this.textColor = i11;
            this.textPaint.setColor(i11);
            this.foregroundDrawable.setColor(this.textColor);
            invalidate();
        }
    }

    public /* synthetic */ BadgeView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Badge_Neutral_Secondary : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "badge";
        int color = a.getColor(context, R$color.bg_action_primary);
        this.defBackColor = color;
        int color2 = a.getColor(context, R$color.text_primary);
        this.defContentColor = color2;
        BadgeDTO.BadgeSize badgeSize = BadgeDTO.BadgeSize.SIZE_500;
        this.badgeSize = badgeSize;
        this.roundCorners = UniGlobalConfigKt.getRoundCornersFlag(context);
        this.rightIconColor = color2;
        this.leftIconColor = color2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        this.backColor = new Color.Solid(color);
        this.textColor = color2;
        this.textPaint = new TextPaint(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        getBackColor().applyTo(gradientDrawable);
        this.backgroundDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setAlpha(26);
        this.foregroundDrawable = gradientDrawable2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BadgeView, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setBadgeSize(((BadgeDTO.BadgeSize[]) BadgeDTO.BadgeSize.getEntries().toArray(new BadgeDTO.BadgeSize[0]))[obtainStyledAttributes.getInt(R$styleable.BadgeView_badgeSize, badgeSize.ordinal())]);
        setBackColor(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.BadgeView_backgroundGradient, R$styleable.BadgeView_android_background, color));
        setLeftIconColor(obtainStyledAttributes.getColor(R$styleable.BadgeView_leftIconColor, color2));
        setRightIconColor(obtainStyledAttributes.getColor(R$styleable.BadgeView_rightIconColor, color2));
        setTextColor(obtainStyledAttributes.getColor(R$styleable.BadgeView_android_textColor, color2));
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.BadgeView_android_src, 0);
        if (resourceId != 0) {
            DrawableResource.Companion companion = DrawableResource.INSTANCE;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            setLeftIconDrawable(companion.fromResources(resources, resourceId));
        }
        setBadgeText(obtainStyledAttributes.getText(R$styleable.BadgeView_android_text));
        sendAccessibilityEvent(2);
        setBackground(gradientDrawable);
        obtainStyledAttributes.recycle();
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            setContentDescription(getLocatorTag());
        }
    }
}
