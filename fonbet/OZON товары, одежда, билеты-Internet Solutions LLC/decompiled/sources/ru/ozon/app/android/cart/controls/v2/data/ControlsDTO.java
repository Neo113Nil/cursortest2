package ru.ozon.app.android.cart.controls.v2.data;

import Ih.a;
import Sh.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO;", "", "selectAll", "Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO$SelectAll;", "actionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO$SelectAll;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getSelectAll", "()Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO$SelectAll;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SelectAll", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ControlsDTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.SmallBorderlessButton actionButton;

    @NotNull
    private final SelectAll selectAll;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JR\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO$SelectAll;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "checkbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "getName", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO$SelectAll;", "equals", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            int b11 = a.b(this.action, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
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
            b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", checkbox=");
            sb2.append(checkBoxDTO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public ControlsDTO(@NotNull SelectAll selectAll, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
        Intrinsics.checkNotNullParameter(selectAll, "selectAll");
        this.selectAll = selectAll;
        this.actionButton = smallBorderlessButton;
    }

    public static /* synthetic */ ControlsDTO copy$default(ControlsDTO controlsDTO, SelectAll selectAll, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            selectAll = controlsDTO.selectAll;
        }
        if ((i11 & 2) != 0) {
            smallBorderlessButton = controlsDTO.actionButton;
        }
        return controlsDTO.copy(selectAll, smallBorderlessButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SelectAll getSelectAll() {
        return this.selectAll;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final ControlsDTO copy(@NotNull SelectAll selectAll, ButtonV3Atom.SmallBorderlessButton actionButton) {
        Intrinsics.checkNotNullParameter(selectAll, "selectAll");
        return new ControlsDTO(selectAll, actionButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlsDTO)) {
            return false;
        }
        ControlsDTO controlsDTO = (ControlsDTO) other;
        return Intrinsics.d(this.selectAll, controlsDTO.selectAll) && Intrinsics.d(this.actionButton, controlsDTO.actionButton);
    }

    public final ButtonV3Atom.SmallBorderlessButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final SelectAll getSelectAll() {
        return this.selectAll;
    }

    public int hashCode() {
        int hashCode = this.selectAll.hashCode() * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.actionButton;
        return hashCode + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode());
    }

    @NotNull
    public String toString() {
        return "ControlsDTO(selectAll=" + this.selectAll + ", actionButton=" + this.actionButton + ")";
    }
}
