package com.sports.insider.data.room.general.table.predictions;

import androidx.annotation.Keep;
import d9.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/sports/insider/data/room/general/table/predictions/FavoriteTable;", "", "idPrediction", "", "<init>", "(I)V", "getIdPrediction", "()I", "setIdPrediction", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FavoriteTable {
    private int idPrediction;

    public FavoriteTable(int i5) {
        this.idPrediction = i5;
    }

    public static /* synthetic */ FavoriteTable copy$default(FavoriteTable favoriteTable, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i5 = favoriteTable.idPrediction;
        }
        return favoriteTable.copy(i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIdPrediction() {
        return this.idPrediction;
    }

    @NotNull
    public final FavoriteTable copy(int idPrediction) {
        return new FavoriteTable(idPrediction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FavoriteTable) && this.idPrediction == ((FavoriteTable) other).idPrediction;
    }

    public final int getIdPrediction() {
        return this.idPrediction;
    }

    public int hashCode() {
        return this.idPrediction;
    }

    public final void setIdPrediction(int i5) {
        this.idPrediction = i5;
    }

    @NotNull
    public String toString() {
        return e.i(new StringBuilder("FavoriteTable(idPrediction="), this.idPrediction, ')');
    }
}
