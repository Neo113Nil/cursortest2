package ru.ozon.app.android.session.session.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.session.presentation.viewModel.SessionViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SessionViewHolder$actionHandler$1 extends C7735q implements Function1<AtomAction.ComposerAction, Unit> {
    SessionViewHolder$actionHandler$1(Object obj) {
        super(1, obj, SessionViewModel.class, "onLogoutButtonClicked", "onLogoutButtonClicked(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SessionViewModel) this.receiver).onLogoutButtonClicked(p02);
    }
}
