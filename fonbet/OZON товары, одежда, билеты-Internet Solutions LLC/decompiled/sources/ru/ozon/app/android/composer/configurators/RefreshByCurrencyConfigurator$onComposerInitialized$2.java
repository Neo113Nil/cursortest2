package ru.ozon.app.android.composer.configurators;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RefreshByCurrencyConfigurator$onComposerInitialized$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ RefreshByCurrencyConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshByCurrencyConfigurator$onComposerInitialized$2(RefreshByCurrencyConfigurator refreshByCurrencyConfigurator) {
        super(1);
        this.this$0 = refreshByCurrencyConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        InterfaceC7851b controller;
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.e(controller, null, null, null, 7);
    }
}
