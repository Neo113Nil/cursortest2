package ru.ozon.fintech.features.cbottombase.models.widgets.v2;

import Ak.C2436a;
import B0.C2454a;
import B4.V;
import B90.C2616s;
import B90.C2619v;
import C.J;
import D3.h;
import D40.b;
import De.C2859b;
import De.C2860c;
import Ef0.c;
import G.g;
import GZ.e;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.fintech.exchanger.datapass.ComposerTrackingInfo;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.fintech.ui.input.InputView;
import t40.EnumC9751a;
import t40.EnumC9752b;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bF\n\u0002\u0010\u0000\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u00106\u001a\u000205\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u00109\u001a\u000208\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010>\u0012\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020@\u0018\u00010>¢\u0006\u0004\bB\u0010CJ\u001d\u0010H\u001a\u00020G2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u0006¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bT\u0010SJ\u0012\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bU\u0010SJ\u0012\u0010V\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bV\u0010SJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bW\u0010QJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bX\u0010QJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bY\u0010QJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bZ\u0010QJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0018\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0018\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b_\u0010^J\u0012\u0010`\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b`\u0010\\J\u0018\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\ba\u0010^J\u0018\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bb\u0010^J\u0012\u0010c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bc\u0010OJ\u0018\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bd\u0010^J\u0012\u0010e\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bg\u0010OJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bh\u0010QJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bi\u0010QJ\u0012\u0010j\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bj\u0010QJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bk\u0010QJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bl\u0010\\J\u0012\u0010m\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bm\u0010SJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bn\u0010OJ\u0010\u0010o\u001a\u00020&HÆ\u0003¢\u0006\u0004\bo\u0010pJ\u0010\u0010q\u001a\u00020(HÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0012\u0010s\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bs\u0010OJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bt\u0010OJ\u0012\u0010u\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bu\u0010OJ\u0010\u0010v\u001a\u00020-HÆ\u0003¢\u0006\u0004\bv\u0010wJ\u0010\u0010x\u001a\u00020/HÆ\u0003¢\u0006\u0004\bx\u0010yJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bz\u0010OJ\u0012\u0010{\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b{\u0010OJ\u0012\u0010|\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b|\u0010QJ\u0012\u0010}\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b}\u0010OJ\u0010\u0010~\u001a\u000205HÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010OJ\u0013\u0010\u0081\u0001\u001a\u000208HÆ\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010QJ\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010OJ\u0014\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010OJ\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010OJ!\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010>HÆ\u0003¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J!\u0010\u0089\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020@\u0018\u00010>HÆ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001Jù\u0004\u0010\u008a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010>2\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020@\u0018\u00010>HÆ\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0012\u0010\u008c\u0001\u001a\u00020\u0004HÖ\u0001¢\u0006\u0005\b\u008c\u0001\u0010OJ\u0012\u0010\u008d\u0001\u001a\u00020\u0006HÖ\u0001¢\u0006\u0005\b\u008d\u0001\u0010KJ\u001f\u0010\u0090\u0001\u001a\u00020\b2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001HÖ\u0003¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010MR\u001c\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010OR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010QR\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010SR\u001e\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u0098\u0001\u001a\u0005\b\u009a\u0001\u0010SR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u0098\u0001\u001a\u0005\b\u009b\u0001\u0010SR\u001e\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u0098\u0001\u001a\u0005\b\u009c\u0001\u0010SR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u0096\u0001\u001a\u0005\b\u009d\u0001\u0010QR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u0096\u0001\u001a\u0005\b\u009e\u0001\u0010QR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0096\u0001\u001a\u0005\b\u009f\u0001\u0010QR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u0096\u0001\u001a\u0005\b \u0001\u0010QR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010\\R$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010£\u0001\u001a\u0005\b¤\u0001\u0010^R$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010£\u0001\u001a\u0005\b¥\u0001\u0010^R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010¡\u0001\u001a\u0005\b¦\u0001\u0010\\R$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010£\u0001\u001a\u0005\b§\u0001\u0010^R$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010£\u0001\u001a\u0005\b¨\u0001\u0010^R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0094\u0001\u001a\u0005\b©\u0001\u0010OR$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010£\u0001\u001a\u0005\bª\u0001\u0010^R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010«\u0001\u001a\u0005\b¬\u0001\u0010fR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u0094\u0001\u001a\u0005\b\u00ad\u0001\u0010OR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u0096\u0001\u001a\u0005\b®\u0001\u0010QR\u001e\u0010 \u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b \u0010\u0096\u0001\u001a\u0005\b¯\u0001\u0010QR\u001e\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b!\u0010\u0096\u0001\u001a\u0005\b°\u0001\u0010QR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u0096\u0001\u001a\u0005\b±\u0001\u0010QR\u001e\u0010#\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b#\u0010¡\u0001\u001a\u0005\b²\u0001\u0010\\R\u001d\u0010$\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b$\u0010\u0098\u0001\u001a\u0004\b$\u0010SR\u001e\u0010%\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0094\u0001\u001a\u0005\b³\u0001\u0010OR\u001c\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010´\u0001\u001a\u0005\bµ\u0001\u0010pR\u001c\u0010)\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010¶\u0001\u001a\u0005\b·\u0001\u0010rR\u001e\u0010*\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u0094\u0001\u001a\u0005\b¸\u0001\u0010OR\u001e\u0010+\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010\u0094\u0001\u001a\u0005\b¹\u0001\u0010OR\u001e\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u0094\u0001\u001a\u0005\bº\u0001\u0010OR\u001c\u0010.\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010»\u0001\u001a\u0005\b¼\u0001\u0010wR\u001c\u00100\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010½\u0001\u001a\u0005\b¾\u0001\u0010yR\u001e\u00101\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010\u0094\u0001\u001a\u0005\b¿\u0001\u0010OR\u001e\u00102\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010\u0094\u0001\u001a\u0005\bÀ\u0001\u0010OR\u001e\u00103\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b3\u0010\u0096\u0001\u001a\u0005\bÁ\u0001\u0010QR\u001e\u00104\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010\u0094\u0001\u001a\u0005\bÂ\u0001\u0010OR\u001c\u00106\u001a\u0002058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b6\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010\u007fR\u001e\u00107\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b7\u0010\u0094\u0001\u001a\u0005\bÅ\u0001\u0010OR\u001d\u00109\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b9\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010\u0082\u0001R\u001e\u0010:\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b:\u0010\u0096\u0001\u001a\u0005\bÈ\u0001\u0010QR\u001e\u0010;\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b;\u0010\u0094\u0001\u001a\u0005\bÉ\u0001\u0010OR\u001e\u0010<\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b<\u0010\u0094\u0001\u001a\u0005\bÊ\u0001\u0010OR\u001e\u0010=\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b=\u0010\u0094\u0001\u001a\u0005\bË\u0001\u0010OR+\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010>8\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b?\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010\u0088\u0001R+\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020@\u0018\u00010>8\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bA\u0010Ì\u0001\u001a\u0006\bÎ\u0001\u0010\u0088\u0001¨\u0006Ï\u0001"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinInputDTO;", "LF40/a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "type", "", "id", "", "version", "", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "", "percentW", "", "margins", "Lt40/b;", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "Lt40/a;", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "alpha", "isHidden", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/fintech/ui/input/InputView$Size;", "size", "Lru/ozon/fintech/ui/input/InputView$Theme;", "theme", HammersV3BodyDTO.PLACEHOLDER, "caption", "captionColor", "Lru/ozon/fintech/ui/input/InputView$Status;", "status", "Lru/ozon/fintech/ui/input/InputView$State;", "state", "firstIcon", "secondIcon", "maxLength", "label", "Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "labelPosition", "inputMask", "Lru/ozon/fintech/ui/input/InputView$InputMode;", "inputMode", "versionStamp", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Size;Lru/ozon/fintech/ui/input/InputView$Theme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Status;Lru/ozon/fintech/ui/input/InputView$State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$LabelPosition;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$InputMode;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Float;", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lt40/a;", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "()Lru/ozon/fintech/ui/input/InputView$Size;", "component30", "()Lru/ozon/fintech/ui/input/InputView$Theme;", "component31", "component32", "component33", "component34", "()Lru/ozon/fintech/ui/input/InputView$Status;", "component35", "()Lru/ozon/fintech/ui/input/InputView$State;", "component36", "component37", "component38", "component39", "component40", "()Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "component41", "component42", "()Lru/ozon/fintech/ui/input/InputView$InputMode;", "component43", "component44", "component45", "component46", "component47", "()Ljava/util/Map;", "component48", "copy", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Size;Lru/ozon/fintech/ui/input/InputView$Theme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Status;Lru/ozon/fintech/ui/input/InputView$State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$LabelPosition;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$InputMode;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinInputDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getClickable", "getTouchDown", "getSkeletonable", "getDisableHighlightAnimation", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "Ljava/util/List;", "getMargins", "getLayoutGravity", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundColor", "getBackgroundGradient", "Lt40/a;", "getBackgroundGradientOrientation", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getAlpha", "getValue", "Lru/ozon/fintech/ui/input/InputView$Size;", "getSize", "Lru/ozon/fintech/ui/input/InputView$Theme;", "getTheme", "getPlaceholder", "getCaption", "getCaptionColor", "Lru/ozon/fintech/ui/input/InputView$Status;", "getStatus", "Lru/ozon/fintech/ui/input/InputView$State;", "getState", "getFirstIcon", "getSecondIcon", "getMaxLength", "getLabel", "Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "getLabelPosition", "getInputMask", "Lru/ozon/fintech/ui/input/InputView$InputMode;", "getInputMode", "getVersionStamp", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinInputDTO implements F40.a {

    @NotNull
    public static final Parcelable.Creator<FinInputDTO> CREATOR = new a();

    @i(name = "opacity")
    private final Float alpha;

    @i(name = "backgroundColor")
    private final String backgroundColor;

    @i(name = "backgroundGradient")
    private final List<String> backgroundGradient;

    @i(name = "backgroundGradientOrientation")
    private final EnumC9751a backgroundGradientOrientation;

    @i(name = "backgroundRadius")
    private final List<Integer> backgroundRadius;

    @i(name = "caption")
    private final String caption;

    @i(name = "captionColor")
    private final String captionColor;

    @i(name = "clickable")
    private final Boolean clickable;

    @i(name = "composerActionBehavior")
    private final String composerActionBehavior;

    @i(name = "composerActionId")
    private final String composerActionId;

    @i(name = "composerActionLink")
    private final String composerActionLink;

    @i(name = "composerActionParams")
    private final Map<String, String> composerActionParams;

    @i(name = "composerTrackingInfo")
    private final Map<String, ComposerTrackingInfo> composerTrackingInfo;

    @i(name = "dashGap")
    private final Integer dashGap;

    @i(name = "dashWidth")
    private final Integer dashWidth;

    @i(name = "disableHighlightAnimation")
    private final Boolean disableHighlightAnimation;

    @i(name = "elevation")
    private final Integer elevation;

    @i(name = "firstIcon")
    private final String firstIcon;

    @i(name = "height")
    private final Integer height;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "inputMask")
    private final String inputMask;

    @i(name = "inputMode")
    @NotNull
    private final InputView.InputMode inputMode;

    @i(name = "isHidden")
    private final Boolean isHidden;

    @i(name = "label")
    private final String label;

    @i(name = "labelPosition")
    @NotNull
    private final InputView.LabelPosition labelPosition;

    @i(name = "layoutGravity")
    private final List<EnumC9752b> layoutGravity;

    @i(name = "layoutWeight")
    private final Float layoutWeight;

    @i(name = "margins")
    private final List<Integer> margins;

    @i(name = "maxLength")
    private final Integer maxLength;

    @i(name = "paddings")
    private final List<Integer> paddings;

    @i(name = "percentW")
    private final Float percentW;

    @i(name = HammersV3BodyDTO.PLACEHOLDER)
    private final String placeholder;

    @i(name = "ratioH")
    private final Integer ratioH;

    @i(name = "ratioW")
    private final Integer ratioW;

    @i(name = "secondIcon")
    private final String secondIcon;

    @i(name = "size")
    @NotNull
    private final InputView.Size size;

    @i(name = "skeletonable")
    private final Boolean skeletonable;

    @i(name = "state")
    @NotNull
    private final InputView.State state;

    @i(name = "status")
    @NotNull
    private final InputView.Status status;

    @i(name = "strokeColor")
    private final String strokeColor;

    @i(name = "strokeWidth")
    private final Integer strokeWidth;

    @i(name = "theme")
    @NotNull
    private final InputView.Theme theme;

    @i(name = "touchDown")
    private final Boolean touchDown;

    @i(name = "type")
    @NotNull
    private final CbottomElement2 type;

    @i(name = AppMeasurementSdk.ConditionalUserProperty.VALUE)
    private final String value;

    @i(name = "version")
    private final Integer version;

    @i(name = "versionStamp")
    private final Integer versionStamp;

    @i(name = "width")
    private final Integer width;

    public static final class a implements Parcelable.Creator<FinInputDTO> {
        @Override // android.os.Parcelable.Creator
        public final FinInputDTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            Parcel parcel2 = parcel;
            CbottomElement2 c11 = b.c("parcel", parcel2);
            String readString = parcel2.readString();
            Integer valueOf = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Boolean valueOf2 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Boolean valueOf3 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Boolean valueOf4 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Boolean valueOf5 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Integer valueOf6 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf7 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf8 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf9 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Float valueOf10 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
            if (parcel2.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel2.readInt();
                ArrayList arrayList5 = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11 = Sh.a.a(parcel2, arrayList5, i11, 1)) {
                }
                arrayList = arrayList5;
            }
            if (parcel2.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel2.readInt();
                ArrayList arrayList6 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12 = Ak.b.a(parcel2, arrayList6, i12, 1)) {
                }
                arrayList2 = arrayList6;
            }
            Float valueOf11 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
            if (parcel2.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel2.readInt();
                ArrayList arrayList7 = new ArrayList(readInt3);
                for (int i13 = 0; i13 != readInt3; i13 = Sh.a.a(parcel2, arrayList7, i13, 1)) {
                }
                arrayList3 = arrayList7;
            }
            if (parcel2.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel2.readInt();
                ArrayList arrayList8 = new ArrayList(readInt4);
                for (int i14 = 0; i14 != readInt4; i14 = Sh.a.a(parcel2, arrayList8, i14, 1)) {
                }
                arrayList4 = arrayList8;
            }
            String readString2 = parcel2.readString();
            Boolean bool = valueOf3;
            Integer num = valueOf7;
            ArrayList arrayList9 = arrayList;
            ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
            EnumC9751a valueOf12 = parcel2.readInt() == 0 ? null : EnumC9751a.valueOf(parcel2.readString());
            Integer num2 = valueOf;
            Boolean bool2 = valueOf5;
            Integer num3 = valueOf9;
            Float f7 = valueOf11;
            String readString3 = parcel2.readString();
            Integer valueOf13 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf14 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf15 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf16 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Float valueOf17 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
            Boolean valueOf18 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            ArrayList arrayList10 = arrayList4;
            Integer num4 = valueOf14;
            String readString4 = parcel2.readString();
            InputView.Size valueOf19 = InputView.Size.valueOf(parcel2.readString());
            InputView.Theme valueOf20 = InputView.Theme.valueOf(parcel2.readString());
            Float f11 = valueOf17;
            String readString5 = parcel2.readString();
            Boolean bool3 = valueOf2;
            Integer num5 = valueOf6;
            Float f12 = valueOf10;
            ArrayList arrayList11 = arrayList3;
            Integer num6 = valueOf13;
            Boolean bool4 = valueOf18;
            String readString6 = parcel2.readString();
            Integer num7 = valueOf15;
            String readString7 = parcel2.readString();
            InputView.Status valueOf21 = InputView.Status.valueOf(parcel2.readString());
            InputView.State valueOf22 = InputView.State.valueOf(parcel2.readString());
            String readString8 = parcel2.readString();
            String readString9 = parcel2.readString();
            Integer valueOf23 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            String readString10 = parcel2.readString();
            InputView.LabelPosition valueOf24 = InputView.LabelPosition.valueOf(parcel2.readString());
            String readString11 = parcel2.readString();
            InputView.InputMode valueOf25 = InputView.InputMode.valueOf(parcel2.readString());
            Integer valueOf26 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            String readString12 = parcel2.readString();
            String readString13 = parcel2.readString();
            Boolean bool5 = valueOf4;
            Integer num8 = valueOf8;
            ArrayList arrayList12 = arrayList2;
            EnumC9751a enumC9751a = valueOf12;
            Integer num9 = valueOf16;
            Integer num10 = valueOf23;
            String readString14 = parcel2.readString();
            if (parcel2.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt5 = parcel2.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt5);
                for (int i15 = 0; i15 != readInt5; i15 = B6.b.a(parcel2, linkedHashMap3, parcel2.readString(), i15, 1)) {
                }
                linkedHashMap = linkedHashMap3;
            }
            if (parcel2.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt6 = parcel2.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt6);
                int i16 = 0;
                while (i16 != readInt6) {
                    i16 = C2859b.a(FinInputDTO.class, parcel2, linkedHashMap2, parcel2.readString(), i16, 1);
                    parcel2 = parcel;
                    readInt6 = readInt6;
                }
            }
            return new FinInputDTO(c11, readString, num2, bool3, bool, bool5, bool2, num5, num, num8, num3, f12, arrayList9, arrayList12, f7, arrayList11, arrayList10, readString2, createStringArrayList, enumC9751a, readString3, num6, num4, num7, num9, f11, bool4, readString4, valueOf19, valueOf20, readString5, readString6, readString7, valueOf21, valueOf22, readString8, readString9, num10, readString10, valueOf24, readString11, valueOf25, valueOf26, readString12, readString13, readString14, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final FinInputDTO[] newArray(int i11) {
            return new FinInputDTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinInputDTO(@NotNull CbottomElement2 type, @NotNull String id2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List<Integer> list, List<? extends EnumC9752b> list2, Float f11, List<Integer> list3, List<Integer> list4, String str, List<String> list5, EnumC9751a enumC9751a, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, String str3, @NotNull InputView.Size size, @NotNull InputView.Theme theme, String str4, String str5, String str6, @NotNull InputView.Status status, @NotNull InputView.State state, String str7, String str8, Integer num10, String str9, @NotNull InputView.LabelPosition labelPosition, String str10, @NotNull InputView.InputMode inputMode, Integer num11, String str11, String str12, String str13, Map<String, String> map, Map<String, ComposerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        this.type = type;
        this.id = id2;
        this.version = num;
        this.clickable = bool;
        this.touchDown = bool2;
        this.skeletonable = bool3;
        this.disableHighlightAnimation = bool4;
        this.width = num2;
        this.height = num3;
        this.ratioW = num4;
        this.ratioH = num5;
        this.percentW = f7;
        this.margins = list;
        this.layoutGravity = list2;
        this.layoutWeight = f11;
        this.paddings = list3;
        this.backgroundRadius = list4;
        this.backgroundColor = str;
        this.backgroundGradient = list5;
        this.backgroundGradientOrientation = enumC9751a;
        this.strokeColor = str2;
        this.strokeWidth = num6;
        this.dashWidth = num7;
        this.dashGap = num8;
        this.elevation = num9;
        this.alpha = f12;
        this.isHidden = bool5;
        this.value = str3;
        this.size = size;
        this.theme = theme;
        this.placeholder = str4;
        this.caption = str5;
        this.captionColor = str6;
        this.status = status;
        this.state = state;
        this.firstIcon = str7;
        this.secondIcon = str8;
        this.maxLength = num10;
        this.label = str9;
        this.labelPosition = labelPosition;
        this.inputMask = str10;
        this.inputMode = inputMode;
        this.versionStamp = num11;
        this.composerActionBehavior = str11;
        this.composerActionLink = str12;
        this.composerActionId = str13;
        this.composerActionParams = map;
        this.composerTrackingInfo = map2;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CbottomElement2 getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getRatioW() {
        return this.ratioW;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getRatioH() {
        return this.ratioH;
    }

    /* renamed from: component12, reason: from getter */
    public final Float getPercentW() {
        return this.percentW;
    }

    public final List<Integer> component13() {
        return this.margins;
    }

    public final List<EnumC9752b> component14() {
        return this.layoutGravity;
    }

    /* renamed from: component15, reason: from getter */
    public final Float getLayoutWeight() {
        return this.layoutWeight;
    }

    public final List<Integer> component16() {
        return this.paddings;
    }

    public final List<Integer> component17() {
        return this.backgroundRadius;
    }

    /* renamed from: component18, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<String> component19() {
        return this.backgroundGradient;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component20, reason: from getter */
    public final EnumC9751a getBackgroundGradientOrientation() {
        return this.backgroundGradientOrientation;
    }

    /* renamed from: component21, reason: from getter */
    public final String getStrokeColor() {
        return this.strokeColor;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: component23, reason: from getter */
    public final Integer getDashWidth() {
        return this.dashWidth;
    }

    /* renamed from: component24, reason: from getter */
    public final Integer getDashGap() {
        return this.dashGap;
    }

    /* renamed from: component25, reason: from getter */
    public final Integer getElevation() {
        return this.elevation;
    }

    /* renamed from: component26, reason: from getter */
    public final Float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component27, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: component28, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component29, reason: from getter */
    public final InputView.Size getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component30, reason: from getter */
    public final InputView.Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component31, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component32, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* renamed from: component33, reason: from getter */
    public final String getCaptionColor() {
        return this.captionColor;
    }

    @NotNull
    /* renamed from: component34, reason: from getter */
    public final InputView.Status getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component35, reason: from getter */
    public final InputView.State getState() {
        return this.state;
    }

    /* renamed from: component36, reason: from getter */
    public final String getFirstIcon() {
        return this.firstIcon;
    }

    /* renamed from: component37, reason: from getter */
    public final String getSecondIcon() {
        return this.secondIcon;
    }

    /* renamed from: component38, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component39, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getClickable() {
        return this.clickable;
    }

    @NotNull
    /* renamed from: component40, reason: from getter */
    public final InputView.LabelPosition getLabelPosition() {
        return this.labelPosition;
    }

    /* renamed from: component41, reason: from getter */
    public final String getInputMask() {
        return this.inputMask;
    }

    @NotNull
    /* renamed from: component42, reason: from getter */
    public final InputView.InputMode getInputMode() {
        return this.inputMode;
    }

    /* renamed from: component43, reason: from getter */
    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    /* renamed from: component44, reason: from getter */
    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    /* renamed from: component45, reason: from getter */
    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    /* renamed from: component46, reason: from getter */
    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final Map<String, String> component47() {
        return this.composerActionParams;
    }

    public final Map<String, ComposerTrackingInfo> component48() {
        return this.composerTrackingInfo;
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

    /* renamed from: component8, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    public final FinInputDTO copy(@NotNull CbottomElement2 type, @NotNull String id2, Integer version, Boolean clickable, Boolean touchDown, Boolean skeletonable, Boolean disableHighlightAnimation, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, List<Integer> margins, List<? extends EnumC9752b> layoutGravity, Float layoutWeight, List<Integer> paddings, List<Integer> backgroundRadius, String backgroundColor, List<String> backgroundGradient, EnumC9751a backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Float alpha, Boolean isHidden, String value, @NotNull InputView.Size size, @NotNull InputView.Theme theme, String placeholder, String caption, String captionColor, @NotNull InputView.Status status, @NotNull InputView.State state, String firstIcon, String secondIcon, Integer maxLength, String label, @NotNull InputView.LabelPosition labelPosition, String inputMask, @NotNull InputView.InputMode inputMode, Integer versionStamp, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        return new FinInputDTO(type, id2, version, clickable, touchDown, skeletonable, disableHighlightAnimation, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundColor, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, alpha, isHidden, value, size, theme, placeholder, caption, captionColor, status, state, firstIcon, secondIcon, maxLength, label, labelPosition, inputMask, inputMode, versionStamp, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinInputDTO)) {
            return false;
        }
        FinInputDTO finInputDTO = (FinInputDTO) other;
        return this.type == finInputDTO.type && Intrinsics.d(this.id, finInputDTO.id) && Intrinsics.d(this.version, finInputDTO.version) && Intrinsics.d(this.clickable, finInputDTO.clickable) && Intrinsics.d(this.touchDown, finInputDTO.touchDown) && Intrinsics.d(this.skeletonable, finInputDTO.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, finInputDTO.disableHighlightAnimation) && Intrinsics.d(this.width, finInputDTO.width) && Intrinsics.d(this.height, finInputDTO.height) && Intrinsics.d(this.ratioW, finInputDTO.ratioW) && Intrinsics.d(this.ratioH, finInputDTO.ratioH) && Intrinsics.d(this.percentW, finInputDTO.percentW) && Intrinsics.d(this.margins, finInputDTO.margins) && Intrinsics.d(this.layoutGravity, finInputDTO.layoutGravity) && Intrinsics.d(this.layoutWeight, finInputDTO.layoutWeight) && Intrinsics.d(this.paddings, finInputDTO.paddings) && Intrinsics.d(this.backgroundRadius, finInputDTO.backgroundRadius) && Intrinsics.d(this.backgroundColor, finInputDTO.backgroundColor) && Intrinsics.d(this.backgroundGradient, finInputDTO.backgroundGradient) && this.backgroundGradientOrientation == finInputDTO.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, finInputDTO.strokeColor) && Intrinsics.d(this.strokeWidth, finInputDTO.strokeWidth) && Intrinsics.d(this.dashWidth, finInputDTO.dashWidth) && Intrinsics.d(this.dashGap, finInputDTO.dashGap) && Intrinsics.d(this.elevation, finInputDTO.elevation) && Intrinsics.d(this.alpha, finInputDTO.alpha) && Intrinsics.d(this.isHidden, finInputDTO.isHidden) && Intrinsics.d(this.value, finInputDTO.value) && this.size == finInputDTO.size && this.theme == finInputDTO.theme && Intrinsics.d(this.placeholder, finInputDTO.placeholder) && Intrinsics.d(this.caption, finInputDTO.caption) && Intrinsics.d(this.captionColor, finInputDTO.captionColor) && this.status == finInputDTO.status && this.state == finInputDTO.state && Intrinsics.d(this.firstIcon, finInputDTO.firstIcon) && Intrinsics.d(this.secondIcon, finInputDTO.secondIcon) && Intrinsics.d(this.maxLength, finInputDTO.maxLength) && Intrinsics.d(this.label, finInputDTO.label) && this.labelPosition == finInputDTO.labelPosition && Intrinsics.d(this.inputMask, finInputDTO.inputMask) && this.inputMode == finInputDTO.inputMode && Intrinsics.d(this.versionStamp, finInputDTO.versionStamp) && Intrinsics.d(this.composerActionBehavior, finInputDTO.composerActionBehavior) && Intrinsics.d(this.composerActionLink, finInputDTO.composerActionLink) && Intrinsics.d(this.composerActionId, finInputDTO.composerActionId) && Intrinsics.d(this.composerActionParams, finInputDTO.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, finInputDTO.composerTrackingInfo);
    }

    @Override // F40.a
    public Float getAlpha() {
        return this.alpha;
    }

    @Override // F40.a
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // F40.a
    public List<String> getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @Override // F40.a
    public EnumC9751a getBackgroundGradientOrientation() {
        return this.backgroundGradientOrientation;
    }

    @Override // F40.a
    public List<Integer> getBackgroundRadius() {
        return this.backgroundRadius;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getCaptionColor() {
        return this.captionColor;
    }

    @Override // F40.a
    public Boolean getClickable() {
        return this.clickable;
    }

    @Override // F40.a
    public String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    @Override // F40.a
    public String getComposerActionId() {
        return this.composerActionId;
    }

    @Override // F40.a
    public String getComposerActionLink() {
        return this.composerActionLink;
    }

    @Override // F40.a
    public Map<String, String> getComposerActionParams() {
        return this.composerActionParams;
    }

    @Override // F40.a
    public Map<String, ComposerTrackingInfo> getComposerTrackingInfo() {
        return this.composerTrackingInfo;
    }

    @Override // F40.a
    public Integer getDashGap() {
        return this.dashGap;
    }

    @Override // F40.a
    public Integer getDashWidth() {
        return this.dashWidth;
    }

    @Override // F40.a
    public Boolean getDisableHighlightAnimation() {
        return this.disableHighlightAnimation;
    }

    @Override // F40.a
    public Integer getElevation() {
        return this.elevation;
    }

    public final String getFirstIcon() {
        return this.firstIcon;
    }

    @Override // F40.a
    public Integer getHeight() {
        return this.height;
    }

    @Override // F40.a
    @NotNull
    public String getId() {
        return this.id;
    }

    public final String getInputMask() {
        return this.inputMask;
    }

    @NotNull
    public final InputView.InputMode getInputMode() {
        return this.inputMode;
    }

    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final InputView.LabelPosition getLabelPosition() {
        return this.labelPosition;
    }

    @Override // F40.a
    public List<EnumC9752b> getLayoutGravity() {
        return this.layoutGravity;
    }

    @Override // F40.a
    public Float getLayoutWeight() {
        return this.layoutWeight;
    }

    @Override // F40.a
    public List<Integer> getMargins() {
        return this.margins;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @Override // F40.a
    public List<Integer> getPaddings() {
        return this.paddings;
    }

    @Override // F40.a
    public Float getPercentW() {
        return this.percentW;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Override // F40.a
    public Integer getRatioH() {
        return this.ratioH;
    }

    @Override // F40.a
    public Integer getRatioW() {
        return this.ratioW;
    }

    public final String getSecondIcon() {
        return this.secondIcon;
    }

    @NotNull
    public final InputView.Size getSize() {
        return this.size;
    }

    @Override // F40.a
    public Boolean getSkeletonable() {
        return this.skeletonable;
    }

    @NotNull
    public final InputView.State getState() {
        return this.state;
    }

    @NotNull
    public final InputView.Status getStatus() {
        return this.status;
    }

    @Override // F40.a
    public String getStrokeColor() {
        return this.strokeColor;
    }

    @Override // F40.a
    public Integer getStrokeWidth() {
        return this.strokeWidth;
    }

    @NotNull
    public final InputView.Theme getTheme() {
        return this.theme;
    }

    @Override // F40.a
    public Boolean getTouchDown() {
        return this.touchDown;
    }

    @Override // F40.a
    @NotNull
    public CbottomElement2 getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // F40.a
    public Integer getVersion() {
        return this.version;
    }

    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    @Override // F40.a
    public Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int a11 = g.a(this.type.hashCode() * 31, 31, this.id);
        Integer num = this.version;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.clickable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.touchDown;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.skeletonable;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.disableHighlightAnimation;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
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
        List<Integer> list = this.margins;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<EnumC9752b> list2 = this.layoutGravity;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Float f11 = this.layoutWeight;
        int hashCode13 = (hashCode12 + (f11 == null ? 0 : f11.hashCode())) * 31;
        List<Integer> list3 = this.paddings;
        int hashCode14 = (hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.backgroundRadius;
        int hashCode15 = (hashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode16 = (hashCode15 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list5 = this.backgroundGradient;
        int hashCode17 = (hashCode16 + (list5 == null ? 0 : list5.hashCode())) * 31;
        EnumC9751a enumC9751a = this.backgroundGradientOrientation;
        int hashCode18 = (hashCode17 + (enumC9751a == null ? 0 : enumC9751a.hashCode())) * 31;
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
        String str3 = this.value;
        int hashCode26 = (this.theme.hashCode() + ((this.size.hashCode() + ((hashCode25 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.placeholder;
        int hashCode27 = (hashCode26 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.caption;
        int hashCode28 = (hashCode27 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.captionColor;
        int hashCode29 = (this.state.hashCode() + ((this.status.hashCode() + ((hashCode28 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        String str7 = this.firstIcon;
        int hashCode30 = (hashCode29 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.secondIcon;
        int hashCode31 = (hashCode30 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num10 = this.maxLength;
        int hashCode32 = (hashCode31 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str9 = this.label;
        int hashCode33 = (this.labelPosition.hashCode() + ((hashCode32 + (str9 == null ? 0 : str9.hashCode())) * 31)) * 31;
        String str10 = this.inputMask;
        int hashCode34 = (this.inputMode.hashCode() + ((hashCode33 + (str10 == null ? 0 : str10.hashCode())) * 31)) * 31;
        Integer num11 = this.versionStamp;
        int hashCode35 = (hashCode34 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str11 = this.composerActionBehavior;
        int hashCode36 = (hashCode35 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.composerActionLink;
        int hashCode37 = (hashCode36 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.composerActionId;
        int hashCode38 = (hashCode37 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode39 = (hashCode38 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        return hashCode39 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // F40.a
    public Boolean isHidden() {
        return this.isHidden;
    }

    @NotNull
    public String toString() {
        CbottomElement2 cbottomElement2 = this.type;
        String str = this.id;
        Integer num = this.version;
        Boolean bool = this.clickable;
        Boolean bool2 = this.touchDown;
        Boolean bool3 = this.skeletonable;
        Boolean bool4 = this.disableHighlightAnimation;
        Integer num2 = this.width;
        Integer num3 = this.height;
        Integer num4 = this.ratioW;
        Integer num5 = this.ratioH;
        Float f7 = this.percentW;
        List<Integer> list = this.margins;
        List<EnumC9752b> list2 = this.layoutGravity;
        Float f11 = this.layoutWeight;
        List<Integer> list3 = this.paddings;
        List<Integer> list4 = this.backgroundRadius;
        String str2 = this.backgroundColor;
        List<String> list5 = this.backgroundGradient;
        EnumC9751a enumC9751a = this.backgroundGradientOrientation;
        String str3 = this.strokeColor;
        Integer num6 = this.strokeWidth;
        Integer num7 = this.dashWidth;
        Integer num8 = this.dashGap;
        Integer num9 = this.elevation;
        Float f12 = this.alpha;
        Boolean bool5 = this.isHidden;
        String str4 = this.value;
        InputView.Size size = this.size;
        InputView.Theme theme = this.theme;
        String str5 = this.placeholder;
        String str6 = this.caption;
        String str7 = this.captionColor;
        InputView.Status status = this.status;
        InputView.State state = this.state;
        String str8 = this.firstIcon;
        String str9 = this.secondIcon;
        Integer num10 = this.maxLength;
        String str10 = this.label;
        InputView.LabelPosition labelPosition = this.labelPosition;
        String str11 = this.inputMask;
        InputView.InputMode inputMode = this.inputMode;
        Integer num11 = this.versionStamp;
        String str12 = this.composerActionBehavior;
        String str13 = this.composerActionLink;
        String str14 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder f13 = D40.a.f("FinInputDTO(type=", cbottomElement2, ", id=", str, ", version=");
        C2860c.f(bool, num, ", clickable=", ", touchDown=", f13);
        h.h(f13, bool2, ", skeletonable=", bool3, ", disableHighlightAnimation=");
        e.d(bool4, num2, ", width=", ", height=", f13);
        c.e(f13, num3, ", ratioW=", num4, ", ratioH=");
        D40.c.d(f13, num5, ", percentW=", f7, ", margins=");
        C2616s.g(", layoutGravity=", ", layoutWeight=", f13, list, list2);
        C2436a.f(f13, f11, ", paddings=", list3, ", backgroundRadius=");
        Cm.e.i(", backgroundColor=", str2, ", backgroundGradient=", f13, list4);
        f13.append(list5);
        f13.append(", backgroundGradientOrientation=");
        f13.append(enumC9751a);
        f13.append(", strokeColor=");
        C2454a.f(num6, str3, ", strokeWidth=", ", dashWidth=", f13);
        c.e(f13, num7, ", dashGap=", num8, ", elevation=");
        D40.c.d(f13, num9, ", alpha=", f12, ", isHidden=");
        HY.b.c(bool5, ", value=", str4, ", size=", f13);
        f13.append(size);
        f13.append(", theme=");
        f13.append(theme);
        f13.append(", placeholder=");
        Nh.a.h(f13, str5, ", caption=", str6, ", captionColor=");
        f13.append(str7);
        f13.append(", status=");
        f13.append(status);
        f13.append(", state=");
        f13.append(state);
        f13.append(", firstIcon=");
        f13.append(str8);
        f13.append(", secondIcon=");
        C2454a.f(num10, str9, ", maxLength=", ", label=", f13);
        f13.append(str10);
        f13.append(", labelPosition=");
        f13.append(labelPosition);
        f13.append(", inputMask=");
        f13.append(str11);
        f13.append(", inputMode=");
        f13.append(inputMode);
        f13.append(", versionStamp=");
        V.f(num11, ", composerActionBehavior=", str12, ", composerActionLink=", f13);
        Nh.a.h(f13, str13, ", composerActionId=", str14, ", composerActionParams=");
        return V.c(f13, map, ", composerTrackingInfo=", map2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type.name());
        dest.writeString(this.id);
        Integer num = this.version;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        Boolean bool = this.clickable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool);
        }
        Boolean bool2 = this.touchDown;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool2);
        }
        Boolean bool3 = this.skeletonable;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool3);
        }
        Boolean bool4 = this.disableHighlightAnimation;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool4);
        }
        Integer num2 = this.width;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
        Integer num3 = this.height;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num3);
        }
        Integer num4 = this.ratioW;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num4);
        }
        Integer num5 = this.ratioH;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num5);
        }
        Float f7 = this.percentW;
        if (f7 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f7);
        }
        List<Integer> list = this.margins;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                dest.writeInt(((Number) c11.next()).intValue());
            }
        }
        List<EnumC9752b> list2 = this.layoutGravity;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator c12 = J.c(dest, 1, list2);
            while (c12.hasNext()) {
                dest.writeString(((EnumC9752b) c12.next()).name());
            }
        }
        Float f11 = this.layoutWeight;
        if (f11 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f11);
        }
        List<Integer> list3 = this.paddings;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator c13 = J.c(dest, 1, list3);
            while (c13.hasNext()) {
                dest.writeInt(((Number) c13.next()).intValue());
            }
        }
        List<Integer> list4 = this.backgroundRadius;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator c14 = J.c(dest, 1, list4);
            while (c14.hasNext()) {
                dest.writeInt(((Number) c14.next()).intValue());
            }
        }
        dest.writeString(this.backgroundColor);
        dest.writeStringList(this.backgroundGradient);
        EnumC9751a enumC9751a = this.backgroundGradientOrientation;
        if (enumC9751a == null) {
            dest.writeInt(0);
        } else {
            C2619v.e(dest, 1, enumC9751a);
        }
        dest.writeString(this.strokeColor);
        Integer num6 = this.strokeWidth;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num6);
        }
        Integer num7 = this.dashWidth;
        if (num7 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num7);
        }
        Integer num8 = this.dashGap;
        if (num8 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num8);
        }
        Integer num9 = this.elevation;
        if (num9 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num9);
        }
        Float f12 = this.alpha;
        if (f12 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f12);
        }
        Boolean bool5 = this.isHidden;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool5);
        }
        dest.writeString(this.value);
        dest.writeString(this.size.name());
        dest.writeString(this.theme.name());
        dest.writeString(this.placeholder);
        dest.writeString(this.caption);
        dest.writeString(this.captionColor);
        dest.writeString(this.status.name());
        dest.writeString(this.state.name());
        dest.writeString(this.firstIcon);
        dest.writeString(this.secondIcon);
        Integer num10 = this.maxLength;
        if (num10 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num10);
        }
        dest.writeString(this.label);
        dest.writeString(this.labelPosition.name());
        dest.writeString(this.inputMask);
        dest.writeString(this.inputMode.name());
        Integer num11 = this.versionStamp;
        if (num11 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num11);
        }
        dest.writeString(this.composerActionBehavior);
        dest.writeString(this.composerActionLink);
        dest.writeString(this.composerActionId);
        Map<String, String> map = this.composerActionParams;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        if (map2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e12 = J.e(map2, dest, 1);
        while (e12.hasNext()) {
            Map.Entry entry2 = (Map.Entry) e12.next();
            dest.writeString((String) entry2.getKey());
            dest.writeParcelable((Parcelable) entry2.getValue(), flags);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FinInputDTO(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2 r41, java.lang.String r42, java.lang.Integer r43, java.lang.Boolean r44, java.lang.Boolean r45, java.lang.Boolean r46, java.lang.Boolean r47, java.lang.Integer r48, java.lang.Integer r49, java.lang.Integer r50, java.lang.Integer r51, java.lang.Float r52, java.util.List r53, java.util.List r54, java.lang.Float r55, java.util.List r56, java.util.List r57, java.lang.String r58, java.util.List r59, t40.EnumC9751a r60, java.lang.String r61, java.lang.Integer r62, java.lang.Integer r63, java.lang.Integer r64, java.lang.Integer r65, java.lang.Float r66, java.lang.Boolean r67, java.lang.String r68, ru.ozon.fintech.ui.input.InputView.Size r69, ru.ozon.fintech.ui.input.InputView.Theme r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, ru.ozon.fintech.ui.input.InputView.Status r74, ru.ozon.fintech.ui.input.InputView.State r75, java.lang.String r76, java.lang.String r77, java.lang.Integer r78, java.lang.String r79, ru.ozon.fintech.ui.input.InputView.LabelPosition r80, java.lang.String r81, ru.ozon.fintech.ui.input.InputView.InputMode r82, java.lang.Integer r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.util.Map r87, java.util.Map r88, int r89, int r90, kotlin.jvm.internal.DefaultConstructorMarker r91) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinInputDTO.<init>(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.util.List, java.util.List, java.lang.Float, java.util.List, java.util.List, java.lang.String, java.util.List, t40.a, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Boolean, java.lang.String, ru.ozon.fintech.ui.input.InputView$Size, ru.ozon.fintech.ui.input.InputView$Theme, java.lang.String, java.lang.String, java.lang.String, ru.ozon.fintech.ui.input.InputView$Status, ru.ozon.fintech.ui.input.InputView$State, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, ru.ozon.fintech.ui.input.InputView$LabelPosition, java.lang.String, ru.ozon.fintech.ui.input.InputView$InputMode, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
