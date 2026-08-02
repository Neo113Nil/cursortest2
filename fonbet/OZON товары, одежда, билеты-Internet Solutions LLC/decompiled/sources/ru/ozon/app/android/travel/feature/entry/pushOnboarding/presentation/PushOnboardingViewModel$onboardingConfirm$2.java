package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import Ae.w0;
import He.b;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingViewModel;
import xe.C10720e0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingViewModel$onboardingConfirm$2", f = "PushOnboardingViewModel.kt", l = {49, 50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PushOnboardingViewModel$onboardingConfirm$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ PushOnboardingViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingViewModel$onboardingConfirm$2$1", f = "PushOnboardingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingViewModel$onboardingConfirm$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ PushOnboardingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PushOnboardingViewModel pushOnboardingViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = pushOnboardingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            enableNotificationsSuggestingHandler = this.this$0.enableNotificationsSuggestingHandler;
            enableNotificationsSuggestingHandler.setPermissionForPushNotificationsForApiMoreThan32Requested(true);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushOnboardingViewModel$onboardingConfirm$2(PushOnboardingViewModel pushOnboardingViewModel, d<? super PushOnboardingViewModel$onboardingConfirm$2> dVar) {
        super(2, dVar);
        this.this$0 = pushOnboardingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PushOnboardingViewModel$onboardingConfirm$2(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (xe.C10727i.f(r6, r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0._onboardingStateFlow;
            PushOnboardingViewModel.OnboardingResultAction.ShowPermissionsDialog showPermissionsDialog = PushOnboardingViewModel.OnboardingResultAction.ShowPermissionsDialog.INSTANCE;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        b bVar = b.f10879b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PushOnboardingViewModel$onboardingConfirm$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
