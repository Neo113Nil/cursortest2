package ru.ozon.app.android.travel.pageconfigurator.modalParentRefresh;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "model", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel$RefreshModel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel$RefreshModel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ModalParentRefreshConfigurator$onComposerInitialized$1 extends AbstractC7737t implements Function1<ModalParentRefreshSharedViewModel.RefreshModel, Unit> {
    final /* synthetic */ ConfiguratorReferences $refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalParentRefreshConfigurator$onComposerInitialized$1(ConfiguratorReferences configuratorReferences) {
        super(1);
        this.$refs = configuratorReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ModalParentRefreshSharedViewModel.RefreshModel refreshModel) {
        invoke2(refreshModel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ModalParentRefreshSharedViewModel.RefreshModel refreshModel) {
        InterfaceC7851b controller = this.$refs.getController();
        String refreshUrl = refreshModel.getRefreshUrl();
        String originUrl = refreshModel.getOriginUrl();
        InterfaceC7851b.a.a(controller, refreshUrl, originUrl != null ? C2454a.b("from", originUrl) : null, null, null, 12);
    }
}
