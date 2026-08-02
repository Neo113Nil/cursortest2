package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data.PromoReviewItemDTO;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data.PromoReviewProductsV3DTO;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data.PromoReviewSectionDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005:\u0001\u0019B\u0015\b\u0007\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/core/PromoReviewProductsV3Parser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "height", "color", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "getSeparatorDTO", "(ILjava/lang/String;)Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "getIslandSeparatorDTO", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoReviewProductsV3Parser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final JsonParser jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/core/PromoReviewProductsV3Parser$Companion;", "", "<init>", "()V", "SECTION_VERTICAL_PADDING", "", "ITEM_TOP_PADDING", "BETWEEN_SECTIONS_PADDING", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PromoReviewProductsV3Parser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final IslandSeparatorDTO getIslandSeparatorDTO() {
        return new IslandSeparatorDTO(4, UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null);
    }

    private final SeparatorDTO getSeparatorDTO(int height, String color) {
        return new SeparatorDTO(null, Integer.valueOf(height), color);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.jsonDeserializer;
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List<PromoReviewSectionDTO> sections = ((PromoReviewProductsV3DTO) jsonParser.fromJson(state, PromoReviewProductsV3DTO.class)).getSections();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : sections) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            PromoReviewSectionDTO promoReviewSectionDTO = (PromoReviewSectionDTO) obj;
            if (i11 != 0) {
                arrayList.add(getSeparatorDTO(16, promoReviewSectionDTO.getBackgroundColor()));
            }
            arrayList.add(promoReviewSectionDTO.getHeader());
            List<PromoReviewItemDTO> items = promoReviewSectionDTO.getItems();
            if (items != null) {
                int i13 = 0;
                for (Object obj2 : items) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    PromoReviewItemDTO promoReviewItemDTO = (PromoReviewItemDTO) obj2;
                    if (i13 != 0) {
                        arrayList.add(getSeparatorDTO(12, promoReviewSectionDTO.getBackgroundColor()));
                    }
                    arrayList.add(promoReviewItemDTO);
                    i13 = i14;
                }
            }
            if (i11 != C7714v.P(sections)) {
                arrayList.add(getSeparatorDTO(16, promoReviewSectionDTO.getBackgroundColor()));
                arrayList.add(getIslandSeparatorDTO());
            }
            i11 = i12;
        }
        return arrayList;
    }
}
