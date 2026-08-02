package ru.ozon.app.android.uikit.view.atoms.buttons.addtocart;

import Am.C2438a;
import Ek.a;
import Ij.C3261b;
import Sc.InterfaceC4008j;
import Sc.o;
import V.e;
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
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.TextPaintStyleParser;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$string;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 Ý\u00012\u00020\u00012\u00020\u0002:\u0002Ý\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010'\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\r¢\u0006\u0004\b,\u0010*J\u0019\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J+\u00103\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00101\u001a\u0004\u0018\u00010\u00072\u0006\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J#\u00105\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b7\u0010\u0013J\u0017\u00108\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u0010\u0013J\u001f\u0010;\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b=\u0010\u0013J\u001f\u0010?\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010>\u001a\u000209H\u0002¢\u0006\u0004\b?\u0010<J1\u0010C\u001a\u00020\r2\b\b\u0001\u0010>\u001a\u0002092\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u00162\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bE\u0010\u0013J\u0017\u0010F\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bF\u0010\u0013J\u0017\u0010G\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bG\u0010\u0013J\u000f\u0010H\u001a\u00020\rH\u0002¢\u0006\u0004\bH\u0010*J\u000f\u0010I\u001a\u00020\rH\u0002¢\u0006\u0004\bI\u0010*J\u000f\u0010J\u001a\u00020\rH\u0002¢\u0006\u0004\bJ\u0010*J\u000f\u0010K\u001a\u00020\rH\u0002¢\u0006\u0004\bK\u0010*J\u0017\u0010L\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\bN\u0010OJ\u001b\u0010Q\u001a\u0004\u0018\u00010-2\b\u0010P\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020 2\u0006\u0010S\u001a\u00020\u0007H\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u00020\r2\b\b\u0001\u0010V\u001a\u00020\u0007H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\u001cH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\\\u0010]J)\u0010b\u001a\u00020a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020^2\b\b\u0002\u0010`\u001a\u00020\u0007H\u0002¢\u0006\u0004\bb\u0010cJ)\u0010d\u001a\u00020a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020^2\b\b\u0002\u0010`\u001a\u00020\u0007H\u0002¢\u0006\u0004\bd\u0010cJ)\u0010g\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u00072\b\b\u0002\u0010f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bg\u0010hJ/\u0010l\u001a\u00020\r2\u0006\u0010i\u001a\u00020a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010j\u001a\u0002092\u0006\u0010k\u001a\u000209H\u0002¢\u0006\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010|\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010~\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010}R\u0015\u0010\u007f\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010}R\u0016\u0010\u0082\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010}R\u0017\u0010\u0083\u0001\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0087\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010}R\u0016\u0010\u0088\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010}R\u0016\u0010\u0089\u0001\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010uR\u0018\u0010\u008a\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010uR\u0017\u0010\u008b\u0001\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0084\u0001R\u0017\u0010\u008c\u0001\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0080\u0001R\u0016\u0010\u008d\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010}R\u0016\u0010\u008e\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010}R\u0016\u0010\u008f\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010}R\u0016\u0010\u0090\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010}R \u0010\u0095\u0001\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u0098\u0001\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0092\u0001\u001a\u0006\b\u0097\u0001\u0010\u0094\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010\u009d\u0001\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0092\u0001\u001a\u0006\b\u009c\u0001\u0010\u0094\u0001R \u0010 \u0001\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0092\u0001\u001a\u0006\b\u009f\u0001\u0010\u0094\u0001R \u0010£\u0001\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0092\u0001\u001a\u0006\b¢\u0001\u0010\u0094\u0001R \u0010¦\u0001\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u0092\u0001\u001a\u0006\b¥\u0001\u0010\u0094\u0001R \u0010©\u0001\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0001\u0010\u0092\u0001\u001a\u0006\b¨\u0001\u0010\u0094\u0001R\u0019\u0010ª\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u009a\u0001R\u0017\u0010«\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010\u009a\u0001R\u0019\u0010¬\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u009a\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u009a\u0001R\u0017\u0010®\u0001\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010\u0080\u0001R\u0017\u0010¯\u0001\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010\u0080\u0001R\u0017\u0010°\u0001\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010\u0080\u0001R\u0018\u0010±\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b±\u0001\u0010oR\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010oR\u0016\u0010²\u0001\u001a\u0002098\u0002X\u0082D¢\u0006\u0007\n\u0005\b²\u0001\u0010}R\u0016\u0010³\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b³\u0001\u0010}R\u0018\u0010´\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010oR\u001b\u0010µ\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010·\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b·\u0001\u0010oR1\u0010¹\u0001\u001a\u00020\u00072\u0007\u0010¸\u0001\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b¹\u0001\u0010\u009a\u0001\u001a\u0006\bº\u0001\u0010\u0094\u0001\"\u0005\b»\u0001\u0010XR(\u0010¼\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¼\u0001\u0010\u009a\u0001\u001a\u0006\b½\u0001\u0010\u0094\u0001\"\u0005\b¾\u0001\u0010XR(\u0010¿\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¿\u0001\u0010\u009a\u0001\u001a\u0006\bÀ\u0001\u0010\u0094\u0001\"\u0005\bÁ\u0001\u0010XR1\u0010Â\u0001\u001a\u00020\u00072\u0007\u0010¸\u0001\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bÂ\u0001\u0010\u009a\u0001\u001a\u0006\bÃ\u0001\u0010\u0094\u0001\"\u0005\bÄ\u0001\u0010XR,\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010Í\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010\u0094\u0001R\u0017\u0010Ï\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010\u0094\u0001R\u0017\u0010Ñ\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010\u0094\u0001R\u0017\u0010Ó\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010\u0094\u0001R\u0017\u0010Ö\u0001\u001a\u0002098BX\u0082\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0017\u0010Ø\u0001\u001a\u0002098BX\u0082\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Õ\u0001R\u0017\u0010Ú\u0001\u001a\u0002098BX\u0082\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Õ\u0001R\u0017\u0010Ü\u0001\u001a\u0002098BX\u0082\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Õ\u0001¨\u0006Þ\u0001"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonWithQuantityView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "isEnabled", "isEnabledToCart", "(Z)V", "", "text", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "style", "", "buttonIconId", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;", "sellerIcon", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode;", "mode", "qtyIsDisabled", "bindToCartButton", "(Ljava/lang/CharSequence;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;ZLjava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode;Z)V", "onPlusClick", "()V", "onMinusClick", "onCartClick", "Landroid/graphics/drawable/Drawable;", "drawable", "setButtonDrawable", "(Landroid/graphics/drawable/Drawable;)V", "bgColor", "iconColor", "setCircleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;I)V", "updateIcons", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;)Z", "drawQuantityState", "drawPlusButton", "", RichContentDTO.ALIGN_CENTER, "drawQuantityText", "(Landroid/graphics/Canvas;F)V", "drawMinusButton", "left", "drawPlusMinusBackground", "isVerticalLine", "Landroid/graphics/Paint;", "paint", "drawSignByOrientation", "(FLandroid/graphics/Canvas;ZLandroid/graphics/Paint;)V", "drawToCartState", "drawToCartBackground", "drawToCartTextAndIconIfNeedIt", "hideButtonsShowToCart", "showButtonsHideToCart", "disablePlusButton", "enablePlusButton", "performToQuantityClick", "(Landroid/view/MotionEvent;)V", "applyToCartButtonStyle", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;)Z", "drawableId", "getDrawable", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "qty", "getQtyString", "(I)Ljava/lang/String;", "color", "setButtonColors", "(I)V", "newText", "setToCartText", "(Ljava/lang/CharSequence;)Z", "updateEnabledState", "(Z)Z", "Landroid/text/TextPaint;", "textPaint", "plannedTextSize", "Landroid/text/StaticLayout;", "createToCartTextStaticLayout", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)Landroid/text/StaticLayout;", "createQuantityTextStaticLayout", "measuredTextWidth", "newTextSize", "getSafeStaticLayoutWidth", "(III)I", "staticLayout", "dx", "dy", "drawByStaticLayout", "(Landroid/text/StaticLayout;Landroid/graphics/Canvas;FF)V", "shouldRequestLayout", "Z", "sizeMode", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode;", "buttonDrawable", "Landroid/graphics/drawable/Drawable;", "currentButtonDrawableId", "Ljava/lang/String;", "sellerIconDrawable", "currentSellerModel", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;", "Lru/ozon/app/android/uikit/utils/TextPaintStyleParser;", "textPaintStyleParser", "Lru/ozon/app/android/uikit/utils/TextPaintStyleParser;", "containerSize", "F", "buttonSize", "cicrlePaint", "Landroid/graphics/Paint;", "toCartCornerRadius", "minusPlusCornerRadius", "toCartTextPaint", "Landroid/text/TextPaint;", "toCartText", "Ljava/lang/CharSequence;", "toCartHorizontalPadding", "textPadding", "quantityTextFormat", "quantityText", "quantityTextPaint", "quantityButtonsBackgroundPaint", "minusPlusWidth", "minusPlusHeight", "minusPlusVerticalOffset", "minusPlusHorizontalOffset", "disabledToCartBackgroundColor$delegate", "LSc/j;", "getDisabledToCartBackgroundColor", "()I", "disabledToCartBackgroundColor", "disabledToCartTextColor$delegate", "getDisabledToCartTextColor", "disabledToCartTextColor", "toCartBackgroundColorPrimary", "I", "toCartBackgroundColorPrimaryExpress$delegate", "getToCartBackgroundColorPrimaryExpress", "toCartBackgroundColorPrimaryExpress", "toCartBackgroundColorPrimaryFresh$delegate", "getToCartBackgroundColorPrimaryFresh", "toCartBackgroundColorPrimaryFresh", "toCartBackgroundColorSecondary$delegate", "getToCartBackgroundColorSecondary", "toCartBackgroundColorSecondary", "buttonsEnableColorDefault$delegate", "getButtonsEnableColorDefault", "buttonsEnableColorDefault", "buttonsEnableColorFresh$delegate", "getButtonsEnableColorFresh", "buttonsEnableColorFresh", "buttonsEnableColor", "buttonsDisableColor", "enabledToCartBackgroundColor", "enabledToCartTextColor", "plusButtonPaint", "minusButtonPaint", "toCartBackgroundPaint", "isQuantityState", "yButtonStartPosition", "yButtonEndPosition", "isPlusButtonEnabled", "currentStyle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "currentIsEnabledToCartState", AppMeasurementSdk.ConditionalUserProperty.VALUE, "availableCount", "getAvailableCount", "setAvailableCount", "minCount", "getMinCount", "setMinCount", "changeStep", "getChangeStep", "setChangeStep", "count", "getCount", "setCount", "Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonWithQuantityListener;", "clickListener", "Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonWithQuantityListener;", "getClickListener", "()Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonWithQuantityListener;", "setClickListener", "(Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonWithQuantityListener;)V", "getDrawableWidthWithPadding", "drawableWidthWithPadding", "getTextOffset", "textOffset", "getSellerIconOffset", "sellerIconOffset", "getCrircleRadius", "crircleRadius", "getMinusStartXPosition", "()F", "minusStartXPosition", "getMinusEndXPosition", "minusEndXPosition", "getPlusStartXPosition", "plusStartXPosition", "getPlusEndXPosition", "plusEndXPosition", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddToCartButtonWithQuantityView extends View implements AtomView {
    private int availableCount;
    private Drawable buttonDrawable;
    private final float buttonSize;
    private final int buttonsDisableColor;
    private int buttonsEnableColor;

    /* renamed from: buttonsEnableColorDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonsEnableColorDefault;

    /* renamed from: buttonsEnableColorFresh$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonsEnableColorFresh;
    private int changeStep;

    @NotNull
    private final Paint cicrlePaint;
    private AddToCartButtonWithQuantityListener clickListener;
    private final float containerSize;
    private int count;
    private String currentButtonDrawableId;
    private boolean currentIsEnabledToCartState;
    private ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon currentSellerModel;
    private ButtonV3Atom.AddToCartAtom.AddToCartStyle currentStyle;

    /* renamed from: disabledToCartBackgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledToCartBackgroundColor;

    /* renamed from: disabledToCartTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j disabledToCartTextColor;
    private int enabledToCartBackgroundColor;
    private final int enabledToCartTextColor;
    private boolean isPlusButtonEnabled;
    private boolean isQuantityState;
    private int minCount;

    @NotNull
    private final Paint minusButtonPaint;
    private final float minusPlusCornerRadius;
    private final float minusPlusHeight;
    private final float minusPlusHorizontalOffset;
    private final float minusPlusVerticalOffset;
    private final float minusPlusWidth;

    @NotNull
    private final Paint plusButtonPaint;
    private boolean qtyIsDisabled;

    @NotNull
    private final Paint quantityButtonsBackgroundPaint;

    @NotNull
    private String quantityText;

    @NotNull
    private final String quantityTextFormat;

    @NotNull
    private final TextPaint quantityTextPaint;
    private Drawable sellerIconDrawable;
    private boolean shouldRequestLayout;

    @NotNull
    private ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode sizeMode;
    private final float textPadding;

    @NotNull
    private final TextPaintStyleParser textPaintStyleParser;
    private final int toCartBackgroundColorPrimary;

    /* renamed from: toCartBackgroundColorPrimaryExpress$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j toCartBackgroundColorPrimaryExpress;

    /* renamed from: toCartBackgroundColorPrimaryFresh$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j toCartBackgroundColorPrimaryFresh;

    /* renamed from: toCartBackgroundColorSecondary$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j toCartBackgroundColorSecondary;

    @NotNull
    private final Paint toCartBackgroundPaint;
    private final float toCartCornerRadius;
    private final float toCartHorizontalPadding;

    @NotNull
    private CharSequence toCartText;

    @NotNull
    private final TextPaint toCartTextPaint;
    private final float yButtonEndPosition;
    private final float yButtonStartPosition;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int SELLER_ICON_OFFSET = UiExtKt.toPx(6);
    private static final int IMAGE_PADDING = UiExtKt.toPx(4);
    private static final int IMAGE_SIZE = UiExtKt.toPx(20);
    private static final int sellerElipsizedOffset = UiExtKt.toPx(20);
    private static final int regularOffset = UiExtKt.toPx(8);
    private static final int WIDTH_140 = UiExtKt.toPx(140);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonWithQuantityView$Companion;", "", "<init>", "()V", "SELLER_ICON_OFFSET", "", "getSELLER_ICON_OFFSET", "()I", "CONTAINER_SIZE", "BUTTON_SIZE", "MINUS_PLUS_WIDTH", "MINUS_PLUS_HEIGHT", "MINUS_PLUS_VERTICAL_OFFSET", "MINUS_PLUS_HORIZONTAL_OFFSET", "TO_CART_HORIZONTAL_PADDING", "QUANTITY_TEXT_PADDING", "IMAGE_PADDING", "IMAGE_SIZE", "sellerElipsizedOffset", "regularOffset", "TO_CART_CORNER_RADIUS_ROUNDED", "TO_CART_CORNER_RADIUS", "MINUS_PLUS_CORNER_RADIUS", "WIDTH_140", "NON_FATAL_TAG", "", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSELLER_ICON_OFFSET() {
            return AddToCartButtonWithQuantityView.SELLER_ICON_OFFSET;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.values().length];
            try {
                iArr[ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_140.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonV3Atom.AddToCartAtom.AddToCartStyle.values().length];
            try {
                iArr2[ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_PRIMARY_EXPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_PRIMARY_FRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ AddToCartButtonWithQuantityView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final boolean applyToCartButtonStyle(ButtonV3Atom.AddToCartAtom.AddToCartStyle style) {
        int i11;
        if (this.currentStyle == style) {
            return false;
        }
        int i12 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$1[style.ordinal()];
        if (i12 == 1) {
            this.toCartBackgroundPaint.setColor(this.toCartBackgroundColorPrimary);
            this.enabledToCartBackgroundColor = this.toCartBackgroundColorPrimary;
            setButtonColors(getButtonsEnableColorDefault());
            i11 = R$style.SmallButton_Primary;
        } else if (i12 == 2) {
            this.toCartBackgroundPaint.setColor(getToCartBackgroundColorSecondary());
            this.enabledToCartBackgroundColor = getToCartBackgroundColorSecondary();
            setButtonColors(getButtonsEnableColorDefault());
            i11 = R$style.SmallButton_Secondary;
        } else if (i12 == 3) {
            this.toCartBackgroundPaint.setColor(getToCartBackgroundColorPrimaryExpress());
            this.enabledToCartBackgroundColor = getToCartBackgroundColorPrimaryExpress();
            setButtonColors(getButtonsEnableColorDefault());
            i11 = R$style.SmallButton_Primary_Express;
        } else if (i12 != 4) {
            this.toCartBackgroundPaint.setColor(this.toCartBackgroundColorPrimary);
            this.toCartTextPaint.setColor(this.enabledToCartTextColor);
            setButtonColors(getButtonsEnableColorDefault());
            i11 = R$style.SmallButton_Primary;
        } else {
            this.toCartBackgroundPaint.setColor(getToCartBackgroundColorPrimaryFresh());
            this.enabledToCartBackgroundColor = getToCartBackgroundColorPrimaryFresh();
            setButtonColors(getButtonsEnableColorFresh());
            i11 = R$style.SmallButton_Primary_Fresh;
        }
        TextPaintStyleParser.applyStyle$default(this.textPaintStyleParser, this.toCartTextPaint, i11, null, 4, null);
        this.currentStyle = style;
        return true;
    }

    private final StaticLayout createQuantityTextStaticLayout(CharSequence text, TextPaint textPaint, int plannedTextSize) {
        float f7 = 2;
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, getSafeStaticLayoutWidth(plannedTextSize, (int) textPaint.measureText(text.toString()), C6915b.c(((getMeasuredWidth() - (this.buttonSize * f7)) - getSellerIconOffset()) - (this.textPadding * f7)))).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    static /* synthetic */ StaticLayout createQuantityTextStaticLayout$default(AddToCartButtonWithQuantityView addToCartButtonWithQuantityView, CharSequence charSequence, TextPaint textPaint, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return addToCartButtonWithQuantityView.createQuantityTextStaticLayout(charSequence, textPaint, i11);
    }

    private final StaticLayout createToCartTextStaticLayout(CharSequence text, TextPaint textPaint, int plannedTextSize) {
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, getSafeStaticLayoutWidth$default(this, plannedTextSize, (int) textPaint.measureText(text.toString()), 0, 4, null)).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void disablePlusButton() {
        this.isPlusButtonEnabled = false;
        this.plusButtonPaint.setColor(this.buttonsDisableColor);
        invalidate();
    }

    private final void drawByStaticLayout(StaticLayout staticLayout, Canvas canvas, float dx, float dy) {
        canvas.save();
        canvas.translate(dx, dy);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private final void drawMinusButton(Canvas canvas) {
        drawPlusMinusBackground(canvas, 0.0f);
        drawSignByOrientation(0.0f, canvas, false, this.minusButtonPaint);
    }

    private final void drawPlusButton(Canvas canvas) {
        float measuredWidth = (getMeasuredWidth() - this.buttonSize) - getSellerIconOffset();
        drawPlusMinusBackground(canvas, measuredWidth);
        drawSignByOrientation(measuredWidth, canvas, false, this.plusButtonPaint);
        drawSignByOrientation(measuredWidth, canvas, true, this.plusButtonPaint);
    }

    private final void drawPlusMinusBackground(Canvas canvas, float left) {
        float f7 = this.buttonSize;
        float f11 = this.toCartCornerRadius;
        canvas.drawRoundRect(left, 0.0f, left + f7, f7, f11, f11, this.quantityButtonsBackgroundPaint);
    }

    private final void drawQuantityState(Canvas canvas) {
        drawMinusButton(canvas);
        drawQuantityText(canvas, getMeasuredWidth() / 2);
        drawPlusButton(canvas);
    }

    private final void drawQuantityText(Canvas canvas, float center) {
        drawByStaticLayout(createQuantityTextStaticLayout$default(this, this.quantityText, this.quantityTextPaint, 0, 4, null), canvas, (center - (r1.getWidth() / 2)) - getSellerIconOffset(), (this.containerSize / 2.0f) - (r1.getHeight() / 2.0f));
    }

    private final void drawSignByOrientation(float left, Canvas canvas, boolean isVerticalLine, Paint paint) {
        if (isVerticalLine) {
            float f7 = left + this.minusPlusVerticalOffset;
            float f11 = this.minusPlusHorizontalOffset;
            float f12 = f7 + this.minusPlusHeight;
            float f13 = f11 + this.minusPlusWidth;
            float f14 = this.minusPlusCornerRadius;
            canvas.drawRoundRect(f7, f11, f12, f13, f14, f14, paint);
            return;
        }
        float f15 = left + this.minusPlusHorizontalOffset;
        float f16 = this.minusPlusVerticalOffset;
        float f17 = f15 + this.minusPlusWidth;
        float f18 = f16 + this.minusPlusHeight;
        float f19 = this.minusPlusCornerRadius;
        canvas.drawRoundRect(f15, f16, f17, f18, f19, f19, paint);
    }

    private final void drawToCartBackground(Canvas canvas) {
        float f7 = this.containerSize;
        float f11 = this.toCartCornerRadius;
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - getSellerIconOffset(), f7, f11, f11, this.toCartBackgroundPaint);
    }

    private final void drawToCartState(Canvas canvas) {
        drawToCartBackground(canvas);
        drawToCartTextAndIconIfNeedIt(canvas);
    }

    private final void drawToCartTextAndIconIfNeedIt(Canvas canvas) {
        StaticLayout createToCartTextStaticLayout = createToCartTextStaticLayout(this.toCartText, this.toCartTextPaint, (getWidth() - (getTextOffset() * 2)) - getDrawableWidthWithPadding());
        int width = ((getWidth() - (createToCartTextStaticLayout.getWidth() + getDrawableWidthWithPadding())) - getSellerIconOffset()) / 2;
        Drawable drawable = this.buttonDrawable;
        if (drawable != null) {
            float f7 = this.containerSize;
            float f11 = 2;
            drawable.setBounds(width, (int) ((f7 / f11) - (r7 / 2)), width + IMAGE_SIZE, (int) ((f7 / f11) + (r7 / 2)));
            drawable.draw(canvas);
        }
        drawByStaticLayout(createToCartTextStaticLayout, canvas, width + getDrawableWidthWithPadding(), (this.containerSize / 2.0f) - (createToCartTextStaticLayout.getHeight() / 2.0f));
        if (this.sellerIconDrawable == null || this.isQuantityState || !this.currentIsEnabledToCartState) {
            return;
        }
        canvas.drawCircle(getWidth() - getCrircleRadius(), this.containerSize - getSellerIconOffset(), getCrircleRadius(), this.cicrlePaint);
        Drawable drawable2 = this.sellerIconDrawable;
        if (drawable2 != null) {
            drawable2.setBounds((getWidth() - (getSellerIconOffset() * 2)) - getCrircleRadius(), (int) ((this.containerSize - getSellerIconOffset()) - getCrircleRadius()), (getWidth() + getCrircleRadius()) - (getSellerIconOffset() * 2), (int) ((this.containerSize + getCrircleRadius()) - getSellerIconOffset()));
            drawable2.draw(canvas);
        }
    }

    private final void enablePlusButton() {
        this.isPlusButtonEnabled = true;
        this.plusButtonPaint.setColor(this.buttonsEnableColor);
        invalidate();
    }

    private final int getButtonsEnableColorDefault() {
        return ((Number) this.buttonsEnableColorDefault.getValue()).intValue();
    }

    private final int getButtonsEnableColorFresh() {
        return ((Number) this.buttonsEnableColorFresh.getValue()).intValue();
    }

    private final int getCrircleRadius() {
        return getSellerIconOffset() * 2;
    }

    private final int getDisabledToCartBackgroundColor() {
        return ((Number) this.disabledToCartBackgroundColor.getValue()).intValue();
    }

    private final int getDisabledToCartTextColor() {
        return ((Number) this.disabledToCartTextColor.getValue()).intValue();
    }

    private final Drawable getDrawable(String drawableId) {
        if (drawableId == null) {
            return null;
        }
        try {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return ExtensionsKt.loadDrawableByName(context, drawableId);
        } catch (Exception unused) {
            return null;
        }
    }

    private final int getDrawableWidthWithPadding() {
        if (this.buttonDrawable == null) {
            return 0;
        }
        return IMAGE_SIZE + IMAGE_PADDING;
    }

    /* renamed from: getMinusEndXPosition, reason: from getter */
    private final float getButtonSize() {
        return this.buttonSize;
    }

    private final float getMinusStartXPosition() {
        return 0.0f;
    }

    private final float getPlusEndXPosition() {
        return getMeasuredWidth();
    }

    private final float getPlusStartXPosition() {
        return getMeasuredWidth() - this.buttonSize;
    }

    private final String getQtyString(int qty) {
        if (this.qtyIsDisabled) {
            return String.valueOf(qty);
        }
        return e.b(new Object[]{Integer.valueOf(qty)}, 1, this.quantityTextFormat, "format(...)");
    }

    private final int getSafeStaticLayoutWidth(int plannedTextSize, int measuredTextWidth, int newTextSize) {
        if (newTextSize <= 0) {
            newTextSize = plannedTextSize == 0 ? measuredTextWidth : Math.min(measuredTextWidth, plannedTextSize);
        }
        if (newTextSize >= 0) {
            return newTextSize;
        }
        int width = getWidth();
        int textOffset = getTextOffset();
        int drawableWidthWithPadding = getDrawableWidthWithPadding();
        StringBuilder a11 = C2438a.a("Invalid text width for static layout: measuredTextWidth=", measuredTextWidth, ", plannedTextSize=", ", width=", plannedTextSize);
        a.f(width, textOffset, ", textOffset=", ", drawableWidthWithPadding=", a11);
        a11.append(drawableWidthWithPadding);
        LoggerExtKt.sendNonFatal$default(null, a11.toString(), "AddToCartButtonWithQuantityView", null, 9, null);
        if (measuredTextWidth >= 0) {
            return measuredTextWidth;
        }
        if (getMeasuredWidth() > 0) {
            return getMeasuredWidth();
        }
        return 0;
    }

    static /* synthetic */ int getSafeStaticLayoutWidth$default(AddToCartButtonWithQuantityView addToCartButtonWithQuantityView, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        return addToCartButtonWithQuantityView.getSafeStaticLayoutWidth(i11, i12, i13);
    }

    private final int getSellerIconOffset() {
        if ((this.sellerIconDrawable == null && this.currentSellerModel == null) || this.sizeMode == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FIT) {
            return 0;
        }
        return SELLER_ICON_OFFSET;
    }

    private final int getTextOffset() {
        return (this.sellerIconDrawable == null || this.sizeMode == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FIT) ? regularOffset : sellerElipsizedOffset;
    }

    private final int getToCartBackgroundColorPrimaryExpress() {
        return ((Number) this.toCartBackgroundColorPrimaryExpress.getValue()).intValue();
    }

    private final int getToCartBackgroundColorPrimaryFresh() {
        return ((Number) this.toCartBackgroundColorPrimaryFresh.getValue()).intValue();
    }

    private final int getToCartBackgroundColorSecondary() {
        return ((Number) this.toCartBackgroundColorSecondary.getValue()).intValue();
    }

    private final void hideButtonsShowToCart() {
        this.isQuantityState = false;
        requestLayout();
        invalidate();
    }

    private final void performToQuantityClick(MotionEvent motionEvent) {
        AddToCartButtonWithQuantityListener addToCartButtonWithQuantityListener;
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        float plusStartXPosition = getPlusStartXPosition();
        if (x11 <= getPlusEndXPosition() && plusStartXPosition <= x11) {
            float f7 = this.yButtonStartPosition;
            if (y11 <= this.yButtonEndPosition && f7 <= y11 && this.isPlusButtonEnabled) {
                AddToCartButtonWithQuantityListener addToCartButtonWithQuantityListener2 = this.clickListener;
                if (addToCartButtonWithQuantityListener2 != null) {
                    addToCartButtonWithQuantityListener2.onPlusClick();
                    return;
                }
                return;
            }
        }
        float minusStartXPosition = getMinusStartXPosition();
        if (x11 > getButtonSize() || minusStartXPosition > x11) {
            return;
        }
        float f11 = this.yButtonStartPosition;
        if (y11 > this.yButtonEndPosition || f11 > y11 || (addToCartButtonWithQuantityListener = this.clickListener) == null) {
            return;
        }
        addToCartButtonWithQuantityListener.onMinusClick();
    }

    private final void setButtonColors(int color) {
        this.minusButtonPaint.setColor(color);
        this.buttonsEnableColor = color;
        if (this.isPlusButtonEnabled) {
            this.plusButtonPaint.setColor(color);
        }
    }

    private final void setButtonDrawable(Drawable drawable) {
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        this.buttonDrawable = mutate;
        if (mutate != null) {
            mutate.setTint(this.toCartTextPaint.getColor());
        }
    }

    private final void setCircleDrawable(Drawable drawable, Integer bgColor, int iconColor) {
        if (drawable == null || bgColor == null) {
            this.sellerIconDrawable = null;
            return;
        }
        this.cicrlePaint.setColor(bgColor.intValue());
        Drawable mutate = drawable.mutate();
        this.sellerIconDrawable = mutate;
        if (mutate != null) {
            mutate.setTint(iconColor);
        }
    }

    private final boolean setToCartText(CharSequence newText) {
        if (Intrinsics.d(this.toCartText, newText)) {
            return false;
        }
        this.toCartText = newText;
        return true;
    }

    private final void showButtonsHideToCart() {
        this.isQuantityState = true;
        requestLayout();
        invalidate();
    }

    private final boolean updateEnabledState(boolean isEnabled) {
        if (this.currentIsEnabledToCartState == isEnabled) {
            return false;
        }
        if (isEnabled) {
            this.toCartBackgroundPaint.setColor(this.enabledToCartBackgroundColor);
            this.toCartTextPaint.setColor(this.enabledToCartTextColor);
        } else {
            this.toCartBackgroundPaint.setColor(getDisabledToCartBackgroundColor());
            this.toCartTextPaint.setColor(getDisabledToCartTextColor());
        }
        Drawable drawable = this.buttonDrawable;
        if (drawable != null) {
            drawable.setTint(this.toCartTextPaint.getColor());
        }
        this.currentIsEnabledToCartState = isEnabled;
        return true;
    }

    private final boolean updateIcons(String buttonIconId, ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon sellerIcon) {
        boolean z11 = (buttonIconId == null && this.buttonDrawable == null && sellerIcon == null && this.sellerIconDrawable == null) ? false : true;
        this.currentButtonDrawableId = buttonIconId;
        setButtonDrawable(getDrawable(buttonIconId));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, sellerIcon != null ? sellerIcon.getTintColor() : null);
        int intValue = parseColor != null ? parseColor.intValue() : this.toCartBackgroundPaint.getColor();
        Drawable drawable = getDrawable(sellerIcon != null ? sellerIcon.getSellerIconId() : null);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setCircleDrawable(drawable, styleParser.parseColor(context2, sellerIcon != null ? sellerIcon.getSellerIconBgColor() : null), intValue);
        if (!Intrinsics.d(this.currentSellerModel, sellerIcon)) {
            this.shouldRequestLayout = true;
            this.currentSellerModel = sellerIcon;
        }
        return z11;
    }

    public final void bindToCartButton(@NotNull CharSequence text, ButtonV3Atom.AddToCartAtom.AddToCartStyle style, boolean isEnabled, String buttonIconId, ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon sellerIcon, @NotNull ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode mode, boolean qtyIsDisabled) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean toCartText = setToCartText(text);
        boolean applyToCartButtonStyle = applyToCartButtonStyle(style);
        boolean updateEnabledState = updateEnabledState(isEnabled);
        boolean updateIcons = updateIcons(buttonIconId, sellerIcon);
        this.qtyIsDisabled = qtyIsDisabled;
        if (this.sizeMode != mode) {
            this.sizeMode = mode;
            this.shouldRequestLayout = true;
        }
        if (toCartText || applyToCartButtonStyle || updateEnabledState || updateIcons) {
            invalidate();
        }
        if (this.shouldRequestLayout) {
            requestLayout();
            this.shouldRequestLayout = false;
        }
    }

    public final int getCount() {
        return this.count;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public final void isEnabledToCart(boolean isEnabled) {
        bindToCartButton(this.toCartText, this.currentStyle, isEnabled, this.currentButtonDrawableId, this.currentSellerModel, this.sizeMode, this.qtyIsDisabled);
    }

    public final void onCartClick() {
        setCount(this.count + this.minCount);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.isQuantityState) {
            drawQuantityState(canvas);
        } else {
            drawToCartState(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r2 > r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r2 > r1) goto L35;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int makeMeasureSpec;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((int) this.containerSize) + getSellerIconOffset(), 1073741824);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (this.isQuantityState) {
            float desiredWidth = Layout.getDesiredWidth(this.quantityText, this.quantityTextPaint);
            float f7 = this.buttonSize;
            float f11 = this.textPadding;
            int i11 = (int) (f7 + f11 + desiredWidth + f11 + f7);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    size += getSellerIconOffset();
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                }
                size = i11;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            } else {
                int i12 = WhenMappings.$EnumSwitchMapping$0[this.sizeMode.ordinal()];
                if (i12 == 1) {
                    i11 = WIDTH_140;
                } else if (i12 == 2) {
                    i11 = size + getSellerIconOffset();
                } else if (i12 != 3) {
                    throw new o();
                }
            }
        } else {
            float desiredWidth2 = Layout.getDesiredWidth(this.toCartText, this.toCartTextPaint);
            float f12 = this.toCartHorizontalPadding;
            int drawableWidthWithPadding = (int) (desiredWidth2 + f12 + f12 + getDrawableWidthWithPadding() + getSellerIconOffset());
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    size += getSellerIconOffset();
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                }
                size = drawableWidthWithPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            } else {
                int i13 = WhenMappings.$EnumSwitchMapping$0[this.sizeMode.ordinal()];
                if (i13 == 1) {
                    drawableWidthWithPadding = WIDTH_140;
                } else if (i13 == 2) {
                    drawableWidthWithPadding = size + getSellerIconOffset();
                } else if (i13 != 3) {
                    throw new o();
                }
            }
        }
        setMeasuredDimension(makeMeasureSpec, makeMeasureSpec2);
    }

    public final void onMinusClick() {
        int i11 = this.count;
        int i12 = this.changeStep;
        if (i11 - i12 < this.minCount) {
            setCount(0);
        } else {
            setCount(i11 - i12);
        }
    }

    public final void onPlusClick() {
        setCount(this.count + this.changeStep);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.currentIsEnabledToCartState && motionEvent.getAction() == 1) {
            if (this.isQuantityState) {
                performToQuantityClick(motionEvent);
            } else {
                AddToCartButtonWithQuantityListener addToCartButtonWithQuantityListener = this.clickListener;
                if (addToCartButtonWithQuantityListener != null) {
                    addToCartButtonWithQuantityListener.onCartClick();
                }
            }
        }
        return true;
    }

    public final void setAvailableCount(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.availableCount = i11;
    }

    public final void setChangeStep(int i11) {
        this.changeStep = i11;
    }

    public final void setClickListener(AddToCartButtonWithQuantityListener addToCartButtonWithQuantityListener) {
        this.clickListener = addToCartButtonWithQuantityListener;
    }

    public final void setCount(int i11) {
        if (i11 <= 0) {
            hideButtonsShowToCart();
            enablePlusButton();
            i11 = 0;
        } else if (this.changeStep + i11 > this.availableCount) {
            showButtonsHideToCart();
            disablePlusButton();
            this.quantityText = getQtyString(this.availableCount);
        } else {
            enablePlusButton();
            showButtonsHideToCart();
            this.quantityText = getQtyString(i11);
        }
        this.count = i11;
    }

    public final void setMinCount(int i11) {
        this.minCount = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonWithQuantityView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.sizeMode = ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FIT;
        TextPaintStyleParser textPaintStyleParser = new TextPaintStyleParser(context);
        this.textPaintStyleParser = textPaintStyleParser;
        this.containerSize = ResourceExtKt.toPxF(32, context);
        float pxF = ResourceExtKt.toPxF(32, context);
        this.buttonSize = pxF;
        Paint b11 = C3261b.b(1, -16777216);
        Paint.Style style = Paint.Style.FILL;
        b11.setStyle(style);
        this.cicrlePaint = b11;
        this.toCartCornerRadius = UniGlobalConfigKt.getRoundCornersFlag(context) ? ResourceExtKt.toPxF(99, context) : ResourceExtKt.toPxF(8, context);
        this.minusPlusCornerRadius = ResourceExtKt.toPxF(1, context);
        this.toCartTextPaint = new TextPaint(1);
        this.toCartText = "";
        this.toCartHorizontalPadding = ResourceExtKt.toPxF(12, context);
        this.textPadding = ResourceExtKt.toPxF(4, context);
        this.quantityTextFormat = StringProvider.getString(R$string.add_to_cart_with_quantity);
        this.quantityText = "";
        TextPaint textPaint = new TextPaint(1);
        this.quantityTextPaint = textPaint;
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        this.quantityButtonsBackgroundPaint = paint;
        this.minusPlusWidth = ResourceExtKt.toPxF(14, context);
        this.minusPlusHeight = ResourceExtKt.toPxF(2, context);
        this.minusPlusVerticalOffset = ResourceExtKt.toPxF(15, context);
        this.minusPlusHorizontalOffset = ResourceExtKt.toPxF(9, context);
        this.disabledToCartBackgroundColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonWithQuantityView$disabledToCartBackgroundColor$2(context));
        this.disabledToCartTextColor = LazyUtilsKt.unsafeLazy(new AddToCartButtonWithQuantityView$disabledToCartTextColor$2(context));
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgActionPrimary);
        this.toCartBackgroundColorPrimary = themeColor;
        this.toCartBackgroundColorPrimaryExpress = LazyUtilsKt.unsafeLazy(new AddToCartButtonWithQuantityView$toCartBackgroundColorPrimaryExpress$2(context));
        this.toCartBackgroundColorPrimaryFresh = LazyUtilsKt.unsafeLazy(new AddToCartButtonWithQuantityView$toCartBackgroundColorPrimaryFresh$2(context));
        this.toCartBackgroundColorSecondary = LazyUtilsKt.unsafeLazy(new AddToCartButtonWithQuantityView$toCartBackgroundColorSecondary$2(context));
        this.buttonsEnableColorDefault = LazyUtilsKt.unsafeLazy(new AddToCartButtonWithQuantityView$buttonsEnableColorDefault$2(context));
        this.buttonsEnableColorFresh = LazyUtilsKt.unsafeLazy(new AddToCartButtonWithQuantityView$buttonsEnableColorFresh$2(context));
        this.buttonsEnableColor = getButtonsEnableColorDefault();
        this.buttonsDisableColor = ThemeExtKt.themeColor(context, R$attr.textOriginalpriceAvailable);
        this.enabledToCartBackgroundColor = themeColor;
        this.enabledToCartTextColor = ResourceExtKt.color(context, R$color.o2_selector_color_text_for_button_primary);
        Paint paint2 = new Paint(1);
        paint2.setColor(this.buttonsEnableColor);
        this.plusButtonPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(this.buttonsEnableColor);
        this.minusButtonPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(this.enabledToCartBackgroundColor);
        paint4.setStyle(style);
        this.toCartBackgroundPaint = paint4;
        this.isQuantityState = true;
        this.yButtonEndPosition = pxF;
        this.isPlusButtonEnabled = true;
        this.currentIsEnabledToCartState = true;
        TextPaintStyleParser.applyStyle$default(textPaintStyleParser, textPaint, R$style.TextStyle_Body_M_Black, null, 4, null);
        setId(R$id.addToCartButton);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(false);
    }
}
