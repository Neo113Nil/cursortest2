package ru.ozon.app.android.fresh.feature.b2b.widgets.employeesTable.data;

import B3.p;
import D3.g;
import Kk.c;
import Lh.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO;", "", "items", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$ItemDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ItemDTO", "ButtonsDTO", "SettingsDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmployeesTableDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ItemDTO> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$ButtonsDTO;", "", "settings", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$SettingsDTO;", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$SettingsDTO;Ljava/util/List;)V", "getSettings", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$SettingsDTO;", "getButtons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<ButtonV3DTO> buttons;
        private final SettingsDTO settings;

        public ButtonsDTO(SettingsDTO settingsDTO, @NotNull List<ButtonV3DTO> buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.settings = settingsDTO;
            this.buttons = buttons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ButtonsDTO copy$default(ButtonsDTO buttonsDTO, SettingsDTO settingsDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                settingsDTO = buttonsDTO.settings;
            }
            if ((i11 & 2) != 0) {
                list = buttonsDTO.buttons;
            }
            return buttonsDTO.copy(settingsDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final SettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        public final List<ButtonV3DTO> component2() {
            return this.buttons;
        }

        @NotNull
        public final ButtonsDTO copy(SettingsDTO settings, @NotNull List<ButtonV3DTO> buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            return new ButtonsDTO(settings, buttons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonsDTO)) {
                return false;
            }
            ButtonsDTO buttonsDTO = (ButtonsDTO) other;
            return Intrinsics.d(this.settings, buttonsDTO.settings) && Intrinsics.d(this.buttons, buttonsDTO.buttons);
        }

        @NotNull
        public final List<ButtonV3DTO> getButtons() {
            return this.buttons;
        }

        public final SettingsDTO getSettings() {
            return this.settings;
        }

        public int hashCode() {
            SettingsDTO settingsDTO = this.settings;
            return this.buttons.hashCode() + ((settingsDTO == null ? 0 : settingsDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "ButtonsDTO(settings=" + this.settings + ", buttons=" + this.buttons + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$ItemDTO;", "", "id", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "buttons", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$ButtonsDTO;", "cells", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$ButtonsDTO;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getButtons", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$ButtonsDTO;", "getCells", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDTO {
        public static final int $stable = 8;
        private final ButtonsDTO buttons;
        private final CellDTO cell;
        private final List<CellDTO> cells;

        @NotNull
        private final String id;

        public ItemDTO(@NotNull String id2, CellDTO cellDTO, ButtonsDTO buttonsDTO, List<CellDTO> list) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
            this.cell = cellDTO;
            this.buttons = buttonsDTO;
            this.cells = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, String str, CellDTO cellDTO, ButtonsDTO buttonsDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = itemDTO.id;
            }
            if ((i11 & 2) != 0) {
                cellDTO = itemDTO.cell;
            }
            if ((i11 & 4) != 0) {
                buttonsDTO = itemDTO.buttons;
            }
            if ((i11 & 8) != 0) {
                list = itemDTO.cells;
            }
            return itemDTO.copy(str, cellDTO, buttonsDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonsDTO getButtons() {
            return this.buttons;
        }

        public final List<CellDTO> component4() {
            return this.cells;
        }

        @NotNull
        public final ItemDTO copy(@NotNull String id2, CellDTO cell, ButtonsDTO buttons, List<CellDTO> cells) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new ItemDTO(id2, cell, buttons, cells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.id, itemDTO.id) && Intrinsics.d(this.cell, itemDTO.cell) && Intrinsics.d(this.buttons, itemDTO.buttons) && Intrinsics.d(this.cells, itemDTO.cells);
        }

        public final ButtonsDTO getButtons() {
            return this.buttons;
        }

        public final CellDTO getCell() {
            return this.cell;
        }

        public final List<CellDTO> getCells() {
            return this.cells;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            CellDTO cellDTO = this.cell;
            int hashCode2 = (hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
            ButtonsDTO buttonsDTO = this.buttons;
            int hashCode3 = (hashCode2 + (buttonsDTO == null ? 0 : buttonsDTO.hashCode())) * 31;
            List<CellDTO> list = this.cells;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ItemDTO(id=" + this.id + ", cell=" + this.cell + ", buttons=" + this.buttons + ", cells=" + this.cells + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$SettingsDTO;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "disableSeparator", "", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/Boolean;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "getDisableSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/Boolean;)Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/data/EmployeesTableDTO$SettingsDTO;", "equals", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsDTO {
        public static final int $stable = 0;
        private final Paddings bottomPadding;
        private final Boolean disableSeparator;
        private final Paddings leftPadding;
        private final Paddings rightPadding;
        private final Paddings topPadding;

        public SettingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Boolean bool) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
            this.disableSeparator = bool;
        }

        public static /* synthetic */ SettingsDTO copy$default(SettingsDTO settingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = settingsDTO.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = settingsDTO.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = settingsDTO.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = settingsDTO.rightPadding;
            }
            if ((i11 & 16) != 0) {
                bool = settingsDTO.disableSeparator;
            }
            Boolean bool2 = bool;
            Paddings paddings5 = paddings3;
            return settingsDTO.copy(paddings, paddings2, paddings5, paddings4, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getDisableSeparator() {
            return this.disableSeparator;
        }

        @NotNull
        public final SettingsDTO copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding, Boolean disableSeparator) {
            return new SettingsDTO(topPadding, bottomPadding, leftPadding, rightPadding, disableSeparator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsDTO)) {
                return false;
            }
            SettingsDTO settingsDTO = (SettingsDTO) other;
            return this.topPadding == settingsDTO.topPadding && this.bottomPadding == settingsDTO.bottomPadding && this.leftPadding == settingsDTO.leftPadding && this.rightPadding == settingsDTO.rightPadding && Intrinsics.d(this.disableSeparator, settingsDTO.disableSeparator);
        }

        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final Boolean getDisableSeparator() {
            return this.disableSeparator;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            Paddings paddings = this.topPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottomPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.leftPadding;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.rightPadding;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Boolean bool = this.disableSeparator;
            return hashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            Paddings paddings3 = this.leftPadding;
            Paddings paddings4 = this.rightPadding;
            Boolean bool = this.disableSeparator;
            StringBuilder b11 = p.b("SettingsDTO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding=");
            a.e(b11, paddings3, ", rightPadding=", paddings4, ", disableSeparator=");
            return g.d(b11, bool, ")");
        }
    }

    public EmployeesTableDTO(@NotNull List<ItemDTO> items, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmployeesTableDTO copy$default(EmployeesTableDTO employeesTableDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = employeesTableDTO.items;
        }
        if ((i11 & 2) != 0) {
            map = employeesTableDTO.trackingInfo;
        }
        return employeesTableDTO.copy(list, map);
    }

    @NotNull
    public final List<ItemDTO> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final EmployeesTableDTO copy(@NotNull List<ItemDTO> items, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new EmployeesTableDTO(items, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmployeesTableDTO)) {
            return false;
        }
        EmployeesTableDTO employeesTableDTO = (EmployeesTableDTO) other;
        return Intrinsics.d(this.items, employeesTableDTO.items) && Intrinsics.d(this.trackingInfo, employeesTableDTO.trackingInfo);
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("EmployeesTableDTO(items=", ", trackingInfo=", ")", this.items, this.trackingInfo);
    }
}
