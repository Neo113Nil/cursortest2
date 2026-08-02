package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation;

import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import Lc.a;
import Tl.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000245BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J`\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "moreInfoButton", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$InsuranceVO;", "insurances", "", "selectedInsuranceInd", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "currentSelectButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "cancelButton", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Ljava/util/List;ILru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Ljava/util/List;ILru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getMoreInfoButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "Ljava/util/List;", "getInsurances", "()Ljava/util/List;", "I", "getSelectedInsuranceInd", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getCurrentSelectButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getCancelButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "InsuranceVO", "BenefitVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InsurancePanelVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton cancelButton;
    private final ButtonV3Atom.LargeButton currentSelectButton;
    private final long id;

    @NotNull
    private final List<InsuranceVO> insurances;
    private final LinkButtonVO moreInfoButton;
    private final int selectedInsuranceInd;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$BenefitVO;", "", "", "id", "Lru/ozon/uni/atoms/data/button/Icon;", "statusIcon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(JLru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/Icon;", "getStatusIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BenefitVO {
        public static final int $stable = TextAtom.$stable | Icon.$stable;
        private final long id;

        @NotNull
        private final Icon statusIcon;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public BenefitVO(long j11, @NotNull Icon statusIcon, @NotNull TextAtom title, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = j11;
            this.statusIcon = statusIcon;
            this.title = title;
            this.subtitle = textAtom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BenefitVO)) {
                return false;
            }
            BenefitVO benefitVO = (BenefitVO) other;
            return this.id == benefitVO.id && Intrinsics.d(this.statusIcon, benefitVO.statusIcon) && Intrinsics.d(this.title, benefitVO.title) && Intrinsics.d(this.subtitle, benefitVO.subtitle);
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final Icon getStatusIcon() {
            return this.statusIcon;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = C2619v.b(a.a(this.statusIcon, Long.hashCode(this.id) * 31, 31), 31, this.title);
            TextAtom textAtom = this.subtitle;
            return b11 + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            Icon icon = this.statusIcon;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            StringBuilder sb2 = new StringBuilder("BenefitVO(id=");
            sb2.append(j11);
            sb2.append(", statusIcon=");
            sb2.append(icon);
            C2639a.e(", title=", ", subtitle=", sb2, textAtom, textAtom2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ¤\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b\u0013\u0010<R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b\u0017\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$InsuranceVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/Price;", "price", "subtitle", "", "logoLink", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "selectButton", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$BenefitVO;", "benefits", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "", "isSelected", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "isSingleItem", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "detailedConditionsButton", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Lru/ozon/uni/atoms/data/badge/Badge;ZLjava/util/Map;ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Lru/ozon/uni/atoms/data/badge/Badge;ZLjava/util/Map;ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$InsuranceVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getSubtitle", "Ljava/lang/String;", "getLogoLink", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSelectButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/List;", "getBenefits", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Z", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDetailedConditionsButton", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InsuranceVO {
        private final Badge badge;

        @NotNull
        private final List<BenefitVO> benefits;
        private final BadgeDTO detailedConditionsButton;
        private final long id;
        private final boolean isSelected;
        private final boolean isSingleItem;
        private final String logoLink;

        @NotNull
        private final Price price;

        @NotNull
        private final ButtonV3Atom.LargeButton selectButton;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public InsuranceVO(long j11, @NotNull TextAtom title, @NotNull Price price, TextAtom textAtom, String str, @NotNull ButtonV3Atom.LargeButton selectButton, @NotNull List<BenefitVO> benefits, Badge badge, boolean z11, Map<String, TokenizedTrackingInfo> map, boolean z12, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(selectButton, "selectButton");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            this.id = j11;
            this.title = title;
            this.price = price;
            this.subtitle = textAtom;
            this.logoLink = str;
            this.selectButton = selectButton;
            this.benefits = benefits;
            this.badge = badge;
            this.isSelected = z11;
            this.trackingInfo = map;
            this.isSingleItem = z12;
            this.detailedConditionsButton = badgeDTO;
        }

        @NotNull
        public final InsuranceVO copy(long id2, @NotNull TextAtom title, @NotNull Price price, TextAtom subtitle, String logoLink, @NotNull ButtonV3Atom.LargeButton selectButton, @NotNull List<BenefitVO> benefits, Badge badge, boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo, boolean isSingleItem, BadgeDTO detailedConditionsButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(selectButton, "selectButton");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            return new InsuranceVO(id2, title, price, subtitle, logoLink, selectButton, benefits, badge, isSelected, trackingInfo, isSingleItem, detailedConditionsButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InsuranceVO)) {
                return false;
            }
            InsuranceVO insuranceVO = (InsuranceVO) other;
            return this.id == insuranceVO.id && Intrinsics.d(this.title, insuranceVO.title) && Intrinsics.d(this.price, insuranceVO.price) && Intrinsics.d(this.subtitle, insuranceVO.subtitle) && Intrinsics.d(this.logoLink, insuranceVO.logoLink) && Intrinsics.d(this.selectButton, insuranceVO.selectButton) && Intrinsics.d(this.benefits, insuranceVO.benefits) && Intrinsics.d(this.badge, insuranceVO.badge) && this.isSelected == insuranceVO.isSelected && Intrinsics.d(this.trackingInfo, insuranceVO.trackingInfo) && this.isSingleItem == insuranceVO.isSingleItem && Intrinsics.d(this.detailedConditionsButton, insuranceVO.detailedConditionsButton);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final List<BenefitVO> getBenefits() {
            return this.benefits;
        }

        public final BadgeDTO getDetailedConditionsButton() {
            return this.detailedConditionsButton;
        }

        public final long getId() {
            return this.id;
        }

        public final String getLogoLink() {
            return this.logoLink;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSelectButton() {
            return this.selectButton;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = C3051a.a(this.price, C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31);
            TextAtom textAtom = this.subtitle;
            int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            String str = this.logoLink;
            int b11 = g.b(b.a(this.selectButton, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.benefits);
            Badge badge = this.badge;
            int a12 = C3532b.a((b11 + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.isSelected);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int a13 = C3532b.a((a12 + (map == null ? 0 : map.hashCode())) * 31, 31, this.isSingleItem);
            BadgeDTO badgeDTO = this.detailedConditionsButton;
            return a13 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: isSingleItem, reason: from getter */
        public final boolean getIsSingleItem() {
            return this.isSingleItem;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.title;
            Price price = this.price;
            TextAtom textAtom2 = this.subtitle;
            String str = this.logoLink;
            ButtonV3Atom.LargeButton largeButton = this.selectButton;
            List<BenefitVO> list = this.benefits;
            Badge badge = this.badge;
            boolean z11 = this.isSelected;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            boolean z12 = this.isSingleItem;
            BadgeDTO badgeDTO = this.detailedConditionsButton;
            StringBuilder c11 = C2639a.c("InsuranceVO(id=", j11, ", title=", textAtom);
            c11.append(", price=");
            c11.append(price);
            c11.append(", subtitle=");
            c11.append(textAtom2);
            c11.append(", logoLink=");
            c11.append(str);
            c11.append(", selectButton=");
            c11.append(largeButton);
            c11.append(", benefits=");
            c11.append(list);
            c11.append(", badge=");
            c11.append(badge);
            c11.append(", isSelected=");
            c11.append(z11);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(", isSingleItem=");
            c11.append(z12);
            c11.append(", detailedConditionsButton=");
            c11.append(badgeDTO);
            c11.append(")");
            return c11.toString();
        }
    }

    public InsurancePanelVO(long j11, @NotNull TextAtom title, LinkButtonVO linkButtonVO, @NotNull List<InsuranceVO> insurances, int i11, ButtonV3Atom.LargeButton largeButton, @NotNull ButtonV3Atom.LargeBorderlessButton cancelButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insurances, "insurances");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        this.id = j11;
        this.title = title;
        this.moreInfoButton = linkButtonVO;
        this.insurances = insurances;
        this.selectedInsuranceInd = i11;
        this.currentSelectButton = largeButton;
        this.cancelButton = cancelButton;
    }

    public static /* synthetic */ InsurancePanelVO copy$default(InsurancePanelVO insurancePanelVO, long j11, TextAtom textAtom, LinkButtonVO linkButtonVO, List list, int i11, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = insurancePanelVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            textAtom = insurancePanelVO.title;
        }
        TextAtom textAtom2 = textAtom;
        if ((i12 & 4) != 0) {
            linkButtonVO = insurancePanelVO.moreInfoButton;
        }
        LinkButtonVO linkButtonVO2 = linkButtonVO;
        if ((i12 & 8) != 0) {
            list = insurancePanelVO.insurances;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            i11 = insurancePanelVO.selectedInsuranceInd;
        }
        return insurancePanelVO.copy(j12, textAtom2, linkButtonVO2, list2, i11, (i12 & 32) != 0 ? insurancePanelVO.currentSelectButton : largeButton, (i12 & 64) != 0 ? insurancePanelVO.cancelButton : largeBorderlessButton);
    }

    @NotNull
    public final InsurancePanelVO copy(long id2, @NotNull TextAtom title, LinkButtonVO moreInfoButton, @NotNull List<InsuranceVO> insurances, int selectedInsuranceInd, ButtonV3Atom.LargeButton currentSelectButton, @NotNull ButtonV3Atom.LargeBorderlessButton cancelButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insurances, "insurances");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        return new InsurancePanelVO(id2, title, moreInfoButton, insurances, selectedInsuranceInd, currentSelectButton, cancelButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsurancePanelVO)) {
            return false;
        }
        InsurancePanelVO insurancePanelVO = (InsurancePanelVO) other;
        return this.id == insurancePanelVO.id && Intrinsics.d(this.title, insurancePanelVO.title) && Intrinsics.d(this.moreInfoButton, insurancePanelVO.moreInfoButton) && Intrinsics.d(this.insurances, insurancePanelVO.insurances) && this.selectedInsuranceInd == insurancePanelVO.selectedInsuranceInd && Intrinsics.d(this.currentSelectButton, insurancePanelVO.currentSelectButton) && Intrinsics.d(this.cancelButton, insurancePanelVO.cancelButton);
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getCancelButton() {
        return this.cancelButton;
    }

    public final ButtonV3Atom.LargeButton getCurrentSelectButton() {
        return this.currentSelectButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<InsuranceVO> getInsurances() {
        return this.insurances;
    }

    public final LinkButtonVO getMoreInfoButton() {
        return this.moreInfoButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedInsuranceInd() {
        return this.selectedInsuranceInd;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.title);
        LinkButtonVO linkButtonVO = this.moreInfoButton;
        int a11 = C2454a.a(this.selectedInsuranceInd, g.b((b11 + (linkButtonVO == null ? 0 : linkButtonVO.hashCode())) * 31, 31, this.insurances), 31);
        ButtonV3Atom.LargeButton largeButton = this.currentSelectButton;
        return this.cancelButton.hashCode() + ((a11 + (largeButton != null ? largeButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        LinkButtonVO linkButtonVO = this.moreInfoButton;
        List<InsuranceVO> list = this.insurances;
        int i11 = this.selectedInsuranceInd;
        ButtonV3Atom.LargeButton largeButton = this.currentSelectButton;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.cancelButton;
        StringBuilder c11 = C2639a.c("InsurancePanelVO(id=", j11, ", title=", textAtom);
        c11.append(", moreInfoButton=");
        c11.append(linkButtonVO);
        c11.append(", insurances=");
        c11.append(list);
        c11.append(", selectedInsuranceInd=");
        c11.append(i11);
        c11.append(", currentSelectButton=");
        c11.append(largeButton);
        c11.append(", cancelButton=");
        c11.append(largeBorderlessButton);
        c11.append(")");
        return c11.toString();
    }
}
