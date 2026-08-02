package com.sports.insider.data.repository.room.support.dp.impl;

import androidx.annotation.Keep;
import com.sports.insider.data.repository.room.metric.EventsTable;
import com.sports.insider.data.repository.room.news.NewsTable;
import d9.e;
import ka.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0090\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010.R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010+\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010.R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010.R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010+\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010.R\"\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010.R\"\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010+\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010.R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010+\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010.R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010>R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010;\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010>R\"\u0010\r\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010+\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u0010.R$\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010;\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010>R$\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010;\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010>¨\u0006G"}, d2 = {"Lcom/sports/insider/data/repository/room/support/dp/impl/SupportTable;", "", "", "id", "remoteId", "dateCreate", "dateUpdate", "stateRead", "readDate", "sendDate", "", "operatorName", NewsTable.TEXT_COLUMN, "type", "mime", EventsTable.contentColumn, "<init>", "(IIIIIIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Lka/a;", "toSupportData", "()Lka/a;", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "component12", "copy", "(IIIIIIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/sports/insider/data/repository/room/support/dp/impl/SupportTable;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "getRemoteId", "setRemoteId", "getDateCreate", "setDateCreate", "getDateUpdate", "setDateUpdate", "getStateRead", "setStateRead", "getReadDate", "setReadDate", "getSendDate", "setSendDate", "Ljava/lang/String;", "getOperatorName", "setOperatorName", "(Ljava/lang/String;)V", "getText", "setText", "getType", "setType", "getMime", "setMime", "getContent", "setContent", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SupportTable {

    @Nullable
    private String content;
    private int dateCreate;
    private int dateUpdate;
    private int id;

    @Nullable
    private String mime;

    @Nullable
    private String operatorName;
    private int readDate;
    private int remoteId;
    private int sendDate;
    private int stateRead;

    @Nullable
    private String text;
    private int type;

    public SupportTable(int i5, int i10, int i11, int i12, int i13, int i14, int i15, @Nullable String str, @Nullable String str2, int i16, @Nullable String str3, @Nullable String str4) {
        this.id = i5;
        this.remoteId = i10;
        this.dateCreate = i11;
        this.dateUpdate = i12;
        this.stateRead = i13;
        this.readDate = i14;
        this.sendDate = i15;
        this.operatorName = str;
        this.text = str2;
        this.type = i16;
        this.mime = str3;
        this.content = str4;
    }

    public static /* synthetic */ SupportTable copy$default(SupportTable supportTable, int i5, int i10, int i11, int i12, int i13, int i14, int i15, String str, String str2, int i16, String str3, String str4, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i5 = supportTable.id;
        }
        if ((i17 & 2) != 0) {
            i10 = supportTable.remoteId;
        }
        if ((i17 & 4) != 0) {
            i11 = supportTable.dateCreate;
        }
        if ((i17 & 8) != 0) {
            i12 = supportTable.dateUpdate;
        }
        if ((i17 & 16) != 0) {
            i13 = supportTable.stateRead;
        }
        if ((i17 & 32) != 0) {
            i14 = supportTable.readDate;
        }
        if ((i17 & 64) != 0) {
            i15 = supportTable.sendDate;
        }
        if ((i17 & 128) != 0) {
            str = supportTable.operatorName;
        }
        if ((i17 & 256) != 0) {
            str2 = supportTable.text;
        }
        if ((i17 & 512) != 0) {
            i16 = supportTable.type;
        }
        if ((i17 & Segment.SHARE_MINIMUM) != 0) {
            str3 = supportTable.mime;
        }
        if ((i17 & 2048) != 0) {
            str4 = supportTable.content;
        }
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        int i18 = i16;
        int i19 = i15;
        String str8 = str;
        int i20 = i13;
        int i21 = i14;
        return supportTable.copy(i5, i10, i11, i12, i20, i21, i19, str8, str7, i18, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getMime() {
        return this.mime;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRemoteId() {
        return this.remoteId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDateCreate() {
        return this.dateCreate;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDateUpdate() {
        return this.dateUpdate;
    }

    /* renamed from: component5, reason: from getter */
    public final int getStateRead() {
        return this.stateRead;
    }

    /* renamed from: component6, reason: from getter */
    public final int getReadDate() {
        return this.readDate;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSendDate() {
        return this.sendDate;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getOperatorName() {
        return this.operatorName;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final SupportTable copy(int id2, int remoteId, int dateCreate, int dateUpdate, int stateRead, int readDate, int sendDate, @Nullable String operatorName, @Nullable String text, int type, @Nullable String mime, @Nullable String content) {
        return new SupportTable(id2, remoteId, dateCreate, dateUpdate, stateRead, readDate, sendDate, operatorName, text, type, mime, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportTable)) {
            return false;
        }
        SupportTable supportTable = (SupportTable) other;
        return this.id == supportTable.id && this.remoteId == supportTable.remoteId && this.dateCreate == supportTable.dateCreate && this.dateUpdate == supportTable.dateUpdate && this.stateRead == supportTable.stateRead && this.readDate == supportTable.readDate && this.sendDate == supportTable.sendDate && Intrinsics.areEqual(this.operatorName, supportTable.operatorName) && Intrinsics.areEqual(this.text, supportTable.text) && this.type == supportTable.type && Intrinsics.areEqual(this.mime, supportTable.mime) && Intrinsics.areEqual(this.content, supportTable.content);
    }

    @Nullable
    public String getContent() {
        return this.content;
    }

    public int getDateCreate() {
        return this.dateCreate;
    }

    public int getDateUpdate() {
        return this.dateUpdate;
    }

    public int getId() {
        return this.id;
    }

    @Nullable
    public String getMime() {
        return this.mime;
    }

    @Nullable
    public String getOperatorName() {
        return this.operatorName;
    }

    public int getReadDate() {
        return this.readDate;
    }

    public int getRemoteId() {
        return this.remoteId;
    }

    public int getSendDate() {
        return this.sendDate;
    }

    public int getStateRead() {
        return this.stateRead;
    }

    @Nullable
    public String getText() {
        return this.text;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i5 = ((((((((((((this.id * 31) + this.remoteId) * 31) + this.dateCreate) * 31) + this.dateUpdate) * 31) + this.stateRead) * 31) + this.readDate) * 31) + this.sendDate) * 31;
        String str = this.operatorName;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.type) * 31;
        String str3 = this.mime;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public void setContent(@Nullable String str) {
        this.content = str;
    }

    public void setDateCreate(int i5) {
        this.dateCreate = i5;
    }

    public void setDateUpdate(int i5) {
        this.dateUpdate = i5;
    }

    public void setId(int i5) {
        this.id = i5;
    }

    public void setMime(@Nullable String str) {
        this.mime = str;
    }

    public void setOperatorName(@Nullable String str) {
        this.operatorName = str;
    }

    public void setReadDate(int i5) {
        this.readDate = i5;
    }

    public void setRemoteId(int i5) {
        this.remoteId = i5;
    }

    public void setSendDate(int i5) {
        this.sendDate = i5;
    }

    public void setStateRead(int i5) {
        this.stateRead = i5;
    }

    public void setText(@Nullable String str) {
        this.text = str;
    }

    public void setType(int i5) {
        this.type = i5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SupportTable(id=");
        sb2.append(this.id);
        sb2.append(", remoteId=");
        sb2.append(this.remoteId);
        sb2.append(", dateCreate=");
        sb2.append(this.dateCreate);
        sb2.append(", dateUpdate=");
        sb2.append(this.dateUpdate);
        sb2.append(", stateRead=");
        sb2.append(this.stateRead);
        sb2.append(", readDate=");
        sb2.append(this.readDate);
        sb2.append(", sendDate=");
        sb2.append(this.sendDate);
        sb2.append(", operatorName=");
        sb2.append(this.operatorName);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", mime=");
        sb2.append(this.mime);
        sb2.append(", content=");
        return e.k(sb2, this.content, ')');
    }

    @NotNull
    public final a toSupportData() {
        return new a(getId(), getDateCreate(), getDateUpdate(), getStateRead(), getReadDate(), getSendDate(), getOperatorName(), getText(), getType(), getMime(), getContent());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SupportTable(int i5, int i10, int i11, int i12, int i13, int i14, int i15, String str, String str2, int i16, String str3, String str4, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, i10, i11, (i17 & 8) != 0 ? i11 : i12, (i17 & 16) != 0 ? 0 : i13, (i17 & 32) != 0 ? 0 : i14, (i17 & 64) != 0 ? 0 : i15, (i17 & 128) != 0 ? null : str, (i17 & 256) != 0 ? null : str2, (i17 & 512) == 0 ? i16 : 0, (i17 & Segment.SHARE_MINIMUM) != 0 ? null : str3, (i17 & 2048) != 0 ? null : str4);
        i10 = (i17 & 2) != 0 ? 0 : i10;
        i11 = (i17 & 4) != 0 ? 0 : i11;
    }
}
