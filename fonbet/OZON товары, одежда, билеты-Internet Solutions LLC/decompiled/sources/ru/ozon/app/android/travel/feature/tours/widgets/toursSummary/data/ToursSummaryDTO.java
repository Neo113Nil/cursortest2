package ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.data;

import Bl.b;
import G.g;
import J.d;
import Pk0.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/data/ToursSummaryDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "logoUrl", "", "payUntilBadge", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "infoBlocks", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/data/ToursSummaryDTO$InfoBlock;", "showPayUntilBadgeSkeleton", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;Ljava/util/List;Z)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getLogoUrl", "()Ljava/lang/String;", "getPayUntilBadge", "()Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "getInfoBlocks", "()Ljava/util/List;", "getShowPayUntilBadgeSkeleton", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "InfoBlock", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToursSummaryDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<InfoBlock> infoBlocks;
    private final String logoUrl;
    private final TimerDTO payUntilBadge;
    private final boolean showPayUntilBadgeSkeleton;
    private final TextAtom title;

    public ToursSummaryDTO(TextAtom textAtom, String str, TimerDTO timerDTO, @NotNull List<InfoBlock> infoBlocks, boolean z11) {
        Intrinsics.checkNotNullParameter(infoBlocks, "infoBlocks");
        this.title = textAtom;
        this.logoUrl = str;
        this.payUntilBadge = timerDTO;
        this.infoBlocks = infoBlocks;
        this.showPayUntilBadgeSkeleton = z11;
    }

    public static /* synthetic */ ToursSummaryDTO copy$default(ToursSummaryDTO toursSummaryDTO, TextAtom textAtom, String str, TimerDTO timerDTO, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = toursSummaryDTO.title;
        }
        if ((i11 & 2) != 0) {
            str = toursSummaryDTO.logoUrl;
        }
        if ((i11 & 4) != 0) {
            timerDTO = toursSummaryDTO.payUntilBadge;
        }
        if ((i11 & 8) != 0) {
            list = toursSummaryDTO.infoBlocks;
        }
        if ((i11 & 16) != 0) {
            z11 = toursSummaryDTO.showPayUntilBadgeSkeleton;
        }
        boolean z12 = z11;
        TimerDTO timerDTO2 = timerDTO;
        return toursSummaryDTO.copy(textAtom, str, timerDTO2, list, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final TimerDTO getPayUntilBadge() {
        return this.payUntilBadge;
    }

    @NotNull
    public final List<InfoBlock> component4() {
        return this.infoBlocks;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowPayUntilBadgeSkeleton() {
        return this.showPayUntilBadgeSkeleton;
    }

    @NotNull
    public final ToursSummaryDTO copy(TextAtom title, String logoUrl, TimerDTO payUntilBadge, @NotNull List<InfoBlock> infoBlocks, boolean showPayUntilBadgeSkeleton) {
        Intrinsics.checkNotNullParameter(infoBlocks, "infoBlocks");
        return new ToursSummaryDTO(title, logoUrl, payUntilBadge, infoBlocks, showPayUntilBadgeSkeleton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursSummaryDTO)) {
            return false;
        }
        ToursSummaryDTO toursSummaryDTO = (ToursSummaryDTO) other;
        return Intrinsics.d(this.title, toursSummaryDTO.title) && Intrinsics.d(this.logoUrl, toursSummaryDTO.logoUrl) && Intrinsics.d(this.payUntilBadge, toursSummaryDTO.payUntilBadge) && Intrinsics.d(this.infoBlocks, toursSummaryDTO.infoBlocks) && this.showPayUntilBadgeSkeleton == toursSummaryDTO.showPayUntilBadgeSkeleton;
    }

    @NotNull
    public final List<InfoBlock> getInfoBlocks() {
        return this.infoBlocks;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final TimerDTO getPayUntilBadge() {
        return this.payUntilBadge;
    }

    public final boolean getShowPayUntilBadgeSkeleton() {
        return this.showPayUntilBadgeSkeleton;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        String str = this.logoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TimerDTO timerDTO = this.payUntilBadge;
        return Boolean.hashCode(this.showPayUntilBadgeSkeleton) + g.b((hashCode2 + (timerDTO != null ? timerDTO.hashCode() : 0)) * 31, 31, this.infoBlocks);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        String str = this.logoUrl;
        TimerDTO timerDTO = this.payUntilBadge;
        List<InfoBlock> list = this.infoBlocks;
        boolean z11 = this.showPayUntilBadgeSkeleton;
        StringBuilder d11 = b.d("ToursSummaryDTO(title=", ", logoUrl=", str, ", payUntilBadge=", textAtom);
        d11.append(timerDTO);
        d11.append(", infoBlocks=");
        d11.append(list);
        d11.append(", showPayUntilBadgeSkeleton=");
        return a.a(")", d11, z11);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/data/ToursSummaryDTO$InfoBlock;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "items", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfoBlock {
        public static final int $stable = 8;

        @NotNull
        private final List<AtomDTO> items;
        private final TextAtom title;

        /* JADX WARN: Multi-variable type inference failed */
        public InfoBlock(TextAtom textAtom, @NotNull List<? extends AtomDTO> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.title = textAtom;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InfoBlock copy$default(InfoBlock infoBlock, TextAtom textAtom, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = infoBlock.title;
            }
            if ((i11 & 2) != 0) {
                list = infoBlock.items;
            }
            return infoBlock.copy(textAtom, list);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final List<AtomDTO> component2() {
            return this.items;
        }

        @NotNull
        public final InfoBlock copy(TextAtom title, @NotNull List<? extends AtomDTO> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new InfoBlock(title, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoBlock)) {
                return false;
            }
            InfoBlock infoBlock = (InfoBlock) other;
            return Intrinsics.d(this.title, infoBlock.title) && Intrinsics.d(this.items, infoBlock.items);
        }

        @NotNull
        public final List<AtomDTO> getItems() {
            return this.items;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextAtom textAtom = this.title;
            return this.items.hashCode() + ((textAtom == null ? 0 : textAtom.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return d.c("InfoBlock(title=", this.title, ", items=", this.items, ")");
        }

        public InfoBlock(TextAtom textAtom, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textAtom, (i11 & 2) != 0 ? K.f71697a : list);
        }
    }

    public ToursSummaryDTO(TextAtom textAtom, String str, TimerDTO timerDTO, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, str, timerDTO, (i11 & 8) != 0 ? K.f71697a : list, (i11 & 16) != 0 ? false : z11);
    }
}
