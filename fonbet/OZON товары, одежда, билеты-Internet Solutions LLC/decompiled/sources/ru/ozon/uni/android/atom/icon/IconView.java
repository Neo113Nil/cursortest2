package ru.ozon.uni.android.atom.icon;

import Sc.o;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import androidx.core.content.res.g;
import androidx.core.graphics.drawable.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.android.uikitsdk.resources.TokenizedResource;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$font;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 ³\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002³\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\b\b\u0001\u0010$\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u0004\u0018\u00010\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020\u000e*\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00101\u001a\u00020\u000e*\u00020\u00112\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b3\u0010\u0014J\u0017\u00104\u001a\u00020'2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b4\u00105J\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u001aJ\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010\u001aJ\u001b\u00108\u001a\u00020\u000e2\n\b\u0001\u00107\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b8\u00109R*\u0010<\u001a\u00020:2\u0006\u0010;\u001a\u00020:8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u00020 2\u0006\u0010;\u001a\u00020 8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bB\u0010C\"\u0004\bD\u0010#R$\u0010E\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bE\u0010F\"\u0004\bG\u0010\u001fR.\u0010I\u001a\u0004\u0018\u00010H2\b\u0010;\u001a\u0004\u0018\u00010H8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR.\u0010U\u001a\u0004\u0018\u00010T2\b\u0010;\u001a\u0004\u0018\u00010T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010PR*\u0010]\u001a\u00020\\2\u0006\u0010;\u001a\u00020\\8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010c\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u00109R.\u0010h\u001a\u0004\u0018\u00010\b2\b\u0010;\u001a\u0004\u0018\u00010\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010d\u001a\u0004\bi\u0010f\"\u0004\bj\u00109R\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR.\u0010o\u001a\u0004\u0018\u00010n2\b\u0010;\u001a\u0004\u0018\u00010n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR(\u0010{\u001a\u0004\u0018\u00010/2\b\u0010;\u001a\u0004\u0018\u00010/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b{\u0010|\"\u0004\b}\u0010~R7\u0010\u007f\u001a\u0004\u0018\u00010\b2\b\u0010;\u001a\u0004\u0018\u00010\b8\u0006@FX\u0087\u000e¢\u0006\u001b\n\u0004\b\u007f\u0010d\u0012\u0005\b\u0082\u0001\u0010\u001a\u001a\u0005\b\u0080\u0001\u0010f\"\u0005\b\u0081\u0001\u00109R7\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00012\t\u0010;\u001a\u0005\u0018\u00010\u0083\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R2\u0010\u008a\u0001\u001a\u0004\u0018\u00010\b2\b\u0010;\u001a\u0004\u0018\u00010\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010d\u001a\u0005\b\u008b\u0001\u0010f\"\u0005\b\u008c\u0001\u00109R\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010wR\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R5\u0010\u0092\u0001\u001a\u0004\u0018\u00010+2\b\u0010;\u001a\u0004\u0018\u00010+8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R2\u0010\u0098\u0001\u001a\u0004\u0018\u00010\b2\b\u0010;\u001a\u0004\u0018\u00010\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010d\u001a\u0005\b\u0099\u0001\u0010f\"\u0005\b\u009a\u0001\u00109R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R3\u0010¢\u0001\u001a\u00030¡\u00012\u0007\u0010;\u001a\u00030¡\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R2\u0010¨\u0001\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010=\u001a\u0005\b©\u0001\u0010?\"\u0005\bª\u0001\u0010AR\u0013\u0010¬\u0001\u001a\u00020\\8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010`R\u0017\u0010¯\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0017\u0010²\u0001\u001a\u00020'8BX\u0082\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001¨\u0006´\u0001"}, d2 = {"Lru/ozon/uni/android/atom/icon/IconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "onDetachedFromWindow", "()V", "onAttachedToWindow", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "size", "setSize", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;", "shape", "setShape", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;)V", "textStyleRes", "applyTextStyle", "(I)V", "", "textMaxWidth", "cutText", "(F)Lkotlin/Unit;", "", "text", "drawText", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;)V", "Landroid/graphics/Bitmap;", "icon", "drawIcon", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;)V", "drawBorder", "getCornerRadius", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;)F", "loadBackground", "color", "setIconColorFilter", "(Ljava/lang/Integer;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "iconShape", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;", "setIconShape", "iconSize", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "setIconSize", "Lru/ozon/uni/atoms/data/icon/IconDTO$ContentType;", "contentType", "Lru/ozon/uni/atoms/data/icon/IconDTO$ContentType;", "getContentType", "()Lru/ozon/uni/atoms/data/icon/IconDTO$ContentType;", "setContentType", "(Lru/ozon/uni/atoms/data/icon/IconDTO$ContentType;)V", "transparentColor", "I", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/uni/android/uikitsdk/Color;", "backColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setBackColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "paranjaColor", "", "hasParanja", "Z", "getHasParanja", "()Z", "setHasParanja", "(Z)V", "borderWidth", "Ljava/lang/Integer;", "getBorderWidth", "()Ljava/lang/Integer;", "setBorderWidth", "borderColor", "getBorderColor", "setBorderColor", "Landroid/graphics/Shader;", "graphicGradientShader", "Landroid/graphics/Shader;", "Lru/ozon/uni/core/UniGradient;", "graphicGradient", "Lru/ozon/uni/core/UniGradient;", "getGraphicGradient", "()Lru/ozon/uni/core/UniGradient;", "setGraphicGradient", "(Lru/ozon/uni/core/UniGradient;)V", "Landroid/graphics/ColorFilter;", "borderColorFilter", "Landroid/graphics/ColorFilter;", "Landroid/graphics/ComposeShader;", "bitmapGradientShader", "Landroid/graphics/ComposeShader;", "iconBitmap", "Landroid/graphics/Bitmap;", "setIconBitmap", "(Landroid/graphics/Bitmap;)V", "graphic", "getGraphic", "setGraphic", "getGraphic$annotations", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "graphicDrawable", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "getGraphicDrawable", "()Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "setGraphicDrawable", "(Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;)V", "graphicColor", "getGraphicColor", "setGraphicColor", "iconColorFilter", "Landroid/graphics/Paint;", "iconPaint", "Landroid/graphics/Paint;", "borderPaint", "label", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "labelColor", "getLabelColor", "setLabelColor", "Landroid/graphics/Rect;", "labelBounds", "Landroid/graphics/Rect;", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;", "backgroundFitType", "Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;", "getBackgroundFitType", "()Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;", "setBackgroundFitType", "(Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;)V", "backgroundImage", "getBackgroundImage", "setBackgroundImage", "getHasShape", "hasShape", "getSizePx", "()I", "sizePx", "getLabelWidth", "()F", "labelWidth", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconView extends AppCompatImageView implements AtomView, AtomLocatableView {
    private Color backColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private IconDTO.FitType backgroundFitType;
    private String backgroundImage;
    private ComposeShader bitmapGradientShader;
    private Integer borderColor;
    private ColorFilter borderColorFilter;

    @NotNull
    private final Paint borderPaint;
    private Integer borderWidth;
    private IconDTO.ContentType contentType;
    private Integer graphic;
    private Integer graphicColor;
    private DrawableResource graphicDrawable;
    private UniGradient graphicGradient;
    private Shader graphicGradientShader;
    private boolean hasParanja;
    private Bitmap iconBitmap;
    private ColorFilter iconColorFilter;

    @NotNull
    private final Paint iconPaint;

    @NotNull
    private IconDTO.IconShape iconShape;

    @NotNull
    private IconDTO.IconSize iconSize;
    private CharSequence label;

    @NotNull
    private final Rect labelBounds;
    private Integer labelColor;

    @NotNull
    private String locatorTag;
    private final int paranjaColor;

    @NotNull
    private final TextPaint textPaint;
    private final int transparentColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/atom/icon/IconView$Companion;", "", "<init>", "()V", "ICON_LOCATOR_TAG", "", "CORNER_RADIUS", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[IconDTO.ContentType.values().length];
            try {
                iArr[IconDTO.ContentType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconDTO.ContentType.GRAPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconDTO.IconShape.values().length];
            try {
                iArr2[IconDTO.IconShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IconDTO.IconShape.SQUIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconDTO.IconShape.SHAPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IconDTO.IconShape.SHAPE_SQUIRCLE_FORCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[IconDTO.IconSize.values().length];
            try {
                iArr3[IconDTO.IconSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_800.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[IconDTO.IconSize.SIZE_900.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Unit cutText(float textMaxWidth) {
        CharSequence charSequence = this.label;
        if (charSequence == null) {
            return null;
        }
        if (textMaxWidth < this.textPaint.measureText(charSequence.toString())) {
            setLabel(charSequence.subSequence(0, this.textPaint.breakText(charSequence, 0, charSequence.length(), true, textMaxWidth, null)));
        }
        return Unit.f71690a;
    }

    private final void drawBorder(Canvas canvas) {
        float sizePx = getSizePx();
        float cornerRadius = getCornerRadius(this.iconShape);
        Paint paint = this.borderPaint;
        paint.setStyle(Paint.Style.STROKE);
        Integer num = this.borderWidth;
        paint.setStrokeWidth(UiExtKt.toPxF((num != null ? num.intValue() : this.iconSize.getBorderWidth()) * 2));
        paint.setColorFilter(this.borderColorFilter);
        canvas.drawRoundRect(0.0f, 0.0f, sizePx, sizePx, cornerRadius, cornerRadius, this.borderPaint);
    }

    private final void drawIcon(Canvas canvas, Bitmap bitmap) {
        Canvas canvas2;
        Paint paint;
        float sizePx = (getSizePx() / 2.0f) - (UiExtKt.toPx(this.iconSize.getSize()) / 2);
        float pxF = UiExtKt.toPxF(this.iconSize.getSize());
        ComposeShader composeShader = this.bitmapGradientShader;
        if (composeShader == null) {
            Paint paint2 = this.iconPaint;
            paint2.setColorFilter(this.iconColorFilter);
            Unit unit = Unit.f71690a;
            canvas.drawBitmap(bitmap, sizePx, sizePx, paint2);
            return;
        }
        int save = canvas.save();
        canvas.translate(sizePx, sizePx);
        try {
            paint = this.iconPaint;
            paint.setShader(composeShader);
            Unit unit2 = Unit.f71690a;
            canvas2 = canvas;
        } catch (Throwable th2) {
            th = th2;
            canvas2 = canvas;
        }
        try {
            canvas2.drawRect(0.0f, 0.0f, pxF, pxF, paint);
            canvas2.restoreToCount(save);
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            canvas2.restoreToCount(save);
            throw th4;
        }
    }

    private final void drawText(Canvas canvas, CharSequence charSequence) {
        Canvas canvas2;
        int sizePx;
        int save = canvas.save();
        try {
            sizePx = getSizePx();
            int px = UiExtKt.toPx(this.iconSize.getPadding());
            canvas.clipRect(px, 0, sizePx - px, sizePx);
            canvas2 = canvas;
        } catch (Throwable th2) {
            th = th2;
            canvas2 = canvas;
        }
        try {
            canvas2.drawText(charSequence, 0, charSequence.length(), (sizePx / 2) - (getLabelWidth() / 2), (sizePx / 2) - this.labelBounds.exactCenterY(), this.textPaint);
            canvas2.restoreToCount(save);
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            canvas2.restoreToCount(save);
            throw th4;
        }
    }

    private final float getCornerRadius(IconDTO.IconShape shape) {
        float pxF = UiExtKt.toPxF(this.iconSize.getSizeShape() / 2.0f);
        int i11 = WhenMappings.$EnumSwitchMapping$1[shape.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return 0.0f;
                }
                if (i11 == 4) {
                    return UiExtKt.toPxF(this.iconSize.getCornerRadius());
                }
                throw new o();
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!UniGlobalConfigKt.getRoundCornersFlag(context)) {
                return UiExtKt.toPxF(this.iconSize.getCornerRadius());
            }
        }
        return pxF;
    }

    private final float getLabelWidth() {
        return this.textPaint.measureText(String.valueOf(this.label));
    }

    private final int getSizePx() {
        return UiExtKt.toPx(getHasShape() ? this.iconSize.getSizeShape() : this.iconSize.getSize());
    }

    private final void loadBackground() {
        if (this.backgroundImage == null || !getHasShape()) {
            ImageViewExtKt.clearResource(this);
        } else {
            ImageViewExtKt.load$default(this, this.backgroundImage, this.backgroundFitType == IconDTO.FitType.FILL_CENTER ? C7714v.a0(ImageTransformation.CenterCrop.INSTANCE) : K.f71697a, null, null, null, false, null, 124, null);
        }
    }

    private final void setIconBitmap(Bitmap bitmap) {
        Shader shader;
        this.iconBitmap = bitmap;
        ComposeShader composeShader = null;
        if (bitmap != null && (shader = this.graphicGradientShader) != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            composeShader = new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), shader, PorterDuff.Mode.SRC_IN);
        }
        this.bitmapGradientShader = composeShader;
    }

    private final void setIconColorFilter(Integer color) {
        DrawableResource drawableResource;
        this.iconColorFilter = (color == null || ((drawableResource = this.graphicDrawable) != null && drawableResource.getIsMulticolor())) ? null : new PorterDuffColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
    }

    private final void setIconShape(IconDTO.IconShape iconShape) {
        this.iconShape = iconShape;
        this.backgroundDrawable.setCornerRadius(getCornerRadius(iconShape));
    }

    private final void setIconSize(IconDTO.IconSize iconSize) {
        this.iconSize = iconSize;
        this.backgroundDrawable.setCornerRadius(getCornerRadius(this.iconShape));
        applyTextStyle();
    }

    public final void applyTextStyle(int textStyleRes) {
        TextPaint textPaint = this.textPaint;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextPaintExtKt.applyStyle(textPaint, context, textStyleRes);
        CharSequence charSequence = this.label;
        textPaint.getTextBounds(String.valueOf(this.label), 0, charSequence != null ? charSequence.length() : 0, this.labelBounds);
    }

    public final Color getBackColor() {
        return this.backColor;
    }

    @NotNull
    public final IconDTO.FitType getBackgroundFitType() {
        return this.backgroundFitType;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final Integer getBorderColor() {
        return this.borderColor;
    }

    public final IconDTO.ContentType getContentType() {
        return this.contentType;
    }

    public final Integer getGraphic() {
        return this.graphic;
    }

    public final Integer getGraphicColor() {
        return this.graphicColor;
    }

    public final boolean getHasShape() {
        return this.iconShape != IconDTO.IconShape.SHAPE_NONE;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final Integer getLabelColor() {
        return this.labelColor;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.hasParanja) {
            canvas.drawColor(this.paranjaColor);
        }
        IconDTO.ContentType contentType = this.contentType;
        int i11 = contentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
        if (i11 == 1) {
            CharSequence charSequence = this.label;
            if (charSequence != null) {
                drawText(canvas, charSequence);
            }
        } else if (i11 == 2 && (bitmap = this.iconBitmap) != null) {
            drawIcon(canvas, bitmap);
        }
        if (this.borderColor != null) {
            drawBorder(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int sizePx = getSizePx();
        cutText(sizePx - UiExtKt.toPxF(this.iconSize.getPadding() * 2));
        setMeasuredDimension(sizePx, sizePx);
    }

    public final void setBackColor(Color color) {
        if (color == null || !getHasShape()) {
            color = new Color.Solid(this.transparentColor);
        }
        this.backColor = color;
        color.applyTo(this.backgroundDrawable);
    }

    public final void setBackgroundFitType(@NotNull IconDTO.FitType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.backgroundFitType = value;
        loadBackground();
    }

    public final void setBackgroundImage(String str) {
        this.backgroundImage = str;
        loadBackground();
    }

    public final void setBorderColor(Integer num) {
        if (!getHasShape()) {
            num = null;
        }
        this.borderColor = num;
        this.borderColorFilter = num != null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN) : null;
        invalidate();
    }

    public final void setBorderWidth(Integer num) {
        this.borderWidth = num;
    }

    public final void setContentType(IconDTO.ContentType contentType) {
        if (!getHasShape() && contentType != IconDTO.ContentType.GRAPHIC) {
            contentType = null;
        }
        this.contentType = contentType;
    }

    public final void setGraphic(Integer num) {
        this.graphic = num;
        if (num != null) {
            int intValue = num.intValue();
            DrawableResource.Companion companion = DrawableResource.INSTANCE;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            setGraphicDrawable(companion.fromResources(resources, intValue));
        }
    }

    public final void setGraphicColor(Integer num) {
        this.graphicColor = num;
        setIconColorFilter(num);
        invalidate();
    }

    public final void setGraphicDrawable(DrawableResource drawableResource) {
        this.graphicDrawable = drawableResource;
        Bitmap bitmap = null;
        if (drawableResource != null) {
            int px = UiExtKt.toPx(this.iconSize.getSize());
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawable = (Drawable) TokenizedResource.DefaultImpls.getValue$default(drawableResource, context, null, 2, null);
            if (drawable != null) {
                bitmap = b.a(drawable, px, px, Bitmap.Config.ARGB_8888);
            }
        }
        setIconBitmap(bitmap);
        setIconColorFilter(this.graphicColor);
    }

    public final void setGraphicGradient(UniGradient uniGradient) {
        LinearGradient linearGradient;
        this.graphicGradient = uniGradient;
        if (uniGradient != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Color.Gradient gradient = TokensExtKt.toGradient(uniGradient, context);
            float[] coordinates = OzGradientOrientationMapperKt.getCoordinates(gradient.getOrientation(), UiExtKt.toPx(this.iconSize.getSize()));
            linearGradient = new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], gradient.getColors(), gradient.getPositions(), Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        this.graphicGradientShader = linearGradient;
    }

    public final void setHasParanja(boolean z11) {
        if (getHasShape()) {
            this.hasParanja = z11;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setBackground(this.backgroundDrawable);
    }

    public final void setLabel(CharSequence charSequence) {
        if (!getHasShape()) {
            charSequence = null;
        }
        this.label = charSequence;
        this.textPaint.getTextBounds(String.valueOf(this.label), 0, charSequence != null ? charSequence.length() : 0, this.labelBounds);
    }

    public final void setLabelColor(Integer num) {
        if (num != null) {
            this.textPaint.setColor(num.intValue());
        } else {
            num = null;
        }
        this.labelColor = num;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setShape(@NotNull IconDTO.IconShape shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        setIconShape(shape);
        requestLayout();
    }

    public final void setSize(@NotNull IconDTO.IconSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        setIconSize(size);
        requestLayout();
    }

    public /* synthetic */ IconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "icon";
        IconDTO.IconShape iconShape = IconDTO.IconShape.SQUIRCLE;
        this.iconShape = iconShape;
        IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_500;
        this.iconSize = iconSize;
        IconDTO.ContentType contentType = IconDTO.ContentType.GRAPHIC;
        this.contentType = contentType;
        this.transparentColor = a.getColor(context, R.color.transparent);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        this.paranjaColor = a.getColor(context, R$color.layer_overlay_paranja);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.iconPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.borderPaint = paint2;
        this.labelBounds = new Rect();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setLetterSpacing(0.0f);
        textPaint.setTypeface(g.e(R$font.onest_semibold, context));
        textPaint.setTextSize(UiExtKt.toSpF(20));
        this.textPaint = textPaint;
        this.backgroundFitType = IconDTO.FitType.FILL_CENTER;
        int[] IconView = R$styleable.IconView;
        Intrinsics.checkNotNullExpressionValue(IconView, "IconView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IconView, 0, 0);
        setIconSize(((IconDTO.IconSize[]) IconDTO.IconSize.getEntries().toArray(new IconDTO.IconSize[0]))[obtainStyledAttributes.getInt(R$styleable.IconView_iconViewSize, iconSize.ordinal())]);
        int i12 = obtainStyledAttributes.getInt(R$styleable.IconView_iconShape, -1);
        setIconShape(i12 != -1 ? (IconDTO.IconShape) IconDTO.IconShape.getEntries().get(i12) : iconShape);
        setContentType(((IconDTO.ContentType[]) IconDTO.ContentType.getEntries().toArray(new IconDTO.ContentType[0]))[obtainStyledAttributes.getInt(R$styleable.IconView_iconContentType, contentType.ordinal())]);
        setBackColor(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.IconView_backgroundGradient, R$styleable.IconView_android_background, 0));
        int color = obtainStyledAttributes.getColor(R$styleable.IconView_iconBorderColor, 0);
        if (color != 0) {
            setBorderColor(Integer.valueOf(color));
        }
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.IconView_graphic, 0);
        if (resourceId != 0) {
            DrawableResource.Companion companion = DrawableResource.INSTANCE;
            Resources resources = obtainStyledAttributes.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            setGraphicDrawable(companion.fromResources(resources, resourceId));
        }
        int color2 = obtainStyledAttributes.getColor(R$styleable.IconView_graphicColor, 0);
        if (color2 != 0) {
            setGraphicColor(Integer.valueOf(color2));
        }
        setLabel(obtainStyledAttributes.getText(R$styleable.IconView_android_text));
        int color3 = obtainStyledAttributes.getColor(R$styleable.IconView_android_textColor, 0);
        if (color3 != 0) {
            setLabelColor(Integer.valueOf(color3));
        }
        obtainStyledAttributes.recycle();
        setContentDescription(getLocatorTag());
        setBackground(gradientDrawable);
        setClipToOutline(true);
    }

    private final void applyTextStyle() {
        int resId;
        switch (WhenMappings.$EnumSwitchMapping$2[this.iconSize.ordinal()]) {
            case 1:
                resId = UniTextStyles.BODY_ACCENT_250_CAPTION.getResId();
                break;
            case 2:
                resId = UniTextStyles.BODY_CONTROL_300_X_SMALL.getResId();
                break;
            case 3:
                resId = UniTextStyles.BODY_CONTROL_400_SMALL.getResId();
                break;
            case 4:
                resId = UniTextStyles.BODY_CONTROL_500_MEDIUM.getResId();
                break;
            case 5:
                resId = UniTextStyles.HEADLINE_400_SMALL.getResId();
                break;
            case 6:
                resId = UniTextStyles.HEADLINE_500_MEDIUM.getResId();
                break;
            case 7:
                resId = UniTextStyles.HEADLINE_700_X_LARGE.getResId();
                break;
            case 8:
                resId = UniTextStyles.HEADLINE_800_X_X_LARGE.getResId();
                break;
            default:
                throw new o();
        }
        applyTextStyle(resId);
    }
}
