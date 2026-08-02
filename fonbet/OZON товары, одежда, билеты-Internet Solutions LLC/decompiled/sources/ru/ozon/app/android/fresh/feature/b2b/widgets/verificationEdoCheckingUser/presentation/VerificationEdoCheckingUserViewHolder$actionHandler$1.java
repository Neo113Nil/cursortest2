package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class VerificationEdoCheckingUserViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ VerificationEdoCheckingUserViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "queries", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation.VerificationEdoCheckingUserViewHolder$actionHandler$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ AtomAction $action;
        final /* synthetic */ VerificationEdoCheckingUserViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AtomAction atomAction, VerificationEdoCheckingUserViewHolder verificationEdoCheckingUserViewHolder) {
            super(1);
            this.$action = atomAction;
            this.this$0 = verificationEdoCheckingUserViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String queries) {
            Intrinsics.checkNotNullParameter(queries, "queries");
            String link = ((AtomAction.DismissRedirect) this.$action).getLink();
            if (link != null) {
                this.this$0.openOperatorVerification(link, queries);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationEdoCheckingUserViewHolder$actionHandler$1(VerificationEdoCheckingUserViewHolder verificationEdoCheckingUserViewHolder) {
        super(1);
        this.this$0 = verificationEdoCheckingUserViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        VerificationEdoCheckingUserViewModel verificationEdoCheckingUserViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.DismissRedirect)) {
            return Boolean.FALSE;
        }
        verificationEdoCheckingUserViewModel = this.this$0.viewModel;
        verificationEdoCheckingUserViewModel.validatedFields(new AnonymousClass1(action, this.this$0));
        return Boolean.TRUE;
    }
}
