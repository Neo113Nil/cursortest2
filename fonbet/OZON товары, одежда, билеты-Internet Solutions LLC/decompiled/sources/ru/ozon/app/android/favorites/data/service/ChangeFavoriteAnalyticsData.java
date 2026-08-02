package ru.ozon.app.android.favorites.data.service;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/favorites/data/service/ChangeFavoriteAnalyticsData;", "", "Lru/ozon/tracker/sendEvent/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "cell", "<init>", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/sendEvent/Cell$CustomCell;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/tracker/sendEvent/ActionType;", "getActionType", "()Lru/ozon/tracker/sendEvent/ActionType;", "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "getCell", "()Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChangeFavoriteAnalyticsData {
    private final ActionType actionType;
    private final Cell.CustomCell cell;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeFavoriteAnalyticsData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeFavoriteAnalyticsData)) {
            return false;
        }
        ChangeFavoriteAnalyticsData changeFavoriteAnalyticsData = (ChangeFavoriteAnalyticsData) other;
        return Intrinsics.d(this.actionType, changeFavoriteAnalyticsData.actionType) && Intrinsics.d(this.cell, changeFavoriteAnalyticsData.cell);
    }

    public int hashCode() {
        ActionType actionType = this.actionType;
        int hashCode = (actionType == null ? 0 : actionType.hashCode()) * 31;
        Cell.CustomCell customCell = this.cell;
        return hashCode + (customCell != null ? customCell.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChangeFavoriteAnalyticsData(actionType=" + this.actionType + ", cell=" + this.cell + ")";
    }

    public ChangeFavoriteAnalyticsData(ActionType actionType, Cell.CustomCell customCell) {
        this.actionType = actionType;
        this.cell = customCell;
    }

    public /* synthetic */ ChangeFavoriteAnalyticsData(ActionType actionType, Cell.CustomCell customCell, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : actionType, (i11 & 2) != 0 ? null : customCell);
    }
}
