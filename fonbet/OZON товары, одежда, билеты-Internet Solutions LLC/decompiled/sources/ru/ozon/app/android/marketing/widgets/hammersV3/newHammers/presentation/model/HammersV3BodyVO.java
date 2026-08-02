package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model;

import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammerPriceV3DTO;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "imageInfo", "", "imageAlpha", "", "imageOverlayPicture", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "dsBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;", "hammerPrice", "", "hasHeader", "<init>", "(JLru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;FLjava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImageInfo", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "F", "getImageAlpha", "()F", "Ljava/lang/String;", "getImageOverlayPicture", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDsBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;", "getHammerPrice", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;", "Z", "getHasHeader", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HammersV3BodyVO implements c {
    private final AtomAction action;
    private final BadgeDTO dsBadge;
    private final HammerPriceV3DTO hammerPrice;
    private final boolean hasHeader;
    private final long id;
    private final float imageAlpha;

    @NotNull
    private final AdultImageView.Image imageInfo;
    private final String imageOverlayPicture;
    private final t tokenizedEvent;

    public HammersV3BodyVO(long j11, @NotNull AdultImageView.Image imageInfo, float f7, String str, BadgeDTO badgeDTO, AtomAction atomAction, t tVar, HammerPriceV3DTO hammerPriceV3DTO, boolean z11) {
        Intrinsics.checkNotNullParameter(imageInfo, "imageInfo");
        this.id = j11;
        this.imageInfo = imageInfo;
        this.imageAlpha = f7;
        this.imageOverlayPicture = str;
        this.dsBadge = badgeDTO;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.hammerPrice = hammerPriceV3DTO;
        this.hasHeader = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HammersV3BodyVO)) {
            return false;
        }
        HammersV3BodyVO hammersV3BodyVO = (HammersV3BodyVO) other;
        return this.id == hammersV3BodyVO.id && Intrinsics.d(this.imageInfo, hammersV3BodyVO.imageInfo) && Float.compare(this.imageAlpha, hammersV3BodyVO.imageAlpha) == 0 && Intrinsics.d(this.imageOverlayPicture, hammersV3BodyVO.imageOverlayPicture) && Intrinsics.d(this.dsBadge, hammersV3BodyVO.dsBadge) && Intrinsics.d(this.action, hammersV3BodyVO.action) && Intrinsics.d(this.tokenizedEvent, hammersV3BodyVO.tokenizedEvent) && Intrinsics.d(this.hammerPrice, hammersV3BodyVO.hammerPrice) && this.hasHeader == hammersV3BodyVO.hasHeader;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getDsBadge() {
        return this.dsBadge;
    }

    public final HammerPriceV3DTO getHammerPrice() {
        return this.hammerPrice;
    }

    public final boolean getHasHeader() {
        return this.hasHeader;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final float getImageAlpha() {
        return this.imageAlpha;
    }

    @NotNull
    public final AdultImageView.Image getImageInfo() {
        return this.imageInfo;
    }

    public final String getImageOverlayPicture() {
        return this.imageOverlayPicture;
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
        int a11 = b.a(this.imageAlpha, (this.imageInfo.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        String str = this.imageOverlayPicture;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        BadgeDTO badgeDTO = this.dsBadge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        HammerPriceV3DTO hammerPriceV3DTO = this.hammerPrice;
        return Boolean.hashCode(this.hasHeader) + ((hashCode4 + (hammerPriceV3DTO != null ? hammerPriceV3DTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AdultImageView.Image image = this.imageInfo;
        float f7 = this.imageAlpha;
        String str = this.imageOverlayPicture;
        BadgeDTO badgeDTO = this.dsBadge;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        HammerPriceV3DTO hammerPriceV3DTO = this.hammerPrice;
        boolean z11 = this.hasHeader;
        StringBuilder sb2 = new StringBuilder("HammersV3BodyVO(id=");
        sb2.append(j11);
        sb2.append(", imageInfo=");
        sb2.append(image);
        sb2.append(", imageAlpha=");
        sb2.append(f7);
        sb2.append(", imageOverlayPicture=");
        sb2.append(str);
        sb2.append(", dsBadge=");
        sb2.append(badgeDTO);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", hammerPrice=");
        sb2.append(hammerPriceV3DTO);
        return Bi.b.f(sb2, ", hasHeader=", z11, ")");
    }
}
