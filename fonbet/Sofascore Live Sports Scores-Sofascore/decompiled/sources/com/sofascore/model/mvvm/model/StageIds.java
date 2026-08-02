package com.sofascore.model.mvvm.model;

import defpackage.fc6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/mvvm/model/StageIds;", "", "id", "", "stageId", "uniqueStageId", "isMuted", "", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getId", "()I", "getStageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUniqueStageId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/sofascore/model/mvvm/model/StageIds;", "equals", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageIds {
    private final int id;

    @Nullable
    private final Boolean isMuted;

    @Nullable
    private final Integer stageId;

    @Nullable
    private final Integer uniqueStageId;

    public StageIds(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        this.id = i;
        this.stageId = num;
        this.uniqueStageId = num2;
        this.isMuted = bool;
    }

    public static /* synthetic */ StageIds copy$default(StageIds stageIds, int i, Integer num, Integer num2, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stageIds.id;
        }
        if ((i2 & 2) != 0) {
            num = stageIds.stageId;
        }
        if ((i2 & 4) != 0) {
            num2 = stageIds.uniqueStageId;
        }
        if ((i2 & 8) != 0) {
            bool = stageIds.isMuted;
        }
        return stageIds.copy(i, num, num2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getStageId() {
        return this.stageId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getUniqueStageId() {
        return this.uniqueStageId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsMuted() {
        return this.isMuted;
    }

    @NotNull
    public final StageIds copy(int id, @Nullable Integer stageId, @Nullable Integer uniqueStageId, @Nullable Boolean isMuted) {
        return new StageIds(id, stageId, uniqueStageId, isMuted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageIds)) {
            return false;
        }
        StageIds stageIds = (StageIds) other;
        return this.id == stageIds.id && Intrinsics.c(this.stageId, stageIds.stageId) && Intrinsics.c(this.uniqueStageId, stageIds.uniqueStageId) && Intrinsics.c(this.isMuted, stageIds.isMuted);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getStageId() {
        return this.stageId;
    }

    @Nullable
    public final Integer getUniqueStageId() {
        return this.uniqueStageId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.stageId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.uniqueStageId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isMuted;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isMuted() {
        return this.isMuted;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.stageId;
        Integer num2 = this.uniqueStageId;
        Boolean bool = this.isMuted;
        StringBuilder r = fc6.r("StageIds(id=", ", stageId=", ", uniqueStageId=", num, i);
        r.append(num2);
        r.append(", isMuted=");
        r.append(bool);
        r.append(")");
        return r.toString();
    }

    public /* synthetic */ StageIds(int i, Integer num, Integer num2, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, num2, (i2 & 8) != 0 ? Boolean.FALSE : bool);
    }
}
