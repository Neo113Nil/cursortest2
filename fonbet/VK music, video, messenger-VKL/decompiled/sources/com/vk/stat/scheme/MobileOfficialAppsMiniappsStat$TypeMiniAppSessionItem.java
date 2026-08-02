package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem implements SchemeStat$TypeAction.b {

    @pmi0("app_id")
    private final MobileOfficialAppsMiniappsStat$AppIdItem appId;

    @pmi0("duration")
    private final Integer duration;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final String event;

    @pmi0("session_uuid")
    private final MobileOfficialAppsMiniappsStat$SessionUuidItem sessionUuid;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    public MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem = (MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem) obj;
        return epx.f(this.event, mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem.event) && epx.f(this.appId, mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem.appId) && epx.f(this.duration, mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem.duration) && epx.f(this.sessionUuid, mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem.sessionUuid) && epx.f(this.trackCode, mobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = this.appId;
        int hashCode2 = (hashCode + (mobileOfficialAppsMiniappsStat$AppIdItem == null ? 0 : mobileOfficialAppsMiniappsStat$AppIdItem.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$SessionUuidItem mobileOfficialAppsMiniappsStat$SessionUuidItem = this.sessionUuid;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsMiniappsStat$SessionUuidItem == null ? 0 : mobileOfficialAppsMiniappsStat$SessionUuidItem.a.hashCode())) * 31;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.trackCode;
        return hashCode4 + (commonStat$TypeTrackCodeItem != null ? commonStat$TypeTrackCodeItem.a.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMiniAppSessionItem(event=" + this.event + ", appId=" + this.appId + ", duration=" + this.duration + ", sessionUuid=" + this.sessionUuid + ", trackCode=" + this.trackCode + ')';
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem(String str, MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, Integer num, MobileOfficialAppsMiniappsStat$SessionUuidItem mobileOfficialAppsMiniappsStat$SessionUuidItem, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem) {
        this.event = str;
        this.appId = mobileOfficialAppsMiniappsStat$AppIdItem;
        this.duration = num;
        this.sessionUuid = mobileOfficialAppsMiniappsStat$SessionUuidItem;
        this.trackCode = commonStat$TypeTrackCodeItem;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem(java.lang.String r2, com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$AppIdItem r3, java.lang.Integer r4, com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$SessionUuidItem r5, com.vk.stat.scheme.CommonStat$TypeTrackCodeItem r6, int r7, xsna.zcl r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L7
            java.lang.String r2 = "session"
        L7:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Ld
            r3 = r0
        Ld:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            r4 = r0
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            r5 = r0
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppSessionItem.<init>(java.lang.String, com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$AppIdItem, java.lang.Integer, com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$SessionUuidItem, com.vk.stat.scheme.CommonStat$TypeTrackCodeItem, int, xsna.zcl):void");
    }
}
