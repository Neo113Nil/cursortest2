package ru.ozon.uni.android.controls.tag;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import androidx.core.view.Y;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.controls.common.ButtonImageView;
import ru.ozon.uni.android.controls.common.ButtonTextView;
import ru.ozon.uni.android.controls.tag.TagStyle;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.android.util.FontSizeUtils;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ±\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002±\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020#H\u0002¢\u0006\u0004\b3\u0010'J\u000f\u00104\u001a\u00020#H\u0002¢\u0006\u0004\b4\u0010'J\u0017\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108R*\u0010;\u001a\u0002092\u0006\u0010:\u001a\u0002098\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R,\u0010D\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000f0B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR*\u0010I\u001a\u00020H2\u0006\u0010:\u001a\u00020H8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010O\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010P\u001a\u0004\bU\u0010R\"\u0004\bV\u0010TR*\u0010W\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010P\u001a\u0004\bX\u0010R\"\u0004\bY\u0010TR*\u00106\u001a\u0002052\u0006\u0010:\u001a\u0002058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u00108R*\u0010_\u001a\u00020^2\u0006\u0010:\u001a\u00020^8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR.\u0010e\u001a\u0004\u0018\u00010(2\b\u0010:\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010k\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010G\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR.\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010:\u001a\u0004\u0018\u00010!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR*\u0010u\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bu\u0010G\u001a\u0004\bv\u0010m\"\u0004\bw\u0010oR$\u0010x\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010<\u001a\u0004\by\u0010>\"\u0004\bz\u0010@R*\u0010{\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010P\u001a\u0004\b|\u0010R\"\u0004\b}\u0010TR+\u0010~\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010G\u001a\u0004\b\u007f\u0010m\"\u0005\b\u0080\u0001\u0010oR.\u0010\u0081\u0001\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010P\u001a\u0005\b\u0082\u0001\u0010R\"\u0005\b\u0083\u0001\u0010TR.\u0010\u0084\u0001\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010G\u001a\u0005\b\u0085\u0001\u0010m\"\u0005\b\u0086\u0001\u0010oR&\u0010\u0087\u0001\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010P\u001a\u0005\b\u0088\u0001\u0010R\"\u0005\b\u0089\u0001\u0010TR\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010\u001f\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u0093\u0001\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0093\u0001\u0010\u008d\u0001\u001a\u0005\b\u0094\u0001\u0010'\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u0097\u0001\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u00101\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010 \u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010£\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¤\u0001R\u0018\u0010§\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001¨\u0006²\u0001"}, d2 = {"Lru/ozon/uni/android/controls/tag/TagButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lru/ozon/uni/android/atom/image/Image;", "createImageView$uni_release", "()Lru/ozon/uni/android/atom/image/Image;", "createImageView", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "iconResource", "Lru/ozon/uni/android/controls/common/ButtonImageView;", "showTagIcon", "(Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;)Lru/ozon/uni/android/controls/common/ButtonImageView;", "createIconView", "()Lru/ozon/uni/android/controls/common/ButtonImageView;", "", "tagText", "Lru/ozon/uni/android/controls/common/ButtonTextView;", "showTagText", "(Ljava/lang/CharSequence;)Lru/ozon/uni/android/controls/common/ButtonTextView;", "createTextView", "()Lru/ozon/uni/android/controls/common/ButtonTextView;", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "showIndicator", "()Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "createIndicator", "showCloseIcon", "createCloseIconView", "Lru/ozon/uni/android/controls/tag/TagStyle;", "style", "applyStyle", "(Lru/ozon/uni/android/controls/tag/TagStyle;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "", "Lkotlin/Function1;", "Landroid/view/View;", "locatorInitializers", "Ljava/util/Map;", "transparentColor", "I", "Lru/ozon/uni/android/controls/tag/TagSize;", "size", "Lru/ozon/uni/android/controls/tag/TagSize;", "getSize", "()Lru/ozon/uni/android/controls/tag/TagSize;", "setSize", "(Lru/ozon/uni/android/controls/tag/TagSize;)V", "disabled", "Z", "getDisabled", "()Z", "setDisabled", "(Z)V", "isStateChangeDisabled", "setStateChangeDisabled", "tagSelected", "getTagSelected", "setTagSelected", "Lru/ozon/uni/android/controls/tag/TagStyle;", "getStyle", "()Lru/ozon/uni/android/controls/tag/TagStyle;", "setStyle", "Lru/ozon/uni/android/uikitsdk/Color;", "backColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setBackColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "text", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "textColor", "getTextColor", "()I", "setTextColor", "(I)V", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "getIconResource", "()Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "setIconResource", "(Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;)V", "iconColor", "getIconColor", "setIconColor", "imageUrl", "getImageUrl", "setImageUrl", "hasIndicator", "getHasIndicator", "setHasIndicator", "indicatorGap", "getIndicatorGap", "setIndicatorGap", "closeable", "getCloseable", "setCloseable", "closeIconColor", "getCloseIconColor", "setCloseIconColor", "rounded", "getRounded$uni_release", "setRounded$uni_release", "tagTextView", "Lru/ozon/uni/android/controls/common/ButtonTextView;", "iconView", "Lru/ozon/uni/android/controls/common/ButtonImageView;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "getImageView$uni_release", "setImageView$uni_release", "(Lru/ozon/uni/android/atom/image/Image;)V", "closeIconView", "getCloseIconView$uni_release", "setCloseIconView$uni_release", "(Lru/ozon/uni/android/controls/common/ButtonImageView;)V", "indicatorView", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "getIndicatorView$uni_release", "setIndicatorView$uni_release", "(Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;)V", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "loaderView", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "foregroundDrawable", "Landroid/graphics/Rect;", "delegateArea", "Landroid/graphics/Rect;", "", "getViewsOpacity", "()F", "viewsOpacity", "Landroid/text/TextUtils$TruncateAt;", "getTextEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "textEllipsize", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagButtonView extends ConstraintLayout implements AtomView, AtomLocatableView {

    @NotNull
    private Color backColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private int closeIconColor;
    private ButtonImageView closeIconView;
    private boolean closeable;

    @NotNull
    private final Rect delegateArea;
    private boolean disabled;

    @NotNull
    private final GradientDrawable foregroundDrawable;
    private boolean hasIndicator;
    private int iconColor;
    private DrawableResource iconResource;
    private ButtonImageView iconView;
    private String imageUrl;
    private Image imageView;
    private int indicatorGap;
    private IndicatorView indicatorView;
    private boolean isStateChangeDisabled;
    private LoaderView loaderView;

    @NotNull
    private final Map<Integer, Function1<View, Unit>> locatorInitializers;

    @NotNull
    private String locatorTag;
    private boolean rounded;

    @NotNull
    private TagSize size;

    @NotNull
    private TagStyle style;
    private boolean tagSelected;
    private ButtonTextView tagTextView;
    private CharSequence text;
    private int textColor;

    @NotNull
    private final TextPaint textPaint;
    private final int transparentColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/android/controls/tag/TagButtonView$Companion;", "", "<init>", "()V", "FOREGROUND_OPACITY", "", "DISABLED_OPACITY", "", "ENABLED_OPACITY", "IMAGE_MARGIN", "TEXT_MARGIN", "ICON_SIZE", "IMAGE_SIZE", "TAG_BUTTON_LOCATOR_TAG", "", "TAG_TEXT_LOCATOR_TAG", "ICON_LOCATOR_TAG", "IMAGE_LOCATOR_TAG", "CLOSE_ICON_LOCATOR_TAG", "INDICATOR_LOCATOR_TAG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyStyle(TagStyle style) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((this.disabled || !this.tagSelected) ? style.getEnabled() : style.getSelected(), R$styleable.TagButtonView);
        Intrinsics.f(obtainStyledAttributes);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackColor(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.TagButtonView_backgroundGradient, R$styleable.TagButtonView_backgroundColor, this.transparentColor));
        setTextColor(obtainStyledAttributes.getColor(R$styleable.TagButtonView_tagTextColor, this.transparentColor));
        setIconColor(obtainStyledAttributes.getColor(R$styleable.TagButtonView_iconColor, this.transparentColor));
        setCloseIconColor(obtainStyledAttributes.getColor(R$styleable.TagButtonView_iconColor, this.transparentColor));
        obtainStyledAttributes.recycle();
        if (!this.disabled && (style instanceof TagStyle.Custom)) {
            TagStyle.Custom custom = (TagStyle.Custom) style;
            CustomTagStyle selectedCustom = this.tagSelected ? custom.getSelectedCustom() : custom.getEnabledCustom();
            if (selectedCustom != null) {
                Color backgroundColor = selectedCustom.getBackgroundColor();
                if (backgroundColor != null) {
                    setBackColor(backgroundColor);
                }
                Integer textColor = selectedCustom.getTextColor();
                if (textColor != null) {
                    setTextColor(textColor.intValue());
                }
                Integer iconColor = selectedCustom.getIconColor();
                if (iconColor != null) {
                    setIconColor(iconColor.intValue());
                }
                Integer closeIconColor = selectedCustom.getCloseIconColor();
                if (closeIconColor != null) {
                    setCloseIconColor(closeIconColor.intValue());
                }
            }
        }
        LoaderView loaderView = this.loaderView;
        if (loaderView != null) {
            loaderView.setColor(this.textColor);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ButtonImageView createCloseIconView() {
        Integer valueOf;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonImageView buttonImageView = new ButtonImageView(context, null, 0, 6, null);
        buttonImageView.setId(R$id.tagButtonCloseIcon);
        buttonImageView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        buttonImageView.setImageResource(R$drawable.ic_s_cross_filled_compact);
        buttonImageView.setClickable(true);
        this.closeIconView = buttonImageView;
        addView(buttonImageView);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(buttonImageView.getId()));
        if (function1 != null) {
            function1.invoke(buttonImageView);
        }
        int id2 = buttonImageView.getId();
        View view = this.indicatorView;
        if (view == null && (view = this.tagTextView) == null) {
            Image image = this.imageView;
            valueOf = image != null ? Integer.valueOf(image.getId()) : null;
            if (valueOf == null) {
                view = this.iconView;
                if (view == null) {
                    valueOf = null;
                }
            }
            d dVar = new d();
            dVar.p(this);
            dVar.m(id2);
            dVar.c(id2, valueOf == null ? valueOf.intValue() : 0, 0);
            dVar.d0(id2, 2);
            dVar.f(this);
            return buttonImageView;
        }
        valueOf = Integer.valueOf(view.getId());
        d dVar2 = new d();
        dVar2.p(this);
        dVar2.m(id2);
        dVar2.c(id2, valueOf == null ? valueOf.intValue() : 0, 0);
        dVar2.d0(id2, 2);
        dVar2.f(this);
        return buttonImageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ButtonImageView createIconView() {
        Integer valueOf;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonImageView buttonImageView = new ButtonImageView(context, null, 0, 6, null);
        int px = UiExtKt.toPx(20);
        buttonImageView.setId(R$id.tagButtonIcon);
        buttonImageView.setLayoutParams(new ConstraintLayout.b(px, px));
        this.iconView = buttonImageView;
        addView(buttonImageView);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(buttonImageView.getId()));
        if (function1 != null) {
            function1.invoke(buttonImageView);
        }
        int id2 = buttonImageView.getId();
        View view = this.imageView;
        if (view == null && (view = this.tagTextView) == null) {
            IndicatorView indicatorView = this.indicatorView;
            valueOf = indicatorView != null ? Integer.valueOf(indicatorView.getId()) : null;
            if (valueOf == null) {
                view = this.closeIconView;
                if (view == null) {
                    valueOf = null;
                }
            }
            d dVar = new d();
            dVar.p(this);
            dVar.m(id2);
            dVar.c(id2, 0, valueOf == null ? valueOf.intValue() : 0);
            dVar.d0(id2, 2);
            dVar.f(this);
            return buttonImageView;
        }
        valueOf = Integer.valueOf(view.getId());
        d dVar2 = new d();
        dVar2.p(this);
        dVar2.m(id2);
        dVar2.c(id2, 0, valueOf == null ? valueOf.intValue() : 0);
        dVar2.d0(id2, 2);
        dVar2.f(this);
        return buttonImageView;
    }

    private final IndicatorView createIndicator() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IndicatorView indicatorView = new IndicatorView(context, null, 0, 0, 14, null);
        indicatorView.setId(R$id.tagButtonIndicator);
        indicatorView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.indicatorView = indicatorView;
        addView(indicatorView);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(indicatorView.getId()));
        if (function1 != null) {
            function1.invoke(indicatorView);
        }
        int id2 = indicatorView.getId();
        View view = this.tagTextView;
        Integer valueOf = (view == null && (view = this.imageView) == null && (view = this.iconView) == null) ? null : Integer.valueOf(view.getId());
        ButtonImageView buttonImageView = this.closeIconView;
        Integer valueOf2 = buttonImageView != null ? Integer.valueOf(buttonImageView.getId()) : null;
        d dVar = new d();
        dVar.p(this);
        dVar.m(id2);
        dVar.c(id2, valueOf != null ? valueOf.intValue() : 0, valueOf2 != null ? valueOf2.intValue() : 0);
        dVar.d0(id2, 2);
        dVar.f(this);
        return indicatorView;
    }

    private final ButtonTextView createTextView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonTextView buttonTextView = new ButtonTextView(context, null, 0, 6, null);
        buttonTextView.setId(R$id.tagButtonText);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        int px = UiExtKt.toPx(4);
        bVar.setMargins(px, 0, px, 0);
        buttonTextView.setLayoutParams(bVar);
        Context context2 = buttonTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(buttonTextView, context2, R$style.OzonTextAppearance_BodyControl_400small);
        this.tagTextView = buttonTextView;
        buttonTextView.setEllipsize(getTextEllipsize());
        addView(this.tagTextView);
        Function1 function1 = this.locatorInitializers.get(Integer.valueOf(buttonTextView.getId()));
        if (function1 != null) {
            function1.invoke(buttonTextView);
        }
        int id2 = buttonTextView.getId();
        View view = this.imageView;
        Integer valueOf = (view == null && (view = this.iconView) == null) ? null : Integer.valueOf(view.getId());
        View view2 = this.indicatorView;
        Integer valueOf2 = (view2 == null && (view2 = this.closeIconView) == null) ? null : Integer.valueOf(view2.getId());
        d dVar = new d();
        dVar.p(this);
        dVar.m(id2);
        dVar.c(id2, valueOf != null ? valueOf.intValue() : 0, valueOf2 != null ? valueOf2.intValue() : 0);
        dVar.d0(id2, 2);
        dVar.C(buttonTextView.getId(), true);
        dVar.f(this);
        return buttonTextView;
    }

    private final TextUtils.TruncateAt getTextEllipsize() {
        FontSizeUtils fontSizeUtils = FontSizeUtils.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return fontSizeUtils.isFontScalingIncreased$uni_release(resources) ? TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.END;
    }

    private final float getViewsOpacity() {
        return this.disabled ? 0.4f : 1.0f;
    }

    private final ButtonImageView showCloseIcon() {
        ButtonImageView buttonImageView = this.closeIconView;
        if (buttonImageView == null) {
            buttonImageView = createCloseIconView();
        }
        buttonImageView.setAlpha(getViewsOpacity());
        buttonImageView.setIconColor(this.closeIconColor);
        ViewExtKt.show(buttonImageView);
        return buttonImageView;
    }

    private final IndicatorView showIndicator() {
        IndicatorView indicatorView = this.indicatorView;
        if (indicatorView == null) {
            indicatorView = createIndicator();
        }
        indicatorView.setAlpha(getViewsOpacity());
        ViewExtKt.show(indicatorView);
        return indicatorView;
    }

    private final ButtonImageView showTagIcon(DrawableResource iconResource) {
        ButtonImageView buttonImageView = this.iconView;
        if (buttonImageView == null) {
            buttonImageView = createIconView();
        }
        buttonImageView.setDrawableResource(iconResource);
        buttonImageView.setAlpha(getViewsOpacity());
        buttonImageView.setIconColor(this.iconColor);
        ViewExtKt.show(buttonImageView);
        return buttonImageView;
    }

    private final ButtonTextView showTagText(CharSequence tagText) {
        ButtonTextView buttonTextView = this.tagTextView;
        if (buttonTextView == null) {
            buttonTextView = createTextView();
        }
        buttonTextView.setAlpha(getViewsOpacity());
        buttonTextView.setText(tagText);
        buttonTextView.setTextColor(this.textColor);
        ViewExtKt.show(buttonTextView);
        return buttonTextView;
    }

    @NotNull
    public final Image createImageView$uni_release() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Image image = new Image(context, null, 0, 6, null);
        int px = UiExtKt.toPx(16);
        image.setId(R$id.tagButtonImage);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px, px);
        int px2 = UiExtKt.toPx(2);
        bVar.setMargins(px2, px2, px2, px2);
        image.setLayoutParams(bVar);
        this.imageView = image;
        addView(image);
        Function1 function1 = this.locatorInitializers.get(Integer.valueOf(image.getId()));
        if (function1 != null) {
            function1.invoke(image);
        }
        int id2 = image.getId();
        ButtonImageView buttonImageView = this.iconView;
        Integer valueOf = buttonImageView != null ? Integer.valueOf(buttonImageView.getId()) : null;
        View view = this.tagTextView;
        Integer valueOf2 = (view == null && (view = this.indicatorView) == null && (view = this.closeIconView) == null) ? null : Integer.valueOf(view.getId());
        d dVar = new d();
        dVar.p(this);
        dVar.m(id2);
        dVar.c(id2, valueOf != null ? valueOf.intValue() : 0, valueOf2 != null ? valueOf2.intValue() : 0);
        dVar.d0(id2, 2);
        dVar.f(this);
        return image;
    }

    /* renamed from: getCloseIconView$uni_release, reason: from getter */
    public final ButtonImageView getCloseIconView() {
        return this.closeIconView;
    }

    /* renamed from: getImageView$uni_release, reason: from getter */
    public final Image getImageView() {
        return this.imageView;
    }

    /* renamed from: getIndicatorView$uni_release, reason: from getter */
    public final IndicatorView getIndicatorView() {
        return this.indicatorView;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height = this.size.getHeight();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(height, context);
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        if (px > ((int) (fontMetrics.descent - fontMetrics.ascent))) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(px, 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    protected void onSizeChanged(final int w11, final int h11, int oldw, int oldh) {
        TouchDelegate touchDelegate;
        super.onSizeChanged(w11, h11, oldw, oldh);
        ButtonImageView buttonImageView = this.closeIconView;
        if (buttonImageView != null) {
            int i11 = Y.f42258g;
            if (!buttonImageView.isLaidOut() || buttonImageView.isLayoutRequested()) {
                buttonImageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.uni.android.controls.tag.TagButtonView$onSizeChanged$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        TouchDelegate touchDelegate2;
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        TagButtonView tagButtonView = TagButtonView.this;
                        if (ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.isVisible(view)) {
                            TagButtonView.this.delegateArea.set(view.getLeft(), 0, w11, h11);
                            touchDelegate2 = new TouchDelegate(TagButtonView.this.delegateArea, TagButtonView.this.getCloseIconView());
                        } else {
                            touchDelegate2 = null;
                        }
                        tagButtonView.setTouchDelegate(touchDelegate2);
                    }
                });
                return;
            }
            if (ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.isVisible(buttonImageView)) {
                this.delegateArea.set(buttonImageView.getLeft(), 0, w11, h11);
                touchDelegate = new TouchDelegate(this.delegateArea, getCloseIconView());
            } else {
                touchDelegate = null;
            }
            setTouchDelegate(touchDelegate);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.disabled) {
            return super.onTouchEvent(event);
        }
        if (event != null && getTouchDelegate() != null && getTouchDelegate().onTouchEvent(event)) {
            return true;
        }
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            setForeground(this.foregroundDrawable);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            setForeground(null);
            if (!this.isStateChangeDisabled) {
                setTagSelected(!this.tagSelected);
            }
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            setForeground(null);
        }
        return true;
    }

    public final void setBackColor(@NotNull Color value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.backColor = value;
        value.applyTo(this.backgroundDrawable);
    }

    public final void setCloseIconColor(int i11) {
        this.closeIconColor = i11;
        ButtonImageView buttonImageView = this.closeIconView;
        if (buttonImageView != null) {
            buttonImageView.setIconColor(i11);
        }
    }

    public final void setCloseable(boolean z11) {
        this.closeable = z11;
        if (z11) {
            showCloseIcon();
            return;
        }
        ButtonImageView buttonImageView = this.closeIconView;
        if (buttonImageView != null) {
            ViewExtKt.gone(buttonImageView);
        }
    }

    public final void setDisabled(boolean z11) {
        this.disabled = z11;
        applyStyle(this.style);
    }

    public final void setHasIndicator(boolean z11) {
        this.hasIndicator = z11;
        if (z11) {
            showIndicator();
            return;
        }
        IndicatorView indicatorView = this.indicatorView;
        if (indicatorView != null) {
            ViewExtKt.gone(indicatorView);
        }
    }

    public final void setIconColor(int i11) {
        this.iconColor = i11;
        ButtonImageView buttonImageView = this.iconView;
        if (buttonImageView != null) {
            buttonImageView.setIconColor(i11);
        }
    }

    public final void setIconResource(DrawableResource drawableResource) {
        this.iconResource = drawableResource;
        if (drawableResource != null) {
            showTagIcon(drawableResource);
            return;
        }
        ButtonImageView buttonImageView = this.iconView;
        if (buttonImageView != null) {
            ViewExtKt.gone(buttonImageView);
        }
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setIndicatorGap(int i11) {
        this.indicatorGap = i11 == 0 ? 0 : UiExtKt.toPx(i11);
        IndicatorView indicatorView = this.indicatorView;
        if (indicatorView != null) {
            int intValue = Integer.valueOf(indicatorView.getId()).intValue();
            d dVar = new d();
            dVar.p(this);
            dVar.e0(intValue, 2, this.indicatorGap);
            dVar.f(this);
        }
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
        for (Map.Entry<Integer, Function1<View, Unit>> entry : this.locatorInitializers.entrySet()) {
            int intValue = entry.getKey().intValue();
            Function1<View, Unit> value2 = entry.getValue();
            View findViewById = findViewById(intValue);
            if (findViewById != null) {
                value2.invoke(findViewById);
            }
        }
    }

    public final void setRounded$uni_release(boolean z11) {
        this.rounded = z11;
    }

    public final void setSize(@NotNull TagSize value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.size = value;
        float pxF = UiExtKt.toPxF(this.rounded ? value.getCornerRadiusRounded() : value.getCornerRadius());
        this.foregroundDrawable.setCornerRadius(pxF);
        this.backgroundDrawable.setCornerRadius(pxF);
        int px = UiExtKt.toPx(this.size.getPadding());
        setPadding(px, 0, px, 0);
    }

    public final void setStateChangeDisabled(boolean z11) {
        this.isStateChangeDisabled = z11;
    }

    public final void setStyle(@NotNull TagStyle value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.style = value;
        if (this.disabled) {
            return;
        }
        applyStyle(value);
    }

    public final void setTagSelected(boolean z11) {
        this.tagSelected = z11;
        applyStyle(this.style);
    }

    public final void setText(CharSequence charSequence) {
        this.text = charSequence;
        if (charSequence != null && charSequence.length() != 0) {
            showTagText(this.text);
            return;
        }
        ButtonTextView buttonTextView = this.tagTextView;
        if (buttonTextView != null) {
            ViewExtKt.gone(buttonTextView);
        }
    }

    public final void setTextColor(int i11) {
        this.textColor = i11;
        ButtonTextView buttonTextView = this.tagTextView;
        if (buttonTextView != null) {
            buttonTextView.setTextColor(i11);
        }
        this.foregroundDrawable.setColor(this.textColor);
    }

    public /* synthetic */ TagButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? ru.ozon.uni.R$style.TagButtonView_Default : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "tagButton";
        this.locatorInitializers = U.j(new Pair(Integer.valueOf(R$id.tagButtonCloseIcon), new TagButtonView$locatorInitializers$1(this)), new Pair(Integer.valueOf(R$id.tagButtonIcon), new TagButtonView$locatorInitializers$2(this)), new Pair(Integer.valueOf(R$id.tagButtonImage), new TagButtonView$locatorInitializers$3(this)), new Pair(Integer.valueOf(R$id.tagButtonText), new TagButtonView$locatorInitializers$4(this)), new Pair(Integer.valueOf(R$id.tagButtonIndicator), new TagButtonView$locatorInitializers$5(this)));
        int color = a.getColor(context, R$color.red_400);
        this.transparentColor = color;
        TagSize tagSize = TagSize.TAG_600;
        this.size = tagSize;
        this.style = TagStyle.Default.INSTANCE;
        this.backColor = new Color.Solid(color);
        this.textColor = color;
        this.iconColor = color;
        this.closeIconColor = color;
        this.rounded = UniGlobalConfigKt.getRoundCornersFlag(context);
        TextPaint textPaint = new TextPaint(1);
        TextPaintExtKt.applyStyle(textPaint, context, R$style.OzonTextAppearance_BodyControl_400small);
        this.textPaint = textPaint;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setAlpha(26);
        this.foregroundDrawable = gradientDrawable2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TagButtonView, i11, i12);
        setSize(((TagSize[]) TagSize.getEntries().toArray(new TagSize[0]))[obtainStyledAttributes.getInt(R$styleable.TagButtonView_tagButtonSize, tagSize.ordinal())]);
        setBackColor(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.TagButtonView_backgroundGradient, R$styleable.TagButtonView_backgroundColor, color));
        setText(obtainStyledAttributes.getText(R$styleable.TagButtonView_tagText));
        setTextColor(obtainStyledAttributes.getColor(R$styleable.TagButtonView_tagTextColor, color));
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.TagButtonView_android_src, 0);
        if (resourceId != 0) {
            DrawableResource.Companion companion = DrawableResource.INSTANCE;
            Resources resources = obtainStyledAttributes.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            setIconResource(companion.fromResources(resources, resourceId));
        }
        int color2 = obtainStyledAttributes.getColor(R$styleable.TagButtonView_iconColor, color);
        setIconColor(color2);
        setCloseIconColor(color2);
        setCloseable(obtainStyledAttributes.getBoolean(R$styleable.TagButtonView_closeable, false));
        obtainStyledAttributes.recycle();
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        setBackground(gradientDrawable);
        setContentDescription(getLocatorTag());
        this.delegateArea = new Rect();
    }
}
