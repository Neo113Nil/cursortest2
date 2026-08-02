package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.domain;

import Am.C2438a;
import B0.C2454a;
import D3.g;
import J0.P;
import Lh.a;
import Pk0.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00029:Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u0018R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "startText", "endText", "", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Image;", "images", "", "backgroundColor", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Spacers;", "spacers", "", "cornerRadius", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Spacers;FLWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getStartText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getEndText", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Spacers;", "F", "getCornerRadius", "()F", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Image", "Spacers", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StickyPromoBadgeVO implements c {
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final float cornerRadius;
    private final TextDTO endText;
    private final long id;
    private final List<Image> images;

    @NotNull
    private final Spacers spacers;
    private final TextDTO startText;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Image;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "tintColor", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/lang/String;", "getTintColor", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {

        @NotNull
        private final ImageDTO image;
        private final String tintColor;

        public Image(@NotNull ImageDTO image, String str) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.tintColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.image, image.image) && Intrinsics.d(this.tintColor, image.tintColor);
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.tintColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Image(image=" + this.image + ", tintColor=" + this.tintColor + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Spacers;", "", "", "top", "bottom", "left", "right", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getLeft", "getRight", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public Spacers(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.bottom = i12;
            this.left = i13;
            this.right = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.top == spacers.top && this.bottom == spacers.bottom && this.left == spacers.left && this.right == spacers.right;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.right) + C2454a.a(this.left, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.left, this.right, ", right=", ")", C2438a.a("Spacers(top=", this.top, ", bottom=", ", left=", this.bottom));
        }
    }

    public StickyPromoBadgeVO(long j11, BadgeDTO badgeDTO, TextDTO textDTO, TextDTO textDTO2, List<Image> list, String str, @NotNull Spacers spacers, float f7, t tVar) {
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.badge = badgeDTO;
        this.startText = textDTO;
        this.endText = textDTO2;
        this.images = list;
        this.backgroundColor = str;
        this.spacers = spacers;
        this.cornerRadius = f7;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyPromoBadgeVO)) {
            return false;
        }
        StickyPromoBadgeVO stickyPromoBadgeVO = (StickyPromoBadgeVO) other;
        return this.id == stickyPromoBadgeVO.id && Intrinsics.d(this.badge, stickyPromoBadgeVO.badge) && Intrinsics.d(this.startText, stickyPromoBadgeVO.startText) && Intrinsics.d(this.endText, stickyPromoBadgeVO.endText) && Intrinsics.d(this.images, stickyPromoBadgeVO.images) && Intrinsics.d(this.backgroundColor, stickyPromoBadgeVO.backgroundColor) && Intrinsics.d(this.spacers, stickyPromoBadgeVO.spacers) && Float.compare(this.cornerRadius, stickyPromoBadgeVO.cornerRadius) == 0 && Intrinsics.d(this.tokenizedEvent, stickyPromoBadgeVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final TextDTO getEndText() {
        return this.endText;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<Image> getImages() {
        return this.images;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final TextDTO getStartText() {
        return this.startText;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        TextDTO textDTO = this.startText;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.endText;
        int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        List<Image> list = this.images;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.backgroundColor;
        int a11 = b.a(this.cornerRadius, (this.spacers.hashCode() + ((hashCode5 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        BadgeDTO badgeDTO = this.badge;
        TextDTO textDTO = this.startText;
        TextDTO textDTO2 = this.endText;
        List<Image> list = this.images;
        String str = this.backgroundColor;
        Spacers spacers = this.spacers;
        float f7 = this.cornerRadius;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("StickyPromoBadgeVO(id=");
        sb2.append(j11);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        g.i(", startText=", ", endText=", sb2, textDTO, textDTO2);
        sb2.append(", images=");
        sb2.append(list);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", spacers=");
        sb2.append(spacers);
        sb2.append(", cornerRadius=");
        sb2.append(f7);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
