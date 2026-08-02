package ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.api;

import HY.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputRequest;", "", DynamicElementDTO.FORM, "", "", "<init>", "(Ljava/util/Map;)V", "getForm", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddressPartsInputRequest {
    public static final int $stable = 8;

    @NotNull
    private final Map<String, String> form;

    public AddressPartsInputRequest(@NotNull Map<String, String> form) {
        Intrinsics.checkNotNullParameter(form, "form");
        this.form = form;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressPartsInputRequest copy$default(AddressPartsInputRequest addressPartsInputRequest, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = addressPartsInputRequest.form;
        }
        return addressPartsInputRequest.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.form;
    }

    @NotNull
    public final AddressPartsInputRequest copy(@NotNull Map<String, String> form) {
        Intrinsics.checkNotNullParameter(form, "form");
        return new AddressPartsInputRequest(form);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddressPartsInputRequest) && Intrinsics.d(this.form, ((AddressPartsInputRequest) other).form);
    }

    @NotNull
    public final Map<String, String> getForm() {
        return this.form;
    }

    public int hashCode() {
        return this.form.hashCode();
    }

    @NotNull
    public String toString() {
        return b.b("AddressPartsInputRequest(form=", ")", this.form);
    }
}
