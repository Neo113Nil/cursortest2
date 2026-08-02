package com.sports.insider.data.room.general.table.predictions;

import androidx.annotation.Keep;
import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/sports/insider/data/room/general/table/predictions/PredictionMeeting;", "", "id", "", "idPrediction", "jsonObject", "", "<init>", "(IILjava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getIdPrediction", "setIdPrediction", "getJsonObject", "()Ljava/lang/String;", "setJsonObject", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PredictionMeeting {
    private int id;
    private int idPrediction;

    @Nullable
    private String jsonObject;

    public PredictionMeeting(int i5, int i10, @Nullable String str) {
        this.id = i5;
        this.idPrediction = i10;
        this.jsonObject = str;
    }

    public static /* synthetic */ PredictionMeeting copy$default(PredictionMeeting predictionMeeting, int i5, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = predictionMeeting.id;
        }
        if ((i11 & 2) != 0) {
            i10 = predictionMeeting.idPrediction;
        }
        if ((i11 & 4) != 0) {
            str = predictionMeeting.jsonObject;
        }
        return predictionMeeting.copy(i5, i10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIdPrediction() {
        return this.idPrediction;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getJsonObject() {
        return this.jsonObject;
    }

    @NotNull
    public final PredictionMeeting copy(int id2, int idPrediction, @Nullable String jsonObject) {
        return new PredictionMeeting(id2, idPrediction, jsonObject);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredictionMeeting)) {
            return false;
        }
        PredictionMeeting predictionMeeting = (PredictionMeeting) other;
        return this.id == predictionMeeting.id && this.idPrediction == predictionMeeting.idPrediction && Intrinsics.areEqual(this.jsonObject, predictionMeeting.jsonObject);
    }

    public final int getId() {
        return this.id;
    }

    public final int getIdPrediction() {
        return this.idPrediction;
    }

    @Nullable
    public final String getJsonObject() {
        return this.jsonObject;
    }

    public int hashCode() {
        int i5 = ((this.id * 31) + this.idPrediction) * 31;
        String str = this.jsonObject;
        return i5 + (str == null ? 0 : str.hashCode());
    }

    public final void setId(int i5) {
        this.id = i5;
    }

    public final void setIdPrediction(int i5) {
        this.idPrediction = i5;
    }

    public final void setJsonObject(@Nullable String str) {
        this.jsonObject = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PredictionMeeting(id=");
        sb2.append(this.id);
        sb2.append(", idPrediction=");
        sb2.append(this.idPrediction);
        sb2.append(", jsonObject=");
        return e.k(sb2, this.jsonObject, ')');
    }
}
