package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppOnboardingWidgetKt$AppOnboardingWidget$6$1 extends AbstractC7737t implements Function2<Uri, Uri, Unit> {
    public static final AppOnboardingWidgetKt$AppOnboardingWidget$6$1 INSTANCE = new AppOnboardingWidgetKt$AppOnboardingWidget$6$1();

    AppOnboardingWidgetKt$AppOnboardingWidget$6$1() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Uri dd, Uri rr) {
        Intrinsics.checkNotNullParameter(dd, "dd");
        Intrinsics.checkNotNullParameter(rr, "rr");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Uri uri, Uri uri2) {
        invoke2(uri, uri2);
        return Unit.f71690a;
    }
}
