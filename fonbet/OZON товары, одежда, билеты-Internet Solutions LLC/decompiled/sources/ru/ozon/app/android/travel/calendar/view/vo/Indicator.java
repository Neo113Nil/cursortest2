package ru.ozon.app.android.travel.calendar.view.vo;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/vo/Indicator;", "", "PriceIndicator", "ColorIndicator", "TextIndicator", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$PriceIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$TextIndicator;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Indicator {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator;", "", "categoryName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCategoryName", "()Ljava/lang/String;", "LOW", "MEDIUM", "HIGH", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ColorIndicator implements Indicator {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ColorIndicator[] $VALUES;

        @NotNull
        private final String categoryName;
        public static final ColorIndicator LOW = new ColorIndicator("LOW", 0, "LOW");
        public static final ColorIndicator MEDIUM = new ColorIndicator("MEDIUM", 1, "MEDIUM");
        public static final ColorIndicator HIGH = new ColorIndicator("HIGH", 2, "HIGH");

        private static final /* synthetic */ ColorIndicator[] $values() {
            return new ColorIndicator[]{LOW, MEDIUM, HIGH};
        }

        static {
            ColorIndicator[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ColorIndicator(String str, int i11, String str2) {
            this.categoryName = str2;
        }

        public static ColorIndicator valueOf(String str) {
            return (ColorIndicator) Enum.valueOf(ColorIndicator.class, str);
        }

        public static ColorIndicator[] values() {
            return (ColorIndicator[]) $VALUES.clone();
        }

        @NotNull
        public final String getCategoryName() {
            return this.categoryName;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/vo/Indicator$PriceIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "", "unformattedPriceValue", "", "isMin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;FZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "F", "getUnformattedPriceValue", "()F", "Z", "()Z", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceIndicator implements Indicator {
        private final boolean isMin;

        @NotNull
        private final TextDTO price;
        private final float unformattedPriceValue;

        public PriceIndicator(@NotNull TextDTO price, float f7, boolean z11) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.unformattedPriceValue = f7;
            this.isMin = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceIndicator)) {
                return false;
            }
            PriceIndicator priceIndicator = (PriceIndicator) other;
            return Intrinsics.d(this.price, priceIndicator.price) && Float.compare(this.unformattedPriceValue, priceIndicator.unformattedPriceValue) == 0 && this.isMin == priceIndicator.isMin;
        }

        @NotNull
        public final TextDTO getPrice() {
            return this.price;
        }

        public final float getUnformattedPriceValue() {
            return this.unformattedPriceValue;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMin) + Pk0.b.a(this.unformattedPriceValue, this.price.hashCode() * 31, 31);
        }

        /* renamed from: isMin, reason: from getter */
        public final boolean getIsMin() {
            return this.isMin;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.price;
            float f7 = this.unformattedPriceValue;
            boolean z11 = this.isMin;
            StringBuilder sb2 = new StringBuilder("PriceIndicator(price=");
            sb2.append(textDTO);
            sb2.append(", unformattedPriceValue=");
            sb2.append(f7);
            sb2.append(", isMin=");
            return Pk0.a.a(")", sb2, z11);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/vo/Indicator$TextIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextIndicator implements Indicator {

        @NotNull
        private final TextDTO text;

        public TextIndicator(@NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextIndicator) && Intrinsics.d(this.text, ((TextIndicator) other).text);
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return "TextIndicator(text=" + this.text + ")";
        }
    }
}
