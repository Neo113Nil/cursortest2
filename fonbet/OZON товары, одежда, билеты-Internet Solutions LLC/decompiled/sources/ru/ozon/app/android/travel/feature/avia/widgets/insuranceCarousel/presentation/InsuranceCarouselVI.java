package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation;

import De.C2859b;
import El.C2971a;
import G.g;
import Kk.C3532b;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001:\u00013BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u0010\u0018¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "logoImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI$InsuranceCarouselCardVI;", "insurances", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "LWZ/t;", "viewTracking", "", "selectedCardIndex", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/TestInfo;LWZ/t;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getLogoImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getInsurances", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "LWZ/t;", "getViewTracking", "()LWZ/t;", "I", "getSelectedCardIndex", "InsuranceCarouselCardVI", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InsuranceCarouselVI implements c {
    private final long id;

    @NotNull
    private final List<InsuranceCarouselCardVI> insurances;
    private final ImageDTO logoImage;
    private final int selectedCardIndex;
    private final TextDTO subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO title;
    private final t viewTracking;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b\u0013\u0010:R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI$InsuranceCarouselCardVI;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitleText", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "subtitlePrice", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "benefits", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "borderColor", "", "isSelected", "LWZ/t;", "viewTracking", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "insuranceDetailsAction", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;ZLWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitleText", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSubtitlePrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Ljava/util/List;", "getBenefits", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getBorderColor", "Z", "()Z", "LWZ/t;", "getViewTracking", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/atoms/af/AtomAction;", "getInsuranceDetailsAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InsuranceCarouselCardVI {
        private final BadgeDTO badge;

        @NotNull
        private final List<CellDTO> benefits;

        @NotNull
        private final String borderColor;

        @NotNull
        private final ButtonV3DTO button;
        private final long id;
        private final AtomAction insuranceDetailsAction;
        private final boolean isSelected;
        private final PriceDTO subtitlePrice;
        private final TextDTO subtitleText;
        private final TestInfo testInfo;

        @NotNull
        private final TextDTO title;
        private final t viewTracking;

        public InsuranceCarouselCardVI(long j11, @NotNull TextDTO title, TextDTO textDTO, PriceDTO priceDTO, @NotNull List<CellDTO> benefits, BadgeDTO badgeDTO, @NotNull ButtonV3DTO button, @NotNull String borderColor, boolean z11, t tVar, TestInfo testInfo, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            this.id = j11;
            this.title = title;
            this.subtitleText = textDTO;
            this.subtitlePrice = priceDTO;
            this.benefits = benefits;
            this.badge = badgeDTO;
            this.button = button;
            this.borderColor = borderColor;
            this.isSelected = z11;
            this.viewTracking = tVar;
            this.testInfo = testInfo;
            this.insuranceDetailsAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InsuranceCarouselCardVI)) {
                return false;
            }
            InsuranceCarouselCardVI insuranceCarouselCardVI = (InsuranceCarouselCardVI) other;
            return this.id == insuranceCarouselCardVI.id && Intrinsics.d(this.title, insuranceCarouselCardVI.title) && Intrinsics.d(this.subtitleText, insuranceCarouselCardVI.subtitleText) && Intrinsics.d(this.subtitlePrice, insuranceCarouselCardVI.subtitlePrice) && Intrinsics.d(this.benefits, insuranceCarouselCardVI.benefits) && Intrinsics.d(this.badge, insuranceCarouselCardVI.badge) && Intrinsics.d(this.button, insuranceCarouselCardVI.button) && Intrinsics.d(this.borderColor, insuranceCarouselCardVI.borderColor) && this.isSelected == insuranceCarouselCardVI.isSelected && Intrinsics.d(this.viewTracking, insuranceCarouselCardVI.viewTracking) && Intrinsics.d(this.testInfo, insuranceCarouselCardVI.testInfo) && Intrinsics.d(this.insuranceDetailsAction, insuranceCarouselCardVI.insuranceDetailsAction);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final List<CellDTO> getBenefits() {
            return this.benefits;
        }

        @NotNull
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final long getId() {
            return this.id;
        }

        public final AtomAction getInsuranceDetailsAction() {
            return this.insuranceDetailsAction;
        }

        public final PriceDTO getSubtitlePrice() {
            return this.subtitlePrice;
        }

        public final TextDTO getSubtitleText() {
            return this.subtitleText;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getViewTracking() {
            return this.viewTracking;
        }

        public int hashCode() {
            int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
            TextDTO textDTO = this.subtitleText;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            PriceDTO priceDTO = this.subtitlePrice;
            int b11 = g.b((hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31, 31, this.benefits);
            BadgeDTO badgeDTO = this.badge;
            int a12 = C3532b.a(g.a(C2859b.c(this.button, (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31), 31, this.borderColor), 31, this.isSelected);
            t tVar = this.viewTracking;
            int hashCode2 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            AtomAction atomAction = this.insuranceDetailsAction;
            return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitleText;
            PriceDTO priceDTO = this.subtitlePrice;
            List<CellDTO> list = this.benefits;
            BadgeDTO badgeDTO = this.badge;
            ButtonV3DTO buttonV3DTO = this.button;
            String str = this.borderColor;
            boolean z11 = this.isSelected;
            t tVar = this.viewTracking;
            TestInfo testInfo = this.testInfo;
            AtomAction atomAction = this.insuranceDetailsAction;
            StringBuilder b11 = a.b("InsuranceCarouselCardVI(id=", j11, ", title=", textDTO);
            b11.append(", subtitleText=");
            b11.append(textDTO2);
            b11.append(", subtitlePrice=");
            b11.append(priceDTO);
            b11.append(", benefits=");
            b11.append(list);
            b11.append(", badge=");
            b11.append(badgeDTO);
            b11.append(", button=");
            b11.append(buttonV3DTO);
            b11.append(", borderColor=");
            b11.append(str);
            C2971a.d(b11, ", isSelected=", z11, ", viewTracking=", tVar);
            b11.append(", testInfo=");
            b11.append(testInfo);
            b11.append(", insuranceDetailsAction=");
            b11.append(atomAction);
            b11.append(")");
            return b11.toString();
        }
    }

    public InsuranceCarouselVI(long j11, ImageDTO imageDTO, @NotNull TextDTO title, TextDTO textDTO, @NotNull List<InsuranceCarouselCardVI> insurances, TestInfo testInfo, t tVar, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insurances, "insurances");
        this.id = j11;
        this.logoImage = imageDTO;
        this.title = title;
        this.subtitle = textDTO;
        this.insurances = insurances;
        this.testInfo = testInfo;
        this.viewTracking = tVar;
        this.selectedCardIndex = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsuranceCarouselVI)) {
            return false;
        }
        InsuranceCarouselVI insuranceCarouselVI = (InsuranceCarouselVI) other;
        return this.id == insuranceCarouselVI.id && Intrinsics.d(this.logoImage, insuranceCarouselVI.logoImage) && Intrinsics.d(this.title, insuranceCarouselVI.title) && Intrinsics.d(this.subtitle, insuranceCarouselVI.subtitle) && Intrinsics.d(this.insurances, insuranceCarouselVI.insurances) && Intrinsics.d(this.testInfo, insuranceCarouselVI.testInfo) && Intrinsics.d(this.viewTracking, insuranceCarouselVI.viewTracking) && this.selectedCardIndex == insuranceCarouselVI.selectedCardIndex;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<InsuranceCarouselCardVI> getInsurances() {
        return this.insurances;
    }

    public final ImageDTO getLogoImage() {
        return this.logoImage;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedCardIndex() {
        return this.selectedCardIndex;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ImageDTO imageDTO = this.logoImage;
        int a11 = b.a(this.title, (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int b11 = g.b((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.insurances);
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (b11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        t tVar = this.viewTracking;
        return Integer.hashCode(this.selectedCardIndex) + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.logoImage;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<InsuranceCarouselCardVI> list = this.insurances;
        TestInfo testInfo = this.testInfo;
        t tVar = this.viewTracking;
        int i11 = this.selectedCardIndex;
        StringBuilder c11 = Nh.b.c("InsuranceCarouselVI(id=", j11, ", logoImage=", imageDTO);
        D3.g.i(", title=", ", subtitle=", c11, textDTO, textDTO2);
        c11.append(", insurances=");
        c11.append(list);
        c11.append(", testInfo=");
        c11.append(testInfo);
        c11.append(", viewTracking=");
        c11.append(tVar);
        c11.append(", selectedCardIndex=");
        c11.append(i11);
        c11.append(")");
        return c11.toString();
    }
}
