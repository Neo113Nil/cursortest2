package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation;

import Ae.B0;
import Ae.C0;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewModel$Action;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncViewModel;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerState;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.FullScreenModel;
import xe.C10727i;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001b\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "Landroidx/lifecycle/w0;", "", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "request", "", "position", "", "bindItemsWithPosition", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;I)V", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "send", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;)V", "init", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;", "model", "onOrientationChanged", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;)V", "page", "onPageSelected", "(I)V", "", "galleryId", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "itemModel", "putSyncItem", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;)V", "updateCurrentSyncItem", "removeSyncItem", "(Ljava/lang/String;)V", "findSyncItem", "(Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "LAe/w0;", "_event", "LAe/w0;", "LAe/B0;", "event", "LAe/B0;", "getEvent", "()LAe/B0;", "Lkotlin/Pair;", "syncModel", "Lkotlin/Pair;", "lastPosition", "I", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GallerySyncViewModelImpl extends w0 implements GallerySyncViewModel {

    @NotNull
    private final Ae.w0<GalleryFullViewViewModel$Action> _event;

    @NotNull
    private final B0<GalleryFullViewViewModel$Action> event;
    private int lastPosition;
    private Pair<String, GallerySyncModel> syncModel;

    public GallerySyncViewModelImpl() {
        C0 b11 = E0.b(0, 0, null, 7);
        this._event = b11;
        this.event = b11;
    }

    private final void bindItemsWithPosition(GalleryFullViewVO request, int position) {
        send(new GalleryFullViewViewModel$Action.BindItems(request));
        send(new GalleryFullViewViewModel$Action.SetCurrentPage(position));
    }

    private final void send(GalleryFullViewViewModel$Action galleryFullViewViewModel$Action) {
        C10727i.c(x0.a(this), null, null, new GallerySyncViewModelImpl$send$1(this, galleryFullViewViewModel$Action, null), 3);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncViewModel
    public GallerySyncModel findSyncItem(@NotNull String galleryId) {
        Pair<String, GallerySyncModel> pair;
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        Pair<String, GallerySyncModel> pair2 = this.syncModel;
        if (!Intrinsics.d(pair2 != null ? pair2.e() : null, galleryId) || (pair = this.syncModel) == null) {
            return null;
        }
        return pair.f();
    }

    @NotNull
    public B0<GalleryFullViewViewModel$Action> getEvent() {
        return this.event;
    }

    public void init(@NotNull GalleryFullViewVO request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GallerySyncModel findSyncItem = findSyncItem(request.getGalleryId());
        if (findSyncItem == null) {
            int size = request.getItems().size() - 1;
            int i11 = this.lastPosition;
            bindItemsWithPosition(request, size >= i11 ? i11 : 0);
            return;
        }
        if (request.getItems().size() - 1 < findSyncItem.getItemPosition()) {
            bindItemsWithPosition(request, 0);
            removeSyncItem(request.getGalleryId());
            return;
        }
        if (!(request.getItems().get(findSyncItem.getItemPosition()) instanceof GalleryFullViewVO.GalleryItemVO.Video) || findSyncItem.getVideoPosition() == null) {
            bindItemsWithPosition(request, findSyncItem.getItemPosition());
            removeSyncItem(request.getGalleryId());
            return;
        }
        GalleryFullViewVO.GalleryItemVO galleryItemVO = request.getItems().get(findSyncItem.getItemPosition());
        Intrinsics.g(galleryItemVO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO.GalleryItemVO.Video");
        GalleryFullViewVO.GalleryItemVO.Video video = (GalleryFullViewVO.GalleryItemVO.Video) galleryItemVO;
        GalleryFullViewVO.GalleryItemVO.Video copy$default = GalleryFullViewVO.GalleryItemVO.Video.copy$default(video, null, VideoMolecule.copy$default(video.getVideo(), null, null, false, PlayerState.copy$default(video.getVideo().getPlayerState(), findSyncItem.getVideoPosition().longValue(), null, false, false, 14, null), 7, null), null, null, null, null, 61, null);
        ArrayList W02 = C7714v.W0(request.getItems());
        W02.set(findSyncItem.getItemPosition(), copy$default);
        bindItemsWithPosition(GalleryFullViewVO.copy$default(request, 0L, W02, null, null, null, null, null, null, 253, null), findSyncItem.getItemPosition());
        removeSyncItem(request.getGalleryId());
    }

    public void onOrientationChanged(@NotNull FullScreenModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getIsFullScreen() && model.getScreenOrientation() == 0) {
            send(GalleryFullViewViewModel$Action.HidePreview.INSTANCE);
            send(GalleryFullViewViewModel$Action.LockPager.INSTANCE);
            send(GalleryFullViewViewModel$Action.HideSystemUI.INSTANCE);
            send(GalleryFullViewViewModel$Action.HideCloseBtn.INSTANCE);
            send(GalleryFullViewViewModel$Action.Expand.INSTANCE);
            return;
        }
        if (!model.getIsFullScreen() && model.getScreenOrientation() == 1) {
            send(GalleryFullViewViewModel$Action.ShowPreview.INSTANCE);
            send(GalleryFullViewViewModel$Action.ShowSystemUI.INSTANCE);
            send(GalleryFullViewViewModel$Action.ShowCloseBtn.INSTANCE);
            send(GalleryFullViewViewModel$Action.UnlockPager.INSTANCE);
            send(GalleryFullViewViewModel$Action.Collapse.INSTANCE);
            return;
        }
        if (model.getIsFullScreen() && model.getScreenOrientation() == 1) {
            send(GalleryFullViewViewModel$Action.HidePreview.INSTANCE);
            send(GalleryFullViewViewModel$Action.LockPager.INSTANCE);
            send(GalleryFullViewViewModel$Action.HideSystemUI.INSTANCE);
            send(GalleryFullViewViewModel$Action.HideCloseBtn.INSTANCE);
            send(GalleryFullViewViewModel$Action.Expand.INSTANCE);
        }
    }

    public void onPageSelected(int page) {
        this.lastPosition = page;
        send(GalleryFullViewViewModel$Action.NotifyPreviewAdapter.INSTANCE);
        send(new GalleryFullViewViewModel$Action.SmoothScrollToPage(page));
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncViewModel
    public void putSyncItem(@NotNull String galleryId, @NotNull GallerySyncModel itemModel) {
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        Intrinsics.checkNotNullParameter(itemModel, "itemModel");
        this.lastPosition = 0;
        this.syncModel = new Pair<>(galleryId, itemModel);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncViewModel
    public void removeSyncItem(@NotNull String galleryId) {
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        this.syncModel = null;
    }

    public void updateCurrentSyncItem(@NotNull String galleryId, @NotNull GallerySyncModel itemModel) {
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        Intrinsics.checkNotNullParameter(itemModel, "itemModel");
        if (this.lastPosition == itemModel.getItemPosition()) {
            this.syncModel = new Pair<>(galleryId, itemModel);
        }
    }
}
