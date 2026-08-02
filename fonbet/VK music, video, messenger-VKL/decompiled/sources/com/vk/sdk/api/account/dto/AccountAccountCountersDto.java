package com.vk.sdk.api.account.dto;

import com.ironsource.C4504q2;
import xsna.epx;
import xsna.pmi0;
import xsna.sq;
import xsna.wr;
import xsna.zcl;

/* compiled from: AccountAccountCountersDto.kt */
/* loaded from: classes5.dex */
public final class AccountAccountCountersDto {

    @pmi0("app_requests")
    private final Integer appRequests;

    @pmi0("events")
    private final Integer events;

    @pmi0("faves")
    private final Integer faves;

    @pmi0("friends")
    private final Integer friends;

    @pmi0("friends_recommendations")
    private final Integer friendsRecommendations;

    @pmi0("gifts")
    private final Integer gifts;

    @pmi0("groups")
    private final Integer groups;

    @pmi0("memories")
    private final Integer memories;

    @pmi0("messages")
    private final Integer messages;

    @pmi0("notes")
    private final Integer notes;

    @pmi0(C4504q2.x)
    private final Integer notifications;

    @pmi0("photos")
    private final Integer photos;

    public AccountAccountCountersDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAccountCountersDto)) {
            return false;
        }
        AccountAccountCountersDto accountAccountCountersDto = (AccountAccountCountersDto) obj;
        return epx.f(this.appRequests, accountAccountCountersDto.appRequests) && epx.f(this.events, accountAccountCountersDto.events) && epx.f(this.faves, accountAccountCountersDto.faves) && epx.f(this.friends, accountAccountCountersDto.friends) && epx.f(this.friendsRecommendations, accountAccountCountersDto.friendsRecommendations) && epx.f(this.gifts, accountAccountCountersDto.gifts) && epx.f(this.groups, accountAccountCountersDto.groups) && epx.f(this.messages, accountAccountCountersDto.messages) && epx.f(this.memories, accountAccountCountersDto.memories) && epx.f(this.notes, accountAccountCountersDto.notes) && epx.f(this.notifications, accountAccountCountersDto.notifications) && epx.f(this.photos, accountAccountCountersDto.photos);
    }

    public final int hashCode() {
        Integer num = this.appRequests;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.events;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.faves;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.friends;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.friendsRecommendations;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.gifts;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.groups;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.messages;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.memories;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.notes;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.notifications;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.photos;
        return hashCode11 + (num12 != null ? num12.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.appRequests;
        Integer num2 = this.events;
        Integer num3 = this.faves;
        Integer num4 = this.friends;
        Integer num5 = this.friendsRecommendations;
        Integer num6 = this.gifts;
        Integer num7 = this.groups;
        Integer num8 = this.messages;
        Integer num9 = this.memories;
        Integer num10 = this.notes;
        Integer num11 = this.notifications;
        Integer num12 = this.photos;
        StringBuilder a = wr.a(num, "AccountAccountCountersDto(appRequests=", num2, ", events=", ", faves=");
        sq.b(a, num3, ", friends=", num4, ", friendsRecommendations=");
        sq.b(a, num5, ", gifts=", num6, ", groups=");
        sq.b(a, num7, ", messages=", num8, ", memories=");
        sq.b(a, num9, ", notes=", num10, ", notifications=");
        a.append(num11);
        a.append(", photos=");
        a.append(num12);
        a.append(")");
        return a.toString();
    }

    public AccountAccountCountersDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
        this.appRequests = num;
        this.events = num2;
        this.faves = num3;
        this.friends = num4;
        this.friendsRecommendations = num5;
        this.gifts = num6;
        this.groups = num7;
        this.messages = num8;
        this.memories = num9;
        this.notes = num10;
        this.notifications = num11;
        this.photos = num12;
    }

    public /* synthetic */ AccountAccountCountersDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12);
    }
}
