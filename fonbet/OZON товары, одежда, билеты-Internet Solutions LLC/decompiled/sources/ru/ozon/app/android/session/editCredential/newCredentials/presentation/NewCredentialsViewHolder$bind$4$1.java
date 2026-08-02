package ru.ozon.app.android.session.editCredential.newCredentials.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerNavigator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NewCredentialsViewHolder$bind$4$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ NewCredentialsVO $item;
    final /* synthetic */ NewCredentialsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewCredentialsViewHolder$bind$4$1(NewCredentialsViewHolder newCredentialsViewHolder, NewCredentialsVO newCredentialsVO) {
        super(0);
        this.this$0 = newCredentialsViewHolder;
        this.$item = newCredentialsVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerNavigator composerNavigator;
        composerNavigator = this.this$0.navigator;
        String secondaryButtonDeeplink = this.$item.getSecondaryButtonDeeplink();
        if (secondaryButtonDeeplink == null) {
            secondaryButtonDeeplink = "";
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, secondaryButtonDeeplink, null, 2, null);
    }
}
