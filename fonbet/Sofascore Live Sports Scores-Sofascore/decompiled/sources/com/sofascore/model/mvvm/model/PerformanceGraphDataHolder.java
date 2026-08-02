package com.sofascore.model.mvvm.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/sofascore/model/mvvm/model/PerformanceGraphDataHolder;", "", "firstTeamData", "", "Lcom/sofascore/model/mvvm/model/PerformanceGraphData;", "secondTeamData", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFirstTeamData", "()Ljava/util/List;", "getSecondTeamData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PerformanceGraphDataHolder {

    @NotNull
    private final List<PerformanceGraphData> firstTeamData;

    @NotNull
    private final List<PerformanceGraphData> secondTeamData;

    public PerformanceGraphDataHolder(@NotNull List<PerformanceGraphData> list, @NotNull List<PerformanceGraphData> list2) {
        list.getClass();
        list2.getClass();
        this.firstTeamData = list;
        this.secondTeamData = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformanceGraphDataHolder copy$default(PerformanceGraphDataHolder performanceGraphDataHolder, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = performanceGraphDataHolder.firstTeamData;
        }
        if ((i & 2) != 0) {
            list2 = performanceGraphDataHolder.secondTeamData;
        }
        return performanceGraphDataHolder.copy(list, list2);
    }

    @NotNull
    public final List<PerformanceGraphData> component1() {
        return this.firstTeamData;
    }

    @NotNull
    public final List<PerformanceGraphData> component2() {
        return this.secondTeamData;
    }

    @NotNull
    public final PerformanceGraphDataHolder copy(@NotNull List<PerformanceGraphData> firstTeamData, @NotNull List<PerformanceGraphData> secondTeamData) {
        firstTeamData.getClass();
        secondTeamData.getClass();
        return new PerformanceGraphDataHolder(firstTeamData, secondTeamData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformanceGraphDataHolder)) {
            return false;
        }
        PerformanceGraphDataHolder performanceGraphDataHolder = (PerformanceGraphDataHolder) other;
        return Intrinsics.c(this.firstTeamData, performanceGraphDataHolder.firstTeamData) && Intrinsics.c(this.secondTeamData, performanceGraphDataHolder.secondTeamData);
    }

    @NotNull
    public final List<PerformanceGraphData> getFirstTeamData() {
        return this.firstTeamData;
    }

    @NotNull
    public final List<PerformanceGraphData> getSecondTeamData() {
        return this.secondTeamData;
    }

    public int hashCode() {
        return this.secondTeamData.hashCode() + (this.firstTeamData.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PerformanceGraphDataHolder(firstTeamData=" + this.firstTeamData + ", secondTeamData=" + this.secondTeamData + ")";
    }
}
