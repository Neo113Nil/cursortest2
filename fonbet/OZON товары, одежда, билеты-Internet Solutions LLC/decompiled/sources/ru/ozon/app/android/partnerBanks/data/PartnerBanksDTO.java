package ru.ozon.app.android.partnerBanks.data;

import B0.C2454a;
import Cm.e;
import Ek.a;
import K1.G;
import N3.C3660k;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u000234Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jw\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\bHÖ\u0001J\t\u00102\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, d2 = {"Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icons", "", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO$BankIcon;", "iconsSize", "", "iconsPadding", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;IILru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcons", "()Ljava/util/List;", "getIconsSize", "()I", "getIconsPadding", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "BankIcon", "CustomIconSize", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PartnerBanksDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final BadgeDTO badge;
    private final List<BankIcon> icons;
    private final int iconsPadding;
    private final int iconsSize;
    private final TestInfo testInfo;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO$CustomIconSize;", "", "width", "", "heigh", "<init>", "(II)V", "getWidth", "()I", "getHeigh", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomIconSize {
        public static final int $stable = 0;
        private final int heigh;
        private final int width;

        public CustomIconSize(int i11, int i12) {
            this.width = i11;
            this.heigh = i12;
        }

        public static /* synthetic */ CustomIconSize copy$default(CustomIconSize customIconSize, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = customIconSize.width;
            }
            if ((i13 & 2) != 0) {
                i12 = customIconSize.heigh;
            }
            return customIconSize.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeigh() {
            return this.heigh;
        }

        @NotNull
        public final CustomIconSize copy(int width, int heigh) {
            return new CustomIconSize(width, heigh);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomIconSize)) {
                return false;
            }
            CustomIconSize customIconSize = (CustomIconSize) other;
            return this.width == customIconSize.width && this.heigh == customIconSize.heigh;
        }

        public final int getHeigh() {
            return this.heigh;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.heigh) + (Integer.hashCode(this.width) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("CustomIconSize(width=", this.width, ", heigh=", ")", this.heigh);
        }
    }

    public PartnerBanksDTO() {
        this(null, null, 0, 0, null, null, null, null, 255, null);
    }

    public static /* synthetic */ PartnerBanksDTO copy$default(PartnerBanksDTO partnerBanksDTO, TextDTO textDTO, List list, int i11, int i12, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textDTO = partnerBanksDTO.title;
        }
        if ((i13 & 2) != 0) {
            list = partnerBanksDTO.icons;
        }
        if ((i13 & 4) != 0) {
            i11 = partnerBanksDTO.iconsSize;
        }
        if ((i13 & 8) != 0) {
            i12 = partnerBanksDTO.iconsPadding;
        }
        if ((i13 & 16) != 0) {
            badgeDTO = partnerBanksDTO.badge;
        }
        if ((i13 & 32) != 0) {
            atomActionDTO = partnerBanksDTO.action;
        }
        if ((i13 & 64) != 0) {
            map = partnerBanksDTO.trackingInfo;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = partnerBanksDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        BadgeDTO badgeDTO2 = badgeDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return partnerBanksDTO.copy(textDTO, list, i11, i12, badgeDTO2, atomActionDTO2, map2, testInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<BankIcon> component2() {
        return this.icons;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIconsSize() {
        return this.iconsSize;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIconsPadding() {
        return this.iconsPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final PartnerBanksDTO copy(TextDTO title, List<BankIcon> icons, int iconsSize, int iconsPadding, BadgeDTO badge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        return new PartnerBanksDTO(title, icons, iconsSize, iconsPadding, badge, action, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerBanksDTO)) {
            return false;
        }
        PartnerBanksDTO partnerBanksDTO = (PartnerBanksDTO) other;
        return Intrinsics.d(this.title, partnerBanksDTO.title) && Intrinsics.d(this.icons, partnerBanksDTO.icons) && this.iconsSize == partnerBanksDTO.iconsSize && this.iconsPadding == partnerBanksDTO.iconsPadding && Intrinsics.d(this.badge, partnerBanksDTO.badge) && Intrinsics.d(this.action, partnerBanksDTO.action) && Intrinsics.d(this.trackingInfo, partnerBanksDTO.trackingInfo) && Intrinsics.d(this.testInfo, partnerBanksDTO.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final List<BankIcon> getIcons() {
        return this.icons;
    }

    public final int getIconsPadding() {
        return this.iconsPadding;
    }

    public final int getIconsSize() {
        return this.iconsSize;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        List<BankIcon> list = this.icons;
        int a11 = C2454a.a(this.iconsPadding, C2454a.a(this.iconsSize, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<BankIcon> list = this.icons;
        int i11 = this.iconsSize;
        int i12 = this.iconsPadding;
        BadgeDTO badgeDTO = this.badge;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder e11 = G.e("PartnerBanksDTO(title=", textDTO, ", icons=", list, ", iconsSize=");
        a.f(i11, i12, ", iconsPadding=", ", badge=", e11);
        e11.append(badgeDTO);
        e11.append(", action=");
        e11.append(atomActionDTO);
        e11.append(", trackingInfo=");
        return b.b(", testInfo=", ")", e11, map, testInfo);
    }

    public PartnerBanksDTO(TextDTO textDTO, List<BankIcon> list, int i11, int i12, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        this.title = textDTO;
        this.icons = list;
        this.iconsSize = i11;
        this.iconsPadding = i12;
        this.badge = badgeDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO$BankIcon;", "", "image", "", "darkImage", "customIconSize", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO$CustomIconSize;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO$CustomIconSize;Lru/ozon/uni/atoms/data/TestInfo;)V", "getImage", "()Ljava/lang/String;", "getDarkImage", "getCustomIconSize", "()Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO$CustomIconSize;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BankIcon {
        public static final int $stable = 0;
        private final CustomIconSize customIconSize;
        private final String darkImage;

        @NotNull
        private final String image;
        private final TestInfo testInfo;

        public BankIcon(@NotNull String image, String str, CustomIconSize customIconSize, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.darkImage = str;
            this.customIconSize = customIconSize;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ BankIcon copy$default(BankIcon bankIcon, String str, String str2, CustomIconSize customIconSize, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bankIcon.image;
            }
            if ((i11 & 2) != 0) {
                str2 = bankIcon.darkImage;
            }
            if ((i11 & 4) != 0) {
                customIconSize = bankIcon.customIconSize;
            }
            if ((i11 & 8) != 0) {
                testInfo = bankIcon.testInfo;
            }
            return bankIcon.copy(str, str2, customIconSize, testInfo);
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
        public final CustomIconSize getCustomIconSize() {
            return this.customIconSize;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final BankIcon copy(@NotNull String image, String darkImage, CustomIconSize customIconSize, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new BankIcon(image, darkImage, customIconSize, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankIcon)) {
                return false;
            }
            BankIcon bankIcon = (BankIcon) other;
            return Intrinsics.d(this.image, bankIcon.image) && Intrinsics.d(this.darkImage, bankIcon.darkImage) && Intrinsics.d(this.customIconSize, bankIcon.customIconSize) && Intrinsics.d(this.testInfo, bankIcon.testInfo);
        }

        public final CustomIconSize getCustomIconSize() {
            return this.customIconSize;
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
            CustomIconSize customIconSize = this.customIconSize;
            int hashCode3 = (hashCode2 + (customIconSize == null ? 0 : customIconSize.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.darkImage;
            CustomIconSize customIconSize = this.customIconSize;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("BankIcon(image=", str, ", darkImage=", str2, ", customIconSize=");
            d11.append(customIconSize);
            d11.append(", testInfo=");
            d11.append(testInfo);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ BankIcon(String str, String str2, CustomIconSize customIconSize, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : customIconSize, (i11 & 8) != 0 ? null : testInfo);
        }
    }

    public /* synthetic */ PartnerBanksDTO(TextDTO textDTO, List list, int i11, int i12, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : textDTO, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? 20 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? null : badgeDTO, (i13 & 32) != 0 ? null : atomActionDTO, (i13 & 64) != 0 ? null : map, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo);
    }
}
