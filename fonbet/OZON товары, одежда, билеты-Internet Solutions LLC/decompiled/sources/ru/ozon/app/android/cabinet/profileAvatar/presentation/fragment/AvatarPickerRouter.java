package ru.ozon.app.android.cabinet.profileAvatar.presentation.fragment;

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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/presentation/fragment/AvatarPickerRouter;", "", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/fragment/AvatarPickerFragment;", "fragment", "", "isSelect", "<init>", "(Lru/ozon/app/android/cabinet/profileAvatar/presentation/fragment/AvatarPickerFragment;Z)V", "", "openChoosePhotoPicker", "()V", "", "resultCode", "Landroid/net/Uri;", "fileUri", "sendResult", "(ILandroid/net/Uri;)V", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/fragment/AvatarPickerFragment;", "getFragment", "()Lru/ozon/app/android/cabinet/profileAvatar/presentation/fragment/AvatarPickerFragment;", "Z", "LCi/k;", "galleryConfig", "LCi/k;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvatarPickerRouter {

    @NotNull
    private final AvatarPickerFragment fragment;

    @NotNull
    private final k galleryConfig;
    private final boolean isSelect;

    public AvatarPickerRouter(@NotNull AvatarPickerFragment fragment, boolean z11) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.isSelect = z11;
        k b11 = C2779a.b();
        this.galleryConfig = k.a(b11, z11 ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, h.d.f11018a, b.a(b11.d(), g.a(b11.d().f(), null, null, l.RESULT_API_ONLY, 31), null, 1, 1918), null, null, 114);
    }

    public final void openChoosePhotoPicker() {
        this.fragment.getGalleryLauncher().a(this.galleryConfig);
    }

    public final void sendResult(int resultCode, Uri fileUri) {
        Intent intent = new Intent();
        intent.putExtra("ru.ozon.app.android.cabinet.profileAvatar.ProfileAvatarViewHolder.KEY_IMAGE_URI", fileUri);
        ComponentCallbacksC5392m targetFragment = this.fragment.getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(this.fragment.getTargetRequestCode(), resultCode, intent);
            Unit unit = Unit.f71690a;
        }
        this.fragment.dismiss();
    }
}
