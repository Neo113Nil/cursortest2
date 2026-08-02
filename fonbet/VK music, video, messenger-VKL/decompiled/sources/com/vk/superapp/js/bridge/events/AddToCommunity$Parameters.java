package com.vk.superapp.js.bridge.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AddToCommunity.kt */
/* loaded from: classes6.dex */
public final class AddToCommunity$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    /* JADX WARN: Multi-variable type inference failed */
    public AddToCommunity$Parameters() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddToCommunity$Parameters) && epx.f(this.requestId, ((AddToCommunity$Parameters) obj).requestId);
    }

    public final int hashCode() {
        String str = this.requestId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }

    public AddToCommunity$Parameters(String str) {
        this.requestId = str;
    }

    public /* synthetic */ AddToCommunity$Parameters(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
