package ru.ozon.app.android.fresh.feature.b2b.widgets.employeesTable.domain;

import Ak.C2436a;
import B3.p;
import G.g;
import GR.b;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002,-BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "itemId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "cells", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$ButtonsVO;", "buttons", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$ButtonsVO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getItemId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$ButtonsVO;", "getButtons", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$ButtonsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ButtonsVO", "SettingsVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmployeesTableVO implements c {
    private final ButtonsVO buttons;
    private final CellDTO cell;
    private final List<CellDTO> cells;
    private final long id;

    @NotNull
    private final String itemId;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$ButtonsVO;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$SettingsVO;", "settings", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$SettingsVO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$SettingsVO;", "getSettings", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$SettingsVO;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsVO {

        @NotNull
        private final List<ButtonV3DTO> buttons;

        @NotNull
        private final SettingsVO settings;

        public ButtonsVO(@NotNull SettingsVO settings, @NotNull List<ButtonV3DTO> buttons) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.settings = settings;
            this.buttons = buttons;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonsVO)) {
                return false;
            }
            ButtonsVO buttonsVO = (ButtonsVO) other;
            return Intrinsics.d(this.settings, buttonsVO.settings) && Intrinsics.d(this.buttons, buttonsVO.buttons);
        }

        @NotNull
        public final List<ButtonV3DTO> getButtons() {
            return this.buttons;
        }

        @NotNull
        public final SettingsVO getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.buttons.hashCode() + (this.settings.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ButtonsVO(settings=" + this.settings + ", buttons=" + this.buttons + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/employeesTable/domain/EmployeesTableVO$SettingsVO;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "", "disableSeparator", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "Z", "getDisableSeparator", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsVO {

        @NotNull
        private final Paddings bottomPadding;
        private final boolean disableSeparator;

        @NotNull
        private final Paddings leftPadding;

        @NotNull
        private final Paddings rightPadding;

        @NotNull
        private final Paddings topPadding;

        public SettingsVO(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding, boolean z11) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
            this.disableSeparator = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsVO)) {
                return false;
            }
            SettingsVO settingsVO = (SettingsVO) other;
            return this.topPadding == settingsVO.topPadding && this.bottomPadding == settingsVO.bottomPadding && this.leftPadding == settingsVO.leftPadding && this.rightPadding == settingsVO.rightPadding && this.disableSeparator == settingsVO.disableSeparator;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final boolean getDisableSeparator() {
            return this.disableSeparator;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return Boolean.hashCode(this.disableSeparator) + b.b(this.rightPadding, b.b(this.leftPadding, b.b(this.bottomPadding, this.topPadding.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            Paddings paddings3 = this.leftPadding;
            Paddings paddings4 = this.rightPadding;
            boolean z11 = this.disableSeparator;
            StringBuilder b11 = p.b("SettingsVO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding=");
            a.e(b11, paddings3, ", rightPadding=", paddings4, ", disableSeparator=");
            return Pk0.a.a(")", b11, z11);
        }
    }

    public EmployeesTableVO(long j11, @NotNull String itemId, CellDTO cellDTO, List<CellDTO> list, ButtonsVO buttonsVO, t tVar) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.id = j11;
        this.itemId = itemId;
        this.cell = cellDTO;
        this.cells = list;
        this.buttons = buttonsVO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmployeesTableVO)) {
            return false;
        }
        EmployeesTableVO employeesTableVO = (EmployeesTableVO) other;
        return this.id == employeesTableVO.id && Intrinsics.d(this.itemId, employeesTableVO.itemId) && Intrinsics.d(this.cell, employeesTableVO.cell) && Intrinsics.d(this.cells, employeesTableVO.cells) && Intrinsics.d(this.buttons, employeesTableVO.buttons) && Intrinsics.d(this.tokenizedEvent, employeesTableVO.tokenizedEvent);
    }

    public final ButtonsVO getButtons() {
        return this.buttons;
    }

    public final CellDTO getCell() {
        return this.cell;
    }

    public final List<CellDTO> getCells() {
        return this.cells;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.itemId);
        CellDTO cellDTO = this.cell;
        int hashCode = (a11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        List<CellDTO> list = this.cells;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ButtonsVO buttonsVO = this.buttons;
        int hashCode3 = (hashCode2 + (buttonsVO == null ? 0 : buttonsVO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.itemId;
        CellDTO cellDTO = this.cell;
        List<CellDTO> list = this.cells;
        ButtonsVO buttonsVO = this.buttons;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "EmployeesTableVO(id=", ", itemId=", str);
        c11.append(", cell=");
        c11.append(cellDTO);
        c11.append(", cells=");
        c11.append(list);
        c11.append(", buttons=");
        c11.append(buttonsVO);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
