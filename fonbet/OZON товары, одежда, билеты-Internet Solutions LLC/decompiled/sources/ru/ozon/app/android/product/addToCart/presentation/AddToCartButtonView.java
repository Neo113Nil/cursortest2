package ru.ozon.app.android.product.addToCart.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import T7.E;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
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
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.R$style;
import ru.ozon.uni.core.UniGradient;
import sj.d;
import sj.f;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0010\u0018\u0000 \u0091\u00022\u00020\u0001:\b\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!JE\u0010*\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u00105J\u001f\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b:\u0010\u0018J\u0017\u0010;\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b;\u0010\u0018J\u001f\u0010>\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b@\u0010\u0018J\u0017\u0010A\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bA\u0010\u0018J\u0017\u0010B\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bB\u0010\u0018J\u0017\u0010C\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bC\u0010\u0018J\u0017\u0010D\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bD\u0010\u0018J\u0017\u0010E\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bE\u0010FJ)\u0010M\u001a\u00020L2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010NJ)\u0010P\u001a\u00020L2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\b\b\u0002\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u0010NJ)\u0010Q\u001a\u00020L2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010NJ'\u0010R\u001a\u00020\u00062\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bR\u0010SJ)\u0010T\u001a\u00020L2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\b\b\u0002\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bT\u0010NJ)\u0010W\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0002¢\u0006\u0004\bW\u0010XJ)\u0010Y\u001a\u00020\u00062\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bY\u0010SJ1\u0010^\u001a\u00020L2\b\u0010Z\u001a\u0004\u0018\u00010L2\u0006\u0010[\u001a\u00020G2\u0006\u0010\\\u001a\u00020\u00062\u0006\u0010]\u001a\u00020IH\u0002¢\u0006\u0004\b^\u0010_J\u001f\u0010`\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\b`\u0010\u000eJ/\u0010d\u001a\u00020\f2\u0006\u0010a\u001a\u00020L2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010b\u001a\u00020<2\u0006\u0010c\u001a\u00020<H\u0003¢\u0006\u0004\bd\u0010eJ!\u0010f\u001a\u00020<2\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bh\u0010FJ\u000f\u0010i\u001a\u00020\fH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\fH\u0002¢\u0006\u0004\bk\u0010jJ'\u0010q\u001a\u00020p2\u0006\u0010m\u001a\u00020l2\u0006\u0010n\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\u0006H\u0002¢\u0006\u0004\bq\u0010rJ7\u0010y\u001a\u00020x2\u0006\u0010s\u001a\u00020l2\u0006\u0010t\u001a\u00020<2\u0006\u0010u\u001a\u00020<2\u0006\u0010v\u001a\u00020<2\u0006\u0010w\u001a\u00020<H\u0002¢\u0006\u0004\by\u0010zJ\u001f\u0010~\u001a\u00020x2\u0006\u0010{\u001a\u00020l2\u0006\u0010}\u001a\u00020|H\u0002¢\u0006\u0004\b~\u0010\u007fJ!\u0010\u0080\u0001\u001a\u00020x2\u0006\u0010{\u001a\u00020l2\u0006\u0010}\u001a\u00020|H\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u0017\u0010\u0082\u0001\u001a\u00020\u001b*\u00030\u0081\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J!\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00012\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R)\u0010\u0091\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0091\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R&\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b$\u0010\u0092\u0001\u001a\u0005\b$\u0010\u0093\u0001\"\u0006\b\u0096\u0001\u0010\u0095\u0001R*\u0010\u0097\u0001\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0005\b\u009b\u0001\u00102R+\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R+\u0010¢\u0001\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¨\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u0092\u0001R\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010±\u0001R \u0010·\u0001\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001b\u0010¸\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u009d\u0001R\u001b\u0010¹\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010\u009d\u0001R\u001b\u0010º\u0001\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001b\u0010¼\u0001\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¾\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010\u0092\u0001R\u0017\u0010¿\u0001\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010½\u0001R\u0019\u0010À\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Â\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Ã\u0001R\u0019\u0010Å\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Ã\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ã\u0001R\u0019\u0010Ç\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010Ã\u0001R\u0019\u0010È\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Ã\u0001R\u0019\u0010É\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ã\u0001R\u0019\u0010Ê\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ã\u0001R\u0019\u0010Ë\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010\u0092\u0001R \u0010Ï\u0001\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÌ\u0001\u0010´\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001b\u0010Ð\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001b\u0010Ò\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R \u0010Ö\u0001\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010´\u0001\u001a\u0006\bÕ\u0001\u0010Î\u0001R\u001c\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001b\u0010Ú\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Ó\u0001R\u001c\u0010Ü\u0001\u001a\u0005\u0018\u00010Û\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001b\u0010Þ\u0001\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010»\u0001R\u001b\u0010ß\u0001\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001f\u0010}\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bá\u0001\u0010´\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R!\u0010è\u0001\u001a\u00030ä\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bå\u0001\u0010´\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001R\u001b\u0010é\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bé\u0001\u0010\u009d\u0001R\u001b\u0010ê\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bê\u0001\u0010\u009d\u0001R \u0010î\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bë\u0001\u0010´\u0001\u001a\u0006\bì\u0001\u0010í\u0001R \u0010ñ\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bï\u0001\u0010´\u0001\u001a\u0006\bð\u0001\u0010í\u0001R \u0010ô\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bò\u0001\u0010´\u0001\u001a\u0006\bó\u0001\u0010í\u0001R \u0010÷\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bõ\u0001\u0010´\u0001\u001a\u0006\bö\u0001\u0010í\u0001R\u0019\u0010ø\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010\u0092\u0001R!\u0010ü\u0001\u001a\u00030¯\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bù\u0001\u0010´\u0001\u001a\u0006\bú\u0001\u0010û\u0001R!\u0010ÿ\u0001\u001a\u00030¯\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bý\u0001\u0010´\u0001\u001a\u0006\bþ\u0001\u0010û\u0001R!\u0010\u0084\u0002\u001a\u00030\u0080\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010´\u0001\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R/\u0010\u0089\u0002\u001a\u0011\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0005\u0012\u00030\u0085\u00010\u0085\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0002\u0010´\u0001\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R\u0017\u0010)\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010\u0092\u0001R\u0014\u0010\u008b\u0002\u001a\u00020\u00068F¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010í\u0001R\u0017\u0010\u008d\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010í\u0001R\u0017\u0010\u008f\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010í\u0001R\u0017\u0010\u0090\u0002\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u0093\u0001¨\u0006\u0095\u0002"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "width", "height", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "dto", "isDisabled", "currentCount", "isPlusEnabled", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "config", "isLikezoneGradientTransformationEnabled", "bind", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;ZIZLru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;Z)V", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme;", "theme", "quantityState", "bindBackground", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme;Z)V", "bindActionButtonIcon", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;)V", "bindSellerIcon", "measureQuantityState", "(I)V", "measureActionButtonState", "plannedContentWidth", "resolveButtonWidth", "(II)I", "drawQuantityState", "drawPlusButton", "", RichContentDTO.ALIGN_CENTER, "drawQuantityText", "(Landroid/graphics/Canvas;F)V", "drawMinusButton", "drawActionButton", "drawBackground", "drawActionButtonTextAndIcon", "drawSellerIconIfNeeded", "handleQuantityButtonEvent", "(Landroid/view/MotionEvent;)V", "", "text", "Landroid/text/TextPaint;", "textPaint", "plannedTextSize", "Landroid/text/StaticLayout;", "createToCartTextStaticLayout", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)Landroid/text/StaticLayout;", "finalSize", "createToCartTextLayoutWithComputedWidth", "createQuantityTextStaticLayout", "getQuantityTextStaticLayoutWidth", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)I", "createQuantityTextStaticLayoutWithComputedWidth", "measuredTextWidth", "newTextSize", "getSafeStaticLayoutWidth", "(III)I", "getToCartTextStaticLayoutWidth", "currentLayout", "incomingText", "plannedNewSize", "paint", "computeLayout", "(Landroid/text/StaticLayout;Ljava/lang/CharSequence;ILandroid/text/TextPaint;)Landroid/text/StaticLayout;", "sendNonFatalLog", "staticLayout", "dx", "dy", "drawByStaticLayout", "(Landroid/text/StaticLayout;Landroid/graphics/Canvas;FF)V", "getDesiredTextWidth", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "handleActionButtonEvent", "showRipple", "()V", "hideRipple", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "gradient", "centerX", "centerY", "Landroid/graphics/Paint;", "getGradientPaint", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;II)Landroid/graphics/Paint;", "colorGradient", "left", "top", "right", "bottom", "Landroid/graphics/LinearGradient;", "getBackgroundGradient", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;FFFF)Landroid/graphics/LinearGradient;", "model", "Landroid/graphics/Rect;", "rect", "getShaderGradient", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;Landroid/graphics/Rect;)Landroid/graphics/LinearGradient;", "getShaderGradientBySquare", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper$Style;", "isLikezoneStyle", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper$Style;)Z", "style", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundGradients;", "resolveGradients", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$StyleWrapper$Style;)Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundGradients;", "setConfig", "(Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;)V", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$AddToCartClickListener;", "clickListener", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$AddToCartClickListener;", "getClickListener", "()Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$AddToCartClickListener;", "setClickListener", "(Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$AddToCartClickListener;)V", "isPlusButtonEnabled", "Z", "()Z", "setPlusButtonEnabled", "(Z)V", "setDisabled", "prevModel", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "getPrevModel", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "setPrevModel", "prevCount", "Ljava/lang/Integer;", "getPrevCount", "()Ljava/lang/Integer;", "setPrevCount", "(Ljava/lang/Integer;)V", "prevIsPlusEnabled", "Ljava/lang/Boolean;", "getPrevIsPlusEnabled", "()Ljava/lang/Boolean;", "setPrevIsPlusEnabled", "(Ljava/lang/Boolean;)V", "isQuantityState", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "actionButtonAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "updateCartAction", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "Landroid/graphics/drawable/Drawable;", "actionButtonIcon", "Landroid/graphics/drawable/Drawable;", "sellerIconDrawable", "sellerIconPaint$delegate", "LSc/j;", "getSellerIconPaint", "()Landroid/graphics/Paint;", "sellerIconPaint", "sellerIconOuterColor", "sellerIconInnerColor", "sellerIconGradientColor", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "gradientPaint", "Landroid/graphics/Paint;", "alwaysMeasureWithSellerIcon", "backgroundPaint", "containerCornerRadius", "F", "containerHeight", "I", "plusDrawableRes", "minusDrawableRes", "plusMinusSize", "plusMinusHorizontalMargin", "actionButtonTextStyleRes", "actionButtonIconSize", "quantityTextStyleRes", "alwaysMeasureMatchParent", "actionButtonTextPaint$delegate", "getActionButtonTextPaint", "()Landroid/text/TextPaint;", "actionButtonTextPaint", "actionButtonText", "Ljava/lang/CharSequence;", "actionButtonTextLayout", "Landroid/text/StaticLayout;", "quantityTextPaint$delegate", "getQuantityTextPaint", "quantityTextPaint", "", "quantityText", "Ljava/lang/String;", "quantityTextLayout", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundSource;", "backgroundSource", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundSource;", "backgroundGradientColor", "backgroundGradient", "Landroid/graphics/LinearGradient;", "rect$delegate", "getRect", "()Landroid/graphics/Rect;", "Landroid/graphics/Matrix;", "gradientTransformMatrix$delegate", "getGradientTransformMatrix", "()Landroid/graphics/Matrix;", "gradientTransformMatrix", "actionButtonTextColor", "plusEnabledColor", "plusDisabledColor$delegate", "getPlusDisabledColor", "()I", "plusDisabledColor", "disabledBackgroundColor$delegate", "getDisabledBackgroundColor", "disabledBackgroundColor", "disabledTextColor$delegate", "getDisabledTextColor", "disabledTextColor", "disabledIconColor$delegate", "getDisabledIconColor", "disabledIconColor", "drawRipple", "plusDrawable$delegate", "getPlusDrawable", "()Landroid/graphics/drawable/Drawable;", "plusDrawable", "minusDrawable$delegate", "getMinusDrawable", "minusDrawable", "Lsj/d;", "nonFatalErrorLogger$delegate", "getNonFatalErrorLogger", "()Lsj/d;", "nonFatalErrorLogger", "", "likezoneGradientsMap$delegate", "getLikezoneGradientsMap", "()Ljava/util/Map;", "likezoneGradientsMap", "getButtonHeight", "buttonHeight", "getActionButtonIconWidthWithPadding", "actionButtonIconWidthWithPadding", "getSellerIconOffset", "sellerIconOffset", "isSellerIconVisible", "Companion", "AddToCartClickListener", "BackgroundSource", "BackgroundGradients", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddToCartButtonView extends View {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int SELLER_ICON_OFFSET = UiExtKt.toPx(6);
    private static final int actionButtonIconPadding;

    @NotNull
    private static final TileThemeConfigVO.AddToCartButtonConfigVO configDefault;
    private static final int innerMargin;

    @NotNull
    private static final InterfaceC4008j<PorterDuffXfermode> porterDuffXfermode$delegate;
    private static final int sellerIconDrawableSize;
    private static final int sellerIconInnerCircleSize;
    private static final int sellerIconOuterCircleSize;
    private CommonControlSettings actionButtonAction;
    private Drawable actionButtonIcon;
    private int actionButtonIconSize;
    private CharSequence actionButtonText;
    private Integer actionButtonTextColor;
    private StaticLayout actionButtonTextLayout;

    /* renamed from: actionButtonTextPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionButtonTextPaint;
    private int actionButtonTextStyleRes;
    private boolean alwaysMeasureMatchParent;
    private boolean alwaysMeasureWithSellerIcon;
    private LinearGradient backgroundGradient;
    private Color.Gradient backgroundGradientColor;

    @NotNull
    private final Paint backgroundPaint;
    private BackgroundSource backgroundSource;
    private AddToCartClickListener clickListener;
    private float containerCornerRadius;
    private int containerHeight;

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
    private Paint gradientPaint;

    /* renamed from: gradientTransformMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientTransformMatrix;
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
    private int minusDrawableRes;

    /* renamed from: nonFatalErrorLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j nonFatalErrorLogger;

    /* renamed from: plusDisabledColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j plusDisabledColor;

    /* renamed from: plusDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j plusDrawable;
    private int plusDrawableRes;
    private Integer plusEnabledColor;
    private int plusMinusHorizontalMargin;
    private int plusMinusSize;
    private Integer prevCount;
    private Boolean prevIsPlusEnabled;
    private AddToCartButtonDTO prevModel;
    private String quantityText;
    private StaticLayout quantityTextLayout;

    /* renamed from: quantityTextPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j quantityTextPaint;
    private int quantityTextStyleRes;

    /* renamed from: rect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rect;
    private Drawable sellerIconDrawable;
    private Color.Gradient sellerIconGradientColor;
    private Integer sellerIconInnerColor;
    private Integer sellerIconOuterColor;

    /* renamed from: sellerIconPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sellerIconPaint;
    private AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$AddToCartClickListener;", "", "onPlusButtonClicked", "", "updateCartAction", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "onMinusButtonClicked", "onAction", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public interface AddToCartClickListener {
        void onAction(@NotNull CommonControlSettings commonControlSettings);

        void onMinusButtonClicked(@NotNull AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction);

        void onPlusButtonClicked(@NotNull AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundGradients;", "", "Lru/ozon/uni/core/UniGradient;", "buttonGradient", "counterGradient", "<init>", "(Lru/ozon/uni/core/UniGradient;Lru/ozon/uni/core/UniGradient;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/core/UniGradient;", "getButtonGradient", "()Lru/ozon/uni/core/UniGradient;", "getCounterGradient", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    static final /* data */ class BackgroundGradients {
        private final UniGradient buttonGradient;
        private final UniGradient counterGradient;

        /* JADX WARN: Multi-variable type inference failed */
        public BackgroundGradients() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundGradients)) {
                return false;
            }
            BackgroundGradients backgroundGradients = (BackgroundGradients) other;
            return Intrinsics.d(this.buttonGradient, backgroundGradients.buttonGradient) && Intrinsics.d(this.counterGradient, backgroundGradients.counterGradient);
        }

        public final UniGradient getButtonGradient() {
            return this.buttonGradient;
        }

        public final UniGradient getCounterGradient() {
            return this.counterGradient;
        }

        public int hashCode() {
            UniGradient uniGradient = this.buttonGradient;
            int hashCode = (uniGradient == null ? 0 : uniGradient.hashCode()) * 31;
            UniGradient uniGradient2 = this.counterGradient;
            return hashCode + (uniGradient2 != null ? uniGradient2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BackgroundGradients(buttonGradient=" + this.buttonGradient + ", counterGradient=" + this.counterGradient + ")";
        }

        public BackgroundGradients(UniGradient uniGradient, UniGradient uniGradient2) {
            this.buttonGradient = uniGradient;
            this.counterGradient = uniGradient2;
        }

        public /* synthetic */ BackgroundGradients(UniGradient uniGradient, UniGradient uniGradient2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uniGradient, (i11 & 2) != 0 ? null : uniGradient2);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundSource;", "", "<init>", "()V", "SolidColor", "Gradient", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundSource$Gradient;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundSource$SolidColor;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    private static abstract class BackgroundSource {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundSource$Gradient;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundSource;", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "colorGradient", "<init>", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "getColorGradient", "()Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Gradient extends BackgroundSource {

            @NotNull
            private final Color.Gradient colorGradient;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Gradient(@NotNull Color.Gradient colorGradient) {
                super(null);
                Intrinsics.checkNotNullParameter(colorGradient, "colorGradient");
                this.colorGradient = colorGradient;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Gradient) && Intrinsics.d(this.colorGradient, ((Gradient) other).colorGradient);
            }

            @NotNull
            public final Color.Gradient getColorGradient() {
                return this.colorGradient;
            }

            public int hashCode() {
                return this.colorGradient.hashCode();
            }

            @NotNull
            public String toString() {
                return "Gradient(colorGradient=" + this.colorGradient + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundSource$SolidColor;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$BackgroundSource;", "", "color", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getColor", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SolidColor extends BackgroundSource {
            private final int color;

            public SolidColor(int i11) {
                super(null);
                this.color = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SolidColor) && this.color == ((SolidColor) other).color;
            }

            public final int getColor() {
                return this.color;
            }

            public int hashCode() {
                return Integer.hashCode(this.color);
            }

            @NotNull
            public String toString() {
                return E.a(this.color, "SolidColor(color=", ")");
            }
        }

        public /* synthetic */ BackgroundSource(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BackgroundSource() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010%\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001f¨\u0006'"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView$Companion;", "", "<init>", "()V", "Landroid/graphics/PorterDuffXfermode;", "porterDuffXfermode$delegate", "LSc/j;", "getPorterDuffXfermode", "()Landroid/graphics/PorterDuffXfermode;", "porterDuffXfermode", "", "SELLER_ICON_OFFSET", "I", "getSELLER_ICON_OFFSET", "()I", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "configDefault", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "getConfigDefault", "()Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "innerMargin", "actionButtonIconPadding", "sellerIconOuterCircleSize", "sellerIconInnerCircleSize", "sellerIconDrawableSize", "DISABLED_ACTION_BUTTON_CONTENT_ALPHA", "NORMAL_ALPHA", "RIPPLE_ALPHA", "RIPPLE_GRADIENT_ALPHA", "", "LOG_TEAM_TAG", "Ljava/lang/String;", "LOG_GROUP_TAG", "LOG_NON_FATAL_MESSAGE", "LOG_CUSTOM_FIELD_MEASURED_TEXT_WIDTH", "LOG_CUSTOM_FIELD_WIDTH_VIEW", "LOG_CUSTOM_FIELD_PLANNED_TEXT_SIZE", "LOG_CUSTOM_FIELD_SELLER_ICON_OFFSET", "LOG_CUSTOM_FIELD_ACTION_BUTTON_ICON_WIDTH_WITH_PADDING", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PorterDuffXfermode getPorterDuffXfermode() {
            return (PorterDuffXfermode) AddToCartButtonView.porterDuffXfermode$delegate.getValue();
        }

        @NotNull
        public final TileThemeConfigVO.AddToCartButtonConfigVO getConfigDefault() {
            return AddToCartButtonView.configDefault;
        }

        public final int getSELLER_ICON_OFFSET() {
            return AddToCartButtonView.SELLER_ICON_OFFSET;
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        configDefault = new TileThemeConfigVO.AddToCartButtonConfigVO(dimens.getDPF_10(), UiExtKt.toPx(32), R$drawable.ic_s_plus_sign_filled, R$drawable.ic_s_minus_filled, dimens.getDP_16(), dimens.getDP_8(), R$style.OzonTextAppearance_BodyControl_400small, dimens.getDP_16(), R$style.OzonTextAppearance_BodyControl_400small, true, false);
        innerMargin = UiExtKt.toPx(12);
        actionButtonIconPadding = UiExtKt.toPx(8);
        sellerIconOuterCircleSize = UiExtKt.toPx(24);
        sellerIconInnerCircleSize = UiExtKt.toPx(18);
        sellerIconDrawableSize = UiExtKt.toPx(16);
        porterDuffXfermode$delegate = LazyUtilsKt.unsafeLazy(AddToCartButtonView$Companion$porterDuffXfermode$2.INSTANCE);
    }

    public /* synthetic */ AddToCartButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindActionButtonIcon(AddToCartButtonDTO dto) {
        Integer parseColor;
        AddToCartButtonDTO.ActionButton actionButton;
        AddToCartButtonDTO addToCartButtonDTO = this.prevModel;
        if (!Intrinsics.d((addToCartButtonDTO == null || (actionButton = addToCartButtonDTO.getActionButton()) == null) ? null : actionButton.getIcon(), dto.getActionButton().getIcon()) || this.actionButtonIcon == null) {
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
                parseColor = styleParser.parseColor(context2, dto.getTheme().getColors().getIconColor());
            }
            if (parseColor != null) {
                drawable2.setTint(parseColor.intValue());
            } else {
                drawable2.setTintList(null);
            }
        }
    }

    private final void bindBackground(AddToCartButtonDTO.Theme theme, boolean quantityState) {
        UniGradient buttonGradient;
        Color.Gradient gradient;
        BackgroundSource gradient2;
        UniGradient counterGradient;
        AddToCartButtonDTO.Theme.StyleWrapper styleWrapper = theme instanceof AddToCartButtonDTO.Theme.StyleWrapper ? (AddToCartButtonDTO.Theme.StyleWrapper) theme : null;
        BackgroundGradients resolveGradients = resolveGradients(styleWrapper != null ? styleWrapper.getStyle() : null);
        if (quantityState) {
            if (resolveGradients != null && (counterGradient = resolveGradients.getCounterGradient()) != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradient = TokensExtKt.toGradient(counterGradient, context);
            }
            gradient = null;
        } else {
            if (resolveGradients != null && (buttonGradient = resolveGradients.getButtonGradient()) != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                gradient = TokensExtKt.toGradient(buttonGradient, context2);
            }
            gradient = null;
        }
        if (gradient == null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            boolean z11 = this.isQuantityState;
            AddToCartButtonDTO.Theme.Colors colors = theme.getColors();
            Integer parseColor = styleParser.parseColor(context3, z11 ? colors.getCounterBackgroundColor() : colors.getBackgroundColor());
            if (parseColor == null) {
                return;
            } else {
                gradient2 = new BackgroundSource.SolidColor(parseColor.intValue());
            }
        } else {
            if (!gradient.equals(this.backgroundGradientColor)) {
                this.backgroundGradient = null;
            }
            this.backgroundGradientColor = gradient;
            gradient2 = new BackgroundSource.Gradient(gradient);
        }
        this.backgroundSource = gradient2;
    }

    private final void bindSellerIcon(AddToCartButtonDTO dto) {
        AddToCartButtonDTO.ActionButton actionButton;
        AddToCartButtonDTO.ActionButton.SellerIcon sellerIcon = dto.getActionButton().getSellerIcon();
        if (sellerIcon == null) {
            this.sellerIconDrawable = null;
            this.sellerIconInnerColor = null;
            this.sellerIconOuterColor = null;
            this.sellerIconGradientColor = null;
            this.gradientPaint = null;
            return;
        }
        AddToCartButtonDTO addToCartButtonDTO = this.prevModel;
        if (!sellerIcon.equals((addToCartButtonDTO == null || (actionButton = addToCartButtonDTO.getActionButton()) == null) ? null : actionButton.getSellerIcon()) || this.sellerIconDrawable == null) {
            ToCartIconIdStorage toCartIconIdStorage = ToCartIconIdStorage.INSTANCE;
            String sellerIcon2 = sellerIcon.getSellerIcon();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawable = toCartIconIdStorage.getDrawable(sellerIcon2, context);
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
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, sellerIcon.getSellerIconTint());
            if (parseColor != null) {
                drawable2.setTint(parseColor.intValue());
            } else {
                drawable2.setTintList(null);
            }
        }
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(sellerIcon.getSellerIconBackground());
        if (gradientByToken != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Color.Gradient gradient = TokensExtKt.toGradient(gradientByToken, context3);
            if (!Intrinsics.d(gradient, this.sellerIconGradientColor)) {
                this.gradientPaint = null;
            }
            this.sellerIconGradientColor = gradient;
        } else {
            this.sellerIconGradientColor = null;
            this.gradientPaint = null;
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.sellerIconInnerColor = styleParser2.parseColor(context4, sellerIcon.getSellerIconBackground());
        }
        StyleParser styleParser3 = StyleParser.INSTANCE;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        Integer parseColor2 = styleParser3.parseColor(context5, sellerIcon.getTileBackground());
        if (parseColor2 == null) {
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            parseColor2 = Integer.valueOf(ThemeExtKt.themeColor(context6, R$attr.layerFloor1));
        }
        this.sellerIconOuterColor = parseColor2;
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
            int i12 = this.containerHeight;
            int i13 = this.actionButtonIconSize;
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
            drawByStaticLayout(staticLayout2, canvas, width2 + getActionButtonIconWidthWithPadding(), (this.containerHeight - staticLayout2.getHeight()) / 2.0f);
        }
    }

    private final void drawBackground(Canvas canvas) {
        AddToCartButtonView addToCartButtonView;
        this.backgroundPaint.setAlpha(255);
        this.backgroundPaint.setShader(null);
        float sellerIconOffset = getSellerIconOffset();
        float width = getWidth() - getSellerIconOffset();
        float f7 = this.containerHeight;
        float f11 = 0.0f;
        if (this.isDisabled) {
            this.backgroundPaint.setColor(getDisabledBackgroundColor());
            addToCartButtonView = this;
        } else {
            BackgroundSource backgroundSource = this.backgroundSource;
            if (backgroundSource == null) {
                return;
            }
            if (backgroundSource instanceof BackgroundSource.Gradient) {
                Paint paint = this.backgroundPaint;
                LinearGradient backgroundGradient = getBackgroundGradient(((BackgroundSource.Gradient) backgroundSource).getColorGradient(), sellerIconOffset, 0.0f, width, f7);
                addToCartButtonView = this;
                sellerIconOffset = sellerIconOffset;
                f11 = 0.0f;
                width = width;
                f7 = f7;
                paint.setShader(backgroundGradient);
            } else {
                addToCartButtonView = this;
                if (!(backgroundSource instanceof BackgroundSource.SolidColor)) {
                    throw new o();
                }
                addToCartButtonView.backgroundPaint.setColor(((BackgroundSource.SolidColor) backgroundSource).getColor());
            }
        }
        float f12 = addToCartButtonView.containerCornerRadius;
        canvas.drawRoundRect(sellerIconOffset, f11, width, f7, f12, f12, addToCartButtonView.backgroundPaint);
        if (addToCartButtonView.drawRipple) {
            addToCartButtonView.backgroundPaint.setColor(-1);
            Paint paint2 = addToCartButtonView.backgroundPaint;
            paint2.setAlpha(paint2.getShader() == null ? 26 : 52);
            addToCartButtonView.backgroundPaint.setShader(null);
            float f13 = addToCartButtonView.containerCornerRadius;
            canvas.drawRoundRect(sellerIconOffset, f11, width, f7, f13, f13, addToCartButtonView.backgroundPaint);
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
        int sellerIconOffset = getSellerIconOffset() + this.plusMinusHorizontalMargin;
        int i11 = (this.containerHeight / 2) - (this.plusMinusSize / 2);
        int sellerIconOffset2 = getSellerIconOffset();
        int i12 = this.plusMinusSize;
        minusDrawable.setBounds(sellerIconOffset, i11, sellerIconOffset2 + i12 + this.plusMinusHorizontalMargin, (i12 / 2) + (this.containerHeight / 2));
        getMinusDrawable().draw(canvas);
    }

    private final void drawPlusButton(Canvas canvas) {
        Drawable plusDrawable = getPlusDrawable();
        int measuredWidth = (getMeasuredWidth() - getSellerIconOffset()) - this.plusMinusHorizontalMargin;
        int i11 = this.plusMinusSize;
        plusDrawable.setBounds(measuredWidth - i11, (this.containerHeight / 2) - (i11 / 2), (getMeasuredWidth() - getSellerIconOffset()) - this.plusMinusHorizontalMargin, (this.plusMinusSize / 2) + (this.containerHeight / 2));
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
        drawByStaticLayout(staticLayout, canvas, center - (staticLayout.getWidth() / 2.0f), (this.containerHeight / 2.0f) - (staticLayout.getHeight() / 2.0f));
    }

    private final void drawSellerIconIfNeeded(Canvas canvas) {
        Drawable drawable;
        Integer num;
        if (this.isDisabled) {
            return;
        }
        if ((this.sellerIconInnerColor == null && this.sellerIconGradientColor == null) || (drawable = this.sellerIconDrawable) == null || (num = this.sellerIconOuterColor) == null) {
            return;
        }
        getSellerIconPaint().setColor(num.intValue());
        float width = getWidth();
        int i11 = sellerIconOuterCircleSize;
        canvas.drawCircle(width - (i11 / 2.0f), getButtonHeight() - (i11 / 2.0f), i11 / 2.0f, getSellerIconPaint());
        int width2 = getWidth() - (i11 / 2);
        int buttonHeight = getButtonHeight() - (i11 / 2);
        Color.Gradient gradient = this.sellerIconGradientColor;
        if (gradient != null) {
            canvas.drawCircle(getWidth() - (i11 / 2.0f), getButtonHeight() - (i11 / 2.0f), sellerIconInnerCircleSize / 2.0f, getGradientPaint(gradient, width2, buttonHeight));
        } else {
            Paint sellerIconPaint = getSellerIconPaint();
            Integer num2 = this.sellerIconInnerColor;
            if (num2 == null) {
                return;
            }
            sellerIconPaint.setColor(num2.intValue());
            canvas.drawCircle(getWidth() - (i11 / 2.0f), getButtonHeight() - (i11 / 2.0f), sellerIconInnerCircleSize / 2.0f, getSellerIconPaint());
        }
        int i12 = sellerIconDrawableSize;
        drawable.setBounds(width2 - (i12 / 2), buttonHeight - (i12 / 2), (i12 / 2) + width2, (i12 / 2) + buttonHeight);
        drawable.draw(canvas);
    }

    private final int getActionButtonIconWidthWithPadding() {
        if (this.actionButtonIcon == null) {
            return 0;
        }
        CharSequence charSequence = this.actionButtonText;
        return (charSequence == null || charSequence.length() == 0) ? this.actionButtonIconSize : this.actionButtonIconSize + actionButtonIconPadding;
    }

    private final TextPaint getActionButtonTextPaint() {
        return (TextPaint) this.actionButtonTextPaint.getValue();
    }

    private final LinearGradient getBackgroundGradient(Color.Gradient colorGradient, float left, float top, float right, float bottom) {
        LinearGradient linearGradient = this.backgroundGradient;
        if (linearGradient != null) {
            return linearGradient;
        }
        getRect().set((int) left, (int) top, (int) right, (int) bottom);
        LinearGradient shaderGradientBySquare = this.isLikezoneGradientTransformationEnabled ? getShaderGradientBySquare(colorGradient, getRect()) : getShaderGradient(colorGradient, getRect());
        this.backgroundGradient = shaderGradientBySquare;
        return shaderGradientBySquare;
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

    private final Paint getGradientPaint(Color.Gradient gradient, int centerX, int centerY) {
        Paint paint = this.gradientPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint(1);
        int i11 = sellerIconInnerCircleSize / 2;
        paint2.setShader(getShaderGradient(gradient, new Rect(centerX - i11, centerY - i11, centerX + i11, centerY + i11)));
        paint2.setXfermode(INSTANCE.getPorterDuffXfermode());
        this.gradientPaint = paint2;
        return paint2;
    }

    private final Matrix getGradientTransformMatrix() {
        return (Matrix) this.gradientTransformMatrix.getValue();
    }

    private final Map<AddToCartButtonDTO.Theme.StyleWrapper.Style, BackgroundGradients> getLikezoneGradientsMap() {
        return (Map) this.likezoneGradientsMap.getValue();
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
        return getSafeStaticLayoutWidth(plannedTextSize, (int) textPaint.measureText(text.toString()), (getMeasuredWidth() - (this.plusMinusSize * 2)) - (innerMargin * 4));
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
        float f14 = this.containerHeight;
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

    private final boolean isLikezoneStyle(AddToCartButtonDTO.Theme.StyleWrapper.Style style) {
        return style == AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_PRIMARY || style == AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_SECONDARY_PRIMARY || style == AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_FRESH || style == AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_SECONDARY_FRESH || style == AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_DEFAULT_EXPRESS || style == AddToCartButtonDTO.Theme.StyleWrapper.Style.LIKEZONE_SECONDARY_EXPRESS;
    }

    private final boolean isSellerIconVisible() {
        return (this.sellerIconDrawable == null || this.isQuantityState || this.isDisabled) ? false : true;
    }

    private final void measureActionButtonState(int widthMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getButtonHeight(), 1073741824);
        float desiredTextWidth = getDesiredTextWidth(this.actionButtonText, getActionButtonTextPaint());
        float actionButtonIconWidthWithPadding = getActionButtonIconWidthWithPadding() + r3 + desiredTextWidth + innerMargin;
        if (this.sellerIconDrawable != null || this.alwaysMeasureWithSellerIcon) {
            actionButtonIconWidthWithPadding += sellerIconOuterCircleSize * 2;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(resolveButtonWidth((int) Math.ceil(actionButtonIconWidthWithPadding), widthMeasureSpec), 1073741824), makeMeasureSpec);
    }

    private final void measureQuantityState(int widthMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getButtonHeight(), 1073741824);
        float desiredTextWidth = getDesiredTextWidth(this.quantityText, getQuantityTextPaint());
        float f7 = r3 + r4 + desiredTextWidth + innerMargin + this.plusMinusSize;
        if (this.sellerIconDrawable != null || this.alwaysMeasureWithSellerIcon) {
            f7 += sellerIconOuterCircleSize * 2;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(resolveButtonWidth((int) Math.ceil(f7), widthMeasureSpec), 1073741824), makeMeasureSpec);
    }

    private final int resolveButtonWidth(int plannedContentWidth, int widthMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        return (mode == Integer.MIN_VALUE ? this.alwaysMeasureMatchParent || plannedContentWidth > size : mode == 1073741824) ? size : plannedContentWidth;
    }

    private final BackgroundGradients resolveGradients(AddToCartButtonDTO.Theme.StyleWrapper.Style style) {
        if (style == null || !isLikezoneStyle(style)) {
            return null;
        }
        return getLikezoneGradientsMap().get(style);
    }

    private final void sendNonFatalLog(int measuredTextWidth, int plannedTextSize) {
        getNonFatalErrorLogger().f(c.ERROR, "Invalid text width for static layout", f.a(U.j(new Pair("measuredTextWidth", Integer.valueOf(measuredTextWidth)), new Pair("width", Integer.valueOf(getWidth())), new Pair("plannedTextSize", Integer.valueOf(plannedTextSize)), new Pair("sellerIconOffset", Integer.valueOf(getSellerIconOffset())), new Pair("actionButtonIconWidthWithPadding", Integer.valueOf(getActionButtonIconWidthWithPadding())))), Boolean.FALSE);
    }

    private final void setConfig(TileThemeConfigVO.AddToCartButtonConfigVO config) {
        this.containerCornerRadius = config.getContainerCornerRadius();
        this.containerHeight = config.getContainerHeight();
        this.plusDrawableRes = config.getPlusDrawableRes();
        this.minusDrawableRes = config.getMinusDrawableRes();
        this.plusMinusSize = config.getPlusMinusSize();
        this.plusMinusHorizontalMargin = config.getPlusMinusHorizontalMargin();
        this.actionButtonTextStyleRes = config.getActionButtonTextStyleRes();
        this.actionButtonIconSize = config.getActionButtonIconSize();
        this.quantityTextStyleRes = config.getQuantityTextStyleRes();
        this.alwaysMeasureWithSellerIcon = config.getAlwaysMeasureWithSellerIcon();
        this.alwaysMeasureMatchParent = config.getAlwaysMeasureMatchParent();
    }

    private final void showRipple() {
        if (this.isDisabled) {
            return;
        }
        this.drawRipple = true;
        invalidate();
    }

    public final void bind(@NotNull AddToCartButtonDTO dto, boolean isDisabled, int currentCount, boolean isPlusEnabled, TileThemeConfigVO.AddToCartButtonConfigVO config, boolean isLikezoneGradientTransformationEnabled) {
        Intrinsics.checkNotNullParameter(dto, "dto");
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
        AddToCartButtonDTO.QuantityButton quantityButton = dto.getQuantityButton();
        this.updateCartAction = quantityButton != null ? quantityButton.getUpdateCartAction() : null;
        if (config == null) {
            config = configDefault;
        }
        setConfig(config);
        bindBackground(dto.getTheme(), this.isQuantityState);
        if (this.isQuantityState) {
            TextPaint quantityTextPaint = getQuantityTextPaint();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, dto.getTheme().getColors().getCounterTextColor());
            if (parseColor == null) {
                return;
            }
            quantityTextPaint.setColor(parseColor.intValue());
            if (dto.getQuantityButton() != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer parseColor2 = styleParser.parseColor(context2, dto.getTheme().getColors().getPlusMinusColor());
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
        } else {
            bindActionButtonIcon(dto);
            bindSellerIcon(dto);
            if (!Intrinsics.d(this.prevModel, dto)) {
                this.prevModel = dto;
            }
            if (!Intrinsics.d(this.actionButtonText, dto.getActionButton().getTitle())) {
                this.actionButtonText = dto.getActionButton().getTitle();
                this.actionButtonTextLayout = null;
            }
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor3 = styleParser2.parseColor(context3, dto.getTheme().getColors().getTitleColor());
            if (parseColor3 == null) {
                return;
            } else {
                this.actionButtonTextColor = parseColor3;
            }
        }
        this.prevCount = Integer.valueOf(currentCount);
        this.prevIsPlusEnabled = Boolean.valueOf(isPlusEnabled);
        requestLayout();
        invalidate();
    }

    public final int getButtonHeight() {
        return this.containerHeight + getSellerIconOffset();
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
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (info != null) {
            info.setText(this.actionButtonText);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.isQuantityState) {
            measureQuantityState(widthMeasureSpec);
            String str = this.quantityText;
            this.quantityTextLayout = str != null ? computeLayout(this.quantityTextLayout, str, (getMeasuredWidth() - (this.plusMinusSize * 2)) - (innerMargin * 4), getQuantityTextPaint()) : null;
        } else {
            measureActionButtonState(widthMeasureSpec);
            CharSequence charSequence = this.actionButtonText;
            if (charSequence != null) {
                r0 = computeLayout(this.actionButtonTextLayout, charSequence, (getMeasuredWidth() - (isSellerIconVisible() ? sellerIconOuterCircleSize * 2 : (innerMargin * 2) + (getSellerIconOffset() * 2))) - getActionButtonIconWidthWithPadding(), getActionButtonTextPaint());
            }
            this.actionButtonTextLayout = r0;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        this.gradientPaint = null;
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
    public AddToCartButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isPlusButtonEnabled = true;
        this.sellerIconPaint = LazyUtilsKt.unsafeLazy(AddToCartButtonView$sellerIconPaint$2.INSTANCE);
        TileThemeConfigVO.AddToCartButtonConfigVO addToCartButtonConfigVO = configDefault;
        this.alwaysMeasureWithSellerIcon = addToCartButtonConfigVO.getAlwaysMeasureWithSellerIcon();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        this.containerCornerRadius = addToCartButtonConfigVO.getContainerCornerRadius();
        this.containerHeight = addToCartButtonConfigVO.getContainerHeight();
        this.plusDrawableRes = addToCartButtonConfigVO.getPlusDrawableRes();
        this.minusDrawableRes = addToCartButtonConfigVO.getMinusDrawableRes();
        this.plusMinusSize = addToCartButtonConfigVO.getPlusMinusSize();
        this.plusMinusHorizontalMargin = addToCartButtonConfigVO.getPlusMinusHorizontalMargin();
        this.actionButtonTextStyleRes = addToCartButtonConfigVO.getActionButtonTextStyleRes();
        this.actionButtonIconSize = addToCartButtonConfigVO.getActionButtonIconSize();
        this.quantityTextStyleRes = addToCartButtonConfigVO.getQuantityTextStyleRes();
        this.alwaysMeasureMatchParent = addToCartButtonConfigVO.getAlwaysMeasureMatchParent();
        this.actionButtonTextPaint = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$actionButtonTextPaint$2(context, this));
        this.quantityTextPaint = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$quantityTextPaint$2(context, this));
        this.rect = LazyUtilsKt.unsafeLazy(AddToCartButtonView$rect$2.INSTANCE);
        this.gradientTransformMatrix = LazyUtilsKt.unsafeLazy(AddToCartButtonView$gradientTransformMatrix$2.INSTANCE);
        this.plusDisabledColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$plusDisabledColor$2(context));
        this.disabledBackgroundColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$disabledBackgroundColor$2(context));
        this.disabledTextColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$disabledTextColor$2(context));
        this.disabledIconColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$disabledIconColor$2(context));
        this.plusDrawable = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$plusDrawable$2(context, this));
        this.minusDrawable = LazyUtilsKt.unsafeLazy(new AddToCartButtonView$minusDrawable$2(context, this));
        this.nonFatalErrorLogger = LazyUtilsKt.unsafeLazy(AddToCartButtonView$nonFatalErrorLogger$2.INSTANCE);
        this.likezoneGradientsMap = k.b(AddToCartButtonView$likezoneGradientsMap$2.INSTANCE);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(false);
    }
}
