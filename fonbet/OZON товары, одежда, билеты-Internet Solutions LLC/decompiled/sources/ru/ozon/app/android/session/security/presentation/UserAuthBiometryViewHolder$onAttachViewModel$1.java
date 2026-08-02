package ru.ozon.app.android.session.security.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class UserAuthBiometryViewHolder$onAttachViewModel$1 extends C7735q implements Function1<UserAuthBiometryEvent, Unit> {
    UserAuthBiometryViewHolder$onAttachViewModel$1(Object obj) {
        super(1, obj, UserAuthBiometryViewHolder.class, "onEvent", "onEvent(Lru/ozon/app/android/session/security/presentation/UserAuthBiometryEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UserAuthBiometryEvent userAuthBiometryEvent) {
        invoke2(userAuthBiometryEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UserAuthBiometryEvent p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((UserAuthBiometryViewHolder) this.receiver).onEvent(p02);
    }
}
