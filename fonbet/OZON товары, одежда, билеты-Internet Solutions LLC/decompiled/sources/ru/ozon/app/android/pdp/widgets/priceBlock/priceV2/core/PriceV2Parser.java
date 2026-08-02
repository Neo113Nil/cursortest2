package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DTO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DtoWrapper;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005B\u0015\b\u0007\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0003*\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2Parser;", "Lkotlin/Function2;", "", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Info;", "toInfoCardsWrapper", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Info;", "", "priceIsLastItem", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Price;", "toPriceWrapper", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;Z)Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Price;", "multiplicityIsLastItem", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Multiplicity;", "toMultiplicityWrapper", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;Z)Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Multiplicity;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;", "extractDeprecatedInfoCards", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;)Ljava/util/List;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV2Parser implements Function2<String, String, List<? extends PriceV2DtoWrapper>> {

    @NotNull
    private final JsonParser deserializer;

    public PriceV2Parser(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    private final List<PriceV2DTO.BonusInfo> extractDeprecatedInfoCards(PriceV2DTO priceV2DTO) {
        PriceV2DTO.BonusInfo cheaperInfo = priceV2DTO.getCheaperInfo();
        PriceV2DTO.BonusInfo[] elements = {cheaperInfo != null ? PriceV2DTO.BonusInfo.copy$default(cheaperInfo, null, null, null, null, priceV2DTO.getCheaperInfoOnBoarding(), null, 47, null) : null, priceV2DTO.getDutyOnGoods(), priceV2DTO.getBonusInfo()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList B11 = C7705l.B(elements);
        if (B11.isEmpty()) {
            return null;
        }
        return B11;
    }

    private final PriceV2DtoWrapper.Info toInfoCardsWrapper(PriceV2DTO priceV2DTO) {
        List<PriceV2DTO.BonusInfo> infoCards = priceV2DTO.getInfoCards();
        if (infoCards == null) {
            infoCards = extractDeprecatedInfoCards(priceV2DTO);
        }
        if (infoCards == null) {
            return null;
        }
        Boolean showBottomRounding = priceV2DTO.getShowBottomRounding();
        return new PriceV2DtoWrapper.Info(true, showBottomRounding != null ? showBottomRounding.booleanValue() : false, infoCards);
    }

    private final PriceV2DtoWrapper.Multiplicity toMultiplicityWrapper(PriceV2DTO priceV2DTO, boolean z11) {
        TextAtom multiplicityInfo = priceV2DTO.getMultiplicityInfo();
        if (multiplicityInfo == null) {
            return null;
        }
        Boolean showBottomRounding = priceV2DTO.getShowBottomRounding();
        boolean booleanValue = showBottomRounding != null ? showBottomRounding.booleanValue() : false;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_400;
        return new PriceV2DtoWrapper.Multiplicity(z11, booleanValue, TextMapperKt.dsTextAtom$default(multiplicityInfo, null, null, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_200, z11 ? layoutPadding : null, null, null, null, null, null, false, 4035, null));
    }

    private final PriceV2DtoWrapper.Price toPriceWrapper(PriceV2DTO priceV2DTO, boolean z11) {
        Boolean showBottomRounding = priceV2DTO.getShowBottomRounding();
        return new PriceV2DtoWrapper.Price(z11, showBottomRounding != null ? showBottomRounding.booleanValue() : false, priceV2DTO.getOrdinaryPrice(), priceV2DTO.getOzonCardPrice(), priceV2DTO.getVatPrice(), priceV2DTO.getTrackingInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PriceV2DtoWrapper> invoke(String params, String state) {
        JsonParser jsonParser = this.deserializer;
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        PriceV2DTO priceV2DTO = (PriceV2DTO) jsonParser.fromJson(state, PriceV2DTO.class);
        ArrayList arrayList = new ArrayList();
        Boolean showBottomSeparator = priceV2DTO.getShowBottomSeparator();
        boolean booleanValue = showBottomSeparator != null ? showBottomSeparator.booleanValue() : true;
        boolean z11 = priceV2DTO.infoCardsIsEmpty() && priceV2DTO.getMultiplicityInfo() == null;
        boolean infoCardsIsEmpty = priceV2DTO.infoCardsIsEmpty();
        arrayList.add(toPriceWrapper(priceV2DTO, z11));
        if (z11 && booleanValue) {
            arrayList.add(PriceV2DtoWrapper.Separator.INSTANCE);
        }
        PriceV2DtoWrapper.Multiplicity multiplicityWrapper = toMultiplicityWrapper(priceV2DTO, infoCardsIsEmpty);
        if (multiplicityWrapper != null) {
            arrayList.add(multiplicityWrapper);
            if (infoCardsIsEmpty && booleanValue) {
                arrayList.add(PriceV2DtoWrapper.Separator.INSTANCE);
            }
        }
        PriceV2DtoWrapper.Info infoCardsWrapper = toInfoCardsWrapper(priceV2DTO);
        if (infoCardsWrapper != null) {
            arrayList.add(infoCardsWrapper);
            if (booleanValue) {
                arrayList.add(PriceV2DtoWrapper.Separator.INSTANCE);
            }
        }
        return arrayList;
    }
}
