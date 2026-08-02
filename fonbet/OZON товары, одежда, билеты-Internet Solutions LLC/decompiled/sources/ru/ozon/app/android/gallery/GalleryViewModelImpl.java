package ru.ozon.app.android.gallery;

import Nc.C3669c;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.gallery.GalleryViewModel;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.FullScreenModel;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001cR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/gallery/GalleryViewModel;", "<init>", "()V", "", "toggleFullView", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "send", "(Lru/ozon/app/android/gallery/GalleryViewModel$Action;)V", "", "isNeedDisplayControls", "()Z", "Lru/ozon/app/android/gallery/GalleryRequest;", "request", "init", "(Lru/ozon/app/android/gallery/GalleryRequest;)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;", "fullScreenModel", "onOrientationChanged", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;)V", "", "page", "onPageSelected", "(I)V", "onCloseClick", "zoomState", "onZoomChanged", "(Z)V", "isRewinding", "onVideoRewindChanged", "LNc/c;", "action", "LNc/c;", "getAction", "()LNc/c;", "", "Lru/ozon/app/android/gallery/ItemVO;", "items", "Ljava/util/List;", "currentPage", "I", "isLandscape", "Z", "fullScreen", "zoomed", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GalleryViewModelImpl extends w0 implements GalleryViewModel {

    @NotNull
    private final C3669c<GalleryViewModel.Action> action;
    private int currentPage;
    private boolean fullScreen;
    private boolean isLandscape;
    private List<? extends ItemVO> items;
    private boolean zoomed;

    public GalleryViewModelImpl() {
        C3669c<GalleryViewModel.Action> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.action = d11;
    }

    private final boolean isNeedDisplayControls() {
        return (this.zoomed || this.fullScreen) ? false : true;
    }

    private final void send(GalleryViewModel.Action action) {
        getAction().onNext(action);
    }

    private final void toggleFullView() {
        boolean z11 = this.fullScreen;
        this.fullScreen = !z11;
        if (z11) {
            return;
        }
        send(GalleryViewModel.Action.HideSystemUI.INSTANCE);
    }

    @Override // ru.ozon.app.android.gallery.GalleryViewModel
    public void init(@NotNull GalleryRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        List<GalleryRequest.GalleryItem> items = request.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(GalleryMapperKt.toVO((GalleryRequest.GalleryItem) it.next()));
        }
        this.items = arrayList;
        this.currentPage = request.getCurrentPosition();
        List<? extends ItemVO> list = this.items;
        if (list == null) {
            Intrinsics.n("items");
            throw null;
        }
        send(new GalleryViewModel.Action.BindItems(list));
        send(new GalleryViewModel.Action.SetCurrentPage(this.currentPage));
        List<? extends ItemVO> list2 = this.items;
        if (list2 == null) {
            Intrinsics.n("items");
            throw null;
        }
        if (list2.get(this.currentPage) instanceof ItemVO.OzonVideo) {
            List<? extends ItemVO> list3 = this.items;
            if (list3 == null) {
                Intrinsics.n("items");
                throw null;
            }
            ItemVO itemVO = list3.get(this.currentPage);
            Intrinsics.g(itemVO, "null cannot be cast to non-null type ru.ozon.app.android.gallery.ItemVO.OzonVideo");
            if (((ItemVO.OzonVideo) itemVO).getFullScreen()) {
                send(GalleryViewModel.Action.HidePreview.INSTANCE);
                this.fullScreen = true;
            }
        }
    }

    @Override // ru.ozon.app.android.gallery.GalleryViewModel
    public void onCloseClick() {
        send(GalleryViewModel.Action.Close.INSTANCE);
    }

    @Override // ru.ozon.app.android.gallery.GalleryViewModel
    public void onOrientationChanged(@NotNull FullScreenModel fullScreenModel) {
        Intrinsics.checkNotNullParameter(fullScreenModel, "fullScreenModel");
        this.isLandscape = fullScreenModel.getScreenOrientation() == 0;
        if (fullScreenModel.getIsFullScreen()) {
            send(GalleryViewModel.Action.HideSystemUI.INSTANCE);
            send(GalleryViewModel.Action.LockPager.INSTANCE);
        } else {
            send(GalleryViewModel.Action.ShowSystemUI.INSTANCE);
            send(GalleryViewModel.Action.UnlockPager.INSTANCE);
        }
    }

    @Override // ru.ozon.app.android.gallery.GalleryViewModel
    public void onPageSelected(int page) {
        this.currentPage = page;
        send(GalleryViewModel.Action.NotifyPreviewAdapter.INSTANCE);
        send(new GalleryViewModel.Action.SmoothScrollToPage(page));
        List<? extends ItemVO> list = this.items;
        if (list == null) {
            Intrinsics.n("items");
            throw null;
        }
        if ((list.get(page) instanceof ItemVO.OzonVideo) && this.fullScreen) {
            toggleFullView();
        }
    }

    @Override // ru.ozon.app.android.gallery.GalleryViewModel
    public void onVideoRewindChanged(boolean isRewinding) {
        if (this.isLandscape) {
            return;
        }
        if (isRewinding) {
            send(GalleryViewModel.Action.HideCloseBtn.INSTANCE);
        } else {
            send(GalleryViewModel.Action.ShowCloseBtn.INSTANCE);
        }
    }

    @Override // ru.ozon.app.android.gallery.GalleryViewModel
    public void onZoomChanged(boolean zoomState) {
        this.zoomed = zoomState;
        send(zoomState ? GalleryViewModel.Action.LockPager.INSTANCE : GalleryViewModel.Action.UnlockPager.INSTANCE);
        send(isNeedDisplayControls() ? GalleryViewModel.Action.ShowPreview.INSTANCE : GalleryViewModel.Action.HidePreview.INSTANCE);
    }

    @Override // ru.ozon.app.android.gallery.GalleryViewModel
    @NotNull
    public C3669c<GalleryViewModel.Action> getAction() {
        return this.action;
    }
}
