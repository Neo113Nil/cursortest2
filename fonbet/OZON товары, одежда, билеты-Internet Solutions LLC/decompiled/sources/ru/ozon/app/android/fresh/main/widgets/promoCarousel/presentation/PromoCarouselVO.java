package ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import G.g;
import K00.b;
import Kk.C3532b;
import Ve.C4598rp;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001/BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\\\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010&R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "banners", "", "hasAnimation", "isSmallCarousel", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Landroid/os/Parcelable;", "layoutManagerState", "<init>", "(JLjava/util/List;ZZLWZ/t;Landroid/os/Parcelable;)V", "copy", "(JLjava/util/List;ZZLWZ/t;Landroid/os/Parcelable;)Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBanners", "()Ljava/util/List;", "Z", "getHasAnimation", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "PromoCarouselBannerVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PromoCarouselVO implements c {

    @NotNull
    private final List<PromoCarouselBannerVO> banners;
    private final boolean hasAnimation;
    private final long id;
    private final boolean isSmallCarousel;
    private Parcelable layoutManagerState;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "", "", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "advBadgeV2", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO$BannerType;", "bannerType", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO$BannerType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdvBadgeV2", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO$BannerType;", "getBannerType", "()Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO$BannerType;", "BannerType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PromoCarouselBannerVO {
        private final BadgeDTO advBadgeV2;

        @NotNull
        private final AtomAction atomAction;

        @NotNull
        private final BannerType bannerType;

        @NotNull
        private final String image;
        private final t tokenizedEvent;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO$BannerType;", "", "", "spanSize", "width", "height", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSpanSize", "getWidth", "getHeight", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BannerType {
            private final int height;
            private final int spanSize;
            private final int width;

            public BannerType(int i11, int i12, int i13) {
                this.spanSize = i11;
                this.width = i12;
                this.height = i13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerType)) {
                    return false;
                }
                BannerType bannerType = (BannerType) other;
                return this.spanSize == bannerType.spanSize && this.width == bannerType.width && this.height == bannerType.height;
            }

            public final int getHeight() {
                return this.height;
            }

            public final int getSpanSize() {
                return this.spanSize;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                return Integer.hashCode(this.height) + C2454a.a(this.width, Integer.hashCode(this.spanSize) * 31, 31);
            }

            @NotNull
            public String toString() {
                return b.e(this.height, ")", C2438a.a("BannerType(spanSize=", this.spanSize, ", width=", ", height=", this.width));
            }
        }

        public PromoCarouselBannerVO(@NotNull String image, @NotNull AtomAction atomAction, BadgeDTO badgeDTO, t tVar, @NotNull BannerType bannerType) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(atomAction, "atomAction");
            Intrinsics.checkNotNullParameter(bannerType, "bannerType");
            this.image = image;
            this.atomAction = atomAction;
            this.advBadgeV2 = badgeDTO;
            this.tokenizedEvent = tVar;
            this.bannerType = bannerType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromoCarouselBannerVO)) {
                return false;
            }
            PromoCarouselBannerVO promoCarouselBannerVO = (PromoCarouselBannerVO) other;
            return Intrinsics.d(this.image, promoCarouselBannerVO.image) && Intrinsics.d(this.atomAction, promoCarouselBannerVO.atomAction) && Intrinsics.d(this.advBadgeV2, promoCarouselBannerVO.advBadgeV2) && Intrinsics.d(this.tokenizedEvent, promoCarouselBannerVO.tokenizedEvent) && Intrinsics.d(this.bannerType, promoCarouselBannerVO.bannerType);
        }

        public final BadgeDTO getAdvBadgeV2() {
            return this.advBadgeV2;
        }

        @NotNull
        public final AtomAction getAtomAction() {
            return this.atomAction;
        }

        @NotNull
        public final BannerType getBannerType() {
            return this.bannerType;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.atomAction, this.image.hashCode() * 31, 31);
            BadgeDTO badgeDTO = this.advBadgeV2;
            int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return this.bannerType.hashCode() + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "PromoCarouselBannerVO(image=" + this.image + ", atomAction=" + this.atomAction + ", advBadgeV2=" + this.advBadgeV2 + ", tokenizedEvent=" + this.tokenizedEvent + ", bannerType=" + this.bannerType + ")";
        }
    }

    public PromoCarouselVO(long j11, @NotNull List<PromoCarouselBannerVO> banners, boolean z11, boolean z12, t tVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        this.id = j11;
        this.banners = banners;
        this.hasAnimation = z11;
        this.isSmallCarousel = z12;
        this.tokenizedEvent = tVar;
        this.layoutManagerState = parcelable;
    }

    public static /* synthetic */ PromoCarouselVO copy$default(PromoCarouselVO promoCarouselVO, long j11, List list, boolean z11, boolean z12, t tVar, Parcelable parcelable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = promoCarouselVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = promoCarouselVO.banners;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            z11 = promoCarouselVO.hasAnimation;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = promoCarouselVO.isSmallCarousel;
        }
        boolean z14 = z12;
        if ((i11 & 16) != 0) {
            tVar = promoCarouselVO.tokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i11 & 32) != 0) {
            parcelable = promoCarouselVO.layoutManagerState;
        }
        return promoCarouselVO.copy(j12, list2, z13, z14, tVar2, parcelable);
    }

    @NotNull
    public final PromoCarouselVO copy(long id2, @NotNull List<PromoCarouselBannerVO> banners, boolean hasAnimation, boolean isSmallCarousel, t tokenizedEvent, Parcelable layoutManagerState) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        return new PromoCarouselVO(id2, banners, hasAnimation, isSmallCarousel, tokenizedEvent, layoutManagerState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCarouselVO)) {
            return false;
        }
        PromoCarouselVO promoCarouselVO = (PromoCarouselVO) other;
        return this.id == promoCarouselVO.id && Intrinsics.d(this.banners, promoCarouselVO.banners) && this.hasAnimation == promoCarouselVO.hasAnimation && this.isSmallCarousel == promoCarouselVO.isSmallCarousel && Intrinsics.d(this.tokenizedEvent, promoCarouselVO.tokenizedEvent) && Intrinsics.d(this.layoutManagerState, promoCarouselVO.layoutManagerState);
    }

    @NotNull
    public final List<PromoCarouselBannerVO> getBanners() {
        return this.banners;
    }

    public final boolean getHasAnimation() {
        return this.hasAnimation;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
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
        int a11 = C3532b.a(C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.banners), 31, this.hasAnimation), 31, this.isSmallCarousel);
        t tVar = this.tokenizedEvent;
        int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Parcelable parcelable = this.layoutManagerState;
        return hashCode + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final void setLayoutManagerState(Parcelable parcelable) {
        this.layoutManagerState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<PromoCarouselBannerVO> list = this.banners;
        boolean z11 = this.hasAnimation;
        boolean z12 = this.isSmallCarousel;
        t tVar = this.tokenizedEvent;
        Parcelable parcelable = this.layoutManagerState;
        StringBuilder b11 = Lh.b.b(j11, "PromoCarouselVO(id=", ", banners=", list);
        C2436a.e(", hasAnimation=", ", isSmallCarousel=", b11, z11, z12);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", layoutManagerState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ PromoCarouselVO(long j11, List list, boolean z11, boolean z12, t tVar, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, z11, z12, tVar, (i11 & 32) != 0 ? null : parcelable);
    }
}
