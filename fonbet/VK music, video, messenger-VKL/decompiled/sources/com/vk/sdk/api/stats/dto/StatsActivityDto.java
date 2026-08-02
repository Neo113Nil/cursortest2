package com.vk.sdk.api.stats.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.sq;
import xsna.wr;
import xsna.zcl;

/* compiled from: StatsActivityDto.kt */
/* loaded from: classes5.dex */
public final class StatsActivityDto {

    @pmi0("comments")
    private final Integer comments;

    @pmi0("copies")
    private final Integer copies;

    @pmi0("hidden")
    private final Integer hidden;

    @pmi0("likes")
    private final Integer likes;

    @pmi0("subscribed")
    private final Integer subscribed;

    @pmi0("unsubscribed")
    private final Integer unsubscribed;

    public StatsActivityDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsActivityDto)) {
            return false;
        }
        StatsActivityDto statsActivityDto = (StatsActivityDto) obj;
        return epx.f(this.comments, statsActivityDto.comments) && epx.f(this.copies, statsActivityDto.copies) && epx.f(this.hidden, statsActivityDto.hidden) && epx.f(this.likes, statsActivityDto.likes) && epx.f(this.subscribed, statsActivityDto.subscribed) && epx.f(this.unsubscribed, statsActivityDto.unsubscribed);
    }

    public final int hashCode() {
        Integer num = this.comments;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.copies;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.hidden;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.likes;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.subscribed;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.unsubscribed;
        return hashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.comments;
        Integer num2 = this.copies;
        Integer num3 = this.hidden;
        Integer num4 = this.likes;
        Integer num5 = this.subscribed;
        Integer num6 = this.unsubscribed;
        StringBuilder a = wr.a(num, "StatsActivityDto(comments=", num2, ", copies=", ", hidden=");
        sq.b(a, num3, ", likes=", num4, ", subscribed=");
        a.append(num5);
        a.append(", unsubscribed=");
        a.append(num6);
        a.append(")");
        return a.toString();
    }

    public StatsActivityDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.comments = num;
        this.copies = num2;
        this.hidden = num3;
        this.likes = num4;
        this.subscribed = num5;
        this.unsubscribed = num6;
    }

    public /* synthetic */ StatsActivityDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6);
    }
}
