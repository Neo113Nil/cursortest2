package ru.ozon.app.android.storefront.widgets.placementSlider.presentation;

import Ak.C2436a;
import An.C2439a;
import G.g;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b,\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b0\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "lightBackgroundColor", "darkBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "actionBadge", "imageURL", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "viewAction", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getLightBackgroundColor", "getDarkBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getActionBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getImageURL", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getViewAction", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerVO implements c {
    private final AtomAction action;
    private final BadgeDTO actionBadge;
    private final String darkBackgroundColor;
    private final long id;

    @NotNull
    private final String imageURL;
    private final String lightBackgroundColor;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final AtomAction viewAction;

    public BannerVO(long j11, String str, String str2, @NotNull TextDTO title, @NotNull TextDTO subtitle, BadgeDTO badgeDTO, @NotNull String imageURL, AtomAction atomAction, AtomAction atomAction2, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        this.id = j11;
        this.lightBackgroundColor = str;
        this.darkBackgroundColor = str2;
        this.title = title;
        this.subtitle = subtitle;
        this.actionBadge = badgeDTO;
        this.imageURL = imageURL;
        this.action = atomAction;
        this.viewAction = atomAction2;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerVO)) {
            return false;
        }
        BannerVO bannerVO = (BannerVO) other;
        return this.id == bannerVO.id && Intrinsics.d(this.lightBackgroundColor, bannerVO.lightBackgroundColor) && Intrinsics.d(this.darkBackgroundColor, bannerVO.darkBackgroundColor) && Intrinsics.d(this.title, bannerVO.title) && Intrinsics.d(this.subtitle, bannerVO.subtitle) && Intrinsics.d(this.actionBadge, bannerVO.actionBadge) && Intrinsics.d(this.imageURL, bannerVO.imageURL) && Intrinsics.d(this.action, bannerVO.action) && Intrinsics.d(this.viewAction, bannerVO.viewAction) && Intrinsics.d(this.tokenizedEvent, bannerVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getActionBadge() {
        return this.actionBadge;
    }

    public final String getDarkBackgroundColor() {
        return this.darkBackgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getLightBackgroundColor() {
        return this.lightBackgroundColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
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

    public final AtomAction getViewAction() {
        return this.viewAction;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.lightBackgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.darkBackgroundColor;
        int a11 = b.a(this.subtitle, b.a(this.title, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        BadgeDTO badgeDTO = this.actionBadge;
        int a12 = g.a((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.imageURL);
        AtomAction atomAction = this.action;
        int hashCode3 = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        AtomAction atomAction2 = this.viewAction;
        int hashCode4 = (hashCode3 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.lightBackgroundColor;
        String str2 = this.darkBackgroundColor;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.actionBadge;
        String str3 = this.imageURL;
        AtomAction atomAction = this.action;
        AtomAction atomAction2 = this.viewAction;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "BannerVO(id=", ", lightBackgroundColor=", str);
        c11.append(", darkBackgroundColor=");
        c11.append(str2);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", subtitle=");
        c11.append(textDTO2);
        c11.append(", actionBadge=");
        c11.append(badgeDTO);
        C2439a.c(", imageURL=", str3, ", action=", c11, atomAction);
        Fj.c.e(tVar, ", viewAction=", ", tokenizedEvent=", c11, atomAction2);
        c11.append(")");
        return c11.toString();
    }
}
