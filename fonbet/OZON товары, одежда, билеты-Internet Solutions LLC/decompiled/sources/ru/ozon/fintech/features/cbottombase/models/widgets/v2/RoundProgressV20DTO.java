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
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010,\u0012\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020.\u0018\u00010,¢\u0006\u0004\b0\u00101J\u001d\u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bB\u0010AJ\u0012\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bC\u0010AJ\u0012\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bD\u0010AJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bE\u0010?J\u0012\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bF\u0010?J\u0012\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bG\u0010?J\u0012\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bH\u0010?J\u0012\u0010I\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bM\u0010LJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bN\u0010JJ\u0018\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bO\u0010LJ\u0018\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bP\u0010LJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bQ\u0010=J\u0018\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bR\u0010LJ\u0012\u0010S\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bU\u0010=J\u0012\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bV\u0010?J\u0012\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bW\u0010?J\u0012\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bX\u0010?J\u0012\u0010Y\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bY\u0010?J\u0012\u0010Z\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bZ\u0010JJ\u0012\u0010[\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b[\u0010AJ\u0010\u0010\\\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\\\u00109J\u0010\u0010]\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b]\u0010=J\u0012\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b^\u0010=J\u0012\u0010_\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b_\u0010?J\u0012\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b`\u0010=J\u0012\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\ba\u0010=J\u0012\u0010b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bb\u0010=J\u001e\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u001e\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020.\u0018\u00010,HÆ\u0003¢\u0006\u0004\be\u0010dJî\u0003\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010,2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020.\u0018\u00010,HÆ\u0001¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bh\u0010=J\u0010\u0010i\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bi\u00109J\u001a\u0010l\u001a\u00020\b2\b\u0010k\u001a\u0004\u0018\u00010jHÖ\u0003¢\u0006\u0004\bl\u0010mR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010n\u001a\u0004\bo\u0010;R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010p\u001a\u0004\bq\u0010=R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010r\u001a\u0004\bs\u0010?R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010t\u001a\u0004\bu\u0010AR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010t\u001a\u0004\bv\u0010AR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010t\u001a\u0004\bw\u0010AR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010t\u001a\u0004\bx\u0010AR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010r\u001a\u0004\by\u0010?R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010r\u001a\u0004\bz\u0010?R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010r\u001a\u0004\b{\u0010?R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010r\u001a\u0004\b|\u0010?R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010}\u001a\u0004\b~\u0010JR#\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0014\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010LR#\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0016\u0010\u007f\u001a\u0005\b\u0081\u0001\u0010LR\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0017\u0010}\u001a\u0005\b\u0082\u0001\u0010JR#\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0018\u0010\u007f\u001a\u0005\b\u0083\u0001\u0010LR#\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0019\u0010\u007f\u001a\u0005\b\u0084\u0001\u0010LR\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001a\u0010p\u001a\u0005\b\u0085\u0001\u0010=R#\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001b\u0010\u007f\u001a\u0005\b\u0086\u0001\u0010LR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010TR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001e\u0010p\u001a\u0005\b\u0089\u0001\u0010=R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001f\u0010r\u001a\u0005\b\u008a\u0001\u0010?R\u001d\u0010 \u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b \u0010r\u001a\u0005\b\u008b\u0001\u0010?R\u001d\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b!\u0010r\u001a\u0005\b\u008c\u0001\u0010?R\u001d\u0010\"\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\"\u0010r\u001a\u0005\b\u008d\u0001\u0010?R\u001d\u0010#\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\r\n\u0004\b#\u0010}\u001a\u0005\b\u008e\u0001\u0010JR\u001c\u0010$\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010t\u001a\u0004\b$\u0010AR\u001c\u0010%\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u00109R\u001b\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b&\u0010p\u001a\u0005\b\u0091\u0001\u0010=R\u001d\u0010'\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b'\u0010p\u001a\u0005\b\u0092\u0001\u0010=R\u001d\u0010(\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\b(\u0010r\u001a\u0005\b\u0093\u0001\u0010?R\u001d\u0010)\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b)\u0010p\u001a\u0005\b\u0094\u0001\u0010=R\u001d\u0010*\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b*\u0010p\u001a\u0005\b\u0095\u0001\u0010=R\u001d\u0010+\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b+\u0010p\u001a\u0005\b\u0096\u0001\u0010=R*\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010,8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b-\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010dR*\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020.\u0018\u00010,8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b/\u0010\u0097\u0001\u001a\u0005\b\u0099\u0001\u0010d¨\u0006\u009a\u0001"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/RoundProgressV20DTO;", "LF40/a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "type", "", "id", "", "version", "", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "", "percentW", "", "margins", "Lt40/b;", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "Lt40/a;", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "alpha", "isHidden", "percentage", "percentColor", "percentBackgroundColor", "progressStrokeWidth", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Float;", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lt40/a;", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "()Ljava/util/Map;", "component36", "copy", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/RoundProgressV20DTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getClickable", "getTouchDown", "getSkeletonable", "getDisableHighlightAnimation", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "Ljava/util/List;", "getMargins", "getLayoutGravity", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundColor", "getBackgroundGradient", "Lt40/a;", "getBackgroundGradientOrientation", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getAlpha", "I", "getPercentage", "getPercentColor", "getPercentBackgroundColor", "getProgressStrokeWidth", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RoundProgressV20DTO implements F40.a {

    @NotNull
    public static final Parcelable.Creator<RoundProgressV20DTO> CREATOR = new a();

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

    @i(name = "percentBackgroundColor")
    private final String percentBackgroundColor;

    @i(name = "percentColor")
    @NotNull
    private final String percentColor;

    @i(name = "percentW")
    private final Float percentW;

    @i(name = "percentage")
    private final int percentage;

    @i(name = "progressStrokeWidth")
    private final Integer progressStrokeWidth;

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

    public static final class a implements Parcelable.Creator<RoundProgressV20DTO> {
        @Override // android.os.Parcelable.Creator
        public final RoundProgressV20DTO createFromParcel(Parcel parcel) {
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
            int readInt5 = parcel2.readInt();
            Integer num5 = valueOf15;
            String readString4 = parcel2.readString();
            Boolean bool3 = valueOf4;
            Integer num6 = valueOf8;
            ArrayList arrayList11 = arrayList2;
            EnumC9751a enumC9751a = valueOf12;
            Integer num7 = valueOf16;
            String readString5 = parcel2.readString();
            Integer valueOf19 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Boolean bool4 = valueOf2;
            Integer num8 = valueOf6;
            Float f11 = valueOf10;
            ArrayList arrayList12 = arrayList3;
            Integer num9 = valueOf13;
            Boolean bool5 = valueOf18;
            String readString6 = parcel2.readString();
            String readString7 = parcel2.readString();
            String readString8 = parcel2.readString();
            if (parcel2.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt6 = parcel2.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt6);
                for (int i15 = 0; i15 != readInt6; i15 = B6.b.a(parcel2, linkedHashMap3, parcel2.readString(), i15, 1)) {
                }
                linkedHashMap = linkedHashMap3;
            }
            if (parcel2.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt7 = parcel2.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt7);
                int i16 = 0;
                while (i16 != readInt7) {
                    i16 = C2859b.a(RoundProgressV20DTO.class, parcel2, linkedHashMap2, parcel2.readString(), i16, 1);
                    parcel2 = parcel;
                    readInt7 = readInt7;
                }
            }
            return new RoundProgressV20DTO(c11, readString, num2, bool4, bool, bool3, bool2, num8, num, num6, num3, f11, arrayList9, arrayList11, f7, arrayList12, arrayList10, readString2, createStringArrayList, enumC9751a, readString3, num9, num4, num5, num7, valueOf17, bool5, readInt5, readString4, readString5, valueOf19, readString6, readString7, readString8, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final RoundProgressV20DTO[] newArray(int i11) {
            return new RoundProgressV20DTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RoundProgressV20DTO(@NotNull CbottomElement2 type, @NotNull String id2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List<Integer> list, List<? extends EnumC9752b> list2, Float f11, List<Integer> list3, List<Integer> list4, String str, List<String> list5, EnumC9751a enumC9751a, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, int i11, @NotNull String percentColor, String str3, Integer num10, String str4, String str5, String str6, Map<String, String> map, Map<String, ComposerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(percentColor, "percentColor");
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
        this.percentage = i11;
        this.percentColor = percentColor;
        this.percentBackgroundColor = str3;
        this.progressStrokeWidth = num10;
        this.composerActionBehavior = str4;
        this.composerActionLink = str5;
        this.composerActionId = str6;
        this.composerActionParams = map;
        this.composerTrackingInfo = map2;
    }

    public static /* synthetic */ RoundProgressV20DTO copy$default(RoundProgressV20DTO roundProgressV20DTO, CbottomElement2 cbottomElement2, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List list, List list2, Float f11, List list3, List list4, String str2, List list5, EnumC9751a enumC9751a, String str3, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, int i11, String str4, String str5, Integer num10, String str6, String str7, String str8, Map map, Map map2, int i12, int i13, Object obj) {
        Map map3;
        Map map4;
        EnumC9751a enumC9751a2;
        String str9;
        Integer num11;
        Integer num12;
        Integer num13;
        Integer num14;
        Float f13;
        Boolean bool6;
        int i14;
        String str10;
        String str11;
        Integer num15;
        String str12;
        String str13;
        String str14;
        Float f14;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Integer num16;
        Integer num17;
        Integer num18;
        Integer num19;
        Float f15;
        List list6;
        List list7;
        List list8;
        List list9;
        String str15;
        List list10;
        String str16;
        Integer num20;
        Boolean bool10;
        CbottomElement2 cbottomElement22 = (i12 & 1) != 0 ? roundProgressV20DTO.type : cbottomElement2;
        String str17 = (i12 & 2) != 0 ? roundProgressV20DTO.id : str;
        Integer num21 = (i12 & 4) != 0 ? roundProgressV20DTO.version : num;
        Boolean bool11 = (i12 & 8) != 0 ? roundProgressV20DTO.clickable : bool;
        Boolean bool12 = (i12 & 16) != 0 ? roundProgressV20DTO.touchDown : bool2;
        Boolean bool13 = (i12 & 32) != 0 ? roundProgressV20DTO.skeletonable : bool3;
        Boolean bool14 = (i12 & 64) != 0 ? roundProgressV20DTO.disableHighlightAnimation : bool4;
        Integer num22 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? roundProgressV20DTO.width : num2;
        Integer num23 = (i12 & 256) != 0 ? roundProgressV20DTO.height : num3;
        Integer num24 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? roundProgressV20DTO.ratioW : num4;
        Integer num25 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? roundProgressV20DTO.ratioH : num5;
        Float f16 = (i12 & 2048) != 0 ? roundProgressV20DTO.percentW : f7;
        List list11 = (i12 & 4096) != 0 ? roundProgressV20DTO.margins : list;
        List list12 = (i12 & 8192) != 0 ? roundProgressV20DTO.layoutGravity : list2;
        CbottomElement2 cbottomElement23 = cbottomElement22;
        Float f17 = (i12 & 16384) != 0 ? roundProgressV20DTO.layoutWeight : f11;
        List list13 = (i12 & 32768) != 0 ? roundProgressV20DTO.paddings : list3;
        List list14 = (i12 & 65536) != 0 ? roundProgressV20DTO.backgroundRadius : list4;
        String str18 = (i12 & 131072) != 0 ? roundProgressV20DTO.backgroundColor : str2;
        List list15 = (i12 & 262144) != 0 ? roundProgressV20DTO.backgroundGradient : list5;
        EnumC9751a enumC9751a3 = (i12 & 524288) != 0 ? roundProgressV20DTO.backgroundGradientOrientation : enumC9751a;
        String str19 = (i12 & 1048576) != 0 ? roundProgressV20DTO.strokeColor : str3;
        Integer num26 = (i12 & 2097152) != 0 ? roundProgressV20DTO.strokeWidth : num6;
        Integer num27 = (i12 & 4194304) != 0 ? roundProgressV20DTO.dashWidth : num7;
        Integer num28 = (i12 & 8388608) != 0 ? roundProgressV20DTO.dashGap : num8;
        Integer num29 = (i12 & 16777216) != 0 ? roundProgressV20DTO.elevation : num9;
        Float f18 = (i12 & 33554432) != 0 ? roundProgressV20DTO.alpha : f12;
        Boolean bool15 = (i12 & 67108864) != 0 ? roundProgressV20DTO.isHidden : bool5;
        int i15 = (i12 & 134217728) != 0 ? roundProgressV20DTO.percentage : i11;
        String str20 = (i12 & 268435456) != 0 ? roundProgressV20DTO.percentColor : str4;
        String str21 = (i12 & 536870912) != 0 ? roundProgressV20DTO.percentBackgroundColor : str5;
        Integer num30 = (i12 & 1073741824) != 0 ? roundProgressV20DTO.progressStrokeWidth : num10;
        String str22 = (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? roundProgressV20DTO.composerActionBehavior : str6;
        String str23 = (i13 & 1) != 0 ? roundProgressV20DTO.composerActionLink : str7;
        String str24 = (i13 & 2) != 0 ? roundProgressV20DTO.composerActionId : str8;
        Map map5 = (i13 & 4) != 0 ? roundProgressV20DTO.composerActionParams : map;
        if ((i13 & 8) != 0) {
            map4 = map5;
            map3 = roundProgressV20DTO.composerTrackingInfo;
            str9 = str19;
            num11 = num26;
            num12 = num27;
            num13 = num28;
            num14 = num29;
            f13 = f18;
            bool6 = bool15;
            i14 = i15;
            str10 = str20;
            str11 = str21;
            num15 = num30;
            str12 = str22;
            str13 = str23;
            str14 = str24;
            f14 = f17;
            bool8 = bool13;
            bool9 = bool14;
            num16 = num22;
            num17 = num23;
            num18 = num24;
            num19 = num25;
            f15 = f16;
            list6 = list11;
            list7 = list12;
            list8 = list13;
            list9 = list14;
            str15 = str18;
            list10 = list15;
            enumC9751a2 = enumC9751a3;
            str16 = str17;
            num20 = num21;
            bool10 = bool11;
            bool7 = bool12;
        } else {
            map3 = map2;
            map4 = map5;
            enumC9751a2 = enumC9751a3;
            str9 = str19;
            num11 = num26;
            num12 = num27;
            num13 = num28;
            num14 = num29;
            f13 = f18;
            bool6 = bool15;
            i14 = i15;
            str10 = str20;
            str11 = str21;
            num15 = num30;
            str12 = str22;
            str13 = str23;
            str14 = str24;
            f14 = f17;
            bool7 = bool12;
            bool8 = bool13;
            bool9 = bool14;
            num16 = num22;
            num17 = num23;
            num18 = num24;
            num19 = num25;
            f15 = f16;
            list6 = list11;
            list7 = list12;
            list8 = list13;
            list9 = list14;
            str15 = str18;
            list10 = list15;
            str16 = str17;
            num20 = num21;
            bool10 = bool11;
        }
        return roundProgressV20DTO.copy(cbottomElement23, str16, num20, bool10, bool7, bool8, bool9, num16, num17, num18, num19, f15, list6, list7, f14, list8, list9, str15, list10, enumC9751a2, str9, num11, num12, num13, num14, f13, bool6, i14, str10, str11, num15, str12, str13, str14, map4, map3);
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
    public final int getPercentage() {
        return this.percentage;
    }

    @NotNull
    /* renamed from: component29, reason: from getter */
    public final String getPercentColor() {
        return this.percentColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component30, reason: from getter */
    public final String getPercentBackgroundColor() {
        return this.percentBackgroundColor;
    }

    /* renamed from: component31, reason: from getter */
    public final Integer getProgressStrokeWidth() {
        return this.progressStrokeWidth;
    }

    /* renamed from: component32, reason: from getter */
    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    /* renamed from: component33, reason: from getter */
    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    /* renamed from: component34, reason: from getter */
    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final Map<String, String> component35() {
        return this.composerActionParams;
    }

    public final Map<String, ComposerTrackingInfo> component36() {
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
    public final RoundProgressV20DTO copy(@NotNull CbottomElement2 type, @NotNull String id2, Integer version, Boolean clickable, Boolean touchDown, Boolean skeletonable, Boolean disableHighlightAnimation, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, List<Integer> margins, List<? extends EnumC9752b> layoutGravity, Float layoutWeight, List<Integer> paddings, List<Integer> backgroundRadius, String backgroundColor, List<String> backgroundGradient, EnumC9751a backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Float alpha, Boolean isHidden, int percentage, @NotNull String percentColor, String percentBackgroundColor, Integer progressStrokeWidth, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(percentColor, "percentColor");
        return new RoundProgressV20DTO(type, id2, version, clickable, touchDown, skeletonable, disableHighlightAnimation, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundColor, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, alpha, isHidden, percentage, percentColor, percentBackgroundColor, progressStrokeWidth, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundProgressV20DTO)) {
            return false;
        }
        RoundProgressV20DTO roundProgressV20DTO = (RoundProgressV20DTO) other;
        return this.type == roundProgressV20DTO.type && Intrinsics.d(this.id, roundProgressV20DTO.id) && Intrinsics.d(this.version, roundProgressV20DTO.version) && Intrinsics.d(this.clickable, roundProgressV20DTO.clickable) && Intrinsics.d(this.touchDown, roundProgressV20DTO.touchDown) && Intrinsics.d(this.skeletonable, roundProgressV20DTO.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, roundProgressV20DTO.disableHighlightAnimation) && Intrinsics.d(this.width, roundProgressV20DTO.width) && Intrinsics.d(this.height, roundProgressV20DTO.height) && Intrinsics.d(this.ratioW, roundProgressV20DTO.ratioW) && Intrinsics.d(this.ratioH, roundProgressV20DTO.ratioH) && Intrinsics.d(this.percentW, roundProgressV20DTO.percentW) && Intrinsics.d(this.margins, roundProgressV20DTO.margins) && Intrinsics.d(this.layoutGravity, roundProgressV20DTO.layoutGravity) && Intrinsics.d(this.layoutWeight, roundProgressV20DTO.layoutWeight) && Intrinsics.d(this.paddings, roundProgressV20DTO.paddings) && Intrinsics.d(this.backgroundRadius, roundProgressV20DTO.backgroundRadius) && Intrinsics.d(this.backgroundColor, roundProgressV20DTO.backgroundColor) && Intrinsics.d(this.backgroundGradient, roundProgressV20DTO.backgroundGradient) && this.backgroundGradientOrientation == roundProgressV20DTO.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, roundProgressV20DTO.strokeColor) && Intrinsics.d(this.strokeWidth, roundProgressV20DTO.strokeWidth) && Intrinsics.d(this.dashWidth, roundProgressV20DTO.dashWidth) && Intrinsics.d(this.dashGap, roundProgressV20DTO.dashGap) && Intrinsics.d(this.elevation, roundProgressV20DTO.elevation) && Intrinsics.d(this.alpha, roundProgressV20DTO.alpha) && Intrinsics.d(this.isHidden, roundProgressV20DTO.isHidden) && this.percentage == roundProgressV20DTO.percentage && Intrinsics.d(this.percentColor, roundProgressV20DTO.percentColor) && Intrinsics.d(this.percentBackgroundColor, roundProgressV20DTO.percentBackgroundColor) && Intrinsics.d(this.progressStrokeWidth, roundProgressV20DTO.progressStrokeWidth) && Intrinsics.d(this.composerActionBehavior, roundProgressV20DTO.composerActionBehavior) && Intrinsics.d(this.composerActionLink, roundProgressV20DTO.composerActionLink) && Intrinsics.d(this.composerActionId, roundProgressV20DTO.composerActionId) && Intrinsics.d(this.composerActionParams, roundProgressV20DTO.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, roundProgressV20DTO.composerTrackingInfo);
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

    public final String getPercentBackgroundColor() {
        return this.percentBackgroundColor;
    }

    @NotNull
    public final String getPercentColor() {
        return this.percentColor;
    }

    @Override // F40.a
    public Float getPercentW() {
        return this.percentW;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    public final Integer getProgressStrokeWidth() {
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
        int a12 = g.a(C2454a.a(this.percentage, (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31, 31), 31, this.percentColor);
        String str3 = this.percentBackgroundColor;
        int hashCode25 = (a12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num10 = this.progressStrokeWidth;
        int hashCode26 = (hashCode25 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str4 = this.composerActionBehavior;
        int hashCode27 = (hashCode26 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.composerActionLink;
        int hashCode28 = (hashCode27 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.composerActionId;
        int hashCode29 = (hashCode28 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode30 = (hashCode29 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        return hashCode30 + (map2 != null ? map2.hashCode() : 0);
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
        int i11 = this.percentage;
        String str4 = this.percentColor;
        String str5 = this.percentBackgroundColor;
        Integer num10 = this.progressStrokeWidth;
        String str6 = this.composerActionBehavior;
        String str7 = this.composerActionLink;
        String str8 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder f13 = D40.a.f("RoundProgressV20DTO(type=", cbottomElement2, ", id=", str, ", version=");
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
        f13.append(bool5);
        f13.append(", percentage=");
        f13.append(i11);
        f13.append(", percentColor=");
        Nh.a.h(f13, str4, ", percentBackgroundColor=", str5, ", progressStrokeWidth=");
        V.f(num10, ", composerActionBehavior=", str6, ", composerActionLink=", f13);
        Nh.a.h(f13, str7, ", composerActionId=", str8, ", composerActionParams=");
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
        dest.writeInt(this.percentage);
        dest.writeString(this.percentColor);
        dest.writeString(this.percentBackgroundColor);
        Integer num10 = this.progressStrokeWidth;
        if (num10 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num10);
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
    public /* synthetic */ RoundProgressV20DTO(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2 r40, java.lang.String r41, java.lang.Integer r42, java.lang.Boolean r43, java.lang.Boolean r44, java.lang.Boolean r45, java.lang.Boolean r46, java.lang.Integer r47, java.lang.Integer r48, java.lang.Integer r49, java.lang.Integer r50, java.lang.Float r51, java.util.List r52, java.util.List r53, java.lang.Float r54, java.util.List r55, java.util.List r56, java.lang.String r57, java.util.List r58, t40.EnumC9751a r59, java.lang.String r60, java.lang.Integer r61, java.lang.Integer r62, java.lang.Integer r63, java.lang.Integer r64, java.lang.Float r65, java.lang.Boolean r66, int r67, java.lang.String r68, java.lang.String r69, java.lang.Integer r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.util.Map r74, java.util.Map r75, int r76, int r77, kotlin.jvm.internal.DefaultConstructorMarker r78) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.widgets.v2.RoundProgressV20DTO.<init>(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.util.List, java.util.List, java.lang.Float, java.util.List, java.util.List, java.lang.String, java.util.List, t40.a, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Boolean, int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
