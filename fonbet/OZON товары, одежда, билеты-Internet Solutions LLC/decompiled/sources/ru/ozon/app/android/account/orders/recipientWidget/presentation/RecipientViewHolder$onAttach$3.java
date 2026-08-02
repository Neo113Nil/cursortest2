package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.update.SaveRecipientButtonEnabledUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isEnabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RecipientViewHolder$onAttach$3 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ RecipientViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecipientViewHolder$onAttach$3(RecipientViewHolder recipientViewHolder) {
        super(1);
        this.this$0 = recipientViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        ComposerReferences composerReferences;
        RecipientVO boundData = this.this$0.getBoundData();
        if (boundData == null || Intrinsics.d(boundData.getSaveButton().isDisabled(), bool)) {
            composerReferences = this.this$0.composerRefs;
            InterfaceC7851b controller = composerReferences.getController();
            Intrinsics.f(bool);
            controller.update(new SaveRecipientButtonEnabledUpdateKey(bool.booleanValue()));
        }
    }
}
