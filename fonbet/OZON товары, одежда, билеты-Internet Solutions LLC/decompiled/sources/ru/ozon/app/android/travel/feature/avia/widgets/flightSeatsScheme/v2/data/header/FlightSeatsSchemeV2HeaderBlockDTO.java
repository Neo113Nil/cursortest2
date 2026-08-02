package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.header;

import Lc.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeV2HeaderBlockDTO {
    public static final int $stable = 0;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public FlightSeatsSchemeV2HeaderBlockDTO(@NotNull TextDTO title, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = textDTO;
    }

    public static /* synthetic */ FlightSeatsSchemeV2HeaderBlockDTO copy$default(FlightSeatsSchemeV2HeaderBlockDTO flightSeatsSchemeV2HeaderBlockDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = flightSeatsSchemeV2HeaderBlockDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = flightSeatsSchemeV2HeaderBlockDTO.subtitle;
        }
        return flightSeatsSchemeV2HeaderBlockDTO.copy(textDTO, textDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final FlightSeatsSchemeV2HeaderBlockDTO copy(@NotNull TextDTO title, TextDTO subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new FlightSeatsSchemeV2HeaderBlockDTO(title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeV2HeaderBlockDTO)) {
            return false;
        }
        FlightSeatsSchemeV2HeaderBlockDTO flightSeatsSchemeV2HeaderBlockDTO = (FlightSeatsSchemeV2HeaderBlockDTO) other;
        return Intrinsics.d(this.title, flightSeatsSchemeV2HeaderBlockDTO.title) && Intrinsics.d(this.subtitle, flightSeatsSchemeV2HeaderBlockDTO.subtitle);
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return a.b("FlightSeatsSchemeV2HeaderBlockDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
    }
}
