package ru.ozon.app.android.cart.controls.v3.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002()BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\t\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO;", "", "selectAll", "Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$SelectAll;", "shareIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "removeIconButton", "horizontalMargins", "Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$HorizontalMargins;", "isRounded", "", "productsTotal", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$SelectAll;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$HorizontalMargins;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getSelectAll", "()Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$SelectAll;", "getShareIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRemoveIconButton", "getHorizontalMargins", "()Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$HorizontalMargins;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProductsTotal", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$SelectAll;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$HorizontalMargins;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO;", "equals", "other", "hashCode", "", "toString", "", "SelectAll", "HorizontalMargins", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ControlsV3DTO {
    public static final int $stable = 8;
    private final HorizontalMargins horizontalMargins;
    private final Boolean isRounded;
    private final TextDTO productsTotal;
    private final IconButtonV3DTO removeIconButton;
    private final SelectAll selectAll;
    private final IconButtonV3DTO shareIconButton;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$HorizontalMargins;", "", "pxValue", "", "<init>", "(Ljava/lang/String;II)V", "getPxValue", "()I", "ZERO", "SPACING_16", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class HorizontalMargins {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ HorizontalMargins[] $VALUES;
        private final int pxValue;
        public static final HorizontalMargins ZERO = new HorizontalMargins("ZERO", 0, 0);
        public static final HorizontalMargins SPACING_16 = new HorizontalMargins("SPACING_16", 1, ResourceExtKt.toPx(16));

        private static final /* synthetic */ HorizontalMargins[] $values() {
            return new HorizontalMargins[]{ZERO, SPACING_16};
        }

        static {
            HorizontalMargins[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private HorizontalMargins(String str, int i11, int i12) {
            this.pxValue = i12;
        }

        @NotNull
        public static a<HorizontalMargins> getEntries() {
            return $ENTRIES;
        }

        public static HorizontalMargins valueOf(String str) {
            return (HorizontalMargins) Enum.valueOf(HorizontalMargins.class, str);
        }

        public static HorizontalMargins[] values() {
            return (HorizontalMargins[]) $VALUES.clone();
        }

        public final int getPxValue() {
            return this.pxValue;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JR\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$SelectAll;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "checkbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "getName", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$SelectAll;", "equals", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectAll {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final CheckBoxDTO checkbox;
        private final Boolean isSelected;

        @NotNull
        private final String name;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public SelectAll(@NotNull String name, Boolean bool, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, CheckBoxDTO checkBoxDTO) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(action, "action");
            this.name = name;
            this.isSelected = bool;
            this.action = action;
            this.trackingInfo = map;
            this.checkbox = checkBoxDTO;
        }

        public static /* synthetic */ SelectAll copy$default(SelectAll selectAll, String str, Boolean bool, AtomActionDTO atomActionDTO, Map map, CheckBoxDTO checkBoxDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selectAll.name;
            }
            if ((i11 & 2) != 0) {
                bool = selectAll.isSelected;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = selectAll.action;
            }
            if ((i11 & 8) != 0) {
                map = selectAll.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                checkBoxDTO = selectAll.checkbox;
            }
            CheckBoxDTO checkBoxDTO2 = checkBoxDTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return selectAll.copy(str, bool, atomActionDTO2, map, checkBoxDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        public final SelectAll copy(@NotNull String name, Boolean isSelected, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, CheckBoxDTO checkbox) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(action, "action");
            return new SelectAll(name, isSelected, action, trackingInfo, checkbox);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectAll)) {
                return false;
            }
            SelectAll selectAll = (SelectAll) other;
            return Intrinsics.d(this.name, selectAll.name) && Intrinsics.d(this.isSelected, selectAll.isSelected) && Intrinsics.d(this.action, selectAll.action) && Intrinsics.d(this.trackingInfo, selectAll.trackingInfo) && Intrinsics.d(this.checkbox, selectAll.checkbox);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            Boolean bool = this.isSelected;
            int b11 = Ih.a.b(this.action, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            CheckBoxDTO checkBoxDTO = this.checkbox;
            return hashCode2 + (checkBoxDTO != null ? checkBoxDTO.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.name;
            Boolean bool = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            CheckBoxDTO checkBoxDTO = this.checkbox;
            StringBuilder sb2 = new StringBuilder("SelectAll(name=");
            sb2.append(str);
            sb2.append(", isSelected=");
            sb2.append(bool);
            sb2.append(", action=");
            Sh.b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", checkbox=");
            sb2.append(checkBoxDTO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public ControlsV3DTO(SelectAll selectAll, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, HorizontalMargins horizontalMargins, Boolean bool, TextDTO textDTO) {
        this.selectAll = selectAll;
        this.shareIconButton = iconButtonV3DTO;
        this.removeIconButton = iconButtonV3DTO2;
        this.horizontalMargins = horizontalMargins;
        this.isRounded = bool;
        this.productsTotal = textDTO;
    }

    public static /* synthetic */ ControlsV3DTO copy$default(ControlsV3DTO controlsV3DTO, SelectAll selectAll, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, HorizontalMargins horizontalMargins, Boolean bool, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            selectAll = controlsV3DTO.selectAll;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = controlsV3DTO.shareIconButton;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO2 = controlsV3DTO.removeIconButton;
        }
        if ((i11 & 8) != 0) {
            horizontalMargins = controlsV3DTO.horizontalMargins;
        }
        if ((i11 & 16) != 0) {
            bool = controlsV3DTO.isRounded;
        }
        if ((i11 & 32) != 0) {
            textDTO = controlsV3DTO.productsTotal;
        }
        Boolean bool2 = bool;
        TextDTO textDTO2 = textDTO;
        return controlsV3DTO.copy(selectAll, iconButtonV3DTO, iconButtonV3DTO2, horizontalMargins, bool2, textDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final SelectAll getSelectAll() {
        return this.selectAll;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getShareIconButton() {
        return this.shareIconButton;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getRemoveIconButton() {
        return this.removeIconButton;
    }

    /* renamed from: component4, reason: from getter */
    public final HorizontalMargins getHorizontalMargins() {
        return this.horizontalMargins;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsRounded() {
        return this.isRounded;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDTO getProductsTotal() {
        return this.productsTotal;
    }

    @NotNull
    public final ControlsV3DTO copy(SelectAll selectAll, IconButtonV3DTO shareIconButton, IconButtonV3DTO removeIconButton, HorizontalMargins horizontalMargins, Boolean isRounded, TextDTO productsTotal) {
        return new ControlsV3DTO(selectAll, shareIconButton, removeIconButton, horizontalMargins, isRounded, productsTotal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlsV3DTO)) {
            return false;
        }
        ControlsV3DTO controlsV3DTO = (ControlsV3DTO) other;
        return Intrinsics.d(this.selectAll, controlsV3DTO.selectAll) && Intrinsics.d(this.shareIconButton, controlsV3DTO.shareIconButton) && Intrinsics.d(this.removeIconButton, controlsV3DTO.removeIconButton) && this.horizontalMargins == controlsV3DTO.horizontalMargins && Intrinsics.d(this.isRounded, controlsV3DTO.isRounded) && Intrinsics.d(this.productsTotal, controlsV3DTO.productsTotal);
    }

    public final HorizontalMargins getHorizontalMargins() {
        return this.horizontalMargins;
    }

    public final TextDTO getProductsTotal() {
        return this.productsTotal;
    }

    public final IconButtonV3DTO getRemoveIconButton() {
        return this.removeIconButton;
    }

    public final SelectAll getSelectAll() {
        return this.selectAll;
    }

    public final IconButtonV3DTO getShareIconButton() {
        return this.shareIconButton;
    }

    public int hashCode() {
        SelectAll selectAll = this.selectAll;
        int hashCode = (selectAll == null ? 0 : selectAll.hashCode()) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.shareIconButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO2 = this.removeIconButton;
        int hashCode3 = (hashCode2 + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
        HorizontalMargins horizontalMargins = this.horizontalMargins;
        int hashCode4 = (hashCode3 + (horizontalMargins == null ? 0 : horizontalMargins.hashCode())) * 31;
        Boolean bool = this.isRounded;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        TextDTO textDTO = this.productsTotal;
        return hashCode5 + (textDTO != null ? textDTO.hashCode() : 0);
    }

    public final Boolean isRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        return "ControlsV3DTO(selectAll=" + this.selectAll + ", shareIconButton=" + this.shareIconButton + ", removeIconButton=" + this.removeIconButton + ", horizontalMargins=" + this.horizontalMargins + ", isRounded=" + this.isRounded + ", productsTotal=" + this.productsTotal + ")";
    }
}
