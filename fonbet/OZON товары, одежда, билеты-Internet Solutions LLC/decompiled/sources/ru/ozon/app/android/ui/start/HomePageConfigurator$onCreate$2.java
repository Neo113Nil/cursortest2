package ru.ozon.app.android.ui.start;

import Sc.o;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.extension.ActivitiesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "link", "Lru/ozon/app/android/ui/start/LaunchDeeplink;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/ui/start/LaunchDeeplink;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class HomePageConfigurator$onCreate$2 extends AbstractC7737t implements Function1<LaunchDeeplink, Unit> {
    final /* synthetic */ HomePageConfigurator this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ui.start.HomePageConfigurator$onCreate$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<PermissionRequest.Builder, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ui.start.HomePageConfigurator$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C19671 extends AbstractC7737t implements Function0<Unit> {
            public static final C19671 INSTANCE = new C19671();

            C19671() {
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
        /* renamed from: ru.ozon.app.android.ui.start.HomePageConfigurator$onCreate$2$1$2, reason: invalid class name */
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

        AnonymousClass1() {
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
            requestPermission.onPermissionGranted(C19671.INSTANCE);
            requestPermission.onPermissionDenied(AnonymousClass2.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomePageConfigurator$onCreate$2(HomePageConfigurator homePageConfigurator) {
        super(1);
        this.this$0 = homePageConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LaunchDeeplink launchDeeplink) {
        invoke2(launchDeeplink);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LaunchDeeplink launchDeeplink) {
        r activity;
        if (Intrinsics.d(launchDeeplink, RequestNotificationPermission.INSTANCE)) {
            activity = this.this$0.getActivity();
            ActivitiesKt.requestPermission(activity, AnonymousClass1.INSTANCE);
        } else if (launchDeeplink instanceof UpdateDeeplink) {
            this.this$0.onUpdateDeeplink((UpdateDeeplink) launchDeeplink);
        } else if (!Intrinsics.d(launchDeeplink, EmptyDeeplink.INSTANCE)) {
            throw new o();
        }
    }
}
