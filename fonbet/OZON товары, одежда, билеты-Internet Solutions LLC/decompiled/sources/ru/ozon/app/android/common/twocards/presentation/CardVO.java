package ru.ozon.app.android.common.twocards.presentation;

import Cm.e;
import G.g;
import Lh.b;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.PriceWithPoints;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001>Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lru/ozon/app/android/common/twocards/presentation/CardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "", "gradientColors", SelectionItemFormDTO.TITLE_FIELD_NAME, "tintColor", "Lru/ozon/uni/atoms/data/price/PriceWithPoints;", "priceWithPoints", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/common/twocards/presentation/CardVO$CardPaddingsModel;", "cardPaddingsModel", "<init>", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceWithPoints;Lru/ozon/uni/atoms/data/badge/Badge;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/common/twocards/presentation/CardVO$CardPaddingsModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getGradientColors", "()Ljava/util/List;", "Ljava/lang/String;", "getTitle", "getTintColor", "Lru/ozon/uni/atoms/data/price/PriceWithPoints;", "getPriceWithPoints", "()Lru/ozon/uni/atoms/data/price/PriceWithPoints;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/common/twocards/presentation/CardVO$CardPaddingsModel;", "getCardPaddingsModel", "()Lru/ozon/app/android/common/twocards/presentation/CardVO$CardPaddingsModel;", "CardPaddingsModel", "two-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardVO implements c {
    private final AtomAction action;
    private final Badge badge;

    @NotNull
    private final CardPaddingsModel cardPaddingsModel;

    @NotNull
    private final List<String> gradientColors;
    private final long id;
    private final PriceWithPoints priceWithPoints;
    private final TestInfo testInfo;
    private final String tintColor;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/common/twocards/presentation/CardVO$CardPaddingsModel;", "", "", "paddingStart", "paddingEnd", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "getPaddingEnd", "two-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardPaddingsModel {
        private final int paddingEnd;
        private final int paddingStart;

        public CardPaddingsModel(int i11, int i12) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardPaddingsModel)) {
                return false;
            }
            CardPaddingsModel cardPaddingsModel = (CardPaddingsModel) other;
            return this.paddingStart == cardPaddingsModel.paddingStart && this.paddingEnd == cardPaddingsModel.paddingEnd;
        }

        public final int getPaddingEnd() {
            return this.paddingEnd;
        }

        public final int getPaddingStart() {
            return this.paddingStart;
        }

        public int hashCode() {
            return Integer.hashCode(this.paddingEnd) + (Integer.hashCode(this.paddingStart) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("CardPaddingsModel(paddingStart=", this.paddingStart, ", paddingEnd=", ")", this.paddingEnd);
        }
    }

    public CardVO(long j11, @NotNull List<String> gradientColors, @NotNull String title, String str, PriceWithPoints priceWithPoints, Badge badge, t tVar, TestInfo testInfo, AtomAction atomAction, @NotNull CardPaddingsModel cardPaddingsModel) {
        Intrinsics.checkNotNullParameter(gradientColors, "gradientColors");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cardPaddingsModel, "cardPaddingsModel");
        this.id = j11;
        this.gradientColors = gradientColors;
        this.title = title;
        this.tintColor = str;
        this.priceWithPoints = priceWithPoints;
        this.badge = badge;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
        this.action = atomAction;
        this.cardPaddingsModel = cardPaddingsModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardVO)) {
            return false;
        }
        CardVO cardVO = (CardVO) other;
        return this.id == cardVO.id && Intrinsics.d(this.gradientColors, cardVO.gradientColors) && Intrinsics.d(this.title, cardVO.title) && Intrinsics.d(this.tintColor, cardVO.tintColor) && Intrinsics.d(this.priceWithPoints, cardVO.priceWithPoints) && Intrinsics.d(this.badge, cardVO.badge) && Intrinsics.d(this.tokenizedEvent, cardVO.tokenizedEvent) && Intrinsics.d(this.testInfo, cardVO.testInfo) && Intrinsics.d(this.action, cardVO.action) && Intrinsics.d(this.cardPaddingsModel, cardVO.cardPaddingsModel);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final CardPaddingsModel getCardPaddingsModel() {
        return this.cardPaddingsModel;
    }

    @NotNull
    public final List<String> getGradientColors() {
        return this.gradientColors;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final PriceWithPoints getPriceWithPoints() {
        return this.priceWithPoints;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.b(Long.hashCode(this.id) * 31, 31, this.gradientColors), 31, this.title);
        String str = this.tintColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        PriceWithPoints priceWithPoints = this.priceWithPoints;
        int hashCode2 = (hashCode + (priceWithPoints == null ? 0 : priceWithPoints.hashCode())) * 31;
        Badge badge = this.badge;
        int hashCode3 = (hashCode2 + (badge == null ? 0 : badge.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return this.cardPaddingsModel.hashCode() + ((hashCode5 + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<String> list = this.gradientColors;
        String str = this.title;
        String str2 = this.tintColor;
        PriceWithPoints priceWithPoints = this.priceWithPoints;
        Badge badge = this.badge;
        t tVar = this.tokenizedEvent;
        TestInfo testInfo = this.testInfo;
        AtomAction atomAction = this.action;
        CardPaddingsModel cardPaddingsModel = this.cardPaddingsModel;
        StringBuilder b11 = b.b(j11, "CardVO(id=", ", gradientColors=", list);
        a.h(b11, ", title=", str, ", tintColor=", str2);
        b11.append(", priceWithPoints=");
        b11.append(priceWithPoints);
        b11.append(", badge=");
        b11.append(badge);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", testInfo=");
        b11.append(testInfo);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", cardPaddingsModel=");
        b11.append(cardPaddingsModel);
        b11.append(")");
        return b11.toString();
    }
}
