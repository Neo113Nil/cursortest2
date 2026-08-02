package ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.data;

import J.d;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/data/ExtraLuggageDTO;", "", "flightRoute", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "luggageItems", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getFlightRoute", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getLuggageItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ExtraLuggageDTO {
    public static final int $stable = 8;

    @NotNull
    private final TextAtom flightRoute;

    @NotNull
    private final List<TextAtom> luggageItems;

    public ExtraLuggageDTO(@NotNull TextAtom flightRoute, @NotNull List<TextAtom> luggageItems) {
        Intrinsics.checkNotNullParameter(flightRoute, "flightRoute");
        Intrinsics.checkNotNullParameter(luggageItems, "luggageItems");
        this.flightRoute = flightRoute;
        this.luggageItems = luggageItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtraLuggageDTO copy$default(ExtraLuggageDTO extraLuggageDTO, TextAtom textAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = extraLuggageDTO.flightRoute;
        }
        if ((i11 & 2) != 0) {
            list = extraLuggageDTO.luggageItems;
        }
        return extraLuggageDTO.copy(textAtom, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getFlightRoute() {
        return this.flightRoute;
    }

    @NotNull
    public final List<TextAtom> component2() {
        return this.luggageItems;
    }

    @NotNull
    public final ExtraLuggageDTO copy(@NotNull TextAtom flightRoute, @NotNull List<TextAtom> luggageItems) {
        Intrinsics.checkNotNullParameter(flightRoute, "flightRoute");
        Intrinsics.checkNotNullParameter(luggageItems, "luggageItems");
        return new ExtraLuggageDTO(flightRoute, luggageItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraLuggageDTO)) {
            return false;
        }
        ExtraLuggageDTO extraLuggageDTO = (ExtraLuggageDTO) other;
        return Intrinsics.d(this.flightRoute, extraLuggageDTO.flightRoute) && Intrinsics.d(this.luggageItems, extraLuggageDTO.luggageItems);
    }

    @NotNull
    public final TextAtom getFlightRoute() {
        return this.flightRoute;
    }

    @NotNull
    public final List<TextAtom> getLuggageItems() {
        return this.luggageItems;
    }

    public int hashCode() {
        return this.luggageItems.hashCode() + (this.flightRoute.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return d.c("ExtraLuggageDTO(flightRoute=", this.flightRoute, ", luggageItems=", this.luggageItems, ")");
    }
}
