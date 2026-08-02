package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
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
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.storefront.feature.notifications.utils.ActivityExtKt;
import ru.ozon.app.android.storefront.feature.notifications.utils.ViewEffect;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewEffect$DismissDialog;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewEffect$OpenChannelSettings;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewEffect$OpenNotificationSettings;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewEffect$RequestNotificationPermission;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModel;
import ru.ozon.app.android.utils.PermissionExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1", f = "PromoPushEnableComposeWidget.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ComponentCallbacksC5392m $fragment;
    final /* synthetic */ PromoPushEnableViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1(PromoPushEnableViewModel promoPushEnableViewModel, ComponentCallbacksC5392m componentCallbacksC5392m, d<? super PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1> dVar) {
        super(2, dVar);
        this.$viewModel = promoPushEnableViewModel;
        this.$fragment = componentCallbacksC5392m;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1(this.$viewModel, this.$fragment, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<ViewEffect> effect = this.$viewModel.getEffect();
            final ComponentCallbacksC5392m componentCallbacksC5392m = this.$fragment;
            InterfaceC2397i<? super ViewEffect> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1.1

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C18681 extends AbstractC7737t implements Function1<PermissionRequest.Builder, Unit> {
                    public static final C18681 INSTANCE = new C18681();

                    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C18691 extends AbstractC7737t implements Function0<Unit> {
                        public static final C18691 INSTANCE = new C18691();

                        C18691() {
                            super(0);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f71690a;
                        }
                    }

                    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
                        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                        AnonymousClass2() {
                            super(0);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f71690a;
                        }
                    }

                    C18681() {
                        super(1);
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
                        requestPermission.onPermissionGranted(C18691.INSTANCE);
                        requestPermission.onPermissionDenied(AnonymousClass2.INSTANCE);
                    }
                }

                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ViewEffect) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(ViewEffect viewEffect, d<? super Unit> dVar) {
                    if (viewEffect instanceof PromoPushEnableViewEffect$OpenChannelSettings) {
                        r requireActivity = ComponentCallbacksC5392m.this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        ActivityExtKt.openNotificationChannelSetting(requireActivity);
                    } else if (viewEffect instanceof PromoPushEnableViewEffect$RequestNotificationPermission) {
                        r requireActivity2 = ComponentCallbacksC5392m.this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                        ActivitiesKt.requestPermission(requireActivity2, C18681.INSTANCE);
                    } else if (viewEffect instanceof PromoPushEnableViewEffect$OpenNotificationSettings) {
                        r requireActivity3 = ComponentCallbacksC5392m.this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                        PermissionExtKt.openAppNotificationsSettings(requireActivity3);
                    } else if (viewEffect instanceof PromoPushEnableViewEffect$DismissDialog) {
                        ComponentCallbacksC5392m parentFragment = ComponentCallbacksC5392m.this.getParentFragment();
                        BottomSheetComposerFragment bottomSheetComposerFragment = parentFragment instanceof BottomSheetComposerFragment ? (BottomSheetComposerFragment) parentFragment : null;
                        if (bottomSheetComposerFragment != null) {
                            bottomSheetComposerFragment.dismiss();
                        }
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (effect.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
