package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation;

import Ak.C2436a;
import Cm.e;
import Co.a;
import D3.g;
import De.C2859b;
import GR.b;
import Kk.C3532b;
import Pk0.h;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO;", "Ll20/c;", "CommonVO", "Title", "SingleProduct", "CreditProductsList", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$Title;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface InstallmentPurchaseV5VO extends c {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommonVO {
        private final AtomAction action;
        private final TestInfo testInfo;
        private final t tokenizedEvent;

        public CommonVO(AtomAction atomAction, t tVar, TestInfo testInfo) {
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonVO)) {
                return false;
            }
            CommonVO commonVO = (CommonVO) other;
            return Intrinsics.d(this.action, commonVO.action) && Intrinsics.d(this.tokenizedEvent, commonVO.tokenizedEvent) && Intrinsics.d(this.testInfo, commonVO.testInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            AtomAction atomAction = this.action;
            int hashCode = (atomAction == null ? 0 : atomAction.hashCode()) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("CommonVO(action=");
            sb2.append(atomAction);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b$\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO;", "", "id", "", "background", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPaddings", "topPadding", "bottomPadding", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList$CreditProduct;", "creditProducts", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "common", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackground", "Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPaddings", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "getBottomPadding", "Ljava/util/List;", "getCreditProducts", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "getCommon", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "CreditProduct", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CreditProductsList implements InstallmentPurchaseV5VO {
        private final String background;

        @NotNull
        private final Paddings bottomPadding;
        private final CommonVO common;

        @NotNull
        private final List<CreditProduct> creditProducts;

        @NotNull
        private final Paddings horizontalPaddings;
        private final long id;

        @NotNull
        private final Paddings topPadding;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList$CreditProduct;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "", "background", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "common", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Ljava/lang/String;", "getBackground", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "getCommon", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CreditProduct {
            private final String background;

            @NotNull
            private final ButtonV3DTO button;
            private final CommonVO common;
            private final CommonAtomIconDTO icon;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            public CreditProduct(@NotNull TextDTO title, TextDTO textDTO, @NotNull ButtonV3DTO button, CommonAtomIconDTO commonAtomIconDTO, String str, CommonVO commonVO) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(button, "button");
                this.title = title;
                this.subtitle = textDTO;
                this.button = button;
                this.icon = commonAtomIconDTO;
                this.background = str;
                this.common = commonVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreditProduct)) {
                    return false;
                }
                CreditProduct creditProduct = (CreditProduct) other;
                return Intrinsics.d(this.title, creditProduct.title) && Intrinsics.d(this.subtitle, creditProduct.subtitle) && Intrinsics.d(this.button, creditProduct.button) && Intrinsics.d(this.icon, creditProduct.icon) && Intrinsics.d(this.background, creditProduct.background) && Intrinsics.d(this.common, creditProduct.common);
            }

            public final String getBackground() {
                return this.background;
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            public final CommonVO getCommon() {
                return this.common;
            }

            public final CommonAtomIconDTO getIcon() {
                return this.icon;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                TextDTO textDTO = this.subtitle;
                int c11 = C2859b.c(this.button, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                int hashCode2 = (c11 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
                String str = this.background;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                CommonVO commonVO = this.common;
                return hashCode3 + (commonVO != null ? commonVO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                ButtonV3DTO buttonV3DTO = this.button;
                CommonAtomIconDTO commonAtomIconDTO = this.icon;
                String str = this.background;
                CommonVO commonVO = this.common;
                StringBuilder g10 = g.g("CreditProduct(title=", textDTO, ", subtitle=", textDTO2, ", button=");
                g10.append(buttonV3DTO);
                g10.append(", icon=");
                g10.append(commonAtomIconDTO);
                g10.append(", background=");
                g10.append(str);
                g10.append(", common=");
                g10.append(commonVO);
                g10.append(")");
                return g10.toString();
            }
        }

        public CreditProductsList(long j11, String str, @NotNull Paddings horizontalPaddings, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull List<CreditProduct> creditProducts, CommonVO commonVO) {
            Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(creditProducts, "creditProducts");
            this.id = j11;
            this.background = str;
            this.horizontalPaddings = horizontalPaddings;
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.creditProducts = creditProducts;
            this.common = commonVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreditProductsList)) {
                return false;
            }
            CreditProductsList creditProductsList = (CreditProductsList) other;
            return this.id == creditProductsList.id && Intrinsics.d(this.background, creditProductsList.background) && this.horizontalPaddings == creditProductsList.horizontalPaddings && this.topPadding == creditProductsList.topPadding && this.bottomPadding == creditProductsList.bottomPadding && Intrinsics.d(this.creditProducts, creditProductsList.creditProducts) && Intrinsics.d(this.common, creditProductsList.common);
        }

        public final String getBackground() {
            return this.background;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final CommonVO getCommon() {
            return this.common;
        }

        @NotNull
        public final List<CreditProduct> getCreditProducts() {
            return this.creditProducts;
        }

        @NotNull
        public final Paddings getHorizontalPaddings() {
            return this.horizontalPaddings;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.background;
            int b11 = G.g.b(b.b(this.bottomPadding, b.b(this.topPadding, b.b(this.horizontalPaddings, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.creditProducts);
            CommonVO commonVO = this.common;
            return b11 + (commonVO != null ? commonVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.background;
            Paddings paddings = this.horizontalPaddings;
            Paddings paddings2 = this.topPadding;
            Paddings paddings3 = this.bottomPadding;
            List<CreditProduct> list = this.creditProducts;
            CommonVO commonVO = this.common;
            StringBuilder c11 = C2436a.c(j11, "CreditProductsList(id=", ", background=", str);
            c11.append(", horizontalPaddings=");
            c11.append(paddings);
            c11.append(", topPadding=");
            c11.append(paddings2);
            c11.append(", bottomPadding=");
            c11.append(paddings3);
            c11.append(", creditProducts=");
            c11.append(list);
            c11.append(", common=");
            c11.append(commonVO);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull InstallmentPurchaseV5VO installmentPurchaseV5VO) {
            return null;
        }

        public static int getViewItemKey(@NotNull InstallmentPurchaseV5VO installmentPurchaseV5VO) {
            return installmentPurchaseV5VO.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO;", "", "id", "", "background", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPaddings", "topPadding", "bottomPadding", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;", "content", "", "hasTitle", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "common", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;ZLru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackground", "Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPaddings", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "getBottomPadding", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;", "getContent", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;", "Z", "getHasTitle", "()Z", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "getCommon", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "SingleProductContent", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SingleProduct implements InstallmentPurchaseV5VO {
        private final String background;

        @NotNull
        private final Paddings bottomPadding;
        private final CommonVO common;

        @NotNull
        private final SingleProductContent content;
        private final boolean hasTitle;

        @NotNull
        private final Paddings horizontalPaddings;
        private final long id;

        @NotNull
        private final Paddings topPadding;

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u000267Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$LeftBlock;", "leftBlock", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "chevronIcon", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "background", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$BottomBlock;", "bottomBlock", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "shimmerAnimationTimer", "<init>", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$LeftBlock;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$BottomBlock;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$LeftBlock;", "getLeftBlock", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$LeftBlock;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getChevronIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Ljava/lang/String;", "getBackground", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$BottomBlock;", "getBottomBlock", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$BottomBlock;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Ljava/lang/Integer;", "getShimmerAnimationTimer", "()Ljava/lang/Integer;", "LeftBlock", "BottomBlock", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SingleProductContent {
            private final String background;
            private final List<BadgeDTO> badges;
            private final BottomBlock bottomBlock;
            private final CommonAtomIconDTO chevronIcon;

            @NotNull
            private final LeftBlock leftBlock;
            private final OnBoardingDTO onboarding;
            private final Integer shimmerAnimationTimer;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$BottomBlock;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "background", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackground", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class BottomBlock {
                private final String background;

                @NotNull
                private final TextDTO title;

                public BottomBlock(@NotNull TextDTO title, String str) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.title = title;
                    this.background = str;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BottomBlock)) {
                        return false;
                    }
                    BottomBlock bottomBlock = (BottomBlock) other;
                    return Intrinsics.d(this.title, bottomBlock.title) && Intrinsics.d(this.background, bottomBlock.background);
                }

                public final String getBackground() {
                    return this.background;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.background;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                @NotNull
                public String toString() {
                    return "BottomBlock(title=" + this.title + ", background=" + this.background + ")";
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$LeftBlock;", "", "", "background", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackground", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class LeftBlock {
                private final String background;
                private final CommonAtomIconDTO icon;

                @NotNull
                private final TextDTO title;

                public LeftBlock(String str, @NotNull TextDTO title, CommonAtomIconDTO commonAtomIconDTO) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.background = str;
                    this.title = title;
                    this.icon = commonAtomIconDTO;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LeftBlock)) {
                        return false;
                    }
                    LeftBlock leftBlock = (LeftBlock) other;
                    return Intrinsics.d(this.background, leftBlock.background) && Intrinsics.d(this.title, leftBlock.title) && Intrinsics.d(this.icon, leftBlock.icon);
                }

                public final String getBackground() {
                    return this.background;
                }

                public final CommonAtomIconDTO getIcon() {
                    return this.icon;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    String str = this.background;
                    int a11 = Ns.b.a(this.title, (str == null ? 0 : str.hashCode()) * 31, 31);
                    CommonAtomIconDTO commonAtomIconDTO = this.icon;
                    return a11 + (commonAtomIconDTO != null ? commonAtomIconDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.background;
                    TextDTO textDTO = this.title;
                    CommonAtomIconDTO commonAtomIconDTO = this.icon;
                    StringBuilder b11 = a.b("LeftBlock(background=", textDTO, str, ", title=", ", icon=");
                    b11.append(commonAtomIconDTO);
                    b11.append(")");
                    return b11.toString();
                }
            }

            public SingleProductContent(@NotNull LeftBlock leftBlock, @NotNull TextDTO title, TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, List<BadgeDTO> list, String str, BottomBlock bottomBlock, OnBoardingDTO onBoardingDTO, Integer num) {
                Intrinsics.checkNotNullParameter(leftBlock, "leftBlock");
                Intrinsics.checkNotNullParameter(title, "title");
                this.leftBlock = leftBlock;
                this.title = title;
                this.subtitle = textDTO;
                this.chevronIcon = commonAtomIconDTO;
                this.badges = list;
                this.background = str;
                this.bottomBlock = bottomBlock;
                this.onboarding = onBoardingDTO;
                this.shimmerAnimationTimer = num;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SingleProductContent)) {
                    return false;
                }
                SingleProductContent singleProductContent = (SingleProductContent) other;
                return Intrinsics.d(this.leftBlock, singleProductContent.leftBlock) && Intrinsics.d(this.title, singleProductContent.title) && Intrinsics.d(this.subtitle, singleProductContent.subtitle) && Intrinsics.d(this.chevronIcon, singleProductContent.chevronIcon) && Intrinsics.d(this.badges, singleProductContent.badges) && Intrinsics.d(this.background, singleProductContent.background) && Intrinsics.d(this.bottomBlock, singleProductContent.bottomBlock) && Intrinsics.d(this.onboarding, singleProductContent.onboarding) && Intrinsics.d(this.shimmerAnimationTimer, singleProductContent.shimmerAnimationTimer);
            }

            public final String getBackground() {
                return this.background;
            }

            public final List<BadgeDTO> getBadges() {
                return this.badges;
            }

            public final BottomBlock getBottomBlock() {
                return this.bottomBlock;
            }

            public final CommonAtomIconDTO getChevronIcon() {
                return this.chevronIcon;
            }

            @NotNull
            public final LeftBlock getLeftBlock() {
                return this.leftBlock;
            }

            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            public final Integer getShimmerAnimationTimer() {
                return this.shimmerAnimationTimer;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = Ns.b.a(this.title, this.leftBlock.hashCode() * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                CommonAtomIconDTO commonAtomIconDTO = this.chevronIcon;
                int hashCode2 = (hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
                List<BadgeDTO> list = this.badges;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                String str = this.background;
                int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                BottomBlock bottomBlock = this.bottomBlock;
                int hashCode5 = (hashCode4 + (bottomBlock == null ? 0 : bottomBlock.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                int hashCode6 = (hashCode5 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
                Integer num = this.shimmerAnimationTimer;
                return hashCode6 + (num != null ? num.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                LeftBlock leftBlock = this.leftBlock;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                CommonAtomIconDTO commonAtomIconDTO = this.chevronIcon;
                List<BadgeDTO> list = this.badges;
                String str = this.background;
                BottomBlock bottomBlock = this.bottomBlock;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                Integer num = this.shimmerAnimationTimer;
                StringBuilder sb2 = new StringBuilder("SingleProductContent(leftBlock=");
                sb2.append(leftBlock);
                sb2.append(", title=");
                sb2.append(textDTO);
                sb2.append(", subtitle=");
                sb2.append(textDTO2);
                sb2.append(", chevronIcon=");
                sb2.append(commonAtomIconDTO);
                sb2.append(", badges=");
                e.i(", background=", str, ", bottomBlock=", sb2, list);
                sb2.append(bottomBlock);
                sb2.append(", onboarding=");
                sb2.append(onBoardingDTO);
                sb2.append(", shimmerAnimationTimer=");
                return Ep.a.c(sb2, num, ")");
            }
        }

        public SingleProduct(long j11, String str, @NotNull Paddings horizontalPaddings, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull SingleProductContent content, boolean z11, CommonVO commonVO) {
            Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = j11;
            this.background = str;
            this.horizontalPaddings = horizontalPaddings;
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.content = content;
            this.hasTitle = z11;
            this.common = commonVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleProduct)) {
                return false;
            }
            SingleProduct singleProduct = (SingleProduct) other;
            return this.id == singleProduct.id && Intrinsics.d(this.background, singleProduct.background) && this.horizontalPaddings == singleProduct.horizontalPaddings && this.topPadding == singleProduct.topPadding && this.bottomPadding == singleProduct.bottomPadding && Intrinsics.d(this.content, singleProduct.content) && this.hasTitle == singleProduct.hasTitle && Intrinsics.d(this.common, singleProduct.common);
        }

        public final String getBackground() {
            return this.background;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final CommonVO getCommon() {
            return this.common;
        }

        @NotNull
        public final SingleProductContent getContent() {
            return this.content;
        }

        public final boolean getHasTitle() {
            return this.hasTitle;
        }

        @NotNull
        public final Paddings getHorizontalPaddings() {
            return this.horizontalPaddings;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.background;
            int a11 = C3532b.a((this.content.hashCode() + b.b(this.bottomPadding, b.b(this.topPadding, b.b(this.horizontalPaddings, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31)) * 31, 31, this.hasTitle);
            CommonVO commonVO = this.common;
            return a11 + (commonVO != null ? commonVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.background;
            Paddings paddings = this.horizontalPaddings;
            Paddings paddings2 = this.topPadding;
            Paddings paddings3 = this.bottomPadding;
            SingleProductContent singleProductContent = this.content;
            boolean z11 = this.hasTitle;
            CommonVO commonVO = this.common;
            StringBuilder c11 = C2436a.c(j11, "SingleProduct(id=", ", background=", str);
            c11.append(", horizontalPaddings=");
            c11.append(paddings);
            c11.append(", topPadding=");
            c11.append(paddings2);
            c11.append(", bottomPadding=");
            c11.append(paddings3);
            c11.append(", content=");
            c11.append(singleProductContent);
            c11.append(", hasTitle=");
            c11.append(z11);
            c11.append(", common=");
            c11.append(commonVO);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$Title;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "", "background", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "common", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "Ljava/lang/String;", "getBackground", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "getCommon", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CommonVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Title implements InstallmentPurchaseV5VO {
        private final String background;
        private final BadgeDTO badge;
        private final CommonVO common;
        private final long id;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final Paddings topPadding;

        public Title(long j11, @NotNull TextDTO title, BadgeDTO badgeDTO, @NotNull Paddings topPadding, String str, CommonVO commonVO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            this.id = j11;
            this.title = title;
            this.badge = badgeDTO;
            this.topPadding = topPadding;
            this.background = str;
            this.common = commonVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Title)) {
                return false;
            }
            Title title = (Title) other;
            return this.id == title.id && Intrinsics.d(this.title, title.title) && Intrinsics.d(this.badge, title.badge) && this.topPadding == title.topPadding && Intrinsics.d(this.background, title.background) && Intrinsics.d(this.common, title.common);
        }

        public final String getBackground() {
            return this.background;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final CommonVO getCommon() {
            return this.common;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31);
            BadgeDTO badgeDTO = this.badge;
            int b11 = b.b(this.topPadding, (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
            String str = this.background;
            int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
            CommonVO commonVO = this.common;
            return hashCode + (commonVO != null ? commonVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.title;
            BadgeDTO badgeDTO = this.badge;
            Paddings paddings = this.topPadding;
            String str = this.background;
            CommonVO commonVO = this.common;
            StringBuilder b11 = TY.a.b("Title(id=", j11, ", title=", textDTO);
            b11.append(", badge=");
            b11.append(badgeDTO);
            b11.append(", topPadding=");
            b11.append(paddings);
            b11.append(", background=");
            b11.append(str);
            b11.append(", common=");
            b11.append(commonVO);
            b11.append(")");
            return b11.toString();
        }
    }
}
