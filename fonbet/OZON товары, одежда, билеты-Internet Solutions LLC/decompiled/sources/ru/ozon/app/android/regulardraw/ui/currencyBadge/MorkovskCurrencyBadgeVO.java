package ru.ozon.app.android.regulardraw.ui.currencyBadge;

import G.g;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "image", "bgColor", "textColor", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO$Size;", "size", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO$Size;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getImage", "getBgColor", "getTextColor", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO$Size;", "getSize", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO$Size;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Size", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskCurrencyBadgeVO {
    public static final int $stable = AtomAction.$stable;
    private final AtomAction atomAction;

    @NotNull
    private final String bgColor;

    @NotNull
    private final String image;

    @NotNull
    private final Size size;

    @NotNull
    private final String textColor;

    @NotNull
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SMALL", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size DEFAULT = new Size("DEFAULT", 0);
        public static final Size SMALL = new Size("SMALL", 1);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{DEFAULT, SMALL};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11) {
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public MorkovskCurrencyBadgeVO(@NotNull String value, @NotNull String image, @NotNull String bgColor, @NotNull String textColor, @NotNull Size size, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(size, "size");
        this.value = value;
        this.image = image;
        this.bgColor = bgColor;
        this.textColor = textColor;
        this.size = size;
        this.atomAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskCurrencyBadgeVO)) {
            return false;
        }
        MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO = (MorkovskCurrencyBadgeVO) other;
        return Intrinsics.d(this.value, morkovskCurrencyBadgeVO.value) && Intrinsics.d(this.image, morkovskCurrencyBadgeVO.image) && Intrinsics.d(this.bgColor, morkovskCurrencyBadgeVO.bgColor) && Intrinsics.d(this.textColor, morkovskCurrencyBadgeVO.textColor) && this.size == morkovskCurrencyBadgeVO.size && Intrinsics.d(this.atomAction, morkovskCurrencyBadgeVO.atomAction);
    }

    public final AtomAction getAtomAction() {
        return this.atomAction;
    }

    @NotNull
    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = (this.size.hashCode() + g.a(g.a(g.a(this.value.hashCode() * 31, 31, this.image), 31, this.bgColor), 31, this.textColor)) * 31;
        AtomAction atomAction = this.atomAction;
        return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.image;
        String str3 = this.bgColor;
        String str4 = this.textColor;
        Size size = this.size;
        AtomAction atomAction = this.atomAction;
        StringBuilder d11 = C3660k.d("MorkovskCurrencyBadgeVO(value=", str, ", image=", str2, ", bgColor=");
        Nh.a.h(d11, str3, ", textColor=", str4, ", size=");
        d11.append(size);
        d11.append(", atomAction=");
        d11.append(atomAction);
        d11.append(")");
        return d11.toString();
    }
}
