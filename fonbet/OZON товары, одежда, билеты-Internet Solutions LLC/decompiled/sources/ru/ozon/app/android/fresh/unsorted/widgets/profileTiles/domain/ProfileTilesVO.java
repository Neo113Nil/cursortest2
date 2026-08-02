package ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.domain;

import B6.b;
import G.g;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002$%B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Purchases;", "purchases", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Bonuses;", "bonuses", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Purchases;Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Bonuses;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Purchases;", "getPurchases", "()Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Purchases;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Bonuses;", "getBonuses", "()Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Bonuses;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Purchases", "Bonuses", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProfileTilesVO implements c {

    @NotNull
    private final Bonuses bonuses;
    private final long id;

    @NotNull
    private final Purchases purchases;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b#\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Bonuses;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "cornerRadius", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getImage", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Ljava/lang/Integer;", "getCornerRadius", "()Ljava/lang/Integer;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bonuses {
        private final AtomAction action;
        private final String backgroundColor;

        @NotNull
        private final List<BadgeDTO> badges;
        private final Integer cornerRadius;

        @NotNull
        private final String image;

        @NotNull
        private final TextDTO title;

        public Bonuses(@NotNull TextDTO title, @NotNull String image, @NotNull List<BadgeDTO> badges, Integer num, String str, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(badges, "badges");
            this.title = title;
            this.image = image;
            this.badges = badges;
            this.cornerRadius = num;
            this.backgroundColor = str;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bonuses)) {
                return false;
            }
            Bonuses bonuses = (Bonuses) other;
            return Intrinsics.d(this.title, bonuses.title) && Intrinsics.d(this.image, bonuses.image) && Intrinsics.d(this.badges, bonuses.badges) && Intrinsics.d(this.cornerRadius, bonuses.cornerRadius) && Intrinsics.d(this.backgroundColor, bonuses.backgroundColor) && Intrinsics.d(this.action, bonuses.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = g.b(g.a(this.title.hashCode() * 31, 31, this.image), 31, this.badges);
            Integer num = this.cornerRadius;
            int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            String str = this.image;
            List<BadgeDTO> list = this.badges;
            Integer num = this.cornerRadius;
            String str2 = this.backgroundColor;
            AtomAction atomAction = this.action;
            StringBuilder f7 = D3.g.f("Bonuses(title=", textDTO, ", image=", str, ", badges=");
            f7.append(list);
            f7.append(", cornerRadius=");
            f7.append(num);
            f7.append(", backgroundColor=");
            f7.append(str2);
            f7.append(", action=");
            f7.append(atomAction);
            f7.append(")");
            return f7.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Purchases;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "hasPurchases", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "productMedia", "", "cornerRadius", "", "backgroundColor", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tagButton", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "getHasPurchases", "()Z", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "getProductMedia", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "Ljava/lang/Integer;", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Purchases {
        private final AtomAction action;
        private final String backgroundColor;
        private final Integer cornerRadius;
        private final boolean hasPurchases;

        @NotNull
        private final ProductMediaVO productMedia;
        private final TagButtonDTO tagButton;

        @NotNull
        private final TextDTO title;

        public Purchases(@NotNull TextDTO title, boolean z11, @NotNull ProductMediaVO productMedia, Integer num, String str, TagButtonDTO tagButtonDTO, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(productMedia, "productMedia");
            this.title = title;
            this.hasPurchases = z11;
            this.productMedia = productMedia;
            this.cornerRadius = num;
            this.backgroundColor = str;
            this.tagButton = tagButtonDTO;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Purchases)) {
                return false;
            }
            Purchases purchases = (Purchases) other;
            return Intrinsics.d(this.title, purchases.title) && this.hasPurchases == purchases.hasPurchases && Intrinsics.d(this.productMedia, purchases.productMedia) && Intrinsics.d(this.cornerRadius, purchases.cornerRadius) && Intrinsics.d(this.backgroundColor, purchases.backgroundColor) && Intrinsics.d(this.tagButton, purchases.tagButton) && Intrinsics.d(this.action, purchases.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        public final boolean getHasPurchases() {
            return this.hasPurchases;
        }

        @NotNull
        public final ProductMediaVO getProductMedia() {
            return this.productMedia;
        }

        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = (this.productMedia.hashCode() + C3532b.a(this.title.hashCode() * 31, 31, this.hasPurchases)) * 31;
            Integer num = this.cornerRadius;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TagButtonDTO tagButtonDTO = this.tagButton;
            int hashCode4 = (hashCode3 + (tagButtonDTO == null ? 0 : tagButtonDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode4 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            boolean z11 = this.hasPurchases;
            ProductMediaVO productMediaVO = this.productMedia;
            Integer num = this.cornerRadius;
            String str = this.backgroundColor;
            TagButtonDTO tagButtonDTO = this.tagButton;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("Purchases(title=");
            sb2.append(textDTO);
            sb2.append(", hasPurchases=");
            sb2.append(z11);
            sb2.append(", productMedia=");
            sb2.append(productMediaVO);
            sb2.append(", cornerRadius=");
            sb2.append(num);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", tagButton=");
            sb2.append(tagButtonDTO);
            sb2.append(", action=");
            return b.b(sb2, atomAction, ")");
        }
    }

    public ProfileTilesVO(long j11, @NotNull Purchases purchases, @NotNull Bonuses bonuses, t tVar) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        this.id = j11;
        this.purchases = purchases;
        this.bonuses = bonuses;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileTilesVO)) {
            return false;
        }
        ProfileTilesVO profileTilesVO = (ProfileTilesVO) other;
        return this.id == profileTilesVO.id && Intrinsics.d(this.purchases, profileTilesVO.purchases) && Intrinsics.d(this.bonuses, profileTilesVO.bonuses) && Intrinsics.d(this.tokenizedEvent, profileTilesVO.tokenizedEvent);
    }

    @NotNull
    public final Bonuses getBonuses() {
        return this.bonuses;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Purchases getPurchases() {
        return this.purchases;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.bonuses.hashCode() + ((this.purchases.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProfileTilesVO(id=" + this.id + ", purchases=" + this.purchases + ", bonuses=" + this.bonuses + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
