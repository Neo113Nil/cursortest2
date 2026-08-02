package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.fragment;

import Bi.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.AvatarPickerView;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.permission.PermissionRequester;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/fragment/AvatarPickerFragment;", "Lcom/google/android/material/bottomsheet/b;", "Lru/ozon/app/android/permission/PermissionRequester;", "<init>", "()V", "", "bindPicker", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkotlin/Function1;", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "buildPermissionRequest", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/AvatarPickerView;", "avatarPickerView", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/AvatarPickerView;", "permissionRequestBuilder", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "LBi/k;", "galleryLauncher", "LBi/k;", "getGalleryLauncher", "()LBi/k;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AvatarPickerFragment extends b implements PermissionRequester {
    private AvatarPickerView avatarPickerView;

    @NotNull
    private final k galleryLauncher;
    private PermissionRequest.Builder permissionRequestBuilder;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/fragment/AvatarPickerFragment$Companion;", "", "<init>", "()V", "EXTRA_HAS_OLD_PHOTO", "", "newInstance", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/fragment/AvatarPickerFragment;", "hasOldPhoto", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AvatarPickerFragment newInstance(boolean hasOldPhoto) {
            AvatarPickerFragment avatarPickerFragment = new AvatarPickerFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("hasOldPhoto", hasOldPhoto);
            avatarPickerFragment.setArguments(bundle);
            return avatarPickerFragment;
        }

        private Companion() {
        }
    }

    public AvatarPickerFragment() {
        int i11 = k.f3828a;
        this.galleryLauncher = k.a.i(this, new AvatarPickerFragment$galleryLauncher$1(this), 7);
    }

    private final void bindPicker() {
        AvatarPickerRouter avatarPickerRouter = new AvatarPickerRouter(this);
        AvatarPickerView avatarPickerView = this.avatarPickerView;
        if (avatarPickerView != null) {
            avatarPickerView.setOpenChoosePhotoPicker(new AvatarPickerFragment$bindPicker$1(avatarPickerRouter));
        }
        AvatarPickerView avatarPickerView2 = this.avatarPickerView;
        if (avatarPickerView2 != null) {
            avatarPickerView2.setSendResult(new AvatarPickerFragment$bindPicker$2(avatarPickerRouter));
        }
    }

    @NotNull
    public final k getGalleryLauncher() {
        return this.galleryLauncher;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.permissionRequestBuilder = new PermissionRequest.Builder(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return View.inflate(requireContext(), R$layout.avatar_picker_bottom_sheet_dialog, container);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        this.avatarPickerView = new AvatarPickerView(view, arguments != null ? Boolean.valueOf(arguments.getBoolean("hasOldPhoto")) : null);
        bindPicker();
    }

    @Override // ru.ozon.app.android.permission.PermissionRequester
    public void requestPermission(@NotNull Function1<? super PermissionRequest.Builder, Unit> buildPermissionRequest) {
        Intrinsics.checkNotNullParameter(buildPermissionRequest, "buildPermissionRequest");
        PermissionRequest.Builder builder = this.permissionRequestBuilder;
        if (builder != null) {
            buildPermissionRequest.invoke(builder);
            PermissionRequest build = builder.build();
            if (build != null) {
                build.execute();
            }
        }
    }
}
