package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.data;

import B0.C2454a;
import Ef0.c;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001:\u00013B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jt\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "backgroundColor", "", "offsetHorizontal", "", "offsetTop", "offsetBottom", "isCentered", "", "badgeGravity", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO$Gravity;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO$Gravity;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getBackgroundColor", "()Ljava/lang/String;", "getOffsetHorizontal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffsetTop", "getOffsetBottom", "()Z", "getBadgeGravity", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO$Gravity;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO$Gravity;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO;", "equals", "other", "hashCode", "toString", "Gravity", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTextWithBadgeDTO {
    public static final int $stable = Badge.$stable | TextAtom.$stable;
    private final String backgroundColor;
    private final Badge badge;

    @NotNull
    private final Gravity badgeGravity;
    private final boolean isCentered;
    private final Integer offsetBottom;
    private final Integer offsetHorizontal;
    private final Integer offsetTop;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final TextAtom text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO$Gravity;", "", "<init>", "(Ljava/lang/String;I)V", "GRAVITY_UNSPECIFIED", "GRAVITY_TEXT_END", "GRAVITY_END", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gravity {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Gravity[] $VALUES;

        @i(name = "GRAVITY_UNSPECIFIED")
        public static final Gravity GRAVITY_UNSPECIFIED = new Gravity("GRAVITY_UNSPECIFIED", 0);

        @i(name = "GRAVITY_TEXT_END")
        public static final Gravity GRAVITY_TEXT_END = new Gravity("GRAVITY_TEXT_END", 1);

        @i(name = "GRAVITY_END")
        public static final Gravity GRAVITY_END = new Gravity("GRAVITY_END", 2);

        private static final /* synthetic */ Gravity[] $values() {
            return new Gravity[]{GRAVITY_UNSPECIFIED, GRAVITY_TEXT_END, GRAVITY_END};
        }

        static {
            Gravity[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Gravity(String str, int i11) {
        }

        public static Gravity valueOf(String str) {
            return (Gravity) Enum.valueOf(Gravity.class, str);
        }

        public static Gravity[] values() {
            return (Gravity[]) $VALUES.clone();
        }
    }

    public TravelTextWithBadgeDTO(@NotNull TextAtom text, Badge badge, String str, Integer num, Integer num2, Integer num3, boolean z11, @NotNull Gravity badgeGravity, OnBoardingDTO onBoardingDTO) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(badgeGravity, "badgeGravity");
        this.text = text;
        this.badge = badge;
        this.backgroundColor = str;
        this.offsetHorizontal = num;
        this.offsetTop = num2;
        this.offsetBottom = num3;
        this.isCentered = z11;
        this.badgeGravity = badgeGravity;
        this.onboarding = onBoardingDTO;
    }

    public static /* synthetic */ TravelTextWithBadgeDTO copy$default(TravelTextWithBadgeDTO travelTextWithBadgeDTO, TextAtom textAtom, Badge badge, String str, Integer num, Integer num2, Integer num3, boolean z11, Gravity gravity, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelTextWithBadgeDTO.text;
        }
        if ((i11 & 2) != 0) {
            badge = travelTextWithBadgeDTO.badge;
        }
        if ((i11 & 4) != 0) {
            str = travelTextWithBadgeDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            num = travelTextWithBadgeDTO.offsetHorizontal;
        }
        if ((i11 & 16) != 0) {
            num2 = travelTextWithBadgeDTO.offsetTop;
        }
        if ((i11 & 32) != 0) {
            num3 = travelTextWithBadgeDTO.offsetBottom;
        }
        if ((i11 & 64) != 0) {
            z11 = travelTextWithBadgeDTO.isCentered;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            gravity = travelTextWithBadgeDTO.badgeGravity;
        }
        if ((i11 & 256) != 0) {
            onBoardingDTO = travelTextWithBadgeDTO.onboarding;
        }
        Gravity gravity2 = gravity;
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        Integer num4 = num3;
        boolean z12 = z11;
        Integer num5 = num2;
        String str2 = str;
        return travelTextWithBadgeDTO.copy(textAtom, badge, str2, num, num5, num4, z12, gravity2, onBoardingDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getOffsetHorizontal() {
        return this.offsetHorizontal;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getOffsetTop() {
        return this.offsetTop;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getOffsetBottom() {
        return this.offsetBottom;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCentered() {
        return this.isCentered;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Gravity getBadgeGravity() {
        return this.badgeGravity;
    }

    /* renamed from: component9, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final TravelTextWithBadgeDTO copy(@NotNull TextAtom text, Badge badge, String backgroundColor, Integer offsetHorizontal, Integer offsetTop, Integer offsetBottom, boolean isCentered, @NotNull Gravity badgeGravity, OnBoardingDTO onboarding) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(badgeGravity, "badgeGravity");
        return new TravelTextWithBadgeDTO(text, badge, backgroundColor, offsetHorizontal, offsetTop, offsetBottom, isCentered, badgeGravity, onboarding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTextWithBadgeDTO)) {
            return false;
        }
        TravelTextWithBadgeDTO travelTextWithBadgeDTO = (TravelTextWithBadgeDTO) other;
        return Intrinsics.d(this.text, travelTextWithBadgeDTO.text) && Intrinsics.d(this.badge, travelTextWithBadgeDTO.badge) && Intrinsics.d(this.backgroundColor, travelTextWithBadgeDTO.backgroundColor) && Intrinsics.d(this.offsetHorizontal, travelTextWithBadgeDTO.offsetHorizontal) && Intrinsics.d(this.offsetTop, travelTextWithBadgeDTO.offsetTop) && Intrinsics.d(this.offsetBottom, travelTextWithBadgeDTO.offsetBottom) && this.isCentered == travelTextWithBadgeDTO.isCentered && this.badgeGravity == travelTextWithBadgeDTO.badgeGravity && Intrinsics.d(this.onboarding, travelTextWithBadgeDTO.onboarding);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final Gravity getBadgeGravity() {
        return this.badgeGravity;
    }

    public final Integer getOffsetBottom() {
        return this.offsetBottom;
    }

    public final Integer getOffsetHorizontal() {
        return this.offsetHorizontal;
    }

    public final Integer getOffsetTop() {
        return this.offsetTop;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Badge badge = this.badge;
        int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.offsetHorizontal;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offsetTop;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.offsetBottom;
        int hashCode6 = (this.badgeGravity.hashCode() + C3532b.a((hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.isCentered)) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        return hashCode6 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
    }

    public final boolean isCentered() {
        return this.isCentered;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.text;
        Badge badge = this.badge;
        String str = this.backgroundColor;
        Integer num = this.offsetHorizontal;
        Integer num2 = this.offsetTop;
        Integer num3 = this.offsetBottom;
        boolean z11 = this.isCentered;
        Gravity gravity = this.badgeGravity;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        StringBuilder sb2 = new StringBuilder("TravelTextWithBadgeDTO(text=");
        sb2.append(textAtom);
        sb2.append(", badge=");
        sb2.append(badge);
        sb2.append(", backgroundColor=");
        C2454a.f(num, str, ", offsetHorizontal=", ", offsetTop=", sb2);
        c.e(sb2, num2, ", offsetBottom=", num3, ", isCentered=");
        sb2.append(z11);
        sb2.append(", badgeGravity=");
        sb2.append(gravity);
        sb2.append(", onboarding=");
        sb2.append(onBoardingDTO);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ TravelTextWithBadgeDTO(TextAtom textAtom, Badge badge, String str, Integer num, Integer num2, Integer num3, boolean z11, Gravity gravity, OnBoardingDTO onBoardingDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, badge, str, num, num2, num3, (i11 & 64) != 0 ? false : z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Gravity.GRAVITY_TEXT_END : gravity, onBoardingDTO);
    }
}
