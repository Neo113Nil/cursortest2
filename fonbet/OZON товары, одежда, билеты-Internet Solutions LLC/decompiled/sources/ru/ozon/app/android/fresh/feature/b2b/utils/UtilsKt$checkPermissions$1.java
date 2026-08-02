package ru.ozon.app.android.fresh.feature.b2b.utils;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.utils.PermissionExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class UtilsKt$checkPermissions$1 extends AbstractC7737t implements Function1<PermissionRequest.Builder, Unit> {
    final /* synthetic */ boolean $needRationale;
    final /* synthetic */ Function0<Unit> $onGranted;
    final /* synthetic */ ComponentCallbacksC5392m $this_checkPermissions;
    final /* synthetic */ J $viewOwner;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt$checkPermissions$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> $onGranted;
        final /* synthetic */ ComponentCallbacksC5392m $this_checkPermissions;
        final /* synthetic */ J $viewOwner;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt$checkPermissions$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17721 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ Function0<Unit> $onGranted;
            final /* synthetic */ ComponentCallbacksC5392m $this_checkPermissions;
            final /* synthetic */ J $viewOwner;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17721(ComponentCallbacksC5392m componentCallbacksC5392m, J j11, Function0<Unit> function0) {
                super(0);
                this.$this_checkPermissions = componentCallbacksC5392m;
                this.$viewOwner = j11;
                this.$onGranted = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                UtilsKt.checkPermissions(this.$this_checkPermissions, this.$viewOwner, false, this.$onGranted);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComponentCallbacksC5392m componentCallbacksC5392m, J j11, Function0<Unit> function0) {
            super(0);
            this.$this_checkPermissions = componentCallbacksC5392m;
            this.$viewOwner = j11;
            this.$onGranted = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ComponentCallbacksC5392m componentCallbacksC5392m = this.$this_checkPermissions;
            J j11 = this.$viewOwner;
            UtilsKt.showPermissionErrorRestriction(componentCallbacksC5392m, j11, new C17721(componentCallbacksC5392m, j11, this.$onGranted));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt$checkPermissions$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ComponentCallbacksC5392m $this_checkPermissions;
        final /* synthetic */ J $viewOwner;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt$checkPermissions$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ ComponentCallbacksC5392m $this_checkPermissions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ComponentCallbacksC5392m componentCallbacksC5392m) {
                super(0);
                this.$this_checkPermissions = componentCallbacksC5392m;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PermissionExtKt.openAppSettings(this.$this_checkPermissions);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ComponentCallbacksC5392m componentCallbacksC5392m, J j11) {
            super(0);
            this.$this_checkPermissions = componentCallbacksC5392m;
            this.$viewOwner = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ComponentCallbacksC5392m componentCallbacksC5392m = this.$this_checkPermissions;
            UtilsKt.showPermissionErrorRestriction(componentCallbacksC5392m, this.$viewOwner, new AnonymousClass1(componentCallbacksC5392m));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UtilsKt$checkPermissions$1(Function0<Unit> function0, boolean z11, ComponentCallbacksC5392m componentCallbacksC5392m, J j11) {
        super(1);
        this.$onGranted = function0;
        this.$needRationale = z11;
        this.$this_checkPermissions = componentCallbacksC5392m;
        this.$viewOwner = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PermissionRequest.Builder builder) {
        invoke2(builder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PermissionRequest.Builder requestPermission) {
        Intrinsics.checkNotNullParameter(requestPermission, "$this$requestPermission");
        requestPermission.permissions("android.permission.READ_EXTERNAL_STORAGE");
        requestPermission.onPermissionGranted(this.$onGranted);
        requestPermission.showRequestPermissionRationale(this.$needRationale, new AnonymousClass1(this.$this_checkPermissions, this.$viewOwner, this.$onGranted));
        requestPermission.onPermissionDenied(new AnonymousClass2(this.$this_checkPermissions, this.$viewOwner));
    }
}
