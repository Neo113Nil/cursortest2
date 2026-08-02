package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts;

import H3.c;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/contacts/RequestPhotoData;", "", "phones", "", "", "<init>", "(Ljava/util/List;)V", "getPhones", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestPhotoData {

    @NotNull
    private final List<String> phones;

    public RequestPhotoData(@i(name = "phones") @NotNull List<String> phones) {
        Intrinsics.checkNotNullParameter(phones, "phones");
        this.phones = phones;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestPhotoData copy$default(RequestPhotoData requestPhotoData, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = requestPhotoData.phones;
        }
        return requestPhotoData.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.phones;
    }

    @NotNull
    public final RequestPhotoData copy(@i(name = "phones") @NotNull List<String> phones) {
        Intrinsics.checkNotNullParameter(phones, "phones");
        return new RequestPhotoData(phones);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestPhotoData) && Intrinsics.d(this.phones, ((RequestPhotoData) other).phones);
    }

    @NotNull
    public final List<String> getPhones() {
        return this.phones;
    }

    public int hashCode() {
        return this.phones.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("RequestPhotoData(phones=", ")", this.phones);
    }
}
