package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation;

import G.g;
import Gl.C3124a;
import Ns.b;
import Tz.C4055a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b&\u0010\u0015¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "ageBadge", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "ageCategories", "selectedAgePosition", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;I)V", "copy", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;I)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAgeBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getAgeCategories", "()Ljava/util/List;", "getSelectedAgePosition", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TouristCountSelectorV3ChildFormVO {

    @NotNull
    private final BadgeDTO ageBadge;

    @NotNull
    private final List<ChipDTO> ageCategories;
    private final int id;
    private final int selectedAgePosition;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public TouristCountSelectorV3ChildFormVO(int i11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull BadgeDTO ageBadge, @NotNull List<ChipDTO> ageCategories, int i12) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(ageBadge, "ageBadge");
        Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
        this.id = i11;
        this.title = title;
        this.subtitle = subtitle;
        this.ageBadge = ageBadge;
        this.ageCategories = ageCategories;
        this.selectedAgePosition = i12;
    }

    public static /* synthetic */ TouristCountSelectorV3ChildFormVO copy$default(TouristCountSelectorV3ChildFormVO touristCountSelectorV3ChildFormVO, int i11, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, List list, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = touristCountSelectorV3ChildFormVO.id;
        }
        if ((i13 & 2) != 0) {
            textDTO = touristCountSelectorV3ChildFormVO.title;
        }
        if ((i13 & 4) != 0) {
            textDTO2 = touristCountSelectorV3ChildFormVO.subtitle;
        }
        if ((i13 & 8) != 0) {
            badgeDTO = touristCountSelectorV3ChildFormVO.ageBadge;
        }
        if ((i13 & 16) != 0) {
            list = touristCountSelectorV3ChildFormVO.ageCategories;
        }
        if ((i13 & 32) != 0) {
            i12 = touristCountSelectorV3ChildFormVO.selectedAgePosition;
        }
        List list2 = list;
        int i14 = i12;
        return touristCountSelectorV3ChildFormVO.copy(i11, textDTO, textDTO2, badgeDTO, list2, i14);
    }

    @NotNull
    public final TouristCountSelectorV3ChildFormVO copy(int id2, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull BadgeDTO ageBadge, @NotNull List<ChipDTO> ageCategories, int selectedAgePosition) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(ageBadge, "ageBadge");
        Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
        return new TouristCountSelectorV3ChildFormVO(id2, title, subtitle, ageBadge, ageCategories, selectedAgePosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristCountSelectorV3ChildFormVO)) {
            return false;
        }
        TouristCountSelectorV3ChildFormVO touristCountSelectorV3ChildFormVO = (TouristCountSelectorV3ChildFormVO) other;
        return this.id == touristCountSelectorV3ChildFormVO.id && Intrinsics.d(this.title, touristCountSelectorV3ChildFormVO.title) && Intrinsics.d(this.subtitle, touristCountSelectorV3ChildFormVO.subtitle) && Intrinsics.d(this.ageBadge, touristCountSelectorV3ChildFormVO.ageBadge) && Intrinsics.d(this.ageCategories, touristCountSelectorV3ChildFormVO.ageCategories) && this.selectedAgePosition == touristCountSelectorV3ChildFormVO.selectedAgePosition;
    }

    @NotNull
    public final BadgeDTO getAgeBadge() {
        return this.ageBadge;
    }

    @NotNull
    public final List<ChipDTO> getAgeCategories() {
        return this.ageCategories;
    }

    public final int getId() {
        return this.id;
    }

    public final int getSelectedAgePosition() {
        return this.selectedAgePosition;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.selectedAgePosition) + g.b(C3124a.c(this.ageBadge, b.a(this.subtitle, b.a(this.title, Integer.hashCode(this.id) * 31, 31), 31), 31), 31, this.ageCategories);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.ageBadge;
        List<ChipDTO> list = this.ageCategories;
        int i12 = this.selectedAgePosition;
        StringBuilder b11 = C4055a.b(textDTO, "TouristCountSelectorV3ChildFormVO(id=", ", title=", ", subtitle=", i11);
        b11.append(textDTO2);
        b11.append(", ageBadge=");
        b11.append(badgeDTO);
        b11.append(", ageCategories=");
        b11.append(list);
        b11.append(", selectedAgePosition=");
        b11.append(i12);
        b11.append(")");
        return b11.toString();
    }
}
