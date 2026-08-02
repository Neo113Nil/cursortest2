package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header;

import D3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockVI;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "subtitleName", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "literalsRow", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockVI;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getSubtitleName", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "getLiteralsRow", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeV2HeaderBlockVI {
    private final FlightSchemeContentRowV2 literalsRow;
    private final TextDTO subtitle;
    private final String subtitleName;
    private final TextDTO title;

    public FlightSeatsSchemeV2HeaderBlockVI(TextDTO textDTO, TextDTO textDTO2, String str, FlightSchemeContentRowV2 flightSchemeContentRowV2) {
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.subtitleName = str;
        this.literalsRow = flightSchemeContentRowV2;
    }

    public static /* synthetic */ FlightSeatsSchemeV2HeaderBlockVI copy$default(FlightSeatsSchemeV2HeaderBlockVI flightSeatsSchemeV2HeaderBlockVI, TextDTO textDTO, TextDTO textDTO2, String str, FlightSchemeContentRowV2 flightSchemeContentRowV2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = flightSeatsSchemeV2HeaderBlockVI.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = flightSeatsSchemeV2HeaderBlockVI.subtitle;
        }
        if ((i11 & 4) != 0) {
            str = flightSeatsSchemeV2HeaderBlockVI.subtitleName;
        }
        if ((i11 & 8) != 0) {
            flightSchemeContentRowV2 = flightSeatsSchemeV2HeaderBlockVI.literalsRow;
        }
        return flightSeatsSchemeV2HeaderBlockVI.copy(textDTO, textDTO2, str, flightSchemeContentRowV2);
    }

    @NotNull
    public final FlightSeatsSchemeV2HeaderBlockVI copy(TextDTO title, TextDTO subtitle, String subtitleName, FlightSchemeContentRowV2 literalsRow) {
        return new FlightSeatsSchemeV2HeaderBlockVI(title, subtitle, subtitleName, literalsRow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeV2HeaderBlockVI)) {
            return false;
        }
        FlightSeatsSchemeV2HeaderBlockVI flightSeatsSchemeV2HeaderBlockVI = (FlightSeatsSchemeV2HeaderBlockVI) other;
        return Intrinsics.d(this.title, flightSeatsSchemeV2HeaderBlockVI.title) && Intrinsics.d(this.subtitle, flightSeatsSchemeV2HeaderBlockVI.subtitle) && Intrinsics.d(this.subtitleName, flightSeatsSchemeV2HeaderBlockVI.subtitleName) && Intrinsics.d(this.literalsRow, flightSeatsSchemeV2HeaderBlockVI.literalsRow);
    }

    public final FlightSchemeContentRowV2 getLiteralsRow() {
        return this.literalsRow;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleName() {
        return this.subtitleName;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        String str = this.subtitleName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        FlightSchemeContentRowV2 flightSchemeContentRowV2 = this.literalsRow;
        return hashCode3 + (flightSchemeContentRowV2 != null ? flightSchemeContentRowV2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        String str = this.subtitleName;
        FlightSchemeContentRowV2 flightSchemeContentRowV2 = this.literalsRow;
        StringBuilder g10 = g.g("FlightSeatsSchemeV2HeaderBlockVI(title=", textDTO, ", subtitle=", textDTO2, ", subtitleName=");
        g10.append(str);
        g10.append(", literalsRow=");
        g10.append(flightSchemeContentRowV2);
        g10.append(")");
        return g10.toString();
    }
}
