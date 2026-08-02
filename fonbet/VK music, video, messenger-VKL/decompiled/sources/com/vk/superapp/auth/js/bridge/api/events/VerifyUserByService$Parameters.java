package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VerifyUserByService.kt */
/* loaded from: classes6.dex */
public final class VerifyUserByService$Parameters implements ad6 {

    @pmi0("provider_app_links")
    private final List<String> providerAppLinks;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("service")
    private final String service;

    public VerifyUserByService$Parameters(String str, String str2, List<String> list) {
        this.requestId = str;
        this.service = str2;
        this.providerAppLinks = list;
    }

    public static final VerifyUserByService$Parameters a(VerifyUserByService$Parameters verifyUserByService$Parameters) {
        return verifyUserByService$Parameters.requestId == null ? new VerifyUserByService$Parameters("default_request_id", verifyUserByService$Parameters.service, verifyUserByService$Parameters.providerAppLinks) : verifyUserByService$Parameters;
    }

    public static final void b(VerifyUserByService$Parameters verifyUserByService$Parameters) {
        if (verifyUserByService$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
        if (verifyUserByService$Parameters.service == null) {
            throw new IllegalArgumentException("Value of non-nullable member service cannot be\n                        null");
        }
    }

    public final List<String> c() {
        return this.providerAppLinks;
    }

    public final String d() {
        return this.requestId;
    }

    public final String e() {
        return this.service;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyUserByService$Parameters)) {
            return false;
        }
        VerifyUserByService$Parameters verifyUserByService$Parameters = (VerifyUserByService$Parameters) obj;
        return epx.f(this.requestId, verifyUserByService$Parameters.requestId) && epx.f(this.service, verifyUserByService$Parameters.service) && epx.f(this.providerAppLinks, verifyUserByService$Parameters.providerAppLinks);
    }

    public final int hashCode() {
        int a = urd0.a(this.requestId.hashCode() * 31, 31, this.service);
        List<String> list = this.providerAppLinks;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", providerAppLinks=");
        return ms9.a(')', sb, this.providerAppLinks);
    }

    public /* synthetic */ VerifyUserByService$Parameters(String str, String str2, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}
