package ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.data;

import G.g;
import Kk.C3532b;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/data/WelcomeScreenDTO;", "", "withoutWelcomeBonus", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/data/WelcomeScreenDTO$ScreenInfo;", "withWelcomeBonus", "mustSkipOnboarding", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/data/WelcomeScreenDTO$ScreenInfo;Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/data/WelcomeScreenDTO$ScreenInfo;ZLjava/util/Map;)V", "getWithoutWelcomeBonus", "()Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/data/WelcomeScreenDTO$ScreenInfo;", "getWithWelcomeBonus", "getMustSkipOnboarding", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ScreenInfo", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WelcomeScreenDTO {
    public static final int $stable = 8;
    private final boolean mustSkipOnboarding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final ScreenInfo withWelcomeBonus;

    @NotNull
    private final ScreenInfo withoutWelcomeBonus;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/data/WelcomeScreenDTO$ScreenInfo;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "button", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScreenInfo {
        public static final int $stable = 8;

        @NotNull
        private final MorkovskShadowButtonDTO button;

        @NotNull
        private final String image;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public ScreenInfo(@NotNull String image, @NotNull String title, @NotNull String subtitle, @NotNull MorkovskShadowButtonDTO button) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(button, "button");
            this.image = image;
            this.title = title;
            this.subtitle = subtitle;
            this.button = button;
        }

        public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, String str, String str2, String str3, MorkovskShadowButtonDTO morkovskShadowButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = screenInfo.image;
            }
            if ((i11 & 2) != 0) {
                str2 = screenInfo.title;
            }
            if ((i11 & 4) != 0) {
                str3 = screenInfo.subtitle;
            }
            if ((i11 & 8) != 0) {
                morkovskShadowButtonDTO = screenInfo.button;
            }
            return screenInfo.copy(str, str2, str3, morkovskShadowButtonDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final MorkovskShadowButtonDTO getButton() {
            return this.button;
        }

        @NotNull
        public final ScreenInfo copy(@NotNull String image, @NotNull String title, @NotNull String subtitle, @NotNull MorkovskShadowButtonDTO button) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(button, "button");
            return new ScreenInfo(image, title, subtitle, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenInfo)) {
                return false;
            }
            ScreenInfo screenInfo = (ScreenInfo) other;
            return Intrinsics.d(this.image, screenInfo.image) && Intrinsics.d(this.title, screenInfo.title) && Intrinsics.d(this.subtitle, screenInfo.subtitle) && Intrinsics.d(this.button, screenInfo.button);
        }

        @NotNull
        public final MorkovskShadowButtonDTO getButton() {
            return this.button;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.button.hashCode() + g.a(g.a(this.image.hashCode() * 31, 31, this.title), 31, this.subtitle);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.title;
            String str3 = this.subtitle;
            MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.button;
            StringBuilder d11 = C3660k.d("ScreenInfo(image=", str, ", title=", str2, ", subtitle=");
            d11.append(str3);
            d11.append(", button=");
            d11.append(morkovskShadowButtonDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    public WelcomeScreenDTO(@NotNull ScreenInfo withoutWelcomeBonus, ScreenInfo screenInfo, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(withoutWelcomeBonus, "withoutWelcomeBonus");
        this.withoutWelcomeBonus = withoutWelcomeBonus;
        this.withWelcomeBonus = screenInfo;
        this.mustSkipOnboarding = z11;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WelcomeScreenDTO copy$default(WelcomeScreenDTO welcomeScreenDTO, ScreenInfo screenInfo, ScreenInfo screenInfo2, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            screenInfo = welcomeScreenDTO.withoutWelcomeBonus;
        }
        if ((i11 & 2) != 0) {
            screenInfo2 = welcomeScreenDTO.withWelcomeBonus;
        }
        if ((i11 & 4) != 0) {
            z11 = welcomeScreenDTO.mustSkipOnboarding;
        }
        if ((i11 & 8) != 0) {
            map = welcomeScreenDTO.trackingInfo;
        }
        return welcomeScreenDTO.copy(screenInfo, screenInfo2, z11, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ScreenInfo getWithoutWelcomeBonus() {
        return this.withoutWelcomeBonus;
    }

    /* renamed from: component2, reason: from getter */
    public final ScreenInfo getWithWelcomeBonus() {
        return this.withWelcomeBonus;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getMustSkipOnboarding() {
        return this.mustSkipOnboarding;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final WelcomeScreenDTO copy(@NotNull ScreenInfo withoutWelcomeBonus, ScreenInfo withWelcomeBonus, boolean mustSkipOnboarding, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(withoutWelcomeBonus, "withoutWelcomeBonus");
        return new WelcomeScreenDTO(withoutWelcomeBonus, withWelcomeBonus, mustSkipOnboarding, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeScreenDTO)) {
            return false;
        }
        WelcomeScreenDTO welcomeScreenDTO = (WelcomeScreenDTO) other;
        return Intrinsics.d(this.withoutWelcomeBonus, welcomeScreenDTO.withoutWelcomeBonus) && Intrinsics.d(this.withWelcomeBonus, welcomeScreenDTO.withWelcomeBonus) && this.mustSkipOnboarding == welcomeScreenDTO.mustSkipOnboarding && Intrinsics.d(this.trackingInfo, welcomeScreenDTO.trackingInfo);
    }

    public final boolean getMustSkipOnboarding() {
        return this.mustSkipOnboarding;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final ScreenInfo getWithWelcomeBonus() {
        return this.withWelcomeBonus;
    }

    @NotNull
    public final ScreenInfo getWithoutWelcomeBonus() {
        return this.withoutWelcomeBonus;
    }

    public int hashCode() {
        int hashCode = this.withoutWelcomeBonus.hashCode() * 31;
        ScreenInfo screenInfo = this.withWelcomeBonus;
        int a11 = C3532b.a((hashCode + (screenInfo == null ? 0 : screenInfo.hashCode())) * 31, 31, this.mustSkipOnboarding);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WelcomeScreenDTO(withoutWelcomeBonus=" + this.withoutWelcomeBonus + ", withWelcomeBonus=" + this.withWelcomeBonus + ", mustSkipOnboarding=" + this.mustSkipOnboarding + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
