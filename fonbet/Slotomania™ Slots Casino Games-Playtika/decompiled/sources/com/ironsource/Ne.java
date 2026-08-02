package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Ne implements Oe {
    @Override // com.ironsource.Oe
    public void a(Context context, String key, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, z);
    }
}
