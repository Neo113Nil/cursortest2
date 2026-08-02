package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import Ak.C2436a;
import B90.C2618u;
import B90.C2619v;
import G.g;
import Ve.C4598rp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0001-BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b#\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/LegendVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "icon", "", "iconTint", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/LegendVO$SeatTypeVO;", "seatTypes", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getIcon", "Ljava/lang/Integer;", "getIconTint", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/List;", "getSeatTypes", "()Ljava/util/List;", "SeatTypeVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LegendVO implements FlightSeatsSchemeItem {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final Badge badge;

    @NotNull
    private final String icon;
    private final Integer iconTint;

    @NotNull
    private final String id;

    @NotNull
    private final List<SeatTypeVO> seatTypes;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/LegendVO$SeatTypeVO;", "", "", "color", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "<init>", "(Ljava/lang/Integer;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getColor", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatTypeVO {
        public static final int $stable = TextAtom.$stable;
        private final Integer color;

        @NotNull
        private final TextAtom description;

        public SeatTypeVO(Integer num, @NotNull TextAtom description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.color = num;
            this.description = description;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatTypeVO)) {
                return false;
            }
            SeatTypeVO seatTypeVO = (SeatTypeVO) other;
            return Intrinsics.d(this.color, seatTypeVO.color) && Intrinsics.d(this.description, seatTypeVO.description);
        }

        public final Integer getColor() {
            return this.color;
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        public int hashCode() {
            Integer num = this.color;
            return this.description.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "SeatTypeVO(color=" + this.color + ", description=" + this.description + ")";
        }
    }

    public LegendVO(@NotNull String id2, @NotNull TextAtom title, @NotNull Badge badge, @NotNull String icon, Integer num, @NotNull AtomAction action, @NotNull List<SeatTypeVO> seatTypes) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        this.id = id2;
        this.title = title;
        this.badge = badge;
        this.icon = icon;
        this.iconTint = num;
        this.action = action;
        this.seatTypes = seatTypes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegendVO)) {
            return false;
        }
        LegendVO legendVO = (LegendVO) other;
        return Intrinsics.d(this.id, legendVO.id) && Intrinsics.d(this.title, legendVO.title) && Intrinsics.d(this.badge, legendVO.badge) && Intrinsics.d(this.icon, legendVO.icon) && Intrinsics.d(this.iconTint, legendVO.iconTint) && Intrinsics.d(this.action, legendVO.action) && Intrinsics.d(this.seatTypes, legendVO.seatTypes);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final Integer getIconTint() {
        return this.iconTint;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final List<SeatTypeVO> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a((this.badge.hashCode() + C2619v.b(this.id.hashCode() * 31, 31, this.title)) * 31, 31, this.icon);
        Integer num = this.iconTint;
        return this.seatTypes.hashCode() + C4598rp.a(this.action, (a11 + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextAtom textAtom = this.title;
        Badge badge = this.badge;
        String str2 = this.icon;
        Integer num = this.iconTint;
        AtomAction atomAction = this.action;
        List<SeatTypeVO> list = this.seatTypes;
        StringBuilder d11 = C2436a.d("LegendVO(id=", str, ", title=", ", badge=", textAtom);
        d11.append(badge);
        d11.append(", icon=");
        d11.append(str2);
        d11.append(", iconTint=");
        d11.append(num);
        d11.append(", action=");
        d11.append(atomAction);
        d11.append(", seatTypes=");
        return C2618u.h(d11, list, ")");
    }
}
