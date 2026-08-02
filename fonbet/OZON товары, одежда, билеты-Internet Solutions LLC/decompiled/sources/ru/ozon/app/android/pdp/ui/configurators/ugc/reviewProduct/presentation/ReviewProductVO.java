package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import D3.g;
import Nh.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.rating.RatingAtom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00018Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J|\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b1\u0010\u0019R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "coverImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "createdAt", "Lru/ozon/uni/atoms/data/rating/RatingAtom;", "rating", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "deeplink", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO$BadgeVO;", "badges", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getCoverImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCreatedAt", "Lru/ozon/uni/atoms/data/rating/RatingAtom;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getDeeplink", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "BadgeVO", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReviewProductVO implements c {
    private final List<BadgeVO> badges;
    private final ButtonV3Atom.SmallButton button;

    @NotNull
    private final CornerRadius cornerRadius;
    private final String coverImage;
    private final TextDTO createdAt;
    private final String deeplink;
    private final long id;

    @NotNull
    private final TextDTO name;
    private final RatingAtom rating;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO$BadgeVO;", "", "", "startMargin", "endMargin", "Lru/ozon/uni/atoms/data/AtomDTO;", "badge", "<init>", "(IILru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStartMargin", "getEndMargin", "Lru/ozon/uni/atoms/data/AtomDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/AtomDTO;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BadgeVO {
        public static final int $stable = AtomDTO.$stable;

        @NotNull
        private final AtomDTO badge;
        private final int endMargin;
        private final int startMargin;

        public BadgeVO(int i11, int i12, @NotNull AtomDTO badge) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.startMargin = i11;
            this.endMargin = i12;
            this.badge = badge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeVO)) {
                return false;
            }
            BadgeVO badgeVO = (BadgeVO) other;
            return this.startMargin == badgeVO.startMargin && this.endMargin == badgeVO.endMargin && Intrinsics.d(this.badge, badgeVO.badge);
        }

        @NotNull
        public final AtomDTO getBadge() {
            return this.badge;
        }

        public final int getEndMargin() {
            return this.endMargin;
        }

        public final int getStartMargin() {
            return this.startMargin;
        }

        public int hashCode() {
            return this.badge.hashCode() + C2454a.a(this.endMargin, Integer.hashCode(this.startMargin) * 31, 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.startMargin;
            int i12 = this.endMargin;
            AtomDTO atomDTO = this.badge;
            StringBuilder a11 = C2438a.a("BadgeVO(startMargin=", i11, ", endMargin=", ", badge=", i12);
            a11.append(atomDTO);
            a11.append(")");
            return a11.toString();
        }
    }

    public ReviewProductVO(long j11, String str, @NotNull TextDTO name, TextDTO textDTO, RatingAtom ratingAtom, ButtonV3Atom.SmallButton smallButton, String str2, List<BadgeVO> list, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.id = j11;
        this.coverImage = str;
        this.name = name;
        this.createdAt = textDTO;
        this.rating = ratingAtom;
        this.button = smallButton;
        this.deeplink = str2;
        this.badges = list;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ ReviewProductVO copy$default(ReviewProductVO reviewProductVO, long j11, String str, TextDTO textDTO, TextDTO textDTO2, RatingAtom ratingAtom, ButtonV3Atom.SmallButton smallButton, String str2, List list, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = reviewProductVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = reviewProductVO.coverImage;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            textDTO = reviewProductVO.name;
        }
        return reviewProductVO.copy(j12, str3, textDTO, (i11 & 8) != 0 ? reviewProductVO.createdAt : textDTO2, (i11 & 16) != 0 ? reviewProductVO.rating : ratingAtom, (i11 & 32) != 0 ? reviewProductVO.button : smallButton, (i11 & 64) != 0 ? reviewProductVO.deeplink : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewProductVO.badges : list, (i11 & 256) != 0 ? reviewProductVO.cornerRadius : cornerRadius);
    }

    @NotNull
    public final ReviewProductVO copy(long id2, String coverImage, @NotNull TextDTO name, TextDTO createdAt, RatingAtom rating, ButtonV3Atom.SmallButton button, String deeplink, List<BadgeVO> badges, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        return new ReviewProductVO(id2, coverImage, name, createdAt, rating, button, deeplink, badges, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewProductVO)) {
            return false;
        }
        ReviewProductVO reviewProductVO = (ReviewProductVO) other;
        return this.id == reviewProductVO.id && Intrinsics.d(this.coverImage, reviewProductVO.coverImage) && Intrinsics.d(this.name, reviewProductVO.name) && Intrinsics.d(this.createdAt, reviewProductVO.createdAt) && Intrinsics.d(this.rating, reviewProductVO.rating) && Intrinsics.d(this.button, reviewProductVO.button) && Intrinsics.d(this.deeplink, reviewProductVO.deeplink) && Intrinsics.d(this.badges, reviewProductVO.badges) && this.cornerRadius == reviewProductVO.cornerRadius;
    }

    public final List<BadgeVO> getBadges() {
        return this.badges;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.coverImage;
        int a11 = b.a(this.name, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        TextDTO textDTO = this.createdAt;
        int hashCode2 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        RatingAtom ratingAtom = this.rating;
        int hashCode3 = (hashCode2 + (ratingAtom == null ? 0 : ratingAtom.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.button;
        int hashCode4 = (hashCode3 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        String str2 = this.deeplink;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BadgeVO> list = this.badges;
        return this.cornerRadius.hashCode() + ((hashCode5 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.coverImage;
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.createdAt;
        RatingAtom ratingAtom = this.rating;
        ButtonV3Atom.SmallButton smallButton = this.button;
        String str2 = this.deeplink;
        List<BadgeVO> list = this.badges;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder c11 = C2436a.c(j11, "ReviewProductVO(id=", ", coverImage=", str);
        g.i(", name=", ", createdAt=", c11, textDTO, textDTO2);
        c11.append(", rating=");
        c11.append(ratingAtom);
        c11.append(", button=");
        c11.append(smallButton);
        a.g(", deeplink=", str2, ", badges=", c11, list);
        c11.append(", cornerRadius=");
        c11.append(cornerRadius);
        c11.append(")");
        return c11.toString();
    }
}
