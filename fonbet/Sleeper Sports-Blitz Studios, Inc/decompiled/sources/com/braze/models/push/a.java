package com.braze.models.push;

import com.braze.enums.d;
import com.braze.models.outgoing.event.b;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a extends b {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String campaignId, long j) {
        super(r2, r3, j, 8);
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        d dVar = d.H;
        JSONObject put = new JSONObject().put("cid", campaignId);
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
    }

    public final String f() {
        String string = this.b.getString("cid");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
