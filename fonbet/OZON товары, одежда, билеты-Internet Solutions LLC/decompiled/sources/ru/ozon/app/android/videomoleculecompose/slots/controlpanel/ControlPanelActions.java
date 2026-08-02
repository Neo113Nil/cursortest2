package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001Be\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/ControlPanelActions;", "", "Lkotlin/Function0;", "", "onPlaybackClick", "onFullscreenClick", "Lkotlin/Function1;", "", "onScrubStart", "onScrubMove", "Lkotlin/Function2;", "", "onScrubEnd", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function0;", "getOnPlaybackClick", "()Lkotlin/jvm/functions/Function0;", "getOnFullscreenClick", "Lkotlin/jvm/functions/Function1;", "getOnScrubStart", "()Lkotlin/jvm/functions/Function1;", "getOnScrubMove", "Lkotlin/jvm/functions/Function2;", "getOnScrubEnd", "()Lkotlin/jvm/functions/Function2;", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ControlPanelActions {

    @NotNull
    private final Function0<Unit> onFullscreenClick;

    @NotNull
    private final Function0<Unit> onPlaybackClick;

    @NotNull
    private final Function2<Long, Boolean, Unit> onScrubEnd;

    @NotNull
    private final Function1<Long, Unit> onScrubMove;

    @NotNull
    private final Function1<Long, Unit> onScrubStart;

    /* JADX WARN: Multi-variable type inference failed */
    public ControlPanelActions(@NotNull Function0<Unit> onPlaybackClick, @NotNull Function0<Unit> onFullscreenClick, @NotNull Function1<? super Long, Unit> onScrubStart, @NotNull Function1<? super Long, Unit> onScrubMove, @NotNull Function2<? super Long, ? super Boolean, Unit> onScrubEnd) {
        Intrinsics.checkNotNullParameter(onPlaybackClick, "onPlaybackClick");
        Intrinsics.checkNotNullParameter(onFullscreenClick, "onFullscreenClick");
        Intrinsics.checkNotNullParameter(onScrubStart, "onScrubStart");
        Intrinsics.checkNotNullParameter(onScrubMove, "onScrubMove");
        Intrinsics.checkNotNullParameter(onScrubEnd, "onScrubEnd");
        this.onPlaybackClick = onPlaybackClick;
        this.onFullscreenClick = onFullscreenClick;
        this.onScrubStart = onScrubStart;
        this.onScrubMove = onScrubMove;
        this.onScrubEnd = onScrubEnd;
    }

    @NotNull
    public final Function0<Unit> getOnFullscreenClick() {
        return this.onFullscreenClick;
    }

    @NotNull
    public final Function0<Unit> getOnPlaybackClick() {
        return this.onPlaybackClick;
    }

    @NotNull
    public final Function2<Long, Boolean, Unit> getOnScrubEnd() {
        return this.onScrubEnd;
    }

    @NotNull
    public final Function1<Long, Unit> getOnScrubMove() {
        return this.onScrubMove;
    }

    @NotNull
    public final Function1<Long, Unit> getOnScrubStart() {
        return this.onScrubStart;
    }
}
