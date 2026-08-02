package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.dtg;
import defpackage.joa;
import defpackage.km5;
import defpackage.me4;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\b\u0087\b\u0018\u0000 ª\u00012\u00020\u0001:\u0004«\u0001ª\u0001B¿\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010%Bù\u0001\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010&BÝ\u0002\b\u0010\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b$\u0010+J\u000f\u0010,\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0017¢\u0006\u0004\b2\u0010-J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00020\u001703¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00020\u001703¢\u0006\u0004\b6\u00105J\u001b\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u0004\u0018\u0001082\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b;\u0010:J\u0019\u0010=\u001a\u0004\u0018\u00010\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u0004\u0018\u00010\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b?\u0010>J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010AJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010AJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010AJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010AJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010AJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010AJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010AJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010AJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010AJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010AJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010AJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010AJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010AJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u0010AJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u0010AJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010AJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010AJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010AJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u0010AJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bU\u0010-J\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u0010AJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010AJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u0010AJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u0010AJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010AJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b[\u0010AJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\\\u0010AJ\u001e\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0084\u0003\u0010a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020!\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\bc\u0010-J\u0010\u0010d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bd\u0010eJ\u001a\u0010i\u001a\u00020h2\b\u0010g\u001a\u0004\u0018\u00010fHÖ\u0003¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0017H\u0002¢\u0006\u0004\bk\u0010-J\u0019\u0010m\u001a\u0004\u0018\u00010\u00172\u0006\u0010l\u001a\u00020\u0002H\u0002¢\u0006\u0004\bm\u0010nJ\u0019\u0010o\u001a\u0004\u0018\u00010\u00172\u0006\u0010l\u001a\u00020\u0002H\u0002¢\u0006\u0004\bo\u0010nJ'\u0010w\u001a\u00020/2\u0006\u0010p\u001a\u00020\u00002\u0006\u0010r\u001a\u00020q2\u0006\u0010t\u001a\u00020sH\u0001¢\u0006\u0004\bu\u0010vR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010x\u001a\u0004\by\u0010A\"\u0004\bz\u0010{R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010x\u001a\u0004\b|\u0010AR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010x\u001a\u0004\b}\u0010A\"\u0004\b~\u0010{R%\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b\u0006\u0010x\u001a\u0004\b\u007f\u0010A\"\u0005\b\u0080\u0001\u0010{R&\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0007\u0010x\u001a\u0005\b\u0081\u0001\u0010A\"\u0005\b\u0082\u0001\u0010{R&\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\b\u0010x\u001a\u0005\b\u0083\u0001\u0010A\"\u0005\b\u0084\u0001\u0010{R&\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\t\u0010x\u001a\u0005\b\u0085\u0001\u0010A\"\u0005\b\u0086\u0001\u0010{R&\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\n\u0010x\u001a\u0005\b\u0087\u0001\u0010A\"\u0005\b\u0088\u0001\u0010{R&\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u000b\u0010x\u001a\u0005\b\u0089\u0001\u0010A\"\u0005\b\u008a\u0001\u0010{R&\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\f\u0010x\u001a\u0005\b\u008b\u0001\u0010A\"\u0005\b\u008c\u0001\u0010{R&\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\r\u0010x\u001a\u0005\b\u008d\u0001\u0010A\"\u0005\b\u008e\u0001\u0010{R&\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u000e\u0010x\u001a\u0005\b\u008f\u0001\u0010A\"\u0005\b\u0090\u0001\u0010{R&\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u000f\u0010x\u001a\u0005\b\u0091\u0001\u0010A\"\u0005\b\u0092\u0001\u0010{R&\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0010\u0010x\u001a\u0005\b\u0093\u0001\u0010A\"\u0005\b\u0094\u0001\u0010{R&\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0011\u0010x\u001a\u0005\b\u0095\u0001\u0010A\"\u0005\b\u0096\u0001\u0010{R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0012\u0010x\u001a\u0005\b\u0097\u0001\u0010AR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0013\u0010x\u001a\u0005\b\u0098\u0001\u0010AR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0014\u0010x\u001a\u0005\b\u0099\u0001\u0010AR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0015\u0010x\u001a\u0005\b\u009a\u0001\u0010AR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0016\u0010x\u001a\u0005\b\u009b\u0001\u0010AR'\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0018\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010-\"\u0005\b\u009e\u0001\u00101R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0019\u0010x\u001a\u0005\b\u009f\u0001\u0010AR\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001a\u0010x\u001a\u0005\b \u0001\u0010AR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001b\u0010x\u001a\u0005\b¡\u0001\u0010AR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001c\u0010x\u001a\u0005\b¢\u0001\u0010AR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001d\u0010x\u001a\u0005\b£\u0001\u0010AR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001e\u0010x\u001a\u0005\b¤\u0001\u0010AR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001f\u0010x\u001a\u0005\b¥\u0001\u0010AR*\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010¦\u0001\u001a\u0005\b§\u0001\u0010^R\u001e\u0010#\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010¨\u0001\u001a\u0005\b©\u0001\u0010`R\u0019\u0010(\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010\u009c\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/Score;", "Ljava/io/Serializable;", "", U3.i.d, "current", "period1", "period2", "period3", "period4", "period5", "period6", "period7", "period8", "period9", "period10", "period11", "period12", "period13", "period1TieBreak", "period2TieBreak", "period3TieBreak", "period4TieBreak", "period5TieBreak", "", "point", "normaltime", "extra1", "extra2", "overtime", "penalties", "aggregated", "series", "", "Lcom/sofascore/model/mvvm/model/ScoreCricketInning;", "innings", "inningsBaseball", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lcom/sofascore/model/mvvm/model/ScoreCricketInning;)V", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "currentCricketDisplay", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lcom/sofascore/model/mvvm/model/ScoreCricketInning;Ljava/lang/String;Lt5h;)V", "getCurrentCricketDisplay", "()Ljava/lang/String;", "currentCricket", "", "setCurrentCricketDisplay", "(Ljava/lang/String;)V", "getTotalOversDisplay", "", "getCricketInningsScore", "()Ljava/util/List;", "getCricketBasicInningsScore", "inning", "", "getCricketCurrentRunRate", "(Ljava/lang/Integer;)Ljava/lang/Double;", "getCricketTargetRunRate", "period", "getScoreByPeriodName", "(Ljava/lang/String;)Ljava/lang/Integer;", "getTieBreakByPeriodName", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "()Ljava/util/Map;", "component30", "()Lcom/sofascore/model/mvvm/model/ScoreCricketInning;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lcom/sofascore/model/mvvm/model/ScoreCricketInning;)Lcom/sofascore/model/mvvm/model/Score;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getCricketDisplayForLastInning", "position", "getCricketDisplayForInning", "(I)Ljava/lang/String;", "getCricketBasicDisplayForInning", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Score;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getDisplay", "setDisplay", "(Ljava/lang/Integer;)V", "getCurrent", "getPeriod1", "setPeriod1", "getPeriod2", "setPeriod2", "getPeriod3", "setPeriod3", "getPeriod4", "setPeriod4", "getPeriod5", "setPeriod5", "getPeriod6", "setPeriod6", "getPeriod7", "setPeriod7", "getPeriod8", "setPeriod8", "getPeriod9", "setPeriod9", "getPeriod10", "setPeriod10", "getPeriod11", "setPeriod11", "getPeriod12", "setPeriod12", "getPeriod13", "setPeriod13", "getPeriod1TieBreak", "getPeriod2TieBreak", "getPeriod3TieBreak", "getPeriod4TieBreak", "getPeriod5TieBreak", "Ljava/lang/String;", "getPoint", "setPoint", "getNormaltime", "getExtra1", "getExtra2", "getOvertime", "getPenalties", "getAggregated", "getSeries", "Ljava/util/Map;", "getInnings", "Lcom/sofascore/model/mvvm/model/ScoreCricketInning;", "getInningsBaseball", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Score implements Serializable {

    @Nullable
    private final Integer aggregated;

    @Nullable
    private final Integer current;

    @Nullable
    private String currentCricketDisplay;

    @Nullable
    private Integer display;

    @Nullable
    private final Integer extra1;

    @Nullable
    private final Integer extra2;

    @Nullable
    private final Map<String, ScoreCricketInning> innings;

    @Nullable
    private final ScoreCricketInning inningsBaseball;

    @Nullable
    private final Integer normaltime;

    @Nullable
    private final Integer overtime;

    @Nullable
    private final Integer penalties;

    @Nullable
    private Integer period1;

    @Nullable
    private Integer period10;

    @Nullable
    private Integer period11;

    @Nullable
    private Integer period12;

    @Nullable
    private Integer period13;

    @Nullable
    private final Integer period1TieBreak;

    @Nullable
    private Integer period2;

    @Nullable
    private final Integer period2TieBreak;

    @Nullable
    private Integer period3;

    @Nullable
    private final Integer period3TieBreak;

    @Nullable
    private Integer period4;

    @Nullable
    private final Integer period4TieBreak;

    @Nullable
    private Integer period5;

    @Nullable
    private final Integer period5TieBreak;

    @Nullable
    private Integer period6;

    @Nullable
    private Integer period7;

    @Nullable
    private Integer period8;

    @Nullable
    private Integer period9;

    @Nullable
    private String point;

    @Nullable
    private final Integer series;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new dtg(0)), null, null};

    public /* synthetic */ Score(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, String str, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Map map, ScoreCricketInning scoreCricketInning, String str2, t5h t5hVar) {
        if (1073741823 != (i & 1073741823)) {
            oea.z(i, 1073741823, Score$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.display = num;
        this.current = num2;
        this.period1 = num3;
        this.period2 = num4;
        this.period3 = num5;
        this.period4 = num6;
        this.period5 = num7;
        this.period6 = num8;
        this.period7 = num9;
        this.period8 = num10;
        this.period9 = num11;
        this.period10 = num12;
        this.period11 = num13;
        this.period12 = num14;
        this.period13 = num15;
        this.period1TieBreak = num16;
        this.period2TieBreak = num17;
        this.period3TieBreak = num18;
        this.period4TieBreak = num19;
        this.period5TieBreak = num20;
        this.point = str;
        this.normaltime = num21;
        this.extra1 = num22;
        this.extra2 = num23;
        this.overtime = num24;
        this.penalties = num25;
        this.aggregated = num26;
        this.series = num27;
        this.innings = map;
        this.inningsBaseball = scoreCricketInning;
        if ((i & 1073741824) == 0) {
            this.currentCricketDisplay = null;
        } else {
            this.currentCricketDisplay = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new q79(uhi.a, ScoreCricketInning$$serializer.INSTANCE, 1);
    }

    public static /* synthetic */ Score copy$default(Score score, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, String str, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Map map, ScoreCricketInning scoreCricketInning, int i, Object obj) {
        ScoreCricketInning scoreCricketInning2;
        Map map2;
        Integer num28 = (i & 1) != 0 ? score.display : num;
        Integer num29 = (i & 2) != 0 ? score.current : num2;
        Integer num30 = (i & 4) != 0 ? score.period1 : num3;
        Integer num31 = (i & 8) != 0 ? score.period2 : num4;
        Integer num32 = (i & 16) != 0 ? score.period3 : num5;
        Integer num33 = (i & 32) != 0 ? score.period4 : num6;
        Integer num34 = (i & 64) != 0 ? score.period5 : num7;
        Integer num35 = (i & 128) != 0 ? score.period6 : num8;
        Integer num36 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? score.period7 : num9;
        Integer num37 = (i & 512) != 0 ? score.period8 : num10;
        Integer num38 = (i & 1024) != 0 ? score.period9 : num11;
        Integer num39 = (i & a.o) != 0 ? score.period10 : num12;
        Integer num40 = (i & 4096) != 0 ? score.period11 : num13;
        Integer num41 = (i & 8192) != 0 ? score.period12 : num14;
        Integer num42 = num28;
        Integer num43 = (i & 16384) != 0 ? score.period13 : num15;
        Integer num44 = (i & 32768) != 0 ? score.period1TieBreak : num16;
        Integer num45 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? score.period2TieBreak : num17;
        Integer num46 = (i & 131072) != 0 ? score.period3TieBreak : num18;
        Integer num47 = (i & 262144) != 0 ? score.period4TieBreak : num19;
        Integer num48 = (i & 524288) != 0 ? score.period5TieBreak : num20;
        String str2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? score.point : str;
        Integer num49 = (i & 2097152) != 0 ? score.normaltime : num21;
        Integer num50 = (i & 4194304) != 0 ? score.extra1 : num22;
        Integer num51 = (i & 8388608) != 0 ? score.extra2 : num23;
        Integer num52 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? score.overtime : num24;
        Integer num53 = (i & 33554432) != 0 ? score.penalties : num25;
        Integer num54 = (i & 67108864) != 0 ? score.aggregated : num26;
        Integer num55 = (i & 134217728) != 0 ? score.series : num27;
        Map map3 = (i & 268435456) != 0 ? score.innings : map;
        if ((i & 536870912) != 0) {
            map2 = map3;
            scoreCricketInning2 = score.inningsBaseball;
        } else {
            scoreCricketInning2 = scoreCricketInning;
            map2 = map3;
        }
        return score.copy(num42, num29, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39, num40, num41, num43, num44, num45, num46, num47, num48, str2, num49, num50, num51, num52, num53, num54, num55, map2, scoreCricketInning2);
    }

    private final String getCricketBasicDisplayForInning(int position) {
        Map<String, ScoreCricketInning> map = this.innings;
        if (map == null || map.isEmpty() || position <= 0 || position > this.innings.size()) {
            return null;
        }
        ScoreCricketInning scoreCricketInning = this.innings.get("inning" + position);
        if (scoreCricketInning == null) {
            return null;
        }
        String valueOf = String.valueOf(scoreCricketInning.getScore());
        if (scoreCricketInning.getWickets() == null || scoreCricketInning.getWickets().intValue() >= 10) {
            return valueOf;
        }
        return valueOf + "-" + scoreCricketInning.getWickets();
    }

    public static /* synthetic */ Double getCricketCurrentRunRate$default(Score score, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return score.getCricketCurrentRunRate(num);
    }

    private final String getCricketDisplayForInning(int position) {
        Map<String, ScoreCricketInning> map = this.innings;
        if (map == null || map.isEmpty() || position <= 0 || position > this.innings.size()) {
            return null;
        }
        ScoreCricketInning scoreCricketInning = this.innings.get("inning" + position);
        if (scoreCricketInning == null) {
            return null;
        }
        String valueOf = String.valueOf(scoreCricketInning.getScore());
        if (scoreCricketInning.getWickets() != null && scoreCricketInning.getWickets().intValue() < 10) {
            valueOf = valueOf + "-" + scoreCricketInning.getWickets();
        }
        return valueOf + " (" + scoreCricketInning.getOvers() + ")";
    }

    private final String getCricketDisplayForLastInning() {
        ScoreCricketInning scoreCricketInning;
        Map<String, ScoreCricketInning> map = this.innings;
        if (map == null || map.isEmpty() || (scoreCricketInning = this.innings.get("inning2")) == null) {
            return "";
        }
        String valueOf = String.valueOf(scoreCricketInning.getScore());
        if (scoreCricketInning.getWickets() == null || scoreCricketInning.getWickets().intValue() >= 10) {
            return valueOf;
        }
        return valueOf + "-" + scoreCricketInning.getWickets();
    }

    public static /* synthetic */ Double getCricketTargetRunRate$default(Score score, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return score.getCricketTargetRunRate(num);
    }

    public static final /* synthetic */ void write$Self$model_release(Score self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.display);
        output.h(serialDesc, 1, a7aVar, self.current);
        output.h(serialDesc, 2, a7aVar, self.period1);
        output.h(serialDesc, 3, a7aVar, self.period2);
        output.h(serialDesc, 4, a7aVar, self.period3);
        output.h(serialDesc, 5, a7aVar, self.period4);
        output.h(serialDesc, 6, a7aVar, self.period5);
        output.h(serialDesc, 7, a7aVar, self.period6);
        output.h(serialDesc, 8, a7aVar, self.period7);
        output.h(serialDesc, 9, a7aVar, self.period8);
        output.h(serialDesc, 10, a7aVar, self.period9);
        output.h(serialDesc, 11, a7aVar, self.period10);
        output.h(serialDesc, 12, a7aVar, self.period11);
        output.h(serialDesc, 13, a7aVar, self.period12);
        output.h(serialDesc, 14, a7aVar, self.period13);
        output.h(serialDesc, 15, a7aVar, self.period1TieBreak);
        output.h(serialDesc, 16, a7aVar, self.period2TieBreak);
        output.h(serialDesc, 17, a7aVar, self.period3TieBreak);
        output.h(serialDesc, 18, a7aVar, self.period4TieBreak);
        output.h(serialDesc, 19, a7aVar, self.period5TieBreak);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 20, uhiVar, self.point);
        output.h(serialDesc, 21, a7aVar, self.normaltime);
        output.h(serialDesc, 22, a7aVar, self.extra1);
        output.h(serialDesc, 23, a7aVar, self.extra2);
        output.h(serialDesc, 24, a7aVar, self.overtime);
        output.h(serialDesc, 25, a7aVar, self.penalties);
        output.h(serialDesc, 26, a7aVar, self.aggregated);
        output.h(serialDesc, 27, a7aVar, self.series);
        output.h(serialDesc, 28, (KSerializer) joaVarArr[28].getValue(), self.innings);
        output.h(serialDesc, 29, ScoreCricketInning$$serializer.INSTANCE, self.inningsBaseball);
        if (!output.o(serialDesc) && self.currentCricketDisplay == null) {
            return;
        }
        output.h(serialDesc, 30, uhiVar, self.currentCricketDisplay);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getDisplay() {
        return this.display;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getPeriod8() {
        return this.period8;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getPeriod9() {
        return this.period9;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getPeriod10() {
        return this.period10;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getPeriod11() {
        return this.period11;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getPeriod12() {
        return this.period12;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getPeriod13() {
        return this.period13;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getPeriod1TieBreak() {
        return this.period1TieBreak;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getPeriod2TieBreak() {
        return this.period2TieBreak;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getPeriod3TieBreak() {
        return this.period3TieBreak;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getPeriod4TieBreak() {
        return this.period4TieBreak;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getCurrent() {
        return this.current;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getPeriod5TieBreak() {
        return this.period5TieBreak;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getPoint() {
        return this.point;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getNormaltime() {
        return this.normaltime;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getExtra1() {
        return this.extra1;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getExtra2() {
        return this.extra2;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getOvertime() {
        return this.overtime;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getPenalties() {
        return this.penalties;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Integer getAggregated() {
        return this.aggregated;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Integer getSeries() {
        return this.series;
    }

    @Nullable
    public final Map<String, ScoreCricketInning> component29() {
        return this.innings;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPeriod1() {
        return this.period1;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final ScoreCricketInning getInningsBaseball() {
        return this.inningsBaseball;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPeriod2() {
        return this.period2;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPeriod3() {
        return this.period3;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getPeriod4() {
        return this.period4;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getPeriod5() {
        return this.period5;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getPeriod6() {
        return this.period6;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getPeriod7() {
        return this.period7;
    }

    @NotNull
    public final Score copy(@Nullable Integer display, @Nullable Integer current, @Nullable Integer period1, @Nullable Integer period2, @Nullable Integer period3, @Nullable Integer period4, @Nullable Integer period5, @Nullable Integer period6, @Nullable Integer period7, @Nullable Integer period8, @Nullable Integer period9, @Nullable Integer period10, @Nullable Integer period11, @Nullable Integer period12, @Nullable Integer period13, @Nullable Integer period1TieBreak, @Nullable Integer period2TieBreak, @Nullable Integer period3TieBreak, @Nullable Integer period4TieBreak, @Nullable Integer period5TieBreak, @Nullable String point, @Nullable Integer normaltime, @Nullable Integer extra1, @Nullable Integer extra2, @Nullable Integer overtime, @Nullable Integer penalties, @Nullable Integer aggregated, @Nullable Integer series, @Nullable Map<String, ScoreCricketInning> innings, @Nullable ScoreCricketInning inningsBaseball) {
        return new Score(display, current, period1, period2, period3, period4, period5, period6, period7, period8, period9, period10, period11, period12, period13, period1TieBreak, period2TieBreak, period3TieBreak, period4TieBreak, period5TieBreak, point, normaltime, extra1, extra2, overtime, penalties, aggregated, series, innings, inningsBaseball);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Score)) {
            return false;
        }
        Score score = (Score) other;
        return Intrinsics.c(this.display, score.display) && Intrinsics.c(this.current, score.current) && Intrinsics.c(this.period1, score.period1) && Intrinsics.c(this.period2, score.period2) && Intrinsics.c(this.period3, score.period3) && Intrinsics.c(this.period4, score.period4) && Intrinsics.c(this.period5, score.period5) && Intrinsics.c(this.period6, score.period6) && Intrinsics.c(this.period7, score.period7) && Intrinsics.c(this.period8, score.period8) && Intrinsics.c(this.period9, score.period9) && Intrinsics.c(this.period10, score.period10) && Intrinsics.c(this.period11, score.period11) && Intrinsics.c(this.period12, score.period12) && Intrinsics.c(this.period13, score.period13) && Intrinsics.c(this.period1TieBreak, score.period1TieBreak) && Intrinsics.c(this.period2TieBreak, score.period2TieBreak) && Intrinsics.c(this.period3TieBreak, score.period3TieBreak) && Intrinsics.c(this.period4TieBreak, score.period4TieBreak) && Intrinsics.c(this.period5TieBreak, score.period5TieBreak) && Intrinsics.c(this.point, score.point) && Intrinsics.c(this.normaltime, score.normaltime) && Intrinsics.c(this.extra1, score.extra1) && Intrinsics.c(this.extra2, score.extra2) && Intrinsics.c(this.overtime, score.overtime) && Intrinsics.c(this.penalties, score.penalties) && Intrinsics.c(this.aggregated, score.aggregated) && Intrinsics.c(this.series, score.series) && Intrinsics.c(this.innings, score.innings) && Intrinsics.c(this.inningsBaseball, score.inningsBaseball);
    }

    @Nullable
    public final Integer getAggregated() {
        return this.aggregated;
    }

    @NotNull
    public final List<String> getCricketBasicInningsScore() {
        Collection<ScoreCricketInning> values;
        Map<String, ScoreCricketInning> map = this.innings;
        if (map == null || (values = map.values()) == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : values) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String cricketBasicDisplayForInning = getCricketBasicDisplayForInning(i2);
            if (cricketBasicDisplayForInning != null) {
                arrayList.add(cricketBasicDisplayForInning);
            }
            i = i2;
        }
        return arrayList;
    }

    @Nullable
    public final Double getCricketCurrentRunRate(@Nullable Integer inning) {
        if (inning != null) {
            int intValue = inning.intValue();
            Map<String, ScoreCricketInning> map = this.innings;
            if (map != null) {
                ScoreCricketInning scoreCricketInning = map.get("inning" + intValue);
                if (scoreCricketInning != null) {
                    return scoreCricketInning.getRunRate();
                }
            }
        }
        return null;
    }

    @NotNull
    public final List<String> getCricketInningsScore() {
        Collection<ScoreCricketInning> values;
        Map<String, ScoreCricketInning> map = this.innings;
        if (map == null || (values = map.values()) == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : values) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String cricketDisplayForInning = getCricketDisplayForInning(i2);
            if (cricketDisplayForInning != null) {
                arrayList.add(cricketDisplayForInning);
            }
            i = i2;
        }
        return arrayList;
    }

    @Nullable
    public final Double getCricketTargetRunRate(@Nullable Integer inning) {
        if (inning != null) {
            int intValue = inning.intValue();
            Map<String, ScoreCricketInning> map = this.innings;
            if (map != null) {
                ScoreCricketInning scoreCricketInning = map.get("inning" + intValue);
                if (scoreCricketInning != null) {
                    return scoreCricketInning.getTargetRunRate();
                }
            }
        }
        return null;
    }

    @Nullable
    public final Integer getCurrent() {
        return this.current;
    }

    @Nullable
    public final String getCurrentCricketDisplay() {
        String cricketDisplayForInning;
        Map<String, ScoreCricketInning> map = this.innings;
        if (map != null && !map.isEmpty()) {
            int size = this.innings.size();
            Map<String, ScoreCricketInning> map2 = this.innings;
            if (size == 2) {
                ScoreCricketInning scoreCricketInning = map2.get("inning1");
                Integer score = scoreCricketInning != null ? scoreCricketInning.getScore() : null;
                cricketDisplayForInning = score + " & " + getCricketDisplayForLastInning();
            } else {
                cricketDisplayForInning = getCricketDisplayForInning(map2.size());
            }
            this.currentCricketDisplay = cricketDisplayForInning;
        }
        return this.currentCricketDisplay;
    }

    @Nullable
    public final Integer getDisplay() {
        return this.display;
    }

    @Nullable
    public final Integer getExtra1() {
        return this.extra1;
    }

    @Nullable
    public final Integer getExtra2() {
        return this.extra2;
    }

    @Nullable
    public final Map<String, ScoreCricketInning> getInnings() {
        return this.innings;
    }

    @Nullable
    public final ScoreCricketInning getInningsBaseball() {
        return this.inningsBaseball;
    }

    @Nullable
    public final Integer getNormaltime() {
        return this.normaltime;
    }

    @Nullable
    public final Integer getOvertime() {
        return this.overtime;
    }

    @Nullable
    public final Integer getPenalties() {
        return this.penalties;
    }

    @Nullable
    public final Integer getPeriod1() {
        return this.period1;
    }

    @Nullable
    public final Integer getPeriod10() {
        return this.period10;
    }

    @Nullable
    public final Integer getPeriod11() {
        return this.period11;
    }

    @Nullable
    public final Integer getPeriod12() {
        return this.period12;
    }

    @Nullable
    public final Integer getPeriod13() {
        return this.period13;
    }

    @Nullable
    public final Integer getPeriod1TieBreak() {
        return this.period1TieBreak;
    }

    @Nullable
    public final Integer getPeriod2() {
        return this.period2;
    }

    @Nullable
    public final Integer getPeriod2TieBreak() {
        return this.period2TieBreak;
    }

    @Nullable
    public final Integer getPeriod3() {
        return this.period3;
    }

    @Nullable
    public final Integer getPeriod3TieBreak() {
        return this.period3TieBreak;
    }

    @Nullable
    public final Integer getPeriod4() {
        return this.period4;
    }

    @Nullable
    public final Integer getPeriod4TieBreak() {
        return this.period4TieBreak;
    }

    @Nullable
    public final Integer getPeriod5() {
        return this.period5;
    }

    @Nullable
    public final Integer getPeriod5TieBreak() {
        return this.period5TieBreak;
    }

    @Nullable
    public final Integer getPeriod6() {
        return this.period6;
    }

    @Nullable
    public final Integer getPeriod7() {
        return this.period7;
    }

    @Nullable
    public final Integer getPeriod8() {
        return this.period8;
    }

    @Nullable
    public final Integer getPeriod9() {
        return this.period9;
    }

    @Nullable
    public final String getPoint() {
        return this.point;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Nullable
    public final Integer getScoreByPeriodName(@Nullable String period) {
        if (period == null) {
            return null;
        }
        int hashCode = period.hashCode();
        if (hashCode == -1254734796) {
            if (period.equals("normaltime")) {
                return this.normaltime;
            }
            return null;
        }
        if (hashCode == 530056609) {
            if (period.equals("overtime")) {
                return this.overtime;
            }
            return null;
        }
        if (hashCode == 1080232679) {
            if (period.equals("penalties")) {
                return this.penalties;
            }
            return null;
        }
        switch (hashCode) {
            case -678739312:
                if (period.equals("period1")) {
                    return this.period1;
                }
                return null;
            case -678739311:
                if (period.equals("period2")) {
                    return this.period2;
                }
                return null;
            case -678739310:
                if (period.equals("period3")) {
                    return this.period3;
                }
                return null;
            case -678739309:
                if (period.equals("period4")) {
                    return this.period4;
                }
                return null;
            case -678739308:
                if (period.equals("period5")) {
                    return this.period5;
                }
                return null;
            case -678739307:
                if (period.equals("period6")) {
                    return this.period6;
                }
                return null;
            case -678739306:
                if (period.equals("period7")) {
                    return this.period7;
                }
                return null;
            case -678739305:
                if (period.equals("period8")) {
                    return this.period8;
                }
                return null;
            case -678739304:
                if (period.equals("period9")) {
                    return this.period9;
                }
                return null;
            default:
                switch (hashCode) {
                    case 433917856:
                        if (period.equals("period10")) {
                            return this.period10;
                        }
                        return null;
                    case 433917857:
                        if (period.equals("period11")) {
                            return this.period11;
                        }
                        return null;
                    case 433917858:
                        if (period.equals("period12")) {
                            return this.period12;
                        }
                        return null;
                    case 433917859:
                        if (period.equals("period13")) {
                            return this.period13;
                        }
                        return null;
                    default:
                        return null;
                }
        }
    }

    @Nullable
    public final Integer getSeries() {
        return this.series;
    }

    @Nullable
    public final Integer getTieBreakByPeriodName(@Nullable String period) {
        if (period == null) {
            return null;
        }
        switch (period.hashCode()) {
            case -678739312:
                if (period.equals("period1")) {
                    return this.period1TieBreak;
                }
                return null;
            case -678739311:
                if (period.equals("period2")) {
                    return this.period2TieBreak;
                }
                return null;
            case -678739310:
                if (period.equals("period3")) {
                    return this.period3TieBreak;
                }
                return null;
            case -678739309:
                if (period.equals("period4")) {
                    return this.period4TieBreak;
                }
                return null;
            case -678739308:
                if (period.equals("period5")) {
                    return this.period5TieBreak;
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    public final String getTotalOversDisplay() {
        Map<String, ScoreCricketInning> map = this.innings;
        if (map == null || map.isEmpty()) {
            map = null;
        }
        if (map == null) {
            return "0.0";
        }
        Iterator<T> it = map.values().iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            Double overs = ((ScoreCricketInning) it.next()).getOvers();
            d += overs != null ? overs.doubleValue() : 0.0d;
        }
        String format = new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US)).format(d);
        format.getClass();
        return format;
    }

    public int hashCode() {
        Integer num = this.display;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.current;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.period1;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.period2;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.period3;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.period4;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.period5;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.period6;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.period7;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.period8;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.period9;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.period10;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.period11;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.period12;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.period13;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.period1TieBreak;
        int hashCode16 = (hashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.period2TieBreak;
        int hashCode17 = (hashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.period3TieBreak;
        int hashCode18 = (hashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.period4TieBreak;
        int hashCode19 = (hashCode18 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.period5TieBreak;
        int hashCode20 = (hashCode19 + (num20 == null ? 0 : num20.hashCode())) * 31;
        String str = this.point;
        int hashCode21 = (hashCode20 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num21 = this.normaltime;
        int hashCode22 = (hashCode21 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.extra1;
        int hashCode23 = (hashCode22 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.extra2;
        int hashCode24 = (hashCode23 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.overtime;
        int hashCode25 = (hashCode24 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.penalties;
        int hashCode26 = (hashCode25 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.aggregated;
        int hashCode27 = (hashCode26 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.series;
        int hashCode28 = (hashCode27 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Map<String, ScoreCricketInning> map = this.innings;
        int hashCode29 = (hashCode28 + (map == null ? 0 : map.hashCode())) * 31;
        ScoreCricketInning scoreCricketInning = this.inningsBaseball;
        return hashCode29 + (scoreCricketInning != null ? scoreCricketInning.hashCode() : 0);
    }

    public final void setCurrentCricketDisplay(@Nullable String currentCricket) {
        this.currentCricketDisplay = currentCricket;
    }

    public final void setDisplay(@Nullable Integer num) {
        this.display = num;
    }

    public final void setPeriod1(@Nullable Integer num) {
        this.period1 = num;
    }

    public final void setPeriod10(@Nullable Integer num) {
        this.period10 = num;
    }

    public final void setPeriod11(@Nullable Integer num) {
        this.period11 = num;
    }

    public final void setPeriod12(@Nullable Integer num) {
        this.period12 = num;
    }

    public final void setPeriod13(@Nullable Integer num) {
        this.period13 = num;
    }

    public final void setPeriod2(@Nullable Integer num) {
        this.period2 = num;
    }

    public final void setPeriod3(@Nullable Integer num) {
        this.period3 = num;
    }

    public final void setPeriod4(@Nullable Integer num) {
        this.period4 = num;
    }

    public final void setPeriod5(@Nullable Integer num) {
        this.period5 = num;
    }

    public final void setPeriod6(@Nullable Integer num) {
        this.period6 = num;
    }

    public final void setPeriod7(@Nullable Integer num) {
        this.period7 = num;
    }

    public final void setPeriod8(@Nullable Integer num) {
        this.period8 = num;
    }

    public final void setPeriod9(@Nullable Integer num) {
        this.period9 = num;
    }

    public final void setPoint(@Nullable String str) {
        this.point = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.display;
        Integer num2 = this.current;
        Integer num3 = this.period1;
        Integer num4 = this.period2;
        Integer num5 = this.period3;
        Integer num6 = this.period4;
        Integer num7 = this.period5;
        Integer num8 = this.period6;
        Integer num9 = this.period7;
        Integer num10 = this.period8;
        Integer num11 = this.period9;
        Integer num12 = this.period10;
        Integer num13 = this.period11;
        Integer num14 = this.period12;
        Integer num15 = this.period13;
        Integer num16 = this.period1TieBreak;
        Integer num17 = this.period2TieBreak;
        Integer num18 = this.period3TieBreak;
        Integer num19 = this.period4TieBreak;
        Integer num20 = this.period5TieBreak;
        String str = this.point;
        Integer num21 = this.normaltime;
        Integer num22 = this.extra1;
        Integer num23 = this.extra2;
        Integer num24 = this.overtime;
        Integer num25 = this.penalties;
        Integer num26 = this.aggregated;
        Integer num27 = this.series;
        Map<String, ScoreCricketInning> map = this.innings;
        ScoreCricketInning scoreCricketInning = this.inningsBaseball;
        StringBuilder k = wv8.k(num, "Score(display=", ", current=", ", period1=", num2);
        vxd.r(num3, num4, ", period2=", ", period3=", k);
        vxd.r(num5, num6, ", period4=", ", period5=", k);
        vxd.r(num7, num8, ", period6=", ", period7=", k);
        vxd.r(num9, num10, ", period8=", ", period9=", k);
        vxd.r(num11, num12, ", period10=", ", period11=", k);
        vxd.r(num13, num14, ", period12=", ", period13=", k);
        vxd.r(num15, num16, ", period1TieBreak=", ", period2TieBreak=", k);
        vxd.r(num17, num18, ", period3TieBreak=", ", period4TieBreak=", k);
        vxd.r(num19, num20, ", period5TieBreak=", ", point=", k);
        me4.o(num21, str, ", normaltime=", ", extra1=", k);
        vxd.r(num22, num23, ", extra2=", ", overtime=", k);
        vxd.r(num24, num25, ", penalties=", ", aggregated=", k);
        vxd.r(num26, num27, ", series=", ", innings=", k);
        k.append(map);
        k.append(", inningsBaseball=");
        k.append(scoreCricketInning);
        k.append(")");
        return k.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Score$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Score;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Score$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Score(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable String str, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, @Nullable Integer num25, @Nullable Integer num26, @Nullable Integer num27, @Nullable Map<String, ScoreCricketInning> map, @Nullable ScoreCricketInning scoreCricketInning) {
        this.display = num;
        this.current = num2;
        this.period1 = num3;
        this.period2 = num4;
        this.period3 = num5;
        this.period4 = num6;
        this.period5 = num7;
        this.period6 = num8;
        this.period7 = num9;
        this.period8 = num10;
        this.period9 = num11;
        this.period10 = num12;
        this.period11 = num13;
        this.period12 = num14;
        this.period13 = num15;
        this.period1TieBreak = num16;
        this.period2TieBreak = num17;
        this.period3TieBreak = num18;
        this.period4TieBreak = num19;
        this.period5TieBreak = num20;
        this.point = str;
        this.normaltime = num21;
        this.extra1 = num22;
        this.extra2 = num23;
        this.overtime = num24;
        this.penalties = num25;
        this.aggregated = num26;
        this.series = num27;
        this.innings = map;
        this.inningsBaseball = scoreCricketInning;
    }

    public Score(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable String str, @Nullable Integer num20, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23) {
        this(num, null, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, str, null, null, null, num20, num21, num22, num23, null, null);
    }
}
