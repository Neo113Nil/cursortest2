package ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.presentation;

import B90.C2619v;
import Bl.C2639a;
import D3.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/presentation/ExtraLuggageVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "flightRoute", "", "luggageItems", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getFlightRoute", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getLuggageItems", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ExtraLuggageVO {

    @NotNull
    private final TextAtom flightRoute;
    private final long id;

    @NotNull
    private final List<TextAtom> luggageItems;

    public ExtraLuggageVO(long j11, @NotNull TextAtom flightRoute, @NotNull List<TextAtom> luggageItems) {
        Intrinsics.checkNotNullParameter(flightRoute, "flightRoute");
        Intrinsics.checkNotNullParameter(luggageItems, "luggageItems");
        this.id = j11;
        this.flightRoute = flightRoute;
        this.luggageItems = luggageItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraLuggageVO)) {
            return false;
        }
        ExtraLuggageVO extraLuggageVO = (ExtraLuggageVO) other;
        return this.id == extraLuggageVO.id && Intrinsics.d(this.flightRoute, extraLuggageVO.flightRoute) && Intrinsics.d(this.luggageItems, extraLuggageVO.luggageItems);
    }

    @NotNull
    public final TextAtom getFlightRoute() {
        return this.flightRoute;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final List<TextAtom> getLuggageItems() {
        return this.luggageItems;
    }

    public int hashCode() {
        return this.luggageItems.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.flightRoute);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.flightRoute;
        return h.c(C2639a.c("ExtraLuggageVO(id=", j11, ", flightRoute=", textAtom), ", luggageItems=", this.luggageItems, ")");
    }
}
