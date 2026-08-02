package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.presentation;

import B0.A0;
import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00016B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b\u0010\u0010/R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "", "backgroundColor", "", "offsetHorizontal", "offsetTop", "offsetBottom", "", "isCentered", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO$Gravity;", "badgeGravity", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;IIIZLru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO$Gravity;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Ljava/lang/String;", "getBackgroundColor", "I", "getOffsetHorizontal", "getOffsetTop", "getOffsetBottom", "Z", "()Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO$Gravity;", "getBadgeGravity", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO$Gravity;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Gravity", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTextWithBadgeVO implements c {
    public static final int $stable = Badge.$stable | TextAtom.$stable;
    private final String backgroundColor;
    private final Badge badge;

    @NotNull
    private final Gravity badgeGravity;
    private final long id;
    private final boolean isCentered;
    private final int offsetBottom;
    private final int offsetHorizontal;
    private final int offsetTop;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final TextAtom text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO$Gravity;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_END", "END", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gravity {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Gravity[] $VALUES;
        public static final Gravity TEXT_END = new Gravity("TEXT_END", 0);
        public static final Gravity END = new Gravity("END", 1);

        private static final /* synthetic */ Gravity[] $values() {
            return new Gravity[]{TEXT_END, END};
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

    public TravelTextWithBadgeVO(long j11, @NotNull TextAtom text, Badge badge, String str, int i11, int i12, int i13, boolean z11, @NotNull Gravity badgeGravity, OnBoardingDTO onBoardingDTO) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(badgeGravity, "badgeGravity");
        this.id = j11;
        this.text = text;
        this.badge = badge;
        this.backgroundColor = str;
        this.offsetHorizontal = i11;
        this.offsetTop = i12;
        this.offsetBottom = i13;
        this.isCentered = z11;
        this.badgeGravity = badgeGravity;
        this.onboarding = onBoardingDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTextWithBadgeVO)) {
            return false;
        }
        TravelTextWithBadgeVO travelTextWithBadgeVO = (TravelTextWithBadgeVO) other;
        return this.id == travelTextWithBadgeVO.id && Intrinsics.d(this.text, travelTextWithBadgeVO.text) && Intrinsics.d(this.badge, travelTextWithBadgeVO.badge) && Intrinsics.d(this.backgroundColor, travelTextWithBadgeVO.backgroundColor) && this.offsetHorizontal == travelTextWithBadgeVO.offsetHorizontal && this.offsetTop == travelTextWithBadgeVO.offsetTop && this.offsetBottom == travelTextWithBadgeVO.offsetBottom && this.isCentered == travelTextWithBadgeVO.isCentered && this.badgeGravity == travelTextWithBadgeVO.badgeGravity && Intrinsics.d(this.onboarding, travelTextWithBadgeVO.onboarding);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getOffsetBottom() {
        return this.offsetBottom;
    }

    public final int getOffsetHorizontal() {
        return this.offsetHorizontal;
    }

    public final int getOffsetTop() {
        return this.offsetTop;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.text);
        Badge badge = this.badge;
        int hashCode = (b11 + (badge == null ? 0 : badge.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (this.badgeGravity.hashCode() + C3532b.a(C2454a.a(this.offsetBottom, C2454a.a(this.offsetTop, C2454a.a(this.offsetHorizontal, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.isCentered)) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        return hashCode2 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
    }

    /* renamed from: isCentered, reason: from getter */
    public final boolean getIsCentered() {
        return this.isCentered;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.text;
        Badge badge = this.badge;
        String str = this.backgroundColor;
        int i11 = this.offsetHorizontal;
        int i12 = this.offsetTop;
        int i13 = this.offsetBottom;
        boolean z11 = this.isCentered;
        Gravity gravity = this.badgeGravity;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        StringBuilder c11 = C2639a.c("TravelTextWithBadgeVO(id=", j11, ", text=", textAtom);
        c11.append(", badge=");
        c11.append(badge);
        c11.append(", backgroundColor=");
        c11.append(str);
        A0.c(i11, i12, ", offsetHorizontal=", ", offsetTop=", c11);
        c11.append(", offsetBottom=");
        c11.append(i13);
        c11.append(", isCentered=");
        c11.append(z11);
        c11.append(", badgeGravity=");
        c11.append(gravity);
        c11.append(", onboarding=");
        c11.append(onBoardingDTO);
        c11.append(")");
        return c11.toString();
    }
}
