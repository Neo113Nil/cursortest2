package ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.data;

import B3.p;
import D40.b;
import H3.c;
import K1.G;
import Lh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO;", "", "items", "", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$FreshCellDTO;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FreshCellDTO", "CheckboxCellDTO", "Spacers", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CellListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<FreshCellDTO> items;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$CheckboxCellDTO;", "", "checkbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckboxCellDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final CheckBoxDTO checkbox;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CheckboxCellDTO(CheckBoxDTO checkBoxDTO, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO) {
            this.checkbox = checkBoxDTO;
            this.trackingInfo = map;
            this.action = atomActionDTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CheckboxCellDTO copy$default(CheckboxCellDTO checkboxCellDTO, CheckBoxDTO checkBoxDTO, Map map, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                checkBoxDTO = checkboxCellDTO.checkbox;
            }
            if ((i11 & 2) != 0) {
                map = checkboxCellDTO.trackingInfo;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = checkboxCellDTO.action;
            }
            return checkboxCellDTO.copy(checkBoxDTO, map, atomActionDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final CheckboxCellDTO copy(CheckBoxDTO checkbox, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO action) {
            return new CheckboxCellDTO(checkbox, trackingInfo, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckboxCellDTO)) {
                return false;
            }
            CheckboxCellDTO checkboxCellDTO = (CheckboxCellDTO) other;
            return Intrinsics.d(this.checkbox, checkboxCellDTO.checkbox) && Intrinsics.d(this.trackingInfo, checkboxCellDTO.trackingInfo) && Intrinsics.d(this.action, checkboxCellDTO.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            CheckBoxDTO checkBoxDTO = this.checkbox;
            int hashCode = (checkBoxDTO == null ? 0 : checkBoxDTO.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CheckBoxDTO checkBoxDTO = this.checkbox;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder sb2 = new StringBuilder("CheckboxCellDTO(checkbox=");
            sb2.append(checkBoxDTO);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", action=");
            return G.c(sb2, atomActionDTO, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u008b\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$FreshCellDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "badgeImage", "", "checkbox", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$CheckboxCellDTO;", "rightIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "spacers", "Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$Spacers;", "backgroundColor", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$CheckboxCellDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$Spacers;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBadgeImage", "()Ljava/lang/String;", "getCheckbox", "()Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$CheckboxCellDTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$Spacers;", "getBackgroundColor", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTrackingInfo", "()Ljava/util/Map;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FreshCellDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final String badgeImage;

        @NotNull
        private final CellDTO cell;
        private final CheckboxCellDTO checkbox;
        private final CornerRadius cornerRadius;
        private final IconDTO rightIcon;
        private final Spacers spacers;
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public FreshCellDTO(@NotNull CellDTO cell, String str, CheckboxCellDTO checkboxCellDTO, IconDTO iconDTO, Spacers spacers, String str2, TextDTO textDTO, CornerRadius cornerRadius, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.badgeImage = str;
            this.checkbox = checkboxCellDTO;
            this.rightIcon = iconDTO;
            this.spacers = spacers;
            this.backgroundColor = str2;
            this.text = textDTO;
            this.cornerRadius = cornerRadius;
            this.trackingInfo = map;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ FreshCellDTO copy$default(FreshCellDTO freshCellDTO, CellDTO cellDTO, String str, CheckboxCellDTO checkboxCellDTO, IconDTO iconDTO, Spacers spacers, String str2, TextDTO textDTO, CornerRadius cornerRadius, Map map, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = freshCellDTO.cell;
            }
            if ((i11 & 2) != 0) {
                str = freshCellDTO.badgeImage;
            }
            if ((i11 & 4) != 0) {
                checkboxCellDTO = freshCellDTO.checkbox;
            }
            if ((i11 & 8) != 0) {
                iconDTO = freshCellDTO.rightIcon;
            }
            if ((i11 & 16) != 0) {
                spacers = freshCellDTO.spacers;
            }
            if ((i11 & 32) != 0) {
                str2 = freshCellDTO.backgroundColor;
            }
            if ((i11 & 64) != 0) {
                textDTO = freshCellDTO.text;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                cornerRadius = freshCellDTO.cornerRadius;
            }
            if ((i11 & 256) != 0) {
                map = freshCellDTO.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                atomActionDTO = freshCellDTO.action;
            }
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            TextDTO textDTO2 = textDTO;
            CornerRadius cornerRadius2 = cornerRadius;
            Spacers spacers2 = spacers;
            String str3 = str2;
            return freshCellDTO.copy(cellDTO, str, checkboxCellDTO, iconDTO, spacers2, str3, textDTO2, cornerRadius2, map2, atomActionDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component10, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBadgeImage() {
            return this.badgeImage;
        }

        /* renamed from: component3, reason: from getter */
        public final CheckboxCellDTO getCheckbox() {
            return this.checkbox;
        }

        /* renamed from: component4, reason: from getter */
        public final IconDTO getRightIcon() {
            return this.rightIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final Spacers getSpacers() {
            return this.spacers;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component7, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component8, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final FreshCellDTO copy(@NotNull CellDTO cell, String badgeImage, CheckboxCellDTO checkbox, IconDTO rightIcon, Spacers spacers, String backgroundColor, TextDTO text, CornerRadius cornerRadius, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new FreshCellDTO(cell, badgeImage, checkbox, rightIcon, spacers, backgroundColor, text, cornerRadius, trackingInfo, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FreshCellDTO)) {
                return false;
            }
            FreshCellDTO freshCellDTO = (FreshCellDTO) other;
            return Intrinsics.d(this.cell, freshCellDTO.cell) && Intrinsics.d(this.badgeImage, freshCellDTO.badgeImage) && Intrinsics.d(this.checkbox, freshCellDTO.checkbox) && Intrinsics.d(this.rightIcon, freshCellDTO.rightIcon) && Intrinsics.d(this.spacers, freshCellDTO.spacers) && Intrinsics.d(this.backgroundColor, freshCellDTO.backgroundColor) && Intrinsics.d(this.text, freshCellDTO.text) && this.cornerRadius == freshCellDTO.cornerRadius && Intrinsics.d(this.trackingInfo, freshCellDTO.trackingInfo) && Intrinsics.d(this.action, freshCellDTO.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBadgeImage() {
            return this.badgeImage;
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final CheckboxCellDTO getCheckbox() {
            return this.checkbox;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final IconDTO getRightIcon() {
            return this.rightIcon;
        }

        public final Spacers getSpacers() {
            return this.spacers;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            String str = this.badgeImage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            CheckboxCellDTO checkboxCellDTO = this.checkbox;
            int hashCode3 = (hashCode2 + (checkboxCellDTO == null ? 0 : checkboxCellDTO.hashCode())) * 31;
            IconDTO iconDTO = this.rightIcon;
            int hashCode4 = (hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            Spacers spacers = this.spacers;
            int hashCode5 = (hashCode4 + (spacers == null ? 0 : spacers.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TextDTO textDTO = this.text;
            int hashCode7 = (hashCode6 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode8 = (hashCode7 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode9 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FreshCellDTO(cell=" + this.cell + ", badgeImage=" + this.badgeImage + ", checkbox=" + this.checkbox + ", rightIcon=" + this.rightIcon + ", spacers=" + this.spacers + ", backgroundColor=" + this.backgroundColor + ", text=" + this.text + ", cornerRadius=" + this.cornerRadius + ", trackingInfo=" + this.trackingInfo + ", action=" + this.action + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/cellList/v1/data/CellListDTO$Spacers;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "betweenBadge", "right", "horizontal", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getBetweenBadge", "getRight", "getHorizontal", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        public static final int $stable = 0;
        private final Paddings betweenBadge;
        private final Paddings bottom;
        private final Paddings horizontal;
        private final Paddings right;
        private final Paddings top;

        public Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5) {
            this.top = paddings;
            this.bottom = paddings2;
            this.betweenBadge = paddings3;
            this.right = paddings4;
            this.horizontal = paddings5;
        }

        public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacers.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacers.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacers.betweenBadge;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacers.right;
            }
            if ((i11 & 16) != 0) {
                paddings5 = spacers.horizontal;
            }
            Paddings paddings6 = paddings5;
            Paddings paddings7 = paddings3;
            return spacers.copy(paddings, paddings2, paddings7, paddings4, paddings6);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getBetweenBadge() {
            return this.betweenBadge;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        @NotNull
        public final Spacers copy(Paddings top, Paddings bottom, Paddings betweenBadge, Paddings right, Paddings horizontal) {
            return new Spacers(top, bottom, betweenBadge, right, horizontal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.top == spacers.top && this.bottom == spacers.bottom && this.betweenBadge == spacers.betweenBadge && this.right == spacers.right && this.horizontal == spacers.horizontal;
        }

        public final Paddings getBetweenBadge() {
            return this.betweenBadge;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        public final Paddings getRight() {
            return this.right;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.top;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottom;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.betweenBadge;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.right;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.horizontal;
            return hashCode4 + (paddings5 != null ? paddings5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            Paddings paddings3 = this.betweenBadge;
            Paddings paddings4 = this.right;
            Paddings paddings5 = this.horizontal;
            StringBuilder b11 = p.b("Spacers(top=", paddings, ", bottom=", paddings2, ", betweenBadge=");
            a.e(b11, paddings3, ", right=", paddings4, ", horizontal=");
            return b.b(b11, paddings5, ")");
        }
    }

    public CellListDTO(@NotNull List<FreshCellDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CellListDTO copy$default(CellListDTO cellListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cellListDTO.items;
        }
        return cellListDTO.copy(list);
    }

    @NotNull
    public final List<FreshCellDTO> component1() {
        return this.items;
    }

    @NotNull
    public final CellListDTO copy(@NotNull List<FreshCellDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CellListDTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CellListDTO) && Intrinsics.d(this.items, ((CellListDTO) other).items);
    }

    @NotNull
    public final List<FreshCellDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("CellListDTO(items=", ")", this.items);
    }
}
