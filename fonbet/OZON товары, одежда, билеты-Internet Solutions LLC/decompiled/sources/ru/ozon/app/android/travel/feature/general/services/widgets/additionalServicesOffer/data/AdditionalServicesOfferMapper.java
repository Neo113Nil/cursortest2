package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.data.AdditionalServicesOfferDTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation.AdditionalServicesOfferVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferDTO$OfferDTO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$OfferVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferDTO$OfferDTO;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$OfferVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferDTO;Ll20/d;)Ljava/util/List;", "", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$AdditionalServicesOfferTheme;", "mapTheme", "Ljava/util/Map;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdditionalServicesOfferMapper implements Function2<AdditionalServicesOfferDTO, d, List<? extends AdditionalServicesOfferVO>> {

    @NotNull
    private final Map<String, AdditionalServicesOfferVO.AdditionalServicesOfferTheme> mapTheme = U.j(new Pair("additionalServicesOffer", AdditionalServicesOfferVO.AdditionalServicesOfferTheme.DEFAULT), new Pair("additionalServicesOfferShaded", AdditionalServicesOfferVO.AdditionalServicesOfferTheme.SHADED));

    private final AdditionalServicesOfferVO.OfferVO toVO(AdditionalServicesOfferDTO.OfferDTO offerDTO) {
        return new AdditionalServicesOfferVO.OfferVO(offerDTO.getOfferTitle().getText().hashCode(), MapperExtKt.toVO(offerDTO.getOfferIconLink()), offerDTO.getOfferTitle(), offerDTO.getOfferSubtitle(), offerDTO.getBadge(), offerDTO.getDirectIcon(), AtomActionMapperKt.toAtomAction(offerDTO.getAction(), offerDTO.getTrackingInfo()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdditionalServicesOfferVO> invoke(@NotNull AdditionalServicesOfferDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        AdditionalServicesOfferVO.AdditionalServicesOfferTheme additionalServicesOfferTheme = this.mapTheme.get(widgetInfo.c().b());
        if (additionalServicesOfferTheme == null) {
            return K.f71697a;
        }
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = dto.getTitle();
        List<AdditionalServicesOfferDTO.OfferDTO> offers = dto.getOffers();
        ArrayList arrayList = new ArrayList(C7714v.z(offers, 10));
        Iterator<T> it = offers.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((AdditionalServicesOfferDTO.OfferDTO) it.next()));
        }
        return C7714v.a0(new AdditionalServicesOfferVO(hashCode, title, arrayList, additionalServicesOfferTheme));
    }
}
