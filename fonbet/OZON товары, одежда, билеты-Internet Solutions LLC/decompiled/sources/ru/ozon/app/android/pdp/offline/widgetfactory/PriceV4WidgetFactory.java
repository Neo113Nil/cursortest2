package ru.ozon.app.android.pdp.offline.widgetfactory;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.Moshi;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.pdp.offline.widgetfactory.core.WidgetFactory$Base;
import ru.ozon.app.android.pdp.widgets.priceV4.core.PriceV4Config;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import z00.e;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/offline/widgetfactory/PriceV4WidgetFactory;", "Lru/ozon/app/android/pdp/offline/widgetfactory/core/WidgetFactory$Base;", "Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineScreenWidgetsData", "Lru/ozon/app/android/pdp/widgets/priceV4/core/PriceV4Config;", "priceV4Config", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/pdp/widgets/priceV4/core/PriceV4Config;Lcom/squareup/moshi/Moshi;)V", "Lz00/e;", "builder", "", "appendWidget", "(Lz00/e;)V", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lru/ozon/app/android/pdp/widgets/priceV4/core/PriceV4Config;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV4WidgetFactory extends WidgetFactory$Base<PriceV4DTO> {

    @NotNull
    private final PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;

    @NotNull
    private final PriceV4Config priceV4Config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceV4WidgetFactory(@NotNull PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull PriceV4Config priceV4Config, @NotNull Moshi moshi) {
        super(moshi, PriceV4DTO.class);
        Intrinsics.checkNotNullParameter(pdpOfflineScreenWidgetsData, "pdpOfflineScreenWidgetsData");
        Intrinsics.checkNotNullParameter(priceV4Config, "priceV4Config");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.pdpOfflineScreenWidgetsData = pdpOfflineScreenWidgetsData;
        this.priceV4Config = priceV4Config;
    }

    public void appendWidget(@NotNull e builder) {
        PriceDTO copy;
        Intrinsics.checkNotNullParameter(builder, "builder");
        PriceDTO productPrice = this.pdpOfflineScreenWidgetsData.productPrice();
        if (productPrice != null) {
            copy = productPrice.copy((r29 & 1) != 0 ? productPrice.price : null, (r29 & 2) != 0 ? productPrice.discount : null, (r29 & 4) != 0 ? productPrice.backgroundCapacity : null, (r29 & 8) != 0 ? productPrice.priceStyle : null, (r29 & 16) != 0 ? productPrice.preset : PriceDTO.Preset.SIZE_500, (r29 & 32) != 0 ? productPrice.paddingLeft : null, (r29 & 64) != 0 ? productPrice.paddingRight : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productPrice.paddingTop : Paddings.PADDING_300, (r29 & 256) != 0 ? productPrice.paddingBottom : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productPrice.context : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productPrice.testInfo : null, (r29 & 2048) != 0 ? productPrice.trackingInfo : null, (r29 & 4096) != 0 ? productPrice.discountColor : null, (r29 & 8192) != 0 ? productPrice.isStrikethroughLineHidden : false);
            long[] supportedVersions = this.priceV4Config.getSupportedVersions();
            Intrinsics.checkNotNullParameter(supportedVersions, "<this>");
            if (supportedVersions.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            builder.a(supportedVersions[0], "pdp", "price", getAdapter().toJson(new PriceV4DTO(copy, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null)));
        }
    }
}
