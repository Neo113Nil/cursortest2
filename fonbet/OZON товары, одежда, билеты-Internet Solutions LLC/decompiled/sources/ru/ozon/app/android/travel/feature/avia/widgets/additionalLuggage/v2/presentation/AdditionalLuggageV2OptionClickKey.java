package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import A00.a;
import B0.C2454a;
import Kk.C3532b;
import Ql.c;
import T7.P;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010%\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey;", "LA00/a$J$a;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey$Indicator;", "indicator", "", "passengerPosition", "luggagePosition", "", "isSelected", "totalPrice", "", "formattedTotalPrice", "", "", "", "addedLuggage", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey$Indicator;IIZILjava/lang/CharSequence;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey$Indicator;", "getIndicator", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey$Indicator;", "I", "getPassengerPosition", "getLuggagePosition", "Z", "()Z", "getTotalPrice", "Ljava/lang/CharSequence;", "getFormattedTotalPrice", "()Ljava/lang/CharSequence;", "Ljava/util/Map;", "getAddedLuggage", "()Ljava/util/Map;", "Indicator", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdditionalLuggageV2OptionClickKey implements a.J.InterfaceC0007a {

    @NotNull
    private final Map<Integer, Set<String>> addedLuggage;

    @NotNull
    private final CharSequence formattedTotalPrice;
    private final Indicator indicator;
    private final boolean isSelected;
    private final int luggagePosition;
    private final int passengerPosition;
    private final int totalPrice;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey$Indicator;", "", "", "position", "", "hasAddedLuggage", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "Z", "getHasAddedLuggage", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class Indicator {
        private final boolean hasAddedLuggage;
        private final int position;

        public Indicator(int i11, boolean z11) {
            this.position = i11;
            this.hasAddedLuggage = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Indicator)) {
                return false;
            }
            Indicator indicator = (Indicator) other;
            return this.position == indicator.position && this.hasAddedLuggage == indicator.hasAddedLuggage;
        }

        public final boolean getHasAddedLuggage() {
            return this.hasAddedLuggage;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasAddedLuggage) + (Integer.hashCode(this.position) * 31);
        }

        @NotNull
        public String toString() {
            return "Indicator(position=" + this.position + ", hasAddedLuggage=" + this.hasAddedLuggage + ")";
        }
    }

    public AdditionalLuggageV2OptionClickKey(Indicator indicator, int i11, int i12, boolean z11, int i13, @NotNull CharSequence formattedTotalPrice, @NotNull Map<Integer, Set<String>> addedLuggage) {
        Intrinsics.checkNotNullParameter(formattedTotalPrice, "formattedTotalPrice");
        Intrinsics.checkNotNullParameter(addedLuggage, "addedLuggage");
        this.indicator = indicator;
        this.passengerPosition = i11;
        this.luggagePosition = i12;
        this.isSelected = z11;
        this.totalPrice = i13;
        this.formattedTotalPrice = formattedTotalPrice;
        this.addedLuggage = addedLuggage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalLuggageV2OptionClickKey)) {
            return false;
        }
        AdditionalLuggageV2OptionClickKey additionalLuggageV2OptionClickKey = (AdditionalLuggageV2OptionClickKey) other;
        return Intrinsics.d(this.indicator, additionalLuggageV2OptionClickKey.indicator) && this.passengerPosition == additionalLuggageV2OptionClickKey.passengerPosition && this.luggagePosition == additionalLuggageV2OptionClickKey.luggagePosition && this.isSelected == additionalLuggageV2OptionClickKey.isSelected && this.totalPrice == additionalLuggageV2OptionClickKey.totalPrice && Intrinsics.d(this.formattedTotalPrice, additionalLuggageV2OptionClickKey.formattedTotalPrice) && Intrinsics.d(this.addedLuggage, additionalLuggageV2OptionClickKey.addedLuggage);
    }

    @NotNull
    public final Map<Integer, Set<String>> getAddedLuggage() {
        return this.addedLuggage;
    }

    @NotNull
    public final CharSequence getFormattedTotalPrice() {
        return this.formattedTotalPrice;
    }

    public final Indicator getIndicator() {
        return this.indicator;
    }

    public final int getLuggagePosition() {
        return this.luggagePosition;
    }

    public final int getPassengerPosition() {
        return this.passengerPosition;
    }

    public final int getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        Indicator indicator = this.indicator;
        return this.addedLuggage.hashCode() + ((this.formattedTotalPrice.hashCode() + C2454a.a(this.totalPrice, C3532b.a(C2454a.a(this.luggagePosition, C2454a.a(this.passengerPosition, (indicator == null ? 0 : indicator.hashCode()) * 31, 31), 31), 31, this.isSelected), 31)) * 31);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        Indicator indicator = this.indicator;
        int i11 = this.passengerPosition;
        int i12 = this.luggagePosition;
        boolean z11 = this.isSelected;
        int i13 = this.totalPrice;
        CharSequence charSequence = this.formattedTotalPrice;
        Map<Integer, Set<String>> map = this.addedLuggage;
        StringBuilder sb2 = new StringBuilder("AdditionalLuggageV2OptionClickKey(indicator=");
        sb2.append(indicator);
        sb2.append(", passengerPosition=");
        sb2.append(i11);
        sb2.append(", luggagePosition=");
        c.d(sb2, i12, ", isSelected=", z11, ", totalPrice=");
        sb2.append(i13);
        sb2.append(", formattedTotalPrice=");
        sb2.append((Object) charSequence);
        sb2.append(", addedLuggage=");
        return P.f(sb2, map, ")");
    }
}
