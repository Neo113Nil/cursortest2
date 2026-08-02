package com.sports.insider.data.repository.room.metric;

import androidx.annotation.Keep;
import d9.e;
import hb.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001b¨\u0006$"}, d2 = {"Lcom/sports/insider/data/repository/room/metric/PushMetricsTable;", "", "", "id", PushMetricsTable.pushIdColumn, "type", "dateCreate", "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/sports/insider/data/repository/room/metric/PushMetricsTable;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "getPushId", "setPushId", "getType", "setType", "getDateCreate", "setDateCreate", "PushMetricsTableNamed", "hb/j", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PushMetricsTable {

    @NotNull
    public static final j PushMetricsTableNamed = new j();

    @NotNull
    public static final String dateCreateColumn = "dateCreate";

    @NotNull
    public static final String idColumn = "id";

    @NotNull
    public static final String pushIdColumn = "pushId";

    @NotNull
    public static final String tableName = "push_metrics_table";

    @NotNull
    public static final String typeColumn = "type";
    private int dateCreate;
    private int id;
    private int pushId;
    private int type;

    public PushMetricsTable(int i5, int i10, int i11, int i12) {
        this.id = i5;
        this.pushId = i10;
        this.type = i11;
        this.dateCreate = i12;
    }

    public static /* synthetic */ PushMetricsTable copy$default(PushMetricsTable pushMetricsTable, int i5, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i5 = pushMetricsTable.id;
        }
        if ((i13 & 2) != 0) {
            i10 = pushMetricsTable.pushId;
        }
        if ((i13 & 4) != 0) {
            i11 = pushMetricsTable.type;
        }
        if ((i13 & 8) != 0) {
            i12 = pushMetricsTable.dateCreate;
        }
        return pushMetricsTable.copy(i5, i10, i11, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPushId() {
        return this.pushId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDateCreate() {
        return this.dateCreate;
    }

    @NotNull
    public final PushMetricsTable copy(int id2, int pushId, int type, int dateCreate) {
        return new PushMetricsTable(id2, pushId, type, dateCreate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushMetricsTable)) {
            return false;
        }
        PushMetricsTable pushMetricsTable = (PushMetricsTable) other;
        return this.id == pushMetricsTable.id && this.pushId == pushMetricsTable.pushId && this.type == pushMetricsTable.type && this.dateCreate == pushMetricsTable.dateCreate;
    }

    public final int getDateCreate() {
        return this.dateCreate;
    }

    public final int getId() {
        return this.id;
    }

    public final int getPushId() {
        return this.pushId;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.id * 31) + this.pushId) * 31) + this.type) * 31) + this.dateCreate;
    }

    public final void setDateCreate(int i5) {
        this.dateCreate = i5;
    }

    public final void setId(int i5) {
        this.id = i5;
    }

    public final void setPushId(int i5) {
        this.pushId = i5;
    }

    public final void setType(int i5) {
        this.type = i5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PushMetricsTable(id=");
        sb2.append(this.id);
        sb2.append(", pushId=");
        sb2.append(this.pushId);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", dateCreate=");
        return e.i(sb2, this.dateCreate, ')');
    }

    public /* synthetic */ PushMetricsTable(int i5, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, i10, i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
