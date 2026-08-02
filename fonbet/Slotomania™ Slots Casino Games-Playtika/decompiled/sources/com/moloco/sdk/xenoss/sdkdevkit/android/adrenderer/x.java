package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import com.moloco.sdk.internal.ortb.model.C2787a;
import com.moloco.sdk.internal.ortb.model.C2788b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class x implements c {
    public static final int k = 0;
    public final boolean a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final Function2<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> h;
    public final C2787a i;
    public final C2788b j;

    public x() {
        this(false, null, 0, 0, 0, false, false, null, null, null, 1023, null);
    }

    public final C2787a a() {
        return this.i;
    }

    public final C2788b b() {
        return this.j;
    }

    public final boolean c() {
        return this.g;
    }

    public final boolean d() {
        return this.f;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.e;
    }

    public final Boolean g() {
        return this.b;
    }

    public final int h() {
        return this.c;
    }

    public final boolean i() {
        return this.a;
    }

    public final Function2<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> j() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(boolean z, Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> VastRenderer, C2787a c2787a, C2788b c2788b) {
        Intrinsics.checkNotNullParameter(VastRenderer, "VastRenderer");
        this.a = z;
        this.b = bool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z2;
        this.g = z3;
        this.h = VastRenderer;
        this.i = c2787a;
        this.j = c2788b;
    }

    public /* synthetic */ x(boolean z, Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, Function2 function2, C2787a c2787a, C2788b c2788b, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? 5 : i, (i4 & 8) != 0 ? 5 : i2, (i4 & 16) == 0 ? i3 : 5, (i4 & 32) != 0 ? false : z2, (i4 & 64) == 0 ? z3 : false, (i4 & 128) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(0L, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i) null, (Function2) null, (Function2) null, (Function2) null, (Q) null, false, 4095, (Object) null) : function2, (i4 & 256) != 0 ? null : c2787a, (i4 & 512) != 0 ? null : c2788b);
    }
}
