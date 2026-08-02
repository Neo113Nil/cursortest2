package ru.ozon.app.android.domain.tiles.dislike;

import Ae.InterfaceC2395h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.tiles.dislike.model.DislikeResult;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeId;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeInfo;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeInfo;", "info", "", "dislike", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeInfo;)V", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "dislikeId", "", "isDisliked", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;)Z", "LAe/h;", "Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult;", "observeDislikeInfo", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;)LAe/h;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TileDislikeInteractor {
    void dislike(@NotNull TileDislikeInfo info);

    boolean isDisliked(@NotNull TileDislikeId dislikeId);

    @NotNull
    InterfaceC2395h<DislikeResult> observeDislikeInfo(@NotNull TileDislikeId dislikeId);
}
