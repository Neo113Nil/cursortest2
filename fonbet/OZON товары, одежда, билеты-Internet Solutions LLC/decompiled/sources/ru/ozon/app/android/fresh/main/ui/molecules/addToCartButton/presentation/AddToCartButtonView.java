package ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import sj.d;
import sj.f;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 Æ\u00012\u00020\u0001:\u0004Æ\u0001Ç\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0012J\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010\u0012J\u001f\u0010,\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010\u0012J\u0017\u0010/\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b/\u0010\u0012J\u0017\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u0010\u0012J\u0017\u00101\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b1\u0010\u0012J\u0017\u00102\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b2\u0010\u0012J\u0017\u00103\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00108\u001a\u0004\u0018\u0001072\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b8\u00109J)\u0010@\u001a\u00020?2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u0010AJ)\u0010C\u001a\u00020?2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010AJ)\u0010D\u001a\u00020?2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\bD\u0010AJ'\u0010E\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010FJ)\u0010G\u001a\u00020?2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010AJ)\u0010J\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u00062\b\b\u0002\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ)\u0010L\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u0010FJ1\u0010Q\u001a\u00020?2\b\u0010M\u001a\u0004\u0018\u00010?2\u0006\u0010N\u001a\u00020:2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020<H\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020\f2\u0006\u0010H\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010\u000eJ/\u0010W\u001a\u00020\f2\u0006\u0010T\u001a\u00020?2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020*H\u0003¢\u0006\u0004\bW\u0010XJ!\u0010Y\u001a\u00020*2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b[\u00104J\u000f\u0010\\\u001a\u00020\fH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\fH\u0002¢\u0006\u0004\b^\u0010]R$\u0010`\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010f\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bf\u0010h\"\u0004\bi\u0010jR\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010g\u001a\u0004\b\u001a\u0010h\"\u0004\bk\u0010jR$\u0010l\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010 R$\u0010q\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010w\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010gR\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R!\u0010\u008c\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010rR\u001a\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010rR\u0016\u0010\u008f\u0001\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010gR\u0018\u0010\u0090\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0092\u0001\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u0099\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0089\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010\u009c\u0001\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R \u0010 \u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0089\u0001\u001a\u0006\b\u009f\u0001\u0010\u0098\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u009d\u0001R\u001a\u0010¤\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010rR\u001a\u0010¥\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010rR\u001a\u0010¦\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010rR\u001a\u0010§\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010rR \u0010ª\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u0089\u0001\u001a\u0006\b©\u0001\u0010\u0095\u0001R \u0010\u00ad\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0089\u0001\u001a\u0006\b¬\u0001\u0010\u0095\u0001R \u0010°\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010\u0089\u0001\u001a\u0006\b¯\u0001\u0010\u0095\u0001R \u0010³\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b±\u0001\u0010\u0089\u0001\u001a\u0006\b²\u0001\u0010\u0095\u0001R\u0018\u0010´\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010gR \u0010¸\u0001\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bµ\u0001\u0010\u0089\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R \u0010»\u0001\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u0089\u0001\u001a\u0006\bº\u0001\u0010·\u0001R!\u0010À\u0001\u001a\u00030¼\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b½\u0001\u0010\u0089\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0017\u0010Â\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010\u0095\u0001R\u0017\u0010Ä\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010\u0095\u0001R\u0016\u0010Å\u0001\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010h¨\u0006È\u0001"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "dto", "isDisabled", "currentCount", "isPlusEnabled", "bind", "(Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;ZIZ)V", "bindActionButtonIcon", "(Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;)V", "bindSellerIcon", "measureQuantityState", "(I)V", "measureActionButtonState", "plannedContentWidth", "resolveButtonWidth", "(II)I", "drawQuantityState", "drawPlusButton", "", RichContentDTO.ALIGN_CENTER, "drawQuantityText", "(Landroid/graphics/Canvas;F)V", "drawMinusButton", "drawActionButton", "drawBackground", "drawActionButtonTextAndIcon", "drawSellerIconIfNeeded", "handleQuantityButtonEvent", "(Landroid/view/MotionEvent;)V", "", "drawableId", "Landroid/graphics/drawable/Drawable;", "getDrawable", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "", "text", "Landroid/text/TextPaint;", "textPaint", "plannedTextSize", "Landroid/text/StaticLayout;", "createToCartTextStaticLayout", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)Landroid/text/StaticLayout;", "finalSize", "createToCartTextLayoutWithComputedWidth", "createQuantityTextStaticLayout", "getQuantityTextStaticLayoutWidth", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)I", "createQuantityTextStaticLayoutWithComputedWidth", "measuredTextWidth", "newTextSize", "getSafeStaticLayoutWidth", "(III)I", "getToCartTextStaticLayoutWidth", "currentLayout", "incomingText", "plannedNewSize", "paint", "computeLayout", "(Landroid/text/StaticLayout;Ljava/lang/CharSequence;ILandroid/text/TextPaint;)Landroid/text/StaticLayout;", "sendNonFatalLog", "staticLayout", "dx", "dy", "drawByStaticLayout", "(Landroid/text/StaticLayout;Landroid/graphics/Canvas;FF)V", "getDesiredTextWidth", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "handleActionButtonEvent", "showRipple", "()V", "hideRipple", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView$AddToCartClickListener;", "clickListener", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView$AddToCartClickListener;", "getClickListener", "()Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView$AddToCartClickListener;", "setClickListener", "(Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView$AddToCartClickListener;)V", "isPlusButtonEnabled", "Z", "()Z", "setPlusButtonEnabled", "(Z)V", "setDisabled", "prevModel", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "getPrevModel", "()Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "setPrevModel", "prevCount", "Ljava/lang/Integer;", "getPrevCount", "()Ljava/lang/Integer;", "setPrevCount", "(Ljava/lang/Integer;)V", "prevIsPlusEnabled", "Ljava/lang/Boolean;", "getPrevIsPlusEnabled", "()Ljava/lang/Boolean;", "setPrevIsPlusEnabled", "(Ljava/lang/Boolean;)V", "isQuantityState", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "actionButtonAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "updateCartAction", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "actionButtonIcon", "Landroid/graphics/drawable/Drawable;", "sellerIconDrawable", "Landroid/graphics/Paint;", "sellerIconPaint$delegate", "LSc/j;", "getSellerIconPaint", "()Landroid/graphics/Paint;", "sellerIconPaint", "sellerIconOuterColor", "sellerIconInnerColor", "alwaysMeasureWithSellerIcon", "backgroundPaint", "Landroid/graphics/Paint;", "buttonHeight", "I", "getButtonHeight", "()I", "actionButtonTextPaint$delegate", "getActionButtonTextPaint", "()Landroid/text/TextPaint;", "actionButtonTextPaint", "actionButtonText", "Ljava/lang/CharSequence;", "actionButtonTextLayout", "Landroid/text/StaticLayout;", "quantityTextPaint$delegate", "getQuantityTextPaint", "quantityTextPaint", "quantityText", "Ljava/lang/String;", "quantityTextLayout", "quantityBackgroundColor", "actionButtonBackgroundColor", "actionButtonTextColor", "plusEnabledColor", "plusDisabledColor$delegate", "getPlusDisabledColor", "plusDisabledColor", "disabledBackgroundColor$delegate", "getDisabledBackgroundColor", "disabledBackgroundColor", "disabledTextColor$delegate", "getDisabledTextColor", "disabledTextColor", "disabledIconColor$delegate", "getDisabledIconColor", "disabledIconColor", "drawRipple", "plusDrawable$delegate", "getPlusDrawable", "()Landroid/graphics/drawable/Drawable;", "plusDrawable", "minusDrawable$delegate", "getMinusDrawable", "minusDrawable", "Lsj/d;", "nonFatalErrorLogger$delegate", "getNonFatalErrorLogger", "()Lsj/d;", "nonFatalErrorLogger", "getActionButtonIconWidthWithPadding", "actionButtonIconWidthWithPadding", "getSellerIconOffset", "sellerIconOffset", "isSellerIconVisible", "Companion", "AddToCartClickListener", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddToCartButtonView extends View {
    private CommonControlSettings actionButtonAction;
    private Integer actionButtonBackgroundColor;
    private Drawable actionButtonIcon;
    private CharSequence actionButtonText;
    private Integer actionButtonTextColor;
    private StaticLayout actionButtonTextLayout;

    /* renamed from: actionButtonTextPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionButtonTextPaint;
    private final boolean alwaysMeasureWithSellerIcon;

    @NotNull
    private final Paint backgroundPaint;
    private final int buttonHeight;
    private AddToCartClickListener clickListener;

    /* renamed from: disabledBackgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledBackgroundColor;

    /* renamed from: disabledIconColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledIconColor;

    /* renamed from: disabledTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledTextColor;
    private boolean drawRipple;
    private boolean isDisabled;
    private boolean isPlusButtonEnabled;
    private boolean isQuantityState;

    /* renamed from: minusDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j minusDrawable;

    /* renamed from: nonFatalErrorLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j nonFatalErrorLogger;

    /* renamed from: plusDisabledColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j plusDisabledColor;

    /* renamed from: plusDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j plusDrawable;
    private Integer plusEnabledColor;
    private Integer prevCount;
    private Boolean prevIsPlusEnabled;
    private AddToCartButtonDTO prevModel;
    private Integer quantityBackgroundColor;
    private String quantityText;
    private StaticLayout quantityTextLayout;

    /* renamed from: quantityTextPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j quantityTextPaint;
    private Drawable sellerIconDrawable;
    private Integer sellerIconInnerColor;
    private Integer sellerIconOuterColor;

    /* renamed from: sellerIconPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sellerIconPaint;
    private AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
    private static final int SELLER_ICON_OFFSET = UiExtKt.toPx(6);
    private static final int containerHeight = UiExtKt.toPx(32);
    private static final float containerCornerRadius = ResourceExtKt.toPxF(8);
    private static final int plusMinusSize = UiExtKt.toPx(16);
    private static final int innerMargin = UiExtKt.toPx(12);
    private static final int smallMargin = UiExtKt.toPx(8);
    private static final int actionButtonIconPadding = UiExtKt.toPx(8);
    private static final int actionButtonIconSize = UiExtKt.toPx(16);
    private static final int sellerIconOuterCircleSize = UiExtKt.toPx(24);
    private static final int sellerIconInnerCircleSize = UiExtKt.toPx(18);
    private static final int sellerIconDrawableSize = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/presentation/AddToCartButtonView$AddToCartClickListener;", "", "onPlusButtonClicked", "", "updateCartAction", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "onMinusButtonClicked", "onAction", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AddToCartClickListener {
        void onAction(@NotNull CommonControlSettings commonControlSettings);

        void onMinusButtonClicked(@NotNull AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction);

        void onPlusButtonClicked(@NotNull AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindActionButtonIcon(AddToCartButtonDTO dto) {
        Integer parseColor;
        AddToCartButtonDTO.ActionButton actionButton;
        AddToCartButtonDTO addToCartButtonDTO = this.prevModel;
        if (!Intrinsics.d((addToCartButtonDTO == null || (actionButton = addToCartButtonDTO.getActionButton()) == null) ? null : actionButton.getIcon(), dto.getActionButton().getIcon()) || this.actionButtonIcon == null) {
            Drawable drawable = getDrawable(dto.getActionButton().getIcon());
            if (drawable != null) {
                drawable.mutate();
            } else {
                drawable = null;
            }
            this.actionButtonIcon = drawable;
        }
        Drawable drawable2 = this.actionButtonIcon;
        if (drawable2 != null) {
            if (this.isDisabled) {
                parseColor = Integer.valueOf(getDisabledIconColor());
            } else {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                parseColor = styleParser.parseColor(context, dto.getTheme().getColors().getIconColor());
            }
            if (parseColor != null) {
                drawable2.setTint(parseColor.intValue());
            } else {
                drawable2.setTintList(null);
            }
        }
    }

    private final void bindSellerIcon(AddToCartButtonDTO dto) {
        AddToCartButtonDTO.ActionButton actionButton;
        AddToCartButtonDTO.ActionButton.SellerIcon sellerIcon = dto.getActionButton().getSellerIcon();
        if (sellerIcon == null) {
            this.sellerIconDrawable = null;
            this.sellerIconInnerColor = null;
            this.sellerIconOuterColor = null;
            return;
        }
        AddToCartButtonDTO addToCartButtonDTO = this.prevModel;
        if (!sellerIcon.equals((addToCartButtonDTO == null || (actionButton = addToCartButtonDTO.getActionButton()) == null) ? null : actionButton.getSellerIcon()) || this.sellerIconDrawable == null) {
            Drawable drawable = getDrawable(sellerIcon.getSellerIcon());
            if (drawable != null) {
                drawable.mutate();
            } else {
                drawable = null;
            }
            this.sellerIconDrawable = drawable;
        }
        Drawable drawable2 = this.sellerIconDrawable;
        if (drawable2 != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, sellerIcon.getSellerIconTint());
            if (parseColor != null) {
                drawable2.setTint(parseColor.intValue());
            } else {
                drawable2.setTintList(null);
            }
        }
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.sellerIconInnerColor = styleParser2.parseColor(context2, sellerIcon.getSellerIconBackground());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor2 = styleParser2.parseColor(context3, sellerIcon.getTileBackground());
        if (parseColor2 == null) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            parseColor2 = Integer.valueOf(ThemeExtKt.themeColor(context4, R$attr.layerFloor1));
        }
        this.sellerIconOuterColor = parseColor2;
    }

    private final StaticLayout computeLayout(StaticLayout currentLayout, CharSequence incomingText, int plannedNewSize, TextPaint paint) {
        if (currentLayout == null) {
            return this.isQuantityState ? createQuantityTextStaticLayout(incomingText, paint, plannedNewSize) : createToCartTextStaticLayout(incomingText, paint, plannedNewSize);
        }
        int quantityTextStaticLayoutWidth = this.isQuantityState ? getQuantityTextStaticLayoutWidth(incomingText, paint, plannedNewSize) : getToCartTextStaticLayoutWidth(incomingText, paint, plannedNewSize);
        return currentLayout.getWidth() != quantityTextStaticLayoutWidth ? (!this.isQuantityState || plannedNewSize <= 0) ? createToCartTextLayoutWithComputedWidth(incomingText, paint, quantityTextStaticLayoutWidth) : createQuantityTextStaticLayoutWithComputedWidth(incomingText, paint, plannedNewSize) : currentLayout;
    }

    private final StaticLayout createQuantityTextStaticLayout(CharSequence text, TextPaint textPaint, int plannedTextSize) {
        return createQuantityTextStaticLayoutWithComputedWidth(text, textPaint, getQuantityTextStaticLayoutWidth(text, textPaint, plannedTextSize));
    }

    private final StaticLayout createQuantityTextStaticLayoutWithComputedWidth(CharSequence text, TextPaint textPaint, int finalSize) {
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, finalSize).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final StaticLayout createToCartTextLayoutWithComputedWidth(CharSequence text, TextPaint textPaint, int finalSize) {
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, finalSize).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final StaticLayout createToCartTextStaticLayout(CharSequence text, TextPaint textPaint, int plannedTextSize) {
        return createToCartTextLayoutWithComputedWidth(text, textPaint, getToCartTextStaticLayoutWidth(text, textPaint, plannedTextSize));
    }

    private final void drawActionButton(Canvas canvas) {
        drawBackground(canvas);
        drawActionButtonTextAndIcon(canvas);
        drawSellerIconIfNeeded(canvas);
    }

    private final void drawActionButtonTextAndIcon(Canvas canvas) {
        int intValue;
        CharSequence charSequence;
        StaticLayout staticLayout = this.actionButtonTextLayout;
        int i11 = 0;
        int width = staticLayout != null ? staticLayout.getWidth() : 0;
        boolean z11 = getWidth() - (sellerIconOuterCircleSize * 2) > (innerMargin * 2) + (getActionButtonIconWidthWithPadding() + width);
        if (isSellerIconVisible() && (charSequence = this.actionButtonText) != null && charSequence.length() != 0 && !z11) {
            i11 = getSellerIconOffset();
        }
        int width2 = ((getWidth() - (width + getActionButtonIconWidthWithPadding())) - i11) / 2;
        Drawable drawable = this.actionButtonIcon;
        if (drawable != null) {
            drawable.setAlpha(this.isDisabled ? 102 : 255);
            int i12 = containerHeight;
            int i13 = actionButtonIconSize;
            drawable.setBounds(width2, (i12 - i13) / 2, width2 + i13, (i12 + i13) / 2);
            drawable.draw(canvas);
        }
        StaticLayout staticLayout2 = this.actionButtonTextLayout;
        if (staticLayout2 != null) {
            TextPaint actionButtonTextPaint = getActionButtonTextPaint();
            if (this.isDisabled) {
                intValue = getDisabledTextColor();
            } else {
                Integer num = this.actionButtonTextColor;
                if (num == null) {
                    return;
                } else {
                    intValue = num.intValue();
                }
            }
            actionButtonTextPaint.setColor(intValue);
            getActionButtonTextPaint().setAlpha(this.isDisabled ? 102 : 255);
            drawByStaticLayout(staticLayout2, canvas, width2 + getActionButtonIconWidthWithPadding(), (containerHeight - staticLayout2.getHeight()) / 2.0f);
        }
    }

    private final void drawBackground(Canvas canvas) {
        int intValue;
        this.backgroundPaint.setAlpha(255);
        Paint paint = this.backgroundPaint;
        if (this.isDisabled) {
            intValue = getDisabledBackgroundColor();
        } else if (this.isQuantityState) {
            Integer num = this.quantityBackgroundColor;
            if (num == null) {
                return;
            } else {
                intValue = num.intValue();
            }
        } else {
            Integer num2 = this.actionButtonBackgroundColor;
            if (num2 == null) {
                return;
            } else {
                intValue = num2.intValue();
            }
        }
        paint.setColor(intValue);
        int i11 = containerHeight;
        float f7 = containerCornerRadius;
        canvas.drawRoundRect(getSellerIconOffset(), 0.0f, getWidth() - getSellerIconOffset(), i11, f7, f7, this.backgroundPaint);
        if (this.drawRipple) {
            this.backgroundPaint.setColor(-1);
            this.backgroundPaint.setAlpha(26);
            canvas.drawRoundRect(getSellerIconOffset(), 0.0f, getWidth() - getSellerIconOffset(), i11, f7, f7, this.backgroundPaint);
        }
    }

    @SuppressLint({"UseKtx"})
    private final void drawByStaticLayout(StaticLayout staticLayout, Canvas canvas, float dx, float dy) {
        canvas.save();
        canvas.translate(dx, dy);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private final void drawMinusButton(Canvas canvas) {
        Drawable minusDrawable = getMinusDrawable();
        int sellerIconOffset = getSellerIconOffset();
        int i11 = smallMargin;
        int sellerIconOffset2 = getSellerIconOffset();
        int i12 = plusMinusSize;
        minusDrawable.setBounds(sellerIconOffset + i11, i11, sellerIconOffset2 + i12 + i11, i12 + i11);
        getMinusDrawable().draw(canvas);
    }

    private final void drawPlusButton(Canvas canvas) {
        Drawable plusDrawable = getPlusDrawable();
        int measuredWidth = getMeasuredWidth() - getSellerIconOffset();
        int i11 = smallMargin;
        int i12 = plusMinusSize;
        plusDrawable.setBounds((measuredWidth - i11) - i12, i11, (getMeasuredWidth() - getSellerIconOffset()) - i11, i12 + i11);
        getPlusDrawable().draw(canvas);
    }

    private final void drawQuantityState(Canvas canvas) {
        drawBackground(canvas);
        drawMinusButton(canvas);
        drawQuantityText(canvas, getMeasuredWidth() / 2);
        drawPlusButton(canvas);
    }

    private final void drawQuantityText(Canvas canvas, float center) {
        StaticLayout staticLayout = this.quantityTextLayout;
        if (staticLayout == null) {
            return;
        }
        drawByStaticLayout(staticLayout, canvas, center - (staticLayout.getWidth() / 2.0f), (containerHeight / 2.0f) - (staticLayout.getHeight() / 2.0f));
    }

    private final void drawSellerIconIfNeeded(Canvas canvas) {
        Drawable drawable;
        Integer num;
        if (this.isDisabled || (drawable = this.sellerIconDrawable) == null || (num = this.sellerIconOuterColor) == null) {
            return;
        }
        int intValue = num.intValue();
        Integer num2 = this.sellerIconInnerColor;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            getSellerIconPaint().setColor(intValue);
            float width = getWidth();
            int i11 = sellerIconOuterCircleSize;
            canvas.drawCircle(width - (i11 / 2.0f), this.buttonHeight - (i11 / 2.0f), i11 / 2.0f, getSellerIconPaint());
            getSellerIconPaint().setColor(intValue2);
            canvas.drawCircle(getWidth() - (i11 / 2.0f), this.buttonHeight - (i11 / 2.0f), sellerIconInnerCircleSize / 2.0f, getSellerIconPaint());
            int width2 = getWidth() - (i11 / 2);
            int i12 = this.buttonHeight - (i11 / 2);
            int i13 = sellerIconDrawableSize;
            drawable.setBounds(width2 - (i13 / 2), i12 - (i13 / 2), (i13 / 2) + width2, (i13 / 2) + i12);
            drawable.draw(canvas);
        }
    }

    private final int getActionButtonIconWidthWithPadding() {
        if (this.actionButtonIcon == null) {
            return 0;
        }
        CharSequence charSequence = this.actionButtonText;
        return (charSequence == null || charSequence.length() == 0) ? actionButtonIconSize : actionButtonIconSize + actionButtonIconPadding;
    }

    private final TextPaint getActionButtonTextPaint() {
        return (TextPaint) this.actionButtonTextPaint.getValue();
    }

    private final float getDesiredTextWidth(CharSequence text, TextPaint textPaint) {
        if (text == null) {
            return 0.0f;
        }
        return Layout.getDesiredWidth(text, textPaint);
    }

    private final int getDisabledBackgroundColor() {
        return ((Number) this.disabledBackgroundColor.getValue()).intValue();
    }

    private final int getDisabledIconColor() {
        return ((Number) this.disabledIconColor.getValue()).intValue();
    }

    private final int getDisabledTextColor() {
        return ((Number) this.disabledTextColor.getValue()).intValue();
    }

    private final Drawable getDrawable(String drawableId) {
        if (drawableId == null) {
            return null;
        }
        try {
            ToCartIconIdStorage toCartIconIdStorage = ToCartIconIdStorage.INSTANCE;
            Integer icon = toCartIconIdStorage.getIcon(drawableId);
            if (icon == null) {
                int identifier = getResources().getIdentifier(drawableId, "drawable", getContext().getPackageName());
                if (identifier != 0) {
                    toCartIconIdStorage.putID(drawableId, identifier);
                }
                icon = Integer.valueOf(identifier);
            }
            if (icon.intValue() != 0) {
                return C7232a.a(getContext(), icon.intValue());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private final Drawable getMinusDrawable() {
        return (Drawable) this.minusDrawable.getValue();
    }

    private final d getNonFatalErrorLogger() {
        return (d) this.nonFatalErrorLogger.getValue();
    }

    private final int getPlusDisabledColor() {
        return ((Number) this.plusDisabledColor.getValue()).intValue();
    }

    private final Drawable getPlusDrawable() {
        return (Drawable) this.plusDrawable.getValue();
    }

    private final TextPaint getQuantityTextPaint() {
        return (TextPaint) this.quantityTextPaint.getValue();
    }

    private final int getQuantityTextStaticLayoutWidth(CharSequence text, TextPaint textPaint, int plannedTextSize) {
        return getSafeStaticLayoutWidth(plannedTextSize, (int) textPaint.measureText(text.toString()), (getMeasuredWidth() - (plusMinusSize * 2)) - (innerMargin * 4));
    }

    private final int getSafeStaticLayoutWidth(int plannedTextSize, int measuredTextWidth, int newTextSize) {
        if (newTextSize <= 0) {
            newTextSize = plannedTextSize == 0 ? measuredTextWidth : Math.min(measuredTextWidth, plannedTextSize);
        }
        if (newTextSize >= 0) {
            return newTextSize;
        }
        sendNonFatalLog(measuredTextWidth, plannedTextSize);
        if (measuredTextWidth >= 0) {
            return measuredTextWidth;
        }
        if (getMeasuredWidth() > 0) {
            return getMeasuredWidth();
        }
        return 0;
    }

    static /* synthetic */ int getSafeStaticLayoutWidth$default(AddToCartButtonView addToCartButtonView, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        return addToCartButtonView.getSafeStaticLayoutWidth(i11, i12, i13);
    }

    private final int getSellerIconOffset() {
        if (this.sellerIconDrawable != null || this.alwaysMeasureWithSellerIcon) {
            return SELLER_ICON_OFFSET;
        }
        return 0;
    }

    private final Paint getSellerIconPaint() {
        return (Paint) this.sellerIconPaint.getValue();
    }

    private final int getToCartTextStaticLayoutWidth(CharSequence text, TextPaint textPaint, int plannedTextSize) {
        return getSafeStaticLayoutWidth$default(this, plannedTextSize, (int) textPaint.measureText(text.toString()), 0, 4, null);
    }

    private final void handleActionButtonEvent(MotionEvent motionEvent) {
        AddToCartClickListener addToCartClickListener;
        if (this.isDisabled) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                hideRipple();
                CommonControlSettings commonControlSettings = this.actionButtonAction;
                if (commonControlSettings == null || (addToCartClickListener = this.clickListener) == null) {
                    return;
                }
                addToCartClickListener.onAction(commonControlSettings);
                return;
            }
            if (action != 2) {
                if (action != 3) {
                    return;
                }
                hideRipple();
                return;
            }
        }
        showRipple();
    }

    private final void handleQuantityButtonEvent(MotionEvent motionEvent) {
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        AddToCartClickListener addToCartClickListener;
        AddToCartClickListener addToCartClickListener2;
        if (motionEvent.getAction() != 1) {
            return;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        float f7 = getMinusDrawable().getBounds().left;
        float f11 = getMinusDrawable().getBounds().right;
        float f12 = getPlusDrawable().getBounds().left;
        float f13 = getPlusDrawable().getBounds().right;
        float f14 = containerHeight;
        if (f12 <= x11 && x11 <= f13 && 0.0f <= y11 && y11 <= f14 && this.isPlusButtonEnabled) {
            AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction2 = this.updateCartAction;
            if (updateCartAction2 == null || (addToCartClickListener2 = this.clickListener) == null) {
                return;
            }
            addToCartClickListener2.onPlusButtonClicked(updateCartAction2);
            return;
        }
        if (f7 > x11 || x11 > f11 || 0.0f > y11 || y11 > f14 || (updateCartAction = this.updateCartAction) == null || (addToCartClickListener = this.clickListener) == null) {
            return;
        }
        addToCartClickListener.onMinusButtonClicked(updateCartAction);
    }

    private final void hideRipple() {
        this.drawRipple = false;
        invalidate();
    }

    private final boolean isSellerIconVisible() {
        return (this.sellerIconDrawable == null || this.isQuantityState || this.isDisabled) ? false : true;
    }

    private final void measureActionButtonState(int widthMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.buttonHeight, 1073741824);
        float desiredTextWidth = getDesiredTextWidth(this.actionButtonText, getActionButtonTextPaint());
        float actionButtonIconWidthWithPadding = getActionButtonIconWidthWithPadding() + r3 + desiredTextWidth + innerMargin;
        if (this.sellerIconDrawable != null || this.alwaysMeasureWithSellerIcon) {
            actionButtonIconWidthWithPadding += sellerIconOuterCircleSize * 2;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(resolveButtonWidth((int) Math.ceil(actionButtonIconWidthWithPadding), widthMeasureSpec), 1073741824), makeMeasureSpec);
    }

    private final void measureQuantityState(int widthMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.buttonHeight, 1073741824);
        float desiredTextWidth = getDesiredTextWidth(this.quantityText, getQuantityTextPaint());
        float f7 = r3 + r4 + desiredTextWidth + innerMargin + plusMinusSize;
        if (this.sellerIconDrawable != null || this.alwaysMeasureWithSellerIcon) {
            f7 += sellerIconOuterCircleSize * 2;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(resolveButtonWidth((int) Math.ceil(f7), widthMeasureSpec), 1073741824), makeMeasureSpec);
    }

    private final int resolveButtonWidth(int plannedContentWidth, int widthMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        return (mode == Integer.MIN_VALUE ? plannedContentWidth <= size : mode != 1073741824) ? plannedContentWidth : size;
    }

    private final void sendNonFatalLog(int measuredTextWidth, int plannedTextSize) {
        getNonFatalErrorLogger().f(c.ERROR, "Invalid text width for static layout", f.a(U.j(new Pair("measuredTextWidth", Integer.valueOf(measuredTextWidth)), new Pair("width", Integer.valueOf(getWidth())), new Pair("plannedTextSize", Integer.valueOf(plannedTextSize)), new Pair("sellerIconOffset", Integer.valueOf(getSellerIconOffset())), new Pair("actionButtonIconWidthWithPadding", Integer.valueOf(getActionButtonIconWidthWithPadding())))), Boolean.FALSE);
    }

    private final void showRipple() {
        if (this.isDisabled) {
            return;
        }
        this.drawRipple = true;
        invalidate();
    }

    public final void bind(@NotNull AddToCartButtonDTO dto, boolean isDisabled, int currentCount, boolean isPlusEnabled) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.isQuantityState = (currentCount <= 0 || isDisabled || dto.getQuantityButton() == null) ? false : true;
        String valueOf = String.valueOf(currentCount);
        if (this.isQuantityState && !Intrinsics.d(this.quantityText, valueOf)) {
            this.quantityText = valueOf;
            this.quantityTextLayout = null;
        } else if (!this.isQuantityState || !Intrinsics.d(this.quantityText, valueOf)) {
            this.quantityText = null;
        }
        this.isPlusButtonEnabled = isPlusEnabled;
        this.isDisabled = isDisabled;
        this.actionButtonAction = dto.getActionButton().getCommon();
        AddToCartButtonDTO.QuantityButton quantityButton = dto.getQuantityButton();
        this.updateCartAction = quantityButton != null ? quantityButton.getUpdateCartAction() : null;
        if (this.isQuantityState) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, dto.getTheme().getColors().getCounterBackgroundColor());
            if (parseColor == null) {
                return;
            }
            this.quantityBackgroundColor = parseColor;
            TextPaint quantityTextPaint = getQuantityTextPaint();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context2, dto.getTheme().getColors().getCounterTextColor());
            if (parseColor2 == null) {
                return;
            }
            quantityTextPaint.setColor(parseColor2.intValue());
            if (dto.getQuantityButton() != null) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Integer parseColor3 = styleParser.parseColor(context3, dto.getTheme().getColors().getPlusMinusColor());
                if (parseColor3 == null) {
                    return;
                }
                int intValue = parseColor3.intValue();
                this.plusEnabledColor = parseColor3;
                getMinusDrawable().setTint(intValue);
                if (this.isPlusButtonEnabled) {
                    Integer num = this.plusEnabledColor;
                    if (num != null) {
                        getPlusDrawable().setTint(num.intValue());
                    }
                    getPlusDrawable().setTint(intValue);
                } else {
                    getPlusDrawable().setTint(getPlusDisabledColor());
                }
            }
        } else {
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Integer parseColor4 = styleParser2.parseColor(context4, dto.getTheme().getColors().getBackgroundColor());
            if (parseColor4 == null) {
                return;
            }
            this.actionButtonBackgroundColor = parseColor4;
            bindActionButtonIcon(dto);
            bindSellerIcon(dto);
            if (!Intrinsics.d(this.prevModel, dto)) {
                this.prevModel = dto;
            }
            if (!Intrinsics.d(this.actionButtonText, dto.getActionButton().getTitle())) {
                this.actionButtonText = dto.getActionButton().getTitle();
                this.actionButtonTextLayout = null;
            }
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            Integer parseColor5 = styleParser2.parseColor(context5, dto.getTheme().getColors().getTitleColor());
            if (parseColor5 == null) {
                return;
            } else {
                this.actionButtonTextColor = parseColor5;
            }
        }
        this.prevCount = Integer.valueOf(currentCount);
        this.prevIsPlusEnabled = Boolean.valueOf(isPlusEnabled);
        requestLayout();
        invalidate();
    }

    public final Integer getPrevCount() {
        return this.prevCount;
    }

    public final AddToCartButtonDTO getPrevModel() {
        return this.prevModel;
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: isPlusButtonEnabled, reason: from getter */
    public final boolean getIsPlusButtonEnabled() {
        return this.isPlusButtonEnabled;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.isQuantityState) {
            drawQuantityState(canvas);
        } else {
            drawActionButton(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.isQuantityState) {
            measureQuantityState(widthMeasureSpec);
            String str = this.quantityText;
            this.quantityTextLayout = str != null ? computeLayout(this.quantityTextLayout, str, (getMeasuredWidth() - (plusMinusSize * 2)) - (innerMargin * 4), getQuantityTextPaint()) : null;
        } else {
            measureActionButtonState(widthMeasureSpec);
            CharSequence charSequence = this.actionButtonText;
            if (charSequence != null) {
                r0 = computeLayout(this.actionButtonTextLayout, charSequence, (getMeasuredWidth() - ((isSellerIconVisible() ? sellerIconOuterCircleSize : getSellerIconOffset()) * 2)) - getActionButtonIconWidthWithPadding(), getActionButtonTextPaint());
            }
            this.actionButtonTextLayout = r0;
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.isQuantityState) {
            handleQuantityButtonEvent(motionEvent);
            return true;
        }
        handleActionButtonEvent(motionEvent);
        return true;
    }

    public final void setClickListener(AddToCartClickListener addToCartClickListener) {
        this.clickListener = addToCartClickListener;
    }

    public /* synthetic */ AddToCartButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isPlusButtonEnabled = true;
        this.sellerIconPaint = LazyUtilsKt.unsafeLazy(AddToCartButtonView$sellerIconPaint$2.INSTANCE);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        this.buttonHeight = containerHeight + getSellerIconOffset();
        this.actionButtonTextPaint = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$actionButtonTextPaint$2(context));
        this.quantityTextPaint = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$quantityTextPaint$2(context));
        this.plusDisabledColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$plusDisabledColor$2(context));
        this.disabledBackgroundColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$disabledBackgroundColor$2(context));
        this.disabledTextColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$disabledTextColor$2(context));
        this.disabledIconColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$disabledIconColor$2(context));
        this.plusDrawable = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$plusDrawable$2(context));
        this.minusDrawable = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$minusDrawable$2(context));
        this.nonFatalErrorLogger = LazyUtilsKt.unsafeLazy(AddToCartButtonView$nonFatalErrorLogger$2.INSTANCE);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(false);
    }
}
