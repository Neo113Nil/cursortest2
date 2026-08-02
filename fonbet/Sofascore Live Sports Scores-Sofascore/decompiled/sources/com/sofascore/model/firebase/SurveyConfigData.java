package com.sofascore.model.firebase;

import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.egi;
import defpackage.gz1;
import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002Z[Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018BË\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010)J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010 J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010 J\u0012\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b2\u0010,JÞ\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u0010 J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001eJ\u001a\u00109\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010 R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bL\u0010$R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bM\u0010\"R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bN\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\bP\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010O\u001a\u0004\bQ\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bS\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bT\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bU\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bV\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bW\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bX\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bY\u0010,¨\u0006\\"}, d2 = {"Lcom/sofascore/model/firebase/SurveyConfigData;", "Ljava/io/Serializable;", "", "id", "", "url", "", "supportedCountries", "", "startTimestamp", "endTimestamp", "andPreconditions", "orPreconditions", "minDaysSinceInstall", "maxDaysSinceInstall", "", "mustBeLoggedIn", "usageStreakMinDays", "showAfterXSeconds", "showOnScreenName", "showOnTabName", "showOnSelectedSport", "openInBrowser", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Long;", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sofascore/model/firebase/SurveyConfigData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/SurveyConfigData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/String;", "getUrl", "Ljava/util/List;", "getSupportedCountries", "Ljava/lang/Long;", "getStartTimestamp", "getEndTimestamp", "getAndPreconditions", "getOrPreconditions", "Ljava/lang/Integer;", "getMinDaysSinceInstall", "getMaxDaysSinceInstall", "Ljava/lang/Boolean;", "getMustBeLoggedIn", "getUsageStreakMinDays", "getShowAfterXSeconds", "getShowOnScreenName", "getShowOnTabName", "getShowOnSelectedSport", "getOpenInBrowser", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SurveyConfigData implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SurveyConfigData mockSurvey;

    @Nullable
    private final List<Integer> andPreconditions;

    @Nullable
    private final Long endTimestamp;
    private final int id;

    @Nullable
    private final Integer maxDaysSinceInstall;

    @Nullable
    private final Integer minDaysSinceInstall;

    @Nullable
    private final Boolean mustBeLoggedIn;

    @Nullable
    private final Boolean openInBrowser;

    @Nullable
    private final List<Integer> orPreconditions;

    @Nullable
    private final Integer showAfterXSeconds;

    @Nullable
    private final String showOnScreenName;

    @Nullable
    private final String showOnSelectedSport;

    @Nullable
    private final String showOnTabName;

    @Nullable
    private final Long startTimestamp;

    @Nullable
    private final List<String> supportedCountries;

    @NotNull
    private final String url;

    @Nullable
    private final Integer usageStreakMinDays;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new egi(12)), null, null, ypa.a(ysaVar, new egi(13)), ypa.a(ysaVar, new egi(14)), null, null, null, null, null, null, null, null, null};
        mockSurvey = new SurveyConfigData(1, "https://www.sofascore.com", null, null, null, null, null, 0, Integer.MAX_VALUE, Boolean.FALSE, 0, 0, null, null, null, null);
    }

    public /* synthetic */ SurveyConfigData(int i, int i2, String str, List list, Long l, Long l2, List list2, List list3, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, String str2, String str3, String str4, Boolean bool2, t5h t5hVar) {
        if (65535 != (i & 65535)) {
            oea.z(i, 65535, SurveyConfigData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.url = str;
        this.supportedCountries = list;
        this.startTimestamp = l;
        this.endTimestamp = l2;
        this.andPreconditions = list2;
        this.orPreconditions = list3;
        this.minDaysSinceInstall = num;
        this.maxDaysSinceInstall = num2;
        this.mustBeLoggedIn = bool;
        this.usageStreakMinDays = num3;
        this.showAfterXSeconds = num4;
        this.showOnScreenName = str2;
        this.showOnTabName = str3;
        this.showOnSelectedSport = str4;
        this.openInBrowser = bool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(uhi.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(a7a.a, 0);
    }

    public static final /* synthetic */ void write$Self$model_release(SurveyConfigData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.url);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.supportedCountries);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 3, lkbVar, self.startTimestamp);
        output.h(serialDesc, 4, lkbVar, self.endTimestamp);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.andPreconditions);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.orPreconditions);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 7, a7aVar, self.minDaysSinceInstall);
        output.h(serialDesc, 8, a7aVar, self.maxDaysSinceInstall);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 9, gz1Var, self.mustBeLoggedIn);
        output.h(serialDesc, 10, a7aVar, self.usageStreakMinDays);
        output.h(serialDesc, 11, a7aVar, self.showAfterXSeconds);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 12, uhiVar, self.showOnScreenName);
        output.h(serialDesc, 13, uhiVar, self.showOnTabName);
        output.h(serialDesc, 14, uhiVar, self.showOnSelectedSport);
        output.h(serialDesc, 15, gz1Var, self.openInBrowser);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getMustBeLoggedIn() {
        return this.mustBeLoggedIn;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getUsageStreakMinDays() {
        return this.usageStreakMinDays;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getShowAfterXSeconds() {
        return this.showAfterXSeconds;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getShowOnScreenName() {
        return this.showOnScreenName;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getShowOnTabName() {
        return this.showOnTabName;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getShowOnSelectedSport() {
        return this.showOnSelectedSport;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getOpenInBrowser() {
        return this.openInBrowser;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final List<String> component3() {
        return this.supportedCountries;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final List<Integer> component6() {
        return this.andPreconditions;
    }

    @Nullable
    public final List<Integer> component7() {
        return this.orPreconditions;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getMinDaysSinceInstall() {
        return this.minDaysSinceInstall;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getMaxDaysSinceInstall() {
        return this.maxDaysSinceInstall;
    }

    @NotNull
    public final SurveyConfigData copy(int id, @NotNull String url, @Nullable List<String> supportedCountries, @Nullable Long startTimestamp, @Nullable Long endTimestamp, @Nullable List<Integer> andPreconditions, @Nullable List<Integer> orPreconditions, @Nullable Integer minDaysSinceInstall, @Nullable Integer maxDaysSinceInstall, @Nullable Boolean mustBeLoggedIn, @Nullable Integer usageStreakMinDays, @Nullable Integer showAfterXSeconds, @Nullable String showOnScreenName, @Nullable String showOnTabName, @Nullable String showOnSelectedSport, @Nullable Boolean openInBrowser) {
        url.getClass();
        return new SurveyConfigData(id, url, supportedCountries, startTimestamp, endTimestamp, andPreconditions, orPreconditions, minDaysSinceInstall, maxDaysSinceInstall, mustBeLoggedIn, usageStreakMinDays, showAfterXSeconds, showOnScreenName, showOnTabName, showOnSelectedSport, openInBrowser);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyConfigData)) {
            return false;
        }
        SurveyConfigData surveyConfigData = (SurveyConfigData) other;
        return this.id == surveyConfigData.id && Intrinsics.c(this.url, surveyConfigData.url) && Intrinsics.c(this.supportedCountries, surveyConfigData.supportedCountries) && Intrinsics.c(this.startTimestamp, surveyConfigData.startTimestamp) && Intrinsics.c(this.endTimestamp, surveyConfigData.endTimestamp) && Intrinsics.c(this.andPreconditions, surveyConfigData.andPreconditions) && Intrinsics.c(this.orPreconditions, surveyConfigData.orPreconditions) && Intrinsics.c(this.minDaysSinceInstall, surveyConfigData.minDaysSinceInstall) && Intrinsics.c(this.maxDaysSinceInstall, surveyConfigData.maxDaysSinceInstall) && Intrinsics.c(this.mustBeLoggedIn, surveyConfigData.mustBeLoggedIn) && Intrinsics.c(this.usageStreakMinDays, surveyConfigData.usageStreakMinDays) && Intrinsics.c(this.showAfterXSeconds, surveyConfigData.showAfterXSeconds) && Intrinsics.c(this.showOnScreenName, surveyConfigData.showOnScreenName) && Intrinsics.c(this.showOnTabName, surveyConfigData.showOnTabName) && Intrinsics.c(this.showOnSelectedSport, surveyConfigData.showOnSelectedSport) && Intrinsics.c(this.openInBrowser, surveyConfigData.openInBrowser);
    }

    @Nullable
    public final List<Integer> getAndPreconditions() {
        return this.andPreconditions;
    }

    @Nullable
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getMaxDaysSinceInstall() {
        return this.maxDaysSinceInstall;
    }

    @Nullable
    public final Integer getMinDaysSinceInstall() {
        return this.minDaysSinceInstall;
    }

    @Nullable
    public final Boolean getMustBeLoggedIn() {
        return this.mustBeLoggedIn;
    }

    @Nullable
    public final Boolean getOpenInBrowser() {
        return this.openInBrowser;
    }

    @Nullable
    public final List<Integer> getOrPreconditions() {
        return this.orPreconditions;
    }

    @Nullable
    public final Integer getShowAfterXSeconds() {
        return this.showAfterXSeconds;
    }

    @Nullable
    public final String getShowOnScreenName() {
        return this.showOnScreenName;
    }

    @Nullable
    public final String getShowOnSelectedSport() {
        return this.showOnSelectedSport;
    }

    @Nullable
    public final String getShowOnTabName() {
        return this.showOnTabName;
    }

    @Nullable
    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public final List<String> getSupportedCountries() {
        return this.supportedCountries;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getUsageStreakMinDays() {
        return this.usageStreakMinDays;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.url);
        List<String> list = this.supportedCountries;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.startTimestamp;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTimestamp;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<Integer> list2 = this.andPreconditions;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.orPreconditions;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.minDaysSinceInstall;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxDaysSinceInstall;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.mustBeLoggedIn;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.usageStreakMinDays;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.showAfterXSeconds;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.showOnScreenName;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.showOnTabName;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.showOnSelectedSport;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.openInBrowser;
        return hashCode13 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.url;
        List<String> list = this.supportedCountries;
        Long l = this.startTimestamp;
        Long l2 = this.endTimestamp;
        List<Integer> list2 = this.andPreconditions;
        List<Integer> list3 = this.orPreconditions;
        Integer num = this.minDaysSinceInstall;
        Integer num2 = this.maxDaysSinceInstall;
        Boolean bool = this.mustBeLoggedIn;
        Integer num3 = this.usageStreakMinDays;
        Integer num4 = this.showAfterXSeconds;
        String str2 = this.showOnScreenName;
        String str3 = this.showOnTabName;
        String str4 = this.showOnSelectedSport;
        Boolean bool2 = this.openInBrowser;
        StringBuilder t = dmi.t(i, "SurveyConfigData(id=", ", url=", str, ", supportedCountries=");
        t.append(list);
        t.append(", startTimestamp=");
        t.append(l);
        t.append(", endTimestamp=");
        t.append(l2);
        t.append(", andPreconditions=");
        t.append(list2);
        t.append(", orPreconditions=");
        t.append(list3);
        t.append(", minDaysSinceInstall=");
        t.append(num);
        t.append(", maxDaysSinceInstall=");
        vxd.v(t, num2, ", mustBeLoggedIn=", bool, ", usageStreakMinDays=");
        vxd.r(num3, num4, ", showAfterXSeconds=", ", showOnScreenName=", t);
        bf3.v(t, str2, ", showOnTabName=", str3, ", showOnSelectedSport=");
        t.append(str4);
        t.append(", openInBrowser=");
        t.append(bool2);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/sofascore/model/firebase/SurveyConfigData$Companion;", "", "<init>", "()V", "mockSurvey", "Lcom/sofascore/model/firebase/SurveyConfigData;", "getMockSurvey", "()Lcom/sofascore/model/firebase/SurveyConfigData;", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SurveyConfigData getMockSurvey() {
            return SurveyConfigData.mockSurvey;
        }

        @NotNull
        public final KSerializer serializer() {
            return SurveyConfigData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SurveyConfigData(int i, @NotNull String str, @Nullable List<String> list, @Nullable Long l, @Nullable Long l2, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2) {
        str.getClass();
        this.id = i;
        this.url = str;
        this.supportedCountries = list;
        this.startTimestamp = l;
        this.endTimestamp = l2;
        this.andPreconditions = list2;
        this.orPreconditions = list3;
        this.minDaysSinceInstall = num;
        this.maxDaysSinceInstall = num2;
        this.mustBeLoggedIn = bool;
        this.usageStreakMinDays = num3;
        this.showAfterXSeconds = num4;
        this.showOnScreenName = str2;
        this.showOnTabName = str3;
        this.showOnSelectedSport = str4;
        this.openInBrowser = bool2;
    }
}
