package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda-1$1$3$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$3$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ C4911f $localOwnerContainer;
    final /* synthetic */ BirthdateStateUi $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$3$1(C4911f c4911f, BirthdateStateUi birthdateStateUi) {
        super(0);
        this.$localOwnerContainer = c4911f;
        this.$state = birthdateStateUi;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposeAdultConfirmationViewHolderKt.openDatePickerFragment(this.$localOwnerContainer, ((BirthdateStateUi.ConfirmBirthdate) this.$state).getBirthDateRequestValue());
    }
}
