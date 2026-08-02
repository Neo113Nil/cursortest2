package ru.ozon.app.android.pdp.widgets.selectSeller.presentation;

import El.C2971a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001@Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO$Rating;", "rating", "subtitle", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "favoriteButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "chatButton", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO$Rating;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO$Rating;", "getRating", "()Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO$Rating;", "getSubtitle", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "getFavoriteButton", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getChatButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "scrollWidgetKey", "Rating", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectSellerVO implements c {
    private final AtomAction action;
    private final String backgroundColor;
    private final IconButtonV3DTO chatButton;
    private final SisBrandFavoriteButton favoriteButton;

    @NotNull
    private final IconDTO icon;
    private final long id;
    private final Rating rating;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO$Rating;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rating {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO title;

        public Rating(@NotNull IconDTO icon, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rating)) {
                return false;
            }
            Rating rating = (Rating) other;
            return Intrinsics.d(this.icon, rating.icon) && Intrinsics.d(this.title, rating.title);
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Rating(icon=" + this.icon + ", title=" + this.title + ")";
        }
    }

    public SelectSellerVO(long j11, @NotNull IconDTO icon, @NotNull TextDTO title, Rating rating, TextDTO textDTO, SisBrandFavoriteButton sisBrandFavoriteButton, IconButtonV3DTO iconButtonV3DTO, String str, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.icon = icon;
        this.title = title;
        this.rating = rating;
        this.subtitle = textDTO;
        this.favoriteButton = sisBrandFavoriteButton;
        this.chatButton = iconButtonV3DTO;
        this.backgroundColor = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectSellerVO)) {
            return false;
        }
        SelectSellerVO selectSellerVO = (SelectSellerVO) other;
        return this.id == selectSellerVO.id && Intrinsics.d(this.icon, selectSellerVO.icon) && Intrinsics.d(this.title, selectSellerVO.title) && Intrinsics.d(this.rating, selectSellerVO.rating) && Intrinsics.d(this.subtitle, selectSellerVO.subtitle) && Intrinsics.d(this.favoriteButton, selectSellerVO.favoriteButton) && Intrinsics.d(this.chatButton, selectSellerVO.chatButton) && Intrinsics.d(this.backgroundColor, selectSellerVO.backgroundColor) && Intrinsics.d(this.action, selectSellerVO.action) && Intrinsics.d(this.tokenizedEvent, selectSellerVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconButtonV3DTO getChatButton() {
        return this.chatButton;
    }

    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Rating getRating() {
        return this.rating;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf((int) getId());
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, C2971a.a(this.icon, Long.hashCode(this.id) * 31, 31), 31);
        Rating rating = this.rating;
        int hashCode = (a11 + (rating == null ? 0 : rating.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
        int hashCode3 = (hashCode2 + (sisBrandFavoriteButton == null ? 0 : sisBrandFavoriteButton.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.chatButton;
        int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.title;
        Rating rating = this.rating;
        TextDTO textDTO2 = this.subtitle;
        SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
        IconButtonV3DTO iconButtonV3DTO = this.chatButton;
        String str = this.backgroundColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = D40.c.b("SelectSellerVO(id=", j11, ", icon=", iconDTO);
        b11.append(", title=");
        b11.append(textDTO);
        b11.append(", rating=");
        b11.append(rating);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", favoriteButton=");
        b11.append(sisBrandFavoriteButton);
        b11.append(", chatButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", backgroundColor=");
        b11.append(str);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", b11, atomAction);
        b11.append(")");
        return b11.toString();
    }
}
