package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.viewholders.VideoViewHolder;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0014j\b\u0012\u0004\u0012\u00020\n`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPlaybackManager;", "", "Lxe/M;", "lifecycleScope", "<init>", "(Lxe/M;)V", "", "scheduleUpdate", "()V", "updatePlayingVideos", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/viewholders/VideoViewHolder;", "holder", "onViewInOverlapBounds", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/viewholders/VideoViewHolder;)V", "onViewOutOfOverlapBounds", "onViewRecycled", "playAll", "stopAll", "clear", "Lxe/M;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "visibleVideoHolders", "Ljava/util/LinkedHashSet;", "", "playingVideos", "Ljava/util/Set;", "Lxe/B0;", "pendingUpdate", "Lxe/B0;", "", "widgetVisible", "Z", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoPlaybackManager {

    @NotNull
    private final M lifecycleScope;
    private B0 pendingUpdate;

    @NotNull
    private final Set<VideoViewHolder> playingVideos;

    @NotNull
    private final LinkedHashSet<VideoViewHolder> visibleVideoHolders;
    private boolean widgetVisible;
    public static final int $stable = 8;

    public VideoPlaybackManager(@NotNull M lifecycleScope) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        this.lifecycleScope = lifecycleScope;
        this.visibleVideoHolders = new LinkedHashSet<>();
        this.playingVideos = new LinkedHashSet();
        this.widgetVisible = true;
    }

    private final void scheduleUpdate() {
        if (this.widgetVisible) {
            B0 b02 = this.pendingUpdate;
            if (b02 != null) {
                b02.j(null);
            }
            this.pendingUpdate = C10727i.c(this.lifecycleScope, null, null, new VideoPlaybackManager$scheduleUpdate$1(this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePlayingVideos() {
        if (this.widgetVisible) {
            List<VideoViewHolder> K02 = C7714v.K0(this.visibleVideoHolders, 3);
            Iterator<VideoViewHolder> it = this.playingVideos.iterator();
            while (it.hasNext()) {
                VideoViewHolder next = it.next();
                if (!K02.contains(next)) {
                    next.stopPlayback();
                    it.remove();
                }
            }
            for (VideoViewHolder videoViewHolder : K02) {
                if (!this.playingVideos.contains(videoViewHolder) && videoViewHolder.startPlayback()) {
                    this.playingVideos.add(videoViewHolder);
                }
            }
        }
    }

    public final void clear() {
        stopAll();
        Iterator<T> it = this.visibleVideoHolders.iterator();
        while (it.hasNext()) {
            ((VideoViewHolder) it.next()).getVideoDelegate().clear();
        }
        this.visibleVideoHolders.clear();
    }

    public final void onViewInOverlapBounds(@NotNull VideoViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.visibleVideoHolders.add(holder);
        scheduleUpdate();
    }

    public final void onViewOutOfOverlapBounds(@NotNull VideoViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.visibleVideoHolders.remove(holder);
        scheduleUpdate();
    }

    public final void onViewRecycled(@NotNull VideoViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.visibleVideoHolders.remove(holder);
        if (this.playingVideos.remove(holder)) {
            holder.stopPlayback();
        }
        scheduleUpdate();
    }

    public final void playAll() {
        this.widgetVisible = true;
        scheduleUpdate();
    }

    public final void stopAll() {
        this.widgetVisible = false;
        B0 b02 = this.pendingUpdate;
        if (b02 != null) {
            b02.j(null);
        }
        this.pendingUpdate = null;
        Iterator<T> it = this.playingVideos.iterator();
        while (it.hasNext()) {
            ((VideoViewHolder) it.next()).stopPlayback();
        }
        this.playingVideos.clear();
    }
}
