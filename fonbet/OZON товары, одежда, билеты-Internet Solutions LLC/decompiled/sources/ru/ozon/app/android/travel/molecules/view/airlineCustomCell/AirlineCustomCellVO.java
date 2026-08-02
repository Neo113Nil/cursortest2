package ru.ozon.app.android.travel.molecules.view.airlineCustomCell;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import K00.b;
import Lc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\"#$%B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO;", "", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$SettingsVO;", "settings", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$LeftBlockVO;", "leftBlock", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$CenterBlockVO;", "centerBlock", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$RightBlockVO;", "rightBlock", "<init>", "(Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$SettingsVO;Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$LeftBlockVO;Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$CenterBlockVO;Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$RightBlockVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$SettingsVO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$SettingsVO;", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$LeftBlockVO;", "getLeftBlock", "()Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$LeftBlockVO;", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$CenterBlockVO;", "getCenterBlock", "()Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$CenterBlockVO;", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$RightBlockVO;", "getRightBlock", "()Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$RightBlockVO;", "SettingsVO", "LeftBlockVO", "CenterBlockVO", "RightBlockVO", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AirlineCustomCellVO {

    @NotNull
    private final CenterBlockVO centerBlock;
    private final LeftBlockVO leftBlock;
    private final RightBlockVO rightBlock;

    @NotNull
    private final SettingsVO settings;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$CenterBlockVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CenterBlockVO {
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public CenterBlockVO(@NotNull TextDTO title, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CenterBlockVO)) {
                return false;
            }
            CenterBlockVO centerBlockVO = (CenterBlockVO) other;
            return Intrinsics.d(this.title, centerBlockVO.title) && Intrinsics.d(this.subtitle, centerBlockVO.subtitle);
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
            return a.b("CenterBlockVO(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$LeftBlockVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "mainCarrier", "operatingCarrier", "", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getMainCarrier", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getOperatingCarrier", "I", "getRightPadding", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LeftBlockVO {

        @NotNull
        private final ImageDTO mainCarrier;
        private final ImageDTO operatingCarrier;
        private final int rightPadding;

        public LeftBlockVO(@NotNull ImageDTO mainCarrier, ImageDTO imageDTO, int i11) {
            Intrinsics.checkNotNullParameter(mainCarrier, "mainCarrier");
            this.mainCarrier = mainCarrier;
            this.operatingCarrier = imageDTO;
            this.rightPadding = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeftBlockVO)) {
                return false;
            }
            LeftBlockVO leftBlockVO = (LeftBlockVO) other;
            return Intrinsics.d(this.mainCarrier, leftBlockVO.mainCarrier) && Intrinsics.d(this.operatingCarrier, leftBlockVO.operatingCarrier) && this.rightPadding == leftBlockVO.rightPadding;
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
            StringBuilder sb2 = new StringBuilder("LeftBlockVO(mainCarrier=");
            sb2.append(imageDTO);
            sb2.append(", operatingCarrier=");
            sb2.append(imageDTO2);
            sb2.append(", rightPadding=");
            return b.e(i11, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$RightBlockVO;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "leftPadding", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "I", "getLeftPadding", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RightBlockVO {

        @NotNull
        private final BadgeDTO badge;
        private final int leftPadding;

        public RightBlockVO(@NotNull BadgeDTO badge, int i11) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.badge = badge;
            this.leftPadding = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RightBlockVO)) {
                return false;
            }
            RightBlockVO rightBlockVO = (RightBlockVO) other;
            return Intrinsics.d(this.badge, rightBlockVO.badge) && this.leftPadding == rightBlockVO.leftPadding;
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
            return "RightBlockVO(badge=" + this.badge + ", leftPadding=" + this.leftPadding + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO$SettingsVO;", "", "", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTopPadding", "getBottomPadding", "getLeftPadding", "getRightPadding", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsVO {
        private final int bottomPadding;
        private final int leftPadding;
        private final int rightPadding;
        private final int topPadding;

        public SettingsVO() {
            this(0, 0, 0, 0, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsVO)) {
                return false;
            }
            SettingsVO settingsVO = (SettingsVO) other;
            return this.topPadding == settingsVO.topPadding && this.bottomPadding == settingsVO.bottomPadding && this.leftPadding == settingsVO.leftPadding && this.rightPadding == settingsVO.rightPadding;
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
            return P.a(this.leftPadding, this.rightPadding, ", rightPadding=", ")", C2438a.a("SettingsVO(topPadding=", this.topPadding, ", bottomPadding=", ", leftPadding=", this.bottomPadding));
        }

        public SettingsVO(int i11, int i12, int i13, int i14) {
            this.topPadding = i11;
            this.bottomPadding = i12;
            this.leftPadding = i13;
            this.rightPadding = i14;
        }

        public /* synthetic */ SettingsVO(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
        }
    }

    public AirlineCustomCellVO(@NotNull SettingsVO settings, LeftBlockVO leftBlockVO, @NotNull CenterBlockVO centerBlock, RightBlockVO rightBlockVO) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(centerBlock, "centerBlock");
        this.settings = settings;
        this.leftBlock = leftBlockVO;
        this.centerBlock = centerBlock;
        this.rightBlock = rightBlockVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirlineCustomCellVO)) {
            return false;
        }
        AirlineCustomCellVO airlineCustomCellVO = (AirlineCustomCellVO) other;
        return Intrinsics.d(this.settings, airlineCustomCellVO.settings) && Intrinsics.d(this.leftBlock, airlineCustomCellVO.leftBlock) && Intrinsics.d(this.centerBlock, airlineCustomCellVO.centerBlock) && Intrinsics.d(this.rightBlock, airlineCustomCellVO.rightBlock);
    }

    @NotNull
    public final CenterBlockVO getCenterBlock() {
        return this.centerBlock;
    }

    public final LeftBlockVO getLeftBlock() {
        return this.leftBlock;
    }

    public final RightBlockVO getRightBlock() {
        return this.rightBlock;
    }

    @NotNull
    public final SettingsVO getSettings() {
        return this.settings;
    }

    public int hashCode() {
        int hashCode = this.settings.hashCode() * 31;
        LeftBlockVO leftBlockVO = this.leftBlock;
        int hashCode2 = (this.centerBlock.hashCode() + ((hashCode + (leftBlockVO == null ? 0 : leftBlockVO.hashCode())) * 31)) * 31;
        RightBlockVO rightBlockVO = this.rightBlock;
        return hashCode2 + (rightBlockVO != null ? rightBlockVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AirlineCustomCellVO(settings=" + this.settings + ", leftBlock=" + this.leftBlock + ", centerBlock=" + this.centerBlock + ", rightBlock=" + this.rightBlock + ")";
    }
}
