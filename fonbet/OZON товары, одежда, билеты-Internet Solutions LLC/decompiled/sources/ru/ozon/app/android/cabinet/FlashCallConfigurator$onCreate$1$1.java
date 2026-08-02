package ru.ozon.app.android.cabinet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "phoneNumber", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FlashCallConfigurator$onCreate$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ I $hasPhone;
    final /* synthetic */ FlashCallConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashCallConfigurator$onCreate$1$1(I i11, FlashCallConfigurator flashCallConfigurator) {
        super(1);
        this.$hasPhone = i11;
        this.this$0 = flashCallConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ConfiguratorReferences references;
        InterfaceC7851b controller;
        if (str != null) {
            I i11 = this.$hasPhone;
            FlashCallConfigurator flashCallConfigurator = this.this$0;
            if (!i11.f71783a && (references = flashCallConfigurator.getReferences()) != null && (controller = references.getController()) != null) {
                controller.update(new OnOtpCodeRecieved(str));
            }
            i11.f71783a = true;
        }
    }
}
