package ru.ozon.app.android.cart.controls.v3.presentation;

import B0.C2454a;
import Bi.b;
import Kk.C3532b;
import Ve.C4598rp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00012BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013Jr\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b\r\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b0\u0010,R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b1\u0010,¨\u00063"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;", "selectAll", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "shareIconButton", "removeIconButton", "", "horizontalMargins", "", "isRounded", "Lru/ozon/uni/atoms/data/text/TextDTO;", "productsTotal", "setStubButton", "lockButtons", "<init>", "(JLru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;IZLru/ozon/uni/atoms/data/text/TextDTO;ZZ)V", "copy", "(JLru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;IZLru/ozon/uni/atoms/data/text/TextDTO;ZZ)Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;", "getSelectAll", "()Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getShareIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRemoveIconButton", "I", "getHorizontalMargins", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getProductsTotal", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSetStubButton", "getLockButtons", "SelectAll", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ControlsV3VO implements c {
    public static final int $stable = (IconButtonV3DTO.$stable | CheckBoxDTO.$stable) | AtomAction.$stable;
    private final int horizontalMargins;
    private final long id;
    private final boolean isRounded;
    private final boolean lockButtons;
    private final TextDTO productsTotal;
    private final IconButtonV3DTO removeIconButton;
    private final SelectAll selectAll;
    private final boolean setStubButton;
    private final IconButtonV3DTO shareIconButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isSelected", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "checkbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "getName", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;", "equals", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectAll {
        public static final int $stable = CheckBoxDTO.$stable | AtomAction.$stable;

        @NotNull
        private final AtomAction action;
        private final CheckBoxDTO checkbox;
        private final Boolean isSelected;

        @NotNull
        private final String name;

        public SelectAll(@NotNull String name, Boolean bool, @NotNull AtomAction action, CheckBoxDTO checkBoxDTO) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(action, "action");
            this.name = name;
            this.isSelected = bool;
            this.action = action;
            this.checkbox = checkBoxDTO;
        }

        public static /* synthetic */ SelectAll copy$default(SelectAll selectAll, String str, Boolean bool, AtomAction atomAction, CheckBoxDTO checkBoxDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selectAll.name;
            }
            if ((i11 & 2) != 0) {
                bool = selectAll.isSelected;
            }
            if ((i11 & 4) != 0) {
                atomAction = selectAll.action;
            }
            if ((i11 & 8) != 0) {
                checkBoxDTO = selectAll.checkbox;
            }
            return selectAll.copy(str, bool, atomAction, checkBoxDTO);
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
        public final AtomAction getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        public final SelectAll copy(@NotNull String name, Boolean isSelected, @NotNull AtomAction action, CheckBoxDTO checkbox) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(action, "action");
            return new SelectAll(name, isSelected, action, checkbox);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectAll)) {
                return false;
            }
            SelectAll selectAll = (SelectAll) other;
            return Intrinsics.d(this.name, selectAll.name) && Intrinsics.d(this.isSelected, selectAll.isSelected) && Intrinsics.d(this.action, selectAll.action) && Intrinsics.d(this.checkbox, selectAll.checkbox);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            Boolean bool = this.isSelected;
            int a11 = C4598rp.a(this.action, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
            CheckBoxDTO checkBoxDTO = this.checkbox;
            return a11 + (checkBoxDTO != null ? checkBoxDTO.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "SelectAll(name=" + this.name + ", isSelected=" + this.isSelected + ", action=" + this.action + ", checkbox=" + this.checkbox + ")";
        }
    }

    public ControlsV3VO(long j11, SelectAll selectAll, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i11, boolean z11, TextDTO textDTO, boolean z12, boolean z13) {
        this.id = j11;
        this.selectAll = selectAll;
        this.shareIconButton = iconButtonV3DTO;
        this.removeIconButton = iconButtonV3DTO2;
        this.horizontalMargins = i11;
        this.isRounded = z11;
        this.productsTotal = textDTO;
        this.setStubButton = z12;
        this.lockButtons = z13;
    }

    public static /* synthetic */ ControlsV3VO copy$default(ControlsV3VO controlsV3VO, long j11, SelectAll selectAll, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i11, boolean z11, TextDTO textDTO, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = controlsV3VO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            selectAll = controlsV3VO.selectAll;
        }
        SelectAll selectAll2 = selectAll;
        if ((i12 & 4) != 0) {
            iconButtonV3DTO = controlsV3VO.shareIconButton;
        }
        return controlsV3VO.copy(j12, selectAll2, iconButtonV3DTO, (i12 & 8) != 0 ? controlsV3VO.removeIconButton : iconButtonV3DTO2, (i12 & 16) != 0 ? controlsV3VO.horizontalMargins : i11, (i12 & 32) != 0 ? controlsV3VO.isRounded : z11, (i12 & 64) != 0 ? controlsV3VO.productsTotal : textDTO, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? controlsV3VO.setStubButton : z12, (i12 & 256) != 0 ? controlsV3VO.lockButtons : z13);
    }

    @NotNull
    public final ControlsV3VO copy(long id2, SelectAll selectAll, IconButtonV3DTO shareIconButton, IconButtonV3DTO removeIconButton, int horizontalMargins, boolean isRounded, TextDTO productsTotal, boolean setStubButton, boolean lockButtons) {
        return new ControlsV3VO(id2, selectAll, shareIconButton, removeIconButton, horizontalMargins, isRounded, productsTotal, setStubButton, lockButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlsV3VO)) {
            return false;
        }
        ControlsV3VO controlsV3VO = (ControlsV3VO) other;
        return this.id == controlsV3VO.id && Intrinsics.d(this.selectAll, controlsV3VO.selectAll) && Intrinsics.d(this.shareIconButton, controlsV3VO.shareIconButton) && Intrinsics.d(this.removeIconButton, controlsV3VO.removeIconButton) && this.horizontalMargins == controlsV3VO.horizontalMargins && this.isRounded == controlsV3VO.isRounded && Intrinsics.d(this.productsTotal, controlsV3VO.productsTotal) && this.setStubButton == controlsV3VO.setStubButton && this.lockButtons == controlsV3VO.lockButtons;
    }

    public final int getHorizontalMargins() {
        return this.horizontalMargins;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final boolean getLockButtons() {
        return this.lockButtons;
    }

    public final TextDTO getProductsTotal() {
        return this.productsTotal;
    }

    public final IconButtonV3DTO getRemoveIconButton() {
        return this.removeIconButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SelectAll getSelectAll() {
        return this.selectAll;
    }

    public final boolean getSetStubButton() {
        return this.setStubButton;
    }

    public final IconButtonV3DTO getShareIconButton() {
        return this.shareIconButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        SelectAll selectAll = this.selectAll;
        int hashCode2 = (hashCode + (selectAll == null ? 0 : selectAll.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.shareIconButton;
        int hashCode3 = (hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO2 = this.removeIconButton;
        int a11 = C3532b.a(C2454a.a(this.horizontalMargins, (hashCode3 + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31, 31), 31, this.isRounded);
        TextDTO textDTO = this.productsTotal;
        return Boolean.hashCode(this.lockButtons) + C3532b.a((a11 + (textDTO != null ? textDTO.hashCode() : 0)) * 31, 31, this.setStubButton);
    }

    /* renamed from: isRounded, reason: from getter */
    public final boolean getIsRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        SelectAll selectAll = this.selectAll;
        IconButtonV3DTO iconButtonV3DTO = this.shareIconButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.removeIconButton;
        int i11 = this.horizontalMargins;
        boolean z11 = this.isRounded;
        TextDTO textDTO = this.productsTotal;
        boolean z12 = this.setStubButton;
        boolean z13 = this.lockButtons;
        StringBuilder sb2 = new StringBuilder("ControlsV3VO(id=");
        sb2.append(j11);
        sb2.append(", selectAll=");
        sb2.append(selectAll);
        sb2.append(", shareIconButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", removeIconButton=");
        sb2.append(iconButtonV3DTO2);
        sb2.append(", horizontalMargins=");
        sb2.append(i11);
        sb2.append(", isRounded=");
        sb2.append(z11);
        sb2.append(", productsTotal=");
        sb2.append(textDTO);
        sb2.append(", setStubButton=");
        sb2.append(z12);
        return b.f(sb2, ", lockButtons=", z13, ")");
    }

    public /* synthetic */ ControlsV3VO(long j11, SelectAll selectAll, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i11, boolean z11, TextDTO textDTO, boolean z12, boolean z13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, selectAll, iconButtonV3DTO, iconButtonV3DTO2, i11, z11, textDTO, z12, (i12 & 256) != 0 ? false : z13);
    }
}
