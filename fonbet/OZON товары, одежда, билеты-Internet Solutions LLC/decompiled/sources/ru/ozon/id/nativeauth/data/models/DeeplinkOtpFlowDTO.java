package ru.ozon.id.nativeauth.data.models;

import B0.A0;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/id/nativeauth/data/models/DeeplinkOtpFlowDTO;", "Landroid/os/Parcelable;", "deeplink", "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeeplinkOtpFlowDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeeplinkOtpFlowDTO> CREATOR = new a();

    @NotNull
    private final String deeplink;

    public static final class a implements Parcelable.Creator<DeeplinkOtpFlowDTO> {
        @Override // android.os.Parcelable.Creator
        public final DeeplinkOtpFlowDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeeplinkOtpFlowDTO(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeeplinkOtpFlowDTO[] newArray(int i11) {
            return new DeeplinkOtpFlowDTO[i11];
        }
    }

    public DeeplinkOtpFlowDTO(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.deeplink = deeplink;
    }

    public static /* synthetic */ DeeplinkOtpFlowDTO copy$default(DeeplinkOtpFlowDTO deeplinkOtpFlowDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deeplinkOtpFlowDTO.deeplink;
        }
        return deeplinkOtpFlowDTO.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final DeeplinkOtpFlowDTO copy(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new DeeplinkOtpFlowDTO(deeplink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeeplinkOtpFlowDTO) && Intrinsics.d(this.deeplink, ((DeeplinkOtpFlowDTO) other).deeplink);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public int hashCode() {
        return this.deeplink.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("DeeplinkOtpFlowDTO(deeplink=", this.deeplink, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.deeplink);
    }
}
