package com.sofascore.model.newNetwork.statistics;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.commentary.BaseballPitchType;
import defpackage.a7a;
import defpackage.c88;
import defpackage.h75;
import defpackage.hz8;
import defpackage.i91;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.tv0;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 \u0080\u00012\u00020\u0001:\u0004\u0081\u0001\u0080\u0001Bý\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\u0004\b$\u0010%B\u0087\u0002\b\u0010\u0012\u0006\u0010&\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010+J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u00103J\u0012\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b;\u0010:J\u0012\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b<\u0010:J\u0012\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b?\u0010>J\u0012\u0010@\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b@\u0010>J\u0012\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bA\u0010>J\u0012\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bB\u0010:J\u0012\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bC\u0010:J\u0012\u0010D\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bD\u0010:J\u0012\u0010E\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bE\u0010:J\u0012\u0010F\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0018\u0010I\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!HÆ\u0003¢\u0006\u0004\bI\u0010JJª\u0002\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!HÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bM\u00103J\u0010\u0010N\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bN\u0010OJ\u001a\u0010R\u001a\u00020Q2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bR\u0010SJ'\u0010\\\u001a\u00020Y2\u0006\u0010T\u001a\u00020\u00002\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020WH\u0001¢\u0006\u0004\bZ\u0010[R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010]\u001a\u0004\b^\u0010+R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010_\u001a\u0004\b`\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010]\u001a\u0004\ba\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\bb\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010c\u001a\u0004\bd\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010e\u001a\u0004\bf\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010e\u001a\u0004\bg\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010h\u001a\u0004\bi\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010j\u001a\u0004\bk\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010l\u001a\u0004\bm\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010l\u001a\u0004\bn\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010l\u001a\u0004\bo\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010p\u001a\u0004\bq\u0010>R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010p\u001a\u0004\br\u0010>R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010p\u001a\u0004\bs\u0010>R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0019\u0010p\u001a\u0004\bt\u0010>R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010l\u001a\u0004\bu\u0010:R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010l\u001a\u0004\bv\u0010:R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010l\u001a\u0004\bw\u0010:R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010l\u001a\u0004\bx\u0010:R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010y\u001a\u0004\bz\u0010GR\u0019\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b \u0010y\u001a\u0004\b{\u0010GR\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b#\u0010|\u001a\u0004\b}\u0010JR\u0011\u0010~\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/BaseballPitch;", "", "Lcom/sofascore/model/mvvm/model/Player;", "pitcher", "Lcom/sofascore/model/mvvm/model/Team;", "pitcherTeam", "hitter", "hitterTeam", "Lcom/sofascore/model/newNetwork/commentary/BaseballPitchType;", "pitchCode", "", "pitchDescription", "type", "", "pitchSpeed", "Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "outcome", "", "pitchCount", "pitchX", "pitchY", "", "mlbX", "mlbY", "mlbHitCordX", "mlbHitCordY", "mlbZone", "balls", "strikes", "outs", "Lcom/sofascore/model/newNetwork/statistics/PlayerHand;", "pitcherHand", "hitterHand", "", "Lcom/sofascore/model/newNetwork/statistics/BaseballRunner;", "runners", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/commentary/BaseballPitchType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/statistics/PlayerHand;Lcom/sofascore/model/newNetwork/statistics/PlayerHand;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/commentary/BaseballPitchType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/statistics/PlayerHand;Lcom/sofascore/model/newNetwork/statistics/PlayerHand;Ljava/util/List;Lt5h;)V", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "component4", "component5", "()Lcom/sofascore/model/newNetwork/commentary/BaseballPitchType;", "component6", "()Ljava/lang/String;", "component7", "component8", "()Ljava/lang/Double;", "component9", "()Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "()Ljava/lang/Float;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Lcom/sofascore/model/newNetwork/statistics/PlayerHand;", "component22", "component23", "()Ljava/util/List;", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/commentary/BaseballPitchType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/statistics/PlayerHand;Lcom/sofascore/model/newNetwork/statistics/PlayerHand;Ljava/util/List;)Lcom/sofascore/model/newNetwork/statistics/BaseballPitch;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/BaseballPitch;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Player;", "getPitcher", "Lcom/sofascore/model/mvvm/model/Team;", "getPitcherTeam", "getHitter", "getHitterTeam", "Lcom/sofascore/model/newNetwork/commentary/BaseballPitchType;", "getPitchCode", "Ljava/lang/String;", "getPitchDescription", "getType", "Ljava/lang/Double;", "getPitchSpeed", "Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcome;", "getOutcome", "Ljava/lang/Integer;", "getPitchCount", "getPitchX", "getPitchY", "Ljava/lang/Float;", "getMlbX", "getMlbY", "getMlbHitCordX", "getMlbHitCordY", "getMlbZone", "getBalls", "getStrikes", "getOuts", "Lcom/sofascore/model/newNetwork/statistics/PlayerHand;", "getPitcherHand", "getHitterHand", "Ljava/util/List;", "getRunners", "isPitch", "()Z", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballPitch {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer balls;

    @Nullable
    private final Player hitter;

    @Nullable
    private final PlayerHand hitterHand;

    @Nullable
    private final Team hitterTeam;

    @Nullable
    private final Float mlbHitCordX;

    @Nullable
    private final Float mlbHitCordY;

    @Nullable
    private final Float mlbX;

    @Nullable
    private final Float mlbY;

    @Nullable
    private final Integer mlbZone;

    @Nullable
    private final BaseballActionOutcome outcome;

    @Nullable
    private final Integer outs;

    @Nullable
    private final BaseballPitchType pitchCode;

    @Nullable
    private final Integer pitchCount;

    @Nullable
    private final String pitchDescription;

    @Nullable
    private final Double pitchSpeed;

    @Nullable
    private final Integer pitchX;

    @Nullable
    private final Integer pitchY;

    @Nullable
    private final Player pitcher;

    @Nullable
    private final PlayerHand pitcherHand;

    @Nullable
    private final Team pitcherTeam;

    @Nullable
    private final List<BaseballRunner> runners;

    @Nullable
    private final Integer strikes;

    @Nullable
    private final String type;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new tv0(25)), null, ypa.a(ysaVar, new tv0(26)), ypa.a(ysaVar, new tv0(27)), null, null, null, ypa.a(ysaVar, new tv0(28)), null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new tv0(29)), ypa.a(ysaVar, new i91(0)), ypa.a(ysaVar, new i91(1))};
    }

    public /* synthetic */ BaseballPitch(int i, Player player, Team team, Player player2, Team team2, BaseballPitchType baseballPitchType, String str, String str2, Double d, BaseballActionOutcome baseballActionOutcome, Integer num, Integer num2, Integer num3, Float f, Float f2, Float f3, Float f4, Integer num4, Integer num5, Integer num6, Integer num7, PlayerHand playerHand, PlayerHand playerHand2, List list, t5h t5hVar) {
        if (8261631 != (i & 8261631)) {
            oea.z(i, 8261631, BaseballPitch$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pitcher = player;
        this.pitcherTeam = team;
        this.hitter = player2;
        this.hitterTeam = team2;
        this.pitchCode = baseballPitchType;
        this.pitchDescription = str;
        this.type = str2;
        this.pitchSpeed = d;
        this.outcome = baseballActionOutcome;
        this.pitchCount = num;
        this.pitchX = num2;
        this.pitchY = num3;
        if ((i & 4096) == 0) {
            this.mlbX = null;
        } else {
            this.mlbX = f;
        }
        if ((i & 8192) == 0) {
            this.mlbY = null;
        } else {
            this.mlbY = f2;
        }
        if ((i & 16384) == 0) {
            this.mlbHitCordX = null;
        } else {
            this.mlbHitCordX = f3;
        }
        if ((32768 & i) == 0) {
            this.mlbHitCordY = null;
        } else {
            this.mlbHitCordY = f4;
        }
        if ((i & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            this.mlbZone = null;
        } else {
            this.mlbZone = num4;
        }
        this.balls = num5;
        this.strikes = num6;
        this.outs = num7;
        this.pitcherHand = playerHand;
        this.hitterHand = playerHand2;
        this.runners = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return BaseballPitchType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return hz8.F("com.sofascore.model.newNetwork.commentary.BaseballActionOutcome", BaseballActionOutcome.values(), new String[]{"kAK", "kAKP", "kAKB", "kKL", "kKS", "kF", "kFT", "rPABC", "rPABO", "oBI", "oDT2", "oDT3", "oDT4", "oFC", "oFCT2", "oFCT3", "oFCT4", "oFO", "oGO", "oKLT1", "oKLT2", "oKLT3", "oKLT4", "oKST1", "oKST2", "oKST3", "oKST4", "oROET2", "oROET3", "oROET4", "oST1", "oST2", "oST3", "oST4", "oTT3", "oTT4", "oLO", "oOBB", "oOP", "oPO", "oSB", "oSBT2", "oSBT3", "oSBT4", "oSF", "oSFT2", "oSFT3", "oSFT4", "bAB", "bABP", "bABC", "bABS", "bB", "bDB", "bIB", "bPO", "aBK", "aCI", "aD", "aDAD3", "aDAD4", "aFCAD2", "aFCAD3", "aFCAD4", "aHBP", "aHR", "aIBB", "BB", "aKLAD1", "aKLAD2", "aKLAD3", "aKLAD4", "aKSAD1", "aKSAD2", "aKSAD3", "aKSAD4", "aROE", "aROEAD2", "aROEAD3", "aROEAD4", "aROV", "aS", "aSAD2", "aSAD3", "aSAD4", "aSBAD1", "aSBAD2", "aSBAD3", "aSBAD4", "aSFAD1", "aSFAD2", "aSFAD3", "aSFAD4", "aT", "aTAD4", "CS2", "CS3", "CS4", "POCS2", "POCS3", "POCS4", "TO", "TO2", "TO3", "TO4", "FO1", "FO2", "FO3", "FO4", "DO1", "DO2", "DO3", "SB2O2", "SB2O3", "SB2O4", "SB3O3", "SB3O4", "RI", "OOA", "OBP", "HBB", "SB2", "SB3", "SB4", "SB4u", "AD1", "AD2", "AD3", "DI2", "DI3", "CS2AD3", "CS2AD4", "CS2AD4u", "CS3AD4", "CS3AD4u", "SB2E2", "SB2E3", "SB2E4", "SB3E4", "SB2E4E", "SB3E4E", "SB2AD3", "SB2AD4", "SB2AD4u", "SB3AD4", "SB3AD4u", "CK", "PO", "POCSC", "ERN", "eRN", "ERNu", "eRNu", "URN", "uRN", "PITCHER_SUBSTITUTION", "PINCH_HITTING_SUBSTITUTION", "PINCH_RUNNING_SUBSTITUTION", "DEFENSIVE_SUBSTITUTION", "DEFENSIVE_SWITCH"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return PlayerHand.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return PlayerHand.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(BaseballRunner$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ BaseballPitch copy$default(BaseballPitch baseballPitch, Player player, Team team, Player player2, Team team2, BaseballPitchType baseballPitchType, String str, String str2, Double d, BaseballActionOutcome baseballActionOutcome, Integer num, Integer num2, Integer num3, Float f, Float f2, Float f3, Float f4, Integer num4, Integer num5, Integer num6, Integer num7, PlayerHand playerHand, PlayerHand playerHand2, List list, int i, Object obj) {
        List list2;
        PlayerHand playerHand3;
        Player player3 = (i & 1) != 0 ? baseballPitch.pitcher : player;
        Team team3 = (i & 2) != 0 ? baseballPitch.pitcherTeam : team;
        Player player4 = (i & 4) != 0 ? baseballPitch.hitter : player2;
        Team team4 = (i & 8) != 0 ? baseballPitch.hitterTeam : team2;
        BaseballPitchType baseballPitchType2 = (i & 16) != 0 ? baseballPitch.pitchCode : baseballPitchType;
        String str3 = (i & 32) != 0 ? baseballPitch.pitchDescription : str;
        String str4 = (i & 64) != 0 ? baseballPitch.type : str2;
        Double d2 = (i & 128) != 0 ? baseballPitch.pitchSpeed : d;
        BaseballActionOutcome baseballActionOutcome2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? baseballPitch.outcome : baseballActionOutcome;
        Integer num8 = (i & 512) != 0 ? baseballPitch.pitchCount : num;
        Integer num9 = (i & 1024) != 0 ? baseballPitch.pitchX : num2;
        Integer num10 = (i & a.o) != 0 ? baseballPitch.pitchY : num3;
        Float f5 = (i & 4096) != 0 ? baseballPitch.mlbX : f;
        Float f6 = (i & 8192) != 0 ? baseballPitch.mlbY : f2;
        Player player5 = player3;
        Float f7 = (i & 16384) != 0 ? baseballPitch.mlbHitCordX : f3;
        Float f8 = (i & 32768) != 0 ? baseballPitch.mlbHitCordY : f4;
        Integer num11 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? baseballPitch.mlbZone : num4;
        Integer num12 = (i & 131072) != 0 ? baseballPitch.balls : num5;
        Integer num13 = (i & 262144) != 0 ? baseballPitch.strikes : num6;
        Integer num14 = (i & 524288) != 0 ? baseballPitch.outs : num7;
        PlayerHand playerHand4 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? baseballPitch.pitcherHand : playerHand;
        PlayerHand playerHand5 = (i & 2097152) != 0 ? baseballPitch.hitterHand : playerHand2;
        if ((i & 4194304) != 0) {
            playerHand3 = playerHand5;
            list2 = baseballPitch.runners;
        } else {
            list2 = list;
            playerHand3 = playerHand5;
        }
        return baseballPitch.copy(player5, team3, player4, team4, baseballPitchType2, str3, str4, d2, baseballActionOutcome2, num8, num9, num10, f5, f6, f7, f8, num11, num12, num13, num14, playerHand4, playerHand3, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballPitch self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        output.h(serialDesc, 0, player$$serializer, self.pitcher);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.pitcherTeam);
        output.h(serialDesc, 2, player$$serializer, self.hitter);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.hitterTeam);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.pitchCode);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 5, uhiVar, self.pitchDescription);
        output.h(serialDesc, 6, uhiVar, self.type);
        output.h(serialDesc, 7, h75.a, self.pitchSpeed);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.outcome);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 9, a7aVar, self.pitchCount);
        output.h(serialDesc, 10, a7aVar, self.pitchX);
        output.h(serialDesc, 11, a7aVar, self.pitchY);
        if (output.o(serialDesc) || self.mlbX != null) {
            output.h(serialDesc, 12, c88.a, self.mlbX);
        }
        if (output.o(serialDesc) || self.mlbY != null) {
            output.h(serialDesc, 13, c88.a, self.mlbY);
        }
        if (output.o(serialDesc) || self.mlbHitCordX != null) {
            output.h(serialDesc, 14, c88.a, self.mlbHitCordX);
        }
        if (output.o(serialDesc) || self.mlbHitCordY != null) {
            output.h(serialDesc, 15, c88.a, self.mlbHitCordY);
        }
        if (output.o(serialDesc) || self.mlbZone != null) {
            output.h(serialDesc, 16, a7aVar, self.mlbZone);
        }
        output.h(serialDesc, 17, a7aVar, self.balls);
        output.h(serialDesc, 18, a7aVar, self.strikes);
        output.h(serialDesc, 19, a7aVar, self.outs);
        output.h(serialDesc, 20, (KSerializer) joaVarArr[20].getValue(), self.pitcherHand);
        output.h(serialDesc, 21, (KSerializer) joaVarArr[21].getValue(), self.hitterHand);
        output.h(serialDesc, 22, (KSerializer) joaVarArr[22].getValue(), self.runners);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Player getPitcher() {
        return this.pitcher;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getPitchCount() {
        return this.pitchCount;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getPitchX() {
        return this.pitchX;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getPitchY() {
        return this.pitchY;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Float getMlbX() {
        return this.mlbX;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Float getMlbY() {
        return this.mlbY;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Float getMlbHitCordX() {
        return this.mlbHitCordX;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Float getMlbHitCordY() {
        return this.mlbHitCordY;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getMlbZone() {
        return this.mlbZone;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getBalls() {
        return this.balls;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getStrikes() {
        return this.strikes;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Team getPitcherTeam() {
        return this.pitcherTeam;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getOuts() {
        return this.outs;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final PlayerHand getPitcherHand() {
        return this.pitcherHand;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final PlayerHand getHitterHand() {
        return this.hitterHand;
    }

    @Nullable
    public final List<BaseballRunner> component23() {
        return this.runners;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Player getHitter() {
        return this.hitter;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Team getHitterTeam() {
        return this.hitterTeam;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final BaseballPitchType getPitchCode() {
        return this.pitchCode;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getPitchDescription() {
        return this.pitchDescription;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getPitchSpeed() {
        return this.pitchSpeed;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final BaseballActionOutcome getOutcome() {
        return this.outcome;
    }

    @NotNull
    public final BaseballPitch copy(@Nullable Player pitcher, @Nullable Team pitcherTeam, @Nullable Player hitter, @Nullable Team hitterTeam, @Nullable BaseballPitchType pitchCode, @Nullable String pitchDescription, @Nullable String type, @Nullable Double pitchSpeed, @Nullable BaseballActionOutcome outcome, @Nullable Integer pitchCount, @Nullable Integer pitchX, @Nullable Integer pitchY, @Nullable Float mlbX, @Nullable Float mlbY, @Nullable Float mlbHitCordX, @Nullable Float mlbHitCordY, @Nullable Integer mlbZone, @Nullable Integer balls, @Nullable Integer strikes, @Nullable Integer outs, @Nullable PlayerHand pitcherHand, @Nullable PlayerHand hitterHand, @Nullable List<BaseballRunner> runners) {
        return new BaseballPitch(pitcher, pitcherTeam, hitter, hitterTeam, pitchCode, pitchDescription, type, pitchSpeed, outcome, pitchCount, pitchX, pitchY, mlbX, mlbY, mlbHitCordX, mlbHitCordY, mlbZone, balls, strikes, outs, pitcherHand, hitterHand, runners);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballPitch)) {
            return false;
        }
        BaseballPitch baseballPitch = (BaseballPitch) other;
        return Intrinsics.c(this.pitcher, baseballPitch.pitcher) && Intrinsics.c(this.pitcherTeam, baseballPitch.pitcherTeam) && Intrinsics.c(this.hitter, baseballPitch.hitter) && Intrinsics.c(this.hitterTeam, baseballPitch.hitterTeam) && this.pitchCode == baseballPitch.pitchCode && Intrinsics.c(this.pitchDescription, baseballPitch.pitchDescription) && Intrinsics.c(this.type, baseballPitch.type) && Intrinsics.c(this.pitchSpeed, baseballPitch.pitchSpeed) && this.outcome == baseballPitch.outcome && Intrinsics.c(this.pitchCount, baseballPitch.pitchCount) && Intrinsics.c(this.pitchX, baseballPitch.pitchX) && Intrinsics.c(this.pitchY, baseballPitch.pitchY) && Intrinsics.c(this.mlbX, baseballPitch.mlbX) && Intrinsics.c(this.mlbY, baseballPitch.mlbY) && Intrinsics.c(this.mlbHitCordX, baseballPitch.mlbHitCordX) && Intrinsics.c(this.mlbHitCordY, baseballPitch.mlbHitCordY) && Intrinsics.c(this.mlbZone, baseballPitch.mlbZone) && Intrinsics.c(this.balls, baseballPitch.balls) && Intrinsics.c(this.strikes, baseballPitch.strikes) && Intrinsics.c(this.outs, baseballPitch.outs) && this.pitcherHand == baseballPitch.pitcherHand && this.hitterHand == baseballPitch.hitterHand && Intrinsics.c(this.runners, baseballPitch.runners);
    }

    @Nullable
    public final Integer getBalls() {
        return this.balls;
    }

    @Nullable
    public final Player getHitter() {
        return this.hitter;
    }

    @Nullable
    public final PlayerHand getHitterHand() {
        return this.hitterHand;
    }

    @Nullable
    public final Team getHitterTeam() {
        return this.hitterTeam;
    }

    @Nullable
    public final Float getMlbHitCordX() {
        return this.mlbHitCordX;
    }

    @Nullable
    public final Float getMlbHitCordY() {
        return this.mlbHitCordY;
    }

    @Nullable
    public final Float getMlbX() {
        return this.mlbX;
    }

    @Nullable
    public final Float getMlbY() {
        return this.mlbY;
    }

    @Nullable
    public final Integer getMlbZone() {
        return this.mlbZone;
    }

    @Nullable
    public final BaseballActionOutcome getOutcome() {
        return this.outcome;
    }

    @Nullable
    public final Integer getOuts() {
        return this.outs;
    }

    @Nullable
    public final BaseballPitchType getPitchCode() {
        return this.pitchCode;
    }

    @Nullable
    public final Integer getPitchCount() {
        return this.pitchCount;
    }

    @Nullable
    public final String getPitchDescription() {
        return this.pitchDescription;
    }

    @Nullable
    public final Double getPitchSpeed() {
        return this.pitchSpeed;
    }

    @Nullable
    public final Integer getPitchX() {
        return this.pitchX;
    }

    @Nullable
    public final Integer getPitchY() {
        return this.pitchY;
    }

    @Nullable
    public final Player getPitcher() {
        return this.pitcher;
    }

    @Nullable
    public final PlayerHand getPitcherHand() {
        return this.pitcherHand;
    }

    @Nullable
    public final Team getPitcherTeam() {
        return this.pitcherTeam;
    }

    @Nullable
    public final List<BaseballRunner> getRunners() {
        return this.runners;
    }

    @Nullable
    public final Integer getStrikes() {
        return this.strikes;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Player player = this.pitcher;
        int hashCode = (player == null ? 0 : player.hashCode()) * 31;
        Team team = this.pitcherTeam;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Player player2 = this.hitter;
        int hashCode3 = (hashCode2 + (player2 == null ? 0 : player2.hashCode())) * 31;
        Team team2 = this.hitterTeam;
        int hashCode4 = (hashCode3 + (team2 == null ? 0 : team2.hashCode())) * 31;
        BaseballPitchType baseballPitchType = this.pitchCode;
        int hashCode5 = (hashCode4 + (baseballPitchType == null ? 0 : baseballPitchType.hashCode())) * 31;
        String str = this.pitchDescription;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.pitchSpeed;
        int hashCode8 = (hashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        BaseballActionOutcome baseballActionOutcome = this.outcome;
        int hashCode9 = (hashCode8 + (baseballActionOutcome == null ? 0 : baseballActionOutcome.hashCode())) * 31;
        Integer num = this.pitchCount;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pitchX;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pitchY;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.mlbX;
        int hashCode13 = (hashCode12 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.mlbY;
        int hashCode14 = (hashCode13 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.mlbHitCordX;
        int hashCode15 = (hashCode14 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.mlbHitCordY;
        int hashCode16 = (hashCode15 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num4 = this.mlbZone;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.balls;
        int hashCode18 = (hashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.strikes;
        int hashCode19 = (hashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.outs;
        int hashCode20 = (hashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        PlayerHand playerHand = this.pitcherHand;
        int hashCode21 = (hashCode20 + (playerHand == null ? 0 : playerHand.hashCode())) * 31;
        PlayerHand playerHand2 = this.hitterHand;
        int hashCode22 = (hashCode21 + (playerHand2 == null ? 0 : playerHand2.hashCode())) * 31;
        List<BaseballRunner> list = this.runners;
        return hashCode22 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isPitch() {
        return Intrinsics.c(this.type, "pitch");
    }

    @NotNull
    public String toString() {
        Player player = this.pitcher;
        Team team = this.pitcherTeam;
        Player player2 = this.hitter;
        Team team2 = this.hitterTeam;
        BaseballPitchType baseballPitchType = this.pitchCode;
        String str = this.pitchDescription;
        String str2 = this.type;
        Double d = this.pitchSpeed;
        BaseballActionOutcome baseballActionOutcome = this.outcome;
        Integer num = this.pitchCount;
        Integer num2 = this.pitchX;
        Integer num3 = this.pitchY;
        Float f = this.mlbX;
        Float f2 = this.mlbY;
        Float f3 = this.mlbHitCordX;
        Float f4 = this.mlbHitCordY;
        Integer num4 = this.mlbZone;
        Integer num5 = this.balls;
        Integer num6 = this.strikes;
        Integer num7 = this.outs;
        PlayerHand playerHand = this.pitcherHand;
        PlayerHand playerHand2 = this.hitterHand;
        List<BaseballRunner> list = this.runners;
        StringBuilder sb = new StringBuilder("BaseballPitch(pitcher=");
        sb.append(player);
        sb.append(", pitcherTeam=");
        sb.append(team);
        sb.append(", hitter=");
        sb.append(player2);
        sb.append(", hitterTeam=");
        sb.append(team2);
        sb.append(", pitchCode=");
        sb.append(baseballPitchType);
        sb.append(", pitchDescription=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", pitchSpeed=");
        sb.append(d);
        sb.append(", outcome=");
        sb.append(baseballActionOutcome);
        sb.append(", pitchCount=");
        sb.append(num);
        sb.append(", pitchX=");
        vxd.r(num2, num3, ", pitchY=", ", mlbX=", sb);
        sb.append(f);
        sb.append(", mlbY=");
        sb.append(f2);
        sb.append(", mlbHitCordX=");
        sb.append(f3);
        sb.append(", mlbHitCordY=");
        sb.append(f4);
        sb.append(", mlbZone=");
        vxd.r(num4, num5, ", balls=", ", strikes=", sb);
        vxd.r(num6, num7, ", outs=", ", pitcherHand=", sb);
        sb.append(playerHand);
        sb.append(", hitterHand=");
        sb.append(playerHand2);
        sb.append(", runners=");
        return mz1.p(sb, list, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/BaseballPitch$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/BaseballPitch;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballPitch$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BaseballPitch(@Nullable Player player, @Nullable Team team, @Nullable Player player2, @Nullable Team team2, @Nullable BaseballPitchType baseballPitchType, @Nullable String str, @Nullable String str2, @Nullable Double d, @Nullable BaseballActionOutcome baseballActionOutcome, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable PlayerHand playerHand, @Nullable PlayerHand playerHand2, @Nullable List<BaseballRunner> list) {
        this.pitcher = player;
        this.pitcherTeam = team;
        this.hitter = player2;
        this.hitterTeam = team2;
        this.pitchCode = baseballPitchType;
        this.pitchDescription = str;
        this.type = str2;
        this.pitchSpeed = d;
        this.outcome = baseballActionOutcome;
        this.pitchCount = num;
        this.pitchX = num2;
        this.pitchY = num3;
        this.mlbX = f;
        this.mlbY = f2;
        this.mlbHitCordX = f3;
        this.mlbHitCordY = f4;
        this.mlbZone = num4;
        this.balls = num5;
        this.strikes = num6;
        this.outs = num7;
        this.pitcherHand = playerHand;
        this.hitterHand = playerHand2;
        this.runners = list;
    }

    public /* synthetic */ BaseballPitch(Player player, Team team, Player player2, Team team2, BaseballPitchType baseballPitchType, String str, String str2, Double d, BaseballActionOutcome baseballActionOutcome, Integer num, Integer num2, Integer num3, Float f, Float f2, Float f3, Float f4, Integer num4, Integer num5, Integer num6, Integer num7, PlayerHand playerHand, PlayerHand playerHand2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(player, team, player2, team2, baseballPitchType, str, str2, d, baseballActionOutcome, num, num2, num3, (i & 4096) != 0 ? null : f, (i & 8192) != 0 ? null : f2, (i & 16384) != 0 ? null : f3, (32768 & i) != 0 ? null : f4, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : num4, num5, num6, num7, playerHand, playerHand2, list);
    }
}
