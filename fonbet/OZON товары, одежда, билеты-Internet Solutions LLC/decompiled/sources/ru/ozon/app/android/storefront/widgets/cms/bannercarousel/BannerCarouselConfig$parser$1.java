package ru.ozon.app.android.storefront.widgets.cms.bannercarousel;

import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.utils.NetworkExtensionsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselParamsDTO;", "<unused var>", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BannerCarouselConfig$parser$1 extends AbstractC7737t implements Function2<String, String, BannerCarouselParamsDTO> {
    final /* synthetic */ Moshi $moshi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerCarouselConfig$parser$1(Moshi moshi) {
        super(2);
        this.$moshi = moshi;
    }

    @Override // kotlin.jvm.functions.Function2
    public final BannerCarouselParamsDTO invoke(String str, String str2) {
        if (str2 != null) {
            return (BannerCarouselParamsDTO) NetworkExtensionsKt.skipItemIntoListIfNull(this.$moshi, BannerCarouselItemDTO.class).c(BannerCarouselParamsDTO.class).fromJson(str2);
        }
        return null;
    }
}
