package ru.ozon.app.android.cart.controls.v2.presentation;

import Ve.C4598rp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO$SelectAll;", "selectAll", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "actionButton", "<init>", "(JLru/ozon/app/android/cart/controls/v2/presentation/ControlsVO$SelectAll;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO$SelectAll;", "getSelectAll", "()Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO$SelectAll;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "SelectAll", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ControlsVO implements c {
    public static final int $stable = (ButtonV3Atom.SmallBorderlessButton.$stable | CheckBoxDTO.$stable) | AtomAction.$stable;
    private final ButtonV3Atom.SmallBorderlessButton actionButton;
    private final long id;

    @NotNull
    private final SelectAll selectAll;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO$SelectAll;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isSelected", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "checkbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "getName", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO$SelectAll;", "equals", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public ControlsVO(long j11, @NotNull SelectAll selectAll, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
        Intrinsics.checkNotNullParameter(selectAll, "selectAll");
        this.id = j11;
        this.selectAll = selectAll;
        this.actionButton = smallBorderlessButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlsVO)) {
            return false;
        }
        ControlsVO controlsVO = (ControlsVO) other;
        return this.id == controlsVO.id && Intrinsics.d(this.selectAll, controlsVO.selectAll) && Intrinsics.d(this.actionButton, controlsVO.actionButton);
    }

    public final ButtonV3Atom.SmallBorderlessButton getActionButton() {
        return this.actionButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final SelectAll getSelectAll() {
        return this.selectAll;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.selectAll.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.actionButton;
        return hashCode + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode());
    }

    @NotNull
    public String toString() {
        return "ControlsVO(id=" + this.id + ", selectAll=" + this.selectAll + ", actionButton=" + this.actionButton + ")";
    }
}
