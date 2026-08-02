package ru.ozon.fintech.features.cbottombase.models.widgets.v2;

import Ak.C2436a;
import B0.C2454a;
import B4.V;
import B90.C2616s;
import B90.C2619v;
import C.J;
import D3.h;
import De.C2859b;
import De.C2860c;
import Ef0.c;
import G.g;
import GZ.e;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
import ru.ozon.uni.android.cell.text.data.TextFieldPreset;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import t40.EnumC9751a;
import t40.EnumC9752b;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bF\n\u0002\u0010\u0000\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001:\u0002Ì\u0001BÙ\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\b\u0012\b\u0010.\u001a\u0004\u0018\u00010\b\u0012\b\u0010/\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010>\u0012\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020@\u0018\u00010>¢\u0006\u0004\bB\u0010CJ\u001d\u0010H\u001a\u00020G2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u0006¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bT\u0010SJ\u0012\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bU\u0010SJ\u0012\u0010V\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bV\u0010SJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bW\u0010QJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bX\u0010QJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bY\u0010QJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bZ\u0010QJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0018\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0018\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b_\u0010^J\u0012\u0010`\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b`\u0010\\J\u0018\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\ba\u0010^J\u0018\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bb\u0010^J\u0012\u0010c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bc\u0010OJ\u0018\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bd\u0010^J\u0012\u0010e\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bg\u0010OJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bh\u0010QJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bi\u0010QJ\u0012\u0010j\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bj\u0010QJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bk\u0010QJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bl\u0010\\J\u0012\u0010m\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bm\u0010SJ\u0012\u0010n\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bp\u0010OJ\u0012\u0010q\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bq\u0010OJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\br\u0010OJ\u0012\u0010s\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bs\u0010OJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bt\u0010OJ\u0012\u0010u\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bu\u0010OJ\u0012\u0010v\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bv\u0010SJ\u0012\u0010w\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bw\u0010SJ\u0012\u0010x\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bx\u0010SJ\u0012\u0010y\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\by\u0010QJ\u0012\u0010z\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\bz\u0010{J\u0012\u0010|\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\b|\u0010}J\u0012\u0010~\u001a\u0004\u0018\u000105HÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ\u0015\u0010\u0080\u0001\u001a\u0004\u0018\u000107HÆ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u000109HÆ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010OJ\u0014\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010OJ\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010OJ!\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010>HÆ\u0003¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J!\u0010\u0089\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020@\u0018\u00010>HÆ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001J\u0085\u0005\u0010\u008a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010>2\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020@\u0018\u00010>HÆ\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0012\u0010\u008c\u0001\u001a\u00020\u0004HÖ\u0001¢\u0006\u0005\b\u008c\u0001\u0010OJ\u0012\u0010\u008d\u0001\u001a\u00020\u0006HÖ\u0001¢\u0006\u0005\b\u008d\u0001\u0010KJ\u001f\u0010\u0090\u0001\u001a\u00020\b2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001HÖ\u0003¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010MR\u001c\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010OR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010QR\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010SR\u001e\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u0098\u0001\u001a\u0005\b\u009a\u0001\u0010SR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u0098\u0001\u001a\u0005\b\u009b\u0001\u0010SR\u001e\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u0098\u0001\u001a\u0005\b\u009c\u0001\u0010SR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u0096\u0001\u001a\u0005\b\u009d\u0001\u0010QR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u0096\u0001\u001a\u0005\b\u009e\u0001\u0010QR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0096\u0001\u001a\u0005\b\u009f\u0001\u0010QR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u0096\u0001\u001a\u0005\b \u0001\u0010QR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010\\R$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010£\u0001\u001a\u0005\b¤\u0001\u0010^R$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010£\u0001\u001a\u0005\b¥\u0001\u0010^R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010¡\u0001\u001a\u0005\b¦\u0001\u0010\\R$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010£\u0001\u001a\u0005\b§\u0001\u0010^R$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010£\u0001\u001a\u0005\b¨\u0001\u0010^R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0094\u0001\u001a\u0005\b©\u0001\u0010OR$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010£\u0001\u001a\u0005\bª\u0001\u0010^R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010«\u0001\u001a\u0005\b¬\u0001\u0010fR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u0094\u0001\u001a\u0005\b\u00ad\u0001\u0010OR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u0096\u0001\u001a\u0005\b®\u0001\u0010QR\u001e\u0010 \u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b \u0010\u0096\u0001\u001a\u0005\b¯\u0001\u0010QR\u001e\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b!\u0010\u0096\u0001\u001a\u0005\b°\u0001\u0010QR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u0096\u0001\u001a\u0005\b±\u0001\u0010QR\u001e\u0010#\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b#\u0010¡\u0001\u001a\u0005\b²\u0001\u0010\\R\u001d\u0010$\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b$\u0010\u0098\u0001\u001a\u0004\b$\u0010SR\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010³\u0001\u001a\u0005\b´\u0001\u0010oR\u001e\u0010'\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0094\u0001\u001a\u0005\bµ\u0001\u0010OR\u001e\u0010(\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u0094\u0001\u001a\u0005\b¶\u0001\u0010OR\u001e\u0010)\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010\u0094\u0001\u001a\u0005\b·\u0001\u0010OR\u001e\u0010*\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u0094\u0001\u001a\u0005\b¸\u0001\u0010OR\u001e\u0010+\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010\u0094\u0001\u001a\u0005\b¹\u0001\u0010OR\u001e\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u0094\u0001\u001a\u0005\bº\u0001\u0010OR\u001d\u0010-\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b-\u0010\u0098\u0001\u001a\u0004\b-\u0010SR\u001d\u0010.\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b.\u0010\u0098\u0001\u001a\u0004\b.\u0010SR\u001d\u0010/\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b/\u0010\u0098\u0001\u001a\u0004\b/\u0010SR\u001e\u00100\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010\u0096\u0001\u001a\u0005\b»\u0001\u0010QR\u001e\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010¼\u0001\u001a\u0005\b½\u0001\u0010{R\u001e\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010¾\u0001\u001a\u0005\b¿\u0001\u0010}R\u001e\u00106\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b6\u0010À\u0001\u001a\u0005\bÁ\u0001\u0010\u007fR\u001f\u00108\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b8\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010\u0081\u0001R\u001f\u0010:\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b:\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010\u0083\u0001R\u001e\u0010;\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b;\u0010\u0094\u0001\u001a\u0005\bÆ\u0001\u0010OR\u001e\u0010<\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b<\u0010\u0094\u0001\u001a\u0005\bÇ\u0001\u0010OR\u001e\u0010=\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b=\u0010\u0094\u0001\u001a\u0005\bÈ\u0001\u0010OR+\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010>8\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b?\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010\u0088\u0001R+\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020@\u0018\u00010>8\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bA\u0010É\u0001\u001a\u0006\bË\u0001\u0010\u0088\u0001¨\u0006Í\u0001"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO;", "LF40/a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "type", "", "id", "", "version", "", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "", "percentW", "", "margins", "Lt40/b;", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "Lt40/a;", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "alpha", "isHidden", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO$b;", "textFieldPreset", "inputTitle", "inputValue", "labelText", "labelTextColor", "labelIcon", "labelIconColor", "isInputCopyEnabled", "isInputResetEnabled", "isInputProtected", "versionStamp", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "labelIconPosition", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "inputState", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "inputStatus", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "inputKeyboardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "inputKeyboardAction", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Float;", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lt40/a;", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO$b;", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "()Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "component40", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "component41", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "component42", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "component43", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "component44", "component45", "component46", "component47", "()Ljava/util/Map;", "component48", "copy", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getClickable", "getTouchDown", "getSkeletonable", "getDisableHighlightAnimation", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "Ljava/util/List;", "getMargins", "getLayoutGravity", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundColor", "getBackgroundGradient", "Lt40/a;", "getBackgroundGradientOrientation", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getAlpha", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextFieldV20DTO$b;", "getTextFieldPreset", "getInputTitle", "getInputValue", "getLabelText", "getLabelTextColor", "getLabelIcon", "getLabelIconColor", "getVersionStamp", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "getLabelIconPosition", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "getInputState", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "getInputStatus", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "getInputKeyboardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "getInputKeyboardAction", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "b", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextFieldV20DTO implements F40.a {

    @NotNull
    public static final Parcelable.Creator<TextFieldV20DTO> CREATOR = new a();

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

    @i(name = "inputKeyboardAction")
    @EnumNullFallback
    private final OzonTextInputLayoutModel.KeyboardAction inputKeyboardAction;

    @i(name = "inputKeyboardType")
    @EnumNullFallback
    private final OzonTextInputLayoutModel.KeyboardType inputKeyboardType;

    @i(name = "inputState")
    @EnumNullFallback
    private final OzonTextInputLayoutModel.State inputState;

    @i(name = "inputStatus")
    @EnumNullFallback
    private final OzonTextInputLayoutModel.Status inputStatus;

    @i(name = "inputTitle")
    private final String inputTitle;

    @i(name = "inputValue")
    private final String inputValue;

    @i(name = "isHidden")
    private final Boolean isHidden;

    @i(name = "isInputCopyEnabled")
    private final Boolean isInputCopyEnabled;

    @i(name = "isInputProtected")
    private final Boolean isInputProtected;

    @i(name = "isInputResetEnabled")
    private final Boolean isInputResetEnabled;

    @i(name = "labelIcon")
    private final String labelIcon;

    @i(name = "labelIconColor")
    private final String labelIconColor;

    @i(name = "labelIconPosition")
    @EnumNullFallback
    private final AddonSide labelIconPosition;

    @i(name = "labelText")
    private final String labelText;

    @i(name = "labelTextColor")
    private final String labelTextColor;

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

    @i(name = "textFieldPreset")
    private final b textFieldPreset;

    @i(name = "touchDown")
    private final Boolean touchDown;

    @i(name = "type")
    @NotNull
    private final CbottomElement2 type;

    @i(name = "version")
    private final Integer version;

    @i(name = "versionStamp")
    private final Integer versionStamp;

    @i(name = "width")
    private final Integer width;

    public static final class a implements Parcelable.Creator<TextFieldV20DTO> {
        @Override // android.os.Parcelable.Creator
        public final TextFieldV20DTO createFromParcel(Parcel parcel) {
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
            b valueOf19 = parcel2.readInt() == 0 ? null : b.valueOf(parcel2.readString());
            Integer num4 = valueOf15;
            String readString4 = parcel2.readString();
            Boolean bool3 = valueOf4;
            Integer num5 = valueOf8;
            ArrayList arrayList10 = arrayList2;
            EnumC9751a enumC9751a = valueOf12;
            Integer num6 = valueOf16;
            String readString5 = parcel2.readString();
            Float f11 = valueOf17;
            String readString6 = parcel2.readString();
            Boolean bool4 = valueOf2;
            Integer num7 = valueOf6;
            Float f12 = valueOf10;
            ArrayList arrayList11 = arrayList3;
            Integer num8 = valueOf13;
            Boolean bool5 = valueOf18;
            String readString7 = parcel2.readString();
            ArrayList arrayList12 = arrayList4;
            Integer num9 = valueOf14;
            b bVar = valueOf19;
            String readString8 = parcel2.readString();
            String readString9 = parcel2.readString();
            Boolean valueOf20 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Boolean valueOf21 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Boolean valueOf22 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Integer valueOf23 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            AddonSide valueOf24 = parcel2.readInt() == 0 ? null : AddonSide.valueOf(parcel2.readString());
            OzonTextInputLayoutModel.State valueOf25 = parcel2.readInt() == 0 ? null : OzonTextInputLayoutModel.State.valueOf(parcel2.readString());
            OzonTextInputLayoutModel.Status valueOf26 = parcel2.readInt() == 0 ? null : OzonTextInputLayoutModel.Status.valueOf(parcel2.readString());
            OzonTextInputLayoutModel.KeyboardType valueOf27 = parcel2.readInt() == 0 ? null : OzonTextInputLayoutModel.KeyboardType.valueOf(parcel2.readString());
            OzonTextInputLayoutModel.KeyboardAction valueOf28 = parcel2.readInt() == 0 ? null : OzonTextInputLayoutModel.KeyboardAction.valueOf(parcel2.readString());
            Boolean bool6 = valueOf21;
            OzonTextInputLayoutModel.State state = valueOf25;
            String readString10 = parcel2.readString();
            Boolean bool7 = valueOf22;
            OzonTextInputLayoutModel.Status status = valueOf26;
            String readString11 = parcel2.readString();
            Integer num10 = valueOf23;
            OzonTextInputLayoutModel.KeyboardType keyboardType = valueOf27;
            String readString12 = parcel2.readString();
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
                    i16 = C2859b.a(TextFieldV20DTO.class, parcel2, linkedHashMap2, parcel2.readString(), i16, 1);
                    parcel2 = parcel;
                    readInt6 = readInt6;
                }
            }
            return new TextFieldV20DTO(c11, readString, num2, bool4, bool, bool3, bool2, num7, num, num5, num3, f12, arrayList9, arrayList10, f7, arrayList11, arrayList12, readString2, createStringArrayList, enumC9751a, readString3, num8, num9, num4, num6, f11, bool5, bVar, readString4, readString5, readString6, readString7, readString8, readString9, valueOf20, bool6, bool7, num10, valueOf24, state, status, keyboardType, valueOf28, readString10, readString11, readString12, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final TextFieldV20DTO[] newArray(int i11) {
            return new TextFieldV20DTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DEFAULT500END;
        public static final b DEFAULT500START;
        public static final b DEFAULT500ZEROPADDING;
        public static final b DEFAULT600ACCENTEND;
        public static final b DEFAULT600ACCENTSTART;
        public static final b DEFAULT600ACCENTZEROPADDING;
        public static final b DEFAULT600END;
        public static final b DEFAULT600START;
        public static final b DEFAULT600ZEROPADDING;

        @NotNull
        private final TextFieldPreset preset;

        static {
            TextFieldPresets textFieldPresets = TextFieldPresets.INSTANCE;
            b bVar = new b("DEFAULT500START", 0, textFieldPresets.getDefault500Start());
            DEFAULT500START = bVar;
            b bVar2 = new b("DEFAULT500END", 1, textFieldPresets.getDefault500End());
            DEFAULT500END = bVar2;
            b bVar3 = new b("DEFAULT600START", 2, textFieldPresets.getDefault600Start());
            DEFAULT600START = bVar3;
            b bVar4 = new b("DEFAULT600END", 3, textFieldPresets.getDefault600End());
            DEFAULT600END = bVar4;
            b bVar5 = new b("DEFAULT600ACCENTSTART", 4, textFieldPresets.getDefault600AccentStart());
            DEFAULT600ACCENTSTART = bVar5;
            b bVar6 = new b("DEFAULT600ACCENTEND", 5, textFieldPresets.getDefault600AccentEnd());
            DEFAULT600ACCENTEND = bVar6;
            b bVar7 = new b("DEFAULT500ZEROPADDING", 6, textFieldPresets.getDefault500ZeroPadding());
            DEFAULT500ZEROPADDING = bVar7;
            b bVar8 = new b("DEFAULT600ZEROPADDING", 7, textFieldPresets.getDefault600ZeroPadding());
            DEFAULT600ZEROPADDING = bVar8;
            b bVar9 = new b("DEFAULT600ACCENTZEROPADDING", 8, textFieldPresets.getDefault600AccentZeroPadding());
            DEFAULT600ACCENTZEROPADDING = bVar9;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b(String str, int i11, TextFieldPreset textFieldPreset) {
            this.preset = textFieldPreset;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @NotNull
        public final TextFieldPreset a() {
            return this.preset;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldV20DTO(@NotNull CbottomElement2 type, @NotNull String id2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List<Integer> list, List<? extends EnumC9752b> list2, Float f11, List<Integer> list3, List<Integer> list4, String str, List<String> list5, EnumC9751a enumC9751a, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, Boolean bool5, b bVar, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool6, Boolean bool7, Boolean bool8, Integer num10, AddonSide addonSide, OzonTextInputLayoutModel.State state, OzonTextInputLayoutModel.Status status, OzonTextInputLayoutModel.KeyboardType keyboardType, OzonTextInputLayoutModel.KeyboardAction keyboardAction, String str9, String str10, String str11, Map<String, String> map, Map<String, ComposerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
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
        this.textFieldPreset = bVar;
        this.inputTitle = str3;
        this.inputValue = str4;
        this.labelText = str5;
        this.labelTextColor = str6;
        this.labelIcon = str7;
        this.labelIconColor = str8;
        this.isInputCopyEnabled = bool6;
        this.isInputResetEnabled = bool7;
        this.isInputProtected = bool8;
        this.versionStamp = num10;
        this.labelIconPosition = addonSide;
        this.inputState = state;
        this.inputStatus = status;
        this.inputKeyboardType = keyboardType;
        this.inputKeyboardAction = keyboardAction;
        this.composerActionBehavior = str9;
        this.composerActionLink = str10;
        this.composerActionId = str11;
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
    public final b getTextFieldPreset() {
        return this.textFieldPreset;
    }

    /* renamed from: component29, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component30, reason: from getter */
    public final String getInputValue() {
        return this.inputValue;
    }

    /* renamed from: component31, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    /* renamed from: component32, reason: from getter */
    public final String getLabelTextColor() {
        return this.labelTextColor;
    }

    /* renamed from: component33, reason: from getter */
    public final String getLabelIcon() {
        return this.labelIcon;
    }

    /* renamed from: component34, reason: from getter */
    public final String getLabelIconColor() {
        return this.labelIconColor;
    }

    /* renamed from: component35, reason: from getter */
    public final Boolean getIsInputCopyEnabled() {
        return this.isInputCopyEnabled;
    }

    /* renamed from: component36, reason: from getter */
    public final Boolean getIsInputResetEnabled() {
        return this.isInputResetEnabled;
    }

    /* renamed from: component37, reason: from getter */
    public final Boolean getIsInputProtected() {
        return this.isInputProtected;
    }

    /* renamed from: component38, reason: from getter */
    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    /* renamed from: component39, reason: from getter */
    public final AddonSide getLabelIconPosition() {
        return this.labelIconPosition;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getClickable() {
        return this.clickable;
    }

    /* renamed from: component40, reason: from getter */
    public final OzonTextInputLayoutModel.State getInputState() {
        return this.inputState;
    }

    /* renamed from: component41, reason: from getter */
    public final OzonTextInputLayoutModel.Status getInputStatus() {
        return this.inputStatus;
    }

    /* renamed from: component42, reason: from getter */
    public final OzonTextInputLayoutModel.KeyboardType getInputKeyboardType() {
        return this.inputKeyboardType;
    }

    /* renamed from: component43, reason: from getter */
    public final OzonTextInputLayoutModel.KeyboardAction getInputKeyboardAction() {
        return this.inputKeyboardAction;
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
    public final TextFieldV20DTO copy(@NotNull CbottomElement2 type, @NotNull String id2, Integer version, Boolean clickable, Boolean touchDown, Boolean skeletonable, Boolean disableHighlightAnimation, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, List<Integer> margins, List<? extends EnumC9752b> layoutGravity, Float layoutWeight, List<Integer> paddings, List<Integer> backgroundRadius, String backgroundColor, List<String> backgroundGradient, EnumC9751a backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Float alpha, Boolean isHidden, b textFieldPreset, String inputTitle, String inputValue, String labelText, String labelTextColor, String labelIcon, String labelIconColor, Boolean isInputCopyEnabled, Boolean isInputResetEnabled, Boolean isInputProtected, Integer versionStamp, AddonSide labelIconPosition, OzonTextInputLayoutModel.State inputState, OzonTextInputLayoutModel.Status inputStatus, OzonTextInputLayoutModel.KeyboardType inputKeyboardType, OzonTextInputLayoutModel.KeyboardAction inputKeyboardAction, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new TextFieldV20DTO(type, id2, version, clickable, touchDown, skeletonable, disableHighlightAnimation, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundColor, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, alpha, isHidden, textFieldPreset, inputTitle, inputValue, labelText, labelTextColor, labelIcon, labelIconColor, isInputCopyEnabled, isInputResetEnabled, isInputProtected, versionStamp, labelIconPosition, inputState, inputStatus, inputKeyboardType, inputKeyboardAction, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldV20DTO)) {
            return false;
        }
        TextFieldV20DTO textFieldV20DTO = (TextFieldV20DTO) other;
        return this.type == textFieldV20DTO.type && Intrinsics.d(this.id, textFieldV20DTO.id) && Intrinsics.d(this.version, textFieldV20DTO.version) && Intrinsics.d(this.clickable, textFieldV20DTO.clickable) && Intrinsics.d(this.touchDown, textFieldV20DTO.touchDown) && Intrinsics.d(this.skeletonable, textFieldV20DTO.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, textFieldV20DTO.disableHighlightAnimation) && Intrinsics.d(this.width, textFieldV20DTO.width) && Intrinsics.d(this.height, textFieldV20DTO.height) && Intrinsics.d(this.ratioW, textFieldV20DTO.ratioW) && Intrinsics.d(this.ratioH, textFieldV20DTO.ratioH) && Intrinsics.d(this.percentW, textFieldV20DTO.percentW) && Intrinsics.d(this.margins, textFieldV20DTO.margins) && Intrinsics.d(this.layoutGravity, textFieldV20DTO.layoutGravity) && Intrinsics.d(this.layoutWeight, textFieldV20DTO.layoutWeight) && Intrinsics.d(this.paddings, textFieldV20DTO.paddings) && Intrinsics.d(this.backgroundRadius, textFieldV20DTO.backgroundRadius) && Intrinsics.d(this.backgroundColor, textFieldV20DTO.backgroundColor) && Intrinsics.d(this.backgroundGradient, textFieldV20DTO.backgroundGradient) && this.backgroundGradientOrientation == textFieldV20DTO.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, textFieldV20DTO.strokeColor) && Intrinsics.d(this.strokeWidth, textFieldV20DTO.strokeWidth) && Intrinsics.d(this.dashWidth, textFieldV20DTO.dashWidth) && Intrinsics.d(this.dashGap, textFieldV20DTO.dashGap) && Intrinsics.d(this.elevation, textFieldV20DTO.elevation) && Intrinsics.d(this.alpha, textFieldV20DTO.alpha) && Intrinsics.d(this.isHidden, textFieldV20DTO.isHidden) && this.textFieldPreset == textFieldV20DTO.textFieldPreset && Intrinsics.d(this.inputTitle, textFieldV20DTO.inputTitle) && Intrinsics.d(this.inputValue, textFieldV20DTO.inputValue) && Intrinsics.d(this.labelText, textFieldV20DTO.labelText) && Intrinsics.d(this.labelTextColor, textFieldV20DTO.labelTextColor) && Intrinsics.d(this.labelIcon, textFieldV20DTO.labelIcon) && Intrinsics.d(this.labelIconColor, textFieldV20DTO.labelIconColor) && Intrinsics.d(this.isInputCopyEnabled, textFieldV20DTO.isInputCopyEnabled) && Intrinsics.d(this.isInputResetEnabled, textFieldV20DTO.isInputResetEnabled) && Intrinsics.d(this.isInputProtected, textFieldV20DTO.isInputProtected) && Intrinsics.d(this.versionStamp, textFieldV20DTO.versionStamp) && this.labelIconPosition == textFieldV20DTO.labelIconPosition && this.inputState == textFieldV20DTO.inputState && this.inputStatus == textFieldV20DTO.inputStatus && this.inputKeyboardType == textFieldV20DTO.inputKeyboardType && this.inputKeyboardAction == textFieldV20DTO.inputKeyboardAction && Intrinsics.d(this.composerActionBehavior, textFieldV20DTO.composerActionBehavior) && Intrinsics.d(this.composerActionLink, textFieldV20DTO.composerActionLink) && Intrinsics.d(this.composerActionId, textFieldV20DTO.composerActionId) && Intrinsics.d(this.composerActionParams, textFieldV20DTO.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, textFieldV20DTO.composerTrackingInfo);
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

    public final OzonTextInputLayoutModel.KeyboardAction getInputKeyboardAction() {
        return this.inputKeyboardAction;
    }

    public final OzonTextInputLayoutModel.KeyboardType getInputKeyboardType() {
        return this.inputKeyboardType;
    }

    public final OzonTextInputLayoutModel.State getInputState() {
        return this.inputState;
    }

    public final OzonTextInputLayoutModel.Status getInputStatus() {
        return this.inputStatus;
    }

    public final String getInputTitle() {
        return this.inputTitle;
    }

    public final String getInputValue() {
        return this.inputValue;
    }

    public final String getLabelIcon() {
        return this.labelIcon;
    }

    public final String getLabelIconColor() {
        return this.labelIconColor;
    }

    public final AddonSide getLabelIconPosition() {
        return this.labelIconPosition;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public final String getLabelTextColor() {
        return this.labelTextColor;
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

    public final b getTextFieldPreset() {
        return this.textFieldPreset;
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
        b bVar = this.textFieldPreset;
        int hashCode26 = (hashCode25 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.inputTitle;
        int hashCode27 = (hashCode26 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inputValue;
        int hashCode28 = (hashCode27 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.labelText;
        int hashCode29 = (hashCode28 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.labelTextColor;
        int hashCode30 = (hashCode29 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.labelIcon;
        int hashCode31 = (hashCode30 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.labelIconColor;
        int hashCode32 = (hashCode31 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool6 = this.isInputCopyEnabled;
        int hashCode33 = (hashCode32 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isInputResetEnabled;
        int hashCode34 = (hashCode33 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isInputProtected;
        int hashCode35 = (hashCode34 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num10 = this.versionStamp;
        int hashCode36 = (hashCode35 + (num10 == null ? 0 : num10.hashCode())) * 31;
        AddonSide addonSide = this.labelIconPosition;
        int hashCode37 = (hashCode36 + (addonSide == null ? 0 : addonSide.hashCode())) * 31;
        OzonTextInputLayoutModel.State state = this.inputState;
        int hashCode38 = (hashCode37 + (state == null ? 0 : state.hashCode())) * 31;
        OzonTextInputLayoutModel.Status status = this.inputStatus;
        int hashCode39 = (hashCode38 + (status == null ? 0 : status.hashCode())) * 31;
        OzonTextInputLayoutModel.KeyboardType keyboardType = this.inputKeyboardType;
        int hashCode40 = (hashCode39 + (keyboardType == null ? 0 : keyboardType.hashCode())) * 31;
        OzonTextInputLayoutModel.KeyboardAction keyboardAction = this.inputKeyboardAction;
        int hashCode41 = (hashCode40 + (keyboardAction == null ? 0 : keyboardAction.hashCode())) * 31;
        String str9 = this.composerActionBehavior;
        int hashCode42 = (hashCode41 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.composerActionLink;
        int hashCode43 = (hashCode42 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.composerActionId;
        int hashCode44 = (hashCode43 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode45 = (hashCode44 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        return hashCode45 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // F40.a
    public Boolean isHidden() {
        return this.isHidden;
    }

    public final Boolean isInputCopyEnabled() {
        return this.isInputCopyEnabled;
    }

    public final Boolean isInputProtected() {
        return this.isInputProtected;
    }

    public final Boolean isInputResetEnabled() {
        return this.isInputResetEnabled;
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
        b bVar = this.textFieldPreset;
        String str4 = this.inputTitle;
        String str5 = this.inputValue;
        String str6 = this.labelText;
        String str7 = this.labelTextColor;
        String str8 = this.labelIcon;
        String str9 = this.labelIconColor;
        Boolean bool6 = this.isInputCopyEnabled;
        Boolean bool7 = this.isInputResetEnabled;
        Boolean bool8 = this.isInputProtected;
        Integer num10 = this.versionStamp;
        AddonSide addonSide = this.labelIconPosition;
        OzonTextInputLayoutModel.State state = this.inputState;
        OzonTextInputLayoutModel.Status status = this.inputStatus;
        OzonTextInputLayoutModel.KeyboardType keyboardType = this.inputKeyboardType;
        OzonTextInputLayoutModel.KeyboardAction keyboardAction = this.inputKeyboardAction;
        String str10 = this.composerActionBehavior;
        String str11 = this.composerActionLink;
        String str12 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder f13 = D40.a.f("TextFieldV20DTO(type=", cbottomElement2, ", id=", str, ", version=");
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
        f13.append(", textFieldPreset=");
        f13.append(bVar);
        f13.append(", inputTitle=");
        Nh.a.h(f13, str4, ", inputValue=", str5, ", labelText=");
        Nh.a.h(f13, str6, ", labelTextColor=", str7, ", labelIcon=");
        Nh.a.h(f13, str8, ", labelIconColor=", str9, ", isInputCopyEnabled=");
        h.h(f13, bool6, ", isInputResetEnabled=", bool7, ", isInputProtected=");
        e.d(bool8, num10, ", versionStamp=", ", labelIconPosition=", f13);
        f13.append(addonSide);
        f13.append(", inputState=");
        f13.append(state);
        f13.append(", inputStatus=");
        f13.append(status);
        f13.append(", inputKeyboardType=");
        f13.append(keyboardType);
        f13.append(", inputKeyboardAction=");
        f13.append(keyboardAction);
        f13.append(", composerActionBehavior=");
        f13.append(str10);
        f13.append(", composerActionLink=");
        Nh.a.h(f13, str11, ", composerActionId=", str12, ", composerActionParams=");
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
        b bVar = this.textFieldPreset;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.inputTitle);
        dest.writeString(this.inputValue);
        dest.writeString(this.labelText);
        dest.writeString(this.labelTextColor);
        dest.writeString(this.labelIcon);
        dest.writeString(this.labelIconColor);
        Boolean bool6 = this.isInputCopyEnabled;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool6);
        }
        Boolean bool7 = this.isInputResetEnabled;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool7);
        }
        Boolean bool8 = this.isInputProtected;
        if (bool8 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool8);
        }
        Integer num10 = this.versionStamp;
        if (num10 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num10);
        }
        AddonSide addonSide = this.labelIconPosition;
        if (addonSide == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(addonSide.name());
        }
        OzonTextInputLayoutModel.State state = this.inputState;
        if (state == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(state.name());
        }
        OzonTextInputLayoutModel.Status status = this.inputStatus;
        if (status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(status.name());
        }
        OzonTextInputLayoutModel.KeyboardType keyboardType = this.inputKeyboardType;
        if (keyboardType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(keyboardType.name());
        }
        OzonTextInputLayoutModel.KeyboardAction keyboardAction = this.inputKeyboardAction;
        if (keyboardAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(keyboardAction.name());
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
    public /* synthetic */ TextFieldV20DTO(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2 r53, java.lang.String r54, java.lang.Integer r55, java.lang.Boolean r56, java.lang.Boolean r57, java.lang.Boolean r58, java.lang.Boolean r59, java.lang.Integer r60, java.lang.Integer r61, java.lang.Integer r62, java.lang.Integer r63, java.lang.Float r64, java.util.List r65, java.util.List r66, java.lang.Float r67, java.util.List r68, java.util.List r69, java.lang.String r70, java.util.List r71, t40.EnumC9751a r72, java.lang.String r73, java.lang.Integer r74, java.lang.Integer r75, java.lang.Integer r76, java.lang.Integer r77, java.lang.Float r78, java.lang.Boolean r79, ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextFieldV20DTO.b r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.lang.Boolean r87, java.lang.Boolean r88, java.lang.Boolean r89, java.lang.Integer r90, ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide r91, ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel.State r92, ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel.Status r93, ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel.KeyboardType r94, ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel.KeyboardAction r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.util.Map r99, java.util.Map r100, int r101, int r102, kotlin.jvm.internal.DefaultConstructorMarker r103) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextFieldV20DTO.<init>(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.util.List, java.util.List, java.lang.Float, java.util.List, java.util.List, java.lang.String, java.util.List, t40.a, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Boolean, ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextFieldV20DTO$b, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide, ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel$State, ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel$Status, ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel$KeyboardType, ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel$KeyboardAction, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
