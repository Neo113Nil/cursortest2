package com.braze.storage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final y2 f765a;

    public w2(Context context, String userId, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f765a = new y2(context, userId, apiKey);
    }
}
