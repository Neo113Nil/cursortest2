package com.sports.insider.data.repository.room.metric;

import androidx.annotation.Keep;
import d9.e;
import hb.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0001%B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\u001b¨\u0006&"}, d2 = {"Lcom/sports/insider/data/repository/room/metric/EventsTable;", "", "", "id", "", "name", EventsTable.contentColumn, "dateCreate", "<init>", "(ILjava/lang/String;Ljava/lang/String;I)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;I)Lcom/sports/insider/data/repository/room/metric/EventsTable;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getContent", "setContent", "getDateCreate", "setDateCreate", "EventsTableNamed", "hb/b", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EventsTable {

    @NotNull
    public static final b EventsTableNamed = new b();

    @NotNull
    public static final String contentColumn = "content";

    @NotNull
    public static final String dateCreateColumn = "dateCreate";

    @NotNull
    public static final String idColumn = "id";

    @NotNull
    public static final String nameColumn = "name";

    @NotNull
    public static final String tableName = "events_table";

    @Nullable
    private String content;
    private int dateCreate;
    private int id;

    @NotNull
    private String name;

    public EventsTable(int i5, @NotNull String name, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i5;
        this.name = name;
        this.content = str;
        this.dateCreate = i10;
    }

    public static /* synthetic */ EventsTable copy$default(EventsTable eventsTable, int i5, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = eventsTable.id;
        }
        if ((i11 & 2) != 0) {
            str = eventsTable.name;
        }
        if ((i11 & 4) != 0) {
            str2 = eventsTable.content;
        }
        if ((i11 & 8) != 0) {
            i10 = eventsTable.dateCreate;
        }
        return eventsTable.copy(i5, str, str2, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDateCreate() {
        return this.dateCreate;
    }

    @NotNull
    public final EventsTable copy(int id2, @NotNull String name, @Nullable String content, int dateCreate) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new EventsTable(id2, name, content, dateCreate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventsTable)) {
            return false;
        }
        EventsTable eventsTable = (EventsTable) other;
        return this.id == eventsTable.id && Intrinsics.areEqual(this.name, eventsTable.name) && Intrinsics.areEqual(this.content, eventsTable.content) && this.dateCreate == eventsTable.dateCreate;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final int getDateCreate() {
        return this.dateCreate;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int j = k.j(this.id * 31, 31, this.name);
        String str = this.content;
        return ((j + (str == null ? 0 : str.hashCode())) * 31) + this.dateCreate;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDateCreate(int i5) {
        this.dateCreate = i5;
    }

    public final void setId(int i5) {
        this.id = i5;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventsTable(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", content=");
        sb2.append(this.content);
        sb2.append(", dateCreate=");
        return e.i(sb2, this.dateCreate, ')');
    }

    public /* synthetic */ EventsTable(int i5, String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? 0 : i10);
    }
}
