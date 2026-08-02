package ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation;

import D3.g;
import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001'B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO$CardItemVO;", "leftCard", "rightCard", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO$CardItemVO;Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO$CardItemVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO$CardItemVO;", "getLeftCard", "()Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO$CardItemVO;", "getRightCard", "LWZ/t;", "getViewEvent", "()LWZ/t;", "CardItemVO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportBenefitsBannerVO implements c {
    private final long id;

    @NotNull
    private final CardItemVO leftCard;

    @NotNull
    private final CardItemVO rightCard;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010\u0010¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO$CardItemVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getBackgroundColor", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardItemVO {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;

        @NotNull
        private final String backgroundColor;
        private final BadgeDTO badge;
        private final ImageDTO image;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public CardItemVO(@NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO, ImageDTO imageDTO, AtomAction atomAction, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = title;
            this.subtitle = textDTO;
            this.badge = badgeDTO;
            this.image = imageDTO;
            this.action = atomAction;
            this.backgroundColor = backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardItemVO)) {
                return false;
            }
            CardItemVO cardItemVO = (CardItemVO) other;
            return Intrinsics.d(this.title, cardItemVO.title) && Intrinsics.d(this.subtitle, cardItemVO.subtitle) && Intrinsics.d(this.badge, cardItemVO.badge) && Intrinsics.d(this.image, cardItemVO.image) && Intrinsics.d(this.action, cardItemVO.action) && Intrinsics.d(this.backgroundColor, cardItemVO.backgroundColor);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final ImageDTO getImage() {
            return this.image;
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
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            ImageDTO imageDTO = this.image;
            int hashCode4 = (hashCode3 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return this.backgroundColor.hashCode() + ((hashCode4 + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            BadgeDTO badgeDTO = this.badge;
            ImageDTO imageDTO = this.image;
            AtomAction atomAction = this.action;
            String str = this.backgroundColor;
            StringBuilder g10 = g.g("CardItemVO(title=", textDTO, ", subtitle=", textDTO2, ", badge=");
            g10.append(badgeDTO);
            g10.append(", image=");
            g10.append(imageDTO);
            g10.append(", action=");
            g10.append(atomAction);
            g10.append(", backgroundColor=");
            g10.append(str);
            g10.append(")");
            return g10.toString();
        }
    }

    public SupportBenefitsBannerVO(long j11, @NotNull TextDTO title, @NotNull CardItemVO leftCard, @NotNull CardItemVO rightCard, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(leftCard, "leftCard");
        Intrinsics.checkNotNullParameter(rightCard, "rightCard");
        this.id = j11;
        this.title = title;
        this.leftCard = leftCard;
        this.rightCard = rightCard;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportBenefitsBannerVO)) {
            return false;
        }
        SupportBenefitsBannerVO supportBenefitsBannerVO = (SupportBenefitsBannerVO) other;
        return this.id == supportBenefitsBannerVO.id && Intrinsics.d(this.title, supportBenefitsBannerVO.title) && Intrinsics.d(this.leftCard, supportBenefitsBannerVO.leftCard) && Intrinsics.d(this.rightCard, supportBenefitsBannerVO.rightCard) && Intrinsics.d(this.viewEvent, supportBenefitsBannerVO.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CardItemVO getLeftCard() {
        return this.leftCard;
    }

    @NotNull
    public final CardItemVO getRightCard() {
        return this.rightCard;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.rightCard.hashCode() + ((this.leftCard.hashCode() + b.a(this.title, Long.hashCode(this.id) * 31, 31)) * 31)) * 31;
        t tVar = this.viewEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        CardItemVO cardItemVO = this.leftCard;
        CardItemVO cardItemVO2 = this.rightCard;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("SupportBenefitsBannerVO(id=", j11, ", title=", textDTO);
        b11.append(", leftCard=");
        b11.append(cardItemVO);
        b11.append(", rightCard=");
        b11.append(cardItemVO2);
        return Lh.a.b(b11, ", viewEvent=", tVar, ")");
    }
}
