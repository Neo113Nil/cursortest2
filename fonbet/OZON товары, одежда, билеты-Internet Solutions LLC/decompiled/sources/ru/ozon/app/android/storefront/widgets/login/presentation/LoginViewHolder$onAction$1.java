package ru.ozon.app.android.storefront.widgets.login.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LoginViewHolder$onAction$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ LoginViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginViewHolder$onAction$1(LoginViewHolder loginViewHolder) {
        super(1);
        this.this$0 = loginViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        composerReferences = this.this$0.composerRefs;
        InterfaceC7851b.a.a(composerReferences.getController(), it.getLink(), null, null, null, 14);
    }
}
