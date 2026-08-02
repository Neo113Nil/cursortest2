package ru.ozon.app.android.storefront.widgets.appOnboarding.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/appOnboarding/core/AppOnboardingMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppOnboardingWidgetComponent$mapper$2 extends AbstractC7737t implements Function0<AppOnboardingMapper> {
    final /* synthetic */ AppOnboardingWidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppOnboardingWidgetComponent$mapper$2(AppOnboardingWidgetComponent appOnboardingWidgetComponent) {
        super(0);
        this.this$0 = appOnboardingWidgetComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AppOnboardingMapper invoke() {
        return new AppOnboardingMapper(this.this$0.getContext());
    }
}
