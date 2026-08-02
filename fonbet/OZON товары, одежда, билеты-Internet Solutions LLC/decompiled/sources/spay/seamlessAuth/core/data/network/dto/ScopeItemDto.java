package spay.seamlessAuth.core.data.network.dto;

import B0.A0;
import J8.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.seamlessAuth.core.data.network.request.ScopeItem;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lspay/seamlessAuth/core/data/network/dto/ScopeItemDto;", "Landroid/os/Parcelable;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/seamlessAuth/core/data/network/request/ScopeItem;", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toModel", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ScopeItemDto implements Parcelable, DataDtoInterface<ScopeItem> {

    @NotNull
    public static final Parcelable.Creator<ScopeItemDto> CREATOR = new Creator();

    @b("type")
    private final String type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScopeItemDto> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScopeItemDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScopeItemDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScopeItemDto[] newArray(int i11) {
            return new ScopeItemDto[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeItemDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScopeItemDto copy$default(ScopeItemDto scopeItemDto, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = scopeItemDto.type;
        }
        return scopeItemDto.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final ScopeItemDto copy(String type) {
        return new ScopeItemDto(type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ScopeItemDto) && Intrinsics.d(this.type, ((ScopeItemDto) other).type);
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("ScopeItemDto(type=", this.type, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.type);
    }

    public ScopeItemDto(String str) {
        this.type = str;
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public ScopeItem toModel() {
        return new ScopeItem(this.type);
    }

    public /* synthetic */ ScopeItemDto(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }
}
