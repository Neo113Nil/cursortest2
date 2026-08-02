package ru.ozon.app.android.pdp.widgets.curtainPrice.presentation;

import De.C2859b;
import G.g;
import N3.C3660k;
import Ns.b;
import Pk0.h;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.app.android.pdp.widgets.curtainPrice.data.CurtainPriceDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001:\u0003/01BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$Island;", "island", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "regularPrice", "", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$AdditionalInfo;", "additionalInfo", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;", "settings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$Island;Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$Island;", "getIsland", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$Island;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "getRegularPrice", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "Ljava/util/List;", "getAdditionalInfo", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;", "getSettings", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Island", "AdditionalInfo", "BankLogo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurtainPriceVI implements c {
    private final List<AdditionalInfo> additionalInfo;
    private final long id;
    private final Island island;
    private final CurtainPriceDTO.PriceWrapperDTO regularPrice;

    @NotNull
    private final CurtainPriceDTO.SettingsDTO settings;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$AdditionalInfo;", "", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo {
        private final AtomAction action;
        private final CommonAtomIconDTO icon;

        @NotNull
        private final TextDTO text;
        private final t tokenizedEvent;

        public AdditionalInfo(CommonAtomIconDTO commonAtomIconDTO, @NotNull TextDTO text, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = commonAtomIconDTO;
            this.text = text;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalInfo)) {
                return false;
            }
            AdditionalInfo additionalInfo = (AdditionalInfo) other;
            return Intrinsics.d(this.icon, additionalInfo.icon) && Intrinsics.d(this.text, additionalInfo.text) && Intrinsics.d(this.action, additionalInfo.action) && Intrinsics.d(this.tokenizedEvent, additionalInfo.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            int a11 = b.a(this.text, (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode()) * 31, 31);
            AtomAction atomAction = this.action;
            int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            TextDTO textDTO = this.text;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("AdditionalInfo(icon=");
            sb2.append(commonAtomIconDTO);
            sb2.append(", text=");
            sb2.append(textDTO);
            sb2.append(", action=");
            return C2859b.e(tVar, ", tokenizedEvent=", ")", sb2, atomAction);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$BankLogo;", "", "", "image", "darkImage", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getDarkImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BankLogo {
        private final AtomAction action;
        private final String darkImage;

        @NotNull
        private final String image;
        private final TestInfo testInfo;
        private final t tokenizedEvent;

        public BankLogo(@NotNull String image, String str, AtomAction atomAction, t tVar, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.darkImage = str;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankLogo)) {
                return false;
            }
            BankLogo bankLogo = (BankLogo) other;
            return Intrinsics.d(this.image, bankLogo.image) && Intrinsics.d(this.darkImage, bankLogo.darkImage) && Intrinsics.d(this.action, bankLogo.action) && Intrinsics.d(this.tokenizedEvent, bankLogo.tokenizedEvent) && Intrinsics.d(this.testInfo, bankLogo.testInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getDarkImage() {
            return this.darkImage;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.darkImage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.darkImage;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("BankLogo(image=", str, ", darkImage=", str2, ", action=");
            d11.append(atomAction);
            d11.append(", tokenizedEvent=");
            d11.append(tVar);
            d11.append(", testInfo=");
            return h.c(d11, testInfo, ")");
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$Island;", "", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "price", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$BankLogo;", "defaultBankLogo", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "partnerBanks", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "priceDescription", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$BankLogo;Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "getPrice", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$BankLogo;", "getDefaultBankLogo", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$BankLogo;", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "getPartnerBanks", "()Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "Ljava/util/List;", "getPriceDescription", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Island {
        private final AtomAction action;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final CornerRadius cornerRadius;
        private final BankLogo defaultBankLogo;
        private final PartnerBanksVO partnerBanks;

        @NotNull
        private final CurtainPriceDTO.PriceWrapperDTO price;
        private final List<TextDTO> priceDescription;

        public Island(@NotNull CurtainPriceDTO.PriceWrapperDTO price, BankLogo bankLogo, PartnerBanksVO partnerBanksVO, List<TextDTO> list, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.price = price;
            this.defaultBankLogo = bankLogo;
            this.partnerBanks = partnerBanksVO;
            this.priceDescription = list;
            this.backgroundColor = backgroundColor;
            this.cornerRadius = cornerRadius;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Island)) {
                return false;
            }
            Island island = (Island) other;
            return Intrinsics.d(this.price, island.price) && Intrinsics.d(this.defaultBankLogo, island.defaultBankLogo) && Intrinsics.d(this.partnerBanks, island.partnerBanks) && Intrinsics.d(this.priceDescription, island.priceDescription) && Intrinsics.d(this.backgroundColor, island.backgroundColor) && this.cornerRadius == island.cornerRadius && Intrinsics.d(this.action, island.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final BankLogo getDefaultBankLogo() {
            return this.defaultBankLogo;
        }

        public final PartnerBanksVO getPartnerBanks() {
            return this.partnerBanks;
        }

        @NotNull
        public final CurtainPriceDTO.PriceWrapperDTO getPrice() {
            return this.price;
        }

        public final List<TextDTO> getPriceDescription() {
            return this.priceDescription;
        }

        public int hashCode() {
            int hashCode = this.price.hashCode() * 31;
            BankLogo bankLogo = this.defaultBankLogo;
            int hashCode2 = (hashCode + (bankLogo == null ? 0 : bankLogo.hashCode())) * 31;
            PartnerBanksVO partnerBanksVO = this.partnerBanks;
            int hashCode3 = (hashCode2 + (partnerBanksVO == null ? 0 : partnerBanksVO.hashCode())) * 31;
            List<TextDTO> list = this.priceDescription;
            int b11 = Tl.b.b(this.cornerRadius, g.a((hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.backgroundColor), 31);
            AtomAction atomAction = this.action;
            return b11 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CurtainPriceDTO.PriceWrapperDTO priceWrapperDTO = this.price;
            BankLogo bankLogo = this.defaultBankLogo;
            PartnerBanksVO partnerBanksVO = this.partnerBanks;
            List<TextDTO> list = this.priceDescription;
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("Island(price=");
            sb2.append(priceWrapperDTO);
            sb2.append(", defaultBankLogo=");
            sb2.append(bankLogo);
            sb2.append(", partnerBanks=");
            sb2.append(partnerBanksVO);
            sb2.append(", priceDescription=");
            sb2.append(list);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", cornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", action=");
            return B6.b.b(sb2, atomAction, ")");
        }
    }

    public CurtainPriceVI(long j11, Island island, CurtainPriceDTO.PriceWrapperDTO priceWrapperDTO, List<AdditionalInfo> list, @NotNull CurtainPriceDTO.SettingsDTO settings, t tVar) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.id = j11;
        this.island = island;
        this.regularPrice = priceWrapperDTO;
        this.additionalInfo = list;
        this.settings = settings;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainPriceVI)) {
            return false;
        }
        CurtainPriceVI curtainPriceVI = (CurtainPriceVI) other;
        return this.id == curtainPriceVI.id && Intrinsics.d(this.island, curtainPriceVI.island) && Intrinsics.d(this.regularPrice, curtainPriceVI.regularPrice) && Intrinsics.d(this.additionalInfo, curtainPriceVI.additionalInfo) && Intrinsics.d(this.settings, curtainPriceVI.settings) && Intrinsics.d(this.tokenizedEvent, curtainPriceVI.tokenizedEvent);
    }

    public final List<AdditionalInfo> getAdditionalInfo() {
        return this.additionalInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Island getIsland() {
        return this.island;
    }

    public final CurtainPriceDTO.PriceWrapperDTO getRegularPrice() {
        return this.regularPrice;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final CurtainPriceDTO.SettingsDTO getSettings() {
        return this.settings;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Island island = this.island;
        int hashCode2 = (hashCode + (island == null ? 0 : island.hashCode())) * 31;
        CurtainPriceDTO.PriceWrapperDTO priceWrapperDTO = this.regularPrice;
        int hashCode3 = (hashCode2 + (priceWrapperDTO == null ? 0 : priceWrapperDTO.hashCode())) * 31;
        List<AdditionalInfo> list = this.additionalInfo;
        int hashCode4 = (this.settings.hashCode() + ((hashCode3 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurtainPriceVI(id=" + this.id + ", island=" + this.island + ", regularPrice=" + this.regularPrice + ", additionalInfo=" + this.additionalInfo + ", settings=" + this.settings + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
