package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.lkb;
import defpackage.oea;
import defpackage.ph0;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.tub;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u0000 q2\u00020\u0001:\u0002rqBÏ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u0019BY\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u001aBí\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0018\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00070$¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u0004\u0018\u00010\u00072\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010%¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010/J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010/J\u0012\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b7\u00104J\u0012\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b8\u00104J\u0012\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b9\u00104J\u0012\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b:\u00104J\u0012\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b;\u00104J\u0012\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b<\u00104J\u0012\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b=\u00104J\u0012\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b>\u00104J\u0012\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b?\u00104J\u0012\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b@\u00104J\u0012\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bA\u00104J\u0012\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bB\u00104J\u0012\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bC\u00104J\u0080\u0002\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020%HÖ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010L\u001a\u00020!2\b\u0010K\u001a\u0004\u0018\u00010JHÖ\u0003¢\u0006\u0004\bL\u0010MJ'\u0010V\u001a\u00020S2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u0001¢\u0006\u0004\bT\u0010UR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u0010/R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010W\u001a\u0004\bY\u0010/R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010W\u001a\u0004\bZ\u0010/R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010W\u001a\u0004\b[\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\\\u001a\u0004\b]\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\\\u001a\u0004\b^\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\\\u001a\u0004\b_\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\\\u001a\u0004\b`\u00104R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\\\u001a\u0004\ba\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\\\u001a\u0004\bb\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\\\u001a\u0004\bc\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\\\u001a\u0004\bd\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\\\u001a\u0004\be\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\\\u001a\u0004\bf\u00104R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\\\u001a\u0004\bg\u00104R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\\\u001a\u0004\bh\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\\\u001a\u0004\bi\u00104R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\\\u001a\u0004\bj\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\bk\u00104R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\\\u001a\u0004\bl\u00104R(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010m\u001a\u0004\u0018\u00010\u001c8F@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001d\u0010n\u001a\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/sofascore/model/mvvm/model/Time;", "Ljava/io/Serializable;", "", "played", "periodLength", "overtimeLength", "totalPeriodCount", "", "initial", InneractiveMediationNameConsts.MAX, "currentPeriodStartTimestamp", "extra", "period1", "period2", "period3", "period4", "period5", "overtime", "penalties", "injuryTime1", "injuryTime2", "injuryTime3", "injuryTime4", "lastPeriodEndTimestamp", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "seen0", "Lcom/sofascore/model/mvvm/model/StatusTime;", "statusTime", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/StatusTime;Lt5h;)V", "", "timeNotNull", "()Z", "", "", "getTimeMap", "()Ljava/util/Map;", "period", "getPeriodTime", "(I)Ljava/lang/Long;", "lastPeriod", "getInjuryTime", "(Ljava/lang/String;)Ljava/lang/Long;", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "()Ljava/lang/Long;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/sofascore/model/mvvm/model/Time;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Time;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getPlayed", "getPeriodLength", "getOvertimeLength", "getTotalPeriodCount", "Ljava/lang/Long;", "getInitial", "getMax", "getCurrentPeriodStartTimestamp", "getExtra", "getPeriod1", "getPeriod2", "getPeriod3", "getPeriod4", "getPeriod5", "getOvertime", "getPenalties", "getInjuryTime1", "getInjuryTime2", "getInjuryTime3", "getInjuryTime4", "getLastPeriodEndTimestamp", U3.i.X, "Lcom/sofascore/model/mvvm/model/StatusTime;", "getStatusTime", "()Lcom/sofascore/model/mvvm/model/StatusTime;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Time implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long currentPeriodStartTimestamp;

    @Nullable
    private final Long extra;

    @Nullable
    private final Long initial;

    @Nullable
    private final Long injuryTime1;

    @Nullable
    private final Long injuryTime2;

    @Nullable
    private final Long injuryTime3;

    @Nullable
    private final Long injuryTime4;

    @Nullable
    private final Long lastPeriodEndTimestamp;

    @Nullable
    private final Long max;

    @Nullable
    private final Long overtime;

    @Nullable
    private final Integer overtimeLength;

    @Nullable
    private final Long penalties;

    @Nullable
    private final Long period1;

    @Nullable
    private final Long period2;

    @Nullable
    private final Long period3;

    @Nullable
    private final Long period4;

    @Nullable
    private final Long period5;

    @Nullable
    private final Integer periodLength;

    @Nullable
    private final Integer played;

    @Nullable
    private StatusTime statusTime;

    @Nullable
    private final Integer totalPeriodCount;

    public /* synthetic */ Time(int i, Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, StatusTime statusTime, t5h t5hVar) {
        if (1048575 != (i & 1048575)) {
            oea.z(i, 1048575, Time$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.played = num;
        this.periodLength = num2;
        this.overtimeLength = num3;
        this.totalPeriodCount = num4;
        this.initial = l;
        this.max = l2;
        this.currentPeriodStartTimestamp = l3;
        this.extra = l4;
        this.period1 = l5;
        this.period2 = l6;
        this.period3 = l7;
        this.period4 = l8;
        this.period5 = l9;
        this.overtime = l10;
        this.penalties = l11;
        this.injuryTime1 = l12;
        this.injuryTime2 = l13;
        this.injuryTime3 = l14;
        this.injuryTime4 = l15;
        this.lastPeriodEndTimestamp = l16;
        if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            this.statusTime = null;
        } else {
            this.statusTime = statusTime;
        }
    }

    public static /* synthetic */ Time copy$default(Time time, Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, int i, Object obj) {
        Long l17;
        Long l18;
        Integer num5 = (i & 1) != 0 ? time.played : num;
        Integer num6 = (i & 2) != 0 ? time.periodLength : num2;
        Integer num7 = (i & 4) != 0 ? time.overtimeLength : num3;
        Integer num8 = (i & 8) != 0 ? time.totalPeriodCount : num4;
        Long l19 = (i & 16) != 0 ? time.initial : l;
        Long l20 = (i & 32) != 0 ? time.max : l2;
        Long l21 = (i & 64) != 0 ? time.currentPeriodStartTimestamp : l3;
        Long l22 = (i & 128) != 0 ? time.extra : l4;
        Long l23 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? time.period1 : l5;
        Long l24 = (i & 512) != 0 ? time.period2 : l6;
        Long l25 = (i & 1024) != 0 ? time.period3 : l7;
        Long l26 = (i & a.o) != 0 ? time.period4 : l8;
        Long l27 = (i & 4096) != 0 ? time.period5 : l9;
        Long l28 = (i & 8192) != 0 ? time.overtime : l10;
        Integer num9 = num5;
        Long l29 = (i & 16384) != 0 ? time.penalties : l11;
        Long l30 = (i & 32768) != 0 ? time.injuryTime1 : l12;
        Long l31 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? time.injuryTime2 : l13;
        Long l32 = (i & 131072) != 0 ? time.injuryTime3 : l14;
        Long l33 = (i & 262144) != 0 ? time.injuryTime4 : l15;
        if ((i & 524288) != 0) {
            l18 = l33;
            l17 = time.lastPeriodEndTimestamp;
        } else {
            l17 = l16;
            l18 = l33;
        }
        return time.copy(num9, num6, num7, num8, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l18, l17);
    }

    public static final /* synthetic */ void write$Self$model_release(Time self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.played);
        output.h(serialDesc, 1, a7aVar, self.periodLength);
        output.h(serialDesc, 2, a7aVar, self.overtimeLength);
        output.h(serialDesc, 3, a7aVar, self.totalPeriodCount);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 4, lkbVar, self.initial);
        output.h(serialDesc, 5, lkbVar, self.max);
        output.h(serialDesc, 6, lkbVar, self.currentPeriodStartTimestamp);
        output.h(serialDesc, 7, lkbVar, self.extra);
        output.h(serialDesc, 8, lkbVar, self.period1);
        output.h(serialDesc, 9, lkbVar, self.period2);
        output.h(serialDesc, 10, lkbVar, self.period3);
        output.h(serialDesc, 11, lkbVar, self.period4);
        output.h(serialDesc, 12, lkbVar, self.period5);
        output.h(serialDesc, 13, lkbVar, self.overtime);
        output.h(serialDesc, 14, lkbVar, self.penalties);
        output.h(serialDesc, 15, lkbVar, self.injuryTime1);
        output.h(serialDesc, 16, lkbVar, self.injuryTime2);
        output.h(serialDesc, 17, lkbVar, self.injuryTime3);
        output.h(serialDesc, 18, lkbVar, self.injuryTime4);
        output.h(serialDesc, 19, lkbVar, self.lastPeriodEndTimestamp);
        if (!output.o(serialDesc) && self.getStatusTime() == null) {
            return;
        }
        output.h(serialDesc, 20, StatusTime$$serializer.INSTANCE, self.getStatusTime());
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getPlayed() {
        return this.played;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Long getPeriod2() {
        return this.period2;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Long getPeriod3() {
        return this.period3;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Long getPeriod4() {
        return this.period4;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Long getPeriod5() {
        return this.period5;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Long getOvertime() {
        return this.overtime;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Long getPenalties() {
        return this.penalties;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Long getInjuryTime1() {
        return this.injuryTime1;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Long getInjuryTime2() {
        return this.injuryTime2;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Long getInjuryTime3() {
        return this.injuryTime3;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Long getInjuryTime4() {
        return this.injuryTime4;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getPeriodLength() {
        return this.periodLength;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Long getLastPeriodEndTimestamp() {
        return this.lastPeriodEndTimestamp;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getOvertimeLength() {
        return this.overtimeLength;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTotalPeriodCount() {
        return this.totalPeriodCount;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getInitial() {
        return this.initial;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getMax() {
        return this.max;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getCurrentPeriodStartTimestamp() {
        return this.currentPeriodStartTimestamp;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Long getExtra() {
        return this.extra;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Long getPeriod1() {
        return this.period1;
    }

    @NotNull
    public final Time copy(@Nullable Integer played, @Nullable Integer periodLength, @Nullable Integer overtimeLength, @Nullable Integer totalPeriodCount, @Nullable Long initial, @Nullable Long max, @Nullable Long currentPeriodStartTimestamp, @Nullable Long extra, @Nullable Long period1, @Nullable Long period2, @Nullable Long period3, @Nullable Long period4, @Nullable Long period5, @Nullable Long overtime, @Nullable Long penalties, @Nullable Long injuryTime1, @Nullable Long injuryTime2, @Nullable Long injuryTime3, @Nullable Long injuryTime4, @Nullable Long lastPeriodEndTimestamp) {
        return new Time(played, periodLength, overtimeLength, totalPeriodCount, initial, max, currentPeriodStartTimestamp, extra, period1, period2, period3, period4, period5, overtime, penalties, injuryTime1, injuryTime2, injuryTime3, injuryTime4, lastPeriodEndTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Time)) {
            return false;
        }
        Time time = (Time) other;
        return Intrinsics.c(this.played, time.played) && Intrinsics.c(this.periodLength, time.periodLength) && Intrinsics.c(this.overtimeLength, time.overtimeLength) && Intrinsics.c(this.totalPeriodCount, time.totalPeriodCount) && Intrinsics.c(this.initial, time.initial) && Intrinsics.c(this.max, time.max) && Intrinsics.c(this.currentPeriodStartTimestamp, time.currentPeriodStartTimestamp) && Intrinsics.c(this.extra, time.extra) && Intrinsics.c(this.period1, time.period1) && Intrinsics.c(this.period2, time.period2) && Intrinsics.c(this.period3, time.period3) && Intrinsics.c(this.period4, time.period4) && Intrinsics.c(this.period5, time.period5) && Intrinsics.c(this.overtime, time.overtime) && Intrinsics.c(this.penalties, time.penalties) && Intrinsics.c(this.injuryTime1, time.injuryTime1) && Intrinsics.c(this.injuryTime2, time.injuryTime2) && Intrinsics.c(this.injuryTime3, time.injuryTime3) && Intrinsics.c(this.injuryTime4, time.injuryTime4) && Intrinsics.c(this.lastPeriodEndTimestamp, time.lastPeriodEndTimestamp);
    }

    @Nullable
    public final Long getCurrentPeriodStartTimestamp() {
        return this.currentPeriodStartTimestamp;
    }

    @Nullable
    public final Long getExtra() {
        return this.extra;
    }

    @Nullable
    public final Long getInitial() {
        return this.initial;
    }

    @Nullable
    public final Long getInjuryTime(@Nullable String lastPeriod) {
        if (lastPeriod == null) {
            return null;
        }
        switch (lastPeriod.hashCode()) {
            case -1289032159:
                if (lastPeriod.equals("extra1")) {
                    return this.injuryTime3;
                }
                return null;
            case -1289032158:
                if (lastPeriod.equals("extra2")) {
                    return this.injuryTime4;
                }
                return null;
            case -678739312:
                if (lastPeriod.equals("period1")) {
                    return this.injuryTime1;
                }
                return null;
            case -678739311:
                if (lastPeriod.equals("period2")) {
                    return this.injuryTime2;
                }
                return null;
            default:
                return null;
        }
    }

    @Nullable
    public final Long getInjuryTime1() {
        return this.injuryTime1;
    }

    @Nullable
    public final Long getInjuryTime2() {
        return this.injuryTime2;
    }

    @Nullable
    public final Long getInjuryTime3() {
        return this.injuryTime3;
    }

    @Nullable
    public final Long getInjuryTime4() {
        return this.injuryTime4;
    }

    @Nullable
    public final Long getLastPeriodEndTimestamp() {
        return this.lastPeriodEndTimestamp;
    }

    @Nullable
    public final Long getMax() {
        return this.max;
    }

    @Nullable
    public final Long getOvertime() {
        return this.overtime;
    }

    @Nullable
    public final Integer getOvertimeLength() {
        return this.overtimeLength;
    }

    @Nullable
    public final Long getPenalties() {
        return this.penalties;
    }

    @Nullable
    public final Long getPeriod1() {
        return this.period1;
    }

    @Nullable
    public final Long getPeriod2() {
        return this.period2;
    }

    @Nullable
    public final Long getPeriod3() {
        return this.period3;
    }

    @Nullable
    public final Long getPeriod4() {
        return this.period4;
    }

    @Nullable
    public final Long getPeriod5() {
        return this.period5;
    }

    @Nullable
    public final Integer getPeriodLength() {
        return this.periodLength;
    }

    @Nullable
    public final Long getPeriodTime(int period) {
        if (period == 1) {
            return this.period1;
        }
        if (period == 2) {
            return this.period2;
        }
        if (period == 3) {
            return this.period3;
        }
        if (period == 4) {
            return this.period4;
        }
        if (period != 5) {
            return null;
        }
        return this.period5;
    }

    @Nullable
    public final Integer getPlayed() {
        return this.played;
    }

    @Nullable
    public final StatusTime getStatusTime() {
        StatusTime statusTime = this.statusTime;
        if (statusTime != null) {
            return statusTime;
        }
        if (this.initial == null || this.max == null || this.currentPeriodStartTimestamp == null || this.extra == null) {
            return null;
        }
        StatusTime statusTime2 = new StatusTime(this.initial.longValue(), this.max.longValue(), this.currentPeriodStartTimestamp.longValue(), this.extra.longValue());
        this.statusTime = statusTime2;
        return statusTime2;
    }

    @NotNull
    public final Map<String, Long> getTimeMap() {
        Long l = this.period1;
        Pair pair = l != null ? new Pair("period1", Long.valueOf(l.longValue())) : null;
        Long l2 = this.period2;
        Pair pair2 = l2 != null ? new Pair("period2", Long.valueOf(l2.longValue())) : null;
        Long l3 = this.period3;
        Pair pair3 = l3 != null ? new Pair("period3", Long.valueOf(l3.longValue())) : null;
        Long l4 = this.period4;
        Pair pair4 = l4 != null ? new Pair("period4", Long.valueOf(l4.longValue())) : null;
        Long l5 = this.period5;
        Pair pair5 = l5 != null ? new Pair("period5", Long.valueOf(l5.longValue())) : null;
        Long l6 = this.overtime;
        Pair pair6 = l6 != null ? new Pair("overtime", Long.valueOf(l6.longValue())) : null;
        Long l7 = this.penalties;
        Pair pair7 = l7 != null ? new Pair("penalties", Long.valueOf(l7.longValue())) : null;
        Long l8 = this.injuryTime1;
        Pair pair8 = l8 != null ? new Pair("injuryTime1", Long.valueOf(l8.longValue())) : null;
        Long l9 = this.injuryTime2;
        Pair pair9 = l9 != null ? new Pair("injuryTime2", Long.valueOf(l9.longValue())) : null;
        Long l10 = this.injuryTime3;
        Pair pair10 = l10 != null ? new Pair("injuryTime3", Long.valueOf(l10.longValue())) : null;
        Long l11 = this.injuryTime4;
        return tub.o(ph0.x(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, l11 != null ? new Pair("injuryTime4", Long.valueOf(l11.longValue())) : null}));
    }

    @Nullable
    public final Integer getTotalPeriodCount() {
        return this.totalPeriodCount;
    }

    public int hashCode() {
        Integer num = this.played;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.periodLength;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.overtimeLength;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalPeriodCount;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l = this.initial;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.max;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.currentPeriodStartTimestamp;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.extra;
        int hashCode8 = (hashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.period1;
        int hashCode9 = (hashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.period2;
        int hashCode10 = (hashCode9 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.period3;
        int hashCode11 = (hashCode10 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.period4;
        int hashCode12 = (hashCode11 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.period5;
        int hashCode13 = (hashCode12 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.overtime;
        int hashCode14 = (hashCode13 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.penalties;
        int hashCode15 = (hashCode14 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.injuryTime1;
        int hashCode16 = (hashCode15 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.injuryTime2;
        int hashCode17 = (hashCode16 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.injuryTime3;
        int hashCode18 = (hashCode17 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.injuryTime4;
        int hashCode19 = (hashCode18 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.lastPeriodEndTimestamp;
        return hashCode19 + (l16 != null ? l16.hashCode() : 0);
    }

    public final boolean timeNotNull() {
        return (this.played == null || this.periodLength == null || this.overtimeLength == null || this.totalPeriodCount == null) ? false : true;
    }

    @NotNull
    public String toString() {
        Integer num = this.played;
        Integer num2 = this.periodLength;
        Integer num3 = this.overtimeLength;
        Integer num4 = this.totalPeriodCount;
        Long l = this.initial;
        Long l2 = this.max;
        Long l3 = this.currentPeriodStartTimestamp;
        Long l4 = this.extra;
        Long l5 = this.period1;
        Long l6 = this.period2;
        Long l7 = this.period3;
        Long l8 = this.period4;
        Long l9 = this.period5;
        Long l10 = this.overtime;
        Long l11 = this.penalties;
        Long l12 = this.injuryTime1;
        Long l13 = this.injuryTime2;
        Long l14 = this.injuryTime3;
        Long l15 = this.injuryTime4;
        Long l16 = this.lastPeriodEndTimestamp;
        StringBuilder k = wv8.k(num, "Time(played=", ", periodLength=", ", overtimeLength=", num2);
        vxd.r(num3, num4, ", totalPeriodCount=", ", initial=", k);
        k.append(l);
        k.append(", max=");
        k.append(l2);
        k.append(", currentPeriodStartTimestamp=");
        k.append(l3);
        k.append(", extra=");
        k.append(l4);
        k.append(", period1=");
        k.append(l5);
        k.append(", period2=");
        k.append(l6);
        k.append(", period3=");
        k.append(l7);
        k.append(", period4=");
        k.append(l8);
        k.append(", period5=");
        k.append(l9);
        k.append(", overtime=");
        k.append(l10);
        k.append(", penalties=");
        k.append(l11);
        k.append(", injuryTime1=");
        k.append(l12);
        k.append(", injuryTime2=");
        k.append(l13);
        k.append(", injuryTime3=");
        k.append(l14);
        k.append(", injuryTime4=");
        k.append(l15);
        k.append(", lastPeriodEndTimestamp=");
        k.append(l16);
        k.append(")");
        return k.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Time$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Time;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Time$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Time(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @Nullable Long l6, @Nullable Long l7, @Nullable Long l8, @Nullable Long l9, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16) {
        this.played = num;
        this.periodLength = num2;
        this.overtimeLength = num3;
        this.totalPeriodCount = num4;
        this.initial = l;
        this.max = l2;
        this.currentPeriodStartTimestamp = l3;
        this.extra = l4;
        this.period1 = l5;
        this.period2 = l6;
        this.period3 = l7;
        this.period4 = l8;
        this.period5 = l9;
        this.overtime = l10;
        this.penalties = l11;
        this.injuryTime1 = l12;
        this.injuryTime2 = l13;
        this.injuryTime3 = l14;
        this.injuryTime4 = l15;
        this.lastPeriodEndTimestamp = l16;
    }

    public Time(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4) {
        this(num, num2, num3, num4, l, l2, l3, l4, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
