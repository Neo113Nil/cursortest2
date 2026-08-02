package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend;

import B90.C2618u;
import Ih.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "selectionIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "openLegendDetailsAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "seatTypes", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO$SeatTypeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getSelectionIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getOpenLegendDetailsAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSeatTypes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SeatTypeDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MobileLegendBlockDTO {
    public static final int $stable = 8;

    @NotNull
    private final Badge badge;

    @NotNull
    private final AtomActionDTO openLegendDetailsAction;

    @NotNull
    private final List<SeatTypeDTO> seatTypes;

    @NotNull
    private final Icon selectionIcon;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO$SeatTypeDTO;", "", "color", "", "typeDescription", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getColor", "()Ljava/lang/String;", "getTypeDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatTypeDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final String color;

        @NotNull
        private final TextAtom typeDescription;

        public SeatTypeDTO(@NotNull String color, @NotNull TextAtom typeDescription) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(typeDescription, "typeDescription");
            this.color = color;
            this.typeDescription = typeDescription;
        }

        public static /* synthetic */ SeatTypeDTO copy$default(SeatTypeDTO seatTypeDTO, String str, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = seatTypeDTO.color;
            }
            if ((i11 & 2) != 0) {
                textAtom = seatTypeDTO.typeDescription;
            }
            return seatTypeDTO.copy(str, textAtom);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTypeDescription() {
            return this.typeDescription;
        }

        @NotNull
        public final SeatTypeDTO copy(@NotNull String color, @NotNull TextAtom typeDescription) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(typeDescription, "typeDescription");
            return new SeatTypeDTO(color, typeDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatTypeDTO)) {
                return false;
            }
            SeatTypeDTO seatTypeDTO = (SeatTypeDTO) other;
            return Intrinsics.d(this.color, seatTypeDTO.color) && Intrinsics.d(this.typeDescription, seatTypeDTO.typeDescription);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final TextAtom getTypeDescription() {
            return this.typeDescription;
        }

        public int hashCode() {
            return this.typeDescription.hashCode() + (this.color.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SeatTypeDTO(color=" + this.color + ", typeDescription=" + this.typeDescription + ")";
        }
    }

    public MobileLegendBlockDTO(@NotNull TextAtom title, @NotNull Badge badge, @NotNull Icon selectionIcon, @NotNull AtomActionDTO openLegendDetailsAction, @NotNull List<SeatTypeDTO> seatTypes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(selectionIcon, "selectionIcon");
        Intrinsics.checkNotNullParameter(openLegendDetailsAction, "openLegendDetailsAction");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        this.title = title;
        this.badge = badge;
        this.selectionIcon = selectionIcon;
        this.openLegendDetailsAction = openLegendDetailsAction;
        this.seatTypes = seatTypes;
    }

    public static /* synthetic */ MobileLegendBlockDTO copy$default(MobileLegendBlockDTO mobileLegendBlockDTO, TextAtom textAtom, Badge badge, Icon icon, AtomActionDTO atomActionDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = mobileLegendBlockDTO.title;
        }
        if ((i11 & 2) != 0) {
            badge = mobileLegendBlockDTO.badge;
        }
        if ((i11 & 4) != 0) {
            icon = mobileLegendBlockDTO.selectionIcon;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = mobileLegendBlockDTO.openLegendDetailsAction;
        }
        if ((i11 & 16) != 0) {
            list = mobileLegendBlockDTO.seatTypes;
        }
        List list2 = list;
        Icon icon2 = icon;
        return mobileLegendBlockDTO.copy(textAtom, badge, icon2, atomActionDTO, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Icon getSelectionIcon() {
        return this.selectionIcon;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getOpenLegendDetailsAction() {
        return this.openLegendDetailsAction;
    }

    @NotNull
    public final List<SeatTypeDTO> component5() {
        return this.seatTypes;
    }

    @NotNull
    public final MobileLegendBlockDTO copy(@NotNull TextAtom title, @NotNull Badge badge, @NotNull Icon selectionIcon, @NotNull AtomActionDTO openLegendDetailsAction, @NotNull List<SeatTypeDTO> seatTypes) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(selectionIcon, "selectionIcon");
        Intrinsics.checkNotNullParameter(openLegendDetailsAction, "openLegendDetailsAction");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        return new MobileLegendBlockDTO(title, badge, selectionIcon, openLegendDetailsAction, seatTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileLegendBlockDTO)) {
            return false;
        }
        MobileLegendBlockDTO mobileLegendBlockDTO = (MobileLegendBlockDTO) other;
        return Intrinsics.d(this.title, mobileLegendBlockDTO.title) && Intrinsics.d(this.badge, mobileLegendBlockDTO.badge) && Intrinsics.d(this.selectionIcon, mobileLegendBlockDTO.selectionIcon) && Intrinsics.d(this.openLegendDetailsAction, mobileLegendBlockDTO.openLegendDetailsAction) && Intrinsics.d(this.seatTypes, mobileLegendBlockDTO.seatTypes);
    }

    @NotNull
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final AtomActionDTO getOpenLegendDetailsAction() {
        return this.openLegendDetailsAction;
    }

    @NotNull
    public final List<SeatTypeDTO> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final Icon getSelectionIcon() {
        return this.selectionIcon;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.seatTypes.hashCode() + a.b(this.openLegendDetailsAction, Lc.a.a(this.selectionIcon, (this.badge.hashCode() + (this.title.hashCode() * 31)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        Badge badge = this.badge;
        Icon icon = this.selectionIcon;
        AtomActionDTO atomActionDTO = this.openLegendDetailsAction;
        List<SeatTypeDTO> list = this.seatTypes;
        StringBuilder sb2 = new StringBuilder("MobileLegendBlockDTO(title=");
        sb2.append(textAtom);
        sb2.append(", badge=");
        sb2.append(badge);
        sb2.append(", selectionIcon=");
        sb2.append(icon);
        sb2.append(", openLegendDetailsAction=");
        sb2.append(atomActionDTO);
        sb2.append(", seatTypes=");
        return C2618u.h(sb2, list, ")");
    }

    public MobileLegendBlockDTO(TextAtom textAtom, Badge badge, Icon icon, AtomActionDTO atomActionDTO, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, badge, icon, atomActionDTO, (i11 & 16) != 0 ? K.f71697a : list);
    }
}
