package ru.ozon.fintech.features.cbottombase.models.widgets.v2;

import Ak.C2436a;
import B4.V;
import B90.C2616s;
import B90.C2619v;
import C.J;
import D3.h;
import De.C2859b;
import De.C2860c;
import Ef0.c;
import F40.a;
import G.g;
import GZ.e;
import Kk.C3532b;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import c8.C5766e;
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
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import t40.EnumC9751a;
import t40.EnumC9752b;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bA\n\u0002\u0010\u0000\n\u0002\b;\b\u0087\b\u0018\u0000 ¼\u00012\u00020\u0001:\u0002½\u0001BÙ\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u00104\u001a\u00020\b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000108\u0012\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u000108¢\u0006\u0004\b<\u0010=J\u001d\u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bN\u0010MJ\u0012\u0010O\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bO\u0010MJ\u0012\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bP\u0010MJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bQ\u0010KJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bR\u0010KJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bS\u0010KJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bT\u0010KJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0018\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0018\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bY\u0010XJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bZ\u0010VJ\u0018\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b[\u0010XJ\u0018\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\\\u0010XJ\u0018\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b]\u0010XJ\u0012\u0010^\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b`\u0010IJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\ba\u0010KJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bb\u0010KJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bc\u0010KJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bd\u0010KJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\be\u0010VJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bf\u0010IJ\u0012\u0010g\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bg\u0010MJ\u0012\u0010h\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bj\u0010IJ\u0012\u0010k\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0012\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bm\u0010IJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bn\u0010IJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bo\u0010IJ\u0012\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bp\u0010MJ\u0012\u0010q\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bq\u0010MJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\br\u0010IJ\u0012\u0010s\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bs\u0010IJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bt\u0010IJ\u0012\u0010u\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bu\u0010IJ\u0012\u0010v\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bv\u0010IJ\u0010\u0010w\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0012\u0010y\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\by\u0010IJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bz\u0010IJ\u0012\u0010{\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b{\u0010IJ\u001e\u0010|\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000108HÆ\u0003¢\u0006\u0004\b|\u0010}J\u001e\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u000108HÆ\u0003¢\u0006\u0004\b~\u0010}Jç\u0004\u0010\u007f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00104\u001a\u00020\b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001082\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u000108HÆ\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u00020\u0004HÖ\u0001¢\u0006\u0005\b\u0081\u0001\u0010IJ\u0012\u0010\u0082\u0001\u001a\u00020\u0006HÖ\u0001¢\u0006\u0005\b\u0082\u0001\u0010EJ\u001f\u0010\u0085\u0001\u001a\u00020\b2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u0001HÖ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010GR\u001c\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010IR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010KR\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010MR\u001e\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u008d\u0001\u001a\u0005\b\u008f\u0001\u0010MR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u008d\u0001\u001a\u0005\b\u0090\u0001\u0010MR\u001e\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u008d\u0001\u001a\u0005\b\u0091\u0001\u0010MR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u008b\u0001\u001a\u0005\b\u0092\u0001\u0010KR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u008b\u0001\u001a\u0005\b\u0093\u0001\u0010KR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u008b\u0001\u001a\u0005\b\u0094\u0001\u0010KR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u008b\u0001\u001a\u0005\b\u0095\u0001\u0010KR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010VR$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010XR$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010\u0098\u0001\u001a\u0005\b\u009a\u0001\u0010XR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u0096\u0001\u001a\u0005\b\u009b\u0001\u0010VR$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u0098\u0001\u001a\u0005\b\u009c\u0001\u0010XR$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010\u0098\u0001\u001a\u0005\b\u009d\u0001\u0010XR$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0098\u0001\u001a\u0005\b\u009e\u0001\u0010XR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010_R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0089\u0001\u001a\u0005\b¡\u0001\u0010IR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u008b\u0001\u001a\u0005\b¢\u0001\u0010KR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u008b\u0001\u001a\u0005\b£\u0001\u0010KR\u001e\u0010 \u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b \u0010\u008b\u0001\u001a\u0005\b¤\u0001\u0010KR\u001e\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b!\u0010\u008b\u0001\u001a\u0005\b¥\u0001\u0010KR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u0096\u0001\u001a\u0005\b¦\u0001\u0010VR\u001e\u0010#\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0089\u0001\u001a\u0005\b§\u0001\u0010IR\u001d\u0010$\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b$\u0010\u008d\u0001\u001a\u0004\b$\u0010MR\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010¨\u0001\u001a\u0005\b©\u0001\u0010iR\u001c\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0089\u0001\u001a\u0005\bª\u0001\u0010IR\u001e\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010«\u0001\u001a\u0005\b¬\u0001\u0010lR\u001e\u0010*\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u0089\u0001\u001a\u0005\b\u00ad\u0001\u0010IR\u001e\u0010+\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010\u0089\u0001\u001a\u0005\b®\u0001\u0010IR\u001e\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u0089\u0001\u001a\u0005\b¯\u0001\u0010IR\u001d\u0010-\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b-\u0010\u008d\u0001\u001a\u0004\b-\u0010MR\u001d\u0010.\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b.\u0010\u008d\u0001\u001a\u0004\b.\u0010MR\u001e\u0010/\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010\u0089\u0001\u001a\u0005\b°\u0001\u0010IR\u001e\u00100\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010\u0089\u0001\u001a\u0005\b±\u0001\u0010IR\u001e\u00101\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010\u0089\u0001\u001a\u0005\b²\u0001\u0010IR\u001e\u00102\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010\u0089\u0001\u001a\u0005\b³\u0001\u0010IR\u001e\u00103\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b3\u0010\u0089\u0001\u001a\u0005\b´\u0001\u0010IR\u001b\u00104\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b4\u0010µ\u0001\u001a\u0004\b4\u0010xR\u001e\u00105\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b5\u0010\u0089\u0001\u001a\u0005\b¶\u0001\u0010IR\u001e\u00106\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b6\u0010\u0089\u0001\u001a\u0005\b·\u0001\u0010IR\u001e\u00107\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b7\u0010\u0089\u0001\u001a\u0005\b¸\u0001\u0010IR*\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001088\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b9\u0010¹\u0001\u001a\u0005\bº\u0001\u0010}R*\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u0001088\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b;\u0010¹\u0001\u001a\u0005\b»\u0001\u0010}¨\u0006¾\u0001"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinButtonV22DTO;", "LF40/a;", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "type", "", "id", "", "version", "", "clickable", "touchDown", "skeletonable", "disableHighlightAnimation", "width", "height", "ratioW", "ratioH", "", "percentW", "", "margins", "Lt40/b;", "layoutGravity", "layoutWeight", "paddings", "backgroundRadius", "backgroundGradient", "Lt40/a;", "backgroundGradientOrientation", "strokeColor", "strokeWidth", "dashWidth", "dashGap", "elevation", "alpha", "backgroundColor", "isHidden", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "style", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "size", "subtitle", "icon", "dataText", "isDisabled", "isHoverDisabled", "titleColor", "subtitleColor", "iconColor", "dataTextColor", "dataBackgroundColor", "isLoading", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Float;", "component13", "()Ljava/util/List;", "component14", "component15", "component16", "component17", "component18", "component19", "()Lt40/a;", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "component29", "component30", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "()Z", "component42", "component43", "component44", "component45", "()Ljava/util/Map;", "component46", "copy", "(Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt40/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/features/cbottombase/models/widgets/v2/FinButtonV22DTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/Boolean;", "getClickable", "getTouchDown", "getSkeletonable", "getDisableHighlightAnimation", "getWidth", "getHeight", "getRatioW", "getRatioH", "Ljava/lang/Float;", "getPercentW", "Ljava/util/List;", "getMargins", "getLayoutGravity", "getLayoutWeight", "getPaddings", "getBackgroundRadius", "getBackgroundGradient", "Lt40/a;", "getBackgroundGradientOrientation", "getStrokeColor", "getStrokeWidth", "getDashWidth", "getDashGap", "getElevation", "getAlpha", "getBackgroundColor", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "getStyle", "getTitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "getSize", "getSubtitle", "getIcon", "getDataText", "getTitleColor", "getSubtitleColor", "getIconColor", "getDataTextColor", "getDataBackgroundColor", "Z", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "Companion", "a", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinButtonV22DTO implements a {

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

    @i(name = "dataBackgroundColor")
    private final String dataBackgroundColor;

    @i(name = "dataText")
    private final String dataText;

    @i(name = "dataTextColor")
    private final String dataTextColor;

    @i(name = "disableHighlightAnimation")
    private final Boolean disableHighlightAnimation;

    @i(name = "elevation")
    private final Integer elevation;

    @i(name = "height")
    private final Integer height;

    @i(name = "icon")
    private final String icon;

    @i(name = "iconColor")
    private final String iconColor;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "isDisabled")
    private final Boolean isDisabled;

    @i(name = "isHidden")
    private final Boolean isHidden;

    @i(name = "isHoverDisabled")
    private final Boolean isHoverDisabled;

    @i(name = "isLoading")
    private final boolean isLoading;

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

    @i(name = "size")
    private final ButtonV3DTO.Sizes size;

    @i(name = "skeletonable")
    private final Boolean skeletonable;

    @i(name = "strokeColor")
    private final String strokeColor;

    @i(name = "strokeWidth")
    private final Integer strokeWidth;

    @i(name = "styleType")
    private final ButtonV3DTO.StyleTypes style;

    @i(name = "subtitle")
    private final String subtitle;

    @i(name = "subtitleColor")
    private final String subtitleColor;

    @i(name = SelectionItemFormDTO.TITLE_FIELD_NAME)
    @NotNull
    private final String title;

    @i(name = "titleColor")
    private final String titleColor;

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
    public static final Parcelable.Creator<FinButtonV22DTO> CREATOR = new b();

    /* renamed from: ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV22DTO$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class b implements Parcelable.Creator<FinButtonV22DTO> {
        @Override // android.os.Parcelable.Creator
        public final FinButtonV22DTO createFromParcel(Parcel parcel) {
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
            ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
            EnumC9751a valueOf12 = parcel2.readInt() == 0 ? null : EnumC9751a.valueOf(parcel2.readString());
            Boolean bool = valueOf4;
            Integer num = valueOf8;
            ArrayList arrayList9 = arrayList2;
            String readString2 = parcel2.readString();
            Integer valueOf13 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf14 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf15 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf16 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Float valueOf17 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
            Integer num2 = valueOf;
            Boolean bool2 = valueOf5;
            Integer num3 = valueOf9;
            Float f7 = valueOf11;
            Integer num4 = valueOf13;
            String readString3 = parcel2.readString();
            Boolean valueOf18 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            ButtonV3DTO.StyleTypes valueOf19 = parcel2.readInt() == 0 ? null : ButtonV3DTO.StyleTypes.valueOf(parcel2.readString());
            Boolean bool3 = valueOf3;
            Integer num5 = valueOf7;
            ArrayList arrayList10 = arrayList;
            EnumC9751a enumC9751a = valueOf12;
            Integer num6 = valueOf16;
            String readString4 = parcel2.readString();
            ButtonV3DTO.Sizes valueOf20 = parcel2.readInt() == 0 ? null : ButtonV3DTO.Sizes.valueOf(parcel2.readString());
            String readString5 = parcel2.readString();
            Boolean bool4 = valueOf2;
            Integer num7 = valueOf6;
            Float f11 = valueOf10;
            ArrayList arrayList11 = arrayList3;
            Integer num8 = valueOf14;
            Boolean bool5 = valueOf18;
            String readString6 = parcel2.readString();
            ArrayList arrayList12 = arrayList4;
            Integer num9 = valueOf15;
            ButtonV3DTO.StyleTypes styleTypes = valueOf19;
            String readString7 = parcel2.readString();
            Boolean valueOf21 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            Boolean valueOf22 = parcel2.readInt() == 0 ? null : Boolean.valueOf(parcel2.readInt() != 0);
            String readString8 = parcel2.readString();
            String readString9 = parcel2.readString();
            Boolean bool6 = valueOf21;
            String readString10 = parcel2.readString();
            Float f12 = valueOf17;
            ButtonV3DTO.Sizes sizes = valueOf20;
            Boolean bool7 = valueOf22;
            String readString11 = parcel2.readString();
            String readString12 = parcel2.readString();
            boolean z11 = parcel2.readInt() != 0;
            String readString13 = parcel2.readString();
            String readString14 = parcel2.readString();
            String readString15 = parcel2.readString();
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
                    i16 = C2859b.a(FinButtonV22DTO.class, parcel2, linkedHashMap2, parcel2.readString(), i16, 1);
                    parcel2 = parcel;
                    readInt6 = readInt6;
                }
            }
            return new FinButtonV22DTO(c11, readString, num2, bool4, bool3, bool, bool2, num7, num5, num, num3, f11, arrayList10, arrayList9, f7, arrayList11, arrayList12, createStringArrayList, enumC9751a, readString2, num4, num8, num9, num6, f12, readString3, bool5, styleTypes, readString4, sizes, readString5, readString6, readString7, bool6, bool7, readString8, readString9, readString10, readString11, readString12, z11, readString13, readString14, readString15, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final FinButtonV22DTO[] newArray(int i11) {
            return new FinButtonV22DTO[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinButtonV22DTO(@NotNull CbottomElement2 type, @NotNull String id2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, Float f7, List<Integer> list, List<? extends EnumC9752b> list2, Float f11, List<Integer> list3, List<Integer> list4, List<String> list5, EnumC9751a enumC9751a, String str, Integer num6, Integer num7, Integer num8, Integer num9, Float f12, String str2, Boolean bool5, ButtonV3DTO.StyleTypes styleTypes, @NotNull String title, ButtonV3DTO.Sizes sizes, String str3, String str4, String str5, Boolean bool6, Boolean bool7, String str6, String str7, String str8, String str9, String str10, boolean z11, String str11, String str12, String str13, Map<String, String> map, Map<String, ComposerTrackingInfo> map2) {
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
        this.backgroundGradient = list5;
        this.backgroundGradientOrientation = enumC9751a;
        this.strokeColor = str;
        this.strokeWidth = num6;
        this.dashWidth = num7;
        this.dashGap = num8;
        this.elevation = num9;
        this.alpha = f12;
        this.backgroundColor = str2;
        this.isHidden = bool5;
        this.style = styleTypes;
        this.title = title;
        this.size = sizes;
        this.subtitle = str3;
        this.icon = str4;
        this.dataText = str5;
        this.isDisabled = bool6;
        this.isHoverDisabled = bool7;
        this.titleColor = str6;
        this.subtitleColor = str7;
        this.iconColor = str8;
        this.dataTextColor = str9;
        this.dataBackgroundColor = str10;
        this.isLoading = z11;
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
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component27, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: component28, reason: from getter */
    public final ButtonV3DTO.StyleTypes getStyle() {
        return this.style;
    }

    @NotNull
    /* renamed from: component29, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component30, reason: from getter */
    public final ButtonV3DTO.Sizes getSize() {
        return this.size;
    }

    /* renamed from: component31, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component32, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component33, reason: from getter */
    public final String getDataText() {
        return this.dataText;
    }

    /* renamed from: component34, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component35, reason: from getter */
    public final Boolean getIsHoverDisabled() {
        return this.isHoverDisabled;
    }

    /* renamed from: component36, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* renamed from: component37, reason: from getter */
    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: component38, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component39, reason: from getter */
    public final String getDataTextColor() {
        return this.dataTextColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getClickable() {
        return this.clickable;
    }

    /* renamed from: component40, reason: from getter */
    public final String getDataBackgroundColor() {
        return this.dataBackgroundColor;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
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
    public final FinButtonV22DTO copy(@NotNull CbottomElement2 type, @NotNull String id2, Integer version, Boolean clickable, Boolean touchDown, Boolean skeletonable, Boolean disableHighlightAnimation, Integer width, Integer height, Integer ratioW, Integer ratioH, Float percentW, List<Integer> margins, List<? extends EnumC9752b> layoutGravity, Float layoutWeight, List<Integer> paddings, List<Integer> backgroundRadius, List<String> backgroundGradient, EnumC9751a backgroundGradientOrientation, String strokeColor, Integer strokeWidth, Integer dashWidth, Integer dashGap, Integer elevation, Float alpha, String backgroundColor, Boolean isHidden, ButtonV3DTO.StyleTypes style, @NotNull String title, ButtonV3DTO.Sizes size, String subtitle, String icon, String dataText, Boolean isDisabled, Boolean isHoverDisabled, String titleColor, String subtitleColor, String iconColor, String dataTextColor, String dataBackgroundColor, boolean isLoading, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new FinButtonV22DTO(type, id2, version, clickable, touchDown, skeletonable, disableHighlightAnimation, width, height, ratioW, ratioH, percentW, margins, layoutGravity, layoutWeight, paddings, backgroundRadius, backgroundGradient, backgroundGradientOrientation, strokeColor, strokeWidth, dashWidth, dashGap, elevation, alpha, backgroundColor, isHidden, style, title, size, subtitle, icon, dataText, isDisabled, isHoverDisabled, titleColor, subtitleColor, iconColor, dataTextColor, dataBackgroundColor, isLoading, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinButtonV22DTO)) {
            return false;
        }
        FinButtonV22DTO finButtonV22DTO = (FinButtonV22DTO) other;
        return this.type == finButtonV22DTO.type && Intrinsics.d(this.id, finButtonV22DTO.id) && Intrinsics.d(this.version, finButtonV22DTO.version) && Intrinsics.d(this.clickable, finButtonV22DTO.clickable) && Intrinsics.d(this.touchDown, finButtonV22DTO.touchDown) && Intrinsics.d(this.skeletonable, finButtonV22DTO.skeletonable) && Intrinsics.d(this.disableHighlightAnimation, finButtonV22DTO.disableHighlightAnimation) && Intrinsics.d(this.width, finButtonV22DTO.width) && Intrinsics.d(this.height, finButtonV22DTO.height) && Intrinsics.d(this.ratioW, finButtonV22DTO.ratioW) && Intrinsics.d(this.ratioH, finButtonV22DTO.ratioH) && Intrinsics.d(this.percentW, finButtonV22DTO.percentW) && Intrinsics.d(this.margins, finButtonV22DTO.margins) && Intrinsics.d(this.layoutGravity, finButtonV22DTO.layoutGravity) && Intrinsics.d(this.layoutWeight, finButtonV22DTO.layoutWeight) && Intrinsics.d(this.paddings, finButtonV22DTO.paddings) && Intrinsics.d(this.backgroundRadius, finButtonV22DTO.backgroundRadius) && Intrinsics.d(this.backgroundGradient, finButtonV22DTO.backgroundGradient) && this.backgroundGradientOrientation == finButtonV22DTO.backgroundGradientOrientation && Intrinsics.d(this.strokeColor, finButtonV22DTO.strokeColor) && Intrinsics.d(this.strokeWidth, finButtonV22DTO.strokeWidth) && Intrinsics.d(this.dashWidth, finButtonV22DTO.dashWidth) && Intrinsics.d(this.dashGap, finButtonV22DTO.dashGap) && Intrinsics.d(this.elevation, finButtonV22DTO.elevation) && Intrinsics.d(this.alpha, finButtonV22DTO.alpha) && Intrinsics.d(this.backgroundColor, finButtonV22DTO.backgroundColor) && Intrinsics.d(this.isHidden, finButtonV22DTO.isHidden) && this.style == finButtonV22DTO.style && Intrinsics.d(this.title, finButtonV22DTO.title) && this.size == finButtonV22DTO.size && Intrinsics.d(this.subtitle, finButtonV22DTO.subtitle) && Intrinsics.d(this.icon, finButtonV22DTO.icon) && Intrinsics.d(this.dataText, finButtonV22DTO.dataText) && Intrinsics.d(this.isDisabled, finButtonV22DTO.isDisabled) && Intrinsics.d(this.isHoverDisabled, finButtonV22DTO.isHoverDisabled) && Intrinsics.d(this.titleColor, finButtonV22DTO.titleColor) && Intrinsics.d(this.subtitleColor, finButtonV22DTO.subtitleColor) && Intrinsics.d(this.iconColor, finButtonV22DTO.iconColor) && Intrinsics.d(this.dataTextColor, finButtonV22DTO.dataTextColor) && Intrinsics.d(this.dataBackgroundColor, finButtonV22DTO.dataBackgroundColor) && this.isLoading == finButtonV22DTO.isLoading && Intrinsics.d(this.composerActionBehavior, finButtonV22DTO.composerActionBehavior) && Intrinsics.d(this.composerActionLink, finButtonV22DTO.composerActionLink) && Intrinsics.d(this.composerActionId, finButtonV22DTO.composerActionId) && Intrinsics.d(this.composerActionParams, finButtonV22DTO.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, finButtonV22DTO.composerTrackingInfo);
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

    public final String getDataBackgroundColor() {
        return this.dataBackgroundColor;
    }

    public final String getDataText() {
        return this.dataText;
    }

    public final String getDataTextColor() {
        return this.dataTextColor;
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

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
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

    @Override // F40.a
    public Integer getRatioH() {
        return this.ratioH;
    }

    @Override // F40.a
    public Integer getRatioW() {
        return this.ratioW;
    }

    public final ButtonV3DTO.Sizes getSize() {
        return this.size;
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

    public final ButtonV3DTO.StyleTypes getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
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
        List<String> list5 = this.backgroundGradient;
        int hashCode16 = (hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
        EnumC9751a enumC9751a = this.backgroundGradientOrientation;
        int hashCode17 = (hashCode16 + (enumC9751a == null ? 0 : enumC9751a.hashCode())) * 31;
        String str = this.strokeColor;
        int hashCode18 = (hashCode17 + (str == null ? 0 : str.hashCode())) * 31;
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
        String str2 = this.backgroundColor;
        int hashCode24 = (hashCode23 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.isHidden;
        int hashCode25 = (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        ButtonV3DTO.StyleTypes styleTypes = this.style;
        int a12 = g.a((hashCode25 + (styleTypes == null ? 0 : styleTypes.hashCode())) * 31, 31, this.title);
        ButtonV3DTO.Sizes sizes = this.size;
        int hashCode26 = (a12 + (sizes == null ? 0 : sizes.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode27 = (hashCode26 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int hashCode28 = (hashCode27 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dataText;
        int hashCode29 = (hashCode28 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool6 = this.isDisabled;
        int hashCode30 = (hashCode29 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isHoverDisabled;
        int hashCode31 = (hashCode30 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str6 = this.titleColor;
        int hashCode32 = (hashCode31 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subtitleColor;
        int hashCode33 = (hashCode32 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.iconColor;
        int hashCode34 = (hashCode33 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dataTextColor;
        int hashCode35 = (hashCode34 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dataBackgroundColor;
        int a13 = C3532b.a((hashCode35 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.isLoading);
        String str11 = this.composerActionBehavior;
        int hashCode36 = (a13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.composerActionLink;
        int hashCode37 = (hashCode36 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.composerActionId;
        int hashCode38 = (hashCode37 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode39 = (hashCode38 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        return hashCode39 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @Override // F40.a
    public Boolean isHidden() {
        return this.isHidden;
    }

    public final Boolean isHoverDisabled() {
        return this.isHoverDisabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
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
        List<String> list5 = this.backgroundGradient;
        EnumC9751a enumC9751a = this.backgroundGradientOrientation;
        String str2 = this.strokeColor;
        Integer num6 = this.strokeWidth;
        Integer num7 = this.dashWidth;
        Integer num8 = this.dashGap;
        Integer num9 = this.elevation;
        Float f12 = this.alpha;
        String str3 = this.backgroundColor;
        Boolean bool5 = this.isHidden;
        ButtonV3DTO.StyleTypes styleTypes = this.style;
        String str4 = this.title;
        ButtonV3DTO.Sizes sizes = this.size;
        String str5 = this.subtitle;
        String str6 = this.icon;
        String str7 = this.dataText;
        Boolean bool6 = this.isDisabled;
        Boolean bool7 = this.isHoverDisabled;
        String str8 = this.titleColor;
        String str9 = this.subtitleColor;
        String str10 = this.iconColor;
        String str11 = this.dataTextColor;
        String str12 = this.dataBackgroundColor;
        boolean z11 = this.isLoading;
        String str13 = this.composerActionBehavior;
        String str14 = this.composerActionLink;
        String str15 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder f13 = D40.a.f("FinButtonV22DTO(type=", cbottomElement2, ", id=", str, ", version=");
        C2860c.f(bool, num, ", clickable=", ", touchDown=", f13);
        h.h(f13, bool2, ", skeletonable=", bool3, ", disableHighlightAnimation=");
        e.d(bool4, num2, ", width=", ", height=", f13);
        c.e(f13, num3, ", ratioW=", num4, ", ratioH=");
        D40.c.d(f13, num5, ", percentW=", f7, ", margins=");
        C2616s.g(", layoutGravity=", ", layoutWeight=", f13, list, list2);
        C2436a.f(f13, f11, ", paddings=", list3, ", backgroundRadius=");
        C2616s.g(", backgroundGradient=", ", backgroundGradientOrientation=", f13, list4, list5);
        f13.append(enumC9751a);
        f13.append(", strokeColor=");
        f13.append(str2);
        f13.append(", strokeWidth=");
        c.e(f13, num6, ", dashWidth=", num7, ", dashGap=");
        c.e(f13, num8, ", elevation=", num9, ", alpha=");
        f13.append(f12);
        f13.append(", backgroundColor=");
        f13.append(str3);
        f13.append(", isHidden=");
        f13.append(bool5);
        f13.append(", style=");
        f13.append(styleTypes);
        f13.append(", title=");
        f13.append(str4);
        f13.append(", size=");
        f13.append(sizes);
        f13.append(", subtitle=");
        Nh.a.h(f13, str5, ", icon=", str6, ", dataText=");
        Sh.a.d(bool6, str7, ", isDisabled=", ", isHoverDisabled=", f13);
        HY.b.c(bool7, ", titleColor=", str8, ", subtitleColor=", f13);
        Nh.a.h(f13, str9, ", iconColor=", str10, ", dataTextColor=");
        Nh.a.h(f13, str11, ", dataBackgroundColor=", str12, ", isLoading=");
        C5766e.a(", composerActionBehavior=", str13, ", composerActionLink=", f13, z11);
        Nh.a.h(f13, str14, ", composerActionId=", str15, ", composerActionParams=");
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
        dest.writeString(this.backgroundColor);
        Boolean bool5 = this.isHidden;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool5);
        }
        ButtonV3DTO.StyleTypes styleTypes = this.style;
        if (styleTypes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleTypes.name());
        }
        dest.writeString(this.title);
        ButtonV3DTO.Sizes sizes = this.size;
        if (sizes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sizes.name());
        }
        dest.writeString(this.subtitle);
        dest.writeString(this.icon);
        dest.writeString(this.dataText);
        Boolean bool6 = this.isDisabled;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool6);
        }
        Boolean bool7 = this.isHoverDisabled;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool7);
        }
        dest.writeString(this.titleColor);
        dest.writeString(this.subtitleColor);
        dest.writeString(this.iconColor);
        dest.writeString(this.dataTextColor);
        dest.writeString(this.dataBackgroundColor);
        dest.writeInt(this.isLoading ? 1 : 0);
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
    public /* synthetic */ FinButtonV22DTO(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2 r51, java.lang.String r52, java.lang.Integer r53, java.lang.Boolean r54, java.lang.Boolean r55, java.lang.Boolean r56, java.lang.Boolean r57, java.lang.Integer r58, java.lang.Integer r59, java.lang.Integer r60, java.lang.Integer r61, java.lang.Float r62, java.util.List r63, java.util.List r64, java.lang.Float r65, java.util.List r66, java.util.List r67, java.util.List r68, t40.EnumC9751a r69, java.lang.String r70, java.lang.Integer r71, java.lang.Integer r72, java.lang.Integer r73, java.lang.Integer r74, java.lang.Float r75, java.lang.String r76, java.lang.Boolean r77, ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO.StyleTypes r78, java.lang.String r79, ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO.Sizes r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.Boolean r84, java.lang.Boolean r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, boolean r91, java.lang.String r92, java.lang.String r93, java.lang.String r94, java.util.Map r95, java.util.Map r96, int r97, int r98, kotlin.jvm.internal.DefaultConstructorMarker r99) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV22DTO.<init>(ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.util.List, java.util.List, java.lang.Float, java.util.List, java.util.List, java.util.List, t40.a, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.String, java.lang.Boolean, ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO$StyleTypes, java.lang.String, ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO$Sizes, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
