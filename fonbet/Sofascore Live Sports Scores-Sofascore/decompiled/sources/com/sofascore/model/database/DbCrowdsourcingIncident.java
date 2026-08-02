package com.sofascore.model.database;

import androidx.core.app.NotificationCompat;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.me4;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0084\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0014\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00103\u001a\u00020\fHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00064"}, d2 = {"Lcom/sofascore/model/database/DbCrowdsourcingIncident;", "", "id", "", "eventId", "eventTimestamp", "", "isHomeTeamIncident", "", "homeScoreSuggest", "awayScoreSuggest", "scoreType", "", "eventStatusType", "scorerId", "assistId", "group", "<init>", "(IIJZIILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "getId", "()I", "getEventId", "getEventTimestamp", "()J", "()Z", "getHomeScoreSuggest", "getAwayScoreSuggest", "getScoreType", "()Ljava/lang/String;", "getEventStatusType", "getScorerId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAssistId", "getGroup", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(IIJZIILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/sofascore/model/database/DbCrowdsourcingIncident;", "equals", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbCrowdsourcingIncident {

    @Nullable
    private final Integer assistId;
    private final int awayScoreSuggest;
    private final int eventId;

    @Nullable
    private final String eventStatusType;
    private final long eventTimestamp;
    private final int group;
    private final int homeScoreSuggest;
    private final int id;
    private final boolean isHomeTeamIncident;

    @Nullable
    private final String scoreType;

    @Nullable
    private final Integer scorerId;

    public DbCrowdsourcingIncident(int i, int i2, long j, boolean z, int i3, int i4, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, int i5) {
        this.id = i;
        this.eventId = i2;
        this.eventTimestamp = j;
        this.isHomeTeamIncident = z;
        this.homeScoreSuggest = i3;
        this.awayScoreSuggest = i4;
        this.scoreType = str;
        this.eventStatusType = str2;
        this.scorerId = num;
        this.assistId = num2;
        this.group = i5;
    }

    public static /* synthetic */ DbCrowdsourcingIncident copy$default(DbCrowdsourcingIncident dbCrowdsourcingIncident, int i, int i2, long j, boolean z, int i3, int i4, String str, String str2, Integer num, Integer num2, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = dbCrowdsourcingIncident.id;
        }
        if ((i6 & 2) != 0) {
            i2 = dbCrowdsourcingIncident.eventId;
        }
        if ((i6 & 4) != 0) {
            j = dbCrowdsourcingIncident.eventTimestamp;
        }
        if ((i6 & 8) != 0) {
            z = dbCrowdsourcingIncident.isHomeTeamIncident;
        }
        if ((i6 & 16) != 0) {
            i3 = dbCrowdsourcingIncident.homeScoreSuggest;
        }
        if ((i6 & 32) != 0) {
            i4 = dbCrowdsourcingIncident.awayScoreSuggest;
        }
        if ((i6 & 64) != 0) {
            str = dbCrowdsourcingIncident.scoreType;
        }
        if ((i6 & 128) != 0) {
            str2 = dbCrowdsourcingIncident.eventStatusType;
        }
        if ((i6 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num = dbCrowdsourcingIncident.scorerId;
        }
        if ((i6 & 512) != 0) {
            num2 = dbCrowdsourcingIncident.assistId;
        }
        if ((i6 & 1024) != 0) {
            i5 = dbCrowdsourcingIncident.group;
        }
        Integer num3 = num2;
        int i7 = i5;
        String str3 = str2;
        Integer num4 = num;
        long j2 = j;
        return dbCrowdsourcingIncident.copy(i, i2, j2, z, i3, i4, str, str3, num4, num3, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getAssistId() {
        return this.assistId;
    }

    /* renamed from: component11, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsHomeTeamIncident() {
        return this.isHomeTeamIncident;
    }

    /* renamed from: component5, reason: from getter */
    public final int getHomeScoreSuggest() {
        return this.homeScoreSuggest;
    }

    /* renamed from: component6, reason: from getter */
    public final int getAwayScoreSuggest() {
        return this.awayScoreSuggest;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getScoreType() {
        return this.scoreType;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getEventStatusType() {
        return this.eventStatusType;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getScorerId() {
        return this.scorerId;
    }

    @NotNull
    public final DbCrowdsourcingIncident copy(int id, int eventId, long eventTimestamp, boolean isHomeTeamIncident, int homeScoreSuggest, int awayScoreSuggest, @Nullable String scoreType, @Nullable String eventStatusType, @Nullable Integer scorerId, @Nullable Integer assistId, int group) {
        return new DbCrowdsourcingIncident(id, eventId, eventTimestamp, isHomeTeamIncident, homeScoreSuggest, awayScoreSuggest, scoreType, eventStatusType, scorerId, assistId, group);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbCrowdsourcingIncident)) {
            return false;
        }
        DbCrowdsourcingIncident dbCrowdsourcingIncident = (DbCrowdsourcingIncident) other;
        return this.id == dbCrowdsourcingIncident.id && this.eventId == dbCrowdsourcingIncident.eventId && this.eventTimestamp == dbCrowdsourcingIncident.eventTimestamp && this.isHomeTeamIncident == dbCrowdsourcingIncident.isHomeTeamIncident && this.homeScoreSuggest == dbCrowdsourcingIncident.homeScoreSuggest && this.awayScoreSuggest == dbCrowdsourcingIncident.awayScoreSuggest && Intrinsics.c(this.scoreType, dbCrowdsourcingIncident.scoreType) && Intrinsics.c(this.eventStatusType, dbCrowdsourcingIncident.eventStatusType) && Intrinsics.c(this.scorerId, dbCrowdsourcingIncident.scorerId) && Intrinsics.c(this.assistId, dbCrowdsourcingIncident.assistId) && this.group == dbCrowdsourcingIncident.group;
    }

    @Nullable
    public final Integer getAssistId() {
        return this.assistId;
    }

    public final int getAwayScoreSuggest() {
        return this.awayScoreSuggest;
    }

    public final int getEventId() {
        return this.eventId;
    }

    @Nullable
    public final String getEventStatusType() {
        return this.eventStatusType;
    }

    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getHomeScoreSuggest() {
        return this.homeScoreSuggest;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getScoreType() {
        return this.scoreType;
    }

    @Nullable
    public final Integer getScorerId() {
        return this.scorerId;
    }

    public int hashCode() {
        int a = wv8.a(this.awayScoreSuggest, wv8.a(this.homeScoreSuggest, dmi.e(ljg.c(wv8.a(this.eventId, Integer.hashCode(this.id) * 31, 31), 31, this.eventTimestamp), 31, this.isHomeTeamIncident), 31), 31);
        String str = this.scoreType;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventStatusType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.scorerId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.assistId;
        return Integer.hashCode(this.group) + ((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final boolean isHomeTeamIncident() {
        return this.isHomeTeamIncident;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.eventId;
        long j = this.eventTimestamp;
        boolean z = this.isHomeTeamIncident;
        int i3 = this.homeScoreSuggest;
        int i4 = this.awayScoreSuggest;
        String str = this.scoreType;
        String str2 = this.eventStatusType;
        Integer num = this.scorerId;
        Integer num2 = this.assistId;
        int i5 = this.group;
        StringBuilder s = lnb.s(i, i2, "DbCrowdsourcingIncident(id=", ", eventId=", ", eventTimestamp=");
        s.append(j);
        s.append(", isHomeTeamIncident=");
        s.append(z);
        me4.r(s, ", homeScoreSuggest=", i3, ", awayScoreSuggest=", i4);
        bf3.v(s, ", scoreType=", str, ", eventStatusType=", str2);
        fn0.w(num, num2, ", scorerId=", ", assistId=", s);
        return fn0.k(i5, ", group=", ")", s);
    }
}
