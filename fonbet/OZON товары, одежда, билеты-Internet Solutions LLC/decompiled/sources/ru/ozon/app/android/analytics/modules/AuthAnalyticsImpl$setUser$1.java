package ru.ozon.app.android.analytics.modules;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.datalayer.AnalyticsUser;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AuthAnalyticsImpl$setUser$1 extends AbstractC7737t implements Function1<AnalyticsDataLayer, Unit> {
    final /* synthetic */ User $user;
    final /* synthetic */ AuthAnalyticsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthAnalyticsImpl$setUser$1(AuthAnalyticsImpl authAnalyticsImpl, User user) {
        super(1);
        this.this$0 = authAnalyticsImpl;
        this.$user = user;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnalyticsDataLayer analyticsDataLayer) {
        invoke2(analyticsDataLayer);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AnalyticsDataLayer modifyDataLayer) {
        ComposerLocationRepository composerLocationRepository;
        AnalyticsUser mapToAnalyticsUser;
        Intrinsics.checkNotNullParameter(modifyDataLayer, "$this$modifyDataLayer");
        AnalyticsUser user = modifyDataLayer.getUser();
        if (user != null) {
            AuthAnalyticsImpl authAnalyticsImpl = this.this$0;
            User user2 = this.$user;
            composerLocationRepository = authAnalyticsImpl.areaRepository;
            mapToAnalyticsUser = authAnalyticsImpl.mapToAnalyticsUser(user, user2, composerLocationRepository.getCurrentAreaId());
            modifyDataLayer.setUser(mapToAnalyticsUser);
        }
    }
}
