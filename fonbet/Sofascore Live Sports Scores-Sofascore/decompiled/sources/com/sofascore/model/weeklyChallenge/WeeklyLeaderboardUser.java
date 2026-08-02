package com.sofascore.model.weeklyChallenge;

import com.sofascore.model.profile.UserBadge;
import com.sofascore.model.profile.UserBadgeSerializer;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010#JR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010#¨\u0006:"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyLeaderboardUser;", "", "", "id", "nickname", "", "score", "Lcom/sofascore/model/profile/UserBadge;", "userBadge", "", "currentWeeklyChallengeWeeklyStreak", "currentDailyBonusEventId", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLcom/sofascore/model/profile/UserBadge;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;FLcom/sofascore/model/profile/UserBadge;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/weeklyChallenge/WeeklyLeaderboardUser;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()F", "component4", "()Lcom/sofascore/model/profile/UserBadge;", "component5", "()Ljava/lang/Integer;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;FLcom/sofascore/model/profile/UserBadge;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/weeklyChallenge/WeeklyLeaderboardUser;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getNickname", "F", "getScore", "Lcom/sofascore/model/profile/UserBadge;", "getUserBadge", "Ljava/lang/Integer;", "getCurrentWeeklyChallengeWeeklyStreak", "getCurrentDailyBonusEventId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WeeklyLeaderboardUser {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer currentDailyBonusEventId;

    @Nullable
    private final Integer currentWeeklyChallengeWeeklyStreak;

    @NotNull
    private final String id;

    @NotNull
    private final String nickname;
    private final float score;

    @Nullable
    private final UserBadge userBadge;

    public /* synthetic */ WeeklyLeaderboardUser(int i, String str, String str2, float f, UserBadge userBadge, Integer num, Integer num2, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, WeeklyLeaderboardUser$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.nickname = str2;
        this.score = f;
        this.userBadge = userBadge;
        this.currentWeeklyChallengeWeeklyStreak = num;
        this.currentDailyBonusEventId = num2;
    }

    public static /* synthetic */ WeeklyLeaderboardUser copy$default(WeeklyLeaderboardUser weeklyLeaderboardUser, String str, String str2, float f, UserBadge userBadge, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weeklyLeaderboardUser.id;
        }
        if ((i & 2) != 0) {
            str2 = weeklyLeaderboardUser.nickname;
        }
        if ((i & 4) != 0) {
            f = weeklyLeaderboardUser.score;
        }
        if ((i & 8) != 0) {
            userBadge = weeklyLeaderboardUser.userBadge;
        }
        if ((i & 16) != 0) {
            num = weeklyLeaderboardUser.currentWeeklyChallengeWeeklyStreak;
        }
        if ((i & 32) != 0) {
            num2 = weeklyLeaderboardUser.currentDailyBonusEventId;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return weeklyLeaderboardUser.copy(str, str2, f, userBadge, num3, num4);
    }

    public static final /* synthetic */ void write$Self$model_release(WeeklyLeaderboardUser self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.id);
        output.y(serialDesc, 1, self.nickname);
        output.t(serialDesc, 2, self.score);
        output.h(serialDesc, 3, UserBadgeSerializer.INSTANCE, self.userBadge);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.currentWeeklyChallengeWeeklyStreak);
        output.h(serialDesc, 5, a7aVar, self.currentDailyBonusEventId);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final UserBadge getUserBadge() {
        return this.userBadge;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getCurrentWeeklyChallengeWeeklyStreak() {
        return this.currentWeeklyChallengeWeeklyStreak;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getCurrentDailyBonusEventId() {
        return this.currentDailyBonusEventId;
    }

    @NotNull
    public final WeeklyLeaderboardUser copy(@NotNull String id, @NotNull String nickname, float score, @Nullable UserBadge userBadge, @Nullable Integer currentWeeklyChallengeWeeklyStreak, @Nullable Integer currentDailyBonusEventId) {
        id.getClass();
        nickname.getClass();
        return new WeeklyLeaderboardUser(id, nickname, score, userBadge, currentWeeklyChallengeWeeklyStreak, currentDailyBonusEventId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyLeaderboardUser)) {
            return false;
        }
        WeeklyLeaderboardUser weeklyLeaderboardUser = (WeeklyLeaderboardUser) other;
        return Intrinsics.c(this.id, weeklyLeaderboardUser.id) && Intrinsics.c(this.nickname, weeklyLeaderboardUser.nickname) && Float.compare(this.score, weeklyLeaderboardUser.score) == 0 && this.userBadge == weeklyLeaderboardUser.userBadge && Intrinsics.c(this.currentWeeklyChallengeWeeklyStreak, weeklyLeaderboardUser.currentWeeklyChallengeWeeklyStreak) && Intrinsics.c(this.currentDailyBonusEventId, weeklyLeaderboardUser.currentDailyBonusEventId);
    }

    @Nullable
    public final Integer getCurrentDailyBonusEventId() {
        return this.currentDailyBonusEventId;
    }

    @Nullable
    public final Integer getCurrentWeeklyChallengeWeeklyStreak() {
        return this.currentWeeklyChallengeWeeklyStreak;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final float getScore() {
        return this.score;
    }

    @Nullable
    public final UserBadge getUserBadge() {
        return this.userBadge;
    }

    public int hashCode() {
        int a = fc6.a(this.score, dmi.c(this.id.hashCode() * 31, 31, this.nickname), 31);
        UserBadge userBadge = this.userBadge;
        int hashCode = (a + (userBadge == null ? 0 : userBadge.hashCode())) * 31;
        Integer num = this.currentWeeklyChallengeWeeklyStreak;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.currentDailyBonusEventId;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.nickname;
        float f = this.score;
        UserBadge userBadge = this.userBadge;
        Integer num = this.currentWeeklyChallengeWeeklyStreak;
        Integer num2 = this.currentDailyBonusEventId;
        StringBuilder s = mz1.s("WeeklyLeaderboardUser(id=", str, ", nickname=", str2, ", score=");
        s.append(f);
        s.append(", userBadge=");
        s.append(userBadge);
        s.append(", currentWeeklyChallengeWeeklyStreak=");
        return fc6.l(num, num2, ", currentDailyBonusEventId=", ")", s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyLeaderboardUser$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/weeklyChallenge/WeeklyLeaderboardUser;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WeeklyLeaderboardUser$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WeeklyLeaderboardUser(@NotNull String str, @NotNull String str2, float f, @Nullable UserBadge userBadge, @Nullable Integer num, @Nullable Integer num2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.nickname = str2;
        this.score = f;
        this.userBadge = userBadge;
        this.currentWeeklyChallengeWeeklyStreak = num;
        this.currentDailyBonusEventId = num2;
    }
}
