package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0002)*BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;", "finalPrice", "originalPrice", "finalPriceHint", "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconWithPosition;", "icon", "", "strikethroughColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconWithPosition;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;", "getFinalPrice", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;", "getOriginalPrice", "getFinalPriceHint", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconWithPosition;", "getIcon", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconWithPosition;", "Ljava/lang/String;", "getStrikethroughColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "IconWithPosition", "IconPosition", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedPrice {
    private final AtomAction action;
    private final TextDTO description;

    @NotNull
    private final StyledText finalPrice;
    private final StyledText finalPriceHint;
    private final IconWithPosition icon;
    private final StyledText originalPrice;
    private final String strikethroughColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "AFTER_PRICE", "AFTER_DESCRIPTION", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconPosition[] $VALUES;
        public static final IconPosition AFTER_PRICE = new IconPosition("AFTER_PRICE", 0);
        public static final IconPosition AFTER_DESCRIPTION = new IconPosition("AFTER_DESCRIPTION", 1);

        private static final /* synthetic */ IconPosition[] $values() {
            return new IconPosition[]{AFTER_PRICE, AFTER_DESCRIPTION};
        }

        static {
            IconPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconPosition(String str, int i11) {
        }

        public static IconPosition valueOf(String str) {
            return (IconPosition) Enum.valueOf(IconPosition.class, str);
        }

        public static IconPosition[] values() {
            return (IconPosition[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconWithPosition;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconPosition;", "position", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconPosition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconPosition;", "getPosition", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconPosition;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconWithPosition {
        public static final int $stable = Icon.$stable;

        @NotNull
        private final Icon icon;

        @NotNull
        private final IconPosition position;

        public IconWithPosition(@NotNull Icon icon, @NotNull IconPosition position) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(position, "position");
            this.icon = icon;
            this.position = position;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconWithPosition)) {
                return false;
            }
            IconWithPosition iconWithPosition = (IconWithPosition) other;
            return Intrinsics.d(this.icon, iconWithPosition.icon) && this.position == iconWithPosition.position;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final IconPosition getPosition() {
            return this.position;
        }

        public int hashCode() {
            return this.position.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "IconWithPosition(icon=" + this.icon + ", position=" + this.position + ")";
        }
    }

    public ExtendedPrice(@NotNull StyledText finalPrice, StyledText styledText, StyledText styledText2, TextDTO textDTO, IconWithPosition iconWithPosition, String str, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.finalPrice = finalPrice;
        this.originalPrice = styledText;
        this.finalPriceHint = styledText2;
        this.description = textDTO;
        this.icon = iconWithPosition;
        this.strikethroughColor = str;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedPrice)) {
            return false;
        }
        ExtendedPrice extendedPrice = (ExtendedPrice) other;
        return Intrinsics.d(this.finalPrice, extendedPrice.finalPrice) && Intrinsics.d(this.originalPrice, extendedPrice.originalPrice) && Intrinsics.d(this.finalPriceHint, extendedPrice.finalPriceHint) && Intrinsics.d(this.description, extendedPrice.description) && Intrinsics.d(this.icon, extendedPrice.icon) && Intrinsics.d(this.strikethroughColor, extendedPrice.strikethroughColor) && Intrinsics.d(this.action, extendedPrice.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final StyledText getFinalPrice() {
        return this.finalPrice;
    }

    public final StyledText getFinalPriceHint() {
        return this.finalPriceHint;
    }

    public final IconWithPosition getIcon() {
        return this.icon;
    }

    public final StyledText getOriginalPrice() {
        return this.originalPrice;
    }

    public final String getStrikethroughColor() {
        return this.strikethroughColor;
    }

    public int hashCode() {
        int hashCode = this.finalPrice.hashCode() * 31;
        StyledText styledText = this.originalPrice;
        int hashCode2 = (hashCode + (styledText == null ? 0 : styledText.hashCode())) * 31;
        StyledText styledText2 = this.finalPriceHint;
        int hashCode3 = (hashCode2 + (styledText2 == null ? 0 : styledText2.hashCode())) * 31;
        TextDTO textDTO = this.description;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconWithPosition iconWithPosition = this.icon;
        int hashCode5 = (hashCode4 + (iconWithPosition == null ? 0 : iconWithPosition.hashCode())) * 31;
        String str = this.strikethroughColor;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return hashCode6 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StyledText styledText = this.finalPrice;
        StyledText styledText2 = this.originalPrice;
        StyledText styledText3 = this.finalPriceHint;
        TextDTO textDTO = this.description;
        IconWithPosition iconWithPosition = this.icon;
        String str = this.strikethroughColor;
        AtomAction atomAction = this.action;
        StringBuilder sb2 = new StringBuilder("ExtendedPrice(finalPrice=");
        sb2.append(styledText);
        sb2.append(", originalPrice=");
        sb2.append(styledText2);
        sb2.append(", finalPriceHint=");
        sb2.append(styledText3);
        sb2.append(", description=");
        sb2.append(textDTO);
        sb2.append(", icon=");
        sb2.append(iconWithPosition);
        sb2.append(", strikethroughColor=");
        sb2.append(str);
        sb2.append(", action=");
        return B6.b.b(sb2, atomAction, ")");
    }
}
