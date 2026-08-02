package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SetLocation.kt */
/* loaded from: classes6.dex */
public final class SetLocation$Parameters implements ad6 {

    @pmi0("location")
    private final String location;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public SetLocation$Parameters(String str, String str2) {
        this.location = str;
        this.requestId = str2;
    }

    public static final SetLocation$Parameters a(SetLocation$Parameters setLocation$Parameters) {
        return setLocation$Parameters.requestId == null ? new SetLocation$Parameters(setLocation$Parameters.location, "default_request_id") : setLocation$Parameters;
    }

    public static final void b(SetLocation$Parameters setLocation$Parameters) {
        if (setLocation$Parameters.location == null) {
            throw new IllegalArgumentException("Value of non-nullable member location cannot be\n                        null");
        }
        if (setLocation$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetLocation$Parameters)) {
            return false;
        }
        SetLocation$Parameters setLocation$Parameters = (SetLocation$Parameters) obj;
        return epx.f(this.location, setLocation$Parameters.location) && epx.f(this.requestId, setLocation$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.location.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(location=");
        sb.append(this.location);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
