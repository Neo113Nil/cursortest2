package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.data;

import Ih.a;
import Tc.b;
import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.data.HotelsFavoritesCollectionsDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.presentation.HotelsFavoritesCollectionVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/data/HotelsFavoritesCollectionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/data/HotelsFavoritesCollectionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "info", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/data/HotelsFavoritesCollectionsDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsFavoritesCollectionsMapper implements Function2<HotelsFavoritesCollectionsDTO, d, List<? extends HotelsFavoritesCollectionVI>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsFavoritesCollectionVI> invoke(@NotNull HotelsFavoritesCollectionsDTO state, @NotNull d info) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        d info2 = info;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info2, "info");
        if (state.getCollections().isEmpty()) {
            return K.f71697a;
        }
        int size = state.getCollections().size();
        boolean z11 = size % 2 == 0;
        int i11 = z11 ? size - 2 : size - 1;
        Boolean isFirstPortion = state.isFirstPortion();
        boolean booleanValue = isFirstPortion != null ? isFirstPortion.booleanValue() : false;
        Boolean isLastPortion = state.isLastPortion();
        boolean booleanValue2 = isLastPortion != null ? isLastPortion.booleanValue() : false;
        b builder = C7714v.B();
        int i12 = 0;
        for (Object obj : state.getCollections()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            HotelsFavoritesCollectionsDTO.FavCollection favCollection = (HotelsFavoritesCollectionsDTO.FavCollection) obj;
            OzonSpannableString text = favCollection.getTitle().getText();
            long hashCode = (((Object) text) + "-" + info2.d()).hashCode();
            TextDTO title = favCollection.getTitle();
            TextDTO subtitle = favCollection.getSubtitle();
            List<? extends String> m1352constructorimpl = HotelsFavoritesCollectionVI.ImagesLinks.m1352constructorimpl(favCollection.getImagesLinks());
            CommonControlSettings common = favCollection.getCommon();
            AtomAction atomAction = common != null ? common.toAtomAction() : null;
            CommonControlSettings common2 = favCollection.getCommon();
            builder.add(new HotelsFavoritesCollectionVI(hashCode, new HotelsFavoritesCollectionVI.Model(title, subtitle, m1352constructorimpl, atomAction, (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) ? null : x.d(trackingInfo, info2), null), new HotelsFavoritesCollectionVI.Placement(i12 % 2 == 0 ? HotelsFavoritesCollectionVI.Position.LEFT : HotelsFavoritesCollectionVI.Position.RIGHT, booleanValue && i12 < 2, booleanValue2 && i12 >= i11)));
            info2 = info;
            i12 = i13;
        }
        if (booleanValue2 && !z11) {
            builder.add(new HotelsFavoritesCollectionVI(a.a("empty-model-", info.d()), null, new HotelsFavoritesCollectionVI.Placement(HotelsFavoritesCollectionVI.Position.RIGHT, booleanValue && size < 2, true)));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
