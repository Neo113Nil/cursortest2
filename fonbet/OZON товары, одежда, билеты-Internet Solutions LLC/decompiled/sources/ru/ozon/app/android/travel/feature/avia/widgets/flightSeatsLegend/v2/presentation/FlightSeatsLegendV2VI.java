package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.presentation;

import G.g;
import Nh.a;
import Ns.b;
import Tz.C4055a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/presentation/FlightSeatsLegendV2VI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/presentation/FlightSeatsLegendV2VI$SeatTypeV2VI;", "seatTypes", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getSeatTypes", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "SeatTypeV2VI", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsLegendV2VI implements c {
    private final long id;

    @NotNull
    private final List<SeatTypeV2VI> seatTypes;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/presentation/FlightSeatsLegendV2VI$SeatTypeV2VI;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "seatText", "", "seatBackgroundColor", "seatBackrestColor", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeatText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getSeatBackgroundColor", "getSeatBackrestColor", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatTypeV2VI {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;
        private final int id;

        @NotNull
        private final String seatBackgroundColor;
        private final String seatBackrestColor;
        private final TextDTO seatText;

        public SeatTypeV2VI(int i11, TextDTO textDTO, @NotNull String seatBackgroundColor, String str, @NotNull CellDTO cell) {
            Intrinsics.checkNotNullParameter(seatBackgroundColor, "seatBackgroundColor");
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = i11;
            this.seatText = textDTO;
            this.seatBackgroundColor = seatBackgroundColor;
            this.seatBackrestColor = str;
            this.cell = cell;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatTypeV2VI)) {
                return false;
            }
            SeatTypeV2VI seatTypeV2VI = (SeatTypeV2VI) other;
            return this.id == seatTypeV2VI.id && Intrinsics.d(this.seatText, seatTypeV2VI.seatText) && Intrinsics.d(this.seatBackgroundColor, seatTypeV2VI.seatBackgroundColor) && Intrinsics.d(this.seatBackrestColor, seatTypeV2VI.seatBackrestColor) && Intrinsics.d(this.cell, seatTypeV2VI.cell);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getSeatBackgroundColor() {
            return this.seatBackgroundColor;
        }

        public final String getSeatBackrestColor() {
            return this.seatBackrestColor;
        }

        public final TextDTO getSeatText() {
            return this.seatText;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            TextDTO textDTO = this.seatText;
            int a11 = g.a((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.seatBackgroundColor);
            String str = this.seatBackrestColor;
            return this.cell.hashCode() + ((a11 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.seatText;
            String str = this.seatBackgroundColor;
            String str2 = this.seatBackrestColor;
            CellDTO cellDTO = this.cell;
            StringBuilder b11 = C4055a.b(textDTO, "SeatTypeV2VI(id=", ", seatText=", ", seatBackgroundColor=", i11);
            a.h(b11, str, ", seatBackrestColor=", str2, ", cell=");
            b11.append(cellDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    public FlightSeatsLegendV2VI(long j11, @NotNull TextDTO title, @NotNull List<SeatTypeV2VI> seatTypes, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        this.id = j11;
        this.title = title;
        this.seatTypes = seatTypes;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsLegendV2VI)) {
            return false;
        }
        FlightSeatsLegendV2VI flightSeatsLegendV2VI = (FlightSeatsLegendV2VI) other;
        return this.id == flightSeatsLegendV2VI.id && Intrinsics.d(this.title, flightSeatsLegendV2VI.title) && Intrinsics.d(this.seatTypes, flightSeatsLegendV2VI.seatTypes) && Intrinsics.d(this.viewEvent, flightSeatsLegendV2VI.viewEvent);
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
    public final List<SeatTypeV2VI> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(b.a(this.title, Long.hashCode(this.id) * 31, 31), 31, this.seatTypes);
        t tVar = this.viewEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<SeatTypeV2VI> list = this.seatTypes;
        t tVar = this.viewEvent;
        StringBuilder b11 = TY.a.b("FlightSeatsLegendV2VI(id=", j11, ", title=", textDTO);
        Ak.b.h(b11, ", seatTypes=", list, ", viewEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}
