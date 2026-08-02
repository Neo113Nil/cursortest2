package ru.ozon.app.android.storefront.onboardingscreen.domain;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractorImpl", f = "OnboardingInteractorImpl.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "callOnBoardingCheckerWithAction-IoAF18A")
/* loaded from: classes7.dex */
final class OnboardingInteractorImpl$callOnBoardingCheckerWithAction$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingInteractorImpl$callOnBoardingCheckerWithAction$1(OnboardingInteractorImpl onboardingInteractorImpl, d<? super OnboardingInteractorImpl$callOnBoardingCheckerWithAction$1> dVar) {
        super(dVar);
        this.this$0 = onboardingInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo1021callOnBoardingCheckerWithActionIoAF18A = this.this$0.mo1021callOnBoardingCheckerWithActionIoAF18A(this);
        return mo1021callOnBoardingCheckerWithActionIoAF18A == a.COROUTINE_SUSPENDED ? mo1021callOnBoardingCheckerWithActionIoAF18A : r.a(mo1021callOnBoardingCheckerWithActionIoAF18A);
    }
}
