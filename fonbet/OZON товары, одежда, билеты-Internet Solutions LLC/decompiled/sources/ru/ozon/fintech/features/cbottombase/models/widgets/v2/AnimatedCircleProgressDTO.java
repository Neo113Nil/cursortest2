package ru.ozon.fintech.features.cbottombase.models.widgets.v2;

import Ak.C2436a;
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
import I1.w;
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
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0010\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010*¢\u0006\u0004\b.\u0010/J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b@\u0010?J\u0012\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bA\u0010?J\u0012\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bB\u0010=J\u0012\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bC\u0010=J\u0012\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bD\u0010=J\u0012\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bE\u0010=J\u0012\u0010F\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bJ\u0010IJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bK\u0010GJ\u0018\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bL\u0010IJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bM\u0010IJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bN\u0010;J\u0018\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bO\u0010IJ\u0012\u0010P\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bR\u0010;J\u0012\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bS\u0010=J\u0012\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bT\u0010=J\u0012\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bU\u0010=J\u0012\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bV\u0010=J\u0012\u0010W\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bW\u0010GJ\u0012\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bX\u0010?J\u0012\u0010Y\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bY\u0010?J\u0010\u0010Z\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bZ\u0010;J\u0010\u0010[\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b]\u0010;J\u0012\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b^\u0010;J\u0012\u0010_\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b_\u0010;J\u001e\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u001e\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010*HÆ\u0003¢\u0006\u0004\bb\u0010aJÖ\u0003\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00102\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010*HÆ\u0001¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\be\u0010;J\u0010\u0010f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bf\u00107J\u001a\u0010i\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010gHÖ\u0003¢\u0006\u0004\bi\u0010jR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010k\u001a\u0004\bl\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010m\u001a\u0004\bn\u0010;R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010o\u001a\u0004\bp\u0010=R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010q\u001a\u0004\br\u0010?R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010q\u001a\u0004\bs\u0010?R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010q\u001a\u0004\bt\u0010?R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010o\u001a\u0004\bu\u0010=R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010o\u001a\u0004\bv\u0010=R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010o\u001a\u0004\bw\u0010=R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010o\u001a\u0004\bx\u0010=R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010y\u001a\u0004\bz\u0010GR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010{\u001a\u0004\b|\u0010IR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010{\u001a\u0004\b}\u0010IR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010y\u001a\u0004\b~\u0010GR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010{\u001a\u0004\b\u007f\u0010IR#\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0018\u0010{\u001a\u0005\b\u0080\u0001\u0010IR\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0019\u0010m\u001a\u0005\b\u0081\u0001\u0010;R#\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001a\u0010{\u001a\u0005\b\u0082\u0001\u0010IR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010QR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001d\u0010m\u001a\u0005\b\u0085\u0001\u0010;R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001e\u0010o\u001a\u0005\b\u0086\u0001\u0010=R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001f\u0010o\u001a\u0005\b\u0087\u0001\u0010=R\u001d\u0010 \u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b \u0010o\u001a\u0005\b\u0088\u0001\u0010=R\u001d\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b!\u0010o\u001a\u0005\b\u0089\u0001\u0010=R\u001d\u0010\"\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\"\u0010y\u001a\u0005\b\u008a\u0001\u0010GR\u001d\u0010#\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b#\u0010q\u001a\u0005\b\u008b\u0001\u0010?R\u001c\u0010$\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010q\u001a\u0004\b$\u0010?R\u001b\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b%\u0010m\u001a\u0005\b\u008c\u0001\u0010;R\u001c\u0010&\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010\\R\u001d\u0010'\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b'\u0010m\u001a\u0005\b\u008f\u0001\u0010;R\u001d\u0010(\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b(\u0010m\u001a\u0005\b\u0090\u0001\u0010;R\u001d\u0010)\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b)\u0010m\u001a\u0005\b\u0091\u0001\u0010;R*\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b+\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010aR*\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010*8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b-\u0010\u0092\u0001\u001a\u0005\b\u0094\u0001\u0010a¨\u0006\u0095\u0001"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/AnimatedCircleProgressDTO;", "LF40/a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "type", "", "id", "", "version", "", "clickable", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "", "percentW", "", "margins", "Lt40/b;", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "Lt40/a;", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "alpha", "touchDown", "isHidden", "tintColor", "progressStrokeWidth", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/Float;", "component12", "()Ljava/util/List;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lt40/a;", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "()F", "component30", "component31", "component32", "component33", "()Ljava/util/Map;", "component34", "copy", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/AnimatedCircleProgressDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getClickable", "getSkeletonable", "getDisableHighlightAnimation", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "Ljava/util/List;", "getMargins", "getLayoutGravity", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundColor", "getBackgroundGradient", "Lt40/a;", "getBackgroundGradientOrientation", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getAlpha", "getTouchDown", "getTintColor", "F", "getProgressStrokeWidth", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnimatedCircleProgressDTO implements F40.a {

    @NotNull
    public static final Parcelable.Creator<AnimatedCircleProgressDTO> CREATOR = new a();

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

    @i(name = "elevation")
    private final Integer elevation;

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

    @i(name = "paddings")
    private final List<Integer> paddings;

    @i(name = "percentW")
    private final Float percentW;

    @i(name = "progressStrokeWidth")
    private final float progressStrokeWidth;

    @i(name = "ratioH")
    private final Integer ratioH;

    @i(name = "ratioW")
    private final Integer ratioW;

    @i(name = "skeletonable")
    private final Boolean skeletonable;

    @i(name = "strokeColor")
    private final String strokeColor;

    @i(name = "strokeWidth")
    private final Integer strokeWidth;

    @i(name = "tintColor")
    @NotNull
    private final String tintColor;

    @i(name = "touchDown")
    private final Boolean touchDown;

    @i(name = "type")
    @NotNull
    private final CbottomElement2 type;

    @i(name = "version")
    private final Integer version;

    @i(name = "width")
    private final Integer width;

    public static final class a implements Parcelable.Creator<AnimatedCircleProgressDTO> {
        @Override // android.os.Parcelable.Creator
        public final AnimatedCircleProgressDTO createFromParcel(Parcel parcel) {
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
            Float valueOf16 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
            Boolean valueOf17 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Boolean valueOf18 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Integer num3 = valueOf14;
            String readString4 = parcel2.readString();
            Boolean bool3 = valueOf3;
            Integer num4 = valueOf7;
            ArrayList arrayList10 = arrayList2;
            EnumC9751a enumC9751a = valueOf11;
            Integer num5 = valueOf15;
            float readFloat = parcel2.readFloat();
            Float f11 = valueOf16;
            String readString5 = parcel2.readString();
            Integer num6 = valueOf;
            Integer num7 = valueOf5;
            Float f12 = valueOf9;
            ArrayList arrayList11 = arrayList3;
            Integer num8 = valueOf12;
            Boolean bool4 = valueOf17;
            String readString6 = parcel2.readString();
            ArrayList arrayList12 = arrayList4;
            Integer num9 = valueOf13;
            Boolean bool5 = valueOf18;
            String readString7 = parcel2.readString();
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
                    i16 = C2859b.a(AnimatedCircleProgressDTO.class, parcel2, linkedHashMap2, parcel2.readString(), i16, 1);
                    parcel2 = parcel;
                    readInt6 = readInt6;
                }
            }
            return new AnimatedCircleProgressDTO(c11, readString, num6, bool, bool3, bool2, num7, num, num4, num2, f12, arrayList9, arrayList10, f7, arrayList11, arrayList12, readString2, createStringArrayList, enumC9751a, readString3, num8, num9, num3, num5, f11, bool4, bool5, readString4, readFloat, readString5, readString6, readString7, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final AnimatedCircleProgressDTO[] newArray(int i11) {
            return new AnimatedCircleProgressDTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedCircleProgressDTO(@NotNull CbottomElement2 type, @NotNull String id2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List<Integer> list, List<? extends EnumC9752b> list2, Float f11, List<Integer> list3, List<Integer> list4, String str, List<String> list5, EnumC9751a enumC9751a, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool4, Boolean bool5, @NotNull String tintColor, float f13, String str3, String str4, String str5, Map<String, String> map, Map<String, ComposerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
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
        this.alpha = f12;
        this.touchDown = bool4;
        this.isHidden = bool5;
        this.tintColor = tintColor;
        this.progressStrokeWidth = f13;
        this.composerActionBehavior = str3;
        this.composerActionLink = str4;
        this.composerActionId = str5;
        this.composerActionParams = map;
        this.composerTrackingInfo = map2;
    }

    public static /* synthetic */ AnimatedCircleProgressDTO copy$default(AnimatedCircleProgressDTO animatedCircleProgressDTO, CbottomElement2 cbottomElement2, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List list, List list2, Float f11, List list3, List list4, String str2, List list5, EnumC9751a enumC9751a, String str3, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool4, Boolean bool5, String str4, float f13, String str5, String str6, String str7, Map map, Map map2, int i11, int i12, Object obj) {
        Map map3;
        Map map4;
        List list6;
        EnumC9751a enumC9751a2;
        String str8;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        Float f14;
        Boolean bool6;
        Boolean bool7;
        String str9;
        float f15;
        String str10;
        String str11;
        String str12;
        List list7;
        Integer num14;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Integer num15;
        Integer num16;
        Integer num17;
        Integer num18;
        Float f16;
        List list8;
        List list9;
        Float f17;
        List list10;
        String str13;
        String str14;
        CbottomElement2 cbottomElement22 = (i11 & 1) != 0 ? animatedCircleProgressDTO.type : cbottomElement2;
        String str15 = (i11 & 2) != 0 ? animatedCircleProgressDTO.id : str;
        Integer num19 = (i11 & 4) != 0 ? animatedCircleProgressDTO.version : num;
        Boolean bool11 = (i11 & 8) != 0 ? animatedCircleProgressDTO.clickable : bool;
        Boolean bool12 = (i11 & 16) != 0 ? animatedCircleProgressDTO.skeletonable : bool2;
        Boolean bool13 = (i11 & 32) != 0 ? animatedCircleProgressDTO.disableHighlightAnimation : bool3;
        Integer num20 = (i11 & 64) != 0 ? animatedCircleProgressDTO.width : num2;
        Integer num21 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? animatedCircleProgressDTO.height : num3;
        Integer num22 = (i11 & 256) != 0 ? animatedCircleProgressDTO.ratioW : num4;
        Integer num23 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? animatedCircleProgressDTO.ratioH : num5;
        Float f18 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? animatedCircleProgressDTO.percentW : f7;
        List list11 = (i11 & 2048) != 0 ? animatedCircleProgressDTO.margins : list;
        List list12 = (i11 & 4096) != 0 ? animatedCircleProgressDTO.layoutGravity : list2;
        Float f19 = (i11 & 8192) != 0 ? animatedCircleProgressDTO.layoutWeight : f11;
        CbottomElement2 cbottomElement23 = cbottomElement22;
        List list13 = (i11 & 16384) != 0 ? animatedCircleProgressDTO.paddings : list3;
        List list14 = (i11 & 32768) != 0 ? animatedCircleProgressDTO.backgroundRadius : list4;
        String str16 = (i11 & 65536) != 0 ? animatedCircleProgressDTO.backgroundColor : str2;
        List list15 = (i11 & 131072) != 0 ? animatedCircleProgressDTO.backgroundGradient : list5;
        EnumC9751a enumC9751a3 = (i11 & 262144) != 0 ? animatedCircleProgressDTO.backgroundGradientOrientation : enumC9751a;
        String str17 = (i11 & 524288) != 0 ? animatedCircleProgressDTO.strokeColor : str3;
        Integer num24 = (i11 & 1048576) != 0 ? animatedCircleProgressDTO.strokeWidth : num6;
        Integer num25 = (i11 & 2097152) != 0 ? animatedCircleProgressDTO.dashWidth : num7;
        Integer num26 = (i11 & 4194304) != 0 ? animatedCircleProgressDTO.dashGap : num8;
        Integer num27 = (i11 & 8388608) != 0 ? animatedCircleProgressDTO.elevation : num9;
        Float f21 = (i11 & 16777216) != 0 ? animatedCircleProgressDTO.alpha : f12;
        Boolean bool14 = (i11 & 33554432) != 0 ? animatedCircleProgressDTO.touchDown : bool4;
        Boolean bool15 = (i11 & 67108864) != 0 ? animatedCircleProgressDTO.isHidden : bool5;
        String str18 = (i11 & 134217728) != 0 ? animatedCircleProgressDTO.tintColor : str4;
        float f22 = (i11 & 268435456) != 0 ? animatedCircleProgressDTO.progressStrokeWidth : f13;
        String str19 = (i11 & 536870912) != 0 ? animatedCircleProgressDTO.composerActionBehavior : str5;
        String str20 = (i11 & 1073741824) != 0 ? animatedCircleProgressDTO.composerActionLink : str6;
        String str21 = (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? animatedCircleProgressDTO.composerActionId : str7;
        Map map5 = (i12 & 1) != 0 ? animatedCircleProgressDTO.composerActionParams : map;
        if ((i12 & 2) != 0) {
            map4 = map5;
            map3 = animatedCircleProgressDTO.composerTrackingInfo;
            enumC9751a2 = enumC9751a3;
            str8 = str17;
            num10 = num24;
            num11 = num25;
            num12 = num26;
            num13 = num27;
            f14 = f21;
            bool6 = bool14;
            bool7 = bool15;
            str9 = str18;
            f15 = f22;
            str10 = str19;
            str11 = str20;
            str12 = str21;
            list7 = list13;
            bool8 = bool11;
            bool9 = bool12;
            bool10 = bool13;
            num15 = num20;
            num16 = num21;
            num17 = num22;
            num18 = num23;
            f16 = f18;
            list8 = list11;
            list9 = list12;
            f17 = f19;
            list10 = list14;
            str13 = str16;
            list6 = list15;
            str14 = str15;
            num14 = num19;
        } else {
            map3 = map2;
            map4 = map5;
            list6 = list15;
            enumC9751a2 = enumC9751a3;
            str8 = str17;
            num10 = num24;
            num11 = num25;
            num12 = num26;
            num13 = num27;
            f14 = f21;
            bool6 = bool14;
            bool7 = bool15;
            str9 = str18;
            f15 = f22;
            str10 = str19;
            str11 = str20;
            str12 = str21;
            list7 = list13;
            num14 = num19;
            bool8 = bool11;
            bool9 = bool12;
            bool10 = bool13;
            num15 = num20;
            num16 = num21;
            num17 = num22;
            num18 = num23;
            f16 = f18;
            list8 = list11;
            list9 = list12;
            f17 = f19;
            list10 = list14;
            str13 = str16;
            str14 = str15;
        }
        return animatedCircleProgressDTO.copy(cbottomElement23, str14, num14, bool8, bool9, bool10, num15, num16, num17, num18, f16, list8, list9, f17, list7, list10, str13, list6, enumC9751a2, str8, num10, num11, num12, num13, f14, bool6, bool7, str9, f15, str10, str11, str12, map4, map3);
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
    public final Float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component26, reason: from getter */
    public final Boolean getTouchDown() {
        return this.touchDown;
    }

    /* renamed from: component27, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    @NotNull
    /* renamed from: component28, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    /* renamed from: component29, reason: from getter */
    public final float getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component30, reason: from getter */
    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    /* renamed from: component31, reason: from getter */
    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    /* renamed from: component32, reason: from getter */
    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final Map<String, String> component33() {
        return this.composerActionParams;
    }

    public final Map<String, ComposerTrackingInfo> component34() {
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
    public final AnimatedCircleProgressDTO copy(@NotNull CbottomElement2 type, @NotNull String id2, Integer version, Boolean clickable, Boolean skeletonable, Boolean disableHighlightAnimation, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, List<Integer> margins, List<? extends EnumC9752b> layoutGravity, Float layoutWeight, List<Integer> paddings, List<Integer> backgroundRadius, String backgroundColor, List<String> backgroundGradient, EnumC9751a backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Float alpha, Boolean touchDown, Boolean isHidden, @NotNull String tintColor, float progressStrokeWidth, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
        return new AnimatedCircleProgressDTO(type, id2, version, clickable, skeletonable, disableHighlightAnimation, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundColor, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, alpha, touchDown, isHidden, tintColor, progressStrokeWidth, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatedCircleProgressDTO)) {
            return false;
        }
        AnimatedCircleProgressDTO animatedCircleProgressDTO = (AnimatedCircleProgressDTO) other;
        return this.type == animatedCircleProgressDTO.type && Intrinsics.d(this.id, animatedCircleProgressDTO.id) && Intrinsics.d(this.version, animatedCircleProgressDTO.version) && Intrinsics.d(this.clickable, animatedCircleProgressDTO.clickable) && Intrinsics.d(this.skeletonable, animatedCircleProgressDTO.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, animatedCircleProgressDTO.disableHighlightAnimation) && Intrinsics.d(this.width, animatedCircleProgressDTO.width) && Intrinsics.d(this.height, animatedCircleProgressDTO.height) && Intrinsics.d(this.ratioW, animatedCircleProgressDTO.ratioW) && Intrinsics.d(this.ratioH, animatedCircleProgressDTO.ratioH) && Intrinsics.d(this.percentW, animatedCircleProgressDTO.percentW) && Intrinsics.d(this.margins, animatedCircleProgressDTO.margins) && Intrinsics.d(this.layoutGravity, animatedCircleProgressDTO.layoutGravity) && Intrinsics.d(this.layoutWeight, animatedCircleProgressDTO.layoutWeight) && Intrinsics.d(this.paddings, animatedCircleProgressDTO.paddings) && Intrinsics.d(this.backgroundRadius, animatedCircleProgressDTO.backgroundRadius) && Intrinsics.d(this.backgroundColor, animatedCircleProgressDTO.backgroundColor) && Intrinsics.d(this.backgroundGradient, animatedCircleProgressDTO.backgroundGradient) && this.backgroundGradientOrientation == animatedCircleProgressDTO.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, animatedCircleProgressDTO.strokeColor) && Intrinsics.d(this.strokeWidth, animatedCircleProgressDTO.strokeWidth) && Intrinsics.d(this.dashWidth, animatedCircleProgressDTO.dashWidth) && Intrinsics.d(this.dashGap, animatedCircleProgressDTO.dashGap) && Intrinsics.d(this.elevation, animatedCircleProgressDTO.elevation) && Intrinsics.d(this.alpha, animatedCircleProgressDTO.alpha) && Intrinsics.d(this.touchDown, animatedCircleProgressDTO.touchDown) && Intrinsics.d(this.isHidden, animatedCircleProgressDTO.isHidden) && Intrinsics.d(this.tintColor, animatedCircleProgressDTO.tintColor) && Float.compare(this.progressStrokeWidth, animatedCircleProgressDTO.progressStrokeWidth) == 0 && Intrinsics.d(this.composerActionBehavior, animatedCircleProgressDTO.composerActionBehavior) && Intrinsics.d(this.composerActionLink, animatedCircleProgressDTO.composerActionLink) && Intrinsics.d(this.composerActionId, animatedCircleProgressDTO.composerActionId) && Intrinsics.d(this.composerActionParams, animatedCircleProgressDTO.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, animatedCircleProgressDTO.composerTrackingInfo);
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

    @Override // F40.a
    public Integer getElevation() {
        return this.elevation;
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

    @Override // F40.a
    public List<Integer> getPaddings() {
        return this.paddings;
    }

    @Override // F40.a
    public Float getPercentW() {
        return this.percentW;
    }

    public final float getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    @Override // F40.a
    public Integer getRatioH() {
        return this.ratioH;
    }

    @Override // F40.a
    public Integer getRatioW() {
        return this.ratioW;
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

    @NotNull
    public final String getTintColor() {
        return this.tintColor;
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
        Float f12 = this.alpha;
        int hashCode23 = (hashCode22 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Boolean bool4 = this.touchDown;
        int hashCode24 = (hashCode23 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isHidden;
        int a12 = Pk0.b.a(this.progressStrokeWidth, g.a((hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31, 31, this.tintColor), 31);
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
        Float f12 = this.alpha;
        Boolean bool4 = this.touchDown;
        Boolean bool5 = this.isHidden;
        String str4 = this.tintColor;
        float f13 = this.progressStrokeWidth;
        String str5 = this.composerActionBehavior;
        String str6 = this.composerActionLink;
        String str7 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder f14 = D40.a.f("AnimatedCircleProgressDTO(type=", cbottomElement2, ", id=", str, ", version=");
        C2860c.f(bool, num, ", clickable=", ", skeletonable=", f14);
        h.h(f14, bool2, ", disableHighlightAnimation=", bool3, ", width=");
        c.e(f14, num2, ", height=", num3, ", ratioW=");
        c.e(f14, num4, ", ratioH=", num5, ", percentW=");
        C2436a.f(f14, f7, ", margins=", list, ", layoutGravity=");
        f14.append(list2);
        f14.append(", layoutWeight=");
        f14.append(f11);
        f14.append(", paddings=");
        C2616s.g(", backgroundRadius=", ", backgroundColor=", f14, list3, list4);
        w.d(str2, ", backgroundGradient=", ", backgroundGradientOrientation=", f14, list5);
        f14.append(enumC9751a);
        f14.append(", strokeColor=");
        f14.append(str3);
        f14.append(", strokeWidth=");
        c.e(f14, num6, ", dashWidth=", num7, ", dashGap=");
        c.e(f14, num8, ", elevation=", num9, ", alpha=");
        f14.append(f12);
        f14.append(", touchDown=");
        f14.append(bool4);
        f14.append(", isHidden=");
        HY.b.c(bool5, ", tintColor=", str4, ", progressStrokeWidth=", f14);
        f14.append(f13);
        f14.append(", composerActionBehavior=");
        f14.append(str5);
        f14.append(", composerActionLink=");
        Nh.a.h(f14, str6, ", composerActionId=", str7, ", composerActionParams=");
        return V.c(f14, map, ", composerTrackingInfo=", map2, ")");
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
        Float f12 = this.alpha;
        if (f12 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f12);
        }
        Boolean bool4 = this.touchDown;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool4);
        }
        Boolean bool5 = this.isHidden;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool5);
        }
        dest.writeString(this.tintColor);
        dest.writeFloat(this.progressStrokeWidth);
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
    public /* synthetic */ AnimatedCircleProgressDTO(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2 r38, java.lang.String r39, java.lang.Integer r40, java.lang.Boolean r41, java.lang.Boolean r42, java.lang.Boolean r43, java.lang.Integer r44, java.lang.Integer r45, java.lang.Integer r46, java.lang.Integer r47, java.lang.Float r48, java.util.List r49, java.util.List r50, java.lang.Float r51, java.util.List r52, java.util.List r53, java.lang.String r54, java.util.List r55, t40.EnumC9751a r56, java.lang.String r57, java.lang.Integer r58, java.lang.Integer r59, java.lang.Integer r60, java.lang.Integer r61, java.lang.Float r62, java.lang.Boolean r63, java.lang.Boolean r64, java.lang.String r65, float r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.util.Map r70, java.util.Map r71, int r72, int r73, kotlin.jvm.internal.DefaultConstructorMarker r74) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.widgets.v2.AnimatedCircleProgressDTO.<init>(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.util.List, java.util.List, java.lang.Float, java.util.List, java.util.List, java.lang.String, java.util.List, t40.a, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Boolean, java.lang.Boolean, java.lang.String, float, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
