package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingViewModel;
import ru.ozon.app.android.travel.utils.extensions.PermissionExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel$OnboardingResultAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingFragment$observeViewModel$1", f = "PushOnboardingFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PushOnboardingFragment$observeViewModel$1 extends j implements Function2<PushOnboardingViewModel.OnboardingResultAction, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PushOnboardingFragment this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingFragment$observeViewModel$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<PermissionRequest.Builder, Unit> {
        final /* synthetic */ PushOnboardingFragment this$0;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingFragment$observeViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C19051 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ PushOnboardingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19051(PushOnboardingFragment pushOnboardingFragment) {
                super(0);
                this.this$0 = pushOnboardingFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.closeFlow();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingFragment$observeViewModel$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ PushOnboardingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PushOnboardingFragment pushOnboardingFragment) {
                super(0);
                this.this$0 = pushOnboardingFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.closeFlow();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PushOnboardingFragment pushOnboardingFragment) {
            super(1);
            this.this$0 = pushOnboardingFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PermissionRequest.Builder builder) {
            invoke2(builder);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PermissionRequest.Builder requestPermission) {
            Intrinsics.checkNotNullParameter(requestPermission, "$this$requestPermission");
            requestPermission.permissions("android.permission.POST_NOTIFICATIONS");
            requestPermission.onPermissionGranted(new C19051(this.this$0));
            requestPermission.onPermissionDenied(new AnonymousClass2(this.this$0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushOnboardingFragment$observeViewModel$1(PushOnboardingFragment pushOnboardingFragment, d<? super PushOnboardingFragment$observeViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = pushOnboardingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PushOnboardingFragment$observeViewModel$1 pushOnboardingFragment$observeViewModel$1 = new PushOnboardingFragment$observeViewModel$1(this.this$0, dVar);
        pushOnboardingFragment$observeViewModel$1.L$0 = obj;
        return pushOnboardingFragment$observeViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        PushOnboardingViewModel.OnboardingResultAction onboardingResultAction = (PushOnboardingViewModel.OnboardingResultAction) this.L$0;
        if (onboardingResultAction instanceof PushOnboardingViewModel.OnboardingResultAction.ShowPermissionsDialog) {
            if (Build.VERSION.SDK_INT >= 33) {
                r activity = this.this$0.getActivity();
                if (activity != null) {
                    ActivitiesKt.requestPermission(activity, new AnonymousClass1(this.this$0));
                }
            } else {
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                PermissionExtKt.openAppNotificationSettings(requireContext);
                this.this$0.closeFlow();
            }
        } else {
            if (!(onboardingResultAction instanceof PushOnboardingViewModel.OnboardingResultAction.DismissFlow)) {
                throw new o();
            }
            this.this$0.closeFlow();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PushOnboardingViewModel.OnboardingResultAction onboardingResultAction, d<? super Unit> dVar) {
        return ((PushOnboardingFragment$observeViewModel$1) create(onboardingResultAction, dVar)).invokeSuspend(Unit.f71690a);
    }
}
