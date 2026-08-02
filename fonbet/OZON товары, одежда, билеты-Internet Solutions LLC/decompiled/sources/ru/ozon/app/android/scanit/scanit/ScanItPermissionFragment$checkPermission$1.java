package ru.ozon.app.android.scanit.scanit;

import android.view.View;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.feature.scanit.R$string;
import ru.ozon.app.android.feature.scanit.databinding.FragmentCameraPermissionBinding;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.scanit.scanit.ScanItPermissionFragment$checkPermission$1;
import ru.ozon.app.android.utils.PermissionExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ScanItPermissionFragment$checkPermission$1 extends AbstractC7737t implements Function1<PermissionRequest.Builder, Unit> {
    final /* synthetic */ boolean $isRationaleRequired;
    final /* synthetic */ ScanItPermissionFragment this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.scanit.scanit.ScanItPermissionFragment$checkPermission$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ScanItPermissionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScanItPermissionFragment scanItPermissionFragment) {
            super(0);
            this.this$0 = scanItPermissionFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.onPermissionGranted();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.scanit.scanit.ScanItPermissionFragment$checkPermission$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ScanItPermissionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ScanItPermissionFragment scanItPermissionFragment) {
            super(0);
            this.this$0 = scanItPermissionFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FragmentCameraPermissionBinding binding;
            binding = this.this$0.getBinding();
            final ScanItPermissionFragment scanItPermissionFragment = this.this$0;
            binding.buttonB.setText(R$string.scan_it_permission_allow_android);
            binding.messageTV.setText(R$string.scan_it_camera_permission_msg_2);
            binding.buttonB.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.scanit.scanit.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScanItPermissionFragment.access$checkPermission(ScanItPermissionFragment.this, false);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.scanit.scanit.ScanItPermissionFragment$checkPermission$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ScanItPermissionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ScanItPermissionFragment scanItPermissionFragment) {
            super(0);
            this.this$0 = scanItPermissionFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(ScanItPermissionFragment scanItPermissionFragment, View view) {
            r requireActivity = scanItPermissionFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            PermissionExtKt.openAppSettings(requireActivity);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FragmentCameraPermissionBinding binding;
            binding = this.this$0.getBinding();
            final ScanItPermissionFragment scanItPermissionFragment = this.this$0;
            binding.buttonB.setText(R$string.scan_it_settings_button_label);
            binding.messageTV.setText(R$string.scan_it_camera_permission_msg_1);
            binding.buttonB.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.scanit.scanit.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScanItPermissionFragment$checkPermission$1.AnonymousClass3.invoke$lambda$1$lambda$0(ScanItPermissionFragment.this, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScanItPermissionFragment$checkPermission$1(boolean z11, ScanItPermissionFragment scanItPermissionFragment) {
        super(1);
        this.$isRationaleRequired = z11;
        this.this$0 = scanItPermissionFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PermissionRequest.Builder builder) {
        invoke2(builder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PermissionRequest.Builder requestPermission) {
        Intrinsics.checkNotNullParameter(requestPermission, "$this$requestPermission");
        requestPermission.permissions("android.permission.CAMERA");
        requestPermission.onPermissionGranted(new AnonymousClass1(this.this$0));
        requestPermission.showRequestPermissionRationale(this.$isRationaleRequired, new AnonymousClass2(this.this$0));
        requestPermission.onPermissionDenied(new AnonymousClass3(this.this$0));
    }
}
