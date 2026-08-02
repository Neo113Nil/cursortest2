package ru.ozon.fintech.features.cbottombase.models.widgets.v2;

import Ak.C2436a;
import B0.C2454a;
import B4.V;
import B90.C2616s;
import B90.C2619v;
import C.J;
import D3.h;
import D40.d;
import De.C2859b;
import De.C2860c;
import Ef0.c;
import F40.a;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.exchanger.datapass.ComposerTrackingInfo;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import t40.EnumC9751a;
import t40.EnumC9752b;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b:\n\u0002\u0010\u0000\n\u0002\b6\b\u0087\b\u0018\u0000 ª\u00012\u00020\u0001:\u0002«\u0001Bù\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000102\u0012\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000204\u0018\u000102¢\u0006\u0004\b6\u00107J\u001d\u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u0006¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0006¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0012\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bI\u0010GJ\u0012\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bJ\u0010GJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bK\u0010EJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bL\u0010EJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bM\u0010EJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bN\u0010EJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0018\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0018\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bS\u0010RJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bT\u0010PJ\u0018\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bU\u0010RJ\u0018\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bV\u0010RJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bW\u0010CJ\u0018\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bX\u0010RJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b[\u0010CJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\\\u0010EJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b]\u0010EJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b^\u0010EJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b_\u0010EJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b`\u0010PJ\u0012\u0010a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\ba\u0010GJ\u0012\u0010b\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020)HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0012\u0010j\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bj\u0010GJ\u0012\u0010k\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bk\u0010gJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bl\u0010CJ\u0012\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bm\u0010CJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bn\u0010CJ\u001e\u0010o\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000102HÆ\u0003¢\u0006\u0004\bo\u0010pJ\u001e\u0010q\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000204\u0018\u000102HÆ\u0003¢\u0006\u0004\bq\u0010pJ\u0088\u0004\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001022\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000204\u0018\u000102HÆ\u0001¢\u0006\u0004\br\u0010sJ\u0010\u0010t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bt\u0010CJ\u0010\u0010u\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bu\u0010?J\u001a\u0010x\u001a\u00020\b2\b\u0010w\u001a\u0004\u0018\u00010vHÖ\u0003¢\u0006\u0004\bx\u0010yR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010z\u001a\u0004\b{\u0010AR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010|\u001a\u0004\b}\u0010CR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010~\u001a\u0004\b\u007f\u0010ER\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010GR\u001e\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u0080\u0001\u001a\u0005\b\u0082\u0001\u0010GR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u0080\u0001\u001a\u0005\b\u0083\u0001\u0010GR\u001e\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u0080\u0001\u001a\u0005\b\u0084\u0001\u0010GR\u001d\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\r\u0010~\u001a\u0005\b\u0085\u0001\u0010ER\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u000e\u0010~\u001a\u0005\b\u0086\u0001\u0010ER\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u000f\u0010~\u001a\u0005\b\u0087\u0001\u0010ER\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0010\u0010~\u001a\u0005\b\u0088\u0001\u0010ER\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010PR$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010RR$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010\u008b\u0001\u001a\u0005\b\u008d\u0001\u0010RR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u0089\u0001\u001a\u0005\b\u008e\u0001\u0010PR$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u008b\u0001\u001a\u0005\b\u008f\u0001\u0010RR$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010\u008b\u0001\u001a\u0005\b\u0090\u0001\u0010RR\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001a\u0010|\u001a\u0005\b\u0091\u0001\u0010CR$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u008b\u0001\u001a\u0005\b\u0092\u0001\u0010RR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010ZR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001e\u0010|\u001a\u0005\b\u0095\u0001\u0010CR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001f\u0010~\u001a\u0005\b\u0096\u0001\u0010ER\u001d\u0010 \u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b \u0010~\u001a\u0005\b\u0097\u0001\u0010ER\u001d\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b!\u0010~\u001a\u0005\b\u0098\u0001\u0010ER\u001d\u0010\"\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\"\u0010~\u001a\u0005\b\u0099\u0001\u0010ER\u001e\u0010#\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0089\u0001\u001a\u0005\b\u009a\u0001\u0010PR\u001d\u0010$\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b$\u0010\u0080\u0001\u001a\u0004\b$\u0010GR\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010cR\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010eR\u001c\u0010*\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010gR\u001e\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010iR\u001d\u0010-\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b-\u0010\u0080\u0001\u001a\u0004\b-\u0010GR\u001e\u0010.\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010\u009f\u0001\u001a\u0005\b£\u0001\u0010gR\u001d\u0010/\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b/\u0010|\u001a\u0005\b¤\u0001\u0010CR\u001d\u00100\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b0\u0010|\u001a\u0005\b¥\u0001\u0010CR\u001d\u00101\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\r\n\u0004\b1\u0010|\u001a\u0005\b¦\u0001\u0010CR*\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b3\u0010§\u0001\u001a\u0005\b¨\u0001\u0010pR*\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000204\u0018\u0001028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b5\u0010§\u0001\u001a\u0005\b©\u0001\u0010p¨\u0006¬\u0001"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinButtonV20DTO;", "LF40/a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "type", "", "id", "", "version", "", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "", "percentW", "", "margins", "Lt40/b;", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "Lt40/a;", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "alpha", "isHidden", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;", "preset", "Lru/ozon/uni/atoms/data/controls/button/Style;", "style", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "isEnabled", "subtitle", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;Lru/ozon/uni/atoms/data/controls/button/Style;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Float;", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lt40/a;", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;", "component29", "()Lru/ozon/uni/atoms/data/controls/button/Style;", "component30", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "component31", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component32", "component33", "component34", "component35", "component36", "component37", "()Ljava/util/Map;", "component38", "copy", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;Lru/ozon/uni/atoms/data/controls/button/Style;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinButtonV20DTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getClickable", "getTouchDown", "getSkeletonable", "getDisableHighlightAnimation", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "Ljava/util/List;", "getMargins", "getLayoutGravity", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundColor", "getBackgroundGradient", "Lt40/a;", "getBackgroundGradientOrientation", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getAlpha", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO$Preset;", "getPreset", "Lru/ozon/uni/atoms/data/controls/button/Style;", "getStyle", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getTitle", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "getSubtitle", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "Companion", "a", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinButtonV20DTO implements a {

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

    @i(name = "common")
    private final CommonControlSettings common;

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

    @i(name = "isEnabled")
    private final Boolean isEnabled;

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

    @i(name = "preset")
    private final ButtonDTO.Preset preset;

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

    @i(name = "style")
    private final Style style;

    @i(name = "subtitle")
    private final CommonAtomLabelDTO subtitle;

    @i(name = SelectionItemFormDTO.TITLE_FIELD_NAME)
    @NotNull
    private final CommonAtomLabelDTO title;

    @i(name = "touchDown")
    private final Boolean touchDown;

    @i(name = "type")
    @NotNull
    private final CbottomElement2 type;

    @i(name = "version")
    private final Integer version;

    @i(name = "width")
    private final Integer width;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<FinButtonV20DTO> CREATOR = new b();

    /* renamed from: ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV20DTO$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class b implements Parcelable.Creator<FinButtonV20DTO> {
        @Override // android.os.Parcelable.Creator
        public final FinButtonV20DTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            Parcel parcel2 = parcel;
            CbottomElement2 c11 = D40.b.c("parcel", parcel2);
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
            ButtonDTO.Preset valueOf19 = parcel2.readInt() == 0 ? null : ButtonDTO.Preset.valueOf(parcel2.readString());
            Style valueOf20 = parcel2.readInt() == 0 ? null : Style.valueOf(parcel2.readString());
            Class<FinButtonV20DTO> cls = FinButtonV20DTO.class;
            CommonAtomLabelDTO commonAtomLabelDTO = (CommonAtomLabelDTO) parcel2.readParcelable(cls.getClassLoader());
            CommonControlSettings commonControlSettings = (CommonControlSettings) parcel2.readParcelable(cls.getClassLoader());
            Boolean valueOf21 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            CommonAtomLabelDTO commonAtomLabelDTO2 = (CommonAtomLabelDTO) parcel2.readParcelable(cls.getClassLoader());
            Integer num4 = valueOf15;
            Style style = valueOf20;
            String readString4 = parcel2.readString();
            Boolean bool3 = valueOf4;
            Integer num5 = valueOf8;
            ArrayList arrayList10 = arrayList2;
            EnumC9751a enumC9751a = valueOf12;
            Integer num6 = valueOf16;
            String readString5 = parcel2.readString();
            Float f11 = valueOf17;
            String readString6 = parcel2.readString();
            if (parcel2.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt5 = parcel2.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt5);
                int i15 = 0;
                while (i15 != readInt5) {
                    i15 = B6.b.a(parcel2, linkedHashMap3, parcel2.readString(), i15, 1);
                    cls = cls;
                }
                linkedHashMap = linkedHashMap3;
            }
            Class<FinButtonV20DTO> cls2 = cls;
            if (parcel2.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt6 = parcel2.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt6);
                int i16 = 0;
                while (i16 != readInt6) {
                    i16 = C2859b.a(cls2, parcel2, linkedHashMap2, parcel2.readString(), i16, 1);
                    parcel2 = parcel;
                    readInt6 = readInt6;
                }
            }
            return new FinButtonV20DTO(c11, readString, num2, valueOf2, bool, bool3, bool2, valueOf6, num, num5, num3, valueOf10, arrayList9, arrayList10, f7, arrayList3, arrayList4, readString2, createStringArrayList, enumC9751a, readString3, valueOf13, valueOf14, num4, num6, f11, valueOf18, valueOf19, style, commonAtomLabelDTO, commonControlSettings, valueOf21, commonAtomLabelDTO2, readString4, readString5, readString6, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final FinButtonV20DTO[] newArray(int i11) {
            return new FinButtonV20DTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinButtonV20DTO(@NotNull CbottomElement2 type, @NotNull String id2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List<Integer> list, List<? extends EnumC9752b> list2, Float f11, List<Integer> list3, List<Integer> list4, String str, List<String> list5, EnumC9751a enumC9751a, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, ButtonDTO.Preset preset, Style style, @NotNull CommonAtomLabelDTO title, CommonControlSettings commonControlSettings, Boolean bool6, CommonAtomLabelDTO commonAtomLabelDTO, String str3, String str4, String str5, Map<String, String> map, Map<String, ComposerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
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
        this.preset = preset;
        this.style = style;
        this.title = title;
        this.common = commonControlSettings;
        this.isEnabled = bool6;
        this.subtitle = commonAtomLabelDTO;
        this.composerActionBehavior = str3;
        this.composerActionLink = str4;
        this.composerActionId = str5;
        this.composerActionParams = map;
        this.composerTrackingInfo = map2;
    }

    public static /* synthetic */ FinButtonV20DTO copy$default(FinButtonV20DTO finButtonV20DTO, CbottomElement2 cbottomElement2, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List list, List list2, Float f11, List list3, List list4, String str2, List list5, EnumC9751a enumC9751a, String str3, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, ButtonDTO.Preset preset, Style style, CommonAtomLabelDTO commonAtomLabelDTO, CommonControlSettings commonControlSettings, Boolean bool6, CommonAtomLabelDTO commonAtomLabelDTO2, String str4, String str5, String str6, Map map, Map map2, int i11, int i12, Object obj) {
        Map map3;
        Map map4;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        Float f13;
        Boolean bool7;
        ButtonDTO.Preset preset2;
        Style style2;
        CommonAtomLabelDTO commonAtomLabelDTO3;
        CommonControlSettings commonControlSettings2;
        Boolean bool8;
        CommonAtomLabelDTO commonAtomLabelDTO4;
        String str7;
        String str8;
        String str9;
        Float f14;
        Boolean bool9;
        Integer num14;
        Integer num15;
        Integer num16;
        Integer num17;
        Float f15;
        List list6;
        List list7;
        List list8;
        List list9;
        String str10;
        List list10;
        EnumC9751a enumC9751a2;
        String str11;
        String str12;
        Integer num18;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        CbottomElement2 cbottomElement22 = (i11 & 1) != 0 ? finButtonV20DTO.type : cbottomElement2;
        String str13 = (i11 & 2) != 0 ? finButtonV20DTO.id : str;
        Integer num19 = (i11 & 4) != 0 ? finButtonV20DTO.version : num;
        Boolean bool13 = (i11 & 8) != 0 ? finButtonV20DTO.clickable : bool;
        Boolean bool14 = (i11 & 16) != 0 ? finButtonV20DTO.touchDown : bool2;
        Boolean bool15 = (i11 & 32) != 0 ? finButtonV20DTO.skeletonable : bool3;
        Boolean bool16 = (i11 & 64) != 0 ? finButtonV20DTO.disableHighlightAnimation : bool4;
        Integer num20 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? finButtonV20DTO.width : num2;
        Integer num21 = (i11 & 256) != 0 ? finButtonV20DTO.height : num3;
        Integer num22 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? finButtonV20DTO.ratioW : num4;
        Integer num23 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? finButtonV20DTO.ratioH : num5;
        Float f16 = (i11 & 2048) != 0 ? finButtonV20DTO.percentW : f7;
        List list11 = (i11 & 4096) != 0 ? finButtonV20DTO.margins : list;
        List list12 = (i11 & 8192) != 0 ? finButtonV20DTO.layoutGravity : list2;
        CbottomElement2 cbottomElement23 = cbottomElement22;
        Float f17 = (i11 & 16384) != 0 ? finButtonV20DTO.layoutWeight : f11;
        List list13 = (i11 & 32768) != 0 ? finButtonV20DTO.paddings : list3;
        List list14 = (i11 & 65536) != 0 ? finButtonV20DTO.backgroundRadius : list4;
        String str14 = (i11 & 131072) != 0 ? finButtonV20DTO.backgroundColor : str2;
        List list15 = (i11 & 262144) != 0 ? finButtonV20DTO.backgroundGradient : list5;
        EnumC9751a enumC9751a3 = (i11 & 524288) != 0 ? finButtonV20DTO.backgroundGradientOrientation : enumC9751a;
        String str15 = (i11 & 1048576) != 0 ? finButtonV20DTO.strokeColor : str3;
        Integer num24 = (i11 & 2097152) != 0 ? finButtonV20DTO.strokeWidth : num6;
        Integer num25 = (i11 & 4194304) != 0 ? finButtonV20DTO.dashWidth : num7;
        Integer num26 = (i11 & 8388608) != 0 ? finButtonV20DTO.dashGap : num8;
        Integer num27 = (i11 & 16777216) != 0 ? finButtonV20DTO.elevation : num9;
        Float f18 = (i11 & 33554432) != 0 ? finButtonV20DTO.alpha : f12;
        Boolean bool17 = (i11 & 67108864) != 0 ? finButtonV20DTO.isHidden : bool5;
        ButtonDTO.Preset preset3 = (i11 & 134217728) != 0 ? finButtonV20DTO.preset : preset;
        Style style3 = (i11 & 268435456) != 0 ? finButtonV20DTO.style : style;
        CommonAtomLabelDTO commonAtomLabelDTO5 = (i11 & 536870912) != 0 ? finButtonV20DTO.title : commonAtomLabelDTO;
        CommonControlSettings commonControlSettings3 = (i11 & 1073741824) != 0 ? finButtonV20DTO.common : commonControlSettings;
        Boolean bool18 = (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? finButtonV20DTO.isEnabled : bool6;
        CommonAtomLabelDTO commonAtomLabelDTO6 = (i12 & 1) != 0 ? finButtonV20DTO.subtitle : commonAtomLabelDTO2;
        String str16 = (i12 & 2) != 0 ? finButtonV20DTO.composerActionBehavior : str4;
        String str17 = (i12 & 4) != 0 ? finButtonV20DTO.composerActionLink : str5;
        String str18 = (i12 & 8) != 0 ? finButtonV20DTO.composerActionId : str6;
        Map map5 = (i12 & 16) != 0 ? finButtonV20DTO.composerActionParams : map;
        if ((i12 & 32) != 0) {
            map4 = map5;
            map3 = finButtonV20DTO.composerTrackingInfo;
            num11 = num25;
            num12 = num26;
            num13 = num27;
            f13 = f18;
            bool7 = bool17;
            preset2 = preset3;
            style2 = style3;
            commonAtomLabelDTO3 = commonAtomLabelDTO5;
            commonControlSettings2 = commonControlSettings3;
            bool8 = bool18;
            commonAtomLabelDTO4 = commonAtomLabelDTO6;
            str7 = str16;
            str8 = str17;
            str9 = str18;
            f14 = f17;
            num14 = num20;
            num15 = num21;
            num16 = num22;
            num17 = num23;
            f15 = f16;
            list6 = list11;
            list7 = list12;
            list8 = list13;
            list9 = list14;
            str10 = str14;
            list10 = list15;
            enumC9751a2 = enumC9751a3;
            str11 = str15;
            num10 = num24;
            str12 = str13;
            num18 = num19;
            bool10 = bool13;
            bool11 = bool14;
            bool12 = bool15;
            bool9 = bool16;
        } else {
            map3 = map2;
            map4 = map5;
            num10 = num24;
            num11 = num25;
            num12 = num26;
            num13 = num27;
            f13 = f18;
            bool7 = bool17;
            preset2 = preset3;
            style2 = style3;
            commonAtomLabelDTO3 = commonAtomLabelDTO5;
            commonControlSettings2 = commonControlSettings3;
            bool8 = bool18;
            commonAtomLabelDTO4 = commonAtomLabelDTO6;
            str7 = str16;
            str8 = str17;
            str9 = str18;
            f14 = f17;
            bool9 = bool16;
            num14 = num20;
            num15 = num21;
            num16 = num22;
            num17 = num23;
            f15 = f16;
            list6 = list11;
            list7 = list12;
            list8 = list13;
            list9 = list14;
            str10 = str14;
            list10 = list15;
            enumC9751a2 = enumC9751a3;
            str11 = str15;
            str12 = str13;
            num18 = num19;
            bool10 = bool13;
            bool11 = bool14;
            bool12 = bool15;
        }
        return finButtonV20DTO.copy(cbottomElement23, str12, num18, bool10, bool11, bool12, bool9, num14, num15, num16, num17, f15, list6, list7, f14, list8, list9, str10, list10, enumC9751a2, str11, num10, num11, num12, num13, f13, bool7, preset2, style2, commonAtomLabelDTO3, commonControlSettings2, bool8, commonAtomLabelDTO4, str7, str8, str9, map4, map3);
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
    public final ButtonDTO.Preset getPreset() {
        return this.preset;
    }

    /* renamed from: component29, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component30, reason: from getter */
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    /* renamed from: component31, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component32, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component33, reason: from getter */
    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component34, reason: from getter */
    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    /* renamed from: component35, reason: from getter */
    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    /* renamed from: component36, reason: from getter */
    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final Map<String, String> component37() {
        return this.composerActionParams;
    }

    public final Map<String, ComposerTrackingInfo> component38() {
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
    public final FinButtonV20DTO copy(@NotNull CbottomElement2 type, @NotNull String id2, Integer version, Boolean clickable, Boolean touchDown, Boolean skeletonable, Boolean disableHighlightAnimation, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, List<Integer> margins, List<? extends EnumC9752b> layoutGravity, Float layoutWeight, List<Integer> paddings, List<Integer> backgroundRadius, String backgroundColor, List<String> backgroundGradient, EnumC9751a backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Float alpha, Boolean isHidden, ButtonDTO.Preset preset, Style style, @NotNull CommonAtomLabelDTO title, CommonControlSettings common, Boolean isEnabled, CommonAtomLabelDTO subtitle, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new FinButtonV20DTO(type, id2, version, clickable, touchDown, skeletonable, disableHighlightAnimation, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundColor, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, alpha, isHidden, preset, style, title, common, isEnabled, subtitle, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinButtonV20DTO)) {
            return false;
        }
        FinButtonV20DTO finButtonV20DTO = (FinButtonV20DTO) other;
        return this.type == finButtonV20DTO.type && Intrinsics.d(this.id, finButtonV20DTO.id) && Intrinsics.d(this.version, finButtonV20DTO.version) && Intrinsics.d(this.clickable, finButtonV20DTO.clickable) && Intrinsics.d(this.touchDown, finButtonV20DTO.touchDown) && Intrinsics.d(this.skeletonable, finButtonV20DTO.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, finButtonV20DTO.disableHighlightAnimation) && Intrinsics.d(this.width, finButtonV20DTO.width) && Intrinsics.d(this.height, finButtonV20DTO.height) && Intrinsics.d(this.ratioW, finButtonV20DTO.ratioW) && Intrinsics.d(this.ratioH, finButtonV20DTO.ratioH) && Intrinsics.d(this.percentW, finButtonV20DTO.percentW) && Intrinsics.d(this.margins, finButtonV20DTO.margins) && Intrinsics.d(this.layoutGravity, finButtonV20DTO.layoutGravity) && Intrinsics.d(this.layoutWeight, finButtonV20DTO.layoutWeight) && Intrinsics.d(this.paddings, finButtonV20DTO.paddings) && Intrinsics.d(this.backgroundRadius, finButtonV20DTO.backgroundRadius) && Intrinsics.d(this.backgroundColor, finButtonV20DTO.backgroundColor) && Intrinsics.d(this.backgroundGradient, finButtonV20DTO.backgroundGradient) && this.backgroundGradientOrientation == finButtonV20DTO.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, finButtonV20DTO.strokeColor) && Intrinsics.d(this.strokeWidth, finButtonV20DTO.strokeWidth) && Intrinsics.d(this.dashWidth, finButtonV20DTO.dashWidth) && Intrinsics.d(this.dashGap, finButtonV20DTO.dashGap) && Intrinsics.d(this.elevation, finButtonV20DTO.elevation) && Intrinsics.d(this.alpha, finButtonV20DTO.alpha) && Intrinsics.d(this.isHidden, finButtonV20DTO.isHidden) && this.preset == finButtonV20DTO.preset && this.style == finButtonV20DTO.style && Intrinsics.d(this.title, finButtonV20DTO.title) && Intrinsics.d(this.common, finButtonV20DTO.common) && Intrinsics.d(this.isEnabled, finButtonV20DTO.isEnabled) && Intrinsics.d(this.subtitle, finButtonV20DTO.subtitle) && Intrinsics.d(this.composerActionBehavior, finButtonV20DTO.composerActionBehavior) && Intrinsics.d(this.composerActionLink, finButtonV20DTO.composerActionLink) && Intrinsics.d(this.composerActionId, finButtonV20DTO.composerActionId) && Intrinsics.d(this.composerActionParams, finButtonV20DTO.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, finButtonV20DTO.composerTrackingInfo);
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

    public final CommonControlSettings getCommon() {
        return this.common;
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

    public final ButtonDTO.Preset getPreset() {
        return this.preset;
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

    public final Style getStyle() {
        return this.style;
    }

    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
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
        int hashCode25 = (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        ButtonDTO.Preset preset = this.preset;
        int hashCode26 = (hashCode25 + (preset == null ? 0 : preset.hashCode())) * 31;
        Style style = this.style;
        int b11 = d.b(this.title, (hashCode26 + (style == null ? 0 : style.hashCode())) * 31, 31);
        CommonControlSettings commonControlSettings = this.common;
        int hashCode27 = (b11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        Boolean bool6 = this.isEnabled;
        int hashCode28 = (hashCode27 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode29 = (hashCode28 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        String str3 = this.composerActionBehavior;
        int hashCode30 = (hashCode29 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.composerActionLink;
        int hashCode31 = (hashCode30 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.composerActionId;
        int hashCode32 = (hashCode31 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode33 = (hashCode32 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        return hashCode33 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
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
        ButtonDTO.Preset preset = this.preset;
        Style style = this.style;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonControlSettings commonControlSettings = this.common;
        Boolean bool6 = this.isEnabled;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        String str4 = this.composerActionBehavior;
        String str5 = this.composerActionLink;
        String str6 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder f13 = D40.a.f("FinButtonV20DTO(type=", cbottomElement2, ", id=", str, ", version=");
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
        f13.append(", preset=");
        f13.append(preset);
        f13.append(", style=");
        f13.append(style);
        f13.append(", title=");
        f13.append(commonAtomLabelDTO);
        f13.append(", common=");
        f13.append(commonControlSettings);
        f13.append(", isEnabled=");
        f13.append(bool6);
        f13.append(", subtitle=");
        f13.append(commonAtomLabelDTO2);
        f13.append(", composerActionBehavior=");
        f13.append(str4);
        f13.append(", composerActionLink=");
        Nh.a.h(f13, str5, ", composerActionId=", str6, ", composerActionParams=");
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
        ButtonDTO.Preset preset = this.preset;
        if (preset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(preset.name());
        }
        Style style = this.style;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style.name());
        }
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.common, flags);
        Boolean bool6 = this.isEnabled;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool6);
        }
        dest.writeParcelable(this.subtitle, flags);
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
    public /* synthetic */ FinButtonV20DTO(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2 r42, java.lang.String r43, java.lang.Integer r44, java.lang.Boolean r45, java.lang.Boolean r46, java.lang.Boolean r47, java.lang.Boolean r48, java.lang.Integer r49, java.lang.Integer r50, java.lang.Integer r51, java.lang.Integer r52, java.lang.Float r53, java.util.List r54, java.util.List r55, java.lang.Float r56, java.util.List r57, java.util.List r58, java.lang.String r59, java.util.List r60, t40.EnumC9751a r61, java.lang.String r62, java.lang.Integer r63, java.lang.Integer r64, java.lang.Integer r65, java.lang.Integer r66, java.lang.Float r67, java.lang.Boolean r68, ru.ozon.uni.atoms.data.controls.button.ButtonDTO.Preset r69, ru.ozon.uni.atoms.data.controls.button.Style r70, ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO r71, ru.ozon.uni.atoms.data.controls.CommonControlSettings r72, java.lang.Boolean r73, ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.util.Map r78, java.util.Map r79, int r80, int r81, kotlin.jvm.internal.DefaultConstructorMarker r82) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV20DTO.<init>(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.util.List, java.util.List, java.lang.Float, java.util.List, java.util.List, java.lang.String, java.util.List, t40.a, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Boolean, ru.ozon.uni.atoms.data.controls.button.ButtonDTO$Preset, ru.ozon.uni.atoms.data.controls.button.Style, ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO, ru.ozon.uni.atoms.data.controls.CommonControlSettings, java.lang.Boolean, ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
