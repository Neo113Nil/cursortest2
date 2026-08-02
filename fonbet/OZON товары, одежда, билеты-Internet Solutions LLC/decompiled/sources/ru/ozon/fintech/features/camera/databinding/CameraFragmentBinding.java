package ru.ozon.fintech.features.camera.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.camera.ui.ScannerErrorResultView;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;

/* loaded from: classes3.dex */
public final class CameraFragmentBinding implements a {

    @NonNull
    public final CameraViewLayoutBinding cameraLayout;

    @NonNull
    public final ConfirmPhotoLayoutBinding confirmLayout;

    @NonNull
    public final PermissionsScreenStateView permissionsScreenState;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ScannerErrorResultView scannerError;

    @NonNull
    public final ScreenStateView screenState;

    private CameraFragmentBinding(@NonNull FrameLayout frameLayout, @NonNull CameraViewLayoutBinding cameraViewLayoutBinding, @NonNull ConfirmPhotoLayoutBinding confirmPhotoLayoutBinding, @NonNull PermissionsScreenStateView permissionsScreenStateView, @NonNull ScannerErrorResultView scannerErrorResultView, @NonNull ScreenStateView screenStateView) {
        this.rootView = frameLayout;
        this.cameraLayout = cameraViewLayoutBinding;
        this.confirmLayout = confirmPhotoLayoutBinding;
        this.permissionsScreenState = permissionsScreenStateView;
        this.scannerError = scannerErrorResultView;
        this.screenState = screenStateView;
    }

    @NonNull
    public static CameraFragmentBinding bind(@NonNull View view) {
        int i11 = R.id.camera_layout;
        View d11 = C2548q.d(R.id.camera_layout, view);
        if (d11 != null) {
            CameraViewLayoutBinding bind = CameraViewLayoutBinding.bind(d11);
            i11 = R.id.confirm_layout;
            View d12 = C2548q.d(R.id.confirm_layout, view);
            if (d12 != null) {
                ConfirmPhotoLayoutBinding bind2 = ConfirmPhotoLayoutBinding.bind(d12);
                i11 = R.id.permissions_screen_state;
                PermissionsScreenStateView permissionsScreenStateView = (PermissionsScreenStateView) C2548q.d(R.id.permissions_screen_state, view);
                if (permissionsScreenStateView != null) {
                    i11 = R.id.scanner_error;
                    ScannerErrorResultView scannerErrorResultView = (ScannerErrorResultView) C2548q.d(R.id.scanner_error, view);
                    if (scannerErrorResultView != null) {
                        i11 = R.id.screen_state;
                        ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.screen_state, view);
                        if (screenStateView != null) {
                            return new CameraFragmentBinding((FrameLayout) view, bind, bind2, permissionsScreenStateView, scannerErrorResultView, screenStateView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static CameraFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CameraFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.camera_fragment, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
