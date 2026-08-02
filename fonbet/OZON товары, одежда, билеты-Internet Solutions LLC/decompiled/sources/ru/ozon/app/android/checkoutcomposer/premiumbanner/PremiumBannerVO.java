package ru.ozon.app.android.checkoutcomposer.premiumbanner;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "icon", "", "showBackground", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "button", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "benefits", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLjava/lang/String;ZLru/ozon/app/android/atoms/data/deprecated/CommonButton;Ljava/util/List;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getIcon", "Z", "getShowBackground", "()Z", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "getButton", "()Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "Ljava/util/List;", "getBenefits", "()Ljava/util/List;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PremiumBannerVO implements c {

    @NotNull
    private final List<AtomDTO> benefits;

    @NotNull
    private final CommonButton button;

    @NotNull
    private final String icon;
    private final long id;
    private final boolean showBackground;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PremiumBannerVO(long j11, @NotNull String icon, boolean z11, @NotNull CommonButton button, @NotNull List<? extends AtomDTO> benefits, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.id = j11;
        this.icon = icon;
        this.showBackground = z11;
        this.button = button;
        this.benefits = benefits;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PremiumBannerVO)) {
            return false;
        }
        PremiumBannerVO premiumBannerVO = (PremiumBannerVO) other;
        return this.id == premiumBannerVO.id && Intrinsics.d(this.icon, premiumBannerVO.icon) && this.showBackground == premiumBannerVO.showBackground && Intrinsics.d(this.button, premiumBannerVO.button) && Intrinsics.d(this.benefits, premiumBannerVO.benefits) && Intrinsics.d(this.trackingInfo, premiumBannerVO.trackingInfo);
    }

    @NotNull
    public final List<AtomDTO> getBenefits() {
        return this.benefits;
    }

    @NotNull
    public final CommonButton getButton() {
        return this.button;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowBackground() {
        return this.showBackground;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b((this.button.hashCode() + C3532b.a(g.a(Long.hashCode(this.id) * 31, 31, this.icon), 31, this.showBackground)) * 31, 31, this.benefits);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.icon;
        boolean z11 = this.showBackground;
        CommonButton commonButton = this.button;
        List<AtomDTO> list = this.benefits;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = C2436a.c(j11, "PremiumBannerVO(id=", ", icon=", str);
        c11.append(", showBackground=");
        c11.append(z11);
        c11.append(", button=");
        c11.append(commonButton);
        c11.append(", benefits=");
        c11.append(list);
        c11.append(", trackingInfo=");
        c11.append(map);
        c11.append(")");
        return c11.toString();
    }
}
