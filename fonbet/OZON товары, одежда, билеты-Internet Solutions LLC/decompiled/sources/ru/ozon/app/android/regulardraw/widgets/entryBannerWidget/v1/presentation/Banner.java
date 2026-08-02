package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation;

import An.C2439a;
import C.o0;
import G.g;
import Gl.C3124a;
import N3.C3660k;
import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001:\u000267BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u0016R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Badge;", "titleBadgeState", "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Images;", "images", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Badge;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Images;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Badge;", "getTitleBadgeState", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Badge;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Images;", "getImages", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Images;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Badge", "Images", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Banner {
    private final AtomAction action;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final BadgeDTO badge;
    private final long id;

    @NotNull
    private final Images images;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final Badge titleBadgeState;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Badge;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "icon", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getIcon", "getBackgroundColor", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badge {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String icon;

        @NotNull
        private final TextDTO text;

        public Badge(@NotNull TextDTO text, @NotNull String icon, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.text = text;
            this.icon = icon;
            this.backgroundColor = backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return Intrinsics.d(this.text, badge.text) && Intrinsics.d(this.icon, badge.icon) && Intrinsics.d(this.backgroundColor, badge.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + g.a(this.text.hashCode() * 31, 31, this.icon);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            String str = this.icon;
            return o0.c(D3.g.f("Badge(text=", textDTO, ", icon=", str, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Images;", "", "", "underImage", "animationName", "overImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUnderImage", "getAnimationName", "getOverImage", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Images {

        @NotNull
        private final String animationName;
        private final String overImage;
        private final String underImage;

        public Images(String str, @NotNull String animationName, String str2) {
            Intrinsics.checkNotNullParameter(animationName, "animationName");
            this.underImage = str;
            this.animationName = animationName;
            this.overImage = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Images)) {
                return false;
            }
            Images images = (Images) other;
            return Intrinsics.d(this.underImage, images.underImage) && Intrinsics.d(this.animationName, images.animationName) && Intrinsics.d(this.overImage, images.overImage);
        }

        @NotNull
        public final String getAnimationName() {
            return this.animationName;
        }

        public final String getOverImage() {
            return this.overImage;
        }

        public final String getUnderImage() {
            return this.underImage;
        }

        public int hashCode() {
            String str = this.underImage;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.animationName);
            String str2 = this.overImage;
            return a11 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.underImage;
            String str2 = this.animationName;
            return o0.c(C3660k.d("Images(underImage=", str, ", animationName=", str2, ", overImage="), this.overImage, ")");
        }
    }

    public Banner(long j11, @NotNull TextDTO title, @NotNull Badge titleBadgeState, @NotNull TextDTO subtitle, @NotNull BadgeDTO badge, @NotNull Images images, @NotNull String backgroundColor, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleBadgeState, "titleBadgeState");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.title = title;
        this.titleBadgeState = titleBadgeState;
        this.subtitle = subtitle;
        this.badge = badge;
        this.images = images;
        this.backgroundColor = backgroundColor;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) other;
        return this.id == banner.id && Intrinsics.d(this.title, banner.title) && Intrinsics.d(this.titleBadgeState, banner.titleBadgeState) && Intrinsics.d(this.subtitle, banner.subtitle) && Intrinsics.d(this.badge, banner.badge) && Intrinsics.d(this.images, banner.images) && Intrinsics.d(this.backgroundColor, banner.backgroundColor) && Intrinsics.d(this.action, banner.action) && Intrinsics.d(this.tokenizedEvent, banner.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final Images getImages() {
        return this.images;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final Badge getTitleBadgeState() {
        return this.titleBadgeState;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int a11 = g.a((this.images.hashCode() + C3124a.c(this.badge, b.a(this.subtitle, (this.titleBadgeState.hashCode() + b.a(this.title, Long.hashCode(this.id) * 31, 31)) * 31, 31), 31)) * 31, 31, this.backgroundColor);
        AtomAction atomAction = this.action;
        int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        Badge badge = this.titleBadgeState;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.badge;
        Images images = this.images;
        String str = this.backgroundColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("Banner(id=", j11, ", title=", textDTO);
        b11.append(", titleBadgeState=");
        b11.append(badge);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", badge=");
        b11.append(badgeDTO);
        b11.append(", images=");
        b11.append(images);
        C2439a.c(", backgroundColor=", str, ", action=", b11, atomAction);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
