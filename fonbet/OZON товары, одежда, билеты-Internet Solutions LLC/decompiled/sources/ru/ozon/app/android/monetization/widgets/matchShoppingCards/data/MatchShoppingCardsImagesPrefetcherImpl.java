package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsImagesPrefetcher;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsImagesPrefetcherImpl;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsImagesPrefetcher;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "pikazonPrefetcher", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "prefetch", "", "images", "", "clear", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MatchShoppingCardsImagesPrefetcherImpl implements MatchShoppingCardsImagesPrefetcher {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<ImageDTO> pikazonPrefetcher;

    public MatchShoppingCardsImagesPrefetcherImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ImageDTO.class), new ImagePrefetchInfoProvider<ImageDTO>() { // from class: ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsImagesPrefetcherImpl$pikazonPrefetcher$1$1
            @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
            public ImageSize getSize(ImageDTO item, Context context2) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(context2, "context");
                int intValue = ResourceExtKt.getDisplaySizePx(context2).a().intValue();
                ImageAspectRatio aspectRatio = item.getAspectRatio();
                if (aspectRatio == null) {
                    aspectRatio = ImageAspectRatio.RATIO_3_4;
                }
                return new ImageSize(intValue, (aspectRatio.getHeightRatio() * intValue) / aspectRatio.getWidthRatio());
            }

            @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
            public String getUrl(ImageDTO item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return item.getImage();
            }
        });
        Unit unit = Unit.f71690a;
        this.pikazonPrefetcher = new ImagePrefetcher<>(15, imagePrefetchInfoProviderStorage);
    }

    @Override // ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsImagesPrefetcher
    public void clear() {
        this.pikazonPrefetcher.clear(this.context);
    }

    @Override // ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsImagesPrefetcher
    public void prefetch(@NotNull List<ImageDTO> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.pikazonPrefetcher.prefetch(this.context, images);
    }
}
