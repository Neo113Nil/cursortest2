package com.sofascore.model.favorites;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageIds;
import com.sofascore.model.mvvm.model.StageType;
import defpackage.km5;
import defpackage.rm5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J)\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/sofascore/model/favorites/FavoritesStagesData;", "", "myStages", "", "Lcom/sofascore/model/mvvm/model/StageIds;", "uniqueStages", "", "", "<init>", "(Ljava/util/List;Ljava/util/Set;)V", "filteredStages", "populateEventType", "", "stage", "Lcom/sofascore/model/mvvm/model/Stage;", "areStagesFavorite", "stages", "isUniqueStageFavorite", "", "stageId", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FavoritesStagesData {

    @NotNull
    private final List<StageIds> filteredStages;

    @NotNull
    private final List<StageIds> myStages;

    @NotNull
    private final Set<Integer> uniqueStages;

    public FavoritesStagesData(@NotNull List<StageIds> list, @NotNull Set<Integer> set) {
        list.getClass();
        set.getClass();
        this.myStages = list;
        this.uniqueStages = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!CollectionsKt.R(this.uniqueStages, ((StageIds) obj).getUniqueStageId())) {
                arrayList.add(obj);
            }
        }
        this.filteredStages = arrayList;
    }

    private final List<StageIds> component1() {
        return this.myStages;
    }

    private final Set<Integer> component2() {
        return this.uniqueStages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoritesStagesData copy$default(FavoritesStagesData favoritesStagesData, List list, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            list = favoritesStagesData.myStages;
        }
        if ((i & 2) != 0) {
            set = favoritesStagesData.uniqueStages;
        }
        return favoritesStagesData.copy(list, set);
    }

    public final void areStagesFavorite(@NotNull List<Stage> stages) {
        stages.getClass();
        Iterator<T> it = stages.iterator();
        while (it.hasNext()) {
            populateEventType((Stage) it.next());
        }
    }

    @NotNull
    public final FavoritesStagesData copy(@NotNull List<StageIds> myStages, @NotNull Set<Integer> uniqueStages) {
        myStages.getClass();
        uniqueStages.getClass();
        return new FavoritesStagesData(myStages, uniqueStages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritesStagesData)) {
            return false;
        }
        FavoritesStagesData favoritesStagesData = (FavoritesStagesData) other;
        return Intrinsics.c(this.myStages, favoritesStagesData.myStages) && Intrinsics.c(this.uniqueStages, favoritesStagesData.uniqueStages);
    }

    public int hashCode() {
        return this.uniqueStages.hashCode() + (this.myStages.hashCode() * 31);
    }

    public final boolean isUniqueStageFavorite(int stageId) {
        return this.uniqueStages.contains(Integer.valueOf(stageId));
    }

    public final void populateEventType(@NotNull Stage stage) {
        Object obj;
        stage.getClass();
        HashSet<StageType> hashSet = new HashSet<>();
        List<StageIds> list = this.filteredStages;
        if (list == null || !list.isEmpty()) {
            for (StageIds stageIds : list) {
                if (stageIds.getId() != stage.getId()) {
                    Integer stageId = stageIds.getStageId();
                    int id = stage.getId();
                    if (stageId != null && stageId.intValue() == id) {
                    }
                }
                hashSet.add(StageType.MY_STAGE);
            }
        }
        if (CollectionsKt.R(this.uniqueStages, stage.getUniqueStageId())) {
            hashSet.add(StageType.MY_UNIQUE_STAGE);
        }
        Iterator<T> it = this.myStages.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            StageIds stageIds2 = (StageIds) obj;
            if (stageIds2.getId() == stage.getId() && Intrinsics.c(stageIds2.isMuted(), Boolean.TRUE)) {
                break;
            }
        }
        if (((StageIds) obj) != null) {
            hashSet.add(StageType.MUTED);
        }
        stage.setTypeList(hashSet);
    }

    @NotNull
    public String toString() {
        return "FavoritesStagesData(myStages=" + this.myStages + ", uniqueStages=" + this.uniqueStages + ")";
    }

    public FavoritesStagesData() {
        this(null, null, 3, null);
    }

    public FavoritesStagesData(List list, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? km5.a : list, (i & 2) != 0 ? rm5.a : set);
    }
}
