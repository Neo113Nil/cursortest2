package ru.ozon.app.android.fresh.main.widgets.bannerList.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.main.widgets.bannerList.data.BannerListDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005B\u0013\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListParser;", "Lkotlin/Function2;", "", "", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerRow;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "index", "lastIndex", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;", "roundedCorners", "calculateRoundedItem", "(IILru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;)Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerListParser implements Function2<String, String, List<? extends BannerRow>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public BannerListParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final BannerListDTO.RoundedCorners calculateRoundedItem(int index, int lastIndex, BannerListDTO.RoundedCorners roundedCorners) {
        if (index == 0 && index == lastIndex) {
            return roundedCorners;
        }
        if (index == 0 && index != lastIndex && roundedCorners != BannerListDTO.RoundedCorners.BOTTOM) {
            return BannerListDTO.RoundedCorners.TOP;
        }
        if (index != lastIndex || roundedCorners == BannerListDTO.RoundedCorners.TOP) {
            return null;
        }
        return BannerListDTO.RoundedCorners.BOTTOM;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BannerRow> invoke(String params, String state) {
        BannerListDTO bannerListDTO;
        if (state == null || (bannerListDTO = (BannerListDTO) this.jsonDeserializer.fromJson(state, BannerListDTO.class)) == null) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        int P11 = C7714v.P(bannerListDTO.getItems());
        int i11 = 0;
        for (Object obj : bannerListDTO.getItems()) {
            int i12 = i11 + 1;
            BannerListDTO.RoundedCorners roundedCorners = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            BannerListDTO.BannerListItem bannerListItem = (BannerListDTO.BannerListItem) obj;
            if (bannerListDTO.getRoundedCorners() != null) {
                roundedCorners = calculateRoundedItem(i11, P11, bannerListDTO.getRoundedCorners());
            }
            arrayList.add(new BannerRow(roundedCorners, bannerListItem, i11, P11));
            i11 = i12;
        }
        return arrayList;
    }
}
