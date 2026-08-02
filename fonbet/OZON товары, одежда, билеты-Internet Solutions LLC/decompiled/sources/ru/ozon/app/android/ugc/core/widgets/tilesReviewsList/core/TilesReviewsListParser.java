package ru.ozon.app.android.ugc.core.widgets.tilesReviewsList.core;

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
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollDTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.SingleReviewDTOMappersKt;
import ru.ozon.app.android.ugc.core.widgets.tilesReviewsList.data.TilesReviewsListDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u0000 \u001d2.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005:\u0001\u001dB\u0013\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/core/TilesReviewsListParser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "height", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "getSeparatorDTO", "(I)Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "getIslandSeparatorDTO", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/data/TilesReviewsListDTO$TileReviewDTO;", "", "hasTileOrHeader", "(Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/data/TilesReviewsListDTO$TileReviewDTO;)Z", "hasMediaCentric", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TilesReviewsListParser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/tilesReviewsList/core/TilesReviewsListParser$Companion;", "", "<init>", "()V", "TILE_REVIEW_PADDING", "", "SECTION_TOP_PADDING", "BETWEEN_SECTIONS_PADDING", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TilesReviewsListParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final IslandSeparatorDTO getIslandSeparatorDTO() {
        return new IslandSeparatorDTO(4, UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null);
    }

    private final SeparatorDTO getSeparatorDTO(int height) {
        return new SeparatorDTO(null, Integer.valueOf(height), UniColors.LAYER_FLOOR_1.getToken());
    }

    private final boolean hasMediaCentric(TilesReviewsListDTO.TileReviewDTO tileReviewDTO) {
        return tileReviewDTO.getReview().getMediaCentric() != null;
    }

    private final boolean hasTileOrHeader(TilesReviewsListDTO.TileReviewDTO tileReviewDTO) {
        return (tileReviewDTO.getTile() == null && tileReviewDTO.getReview().getHeader() == null) ? false : true;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.jsonDeserializer;
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        TilesReviewsListDTO tilesReviewsListDTO = (TilesReviewsListDTO) jsonParser.fromJson(state, TilesReviewsListDTO.class);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : tilesReviewsListDTO.getReviews()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TilesReviewsListDTO.TileReviewDTO tileReviewDTO = (TilesReviewsListDTO.TileReviewDTO) obj;
            if (i11 != 0 && !hasMediaCentric(tileReviewDTO) && hasTileOrHeader(tileReviewDTO)) {
                arrayList.add(getSeparatorDTO(16));
            }
            SkuThinScrollDTO tile = tileReviewDTO.getTile();
            if (tile != null) {
                arrayList.add(tile);
                arrayList.add(getSeparatorDTO(16));
            }
            arrayList.addAll(SingleReviewDTOMappersKt.toSubDTOList(tileReviewDTO.getReview()));
            if (i11 != C7714v.P(tilesReviewsListDTO.getReviews())) {
                arrayList.add(getIslandSeparatorDTO());
            }
            i11 = i12;
        }
        return arrayList;
    }
}
