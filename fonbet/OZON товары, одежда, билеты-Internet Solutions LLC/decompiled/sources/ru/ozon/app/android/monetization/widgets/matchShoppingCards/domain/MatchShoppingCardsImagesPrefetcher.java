package ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsImagesPrefetcher;", "", "prefetch", "", "images", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "clear", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MatchShoppingCardsImagesPrefetcher {
    void clear();

    void prefetch(@NotNull List<ImageDTO> images);
}
