package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2838s implements r {
    public static final int b = 8;
    public final Context a;

    public C2838s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r
    public boolean a(String uri) {
        boolean b2;
        Intrinsics.checkNotNullParameter(uri, "uri");
        b2 = C2839t.b(this.a, uri);
        return b2;
    }
}
