package spay.sdk.data.dto.response;

import C.o0;
import J8.b;
import N3.C3660k;
import Ve.C4452mn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.data.dto.response.paymentToken.FraudMonCheckResultResponseBodyDto;
import spay.sdk.domain.model.response.SPayApiError;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\b\u0010 \u001a\u00020\u0002H\u0016J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006'"}, d2 = {"Lspay/sdk/data/dto/response/SPayErrorDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPayApiError;", "Landroid/os/Parcelable;", "errorCode", "", "description", "fraudMonCheckResultResponseBodyDto", "Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;", "oldFraudMonCheckResultResponseBodyDto", "info", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "getFraudMonCheckResultResponseBodyDto", "()Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;", "getInfo", "getOldFraudMonCheckResultResponseBodyDto", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toModel", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SPayErrorDto implements DataDtoInterface<SPayApiError>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<SPayErrorDto> CREATOR = new Creator();

    @b("description")
    private final String description;

    @b("errorCode")
    private final String errorCode;

    @b("fraudMonCheckResult")
    private final FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto;

    @b("info")
    private final String info;

    @b("fraudMonСheckResult")
    private final FraudMonCheckResultResponseBodyDto oldFraudMonCheckResultResponseBodyDto;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SPayErrorDto> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SPayErrorDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SPayErrorDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FraudMonCheckResultResponseBodyDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FraudMonCheckResultResponseBodyDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SPayErrorDto[] newArray(int i11) {
            return new SPayErrorDto[i11];
        }
    }

    public SPayErrorDto(String str, String str2, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2, String str3) {
        this.errorCode = str;
        this.description = str2;
        this.fraudMonCheckResultResponseBodyDto = fraudMonCheckResultResponseBodyDto;
        this.oldFraudMonCheckResultResponseBodyDto = fraudMonCheckResultResponseBodyDto2;
        this.info = str3;
    }

    public static /* synthetic */ SPayErrorDto copy$default(SPayErrorDto sPayErrorDto, String str, String str2, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sPayErrorDto.errorCode;
        }
        if ((i11 & 2) != 0) {
            str2 = sPayErrorDto.description;
        }
        if ((i11 & 4) != 0) {
            fraudMonCheckResultResponseBodyDto = sPayErrorDto.fraudMonCheckResultResponseBodyDto;
        }
        if ((i11 & 8) != 0) {
            fraudMonCheckResultResponseBodyDto2 = sPayErrorDto.oldFraudMonCheckResultResponseBodyDto;
        }
        if ((i11 & 16) != 0) {
            str3 = sPayErrorDto.info;
        }
        String str4 = str3;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto3 = fraudMonCheckResultResponseBodyDto;
        return sPayErrorDto.copy(str, str2, fraudMonCheckResultResponseBodyDto3, fraudMonCheckResultResponseBodyDto2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final FraudMonCheckResultResponseBodyDto getFraudMonCheckResultResponseBodyDto() {
        return this.fraudMonCheckResultResponseBodyDto;
    }

    /* renamed from: component4, reason: from getter */
    public final FraudMonCheckResultResponseBodyDto getOldFraudMonCheckResultResponseBodyDto() {
        return this.oldFraudMonCheckResultResponseBodyDto;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final SPayErrorDto copy(String errorCode, String description, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, FraudMonCheckResultResponseBodyDto oldFraudMonCheckResultResponseBodyDto, String info) {
        return new SPayErrorDto(errorCode, description, fraudMonCheckResultResponseBodyDto, oldFraudMonCheckResultResponseBodyDto, info);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPayErrorDto)) {
            return false;
        }
        SPayErrorDto sPayErrorDto = (SPayErrorDto) other;
        return Intrinsics.d(this.errorCode, sPayErrorDto.errorCode) && Intrinsics.d(this.description, sPayErrorDto.description) && Intrinsics.d(this.fraudMonCheckResultResponseBodyDto, sPayErrorDto.fraudMonCheckResultResponseBodyDto) && Intrinsics.d(this.oldFraudMonCheckResultResponseBodyDto, sPayErrorDto.oldFraudMonCheckResultResponseBodyDto) && Intrinsics.d(this.info, sPayErrorDto.info);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final FraudMonCheckResultResponseBodyDto getFraudMonCheckResultResponseBodyDto() {
        return this.fraudMonCheckResultResponseBodyDto;
    }

    public final String getInfo() {
        return this.info;
    }

    public final FraudMonCheckResultResponseBodyDto getOldFraudMonCheckResultResponseBodyDto() {
        return this.oldFraudMonCheckResultResponseBodyDto;
    }

    public int hashCode() {
        String str = this.errorCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = this.fraudMonCheckResultResponseBodyDto;
        int hashCode3 = (hashCode2 + (fraudMonCheckResultResponseBodyDto == null ? 0 : fraudMonCheckResultResponseBodyDto.hashCode())) * 31;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2 = this.oldFraudMonCheckResultResponseBodyDto;
        int hashCode4 = (hashCode3 + (fraudMonCheckResultResponseBodyDto2 == null ? 0 : fraudMonCheckResultResponseBodyDto2.hashCode())) * 31;
        String str3 = this.info;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.errorCode;
        String str2 = this.description;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = this.fraudMonCheckResultResponseBodyDto;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2 = this.oldFraudMonCheckResultResponseBodyDto;
        String str3 = this.info;
        StringBuilder d11 = C3660k.d("SPayErrorDto(errorCode=", str, ", description=", str2, ", fraudMonCheckResultResponseBodyDto=");
        d11.append(fraudMonCheckResultResponseBodyDto);
        d11.append(", oldFraudMonCheckResultResponseBodyDto=");
        d11.append(fraudMonCheckResultResponseBodyDto2);
        d11.append(", info=");
        return o0.c(d11, str3, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.errorCode);
        parcel.writeString(this.description);
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = this.fraudMonCheckResultResponseBodyDto;
        if (fraudMonCheckResultResponseBodyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fraudMonCheckResultResponseBodyDto.writeToParcel(parcel, flags);
        }
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2 = this.oldFraudMonCheckResultResponseBodyDto;
        if (fraudMonCheckResultResponseBodyDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fraudMonCheckResultResponseBodyDto2.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.info);
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public SPayApiError toModel() {
        String str = this.errorCode;
        if (str == null) {
            throw new C4452mn("errorCode");
        }
        String str2 = this.description;
        FraudMonCheckResultResponseBodyDto findOutCurrentVerdict = SPayErrorDtoKt.findOutCurrentVerdict(this);
        return new SPayApiError(str, str2, findOutCurrentVerdict != null ? findOutCurrentVerdict.toModel() : null, this.info);
    }
}
