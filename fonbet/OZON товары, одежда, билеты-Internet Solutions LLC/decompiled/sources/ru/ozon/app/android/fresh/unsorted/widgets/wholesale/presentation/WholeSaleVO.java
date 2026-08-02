package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation;

import G.g;
import Lh.b;
import Pk0.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b'\u0010\u0014R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b(\u0010\u0014R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO$Cell;", "cells", "", "background", "", "radius", "successMessage", "errorMessage", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Ljava/lang/String;", "getBackground", "Ljava/lang/Integer;", "getRadius", "()Ljava/lang/Integer;", "getSuccessMessage", "getErrorMessage", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Cell", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WholeSaleVO implements c {
    private final String background;

    @NotNull
    private final List<Cell> cells;

    @NotNull
    private final String errorMessage;
    private final long id;
    private final Integer radius;

    @NotNull
    private final String successMessage;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO$Cell;", "", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "titleSubtitleCell", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "hasSeparator", "<init>", "(Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "getTitleSubtitleCell", "()Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Z", "getHasSeparator", "()Z", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cell {
        public static final int $stable = TitleSubtitleCellDTO.$stable;
        private final ButtonV3DTO button;
        private final boolean hasSeparator;

        @NotNull
        private final TitleSubtitleCellDTO titleSubtitleCell;

        public Cell(@NotNull TitleSubtitleCellDTO titleSubtitleCell, ButtonV3DTO buttonV3DTO, boolean z11) {
            Intrinsics.checkNotNullParameter(titleSubtitleCell, "titleSubtitleCell");
            this.titleSubtitleCell = titleSubtitleCell;
            this.button = buttonV3DTO;
            this.hasSeparator = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) other;
            return Intrinsics.d(this.titleSubtitleCell, cell.titleSubtitleCell) && Intrinsics.d(this.button, cell.button) && this.hasSeparator == cell.hasSeparator;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        @NotNull
        public final TitleSubtitleCellDTO getTitleSubtitleCell() {
            return this.titleSubtitleCell;
        }

        public int hashCode() {
            int hashCode = this.titleSubtitleCell.hashCode() * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            return Boolean.hashCode(this.hasSeparator) + ((hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TitleSubtitleCellDTO titleSubtitleCellDTO = this.titleSubtitleCell;
            ButtonV3DTO buttonV3DTO = this.button;
            boolean z11 = this.hasSeparator;
            StringBuilder sb2 = new StringBuilder("Cell(titleSubtitleCell=");
            sb2.append(titleSubtitleCellDTO);
            sb2.append(", button=");
            sb2.append(buttonV3DTO);
            sb2.append(", hasSeparator=");
            return a.a(")", sb2, z11);
        }
    }

    public WholeSaleVO(long j11, @NotNull List<Cell> cells, String str, Integer num, @NotNull String successMessage, @NotNull String errorMessage, t tVar) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(successMessage, "successMessage");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.id = j11;
        this.cells = cells;
        this.background = str;
        this.radius = num;
        this.successMessage = successMessage;
        this.errorMessage = errorMessage;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WholeSaleVO)) {
            return false;
        }
        WholeSaleVO wholeSaleVO = (WholeSaleVO) other;
        return this.id == wholeSaleVO.id && Intrinsics.d(this.cells, wholeSaleVO.cells) && Intrinsics.d(this.background, wholeSaleVO.background) && Intrinsics.d(this.radius, wholeSaleVO.radius) && Intrinsics.d(this.successMessage, wholeSaleVO.successMessage) && Intrinsics.d(this.errorMessage, wholeSaleVO.errorMessage) && Intrinsics.d(this.tokenizedEvent, wholeSaleVO.tokenizedEvent);
    }

    public final String getBackground() {
        return this.background;
    }

    @NotNull
    public final List<Cell> getCells() {
        return this.cells;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Integer getRadius() {
        return this.radius;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.cells);
        String str = this.background;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.radius;
        int a11 = g.a(g.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.successMessage), 31, this.errorMessage);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Cell> list = this.cells;
        String str = this.background;
        Integer num = this.radius;
        String str2 = this.successMessage;
        String str3 = this.errorMessage;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "WholeSaleVO(id=", ", cells=", list);
        b11.append(", background=");
        b11.append(str);
        b11.append(", radius=");
        b11.append(num);
        Nh.a.h(b11, ", successMessage=", str2, ", errorMessage=", str3);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
