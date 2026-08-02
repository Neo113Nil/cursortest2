package ru.ozon.app.android.button.di;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.button.actions.BaseActionConfig;
import ru.ozon.app.android.button.actions.extendDelivery.ExtendDeliveryActionConfig;
import ru.ozon.app.android.button.actions.redirect.CommonRedirectActionConfig;
import ru.ozon.app.android.button.data.ActionButtonDTO;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.cscore.actionButton.presentation.ActionButtonViewModel;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "Lru/ozon/app/android/button/actions/BaseActionConfig;", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActionButtonComponent$Companion$create$1$actions$2 extends AbstractC7737t implements Function0<Map<String, ? extends BaseActionConfig<? extends ActionButtonDTO.ButtonsItem.Action>>> {
    final /* synthetic */ ActionButtonComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionButtonComponent$Companion$create$1$actions$2(ActionButtonComponent$Companion$create$1 actionButtonComponent$Companion$create$1) {
        super(0);
        this.this$0 = actionButtonComponent$Companion$create$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionButtonViewModel invoke$lambda$0(ActionButtonComponent$Companion$create$1 actionButtonComponent$Companion$create$1) {
        NetworkComponentApi networkComponentApi;
        NetworkComponentApi networkComponentApi2;
        networkComponentApi = actionButtonComponent$Companion$create$1.networkComponentApi;
        Object create = networkComponentApi.getRetrofit().create(ComposerActionApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        networkComponentApi2 = actionButtonComponent$Companion$create$1.networkComponentApi;
        return new ActionButtonViewModel((ComposerActionApi) create, networkComponentApi2.getJsonDeserializer());
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends BaseActionConfig<? extends ActionButtonDTO.ButtonsItem.Action>> invoke() {
        NavigationComponentApi navigationComponentApi;
        RetainComposerComponentApi retainComposerComponentApi;
        navigationComponentApi = this.this$0.navigationComponentApi;
        Pair pair = new Pair("common.redirect", new CommonRedirectActionConfig(navigationComponentApi.getOzonRouter()));
        final ActionButtonComponent$Companion$create$1 actionButtonComponent$Companion$create$1 = this.this$0;
        Pc.a aVar = new Pc.a() { // from class: ru.ozon.app.android.button.di.a
            @Override // Pc.a
            public final Object get() {
                ActionButtonViewModel invoke$lambda$0;
                invoke$lambda$0 = ActionButtonComponent$Companion$create$1$actions$2.invoke$lambda$0(ActionButtonComponent$Companion$create$1.this);
                return invoke$lambda$0;
            }
        };
        HandlersInhibitor handlersInhibitor = new HandlersInhibitor();
        retainComposerComponentApi = this.this$0.retainComposerComponentApi;
        return U.j(pair, new Pair("csma.extendDeliveryDate", new ExtendDeliveryActionConfig(aVar, handlersInhibitor, retainComposerComponentApi.getTokenizedAnalytics())));
    }
}
