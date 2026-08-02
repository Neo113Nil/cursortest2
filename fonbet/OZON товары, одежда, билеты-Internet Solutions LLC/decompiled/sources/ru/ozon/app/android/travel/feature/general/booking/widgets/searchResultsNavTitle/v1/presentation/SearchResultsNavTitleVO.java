package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.presentation;

import B90.C2619v;
import Bl.C2639a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v1/presentation/SearchResultsNavTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "departure", "arrival", "symbolBetween", "subtitle", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDeparture", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getArrival", "getSymbolBetween", "getSubtitle", "LWZ/t;", "getViewEvent", "()LWZ/t;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchResultsNavTitleVO implements c {

    @NotNull
    private final TextAtom arrival;

    @NotNull
    private final TextAtom departure;
    private final long id;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom symbolBetween;
    private final t viewEvent;

    public SearchResultsNavTitleVO(long j11, @NotNull TextAtom departure, @NotNull TextAtom arrival, @NotNull TextAtom symbolBetween, @NotNull TextAtom subtitle, t tVar) {
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        Intrinsics.checkNotNullParameter(symbolBetween, "symbolBetween");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.departure = departure;
        this.arrival = arrival;
        this.symbolBetween = symbolBetween;
        this.subtitle = subtitle;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultsNavTitleVO)) {
            return false;
        }
        SearchResultsNavTitleVO searchResultsNavTitleVO = (SearchResultsNavTitleVO) other;
        return this.id == searchResultsNavTitleVO.id && Intrinsics.d(this.departure, searchResultsNavTitleVO.departure) && Intrinsics.d(this.arrival, searchResultsNavTitleVO.arrival) && Intrinsics.d(this.symbolBetween, searchResultsNavTitleVO.symbolBetween) && Intrinsics.d(this.subtitle, searchResultsNavTitleVO.subtitle) && Intrinsics.d(this.viewEvent, searchResultsNavTitleVO.viewEvent);
    }

    @NotNull
    public final TextAtom getArrival() {
        return this.arrival;
    }

    @NotNull
    public final TextAtom getDeparture() {
        return this.departure;
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
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getSymbolBetween() {
        return this.symbolBetween;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.departure), 31, this.arrival), 31, this.symbolBetween), 31, this.subtitle);
        t tVar = this.viewEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.departure;
        TextAtom textAtom2 = this.arrival;
        TextAtom textAtom3 = this.symbolBetween;
        TextAtom textAtom4 = this.subtitle;
        t tVar = this.viewEvent;
        StringBuilder c11 = C2639a.c("SearchResultsNavTitleVO(id=", j11, ", departure=", textAtom);
        C2639a.e(", arrival=", ", symbolBetween=", c11, textAtom2, textAtom3);
        c11.append(", subtitle=");
        c11.append(textAtom4);
        c11.append(", viewEvent=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
