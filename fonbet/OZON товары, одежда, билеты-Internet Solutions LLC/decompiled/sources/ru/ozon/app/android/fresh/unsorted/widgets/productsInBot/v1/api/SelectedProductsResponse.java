package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.model.Restriction;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/api/SelectedProductsResponse;", "", "success", "", "error", "Lru/ozon/uni/android/flashbar/model/Restriction;", "<init>", "(ZLru/ozon/uni/android/flashbar/model/Restriction;)V", "getSuccess", "()Z", "getError", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SelectedProductsResponse {
    public static final int $stable = Restriction.$stable;
    private final Restriction error;
    private final boolean success;

    public SelectedProductsResponse(boolean z11, Restriction restriction) {
        this.success = z11;
        this.error = restriction;
    }

    public static /* synthetic */ SelectedProductsResponse copy$default(SelectedProductsResponse selectedProductsResponse, boolean z11, Restriction restriction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = selectedProductsResponse.success;
        }
        if ((i11 & 2) != 0) {
            restriction = selectedProductsResponse.error;
        }
        return selectedProductsResponse.copy(z11, restriction);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final Restriction getError() {
        return this.error;
    }

    @NotNull
    public final SelectedProductsResponse copy(boolean success, Restriction error) {
        return new SelectedProductsResponse(success, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedProductsResponse)) {
            return false;
        }
        SelectedProductsResponse selectedProductsResponse = (SelectedProductsResponse) other;
        return this.success == selectedProductsResponse.success && Intrinsics.d(this.error, selectedProductsResponse.error);
    }

    public final Restriction getError() {
        return this.error;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.success) * 31;
        Restriction restriction = this.error;
        return hashCode + (restriction == null ? 0 : restriction.hashCode());
    }

    @NotNull
    public String toString() {
        return "SelectedProductsResponse(success=" + this.success + ", error=" + this.error + ")";
    }
}
