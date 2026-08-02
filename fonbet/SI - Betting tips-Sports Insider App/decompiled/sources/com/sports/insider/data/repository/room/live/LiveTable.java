package com.sports.insider.data.repository.room.live;

import androidx.annotation.Keep;
import d9.e;
import gb.c;
import hc.f;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b1\b\u0081\b\u0018\u0000 B2\u00020\u0001:\u0001CBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJl\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010 J\u001a\u0010,\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b,\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010 \"\u0004\b/\u00100R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010-\u001a\u0004\b1\u0010 \"\u0004\b2\u00100R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u00103\u001a\u0004\b\u0005\u0010#\"\u0004\b4\u00105R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u00109R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u00109R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u00109R$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u00109¨\u0006D"}, d2 = {"Lcom/sports/insider/data/repository/room/live/LiveTable;", "Lnc/b;", "", "id", LiveTable.createDateColumn, LiveTable.isViewedColumn, "", LiveTable.imageUrlColumn, "title", LiveTable.messageColumn, LiveTable.btnTextColumn, LiveTable.btnUrlColumn, "<init>", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lhc/f;", "copy", "()Lhc/f;", "", "other", "", "areItemsTheSame", "(Ljava/lang/Object;)Z", "areContentsTheSame", "getChangePayload", "(Ljava/lang/Object;)Ljava/lang/Object;", "toDdMmmYy", "()Ljava/lang/String;", "toHHmm", "getMsgWithEndSpace", "countSpace", "(I)Ljava/lang/String;", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sports/insider/data/repository/room/live/LiveTable;", "toString", "hashCode", "equals", "I", "getId", "setId", "(I)V", "getCreateDate", "setCreateDate", "Ljava/lang/Integer;", "setViewed", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getImageUrl", "setImageUrl", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getMessage", "setMessage", "getBtnText", "setBtnText", "getBtnUrl", "setBtnUrl", "LiveTableNamed", "gb/c", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LiveTable implements b {

    @NotNull
    public static final c LiveTableNamed = new c();

    @NotNull
    public static final String btnTextColumn = "btnText";

    @NotNull
    public static final String btnUrlColumn = "btnUrl";

    @NotNull
    public static final String createDateColumn = "createDate";

    @NotNull
    public static final String idColumn = "id";

    @NotNull
    public static final String imageUrlColumn = "imageUrl";

    @NotNull
    public static final String isViewedColumn = "isViewed";

    @NotNull
    public static final String messageColumn = "message";

    @NotNull
    public static final String tableName = "live_table";

    @NotNull
    public static final String titleColumn = "title";

    @Nullable
    private String btnText;

    @Nullable
    private String btnUrl;
    private int createDate;
    private int id;

    @Nullable
    private String imageUrl;

    @Nullable
    private Integer isViewed;

    @Nullable
    private String message;

    @Nullable
    private String title;

    public LiveTable(int i5, int i10, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.id = i5;
        this.createDate = i10;
        this.isViewed = num;
        this.imageUrl = str;
        this.title = str2;
        this.message = str3;
        this.btnText = str4;
        this.btnUrl = str5;
    }

    public static /* synthetic */ LiveTable copy$default(LiveTable liveTable, int i5, int i10, Integer num, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = liveTable.id;
        }
        if ((i11 & 2) != 0) {
            i10 = liveTable.createDate;
        }
        if ((i11 & 4) != 0) {
            num = liveTable.isViewed;
        }
        if ((i11 & 8) != 0) {
            str = liveTable.imageUrl;
        }
        if ((i11 & 16) != 0) {
            str2 = liveTable.title;
        }
        if ((i11 & 32) != 0) {
            str3 = liveTable.message;
        }
        if ((i11 & 64) != 0) {
            str4 = liveTable.btnText;
        }
        if ((i11 & 128) != 0) {
            str5 = liveTable.btnUrl;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        return liveTable.copy(i5, i10, num, str, str8, str9, str6, str7);
    }

    @Override // hc.f
    public boolean areContentsTheSame(@Nullable Object other) {
        return false;
    }

    @Override // hc.f
    public boolean areItemsTheSame(@Nullable Object other) {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCreateDate() {
        return this.createDate;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getIsViewed() {
        return this.isViewed;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getBtnText() {
        return this.btnText;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getBtnUrl() {
        return this.btnUrl;
    }

    @NotNull
    public final LiveTable copy(int id2, int createDate, @Nullable Integer isViewed, @Nullable String imageUrl, @Nullable String title, @Nullable String message, @Nullable String btnText, @Nullable String btnUrl) {
        return new LiveTable(id2, createDate, isViewed, imageUrl, title, message, btnText, btnUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveTable)) {
            return false;
        }
        LiveTable liveTable = (LiveTable) other;
        return this.id == liveTable.id && this.createDate == liveTable.createDate && Intrinsics.areEqual(this.isViewed, liveTable.isViewed) && Intrinsics.areEqual(this.imageUrl, liveTable.imageUrl) && Intrinsics.areEqual(this.title, liveTable.title) && Intrinsics.areEqual(this.message, liveTable.message) && Intrinsics.areEqual(this.btnText, liveTable.btnText) && Intrinsics.areEqual(this.btnUrl, liveTable.btnUrl);
    }

    @Override // nc.b
    @Nullable
    public String getBtnText() {
        return this.btnText;
    }

    @Override // nc.b
    @Nullable
    public String getBtnUrl() {
        return this.btnUrl;
    }

    @Override // hc.f
    @Nullable
    public Object getChangePayload(@Nullable Object other) {
        return null;
    }

    @Override // nc.b
    public int getCreateDate() {
        return this.createDate;
    }

    @Override // nc.b
    public int getId() {
        return this.id;
    }

    @Override // nc.b
    @Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // nc.b
    @Nullable
    public String getMessage() {
        return this.message;
    }

    @Override // nc.b
    @Nullable
    public String getMsgWithEndSpace() {
        return getMsgWithEndSpace(14);
    }

    @Override // nc.b
    @Nullable
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i5 = ((this.id * 31) + this.createDate) * 31;
        Integer num = this.isViewed;
        int hashCode = (i5 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.imageUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.btnText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.btnUrl;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // nc.b
    @Nullable
    public Integer isViewed() {
        return this.isViewed;
    }

    public void setBtnText(@Nullable String str) {
        this.btnText = str;
    }

    public void setBtnUrl(@Nullable String str) {
        this.btnUrl = str;
    }

    public void setCreateDate(int i5) {
        this.createDate = i5;
    }

    public void setId(int i5) {
        this.id = i5;
    }

    public void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public void setMessage(@Nullable String str) {
        this.message = str;
    }

    public void setTitle(@Nullable String str) {
        this.title = str;
    }

    public void setViewed(@Nullable Integer num) {
        this.isViewed = num;
    }

    @Override // nc.b
    @NotNull
    public String toDdMmmYy() {
        String format = LocalDateTime.ofInstant(Instant.ofEpochSecond(getCreateDate()), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd MMM yy"));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @Override // nc.b
    @NotNull
    public String toHHmm() {
        String format = LocalDateTime.ofInstant(Instant.ofEpochSecond(getCreateDate()), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm"));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LiveTable(id=");
        sb2.append(this.id);
        sb2.append(", createDate=");
        sb2.append(this.createDate);
        sb2.append(", isViewed=");
        sb2.append(this.isViewed);
        sb2.append(", imageUrl=");
        sb2.append(this.imageUrl);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", btnText=");
        sb2.append(this.btnText);
        sb2.append(", btnUrl=");
        return e.k(sb2, this.btnUrl, ')');
    }

    @NotNull
    public f copy() {
        throw new IllegalAccessException("Not yet implemented");
    }

    @Nullable
    public String getMsgWithEndSpace(int countSpace) {
        if (countSpace <= 0) {
            return getMessage();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < countSpace; i5++) {
            sb2.append(" ");
        }
        String message = getMessage();
        if (message == null) {
            return null;
        }
        return message + ((Object) sb2);
    }

    public /* synthetic */ LiveTable(int i5, int i10, Integer num, String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, i10, (i11 & 4) != 0 ? 0 : num, str, str2, str3, str4, str5);
    }
}
