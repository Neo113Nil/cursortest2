package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShowVKRunNotification.kt */
/* loaded from: classes6.dex */
public final class ShowVKRunNotification$Parameters implements ad6 {

    @pmi0("deeplink")
    private final String deeplink;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final String image;

    @pmi0("method_status")
    private final Boolean methodStatus;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("target")
    private final Integer target;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    public ShowVKRunNotification$Parameters(String str, Boolean bool, String str2, Integer num, String str3, String str4, String str5, String str6) {
        this.requestId = str;
        this.methodStatus = bool;
        this.id = str2;
        this.target = num;
        this.image = str3;
        this.title = str4;
        this.type = str5;
        this.deeplink = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowVKRunNotification$Parameters)) {
            return false;
        }
        ShowVKRunNotification$Parameters showVKRunNotification$Parameters = (ShowVKRunNotification$Parameters) obj;
        return epx.f(this.requestId, showVKRunNotification$Parameters.requestId) && epx.f(this.methodStatus, showVKRunNotification$Parameters.methodStatus) && epx.f(this.id, showVKRunNotification$Parameters.id) && epx.f(this.target, showVKRunNotification$Parameters.target) && epx.f(this.image, showVKRunNotification$Parameters.image) && epx.f(this.title, showVKRunNotification$Parameters.title) && epx.f(this.type, showVKRunNotification$Parameters.type) && epx.f(this.deeplink, showVKRunNotification$Parameters.deeplink);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Boolean bool = this.methodStatus;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.id;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.target;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.image;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deeplink;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", methodStatus=");
        sb.append(this.methodStatus);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", deeplink=");
        return ho8.a(sb, this.deeplink, ')');
    }

    public /* synthetic */ ShowVKRunNotification$Parameters(String str, Boolean bool, String str2, Integer num, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
    }
}
