package ru.ozon.app.android.regulardraw.ui.button;

import G.g;
import T7.P;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "", "theme", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO$Theme;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "balance", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO$Theme;Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTheme", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO$Theme;", "getTitle", "()Ljava/lang/String;", "getBalance", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Theme", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskShadowButtonDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final MorkovskCurrencyBadgeDTO balance;

    @NotNull
    private final Theme theme;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_PRIMARY", "THEME_SECONDARY", "THEME_TRANSPARENT", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;

        @i(name = "THEME_PRIMARY")
        public static final Theme THEME_PRIMARY = new Theme("THEME_PRIMARY", 0);

        @i(name = "THEME_SECONDARY")
        public static final Theme THEME_SECONDARY = new Theme("THEME_SECONDARY", 1);

        @i(name = "THEME_TRANSPARENT")
        public static final Theme THEME_TRANSPARENT = new Theme("THEME_TRANSPARENT", 2);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{THEME_PRIMARY, THEME_SECONDARY, THEME_TRANSPARENT};
        }

        static {
            Theme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Theme(String str, int i11) {
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    public MorkovskShadowButtonDTO(@NotNull Theme theme, @NotNull String title, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(title, "title");
        this.theme = theme;
        this.title = title;
        this.balance = morkovskCurrencyBadgeDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ MorkovskShadowButtonDTO copy$default(MorkovskShadowButtonDTO morkovskShadowButtonDTO, Theme theme, String str, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            theme = morkovskShadowButtonDTO.theme;
        }
        if ((i11 & 2) != 0) {
            str = morkovskShadowButtonDTO.title;
        }
        if ((i11 & 4) != 0) {
            morkovskCurrencyBadgeDTO = morkovskShadowButtonDTO.balance;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = morkovskShadowButtonDTO.action;
        }
        if ((i11 & 16) != 0) {
            map = morkovskShadowButtonDTO.trackingInfo;
        }
        Map map2 = map;
        MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO2 = morkovskCurrencyBadgeDTO;
        return morkovskShadowButtonDTO.copy(theme, str, morkovskCurrencyBadgeDTO2, atomActionDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final MorkovskCurrencyBadgeDTO getBalance() {
        return this.balance;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final MorkovskShadowButtonDTO copy(@NotNull Theme theme, @NotNull String title, MorkovskCurrencyBadgeDTO balance, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(title, "title");
        return new MorkovskShadowButtonDTO(theme, title, balance, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskShadowButtonDTO)) {
            return false;
        }
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = (MorkovskShadowButtonDTO) other;
        return this.theme == morkovskShadowButtonDTO.theme && Intrinsics.d(this.title, morkovskShadowButtonDTO.title) && Intrinsics.d(this.balance, morkovskShadowButtonDTO.balance) && Intrinsics.d(this.action, morkovskShadowButtonDTO.action) && Intrinsics.d(this.trackingInfo, morkovskShadowButtonDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final MorkovskCurrencyBadgeDTO getBalance() {
        return this.balance;
    }

    @NotNull
    public final Theme getTheme() {
        return this.theme;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.theme.hashCode() * 31, 31, this.title);
        MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = this.balance;
        int hashCode = (a11 + (morkovskCurrencyBadgeDTO == null ? 0 : morkovskCurrencyBadgeDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Theme theme = this.theme;
        String str = this.title;
        MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = this.balance;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("MorkovskShadowButtonDTO(theme=");
        sb2.append(theme);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", balance=");
        sb2.append(morkovskCurrencyBadgeDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
