package ru.ozon.app.android.ugc.widgets.profileHeader.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileHeaderViewHolder$bindHeader$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ProfileHeaderViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.profileHeader.presentation.ProfileHeaderViewHolder$bindHeader$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AtomAction $action;
        final /* synthetic */ ProfileHeaderViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ProfileHeaderViewHolder profileHeaderViewHolder, AtomAction atomAction) {
            super(0);
            this.this$0 = profileHeaderViewHolder;
            this.$action = atomAction;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function1 function1;
            function1 = this.this$0.actionHandler;
            function1.invoke(this.$action);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileHeaderViewHolder$bindHeader$1(ProfileHeaderViewHolder profileHeaderViewHolder) {
        super(1);
        this.this$0 = profileHeaderViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 function1;
        HandlersInhibitor handlersInhibitor;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Click) {
            handlersInhibitor = this.this$0.inhibitor;
            handlersInhibitor.run(1000L, new AnonymousClass1(this.this$0, action));
        } else {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
        }
    }
}
