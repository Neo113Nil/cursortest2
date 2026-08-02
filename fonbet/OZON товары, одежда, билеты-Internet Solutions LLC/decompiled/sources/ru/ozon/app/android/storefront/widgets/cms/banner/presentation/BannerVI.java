package ru.ozon.app.android.storefront.widgets.cms.banner.presentation;

import An.C2439a;
import D40.a;
import G.g;
import Kk.C3532b;
import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b*\u0010\u0017R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b\r\u0010,R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b-\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b1\u0010\u0017R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVI;", "Ll20/c;", "", "id", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "deeplink", "", "ratio", "image", "", "isRounded", "disableVerticalMargins", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "advBadge", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLWZ/t;Ljava/lang/String;FLjava/lang/String;ZZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/String;", "getDeeplink", "F", "getRatio", "()F", "getImage", "Z", "()Z", "getDisableVerticalMargins", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdvBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerVI implements c {
    private final AtomAction action;
    private final BadgeDTO advBadge;
    private final String backgroundColor;
    private final String deeplink;
    private final boolean disableVerticalMargins;
    private final long id;

    @NotNull
    private final String image;
    private final boolean isRounded;
    private final float ratio;
    private final t tokenizedEvent;

    public BannerVI(long j11, t tVar, String str, float f7, @NotNull String image, boolean z11, boolean z12, BadgeDTO badgeDTO, String str2, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.id = j11;
        this.tokenizedEvent = tVar;
        this.deeplink = str;
        this.ratio = f7;
        this.image = image;
        this.isRounded = z11;
        this.disableVerticalMargins = z12;
        this.advBadge = badgeDTO;
        this.backgroundColor = str2;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerVI)) {
            return false;
        }
        BannerVI bannerVI = (BannerVI) other;
        return this.id == bannerVI.id && Intrinsics.d(this.tokenizedEvent, bannerVI.tokenizedEvent) && Intrinsics.d(this.deeplink, bannerVI.deeplink) && Float.compare(this.ratio, bannerVI.ratio) == 0 && Intrinsics.d(this.image, bannerVI.image) && this.isRounded == bannerVI.isRounded && this.disableVerticalMargins == bannerVI.disableVerticalMargins && Intrinsics.d(this.advBadge, bannerVI.advBadge) && Intrinsics.d(this.backgroundColor, bannerVI.backgroundColor) && Intrinsics.d(this.action, bannerVI.action);
    }

    public final BadgeDTO getAdvBadge() {
        return this.advBadge;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final boolean getDisableVerticalMargins() {
        return this.disableVerticalMargins;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final float getRatio() {
        return this.ratio;
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
        int hashCode = Long.hashCode(this.id) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.deeplink;
        int a11 = C3532b.a(C3532b.a(g.a(b.a(this.ratio, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.image), 31, this.isRounded), 31, this.disableVerticalMargins);
        BadgeDTO badgeDTO = this.advBadge;
        int hashCode3 = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return hashCode4 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    /* renamed from: isRounded, reason: from getter */
    public final boolean getIsRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        t tVar = this.tokenizedEvent;
        String str = this.deeplink;
        float f7 = this.ratio;
        String str2 = this.image;
        boolean z11 = this.isRounded;
        boolean z12 = this.disableVerticalMargins;
        BadgeDTO badgeDTO = this.advBadge;
        String str3 = this.backgroundColor;
        AtomAction atomAction = this.action;
        StringBuilder sb2 = new StringBuilder("BannerVI(id=");
        sb2.append(j11);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", deeplink=");
        sb2.append(str);
        sb2.append(", ratio=");
        sb2.append(f7);
        a.g(", image=", str2, ", isRounded=", sb2, z11);
        sb2.append(", disableVerticalMargins=");
        sb2.append(z12);
        sb2.append(", advBadge=");
        sb2.append(badgeDTO);
        C2439a.c(", backgroundColor=", str3, ", action=", sb2, atomAction);
        sb2.append(")");
        return sb2.toString();
    }
}
