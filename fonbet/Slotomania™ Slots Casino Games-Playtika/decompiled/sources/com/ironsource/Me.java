package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Me implements J8 {
    @Override // com.ironsource.J8
    public void a(Context context, String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, i);
    }

    @Override // com.ironsource.J8
    public int b(Context context, String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, i);
    }

    @Override // com.ironsource.J8
    public void a(Context context, String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, j);
    }

    @Override // com.ironsource.J8
    public long b(Context context, String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, j);
    }
}
