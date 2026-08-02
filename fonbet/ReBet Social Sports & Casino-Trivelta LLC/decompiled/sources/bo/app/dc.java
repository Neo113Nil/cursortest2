package bo.app;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dc extends k1 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dc(String campaignId, long j10) {
        super(r2, r3, j10, 8);
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        w7 w7Var = w7.f26166I;
        JSONObject put = new JSONObject().put("cid", campaignId);
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
    }
}
