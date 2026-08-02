package com.vk.sdk.api.apps.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsLeaderboardDto.kt */
/* loaded from: classes5.dex */
public final class AppsLeaderboardDto {

    @pmi0("level")
    private final Integer level;

    @pmi0("points")
    private final Integer points;

    @pmi0("score")
    private final Integer score;

    @pmi0("user_id")
    private final UserId userId;

    public AppsLeaderboardDto(UserId userId, Integer num, Integer num2, Integer num3) {
        this.userId = userId;
        this.level = num;
        this.points = num2;
        this.score = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsLeaderboardDto)) {
            return false;
        }
        AppsLeaderboardDto appsLeaderboardDto = (AppsLeaderboardDto) obj;
        return epx.f(this.userId, appsLeaderboardDto.userId) && epx.f(this.level, appsLeaderboardDto.level) && epx.f(this.points, appsLeaderboardDto.points) && epx.f(this.score, appsLeaderboardDto.score);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.userId.b) * 31;
        Integer num = this.level;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.points;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.score;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "AppsLeaderboardDto(userId=" + this.userId + ", level=" + this.level + ", points=" + this.points + ", score=" + this.score + ")";
    }

    public /* synthetic */ AppsLeaderboardDto(UserId userId, Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
