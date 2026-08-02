package ru.ozon.app.android.product.addToCart.presentation.likezone;

import Am.C2438a;
import B0.C2454a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.product.addToCart.presentation.ToCartIconIdStorage;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.FamilyButtonDTO;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 Ð\u00012\u00020\u0001:\u0006Ð\u0001Ñ\u0001Ò\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010!\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010*J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b/\u0010\u0012J\u0017\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u0010\u0012J\u001f\u00103\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u0010\u0012J\u0017\u00106\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b6\u0010\u0012J\u001f\u00108\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0015H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b:\u0010;J)\u0010B\u001a\u00020A2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010CJ)\u0010E\u001a\u00020A2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010CJ)\u0010F\u001a\u00020A2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\bF\u0010CJ'\u0010G\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010HJ)\u0010I\u001a\u00020A2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010CJ)\u0010L\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00062\b\b\u0002\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u0010HJ1\u0010S\u001a\u00020A2\b\u0010O\u001a\u0004\u0018\u00010A2\u0006\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020\u00062\u0006\u0010R\u001a\u00020>H\u0002¢\u0006\u0004\bS\u0010TJ7\u0010Y\u001a\u00020\f2\u0006\u0010U\u001a\u00020A2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010V\u001a\u0002012\u0006\u0010W\u001a\u0002012\u0006\u0010X\u001a\u00020\u0006H\u0003¢\u0006\u0004\bY\u0010ZJ!\u0010[\u001a\u0002012\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b]\u0010;J\u000f\u0010^\u001a\u00020\fH\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\fH\u0002¢\u0006\u0004\b`\u0010_J7\u0010h\u001a\u00020g2\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u0002012\u0006\u0010d\u001a\u0002012\u0006\u0010e\u001a\u0002012\u0006\u0010f\u001a\u000201H\u0002¢\u0006\u0004\bh\u0010iJ\u001f\u0010m\u001a\u00020g2\u0006\u0010j\u001a\u00020a2\u0006\u0010l\u001a\u00020kH\u0002¢\u0006\u0004\bm\u0010nJ\u001f\u0010o\u001a\u00020g2\u0006\u0010j\u001a\u00020a2\u0006\u0010l\u001a\u00020kH\u0002¢\u0006\u0004\bo\u0010nJ\u0017\u0010p\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\bp\u0010\u0012J\u000f\u0010q\u001a\u00020\u0006H\u0002¢\u0006\u0004\bq\u0010rR$\u0010t\u001a\u0004\u0018\u00010s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010{R\u0018\u0010|\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010{R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008a\u0001\u001a\u0002018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u008e\u0001\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010rR \u0010\u0095\u0001\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bb\u0010\u009b\u0001R\u001b\u0010\u009c\u0001\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001f\u0010l\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0092\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R!\u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u0092\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010ª\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b¨\u0001\u0010\u0092\u0001\u001a\u0005\b©\u0001\u0010rR\u001f\u0010\u00ad\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b«\u0001\u0010\u0092\u0001\u001a\u0005\b¬\u0001\u0010rR\u001f\u0010°\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b®\u0001\u0010\u0092\u0001\u001a\u0005\b¯\u0001\u0010rR\u0018\u0010±\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b±\u0001\u0010{R!\u0010µ\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0001\u0010\u0092\u0001\u001a\u0006\b³\u0001\u0010´\u0001R!\u0010¸\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¶\u0001\u0010\u0092\u0001\u001a\u0006\b·\u0001\u0010´\u0001R/\u0010¿\u0001\u001a\u0011\u0012\u0005\u0012\u00030º\u0001\u0012\u0005\u0012\u00030»\u00010¹\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u0092\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010\u001f\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010{R\u001d\u0010À\u0001\u001a\u00030\u0096\u00018\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010\u0098\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u001d\u0010Ã\u0001\u001a\u00030\u0096\u00018\u0006¢\u0006\u0010\n\u0006\bÃ\u0001\u0010\u0098\u0001\u001a\u0006\bÄ\u0001\u0010Â\u0001R\u001d\u0010Å\u0001\u001a\u00030\u0096\u00018\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010\u0098\u0001\u001a\u0006\bÆ\u0001\u0010Â\u0001R\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010{R*\u0010È\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R\u0016\u0010Ï\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010r¨\u0006Ó\u0001"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;", "dto", "isDisabled", "currentCount", "isPlusEnabled", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "config", "isLikezoneGradientTransformationEnabled", "isBothMode", "bind", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;ZIZLru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;ZZ)V", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme;", "theme", "bindBackground", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme;)V", "bindActionButtonIcon", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;)V", "measureQuantityState", "(I)V", "measureActionButtonState", "plannedContentWidth", "resolveButtonWidth", "(II)I", "drawQuantityState", "drawPlusButton", "", RichContentDTO.ALIGN_CENTER, "drawQuantityText", "(Landroid/graphics/Canvas;F)V", "drawMinusButton", "drawActionButton", "isCounter", "drawBackground", "(Landroid/graphics/Canvas;Z)V", "handleQuantityButtonEvent", "(Landroid/view/MotionEvent;)V", "", "text", "Landroid/text/TextPaint;", "textPaint", "plannedTextSize", "Landroid/text/StaticLayout;", "createToCartTextStaticLayout", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)Landroid/text/StaticLayout;", "finalSize", "createToCartTextLayoutWithComputedWidth", "createQuantityTextStaticLayout", "getQuantityTextStaticLayoutWidth", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)I", "createQuantityTextStaticLayoutWithComputedWidth", "measuredTextWidth", "newTextSize", "getSafeStaticLayoutWidth", "(III)I", "getToCartTextStaticLayoutWidth", "currentLayout", "incomingText", "plannedNewSize", "paint", "computeLayout", "(Landroid/text/StaticLayout;Ljava/lang/CharSequence;ILandroid/text/TextPaint;)Landroid/text/StaticLayout;", "staticLayout", "dx", "dy", "alpha", "drawByStaticLayout", "(Landroid/text/StaticLayout;Landroid/graphics/Canvas;FFI)V", "getDesiredTextWidth", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "handleActionButtonEvent", "showRipple", "()V", "hideRipple", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "colorGradient", "left", "top", "right", "bottom", "Landroid/graphics/LinearGradient;", "getBackgroundGradient", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;FFFF)Landroid/graphics/LinearGradient;", "model", "Landroid/graphics/Rect;", "rect", "getShaderGradient", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;Landroid/graphics/Rect;)Landroid/graphics/LinearGradient;", "getShaderGradientBySquare", "drawActionButtonIcon", "getCurrentCounterAlpha", "()I", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AddToCartClickListener;", "clickListener", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AddToCartClickListener;", "getClickListener", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AddToCartClickListener;", "setClickListener", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AddToCartClickListener;)V", "isPlusButtonEnabled", "Z", "prevModel", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;", "isQuantityState", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "actionButtonAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "updateCartAction", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "Landroid/graphics/drawable/Drawable;", "actionButtonIcon", "Landroid/graphics/drawable/Drawable;", "containerCornerRadius", "F", "borderHalf", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "buttonHeight", "I", "getButtonHeight", "quantityTextPaint$delegate", "LSc/j;", "getQuantityTextPaint", "()Landroid/text/TextPaint;", "quantityTextPaint", "", "quantityText", "Ljava/lang/String;", "quantityTextLayout", "Landroid/text/StaticLayout;", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "backgroundGradient", "Landroid/graphics/LinearGradient;", "rect$delegate", "getRect", "()Landroid/graphics/Rect;", "Landroid/graphics/Matrix;", "gradientTransformMatrix$delegate", "getGradientTransformMatrix", "()Landroid/graphics/Matrix;", "gradientTransformMatrix", "plusEnabledColor", "Ljava/lang/Integer;", "plusDisabledColor$delegate", "getPlusDisabledColor", "plusDisabledColor", "disabledBackgroundColor$delegate", "getDisabledBackgroundColor", "disabledBackgroundColor", "disabledIconColor$delegate", "getDisabledIconColor", "disabledIconColor", "drawRipple", "plusDrawable$delegate", "getPlusDrawable", "()Landroid/graphics/drawable/Drawable;", "plusDrawable", "minusDrawable$delegate", "getMinusDrawable", "minusDrawable", "", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme$StyleWrapper$Style;", "Lru/ozon/uni/core/UniGradient;", "likezoneGradientsMap$delegate", "getLikezoneGradientsMap", "()Ljava/util/Map;", "likezoneGradientsMap", "iconColor", "getIconColor", "()Ljava/lang/String;", "plusMinusColor", "getPlusMinusColor", "counterTextColor", "getCounterTextColor", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AnimationParams;", "animationParams", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AnimationParams;", "getAnimationParams", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AnimationParams;", "setAnimationParams", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AnimationParams;)V", "getActionButtonIconWidthWithPadding", "actionButtonIconWidthWithPadding", "Companion", "AddToCartClickListener", "AnimationParams", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddToFamilyCartButtonView extends View {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int actionButtonIconPadding;
    private static final int actionButtonIconSize;
    private static final float borderThickness;
    private static final float containerCornerRadiusDefault;
    private static final int containerHeight;
    private static final int contentOffset;
    private static final int innerMargin;
    private static final int plusMinusSize;
    private static final int smallMargin;
    private CommonControlSettings actionButtonAction;
    private Drawable actionButtonIcon;

    @NotNull
    private AnimationParams animationParams;
    private LinearGradient backgroundGradient;

    @NotNull
    private final Paint backgroundPaint;
    private final float borderHalf;
    private final int buttonHeight;
    private AddToCartClickListener clickListener;
    private Color.Gradient colorGradient;
    private float containerCornerRadius;

    @NotNull
    private final String counterTextColor;

    /* renamed from: disabledBackgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledBackgroundColor;

    /* renamed from: disabledIconColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledIconColor;
    private boolean drawRipple;

    /* renamed from: gradientTransformMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientTransformMatrix;

    @NotNull
    private final String iconColor;
    private boolean isBothMode;
    private boolean isDisabled;
    private boolean isLikezoneGradientTransformationEnabled;
    private boolean isPlusButtonEnabled;
    private boolean isQuantityState;

    /* renamed from: likezoneGradientsMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j likezoneGradientsMap;

    /* renamed from: minusDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j minusDrawable;

    /* renamed from: plusDisabledColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j plusDisabledColor;

    /* renamed from: plusDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j plusDrawable;
    private Integer plusEnabledColor;

    @NotNull
    private final String plusMinusColor;
    private FamilyButtonDTO prevModel;
    private String quantityText;
    private StaticLayout quantityTextLayout;

    /* renamed from: quantityTextPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j quantityTextPaint;

    /* renamed from: rect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rect;
    private FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AddToCartClickListener;", "", "onPlusButtonClicked", "", "updateCartAction", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "onMinusButtonClicked", "onAction", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AddToCartClickListener {
        void onAction(@NotNull CommonControlSettings commonControlSettings);

        void onMinusButtonClicked(@NotNull FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction);

        void onPlusButtonClicked(@NotNull FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$AnimationParams;", "", "", "buttonAlpha", "counterAlpha", "rightBorderOffset", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getButtonAlpha", "setButtonAlpha", "(I)V", "getCounterAlpha", "setCounterAlpha", "getRightBorderOffset", "setRightBorderOffset", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnimationParams {
        private int buttonAlpha;
        private int counterAlpha;
        private int rightBorderOffset;

        public AnimationParams() {
            this(0, 0, 0, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimationParams)) {
                return false;
            }
            AnimationParams animationParams = (AnimationParams) other;
            return this.buttonAlpha == animationParams.buttonAlpha && this.counterAlpha == animationParams.counterAlpha && this.rightBorderOffset == animationParams.rightBorderOffset;
        }

        public final int getButtonAlpha() {
            return this.buttonAlpha;
        }

        public final int getCounterAlpha() {
            return this.counterAlpha;
        }

        public final int getRightBorderOffset() {
            return this.rightBorderOffset;
        }

        public int hashCode() {
            return Integer.hashCode(this.rightBorderOffset) + C2454a.a(this.counterAlpha, Integer.hashCode(this.buttonAlpha) * 31, 31);
        }

        public final void setButtonAlpha(int i11) {
            this.buttonAlpha = i11;
        }

        public final void setCounterAlpha(int i11) {
            this.counterAlpha = i11;
        }

        public final void setRightBorderOffset(int i11) {
            this.rightBorderOffset = i11;
        }

        @NotNull
        public String toString() {
            return K00.b.e(this.rightBorderOffset, ")", C2438a.a("AnimationParams(buttonAlpha=", this.buttonAlpha, ", counterAlpha=", ", rightBorderOffset=", this.counterAlpha));
        }

        public AnimationParams(int i11, int i12, int i13) {
            this.buttonAlpha = i11;
            this.counterAlpha = i12;
            this.rightBorderOffset = i13;
        }

        public /* synthetic */ AnimationParams(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 255 : i11, (i14 & 2) != 0 ? 255 : i12, (i14 & 4) != 0 ? 0 : i13);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToFamilyCartButtonView$Companion;", "", "<init>", "()V", "", "contentOffset", "I", "getContentOffset", "()I", "plusMinusSize", "innerMargin", "smallMargin", "actionButtonIconPadding", "actionButtonIconSize", "", "borderThickness", "F", "DISABLED_ACTION_BUTTON_CONTENT_ALPHA", "NORMAL_ALPHA", "RIPPLE_ALPHA", "RIPPLE_GRADIENT_ALPHA", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getContentOffset() {
            return AddToFamilyCartButtonView.contentOffset;
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        contentOffset = dimens.getDP_6();
        containerCornerRadiusDefault = dimens.getDPF_10();
        containerHeight = dimens.getDP_32();
        plusMinusSize = dimens.getDP_16();
        innerMargin = dimens.getDP_12();
        smallMargin = dimens.getDP_8();
        actionButtonIconPadding = dimens.getDP_8();
        actionButtonIconSize = dimens.getDP_16();
        borderThickness = dimens.getDP_1();
    }

    public /* synthetic */ AddToFamilyCartButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindActionButtonIcon(FamilyButtonDTO dto) {
        Integer parseColor;
        FamilyButtonDTO.ActionButton actionButton;
        FamilyButtonDTO familyButtonDTO = this.prevModel;
        if (!Intrinsics.d((familyButtonDTO == null || (actionButton = familyButtonDTO.getActionButton()) == null) ? null : actionButton.getIcon(), dto.getActionButton().getIcon()) || this.actionButtonIcon == null) {
            ToCartIconIdStorage toCartIconIdStorage = ToCartIconIdStorage.INSTANCE;
            String icon = dto.getActionButton().getIcon();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawable = toCartIconIdStorage.getDrawable(icon, context);
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
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                parseColor = styleParser.parseColor(context2, this.iconColor);
            }
            if (parseColor != null) {
                drawable2.setTint(parseColor.intValue());
            } else {
                drawable2.setTintList(null);
            }
        }
    }

    private final void bindBackground(FamilyButtonDTO.Theme theme) {
        FamilyButtonDTO.Theme.StyleWrapper styleWrapper = theme instanceof FamilyButtonDTO.Theme.StyleWrapper ? (FamilyButtonDTO.Theme.StyleWrapper) theme : null;
        UniGradient uniGradient = getLikezoneGradientsMap().get(styleWrapper != null ? styleWrapper.getStyle() : null);
        if (uniGradient != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Color.Gradient gradient = TokensExtKt.toGradient(uniGradient, context);
            if (gradient == null) {
                return;
            }
            if (!gradient.equals(this.backgroundGradient)) {
                this.backgroundGradient = null;
            }
            this.colorGradient = gradient;
        }
    }

    private final StaticLayout computeLayout(StaticLayout currentLayout, CharSequence incomingText, int plannedNewSize, TextPaint paint) {
        if (currentLayout == null) {
            return this.isQuantityState ? createQuantityTextStaticLayout(incomingText, paint, plannedNewSize) : createToCartTextStaticLayout(incomingText, paint, plannedNewSize);
        }
        int quantityTextStaticLayoutWidth = this.isQuantityState ? getQuantityTextStaticLayoutWidth(incomingText, paint, plannedNewSize) : getToCartTextStaticLayoutWidth(incomingText, paint, plannedNewSize);
        return currentLayout.getWidth() != quantityTextStaticLayoutWidth ? this.isQuantityState ? createQuantityTextStaticLayoutWithComputedWidth(incomingText, paint, plannedNewSize) : createToCartTextLayoutWithComputedWidth(incomingText, paint, quantityTextStaticLayoutWidth) : currentLayout;
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
        drawBackground(canvas, false);
        drawActionButtonIcon(canvas);
    }

    private final void drawActionButtonIcon(Canvas canvas) {
        Drawable drawable = this.actionButtonIcon;
        if (drawable != null) {
            drawable.setAlpha(this.isDisabled ? 102 : this.isBothMode ? this.animationParams.getButtonAlpha() : 255);
            int i11 = actionButtonIconPadding;
            int i12 = contentOffset;
            int i13 = containerHeight;
            int i14 = actionButtonIconSize;
            drawable.setBounds(i11 + i12, (i13 - i14) / 2, i11 + i14 + i12, (i13 + i14) / 2);
            drawable.draw(canvas);
        }
    }

    private final void drawBackground(Canvas canvas, boolean isCounter) {
        float f7;
        AddToFamilyCartButtonView addToFamilyCartButtonView;
        this.backgroundPaint.setAlpha(255);
        this.backgroundPaint.setShader(null);
        int i11 = contentOffset;
        float f11 = this.borderHalf;
        float f12 = i11 + f11;
        if (isCounter) {
            f7 = (getWidth() - i11) - this.borderHalf;
        } else {
            f7 = (containerHeight + i11) - f11;
            if (this.isBothMode) {
                f7 += this.animationParams.getRightBorderOffset();
            }
        }
        float f13 = f7;
        float f14 = containerHeight - this.borderHalf;
        if (this.isDisabled) {
            this.backgroundPaint.setStyle(Paint.Style.FILL);
            this.backgroundPaint.setColor(getDisabledBackgroundColor());
            addToFamilyCartButtonView = this;
        } else {
            Color.Gradient gradient = this.colorGradient;
            if (gradient == null) {
                return;
            }
            this.backgroundPaint.setStyle(Paint.Style.STROKE);
            Paint paint = this.backgroundPaint;
            LinearGradient backgroundGradient = getBackgroundGradient(gradient, f12, f11, f13, f14);
            addToFamilyCartButtonView = this;
            f12 = f12;
            f11 = f11;
            f13 = f13;
            f14 = f14;
            paint.setShader(backgroundGradient);
        }
        if (addToFamilyCartButtonView.isBothMode) {
            addToFamilyCartButtonView.backgroundPaint.setAlpha(isCounter ? addToFamilyCartButtonView.animationParams.getCounterAlpha() : addToFamilyCartButtonView.animationParams.getButtonAlpha());
        }
        float f15 = addToFamilyCartButtonView.containerCornerRadius;
        canvas.drawRoundRect(f12, f11, f13, f14, f15, f15, addToFamilyCartButtonView.backgroundPaint);
        if (addToFamilyCartButtonView.drawRipple) {
            addToFamilyCartButtonView.backgroundPaint.setColor(-1);
            Paint paint2 = addToFamilyCartButtonView.backgroundPaint;
            paint2.setAlpha(paint2.getShader() == null ? 26 : 52);
            addToFamilyCartButtonView.backgroundPaint.setShader(null);
            float f16 = addToFamilyCartButtonView.containerCornerRadius;
            canvas.drawRoundRect(f12, f11, f13, f14, f16, f16, addToFamilyCartButtonView.backgroundPaint);
        }
    }

    @SuppressLint({"UseKtx"})
    private final void drawByStaticLayout(StaticLayout staticLayout, Canvas canvas, float dx, float dy, int alpha) {
        canvas.save();
        canvas.translate(dx, dy);
        staticLayout.getPaint().setAlpha(alpha);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private final void drawMinusButton(Canvas canvas) {
        getMinusDrawable().setAlpha(getCurrentCounterAlpha());
        Drawable minusDrawable = getMinusDrawable();
        int i11 = contentOffset;
        int i12 = smallMargin;
        int i13 = plusMinusSize;
        minusDrawable.setBounds(i11 + i12, i12, i11 + i13 + i12, i13 + i12);
        getMinusDrawable().draw(canvas);
    }

    private final void drawPlusButton(Canvas canvas) {
        getPlusDrawable().setAlpha(getCurrentCounterAlpha());
        Drawable plusDrawable = getPlusDrawable();
        int measuredWidth = getMeasuredWidth();
        int i11 = contentOffset;
        int i12 = smallMargin;
        int i13 = plusMinusSize;
        plusDrawable.setBounds(((measuredWidth - i11) - i12) - i13, i12, (getMeasuredWidth() - i11) - i12, i13 + i12);
        getPlusDrawable().draw(canvas);
    }

    private final void drawQuantityState(Canvas canvas) {
        drawBackground(canvas, true);
        drawMinusButton(canvas);
        drawQuantityText(canvas, getMeasuredWidth() / 2);
        drawPlusButton(canvas);
    }

    private final void drawQuantityText(Canvas canvas, float center) {
        StaticLayout staticLayout = this.quantityTextLayout;
        if (staticLayout == null) {
            return;
        }
        drawByStaticLayout(staticLayout, canvas, center - (staticLayout.getWidth() / 2.0f), (containerHeight / 2.0f) - (staticLayout.getHeight() / 2.0f), getCurrentCounterAlpha());
    }

    private final int getActionButtonIconWidthWithPadding() {
        if (this.actionButtonIcon == null) {
            return 0;
        }
        return actionButtonIconSize;
    }

    private final LinearGradient getBackgroundGradient(Color.Gradient colorGradient, float left, float top, float right, float bottom) {
        Rect rect = new Rect((int) left, (int) top, (int) right, (int) bottom);
        if (!rect.equals(getRect())) {
            this.backgroundGradient = null;
        }
        LinearGradient linearGradient = this.backgroundGradient;
        if (linearGradient != null) {
            return linearGradient;
        }
        getRect().set(rect);
        LinearGradient shaderGradientBySquare = this.isLikezoneGradientTransformationEnabled ? getShaderGradientBySquare(colorGradient, getRect()) : getShaderGradient(colorGradient, getRect());
        this.backgroundGradient = shaderGradientBySquare;
        return shaderGradientBySquare;
    }

    private final int getCurrentCounterAlpha() {
        if (this.isBothMode) {
            return this.animationParams.getCounterAlpha();
        }
        return 255;
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

    private final Matrix getGradientTransformMatrix() {
        return (Matrix) this.gradientTransformMatrix.getValue();
    }

    private final Map<FamilyButtonDTO.Theme.StyleWrapper.Style, UniGradient> getLikezoneGradientsMap() {
        return (Map) this.likezoneGradientsMap.getValue();
    }

    private final Drawable getMinusDrawable() {
        return (Drawable) this.minusDrawable.getValue();
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

    private final Rect getRect() {
        return (Rect) this.rect.getValue();
    }

    private final int getSafeStaticLayoutWidth(int plannedTextSize, int measuredTextWidth, int newTextSize) {
        if (newTextSize <= 0) {
            newTextSize = plannedTextSize == 0 ? measuredTextWidth : Math.min(measuredTextWidth, plannedTextSize);
        }
        if (newTextSize >= 0) {
            return newTextSize;
        }
        if (measuredTextWidth >= 0) {
            return measuredTextWidth;
        }
        if (getMeasuredWidth() > 0) {
            return getMeasuredWidth();
        }
        return 0;
    }

    static /* synthetic */ int getSafeStaticLayoutWidth$default(AddToFamilyCartButtonView addToFamilyCartButtonView, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        return addToFamilyCartButtonView.getSafeStaticLayoutWidth(i11, i12, i13);
    }

    private final LinearGradient getShaderGradient(Color.Gradient model, Rect rect) {
        float[] coordinates = OzGradientOrientationMapperKt.getCoordinates(model.getOrientation(), rect);
        return new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], model.getColors(), model.getPositions(), Shader.TileMode.CLAMP);
    }

    private final LinearGradient getShaderGradientBySquare(Color.Gradient model, Rect rect) {
        int width = rect.width();
        int height = rect.height();
        int min = Math.min(width, height);
        LinearGradient shaderGradient = getShaderGradient(model, new Rect(0, 0, min, min));
        float f7 = min;
        getGradientTransformMatrix().setScale(width / f7, height / f7);
        shaderGradient.setLocalMatrix(getGradientTransformMatrix());
        return shaderGradient;
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
        FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
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
            FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction2 = this.updateCartAction;
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

    private final void measureActionButtonState(int widthMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.buttonHeight, 1073741824);
        int i11 = innerMargin;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(resolveButtonWidth(getActionButtonIconWidthWithPadding() + i11 + i11, widthMeasureSpec), 1073741824), makeMeasureSpec);
    }

    private final void measureQuantityState(int widthMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.buttonHeight, 1073741824);
        float desiredTextWidth = getDesiredTextWidth(this.quantityText, getQuantityTextPaint());
        int i11 = plusMinusSize;
        int i12 = innerMargin;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(resolveButtonWidth((int) Math.ceil(i11 + i12 + desiredTextWidth + i12 + i11), widthMeasureSpec), 1073741824), makeMeasureSpec);
    }

    private final int resolveButtonWidth(int plannedContentWidth, int widthMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        return (mode == Integer.MIN_VALUE ? plannedContentWidth <= size : mode != 1073741824) ? plannedContentWidth : size;
    }

    private final void showRipple() {
        if (this.isDisabled) {
            return;
        }
        this.drawRipple = true;
        invalidate();
    }

    public final void bind(@NotNull FamilyButtonDTO dto, boolean isDisabled, int currentCount, boolean isPlusEnabled, TileThemeConfigVO.AddToCartButtonConfigVO config, boolean isLikezoneGradientTransformationEnabled, boolean isBothMode) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.isBothMode = isBothMode;
        this.isLikezoneGradientTransformationEnabled = isLikezoneGradientTransformationEnabled;
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
        FamilyButtonDTO.QuantityButton quantityButton = dto.getQuantityButton();
        this.updateCartAction = quantityButton != null ? quantityButton.getUpdateCartAction() : null;
        bindBackground(dto.getTheme());
        if (this.isQuantityState || isBothMode) {
            TextPaint quantityTextPaint = getQuantityTextPaint();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, this.counterTextColor);
            if (parseColor == null) {
                return;
            }
            quantityTextPaint.setColor(parseColor.intValue());
            if (dto.getQuantityButton() != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer parseColor2 = styleParser.parseColor(context2, this.plusMinusColor);
                if (parseColor2 == null) {
                    return;
                }
                int intValue = parseColor2.intValue();
                this.plusEnabledColor = parseColor2;
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
        }
        if (!this.isQuantityState || isBothMode) {
            bindActionButtonIcon(dto);
            if (!Intrinsics.d(this.prevModel, dto)) {
                this.prevModel = dto;
            }
        }
        if (config != null) {
            this.containerCornerRadius = config.getContainerCornerRadius();
        }
        requestLayout();
        invalidate();
    }

    @NotNull
    public final AnimationParams getAnimationParams() {
        return this.animationParams;
    }

    public final int getButtonHeight() {
        return this.buttonHeight;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.isQuantityState || this.isBothMode) {
            drawQuantityState(canvas);
        }
        if (!this.isQuantityState || this.isBothMode) {
            drawActionButton(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.isQuantityState) {
            measureActionButtonState(widthMeasureSpec);
            return;
        }
        measureQuantityState(widthMeasureSpec);
        String str = this.quantityText;
        this.quantityTextLayout = str != null ? computeLayout(this.quantityTextLayout, str, (getMeasuredWidth() - (plusMinusSize * 2)) - (innerMargin * 4), getQuantityTextPaint()) : null;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToFamilyCartButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isPlusButtonEnabled = true;
        this.containerCornerRadius = containerCornerRadiusDefault;
        float f7 = borderThickness;
        this.borderHalf = f7 / 2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f7);
        this.backgroundPaint = paint;
        this.buttonHeight = containerHeight + contentOffset;
        this.quantityTextPaint = LazyUtilsKt.unsafeLazy(new AddToFamilyCartButtonView$quantityTextPaint$2(context));
        this.rect = LazyUtilsKt.unsafeLazy(AddToFamilyCartButtonView$rect$2.INSTANCE);
        this.gradientTransformMatrix = LazyUtilsKt.unsafeLazy(AddToFamilyCartButtonView$gradientTransformMatrix$2.INSTANCE);
        this.plusDisabledColor = LazyUtilsKt.unsafeLazy(new AddToFamilyCartButtonView$plusDisabledColor$2(context));
        this.disabledBackgroundColor = LazyUtilsKt.unsafeLazy(new AddToFamilyCartButtonView$disabledBackgroundColor$2(context));
        this.disabledIconColor = LazyUtilsKt.unsafeLazy(new AddToFamilyCartButtonView$disabledIconColor$2(context));
        this.plusDrawable = LazyUtilsKt.unsafeLazy(new AddToFamilyCartButtonView$plusDrawable$2(context));
        this.minusDrawable = LazyUtilsKt.unsafeLazy(new AddToFamilyCartButtonView$minusDrawable$2(context));
        this.likezoneGradientsMap = k.b(AddToFamilyCartButtonView$likezoneGradientsMap$2.INSTANCE);
        UniColors uniColors = UniColors.GRAPHIC_PRIMARY;
        this.iconColor = uniColors.getToken();
        this.plusMinusColor = uniColors.getToken();
        this.counterTextColor = UniColors.TEXT_PRIMARY.getToken();
        this.isBothMode = true;
        this.animationParams = new AnimationParams(0, 0, 0, 7, null);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(false);
    }
}
