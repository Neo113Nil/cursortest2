package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.fragment;

import Ci.C2779a;
import Ci.b;
import Ci.g;
import Ci.k;
import Ci.l;
import Hi.h;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/fragment/AvatarPickerRouter;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/fragment/AvatarPickerFragment;", "fragment", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/fragment/AvatarPickerFragment;)V", "", "openChoosePhotoPicker", "()V", "", "resultCode", "Landroid/net/Uri;", "fileUri", "sendResult", "(ILandroid/net/Uri;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/fragment/AvatarPickerFragment;", "getFragment", "()Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/fragment/AvatarPickerFragment;", "LCi/k;", "galleryConfig", "LCi/k;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AvatarPickerRouter {

    @NotNull
    private final AvatarPickerFragment fragment;

    @NotNull
    private final k galleryConfig;

    public AvatarPickerRouter(@NotNull AvatarPickerFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        k b11 = C2779a.b();
        this.galleryConfig = k.a(b11, R.style.OzonGalleryTheme, h.d.f11018a, b.a(b11.d(), g.a(b11.d().f(), null, null, l.RESULT_API_ONLY, 31), null, 1, 1918), null, null, 114);
    }

    public final void openChoosePhotoPicker() {
        this.fragment.getGalleryLauncher().a(this.galleryConfig);
    }

    public final void sendResult(int resultCode, Uri fileUri) {
        Intent intent = new Intent();
        intent.putExtra("ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.AvatarProfileViewModel.KEY_IMAGE_URI", fileUri);
        ComponentCallbacksC5392m targetFragment = this.fragment.getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(this.fragment.getTargetRequestCode(), resultCode, intent);
            Unit unit = Unit.f71690a;
        }
        this.fragment.dismiss();
    }
}
