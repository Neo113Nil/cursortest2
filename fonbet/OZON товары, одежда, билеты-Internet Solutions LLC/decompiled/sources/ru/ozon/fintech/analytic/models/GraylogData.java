package ru.ozon.fintech.analytic.models;

import B0.C2454a;
import B4.V;
import D3.h;
import G.g;
import HY.b;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0003\b\u0095\u0001\b\u0081\b\u0018\u00002\u00020\u0001BÙ\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b9\u0010:J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010FJ\t\u0010~\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010FJ\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010FJ\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¤\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010FJ\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jî\u0004\u0010¨\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010©\u0001J\u0015\u0010ª\u0001\u001a\u00020\u00192\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¬\u0001\u001a\u00020\rHÖ\u0001J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010<R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010<R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010<R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010<R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010<R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010<R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010<R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010<R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010<R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010<R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010<R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\bP\u0010FR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010<R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bR\u0010SR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010<R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bV\u0010SR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010<R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010<R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bY\u0010SR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bZ\u0010SR\u001a\u0010 \u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\b[\u0010SR\u001a\u0010!\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\b\\\u0010SR\u001a\u0010\"\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\b]\u0010SR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010<R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010<R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010<R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010<R\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010<R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010<R\u001a\u0010)\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bd\u0010SR\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010<R\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010<R\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010<R\u0018\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010<R\u0018\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010<R\u001a\u0010/\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bj\u0010SR\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010<R\u0018\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010<R\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010<R\u001a\u00103\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\bn\u0010FR\u0018\u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010<R\u001a\u00105\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010G\u001a\u0004\bp\u0010FR\u0018\u00106\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010<R\u0018\u00107\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010<R\u0018\u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010<¨\u0006®\u0001"}, d2 = {"Lru/ozon/fintech/analytic/models/GraylogData;", "", "userId", "", "appVersion", "service", "timestamp", "message", "env", "platform", "tag", "data", "delay", "", "uuid", "sessionId", "team", "tabId", "webViewVersion", ImagesContract.URL, "assetUrl", "errorDescription", "errorCode", "status", "vpn", "", "networkType", "firstLaunch", "model", "manufacturer", "permPostNotification", "permCamera", "permAccessLocation", "permReadContacts", "permUseBiometric", "platformVersion", "ozonIdSessionId", "pushType", "pins", "sign", "pubKey", "result", "pinsType", "pinsHashes", "certsChain", "logsCount", "storeName", "needUpdate", "rustoreStatus", "gmsStatus", "ozonSdkStatus", "barcodeRecognitionType", "barcodeRecognitionSource", "barcodeRecognitionAvailableTypes", "clusterName", "regionName", "cityName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getAppVersion", "getService", "getTimestamp", "getMessage", "getEnv", "getPlatform", "getTag", "getData", "getDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUuid", "getSessionId", "getTeam", "getTabId", "getWebViewVersion", "getUrl", "getAssetUrl", "getErrorDescription", "getErrorCode", "getStatus", "getVpn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNetworkType", "getFirstLaunch", "getModel", "getManufacturer", "getPermPostNotification", "getPermCamera", "getPermAccessLocation", "getPermReadContacts", "getPermUseBiometric", "getPlatformVersion", "getOzonIdSessionId", "getPushType", "getPins", "getSign", "getPubKey", "getResult", "getPinsType", "getPinsHashes", "getCertsChain", "getLogsCount", "getStoreName", "getNeedUpdate", "getRustoreStatus", "getGmsStatus", "getOzonSdkStatus", "getBarcodeRecognitionType", "getBarcodeRecognitionSource", "getBarcodeRecognitionAvailableTypes", "getClusterName", "getRegionName", "getCityName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/fintech/analytic/models/GraylogData;", "equals", "other", "hashCode", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GraylogData {

    @i(name = "app_version")
    @NotNull
    private final String appVersion;

    @i(name = "asset_url")
    private final String assetUrl;

    @i(name = "barcode_recognition_available_types")
    private final Integer barcodeRecognitionAvailableTypes;

    @i(name = "barcode_recognition_source")
    private final String barcodeRecognitionSource;

    @i(name = "barcode_recognition_type")
    private final Integer barcodeRecognitionType;

    @i(name = "certs_chain")
    private final String certsChain;

    @i(name = "city_name")
    private final String cityName;

    @i(name = "cluster_name")
    private final String clusterName;

    @i(name = "data")
    private final String data;

    @i(name = "delay")
    private final Integer delay;

    @i(name = "env")
    @NotNull
    private final String env;

    @i(name = "error_code")
    private final Integer errorCode;

    @i(name = "error_desc")
    private final String errorDescription;

    @i(name = "first_launch")
    private final Boolean firstLaunch;

    @i(name = "gms_status")
    private final String gmsStatus;

    @i(name = "logs_count")
    private final String logsCount;

    @i(name = "manufacturer")
    private final String manufacturer;

    @i(name = "message")
    @NotNull
    private final String message;

    @i(name = "model")
    private final String model;

    @i(name = "need_update")
    private final Boolean needUpdate;

    @i(name = "network_type")
    private final String networkType;

    @i(name = "ozonID_session_id")
    private final String ozonIdSessionId;

    @i(name = "ozon_sdk_status")
    private final String ozonSdkStatus;

    @i(name = "perm_access_location")
    private final Boolean permAccessLocation;

    @i(name = "perm_camera")
    private final Boolean permCamera;

    @i(name = "perm_post_notifications")
    private final Boolean permPostNotification;

    @i(name = "perm_read_contacts")
    private final Boolean permReadContacts;

    @i(name = "perm_use_biometric")
    private final Boolean permUseBiometric;

    @i(name = "pins_data")
    private final String pins;

    @i(name = "pins_hashes")
    private final String pinsHashes;

    @i(name = "pins_type")
    private final String pinsType;

    @i(name = "platform")
    @NotNull
    private final String platform;

    @i(name = "platform_version")
    private final String platformVersion;

    @i(name = "pub_key")
    private final String pubKey;

    @i(name = "push_type")
    private final String pushType;

    @i(name = "region_name")
    private final String regionName;

    @i(name = "result")
    private final Boolean result;

    @i(name = "rustore_status")
    private final String rustoreStatus;

    @i(name = "service")
    @NotNull
    private final String service;

    @i(name = "session_id")
    private final String sessionId;

    @i(name = "pins_sign_data")
    private final String sign;

    @i(name = "status")
    private final String status;

    @i(name = "store_name")
    private final String storeName;

    @i(name = "tab_id")
    private final String tabId;

    @i(name = "tag")
    private final String tag;

    @i(name = "team")
    @NotNull
    private final String team;

    @i(name = "ts")
    @NotNull
    private final String timestamp;

    @i(name = ImagesContract.URL)
    private final String url;

    @i(name = "userId")
    @NotNull
    private final String userId;

    @i(name = "uuid")
    @NotNull
    private final String uuid;

    @i(name = "vpn")
    private final Boolean vpn;

    @i(name = "webview")
    private final String webViewVersion;

    public GraylogData(@NotNull String userId, @NotNull String appVersion, @NotNull String service, @NotNull String timestamp, @NotNull String message, @NotNull String env, @NotNull String platform, String str, String str2, Integer num, @NotNull String uuid, String str3, @NotNull String team, String str4, String str5, String str6, String str7, String str8, Integer num2, String str9, Boolean bool, String str10, Boolean bool2, String str11, String str12, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool8, String str19, String str20, String str21, String str22, String str23, Boolean bool9, String str24, String str25, String str26, Integer num3, String str27, Integer num4, String str28, String str29, String str30) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(team, "team");
        this.userId = userId;
        this.appVersion = appVersion;
        this.service = service;
        this.timestamp = timestamp;
        this.message = message;
        this.env = env;
        this.platform = platform;
        this.tag = str;
        this.data = str2;
        this.delay = num;
        this.uuid = uuid;
        this.sessionId = str3;
        this.team = team;
        this.tabId = str4;
        this.webViewVersion = str5;
        this.url = str6;
        this.assetUrl = str7;
        this.errorDescription = str8;
        this.errorCode = num2;
        this.status = str9;
        this.vpn = bool;
        this.networkType = str10;
        this.firstLaunch = bool2;
        this.model = str11;
        this.manufacturer = str12;
        this.permPostNotification = bool3;
        this.permCamera = bool4;
        this.permAccessLocation = bool5;
        this.permReadContacts = bool6;
        this.permUseBiometric = bool7;
        this.platformVersion = str13;
        this.ozonIdSessionId = str14;
        this.pushType = str15;
        this.pins = str16;
        this.sign = str17;
        this.pubKey = str18;
        this.result = bool8;
        this.pinsType = str19;
        this.pinsHashes = str20;
        this.certsChain = str21;
        this.logsCount = str22;
        this.storeName = str23;
        this.needUpdate = bool9;
        this.rustoreStatus = str24;
        this.gmsStatus = str25;
        this.ozonSdkStatus = str26;
        this.barcodeRecognitionType = num3;
        this.barcodeRecognitionSource = str27;
        this.barcodeRecognitionAvailableTypes = num4;
        this.clusterName = str28;
        this.regionName = str29;
        this.cityName = str30;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getDelay() {
        return this.delay;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    /* renamed from: component14, reason: from getter */
    public final String getTabId() {
        return this.tabId;
    }

    /* renamed from: component15, reason: from getter */
    public final String getWebViewVersion() {
        return this.webViewVersion;
    }

    /* renamed from: component16, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component17, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    /* renamed from: component18, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component20, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component21, reason: from getter */
    public final Boolean getVpn() {
        return this.vpn;
    }

    /* renamed from: component22, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    /* renamed from: component23, reason: from getter */
    public final Boolean getFirstLaunch() {
        return this.firstLaunch;
    }

    /* renamed from: component24, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component25, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    /* renamed from: component26, reason: from getter */
    public final Boolean getPermPostNotification() {
        return this.permPostNotification;
    }

    /* renamed from: component27, reason: from getter */
    public final Boolean getPermCamera() {
        return this.permCamera;
    }

    /* renamed from: component28, reason: from getter */
    public final Boolean getPermAccessLocation() {
        return this.permAccessLocation;
    }

    /* renamed from: component29, reason: from getter */
    public final Boolean getPermReadContacts() {
        return this.permReadContacts;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* renamed from: component30, reason: from getter */
    public final Boolean getPermUseBiometric() {
        return this.permUseBiometric;
    }

    /* renamed from: component31, reason: from getter */
    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    /* renamed from: component32, reason: from getter */
    public final String getOzonIdSessionId() {
        return this.ozonIdSessionId;
    }

    /* renamed from: component33, reason: from getter */
    public final String getPushType() {
        return this.pushType;
    }

    /* renamed from: component34, reason: from getter */
    public final String getPins() {
        return this.pins;
    }

    /* renamed from: component35, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    /* renamed from: component36, reason: from getter */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* renamed from: component37, reason: from getter */
    public final Boolean getResult() {
        return this.result;
    }

    /* renamed from: component38, reason: from getter */
    public final String getPinsType() {
        return this.pinsType;
    }

    /* renamed from: component39, reason: from getter */
    public final String getPinsHashes() {
        return this.pinsHashes;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component40, reason: from getter */
    public final String getCertsChain() {
        return this.certsChain;
    }

    /* renamed from: component41, reason: from getter */
    public final String getLogsCount() {
        return this.logsCount;
    }

    /* renamed from: component42, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: component43, reason: from getter */
    public final Boolean getNeedUpdate() {
        return this.needUpdate;
    }

    /* renamed from: component44, reason: from getter */
    public final String getRustoreStatus() {
        return this.rustoreStatus;
    }

    /* renamed from: component45, reason: from getter */
    public final String getGmsStatus() {
        return this.gmsStatus;
    }

    /* renamed from: component46, reason: from getter */
    public final String getOzonSdkStatus() {
        return this.ozonSdkStatus;
    }

    /* renamed from: component47, reason: from getter */
    public final Integer getBarcodeRecognitionType() {
        return this.barcodeRecognitionType;
    }

    /* renamed from: component48, reason: from getter */
    public final String getBarcodeRecognitionSource() {
        return this.barcodeRecognitionSource;
    }

    /* renamed from: component49, reason: from getter */
    public final Integer getBarcodeRecognitionAvailableTypes() {
        return this.barcodeRecognitionAvailableTypes;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component50, reason: from getter */
    public final String getClusterName() {
        return this.clusterName;
    }

    /* renamed from: component51, reason: from getter */
    public final String getRegionName() {
        return this.regionName;
    }

    /* renamed from: component52, reason: from getter */
    public final String getCityName() {
        return this.cityName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getEnv() {
        return this.env;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component9, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final GraylogData copy(@NotNull String userId, @NotNull String appVersion, @NotNull String service, @NotNull String timestamp, @NotNull String message, @NotNull String env, @NotNull String platform, String tag, String data, Integer delay, @NotNull String uuid, String sessionId, @NotNull String team, String tabId, String webViewVersion, String url, String assetUrl, String errorDescription, Integer errorCode, String status, Boolean vpn, String networkType, Boolean firstLaunch, String model, String manufacturer, Boolean permPostNotification, Boolean permCamera, Boolean permAccessLocation, Boolean permReadContacts, Boolean permUseBiometric, String platformVersion, String ozonIdSessionId, String pushType, String pins, String sign, String pubKey, Boolean result, String pinsType, String pinsHashes, String certsChain, String logsCount, String storeName, Boolean needUpdate, String rustoreStatus, String gmsStatus, String ozonSdkStatus, Integer barcodeRecognitionType, String barcodeRecognitionSource, Integer barcodeRecognitionAvailableTypes, String clusterName, String regionName, String cityName) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(team, "team");
        return new GraylogData(userId, appVersion, service, timestamp, message, env, platform, tag, data, delay, uuid, sessionId, team, tabId, webViewVersion, url, assetUrl, errorDescription, errorCode, status, vpn, networkType, firstLaunch, model, manufacturer, permPostNotification, permCamera, permAccessLocation, permReadContacts, permUseBiometric, platformVersion, ozonIdSessionId, pushType, pins, sign, pubKey, result, pinsType, pinsHashes, certsChain, logsCount, storeName, needUpdate, rustoreStatus, gmsStatus, ozonSdkStatus, barcodeRecognitionType, barcodeRecognitionSource, barcodeRecognitionAvailableTypes, clusterName, regionName, cityName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraylogData)) {
            return false;
        }
        GraylogData graylogData = (GraylogData) other;
        return Intrinsics.d(this.userId, graylogData.userId) && Intrinsics.d(this.appVersion, graylogData.appVersion) && Intrinsics.d(this.service, graylogData.service) && Intrinsics.d(this.timestamp, graylogData.timestamp) && Intrinsics.d(this.message, graylogData.message) && Intrinsics.d(this.env, graylogData.env) && Intrinsics.d(this.platform, graylogData.platform) && Intrinsics.d(this.tag, graylogData.tag) && Intrinsics.d(this.data, graylogData.data) && Intrinsics.d(this.delay, graylogData.delay) && Intrinsics.d(this.uuid, graylogData.uuid) && Intrinsics.d(this.sessionId, graylogData.sessionId) && Intrinsics.d(this.team, graylogData.team) && Intrinsics.d(this.tabId, graylogData.tabId) && Intrinsics.d(this.webViewVersion, graylogData.webViewVersion) && Intrinsics.d(this.url, graylogData.url) && Intrinsics.d(this.assetUrl, graylogData.assetUrl) && Intrinsics.d(this.errorDescription, graylogData.errorDescription) && Intrinsics.d(this.errorCode, graylogData.errorCode) && Intrinsics.d(this.status, graylogData.status) && Intrinsics.d(this.vpn, graylogData.vpn) && Intrinsics.d(this.networkType, graylogData.networkType) && Intrinsics.d(this.firstLaunch, graylogData.firstLaunch) && Intrinsics.d(this.model, graylogData.model) && Intrinsics.d(this.manufacturer, graylogData.manufacturer) && Intrinsics.d(this.permPostNotification, graylogData.permPostNotification) && Intrinsics.d(this.permCamera, graylogData.permCamera) && Intrinsics.d(this.permAccessLocation, graylogData.permAccessLocation) && Intrinsics.d(this.permReadContacts, graylogData.permReadContacts) && Intrinsics.d(this.permUseBiometric, graylogData.permUseBiometric) && Intrinsics.d(this.platformVersion, graylogData.platformVersion) && Intrinsics.d(this.ozonIdSessionId, graylogData.ozonIdSessionId) && Intrinsics.d(this.pushType, graylogData.pushType) && Intrinsics.d(this.pins, graylogData.pins) && Intrinsics.d(this.sign, graylogData.sign) && Intrinsics.d(this.pubKey, graylogData.pubKey) && Intrinsics.d(this.result, graylogData.result) && Intrinsics.d(this.pinsType, graylogData.pinsType) && Intrinsics.d(this.pinsHashes, graylogData.pinsHashes) && Intrinsics.d(this.certsChain, graylogData.certsChain) && Intrinsics.d(this.logsCount, graylogData.logsCount) && Intrinsics.d(this.storeName, graylogData.storeName) && Intrinsics.d(this.needUpdate, graylogData.needUpdate) && Intrinsics.d(this.rustoreStatus, graylogData.rustoreStatus) && Intrinsics.d(this.gmsStatus, graylogData.gmsStatus) && Intrinsics.d(this.ozonSdkStatus, graylogData.ozonSdkStatus) && Intrinsics.d(this.barcodeRecognitionType, graylogData.barcodeRecognitionType) && Intrinsics.d(this.barcodeRecognitionSource, graylogData.barcodeRecognitionSource) && Intrinsics.d(this.barcodeRecognitionAvailableTypes, graylogData.barcodeRecognitionAvailableTypes) && Intrinsics.d(this.clusterName, graylogData.clusterName) && Intrinsics.d(this.regionName, graylogData.regionName) && Intrinsics.d(this.cityName, graylogData.cityName);
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getAssetUrl() {
        return this.assetUrl;
    }

    public final Integer getBarcodeRecognitionAvailableTypes() {
        return this.barcodeRecognitionAvailableTypes;
    }

    public final String getBarcodeRecognitionSource() {
        return this.barcodeRecognitionSource;
    }

    public final Integer getBarcodeRecognitionType() {
        return this.barcodeRecognitionType;
    }

    public final String getCertsChain() {
        return this.certsChain;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getClusterName() {
        return this.clusterName;
    }

    public final String getData() {
        return this.data;
    }

    public final Integer getDelay() {
        return this.delay;
    }

    @NotNull
    public final String getEnv() {
        return this.env;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final Boolean getFirstLaunch() {
        return this.firstLaunch;
    }

    public final String getGmsStatus() {
        return this.gmsStatus;
    }

    public final String getLogsCount() {
        return this.logsCount;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final String getModel() {
        return this.model;
    }

    public final Boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getOzonIdSessionId() {
        return this.ozonIdSessionId;
    }

    public final String getOzonSdkStatus() {
        return this.ozonSdkStatus;
    }

    public final Boolean getPermAccessLocation() {
        return this.permAccessLocation;
    }

    public final Boolean getPermCamera() {
        return this.permCamera;
    }

    public final Boolean getPermPostNotification() {
        return this.permPostNotification;
    }

    public final Boolean getPermReadContacts() {
        return this.permReadContacts;
    }

    public final Boolean getPermUseBiometric() {
        return this.permUseBiometric;
    }

    public final String getPins() {
        return this.pins;
    }

    public final String getPinsHashes() {
        return this.pinsHashes;
    }

    public final String getPinsType() {
        return this.pinsType;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    public final String getPubKey() {
        return this.pubKey;
    }

    public final String getPushType() {
        return this.pushType;
    }

    public final String getRegionName() {
        return this.regionName;
    }

    public final Boolean getResult() {
        return this.result;
    }

    public final String getRustoreStatus() {
        return this.rustoreStatus;
    }

    @NotNull
    public final String getService() {
        return this.service;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSign() {
        return this.sign;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getTeam() {
        return this.team;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final Boolean getVpn() {
        return this.vpn;
    }

    public final String getWebViewVersion() {
        return this.webViewVersion;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(g.a(g.a(g.a(this.userId.hashCode() * 31, 31, this.appVersion), 31, this.service), 31, this.timestamp), 31, this.message), 31, this.env), 31, this.platform);
        String str = this.tag;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.delay;
        int a12 = g.a((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.uuid);
        String str3 = this.sessionId;
        int a13 = g.a((a12 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.team);
        String str4 = this.tabId;
        int hashCode3 = (a13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.webViewVersion;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.assetUrl;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.errorDescription;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.errorCode;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.status;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.vpn;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.networkType;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.firstLaunch;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str11 = this.model;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.manufacturer;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool3 = this.permPostNotification;
        int hashCode15 = (hashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.permCamera;
        int hashCode16 = (hashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.permAccessLocation;
        int hashCode17 = (hashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.permReadContacts;
        int hashCode18 = (hashCode17 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.permUseBiometric;
        int hashCode19 = (hashCode18 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str13 = this.platformVersion;
        int hashCode20 = (hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.ozonIdSessionId;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.pushType;
        int hashCode22 = (hashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.pins;
        int hashCode23 = (hashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.sign;
        int hashCode24 = (hashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.pubKey;
        int hashCode25 = (hashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool8 = this.result;
        int hashCode26 = (hashCode25 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str19 = this.pinsType;
        int hashCode27 = (hashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.pinsHashes;
        int hashCode28 = (hashCode27 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.certsChain;
        int hashCode29 = (hashCode28 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.logsCount;
        int hashCode30 = (hashCode29 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.storeName;
        int hashCode31 = (hashCode30 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool9 = this.needUpdate;
        int hashCode32 = (hashCode31 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str24 = this.rustoreStatus;
        int hashCode33 = (hashCode32 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.gmsStatus;
        int hashCode34 = (hashCode33 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.ozonSdkStatus;
        int hashCode35 = (hashCode34 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Integer num3 = this.barcodeRecognitionType;
        int hashCode36 = (hashCode35 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str27 = this.barcodeRecognitionSource;
        int hashCode37 = (hashCode36 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Integer num4 = this.barcodeRecognitionAvailableTypes;
        int hashCode38 = (hashCode37 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str28 = this.clusterName;
        int hashCode39 = (hashCode38 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.regionName;
        int hashCode40 = (hashCode39 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.cityName;
        return hashCode40 + (str30 != null ? str30.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.appVersion;
        String str3 = this.service;
        String str4 = this.timestamp;
        String str5 = this.message;
        String str6 = this.env;
        String str7 = this.platform;
        String str8 = this.tag;
        String str9 = this.data;
        Integer num = this.delay;
        String str10 = this.uuid;
        String str11 = this.sessionId;
        String str12 = this.team;
        String str13 = this.tabId;
        String str14 = this.webViewVersion;
        String str15 = this.url;
        String str16 = this.assetUrl;
        String str17 = this.errorDescription;
        Integer num2 = this.errorCode;
        String str18 = this.status;
        Boolean bool = this.vpn;
        String str19 = this.networkType;
        Boolean bool2 = this.firstLaunch;
        String str20 = this.model;
        String str21 = this.manufacturer;
        Boolean bool3 = this.permPostNotification;
        Boolean bool4 = this.permCamera;
        Boolean bool5 = this.permAccessLocation;
        Boolean bool6 = this.permReadContacts;
        Boolean bool7 = this.permUseBiometric;
        String str22 = this.platformVersion;
        String str23 = this.ozonIdSessionId;
        String str24 = this.pushType;
        String str25 = this.pins;
        String str26 = this.sign;
        String str27 = this.pubKey;
        Boolean bool8 = this.result;
        String str28 = this.pinsType;
        String str29 = this.pinsHashes;
        String str30 = this.certsChain;
        String str31 = this.logsCount;
        String str32 = this.storeName;
        Boolean bool9 = this.needUpdate;
        String str33 = this.rustoreStatus;
        String str34 = this.gmsStatus;
        String str35 = this.ozonSdkStatus;
        Integer num3 = this.barcodeRecognitionType;
        String str36 = this.barcodeRecognitionSource;
        Integer num4 = this.barcodeRecognitionAvailableTypes;
        String str37 = this.clusterName;
        String str38 = this.regionName;
        String str39 = this.cityName;
        StringBuilder d11 = C3660k.d("GraylogData(userId=", str, ", appVersion=", str2, ", service=");
        a.h(d11, str3, ", timestamp=", str4, ", message=");
        a.h(d11, str5, ", env=", str6, ", platform=");
        a.h(d11, str7, ", tag=", str8, ", data=");
        C2454a.f(num, str9, ", delay=", ", uuid=", d11);
        a.h(d11, str10, ", sessionId=", str11, ", team=");
        a.h(d11, str12, ", tabId=", str13, ", webViewVersion=");
        a.h(d11, str14, ", url=", str15, ", assetUrl=");
        a.h(d11, str16, ", errorDescription=", str17, ", errorCode=");
        V.f(num2, ", status=", str18, ", vpn=", d11);
        b.c(bool, ", networkType=", str19, ", firstLaunch=", d11);
        b.c(bool2, ", model=", str20, ", manufacturer=", d11);
        Sh.a.d(bool3, str21, ", permPostNotification=", ", permCamera=", d11);
        h.h(d11, bool4, ", permAccessLocation=", bool5, ", permReadContacts=");
        h.h(d11, bool6, ", permUseBiometric=", bool7, ", platformVersion=");
        a.h(d11, str22, ", ozonIdSessionId=", str23, ", pushType=");
        a.h(d11, str24, ", pins=", str25, ", sign=");
        a.h(d11, str26, ", pubKey=", str27, ", result=");
        b.c(bool8, ", pinsType=", str28, ", pinsHashes=", d11);
        a.h(d11, str29, ", certsChain=", str30, ", logsCount=");
        a.h(d11, str31, ", storeName=", str32, ", needUpdate=");
        b.c(bool9, ", rustoreStatus=", str33, ", gmsStatus=", d11);
        a.h(d11, str34, ", ozonSdkStatus=", str35, ", barcodeRecognitionType=");
        V.f(num3, ", barcodeRecognitionSource=", str36, ", barcodeRecognitionAvailableTypes=", d11);
        V.f(num4, ", clusterName=", str37, ", regionName=", d11);
        return C3173b.c(d11, str38, ", cityName=", str39, ")");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GraylogData(java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.Integer r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.Integer r75, java.lang.String r76, java.lang.Boolean r77, java.lang.String r78, java.lang.Boolean r79, java.lang.String r80, java.lang.String r81, java.lang.Boolean r82, java.lang.Boolean r83, java.lang.Boolean r84, java.lang.Boolean r85, java.lang.Boolean r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.Boolean r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.lang.Boolean r99, java.lang.String r100, java.lang.String r101, java.lang.String r102, java.lang.Integer r103, java.lang.String r104, java.lang.Integer r105, java.lang.String r106, java.lang.String r107, java.lang.String r108, int r109, int r110, kotlin.jvm.internal.DefaultConstructorMarker r111) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.analytic.models.GraylogData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
