package spay.seamlessAuth.core.data.network.dto;

import C.J;
import J8.b;
import Nh.a;
import Ve.C4207e9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.data.dto.response.DataDtoInterface;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B=\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0016¨\u0006/"}, d2 = {"Lspay/seamlessAuth/core/data/network/dto/ExchangeTokenResponseDto;", "Landroid/os/Parcelable;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "LVe/e9;", "", "exchangeToken", "", "Lspay/seamlessAuth/core/data/network/dto/ScopeItemDto;", "scope", "tokenType", "", "expiresIn", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "toModel", "()LVe/e9;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lspay/seamlessAuth/core/data/network/dto/ExchangeTokenResponseDto;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getExchangeToken", "Ljava/util/List;", "getScope", "getTokenType", "Ljava/lang/Integer;", "getExpiresIn", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ExchangeTokenResponseDto implements Parcelable, DataDtoInterface<C4207e9> {

    @NotNull
    public static final Parcelable.Creator<ExchangeTokenResponseDto> CREATOR = new Creator();

    @b("access_token")
    private final String exchangeToken;

    @b("expires_in")
    private final Integer expiresIn;

    @b("scope")
    private final List<ScopeItemDto> scope;

    @b("token_type")
    private final String tokenType;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExchangeTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExchangeTokenResponseDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = Ak.b.b(ScopeItemDto.CREATOR, parcel, arrayList, i11, 1);
                }
            }
            return new ExchangeTokenResponseDto(readString, arrayList, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExchangeTokenResponseDto[] newArray(int i11) {
            return new ExchangeTokenResponseDto[i11];
        }
    }

    public ExchangeTokenResponseDto() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExchangeTokenResponseDto copy$default(ExchangeTokenResponseDto exchangeTokenResponseDto, String str, List list, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = exchangeTokenResponseDto.exchangeToken;
        }
        if ((i11 & 2) != 0) {
            list = exchangeTokenResponseDto.scope;
        }
        if ((i11 & 4) != 0) {
            str2 = exchangeTokenResponseDto.tokenType;
        }
        if ((i11 & 8) != 0) {
            num = exchangeTokenResponseDto.expiresIn;
        }
        return exchangeTokenResponseDto.copy(str, list, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExchangeToken() {
        return this.exchangeToken;
    }

    public final List<ScopeItemDto> component2() {
        return this.scope;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    public final ExchangeTokenResponseDto copy(String exchangeToken, List<ScopeItemDto> scope, String tokenType, Integer expiresIn) {
        return new ExchangeTokenResponseDto(exchangeToken, scope, tokenType, expiresIn);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeTokenResponseDto)) {
            return false;
        }
        ExchangeTokenResponseDto exchangeTokenResponseDto = (ExchangeTokenResponseDto) other;
        return Intrinsics.d(this.exchangeToken, exchangeTokenResponseDto.exchangeToken) && Intrinsics.d(this.scope, exchangeTokenResponseDto.scope) && Intrinsics.d(this.tokenType, exchangeTokenResponseDto.tokenType) && Intrinsics.d(this.expiresIn, exchangeTokenResponseDto.expiresIn);
    }

    public final String getExchangeToken() {
        return this.exchangeToken;
    }

    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    public final List<ScopeItemDto> getScope() {
        return this.scope;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        String str = this.exchangeToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ScopeItemDto> list = this.scope;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.tokenType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.expiresIn;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.exchangeToken;
        List<ScopeItemDto> list = this.scope;
        String str2 = this.tokenType;
        Integer num = this.expiresIn;
        StringBuilder f7 = Tl.b.f("ExchangeTokenResponseDto(exchangeToken=", str, ", scope=", ", tokenType=", list);
        f7.append(str2);
        f7.append(", expiresIn=");
        f7.append(num);
        f7.append(")");
        return f7.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.exchangeToken);
        List<ScopeItemDto> list = this.scope;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator c11 = J.c(parcel, 1, list);
            while (c11.hasNext()) {
                ((ScopeItemDto) c11.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.tokenType);
        Integer num = this.expiresIn;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.f(parcel, 1, num);
        }
    }

    public ExchangeTokenResponseDto(String str, List<ScopeItemDto> list, String str2, Integer num) {
        this.exchangeToken = str;
        this.scope = list;
        this.tokenType = str2;
        this.expiresIn = num;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public C4207e9 toModel() {
        return new C4207e9(this.exchangeToken, ScopeItemDtoKt.toModelList(this.scope), this.tokenType, this.expiresIn);
    }

    public /* synthetic */ ExchangeTokenResponseDto(String str, List list, String str2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : num);
    }
}
