package com.sports.insider.data.room.general.table.predictions;

import androidx.annotation.Keep;
import d9.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/sports/insider/data/room/general/table/predictions/PredictionsKindTable;", "", "id", "", "idPrediction", "idKind", "<init>", "(III)V", "getId", "()I", "setId", "(I)V", "getIdPrediction", "setIdPrediction", "getIdKind", "setIdKind", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PredictionsKindTable {
    private int id;
    private int idKind;
    private int idPrediction;

    public PredictionsKindTable(int i5, int i10, int i11) {
        this.id = i5;
        this.idPrediction = i10;
        this.idKind = i11;
    }

    public static /* synthetic */ PredictionsKindTable copy$default(PredictionsKindTable predictionsKindTable, int i5, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i5 = predictionsKindTable.id;
        }
        if ((i12 & 2) != 0) {
            i10 = predictionsKindTable.idPrediction;
        }
        if ((i12 & 4) != 0) {
            i11 = predictionsKindTable.idKind;
        }
        return predictionsKindTable.copy(i5, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIdPrediction() {
        return this.idPrediction;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIdKind() {
        return this.idKind;
    }

    @NotNull
    public final PredictionsKindTable copy(int id2, int idPrediction, int idKind) {
        return new PredictionsKindTable(id2, idPrediction, idKind);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredictionsKindTable)) {
            return false;
        }
        PredictionsKindTable predictionsKindTable = (PredictionsKindTable) other;
        return this.id == predictionsKindTable.id && this.idPrediction == predictionsKindTable.idPrediction && this.idKind == predictionsKindTable.idKind;
    }

    public final int getId() {
        return this.id;
    }

    public final int getIdKind() {
        return this.idKind;
    }

    public final int getIdPrediction() {
        return this.idPrediction;
    }

    public int hashCode() {
        return (((this.id * 31) + this.idPrediction) * 31) + this.idKind;
    }

    public final void setId(int i5) {
        this.id = i5;
    }

    public final void setIdKind(int i5) {
        this.idKind = i5;
    }

    public final void setIdPrediction(int i5) {
        this.idPrediction = i5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PredictionsKindTable(id=");
        sb2.append(this.id);
        sb2.append(", idPrediction=");
        sb2.append(this.idPrediction);
        sb2.append(", idKind=");
        return e.i(sb2, this.idKind, ')');
    }
}
