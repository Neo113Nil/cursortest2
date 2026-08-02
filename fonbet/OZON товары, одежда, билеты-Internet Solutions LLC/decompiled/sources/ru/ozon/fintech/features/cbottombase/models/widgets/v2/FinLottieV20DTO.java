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
import Kk.C3532b;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import c8.C5766e;
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
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010*¢\u0006\u0004\b.\u0010/J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b@\u0010?J\u0012\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bA\u0010?J\u0012\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bB\u0010?J\u0012\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bC\u0010=J\u0012\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bD\u0010=J\u0012\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bE\u0010=J\u0012\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bF\u0010=J\u0012\u0010G\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bK\u0010JJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bL\u0010HJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bM\u0010JJ\u0018\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bN\u0010JJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bO\u0010;J\u0018\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bP\u0010JJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bS\u0010;J\u0012\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bT\u0010=J\u0012\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bU\u0010=J\u0012\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bV\u0010=J\u0012\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bW\u0010=J\u0012\u0010X\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bX\u0010HJ\u0012\u0010Y\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bY\u0010?J\u0010\u0010Z\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bZ\u0010;J\u0010\u0010[\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b]\u0010;J\u0012\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b^\u0010;J\u0012\u0010_\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b_\u0010;J\u001e\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u001e\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010*HÆ\u0003¢\u0006\u0004\bb\u0010aJÖ\u0003\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010*HÆ\u0001¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\be\u0010;J\u0010\u0010f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bf\u00107J\u001a\u0010i\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010gHÖ\u0003¢\u0006\u0004\bi\u0010jR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010k\u001a\u0004\bl\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010m\u001a\u0004\bn\u0010;R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010o\u001a\u0004\bp\u0010=R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010q\u001a\u0004\br\u0010?R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010q\u001a\u0004\bs\u0010?R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010q\u001a\u0004\bt\u0010?R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010q\u001a\u0004\bu\u0010?R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010o\u001a\u0004\bv\u0010=R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010o\u001a\u0004\bw\u0010=R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010o\u001a\u0004\bx\u0010=R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010o\u001a\u0004\by\u0010=R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010z\u001a\u0004\b{\u0010HR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010|\u001a\u0004\b}\u0010JR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010|\u001a\u0004\b~\u0010JR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010z\u001a\u0004\b\u007f\u0010HR#\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0018\u0010|\u001a\u0005\b\u0080\u0001\u0010JR#\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0019\u0010|\u001a\u0005\b\u0081\u0001\u0010JR\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001a\u0010m\u001a\u0005\b\u0082\u0001\u0010;R#\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001b\u0010|\u001a\u0005\b\u0083\u0001\u0010JR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010RR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001e\u0010m\u001a\u0005\b\u0086\u0001\u0010;R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001f\u0010o\u001a\u0005\b\u0087\u0001\u0010=R\u001d\u0010 \u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b \u0010o\u001a\u0005\b\u0088\u0001\u0010=R\u001d\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b!\u0010o\u001a\u0005\b\u0089\u0001\u0010=R\u001d\u0010\"\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\"\u0010o\u001a\u0005\b\u008a\u0001\u0010=R\u001d\u0010#\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\r\n\u0004\b#\u0010z\u001a\u0005\b\u008b\u0001\u0010HR\u001c\u0010$\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010q\u001a\u0004\b$\u0010?R\u001b\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b%\u0010m\u001a\u0005\b\u008c\u0001\u0010;R\u001c\u0010&\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010\\R\u001d\u0010'\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b'\u0010m\u001a\u0005\b\u008f\u0001\u0010;R\u001d\u0010(\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b(\u0010m\u001a\u0005\b\u0090\u0001\u0010;R\u001d\u0010)\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b)\u0010m\u001a\u0005\b\u0091\u0001\u0010;R*\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b+\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010aR*\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010*8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b-\u0010\u0092\u0001\u001a\u0005\b\u0094\u0001\u0010a¨\u0006\u0095\u0001"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinLottieV20DTO;", "LF40/a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "type", "", "id", "", "version", "", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "", "percentW", "", "margins", "Lt40/b;", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "Lt40/a;", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "alpha", "isHidden", "animation", "infinity", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Float;", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lt40/a;", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "()Z", "component30", "component31", "component32", "component33", "()Ljava/util/Map;", "component34", "copy", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinLottieV20DTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getClickable", "getTouchDown", "getSkeletonable", "getDisableHighlightAnimation", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "Ljava/util/List;", "getMargins", "getLayoutGravity", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundColor", "getBackgroundGradient", "Lt40/a;", "getBackgroundGradientOrientation", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getAlpha", "getAnimation", "Z", "getInfinity", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinLottieV20DTO implements F40.a {

    @NotNull
    public static final Parcelable.Creator<FinLottieV20DTO> CREATOR = new a();

    @i(name = "opacity")
    private final Float alpha;

    @i(name = "animation")
    @NotNull
    private final String animation;

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

    @i(name = "infinity")
    private final boolean infinity;

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

    @i(name = "touchDown")
    private final Boolean touchDown;

    @i(name = "type")
    @NotNull
    private final CbottomElement2 type;

    @i(name = "version")
    private final Integer version;

    @i(name = "width")
    private final Integer width;

    public static final class a implements Parcelable.Creator<FinLottieV20DTO> {
        @Override // android.os.Parcelable.Creator
        public final FinLottieV20DTO createFromParcel(Parcel parcel) {
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
            Integer num5 = valueOf15;
            boolean z11 = parcel2.readInt() != 0;
            Boolean bool3 = valueOf4;
            Integer num6 = valueOf8;
            ArrayList arrayList11 = arrayList2;
            EnumC9751a enumC9751a = valueOf12;
            Integer num7 = valueOf16;
            String readString5 = parcel2.readString();
            Float f11 = valueOf17;
            String readString6 = parcel2.readString();
            Boolean bool4 = valueOf2;
            Integer num8 = valueOf6;
            Float f12 = valueOf10;
            ArrayList arrayList12 = arrayList3;
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
                    i16 = C2859b.a(FinLottieV20DTO.class, parcel2, linkedHashMap2, parcel2.readString(), i16, 1);
                    parcel2 = parcel;
                    readInt6 = readInt6;
                }
            }
            return new FinLottieV20DTO(c11, readString, num2, bool4, bool, bool3, bool2, num8, num, num6, num3, f12, arrayList9, arrayList11, f7, arrayList12, arrayList10, readString2, createStringArrayList, enumC9751a, readString3, num9, num4, num5, num7, f11, bool5, readString4, z11, readString5, readString6, readString7, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final FinLottieV20DTO[] newArray(int i11) {
            return new FinLottieV20DTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinLottieV20DTO(@NotNull CbottomElement2 type, @NotNull String id2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List<Integer> list, List<? extends EnumC9752b> list2, Float f11, List<Integer> list3, List<Integer> list4, String str, List<String> list5, EnumC9751a enumC9751a, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, @NotNull String animation, boolean z11, String str3, String str4, String str5, Map<String, String> map, Map<String, ComposerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(animation, "animation");
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
        this.animation = animation;
        this.infinity = z11;
        this.composerActionBehavior = str3;
        this.composerActionLink = str4;
        this.composerActionId = str5;
        this.composerActionParams = map;
        this.composerTrackingInfo = map2;
    }

    public static /* synthetic */ FinLottieV20DTO copy$default(FinLottieV20DTO finLottieV20DTO, CbottomElement2 cbottomElement2, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List list, List list2, Float f11, List list3, List list4, String str2, List list5, EnumC9751a enumC9751a, String str3, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, String str4, boolean z11, String str5, String str6, String str7, Map map, Map map2, int i11, int i12, Object obj) {
        Map map3;
        Map map4;
        String str8;
        List list6;
        EnumC9751a enumC9751a2;
        String str9;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        Float f13;
        Boolean bool6;
        String str10;
        boolean z12;
        String str11;
        String str12;
        String str13;
        Float f14;
        Integer num14;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Integer num15;
        Integer num16;
        Integer num17;
        Integer num18;
        Float f15;
        List list7;
        List list8;
        List list9;
        List list10;
        String str14;
        CbottomElement2 cbottomElement22 = (i11 & 1) != 0 ? finLottieV20DTO.type : cbottomElement2;
        String str15 = (i11 & 2) != 0 ? finLottieV20DTO.id : str;
        Integer num19 = (i11 & 4) != 0 ? finLottieV20DTO.version : num;
        Boolean bool11 = (i11 & 8) != 0 ? finLottieV20DTO.clickable : bool;
        Boolean bool12 = (i11 & 16) != 0 ? finLottieV20DTO.touchDown : bool2;
        Boolean bool13 = (i11 & 32) != 0 ? finLottieV20DTO.skeletonable : bool3;
        Boolean bool14 = (i11 & 64) != 0 ? finLottieV20DTO.disableHighlightAnimation : bool4;
        Integer num20 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? finLottieV20DTO.width : num2;
        Integer num21 = (i11 & 256) != 0 ? finLottieV20DTO.height : num3;
        Integer num22 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? finLottieV20DTO.ratioW : num4;
        Integer num23 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? finLottieV20DTO.ratioH : num5;
        Float f16 = (i11 & 2048) != 0 ? finLottieV20DTO.percentW : f7;
        List list11 = (i11 & 4096) != 0 ? finLottieV20DTO.margins : list;
        List list12 = (i11 & 8192) != 0 ? finLottieV20DTO.layoutGravity : list2;
        CbottomElement2 cbottomElement23 = cbottomElement22;
        Float f17 = (i11 & 16384) != 0 ? finLottieV20DTO.layoutWeight : f11;
        List list13 = (i11 & 32768) != 0 ? finLottieV20DTO.paddings : list3;
        List list14 = (i11 & 65536) != 0 ? finLottieV20DTO.backgroundRadius : list4;
        String str16 = (i11 & 131072) != 0 ? finLottieV20DTO.backgroundColor : str2;
        List list15 = (i11 & 262144) != 0 ? finLottieV20DTO.backgroundGradient : list5;
        EnumC9751a enumC9751a3 = (i11 & 524288) != 0 ? finLottieV20DTO.backgroundGradientOrientation : enumC9751a;
        String str17 = (i11 & 1048576) != 0 ? finLottieV20DTO.strokeColor : str3;
        Integer num24 = (i11 & 2097152) != 0 ? finLottieV20DTO.strokeWidth : num6;
        Integer num25 = (i11 & 4194304) != 0 ? finLottieV20DTO.dashWidth : num7;
        Integer num26 = (i11 & 8388608) != 0 ? finLottieV20DTO.dashGap : num8;
        Integer num27 = (i11 & 16777216) != 0 ? finLottieV20DTO.elevation : num9;
        Float f18 = (i11 & 33554432) != 0 ? finLottieV20DTO.alpha : f12;
        Boolean bool15 = (i11 & 67108864) != 0 ? finLottieV20DTO.isHidden : bool5;
        String str18 = (i11 & 134217728) != 0 ? finLottieV20DTO.animation : str4;
        boolean z13 = (i11 & 268435456) != 0 ? finLottieV20DTO.infinity : z11;
        String str19 = (i11 & 536870912) != 0 ? finLottieV20DTO.composerActionBehavior : str5;
        String str20 = (i11 & 1073741824) != 0 ? finLottieV20DTO.composerActionLink : str6;
        String str21 = (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? finLottieV20DTO.composerActionId : str7;
        Map map5 = (i12 & 1) != 0 ? finLottieV20DTO.composerActionParams : map;
        if ((i12 & 2) != 0) {
            map4 = map5;
            map3 = finLottieV20DTO.composerTrackingInfo;
            list6 = list15;
            enumC9751a2 = enumC9751a3;
            str9 = str17;
            num10 = num24;
            num11 = num25;
            num12 = num26;
            num13 = num27;
            f13 = f18;
            bool6 = bool15;
            str10 = str18;
            z12 = z13;
            str11 = str19;
            str12 = str20;
            str13 = str21;
            f14 = f17;
            bool7 = bool11;
            bool8 = bool12;
            bool9 = bool13;
            bool10 = bool14;
            num15 = num20;
            num16 = num21;
            num17 = num22;
            num18 = num23;
            f15 = f16;
            list7 = list11;
            list8 = list12;
            list9 = list13;
            list10 = list14;
            str8 = str16;
            str14 = str15;
            num14 = num19;
        } else {
            map3 = map2;
            map4 = map5;
            str8 = str16;
            list6 = list15;
            enumC9751a2 = enumC9751a3;
            str9 = str17;
            num10 = num24;
            num11 = num25;
            num12 = num26;
            num13 = num27;
            f13 = f18;
            bool6 = bool15;
            str10 = str18;
            z12 = z13;
            str11 = str19;
            str12 = str20;
            str13 = str21;
            f14 = f17;
            num14 = num19;
            bool7 = bool11;
            bool8 = bool12;
            bool9 = bool13;
            bool10 = bool14;
            num15 = num20;
            num16 = num21;
            num17 = num22;
            num18 = num23;
            f15 = f16;
            list7 = list11;
            list8 = list12;
            list9 = list13;
            list10 = list14;
            str14 = str15;
        }
        return finLottieV20DTO.copy(cbottomElement23, str14, num14, bool7, bool8, bool9, bool10, num15, num16, num17, num18, f15, list7, list8, f14, list9, list10, str8, list6, enumC9751a2, str9, num10, num11, num12, num13, f13, bool6, str10, z12, str11, str12, str13, map4, map3);
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

    @NotNull
    /* renamed from: component28, reason: from getter */
    public final String getAnimation() {
        return this.animation;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getInfinity() {
        return this.infinity;
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
    public final FinLottieV20DTO copy(@NotNull CbottomElement2 type, @NotNull String id2, Integer version, Boolean clickable, Boolean touchDown, Boolean skeletonable, Boolean disableHighlightAnimation, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, List<Integer> margins, List<? extends EnumC9752b> layoutGravity, Float layoutWeight, List<Integer> paddings, List<Integer> backgroundRadius, String backgroundColor, List<String> backgroundGradient, EnumC9751a backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Float alpha, Boolean isHidden, @NotNull String animation, boolean infinity, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(animation, "animation");
        return new FinLottieV20DTO(type, id2, version, clickable, touchDown, skeletonable, disableHighlightAnimation, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundColor, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, alpha, isHidden, animation, infinity, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinLottieV20DTO)) {
            return false;
        }
        FinLottieV20DTO finLottieV20DTO = (FinLottieV20DTO) other;
        return this.type == finLottieV20DTO.type && Intrinsics.d(this.id, finLottieV20DTO.id) && Intrinsics.d(this.version, finLottieV20DTO.version) && Intrinsics.d(this.clickable, finLottieV20DTO.clickable) && Intrinsics.d(this.touchDown, finLottieV20DTO.touchDown) && Intrinsics.d(this.skeletonable, finLottieV20DTO.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, finLottieV20DTO.disableHighlightAnimation) && Intrinsics.d(this.width, finLottieV20DTO.width) && Intrinsics.d(this.height, finLottieV20DTO.height) && Intrinsics.d(this.ratioW, finLottieV20DTO.ratioW) && Intrinsics.d(this.ratioH, finLottieV20DTO.ratioH) && Intrinsics.d(this.percentW, finLottieV20DTO.percentW) && Intrinsics.d(this.margins, finLottieV20DTO.margins) && Intrinsics.d(this.layoutGravity, finLottieV20DTO.layoutGravity) && Intrinsics.d(this.layoutWeight, finLottieV20DTO.layoutWeight) && Intrinsics.d(this.paddings, finLottieV20DTO.paddings) && Intrinsics.d(this.backgroundRadius, finLottieV20DTO.backgroundRadius) && Intrinsics.d(this.backgroundColor, finLottieV20DTO.backgroundColor) && Intrinsics.d(this.backgroundGradient, finLottieV20DTO.backgroundGradient) && this.backgroundGradientOrientation == finLottieV20DTO.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, finLottieV20DTO.strokeColor) && Intrinsics.d(this.strokeWidth, finLottieV20DTO.strokeWidth) && Intrinsics.d(this.dashWidth, finLottieV20DTO.dashWidth) && Intrinsics.d(this.dashGap, finLottieV20DTO.dashGap) && Intrinsics.d(this.elevation, finLottieV20DTO.elevation) && Intrinsics.d(this.alpha, finLottieV20DTO.alpha) && Intrinsics.d(this.isHidden, finLottieV20DTO.isHidden) && Intrinsics.d(this.animation, finLottieV20DTO.animation) && this.infinity == finLottieV20DTO.infinity && Intrinsics.d(this.composerActionBehavior, finLottieV20DTO.composerActionBehavior) && Intrinsics.d(this.composerActionLink, finLottieV20DTO.composerActionLink) && Intrinsics.d(this.composerActionId, finLottieV20DTO.composerActionId) && Intrinsics.d(this.composerActionParams, finLottieV20DTO.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, finLottieV20DTO.composerTrackingInfo);
    }

    @Override // F40.a
    public Float getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final String getAnimation() {
        return this.animation;
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

    public final boolean getInfinity() {
        return this.infinity;
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
        int a12 = C3532b.a(g.a((hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31, 31, this.animation), 31, this.infinity);
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
        String str4 = this.animation;
        boolean z11 = this.infinity;
        String str5 = this.composerActionBehavior;
        String str6 = this.composerActionLink;
        String str7 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder f13 = D40.a.f("FinLottieV20DTO(type=", cbottomElement2, ", id=", str, ", version=");
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
        HY.b.c(bool5, ", animation=", str4, ", infinity=", f13);
        C5766e.a(", composerActionBehavior=", str5, ", composerActionLink=", f13, z11);
        Nh.a.h(f13, str6, ", composerActionId=", str7, ", composerActionParams=");
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
        dest.writeString(this.animation);
        dest.writeInt(this.infinity ? 1 : 0);
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
    public /* synthetic */ FinLottieV20DTO(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2 r38, java.lang.String r39, java.lang.Integer r40, java.lang.Boolean r41, java.lang.Boolean r42, java.lang.Boolean r43, java.lang.Boolean r44, java.lang.Integer r45, java.lang.Integer r46, java.lang.Integer r47, java.lang.Integer r48, java.lang.Float r49, java.util.List r50, java.util.List r51, java.lang.Float r52, java.util.List r53, java.util.List r54, java.lang.String r55, java.util.List r56, t40.EnumC9751a r57, java.lang.String r58, java.lang.Integer r59, java.lang.Integer r60, java.lang.Integer r61, java.lang.Integer r62, java.lang.Float r63, java.lang.Boolean r64, java.lang.String r65, boolean r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.util.Map r70, java.util.Map r71, int r72, int r73, kotlin.jvm.internal.DefaultConstructorMarker r74) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinLottieV20DTO.<init>(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.util.List, java.util.List, java.lang.Float, java.util.List, java.util.List, java.lang.String, java.util.List, t40.a, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
