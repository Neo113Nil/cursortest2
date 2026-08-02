package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data;

import El.C2971a;
import K1.G;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u0010&\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewHeaderDTO;", "", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "rating", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "additionalButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/rating/RatingDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getBadges", "()Ljava/util/List;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "getAdditionalButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewHeaderDTO {
    private final AtomActionDTO action;
    private final IconButtonDTO additionalButton;
    private final List<BadgeDTO> badges;

    @NotNull
    private final TextDTO date;

    @NotNull
    private final IconDTO image;

    @NotNull
    private final RatingDTO rating;

    @NotNull
    private final TextDTO title;

    public ReviewHeaderDTO(List<BadgeDTO> list, @NotNull RatingDTO rating, @NotNull IconDTO image, @NotNull TextDTO title, @NotNull TextDTO date, IconButtonDTO iconButtonDTO, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date, "date");
        this.badges = list;
        this.rating = rating;
        this.image = image;
        this.title = title;
        this.date = date;
        this.additionalButton = iconButtonDTO;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ ReviewHeaderDTO copy$default(ReviewHeaderDTO reviewHeaderDTO, List list, RatingDTO ratingDTO, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, IconButtonDTO iconButtonDTO, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reviewHeaderDTO.badges;
        }
        if ((i11 & 2) != 0) {
            ratingDTO = reviewHeaderDTO.rating;
        }
        if ((i11 & 4) != 0) {
            iconDTO = reviewHeaderDTO.image;
        }
        if ((i11 & 8) != 0) {
            textDTO = reviewHeaderDTO.title;
        }
        if ((i11 & 16) != 0) {
            textDTO2 = reviewHeaderDTO.date;
        }
        if ((i11 & 32) != 0) {
            iconButtonDTO = reviewHeaderDTO.additionalButton;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = reviewHeaderDTO.action;
        }
        IconButtonDTO iconButtonDTO2 = iconButtonDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        TextDTO textDTO3 = textDTO2;
        IconDTO iconDTO2 = iconDTO;
        return reviewHeaderDTO.copy(list, ratingDTO, iconDTO2, textDTO, textDTO3, iconButtonDTO2, atomActionDTO2);
    }

    public final List<BadgeDTO> component1() {
        return this.badges;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RatingDTO getRating() {
        return this.rating;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getDate() {
        return this.date;
    }

    /* renamed from: component6, reason: from getter */
    public final IconButtonDTO getAdditionalButton() {
        return this.additionalButton;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final ReviewHeaderDTO copy(List<BadgeDTO> badges, @NotNull RatingDTO rating, @NotNull IconDTO image, @NotNull TextDTO title, @NotNull TextDTO date, IconButtonDTO additionalButton, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date, "date");
        return new ReviewHeaderDTO(badges, rating, image, title, date, additionalButton, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewHeaderDTO)) {
            return false;
        }
        ReviewHeaderDTO reviewHeaderDTO = (ReviewHeaderDTO) other;
        return Intrinsics.d(this.badges, reviewHeaderDTO.badges) && Intrinsics.d(this.rating, reviewHeaderDTO.rating) && Intrinsics.d(this.image, reviewHeaderDTO.image) && Intrinsics.d(this.title, reviewHeaderDTO.title) && Intrinsics.d(this.date, reviewHeaderDTO.date) && Intrinsics.d(this.additionalButton, reviewHeaderDTO.additionalButton) && Intrinsics.d(this.action, reviewHeaderDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final IconButtonDTO getAdditionalButton() {
        return this.additionalButton;
    }

    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    @NotNull
    public final TextDTO getDate() {
        return this.date;
    }

    @NotNull
    public final IconDTO getImage() {
        return this.image;
    }

    @NotNull
    public final RatingDTO getRating() {
        return this.rating;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        List<BadgeDTO> list = this.badges;
        int a11 = b.a(this.date, b.a(this.title, C2971a.a(this.image, (this.rating.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31, 31), 31), 31);
        IconButtonDTO iconButtonDTO = this.additionalButton;
        int hashCode = (a11 + (iconButtonDTO == null ? 0 : iconButtonDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<BadgeDTO> list = this.badges;
        RatingDTO ratingDTO = this.rating;
        IconDTO iconDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.date;
        IconButtonDTO iconButtonDTO = this.additionalButton;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder sb2 = new StringBuilder("ReviewHeaderDTO(badges=");
        sb2.append(list);
        sb2.append(", rating=");
        sb2.append(ratingDTO);
        sb2.append(", image=");
        sb2.append(iconDTO);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", date=");
        sb2.append(textDTO2);
        sb2.append(", additionalButton=");
        sb2.append(iconButtonDTO);
        sb2.append(", action=");
        return G.c(sb2, atomActionDTO, ")");
    }

    public /* synthetic */ ReviewHeaderDTO(List list, RatingDTO ratingDTO, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, IconButtonDTO iconButtonDTO, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, ratingDTO, iconDTO, textDTO, textDTO2, iconButtonDTO, (i11 & 64) != 0 ? null : atomActionDTO);
    }
}
