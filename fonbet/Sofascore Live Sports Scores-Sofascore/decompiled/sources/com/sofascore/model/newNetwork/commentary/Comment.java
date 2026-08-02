package com.sofascore.model.newNetwork.commentary;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.AmericanFootballDownDistance;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.BaseballInningInfo$$serializer;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.hz8;
import defpackage.joa;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wl2;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u0095\u00012\u00020\u0001:\u0004\u0096\u0001\u0095\u0001B¹\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$¢\u0006\u0004\b)\u0010*Bë\u0002\b\u0010\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\u0006\u0010,\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$\u0012\u0006\u0010-\u001a\u00020\t\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b)\u00101J\u0019\u00104\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b8\u00107J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010:J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010:J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010:J\u0012\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bB\u0010AJ\u0012\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bC\u0010AJ\u0010\u0010D\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bF\u0010?J\u0012\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bG\u0010?J\u0012\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bH\u0010?J\u0012\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bI\u0010?J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010:J\u0012\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bK\u0010?J\u0012\u0010L\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0018\u0010R\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$HÆ\u0003¢\u0006\u0004\bT\u0010SJþ\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$HÆ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bW\u0010:J\u0010\u0010X\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bX\u0010EJ\u001a\u0010[\u001a\u00020\t2\b\u0010Z\u001a\u0004\u0018\u00010YHÖ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b]\u0010OJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b^\u0010?J\u0012\u0010_\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b_\u0010?J\u0012\u0010`\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b`\u0010?J\u0012\u0010a\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\ba\u0010?J\u0012\u0010b\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\bb\u0010OJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\bc\u0010?J\u0012\u0010d\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\bd\u0010?J\u0012\u0010e\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\be\u0010?J\u0012\u0010f\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\bf\u0010?J'\u0010o\u001a\u00020l2\u0006\u0010g\u001a\u00020\u00002\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020jH\u0001¢\u0006\u0004\bm\u0010nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010p\u001a\u0004\bq\u0010:R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010p\u001a\u0004\br\u0010:R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010p\u001a\u0004\bs\u0010:R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010p\u001a\u0004\bt\u0010:R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010u\u001a\u0004\bv\u0010?R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010wR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010x\u001a\u0004\by\u0010AR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010x\u001a\u0004\bz\u0010AR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010x\u001a\u0004\b{\u0010AR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010|\u001a\u0004\b}\u0010ER\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010u\u001a\u0004\b~\u0010?R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010u\u001a\u0004\b\u007f\u0010?R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b\u0012\u0010u\u001a\u0005\b\u0080\u0001\u0010?R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b\u0013\u0010u\u001a\u0005\b\u0081\u0001\u0010?R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0014\u0010p\u001a\u0005\b\u0082\u0001\u0010:R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010uR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010uR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010uR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010uR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010wR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010uR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010uR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010uR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010uR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b\u001e\u0010u\u001a\u0005\b\u0083\u0001\u0010?R\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010MR\u0019\u0010!\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010w\u001a\u0004\b!\u0010OR\u001b\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\u000e\n\u0005\b#\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010QR!\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010SR!\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0088\u0001\u001a\u0005\b\u008a\u0001\u0010SR'\u0010-\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b-\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010.\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b.\u0010u\u001a\u0005\b\u0090\u0001\u0010?R\u0015\u0010\u0094\u0001\u001a\u00030\u0091\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/Comment;", "Ljava/io/Serializable;", "", "text", "type", "goalType", "periodName", "", "addedTime", "", "isHome", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "playerIn", "playerOut", "id", "time", "reversedPeriodTime", "reversedPeriodTimeSeconds", "yardsGained", "playType", "driveId", "yardline", "yardsToFirstDown", "down", "isGoal", "teamHalf", "possession", "homeScore", "awayScore", "atBatId", "Lcom/sofascore/model/mvvm/model/BaseballInningInfo;", "inningInfo", "isScoringPlay", "Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "actionOutcome", "", "Lcom/sofascore/model/newNetwork/commentary/NotableAction;", "notableActions", "Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "footballPassingNetworkAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/BaseballInningInfo;Ljava/lang/Boolean;Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;Ljava/util/List;Ljava/util/List;)V", "seen0", "seen1", "shouldReverseTeams", "groupId", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/BaseballInningInfo;Ljava/lang/Boolean;Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;Ljava/util/List;Ljava/util/List;ZLjava/lang/Integer;Lt5h;)V", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getIsHome", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Boolean;", "getHomeScore", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Integer;", "getAwayScore", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component7", "()Lcom/sofascore/model/mvvm/model/Player;", "component8", "component9", "component10", "()I", "component11", "component12", "component13", "component14", "component15", "component25", "component26", "()Lcom/sofascore/model/mvvm/model/BaseballInningInfo;", "component27", "()Ljava/lang/Boolean;", "component28", "()Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "component29", "()Ljava/util/List;", "component30", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/BaseballInningInfo;Ljava/lang/Boolean;Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/commentary/Comment;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component6", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/commentary/Comment;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getText", "getType", "getGoalType", "getPeriodName", "Ljava/lang/Integer;", "getAddedTime", "Ljava/lang/Boolean;", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "getPlayerIn", "getPlayerOut", "I", "getId", "getTime", "getReversedPeriodTime", "getReversedPeriodTimeSeconds", "getYardsGained", "getPlayType", "getAtBatId", "Lcom/sofascore/model/mvvm/model/BaseballInningInfo;", "getInningInfo", "Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "getActionOutcome", "Ljava/util/List;", "getNotableActions", "getFootballPassingNetworkAction", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "getGroupId", "Lcom/sofascore/model/mvvm/model/AmericanFootballDownDistance;", "getDownDistance", "()Lcom/sofascore/model/mvvm/model/AmericanFootballDownDistance;", "downDistance", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Comment implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final BaseballActionOutcome actionOutcome;

    @Nullable
    private final Integer addedTime;

    @Nullable
    private final Integer atBatId;

    @Nullable
    private final Integer awayScore;

    @Nullable
    private final Integer down;

    @Nullable
    private final Integer driveId;

    @Nullable
    private final List<FootballPassingNetworkSegment> footballPassingNetworkAction;

    @Nullable
    private final String goalType;

    @Nullable
    private final Integer groupId;

    @Nullable
    private final Integer homeScore;
    private final int id;

    @Nullable
    private final BaseballInningInfo inningInfo;

    @Nullable
    private final Boolean isGoal;

    @Nullable
    private final Boolean isHome;

    @Nullable
    private final Boolean isScoringPlay;

    @Nullable
    private final List<NotableAction> notableActions;

    @Nullable
    private final String periodName;

    @Nullable
    private final String playType;

    @Nullable
    private final Player player;

    @Nullable
    private final Player playerIn;

    @Nullable
    private final Player playerOut;

    @Nullable
    private final Integer possession;

    @Nullable
    private final Integer reversedPeriodTime;

    @Nullable
    private final Integer reversedPeriodTimeSeconds;
    private boolean shouldReverseTeams;

    @Nullable
    private final Integer teamHalf;

    @NotNull
    private final String text;

    @Nullable
    private final Integer time;

    @NotNull
    private final String type;

    @Nullable
    private final Integer yardline;

    @Nullable
    private final Integer yardsGained;

    @Nullable
    private final Integer yardsToFirstDown;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new wl2(23)), ypa.a(ysaVar, new wl2(24)), ypa.a(ysaVar, new wl2(25)), null, null};
    }

    public /* synthetic */ Comment(int i, int i2, String str, String str2, String str3, String str4, Integer num, Boolean bool, Player player, Player player2, Player player3, int i3, Integer num2, Integer num3, Integer num4, Integer num5, String str5, Integer num6, Integer num7, Integer num8, Integer num9, Boolean bool2, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, BaseballInningInfo baseballInningInfo, Boolean bool3, BaseballActionOutcome baseballActionOutcome, List list, List list2, boolean z, Integer num15, t5h t5hVar) {
        if (1073741823 != (i & 1073741823)) {
            oea.y(new int[]{i, i2}, new int[]{1073741823, 0}, Comment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        this.type = str2;
        this.goalType = str3;
        this.periodName = str4;
        this.addedTime = num;
        this.isHome = bool;
        this.player = player;
        this.playerIn = player2;
        this.playerOut = player3;
        this.id = i3;
        this.time = num2;
        this.reversedPeriodTime = num3;
        this.reversedPeriodTimeSeconds = num4;
        this.yardsGained = num5;
        this.playType = str5;
        this.driveId = num6;
        this.yardline = num7;
        this.yardsToFirstDown = num8;
        this.down = num9;
        this.isGoal = bool2;
        this.teamHalf = num10;
        this.possession = num11;
        this.homeScore = num12;
        this.awayScore = num13;
        this.atBatId = num14;
        this.inningInfo = baseballInningInfo;
        this.isScoringPlay = bool3;
        this.actionOutcome = baseballActionOutcome;
        this.notableActions = list;
        this.footballPassingNetworkAction = list2;
        if ((1073741824 & i) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.groupId = num6 == null ? baseballInningInfo != null ? Integer.valueOf(baseballInningInfo.getMockId()) : null : num6;
        } else {
            this.groupId = num15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.commentary.BaseballActionOutcome", BaseballActionOutcome.values(), new String[]{"kAK", "kAKP", "kAKB", "kKL", "kKS", "kF", "kFT", "rPABC", "rPABO", "oBI", "oDT2", "oDT3", "oDT4", "oFC", "oFCT2", "oFCT3", "oFCT4", "oFO", "oGO", "oKLT1", "oKLT2", "oKLT3", "oKLT4", "oKST1", "oKST2", "oKST3", "oKST4", "oROET2", "oROET3", "oROET4", "oST1", "oST2", "oST3", "oST4", "oTT3", "oTT4", "oLO", "oOBB", "oOP", "oPO", "oSB", "oSBT2", "oSBT3", "oSBT4", "oSF", "oSFT2", "oSFT3", "oSFT4", "bAB", "bABP", "bABC", "bABS", "bB", "bDB", "bIB", "bPO", "aBK", "aCI", "aD", "aDAD3", "aDAD4", "aFCAD2", "aFCAD3", "aFCAD4", "aHBP", "aHR", "aIBB", "BB", "aKLAD1", "aKLAD2", "aKLAD3", "aKLAD4", "aKSAD1", "aKSAD2", "aKSAD3", "aKSAD4", "aROE", "aROEAD2", "aROEAD3", "aROEAD4", "aROV", "aS", "aSAD2", "aSAD3", "aSAD4", "aSBAD1", "aSBAD2", "aSBAD3", "aSBAD4", "aSFAD1", "aSFAD2", "aSFAD3", "aSFAD4", "aT", "aTAD4", "CS2", "CS3", "CS4", "POCS2", "POCS3", "POCS4", "TO", "TO2", "TO3", "TO4", "FO1", "FO2", "FO3", "FO4", "DO1", "DO2", "DO3", "SB2O2", "SB2O3", "SB2O4", "SB3O3", "SB3O4", "RI", "OOA", "OBP", "HBB", "SB2", "SB3", "SB4", "SB4u", "AD1", "AD2", "AD3", "DI2", "DI3", "CS2AD3", "CS2AD4", "CS2AD4u", "CS3AD4", "CS3AD4u", "SB2E2", "SB2E3", "SB2E4", "SB3E4", "SB2E4E", "SB3E4E", "SB2AD3", "SB2AD4", "SB2AD4u", "SB3AD4", "SB3AD4u", "CK", "PO", "POCSC", "ERN", "eRN", "ERNu", "eRNu", "URN", "uRN", "PITCHER_SUBSTITUTION", "PINCH_HITTING_SUBSTITUTION", "PINCH_RUNNING_SUBSTITUTION", "DEFENSIVE_SUBSTITUTION", "DEFENSIVE_SWITCH"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(NotableAction$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(FootballPassingNetworkSegment$$serializer.INSTANCE, 0);
    }

    /* renamed from: component16, reason: from getter */
    private final Integer getDriveId() {
        return this.driveId;
    }

    /* renamed from: component17, reason: from getter */
    private final Integer getYardline() {
        return this.yardline;
    }

    /* renamed from: component18, reason: from getter */
    private final Integer getYardsToFirstDown() {
        return this.yardsToFirstDown;
    }

    /* renamed from: component19, reason: from getter */
    private final Integer getDown() {
        return this.down;
    }

    /* renamed from: component20, reason: from getter */
    private final Boolean getIsGoal() {
        return this.isGoal;
    }

    /* renamed from: component21, reason: from getter */
    private final Integer getTeamHalf() {
        return this.teamHalf;
    }

    /* renamed from: component22, reason: from getter */
    private final Integer getPossession() {
        return this.possession;
    }

    /* renamed from: component23, reason: from getter */
    private final Integer getHomeScore() {
        return this.homeScore;
    }

    /* renamed from: component24, reason: from getter */
    private final Integer getAwayScore() {
        return this.awayScore;
    }

    /* renamed from: component6, reason: from getter */
    private final Boolean getIsHome() {
        return this.isHome;
    }

    public static /* synthetic */ Comment copy$default(Comment comment, String str, String str2, String str3, String str4, Integer num, Boolean bool, Player player, Player player2, Player player3, int i, Integer num2, Integer num3, Integer num4, Integer num5, String str5, Integer num6, Integer num7, Integer num8, Integer num9, Boolean bool2, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, BaseballInningInfo baseballInningInfo, Boolean bool3, BaseballActionOutcome baseballActionOutcome, List list, List list2, int i2, Object obj) {
        List list3;
        List list4;
        String str6 = (i2 & 1) != 0 ? comment.text : str;
        String str7 = (i2 & 2) != 0 ? comment.type : str2;
        String str8 = (i2 & 4) != 0 ? comment.goalType : str3;
        String str9 = (i2 & 8) != 0 ? comment.periodName : str4;
        Integer num15 = (i2 & 16) != 0 ? comment.addedTime : num;
        Boolean bool4 = (i2 & 32) != 0 ? comment.isHome : bool;
        Player player4 = (i2 & 64) != 0 ? comment.player : player;
        Player player5 = (i2 & 128) != 0 ? comment.playerIn : player2;
        Player player6 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? comment.playerOut : player3;
        int i3 = (i2 & 512) != 0 ? comment.id : i;
        Integer num16 = (i2 & 1024) != 0 ? comment.time : num2;
        Integer num17 = (i2 & a.o) != 0 ? comment.reversedPeriodTime : num3;
        Integer num18 = (i2 & 4096) != 0 ? comment.reversedPeriodTimeSeconds : num4;
        Integer num19 = (i2 & 8192) != 0 ? comment.yardsGained : num5;
        String str10 = str6;
        String str11 = (i2 & 16384) != 0 ? comment.playType : str5;
        Integer num20 = (i2 & 32768) != 0 ? comment.driveId : num6;
        Integer num21 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? comment.yardline : num7;
        Integer num22 = (i2 & 131072) != 0 ? comment.yardsToFirstDown : num8;
        Integer num23 = (i2 & 262144) != 0 ? comment.down : num9;
        Boolean bool5 = (i2 & 524288) != 0 ? comment.isGoal : bool2;
        Integer num24 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? comment.teamHalf : num10;
        Integer num25 = (i2 & 2097152) != 0 ? comment.possession : num11;
        Integer num26 = (i2 & 4194304) != 0 ? comment.homeScore : num12;
        Integer num27 = (i2 & 8388608) != 0 ? comment.awayScore : num13;
        Integer num28 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? comment.atBatId : num14;
        BaseballInningInfo baseballInningInfo2 = (i2 & 33554432) != 0 ? comment.inningInfo : baseballInningInfo;
        Boolean bool6 = (i2 & 67108864) != 0 ? comment.isScoringPlay : bool3;
        BaseballActionOutcome baseballActionOutcome2 = (i2 & 134217728) != 0 ? comment.actionOutcome : baseballActionOutcome;
        List list5 = (i2 & 268435456) != 0 ? comment.notableActions : list;
        if ((i2 & 536870912) != 0) {
            list4 = list5;
            list3 = comment.footballPassingNetworkAction;
        } else {
            list3 = list2;
            list4 = list5;
        }
        return comment.copy(str10, str7, str8, str9, num15, bool4, player4, player5, player6, i3, num16, num17, num18, num19, str11, num20, num21, num22, num23, bool5, num24, num25, num26, num27, num28, baseballInningInfo2, bool6, baseballActionOutcome2, list4, list3);
    }

    public static /* synthetic */ Integer getAwayScore$default(Comment comment, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return comment.getAwayScore(teamSides);
    }

    public static /* synthetic */ Integer getHomeScore$default(Comment comment, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return comment.getHomeScore(teamSides);
    }

    public static /* synthetic */ Boolean getIsHome$default(Comment comment, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return comment.getIsHome(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(Comment self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.text);
        output.y(serialDesc, 1, self.type);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.goalType);
        output.h(serialDesc, 3, uhiVar, self.periodName);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.addedTime);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 5, gz1Var, self.isHome);
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        output.h(serialDesc, 6, player$$serializer, self.player);
        output.h(serialDesc, 7, player$$serializer, self.playerIn);
        output.h(serialDesc, 8, player$$serializer, self.playerOut);
        output.u(9, self.id, serialDesc);
        output.h(serialDesc, 10, a7aVar, self.time);
        output.h(serialDesc, 11, a7aVar, self.reversedPeriodTime);
        output.h(serialDesc, 12, a7aVar, self.reversedPeriodTimeSeconds);
        output.h(serialDesc, 13, a7aVar, self.yardsGained);
        output.h(serialDesc, 14, uhiVar, self.playType);
        output.h(serialDesc, 15, a7aVar, self.driveId);
        output.h(serialDesc, 16, a7aVar, self.yardline);
        output.h(serialDesc, 17, a7aVar, self.yardsToFirstDown);
        output.h(serialDesc, 18, a7aVar, self.down);
        output.h(serialDesc, 19, gz1Var, self.isGoal);
        output.h(serialDesc, 20, a7aVar, self.teamHalf);
        output.h(serialDesc, 21, a7aVar, self.possession);
        output.h(serialDesc, 22, a7aVar, self.homeScore);
        output.h(serialDesc, 23, a7aVar, self.awayScore);
        output.h(serialDesc, 24, a7aVar, self.atBatId);
        output.h(serialDesc, 25, BaseballInningInfo$$serializer.INSTANCE, self.inningInfo);
        output.h(serialDesc, 26, gz1Var, self.isScoringPlay);
        output.h(serialDesc, 27, (KSerializer) joaVarArr[27].getValue(), self.actionOutcome);
        output.h(serialDesc, 28, (KSerializer) joaVarArr[28].getValue(), self.notableActions);
        output.h(serialDesc, 29, (KSerializer) joaVarArr[29].getValue(), self.footballPassingNetworkAction);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 30, self.shouldReverseTeams);
        }
        if (!output.o(serialDesc)) {
            Integer num = self.groupId;
            Integer num2 = self.driveId;
            if (num2 == null) {
                BaseballInningInfo baseballInningInfo = self.inningInfo;
                num2 = baseballInningInfo != null ? Integer.valueOf(baseballInningInfo.getMockId()) : null;
            }
            if (Intrinsics.c(num, num2)) {
                return;
            }
        }
        output.h(serialDesc, 31, a7aVar, self.groupId);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getReversedPeriodTime() {
        return this.reversedPeriodTime;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getReversedPeriodTimeSeconds() {
        return this.reversedPeriodTimeSeconds;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getYardsGained() {
        return this.yardsGained;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getPlayType() {
        return this.playType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getAtBatId() {
        return this.atBatId;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final BaseballInningInfo getInningInfo() {
        return this.inningInfo;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Boolean getIsScoringPlay() {
        return this.isScoringPlay;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final BaseballActionOutcome getActionOutcome() {
        return this.actionOutcome;
    }

    @Nullable
    public final List<NotableAction> component29() {
        return this.notableActions;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getGoalType() {
        return this.goalType;
    }

    @Nullable
    public final List<FootballPassingNetworkSegment> component30() {
        return this.footballPassingNetworkAction;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPeriodName() {
        return this.periodName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getAddedTime() {
        return this.addedTime;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Player getPlayerIn() {
        return this.playerIn;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Player getPlayerOut() {
        return this.playerOut;
    }

    @NotNull
    public final Comment copy(@NotNull String text, @NotNull String type, @Nullable String goalType, @Nullable String periodName, @Nullable Integer addedTime, @Nullable Boolean isHome, @Nullable Player player, @Nullable Player playerIn, @Nullable Player playerOut, int id, @Nullable Integer time, @Nullable Integer reversedPeriodTime, @Nullable Integer reversedPeriodTimeSeconds, @Nullable Integer yardsGained, @Nullable String playType, @Nullable Integer driveId, @Nullable Integer yardline, @Nullable Integer yardsToFirstDown, @Nullable Integer down, @Nullable Boolean isGoal, @Nullable Integer teamHalf, @Nullable Integer possession, @Nullable Integer homeScore, @Nullable Integer awayScore, @Nullable Integer atBatId, @Nullable BaseballInningInfo inningInfo, @Nullable Boolean isScoringPlay, @Nullable BaseballActionOutcome actionOutcome, @Nullable List<NotableAction> notableActions, @Nullable List<FootballPassingNetworkSegment> footballPassingNetworkAction) {
        text.getClass();
        type.getClass();
        return new Comment(text, type, goalType, periodName, addedTime, isHome, player, playerIn, playerOut, id, time, reversedPeriodTime, reversedPeriodTimeSeconds, yardsGained, playType, driveId, yardline, yardsToFirstDown, down, isGoal, teamHalf, possession, homeScore, awayScore, atBatId, inningInfo, isScoringPlay, actionOutcome, notableActions, footballPassingNetworkAction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) other;
        return Intrinsics.c(this.text, comment.text) && Intrinsics.c(this.type, comment.type) && Intrinsics.c(this.goalType, comment.goalType) && Intrinsics.c(this.periodName, comment.periodName) && Intrinsics.c(this.addedTime, comment.addedTime) && Intrinsics.c(this.isHome, comment.isHome) && Intrinsics.c(this.player, comment.player) && Intrinsics.c(this.playerIn, comment.playerIn) && Intrinsics.c(this.playerOut, comment.playerOut) && this.id == comment.id && Intrinsics.c(this.time, comment.time) && Intrinsics.c(this.reversedPeriodTime, comment.reversedPeriodTime) && Intrinsics.c(this.reversedPeriodTimeSeconds, comment.reversedPeriodTimeSeconds) && Intrinsics.c(this.yardsGained, comment.yardsGained) && Intrinsics.c(this.playType, comment.playType) && Intrinsics.c(this.driveId, comment.driveId) && Intrinsics.c(this.yardline, comment.yardline) && Intrinsics.c(this.yardsToFirstDown, comment.yardsToFirstDown) && Intrinsics.c(this.down, comment.down) && Intrinsics.c(this.isGoal, comment.isGoal) && Intrinsics.c(this.teamHalf, comment.teamHalf) && Intrinsics.c(this.possession, comment.possession) && Intrinsics.c(this.homeScore, comment.homeScore) && Intrinsics.c(this.awayScore, comment.awayScore) && Intrinsics.c(this.atBatId, comment.atBatId) && Intrinsics.c(this.inningInfo, comment.inningInfo) && Intrinsics.c(this.isScoringPlay, comment.isScoringPlay) && this.actionOutcome == comment.actionOutcome && Intrinsics.c(this.notableActions, comment.notableActions) && Intrinsics.c(this.footballPassingNetworkAction, comment.footballPassingNetworkAction);
    }

    @Nullable
    public final BaseballActionOutcome getActionOutcome() {
        return this.actionOutcome;
    }

    @Nullable
    public final Integer getAddedTime() {
        return this.addedTime;
    }

    @Nullable
    public final Integer getAtBatId() {
        return this.atBatId;
    }

    @Nullable
    public final Integer getAwayScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeScore : this.awayScore;
    }

    @NotNull
    public final AmericanFootballDownDistance getDownDistance() {
        Integer num = this.yardsToFirstDown;
        Integer num2 = this.down;
        Integer num3 = this.yardline;
        Boolean bool = this.isGoal;
        return new AmericanFootballDownDistance(num, num2, num3, Boolean.valueOf(bool != null ? bool.booleanValue() : false), this.possession, this.teamHalf);
    }

    @Nullable
    public final List<FootballPassingNetworkSegment> getFootballPassingNetworkAction() {
        return this.footballPassingNetworkAction;
    }

    @Nullable
    public final String getGoalType() {
        return this.goalType;
    }

    @Nullable
    public final Integer getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final Integer getHomeScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayScore : this.homeScore;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final BaseballInningInfo getInningInfo() {
        return this.inningInfo;
    }

    @Nullable
    public final Boolean getIsHome(@NotNull TeamSides side) {
        side.getClass();
        Boolean bool = this.isHome;
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf((side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ^ bool.booleanValue());
    }

    @Nullable
    public final List<NotableAction> getNotableActions() {
        return this.notableActions;
    }

    @Nullable
    public final String getPeriodName() {
        return this.periodName;
    }

    @Nullable
    public final String getPlayType() {
        return this.playType;
    }

    @Nullable
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Player getPlayerIn() {
        return this.playerIn;
    }

    @Nullable
    public final Player getPlayerOut() {
        return this.playerOut;
    }

    @Nullable
    public final Integer getReversedPeriodTime() {
        return this.reversedPeriodTime;
    }

    @Nullable
    public final Integer getReversedPeriodTimeSeconds() {
        return this.reversedPeriodTimeSeconds;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getTime() {
        return this.time;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getYardsGained() {
        return this.yardsGained;
    }

    public int hashCode() {
        int c = dmi.c(this.text.hashCode() * 31, 31, this.type);
        String str = this.goalType;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.periodName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.addedTime;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isHome;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Player player = this.player;
        int hashCode5 = (hashCode4 + (player == null ? 0 : player.hashCode())) * 31;
        Player player2 = this.playerIn;
        int hashCode6 = (hashCode5 + (player2 == null ? 0 : player2.hashCode())) * 31;
        Player player3 = this.playerOut;
        int a = wv8.a(this.id, (hashCode6 + (player3 == null ? 0 : player3.hashCode())) * 31, 31);
        Integer num2 = this.time;
        int hashCode7 = (a + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.reversedPeriodTime;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.reversedPeriodTimeSeconds;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.yardsGained;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.playType;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num6 = this.driveId;
        int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.yardline;
        int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.yardsToFirstDown;
        int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.down;
        int hashCode15 = (hashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool2 = this.isGoal;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num10 = this.teamHalf;
        int hashCode17 = (hashCode16 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.possession;
        int hashCode18 = (hashCode17 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.homeScore;
        int hashCode19 = (hashCode18 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.awayScore;
        int hashCode20 = (hashCode19 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.atBatId;
        int hashCode21 = (hashCode20 + (num14 == null ? 0 : num14.hashCode())) * 31;
        BaseballInningInfo baseballInningInfo = this.inningInfo;
        int hashCode22 = (hashCode21 + (baseballInningInfo == null ? 0 : baseballInningInfo.hashCode())) * 31;
        Boolean bool3 = this.isScoringPlay;
        int hashCode23 = (hashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BaseballActionOutcome baseballActionOutcome = this.actionOutcome;
        int hashCode24 = (hashCode23 + (baseballActionOutcome == null ? 0 : baseballActionOutcome.hashCode())) * 31;
        List<NotableAction> list = this.notableActions;
        int hashCode25 = (hashCode24 + (list == null ? 0 : list.hashCode())) * 31;
        List<FootballPassingNetworkSegment> list2 = this.footballPassingNetworkAction;
        return hashCode25 + (list2 != null ? list2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isScoringPlay() {
        return this.isScoringPlay;
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.type;
        String str3 = this.goalType;
        String str4 = this.periodName;
        Integer num = this.addedTime;
        Boolean bool = this.isHome;
        Player player = this.player;
        Player player2 = this.playerIn;
        Player player3 = this.playerOut;
        int i = this.id;
        Integer num2 = this.time;
        Integer num3 = this.reversedPeriodTime;
        Integer num4 = this.reversedPeriodTimeSeconds;
        Integer num5 = this.yardsGained;
        String str5 = this.playType;
        Integer num6 = this.driveId;
        Integer num7 = this.yardline;
        Integer num8 = this.yardsToFirstDown;
        Integer num9 = this.down;
        Boolean bool2 = this.isGoal;
        Integer num10 = this.teamHalf;
        Integer num11 = this.possession;
        Integer num12 = this.homeScore;
        Integer num13 = this.awayScore;
        Integer num14 = this.atBatId;
        BaseballInningInfo baseballInningInfo = this.inningInfo;
        Boolean bool3 = this.isScoringPlay;
        BaseballActionOutcome baseballActionOutcome = this.actionOutcome;
        List<NotableAction> list = this.notableActions;
        List<FootballPassingNetworkSegment> list2 = this.footballPassingNetworkAction;
        StringBuilder s = mz1.s("Comment(text=", str, ", type=", str2, ", goalType=");
        bf3.v(s, str3, ", periodName=", str4, ", addedTime=");
        vxd.v(s, num, ", isHome=", bool, ", player=");
        s.append(player);
        s.append(", playerIn=");
        s.append(player2);
        s.append(", playerOut=");
        s.append(player3);
        s.append(", id=");
        s.append(i);
        s.append(", time=");
        vxd.r(num2, num3, ", reversedPeriodTime=", ", reversedPeriodTimeSeconds=", s);
        vxd.r(num4, num5, ", yardsGained=", ", playType=", s);
        me4.o(num6, str5, ", driveId=", ", yardline=", s);
        vxd.r(num7, num8, ", yardsToFirstDown=", ", down=", s);
        vxd.v(s, num9, ", isGoal=", bool2, ", teamHalf=");
        vxd.r(num10, num11, ", possession=", ", homeScore=", s);
        vxd.r(num12, num13, ", awayScore=", ", atBatId=", s);
        s.append(num14);
        s.append(", inningInfo=");
        s.append(baseballInningInfo);
        s.append(", isScoringPlay=");
        s.append(bool3);
        s.append(", actionOutcome=");
        s.append(baseballActionOutcome);
        s.append(", notableActions=");
        return me4.j(s, list, ", footballPassingNetworkAction=", list2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/Comment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/commentary/Comment;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Comment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Comment(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Boolean bool, @Nullable Player player, @Nullable Player player2, @Nullable Player player3, int i, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Boolean bool2, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable BaseballInningInfo baseballInningInfo, @Nullable Boolean bool3, @Nullable BaseballActionOutcome baseballActionOutcome, @Nullable List<NotableAction> list, @Nullable List<FootballPassingNetworkSegment> list2) {
        Integer num15;
        str.getClass();
        str2.getClass();
        this.text = str;
        this.type = str2;
        this.goalType = str3;
        this.periodName = str4;
        this.addedTime = num;
        this.isHome = bool;
        this.player = player;
        this.playerIn = player2;
        this.playerOut = player3;
        this.id = i;
        this.time = num2;
        this.reversedPeriodTime = num3;
        this.reversedPeriodTimeSeconds = num4;
        this.yardsGained = num5;
        this.playType = str5;
        this.driveId = num6;
        this.yardline = num7;
        this.yardsToFirstDown = num8;
        this.down = num9;
        this.isGoal = bool2;
        this.teamHalf = num10;
        this.possession = num11;
        this.homeScore = num12;
        this.awayScore = num13;
        this.atBatId = num14;
        this.inningInfo = baseballInningInfo;
        this.isScoringPlay = bool3;
        this.actionOutcome = baseballActionOutcome;
        this.notableActions = list;
        this.footballPassingNetworkAction = list2;
        if (num6 == null) {
            num15 = baseballInningInfo != null ? Integer.valueOf(baseballInningInfo.getMockId()) : null;
        } else {
            num15 = num6;
        }
        this.groupId = num15;
    }
}
