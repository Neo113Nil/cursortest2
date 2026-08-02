package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.internal.ortb.model.C2787a;
import com.moloco.sdk.internal.ortb.model.C2788b;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final class f implements c {
    public static final int g = 0;
    public final int a;
    public final Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Function0<Unit>, y, Dp, Boolean, View> b;
    public final int c;
    public final Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> d;
    public final C2787a e;
    public final C2788b f;

    public static final class a implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public static final a a = new a();

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(48977993);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(48977993, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.AdWebViewOptions.<init>.<anonymous> (AdRenderingOptions.kt:27)");
            }
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public f() {
        this(0, null, 0, null, null, null, 63, null);
    }

    public final Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Function0<Unit>, y, Dp, Boolean, View> a() {
        return this.b;
    }

    public final C2787a b() {
        return this.e;
    }

    public final C2788b c() {
        return this.f;
    }

    public final int d() {
        return this.a;
    }

    public final Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> e() {
        return this.d;
    }

    public final int f() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(int i, Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super y, ? super Dp, ? super Boolean, ? extends View> adWebViewRenderer, int i2, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> decClose, C2787a c2787a, C2788b c2788b) {
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Intrinsics.checkNotNullParameter(decClose, "decClose");
        this.a = i;
        this.b = adWebViewRenderer;
        this.c = i2;
        this.d = decClose;
        this.e = c2787a;
        this.f = c2788b;
    }

    public /* synthetic */ f(int i, Function10 function10, int i2, Function2 function2, C2787a c2787a, C2788b c2788b, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(0L, null, 3, null) : function10, (i3 & 4) != 0 ? 5 : i2, (i3 & 8) != 0 ? a.a : function2, (i3 & 16) != 0 ? null : c2787a, (i3 & 32) != 0 ? null : c2788b);
    }
}
