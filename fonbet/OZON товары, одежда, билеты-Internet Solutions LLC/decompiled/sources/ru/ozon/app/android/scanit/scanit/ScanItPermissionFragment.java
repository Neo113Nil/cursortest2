package ru.ozon.app.android.scanit.scanit;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.feature.scanit.R$id;
import ru.ozon.app.android.feature.scanit.databinding.FragmentCameraPermissionBinding;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\u00052\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050%H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0004R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItPermissionFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/permission/PermissionRequester;", "<init>", "()V", "", "onPermissionGranted", "", "isRationaleRequired", "checkPermission", "(Z)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "onPrepareOptionsMenu", "(Landroid/view/Menu;)V", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "onResume", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "Lru/ozon/app/android/feature/scanit/databinding/FragmentCameraPermissionBinding;", "mBinding", "Lru/ozon/app/android/feature/scanit/databinding/FragmentCameraPermissionBinding;", "getBinding", "()Lru/ozon/app/android/feature/scanit/databinding/FragmentCameraPermissionBinding;", "binding", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScanItPermissionFragment extends ComponentCallbacksC5392m implements PermissionRequester {
    private FragmentCameraPermissionBinding mBinding;
    private PermissionRequest.Builder permissionRequestBuilder;

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkPermission(boolean isRationaleRequired) {
        requestPermission(new ScanItPermissionFragment$checkPermission$1(isRationaleRequired, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentCameraPermissionBinding getBinding() {
        FragmentCameraPermissionBinding fragmentCameraPermissionBinding = this.mBinding;
        Intrinsics.f(fragmentCameraPermissionBinding);
        return fragmentCameraPermissionBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPermissionGranted() {
        Q p11 = getParentFragmentManager().p();
        p11.r(R$id.contentTv, new ScanItCaptureFragment(), null);
        p11.i();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.permissionRequestBuilder = new PermissionRequest.Builder(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.mBinding = FragmentCameraPermissionBinding.inflate(inflater, container, false);
        LinearLayout constraintLayout = getBinding().getConstraintLayout();
        setHasOptionsMenu(true);
        Intrinsics.f(constraintLayout);
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != R$id.menu_scan_it_info) {
            return super.onOptionsItemSelected(item);
        }
        ComponentCallbacksC5392m parentFragment = getParentFragment();
        ScanItFragment scanItFragment = parentFragment instanceof ScanItFragment ? (ScanItFragment) parentFragment : null;
        if (scanItFragment == null) {
            return true;
        }
        scanItFragment.openScanItIntro();
        return true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPrepareOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        menu.findItem(R$id.menu_flash).setVisible(false);
        menu.findItem(R$id.menu_volume_on).setVisible(false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (PermissionExtensionsKt.isPermissionGranted(requireContext, "android.permission.CAMERA")) {
            onPermissionGranted();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        checkPermission(true);
    }

    @Override // ru.ozon.app.android.permission.PermissionRequester
    public void requestPermission(@NotNull Function1<? super PermissionRequest.Builder, Unit> buildPermissionRequest) {
        Intrinsics.checkNotNullParameter(buildPermissionRequest, "buildPermissionRequest");
        PermissionRequest.Builder builder = this.permissionRequestBuilder;
        if (builder == null) {
            Intrinsics.n("permissionRequestBuilder");
            throw null;
        }
        buildPermissionRequest.invoke(builder);
        builder.build().execute();
    }
}
