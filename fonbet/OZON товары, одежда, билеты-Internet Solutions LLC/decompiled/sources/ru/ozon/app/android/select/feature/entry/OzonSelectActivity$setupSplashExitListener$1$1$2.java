package ru.ozon.app.android.select.feature.entry;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.select.feature.entry.splash.view.SelectSplashScreenView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OzonSelectActivity$setupSplashExitListener$1$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ OzonSelectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonSelectActivity$setupSplashExitListener$1$1$2(OzonSelectActivity ozonSelectActivity) {
        super(0);
        this.this$0 = ozonSelectActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SelectSplashScreenView selectSplashScreenView;
        View decorView = this.this$0.getWindow().getDecorView();
        Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        selectSplashScreenView = this.this$0.selectSplashView;
        if (selectSplashScreenView == null) {
            Intrinsics.n("selectSplashView");
            throw null;
        }
        viewGroup.removeView(selectSplashScreenView);
        this.this$0.notifyAppHostUiReady();
    }
}
