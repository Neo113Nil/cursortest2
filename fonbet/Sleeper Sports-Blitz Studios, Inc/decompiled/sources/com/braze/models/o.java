package com.braze.models;

import com.braze.support.DateTimeUtils;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class o implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final String f638a;
    public final long b;

    public o(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        Intrinsics.checkNotNullParameter(log, "log");
        this.f638a = log;
        this.b = nowInMilliseconds;
    }

    public final String c() {
        return this.f638a;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        return new JSONObject().put("log", this.f638a).put(CodePushConstants.LATEST_ROLLBACK_TIME_KEY, this.b);
    }
}
