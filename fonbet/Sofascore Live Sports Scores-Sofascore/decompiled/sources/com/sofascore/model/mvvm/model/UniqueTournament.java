package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.IUrlSharing;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.gz1;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wx4;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b2\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b9\b\u0087\b\u0018\u0000 ¥\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004¦\u0001¥\u0001B¹\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\r\u0012\b\u0010!\u001a\u0004\u0018\u00010\r\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\u0010(\u001a\u0004\u0018\u00010\r\u0012\b\u0010)\u001a\u0004\u0018\u00010\r\u0012\b\u0010*\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b+\u0010,Bm\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b+\u0010-Bï\u0002\b\u0010\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\r\u0012\b\u0010!\u001a\u0004\u0018\u00010\r\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\u0010(\u001a\u0004\u0018\u00010\r\u0012\b\u0010)\u001a\u0004\u0018\u00010\r\u0012\b\u0010*\u001a\u0004\u0018\u00010\r\u0012\u0006\u00100\u001a\u00020\r\u0012\u0006\u00101\u001a\u00020\r\u0012\u0006\u00102\u001a\u00020\r\u0012\b\u00103\u001a\u0004\u0018\u00010\u0006\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b+\u00106J\u001a\u00109\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u000107H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\r¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b?\u0010<J\u0012\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bB\u0010AJ\u0010\u0010C\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bG\u0010>J\u0012\u0010H\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010AJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bK\u0010AJ\u0010\u0010L\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bL\u0010>J\u0010\u0010M\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bM\u0010>J\u0010\u0010N\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bN\u0010>J\u0012\u0010O\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bO\u0010AJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bT\u0010QJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bU\u0010QJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bV\u0010QJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bW\u0010AJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bX\u0010AJ\u0012\u0010Y\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bY\u0010IJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bZ\u0010AJ\u0012\u0010[\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b[\u0010IJ\u0012\u0010\\\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\\\u0010IJ\u0012\u0010]\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b]\u0010IJ\u0012\u0010^\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bb\u0010IJ\u0012\u0010c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bc\u0010IJ\u0012\u0010d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bd\u0010IJ\u0012\u0010e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\be\u0010IJô\u0002\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bh\u0010AJ'\u0010q\u001a\u00020n2\u0006\u0010i\u001a\u00020\u00002\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020lH\u0001¢\u0006\u0004\bo\u0010pR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010r\u001a\u0004\bs\u0010<R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010t\u0012\u0004\bv\u0010w\u001a\u0004\bu\u0010AR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010t\u001a\u0004\bx\u0010AR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010y\u001a\u0004\bz\u0010DR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010{\u001a\u0004\b|\u0010FR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010}\u001a\u0004\b~\u0010>R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\r\n\u0004\b\u000f\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010IR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0010\u0010t\u001a\u0005\b\u0081\u0001\u0010AR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0011\u0010t\u001a\u0005\b\u0082\u0001\u0010AR\u001b\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0012\u0010}\u001a\u0005\b\u0083\u0001\u0010>R\u0018\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\r\n\u0004\b\u0013\u0010}\u001a\u0005\b\u0084\u0001\u0010>R\u001b\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0014\u0010}\u001a\u0005\b\u0085\u0001\u0010>R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\r\n\u0004\b\u0015\u0010t\u001a\u0005\b\u0086\u0001\u0010AR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010QR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010SR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010\u0087\u0001\u001a\u0005\b\u008b\u0001\u0010QR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0087\u0001\u001a\u0005\b\u008c\u0001\u0010QR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u0087\u0001\u001a\u0005\b\u008d\u0001\u0010QR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001c\u0010t\u001a\u0005\b\u008e\u0001\u0010AR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001d\u0010t\u001a\u0005\b\u008f\u0001\u0010AR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001e\u0010\u007f\u001a\u0005\b\u0090\u0001\u0010IR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001f\u0010t\u001a\u0005\b\u0091\u0001\u0010AR\u001d\u0010 \u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b \u0010\u007f\u001a\u0005\b\u0092\u0001\u0010IR\u001d\u0010!\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010\u007f\u001a\u0005\b\u0093\u0001\u0010IR\u001d\u0010\"\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\"\u0010\u007f\u001a\u0005\b\u0094\u0001\u0010IR\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010_R\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010aR\u001d\u0010'\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b'\u0010\u007f\u001a\u0005\b\u0099\u0001\u0010IR\u001d\u0010(\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b(\u0010\u007f\u001a\u0005\b\u009a\u0001\u0010IR\u001d\u0010)\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b)\u0010\u007f\u001a\u0005\b\u009b\u0001\u0010IR\u001d\u0010*\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b*\u0010\u007f\u001a\u0005\b\u009c\u0001\u0010IR$\u00100\u001a\u00020\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0004\b0\u0010}\u001a\u0004\b0\u0010>\"\u0006\b\u009d\u0001\u0010\u009e\u0001R$\u00101\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b1\u0010}\u001a\u0004\b1\u0010>\"\u0006\b\u009f\u0001\u0010\u009e\u0001R$\u00102\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b2\u0010}\u001a\u0004\b2\u0010>\"\u0006\b \u0001\u0010\u009e\u0001R\u001b\u00103\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\r\n\u0004\b3\u0010t\u001a\u0005\b¡\u0001\u0010AR\u0016\u0010£\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010AR\u0013\u0010¤\u0001\u001a\u00020\r8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010>¨\u0006§\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/UniqueTournament;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/IRecent;", "Lcom/sofascore/model/mvvm/IUrlSharing;", "", "id", "", "name", "slug", "Lcom/sofascore/model/mvvm/model/Category;", "category", "", "userCount", "", "hasEventPlayerStatistics", "hasBoxScore", "primaryColorHex", "secondaryColorHex", "hasPerformanceGraphFeature", "displayInverseHomeAwayTeams", "crowdsourcingEnabled", "groundType", "tennisPoints", "Lcom/sofascore/model/mvvm/model/Country;", "country", "yearOfFoundation", "numberOfDivisions", "numberOfCompetitors", "owner", "chairman", "hasDownDistance", "competitionType", "hasRating", "hasLiveRating", "majorTrophy", "Lcom/sofascore/model/mvvm/model/Gender;", InneractiveMediationDefs.KEY_GENDER, "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "showBanner", "hasAchievements", "hasRounds", "playerOfTheTournament", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;JZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/Gender;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "(ILjava/lang/String;Lcom/sofascore/model/mvvm/model/Category;JZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Gender;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "seen0", "seen1", "isRecent", "isActive", "isFavorite", "webUrl", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;JZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/Gender;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZZLjava/lang/String;Lt5h;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "shouldReverseTeams", "()Z", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/sofascore/model/mvvm/model/Category;", "component5", "()J", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Ljava/lang/Integer;", "component15", "()Lcom/sofascore/model/mvvm/model/Country;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "()Lcom/sofascore/model/mvvm/model/Gender;", "component27", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "component28", "component29", "component30", "component31", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Category;JZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/Country;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/Gender;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sofascore/model/mvvm/model/UniqueTournament;", "toString", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getSlug", "Lcom/sofascore/model/mvvm/model/Category;", "getCategory", "J", "getUserCount", "Z", "getHasEventPlayerStatistics", "Ljava/lang/Boolean;", "getHasBoxScore", "getPrimaryColorHex", "getSecondaryColorHex", "getHasPerformanceGraphFeature", "getDisplayInverseHomeAwayTeams", "getCrowdsourcingEnabled", "getGroundType", "Ljava/lang/Integer;", "getTennisPoints", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "getYearOfFoundation", "getNumberOfDivisions", "getNumberOfCompetitors", "getOwner", "getChairman", "getHasDownDistance", "getCompetitionType", "getHasRating", "getHasLiveRating", "getMajorTrophy", "Lcom/sofascore/model/mvvm/model/Gender;", "getGender", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "getShowBanner", "getHasAchievements", "getHasRounds", "getPlayerOfTheTournament", "setRecent", "(Z)V", "setActive", "setFavorite", "getWebUrl", "getSportSlug", "sportSlug", "isFemale", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournament implements Serializable, IRecent, IUrlSharing {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Category category;

    @Nullable
    private final String chairman;

    @Nullable
    private final String competitionType;

    @Nullable
    private final Country country;
    private final boolean crowdsourcingEnabled;
    private final boolean displayInverseHomeAwayTeams;

    @Nullable
    private final FieldTranslations fieldTranslations;

    @Nullable
    private final Gender gender;

    @Nullable
    private final String groundType;

    @Nullable
    private final Boolean hasAchievements;

    @Nullable
    private final Boolean hasBoxScore;

    @Nullable
    private final Boolean hasDownDistance;
    private final boolean hasEventPlayerStatistics;

    @Nullable
    private final Boolean hasLiveRating;
    private final boolean hasPerformanceGraphFeature;

    @Nullable
    private final Boolean hasRating;

    @Nullable
    private final Boolean hasRounds;
    private final int id;
    private boolean isActive;
    private boolean isFavorite;
    private boolean isRecent;

    @Nullable
    private final Boolean majorTrophy;

    @Nullable
    private final String name;

    @Nullable
    private final Integer numberOfCompetitors;

    @Nullable
    private final Integer numberOfDivisions;

    @Nullable
    private final String owner;

    @Nullable
    private final Boolean playerOfTheTournament;

    @Nullable
    private final String primaryColorHex;

    @Nullable
    private final String secondaryColorHex;

    @Nullable
    private final Boolean showBanner;

    @NotNull
    private final String slug;

    @Nullable
    private final Integer tennisPoints;
    private final long userCount;

    @NotNull
    private final String webUrl;

    @Nullable
    private final Integer yearOfFoundation;

    public /* synthetic */ UniqueTournament(int i, int i2, int i3, String str, String str2, Category category, long j, boolean z, Boolean bool, String str3, String str4, boolean z2, boolean z3, boolean z4, String str5, Integer num, Country country, Integer num2, Integer num3, Integer num4, String str6, String str7, Boolean bool2, String str8, Boolean bool3, Boolean bool4, Boolean bool5, Gender gender, FieldTranslations fieldTranslations, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, boolean z5, boolean z6, boolean z7, String str9, t5h t5hVar) {
        if (2147480007 != (i & 2147480007)) {
            oea.y(new int[]{i, i2}, new int[]{2147480007, 0}, UniqueTournament$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i3;
        this.name = str;
        this.slug = str2;
        category = (i & 8) == 0 ? new Category("", 0) : category;
        this.category = category;
        if ((i & 16) == 0) {
            this.userCount = 0L;
        } else {
            this.userCount = j;
        }
        if ((i & 32) == 0) {
            this.hasEventPlayerStatistics = false;
        } else {
            this.hasEventPlayerStatistics = z;
        }
        this.hasBoxScore = bool;
        this.primaryColorHex = str3;
        this.secondaryColorHex = str4;
        if ((i & 512) == 0) {
            this.hasPerformanceGraphFeature = false;
        } else {
            this.hasPerformanceGraphFeature = z2;
        }
        if ((i & 1024) == 0) {
            this.displayInverseHomeAwayTeams = false;
        } else {
            this.displayInverseHomeAwayTeams = z3;
        }
        if ((i & a.o) == 0) {
            this.crowdsourcingEnabled = false;
        } else {
            this.crowdsourcingEnabled = z4;
        }
        this.groundType = str5;
        this.tennisPoints = num;
        this.country = country;
        this.yearOfFoundation = num2;
        this.numberOfDivisions = num3;
        this.numberOfCompetitors = num4;
        this.owner = str6;
        this.chairman = str7;
        this.hasDownDistance = bool2;
        this.competitionType = str8;
        this.hasRating = bool3;
        this.hasLiveRating = bool4;
        this.majorTrophy = bool5;
        this.gender = gender;
        this.fieldTranslations = fieldTranslations;
        this.showBanner = bool6;
        this.hasAchievements = bool7;
        this.hasRounds = bool8;
        this.playerOfTheTournament = bool9;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.isRecent = false;
        } else {
            this.isRecent = z5;
        }
        if ((i2 & 1) == 0) {
            this.isActive = false;
        } else {
            this.isActive = z6;
        }
        if ((i2 & 2) == 0) {
            this.isFavorite = false;
        } else {
            this.isFavorite = z7;
        }
        if ((i2 & 4) == 0) {
            this.webUrl = Intrinsics.c(getSportSlug(), Sports.MMA) ? dmi.l(getId(), "/mma/organisation/", str2, "/") : bf3.h(getId(), str2, "/", mz1.s("/", getSportSlug(), "/tournament/", category.getSlug(), "/"));
        } else {
            this.webUrl = str9;
        }
    }

    public static /* synthetic */ UniqueTournament copy$default(UniqueTournament uniqueTournament, int i, String str, String str2, Category category, long j, boolean z, Boolean bool, String str3, String str4, boolean z2, boolean z3, boolean z4, String str5, Integer num, Country country, Integer num2, Integer num3, Integer num4, String str6, String str7, Boolean bool2, String str8, Boolean bool3, Boolean bool4, Boolean bool5, Gender gender, FieldTranslations fieldTranslations, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, int i2, Object obj) {
        Boolean bool10;
        Boolean bool11;
        int i3 = (i2 & 1) != 0 ? uniqueTournament.id : i;
        String str9 = (i2 & 2) != 0 ? uniqueTournament.name : str;
        String str10 = (i2 & 4) != 0 ? uniqueTournament.slug : str2;
        Category category2 = (i2 & 8) != 0 ? uniqueTournament.category : category;
        long j2 = (i2 & 16) != 0 ? uniqueTournament.userCount : j;
        boolean z5 = (i2 & 32) != 0 ? uniqueTournament.hasEventPlayerStatistics : z;
        Boolean bool12 = (i2 & 64) != 0 ? uniqueTournament.hasBoxScore : bool;
        String str11 = (i2 & 128) != 0 ? uniqueTournament.primaryColorHex : str3;
        String str12 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? uniqueTournament.secondaryColorHex : str4;
        boolean z6 = (i2 & 512) != 0 ? uniqueTournament.hasPerformanceGraphFeature : z2;
        boolean z7 = (i2 & 1024) != 0 ? uniqueTournament.displayInverseHomeAwayTeams : z3;
        boolean z8 = (i2 & a.o) != 0 ? uniqueTournament.crowdsourcingEnabled : z4;
        String str13 = (i2 & 4096) != 0 ? uniqueTournament.groundType : str5;
        int i4 = i3;
        Integer num5 = (i2 & 8192) != 0 ? uniqueTournament.tennisPoints : num;
        Country country2 = (i2 & 16384) != 0 ? uniqueTournament.country : country;
        Integer num6 = (i2 & 32768) != 0 ? uniqueTournament.yearOfFoundation : num2;
        Integer num7 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? uniqueTournament.numberOfDivisions : num3;
        Integer num8 = (i2 & 131072) != 0 ? uniqueTournament.numberOfCompetitors : num4;
        String str14 = (i2 & 262144) != 0 ? uniqueTournament.owner : str6;
        String str15 = (i2 & 524288) != 0 ? uniqueTournament.chairman : str7;
        Boolean bool13 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? uniqueTournament.hasDownDistance : bool2;
        String str16 = (i2 & 2097152) != 0 ? uniqueTournament.competitionType : str8;
        Boolean bool14 = (i2 & 4194304) != 0 ? uniqueTournament.hasRating : bool3;
        Boolean bool15 = (i2 & 8388608) != 0 ? uniqueTournament.hasLiveRating : bool4;
        Boolean bool16 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? uniqueTournament.majorTrophy : bool5;
        Gender gender2 = (i2 & 33554432) != 0 ? uniqueTournament.gender : gender;
        FieldTranslations fieldTranslations2 = (i2 & 67108864) != 0 ? uniqueTournament.fieldTranslations : fieldTranslations;
        Boolean bool17 = (i2 & 134217728) != 0 ? uniqueTournament.showBanner : bool6;
        Boolean bool18 = (i2 & 268435456) != 0 ? uniqueTournament.hasAchievements : bool7;
        Boolean bool19 = (i2 & 536870912) != 0 ? uniqueTournament.hasRounds : bool8;
        if ((i2 & 1073741824) != 0) {
            bool11 = bool19;
            bool10 = uniqueTournament.playerOfTheTournament;
        } else {
            bool10 = bool9;
            bool11 = bool19;
        }
        return uniqueTournament.copy(i4, str9, str10, category2, j2, z5, bool12, str11, str12, z6, z7, z8, str13, num5, country2, num6, num7, num8, str14, str15, bool13, str16, bool14, bool15, bool16, gender2, fieldTranslations2, bool17, bool18, bool11, bool10);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournament self, wf3 output, SerialDescriptor serialDesc) {
        String h;
        output.u(0, self.getId(), serialDesc);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.name);
        output.y(serialDesc, 2, self.slug);
        if (output.o(serialDesc) || !Intrinsics.c(self.category, new Category("", 0))) {
            output.f(serialDesc, 3, Category$$serializer.INSTANCE, self.category);
        }
        if (output.o(serialDesc) || self.userCount != 0) {
            output.E(serialDesc, 4, self.userCount);
        }
        if (output.o(serialDesc) || self.hasEventPlayerStatistics) {
            output.x(serialDesc, 5, self.hasEventPlayerStatistics);
        }
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 6, gz1Var, self.hasBoxScore);
        output.h(serialDesc, 7, uhiVar, self.primaryColorHex);
        output.h(serialDesc, 8, uhiVar, self.secondaryColorHex);
        if (output.o(serialDesc) || self.hasPerformanceGraphFeature) {
            output.x(serialDesc, 9, self.hasPerformanceGraphFeature);
        }
        if (output.o(serialDesc) || self.displayInverseHomeAwayTeams) {
            output.x(serialDesc, 10, self.displayInverseHomeAwayTeams);
        }
        if (output.o(serialDesc) || self.crowdsourcingEnabled) {
            output.x(serialDesc, 11, self.crowdsourcingEnabled);
        }
        output.h(serialDesc, 12, uhiVar, self.groundType);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 13, a7aVar, self.tennisPoints);
        output.h(serialDesc, 14, Country$$serializer.INSTANCE, self.country);
        output.h(serialDesc, 15, a7aVar, self.yearOfFoundation);
        output.h(serialDesc, 16, a7aVar, self.numberOfDivisions);
        output.h(serialDesc, 17, a7aVar, self.numberOfCompetitors);
        output.h(serialDesc, 18, uhiVar, self.owner);
        output.h(serialDesc, 19, uhiVar, self.chairman);
        output.h(serialDesc, 20, gz1Var, self.hasDownDistance);
        output.h(serialDesc, 21, uhiVar, self.competitionType);
        output.h(serialDesc, 22, gz1Var, self.hasRating);
        output.h(serialDesc, 23, gz1Var, self.hasLiveRating);
        output.h(serialDesc, 24, gz1Var, self.majorTrophy);
        output.h(serialDesc, 25, GenderSerializer.INSTANCE, self.gender);
        output.h(serialDesc, 26, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
        output.h(serialDesc, 27, gz1Var, self.showBanner);
        output.h(serialDesc, 28, gz1Var, self.hasAchievements);
        output.h(serialDesc, 29, gz1Var, self.hasRounds);
        output.h(serialDesc, 30, gz1Var, self.playerOfTheTournament);
        if (output.o(serialDesc) || self.getIsRecent()) {
            output.x(serialDesc, 31, self.getIsRecent());
        }
        if (output.o(serialDesc) || self.isActive) {
            output.x(serialDesc, 32, self.isActive);
        }
        if (output.o(serialDesc) || self.isFavorite) {
            output.x(serialDesc, 33, self.isFavorite);
        }
        if (!output.o(serialDesc)) {
            String webUrl = self.getWebUrl();
            if (Intrinsics.c(self.getSportSlug(), Sports.MMA)) {
                h = dmi.l(self.getId(), "/mma/organisation/", self.slug, "/");
            } else {
                String sportSlug = self.getSportSlug();
                String slug = self.category.getSlug();
                h = bf3.h(self.getId(), self.slug, "/", mz1.s("/", sportSlug, "/tournament/", slug, "/"));
            }
            if (Intrinsics.c(webUrl, h)) {
                return;
            }
        }
        output.y(serialDesc, 34, self.getWebUrl());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasPerformanceGraphFeature() {
        return this.hasPerformanceGraphFeature;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getDisplayInverseHomeAwayTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getCrowdsourcingEnabled() {
        return this.crowdsourcingEnabled;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getGroundType() {
        return this.groundType;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getTennisPoints() {
        return this.tennisPoints;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getYearOfFoundation() {
        return this.yearOfFoundation;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getNumberOfDivisions() {
        return this.numberOfDivisions;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getNumberOfCompetitors() {
        return this.numberOfCompetitors;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getChairman() {
        return this.chairman;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Boolean getHasDownDistance() {
        return this.hasDownDistance;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getCompetitionType() {
        return this.competitionType;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Boolean getHasRating() {
        return this.hasRating;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Boolean getHasLiveRating() {
        return this.hasLiveRating;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Boolean getMajorTrophy() {
        return this.majorTrophy;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Boolean getShowBanner() {
        return this.showBanner;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Boolean getHasAchievements() {
        return this.hasAchievements;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Boolean getHasRounds() {
        return this.hasRounds;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Boolean getPlayerOfTheTournament() {
        return this.playerOfTheTournament;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    /* renamed from: component5, reason: from getter */
    public final long getUserCount() {
        return this.userCount;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasEventPlayerStatistics() {
        return this.hasEventPlayerStatistics;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getHasBoxScore() {
        return this.hasBoxScore;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getPrimaryColorHex() {
        return this.primaryColorHex;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getSecondaryColorHex() {
        return this.secondaryColorHex;
    }

    @NotNull
    public final UniqueTournament copy(int id, @Nullable String name, @NotNull String slug, @NotNull Category category, long userCount, boolean hasEventPlayerStatistics, @Nullable Boolean hasBoxScore, @Nullable String primaryColorHex, @Nullable String secondaryColorHex, boolean hasPerformanceGraphFeature, boolean displayInverseHomeAwayTeams, boolean crowdsourcingEnabled, @Nullable String groundType, @Nullable Integer tennisPoints, @Nullable Country country, @Nullable Integer yearOfFoundation, @Nullable Integer numberOfDivisions, @Nullable Integer numberOfCompetitors, @Nullable String owner, @Nullable String chairman, @Nullable Boolean hasDownDistance, @Nullable String competitionType, @Nullable Boolean hasRating, @Nullable Boolean hasLiveRating, @Nullable Boolean majorTrophy, @Nullable Gender gender, @Nullable FieldTranslations fieldTranslations, @Nullable Boolean showBanner, @Nullable Boolean hasAchievements, @Nullable Boolean hasRounds, @Nullable Boolean playerOfTheTournament) {
        slug.getClass();
        category.getClass();
        return new UniqueTournament(id, name, slug, category, userCount, hasEventPlayerStatistics, hasBoxScore, primaryColorHex, secondaryColorHex, hasPerformanceGraphFeature, displayInverseHomeAwayTeams, crowdsourcingEnabled, groundType, tennisPoints, country, yearOfFoundation, numberOfDivisions, numberOfCompetitors, owner, chairman, hasDownDistance, competitionType, hasRating, hasLiveRating, majorTrophy, gender, fieldTranslations, showBanner, hasAchievements, hasRounds, playerOfTheTournament);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UniqueTournament) && getId() == ((UniqueTournament) other).getId();
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final String getChairman() {
        return this.chairman;
    }

    @Nullable
    public final String getCompetitionType() {
        return this.competitionType;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    public final boolean getCrowdsourcingEnabled() {
        return this.crowdsourcingEnabled;
    }

    public final boolean getDisplayInverseHomeAwayTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final String getGroundType() {
        return this.groundType;
    }

    @Nullable
    public final Boolean getHasAchievements() {
        return this.hasAchievements;
    }

    @Nullable
    public final Boolean getHasBoxScore() {
        return this.hasBoxScore;
    }

    @Nullable
    public final Boolean getHasDownDistance() {
        return this.hasDownDistance;
    }

    public final boolean getHasEventPlayerStatistics() {
        return this.hasEventPlayerStatistics;
    }

    @Nullable
    public final Boolean getHasLiveRating() {
        return this.hasLiveRating;
    }

    public final boolean getHasPerformanceGraphFeature() {
        return this.hasPerformanceGraphFeature;
    }

    @Nullable
    public final Boolean getHasRating() {
        return this.hasRating;
    }

    @Nullable
    public final Boolean getHasRounds() {
        return this.hasRounds;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getMajorTrophy() {
        return this.majorTrophy;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getNumberOfCompetitors() {
        return this.numberOfCompetitors;
    }

    @Nullable
    public final Integer getNumberOfDivisions() {
        return this.numberOfDivisions;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    public final Boolean getPlayerOfTheTournament() {
        return this.playerOfTheTournament;
    }

    @Nullable
    public final String getPrimaryColorHex() {
        return this.primaryColorHex;
    }

    @Nullable
    public final String getSecondaryColorHex() {
        return this.secondaryColorHex;
    }

    @Nullable
    public final Boolean getShowBanner() {
        return this.showBanner;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    @NotNull
    public String getSportSlug() {
        return this.category.getSport().getSlug();
    }

    @Nullable
    public final Integer getTennisPoints() {
        return this.tennisPoints;
    }

    public final long getUserCount() {
        return this.userCount;
    }

    @Override // com.sofascore.model.mvvm.IUrlSharing
    @NotNull
    public String getWebUrl() {
        return this.webUrl;
    }

    @Nullable
    public final Integer getYearOfFoundation() {
        return this.yearOfFoundation;
    }

    public int hashCode() {
        return getId();
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final boolean isFemale() {
        return this.gender == Gender.Female;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    public final boolean shouldReverseTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.slug;
        Category category = this.category;
        long j = this.userCount;
        boolean z = this.hasEventPlayerStatistics;
        Boolean bool = this.hasBoxScore;
        String str3 = this.primaryColorHex;
        String str4 = this.secondaryColorHex;
        boolean z2 = this.hasPerformanceGraphFeature;
        boolean z3 = this.displayInverseHomeAwayTeams;
        boolean z4 = this.crowdsourcingEnabled;
        String str5 = this.groundType;
        Integer num = this.tennisPoints;
        Country country = this.country;
        Integer num2 = this.yearOfFoundation;
        Integer num3 = this.numberOfDivisions;
        Integer num4 = this.numberOfCompetitors;
        String str6 = this.owner;
        String str7 = this.chairman;
        Boolean bool2 = this.hasDownDistance;
        String str8 = this.competitionType;
        Boolean bool3 = this.hasRating;
        Boolean bool4 = this.hasLiveRating;
        Boolean bool5 = this.majorTrophy;
        Gender gender = this.gender;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        Boolean bool6 = this.showBanner;
        Boolean bool7 = this.hasAchievements;
        Boolean bool8 = this.hasRounds;
        Boolean bool9 = this.playerOfTheTournament;
        StringBuilder t = dmi.t(i, "UniqueTournament(id=", ", name=", str, ", slug=");
        t.append(str2);
        t.append(", category=");
        t.append(category);
        t.append(", userCount=");
        t.append(j);
        t.append(", hasEventPlayerStatistics=");
        t.append(z);
        t.append(", hasBoxScore=");
        t.append(bool);
        t.append(", primaryColorHex=");
        t.append(str3);
        t.append(", secondaryColorHex=");
        t.append(str4);
        t.append(", hasPerformanceGraphFeature=");
        t.append(z2);
        fn0.y(", displayInverseHomeAwayTeams=", ", crowdsourcingEnabled=", t, z3, z4);
        t.append(", groundType=");
        t.append(str5);
        t.append(", tennisPoints=");
        t.append(num);
        t.append(", country=");
        t.append(country);
        t.append(", yearOfFoundation=");
        t.append(num2);
        fn0.w(num3, num4, ", numberOfDivisions=", ", numberOfCompetitors=", t);
        bf3.v(t, ", owner=", str6, ", chairman=", str7);
        t.append(", hasDownDistance=");
        t.append(bool2);
        t.append(", competitionType=");
        t.append(str8);
        t.append(", hasRating=");
        t.append(bool3);
        t.append(", hasLiveRating=");
        t.append(bool4);
        t.append(", majorTrophy=");
        t.append(bool5);
        t.append(", gender=");
        t.append(gender);
        t.append(", fieldTranslations=");
        t.append(fieldTranslations);
        t.append(", showBanner=");
        t.append(bool6);
        t.append(", hasAchievements=");
        t.append(bool7);
        t.append(", hasRounds=");
        t.append(bool8);
        t.append(", playerOfTheTournament=");
        t.append(bool9);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/UniqueTournament$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournament$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    public UniqueTournament(int i, @Nullable String str, @NotNull String str2, @NotNull Category category, long j, boolean z, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, boolean z2, boolean z3, boolean z4, @Nullable String str5, @Nullable Integer num, @Nullable Country country, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool2, @Nullable String str8, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Gender gender, @Nullable FieldTranslations fieldTranslations, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9) {
        String h;
        str2.getClass();
        category.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.category = category;
        this.userCount = j;
        this.hasEventPlayerStatistics = z;
        this.hasBoxScore = bool;
        this.primaryColorHex = str3;
        this.secondaryColorHex = str4;
        this.hasPerformanceGraphFeature = z2;
        this.displayInverseHomeAwayTeams = z3;
        this.crowdsourcingEnabled = z4;
        this.groundType = str5;
        this.tennisPoints = num;
        this.country = country;
        this.yearOfFoundation = num2;
        this.numberOfDivisions = num3;
        this.numberOfCompetitors = num4;
        this.owner = str6;
        this.chairman = str7;
        this.hasDownDistance = bool2;
        this.competitionType = str8;
        this.hasRating = bool3;
        this.hasLiveRating = bool4;
        this.majorTrophy = bool5;
        this.gender = gender;
        this.fieldTranslations = fieldTranslations;
        this.showBanner = bool6;
        this.hasAchievements = bool7;
        this.hasRounds = bool8;
        this.playerOfTheTournament = bool9;
        if (Intrinsics.c(getSportSlug(), Sports.MMA)) {
            h = dmi.l(getId(), "/mma/organisation/", str2, "/");
        } else {
            h = bf3.h(getId(), str2, "/", mz1.s("/", getSportSlug(), "/tournament/", category.getSlug(), "/"));
        }
        this.webUrl = h;
    }

    public /* synthetic */ UniqueTournament(int i, String str, String str2, Category category, long j, boolean z, Boolean bool, String str3, String str4, boolean z2, boolean z3, boolean z4, String str5, Integer num, Country country, Integer num2, Integer num3, Integer num4, String str6, String str7, Boolean bool2, String str8, Boolean bool3, Boolean bool4, Boolean bool5, Gender gender, FieldTranslations fieldTranslations, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? new Category("", 0) : category, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? false : z, bool, str3, str4, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? false : z3, (i2 & a.o) != 0 ? false : z4, str5, num, country, num2, num3, num4, str6, str7, bool2, str8, bool3, bool4, bool5, gender, fieldTranslations, bool6, bool7, bool8, bool9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UniqueTournament(int i, @Nullable String str, @NotNull Category category, long j, boolean z, @Nullable Boolean bool, boolean z2, @Nullable String str2, @Nullable Integer num, @Nullable Gender gender, @Nullable FieldTranslations fieldTranslations) {
        this(i, str == null ? "" : str, "", category, j, z, bool, null, null, false, z2, false, str2, num, null, null, null, null, null, null, null, null, null, null, null, gender, fieldTranslations, null, Boolean.TRUE, null, null);
        category.getClass();
    }
}
