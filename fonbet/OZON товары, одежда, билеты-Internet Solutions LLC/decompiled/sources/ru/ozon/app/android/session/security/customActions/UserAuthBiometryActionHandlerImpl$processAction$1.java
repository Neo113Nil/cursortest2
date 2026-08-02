package ru.ozon.app.android.session.security.customActions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/security/presentation/UserAuthBiometryEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UserAuthBiometryActionHandlerImpl$processAction$1 extends AbstractC7737t implements Function1<UserAuthBiometryEvent, Unit> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ UserAuthBiometryActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAuthBiometryActionHandlerImpl$processAction$1(UserAuthBiometryActionHandlerImpl userAuthBiometryActionHandlerImpl, AtomAction atomAction, ComposerReferences composerReferences) {
        super(1);
        this.this$0 = userAuthBiometryActionHandlerImpl;
        this.$action = atomAction;
        this.$refs = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UserAuthBiometryEvent userAuthBiometryEvent) {
        invoke2(userAuthBiometryEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UserAuthBiometryEvent userAuthBiometryEvent) {
        UserAuthBiometryActionHandlerImpl userAuthBiometryActionHandlerImpl = this.this$0;
        AtomAction.Click click = (AtomAction.Click) this.$action;
        Intrinsics.f(userAuthBiometryEvent);
        userAuthBiometryActionHandlerImpl.onEvent(click, userAuthBiometryEvent, this.$refs);
    }
}
