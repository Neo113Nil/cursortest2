package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/flights/FlightLuggageSelectionPayload;", "", "", "optionItemPosition", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getOptionItemPosition", "()Ljava/lang/Integer;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightLuggageSelectionPayload {
    private final Integer optionItemPosition;

    public FlightLuggageSelectionPayload(Integer num) {
        this.optionItemPosition = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FlightLuggageSelectionPayload) && Intrinsics.d(this.optionItemPosition, ((FlightLuggageSelectionPayload) other).optionItemPosition);
    }

    public final Integer getOptionItemPosition() {
        return this.optionItemPosition;
    }

    public int hashCode() {
        Integer num = this.optionItemPosition;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "FlightLuggageSelectionPayload(optionItemPosition=" + this.optionItemPosition + ")";
    }
}
