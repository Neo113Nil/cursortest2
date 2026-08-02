package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Category$$serializer;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wl2;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBm\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&Jn\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010&R\u0011\u0010=\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010?\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006B"}, d2 = {"Lcom/sofascore/model/newNetwork/CategoryWrapper;", "", "Lcom/sofascore/model/mvvm/model/Category;", "category", "", "totalEvents", "totalVideos", "totalEventPlayerStatistics", "", "uniqueTournamentIds", "teamIds", "Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;", "timezoneDetail", "<init>", "(Lcom/sofascore/model/mvvm/model/Category;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Category;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;Lt5h;)V", "component3", "()Ljava/lang/Integer;", "component4", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/CategoryWrapper;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Category;", "component2", "component5", "()Ljava/util/List;", "component6", "component7", "()Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;", "copy", "(Lcom/sofascore/model/mvvm/model/Category;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;)Lcom/sofascore/model/newNetwork/CategoryWrapper;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Category;", "getCategory", "Ljava/lang/Integer;", "getTotalEvents", "Ljava/util/List;", "getUniqueTournamentIds", "getTeamIds", "Lcom/sofascore/model/newNetwork/TimezoneEventsInfo;", "getTimezoneDetail", "getHasVideos", "()Z", "hasVideos", "getHasEventPlayerStatistics", "hasEventPlayerStatistics", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CategoryWrapper {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Category category;

    @Nullable
    private final List<Integer> teamIds;

    @Nullable
    private final TimezoneEventsInfo timezoneDetail;

    @Nullable
    private final Integer totalEventPlayerStatistics;

    @Nullable
    private final Integer totalEvents;

    @Nullable
    private final Integer totalVideos;

    @Nullable
    private final List<Integer> uniqueTournamentIds;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, ypa.a(ysaVar, new wl2(11)), ypa.a(ysaVar, new wl2(12)), null};
    }

    public /* synthetic */ CategoryWrapper(int i, Category category, Integer num, Integer num2, Integer num3, List list, List list2, TimezoneEventsInfo timezoneEventsInfo, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, CategoryWrapper$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.category = category;
        this.totalEvents = num;
        this.totalVideos = num2;
        this.totalEventPlayerStatistics = num3;
        this.uniqueTournamentIds = list;
        this.teamIds = list2;
        this.timezoneDetail = timezoneEventsInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    /* renamed from: component3, reason: from getter */
    private final Integer getTotalVideos() {
        return this.totalVideos;
    }

    /* renamed from: component4, reason: from getter */
    private final Integer getTotalEventPlayerStatistics() {
        return this.totalEventPlayerStatistics;
    }

    public static /* synthetic */ CategoryWrapper copy$default(CategoryWrapper categoryWrapper, Category category, Integer num, Integer num2, Integer num3, List list, List list2, TimezoneEventsInfo timezoneEventsInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            category = categoryWrapper.category;
        }
        if ((i & 2) != 0) {
            num = categoryWrapper.totalEvents;
        }
        if ((i & 4) != 0) {
            num2 = categoryWrapper.totalVideos;
        }
        if ((i & 8) != 0) {
            num3 = categoryWrapper.totalEventPlayerStatistics;
        }
        if ((i & 16) != 0) {
            list = categoryWrapper.uniqueTournamentIds;
        }
        if ((i & 32) != 0) {
            list2 = categoryWrapper.teamIds;
        }
        if ((i & 64) != 0) {
            timezoneEventsInfo = categoryWrapper.timezoneDetail;
        }
        List list3 = list2;
        TimezoneEventsInfo timezoneEventsInfo2 = timezoneEventsInfo;
        List list4 = list;
        Integer num4 = num2;
        return categoryWrapper.copy(category, num, num4, num3, list4, list3, timezoneEventsInfo2);
    }

    public static final /* synthetic */ void write$Self$model_release(CategoryWrapper self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Category$$serializer.INSTANCE, self.category);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.totalEvents);
        output.h(serialDesc, 2, a7aVar, self.totalVideos);
        output.h(serialDesc, 3, a7aVar, self.totalEventPlayerStatistics);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.uniqueTournamentIds);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.teamIds);
        output.h(serialDesc, 6, TimezoneEventsInfo$$serializer.INSTANCE, self.timezoneDetail);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTotalEvents() {
        return this.totalEvents;
    }

    @Nullable
    public final List<Integer> component5() {
        return this.uniqueTournamentIds;
    }

    @Nullable
    public final List<Integer> component6() {
        return this.teamIds;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final TimezoneEventsInfo getTimezoneDetail() {
        return this.timezoneDetail;
    }

    @NotNull
    public final CategoryWrapper copy(@NotNull Category category, @Nullable Integer totalEvents, @Nullable Integer totalVideos, @Nullable Integer totalEventPlayerStatistics, @Nullable List<Integer> uniqueTournamentIds, @Nullable List<Integer> teamIds, @Nullable TimezoneEventsInfo timezoneDetail) {
        category.getClass();
        return new CategoryWrapper(category, totalEvents, totalVideos, totalEventPlayerStatistics, uniqueTournamentIds, teamIds, timezoneDetail);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryWrapper)) {
            return false;
        }
        CategoryWrapper categoryWrapper = (CategoryWrapper) other;
        return Intrinsics.c(this.category, categoryWrapper.category) && Intrinsics.c(this.totalEvents, categoryWrapper.totalEvents) && Intrinsics.c(this.totalVideos, categoryWrapper.totalVideos) && Intrinsics.c(this.totalEventPlayerStatistics, categoryWrapper.totalEventPlayerStatistics) && Intrinsics.c(this.uniqueTournamentIds, categoryWrapper.uniqueTournamentIds) && Intrinsics.c(this.teamIds, categoryWrapper.teamIds) && Intrinsics.c(this.timezoneDetail, categoryWrapper.timezoneDetail);
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    public final boolean getHasEventPlayerStatistics() {
        Integer num = this.totalEventPlayerStatistics;
        return num != null && num.intValue() > 0;
    }

    public final boolean getHasVideos() {
        Integer num = this.totalVideos;
        return num != null && num.intValue() > 0;
    }

    @Nullable
    public final List<Integer> getTeamIds() {
        return this.teamIds;
    }

    @Nullable
    public final TimezoneEventsInfo getTimezoneDetail() {
        return this.timezoneDetail;
    }

    @Nullable
    public final Integer getTotalEvents() {
        return this.totalEvents;
    }

    @Nullable
    public final List<Integer> getUniqueTournamentIds() {
        return this.uniqueTournamentIds;
    }

    public int hashCode() {
        int hashCode = this.category.hashCode() * 31;
        Integer num = this.totalEvents;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalVideos;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalEventPlayerStatistics;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Integer> list = this.uniqueTournamentIds;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.teamIds;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TimezoneEventsInfo timezoneEventsInfo = this.timezoneDetail;
        return hashCode6 + (timezoneEventsInfo != null ? timezoneEventsInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Category category = this.category;
        Integer num = this.totalEvents;
        Integer num2 = this.totalVideos;
        Integer num3 = this.totalEventPlayerStatistics;
        List<Integer> list = this.uniqueTournamentIds;
        List<Integer> list2 = this.teamIds;
        TimezoneEventsInfo timezoneEventsInfo = this.timezoneDetail;
        StringBuilder sb = new StringBuilder("CategoryWrapper(category=");
        sb.append(category);
        sb.append(", totalEvents=");
        sb.append(num);
        sb.append(", totalVideos=");
        vxd.r(num2, num3, ", totalEventPlayerStatistics=", ", uniqueTournamentIds=", sb);
        vxd.w(sb, list, ", teamIds=", list2, ", timezoneDetail=");
        sb.append(timezoneEventsInfo);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/CategoryWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/CategoryWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CategoryWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CategoryWrapper(@NotNull Category category, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable TimezoneEventsInfo timezoneEventsInfo) {
        category.getClass();
        this.category = category;
        this.totalEvents = num;
        this.totalVideos = num2;
        this.totalEventPlayerStatistics = num3;
        this.uniqueTournamentIds = list;
        this.teamIds = list2;
        this.timezoneDetail = timezoneEventsInfo;
    }
}
