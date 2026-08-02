package ru.ozon.id.antibot;

import B0.C2454a;
import B4.V;
import Cm.e;
import D3.h;
import Ef0.c;
import HY.b;
import I0.C3173b;
import I1.w;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0003\b\u008c\u0001\b\u0081\b\u0018\u00002\u00020\u0001B¯\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010*\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\f\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u000100\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u000100\u0012\b\u00104\u001a\u0004\u0018\u000100\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\f\u0012\b\u00108\u001a\u0004\u0018\u00010\f\u0012\b\u00109\u001a\u0004\u0018\u00010\f\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\f\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b>\u0010?J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010TJ\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dHÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010JJ\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010JJ\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010cJ\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010JJ\u0012\u0010¤\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dHÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¦\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¨\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0002\u0010qJ\u0011\u0010©\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0002\u0010qJ\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010«\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0002\u0010qJ\u0011\u0010¬\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0002\u0010qJ\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010JJ\u0011\u0010°\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010JJ\u0011\u0010±\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010³\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¤\u0005\u0010¶\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u0001002\n\b\u0002\u00104\u001a\u0004\u0018\u0001002\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010·\u0001J\u0015\u0010¸\u0001\u001a\u0002002\t\u0010¹\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010º\u0001\u001a\u00020\fHÖ\u0001J\n\u0010»\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010AR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010AR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010AR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010AR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010AR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010JR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010AR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010AR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010AR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010AR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010AR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010AR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010AR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010U\u001a\u0004\bS\u0010TR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010AR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010AR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010AR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010AR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010AR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010AR\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010AR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010AR\u0015\u0010 \u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010K\u001a\u0004\b`\u0010JR\u0015\u0010!\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010K\u001a\u0004\ba\u0010JR\u0015\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\n\n\u0002\u0010d\u001a\u0004\bb\u0010cR\u0015\u0010$\u001a\u0004\u0018\u00010#¢\u0006\n\n\u0002\u0010d\u001a\u0004\be\u0010cR\u0015\u0010%\u001a\u0004\u0018\u00010#¢\u0006\n\n\u0002\u0010d\u001a\u0004\bf\u0010cR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010AR\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010AR\u0015\u0010(\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010U\u001a\u0004\bi\u0010TR\u0015\u0010)\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010U\u001a\u0004\bj\u0010TR\u0015\u0010*\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010K\u001a\u0004\bk\u0010JR\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bl\u0010]R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010AR\u0015\u0010-\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010K\u001a\u0004\bn\u0010JR\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010AR\u0015\u0010/\u001a\u0004\u0018\u000100¢\u0006\n\n\u0002\u0010r\u001a\u0004\bp\u0010qR\u0015\u00101\u001a\u0004\u0018\u000100¢\u0006\n\n\u0002\u0010r\u001a\u0004\bs\u0010qR\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010AR\u0015\u00103\u001a\u0004\u0018\u000100¢\u0006\n\n\u0002\u0010r\u001a\u0004\bu\u0010qR\u0015\u00104\u001a\u0004\u0018\u000100¢\u0006\n\n\u0002\u0010r\u001a\u0004\bv\u0010qR\u0013\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010AR\u0013\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010AR\u0015\u00107\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010K\u001a\u0004\by\u0010JR\u0015\u00108\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010K\u001a\u0004\bz\u0010JR\u0015\u00109\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010K\u001a\u0004\b{\u0010JR\u0013\u0010:\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010AR\u0015\u0010;\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010K\u001a\u0004\b}\u0010JR\u0013\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010AR\u0013\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010A¨\u0006¼\u0001"}, d2 = {"Lru/ozon/id/antibot/FingerprintDTO;", "", "androidFingerprintType", "", "androidModel", "androidManufacturer", "androidBrand", "androidHardware", "androidBoard", "androidDevice", "androidProduct", "androidSdk", "", "androidRelease", "androidSecurityPatch", "androidBuildId", "androidRadioVersion", "androidFingerprint", "androidTags", "androidType", "androidTime", "", "androidUser", "androidBootloader", "androidSku", "androidOdmSku", "androidDisplay", "androidHost", "androidSupportedAbis", "", "androidSocManufacturer", "androidSocModel", "androidScreenWidth", "androidScreenHeight", "androidDensity", "", "androidDensityWidth", "androidDensityHeight", "androidPackageName", "androidVersionName", "androidFirstInstallTime", "androidLastUpdateTime", "androidVersionCode", "androidLocales", "androidTimezoneId", "androidTimezoneRawOffset", "androidTimezoneDisplayName", "androidIsDeviceSecure", "", "androidIsDebug", "androidConnectionType", "androidIsVpnConnected", "androidIsRoot", "androidIdentifierForVendor", "androidDeviceId", "androidDevelopmentSettingsEnabled", "androidAdbEnabled", "androidStayOnWhilePluggedIn", "androidDebugApp", "androidWaitForDebugger", "androidIsEmulator", "androidOzonIdSdkVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidFingerprintType", "()Ljava/lang/String;", "getAndroidModel", "getAndroidManufacturer", "getAndroidBrand", "getAndroidHardware", "getAndroidBoard", "getAndroidDevice", "getAndroidProduct", "getAndroidSdk", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAndroidRelease", "getAndroidSecurityPatch", "getAndroidBuildId", "getAndroidRadioVersion", "getAndroidFingerprint", "getAndroidTags", "getAndroidType", "getAndroidTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAndroidUser", "getAndroidBootloader", "getAndroidSku", "getAndroidOdmSku", "getAndroidDisplay", "getAndroidHost", "getAndroidSupportedAbis", "()Ljava/util/List;", "getAndroidSocManufacturer", "getAndroidSocModel", "getAndroidScreenWidth", "getAndroidScreenHeight", "getAndroidDensity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAndroidDensityWidth", "getAndroidDensityHeight", "getAndroidPackageName", "getAndroidVersionName", "getAndroidFirstInstallTime", "getAndroidLastUpdateTime", "getAndroidVersionCode", "getAndroidLocales", "getAndroidTimezoneId", "getAndroidTimezoneRawOffset", "getAndroidTimezoneDisplayName", "getAndroidIsDeviceSecure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAndroidIsDebug", "getAndroidConnectionType", "getAndroidIsVpnConnected", "getAndroidIsRoot", "getAndroidIdentifierForVendor", "getAndroidDeviceId", "getAndroidDevelopmentSettingsEnabled", "getAndroidAdbEnabled", "getAndroidStayOnWhilePluggedIn", "getAndroidDebugApp", "getAndroidWaitForDebugger", "getAndroidIsEmulator", "getAndroidOzonIdSdkVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/id/antibot/FingerprintDTO;", "equals", "other", "hashCode", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FingerprintDTO {
    private final Integer androidAdbEnabled;
    private final String androidBoard;
    private final String androidBootloader;
    private final String androidBrand;
    private final String androidBuildId;
    private final String androidConnectionType;
    private final String androidDebugApp;
    private final Float androidDensity;
    private final Float androidDensityHeight;
    private final Float androidDensityWidth;
    private final Integer androidDevelopmentSettingsEnabled;
    private final String androidDevice;
    private final String androidDeviceId;
    private final String androidDisplay;
    private final String androidFingerprint;
    private final String androidFingerprintType;
    private final Long androidFirstInstallTime;
    private final String androidHardware;
    private final String androidHost;
    private final String androidIdentifierForVendor;
    private final Boolean androidIsDebug;
    private final Boolean androidIsDeviceSecure;
    private final String androidIsEmulator;
    private final Boolean androidIsRoot;
    private final Boolean androidIsVpnConnected;
    private final Long androidLastUpdateTime;
    private final List<String> androidLocales;
    private final String androidManufacturer;
    private final String androidModel;
    private final String androidOdmSku;
    private final String androidOzonIdSdkVersion;
    private final String androidPackageName;
    private final String androidProduct;
    private final String androidRadioVersion;
    private final String androidRelease;
    private final Integer androidScreenHeight;
    private final Integer androidScreenWidth;
    private final Integer androidSdk;
    private final String androidSecurityPatch;
    private final String androidSku;
    private final String androidSocManufacturer;
    private final String androidSocModel;
    private final Integer androidStayOnWhilePluggedIn;
    private final List<String> androidSupportedAbis;
    private final String androidTags;
    private final Long androidTime;
    private final String androidTimezoneDisplayName;
    private final String androidTimezoneId;
    private final Integer androidTimezoneRawOffset;
    private final String androidType;
    private final String androidUser;
    private final Integer androidVersionCode;
    private final String androidVersionName;
    private final Integer androidWaitForDebugger;

    public FingerprintDTO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Long l11, String str16, String str17, String str18, String str19, String str20, String str21, List<String> list, String str22, String str23, Integer num2, Integer num3, Float f7, Float f11, Float f12, String str24, String str25, Long l12, Long l13, Integer num4, List<String> list2, String str26, Integer num5, String str27, Boolean bool, Boolean bool2, String str28, Boolean bool3, Boolean bool4, String str29, String str30, Integer num6, Integer num7, Integer num8, String str31, Integer num9, String str32, String str33) {
        this.androidFingerprintType = str;
        this.androidModel = str2;
        this.androidManufacturer = str3;
        this.androidBrand = str4;
        this.androidHardware = str5;
        this.androidBoard = str6;
        this.androidDevice = str7;
        this.androidProduct = str8;
        this.androidSdk = num;
        this.androidRelease = str9;
        this.androidSecurityPatch = str10;
        this.androidBuildId = str11;
        this.androidRadioVersion = str12;
        this.androidFingerprint = str13;
        this.androidTags = str14;
        this.androidType = str15;
        this.androidTime = l11;
        this.androidUser = str16;
        this.androidBootloader = str17;
        this.androidSku = str18;
        this.androidOdmSku = str19;
        this.androidDisplay = str20;
        this.androidHost = str21;
        this.androidSupportedAbis = list;
        this.androidSocManufacturer = str22;
        this.androidSocModel = str23;
        this.androidScreenWidth = num2;
        this.androidScreenHeight = num3;
        this.androidDensity = f7;
        this.androidDensityWidth = f11;
        this.androidDensityHeight = f12;
        this.androidPackageName = str24;
        this.androidVersionName = str25;
        this.androidFirstInstallTime = l12;
        this.androidLastUpdateTime = l13;
        this.androidVersionCode = num4;
        this.androidLocales = list2;
        this.androidTimezoneId = str26;
        this.androidTimezoneRawOffset = num5;
        this.androidTimezoneDisplayName = str27;
        this.androidIsDeviceSecure = bool;
        this.androidIsDebug = bool2;
        this.androidConnectionType = str28;
        this.androidIsVpnConnected = bool3;
        this.androidIsRoot = bool4;
        this.androidIdentifierForVendor = str29;
        this.androidDeviceId = str30;
        this.androidDevelopmentSettingsEnabled = num6;
        this.androidAdbEnabled = num7;
        this.androidStayOnWhilePluggedIn = num8;
        this.androidDebugApp = str31;
        this.androidWaitForDebugger = num9;
        this.androidIsEmulator = str32;
        this.androidOzonIdSdkVersion = str33;
    }

    /* renamed from: component1, reason: from getter */
    public final String getAndroidFingerprintType() {
        return this.androidFingerprintType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAndroidRelease() {
        return this.androidRelease;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAndroidSecurityPatch() {
        return this.androidSecurityPatch;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAndroidBuildId() {
        return this.androidBuildId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getAndroidRadioVersion() {
        return this.androidRadioVersion;
    }

    /* renamed from: component14, reason: from getter */
    public final String getAndroidFingerprint() {
        return this.androidFingerprint;
    }

    /* renamed from: component15, reason: from getter */
    public final String getAndroidTags() {
        return this.androidTags;
    }

    /* renamed from: component16, reason: from getter */
    public final String getAndroidType() {
        return this.androidType;
    }

    /* renamed from: component17, reason: from getter */
    public final Long getAndroidTime() {
        return this.androidTime;
    }

    /* renamed from: component18, reason: from getter */
    public final String getAndroidUser() {
        return this.androidUser;
    }

    /* renamed from: component19, reason: from getter */
    public final String getAndroidBootloader() {
        return this.androidBootloader;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAndroidModel() {
        return this.androidModel;
    }

    /* renamed from: component20, reason: from getter */
    public final String getAndroidSku() {
        return this.androidSku;
    }

    /* renamed from: component21, reason: from getter */
    public final String getAndroidOdmSku() {
        return this.androidOdmSku;
    }

    /* renamed from: component22, reason: from getter */
    public final String getAndroidDisplay() {
        return this.androidDisplay;
    }

    /* renamed from: component23, reason: from getter */
    public final String getAndroidHost() {
        return this.androidHost;
    }

    public final List<String> component24() {
        return this.androidSupportedAbis;
    }

    /* renamed from: component25, reason: from getter */
    public final String getAndroidSocManufacturer() {
        return this.androidSocManufacturer;
    }

    /* renamed from: component26, reason: from getter */
    public final String getAndroidSocModel() {
        return this.androidSocModel;
    }

    /* renamed from: component27, reason: from getter */
    public final Integer getAndroidScreenWidth() {
        return this.androidScreenWidth;
    }

    /* renamed from: component28, reason: from getter */
    public final Integer getAndroidScreenHeight() {
        return this.androidScreenHeight;
    }

    /* renamed from: component29, reason: from getter */
    public final Float getAndroidDensity() {
        return this.androidDensity;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAndroidManufacturer() {
        return this.androidManufacturer;
    }

    /* renamed from: component30, reason: from getter */
    public final Float getAndroidDensityWidth() {
        return this.androidDensityWidth;
    }

    /* renamed from: component31, reason: from getter */
    public final Float getAndroidDensityHeight() {
        return this.androidDensityHeight;
    }

    /* renamed from: component32, reason: from getter */
    public final String getAndroidPackageName() {
        return this.androidPackageName;
    }

    /* renamed from: component33, reason: from getter */
    public final String getAndroidVersionName() {
        return this.androidVersionName;
    }

    /* renamed from: component34, reason: from getter */
    public final Long getAndroidFirstInstallTime() {
        return this.androidFirstInstallTime;
    }

    /* renamed from: component35, reason: from getter */
    public final Long getAndroidLastUpdateTime() {
        return this.androidLastUpdateTime;
    }

    /* renamed from: component36, reason: from getter */
    public final Integer getAndroidVersionCode() {
        return this.androidVersionCode;
    }

    public final List<String> component37() {
        return this.androidLocales;
    }

    /* renamed from: component38, reason: from getter */
    public final String getAndroidTimezoneId() {
        return this.androidTimezoneId;
    }

    /* renamed from: component39, reason: from getter */
    public final Integer getAndroidTimezoneRawOffset() {
        return this.androidTimezoneRawOffset;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAndroidBrand() {
        return this.androidBrand;
    }

    /* renamed from: component40, reason: from getter */
    public final String getAndroidTimezoneDisplayName() {
        return this.androidTimezoneDisplayName;
    }

    /* renamed from: component41, reason: from getter */
    public final Boolean getAndroidIsDeviceSecure() {
        return this.androidIsDeviceSecure;
    }

    /* renamed from: component42, reason: from getter */
    public final Boolean getAndroidIsDebug() {
        return this.androidIsDebug;
    }

    /* renamed from: component43, reason: from getter */
    public final String getAndroidConnectionType() {
        return this.androidConnectionType;
    }

    /* renamed from: component44, reason: from getter */
    public final Boolean getAndroidIsVpnConnected() {
        return this.androidIsVpnConnected;
    }

    /* renamed from: component45, reason: from getter */
    public final Boolean getAndroidIsRoot() {
        return this.androidIsRoot;
    }

    /* renamed from: component46, reason: from getter */
    public final String getAndroidIdentifierForVendor() {
        return this.androidIdentifierForVendor;
    }

    /* renamed from: component47, reason: from getter */
    public final String getAndroidDeviceId() {
        return this.androidDeviceId;
    }

    /* renamed from: component48, reason: from getter */
    public final Integer getAndroidDevelopmentSettingsEnabled() {
        return this.androidDevelopmentSettingsEnabled;
    }

    /* renamed from: component49, reason: from getter */
    public final Integer getAndroidAdbEnabled() {
        return this.androidAdbEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAndroidHardware() {
        return this.androidHardware;
    }

    /* renamed from: component50, reason: from getter */
    public final Integer getAndroidStayOnWhilePluggedIn() {
        return this.androidStayOnWhilePluggedIn;
    }

    /* renamed from: component51, reason: from getter */
    public final String getAndroidDebugApp() {
        return this.androidDebugApp;
    }

    /* renamed from: component52, reason: from getter */
    public final Integer getAndroidWaitForDebugger() {
        return this.androidWaitForDebugger;
    }

    /* renamed from: component53, reason: from getter */
    public final String getAndroidIsEmulator() {
        return this.androidIsEmulator;
    }

    /* renamed from: component54, reason: from getter */
    public final String getAndroidOzonIdSdkVersion() {
        return this.androidOzonIdSdkVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAndroidBoard() {
        return this.androidBoard;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAndroidDevice() {
        return this.androidDevice;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAndroidProduct() {
        return this.androidProduct;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getAndroidSdk() {
        return this.androidSdk;
    }

    @NotNull
    public final FingerprintDTO copy(String androidFingerprintType, String androidModel, String androidManufacturer, String androidBrand, String androidHardware, String androidBoard, String androidDevice, String androidProduct, Integer androidSdk, String androidRelease, String androidSecurityPatch, String androidBuildId, String androidRadioVersion, String androidFingerprint, String androidTags, String androidType, Long androidTime, String androidUser, String androidBootloader, String androidSku, String androidOdmSku, String androidDisplay, String androidHost, List<String> androidSupportedAbis, String androidSocManufacturer, String androidSocModel, Integer androidScreenWidth, Integer androidScreenHeight, Float androidDensity, Float androidDensityWidth, Float androidDensityHeight, String androidPackageName, String androidVersionName, Long androidFirstInstallTime, Long androidLastUpdateTime, Integer androidVersionCode, List<String> androidLocales, String androidTimezoneId, Integer androidTimezoneRawOffset, String androidTimezoneDisplayName, Boolean androidIsDeviceSecure, Boolean androidIsDebug, String androidConnectionType, Boolean androidIsVpnConnected, Boolean androidIsRoot, String androidIdentifierForVendor, String androidDeviceId, Integer androidDevelopmentSettingsEnabled, Integer androidAdbEnabled, Integer androidStayOnWhilePluggedIn, String androidDebugApp, Integer androidWaitForDebugger, String androidIsEmulator, String androidOzonIdSdkVersion) {
        return new FingerprintDTO(androidFingerprintType, androidModel, androidManufacturer, androidBrand, androidHardware, androidBoard, androidDevice, androidProduct, androidSdk, androidRelease, androidSecurityPatch, androidBuildId, androidRadioVersion, androidFingerprint, androidTags, androidType, androidTime, androidUser, androidBootloader, androidSku, androidOdmSku, androidDisplay, androidHost, androidSupportedAbis, androidSocManufacturer, androidSocModel, androidScreenWidth, androidScreenHeight, androidDensity, androidDensityWidth, androidDensityHeight, androidPackageName, androidVersionName, androidFirstInstallTime, androidLastUpdateTime, androidVersionCode, androidLocales, androidTimezoneId, androidTimezoneRawOffset, androidTimezoneDisplayName, androidIsDeviceSecure, androidIsDebug, androidConnectionType, androidIsVpnConnected, androidIsRoot, androidIdentifierForVendor, androidDeviceId, androidDevelopmentSettingsEnabled, androidAdbEnabled, androidStayOnWhilePluggedIn, androidDebugApp, androidWaitForDebugger, androidIsEmulator, androidOzonIdSdkVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerprintDTO)) {
            return false;
        }
        FingerprintDTO fingerprintDTO = (FingerprintDTO) other;
        return Intrinsics.d(this.androidFingerprintType, fingerprintDTO.androidFingerprintType) && Intrinsics.d(this.androidModel, fingerprintDTO.androidModel) && Intrinsics.d(this.androidManufacturer, fingerprintDTO.androidManufacturer) && Intrinsics.d(this.androidBrand, fingerprintDTO.androidBrand) && Intrinsics.d(this.androidHardware, fingerprintDTO.androidHardware) && Intrinsics.d(this.androidBoard, fingerprintDTO.androidBoard) && Intrinsics.d(this.androidDevice, fingerprintDTO.androidDevice) && Intrinsics.d(this.androidProduct, fingerprintDTO.androidProduct) && Intrinsics.d(this.androidSdk, fingerprintDTO.androidSdk) && Intrinsics.d(this.androidRelease, fingerprintDTO.androidRelease) && Intrinsics.d(this.androidSecurityPatch, fingerprintDTO.androidSecurityPatch) && Intrinsics.d(this.androidBuildId, fingerprintDTO.androidBuildId) && Intrinsics.d(this.androidRadioVersion, fingerprintDTO.androidRadioVersion) && Intrinsics.d(this.androidFingerprint, fingerprintDTO.androidFingerprint) && Intrinsics.d(this.androidTags, fingerprintDTO.androidTags) && Intrinsics.d(this.androidType, fingerprintDTO.androidType) && Intrinsics.d(this.androidTime, fingerprintDTO.androidTime) && Intrinsics.d(this.androidUser, fingerprintDTO.androidUser) && Intrinsics.d(this.androidBootloader, fingerprintDTO.androidBootloader) && Intrinsics.d(this.androidSku, fingerprintDTO.androidSku) && Intrinsics.d(this.androidOdmSku, fingerprintDTO.androidOdmSku) && Intrinsics.d(this.androidDisplay, fingerprintDTO.androidDisplay) && Intrinsics.d(this.androidHost, fingerprintDTO.androidHost) && Intrinsics.d(this.androidSupportedAbis, fingerprintDTO.androidSupportedAbis) && Intrinsics.d(this.androidSocManufacturer, fingerprintDTO.androidSocManufacturer) && Intrinsics.d(this.androidSocModel, fingerprintDTO.androidSocModel) && Intrinsics.d(this.androidScreenWidth, fingerprintDTO.androidScreenWidth) && Intrinsics.d(this.androidScreenHeight, fingerprintDTO.androidScreenHeight) && Intrinsics.d(this.androidDensity, fingerprintDTO.androidDensity) && Intrinsics.d(this.androidDensityWidth, fingerprintDTO.androidDensityWidth) && Intrinsics.d(this.androidDensityHeight, fingerprintDTO.androidDensityHeight) && Intrinsics.d(this.androidPackageName, fingerprintDTO.androidPackageName) && Intrinsics.d(this.androidVersionName, fingerprintDTO.androidVersionName) && Intrinsics.d(this.androidFirstInstallTime, fingerprintDTO.androidFirstInstallTime) && Intrinsics.d(this.androidLastUpdateTime, fingerprintDTO.androidLastUpdateTime) && Intrinsics.d(this.androidVersionCode, fingerprintDTO.androidVersionCode) && Intrinsics.d(this.androidLocales, fingerprintDTO.androidLocales) && Intrinsics.d(this.androidTimezoneId, fingerprintDTO.androidTimezoneId) && Intrinsics.d(this.androidTimezoneRawOffset, fingerprintDTO.androidTimezoneRawOffset) && Intrinsics.d(this.androidTimezoneDisplayName, fingerprintDTO.androidTimezoneDisplayName) && Intrinsics.d(this.androidIsDeviceSecure, fingerprintDTO.androidIsDeviceSecure) && Intrinsics.d(this.androidIsDebug, fingerprintDTO.androidIsDebug) && Intrinsics.d(this.androidConnectionType, fingerprintDTO.androidConnectionType) && Intrinsics.d(this.androidIsVpnConnected, fingerprintDTO.androidIsVpnConnected) && Intrinsics.d(this.androidIsRoot, fingerprintDTO.androidIsRoot) && Intrinsics.d(this.androidIdentifierForVendor, fingerprintDTO.androidIdentifierForVendor) && Intrinsics.d(this.androidDeviceId, fingerprintDTO.androidDeviceId) && Intrinsics.d(this.androidDevelopmentSettingsEnabled, fingerprintDTO.androidDevelopmentSettingsEnabled) && Intrinsics.d(this.androidAdbEnabled, fingerprintDTO.androidAdbEnabled) && Intrinsics.d(this.androidStayOnWhilePluggedIn, fingerprintDTO.androidStayOnWhilePluggedIn) && Intrinsics.d(this.androidDebugApp, fingerprintDTO.androidDebugApp) && Intrinsics.d(this.androidWaitForDebugger, fingerprintDTO.androidWaitForDebugger) && Intrinsics.d(this.androidIsEmulator, fingerprintDTO.androidIsEmulator) && Intrinsics.d(this.androidOzonIdSdkVersion, fingerprintDTO.androidOzonIdSdkVersion);
    }

    public final Integer getAndroidAdbEnabled() {
        return this.androidAdbEnabled;
    }

    public final String getAndroidBoard() {
        return this.androidBoard;
    }

    public final String getAndroidBootloader() {
        return this.androidBootloader;
    }

    public final String getAndroidBrand() {
        return this.androidBrand;
    }

    public final String getAndroidBuildId() {
        return this.androidBuildId;
    }

    public final String getAndroidConnectionType() {
        return this.androidConnectionType;
    }

    public final String getAndroidDebugApp() {
        return this.androidDebugApp;
    }

    public final Float getAndroidDensity() {
        return this.androidDensity;
    }

    public final Float getAndroidDensityHeight() {
        return this.androidDensityHeight;
    }

    public final Float getAndroidDensityWidth() {
        return this.androidDensityWidth;
    }

    public final Integer getAndroidDevelopmentSettingsEnabled() {
        return this.androidDevelopmentSettingsEnabled;
    }

    public final String getAndroidDevice() {
        return this.androidDevice;
    }

    public final String getAndroidDeviceId() {
        return this.androidDeviceId;
    }

    public final String getAndroidDisplay() {
        return this.androidDisplay;
    }

    public final String getAndroidFingerprint() {
        return this.androidFingerprint;
    }

    public final String getAndroidFingerprintType() {
        return this.androidFingerprintType;
    }

    public final Long getAndroidFirstInstallTime() {
        return this.androidFirstInstallTime;
    }

    public final String getAndroidHardware() {
        return this.androidHardware;
    }

    public final String getAndroidHost() {
        return this.androidHost;
    }

    public final String getAndroidIdentifierForVendor() {
        return this.androidIdentifierForVendor;
    }

    public final Boolean getAndroidIsDebug() {
        return this.androidIsDebug;
    }

    public final Boolean getAndroidIsDeviceSecure() {
        return this.androidIsDeviceSecure;
    }

    public final String getAndroidIsEmulator() {
        return this.androidIsEmulator;
    }

    public final Boolean getAndroidIsRoot() {
        return this.androidIsRoot;
    }

    public final Boolean getAndroidIsVpnConnected() {
        return this.androidIsVpnConnected;
    }

    public final Long getAndroidLastUpdateTime() {
        return this.androidLastUpdateTime;
    }

    public final List<String> getAndroidLocales() {
        return this.androidLocales;
    }

    public final String getAndroidManufacturer() {
        return this.androidManufacturer;
    }

    public final String getAndroidModel() {
        return this.androidModel;
    }

    public final String getAndroidOdmSku() {
        return this.androidOdmSku;
    }

    public final String getAndroidOzonIdSdkVersion() {
        return this.androidOzonIdSdkVersion;
    }

    public final String getAndroidPackageName() {
        return this.androidPackageName;
    }

    public final String getAndroidProduct() {
        return this.androidProduct;
    }

    public final String getAndroidRadioVersion() {
        return this.androidRadioVersion;
    }

    public final String getAndroidRelease() {
        return this.androidRelease;
    }

    public final Integer getAndroidScreenHeight() {
        return this.androidScreenHeight;
    }

    public final Integer getAndroidScreenWidth() {
        return this.androidScreenWidth;
    }

    public final Integer getAndroidSdk() {
        return this.androidSdk;
    }

    public final String getAndroidSecurityPatch() {
        return this.androidSecurityPatch;
    }

    public final String getAndroidSku() {
        return this.androidSku;
    }

    public final String getAndroidSocManufacturer() {
        return this.androidSocManufacturer;
    }

    public final String getAndroidSocModel() {
        return this.androidSocModel;
    }

    public final Integer getAndroidStayOnWhilePluggedIn() {
        return this.androidStayOnWhilePluggedIn;
    }

    public final List<String> getAndroidSupportedAbis() {
        return this.androidSupportedAbis;
    }

    public final String getAndroidTags() {
        return this.androidTags;
    }

    public final Long getAndroidTime() {
        return this.androidTime;
    }

    public final String getAndroidTimezoneDisplayName() {
        return this.androidTimezoneDisplayName;
    }

    public final String getAndroidTimezoneId() {
        return this.androidTimezoneId;
    }

    public final Integer getAndroidTimezoneRawOffset() {
        return this.androidTimezoneRawOffset;
    }

    public final String getAndroidType() {
        return this.androidType;
    }

    public final String getAndroidUser() {
        return this.androidUser;
    }

    public final Integer getAndroidVersionCode() {
        return this.androidVersionCode;
    }

    public final String getAndroidVersionName() {
        return this.androidVersionName;
    }

    public final Integer getAndroidWaitForDebugger() {
        return this.androidWaitForDebugger;
    }

    public int hashCode() {
        String str = this.androidFingerprintType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.androidModel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.androidManufacturer;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.androidBrand;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.androidHardware;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.androidBoard;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.androidDevice;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.androidProduct;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.androidSdk;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.androidRelease;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.androidSecurityPatch;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.androidBuildId;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.androidRadioVersion;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.androidFingerprint;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.androidTags;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.androidType;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l11 = this.androidTime;
        int hashCode17 = (hashCode16 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str16 = this.androidUser;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.androidBootloader;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.androidSku;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.androidOdmSku;
        int hashCode21 = (hashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.androidDisplay;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.androidHost;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        List<String> list = this.androidSupportedAbis;
        int hashCode24 = (hashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        String str22 = this.androidSocManufacturer;
        int hashCode25 = (hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.androidSocModel;
        int hashCode26 = (hashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Integer num2 = this.androidScreenWidth;
        int hashCode27 = (hashCode26 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.androidScreenHeight;
        int hashCode28 = (hashCode27 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f7 = this.androidDensity;
        int hashCode29 = (hashCode28 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f11 = this.androidDensityWidth;
        int hashCode30 = (hashCode29 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.androidDensityHeight;
        int hashCode31 = (hashCode30 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str24 = this.androidPackageName;
        int hashCode32 = (hashCode31 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.androidVersionName;
        int hashCode33 = (hashCode32 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Long l12 = this.androidFirstInstallTime;
        int hashCode34 = (hashCode33 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.androidLastUpdateTime;
        int hashCode35 = (hashCode34 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num4 = this.androidVersionCode;
        int hashCode36 = (hashCode35 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<String> list2 = this.androidLocales;
        int hashCode37 = (hashCode36 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str26 = this.androidTimezoneId;
        int hashCode38 = (hashCode37 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Integer num5 = this.androidTimezoneRawOffset;
        int hashCode39 = (hashCode38 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str27 = this.androidTimezoneDisplayName;
        int hashCode40 = (hashCode39 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Boolean bool = this.androidIsDeviceSecure;
        int hashCode41 = (hashCode40 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.androidIsDebug;
        int hashCode42 = (hashCode41 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str28 = this.androidConnectionType;
        int hashCode43 = (hashCode42 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Boolean bool3 = this.androidIsVpnConnected;
        int hashCode44 = (hashCode43 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.androidIsRoot;
        int hashCode45 = (hashCode44 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str29 = this.androidIdentifierForVendor;
        int hashCode46 = (hashCode45 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.androidDeviceId;
        int hashCode47 = (hashCode46 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Integer num6 = this.androidDevelopmentSettingsEnabled;
        int hashCode48 = (hashCode47 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.androidAdbEnabled;
        int hashCode49 = (hashCode48 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.androidStayOnWhilePluggedIn;
        int hashCode50 = (hashCode49 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str31 = this.androidDebugApp;
        int hashCode51 = (hashCode50 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Integer num9 = this.androidWaitForDebugger;
        int hashCode52 = (hashCode51 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str32 = this.androidIsEmulator;
        int hashCode53 = (hashCode52 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.androidOzonIdSdkVersion;
        return hashCode53 + (str33 != null ? str33.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.androidFingerprintType;
        String str2 = this.androidModel;
        String str3 = this.androidManufacturer;
        String str4 = this.androidBrand;
        String str5 = this.androidHardware;
        String str6 = this.androidBoard;
        String str7 = this.androidDevice;
        String str8 = this.androidProduct;
        Integer num = this.androidSdk;
        String str9 = this.androidRelease;
        String str10 = this.androidSecurityPatch;
        String str11 = this.androidBuildId;
        String str12 = this.androidRadioVersion;
        String str13 = this.androidFingerprint;
        String str14 = this.androidTags;
        String str15 = this.androidType;
        Long l11 = this.androidTime;
        String str16 = this.androidUser;
        String str17 = this.androidBootloader;
        String str18 = this.androidSku;
        String str19 = this.androidOdmSku;
        String str20 = this.androidDisplay;
        String str21 = this.androidHost;
        List<String> list = this.androidSupportedAbis;
        String str22 = this.androidSocManufacturer;
        String str23 = this.androidSocModel;
        Integer num2 = this.androidScreenWidth;
        Integer num3 = this.androidScreenHeight;
        Float f7 = this.androidDensity;
        Float f11 = this.androidDensityWidth;
        Float f12 = this.androidDensityHeight;
        String str24 = this.androidPackageName;
        String str25 = this.androidVersionName;
        Long l12 = this.androidFirstInstallTime;
        Long l13 = this.androidLastUpdateTime;
        Integer num4 = this.androidVersionCode;
        List<String> list2 = this.androidLocales;
        String str26 = this.androidTimezoneId;
        Integer num5 = this.androidTimezoneRawOffset;
        String str27 = this.androidTimezoneDisplayName;
        Boolean bool = this.androidIsDeviceSecure;
        Boolean bool2 = this.androidIsDebug;
        String str28 = this.androidConnectionType;
        Boolean bool3 = this.androidIsVpnConnected;
        Boolean bool4 = this.androidIsRoot;
        String str29 = this.androidIdentifierForVendor;
        String str30 = this.androidDeviceId;
        Integer num6 = this.androidDevelopmentSettingsEnabled;
        Integer num7 = this.androidAdbEnabled;
        Integer num8 = this.androidStayOnWhilePluggedIn;
        String str31 = this.androidDebugApp;
        Integer num9 = this.androidWaitForDebugger;
        String str32 = this.androidIsEmulator;
        String str33 = this.androidOzonIdSdkVersion;
        StringBuilder d11 = C3660k.d("FingerprintDTO(androidFingerprintType=", str, ", androidModel=", str2, ", androidManufacturer=");
        a.h(d11, str3, ", androidBrand=", str4, ", androidHardware=");
        a.h(d11, str5, ", androidBoard=", str6, ", androidDevice=");
        a.h(d11, str7, ", androidProduct=", str8, ", androidSdk=");
        V.f(num, ", androidRelease=", str9, ", androidSecurityPatch=", d11);
        a.h(d11, str10, ", androidBuildId=", str11, ", androidRadioVersion=");
        a.h(d11, str12, ", androidFingerprint=", str13, ", androidTags=");
        a.h(d11, str14, ", androidType=", str15, ", androidTime=");
        d11.append(l11);
        d11.append(", androidUser=");
        d11.append(str16);
        d11.append(", androidBootloader=");
        a.h(d11, str17, ", androidSku=", str18, ", androidOdmSku=");
        a.h(d11, str19, ", androidDisplay=", str20, ", androidHost=");
        w.d(str21, ", androidSupportedAbis=", ", androidSocManufacturer=", d11, list);
        a.h(d11, str22, ", androidSocModel=", str23, ", androidScreenWidth=");
        c.e(d11, num2, ", androidScreenHeight=", num3, ", androidDensity=");
        d11.append(f7);
        d11.append(", androidDensityWidth=");
        d11.append(f11);
        d11.append(", androidDensityHeight=");
        d11.append(f12);
        d11.append(", androidPackageName=");
        d11.append(str24);
        d11.append(", androidVersionName=");
        d11.append(str25);
        d11.append(", androidFirstInstallTime=");
        d11.append(l12);
        d11.append(", androidLastUpdateTime=");
        d11.append(l13);
        d11.append(", androidVersionCode=");
        d11.append(num4);
        d11.append(", androidLocales=");
        e.i(", androidTimezoneId=", str26, ", androidTimezoneRawOffset=", d11, list2);
        V.f(num5, ", androidTimezoneDisplayName=", str27, ", androidIsDeviceSecure=", d11);
        h.h(d11, bool, ", androidIsDebug=", bool2, ", androidConnectionType=");
        Sh.a.d(bool3, str28, ", androidIsVpnConnected=", ", androidIsRoot=", d11);
        b.c(bool4, ", androidIdentifierForVendor=", str29, ", androidDeviceId=", d11);
        C2454a.f(num6, str30, ", androidDevelopmentSettingsEnabled=", ", androidAdbEnabled=", d11);
        c.e(d11, num7, ", androidStayOnWhilePluggedIn=", num8, ", androidDebugApp=");
        C2454a.f(num9, str31, ", androidWaitForDebugger=", ", androidIsEmulator=", d11);
        return C3173b.c(d11, str32, ", androidOzonIdSdkVersion=", str33, ")");
    }
}
