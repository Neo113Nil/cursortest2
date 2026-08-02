package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation;

import Ak.C2436a;
import G.g;
import N3.C3660k;
import Nh.a;
import Tl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001;Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b+\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b\u0016\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO$PriceVO;", "prices", "totalPriceTitle", "totalPrice", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "priceInfoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "agreementText", "Lru/ozon/uni/atoms/data/badge/Badge;", "bonusButton", "", "isSeparatorVisible", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getPrices", "()Ljava/util/List;", "getTotalPriceTitle", "getTotalPrice", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getPriceInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAgreementText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBonusButton", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Z", "()Z", "PriceVO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPriceDetailInformationVO implements c {
    private final TextAtom agreementText;
    private final Badge bonusButton;
    private final long id;
    private final boolean isSeparatorVisible;

    @NotNull
    private final ButtonV3Atom.LargeButton largeButton;
    private final ButtonV3Atom.SmallIconButton priceInfoButton;

    @NotNull
    private final List<PriceVO> prices;
    private final String subtitle;

    @NotNull
    private final String title;

    @NotNull
    private final String totalPrice;

    @NotNull
    private final String totalPriceTitle;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO$PriceVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "price", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "detailsButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getPrice", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getDetailsButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceVO {
        private final LinkButtonVO detailsButton;

        @NotNull
        private final String price;

        @NotNull
        private final String title;

        public PriceVO(@NotNull String title, @NotNull String price, LinkButtonVO linkButtonVO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            this.title = title;
            this.price = price;
            this.detailsButton = linkButtonVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceVO)) {
                return false;
            }
            PriceVO priceVO = (PriceVO) other;
            return Intrinsics.d(this.title, priceVO.title) && Intrinsics.d(this.price, priceVO.price) && Intrinsics.d(this.detailsButton, priceVO.detailsButton);
        }

        public final LinkButtonVO getDetailsButton() {
            return this.detailsButton;
        }

        @NotNull
        public final String getPrice() {
            return this.price;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.price);
            LinkButtonVO linkButtonVO = this.detailsButton;
            return a11 + (linkButtonVO == null ? 0 : linkButtonVO.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.price;
            LinkButtonVO linkButtonVO = this.detailsButton;
            StringBuilder d11 = C3660k.d("PriceVO(title=", str, ", price=", str2, ", detailsButton=");
            d11.append(linkButtonVO);
            d11.append(")");
            return d11.toString();
        }
    }

    public TravelPriceDetailInformationVO(long j11, @NotNull String title, String str, @NotNull List<PriceVO> prices, @NotNull String totalPriceTitle, @NotNull String totalPrice, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull ButtonV3Atom.LargeButton largeButton, TextAtom textAtom, Badge badge, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(totalPriceTitle, "totalPriceTitle");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(largeButton, "largeButton");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.prices = prices;
        this.totalPriceTitle = totalPriceTitle;
        this.totalPrice = totalPrice;
        this.priceInfoButton = smallIconButton;
        this.largeButton = largeButton;
        this.agreementText = textAtom;
        this.bonusButton = badge;
        this.isSeparatorVisible = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPriceDetailInformationVO)) {
            return false;
        }
        TravelPriceDetailInformationVO travelPriceDetailInformationVO = (TravelPriceDetailInformationVO) other;
        return this.id == travelPriceDetailInformationVO.id && Intrinsics.d(this.title, travelPriceDetailInformationVO.title) && Intrinsics.d(this.subtitle, travelPriceDetailInformationVO.subtitle) && Intrinsics.d(this.prices, travelPriceDetailInformationVO.prices) && Intrinsics.d(this.totalPriceTitle, travelPriceDetailInformationVO.totalPriceTitle) && Intrinsics.d(this.totalPrice, travelPriceDetailInformationVO.totalPrice) && Intrinsics.d(this.priceInfoButton, travelPriceDetailInformationVO.priceInfoButton) && Intrinsics.d(this.largeButton, travelPriceDetailInformationVO.largeButton) && Intrinsics.d(this.agreementText, travelPriceDetailInformationVO.agreementText) && Intrinsics.d(this.bonusButton, travelPriceDetailInformationVO.bonusButton) && this.isSeparatorVisible == travelPriceDetailInformationVO.isSeparatorVisible;
    }

    public final TextAtom getAgreementText() {
        return this.agreementText;
    }

    public final Badge getBonusButton() {
        return this.bonusButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    public final ButtonV3Atom.SmallIconButton getPriceInfoButton() {
        return this.priceInfoButton;
    }

    @NotNull
    public final List<PriceVO> getPrices() {
        return this.prices;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    public final String getTotalPriceTitle() {
        return this.totalPriceTitle;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int a12 = g.a(g.a(g.b((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.prices), 31, this.totalPriceTitle), 31, this.totalPrice);
        ButtonV3Atom.SmallIconButton smallIconButton = this.priceInfoButton;
        int a13 = b.a(this.largeButton, (a12 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31, 31);
        TextAtom textAtom = this.agreementText;
        int hashCode = (a13 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Badge badge = this.bonusButton;
        return Boolean.hashCode(this.isSeparatorVisible) + ((hashCode + (badge != null ? badge.hashCode() : 0)) * 31);
    }

    /* renamed from: isSeparatorVisible, reason: from getter */
    public final boolean getIsSeparatorVisible() {
        return this.isSeparatorVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        List<PriceVO> list = this.prices;
        String str3 = this.totalPriceTitle;
        String str4 = this.totalPrice;
        ButtonV3Atom.SmallIconButton smallIconButton = this.priceInfoButton;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        TextAtom textAtom = this.agreementText;
        Badge badge = this.bonusButton;
        boolean z11 = this.isSeparatorVisible;
        StringBuilder c11 = C2436a.c(j11, "TravelPriceDetailInformationVO(id=", ", title=", str);
        a.g(", subtitle=", str2, ", prices=", c11, list);
        a.h(c11, ", totalPriceTitle=", str3, ", totalPrice=", str4);
        c11.append(", priceInfoButton=");
        c11.append(smallIconButton);
        c11.append(", largeButton=");
        c11.append(largeButton);
        c11.append(", agreementText=");
        c11.append(textAtom);
        c11.append(", bonusButton=");
        c11.append(badge);
        return Bi.b.f(c11, ", isSeparatorVisible=", z11, ")");
    }
}
