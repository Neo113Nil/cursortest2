package ru.ozon.app.android.geo.map.presentation;

import A00.a;
import i10.k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.geo.map.di.AddressEditMapComponent;
import ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsSender;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class AddressEditMapConfigurator$onComposerInitialized$1$1 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ ConfiguratorReferences $refs;
    final /* synthetic */ AddressEditMapConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapConfigurator$onComposerInitialized$1$1(ConfiguratorReferences configuratorReferences, AddressEditMapConfigurator addressEditMapConfigurator) {
        super(1);
        this.$refs = configuratorReferences;
        this.this$0 = addressEditMapConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a aVar) {
        k.a<l> e11;
        String d11;
        MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender;
        C7475g composerWidgetComponentStorage;
        if (!(aVar instanceof a.o) || (e11 = ((RetainComposerComponentApi) this.$refs.getComposerWidgetComponentStorage().getComponent(RetainComposerComponentApi.class)).getComposerStore().b().e()) == null || (d11 = e11.d()) == null) {
            return;
        }
        ConfiguratorReferences references = this.this$0.getReferences();
        AddressEditMapComponent addressEditMapComponent = (AddressEditMapComponent) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(AddressEditMapComponent.class));
        if (addressEditMapComponent == null || (mapPerformanceAnalyticsSender = addressEditMapComponent.getMapPerformanceAnalyticsSender()) == null) {
            return;
        }
        mapPerformanceAnalyticsSender.saveTrace(d11);
    }
}
