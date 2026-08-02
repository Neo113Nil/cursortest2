package ru.ozon.app.android.select.feature.entry;

import EZ.h;
import GZ.g;
import Sc.s;
import Wc.a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.appOnboarding.deeplinkhandler.AppOnboardingDeeplinkHandler;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;
import xZ.C10683b;
import xe.B0;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.select.feature.entry.OzonSelectActivity$onCreate$3", f = "OzonSelectActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OzonSelectActivity$onCreate$3 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    final /* synthetic */ C10683b $navigator;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ OzonSelectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonSelectActivity$onCreate$3(OzonSelectActivity ozonSelectActivity, C10683b c10683b, d<? super OzonSelectActivity$onCreate$3> dVar) {
        super(2, dVar);
        this.this$0 = ozonSelectActivity;
        this.$navigator = c10683b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        OzonSelectActivity$onCreate$3 ozonSelectActivity$onCreate$3 = new OzonSelectActivity$onCreate$3(this.this$0, this.$navigator, dVar);
        ozonSelectActivity$onCreate$3.Z$0 = ((Boolean) obj).booleanValue();
        return ozonSelectActivity$onCreate$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        h hVar;
        AppOnboardingViewModel appOnboardingViewModel;
        OzonSelectViewModel viewModel;
        B0 b02;
        AppOnboardingViewModel appOnboardingViewModel2;
        g gVar;
        AppOnboardingViewModel appOnboardingViewModel3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.Z$0) {
            atomicBoolean = this.this$0.splashScreenExitHandled;
            atomicBoolean.set(true);
            hVar = this.this$0.holder;
            if (hVar == null) {
                Intrinsics.n("holder");
                throw null;
            }
            yZ.h.a(this.$navigator, hVar, this.this$0);
            this.this$0.getExternalDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().navigate(this.this$0.getIntent());
            appOnboardingViewModel = this.this$0.getAppOnboardingViewModel();
            if (appOnboardingViewModel.isShown()) {
                this.this$0.notifyAppHostNotificationUiReady();
            } else {
                if (this.this$0.getExternalDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().hasExternalDeeplink(this.this$0.getIntent())) {
                    appOnboardingViewModel3 = this.this$0.getAppOnboardingViewModel();
                    appOnboardingViewModel3.setRedirectData(this.this$0.getExternalDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().getDeeplink(this.this$0.getIntent()), this.this$0.getExternalDeeplinkDelegate$entry_prodGoogleAllVendorsRelease().getReferrer(this.this$0.getIntent()));
                }
                appOnboardingViewModel2 = this.this$0.getAppOnboardingViewModel();
                appOnboardingViewModel2.markAsWizard();
                gVar = this.this$0.router;
                if (gVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                String uri = AppOnboardingDeeplinkHandler.INSTANCE.getDeeplink().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                g.a.a(gVar, uri, null, null, 6);
            }
            viewModel = this.this$0.getViewModel();
            if (!viewModel.isFakeSplashShowed()) {
                this.this$0.notifyAppHostUiReady();
            }
            b02 = this.this$0.navigationEventJob;
            if (b02 != null) {
                b02.j(null);
            }
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((OzonSelectActivity$onCreate$3) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
