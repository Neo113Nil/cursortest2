package ru.ozon.fintech.features.cbottombase.models.widgets.v2;

import Ak.C2436a;
import B0.C2454a;
import B90.C2616s;
import B90.C2619v;
import Bk.C2638a;
import C.J;
import D3.h;
import D40.b;
import De.C2859b;
import De.C2860c;
import Ef0.c;
import G.g;
import I1.w;
import T7.P;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.fintech.exchanger.datapass.ComposerTrackingInfo;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import t40.EnumC9751a;
import t40.EnumC9752b;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\b\b\u0002\u0010&\u001a\u00020\u0006\u0012\b\b\u0002\u0010'\u001a\u00020\u0010\u0012\b\b\u0002\u0010(\u001a\u00020\u0010\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010/\u0012\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000201\u0018\u00010/¢\u0006\u0004\b3\u00104J\u001d\u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0006¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bE\u0010DJ\u0012\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bF\u0010DJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bG\u0010BJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bH\u0010BJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bI\u0010BJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010BJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0018\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bO\u0010NJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bP\u0010LJ\u0018\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bQ\u0010NJ\u0018\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bR\u0010NJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bS\u0010@J\u0018\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bT\u0010NJ\u0012\u0010U\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bW\u0010@J\u0012\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bX\u0010BJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bY\u0010BJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bZ\u0010BJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b[\u0010BJ\u0012\u0010\\\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\\\u0010DJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b]\u0010LJ\u0012\u0010^\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b^\u0010DJ\u0010\u0010_\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b_\u0010<J\u0010\u0010`\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b`\u0010<J\u0010\u0010a\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bc\u0010bJ\u0010\u0010d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bd\u0010@J\u0010\u0010e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\be\u0010@J\u0010\u0010f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bf\u0010@J\u0012\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bg\u0010@J\u0012\u0010h\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bh\u0010@J\u0012\u0010i\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bi\u0010@J\u001e\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u001e\u0010l\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000201\u0018\u00010/HÆ\u0003¢\u0006\u0004\bl\u0010kJ\u0088\u0004\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010/2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000201\u0018\u00010/HÆ\u0001¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bo\u0010@J\u0010\u0010p\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bp\u0010<J\u001a\u0010s\u001a\u00020\b2\b\u0010r\u001a\u0004\u0018\u00010qHÖ\u0003¢\u0006\u0004\bs\u0010tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010u\u001a\u0004\bv\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010w\u001a\u0004\bx\u0010@R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010y\u001a\u0004\bz\u0010BR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010{\u001a\u0004\b|\u0010DR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010{\u001a\u0004\b}\u0010DR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010{\u001a\u0004\b~\u0010DR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010y\u001a\u0004\b\u007f\u0010BR\u001d\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\r\u0010y\u001a\u0005\b\u0080\u0001\u0010BR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u000e\u0010y\u001a\u0005\b\u0081\u0001\u0010BR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u000f\u0010y\u001a\u0005\b\u0082\u0001\u0010BR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010LR$\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010NR$\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010\u0085\u0001\u001a\u0005\b\u0087\u0001\u0010NR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010\u0083\u0001\u001a\u0005\b\u0088\u0001\u0010LR$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u0085\u0001\u001a\u0005\b\u0089\u0001\u0010NR$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u0085\u0001\u001a\u0005\b\u008a\u0001\u0010NR\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0019\u0010w\u001a\u0005\b\u008b\u0001\u0010@R$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0085\u0001\u001a\u0005\b\u008c\u0001\u0010NR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010VR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001d\u0010w\u001a\u0005\b\u008f\u0001\u0010@R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001e\u0010y\u001a\u0005\b\u0090\u0001\u0010BR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001f\u0010y\u001a\u0005\b\u0091\u0001\u0010BR\u001d\u0010 \u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b \u0010y\u001a\u0005\b\u0092\u0001\u0010BR\u001d\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b!\u0010y\u001a\u0005\b\u0093\u0001\u0010BR\u001d\u0010\"\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\"\u0010{\u001a\u0005\b\u0094\u0001\u0010DR\u001e\u0010#\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0083\u0001\u001a\u0005\b\u0095\u0001\u0010LR\u001c\u0010$\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010{\u001a\u0004\b$\u0010DR\u001c\u0010%\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010<R\u001c\u0010&\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u0096\u0001\u001a\u0005\b\u0098\u0001\u0010<R\u001c\u0010'\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010bR\u001c\u0010(\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u0099\u0001\u001a\u0005\b\u009b\u0001\u0010bR\u001b\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b)\u0010w\u001a\u0005\b\u009c\u0001\u0010@R\u001b\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b*\u0010w\u001a\u0005\b\u009d\u0001\u0010@R\u001b\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b+\u0010w\u001a\u0005\b\u009e\u0001\u0010@R\u001d\u0010,\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b,\u0010w\u001a\u0005\b\u009f\u0001\u0010@R\u001d\u0010-\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b-\u0010w\u001a\u0005\b \u0001\u0010@R\u001d\u0010.\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b.\u0010w\u001a\u0005\b¡\u0001\u0010@R*\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010/8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b0\u0010¢\u0001\u001a\u0005\b£\u0001\u0010kR*\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000201\u0018\u00010/8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b2\u0010¢\u0001\u001a\u0005\b¤\u0001\u0010k¨\u0006¥\u0001"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/PinProgressDTO;", "LF40/a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "type", "", "id", "", "version", "", "clickable", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "", "percentW", "", "margins", "Lt40/b;", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "Lt40/a;", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "touchDown", "alpha", "isHidden", "selectedDot", "dotsCount", "dotRadius", "selectedRadius", "normalColor", "selectedColor", "errorColor", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Boolean;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/Float;", "component12", "()Ljava/util/List;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lt40/a;", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "()F", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "()Ljava/util/Map;", "component39", "copy", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Boolean;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/PinProgressDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getClickable", "getSkeletonable", "getDisableHighlightAnimation", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "Ljava/util/List;", "getMargins", "getLayoutGravity", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundColor", "getBackgroundGradient", "Lt40/a;", "getBackgroundGradientOrientation", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getTouchDown", "getAlpha", "I", "getSelectedDot", "getDotsCount", "F", "getDotRadius", "getSelectedRadius", "getNormalColor", "getSelectedColor", "getErrorColor", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PinProgressDTO implements F40.a {

    @NotNull
    public static final Parcelable.Creator<PinProgressDTO> CREATOR = new a();

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

    @i(name = "dotRadius")
    private final float dotRadius;

    @i(name = "dotsCount")
    private final int dotsCount;

    @i(name = "elevation")
    private final Integer elevation;

    @i(name = "errorColor")
    @NotNull
    private final String errorColor;

    @i(name = "height")
    private final Integer height;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "isHidden")
    private final Boolean isHidden;

    @i(name = "layoutGravity")
    private final List<EnumC9752b> layoutGravity;

    @i(name = "layoutWeight")
    private final Float layoutWeight;

    @i(name = "margins")
    private final List<Integer> margins;

    @i(name = "normalColor")
    @NotNull
    private final String normalColor;

    @i(name = "paddings")
    private final List<Integer> paddings;

    @i(name = "percentW")
    private final Float percentW;

    @i(name = "ratioH")
    private final Integer ratioH;

    @i(name = "ratioW")
    private final Integer ratioW;

    @i(name = "selectedColor")
    @NotNull
    private final String selectedColor;

    @i(name = "selectedDot")
    private final int selectedDot;

    @i(name = "selectedRadius")
    private final float selectedRadius;

    @i(name = "skeletonable")
    private final Boolean skeletonable;

    @i(name = "strokeColor")
    private final String strokeColor;

    @i(name = "strokeWidth")
    private final Integer strokeWidth;

    @i(name = "touchDown")
    private final Boolean touchDown;

    @i(name = "type")
    @NotNull
    private final CbottomElement2 type;

    @i(name = "version")
    private final Integer version;

    @i(name = "width")
    private final Integer width;

    public static final class a implements Parcelable.Creator<PinProgressDTO> {
        @Override // android.os.Parcelable.Creator
        public final PinProgressDTO createFromParcel(Parcel parcel) {
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
            Integer valueOf5 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf6 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf7 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf8 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Float valueOf9 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
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
            Float valueOf10 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
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
            Boolean bool = valueOf2;
            Integer num = valueOf6;
            ArrayList arrayList9 = arrayList;
            ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
            EnumC9751a valueOf11 = parcel2.readInt() == 0 ? null : EnumC9751a.valueOf(parcel2.readString());
            Boolean bool2 = valueOf4;
            Integer num2 = valueOf8;
            Float f7 = valueOf10;
            String readString3 = parcel2.readString();
            Integer valueOf12 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf13 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf14 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf15 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Boolean valueOf16 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Float valueOf17 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
            Boolean valueOf18 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Integer num3 = valueOf14;
            int readInt5 = parcel2.readInt();
            Boolean bool3 = valueOf3;
            Integer num4 = valueOf7;
            ArrayList arrayList10 = arrayList2;
            EnumC9751a enumC9751a = valueOf11;
            Integer num5 = valueOf15;
            int readInt6 = parcel2.readInt();
            Boolean bool4 = valueOf16;
            float readFloat = parcel2.readFloat();
            Integer num6 = valueOf;
            Integer num7 = valueOf5;
            Float f11 = valueOf9;
            ArrayList arrayList11 = arrayList3;
            Integer num8 = valueOf12;
            Float f12 = valueOf17;
            float readFloat2 = parcel2.readFloat();
            ArrayList arrayList12 = arrayList4;
            Integer num9 = valueOf13;
            Boolean bool5 = valueOf18;
            String readString4 = parcel2.readString();
            String readString5 = parcel2.readString();
            String readString6 = parcel2.readString();
            String readString7 = parcel2.readString();
            String readString8 = parcel2.readString();
            String readString9 = parcel2.readString();
            if (parcel2.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt7 = parcel2.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt7);
                for (int i15 = 0; i15 != readInt7; i15 = B6.b.a(parcel2, linkedHashMap3, parcel2.readString(), i15, 1)) {
                }
                linkedHashMap = linkedHashMap3;
            }
            if (parcel2.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt8 = parcel2.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt8);
                int i16 = 0;
                while (i16 != readInt8) {
                    i16 = C2859b.a(PinProgressDTO.class, parcel2, linkedHashMap2, parcel2.readString(), i16, 1);
                    parcel2 = parcel;
                    readInt8 = readInt8;
                }
            }
            return new PinProgressDTO(c11, readString, num6, bool, bool3, bool2, num7, num, num4, num2, f11, arrayList9, arrayList10, f7, arrayList11, arrayList12, readString2, createStringArrayList, enumC9751a, readString3, num8, num9, num3, num5, bool4, f12, bool5, readInt5, readInt6, readFloat, readFloat2, readString4, readString5, readString6, readString7, readString8, readString9, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final PinProgressDTO[] newArray(int i11) {
            return new PinProgressDTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PinProgressDTO(@NotNull CbottomElement2 type, @NotNull String id2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List<Integer> list, List<? extends EnumC9752b> list2, Float f11, List<Integer> list3, List<Integer> list4, String str, List<String> list5, EnumC9751a enumC9751a, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Boolean bool4, Float f12, Boolean bool5, int i11, int i12, float f13, float f14, @NotNull String normalColor, @NotNull String selectedColor, @NotNull String errorColor, String str3, String str4, String str5, Map<String, String> map, Map<String, ComposerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(normalColor, "normalColor");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        Intrinsics.checkNotNullParameter(errorColor, "errorColor");
        this.type = type;
        this.id = id2;
        this.version = num;
        this.clickable = bool;
        this.skeletonable = bool2;
        this.disableHighlightAnimation = bool3;
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
        this.touchDown = bool4;
        this.alpha = f12;
        this.isHidden = bool5;
        this.selectedDot = i11;
        this.dotsCount = i12;
        this.dotRadius = f13;
        this.selectedRadius = f14;
        this.normalColor = normalColor;
        this.selectedColor = selectedColor;
        this.errorColor = errorColor;
        this.composerActionBehavior = str3;
        this.composerActionLink = str4;
        this.composerActionId = str5;
        this.composerActionParams = map;
        this.composerTrackingInfo = map2;
    }

    public static /* synthetic */ PinProgressDTO copy$default(PinProgressDTO pinProgressDTO, CbottomElement2 cbottomElement2, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List list, List list2, Float f11, List list3, List list4, String str2, List list5, EnumC9751a enumC9751a, String str3, Integer num6, Integer num7, Integer num8, Integer num9, Boolean bool4, Float f12, Boolean bool5, int i11, int i12, float f13, float f14, String str4, String str5, String str6, String str7, String str8, String str9, Map map, Map map2, int i13, int i14, Object obj) {
        Map map3;
        Map map4;
        Integer num10;
        Integer num11;
        Boolean bool6;
        Float f15;
        Boolean bool7;
        int i15;
        int i16;
        float f16;
        float f17;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        List list6;
        Integer num12;
        Integer num13;
        Integer num14;
        Float f18;
        List list7;
        List list8;
        Float f19;
        List list9;
        String str16;
        List list10;
        EnumC9751a enumC9751a2;
        String str17;
        Integer num15;
        Integer num16;
        String str18;
        Integer num17;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Integer num18;
        CbottomElement2 cbottomElement22 = (i13 & 1) != 0 ? pinProgressDTO.type : cbottomElement2;
        String str19 = (i13 & 2) != 0 ? pinProgressDTO.id : str;
        Integer num19 = (i13 & 4) != 0 ? pinProgressDTO.version : num;
        Boolean bool11 = (i13 & 8) != 0 ? pinProgressDTO.clickable : bool;
        Boolean bool12 = (i13 & 16) != 0 ? pinProgressDTO.skeletonable : bool2;
        Boolean bool13 = (i13 & 32) != 0 ? pinProgressDTO.disableHighlightAnimation : bool3;
        Integer num20 = (i13 & 64) != 0 ? pinProgressDTO.width : num2;
        Integer num21 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? pinProgressDTO.height : num3;
        Integer num22 = (i13 & 256) != 0 ? pinProgressDTO.ratioW : num4;
        Integer num23 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? pinProgressDTO.ratioH : num5;
        Float f21 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? pinProgressDTO.percentW : f7;
        List list11 = (i13 & 2048) != 0 ? pinProgressDTO.margins : list;
        List list12 = (i13 & 4096) != 0 ? pinProgressDTO.layoutGravity : list2;
        Float f22 = (i13 & 8192) != 0 ? pinProgressDTO.layoutWeight : f11;
        CbottomElement2 cbottomElement23 = cbottomElement22;
        List list13 = (i13 & 16384) != 0 ? pinProgressDTO.paddings : list3;
        List list14 = (i13 & 32768) != 0 ? pinProgressDTO.backgroundRadius : list4;
        String str20 = (i13 & 65536) != 0 ? pinProgressDTO.backgroundColor : str2;
        List list15 = (i13 & 131072) != 0 ? pinProgressDTO.backgroundGradient : list5;
        EnumC9751a enumC9751a3 = (i13 & 262144) != 0 ? pinProgressDTO.backgroundGradientOrientation : enumC9751a;
        String str21 = (i13 & 524288) != 0 ? pinProgressDTO.strokeColor : str3;
        Integer num24 = (i13 & 1048576) != 0 ? pinProgressDTO.strokeWidth : num6;
        Integer num25 = (i13 & 2097152) != 0 ? pinProgressDTO.dashWidth : num7;
        Integer num26 = (i13 & 4194304) != 0 ? pinProgressDTO.dashGap : num8;
        Integer num27 = (i13 & 8388608) != 0 ? pinProgressDTO.elevation : num9;
        Boolean bool14 = (i13 & 16777216) != 0 ? pinProgressDTO.touchDown : bool4;
        Float f23 = (i13 & 33554432) != 0 ? pinProgressDTO.alpha : f12;
        Boolean bool15 = (i13 & 67108864) != 0 ? pinProgressDTO.isHidden : bool5;
        int i17 = (i13 & 134217728) != 0 ? pinProgressDTO.selectedDot : i11;
        int i18 = (i13 & 268435456) != 0 ? pinProgressDTO.dotsCount : i12;
        float f24 = (i13 & 536870912) != 0 ? pinProgressDTO.dotRadius : f13;
        float f25 = (i13 & 1073741824) != 0 ? pinProgressDTO.selectedRadius : f14;
        String str22 = (i13 & LinearLayoutManager.INVALID_OFFSET) != 0 ? pinProgressDTO.normalColor : str4;
        String str23 = (i14 & 1) != 0 ? pinProgressDTO.selectedColor : str5;
        String str24 = (i14 & 2) != 0 ? pinProgressDTO.errorColor : str6;
        String str25 = (i14 & 4) != 0 ? pinProgressDTO.composerActionBehavior : str7;
        String str26 = (i14 & 8) != 0 ? pinProgressDTO.composerActionLink : str8;
        String str27 = (i14 & 16) != 0 ? pinProgressDTO.composerActionId : str9;
        Map map5 = (i14 & 32) != 0 ? pinProgressDTO.composerActionParams : map;
        if ((i14 & 64) != 0) {
            map4 = map5;
            map3 = pinProgressDTO.composerTrackingInfo;
            num11 = num27;
            bool6 = bool14;
            f15 = f23;
            bool7 = bool15;
            i15 = i17;
            i16 = i18;
            f16 = f24;
            f17 = f25;
            str10 = str22;
            str11 = str23;
            str12 = str24;
            str13 = str25;
            str14 = str26;
            str15 = str27;
            list6 = list13;
            num13 = num22;
            num14 = num23;
            f18 = f21;
            list7 = list11;
            list8 = list12;
            f19 = f22;
            list9 = list14;
            str16 = str20;
            list10 = list15;
            enumC9751a2 = enumC9751a3;
            str17 = str21;
            num15 = num24;
            num16 = num25;
            num10 = num26;
            str18 = str19;
            num17 = num19;
            bool8 = bool11;
            bool9 = bool12;
            bool10 = bool13;
            num18 = num20;
            num12 = num21;
        } else {
            map3 = map2;
            map4 = map5;
            num10 = num26;
            num11 = num27;
            bool6 = bool14;
            f15 = f23;
            bool7 = bool15;
            i15 = i17;
            i16 = i18;
            f16 = f24;
            f17 = f25;
            str10 = str22;
            str11 = str23;
            str12 = str24;
            str13 = str25;
            str14 = str26;
            str15 = str27;
            list6 = list13;
            num12 = num21;
            num13 = num22;
            num14 = num23;
            f18 = f21;
            list7 = list11;
            list8 = list12;
            f19 = f22;
            list9 = list14;
            str16 = str20;
            list10 = list15;
            enumC9751a2 = enumC9751a3;
            str17 = str21;
            num15 = num24;
            num16 = num25;
            str18 = str19;
            num17 = num19;
            bool8 = bool11;
            bool9 = bool12;
            bool10 = bool13;
            num18 = num20;
        }
        return pinProgressDTO.copy(cbottomElement23, str18, num17, bool8, bool9, bool10, num18, num12, num13, num14, f18, list7, list8, f19, list6, list9, str16, list10, enumC9751a2, str17, num15, num16, num10, num11, bool6, f15, bool7, i15, i16, f16, f17, str10, str11, str12, str13, str14, str15, map4, map3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CbottomElement2 getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getRatioH() {
        return this.ratioH;
    }

    /* renamed from: component11, reason: from getter */
    public final Float getPercentW() {
        return this.percentW;
    }

    public final List<Integer> component12() {
        return this.margins;
    }

    public final List<EnumC9752b> component13() {
        return this.layoutGravity;
    }

    /* renamed from: component14, reason: from getter */
    public final Float getLayoutWeight() {
        return this.layoutWeight;
    }

    public final List<Integer> component15() {
        return this.paddings;
    }

    public final List<Integer> component16() {
        return this.backgroundRadius;
    }

    /* renamed from: component17, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<String> component18() {
        return this.backgroundGradient;
    }

    /* renamed from: component19, reason: from getter */
    public final EnumC9751a getBackgroundGradientOrientation() {
        return this.backgroundGradientOrientation;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component20, reason: from getter */
    public final String getStrokeColor() {
        return this.strokeColor;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getDashWidth() {
        return this.dashWidth;
    }

    /* renamed from: component23, reason: from getter */
    public final Integer getDashGap() {
        return this.dashGap;
    }

    /* renamed from: component24, reason: from getter */
    public final Integer getElevation() {
        return this.elevation;
    }

    /* renamed from: component25, reason: from getter */
    public final Boolean getTouchDown() {
        return this.touchDown;
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
    public final int getSelectedDot() {
        return this.selectedDot;
    }

    /* renamed from: component29, reason: from getter */
    public final int getDotsCount() {
        return this.dotsCount;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component30, reason: from getter */
    public final float getDotRadius() {
        return this.dotRadius;
    }

    /* renamed from: component31, reason: from getter */
    public final float getSelectedRadius() {
        return this.selectedRadius;
    }

    @NotNull
    /* renamed from: component32, reason: from getter */
    public final String getNormalColor() {
        return this.normalColor;
    }

    @NotNull
    /* renamed from: component33, reason: from getter */
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    @NotNull
    /* renamed from: component34, reason: from getter */
    public final String getErrorColor() {
        return this.errorColor;
    }

    /* renamed from: component35, reason: from getter */
    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    /* renamed from: component36, reason: from getter */
    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    /* renamed from: component37, reason: from getter */
    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final Map<String, String> component38() {
        return this.composerActionParams;
    }

    public final Map<String, ComposerTrackingInfo> component39() {
        return this.composerTrackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getClickable() {
        return this.clickable;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getSkeletonable() {
        return this.skeletonable;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getDisableHighlightAnimation() {
        return this.disableHighlightAnimation;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getRatioW() {
        return this.ratioW;
    }

    @NotNull
    public final PinProgressDTO copy(@NotNull CbottomElement2 type, @NotNull String id2, Integer version, Boolean clickable, Boolean skeletonable, Boolean disableHighlightAnimation, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, List<Integer> margins, List<? extends EnumC9752b> layoutGravity, Float layoutWeight, List<Integer> paddings, List<Integer> backgroundRadius, String backgroundColor, List<String> backgroundGradient, EnumC9751a backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Boolean touchDown, Float alpha, Boolean isHidden, int selectedDot, int dotsCount, float dotRadius, float selectedRadius, @NotNull String normalColor, @NotNull String selectedColor, @NotNull String errorColor, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(normalColor, "normalColor");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        Intrinsics.checkNotNullParameter(errorColor, "errorColor");
        return new PinProgressDTO(type, id2, version, clickable, skeletonable, disableHighlightAnimation, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundColor, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, touchDown, alpha, isHidden, selectedDot, dotsCount, dotRadius, selectedRadius, normalColor, selectedColor, errorColor, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinProgressDTO)) {
            return false;
        }
        PinProgressDTO pinProgressDTO = (PinProgressDTO) other;
        return this.type == pinProgressDTO.type && Intrinsics.d(this.id, pinProgressDTO.id) && Intrinsics.d(this.version, pinProgressDTO.version) && Intrinsics.d(this.clickable, pinProgressDTO.clickable) && Intrinsics.d(this.skeletonable, pinProgressDTO.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, pinProgressDTO.disableHighlightAnimation) && Intrinsics.d(this.width, pinProgressDTO.width) && Intrinsics.d(this.height, pinProgressDTO.height) && Intrinsics.d(this.ratioW, pinProgressDTO.ratioW) && Intrinsics.d(this.ratioH, pinProgressDTO.ratioH) && Intrinsics.d(this.percentW, pinProgressDTO.percentW) && Intrinsics.d(this.margins, pinProgressDTO.margins) && Intrinsics.d(this.layoutGravity, pinProgressDTO.layoutGravity) && Intrinsics.d(this.layoutWeight, pinProgressDTO.layoutWeight) && Intrinsics.d(this.paddings, pinProgressDTO.paddings) && Intrinsics.d(this.backgroundRadius, pinProgressDTO.backgroundRadius) && Intrinsics.d(this.backgroundColor, pinProgressDTO.backgroundColor) && Intrinsics.d(this.backgroundGradient, pinProgressDTO.backgroundGradient) && this.backgroundGradientOrientation == pinProgressDTO.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, pinProgressDTO.strokeColor) && Intrinsics.d(this.strokeWidth, pinProgressDTO.strokeWidth) && Intrinsics.d(this.dashWidth, pinProgressDTO.dashWidth) && Intrinsics.d(this.dashGap, pinProgressDTO.dashGap) && Intrinsics.d(this.elevation, pinProgressDTO.elevation) && Intrinsics.d(this.touchDown, pinProgressDTO.touchDown) && Intrinsics.d(this.alpha, pinProgressDTO.alpha) && Intrinsics.d(this.isHidden, pinProgressDTO.isHidden) && this.selectedDot == pinProgressDTO.selectedDot && this.dotsCount == pinProgressDTO.dotsCount && Float.compare(this.dotRadius, pinProgressDTO.dotRadius) == 0 && Float.compare(this.selectedRadius, pinProgressDTO.selectedRadius) == 0 && Intrinsics.d(this.normalColor, pinProgressDTO.normalColor) && Intrinsics.d(this.selectedColor, pinProgressDTO.selectedColor) && Intrinsics.d(this.errorColor, pinProgressDTO.errorColor) && Intrinsics.d(this.composerActionBehavior, pinProgressDTO.composerActionBehavior) && Intrinsics.d(this.composerActionLink, pinProgressDTO.composerActionLink) && Intrinsics.d(this.composerActionId, pinProgressDTO.composerActionId) && Intrinsics.d(this.composerActionParams, pinProgressDTO.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, pinProgressDTO.composerTrackingInfo);
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

    public final float getDotRadius() {
        return this.dotRadius;
    }

    public final int getDotsCount() {
        return this.dotsCount;
    }

    @Override // F40.a
    public Integer getElevation() {
        return this.elevation;
    }

    @NotNull
    public final String getErrorColor() {
        return this.errorColor;
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

    @NotNull
    public final String getNormalColor() {
        return this.normalColor;
    }

    @Override // F40.a
    public List<Integer> getPaddings() {
        return this.paddings;
    }

    @Override // F40.a
    public Float getPercentW() {
        return this.percentW;
    }

    @Override // F40.a
    public Integer getRatioH() {
        return this.ratioH;
    }

    @Override // F40.a
    public Integer getRatioW() {
        return this.ratioW;
    }

    @NotNull
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    public final int getSelectedDot() {
        return this.selectedDot;
    }

    public final float getSelectedRadius() {
        return this.selectedRadius;
    }

    @Override // F40.a
    public Boolean getSkeletonable() {
        return this.skeletonable;
    }

    @Override // F40.a
    public String getStrokeColor() {
        return this.strokeColor;
    }

    @Override // F40.a
    public Integer getStrokeWidth() {
        return this.strokeWidth;
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

    @Override // F40.a
    public Integer getVersion() {
        return this.version;
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
        Boolean bool2 = this.skeletonable;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.disableHighlightAnimation;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.ratioW;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.ratioH;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f7 = this.percentW;
        int hashCode9 = (hashCode8 + (f7 == null ? 0 : f7.hashCode())) * 31;
        List<Integer> list = this.margins;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<EnumC9752b> list2 = this.layoutGravity;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Float f11 = this.layoutWeight;
        int hashCode12 = (hashCode11 + (f11 == null ? 0 : f11.hashCode())) * 31;
        List<Integer> list3 = this.paddings;
        int hashCode13 = (hashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.backgroundRadius;
        int hashCode14 = (hashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode15 = (hashCode14 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list5 = this.backgroundGradient;
        int hashCode16 = (hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
        EnumC9751a enumC9751a = this.backgroundGradientOrientation;
        int hashCode17 = (hashCode16 + (enumC9751a == null ? 0 : enumC9751a.hashCode())) * 31;
        String str2 = this.strokeColor;
        int hashCode18 = (hashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num6 = this.strokeWidth;
        int hashCode19 = (hashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.dashWidth;
        int hashCode20 = (hashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.dashGap;
        int hashCode21 = (hashCode20 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.elevation;
        int hashCode22 = (hashCode21 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool4 = this.touchDown;
        int hashCode23 = (hashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Float f12 = this.alpha;
        int hashCode24 = (hashCode23 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Boolean bool5 = this.isHidden;
        int a12 = g.a(g.a(g.a(Pk0.b.a(this.selectedRadius, Pk0.b.a(this.dotRadius, C2454a.a(this.dotsCount, C2454a.a(this.selectedDot, (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31, 31), 31), 31), 31), 31, this.normalColor), 31, this.selectedColor), 31, this.errorColor);
        String str3 = this.composerActionBehavior;
        int hashCode25 = (a12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.composerActionLink;
        int hashCode26 = (hashCode25 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.composerActionId;
        int hashCode27 = (hashCode26 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode28 = (hashCode27 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        return hashCode28 + (map2 != null ? map2.hashCode() : 0);
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
        Boolean bool2 = this.skeletonable;
        Boolean bool3 = this.disableHighlightAnimation;
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
        Boolean bool4 = this.touchDown;
        Float f12 = this.alpha;
        Boolean bool5 = this.isHidden;
        int i11 = this.selectedDot;
        int i12 = this.dotsCount;
        float f13 = this.dotRadius;
        float f14 = this.selectedRadius;
        String str4 = this.normalColor;
        String str5 = this.selectedColor;
        String str6 = this.errorColor;
        String str7 = this.composerActionBehavior;
        String str8 = this.composerActionLink;
        String str9 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder f15 = D40.a.f("PinProgressDTO(type=", cbottomElement2, ", id=", str, ", version=");
        C2860c.f(bool, num, ", clickable=", ", skeletonable=", f15);
        h.h(f15, bool2, ", disableHighlightAnimation=", bool3, ", width=");
        c.e(f15, num2, ", height=", num3, ", ratioW=");
        c.e(f15, num4, ", ratioH=", num5, ", percentW=");
        C2436a.f(f15, f7, ", margins=", list, ", layoutGravity=");
        f15.append(list2);
        f15.append(", layoutWeight=");
        f15.append(f11);
        f15.append(", paddings=");
        C2616s.g(", backgroundRadius=", ", backgroundColor=", f15, list3, list4);
        w.d(str2, ", backgroundGradient=", ", backgroundGradientOrientation=", f15, list5);
        f15.append(enumC9751a);
        f15.append(", strokeColor=");
        f15.append(str3);
        f15.append(", strokeWidth=");
        c.e(f15, num6, ", dashWidth=", num7, ", dashGap=");
        c.e(f15, num8, ", elevation=", num9, ", touchDown=");
        f15.append(bool4);
        f15.append(", alpha=");
        f15.append(f12);
        f15.append(", isHidden=");
        f15.append(bool5);
        f15.append(", selectedDot=");
        f15.append(i11);
        f15.append(", dotsCount=");
        f15.append(i12);
        f15.append(", dotRadius=");
        f15.append(f13);
        f15.append(", selectedRadius=");
        f15.append(f14);
        f15.append(", normalColor=");
        f15.append(str4);
        f15.append(", selectedColor=");
        Nh.a.h(f15, str5, ", errorColor=", str6, ", composerActionBehavior=");
        Nh.a.h(f15, str7, ", composerActionLink=", str8, ", composerActionId=");
        C2638a.e(f15, str9, ", composerActionParams=", map, ", composerTrackingInfo=");
        return P.f(f15, map2, ")");
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
        Boolean bool2 = this.skeletonable;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool2);
        }
        Boolean bool3 = this.disableHighlightAnimation;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool3);
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
        Boolean bool4 = this.touchDown;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool4);
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
        dest.writeInt(this.selectedDot);
        dest.writeInt(this.dotsCount);
        dest.writeFloat(this.dotRadius);
        dest.writeFloat(this.selectedRadius);
        dest.writeString(this.normalColor);
        dest.writeString(this.selectedColor);
        dest.writeString(this.errorColor);
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
    public /* synthetic */ PinProgressDTO(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2 r43, java.lang.String r44, java.lang.Integer r45, java.lang.Boolean r46, java.lang.Boolean r47, java.lang.Boolean r48, java.lang.Integer r49, java.lang.Integer r50, java.lang.Integer r51, java.lang.Integer r52, java.lang.Float r53, java.util.List r54, java.util.List r55, java.lang.Float r56, java.util.List r57, java.util.List r58, java.lang.String r59, java.util.List r60, t40.EnumC9751a r61, java.lang.String r62, java.lang.Integer r63, java.lang.Integer r64, java.lang.Integer r65, java.lang.Integer r66, java.lang.Boolean r67, java.lang.Float r68, java.lang.Boolean r69, int r70, int r71, float r72, float r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.util.Map r80, java.util.Map r81, int r82, int r83, kotlin.jvm.internal.DefaultConstructorMarker r84) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.widgets.v2.PinProgressDTO.<init>(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.util.List, java.util.List, java.lang.Float, java.util.List, java.util.List, java.lang.String, java.util.List, t40.a, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Float, java.lang.Boolean, int, int, float, float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
