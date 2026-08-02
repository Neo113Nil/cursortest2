package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelAddEmailParam;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isTouched", "", "<init>", "(Ljava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TravelAddEmailParam {
    public static final int $stable = 0;
    private final boolean isTouched;

    @NotNull
    private final String value;

    public TravelAddEmailParam(@NotNull String value, boolean z11) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.isTouched = z11;
    }

    public static /* synthetic */ TravelAddEmailParam copy$default(TravelAddEmailParam travelAddEmailParam, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = travelAddEmailParam.value;
        }
        if ((i11 & 2) != 0) {
            z11 = travelAddEmailParam.isTouched;
        }
        return travelAddEmailParam.copy(str, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTouched() {
        return this.isTouched;
    }

    @NotNull
    public final TravelAddEmailParam copy(@NotNull String value, boolean isTouched) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new TravelAddEmailParam(value, isTouched);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelAddEmailParam)) {
            return false;
        }
        TravelAddEmailParam travelAddEmailParam = (TravelAddEmailParam) other;
        return Intrinsics.d(this.value, travelAddEmailParam.value) && this.isTouched == travelAddEmailParam.isTouched;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTouched) + (this.value.hashCode() * 31);
    }

    public final boolean isTouched() {
        return this.isTouched;
    }

    @NotNull
    public String toString() {
        return b.f("TravelAddEmailParam(value=", this.value, ", isTouched=", ")", this.isTouched);
    }

    public /* synthetic */ TravelAddEmailParam(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? true : z11);
    }
}
