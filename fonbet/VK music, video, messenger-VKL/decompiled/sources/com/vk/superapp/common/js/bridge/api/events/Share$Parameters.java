package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Share.kt */
/* loaded from: classes6.dex */
public final class Share$Parameters implements ad6 {

    @pmi0("blob")
    private final String blob;

    @pmi0("link")
    private final String link;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    @pmi0("user_id")
    private final Long userId;

    public Share$Parameters(String str, String str2, String str3, String str4, String str5, Long l, String str6) {
        this.requestId = str;
        this.type = str2;
        this.link = str3;
        this.text = str4;
        this.url = str5;
        this.userId = l;
        this.blob = str6;
    }

    public static final Share$Parameters a(Share$Parameters share$Parameters) {
        return share$Parameters.requestId == null ? new Share$Parameters("default_request_id", share$Parameters.type, share$Parameters.link, share$Parameters.text, share$Parameters.url, share$Parameters.userId, share$Parameters.blob) : share$Parameters;
    }

    public static final void b(Share$Parameters share$Parameters) {
        Long l = share$Parameters.userId;
        if (l != null && l.longValue() < 1) {
            throw new IllegalArgumentException("Value userId cannot be less than 1");
        }
    }

    public static final void c(Share$Parameters share$Parameters) {
        if (share$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String d() {
        return this.blob;
    }

    public final String e() {
        return this.link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Share$Parameters)) {
            return false;
        }
        Share$Parameters share$Parameters = (Share$Parameters) obj;
        return epx.f(this.requestId, share$Parameters.requestId) && epx.f(this.type, share$Parameters.type) && epx.f(this.link, share$Parameters.link) && epx.f(this.text, share$Parameters.text) && epx.f(this.url, share$Parameters.url) && epx.f(this.userId, share$Parameters.userId) && epx.f(this.blob, share$Parameters.blob);
    }

    public final String f() {
        return this.requestId;
    }

    public final String g() {
        return this.text;
    }

    public final String h() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.userId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.blob;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.url;
    }

    public final Long j() {
        return this.userId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", blob=");
        return ho8.a(sb, this.blob, ')');
    }

    public /* synthetic */ Share$Parameters(String str, String str2, String str3, String str4, String str5, Long l, String str6, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str6);
    }
}
