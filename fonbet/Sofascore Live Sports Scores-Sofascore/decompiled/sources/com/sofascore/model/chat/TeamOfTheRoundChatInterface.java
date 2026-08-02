package com.sofascore.model.chat;

import com.sofascore.model.util.ChatInterface;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.vxd;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0019Jd\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010.J\u0014\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0083\u0004J\n\u00103\u001a\u00020\u0004HÖ\u0081\u0004J\n\u00104\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0014\u0010#\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0014¨\u00065"}, d2 = {"Lcom/sofascore/model/chat/TeamOfTheRoundChatInterface;", "Lcom/sofascore/model/util/ChatInterface;", "Ljava/io/Serializable;", "uniqueTournamentId", "", "seasonId", "roundId", "roundName", "", "analyticsCategory", "emptyStateMessageText", "emptyStateMessageUsername", "emptyStateMessageAvatarRes", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getUniqueTournamentId", "()I", "getSeasonId", "getRoundId", "getRoundName", "()Ljava/lang/String;", "getAnalyticsCategory", "getEmptyStateMessageText", "getEmptyStateMessageUsername", "getEmptyStateMessageAvatarRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "chatId", "getChatId", "timestamp", "", "getTimestamp", "()J", "statusType", "getStatusType", "channelName", "getChannelName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sofascore/model/chat/TeamOfTheRoundChatInterface;", "equals", "", "other", "", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamOfTheRoundChatInterface implements ChatInterface, Serializable {

    @NotNull
    private final String analyticsCategory;

    @Nullable
    private final Integer emptyStateMessageAvatarRes;

    @Nullable
    private final String emptyStateMessageText;

    @Nullable
    private final String emptyStateMessageUsername;
    private final int roundId;

    @NotNull
    private final String roundName;
    private final int seasonId;
    private final int uniqueTournamentId;

    public TeamOfTheRoundChatInterface(int i, int i2, int i3, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        str.getClass();
        str2.getClass();
        this.uniqueTournamentId = i;
        this.seasonId = i2;
        this.roundId = i3;
        this.roundName = str;
        this.analyticsCategory = str2;
        this.emptyStateMessageText = str3;
        this.emptyStateMessageUsername = str4;
        this.emptyStateMessageAvatarRes = num;
    }

    public static /* synthetic */ TeamOfTheRoundChatInterface copy$default(TeamOfTheRoundChatInterface teamOfTheRoundChatInterface, int i, int i2, int i3, String str, String str2, String str3, String str4, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = teamOfTheRoundChatInterface.uniqueTournamentId;
        }
        if ((i4 & 2) != 0) {
            i2 = teamOfTheRoundChatInterface.seasonId;
        }
        if ((i4 & 4) != 0) {
            i3 = teamOfTheRoundChatInterface.roundId;
        }
        if ((i4 & 8) != 0) {
            str = teamOfTheRoundChatInterface.roundName;
        }
        if ((i4 & 16) != 0) {
            str2 = teamOfTheRoundChatInterface.analyticsCategory;
        }
        if ((i4 & 32) != 0) {
            str3 = teamOfTheRoundChatInterface.emptyStateMessageText;
        }
        if ((i4 & 64) != 0) {
            str4 = teamOfTheRoundChatInterface.emptyStateMessageUsername;
        }
        if ((i4 & 128) != 0) {
            num = teamOfTheRoundChatInterface.emptyStateMessageAvatarRes;
        }
        String str5 = str4;
        Integer num2 = num;
        String str6 = str2;
        String str7 = str3;
        return teamOfTheRoundChatInterface.copy(i, i2, i3, str, str6, str7, str5, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeasonId() {
        return this.seasonId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRoundId() {
        return this.roundId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getRoundName() {
        return this.roundName;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAnalyticsCategory() {
        return this.analyticsCategory;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getEmptyStateMessageText() {
        return this.emptyStateMessageText;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getEmptyStateMessageUsername() {
        return this.emptyStateMessageUsername;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getEmptyStateMessageAvatarRes() {
        return this.emptyStateMessageAvatarRes;
    }

    @NotNull
    public final TeamOfTheRoundChatInterface copy(int uniqueTournamentId, int seasonId, int roundId, @NotNull String roundName, @NotNull String analyticsCategory, @Nullable String emptyStateMessageText, @Nullable String emptyStateMessageUsername, @Nullable Integer emptyStateMessageAvatarRes) {
        roundName.getClass();
        analyticsCategory.getClass();
        return new TeamOfTheRoundChatInterface(uniqueTournamentId, seasonId, roundId, roundName, analyticsCategory, emptyStateMessageText, emptyStateMessageUsername, emptyStateMessageAvatarRes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamOfTheRoundChatInterface)) {
            return false;
        }
        TeamOfTheRoundChatInterface teamOfTheRoundChatInterface = (TeamOfTheRoundChatInterface) other;
        return this.uniqueTournamentId == teamOfTheRoundChatInterface.uniqueTournamentId && this.seasonId == teamOfTheRoundChatInterface.seasonId && this.roundId == teamOfTheRoundChatInterface.roundId && Intrinsics.c(this.roundName, teamOfTheRoundChatInterface.roundName) && Intrinsics.c(this.analyticsCategory, teamOfTheRoundChatInterface.analyticsCategory) && Intrinsics.c(this.emptyStateMessageText, teamOfTheRoundChatInterface.emptyStateMessageText) && Intrinsics.c(this.emptyStateMessageUsername, teamOfTheRoundChatInterface.emptyStateMessageUsername) && Intrinsics.c(this.emptyStateMessageAvatarRes, teamOfTheRoundChatInterface.emptyStateMessageAvatarRes);
    }

    @NotNull
    public final String getAnalyticsCategory() {
        return this.analyticsCategory;
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getChannelName() {
        return dmi.k(this.seasonId, this.roundId, "team_of_the_round.", ".");
    }

    @Override // com.sofascore.model.util.ChatInterface
    public int getChatId() {
        return this.uniqueTournamentId;
    }

    @Nullable
    public final Integer getEmptyStateMessageAvatarRes() {
        return this.emptyStateMessageAvatarRes;
    }

    @Nullable
    public final String getEmptyStateMessageText() {
        return this.emptyStateMessageText;
    }

    @Nullable
    public final String getEmptyStateMessageUsername() {
        return this.emptyStateMessageUsername;
    }

    public final int getRoundId() {
        return this.roundId;
    }

    @NotNull
    public final String getRoundName() {
        return this.roundName;
    }

    public final int getSeasonId() {
        return this.seasonId;
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getStatusType() {
        return "";
    }

    @Override // com.sofascore.model.util.ChatInterface
    public long getTimestamp() {
        return 0L;
    }

    public final int getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(wv8.a(this.roundId, wv8.a(this.seasonId, Integer.hashCode(this.uniqueTournamentId) * 31, 31), 31), 31, this.roundName), 31, this.analyticsCategory);
        String str = this.emptyStateMessageText;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.emptyStateMessageUsername;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.emptyStateMessageAvatarRes;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.uniqueTournamentId;
        int i2 = this.seasonId;
        int i3 = this.roundId;
        String str = this.roundName;
        String str2 = this.analyticsCategory;
        String str3 = this.emptyStateMessageText;
        String str4 = this.emptyStateMessageUsername;
        Integer num = this.emptyStateMessageAvatarRes;
        StringBuilder s = lnb.s(i, i2, "TeamOfTheRoundChatInterface(uniqueTournamentId=", ", seasonId=", ", roundId=");
        vxd.p(i3, ", roundName=", str, ", analyticsCategory=", s);
        bf3.v(s, str2, ", emptyStateMessageText=", str3, ", emptyStateMessageUsername=");
        s.append(str4);
        s.append(", emptyStateMessageAvatarRes=");
        s.append(num);
        s.append(")");
        return s.toString();
    }

    public /* synthetic */ TeamOfTheRoundChatInterface(int i, int i2, int i3, String str, String str2, String str3, String str4, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? null : str4, (i4 & 128) != 0 ? null : num);
    }
}
