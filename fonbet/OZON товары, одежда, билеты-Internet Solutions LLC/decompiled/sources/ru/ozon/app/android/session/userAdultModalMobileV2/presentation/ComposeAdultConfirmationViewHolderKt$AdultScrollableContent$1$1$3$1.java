package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import j1.r;
import j1.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj1/v;", "focusState", "", "invoke", "(Lj1/v;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ComposeAdultConfirmationViewHolderKt$AdultScrollableContent$1$1$3$1 extends AbstractC7737t implements Function1<v, Unit> {
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeAdultConfirmationViewHolderKt$AdultScrollableContent$1$1$3$1(r rVar, Function0<Unit> function0) {
        super(1);
        this.$focusRequester = rVar;
        this.$onClick = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(v vVar) {
        invoke2(vVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(v focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (focusState.a()) {
            this.$focusRequester.e();
            this.$onClick.invoke();
        }
    }
}
