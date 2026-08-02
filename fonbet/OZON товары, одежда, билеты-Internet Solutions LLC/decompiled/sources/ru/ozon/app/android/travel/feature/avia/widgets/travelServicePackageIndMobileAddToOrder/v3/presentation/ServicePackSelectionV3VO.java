package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation;

import B90.C2619v;
import Bl.C2639a;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import Pk0.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.data.ServicePackSelectionV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003'()B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "priceDescription", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageOptionVO;", "options", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "declineButton", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPriceDescription", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getDeclineButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "PackageOptionVO", "PackageTabVO", "PushSMSVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ServicePackSelectionV3VO implements c {
    private final ButtonV3Atom.LargeBorderlessButton declineButton;
    private final long id;

    @NotNull
    private final List<PackageOptionVO> options;

    @NotNull
    private final TextAtom priceDescription;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageOptionVO;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageTabVO;", "packageTab", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$Benefit;", "benefits", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PushSMSVO;", "smsBlock", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "selectButtonDefault", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageTabVO;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PushSMSVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageTabVO;", "getPackageTab", "()Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageTabVO;", "Ljava/util/List;", "getBenefits", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PushSMSVO;", "getSmsBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PushSMSVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSelectButtonDefault", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PackageOptionVO {

        @NotNull
        private final List<ServicePackSelectionV3DTO.Benefit> benefits;

        @NotNull
        private final PackageTabVO packageTab;

        @NotNull
        private final ButtonV3Atom.LargeButton selectButtonDefault;
        private final PushSMSVO smsBlock;
        private final t trackingInfo;

        public PackageOptionVO(@NotNull PackageTabVO packageTab, @NotNull List<ServicePackSelectionV3DTO.Benefit> benefits, PushSMSVO pushSMSVO, @NotNull ButtonV3Atom.LargeButton selectButtonDefault, t tVar) {
            Intrinsics.checkNotNullParameter(packageTab, "packageTab");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(selectButtonDefault, "selectButtonDefault");
            this.packageTab = packageTab;
            this.benefits = benefits;
            this.smsBlock = pushSMSVO;
            this.selectButtonDefault = selectButtonDefault;
            this.trackingInfo = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageOptionVO)) {
                return false;
            }
            PackageOptionVO packageOptionVO = (PackageOptionVO) other;
            return Intrinsics.d(this.packageTab, packageOptionVO.packageTab) && Intrinsics.d(this.benefits, packageOptionVO.benefits) && Intrinsics.d(this.smsBlock, packageOptionVO.smsBlock) && Intrinsics.d(this.selectButtonDefault, packageOptionVO.selectButtonDefault) && Intrinsics.d(this.trackingInfo, packageOptionVO.trackingInfo);
        }

        @NotNull
        public final List<ServicePackSelectionV3DTO.Benefit> getBenefits() {
            return this.benefits;
        }

        @NotNull
        public final PackageTabVO getPackageTab() {
            return this.packageTab;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSelectButtonDefault() {
            return this.selectButtonDefault;
        }

        public final PushSMSVO getSmsBlock() {
            return this.smsBlock;
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = g.b(this.packageTab.hashCode() * 31, 31, this.benefits);
            PushSMSVO pushSMSVO = this.smsBlock;
            int a11 = b.a(this.selectButtonDefault, (b11 + (pushSMSVO == null ? 0 : pushSMSVO.hashCode())) * 31, 31);
            t tVar = this.trackingInfo;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            PackageTabVO packageTabVO = this.packageTab;
            List<ServicePackSelectionV3DTO.Benefit> list = this.benefits;
            PushSMSVO pushSMSVO = this.smsBlock;
            ButtonV3Atom.LargeButton largeButton = this.selectButtonDefault;
            t tVar = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("PackageOptionVO(packageTab=");
            sb2.append(packageTabVO);
            sb2.append(", benefits=");
            sb2.append(list);
            sb2.append(", smsBlock=");
            sb2.append(pushSMSVO);
            sb2.append(", selectButtonDefault=");
            sb2.append(largeButton);
            sb2.append(", trackingInfo=");
            return b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0007\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\n\u0010\u001d¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageTabVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/Price;", "price", "", "isSelected", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "isPremium", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;ZLru/ozon/uni/atoms/data/badge/Badge;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Z", "()Z", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PackageTabVO {
        public static final int $stable = (Badge.$stable | Price.$stable) | TextAtom.$stable;
        private final Badge badge;
        private final boolean isPremium;
        private final boolean isSelected;
        private final Price price;

        @NotNull
        private final TextAtom title;

        public PackageTabVO(@NotNull TextAtom title, Price price, boolean z11, Badge badge, boolean z12) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.price = price;
            this.isSelected = z11;
            this.badge = badge;
            this.isPremium = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageTabVO)) {
                return false;
            }
            PackageTabVO packageTabVO = (PackageTabVO) other;
            return Intrinsics.d(this.title, packageTabVO.title) && Intrinsics.d(this.price, packageTabVO.price) && this.isSelected == packageTabVO.isSelected && Intrinsics.d(this.badge, packageTabVO.badge) && this.isPremium == packageTabVO.isPremium;
        }

        public final Badge getBadge() {
            return this.badge;
        }

        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Price price = this.price;
            int a11 = C3532b.a((hashCode + (price == null ? 0 : price.hashCode())) * 31, 31, this.isSelected);
            Badge badge = this.badge;
            return Boolean.hashCode(this.isPremium) + ((a11 + (badge != null ? badge.hashCode() : 0)) * 31);
        }

        /* renamed from: isPremium, reason: from getter */
        public final boolean getIsPremium() {
            return this.isPremium;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            Price price = this.price;
            boolean z11 = this.isSelected;
            Badge badge = this.badge;
            boolean z12 = this.isPremium;
            StringBuilder sb2 = new StringBuilder("PackageTabVO(title=");
            sb2.append(textAtom);
            sb2.append(", price=");
            sb2.append(price);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", badge=");
            sb2.append(badge);
            sb2.append(", isPremium=");
            return a.a(")", sb2, z12);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b\f\u0010+R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b/\u0010.R\u001f\u0010\u0011\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b0\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PushSMSVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/badge/Badge;", "discountBadge", "Lru/ozon/uni/atoms/data/price/Price;", "price", "description", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "selectButtonSMS", "", "isSMSSelected", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTrackingInfo", "setTrackingInfo", "unsetTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;ZLWZ/t;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getDiscountBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSelectButtonSMS", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Z", "()Z", "LWZ/t;", "getViewTrackingInfo", "()LWZ/t;", "getSetTrackingInfo", "getUnsetTrackingInfo", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PushSMSVO {

        @NotNull
        private final TextAtom description;
        private final Badge discountBadge;
        private final boolean isSMSSelected;

        @NotNull
        private final Price price;

        @NotNull
        private final ButtonV3Atom.LargeButton selectButtonSMS;
        private final t setTrackingInfo;

        @NotNull
        private final TextAtom title;
        private final t unsetTrackingInfo;
        private final t viewTrackingInfo;

        public PushSMSVO(@NotNull TextAtom title, Badge badge, @NotNull Price price, @NotNull TextAtom description, @NotNull ButtonV3Atom.LargeButton selectButtonSMS, boolean z11, t tVar, t tVar2, t tVar3) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(selectButtonSMS, "selectButtonSMS");
            this.title = title;
            this.discountBadge = badge;
            this.price = price;
            this.description = description;
            this.selectButtonSMS = selectButtonSMS;
            this.isSMSSelected = z11;
            this.viewTrackingInfo = tVar;
            this.setTrackingInfo = tVar2;
            this.unsetTrackingInfo = tVar3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushSMSVO)) {
                return false;
            }
            PushSMSVO pushSMSVO = (PushSMSVO) other;
            return Intrinsics.d(this.title, pushSMSVO.title) && Intrinsics.d(this.discountBadge, pushSMSVO.discountBadge) && Intrinsics.d(this.price, pushSMSVO.price) && Intrinsics.d(this.description, pushSMSVO.description) && Intrinsics.d(this.selectButtonSMS, pushSMSVO.selectButtonSMS) && this.isSMSSelected == pushSMSVO.isSMSSelected && Intrinsics.d(this.viewTrackingInfo, pushSMSVO.viewTrackingInfo) && Intrinsics.d(this.setTrackingInfo, pushSMSVO.setTrackingInfo) && Intrinsics.d(this.unsetTrackingInfo, pushSMSVO.unsetTrackingInfo);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        public final Badge getDiscountBadge() {
            return this.discountBadge;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSelectButtonSMS() {
            return this.selectButtonSMS;
        }

        public final t getSetTrackingInfo() {
            return this.setTrackingInfo;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final t getUnsetTrackingInfo() {
            return this.unsetTrackingInfo;
        }

        public final t getViewTrackingInfo() {
            return this.viewTrackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Badge badge = this.discountBadge;
            int a11 = C3532b.a(b.a(this.selectButtonSMS, C2619v.b(C3051a.a(this.price, (hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31), 31, this.description), 31), 31, this.isSMSSelected);
            t tVar = this.viewTrackingInfo;
            int hashCode2 = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.setTrackingInfo;
            int hashCode3 = (hashCode2 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            t tVar3 = this.unsetTrackingInfo;
            return hashCode3 + (tVar3 != null ? tVar3.hashCode() : 0);
        }

        /* renamed from: isSMSSelected, reason: from getter */
        public final boolean getIsSMSSelected() {
            return this.isSMSSelected;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            Badge badge = this.discountBadge;
            Price price = this.price;
            TextAtom textAtom2 = this.description;
            ButtonV3Atom.LargeButton largeButton = this.selectButtonSMS;
            boolean z11 = this.isSMSSelected;
            t tVar = this.viewTrackingInfo;
            t tVar2 = this.setTrackingInfo;
            t tVar3 = this.unsetTrackingInfo;
            StringBuilder sb2 = new StringBuilder("PushSMSVO(title=");
            sb2.append(textAtom);
            sb2.append(", discountBadge=");
            sb2.append(badge);
            sb2.append(", price=");
            sb2.append(price);
            sb2.append(", description=");
            sb2.append(textAtom2);
            sb2.append(", selectButtonSMS=");
            sb2.append(largeButton);
            sb2.append(", isSMSSelected=");
            sb2.append(z11);
            sb2.append(", viewTrackingInfo=");
            sb2.append(tVar);
            sb2.append(", setTrackingInfo=");
            sb2.append(tVar2);
            sb2.append(", unsetTrackingInfo=");
            return b.d(sb2, tVar3, ")");
        }
    }

    public ServicePackSelectionV3VO(long j11, @NotNull TextAtom title, @NotNull TextAtom priceDescription, @NotNull List<PackageOptionVO> options, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        Intrinsics.checkNotNullParameter(options, "options");
        this.id = j11;
        this.title = title;
        this.priceDescription = priceDescription;
        this.options = options;
        this.declineButton = largeBorderlessButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePackSelectionV3VO)) {
            return false;
        }
        ServicePackSelectionV3VO servicePackSelectionV3VO = (ServicePackSelectionV3VO) other;
        return this.id == servicePackSelectionV3VO.id && Intrinsics.d(this.title, servicePackSelectionV3VO.title) && Intrinsics.d(this.priceDescription, servicePackSelectionV3VO.priceDescription) && Intrinsics.d(this.options, servicePackSelectionV3VO.options) && Intrinsics.d(this.declineButton, servicePackSelectionV3VO.declineButton);
    }

    public final ButtonV3Atom.LargeBorderlessButton getDeclineButton() {
        return this.declineButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PackageOptionVO> getOptions() {
        return this.options;
    }

    @NotNull
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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
        int b11 = g.b(C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.priceDescription), 31, this.options);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.declineButton;
        return b11 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.priceDescription;
        List<PackageOptionVO> list = this.options;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.declineButton;
        StringBuilder c11 = C2639a.c("ServicePackSelectionV3VO(id=", j11, ", title=", textAtom);
        c11.append(", priceDescription=");
        c11.append(textAtom2);
        c11.append(", options=");
        c11.append(list);
        c11.append(", declineButton=");
        c11.append(largeBorderlessButton);
        c11.append(")");
        return c11.toString();
    }
}
