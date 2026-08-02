package ru.ozon.app.android.pdp.widgets.curtainPrice.data;

import Cm.e;
import D40.a;
import G.g;
import N3.C3660k;
import Ns.b;
import Pk0.h;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0005'()*+BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;", "", "island", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$Island;", "regularPrice", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "additionalInfo", "", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$AdditionalInfoDTO;", "settings", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$Island;Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;Ljava/util/Map;)V", "getIsland", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$Island;", "getRegularPrice", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "getAdditionalInfo", "()Ljava/util/List;", "getSettings", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Island", "PriceWrapperDTO", "PriceDescription", "AdditionalInfoDTO", "SettingsDTO", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurtainPriceDTO {
    public static final int $stable = 8;
    private final List<AdditionalInfoDTO> additionalInfo;
    private final Island island;
    private final PriceWrapperDTO regularPrice;

    @NotNull
    private final SettingsDTO settings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$AdditionalInfoDTO;", "", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfoDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final CommonAtomIconDTO icon;

        @NotNull
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public AdditionalInfoDTO(CommonAtomIconDTO commonAtomIconDTO, @NotNull TextDTO text, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = commonAtomIconDTO;
            this.text = text;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AdditionalInfoDTO copy$default(AdditionalInfoDTO additionalInfoDTO, CommonAtomIconDTO commonAtomIconDTO, TextDTO textDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonAtomIconDTO = additionalInfoDTO.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = additionalInfoDTO.text;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = additionalInfoDTO.action;
            }
            if ((i11 & 8) != 0) {
                map = additionalInfoDTO.trackingInfo;
            }
            return additionalInfoDTO.copy(commonAtomIconDTO, textDTO, atomActionDTO, map);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final AdditionalInfoDTO copy(CommonAtomIconDTO icon, @NotNull TextDTO text, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new AdditionalInfoDTO(icon, text, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalInfoDTO)) {
                return false;
            }
            AdditionalInfoDTO additionalInfoDTO = (AdditionalInfoDTO) other;
            return Intrinsics.d(this.icon, additionalInfoDTO.icon) && Intrinsics.d(this.text, additionalInfoDTO.text) && Intrinsics.d(this.action, additionalInfoDTO.action) && Intrinsics.d(this.trackingInfo, additionalInfoDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            int a11 = b.a(this.text, (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode()) * 31, 31);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            TextDTO textDTO = this.text;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("AdditionalInfoDTO(icon=");
            sb2.append(commonAtomIconDTO);
            sb2.append(", text=");
            sb2.append(textDTO);
            sb2.append(", action=");
            return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceDescription;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceDescription {
        public static final int $stable = CommonAtomIconDTO.$stable;
        private final CommonAtomIconDTO icon;

        @NotNull
        private final TextDTO text;

        public PriceDescription(@NotNull TextDTO text, CommonAtomIconDTO commonAtomIconDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = commonAtomIconDTO;
        }

        public static /* synthetic */ PriceDescription copy$default(PriceDescription priceDescription, TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = priceDescription.text;
            }
            if ((i11 & 2) != 0) {
                commonAtomIconDTO = priceDescription.icon;
            }
            return priceDescription.copy(textDTO, commonAtomIconDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final PriceDescription copy(@NotNull TextDTO text, CommonAtomIconDTO icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new PriceDescription(text, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDescription)) {
                return false;
            }
            PriceDescription priceDescription = (PriceDescription) other;
            return Intrinsics.d(this.text, priceDescription.text) && Intrinsics.d(this.icon, priceDescription.icon);
        }

        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            return hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "PriceDescription(text=" + this.text + ", icon=" + this.icon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "description", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceDescription;", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceDescription;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getDescription", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceDescription;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceWrapperDTO {
        public static final int $stable = CommonAtomIconDTO.$stable | PriceDTO.$stable;
        private final PriceDescription description;

        @NotNull
        private final PriceDTO price;

        public PriceWrapperDTO(@NotNull PriceDTO price, PriceDescription priceDescription) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.description = priceDescription;
        }

        public static /* synthetic */ PriceWrapperDTO copy$default(PriceWrapperDTO priceWrapperDTO, PriceDTO priceDTO, PriceDescription priceDescription, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceDTO = priceWrapperDTO.price;
            }
            if ((i11 & 2) != 0) {
                priceDescription = priceWrapperDTO.description;
            }
            return priceWrapperDTO.copy(priceDTO, priceDescription);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceDescription getDescription() {
            return this.description;
        }

        @NotNull
        public final PriceWrapperDTO copy(@NotNull PriceDTO price, PriceDescription description) {
            Intrinsics.checkNotNullParameter(price, "price");
            return new PriceWrapperDTO(price, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceWrapperDTO)) {
                return false;
            }
            PriceWrapperDTO priceWrapperDTO = (PriceWrapperDTO) other;
            return Intrinsics.d(this.price, priceWrapperDTO.price) && Intrinsics.d(this.description, priceWrapperDTO.description);
        }

        public final PriceDescription getDescription() {
            return this.description;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public int hashCode() {
            int hashCode = this.price.hashCode() * 31;
            PriceDescription priceDescription = this.description;
            return hashCode + (priceDescription == null ? 0 : priceDescription.hashCode());
        }

        @NotNull
        public String toString() {
            return "PriceWrapperDTO(price=" + this.price + ", description=" + this.description + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;", "", "innerBackgroundColor", "", "outerBackgroundColor", "horizontalMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getInnerBackgroundColor", "()Ljava/lang/String;", "getOuterBackgroundColor", "getHorizontalMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsDTO {
        public static final int $stable = 0;

        @NotNull
        private final CornerRadius cornerRadius;

        @NotNull
        private final Paddings horizontalMargin;

        @NotNull
        private final String innerBackgroundColor;

        @NotNull
        private final String outerBackgroundColor;

        public SettingsDTO() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ SettingsDTO copy$default(SettingsDTO settingsDTO, String str, String str2, Paddings paddings, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = settingsDTO.innerBackgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = settingsDTO.outerBackgroundColor;
            }
            if ((i11 & 4) != 0) {
                paddings = settingsDTO.horizontalMargin;
            }
            if ((i11 & 8) != 0) {
                cornerRadius = settingsDTO.cornerRadius;
            }
            return settingsDTO.copy(str, str2, paddings, cornerRadius);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getInnerBackgroundColor() {
            return this.innerBackgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getOuterBackgroundColor() {
            return this.outerBackgroundColor;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getHorizontalMargin() {
            return this.horizontalMargin;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final SettingsDTO copy(@NotNull String innerBackgroundColor, @NotNull String outerBackgroundColor, @NotNull Paddings horizontalMargin, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(innerBackgroundColor, "innerBackgroundColor");
            Intrinsics.checkNotNullParameter(outerBackgroundColor, "outerBackgroundColor");
            Intrinsics.checkNotNullParameter(horizontalMargin, "horizontalMargin");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new SettingsDTO(innerBackgroundColor, outerBackgroundColor, horizontalMargin, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsDTO)) {
                return false;
            }
            SettingsDTO settingsDTO = (SettingsDTO) other;
            return Intrinsics.d(this.innerBackgroundColor, settingsDTO.innerBackgroundColor) && Intrinsics.d(this.outerBackgroundColor, settingsDTO.outerBackgroundColor) && this.horizontalMargin == settingsDTO.horizontalMargin && this.cornerRadius == settingsDTO.cornerRadius;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final Paddings getHorizontalMargin() {
            return this.horizontalMargin;
        }

        @NotNull
        public final String getInnerBackgroundColor() {
            return this.innerBackgroundColor;
        }

        @NotNull
        public final String getOuterBackgroundColor() {
            return this.outerBackgroundColor;
        }

        public int hashCode() {
            return this.cornerRadius.hashCode() + GR.b.b(this.horizontalMargin, g.a(this.innerBackgroundColor.hashCode() * 31, 31, this.outerBackgroundColor), 31);
        }

        @NotNull
        public String toString() {
            String str = this.innerBackgroundColor;
            String str2 = this.outerBackgroundColor;
            Paddings paddings = this.horizontalMargin;
            CornerRadius cornerRadius = this.cornerRadius;
            StringBuilder d11 = C3660k.d("SettingsDTO(innerBackgroundColor=", str, ", outerBackgroundColor=", str2, ", horizontalMargin=");
            d11.append(paddings);
            d11.append(", cornerRadius=");
            d11.append(cornerRadius);
            d11.append(")");
            return d11.toString();
        }

        public SettingsDTO(@NotNull String innerBackgroundColor, @NotNull String outerBackgroundColor, @NotNull Paddings horizontalMargin, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(innerBackgroundColor, "innerBackgroundColor");
            Intrinsics.checkNotNullParameter(outerBackgroundColor, "outerBackgroundColor");
            Intrinsics.checkNotNullParameter(horizontalMargin, "horizontalMargin");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.innerBackgroundColor = innerBackgroundColor;
            this.outerBackgroundColor = outerBackgroundColor;
            this.horizontalMargin = horizontalMargin;
            this.cornerRadius = cornerRadius;
        }

        public /* synthetic */ SettingsDTO(String str, String str2, Paddings paddings, CornerRadius cornerRadius, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UniColors.BG_PRIMARY.getToken() : str, (i11 & 2) != 0 ? UniColors.LAYER_FLOOR_1.getToken() : str2, (i11 & 4) != 0 ? Paddings.PADDING_550 : paddings, (i11 & 8) != 0 ? CornerRadius.RADIUS_500 : cornerRadius);
        }
    }

    public CurtainPriceDTO(Island island, PriceWrapperDTO priceWrapperDTO, List<AdditionalInfoDTO> list, @NotNull SettingsDTO settings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.island = island;
        this.regularPrice = priceWrapperDTO;
        this.additionalInfo = list;
        this.settings = settings;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CurtainPriceDTO copy$default(CurtainPriceDTO curtainPriceDTO, Island island, PriceWrapperDTO priceWrapperDTO, List list, SettingsDTO settingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            island = curtainPriceDTO.island;
        }
        if ((i11 & 2) != 0) {
            priceWrapperDTO = curtainPriceDTO.regularPrice;
        }
        if ((i11 & 4) != 0) {
            list = curtainPriceDTO.additionalInfo;
        }
        if ((i11 & 8) != 0) {
            settingsDTO = curtainPriceDTO.settings;
        }
        if ((i11 & 16) != 0) {
            map = curtainPriceDTO.trackingInfo;
        }
        Map map2 = map;
        List list2 = list;
        return curtainPriceDTO.copy(island, priceWrapperDTO, list2, settingsDTO, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final Island getIsland() {
        return this.island;
    }

    /* renamed from: component2, reason: from getter */
    public final PriceWrapperDTO getRegularPrice() {
        return this.regularPrice;
    }

    public final List<AdditionalInfoDTO> component3() {
        return this.additionalInfo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SettingsDTO getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final CurtainPriceDTO copy(Island island, PriceWrapperDTO regularPrice, List<AdditionalInfoDTO> additionalInfo, @NotNull SettingsDTO settings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new CurtainPriceDTO(island, regularPrice, additionalInfo, settings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainPriceDTO)) {
            return false;
        }
        CurtainPriceDTO curtainPriceDTO = (CurtainPriceDTO) other;
        return Intrinsics.d(this.island, curtainPriceDTO.island) && Intrinsics.d(this.regularPrice, curtainPriceDTO.regularPrice) && Intrinsics.d(this.additionalInfo, curtainPriceDTO.additionalInfo) && Intrinsics.d(this.settings, curtainPriceDTO.settings) && Intrinsics.d(this.trackingInfo, curtainPriceDTO.trackingInfo);
    }

    public final List<AdditionalInfoDTO> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final Island getIsland() {
        return this.island;
    }

    public final PriceWrapperDTO getRegularPrice() {
        return this.regularPrice;
    }

    @NotNull
    public final SettingsDTO getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Island island = this.island;
        int hashCode = (island == null ? 0 : island.hashCode()) * 31;
        PriceWrapperDTO priceWrapperDTO = this.regularPrice;
        int hashCode2 = (hashCode + (priceWrapperDTO == null ? 0 : priceWrapperDTO.hashCode())) * 31;
        List<AdditionalInfoDTO> list = this.additionalInfo;
        int hashCode3 = (this.settings.hashCode() + ((hashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Island island = this.island;
        PriceWrapperDTO priceWrapperDTO = this.regularPrice;
        List<AdditionalInfoDTO> list = this.additionalInfo;
        SettingsDTO settingsDTO = this.settings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CurtainPriceDTO(island=");
        sb2.append(island);
        sb2.append(", regularPrice=");
        sb2.append(priceWrapperDTO);
        sb2.append(", additionalInfo=");
        sb2.append(list);
        sb2.append(", settings=");
        sb2.append(settingsDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BI\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$Island;", "", "banksInfo", "price", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "priceDescription", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/Object;Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getBanksInfo", "()Ljava/lang/Object;", "getPrice", "()Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "getPriceDescription", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "BankLogoDTO", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Island {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String backgroundColor;
        private final Object banksInfo;

        @NotNull
        private final CornerRadius cornerRadius;

        @NotNull
        private final PriceWrapperDTO price;
        private final List<TextDTO> priceDescription;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$Island$BankLogoDTO;", "", "image", "", "darkImage", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getImage", "()Ljava/lang/String;", "getDarkImage", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BankLogoDTO {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final String darkImage;

            @NotNull
            private final String image;
            private final TestInfo testInfo;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public BankLogoDTO(@NotNull String image, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.darkImage = str;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.testInfo = testInfo;
            }

            public static /* synthetic */ BankLogoDTO copy$default(BankLogoDTO bankLogoDTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = bankLogoDTO.image;
                }
                if ((i11 & 2) != 0) {
                    str2 = bankLogoDTO.darkImage;
                }
                if ((i11 & 4) != 0) {
                    atomActionDTO = bankLogoDTO.action;
                }
                if ((i11 & 8) != 0) {
                    map = bankLogoDTO.trackingInfo;
                }
                if ((i11 & 16) != 0) {
                    testInfo = bankLogoDTO.testInfo;
                }
                TestInfo testInfo2 = testInfo;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                return bankLogoDTO.copy(str, str2, atomActionDTO2, map, testInfo2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDarkImage() {
                return this.darkImage;
            }

            /* renamed from: component3, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            /* renamed from: component5, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final BankLogoDTO copy(@NotNull String image, String darkImage, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new BankLogoDTO(image, darkImage, action, trackingInfo, testInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BankLogoDTO)) {
                    return false;
                }
                BankLogoDTO bankLogoDTO = (BankLogoDTO) other;
                return Intrinsics.d(this.image, bankLogoDTO.image) && Intrinsics.d(this.darkImage, bankLogoDTO.darkImage) && Intrinsics.d(this.action, bankLogoDTO.action) && Intrinsics.d(this.trackingInfo, bankLogoDTO.trackingInfo) && Intrinsics.d(this.testInfo, bankLogoDTO.testInfo);
            }

            public final AtomActionDTO getAction() {
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

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                String str = this.darkImage;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                String str2 = this.darkImage;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TestInfo testInfo = this.testInfo;
                StringBuilder d11 = C3660k.d("BankLogoDTO(image=", str, ", darkImage=", str2, ", action=");
                Sh.b.f(d11, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
                return h.c(d11, testInfo, ")");
            }
        }

        public Island(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "partnerBanks", type = PartnerBanksDTO.class), @ProtoOneOfSignature(name = "defaultBankLogo", type = BankLogoDTO.class)}) @ProtoOneOf(label = "type") Object obj, @NotNull PriceWrapperDTO price, List<TextDTO> list, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.banksInfo = obj;
            this.price = price;
            this.priceDescription = list;
            this.backgroundColor = backgroundColor;
            this.cornerRadius = cornerRadius;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ Island copy$default(Island island, Object obj, PriceWrapperDTO priceWrapperDTO, List list, String str, CornerRadius cornerRadius, AtomActionDTO atomActionDTO, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = island.banksInfo;
            }
            if ((i11 & 2) != 0) {
                priceWrapperDTO = island.price;
            }
            if ((i11 & 4) != 0) {
                list = island.priceDescription;
            }
            if ((i11 & 8) != 0) {
                str = island.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                cornerRadius = island.cornerRadius;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = island.action;
            }
            CornerRadius cornerRadius2 = cornerRadius;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return island.copy(obj, priceWrapperDTO, list, str, cornerRadius2, atomActionDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final Object getBanksInfo() {
            return this.banksInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceWrapperDTO getPrice() {
            return this.price;
        }

        public final List<TextDTO> component3() {
            return this.priceDescription;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Island copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "partnerBanks", type = PartnerBanksDTO.class), @ProtoOneOfSignature(name = "defaultBankLogo", type = BankLogoDTO.class)}) @ProtoOneOf(label = "type") Object banksInfo, @NotNull PriceWrapperDTO price, List<TextDTO> priceDescription, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new Island(banksInfo, price, priceDescription, backgroundColor, cornerRadius, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Island)) {
                return false;
            }
            Island island = (Island) other;
            return Intrinsics.d(this.banksInfo, island.banksInfo) && Intrinsics.d(this.price, island.price) && Intrinsics.d(this.priceDescription, island.priceDescription) && Intrinsics.d(this.backgroundColor, island.backgroundColor) && this.cornerRadius == island.cornerRadius && Intrinsics.d(this.action, island.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Object getBanksInfo() {
            return this.banksInfo;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final PriceWrapperDTO getPrice() {
            return this.price;
        }

        public final List<TextDTO> getPriceDescription() {
            return this.priceDescription;
        }

        public int hashCode() {
            Object obj = this.banksInfo;
            int hashCode = (this.price.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31;
            List<TextDTO> list = this.priceDescription;
            int b11 = Tl.b.b(this.cornerRadius, g.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.backgroundColor), 31);
            AtomActionDTO atomActionDTO = this.action;
            return b11 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Object obj = this.banksInfo;
            PriceWrapperDTO priceWrapperDTO = this.price;
            List<TextDTO> list = this.priceDescription;
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder sb2 = new StringBuilder("Island(banksInfo=");
            sb2.append(obj);
            sb2.append(", price=");
            sb2.append(priceWrapperDTO);
            sb2.append(", priceDescription=");
            e.i(", backgroundColor=", str, ", cornerRadius=", sb2, list);
            sb2.append(cornerRadius);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ Island(Object obj, PriceWrapperDTO priceWrapperDTO, List list, String str, CornerRadius cornerRadius, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, priceWrapperDTO, list, (i11 & 8) != 0 ? UniColors.LAYER_FLOOR_1.getToken() : str, (i11 & 16) != 0 ? CornerRadius.RADIUS_350 : cornerRadius, atomActionDTO);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CurtainPriceDTO(Island island, PriceWrapperDTO priceWrapperDTO, List list, SettingsDTO settingsDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(island, priceWrapperDTO, list, r12, r13);
        Map map2;
        SettingsDTO settingsDTO2;
        if ((i11 & 8) != 0) {
            map2 = map;
            settingsDTO2 = new SettingsDTO(null, null, null, null, 15, null);
        } else {
            map2 = map;
            settingsDTO2 = settingsDTO;
        }
    }
}
