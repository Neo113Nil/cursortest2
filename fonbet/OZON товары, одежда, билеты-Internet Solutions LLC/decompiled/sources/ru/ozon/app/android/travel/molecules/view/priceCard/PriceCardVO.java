package ru.ozon.app.android.travel.molecules.view.priceCard;

import Am.C2438a;
import B0.C2454a;
import B4.V;
import Ek.a;
import Fm.C3051a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO$SettingsVO;", "settings", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "", "backgroundColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO$SettingsVO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO$SettingsVO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO$SettingsVO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "SettingsVO", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PriceCardVO {
    public static final int $stable = (AtomAction.$stable | IconDTO.$stable) | PriceDTO.$stable;
    private final AtomAction action;
    private final String backgroundColor;
    private final IconDTO icon;

    @NotNull
    private final PriceDTO price;
    private final SettingsVO settings;
    private final TextDTO subtitle;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO$SettingsVO;", "", "", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "", "cornerRadius", "<init>", "(IIIIF)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTopPadding", "getBottomPadding", "getLeftPadding", "getRightPadding", "F", "getCornerRadius", "()F", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsVO {
        private final int bottomPadding;
        private final float cornerRadius;
        private final int leftPadding;
        private final int rightPadding;
        private final int topPadding;

        public SettingsVO(int i11, int i12, int i13, int i14, float f7) {
            this.topPadding = i11;
            this.bottomPadding = i12;
            this.leftPadding = i13;
            this.rightPadding = i14;
            this.cornerRadius = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsVO)) {
                return false;
            }
            SettingsVO settingsVO = (SettingsVO) other;
            return this.topPadding == settingsVO.topPadding && this.bottomPadding == settingsVO.bottomPadding && this.leftPadding == settingsVO.leftPadding && this.rightPadding == settingsVO.rightPadding && Float.compare(this.cornerRadius, settingsVO.cornerRadius) == 0;
        }

        public final int getBottomPadding() {
            return this.bottomPadding;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final int getLeftPadding() {
            return this.leftPadding;
        }

        public final int getRightPadding() {
            return this.rightPadding;
        }

        public final int getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return Float.hashCode(this.cornerRadius) + C2454a.a(this.rightPadding, C2454a.a(this.leftPadding, C2454a.a(this.bottomPadding, Integer.hashCode(this.topPadding) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.topPadding;
            int i12 = this.bottomPadding;
            int i13 = this.leftPadding;
            int i14 = this.rightPadding;
            float f7 = this.cornerRadius;
            StringBuilder a11 = C2438a.a("SettingsVO(topPadding=", i11, ", bottomPadding=", ", leftPadding=", i12);
            a.f(i13, i14, ", rightPadding=", ", cornerRadius=", a11);
            return V.b(f7, ")", a11);
        }
    }

    public PriceCardVO(SettingsVO settingsVO, @NotNull PriceDTO price, TextDTO textDTO, String str, IconDTO iconDTO, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.settings = settingsVO;
        this.price = price;
        this.subtitle = textDTO;
        this.backgroundColor = str;
        this.icon = iconDTO;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCardVO)) {
            return false;
        }
        PriceCardVO priceCardVO = (PriceCardVO) other;
        return Intrinsics.d(this.settings, priceCardVO.settings) && Intrinsics.d(this.price, priceCardVO.price) && Intrinsics.d(this.subtitle, priceCardVO.subtitle) && Intrinsics.d(this.backgroundColor, priceCardVO.backgroundColor) && Intrinsics.d(this.icon, priceCardVO.icon) && Intrinsics.d(this.action, priceCardVO.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final SettingsVO getSettings() {
        return this.settings;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        SettingsVO settingsVO = this.settings;
        int b11 = C3051a.b(this.price, (settingsVO == null ? 0 : settingsVO.hashCode()) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PriceCardVO(settings=" + this.settings + ", price=" + this.price + ", subtitle=" + this.subtitle + ", backgroundColor=" + this.backgroundColor + ", icon=" + this.icon + ", action=" + this.action + ")";
    }
}
