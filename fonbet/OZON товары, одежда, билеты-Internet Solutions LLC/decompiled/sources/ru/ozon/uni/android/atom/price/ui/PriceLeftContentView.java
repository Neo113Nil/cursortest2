package ru.ozon.uni.android.atom.price.ui;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import androidx.core.graphics.drawable.b;
import j.C7232a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.price.data.ComponentConfig;
import ru.ozon.uni.android.atom.price.data.GradientBitmapDrawableData;
import ru.ozon.uni.android.atom.price.data.PriceStyleThemed;
import ru.ozon.uni.android.atom.price.data.PriceTextAppearance;
import ru.ozon.uni.android.atom.price.data.PriceViewGradient;
import ru.ozon.uni.android.atom.price.data.StyleKt;
import ru.ozon.uni.android.atom.price.span.AppearanceSpan;
import ru.ozon.uni.android.atom.price.span.IconImageSpan;
import ru.ozon.uni.android.atom.price.span.OriginalPriceSpan;
import ru.ozon.uni.android.atom.price.span.SpaceSpan;
import ru.ozon.uni.android.atom.price.utils.CommonPriceUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ColorExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Spacings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.price.PriceDTOKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.UniGradients;
import ru.ozon.uni.core.models.GradientDirection;

@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 ç\u00012\u00020\u0001:\u0002ç\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\f*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\f*\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010\u0012J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0012J\u0013\u0010)\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\b)\u0010\u0016J\u001b\u0010-\u001a\u00020\u0006*\u00020*2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010\u0016J\u0013\u00100\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0016J\u0013\u00101\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\b1\u0010\u0016J\u000f\u00102\u001a\u00020#H\u0002¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u0004\u0018\u00010#*\u000204H\u0002¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u0004\u0018\u00010#*\u000207H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010<\u001a\u00020;*\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010?\u001a\u00020#*\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0013\u0010A\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\bA\u0010\u0016J\u000f\u0010B\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010CJ\u0013\u0010E\u001a\u00020\f*\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u0013\u0010G\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\bG\u0010\u0016J#\u0010J\u001a\u00020\f*\u00020H2\u0006\u0010I\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bJ\u0010KJ#\u0010L\u001a\u00020\f*\u00020H2\u0006\u0010I\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bL\u0010KJ\u001b\u0010M\u001a\u00020\f*\u00020H2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bM\u0010NJ/\u0010S\u001a\u00020\f*\u00020H2\u0006\u0010O\u001a\u00020\u00062\b\b\u0002\u0010Q\u001a\u00020P2\b\b\u0002\u0010R\u001a\u00020PH\u0002¢\u0006\u0004\bS\u0010TJ#\u0010U\u001a\u00020\f*\u00020H2\u0006\u0010I\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bU\u0010KJ=\u0010Y\u001a\u00020\f*\u00020H2\u0006\u0010V\u001a\u0002042\b\u0010W\u001a\u0004\u0018\u0001042\u0006\u0010X\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bY\u0010ZJ5\u0010[\u001a\u00020\f*\u00020H2\u0006\u0010V\u001a\u0002042\b\u0010W\u001a\u0004\u0018\u0001042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\b[\u0010\\J5\u0010]\u001a\u00020\f*\u00020H2\u0006\u0010V\u001a\u0002042\b\u0010W\u001a\u0004\u0018\u0001042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\b]\u0010\\J5\u0010^\u001a\u00020\f*\u00020H2\u0006\u0010V\u001a\u0002042\b\u0010W\u001a\u0004\u0018\u0001042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\b^\u0010\\J5\u0010_\u001a\u00020\f*\u00020H2\u0006\u0010V\u001a\u0002042\b\u0010W\u001a\u0004\u0018\u0001042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\b_\u0010\\J5\u0010`\u001a\u00020\f*\u00020H2\u0006\u0010V\u001a\u0002042\b\u0010W\u001a\u0004\u0018\u0001042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\b`\u0010\\JG\u0010e\u001a\u00020\f*\u00020H2\u0006\u0010V\u001a\u0002042\u0006\u0010a\u001a\u00020D2\u0006\u0010b\u001a\u00020P2\b\b\u0002\u0010c\u001a\u00020P2\u0006\u0010Q\u001a\u00020P2\b\b\u0002\u0010d\u001a\u00020PH\u0002¢\u0006\u0004\be\u0010fJ?\u0010i\u001a\u00020\f*\u00020H2\b\u0010g\u001a\u0004\u0018\u0001042\b\u0010W\u001a\u0004\u0018\u0001042\u0006\u0010h\u001a\u00020P2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u0004\u0018\u00010k2\u0006\u0010g\u001a\u000204H\u0002¢\u0006\u0004\bl\u0010mJ\u001b\u0010o\u001a\u00020n*\u00020k2\u0006\u0010g\u001a\u000204H\u0002¢\u0006\u0004\bo\u0010pJ\u001b\u0010q\u001a\u00020n*\u00020k2\u0006\u0010g\u001a\u000204H\u0002¢\u0006\u0004\bq\u0010pJ\u0013\u0010s\u001a\u00020r*\u00020rH\u0002¢\u0006\u0004\bs\u0010tJ\u0013\u0010u\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\bu\u0010\u0016J+\u0010z\u001a\u00020\f*\u00020H2\u0006\u0010v\u001a\u00020\u00062\u0006\u0010w\u001a\u00020\u00062\u0006\u0010y\u001a\u00020xH\u0002¢\u0006\u0004\bz\u0010{J \u0010\u007f\u001a\u00020~2\u0006\u0010|\u001a\u00020\u001f2\u0006\u0010}\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001e\u0010\u0081\u0001\u001a\u00020P*\u00020\u00132\u0006\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001e\u0010\u0083\u0001\u001a\u00020P*\u00020\u00132\u0006\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u0017\u0010\u0085\u0001\u001a\u00020P*\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001f\u0010\u0088\u0001\u001a\u00020\u0006*\u00020\u00132\u0007\u0010\u0087\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J*\u0010\u008c\u0001\u001a\u00020k*\u00020k2\t\b\u0001\u0010\u008a\u0001\u001a\u00020\u00062\u0007\u0010\u008b\u0001\u001a\u00020PH\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001f\u0010\u008f\u0001\u001a\u00020k*\u00020k2\u0007\u0010\u008e\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J9\u0010\u0094\u0001\u001a\u00020\u0006*\u00020\u001f2\u0006\u0010a\u001a\u00020D2\u0007\u0010\u0091\u0001\u001a\u00020\u00062\u0007\u0010\u0092\u0001\u001a\u00020\u00062\u0007\u0010\u0093\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J4\u0010\u0096\u0001\u001a\u00020\u00062\u0006\u0010V\u001a\u0002042\u0007\u0010\u0091\u0001\u001a\u00020\u00062\u0007\u0010\u0092\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020DH\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001f\u0010\u0099\u0001\u001a\u00020\f*\u00020H2\u0007\u0010\u0098\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0016\u0010\u009b\u0001\u001a\u00020\f*\u00020HH\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J(\u0010\u009f\u0001\u001a\u000b \u009e\u0001*\u0004\u0018\u00010H0H*\u00020H2\u0007\u0010\u009d\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010¡\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¨\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010©\u0001R\u001b\u0010«\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0019\u0010°\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010¢\u0001R\u0019\u0010±\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010¢\u0001R\u0019\u0010²\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010¢\u0001R\u0019\u0010³\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010¢\u0001R\u0018\u0010µ\u0001\u001a\u00030´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010·\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¢\u0001R \u0010¼\u0001\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u0019\u0010½\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¢\u0001R\u0019\u0010¾\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¢\u0001R \u0010Á\u0001\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0001\u0010¹\u0001\u001a\u0006\bÀ\u0001\u0010»\u0001R \u0010Ä\u0001\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010¹\u0001\u001a\u0006\bÃ\u0001\u0010»\u0001R \u0010Ç\u0001\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010¹\u0001\u001a\u0006\bÆ\u0001\u0010»\u0001R \u0010Ê\u0001\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÈ\u0001\u0010¹\u0001\u001a\u0006\bÉ\u0001\u0010»\u0001R \u0010Í\u0001\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bË\u0001\u0010¹\u0001\u001a\u0006\bÌ\u0001\u0010»\u0001R \u0010Ð\u0001\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010¹\u0001\u001a\u0006\bÏ\u0001\u0010»\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0019\u0010Ô\u0001\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u001b\u0010Ö\u0001\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001b\u0010Ø\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R%\u0010Ü\u0001\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0005\u0012\u00030Û\u00010Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0014\u0010à\u0001\u001a\u00020\u00068F¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0018\u0010ä\u0001\u001a\u00030á\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u001b\u0010å\u0001\u001a\u00020P*\u00020\u00138BX\u0082\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001¨\u0006è\u0001"}, d2 = {"Lru/ozon/uni/android/atom/price/ui/PriceLeftContentView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "data", "setContent", "(Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "Lru/ozon/uni/android/atom/price/data/ComponentConfig;", "startX", "endX", "setCoordinates", "(Lru/ozon/uni/android/atom/price/data/ComponentConfig;II)V", "", "applyTextGradients", "(Ljava/util/List;)V", "", "charSequence", "setGradientShader", "(Lru/ozon/uni/android/atom/price/data/ComponentConfig;Ljava/lang/CharSequence;)V", "Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "gradient", "setBackgroundGradient", "(Lru/ozon/uni/android/atom/price/data/PriceViewGradient;)V", "drawText", "drawBackground", "checkPaintStylesDiff", "Lru/ozon/uni/atoms/data/price/PriceDTO$Preset;", "Lru/ozon/uni/atoms/data/price/PriceDTO$Component$TextStyle;", "textStyle", "getTextAppearance", "(Lru/ozon/uni/atoms/data/price/PriceDTO$Preset;Lru/ozon/uni/atoms/data/price/PriceDTO$Component$TextStyle;)I", "checkIconDiff", "setAtomHeight", "setGradient", "defaultViewGradient", "()Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "", "tokenToPriceViewGradient", "(Ljava/lang/String;)Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "Lru/ozon/uni/atoms/data/price/PriceDTO$Gradient;", "dtoGradientToPriceViewGradient", "(Lru/ozon/uni/atoms/data/price/PriceDTO$Gradient;)Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "Lru/ozon/uni/atoms/data/price/PriceDTO$Gradient$Direction;", "Lru/ozon/uni/core/models/GradientDirection;", "toUniGradientsDirection", "(Lru/ozon/uni/atoms/data/price/PriceDTO$Gradient$Direction;)Lru/ozon/uni/core/models/GradientDirection;", "Lru/ozon/uni/core/UniGradient;", "toPriceViewGradient", "(Lru/ozon/uni/core/UniGradient;)Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "buildPriceContent", "resetPaints", "()V", "Landroid/graphics/Paint;", "resetPaint", "(Landroid/graphics/Paint;)V", "buildPriceText", "Landroid/text/SpannableStringBuilder;", "index", "insertSpaceBefore", "(Landroid/text/SpannableStringBuilder;ILru/ozon/uni/atoms/data/price/PriceDTO;)V", "insertComponentPadding", "insertBackgroundPadding", "(Landroid/text/SpannableStringBuilder;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "space", "", "isOnBg", "isBgPadding", "applySpaceSpan", "(Landroid/text/SpannableStringBuilder;IZZ)V", "insertComponent", "text", "componentColor", "style", "applyTextSpan", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO$Component$TextStyle;Lru/ozon/uni/atoms/data/price/PriceDTO;Z)V", "applyPrefixSpan", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO;Z)V", "applyPriceSpan", "applyPpuSpan", "applyCaptionSpan", "applyOriginalPriceSpan", "paint", "canDrawWithGradient", "isOriginalPrice", "isStrikethroughLineHidden", "applyStyledTextSpan", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Landroid/graphics/Paint;ZZZZ)V", "icon", "isMulticolor", "applyIconSpan", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/price/PriceDTO;Z)V", "Landroid/graphics/drawable/Drawable;", "getOrCreateDrawable", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/BitmapDrawable;", "getGradientDrawableFromPoolOrCreate", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;", "toGradientBitmapDrawable", "Landroid/graphics/Bitmap;", "applyGradient", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "setBackground", "currentWidth", "maxWidth", "Lru/ozon/uni/android/atom/price/data/ComponentConfig$TextComponent;", "componentConfig", "truncate", "(Landroid/text/SpannableStringBuilder;IILru/ozon/uni/android/atom/price/data/ComponentConfig$TextComponent;)V", "source", "width", "Landroid/text/StaticLayout;", "createStaticLayout", "(Ljava/lang/CharSequence;I)Landroid/text/StaticLayout;", "isComponentOnBg", "(Lru/ozon/uni/atoms/data/price/PriceDTO;I)Z", "isComponentLastOnBg", "Lru/ozon/uni/atoms/data/price/PriceDTO$Component;", "isInvalid", "(Lru/ozon/uni/atoms/data/price/PriceDTO$Component;)Z", "componentIndex", "calculateComponentGap", "(Lru/ozon/uni/atoms/data/price/PriceDTO;I)I", "color", "multicolor", "applyColorIfNotMulticolor", "(Landroid/graphics/drawable/Drawable;IZ)Landroid/graphics/drawable/Drawable;", "size", "applySize", "(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/drawable/Drawable;", "start", "end", "widthDiff", "characterCountToRemove", "(Ljava/lang/CharSequence;Landroid/graphics/Paint;III)I", "textWidth", "(Ljava/lang/String;IILandroid/graphics/Paint;)I", "indexToStartRemove", "clearFrom", "(Landroid/text/SpannableStringBuilder;I)V", "reset", "(Landroid/text/SpannableStringBuilder;)V", "src", "kotlin.jvm.PlatformType", "setFrom", "(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;", "bgSecondaryColor", "I", "cachedData", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "", "componentConfigs", "Ljava/util/List;", "stringBuilder", "Landroid/text/SpannableStringBuilder;", "measureStringBuilder", "staticLayout", "Landroid/text/StaticLayout;", "Landroid/text/TextPaint;", "staticLayoutPaint", "Landroid/text/TextPaint;", "atomHeightInPx", "maxStringHeight", "requiredHeight", "priceBackgroundHeight", "Landroid/graphics/Rect;", "textBoundsRect", "Landroid/graphics/Rect;", "priceBackgroundPaddings", "priceBackgroundPaint$delegate", "LSc/j;", "getPriceBackgroundPaint", "()Landroid/graphics/Paint;", "priceBackgroundPaint", "priceBackgroundRadius", "onBgStringLength", "prefixPaint$delegate", "getPrefixPaint", "prefixPaint", "pricePaint$delegate", "getPricePaint", "pricePaint", "iconPaint$delegate", "getIconPaint", "iconPaint", "ppuPaint$delegate", "getPpuPaint", "ppuPaint", "captionPaint$delegate", "getCaptionPaint", "captionPaint", "originalPricePaint$delegate", "getOriginalPricePaint", "originalPricePaint", "Ljava/util/BitSet;", "paintDirtyMarkSet", "Ljava/util/BitSet;", "needUpdateIconDrawable", "Z", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "priceViewGradient", "Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "Ljava/util/SortedMap;", "Lru/ozon/uni/android/atom/price/data/GradientBitmapDrawableData;", "bitmapDrawablePool", "Ljava/util/SortedMap;", "getPriceBaseline", "()I", "priceBaseline", "", "getTextOffsetY", "()F", "textOffsetY", "isSaleStyle", "(Lru/ozon/uni/atoms/data/price/PriceDTO;)Z", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PriceLeftContentView extends View {
    private int atomHeightInPx;
    private final int bgSecondaryColor;

    @NotNull
    private final SortedMap<String, GradientBitmapDrawableData> bitmapDrawablePool;
    private PriceDTO cachedData;

    /* renamed from: captionPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j captionPaint;

    @NotNull
    private final List<ComponentConfig> componentConfigs;
    private Drawable iconDrawable;

    /* renamed from: iconPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconPaint;
    private int maxStringHeight;

    @NotNull
    private SpannableStringBuilder measureStringBuilder;
    private boolean needUpdateIconDrawable;
    private int onBgStringLength;

    /* renamed from: originalPricePaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j originalPricePaint;

    @NotNull
    private final BitSet paintDirtyMarkSet;

    /* renamed from: ppuPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ppuPaint;

    /* renamed from: prefixPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j prefixPaint;
    private int priceBackgroundHeight;
    private int priceBackgroundPaddings;

    /* renamed from: priceBackgroundPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceBackgroundPaint;
    private int priceBackgroundRadius;

    /* renamed from: pricePaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pricePaint;
    private PriceViewGradient priceViewGradient;
    private int requiredHeight;
    private StaticLayout staticLayout;

    @NotNull
    private TextPaint staticLayoutPaint;

    @NotNull
    private SpannableStringBuilder stringBuilder;

    @NotNull
    private final Rect textBoundsRect;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PriceDTO.Component.TextStyle.values().length];
            try {
                iArr[PriceDTO.Component.TextStyle.PREFIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceDTO.Component.TextStyle.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceDTO.Component.TextStyle.PPU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceDTO.Component.TextStyle.CAPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PriceDTO.Component.TextStyle.ORIGINAL_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PriceDTO.Gradient.Direction.values().length];
            try {
                iArr2[PriceDTO.Gradient.Direction.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PriceDTO.Gradient.Direction.BOTTOM_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PriceDTO.Gradient.Direction.LEFT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PriceDTO.Gradient.Direction.RIGHT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PriceDTO.Gradient.Direction.TOP_LEFT_BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PriceDTO.Gradient.Direction.TOP_RIGHT_BOTTOM_LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[PriceDTO.Gradient.Direction.BOTTOM_RIGHT_TOP_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[PriceDTO.Gradient.Direction.BOTTOM_LEFT_TOP_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ PriceLeftContentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyCaptionSpan(SpannableStringBuilder spannableStringBuilder, String str, String str2, PriceDTO priceDTO, boolean z11) {
        Integer num;
        BitSet bitSet = this.paintDirtyMarkSet;
        PriceDTO.Component.TextStyle textStyle = PriceDTO.Component.TextStyle.CAPTION;
        Integer num2 = null;
        if (bitSet.get(textStyle.ordinal())) {
            this.paintDirtyMarkSet.clear(textStyle.ordinal());
            num = Integer.valueOf(PriceDTOKt.getTextAppearance(priceDTO).getCaptionTextAppearanceResId());
        } else {
            num = null;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str2);
        if (parseColor != null) {
            num2 = parseColor;
        } else if (this.priceViewGradient == null || z11) {
            PriceStyleThemed priceStyleThemed = StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType());
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            num2 = Integer.valueOf(ThemeExtKt.themeColor(context2, z11 ? priceStyleThemed.getCaptionColorOnBgAttr() : priceStyleThemed.getCaptionColorAttr()));
        }
        Paint captionPaint = getCaptionPaint();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        applyStyledTextSpan$default(this, spannableStringBuilder, str, CommonPriceUtilsKt.configure(captionPaint, num, num2, context3), !z11 && str2 == null, false, z11, false, 40, null);
    }

    private final Drawable applyColorIfNotMulticolor(Drawable drawable, int i11, boolean z11) {
        if (z11) {
            return drawable;
        }
        drawable.setTint(i11);
        return drawable;
    }

    private final Bitmap applyGradient(Bitmap bitmap) {
        float pxF = UiExtKt.toPxF(Spacings.SPACING_2.getPx());
        PriceViewGradient priceViewGradient = this.priceViewGradient;
        getIconPaint().setShader(priceViewGradient != null ? CommonPriceUtilsKt.getShaderByPriceViewGradient(priceViewGradient, pxF, pxF, bitmap.getHeight() - pxF, bitmap.getWidth() - pxF) : null);
        getIconPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Canvas canvas = new Canvas(bitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), getIconPaint());
        return bitmap;
    }

    private final void applyIconSpan(SpannableStringBuilder spannableStringBuilder, String str, String str2, boolean z11, PriceDTO priceDTO, boolean z12) {
        Drawable orCreateDrawable;
        int themeColor;
        Drawable applySize;
        if (str == null || (orCreateDrawable = getOrCreateDrawable(str)) == null) {
            return;
        }
        spannableStringBuilder.append("\u200b");
        int px = UiExtKt.toPx(PriceDTOKt.getPricePreset(priceDTO).getIconSize());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str2);
        if (parseColor != null) {
            themeColor = parseColor.intValue();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context2, z12 ? StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType()).getIconColorOnBgAttr() : StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType()).getIconColorAttr());
        }
        if (this.priceViewGradient == null || z12 || z11 || str2 != null) {
            Drawable mutate = orCreateDrawable.mutate();
            Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
            applySize = applySize(applyColorIfNotMulticolor(mutate, themeColor, z11), px);
        } else {
            applySize = applySize(getGradientDrawableFromPoolOrCreate(orCreateDrawable, str), px);
        }
        int length = spannableStringBuilder.length();
        int i11 = length - 1;
        spannableStringBuilder.setSpan(new IconImageSpan(applySize, UiExtKt.toPx(PriceDTOKt.getPricePreset(priceDTO).getAtomHeight())), i11, length, 33);
        this.componentConfigs.add(new ComponentConfig.IconComponent(px, i11, length, z12));
    }

    private final void applyOriginalPriceSpan(SpannableStringBuilder spannableStringBuilder, String str, String str2, PriceDTO priceDTO, boolean z11) {
        Integer num;
        int themeColor;
        BitSet bitSet = this.paintDirtyMarkSet;
        PriceDTO.Component.TextStyle textStyle = PriceDTO.Component.TextStyle.ORIGINAL_PRICE;
        if (bitSet.get(textStyle.ordinal())) {
            this.paintDirtyMarkSet.clear(textStyle.ordinal());
            num = Integer.valueOf(PriceDTOKt.getTextAppearance(priceDTO).getOriginalPriceTextAppearanceResId());
        } else {
            num = null;
        }
        Paint originalPricePaint = getOriginalPricePaint();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str2);
        if (parseColor != null) {
            themeColor = parseColor.intValue();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context2, StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType()).getOriginalPriceColorAttr());
        }
        Integer valueOf = Integer.valueOf(themeColor);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        applyStyledTextSpan(spannableStringBuilder, str, CommonPriceUtilsKt.configure(originalPricePaint, num, valueOf, context3), false, true, z11, priceDTO.isStrikethroughLineHidden());
    }

    private final void applyPpuSpan(SpannableStringBuilder spannableStringBuilder, String str, String str2, PriceDTO priceDTO, boolean z11) {
        Integer num;
        int themeColor;
        BitSet bitSet = this.paintDirtyMarkSet;
        PriceDTO.Component.TextStyle textStyle = PriceDTO.Component.TextStyle.PPU;
        if (bitSet.get(textStyle.ordinal())) {
            this.paintDirtyMarkSet.clear(textStyle.ordinal());
            num = Integer.valueOf(PriceDTOKt.getTextAppearance(priceDTO).getPpuTextAppearanceResId());
        } else {
            num = null;
        }
        Paint ppuPaint = getPpuPaint();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str2);
        if (parseColor != null) {
            themeColor = parseColor.intValue();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context2, z11 ? StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType()).getPpuColorOnBgAttr() : StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType()).getPpuColorAttr());
        }
        Integer valueOf = Integer.valueOf(themeColor);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        applyStyledTextSpan$default(this, spannableStringBuilder, str, CommonPriceUtilsKt.configure(ppuPaint, num, valueOf, context3), false, false, z11, false, 40, null);
    }

    private final void applyPrefixSpan(SpannableStringBuilder spannableStringBuilder, String str, String str2, PriceDTO priceDTO, boolean z11) {
        Integer num;
        BitSet bitSet = this.paintDirtyMarkSet;
        PriceDTO.Component.TextStyle textStyle = PriceDTO.Component.TextStyle.PREFIX;
        Integer num2 = null;
        if (bitSet.get(textStyle.ordinal())) {
            this.paintDirtyMarkSet.clear(textStyle.ordinal());
            num = Integer.valueOf(PriceDTOKt.getTextAppearance(priceDTO).getPrefixTextAppearanceResId());
        } else {
            num = null;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str2);
        if (parseColor != null) {
            num2 = parseColor;
        } else if (this.priceViewGradient == null || z11) {
            PriceStyleThemed priceStyleThemed = StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType());
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            num2 = Integer.valueOf(ThemeExtKt.themeColor(context2, z11 ? priceStyleThemed.getPrefixColorOnBgAttr() : priceStyleThemed.getPrefixColorAttr()));
        }
        Paint prefixPaint = getPrefixPaint();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        applyStyledTextSpan$default(this, spannableStringBuilder, str, CommonPriceUtilsKt.configure(prefixPaint, num, num2, context3), !z11 && str2 == null, false, z11, false, 40, null);
    }

    private final void applyPriceSpan(SpannableStringBuilder spannableStringBuilder, String str, String str2, PriceDTO priceDTO, boolean z11) {
        Integer num;
        BitSet bitSet = this.paintDirtyMarkSet;
        PriceDTO.Component.TextStyle textStyle = PriceDTO.Component.TextStyle.PRICE;
        Integer num2 = null;
        if (bitSet.get(textStyle.ordinal())) {
            this.paintDirtyMarkSet.clear(textStyle.ordinal());
            num = Integer.valueOf(PriceDTOKt.getTextAppearance(priceDTO).getPriceTextAppearanceResId());
        } else {
            num = null;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str2);
        if (parseColor != null) {
            num2 = parseColor;
        } else if (this.priceViewGradient == null || z11) {
            PriceStyleThemed priceStyleThemed = StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType());
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            num2 = Integer.valueOf(ThemeExtKt.themeColor(context2, z11 ? priceStyleThemed.getPriceColorOnBgAttr() : priceStyleThemed.getPriceColorAttr()));
        }
        Paint pricePaint = getPricePaint();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        applyStyledTextSpan$default(this, spannableStringBuilder, str, CommonPriceUtilsKt.configure(pricePaint, num, num2, context3), !z11 && str2 == null, false, z11, false, 40, null);
    }

    private final Drawable applySize(Drawable drawable, int i11) {
        drawable.setBounds(0, 0, i11, i11);
        return drawable;
    }

    private final void applySpaceSpan(SpannableStringBuilder spannableStringBuilder, int i11, boolean z11, boolean z12) {
        spannableStringBuilder.append("\u200b");
        int length = spannableStringBuilder.length();
        int i12 = length - 1;
        spannableStringBuilder.setSpan(new SpaceSpan(i11), i12, length, 33);
        this.componentConfigs.add(new ComponentConfig.SpaceComponent(i11, z12, i12, length, z11));
    }

    static /* synthetic */ void applySpaceSpan$default(PriceLeftContentView priceLeftContentView, SpannableStringBuilder spannableStringBuilder, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        priceLeftContentView.applySpaceSpan(spannableStringBuilder, i11, z11, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyStyledTextSpan(SpannableStringBuilder spannableStringBuilder, String str, Paint paint, boolean z11, boolean z12, boolean z13, boolean z14) {
        AppearanceSpan appearanceSpan;
        spannableStringBuilder.append((CharSequence) str);
        int length = spannableStringBuilder.length() - str.length();
        int length2 = str.length() + length;
        if (z12) {
            OriginalPriceSpan originalPriceSpan = new OriginalPriceSpan(paint);
            originalPriceSpan.setStrikethroughLineHidden(z14);
            appearanceSpan = originalPriceSpan;
        } else {
            appearanceSpan = new AppearanceSpan(paint);
        }
        spannableStringBuilder.setSpan(appearanceSpan, length, length2, 17);
        this.componentConfigs.add(new ComponentConfig.TextComponent(paint, z11, 0, 0, length, length2, z13, 12, null));
    }

    static /* synthetic */ void applyStyledTextSpan$default(PriceLeftContentView priceLeftContentView, SpannableStringBuilder spannableStringBuilder, String str, Paint paint, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        if ((i11 & 32) != 0) {
            z14 = false;
        }
        priceLeftContentView.applyStyledTextSpan(spannableStringBuilder, str, paint, z11, z12, z13, z14);
    }

    private final void applyTextGradients(List<? extends ComponentConfig> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            setGradientShader((ComponentConfig) it.next(), this.stringBuilder);
        }
    }

    private final void applyTextSpan(SpannableStringBuilder spannableStringBuilder, String str, String str2, PriceDTO.Component.TextStyle textStyle, PriceDTO priceDTO, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()];
        if (i11 == 1) {
            applyPrefixSpan(spannableStringBuilder, str, str2, priceDTO, z11);
            return;
        }
        if (i11 == 2) {
            applyPriceSpan(spannableStringBuilder, str, str2, priceDTO, z11);
            return;
        }
        if (i11 == 3) {
            applyPpuSpan(spannableStringBuilder, str, str2, priceDTO, z11);
        } else if (i11 == 4) {
            applyCaptionSpan(spannableStringBuilder, str, str2, priceDTO, z11);
        } else {
            if (i11 != 5) {
                throw new o();
            }
            applyOriginalPriceSpan(spannableStringBuilder, str, str2, priceDTO, z11);
        }
    }

    private final void buildPriceContent(PriceDTO priceDTO) {
        reset(this.stringBuilder);
        this.componentConfigs.clear();
        resetPaints();
        this.priceBackgroundPaddings = 0;
        buildPriceText(priceDTO);
    }

    private final void buildPriceText(PriceDTO priceDTO) {
        int i11 = 0;
        for (Object obj : priceDTO.getPrice()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            insertSpaceBefore(this.stringBuilder, i11, priceDTO);
            insertComponent(this.stringBuilder, i11, priceDTO);
            i11 = i12;
        }
    }

    private final int calculateComponentGap(PriceDTO priceDTO, int i11) {
        PriceDTO.Component component = priceDTO.getPrice().get(i11);
        return component.getIcon() != null ? UiExtKt.toPx(PriceDTOKt.getPricePreset(priceDTO).getPriceGap()) : component.getTextStyle() == PriceDTO.Component.TextStyle.PPU ? priceDTO.getPrice().get(i11 + (-1)).getIcon() != null ? UiExtKt.toPx(PriceDTOKt.getPricePreset(priceDTO).getLeftPartGap()) : UiExtKt.toPx(PriceDTOKt.getPricePreset(priceDTO).getPriceGap()) : UiExtKt.toPx(PriceDTOKt.getPricePreset(priceDTO).getContentGap());
    }

    private final int characterCountToRemove(CharSequence charSequence, Paint paint, int i11, int i12, int i13) {
        String obj = charSequence.toString();
        int i14 = 0;
        int i15 = i12;
        int i16 = 0;
        while (i15 > i11 && i13 > i14) {
            i15--;
            i14 = textWidth(obj, i15, i12, paint);
            i16++;
        }
        return i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void checkIconDiff(PriceDTO priceDTO) {
        String str;
        Iterator<T> it;
        Object obj;
        List<PriceDTO.Component> price;
        Object obj2;
        PriceDTO priceDTO2 = this.cachedData;
        if (priceDTO2 != null && (price = priceDTO2.getPrice()) != null) {
            Iterator<T> it2 = price.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (((PriceDTO.Component) obj2).getIcon() != null) {
                        break;
                    }
                }
            }
            PriceDTO.Component component = (PriceDTO.Component) obj2;
            if (component != null) {
                str = component.getIcon();
                it = priceDTO.getPrice().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((PriceDTO.Component) obj).getIcon() != null) {
                            break;
                        }
                    }
                }
                this.needUpdateIconDrawable = !Intrinsics.d(((PriceDTO.Component) obj) != null ? r2.getIcon() : null, str);
            }
        }
        str = null;
        it = priceDTO.getPrice().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        this.needUpdateIconDrawable = !Intrinsics.d(((PriceDTO.Component) obj) != null ? r2.getIcon() : null, str);
    }

    private final void checkPaintStylesDiff(PriceDTO priceDTO) {
        PriceDTO.Preset preset;
        BitSet bitSet = new BitSet(PriceDTO.Component.TextStyle.getEntries().size());
        for (PriceDTO.Component.TextStyle textStyle : PriceDTO.Component.TextStyle.getEntries()) {
            int ordinal = textStyle.ordinal();
            PriceDTO priceDTO2 = this.cachedData;
            boolean z11 = false;
            if (priceDTO2 != null && (preset = priceDTO2.getPreset()) != null && getTextAppearance(priceDTO.getPreset(), textStyle) == getTextAppearance(preset, textStyle)) {
                z11 = true;
            }
            bitSet.set(ordinal, !z11);
        }
        this.paintDirtyMarkSet.or(bitSet);
    }

    private final void clearFrom(SpannableStringBuilder spannableStringBuilder, int i11) {
        spannableStringBuilder.delete(i11, spannableStringBuilder.length());
    }

    private final StaticLayout createStaticLayout(CharSequence source, int width) {
        StaticLayout build = StaticLayout.Builder.obtain(source, 0, source.length(), this.staticLayoutPaint, width).setIncludePad(false).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final PriceViewGradient defaultViewGradient() {
        return toPriceViewGradient(UniGradients.GR_SOCIAL_PRIMARY.getGradient());
    }

    private final void drawBackground(Canvas canvas) {
        float min = Math.min(this.onBgStringLength + this.priceBackgroundPaddings, getMeasuredWidth());
        float measuredHeight = getMeasuredHeight();
        int i11 = this.priceBackgroundRadius;
        canvas.drawRoundRect(0.0f, 0.0f, min, measuredHeight, i11, i11, getPriceBackgroundPaint());
    }

    private final void drawText(Canvas canvas) {
        float textOffsetY = getTextOffsetY();
        int save = canvas.save();
        canvas.translate(0.0f, textOffsetY);
        try {
            StaticLayout staticLayout = this.staticLayout;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    private final PriceViewGradient dtoGradientToPriceViewGradient(PriceDTO.Gradient gradient) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, gradient.getStartColor());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context2, gradient.getEndColor());
            if (parseColor2 != null) {
                int intValue2 = parseColor2.intValue();
                PriceDTO.Gradient.Direction direction = gradient.getDirection();
                if (direction == null) {
                    direction = PriceDTO.Gradient.Direction.TOP_LEFT_BOTTOM_RIGHT;
                }
                return new PriceViewGradient(intValue, intValue2, toUniGradientsDirection(direction));
            }
        }
        return null;
    }

    private final Paint getCaptionPaint() {
        return (Paint) this.captionPaint.getValue();
    }

    private final BitmapDrawable getGradientDrawableFromPoolOrCreate(Drawable drawable, String str) {
        GradientBitmapDrawableData gradientBitmapDrawableData = this.bitmapDrawablePool.get(str);
        return (gradientBitmapDrawableData == null || !Intrinsics.d(gradientBitmapDrawableData.getGradient(), this.priceViewGradient)) ? toGradientBitmapDrawable(drawable, str) : gradientBitmapDrawableData.getBitmapDrawable();
    }

    private final Paint getIconPaint() {
        return (Paint) this.iconPaint.getValue();
    }

    private final Drawable getOrCreateDrawable(String icon) {
        if (!this.needUpdateIconDrawable) {
            return this.iconDrawable;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer iconResByToken = TokensExtKt.getIconResByToken(context, icon);
        Drawable a11 = iconResByToken != null ? C7232a.a(getContext(), iconResByToken.intValue()) : null;
        this.iconDrawable = a11;
        return a11;
    }

    private final Paint getOriginalPricePaint() {
        return (Paint) this.originalPricePaint.getValue();
    }

    private final Paint getPpuPaint() {
        return (Paint) this.ppuPaint.getValue();
    }

    private final Paint getPrefixPaint() {
        return (Paint) this.prefixPaint.getValue();
    }

    private final Paint getPriceBackgroundPaint() {
        return (Paint) this.priceBackgroundPaint.getValue();
    }

    private final Paint getPricePaint() {
        return (Paint) this.pricePaint.getValue();
    }

    private final int getTextAppearance(PriceDTO.Preset preset, PriceDTO.Component.TextStyle textStyle) {
        PriceTextAppearance textAppearance = preset.getSettings().getTextAppearance();
        int i11 = WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()];
        if (i11 == 1) {
            return textAppearance.getPrefixTextAppearanceResId();
        }
        if (i11 == 2) {
            return textAppearance.getPriceTextAppearanceResId();
        }
        if (i11 == 3) {
            return textAppearance.getPpuTextAppearanceResId();
        }
        if (i11 == 4) {
            return textAppearance.getCaptionTextAppearanceResId();
        }
        if (i11 == 5) {
            return textAppearance.getOriginalPriceTextAppearanceResId();
        }
        throw new o();
    }

    private final float getTextOffsetY() {
        if (this.atomHeightInPx > this.maxStringHeight) {
            return (r0 - r1) / 2.0f;
        }
        return 0.0f;
    }

    private final void insertBackgroundPadding(SpannableStringBuilder spannableStringBuilder, PriceDTO priceDTO) {
        int px = UiExtKt.toPx(PriceDTOKt.getPricePreset(priceDTO).getBgPaddings());
        applySpaceSpan$default(this, spannableStringBuilder, px, false, true, 2, null);
        this.priceBackgroundPaddings += px;
    }

    private final void insertComponent(SpannableStringBuilder spannableStringBuilder, int i11, PriceDTO priceDTO) {
        SpannableStringBuilder spannableStringBuilder2;
        PriceDTO priceDTO2;
        PriceDTO.Component component = priceDTO.getPrice().get(i11);
        boolean isComponentOnBg = isComponentOnBg(priceDTO, i11);
        if (isInvalid(component)) {
            return;
        }
        if (component.getText() == null || component.getTextStyle() == null) {
            spannableStringBuilder2 = spannableStringBuilder;
            priceDTO2 = priceDTO;
            if (component.getIcon() != null) {
                applyIconSpan(spannableStringBuilder2, component.getIcon(), component.getColor(), Intrinsics.d(component.getIsIconMulticolor(), Boolean.TRUE), priceDTO2, isComponentOnBg);
            }
        } else {
            spannableStringBuilder2 = spannableStringBuilder;
            priceDTO2 = priceDTO;
            applyTextSpan(spannableStringBuilder2, component.getText(), component.getColor(), component.getTextStyle(), priceDTO2, isComponentOnBg);
        }
        if (isComponentLastOnBg(priceDTO2, i11)) {
            insertBackgroundPadding(spannableStringBuilder2, priceDTO2);
        }
    }

    private final void insertComponentPadding(SpannableStringBuilder spannableStringBuilder, int i11, PriceDTO priceDTO) {
        applySpaceSpan$default(this, spannableStringBuilder, calculateComponentGap(priceDTO, i11), isComponentOnBg(priceDTO, i11), false, 4, null);
    }

    private final void insertSpaceBefore(SpannableStringBuilder spannableStringBuilder, int i11, PriceDTO priceDTO) {
        boolean isComponentOnBg = isComponentOnBg(priceDTO, i11);
        if (i11 != 0) {
            insertComponentPadding(spannableStringBuilder, i11, priceDTO);
        } else if (isComponentOnBg) {
            insertBackgroundPadding(spannableStringBuilder, priceDTO);
        }
    }

    private final boolean isComponentLastOnBg(PriceDTO priceDTO, int i11) {
        return (priceDTO.getBackgroundCapacity() != null && i11 == priceDTO.getBackgroundCapacity().intValue() - 1) || (isComponentOnBg(priceDTO, i11) && i11 == C7714v.P(priceDTO.getPrice()));
    }

    private final boolean isComponentOnBg(PriceDTO priceDTO, int i11) {
        return priceDTO.getBackgroundCapacity() != null && i11 < priceDTO.getBackgroundCapacity().intValue();
    }

    private final boolean isInvalid(PriceDTO.Component component) {
        return (component.getText() == null || component.getTextStyle() == null) && component.getIcon() == null;
    }

    private final boolean isSaleStyle(PriceDTO priceDTO) {
        return priceDTO.getPriceStyle().getStyleType() == PriceDTO.PriceStyle.StyleType.SALE_PRICE;
    }

    private final void reset(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
    }

    private final void resetPaint(Paint paint) {
        paint.setShader(null);
        paint.setXfermode(null);
        paint.setColor(-16777216);
    }

    private final void resetPaints() {
        resetPaint(getPrefixPaint());
        resetPaint(getPricePaint());
        resetPaint(getIconPaint());
        resetPaint(getPpuPaint());
        resetPaint(getCaptionPaint());
        resetPaint(getOriginalPricePaint());
    }

    private final void setAtomHeight(PriceDTO priceDTO) {
        this.atomHeightInPx = UiExtKt.toPx(priceDTO.getPreset().getSettings().getAtomHeight());
    }

    private final void setBackground(PriceDTO priceDTO) {
        if (priceDTO.getBackgroundCapacity() != null) {
            this.priceBackgroundRadius = UiExtKt.toPx(PriceDTOKt.getPricePreset(priceDTO).getBgCornerRadius());
            this.priceBackgroundHeight = this.requiredHeight;
            if (isSaleStyle(priceDTO)) {
                return;
            }
            Paint priceBackgroundPaint = getPriceBackgroundPaint();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            priceBackgroundPaint.setColor(ThemeExtKt.themeColor(context, StyleKt.getPriceStyleThemed(priceDTO.getPriceStyle().getStyleType()).getBackgroundColorAttr()));
        }
    }

    private final void setBackgroundGradient(PriceViewGradient gradient) {
        getPriceBackgroundPaint().setShader(gradient != null ? CommonPriceUtilsKt.getShaderByPriceViewGradient$default(gradient, 0.0f, 0.0f, this.requiredHeight, this.onBgStringLength + this.priceBackgroundPaddings, 6, null) : null);
    }

    private final void setCoordinates(ComponentConfig componentConfig, int i11, int i12) {
        ComponentConfig.TextComponent textComponent = componentConfig instanceof ComponentConfig.TextComponent ? (ComponentConfig.TextComponent) componentConfig : null;
        if (textComponent != null) {
            textComponent.setStartX(i11);
            textComponent.setEndX(i12);
        }
    }

    private final SpannableStringBuilder setFrom(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        return spannableStringBuilder.insert(0, charSequence);
    }

    private final void setGradient(PriceDTO priceDTO) {
        PriceViewGradient priceViewGradient;
        PriceViewGradient priceViewGradient2 = null;
        try {
            if (isSaleStyle(priceDTO)) {
                String gradientToken = priceDTO.getPriceStyle().getGradientToken();
                if (gradientToken != null && (priceViewGradient = tokenToPriceViewGradient(gradientToken)) != null) {
                    priceViewGradient2 = priceViewGradient;
                }
                PriceDTO.Gradient gradient = priceDTO.getPriceStyle().getGradient();
                PriceViewGradient dtoGradientToPriceViewGradient = gradient != null ? dtoGradientToPriceViewGradient(gradient) : null;
                priceViewGradient2 = dtoGradientToPriceViewGradient == null ? defaultViewGradient() : dtoGradientToPriceViewGradient;
            }
        } catch (Throwable unused) {
        }
        this.priceViewGradient = priceViewGradient2;
    }

    private final void setGradientShader(ComponentConfig componentConfig, CharSequence charSequence) {
        LinearGradient linearGradient;
        if (componentConfig instanceof ComponentConfig.TextComponent) {
            ComponentConfig.TextComponent textComponent = (ComponentConfig.TextComponent) componentConfig;
            if (textComponent.getCanDrawWithGradient()) {
                Paint paint = textComponent.getPaint();
                PriceViewGradient priceViewGradient = this.priceViewGradient;
                if (priceViewGradient != null) {
                    this.textBoundsRect.setEmpty();
                    textComponent.getPaint().getTextBounds(charSequence.toString(), textComponent.getStartIndex(), textComponent.getEndIndex(), this.textBoundsRect);
                    float abs = Math.abs(this.textBoundsRect.height());
                    linearGradient = CommonPriceUtilsKt.getShaderByPriceViewGradient(priceViewGradient, getPriceBaseline() - abs, textComponent.getStartX(), abs, textComponent.getEndX() - textComponent.getStartX());
                } else {
                    linearGradient = null;
                }
                paint.setShader(linearGradient);
            }
        }
    }

    private final int textWidth(String text, int start, int end, Paint paint) {
        return (int) paint.measureText(text, start, end);
    }

    private final BitmapDrawable toGradientBitmapDrawable(Drawable drawable, String str) {
        Bitmap applyGradient = applyGradient(b.b(drawable, 0, 0, 7));
        Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, applyGradient);
        if (this.bitmapDrawablePool.size() == 2) {
            SortedMap<String, GradientBitmapDrawableData> sortedMap = this.bitmapDrawablePool;
            sortedMap.remove(sortedMap.lastKey());
        }
        this.bitmapDrawablePool.put(str, new GradientBitmapDrawableData(bitmapDrawable, this.priceViewGradient));
        return bitmapDrawable;
    }

    private final PriceViewGradient toPriceViewGradient(UniGradient uniGradient) {
        List<String> lightColorTokens;
        int i11;
        int i12;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context)) {
            List<String> darkColorTokens = uniGradient.getDarkColorTokens();
            lightColorTokens = (darkColorTokens == null || darkColorTokens.isEmpty()) ? uniGradient.getLightColorTokens() : uniGradient.getDarkColorTokens();
        } else {
            lightColorTokens = uniGradient.getLightColorTokens();
        }
        Integer gradientColorByToken = TokensExtKt.getGradientColorByToken(lightColorTokens != null ? (String) C7714v.K(lightColorTokens) : null);
        if (gradientColorByToken != null) {
            int intValue = gradientColorByToken.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i11 = ColorExtKt.toColorInt(intValue, context2);
        } else {
            i11 = this.bgSecondaryColor;
        }
        Integer gradientColorByToken2 = TokensExtKt.getGradientColorByToken(lightColorTokens != null ? (String) C7714v.X(lightColorTokens) : null);
        if (gradientColorByToken2 != null) {
            int intValue2 = gradientColorByToken2.intValue();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            i12 = ColorExtKt.toColorInt(intValue2, context3);
        } else {
            i12 = this.bgSecondaryColor;
        }
        GradientDirection gradientDirection = uniGradient.getGradientDirection();
        if (gradientDirection == null) {
            gradientDirection = GradientDirection.TOP_BOTTOM;
        }
        return new PriceViewGradient(i11, i12, gradientDirection);
    }

    private final GradientDirection toUniGradientsDirection(PriceDTO.Gradient.Direction direction) {
        switch (WhenMappings.$EnumSwitchMapping$1[direction.ordinal()]) {
            case 1:
                return GradientDirection.TOP_BOTTOM;
            case 2:
                return GradientDirection.BOTTOM_TOP;
            case 3:
                return GradientDirection.LEFT_RIGHT;
            case 4:
                return GradientDirection.RIGHT_LEFT;
            case 5:
                return GradientDirection.TL_BR;
            case 6:
                return GradientDirection.TR_BL;
            case 7:
                return GradientDirection.BR_TL;
            case 8:
                return GradientDirection.BL_TR;
            default:
                throw new o();
        }
    }

    private final PriceViewGradient tokenToPriceViewGradient(String str) {
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(str);
        if (gradientByToken == null) {
            return null;
        }
        return toPriceViewGradient(gradientByToken);
    }

    private final void truncate(SpannableStringBuilder spannableStringBuilder, int i11, int i12, ComponentConfig.TextComponent textComponent) {
        int endIndex;
        int measureText = (int) textComponent.getPaint().measureText("...");
        int length = textComponent.length(spannableStringBuilder);
        int i13 = textComponent.getIsOnBg() ? this.priceBackgroundPaddings / 2 : 0;
        int characterCountToRemove = characterCountToRemove(spannableStringBuilder, textComponent.getPaint(), textComponent.getStartIndex(), textComponent.getEndIndex(), Math.abs(i12 - (((length + i11) + measureText) + i13)));
        if (i11 + measureText + i13 <= i12) {
            spannableStringBuilder.insert(textComponent.getEndIndex() - characterCountToRemove, "...");
            endIndex = textComponent.getEndIndex() + 3;
        } else {
            endIndex = textComponent.getEndIndex();
        }
        clearFrom(this.measureStringBuilder, endIndex - characterCountToRemove);
    }

    public final int getPriceBaseline() {
        StaticLayout staticLayout = this.staticLayout;
        return (staticLayout != null ? staticLayout.getLineBaseline(0) : 0) + ((int) getTextOffsetY());
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.onBgStringLength > 0) {
            drawBackground(canvas);
        }
        drawText(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        reset(this.measureStringBuilder);
        setFrom(this.measureStringBuilder, this.stringBuilder);
        this.maxStringHeight = 0;
        this.onBgStringLength = 0;
        int size2 = this.componentConfigs.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            ComponentConfig componentConfig = this.componentConfigs.get(i11);
            int length = componentConfig.length(this.measureStringBuilder);
            this.maxStringHeight = Integer.max(this.maxStringHeight, componentConfig.height());
            boolean z11 = componentConfig instanceof ComponentConfig.SpaceComponent;
            int i13 = (z11 || !componentConfig.getIsOnBg()) ? 0 : this.priceBackgroundPaddings / 2;
            int i14 = length + i12;
            if (i14 + i13 > size) {
                if (componentConfig instanceof ComponentConfig.TextComponent) {
                    ComponentConfig.TextComponent textComponent = (ComponentConfig.TextComponent) componentConfig;
                    truncate(this.measureStringBuilder, i12, size, textComponent);
                    int measureText = (int) textComponent.getPaint().measureText(this.measureStringBuilder, textComponent.getStartIndex(), this.measureStringBuilder.length());
                    setCoordinates(componentConfig, i12, i12 + measureText);
                    if (measureText == 0) {
                        if (i11 == 0) {
                            this.staticLayout = createStaticLayout(this.stringBuilder, size);
                            setGradientShader(this.componentConfigs.get(0), this.stringBuilder);
                            setBackgroundGradient(this.priceViewGradient);
                            setMeasuredDimension(size, this.atomHeightInPx);
                            return;
                        }
                        ComponentConfig componentConfig2 = this.componentConfigs.get(i11 - 1);
                        clearFrom(this.measureStringBuilder, componentConfig2.getStartIndex());
                        int length2 = componentConfig2.length(this.measureStringBuilder);
                        i12 -= length2;
                        if (componentConfig2.getIsOnBg()) {
                            this.onBgStringLength -= length2;
                        }
                    }
                    i12 += measureText;
                    if (textComponent.getIsOnBg()) {
                        this.onBgStringLength += length;
                    }
                } else if ((z11 && !((ComponentConfig.SpaceComponent) componentConfig).getIsBgPadding()) || (componentConfig instanceof ComponentConfig.IconComponent)) {
                    clearFrom(this.measureStringBuilder, componentConfig.getStartIndex());
                }
                i12 += i13;
            } else {
                setCoordinates(componentConfig, i12, i14);
                if (componentConfig.getIsOnBg()) {
                    this.onBgStringLength += length;
                }
                i11++;
                i12 = i14;
            }
        }
        this.requiredHeight = Integer.max(this.atomHeightInPx, this.maxStringHeight);
        this.staticLayout = createStaticLayout(this.measureStringBuilder, i12);
        applyTextGradients(this.componentConfigs);
        setBackgroundGradient(this.priceViewGradient);
        setMeasuredDimension(i12, this.requiredHeight);
    }

    public final void setContent(@NotNull PriceDTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.d(this.cachedData, data)) {
            return;
        }
        checkPaintStylesDiff(data);
        checkIconDiff(data);
        this.cachedData = data;
        setAtomHeight(data);
        setGradient(data);
        buildPriceContent(data);
        setBackground(data);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceLeftContentView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgSecondaryColor = a.getColor(context, R$color.bg_secondary);
        this.componentConfigs = new ArrayList();
        this.stringBuilder = new SpannableStringBuilder();
        this.measureStringBuilder = new SpannableStringBuilder();
        this.staticLayoutPaint = new TextPaint(1);
        this.textBoundsRect = new Rect();
        n nVar = n.NONE;
        this.priceBackgroundPaint = k.a(nVar, PriceLeftContentView$priceBackgroundPaint$2.INSTANCE);
        this.priceBackgroundRadius = UiExtKt.toPx(CornerRadius.NO_RADIUS.getPx());
        this.prefixPaint = k.a(nVar, PriceLeftContentView$prefixPaint$2.INSTANCE);
        this.pricePaint = k.a(nVar, PriceLeftContentView$pricePaint$2.INSTANCE);
        this.iconPaint = k.a(nVar, PriceLeftContentView$iconPaint$2.INSTANCE);
        this.ppuPaint = k.a(nVar, PriceLeftContentView$ppuPaint$2.INSTANCE);
        this.captionPaint = k.a(nVar, PriceLeftContentView$captionPaint$2.INSTANCE);
        this.originalPricePaint = k.a(nVar, PriceLeftContentView$originalPricePaint$2.INSTANCE);
        BitSet bitSet = new BitSet(PriceDTO.Component.TextStyle.getEntries().size());
        bitSet.set(0, bitSet.size(), true);
        this.paintDirtyMarkSet = bitSet;
        this.needUpdateIconDrawable = true;
        this.bitmapDrawablePool = U.q(new Pair[0]);
    }
}
