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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bA\n\u0002\u0010\u0000\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u00102\u001a\u00020\b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u000108¢\u0006\u0004\b<\u0010=J\u001d\u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bN\u0010MJ\u0012\u0010O\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bO\u0010MJ\u0012\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bP\u0010MJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bQ\u0010KJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bR\u0010KJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bS\u0010KJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bT\u0010KJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0018\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0018\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bY\u0010XJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bZ\u0010VJ\u0018\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b[\u0010XJ\u0018\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\\\u0010XJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b]\u0010IJ\u0018\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b^\u0010XJ\u0012\u0010_\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\ba\u0010IJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bb\u0010KJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bc\u0010KJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bd\u0010KJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\be\u0010KJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bf\u0010VJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bg\u0010IJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bh\u0010IJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bi\u0010IJ\u0012\u0010j\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bj\u0010IJ\u0010\u0010k\u001a\u00020(HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0010\u0010m\u001a\u00020*HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bo\u0010IJ\u0012\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bp\u0010MJ\u0012\u0010q\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bq\u0010KJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\br\u0010KJ\u0012\u0010s\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bs\u0010MJ\u0012\u0010t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bt\u0010MJ\u0010\u0010u\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bu\u0010vJ\u0012\u0010w\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bw\u0010MJ\u0012\u0010x\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bx\u0010KJ\u0012\u0010y\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\by\u0010IJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bz\u0010IJ\u0012\u0010{\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b{\u0010IJ\u001e\u0010|\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000108HÆ\u0003¢\u0006\u0004\b|\u0010}J\u001e\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u000108HÆ\u0003¢\u0006\u0004\b~\u0010}Jå\u0004\u0010\u007f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b2\b\b\u0002\u00102\u001a\u00020\b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u000108HÆ\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u00020\u0004HÖ\u0001¢\u0006\u0005\b\u0081\u0001\u0010IJ\u0012\u0010\u0082\u0001\u001a\u00020\u0006HÖ\u0001¢\u0006\u0005\b\u0082\u0001\u0010EJ\u001f\u0010\u0085\u0001\u001a\u00020\b2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u0001HÖ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010GR\u001c\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010IR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010KR\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010MR\u001e\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u008d\u0001\u001a\u0005\b\u008f\u0001\u0010MR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u008d\u0001\u001a\u0005\b\u0090\u0001\u0010MR\u001e\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u008d\u0001\u001a\u0005\b\u0091\u0001\u0010MR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u008b\u0001\u001a\u0005\b\u0092\u0001\u0010KR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u008b\u0001\u001a\u0005\b\u0093\u0001\u0010KR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u008b\u0001\u001a\u0005\b\u0094\u0001\u0010KR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u008b\u0001\u001a\u0005\b\u0095\u0001\u0010KR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010VR$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010XR$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010\u0098\u0001\u001a\u0005\b\u009a\u0001\u0010XR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u0096\u0001\u001a\u0005\b\u009b\u0001\u0010VR$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u0098\u0001\u001a\u0005\b\u009c\u0001\u0010XR$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010\u0098\u0001\u001a\u0005\b\u009d\u0001\u0010XR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0089\u0001\u001a\u0005\b\u009e\u0001\u0010IR$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u0098\u0001\u001a\u0005\b\u009f\u0001\u0010XR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010 \u0001\u001a\u0005\b¡\u0001\u0010`R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u0089\u0001\u001a\u0005\b¢\u0001\u0010IR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u008b\u0001\u001a\u0005\b£\u0001\u0010KR\u001e\u0010 \u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b \u0010\u008b\u0001\u001a\u0005\b¤\u0001\u0010KR\u001e\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b!\u0010\u008b\u0001\u001a\u0005\b¥\u0001\u0010KR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u008b\u0001\u001a\u0005\b¦\u0001\u0010KR\u001e\u0010#\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0096\u0001\u001a\u0005\b§\u0001\u0010VR\u001e\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010\u0089\u0001\u001a\u0005\b¨\u0001\u0010IR\u001e\u0010%\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0089\u0001\u001a\u0005\b©\u0001\u0010IR\u001e\u0010&\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u0089\u0001\u001a\u0005\bª\u0001\u0010IR\u001e\u0010'\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0089\u0001\u001a\u0005\b«\u0001\u0010IR\u001c\u0010)\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010lR\u001c\u0010+\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010®\u0001\u001a\u0005\b¯\u0001\u0010nR\u001e\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u0089\u0001\u001a\u0005\b°\u0001\u0010IR\u001e\u0010-\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010\u008d\u0001\u001a\u0005\b±\u0001\u0010MR\u001e\u0010.\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010\u008b\u0001\u001a\u0005\b²\u0001\u0010KR\u001e\u0010/\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010\u008b\u0001\u001a\u0005\b³\u0001\u0010KR\u001d\u00100\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b0\u0010\u008d\u0001\u001a\u0004\b0\u0010MR\u001e\u00101\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010\u008d\u0001\u001a\u0005\b´\u0001\u0010MR\u001c\u00102\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010µ\u0001\u001a\u0005\b¶\u0001\u0010vR\u001d\u00103\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b3\u0010\u008d\u0001\u001a\u0004\b3\u0010MR\u001e\u00104\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010\u008b\u0001\u001a\u0005\b·\u0001\u0010KR\u001e\u00105\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b5\u0010\u0089\u0001\u001a\u0005\b¸\u0001\u0010IR\u001e\u00106\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b6\u0010\u0089\u0001\u001a\u0005\b¹\u0001\u0010IR\u001e\u00107\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b7\u0010\u0089\u0001\u001a\u0005\bº\u0001\u0010IR*\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001088\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b9\u0010»\u0001\u001a\u0005\b¼\u0001\u0010}R*\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u0001088\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b;\u0010»\u0001\u001a\u0005\b½\u0001\u0010}¨\u0006¾\u0001"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextAreaV22DTO;", "LF40/a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "type", "", "id", "", "version", "", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "", "percentW", "", "margins", "Lt40/b;", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundColor", "backgroundGradient", "Lt40/a;", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "alpha", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "caption", "captionColor", "Lru/ozon/fintech/ui/input/InputView$Status;", "status", "Lru/ozon/fintech/ui/input/InputView$State;", "state", "label", "bottomBar", "rows", "counter", "isResize", "disableClearButton", "hasInfoIcon", "isHidden", "versionStamp", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Status;Lru/ozon/fintech/ui/input/InputView$State;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Float;", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lt40/a;", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "()Lru/ozon/fintech/ui/input/InputView$Status;", "component32", "()Lru/ozon/fintech/ui/input/InputView$State;", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "()Z", "component40", "component41", "component42", "component43", "component44", "component45", "()Ljava/util/Map;", "component46", "copy", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/input/InputView$Status;Lru/ozon/fintech/ui/input/InputView$State;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextAreaV22DTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getClickable", "getTouchDown", "getSkeletonable", "getDisableHighlightAnimation", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "Ljava/util/List;", "getMargins", "getLayoutGravity", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundColor", "getBackgroundGradient", "Lt40/a;", "getBackgroundGradientOrientation", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getAlpha", "getValue", "getPlaceholder", "getCaption", "getCaptionColor", "Lru/ozon/fintech/ui/input/InputView$Status;", "getStatus", "Lru/ozon/fintech/ui/input/InputView$State;", "getState", "getLabel", "getBottomBar", "getRows", "getCounter", "getDisableClearButton", "Z", "getHasInfoIcon", "getVersionStamp", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextAreaV22DTO implements F40.a {

    @NotNull
    public static final Parcelable.Creator<TextAreaV22DTO> CREATOR = new a();

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

    @i(name = "bottomBar")
    private final Boolean bottomBar;

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

    @i(name = "counter")
    private final Integer counter;

    @i(name = "dashGap")
    private final Integer dashGap;

    @i(name = "dashWidth")
    private final Integer dashWidth;

    @i(name = "disableClearButton")
    private final Boolean disableClearButton;

    @i(name = "disableHighlightAnimation")
    private final Boolean disableHighlightAnimation;

    @i(name = "elevation")
    private final Integer elevation;

    @i(name = "hasInfoIcon")
    private final boolean hasInfoIcon;

    @i(name = "height")
    private final Integer height;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "isHidden")
    private final Boolean isHidden;

    @i(name = "isResize")
    private final Boolean isResize;

    @i(name = "label")
    private final String label;

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

    @i(name = HammersV3BodyDTO.PLACEHOLDER)
    private final String placeholder;

    @i(name = "ratioH")
    private final Integer ratioH;

    @i(name = "ratioW")
    private final Integer ratioW;

    @i(name = "rows")
    private final Integer rows;

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

    public static final class a implements Parcelable.Creator<TextAreaV22DTO> {
        @Override // android.os.Parcelable.Creator
        public final TextAreaV22DTO createFromParcel(Parcel parcel) {
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
            Boolean bool3 = valueOf2;
            Integer num4 = valueOf6;
            Float f11 = valueOf10;
            ArrayList arrayList10 = arrayList3;
            Integer num5 = valueOf13;
            String readString4 = parcel2.readString();
            ArrayList arrayList11 = arrayList4;
            Integer num6 = valueOf14;
            String readString5 = parcel2.readString();
            Integer num7 = valueOf15;
            String readString6 = parcel2.readString();
            Boolean bool4 = valueOf4;
            Integer num8 = valueOf8;
            ArrayList arrayList12 = arrayList2;
            EnumC9751a enumC9751a = valueOf12;
            Integer num9 = valueOf16;
            String readString7 = parcel2.readString();
            InputView.Status valueOf18 = InputView.Status.valueOf(parcel2.readString());
            InputView.State valueOf19 = InputView.State.valueOf(parcel2.readString());
            String readString8 = parcel2.readString();
            Boolean valueOf20 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Integer valueOf21 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf22 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Boolean valueOf23 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Boolean valueOf24 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Float f12 = valueOf17;
            Integer num10 = valueOf21;
            boolean z11 = parcel2.readInt() != 0;
            Boolean valueOf25 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Integer valueOf26 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Boolean bool5 = valueOf20;
            Boolean bool6 = valueOf24;
            String readString9 = parcel2.readString();
            String readString10 = parcel2.readString();
            Integer num11 = valueOf22;
            Boolean bool7 = valueOf25;
            String readString11 = parcel2.readString();
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
                    i16 = C2859b.a(TextAreaV22DTO.class, parcel2, linkedHashMap2, parcel2.readString(), i16, 1);
                    parcel2 = parcel;
                    readInt6 = readInt6;
                }
            }
            return new TextAreaV22DTO(c11, readString, num2, bool3, bool, bool4, bool2, num4, num, num8, num3, f11, arrayList9, arrayList12, f7, arrayList10, arrayList11, readString2, createStringArrayList, enumC9751a, readString3, num5, num6, num7, num9, f12, readString4, readString5, readString6, readString7, valueOf18, valueOf19, readString8, bool5, num10, num11, valueOf23, bool6, z11, bool7, valueOf26, readString9, readString10, readString11, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAreaV22DTO[] newArray(int i11) {
            return new TextAreaV22DTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextAreaV22DTO(@NotNull CbottomElement2 type, @NotNull String id2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List<Integer> list, List<? extends EnumC9752b> list2, Float f11, List<Integer> list3, List<Integer> list4, String str, List<String> list5, EnumC9751a enumC9751a, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, String str3, String str4, String str5, String str6, @NotNull InputView.Status status, @NotNull InputView.State state, String str7, Boolean bool5, Integer num10, Integer num11, Boolean bool6, Boolean bool7, boolean z11, Boolean bool8, Integer num12, String str8, String str9, String str10, Map<String, String> map, Map<String, ComposerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
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
        this.value = str3;
        this.placeholder = str4;
        this.caption = str5;
        this.captionColor = str6;
        this.status = status;
        this.state = state;
        this.label = str7;
        this.bottomBar = bool5;
        this.rows = num10;
        this.counter = num11;
        this.isResize = bool6;
        this.disableClearButton = bool7;
        this.hasInfoIcon = z11;
        this.isHidden = bool8;
        this.versionStamp = num12;
        this.composerActionBehavior = str8;
        this.composerActionLink = str9;
        this.composerActionId = str10;
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
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component28, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component29, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component30, reason: from getter */
    public final String getCaptionColor() {
        return this.captionColor;
    }

    @NotNull
    /* renamed from: component31, reason: from getter */
    public final InputView.Status getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component32, reason: from getter */
    public final InputView.State getState() {
        return this.state;
    }

    /* renamed from: component33, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component34, reason: from getter */
    public final Boolean getBottomBar() {
        return this.bottomBar;
    }

    /* renamed from: component35, reason: from getter */
    public final Integer getRows() {
        return this.rows;
    }

    /* renamed from: component36, reason: from getter */
    public final Integer getCounter() {
        return this.counter;
    }

    /* renamed from: component37, reason: from getter */
    public final Boolean getIsResize() {
        return this.isResize;
    }

    /* renamed from: component38, reason: from getter */
    public final Boolean getDisableClearButton() {
        return this.disableClearButton;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getHasInfoIcon() {
        return this.hasInfoIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getClickable() {
        return this.clickable;
    }

    /* renamed from: component40, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: component41, reason: from getter */
    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    /* renamed from: component42, reason: from getter */
    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    /* renamed from: component43, reason: from getter */
    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    /* renamed from: component44, reason: from getter */
    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final Map<String, String> component45() {
        return this.composerActionParams;
    }

    public final Map<String, ComposerTrackingInfo> component46() {
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
    public final TextAreaV22DTO copy(@NotNull CbottomElement2 type, @NotNull String id2, Integer version, Boolean clickable, Boolean touchDown, Boolean skeletonable, Boolean disableHighlightAnimation, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, List<Integer> margins, List<? extends EnumC9752b> layoutGravity, Float layoutWeight, List<Integer> paddings, List<Integer> backgroundRadius, String backgroundColor, List<String> backgroundGradient, EnumC9751a backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Float alpha, String value, String placeholder, String caption, String captionColor, @NotNull InputView.Status status, @NotNull InputView.State state, String label, Boolean bottomBar, Integer rows, Integer counter, Boolean isResize, Boolean disableClearButton, boolean hasInfoIcon, Boolean isHidden, Integer versionStamp, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        return new TextAreaV22DTO(type, id2, version, clickable, touchDown, skeletonable, disableHighlightAnimation, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundColor, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, alpha, value, placeholder, caption, captionColor, status, state, label, bottomBar, rows, counter, isResize, disableClearButton, hasInfoIcon, isHidden, versionStamp, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAreaV22DTO)) {
            return false;
        }
        TextAreaV22DTO textAreaV22DTO = (TextAreaV22DTO) other;
        return this.type == textAreaV22DTO.type && Intrinsics.d(this.id, textAreaV22DTO.id) && Intrinsics.d(this.version, textAreaV22DTO.version) && Intrinsics.d(this.clickable, textAreaV22DTO.clickable) && Intrinsics.d(this.touchDown, textAreaV22DTO.touchDown) && Intrinsics.d(this.skeletonable, textAreaV22DTO.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, textAreaV22DTO.disableHighlightAnimation) && Intrinsics.d(this.width, textAreaV22DTO.width) && Intrinsics.d(this.height, textAreaV22DTO.height) && Intrinsics.d(this.ratioW, textAreaV22DTO.ratioW) && Intrinsics.d(this.ratioH, textAreaV22DTO.ratioH) && Intrinsics.d(this.percentW, textAreaV22DTO.percentW) && Intrinsics.d(this.margins, textAreaV22DTO.margins) && Intrinsics.d(this.layoutGravity, textAreaV22DTO.layoutGravity) && Intrinsics.d(this.layoutWeight, textAreaV22DTO.layoutWeight) && Intrinsics.d(this.paddings, textAreaV22DTO.paddings) && Intrinsics.d(this.backgroundRadius, textAreaV22DTO.backgroundRadius) && Intrinsics.d(this.backgroundColor, textAreaV22DTO.backgroundColor) && Intrinsics.d(this.backgroundGradient, textAreaV22DTO.backgroundGradient) && this.backgroundGradientOrientation == textAreaV22DTO.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, textAreaV22DTO.strokeColor) && Intrinsics.d(this.strokeWidth, textAreaV22DTO.strokeWidth) && Intrinsics.d(this.dashWidth, textAreaV22DTO.dashWidth) && Intrinsics.d(this.dashGap, textAreaV22DTO.dashGap) && Intrinsics.d(this.elevation, textAreaV22DTO.elevation) && Intrinsics.d(this.alpha, textAreaV22DTO.alpha) && Intrinsics.d(this.value, textAreaV22DTO.value) && Intrinsics.d(this.placeholder, textAreaV22DTO.placeholder) && Intrinsics.d(this.caption, textAreaV22DTO.caption) && Intrinsics.d(this.captionColor, textAreaV22DTO.captionColor) && this.status == textAreaV22DTO.status && this.state == textAreaV22DTO.state && Intrinsics.d(this.label, textAreaV22DTO.label) && Intrinsics.d(this.bottomBar, textAreaV22DTO.bottomBar) && Intrinsics.d(this.rows, textAreaV22DTO.rows) && Intrinsics.d(this.counter, textAreaV22DTO.counter) && Intrinsics.d(this.isResize, textAreaV22DTO.isResize) && Intrinsics.d(this.disableClearButton, textAreaV22DTO.disableClearButton) && this.hasInfoIcon == textAreaV22DTO.hasInfoIcon && Intrinsics.d(this.isHidden, textAreaV22DTO.isHidden) && Intrinsics.d(this.versionStamp, textAreaV22DTO.versionStamp) && Intrinsics.d(this.composerActionBehavior, textAreaV22DTO.composerActionBehavior) && Intrinsics.d(this.composerActionLink, textAreaV22DTO.composerActionLink) && Intrinsics.d(this.composerActionId, textAreaV22DTO.composerActionId) && Intrinsics.d(this.composerActionParams, textAreaV22DTO.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, textAreaV22DTO.composerTrackingInfo);
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

    public final Boolean getBottomBar() {
        return this.bottomBar;
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

    public final Integer getCounter() {
        return this.counter;
    }

    @Override // F40.a
    public Integer getDashGap() {
        return this.dashGap;
    }

    @Override // F40.a
    public Integer getDashWidth() {
        return this.dashWidth;
    }

    public final Boolean getDisableClearButton() {
        return this.disableClearButton;
    }

    @Override // F40.a
    public Boolean getDisableHighlightAnimation() {
        return this.disableHighlightAnimation;
    }

    @Override // F40.a
    public Integer getElevation() {
        return this.elevation;
    }

    public final boolean getHasInfoIcon() {
        return this.hasInfoIcon;
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

    public final String getLabel() {
        return this.label;
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

    public final Integer getRows() {
        return this.rows;
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
        String str3 = this.value;
        int hashCode25 = (hashCode24 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholder;
        int hashCode26 = (hashCode25 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.caption;
        int hashCode27 = (hashCode26 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.captionColor;
        int hashCode28 = (this.state.hashCode() + ((this.status.hashCode() + ((hashCode27 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        String str7 = this.label;
        int hashCode29 = (hashCode28 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool5 = this.bottomBar;
        int hashCode30 = (hashCode29 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num10 = this.rows;
        int hashCode31 = (hashCode30 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.counter;
        int hashCode32 = (hashCode31 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool6 = this.isResize;
        int hashCode33 = (hashCode32 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.disableClearButton;
        int a12 = C3532b.a((hashCode33 + (bool7 == null ? 0 : bool7.hashCode())) * 31, 31, this.hasInfoIcon);
        Boolean bool8 = this.isHidden;
        int hashCode34 = (a12 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num12 = this.versionStamp;
        int hashCode35 = (hashCode34 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str8 = this.composerActionBehavior;
        int hashCode36 = (hashCode35 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.composerActionLink;
        int hashCode37 = (hashCode36 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.composerActionId;
        int hashCode38 = (hashCode37 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode39 = (hashCode38 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        return hashCode39 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // F40.a
    public Boolean isHidden() {
        return this.isHidden;
    }

    public final Boolean isResize() {
        return this.isResize;
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
        String str4 = this.value;
        String str5 = this.placeholder;
        String str6 = this.caption;
        String str7 = this.captionColor;
        InputView.Status status = this.status;
        InputView.State state = this.state;
        String str8 = this.label;
        Boolean bool5 = this.bottomBar;
        Integer num10 = this.rows;
        Integer num11 = this.counter;
        Boolean bool6 = this.isResize;
        Boolean bool7 = this.disableClearButton;
        boolean z11 = this.hasInfoIcon;
        Boolean bool8 = this.isHidden;
        Integer num12 = this.versionStamp;
        String str9 = this.composerActionBehavior;
        String str10 = this.composerActionLink;
        String str11 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder f13 = D40.a.f("TextAreaV22DTO(type=", cbottomElement2, ", id=", str, ", version=");
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
        D40.c.d(f13, num9, ", alpha=", f12, ", value=");
        Nh.a.h(f13, str4, ", placeholder=", str5, ", caption=");
        Nh.a.h(f13, str6, ", captionColor=", str7, ", status=");
        f13.append(status);
        f13.append(", state=");
        f13.append(state);
        f13.append(", label=");
        Sh.a.d(bool5, str8, ", bottomBar=", ", rows=", f13);
        c.e(f13, num10, ", counter=", num11, ", isResize=");
        h.h(f13, bool6, ", disableClearButton=", bool7, ", hasInfoIcon=");
        f13.append(z11);
        f13.append(", isHidden=");
        f13.append(bool8);
        f13.append(", versionStamp=");
        V.f(num12, ", composerActionBehavior=", str9, ", composerActionLink=", f13);
        Nh.a.h(f13, str10, ", composerActionId=", str11, ", composerActionParams=");
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
        dest.writeString(this.value);
        dest.writeString(this.placeholder);
        dest.writeString(this.caption);
        dest.writeString(this.captionColor);
        dest.writeString(this.status.name());
        dest.writeString(this.state.name());
        dest.writeString(this.label);
        Boolean bool5 = this.bottomBar;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool5);
        }
        Integer num10 = this.rows;
        if (num10 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num10);
        }
        Integer num11 = this.counter;
        if (num11 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num11);
        }
        Boolean bool6 = this.isResize;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool6);
        }
        Boolean bool7 = this.disableClearButton;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool7);
        }
        dest.writeInt(this.hasInfoIcon ? 1 : 0);
        Boolean bool8 = this.isHidden;
        if (bool8 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool8);
        }
        Integer num12 = this.versionStamp;
        if (num12 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num12);
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
    public /* synthetic */ TextAreaV22DTO(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2 r40, java.lang.String r41, java.lang.Integer r42, java.lang.Boolean r43, java.lang.Boolean r44, java.lang.Boolean r45, java.lang.Boolean r46, java.lang.Integer r47, java.lang.Integer r48, java.lang.Integer r49, java.lang.Integer r50, java.lang.Float r51, java.util.List r52, java.util.List r53, java.lang.Float r54, java.util.List r55, java.util.List r56, java.lang.String r57, java.util.List r58, t40.EnumC9751a r59, java.lang.String r60, java.lang.Integer r61, java.lang.Integer r62, java.lang.Integer r63, java.lang.Integer r64, java.lang.Float r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, ru.ozon.fintech.ui.input.InputView.Status r70, ru.ozon.fintech.ui.input.InputView.State r71, java.lang.String r72, java.lang.Boolean r73, java.lang.Integer r74, java.lang.Integer r75, java.lang.Boolean r76, java.lang.Boolean r77, boolean r78, java.lang.Boolean r79, java.lang.Integer r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.util.Map r84, java.util.Map r85, int r86, int r87, kotlin.jvm.internal.DefaultConstructorMarker r88) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextAreaV22DTO.<init>(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.util.List, java.util.List, java.lang.Float, java.util.List, java.util.List, java.lang.String, java.util.List, t40.a, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.ozon.fintech.ui.input.InputView$Status, ru.ozon.fintech.ui.input.InputView$State, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
