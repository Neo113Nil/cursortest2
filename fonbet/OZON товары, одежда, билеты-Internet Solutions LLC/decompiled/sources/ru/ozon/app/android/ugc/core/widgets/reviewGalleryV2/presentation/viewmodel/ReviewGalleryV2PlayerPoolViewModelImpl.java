package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel;

import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2PlayerPoolViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2PlayerPoolViewModel;", "<init>", "()V", "", "position", "", "onVideoRenderedForPosition", "(I)V", "onPositionForPlayerRequested", "onPositionForPlayerCaptured", "onPositionForPlayerOutdated", "onPositionForPlayerReleased", "", "shouldAskHoldersToReleasePlayer", "()Z", "LAe/w0;", "_videoRenderInfoForPosition", "LAe/w0;", "_positionForPlayerRequest", "_positionForPlayerReleased", "LAe/h;", "videoRenderInfoForPosition", "LAe/h;", "getVideoRenderInfoForPosition", "()LAe/h;", "positionForPlayerRequest", "getPositionForPlayerRequest", "positionForPlayerReleased", "getPositionForPlayerReleased", "LAe/x0;", "", "playerPositionRequestsSet", "LAe/x0;", "capturedPlayerPositionRequestsSet", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryV2PlayerPoolViewModelImpl extends w0 implements ReviewGalleryV2PlayerPoolViewModel {

    @NotNull
    private final Ae.w0<Integer> _positionForPlayerReleased;

    @NotNull
    private final Ae.w0<Integer> _positionForPlayerRequest;

    @NotNull
    private final Ae.w0<Integer> _videoRenderInfoForPosition;

    @NotNull
    private final x0<Set<Integer>> capturedPlayerPositionRequestsSet;

    @NotNull
    private final x0<Set<Integer>> playerPositionRequestsSet;

    @NotNull
    private final InterfaceC2395h<Integer> positionForPlayerReleased;

    @NotNull
    private final InterfaceC2395h<Integer> positionForPlayerRequest;

    @NotNull
    private final InterfaceC2395h<Integer> videoRenderInfoForPosition;

    public ReviewGalleryV2PlayerPoolViewModelImpl() {
        C0 b11 = E0.b(0, 1, null, 5);
        this._videoRenderInfoForPosition = b11;
        C0 b12 = E0.b(0, 1, null, 5);
        this._positionForPlayerRequest = b12;
        C0 b13 = E0.b(0, 1, null, 5);
        this._positionForPlayerReleased = b13;
        this.videoRenderInfoForPosition = b11;
        this.positionForPlayerRequest = b12;
        this.positionForPlayerReleased = b13;
        M m11 = M.f71699a;
        this.playerPositionRequestsSet = O0.a(m11);
        this.capturedPlayerPositionRequestsSet = O0.a(m11);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel
    @NotNull
    public InterfaceC2395h<Integer> getPositionForPlayerReleased() {
        return this.positionForPlayerReleased;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel
    @NotNull
    public InterfaceC2395h<Integer> getPositionForPlayerRequest() {
        return this.positionForPlayerRequest;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel
    @NotNull
    public InterfaceC2395h<Integer> getVideoRenderInfoForPosition() {
        return this.videoRenderInfoForPosition;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel
    public void onPositionForPlayerCaptured(int position) {
        Set<Integer> value;
        x0<Set<Integer>> x0Var = this.capturedPlayerPositionRequestsSet;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, e0.g(value, Integer.valueOf(position))));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel
    public void onPositionForPlayerOutdated(int position) {
        Set<Integer> value;
        Set<Integer> value2;
        x0<Set<Integer>> x0Var = this.playerPositionRequestsSet;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, e0.c(value, Integer.valueOf(position))));
        x0<Set<Integer>> x0Var2 = this.capturedPlayerPositionRequestsSet;
        do {
            value2 = x0Var2.getValue();
        } while (!x0Var2.b(value2, e0.c(value2, Integer.valueOf(position))));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel
    public void onPositionForPlayerReleased(int position) {
        Set<Integer> value;
        if (this.playerPositionRequestsSet.getValue().contains(Integer.valueOf(position))) {
            x0<Set<Integer>> x0Var = this.playerPositionRequestsSet;
            do {
                value = x0Var.getValue();
            } while (!x0Var.b(value, e0.c(value, Integer.valueOf(position))));
            this._positionForPlayerReleased.tryEmit(Integer.valueOf(position));
        }
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel
    public void onPositionForPlayerRequested(int position) {
        Set<Integer> value;
        if (this.playerPositionRequestsSet.getValue().contains(Integer.valueOf(position))) {
            return;
        }
        x0<Set<Integer>> x0Var = this.playerPositionRequestsSet;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, e0.g(value, Integer.valueOf(position))));
        this._positionForPlayerRequest.tryEmit(Integer.valueOf(position));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel
    public void onVideoRenderedForPosition(int position) {
        this._videoRenderInfoForPosition.tryEmit(Integer.valueOf(position));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2PlayerPoolViewModel
    public boolean shouldAskHoldersToReleasePlayer() {
        return this.capturedPlayerPositionRequestsSet.getValue().size() >= 3;
    }
}
