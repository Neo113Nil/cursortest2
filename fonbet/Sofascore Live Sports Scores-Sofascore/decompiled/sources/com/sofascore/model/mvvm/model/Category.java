package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.network.response.SearchResponseKt;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.duf;
import defpackage.joa;
import defpackage.oea;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wl2;
import defpackage.wx4;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\b\u0087\b\u0018\u0000 \u0090\u00012\u00020\u0001:\u0004\u0091\u0001\u0090\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013B3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015Bµ\u0002\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020#\u0012\u0006\u0010+\u001a\u00020#\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b\u0012\u0010/J\u0015\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0002¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u0002002\u0006\u00105\u001a\u00020\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0000¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u00104J\u0010\u0010;\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b=\u0010<J\u0010\u0010>\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b>\u0010<J\u0012\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b?\u0010<J\u0010\u0010@\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0084\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bJ\u0010<J\u0010\u0010K\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bK\u00104J\u001a\u0010M\u001a\u00020#2\b\u0010L\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\bO\u0010EJ'\u0010W\u001a\u0002002\u0006\u0010P\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0001¢\u0006\u0004\bU\u0010VR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010X\u001a\u0004\bY\u00104\"\u0004\bZ\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010[\u001a\u0004\b\\\u0010<\"\u0004\b]\u0010^R(\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010[\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010<\"\u0004\b`\u0010^R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010[\u001a\u0004\bc\u0010<\"\u0004\bd\u0010^R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010[\u001a\u0004\be\u0010<R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010f\u001a\u0004\bg\u0010AR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010hR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010i\u001a\u0004\bj\u0010CR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010h\u001a\u0004\bk\u0010ER\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010l\u001a\u0004\bm\u0010GR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010X\u001a\u0004\bs\u00104\"\u0004\bt\u00102R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010X\u001a\u0004\bu\u00104\"\u0004\bv\u00102R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010l\u001a\u0004\bw\u0010G\"\u0004\bx\u0010yR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010l\u001a\u0004\bz\u0010G\"\u0004\b{\u0010yR*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010l\u001a\u0004\b|\u0010G\"\u0004\b}\u0010yR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010l\u001a\u0004\b~\u0010GR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010l\u001a\u0004\b\u007f\u0010GR'\u0010$\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b$\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010%\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b%\u0010\u0080\u0001\u001a\u0006\b\u0085\u0001\u0010\u0082\u0001\"\u0006\b\u0086\u0001\u0010\u0084\u0001R'\u0010&\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b&\u0010\u0080\u0001\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001\"\u0006\b\u0088\u0001\u0010\u0084\u0001R&\u0010'\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b'\u0010\u0080\u0001\u001a\u0005\b'\u0010\u0082\u0001\"\u0006\b\u0089\u0001\u0010\u0084\u0001R&\u0010(\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b(\u0010\u0080\u0001\u001a\u0005\b(\u0010\u0082\u0001\"\u0006\b\u008a\u0001\u0010\u0084\u0001R&\u0010)\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b)\u0010\u0080\u0001\u001a\u0005\b)\u0010\u0082\u0001\"\u0006\b\u008b\u0001\u0010\u0084\u0001R&\u0010*\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b*\u0010\u0080\u0001\u001a\u0005\b*\u0010\u0082\u0001\"\u0006\b\u008c\u0001\u0010\u0084\u0001R&\u0010+\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b+\u0010\u0080\u0001\u001a\u0005\b+\u0010\u0082\u0001\"\u0006\b\u008d\u0001\u0010\u0084\u0001R$\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b,\u0010X\u001a\u0005\b\u008e\u0001\u00104\"\u0005\b\u008f\u0001\u00102¨\u0006\u0092\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/Category;", "Ljava/io/Serializable;", "", "id", "", "slug", "name", "flag", "alpha2", "Lcom/sofascore/model/mvvm/model/Sport;", SearchResponseKt.SPORT_ENTITY, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "sportVariant", "", "Lcom/sofascore/model/mvvm/model/UniqueStage;", "uniqueStages", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/lang/Integer;Ljava/util/List;)V", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "(Ljava/lang/String;I)V", "seen0", "Lcom/sofascore/model/mvvm/model/CategoryType;", "type", "totalEvents", "liveEvents", "uniqueTournamentIds", "teamIds", "mccList", "", "", "events", "Lcom/sofascore/model/mvvm/model/CategoryTransferWindow;", "transferPeriod", "", "hasEventPlayerStatistics", "hasVideos", "expanded", "isDownloading", "isSection", "isPinnedSection", "isPopularSection", "isPopular", "remainingLeagues", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/lang/Integer;Ljava/util/List;Lcom/sofascore/model/mvvm/model/CategoryType;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZZZZZZILt5h;)V", "", "setPriority", "(I)V", "getPriority", "()I", "category", "update", "(Lcom/sofascore/model/mvvm/model/Category;)V", "toPopular", "()Lcom/sofascore/model/mvvm/model/Category;", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/sofascore/model/mvvm/model/Sport;", "component8", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "component9", "()Ljava/lang/Integer;", "component10", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Sport;Ljava/lang/Integer;Lcom/sofascore/model/mvvm/model/FieldTranslations;Ljava/lang/Integer;Ljava/util/List;)Lcom/sofascore/model/mvvm/model/Category;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "component7", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Category;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "setId", "Ljava/lang/String;", "getSlug", "setSlug", "(Ljava/lang/String;)V", "getName", "setName", "getName$annotations", "()V", "getFlag", "setFlag", "getAlpha2", "Lcom/sofascore/model/mvvm/model/Sport;", "getSport", "Ljava/lang/Integer;", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "getSportVariant", "Ljava/util/List;", "getUniqueStages", "Lcom/sofascore/model/mvvm/model/CategoryType;", "getType", "()Lcom/sofascore/model/mvvm/model/CategoryType;", "setType", "(Lcom/sofascore/model/mvvm/model/CategoryType;)V", "getTotalEvents", "setTotalEvents", "getLiveEvents", "setLiveEvents", "getUniqueTournamentIds", "setUniqueTournamentIds", "(Ljava/util/List;)V", "getTeamIds", "setTeamIds", "getMccList", "setMccList", "getEvents", "getTransferPeriod", "Z", "getHasEventPlayerStatistics", "()Z", "setHasEventPlayerStatistics", "(Z)V", "getHasVideos", "setHasVideos", "getExpanded", "setExpanded", "setDownloading", "setSection", "setPinnedSection", "setPopularSection", "setPopular", "getRemainingLeagues", "setRemainingLeagues", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Category implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String alpha2;

    @NotNull
    private final List<Object> events;
    private boolean expanded;

    @Nullable
    private final FieldTranslations fieldTranslations;

    @NotNull
    private String flag;
    private boolean hasEventPlayerStatistics;
    private boolean hasVideos;
    private int id;
    private boolean isDownloading;
    private boolean isPinnedSection;
    private boolean isPopular;
    private boolean isPopularSection;
    private boolean isSection;
    private int liveEvents;

    @Nullable
    private List<Integer> mccList;

    @NotNull
    private String name;

    @Nullable
    private Integer priority;
    private int remainingLeagues;

    @NotNull
    private String slug;

    @NotNull
    private final Sport sport;

    @Nullable
    private final Integer sportVariant;

    @Nullable
    private List<Integer> teamIds;
    private int totalEvents;

    @Nullable
    private final List<CategoryTransferWindow> transferPeriod;

    @Nullable
    private CategoryType type;

    @Nullable
    private final List<UniqueStage> uniqueStages;

    @Nullable
    private List<Integer> uniqueTournamentIds;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new wl2(1)), ypa.a(ysaVar, new wl2(2)), null, null, ypa.a(ysaVar, new wl2(3)), ypa.a(ysaVar, new wl2(4)), ypa.a(ysaVar, new wl2(5)), ypa.a(ysaVar, new wl2(6)), ypa.a(ysaVar, new wl2(7)), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Category(int i, int i2, String str, String str2, String str3, String str4, Sport sport, Integer num, FieldTranslations fieldTranslations, Integer num2, List list, CategoryType categoryType, int i3, int i4, List list2, List list3, List list4, List list5, List list6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i5, t5h t5hVar) {
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, Category$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.slug = str;
        this.name = str2;
        this.flag = str3;
        this.alpha2 = str4;
        this.sport = sport;
        this.priority = num;
        this.fieldTranslations = fieldTranslations;
        this.sportVariant = num2;
        this.uniqueStages = list;
        if ((i & 1024) == 0) {
            this.type = null;
        } else {
            this.type = categoryType;
        }
        if ((i & a.o) == 0) {
            this.totalEvents = 0;
        } else {
            this.totalEvents = i3;
        }
        if ((i & 4096) == 0) {
            this.liveEvents = 0;
        } else {
            this.liveEvents = i4;
        }
        if ((i & 8192) == 0) {
            this.uniqueTournamentIds = null;
        } else {
            this.uniqueTournamentIds = list2;
        }
        if ((i & 16384) == 0) {
            this.teamIds = null;
        } else {
            this.teamIds = list3;
        }
        if ((32768 & i) == 0) {
            this.mccList = null;
        } else {
            this.mccList = list4;
        }
        this.events = (65536 & i) == 0 ? new ArrayList() : list5;
        if ((131072 & i) == 0) {
            this.transferPeriod = null;
        } else {
            this.transferPeriod = list6;
        }
        if ((262144 & i) == 0) {
            this.hasEventPlayerStatistics = false;
        } else {
            this.hasEventPlayerStatistics = z;
        }
        if ((524288 & i) == 0) {
            this.hasVideos = false;
        } else {
            this.hasVideos = z2;
        }
        if ((1048576 & i) == 0) {
            this.expanded = false;
        } else {
            this.expanded = z3;
        }
        if ((2097152 & i) == 0) {
            this.isDownloading = false;
        } else {
            this.isDownloading = z4;
        }
        if ((4194304 & i) == 0) {
            this.isSection = false;
        } else {
            this.isSection = z5;
        }
        if ((8388608 & i) == 0) {
            this.isPinnedSection = false;
        } else {
            this.isPinnedSection = z6;
        }
        if ((16777216 & i) == 0) {
            this.isPopularSection = false;
        } else {
            this.isPopularSection = z7;
        }
        if ((33554432 & i) == 0) {
            this.isPopular = false;
        } else {
            this.isPopular = z8;
        }
        if ((i & 67108864) == 0) {
            this.remainingLeagues = 0;
        } else {
            this.remainingLeagues = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(UniqueStage$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        CategoryType[] values = CategoryType.values();
        values.getClass();
        return new qq3("com.sofascore.model.mvvm.model.CategoryType", (Enum[]) values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(new qq3(duf.a.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(CategoryTransferWindow$$serializer.INSTANCE, 0);
    }

    /* renamed from: component7, reason: from getter */
    private final Integer getPriority() {
        return this.priority;
    }

    public static /* synthetic */ Category copy$default(Category category, int i, String str, String str2, String str3, String str4, Sport sport, Integer num, FieldTranslations fieldTranslations, Integer num2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = category.id;
        }
        if ((i2 & 2) != 0) {
            str = category.slug;
        }
        if ((i2 & 4) != 0) {
            str2 = category.name;
        }
        if ((i2 & 8) != 0) {
            str3 = category.flag;
        }
        if ((i2 & 16) != 0) {
            str4 = category.alpha2;
        }
        if ((i2 & 32) != 0) {
            sport = category.sport;
        }
        if ((i2 & 64) != 0) {
            num = category.priority;
        }
        if ((i2 & 128) != 0) {
            fieldTranslations = category.fieldTranslations;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num2 = category.sportVariant;
        }
        if ((i2 & 512) != 0) {
            list = category.uniqueStages;
        }
        Integer num3 = num2;
        List list2 = list;
        Integer num4 = num;
        FieldTranslations fieldTranslations2 = fieldTranslations;
        String str5 = str4;
        Sport sport2 = sport;
        return category.copy(i, str, str2, str3, str5, sport2, num4, fieldTranslations2, num3, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(Category self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.slug);
        output.y(serialDesc, 2, self.name);
        output.y(serialDesc, 3, self.flag);
        output.h(serialDesc, 4, uhi.a, self.alpha2);
        output.f(serialDesc, 5, Sport$$serializer.INSTANCE, self.sport);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 6, a7aVar, self.priority);
        output.h(serialDesc, 7, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
        output.h(serialDesc, 8, a7aVar, self.sportVariant);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.uniqueStages);
        if (output.o(serialDesc) || self.type != null) {
            output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.type);
        }
        if (output.o(serialDesc) || self.totalEvents != 0) {
            output.u(11, self.totalEvents, serialDesc);
        }
        if (output.o(serialDesc) || self.liveEvents != 0) {
            output.u(12, self.liveEvents, serialDesc);
        }
        if (output.o(serialDesc) || self.uniqueTournamentIds != null) {
            output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.uniqueTournamentIds);
        }
        if (output.o(serialDesc) || self.teamIds != null) {
            output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.teamIds);
        }
        if (output.o(serialDesc) || self.mccList != null) {
            output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.mccList);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.events, new ArrayList())) {
            output.f(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.events);
        }
        if (output.o(serialDesc) || self.transferPeriod != null) {
            output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.transferPeriod);
        }
        if (output.o(serialDesc) || self.hasEventPlayerStatistics) {
            output.x(serialDesc, 18, self.hasEventPlayerStatistics);
        }
        if (output.o(serialDesc) || self.hasVideos) {
            output.x(serialDesc, 19, self.hasVideos);
        }
        if (output.o(serialDesc) || self.expanded) {
            output.x(serialDesc, 20, self.expanded);
        }
        if (output.o(serialDesc) || self.isDownloading) {
            output.x(serialDesc, 21, self.isDownloading);
        }
        if (output.o(serialDesc) || self.isSection) {
            output.x(serialDesc, 22, self.isSection);
        }
        if (output.o(serialDesc) || self.isPinnedSection) {
            output.x(serialDesc, 23, self.isPinnedSection);
        }
        if (output.o(serialDesc) || self.isPopularSection) {
            output.x(serialDesc, 24, self.isPopularSection);
        }
        if (output.o(serialDesc) || self.isPopular) {
            output.x(serialDesc, 25, self.isPopular);
        }
        if (!output.o(serialDesc) && self.remainingLeagues == 0) {
            return;
        }
        output.u(26, self.remainingLeagues, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    public final List<UniqueStage> component10() {
        return this.uniqueStages;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getFlag() {
        return this.flag;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getAlpha2() {
        return this.alpha2;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getSportVariant() {
        return this.sportVariant;
    }

    @NotNull
    public final Category copy(int id, @NotNull String slug, @NotNull String name, @NotNull String flag, @Nullable String alpha2, @NotNull Sport sport, @Nullable Integer priority, @Nullable FieldTranslations fieldTranslations, @Nullable Integer sportVariant, @Nullable List<UniqueStage> uniqueStages) {
        slug.getClass();
        name.getClass();
        flag.getClass();
        sport.getClass();
        return new Category(id, slug, name, flag, alpha2, sport, priority, fieldTranslations, sportVariant, uniqueStages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Category)) {
            return false;
        }
        Category category = (Category) other;
        return this.id == category.id && Intrinsics.c(this.slug, category.slug) && Intrinsics.c(this.name, category.name) && Intrinsics.c(this.flag, category.flag) && Intrinsics.c(this.alpha2, category.alpha2) && Intrinsics.c(this.sport, category.sport) && Intrinsics.c(this.priority, category.priority) && Intrinsics.c(this.fieldTranslations, category.fieldTranslations) && Intrinsics.c(this.sportVariant, category.sportVariant) && Intrinsics.c(this.uniqueStages, category.uniqueStages);
    }

    @Nullable
    public final String getAlpha2() {
        return this.alpha2;
    }

    @NotNull
    public final List<Object> getEvents() {
        return this.events;
    }

    public final boolean getExpanded() {
        return this.expanded;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    @NotNull
    public final String getFlag() {
        return this.flag;
    }

    public final boolean getHasEventPlayerStatistics() {
        return this.hasEventPlayerStatistics;
    }

    public final boolean getHasVideos() {
        return this.hasVideos;
    }

    public final int getId() {
        return this.id;
    }

    public final int getLiveEvents() {
        return this.liveEvents;
    }

    @Nullable
    public final List<Integer> getMccList() {
        return this.mccList;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        Integer num = this.priority;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int getRemainingLeagues() {
        return this.remainingLeagues;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
    public final Integer getSportVariant() {
        return this.sportVariant;
    }

    @Nullable
    public final List<Integer> getTeamIds() {
        return this.teamIds;
    }

    public final int getTotalEvents() {
        return this.totalEvents;
    }

    @Nullable
    public final List<CategoryTransferWindow> getTransferPeriod() {
        return this.transferPeriod;
    }

    @Nullable
    public final CategoryType getType() {
        return this.type;
    }

    @Nullable
    public final List<UniqueStage> getUniqueStages() {
        return this.uniqueStages;
    }

    @Nullable
    public final List<Integer> getUniqueTournamentIds() {
        return this.uniqueTournamentIds;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.slug), 31, this.name), 31, this.flag);
        String str = this.alpha2;
        int hashCode = (this.sport.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.priority;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        int hashCode3 = (hashCode2 + (fieldTranslations == null ? 0 : fieldTranslations.hashCode())) * 31;
        Integer num2 = this.sportVariant;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UniqueStage> list = this.uniqueStages;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: isDownloading, reason: from getter */
    public final boolean getIsDownloading() {
        return this.isDownloading;
    }

    /* renamed from: isPinnedSection, reason: from getter */
    public final boolean getIsPinnedSection() {
        return this.isPinnedSection;
    }

    /* renamed from: isPopular, reason: from getter */
    public final boolean getIsPopular() {
        return this.isPopular;
    }

    /* renamed from: isPopularSection, reason: from getter */
    public final boolean getIsPopularSection() {
        return this.isPopularSection;
    }

    /* renamed from: isSection, reason: from getter */
    public final boolean getIsSection() {
        return this.isSection;
    }

    public final void setDownloading(boolean z) {
        this.isDownloading = z;
    }

    public final void setExpanded(boolean z) {
        this.expanded = z;
    }

    public final void setFlag(@NotNull String str) {
        str.getClass();
        this.flag = str;
    }

    public final void setHasEventPlayerStatistics(boolean z) {
        this.hasEventPlayerStatistics = z;
    }

    public final void setHasVideos(boolean z) {
        this.hasVideos = z;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setLiveEvents(int i) {
        this.liveEvents = i;
    }

    public final void setMccList(@Nullable List<Integer> list) {
        this.mccList = list;
    }

    public final void setName(@NotNull String str) {
        str.getClass();
        this.name = str;
    }

    public final void setPinnedSection(boolean z) {
        this.isPinnedSection = z;
    }

    public final void setPopular(boolean z) {
        this.isPopular = z;
    }

    public final void setPopularSection(boolean z) {
        this.isPopularSection = z;
    }

    public final void setPriority(int priority) {
        this.priority = Integer.valueOf(priority);
    }

    public final void setRemainingLeagues(int i) {
        this.remainingLeagues = i;
    }

    public final void setSection(boolean z) {
        this.isSection = z;
    }

    public final void setSlug(@NotNull String str) {
        str.getClass();
        this.slug = str;
    }

    public final void setTeamIds(@Nullable List<Integer> list) {
        this.teamIds = list;
    }

    public final void setTotalEvents(int i) {
        this.totalEvents = i;
    }

    public final void setType(@Nullable CategoryType categoryType) {
        this.type = categoryType;
    }

    public final void setUniqueTournamentIds(@Nullable List<Integer> list) {
        this.uniqueTournamentIds = list;
    }

    @NotNull
    public final Category toPopular() {
        Category copy$default = copy$default(this, 0, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        copy$default.isPopular = true;
        return copy$default;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.slug;
        String str2 = this.name;
        String str3 = this.flag;
        String str4 = this.alpha2;
        Sport sport = this.sport;
        Integer num = this.priority;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        Integer num2 = this.sportVariant;
        List<UniqueStage> list = this.uniqueStages;
        StringBuilder t = dmi.t(i, "Category(id=", ", slug=", str, ", name=");
        bf3.v(t, str2, ", flag=", str3, ", alpha2=");
        t.append(str4);
        t.append(", sport=");
        t.append(sport);
        t.append(", priority=");
        t.append(num);
        t.append(", fieldTranslations=");
        t.append(fieldTranslations);
        t.append(", sportVariant=");
        t.append(num2);
        t.append(", uniqueStages=");
        t.append(list);
        t.append(")");
        return t.toString();
    }

    public final void update(@NotNull Category category) {
        category.getClass();
        this.id = category.id;
        this.slug = category.slug;
        this.name = category.name;
        this.flag = category.flag;
        this.liveEvents = category.liveEvents;
        this.totalEvents = category.totalEvents;
        this.hasVideos = category.hasVideos;
        this.priority = category.priority;
        this.hasEventPlayerStatistics = category.hasEventPlayerStatistics;
        this.uniqueTournamentIds = category.uniqueTournamentIds;
        this.teamIds = category.teamIds;
        this.mccList = category.mccList;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Category$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Category;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Category$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Category(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull Sport sport, @Nullable Integer num, @Nullable FieldTranslations fieldTranslations, @Nullable Integer num2, @Nullable List<UniqueStage> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        sport.getClass();
        this.id = i;
        this.slug = str;
        this.name = str2;
        this.flag = str3;
        this.alpha2 = str4;
        this.sport = sport;
        this.priority = num;
        this.fieldTranslations = fieldTranslations;
        this.sportVariant = num2;
        this.uniqueStages = list;
        this.events = new ArrayList();
    }

    @wx4
    public static /* synthetic */ void getName$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Category(int i, @NotNull String str, @NotNull String str2, @NotNull Sport sport, @Nullable FieldTranslations fieldTranslations) {
        this(i, "", str, str2, null, sport, null, fieldTranslations, null, null);
        str.getClass();
        str2.getClass();
        sport.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Category(@NotNull String str, int i) {
        this(0, "", str, "", "", new Sport(), Integer.valueOf(i), null, null, null);
        str.getClass();
        this.isSection = true;
    }
}
