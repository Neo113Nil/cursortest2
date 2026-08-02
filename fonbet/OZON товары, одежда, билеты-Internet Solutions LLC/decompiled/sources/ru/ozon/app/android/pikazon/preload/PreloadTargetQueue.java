package ru.ozon.app.android.pikazon.preload;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.l;
import ru.ozon.app.android.pikazon.image.ImageSize;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/preload/PreloadTargetQueue;", "", "size", "", "<init>", "(I)V", "queue", "Ljava/util/Queue;", "Lru/ozon/app/android/pikazon/preload/PreloadTarget;", "next", "imageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadTargetQueue {

    @NotNull
    private final Queue<PreloadTarget> queue;

    public PreloadTargetQueue(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Preload target queue can't be empty");
        }
        int i12 = l.f80283d;
        this.queue = new ArrayDeque(i11);
        for (int i13 = 0; i13 < i11; i13++) {
            this.queue.offer(new PreloadTarget());
        }
    }

    @NotNull
    public final PreloadTarget next(@NotNull ImageSize imageSize) {
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        PreloadTarget poll = this.queue.poll();
        if (poll == null) {
            throw new IllegalStateException("Empty preload target queue");
        }
        this.queue.offer(poll);
        poll.setImageWidth(imageSize.getWidth());
        poll.setImageHeight(imageSize.getHeight());
        return poll;
    }
}
