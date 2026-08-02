package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OpenApp.kt */
/* loaded from: classes6.dex */
public final class OpenApp$Parameters implements ad6 {

    @pmi0("app_id")
    private final long appId;

    @pmi0("app_is_local")
    private final Boolean appIsLocal;

    @pmi0("close_parent")
    private final Boolean closeParent;

    @pmi0("group_id")
    private final Long groupId;

    @pmi0("location")
    private final String location;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public OpenApp$Parameters(long j, String str, String str2, Long l, Boolean bool, Boolean bool2) {
        this.appId = j;
        this.requestId = str;
        this.location = str2;
        this.groupId = l;
        this.closeParent = bool;
        this.appIsLocal = bool2;
    }

    public static final OpenApp$Parameters a(OpenApp$Parameters openApp$Parameters) {
        return openApp$Parameters.requestId == null ? new OpenApp$Parameters(openApp$Parameters.appId, "default_request_id", openApp$Parameters.location, openApp$Parameters.groupId, openApp$Parameters.closeParent, openApp$Parameters.appIsLocal) : openApp$Parameters;
    }

    public static final void b(OpenApp$Parameters openApp$Parameters) {
        if (openApp$Parameters.appId < 1) {
            throw new IllegalArgumentException("Value appId cannot be less than 1");
        }
    }

    public static final void c(OpenApp$Parameters openApp$Parameters) {
        Long l = openApp$Parameters.groupId;
        if (l != null && l.longValue() < 1) {
            throw new IllegalArgumentException("Value groupId cannot be less than 1");
        }
    }

    public static final void d(OpenApp$Parameters openApp$Parameters) {
        if (openApp$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final long e() {
        return this.appId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenApp$Parameters)) {
            return false;
        }
        OpenApp$Parameters openApp$Parameters = (OpenApp$Parameters) obj;
        return this.appId == openApp$Parameters.appId && epx.f(this.requestId, openApp$Parameters.requestId) && epx.f(this.location, openApp$Parameters.location) && epx.f(this.groupId, openApp$Parameters.groupId) && epx.f(this.closeParent, openApp$Parameters.closeParent) && epx.f(this.appIsLocal, openApp$Parameters.appIsLocal);
    }

    public final Boolean f() {
        return this.closeParent;
    }

    public final Long g() {
        return this.groupId;
    }

    public final String h() {
        return this.location;
    }

    public final int hashCode() {
        int a = urd0.a(Long.hashCode(this.appId) * 31, 31, this.requestId);
        String str = this.location;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.groupId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.closeParent;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.appIsLocal;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String i() {
        return this.requestId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(appId=");
        sb.append(this.appId);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", closeParent=");
        sb.append(this.closeParent);
        sb.append(", appIsLocal=");
        return tn.a(sb, this.appIsLocal, ')');
    }

    public /* synthetic */ OpenApp$Parameters(long j, String str, String str2, Long l, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(j, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2);
    }
}
