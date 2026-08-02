package ru.ozon.app.android.pdp.offline.widgetfactory;

import com.squareup.moshi.Moshi;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.pdp.offline.widgetfactory.core.WidgetFactory$Base;
import ru.ozon.app.android.pdp.widgets.galleryV4.core.GalleryV4Config;
import ru.ozon.app.android.pdp.widgets.galleryV4.data.GalleryV4DTO;
import z00.e;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/offline/widgetfactory/GalleryV4WidgetFactory;", "Lru/ozon/app/android/pdp/offline/widgetfactory/core/WidgetFactory$Base;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineScreenWidgetsData", "Lru/ozon/app/android/pdp/widgets/galleryV4/core/GalleryV4Config;", "galleryV4Config", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/pdp/widgets/galleryV4/core/GalleryV4Config;Lcom/squareup/moshi/Moshi;)V", "Lz00/e;", "builder", "", "appendWidget", "(Lz00/e;)V", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lru/ozon/app/android/pdp/widgets/galleryV4/core/GalleryV4Config;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4WidgetFactory extends WidgetFactory$Base<GalleryV4DTO> {

    @NotNull
    private final GalleryV4Config galleryV4Config;

    @NotNull
    private final PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4WidgetFactory(@NotNull PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull GalleryV4Config galleryV4Config, @NotNull Moshi moshi) {
        super(moshi, GalleryV4DTO.class);
        Intrinsics.checkNotNullParameter(pdpOfflineScreenWidgetsData, "pdpOfflineScreenWidgetsData");
        Intrinsics.checkNotNullParameter(galleryV4Config, "galleryV4Config");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.pdpOfflineScreenWidgetsData = pdpOfflineScreenWidgetsData;
        this.galleryV4Config = galleryV4Config;
    }

    public void appendWidget(@NotNull e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        String productImageUrl = this.pdpOfflineScreenWidgetsData.productImageUrl();
        if (productImageUrl != null) {
            long[] supportedVersions = this.galleryV4Config.getSupportedVersions();
            Intrinsics.checkNotNullParameter(supportedVersions, "<this>");
            if (supportedVersions.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            builder.a(supportedVersions[0], "pdp", "galleryPreview", getAdapter().toJson(new GalleryV4DTO(C7714v.a0(new GalleryV4DTO.GalleryItem(new GalleryV4DTO.GalleryItem.ContentWrapper.Image(productImageUrl), Double.valueOf(1.0d), false, null, null, 4, null)), "", "", null, 1.0d, "layerFloor3", null)));
        }
    }
}
