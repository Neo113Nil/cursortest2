package ru.ozon.app.android.fresh.main.widgets.addressCommunication.data;

import B90.C2618u;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/AddressCommunicationResponse;", "", "show", "", "<init>", "(Z)V", "getShow", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressCommunicationResponse {
    private final boolean show;

    public AddressCommunicationResponse(boolean z11) {
        this.show = z11;
    }

    public static /* synthetic */ AddressCommunicationResponse copy$default(AddressCommunicationResponse addressCommunicationResponse, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = addressCommunicationResponse.show;
        }
        return addressCommunicationResponse.copy(z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    public final AddressCommunicationResponse copy(boolean show) {
        return new AddressCommunicationResponse(show);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddressCommunicationResponse) && this.show == ((AddressCommunicationResponse) other).show;
    }

    public final boolean getShow() {
        return this.show;
    }

    public int hashCode() {
        return Boolean.hashCode(this.show);
    }

    @NotNull
    public String toString() {
        return C2618u.g("AddressCommunicationResponse(show=", ")", this.show);
    }
}
