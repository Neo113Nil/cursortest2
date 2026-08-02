package ru.ozon.app.android.travel.molecules.dto.airlineCustomCell;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import K00.b;
import Lc.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004 !\"#B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO;", "", "settings", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$SettingsDTO;", "leftBlock", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$LeftBlockDTO;", "centerBlock", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$CenterBlockDTO;", "rightBlock", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$RightBlockDTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$SettingsDTO;Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$LeftBlockDTO;Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$CenterBlockDTO;Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$RightBlockDTO;)V", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$SettingsDTO;", "getLeftBlock", "()Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$LeftBlockDTO;", "getCenterBlock", "()Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$CenterBlockDTO;", "getRightBlock", "()Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$RightBlockDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SettingsDTO", "LeftBlockDTO", "CenterBlockDTO", "RightBlockDTO", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AirlineCustomCellDTO {

    @NotNull
    private final CenterBlockDTO centerBlock;
    private final LeftBlockDTO leftBlock;
    private final RightBlockDTO rightBlock;
    private final SettingsDTO settings;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$CenterBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CenterBlockDTO {
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public CenterBlockDTO(@NotNull TextDTO title, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textDTO;
        }

        public static /* synthetic */ CenterBlockDTO copy$default(CenterBlockDTO centerBlockDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = centerBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = centerBlockDTO.subtitle;
            }
            return centerBlockDTO.copy(textDTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final CenterBlockDTO copy(@NotNull TextDTO title, TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new CenterBlockDTO(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CenterBlockDTO)) {
                return false;
            }
            CenterBlockDTO centerBlockDTO = (CenterBlockDTO) other;
            return Intrinsics.d(this.title, centerBlockDTO.title) && Intrinsics.d(this.subtitle, centerBlockDTO.subtitle);
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
            return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return a.b("CenterBlockDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$SettingsDTO;", "", "topPadding", "", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(IIII)V", "getTopPadding", "()I", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsDTO {
        private final int bottomPadding;
        private final int leftPadding;
        private final int rightPadding;
        private final int topPadding;

        public SettingsDTO() {
            this(0, 0, 0, 0, 15, null);
        }

        public static /* synthetic */ SettingsDTO copy$default(SettingsDTO settingsDTO, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i11 = settingsDTO.topPadding;
            }
            if ((i15 & 2) != 0) {
                i12 = settingsDTO.bottomPadding;
            }
            if ((i15 & 4) != 0) {
                i13 = settingsDTO.leftPadding;
            }
            if ((i15 & 8) != 0) {
                i14 = settingsDTO.rightPadding;
            }
            return settingsDTO.copy(i11, i12, i13, i14);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final int getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final SettingsDTO copy(int topPadding, int bottomPadding, int leftPadding, int rightPadding) {
            return new SettingsDTO(topPadding, bottomPadding, leftPadding, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsDTO)) {
                return false;
            }
            SettingsDTO settingsDTO = (SettingsDTO) other;
            return this.topPadding == settingsDTO.topPadding && this.bottomPadding == settingsDTO.bottomPadding && this.leftPadding == settingsDTO.leftPadding && this.rightPadding == settingsDTO.rightPadding;
        }

        public final int getBottomPadding() {
            return this.bottomPadding;
        }

        public final int getLeftPadding() {
            return this.leftPadding;
        }

        public final int getRightPadding() {
            return this.rightPadding;
        }

        public final int getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return Integer.hashCode(this.rightPadding) + C2454a.a(this.leftPadding, C2454a.a(this.bottomPadding, Integer.hashCode(this.topPadding) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.leftPadding, this.rightPadding, ", rightPadding=", ")", C2438a.a("SettingsDTO(topPadding=", this.topPadding, ", bottomPadding=", ", leftPadding=", this.bottomPadding));
        }

        public SettingsDTO(int i11, int i12, int i13, int i14) {
            this.topPadding = i11;
            this.bottomPadding = i12;
            this.leftPadding = i13;
            this.rightPadding = i14;
        }

        public /* synthetic */ SettingsDTO(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
        }
    }

    public AirlineCustomCellDTO(SettingsDTO settingsDTO, LeftBlockDTO leftBlockDTO, @NotNull CenterBlockDTO centerBlock, RightBlockDTO rightBlockDTO) {
        Intrinsics.checkNotNullParameter(centerBlock, "centerBlock");
        this.settings = settingsDTO;
        this.leftBlock = leftBlockDTO;
        this.centerBlock = centerBlock;
        this.rightBlock = rightBlockDTO;
    }

    public static /* synthetic */ AirlineCustomCellDTO copy$default(AirlineCustomCellDTO airlineCustomCellDTO, SettingsDTO settingsDTO, LeftBlockDTO leftBlockDTO, CenterBlockDTO centerBlockDTO, RightBlockDTO rightBlockDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            settingsDTO = airlineCustomCellDTO.settings;
        }
        if ((i11 & 2) != 0) {
            leftBlockDTO = airlineCustomCellDTO.leftBlock;
        }
        if ((i11 & 4) != 0) {
            centerBlockDTO = airlineCustomCellDTO.centerBlock;
        }
        if ((i11 & 8) != 0) {
            rightBlockDTO = airlineCustomCellDTO.rightBlock;
        }
        return airlineCustomCellDTO.copy(settingsDTO, leftBlockDTO, centerBlockDTO, rightBlockDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final SettingsDTO getSettings() {
        return this.settings;
    }

    /* renamed from: component2, reason: from getter */
    public final LeftBlockDTO getLeftBlock() {
        return this.leftBlock;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CenterBlockDTO getCenterBlock() {
        return this.centerBlock;
    }

    /* renamed from: component4, reason: from getter */
    public final RightBlockDTO getRightBlock() {
        return this.rightBlock;
    }

    @NotNull
    public final AirlineCustomCellDTO copy(SettingsDTO settings, LeftBlockDTO leftBlock, @NotNull CenterBlockDTO centerBlock, RightBlockDTO rightBlock) {
        Intrinsics.checkNotNullParameter(centerBlock, "centerBlock");
        return new AirlineCustomCellDTO(settings, leftBlock, centerBlock, rightBlock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirlineCustomCellDTO)) {
            return false;
        }
        AirlineCustomCellDTO airlineCustomCellDTO = (AirlineCustomCellDTO) other;
        return Intrinsics.d(this.settings, airlineCustomCellDTO.settings) && Intrinsics.d(this.leftBlock, airlineCustomCellDTO.leftBlock) && Intrinsics.d(this.centerBlock, airlineCustomCellDTO.centerBlock) && Intrinsics.d(this.rightBlock, airlineCustomCellDTO.rightBlock);
    }

    @NotNull
    public final CenterBlockDTO getCenterBlock() {
        return this.centerBlock;
    }

    public final LeftBlockDTO getLeftBlock() {
        return this.leftBlock;
    }

    public final RightBlockDTO getRightBlock() {
        return this.rightBlock;
    }

    public final SettingsDTO getSettings() {
        return this.settings;
    }

    public int hashCode() {
        SettingsDTO settingsDTO = this.settings;
        int hashCode = (settingsDTO == null ? 0 : settingsDTO.hashCode()) * 31;
        LeftBlockDTO leftBlockDTO = this.leftBlock;
        int hashCode2 = (this.centerBlock.hashCode() + ((hashCode + (leftBlockDTO == null ? 0 : leftBlockDTO.hashCode())) * 31)) * 31;
        RightBlockDTO rightBlockDTO = this.rightBlock;
        return hashCode2 + (rightBlockDTO != null ? rightBlockDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AirlineCustomCellDTO(settings=" + this.settings + ", leftBlock=" + this.leftBlock + ", centerBlock=" + this.centerBlock + ", rightBlock=" + this.rightBlock + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$RightBlockDTO;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "leftPadding", "", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;I)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getLeftPadding", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RightBlockDTO {

        @NotNull
        private final BadgeDTO badge;
        private final int leftPadding;

        public RightBlockDTO(@NotNull BadgeDTO badge, int i11) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.badge = badge;
            this.leftPadding = i11;
        }

        public static /* synthetic */ RightBlockDTO copy$default(RightBlockDTO rightBlockDTO, BadgeDTO badgeDTO, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                badgeDTO = rightBlockDTO.badge;
            }
            if ((i12 & 2) != 0) {
                i11 = rightBlockDTO.leftPadding;
            }
            return rightBlockDTO.copy(badgeDTO, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final RightBlockDTO copy(@NotNull BadgeDTO badge, int leftPadding) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            return new RightBlockDTO(badge, leftPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RightBlockDTO)) {
                return false;
            }
            RightBlockDTO rightBlockDTO = (RightBlockDTO) other;
            return Intrinsics.d(this.badge, rightBlockDTO.badge) && this.leftPadding == rightBlockDTO.leftPadding;
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final int getLeftPadding() {
            return this.leftPadding;
        }

        public int hashCode() {
            return Integer.hashCode(this.leftPadding) + (this.badge.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "RightBlockDTO(badge=" + this.badge + ", leftPadding=" + this.leftPadding + ")";
        }

        public /* synthetic */ RightBlockDTO(BadgeDTO badgeDTO, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(badgeDTO, (i12 & 2) != 0 ? 0 : i11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO$LeftBlockDTO;", "", "mainCarrier", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "operatingCarrier", "rightPadding", "", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;I)V", "getMainCarrier", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getOperatingCarrier", "getRightPadding", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LeftBlockDTO {

        @NotNull
        private final ImageDTO mainCarrier;
        private final ImageDTO operatingCarrier;
        private final int rightPadding;

        public LeftBlockDTO(@NotNull ImageDTO mainCarrier, ImageDTO imageDTO, int i11) {
            Intrinsics.checkNotNullParameter(mainCarrier, "mainCarrier");
            this.mainCarrier = mainCarrier;
            this.operatingCarrier = imageDTO;
            this.rightPadding = i11;
        }

        public static /* synthetic */ LeftBlockDTO copy$default(LeftBlockDTO leftBlockDTO, ImageDTO imageDTO, ImageDTO imageDTO2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                imageDTO = leftBlockDTO.mainCarrier;
            }
            if ((i12 & 2) != 0) {
                imageDTO2 = leftBlockDTO.operatingCarrier;
            }
            if ((i12 & 4) != 0) {
                i11 = leftBlockDTO.rightPadding;
            }
            return leftBlockDTO.copy(imageDTO, imageDTO2, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getMainCarrier() {
            return this.mainCarrier;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageDTO getOperatingCarrier() {
            return this.operatingCarrier;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final LeftBlockDTO copy(@NotNull ImageDTO mainCarrier, ImageDTO operatingCarrier, int rightPadding) {
            Intrinsics.checkNotNullParameter(mainCarrier, "mainCarrier");
            return new LeftBlockDTO(mainCarrier, operatingCarrier, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeftBlockDTO)) {
                return false;
            }
            LeftBlockDTO leftBlockDTO = (LeftBlockDTO) other;
            return Intrinsics.d(this.mainCarrier, leftBlockDTO.mainCarrier) && Intrinsics.d(this.operatingCarrier, leftBlockDTO.operatingCarrier) && this.rightPadding == leftBlockDTO.rightPadding;
        }

        @NotNull
        public final ImageDTO getMainCarrier() {
            return this.mainCarrier;
        }

        public final ImageDTO getOperatingCarrier() {
            return this.operatingCarrier;
        }

        public final int getRightPadding() {
            return this.rightPadding;
        }

        public int hashCode() {
            int hashCode = this.mainCarrier.hashCode() * 31;
            ImageDTO imageDTO = this.operatingCarrier;
            return Integer.hashCode(this.rightPadding) + ((hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.mainCarrier;
            ImageDTO imageDTO2 = this.operatingCarrier;
            int i11 = this.rightPadding;
            StringBuilder sb2 = new StringBuilder("LeftBlockDTO(mainCarrier=");
            sb2.append(imageDTO);
            sb2.append(", operatingCarrier=");
            sb2.append(imageDTO2);
            sb2.append(", rightPadding=");
            return b.e(i11, ")", sb2);
        }

        public /* synthetic */ LeftBlockDTO(ImageDTO imageDTO, ImageDTO imageDTO2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, imageDTO2, (i12 & 4) != 0 ? 0 : i11);
        }
    }
}
