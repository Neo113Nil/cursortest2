package com.moloco.sdk.internal.services;

import android.content.Context;
import com.moloco.sdk.common_adapter_internal.ScreenData;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G implements F {
    public static final int b = 8;
    public final Context a;

    public G(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.internal.services.F
    public E a() {
        ScreenData invoke = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.a(this.a).invoke();
        float widthDp = invoke.getWidthDp();
        return new E(invoke.getWidthPx(), widthDp, invoke.getHeightPx(), invoke.getHeightDp(), invoke.getPxRatio(), invoke.getDpi(), this.a.getResources().getDisplayMetrics().xdpi, this.a.getResources().getDisplayMetrics().ydpi);
    }

    @Override // com.moloco.sdk.internal.services.F
    public H b() {
        int i = this.a.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? H.a : H.c : H.b;
    }

    public final Context c() {
        return this.a;
    }

    @Override // com.moloco.sdk.internal.services.F
    @Deprecated(message = "Use screenInfo() instead", replaceWith = @ReplaceWith(expression = "screenInfo()", imports = {}))
    public E invoke() {
        return a();
    }
}
