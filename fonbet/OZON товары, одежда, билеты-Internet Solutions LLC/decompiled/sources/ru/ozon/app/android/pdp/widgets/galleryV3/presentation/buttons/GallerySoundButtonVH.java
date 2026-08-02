package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons;

import OD.a;
import Sc.InterfaceC4008j;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryButtonsVO;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.video.player.soundservice.SoundController;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GallerySoundButtonVH;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryButtonsVO$GallerySoundButtonVO;", "Landroid/widget/ImageView;", "imageView", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "<init>", "(Landroid/widget/ImageView;Lru/ozon/app/android/video/player/soundservice/SoundController;)V", "item", "", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryButtonsVO$GallerySoundButtonVO;)V", "Landroid/widget/ImageView;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Landroid/graphics/drawable/Drawable;", "soundOnDrawable$delegate", "LSc/j;", "getSoundOnDrawable", "()Landroid/graphics/drawable/Drawable;", "soundOnDrawable", "soundOffDrawable$delegate", "getSoundOffDrawable", "soundOffDrawable", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GallerySoundButtonVH extends GalleryButtonViewHolder<GalleryButtonsVO.GallerySoundButtonVO> {

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final SoundController soundController;

    /* renamed from: soundOffDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j soundOffDrawable;

    /* renamed from: soundOnDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j soundOnDrawable;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GallerySoundButtonVH(@NotNull ImageView imageView, @NotNull SoundController soundController) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        this.imageView = imageView;
        this.soundController = soundController;
        this.soundOnDrawable = DelegatesKt.lazyUnsafe(new GallerySoundButtonVH$soundOnDrawable$2(this));
        this.soundOffDrawable = DelegatesKt.lazyUnsafe(new GallerySoundButtonVH$soundOffDrawable$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(GallerySoundButtonVH gallerySoundButtonVH, View view) {
        gallerySoundButtonVH.soundController.setSoundMutedState(!r0.isMuted());
    }

    private final Drawable getSoundOffDrawable() {
        return (Drawable) this.soundOffDrawable.getValue();
    }

    private final Drawable getSoundOnDrawable() {
        return (Drawable) this.soundOnDrawable.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons.GalleryButtonViewHolder
    public void bind(@NotNull GalleryButtonsVO.GallerySoundButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = this.imageView;
        CharSequence contentDescription = imageView.getContentDescription();
        if (contentDescription == null) {
            contentDescription = "initialSound";
        }
        if (contentDescription.equals("isSoundOn=true")) {
            if (this.soundController.isMuted()) {
                imageView.setImageDrawable(getSoundOffDrawable());
            }
        } else if (contentDescription.equals("isSoundOn=false")) {
            if (!this.soundController.isMuted()) {
                imageView.setImageDrawable(getSoundOnDrawable());
            }
        } else if (contentDescription.equals("initialSound")) {
            imageView.setImageDrawable(this.soundController.isMuted() ? getSoundOffDrawable() : getSoundOnDrawable());
        }
        imageView.setContentDescription(this.soundController.isMuted() ? "isSoundOn=false" : "isSoundOn=true");
        imageView.setOnClickListener(new a(this, 0));
    }
}
