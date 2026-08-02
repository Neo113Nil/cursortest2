package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import B0.C2454a;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionSelectionPayload;", "", "", "updatedIndicatorTabPosition", "passengerPosition", "optionItemPosition", "", "formattedPrice", "", "isPriceDecreased", "<init>", "(Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/CharSequence;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getUpdatedIndicatorTabPosition", "()Ljava/lang/Integer;", "I", "getPassengerPosition", "getOptionItemPosition", "Ljava/lang/CharSequence;", "getFormattedPrice", "()Ljava/lang/CharSequence;", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalLuggageV2OptionSelectionPayload {

    @NotNull
    private final CharSequence formattedPrice;
    private final boolean isPriceDecreased;
    private final Integer optionItemPosition;
    private final int passengerPosition;
    private final Integer updatedIndicatorTabPosition;

    public AdditionalLuggageV2OptionSelectionPayload(Integer num, int i11, Integer num2, @NotNull CharSequence formattedPrice, boolean z11) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        this.updatedIndicatorTabPosition = num;
        this.passengerPosition = i11;
        this.optionItemPosition = num2;
        this.formattedPrice = formattedPrice;
        this.isPriceDecreased = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalLuggageV2OptionSelectionPayload)) {
            return false;
        }
        AdditionalLuggageV2OptionSelectionPayload additionalLuggageV2OptionSelectionPayload = (AdditionalLuggageV2OptionSelectionPayload) other;
        return Intrinsics.d(this.updatedIndicatorTabPosition, additionalLuggageV2OptionSelectionPayload.updatedIndicatorTabPosition) && this.passengerPosition == additionalLuggageV2OptionSelectionPayload.passengerPosition && Intrinsics.d(this.optionItemPosition, additionalLuggageV2OptionSelectionPayload.optionItemPosition) && Intrinsics.d(this.formattedPrice, additionalLuggageV2OptionSelectionPayload.formattedPrice) && this.isPriceDecreased == additionalLuggageV2OptionSelectionPayload.isPriceDecreased;
    }

    @NotNull
    public final CharSequence getFormattedPrice() {
        return this.formattedPrice;
    }

    public final Integer getOptionItemPosition() {
        return this.optionItemPosition;
    }

    public final int getPassengerPosition() {
        return this.passengerPosition;
    }

    public final Integer getUpdatedIndicatorTabPosition() {
        return this.updatedIndicatorTabPosition;
    }

    public int hashCode() {
        Integer num = this.updatedIndicatorTabPosition;
        int a11 = C2454a.a(this.passengerPosition, (num == null ? 0 : num.hashCode()) * 31, 31);
        Integer num2 = this.optionItemPosition;
        return Boolean.hashCode(this.isPriceDecreased) + ((this.formattedPrice.hashCode() + ((a11 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31);
    }

    /* renamed from: isPriceDecreased, reason: from getter */
    public final boolean getIsPriceDecreased() {
        return this.isPriceDecreased;
    }

    @NotNull
    public String toString() {
        Integer num = this.updatedIndicatorTabPosition;
        int i11 = this.passengerPosition;
        Integer num2 = this.optionItemPosition;
        CharSequence charSequence = this.formattedPrice;
        boolean z11 = this.isPriceDecreased;
        StringBuilder sb2 = new StringBuilder("AdditionalLuggageV2OptionSelectionPayload(updatedIndicatorTabPosition=");
        sb2.append(num);
        sb2.append(", passengerPosition=");
        sb2.append(i11);
        sb2.append(", optionItemPosition=");
        sb2.append(num2);
        sb2.append(", formattedPrice=");
        sb2.append((Object) charSequence);
        sb2.append(", isPriceDecreased=");
        return a.a(")", sb2, z11);
    }
}
