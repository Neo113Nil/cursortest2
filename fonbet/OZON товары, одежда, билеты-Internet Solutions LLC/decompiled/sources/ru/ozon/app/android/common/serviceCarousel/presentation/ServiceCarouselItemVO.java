package ru.ozon.app.android.common.serviceCarousel.presentation;

import An.C2439a;
import B90.C2619v;
import Bi.a;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import Ve.C4598rp;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0084\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b3\u0010\u001bR\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b:\u0010\u001bR\u0011\u0010<\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010/¨\u0006="}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "showNewBadge", "", "storyId", "deeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "imageBgColor", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;ZLjava/lang/Integer;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;ZLjava/lang/Integer;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;)Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "getShowNewBadge", "()Z", "Ljava/lang/Integer;", "getStoryId", "()Ljava/lang/Integer;", "getDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getImageBgColor", "getShouldShowBadge", "shouldShowBadge", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ServiceCarouselItemVO implements c {

    @NotNull
    private final AtomAction action;
    private final BadgeDTO badge;
    private final String deeplink;
    private final long id;

    @NotNull
    private final String image;
    private final String imageBgColor;
    private final boolean showNewBadge;
    private final Integer storyId;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    public ServiceCarouselItemVO(long j11, @NotNull TextAtom title, @NotNull String image, @NotNull AtomAction action, boolean z11, Integer num, String str, t tVar, BadgeDTO badgeDTO, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.title = title;
        this.image = image;
        this.action = action;
        this.showNewBadge = z11;
        this.storyId = num;
        this.deeplink = str;
        this.tokenizedEvent = tVar;
        this.badge = badgeDTO;
        this.imageBgColor = str2;
    }

    public static /* synthetic */ ServiceCarouselItemVO copy$default(ServiceCarouselItemVO serviceCarouselItemVO, long j11, TextAtom textAtom, String str, AtomAction atomAction, boolean z11, Integer num, String str2, t tVar, BadgeDTO badgeDTO, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = serviceCarouselItemVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textAtom = serviceCarouselItemVO.title;
        }
        return serviceCarouselItemVO.copy(j12, textAtom, (i11 & 4) != 0 ? serviceCarouselItemVO.image : str, (i11 & 8) != 0 ? serviceCarouselItemVO.action : atomAction, (i11 & 16) != 0 ? serviceCarouselItemVO.showNewBadge : z11, (i11 & 32) != 0 ? serviceCarouselItemVO.storyId : num, (i11 & 64) != 0 ? serviceCarouselItemVO.deeplink : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? serviceCarouselItemVO.tokenizedEvent : tVar, (i11 & 256) != 0 ? serviceCarouselItemVO.badge : badgeDTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? serviceCarouselItemVO.imageBgColor : str3);
    }

    @NotNull
    public final ServiceCarouselItemVO copy(long id2, @NotNull TextAtom title, @NotNull String image, @NotNull AtomAction action, boolean showNewBadge, Integer storyId, String deeplink, t tokenizedEvent, BadgeDTO badge, String imageBgColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ServiceCarouselItemVO(id2, title, image, action, showNewBadge, storyId, deeplink, tokenizedEvent, badge, imageBgColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceCarouselItemVO)) {
            return false;
        }
        ServiceCarouselItemVO serviceCarouselItemVO = (ServiceCarouselItemVO) other;
        return this.id == serviceCarouselItemVO.id && Intrinsics.d(this.title, serviceCarouselItemVO.title) && Intrinsics.d(this.image, serviceCarouselItemVO.image) && Intrinsics.d(this.action, serviceCarouselItemVO.action) && this.showNewBadge == serviceCarouselItemVO.showNewBadge && Intrinsics.d(this.storyId, serviceCarouselItemVO.storyId) && Intrinsics.d(this.deeplink, serviceCarouselItemVO.deeplink) && Intrinsics.d(this.tokenizedEvent, serviceCarouselItemVO.tokenizedEvent) && Intrinsics.d(this.badge, serviceCarouselItemVO.badge) && Intrinsics.d(this.imageBgColor, serviceCarouselItemVO.imageBgColor);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final String getImageBgColor() {
        return this.imageBgColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldShowBadge() {
        return (this.showNewBadge || this.badge == null) ? false : true;
    }

    public final boolean getShowNewBadge() {
        return this.showNewBadge;
    }

    public final Integer getStoryId() {
        return this.storyId;
    }

    @NotNull
    public final TextAtom getTitle() {
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
        int a11 = C3532b.a(C4598rp.a(this.action, g.a(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.image), 31), 31, this.showNewBadge);
        Integer num = this.storyId;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.deeplink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str2 = this.imageBgColor;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        String str = this.image;
        AtomAction atomAction = this.action;
        boolean z11 = this.showNewBadge;
        Integer num = this.storyId;
        String str2 = this.deeplink;
        t tVar = this.tokenizedEvent;
        BadgeDTO badgeDTO = this.badge;
        String str3 = this.imageBgColor;
        StringBuilder c11 = C2639a.c("ServiceCarouselItemVO(id=", j11, ", title=", textAtom);
        C2439a.c(", image=", str, ", action=", c11, atomAction);
        c11.append(", showNewBadge=");
        c11.append(z11);
        c11.append(", storyId=");
        c11.append(num);
        a.f(c11, ", deeplink=", str2, ", tokenizedEvent=", tVar);
        c11.append(", badge=");
        c11.append(badgeDTO);
        c11.append(", imageBgColor=");
        c11.append(str3);
        c11.append(")");
        return c11.toString();
    }
}
