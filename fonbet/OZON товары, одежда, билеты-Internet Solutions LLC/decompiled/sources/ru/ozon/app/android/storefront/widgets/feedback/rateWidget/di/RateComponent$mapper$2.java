package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/core/RateMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateComponent$mapper$2 extends AbstractC7737t implements Function0<RateMapper> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateComponent$mapper$2(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RateMapper invoke() {
        return new RateMapper(((AndroidPlatformComponentApi) this.$storage.getComponent(AndroidPlatformComponentApi.class)).getAppType());
    }
}
