package ru.ozon.app.android.checkoutcomposer.premiumbanner;

import G.g;
import Kk.C3532b;
import Ql.c;
import T7.P;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerDTO;", "", "icon", "", "showBackground", "", "button", "Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerDTO$Button;", "benefits", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ZLru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerDTO$Button;Ljava/util/List;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getShowBackground", "()Z", "getButton", "()Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerDTO$Button;", "getBenefits", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Button", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PremiumBannerDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<AtomDTO> benefits;

    @NotNull
    private final Button button;

    @NotNull
    private final String icon;
    private final boolean showBackground;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerDTO$Button;", "", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Button(@NotNull String text, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Button copy$default(Button button, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = button.action;
            }
            if ((i11 & 4) != 0) {
                map = button.trackingInfo;
            }
            return button.copy(str, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final Button copy(@NotNull String text, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Button(text, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.text, button.text) && Intrinsics.d(this.action, button.action) && Intrinsics.d(this.trackingInfo, button.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            AtomActionDTO atomActionDTO = this.action;
            return P.f(c.c("Button(text=", str, ", action=", atomActionDTO, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PremiumBannerDTO(@NotNull String icon, boolean z11, @NotNull Button button, @NotNull List<? extends AtomDTO> benefits, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.icon = icon;
        this.showBackground = z11;
        this.button = button;
        this.benefits = benefits;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PremiumBannerDTO copy$default(PremiumBannerDTO premiumBannerDTO, String str, boolean z11, Button button, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = premiumBannerDTO.icon;
        }
        if ((i11 & 2) != 0) {
            z11 = premiumBannerDTO.showBackground;
        }
        if ((i11 & 4) != 0) {
            button = premiumBannerDTO.button;
        }
        if ((i11 & 8) != 0) {
            list = premiumBannerDTO.benefits;
        }
        if ((i11 & 16) != 0) {
            map = premiumBannerDTO.trackingInfo;
        }
        Map map2 = map;
        Button button2 = button;
        return premiumBannerDTO.copy(str, z11, button2, list, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowBackground() {
        return this.showBackground;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @NotNull
    public final List<AtomDTO> component4() {
        return this.benefits;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final PremiumBannerDTO copy(@NotNull String icon, boolean showBackground, @NotNull Button button, @NotNull List<? extends AtomDTO> benefits, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        return new PremiumBannerDTO(icon, showBackground, button, benefits, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PremiumBannerDTO)) {
            return false;
        }
        PremiumBannerDTO premiumBannerDTO = (PremiumBannerDTO) other;
        return Intrinsics.d(this.icon, premiumBannerDTO.icon) && this.showBackground == premiumBannerDTO.showBackground && Intrinsics.d(this.button, premiumBannerDTO.button) && Intrinsics.d(this.benefits, premiumBannerDTO.benefits) && Intrinsics.d(this.trackingInfo, premiumBannerDTO.trackingInfo);
    }

    @NotNull
    public final List<AtomDTO> getBenefits() {
        return this.benefits;
    }

    @NotNull
    public final Button getButton() {
        return this.button;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final boolean getShowBackground() {
        return this.showBackground;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b((this.button.hashCode() + C3532b.a(this.icon.hashCode() * 31, 31, this.showBackground)) * 31, 31, this.benefits);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        boolean z11 = this.showBackground;
        Button button = this.button;
        List<AtomDTO> list = this.benefits;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = C4636t5.b("PremiumBannerDTO(icon=", str, ", showBackground=", ", button=", z11);
        b11.append(button);
        b11.append(", benefits=");
        b11.append(list);
        b11.append(", trackingInfo=");
        return P.f(b11, map, ")");
    }

    public /* synthetic */ PremiumBannerDTO(String str, boolean z11, Button button, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? false : z11, button, list, map);
    }
}
