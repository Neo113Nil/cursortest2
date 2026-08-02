package ru.ozon.app.android.storefront.widgets.appOnboarding.core;

import GZ.g;
import LZ.b;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import pZ.e;
import qZ.InterfaceC9014f;
import rZ.C9236a;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingWidgetComponent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "deeplink", "Landroid/net/Uri;", "referrer", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$6$1 extends AbstractC7737t implements Function2<Uri, Uri, Unit> {
    final /* synthetic */ AppOnboardingWidgetComponent $component;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$6$1(AppOnboardingWidgetComponent appOnboardingWidgetComponent) {
        super(2);
        this.$component = appOnboardingWidgetComponent;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Uri uri, Uri uri2) {
        invoke2(uri, uri2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Uri deeplink, Uri referrer) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        AppOnboardingComposeWidgetKt.associateReferrer(this.$component.getAppLaunchAnalytics(), deeplink, referrer);
        g router = this.$component.getRouter();
        InterfaceC9014f absent = FlowTag.INSTANCE.getABSENT();
        String uri = deeplink.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        router.c(new b(new C9236a(absent, new e(uri))), null);
    }
}
