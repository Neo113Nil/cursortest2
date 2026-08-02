package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.buttons;

import Lc0.e;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/buttons/ButtonViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/video/player/soundservice/SoundController;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final SoundController soundController;

    @NotNull
    private final IconButtonV3View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonViewHolder(@NotNull IconButtonV3View view, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull SoundController soundController) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        this.view = view;
        this.onAction = onAction;
        this.soundController = soundController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(ButtonViewHolder buttonViewHolder, HotelsGalleryVO.VideoButton videoButton, View view) {
        buttonViewHolder.soundController.setSoundMutedState(!r3.isMuted());
        IconButtonV3HolderKt.bindOrGone$default(buttonViewHolder.view, buttonViewHolder.soundController.isMuted() ? videoButton.getEnableButton() : videoButton.getDisableButton(), null, 2, null);
    }

    public final void bind(@NotNull HotelsGalleryVO.VideoButton item) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(item, "item");
        CommonControlSettings common = item.getEnableButton().getCommon();
        if (Intrinsics.d((common == null || (action = common.getAction()) == null) ? null : action.getId(), "enableSound")) {
            IconButtonV3HolderKt.bindOrGone$default(this.view, this.soundController.isMuted() ? item.getEnableButton() : item.getDisableButton(), null, 2, null);
            this.view.setOnClickListener(new e(5, this, item));
        } else {
            this.view.setOnClickListener(null);
            IconButtonV3HolderKt.bindOrGone(this.view, item.getEnableButton(), this.onAction);
        }
    }
}
