package ru.ozon.app.android.miniapp.webview;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class MiniAppWebView$createWebViewClient$1 extends C7735q implements Function1<ScreenState, Unit> {
    MiniAppWebView$createWebViewClient$1(Object obj) {
        super(1, obj, MiniAppWebView.class, "updateScreenState", "updateScreenState(Lru/ozon/app/android/uikit/screenstate/ScreenState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScreenState screenState) {
        invoke2(screenState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ScreenState p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((MiniAppWebView) this.receiver).updateScreenState(p02);
    }
}
