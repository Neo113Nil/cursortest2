package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderCounter.data;

import T7.E;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderCounter/data/UnpaidOrderCounterDTO;", "", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UnpaidOrderCounterDTO {
    public static final int $stable = 0;
    private final int count;

    public UnpaidOrderCounterDTO() {
        this(0, 1, null);
    }

    public static /* synthetic */ UnpaidOrderCounterDTO copy$default(UnpaidOrderCounterDTO unpaidOrderCounterDTO, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = unpaidOrderCounterDTO.count;
        }
        return unpaidOrderCounterDTO.copy(i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final UnpaidOrderCounterDTO copy(int count) {
        return new UnpaidOrderCounterDTO(count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UnpaidOrderCounterDTO) && this.count == ((UnpaidOrderCounterDTO) other).count;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    @NotNull
    public String toString() {
        return E.a(this.count, "UnpaidOrderCounterDTO(count=", ")");
    }

    public UnpaidOrderCounterDTO(int i11) {
        this.count = i11;
    }

    public /* synthetic */ UnpaidOrderCounterDTO(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
