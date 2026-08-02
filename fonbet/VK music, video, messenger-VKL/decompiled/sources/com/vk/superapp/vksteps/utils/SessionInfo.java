package com.vk.superapp.vksteps.utils;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class SessionInfo {

    @pmi0("activeTime")
    private final Long activeTime;

    @pmi0("activity")
    private final String activity;

    @pmi0("appPackageName")
    private final String appPackageName;

    @pmi0("description")
    private final String description;

    @pmi0("endLocalTime")
    private final String endLocalTime;

    @pmi0("endTime")
    private final Long endTime;

    @pmi0("hasActiveTime")
    private final Boolean hasActiveTime;

    @pmi0("identifier")
    private final String identifier;

    @pmi0("isOngoing")
    private final Boolean isOngoing;

    @pmi0("name")
    private final String name;

    @pmi0("startLocalTime")
    private final String startLocalTime;

    @pmi0("startTime")
    private final Long startTime;

    public SessionInfo(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Long l, Long l2, String str6, Long l3, String str7) {
        this.name = str;
        this.activity = str2;
        this.description = str3;
        this.appPackageName = str4;
        this.identifier = str5;
        this.isOngoing = bool;
        this.hasActiveTime = bool2;
        this.activeTime = l;
        this.endTime = l2;
        this.endLocalTime = str6;
        this.startTime = l3;
        this.startLocalTime = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return epx.f(this.name, sessionInfo.name) && epx.f(this.activity, sessionInfo.activity) && epx.f(this.description, sessionInfo.description) && epx.f(this.appPackageName, sessionInfo.appPackageName) && epx.f(this.identifier, sessionInfo.identifier) && epx.f(this.isOngoing, sessionInfo.isOngoing) && epx.f(this.hasActiveTime, sessionInfo.hasActiveTime) && epx.f(this.activeTime, sessionInfo.activeTime) && epx.f(this.endTime, sessionInfo.endTime) && epx.f(this.endLocalTime, sessionInfo.endLocalTime) && epx.f(this.startTime, sessionInfo.startTime) && epx.f(this.startLocalTime, sessionInfo.startLocalTime);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.activity), 31, this.description), 31, this.appPackageName), 31, this.identifier);
        Boolean bool = this.isOngoing;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasActiveTime;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.activeTime;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.endLocalTime;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.startTime;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.startLocalTime;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(name=");
        sb.append(this.name);
        sb.append(", activity=");
        sb.append(this.activity);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", appPackageName=");
        sb.append(this.appPackageName);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", isOngoing=");
        sb.append(this.isOngoing);
        sb.append(", hasActiveTime=");
        sb.append(this.hasActiveTime);
        sb.append(", activeTime=");
        sb.append(this.activeTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", endLocalTime=");
        sb.append(this.endLocalTime);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", startLocalTime=");
        return ho8.a(sb, this.startLocalTime, ')');
    }
}
