package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ConfirmDeleteOtpBinder$setView$1 extends C7735q implements Function1<String, Unit> {
    ConfirmDeleteOtpBinder$setView$1(Object obj) {
        super(1, obj, ConfirmDeleteOtpViewModel.class, "onValidateCode", "onValidateCode(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ConfirmDeleteOtpViewModel) this.receiver).onValidateCode(p02);
    }
}
