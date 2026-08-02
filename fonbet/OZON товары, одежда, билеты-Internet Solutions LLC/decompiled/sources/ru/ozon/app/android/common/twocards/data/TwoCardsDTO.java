package ru.ozon.app.android.common.twocards.data;

import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.PriceWithPoints;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/common/twocards/data/TwoCardsDTO;", "", "leftCard", "Lru/ozon/app/android/common/twocards/data/TwoCardsDTO$CardDTO;", "rightCard", "<init>", "(Lru/ozon/app/android/common/twocards/data/TwoCardsDTO$CardDTO;Lru/ozon/app/android/common/twocards/data/TwoCardsDTO$CardDTO;)V", "getLeftCard", "()Lru/ozon/app/android/common/twocards/data/TwoCardsDTO$CardDTO;", "getRightCard", "isSingle", "", "()Z", "CardDTO", "two-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TwoCardsDTO {

    @NotNull
    private final CardDTO leftCard;
    private final CardDTO rightCard;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/common/twocards/data/TwoCardsDTO$CardDTO;", "", "gradientColors", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "tintColor", "priceWithPoints", "Lru/ozon/uni/atoms/data/price/PriceWithPoints;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceWithPoints;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getGradientColors", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getTintColor", "getPriceWithPoints", "()Lru/ozon/uni/atoms/data/price/PriceWithPoints;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "two-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardDTO {
        private final AtomActionDTO action;
        private final Badge badge;
        private final List<String> gradientColors;
        private final PriceWithPoints priceWithPoints;
        private final TestInfo testInfo;
        private final String tintColor;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CardDTO(List<String> list, @NotNull String title, String str, PriceWithPoints priceWithPoints, Badge badge, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.gradientColors = list;
            this.title = title;
            this.tintColor = str;
            this.priceWithPoints = priceWithPoints;
            this.badge = badge;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Badge getBadge() {
            return this.badge;
        }

        public final List<String> getGradientColors() {
            return this.gradientColors;
        }

        public final PriceWithPoints getPriceWithPoints() {
            return this.priceWithPoints;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }
    }

    public TwoCardsDTO(@NotNull CardDTO leftCard, CardDTO cardDTO) {
        Intrinsics.checkNotNullParameter(leftCard, "leftCard");
        this.leftCard = leftCard;
        this.rightCard = cardDTO;
    }

    @NotNull
    public final CardDTO getLeftCard() {
        return this.leftCard;
    }

    public final CardDTO getRightCard() {
        return this.rightCard;
    }

    public final boolean isSingle() {
        return this.rightCard == null;
    }
}
