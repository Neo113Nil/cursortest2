package com.sports.insider.data.entity.live;

import androidx.annotation.Keep;
import com.sports.insider.data.repository.room.live.LiveTable;
import d9.e;
import hc.f;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJl\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010 J\u001a\u0010,\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b,\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010 \"\u0004\b/\u00100R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010-\u001a\u0004\b1\u0010 \"\u0004\b2\u00100R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u00103\u001a\u0004\b\u0005\u0010#\"\u0004\b4\u00105R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u00109R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u00109R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u00109R$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u00109¨\u0006B"}, d2 = {"Lcom/sports/insider/data/entity/live/LivePrediction;", "Lnc/b;", "", "id", LiveTable.createDateColumn, LiveTable.isViewedColumn, "", LiveTable.imageUrlColumn, "title", LiveTable.messageColumn, LiveTable.btnTextColumn, LiveTable.btnUrlColumn, "<init>", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lhc/f;", "copy", "()Lhc/f;", "", "other", "", "areItemsTheSame", "(Ljava/lang/Object;)Z", "areContentsTheSame", "getChangePayload", "(Ljava/lang/Object;)Ljava/lang/Object;", "toDdMmmYy", "()Ljava/lang/String;", "toHHmm", "getMsgWithEndSpace", "countSpace", "(I)Ljava/lang/String;", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sports/insider/data/entity/live/LivePrediction;", "toString", "hashCode", "equals", "I", "getId", "setId", "(I)V", "getCreateDate", "setCreateDate", "Ljava/lang/Integer;", "setViewed", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getImageUrl", "setImageUrl", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getMessage", "setMessage", "getBtnText", "setBtnText", "getBtnUrl", "setBtnUrl", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LivePrediction implements b {

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

    public LivePrediction(int i5, int i10, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.id = i5;
        this.createDate = i10;
        this.isViewed = num;
        this.imageUrl = str;
        this.title = str2;
        this.message = str3;
        this.btnText = str4;
        this.btnUrl = str5;
    }

    private static final boolean areContentsTheSame$isEqualsContent(b bVar, b bVar2) {
        return bVar.getCreateDate() == bVar2.getCreateDate() && Intrinsics.areEqual(bVar.getTitle(), bVar2.getTitle()) && Intrinsics.areEqual(bVar.getMessage(), bVar2.getMessage()) && Intrinsics.areEqual(bVar.getImageUrl(), bVar2.getImageUrl()) && Intrinsics.areEqual(bVar.getBtnText(), bVar2.getBtnText()) && Intrinsics.areEqual(bVar.getBtnUrl(), bVar2.getBtnUrl()) && Intrinsics.areEqual(bVar.isViewed(), bVar2.isViewed());
    }

    public static /* synthetic */ LivePrediction copy$default(LivePrediction livePrediction, int i5, int i10, Integer num, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = livePrediction.id;
        }
        if ((i11 & 2) != 0) {
            i10 = livePrediction.createDate;
        }
        if ((i11 & 4) != 0) {
            num = livePrediction.isViewed;
        }
        if ((i11 & 8) != 0) {
            str = livePrediction.imageUrl;
        }
        if ((i11 & 16) != 0) {
            str2 = livePrediction.title;
        }
        if ((i11 & 32) != 0) {
            str3 = livePrediction.message;
        }
        if ((i11 & 64) != 0) {
            str4 = livePrediction.btnText;
        }
        if ((i11 & 128) != 0) {
            str5 = livePrediction.btnUrl;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        return livePrediction.copy(i5, i10, num, str, str8, str9, str6, str7);
    }

    @Override // hc.f
    public boolean areContentsTheSame(@Nullable Object other) {
        if (other == null) {
            return false;
        }
        return other instanceof b ? areContentsTheSame$isEqualsContent(this, (b) other) : super.equals(other);
    }

    @Override // hc.f
    public boolean areItemsTheSame(@Nullable Object other) {
        if (other == null) {
            return false;
        }
        return other instanceof b ? getId() == ((b) other).getId() : super.equals(other);
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
    public final LivePrediction copy(int id2, int createDate, @Nullable Integer isViewed, @Nullable String imageUrl, @Nullable String title, @Nullable String message, @Nullable String btnText, @Nullable String btnUrl) {
        return new LivePrediction(id2, createDate, isViewed, imageUrl, title, message, btnText, btnUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivePrediction)) {
            return false;
        }
        LivePrediction livePrediction = (LivePrediction) other;
        return this.id == livePrediction.id && this.createDate == livePrediction.createDate && Intrinsics.areEqual(this.isViewed, livePrediction.isViewed) && Intrinsics.areEqual(this.imageUrl, livePrediction.imageUrl) && Intrinsics.areEqual(this.title, livePrediction.title) && Intrinsics.areEqual(this.message, livePrediction.message) && Intrinsics.areEqual(this.btnText, livePrediction.btnText) && Intrinsics.areEqual(this.btnUrl, livePrediction.btnUrl);
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
        StringBuilder sb2 = new StringBuilder("LivePrediction(id=");
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
        return new LivePrediction(getId(), getCreateDate(), isViewed(), getImageUrl(), getTitle(), getMessage(), getBtnText(), getBtnUrl());
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
}
