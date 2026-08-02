package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel;

import Ae.InterfaceC2395h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2PlayerPoolViewModel;", "", "", "position", "", "onVideoRenderedForPosition", "(I)V", "onPositionForPlayerRequested", "onPositionForPlayerCaptured", "onPositionForPlayerOutdated", "onPositionForPlayerReleased", "", "shouldAskHoldersToReleasePlayer", "()Z", "LAe/h;", "getVideoRenderInfoForPosition", "()LAe/h;", "videoRenderInfoForPosition", "getPositionForPlayerRequest", "positionForPlayerRequest", "getPositionForPlayerReleased", "positionForPlayerReleased", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReviewGalleryV2PlayerPoolViewModel {
    @NotNull
    InterfaceC2395h<Integer> getPositionForPlayerReleased();

    @NotNull
    InterfaceC2395h<Integer> getPositionForPlayerRequest();

    @NotNull
    InterfaceC2395h<Integer> getVideoRenderInfoForPosition();

    void onPositionForPlayerCaptured(int position);

    void onPositionForPlayerOutdated(int position);

    void onPositionForPlayerReleased(int position);

    void onPositionForPlayerRequested(int position);

    void onVideoRenderedForPosition(int position);

    boolean shouldAskHoldersToReleasePlayer();
}
