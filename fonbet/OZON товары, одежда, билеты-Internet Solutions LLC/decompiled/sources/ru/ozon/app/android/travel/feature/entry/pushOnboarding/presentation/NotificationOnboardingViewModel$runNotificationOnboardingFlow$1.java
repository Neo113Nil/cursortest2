package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import Ae.w0;
import He.b;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.entry.data.PushOnboardingPrefsRepository;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingViewModel;
import xe.C10720e0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingViewModel$runNotificationOnboardingFlow$1", f = "NotificationOnboardingViewModel.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 46, 51}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class NotificationOnboardingViewModel$runNotificationOnboardingFlow$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $areNotificationsEnabled;
    int label;
    final /* synthetic */ NotificationOnboardingViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingViewModel$runNotificationOnboardingFlow$1$1", f = "NotificationOnboardingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingViewModel$runNotificationOnboardingFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ NotificationOnboardingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationOnboardingViewModel notificationOnboardingViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = notificationOnboardingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            PushOnboardingPrefsRepository pushOnboardingPrefsRepository;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            pushOnboardingPrefsRepository = this.this$0.pushOnboardingRepository;
            pushOnboardingPrefsRepository.onShown("TX_PUSH_ONBOARDING", true);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationOnboardingViewModel$runNotificationOnboardingFlow$1(boolean z11, NotificationOnboardingViewModel notificationOnboardingViewModel, d<? super NotificationOnboardingViewModel$runNotificationOnboardingFlow$1> dVar) {
        super(2, dVar);
        this.$areNotificationsEnabled = z11;
        this.this$0 = notificationOnboardingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationOnboardingViewModel$runNotificationOnboardingFlow$1(this.$areNotificationsEnabled, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (xe.C10727i.f(r6, r1, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        PushOnboardingPrefsRepository pushOnboardingPrefsRepository;
        w0 w0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (!this.$areNotificationsEnabled) {
                pushOnboardingPrefsRepository = this.this$0.pushOnboardingRepository;
                if (pushOnboardingPrefsRepository.canShow("TX_PUSH_ONBOARDING")) {
                    w0Var2 = this.this$0._onboardingStartAction;
                    NotificationOnboardingViewModel.OnboardingStartAction.ShowOnboarding showOnboarding = NotificationOnboardingViewModel.OnboardingStartAction.ShowOnboarding.INSTANCE;
                    this.label = 1;
                }
                return Unit.f71690a;
            }
            w0Var = this.this$0._onboardingStartAction;
            NotificationOnboardingViewModel.OnboardingStartAction.None none = NotificationOnboardingViewModel.OnboardingStartAction.None.INSTANCE;
            this.label = 3;
        } else {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            b bVar = b.f10879b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationOnboardingViewModel$runNotificationOnboardingFlow$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
