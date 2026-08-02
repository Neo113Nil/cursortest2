package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import D40.d;
import El.C2971a;
import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewHeaderVO;", "", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "rating", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "date", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "additionalButton", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/rating/RatingDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getAdditionalButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewHeaderVO {
    private final AtomAction action;
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

    public ReviewHeaderVO(@NotNull RatingDTO rating, @NotNull IconDTO image, @NotNull TextDTO title, @NotNull TextDTO date, List<BadgeDTO> list, IconButtonDTO iconButtonDTO, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date, "date");
        this.rating = rating;
        this.image = image;
        this.title = title;
        this.date = date;
        this.badges = list;
        this.additionalButton = iconButtonDTO;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewHeaderVO)) {
            return false;
        }
        ReviewHeaderVO reviewHeaderVO = (ReviewHeaderVO) other;
        return Intrinsics.d(this.rating, reviewHeaderVO.rating) && Intrinsics.d(this.image, reviewHeaderVO.image) && Intrinsics.d(this.title, reviewHeaderVO.title) && Intrinsics.d(this.date, reviewHeaderVO.date) && Intrinsics.d(this.badges, reviewHeaderVO.badges) && Intrinsics.d(this.additionalButton, reviewHeaderVO.additionalButton) && Intrinsics.d(this.action, reviewHeaderVO.action);
    }

    public final AtomAction getAction() {
        return this.action;
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
        int a11 = b.a(this.date, b.a(this.title, C2971a.a(this.image, this.rating.hashCode() * 31, 31), 31), 31);
        List<BadgeDTO> list = this.badges;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        IconButtonDTO iconButtonDTO = this.additionalButton;
        int hashCode2 = (hashCode + (iconButtonDTO == null ? 0 : iconButtonDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        RatingDTO ratingDTO = this.rating;
        IconDTO iconDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.date;
        List<BadgeDTO> list = this.badges;
        IconButtonDTO iconButtonDTO = this.additionalButton;
        AtomAction atomAction = this.action;
        StringBuilder sb2 = new StringBuilder("ReviewHeaderVO(rating=");
        sb2.append(ratingDTO);
        sb2.append(", image=");
        sb2.append(iconDTO);
        sb2.append(", title=");
        d.e(", date=", ", badges=", sb2, textDTO, textDTO2);
        sb2.append(list);
        sb2.append(", additionalButton=");
        sb2.append(iconButtonDTO);
        sb2.append(", action=");
        return B6.b.b(sb2, atomAction, ")");
    }

    public /* synthetic */ ReviewHeaderVO(RatingDTO ratingDTO, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, List list, IconButtonDTO iconButtonDTO, AtomAction atomAction, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ratingDTO, iconDTO, textDTO, textDTO2, list, (i11 & 32) != 0 ? null : iconButtonDTO, (i11 & 64) != 0 ? null : atomAction);
    }
}
