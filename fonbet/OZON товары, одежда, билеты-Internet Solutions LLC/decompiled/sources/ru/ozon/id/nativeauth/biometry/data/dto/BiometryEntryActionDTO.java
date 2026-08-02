package ru.ozon.id.nativeauth.biometry.data.dto;

import B90.C2618u;
import D3.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO;", "Lru/ozon/id/nativeauth/data/models/AuthActionDTO;", "status", "Lru/ozon/id/nativeauth/data/models/AuthActionDTO$StatusDTO;", "data", "Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO;", "error", "Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO;", "<init>", "(Lru/ozon/id/nativeauth/data/models/AuthActionDTO$StatusDTO;Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO;Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO;)V", "getStatus", "()Lru/ozon/id/nativeauth/data/models/AuthActionDTO$StatusDTO;", "getData", "()Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO;", "getError", "()Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "DataDTO", "ErrorDTO", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BiometryEntryActionDTO implements AuthActionDTO {
    private final DataDTO data;
    private final ErrorDTO error;
    private final AuthActionDTO.StatusDTO status;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010\u000f¨\u0006\""}, d2 = {"Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO;", "Lru/ozon/id/nativeauth/data/models/AuthActionDTO$a;", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "authToken", "Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO$Biometry;", "biometry", "", "isRegister", "<init>", "(Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO$Biometry;Ljava/lang/Boolean;)V", "component1", "()Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "component2", "()Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO$Biometry;", "component3", "()Ljava/lang/Boolean;", "copy", "(Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO$Biometry;Ljava/lang/Boolean;)Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "getAuthToken", "Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO$Biometry;", "getBiometry", "Ljava/lang/Boolean;", "Biometry", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class DataDTO implements AuthActionDTO.a {
        private final AuthTokenDTO authToken;
        private final Biometry biometry;
        private final Boolean isRegister;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$DataDTO$Biometry;", "", "clearDevicePublicKey", "", "<init>", "(Z)V", "getClearDevicePublicKey", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Biometry {
            private final boolean clearDevicePublicKey;

            public Biometry(boolean z11) {
                this.clearDevicePublicKey = z11;
            }

            public static /* synthetic */ Biometry copy$default(Biometry biometry, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = biometry.clearDevicePublicKey;
                }
                return biometry.copy(z11);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getClearDevicePublicKey() {
                return this.clearDevicePublicKey;
            }

            @NotNull
            public final Biometry copy(boolean clearDevicePublicKey) {
                return new Biometry(clearDevicePublicKey);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Biometry) && this.clearDevicePublicKey == ((Biometry) other).clearDevicePublicKey;
            }

            public final boolean getClearDevicePublicKey() {
                return this.clearDevicePublicKey;
            }

            public int hashCode() {
                return Boolean.hashCode(this.clearDevicePublicKey);
            }

            @NotNull
            public String toString() {
                return C2618u.g("Biometry(clearDevicePublicKey=", ")", this.clearDevicePublicKey);
            }
        }

        public DataDTO(AuthTokenDTO authTokenDTO, Biometry biometry, Boolean bool) {
            this.authToken = authTokenDTO;
            this.biometry = biometry;
            this.isRegister = bool;
        }

        public static /* synthetic */ DataDTO copy$default(DataDTO dataDTO, AuthTokenDTO authTokenDTO, Biometry biometry, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                authTokenDTO = dataDTO.authToken;
            }
            if ((i11 & 2) != 0) {
                biometry = dataDTO.biometry;
            }
            if ((i11 & 4) != 0) {
                bool = dataDTO.isRegister;
            }
            return dataDTO.copy(authTokenDTO, biometry, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final AuthTokenDTO getAuthToken() {
            return this.authToken;
        }

        /* renamed from: component2, reason: from getter */
        public final Biometry getBiometry() {
            return this.biometry;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsRegister() {
            return this.isRegister;
        }

        @NotNull
        public final DataDTO copy(AuthTokenDTO authToken, Biometry biometry, Boolean isRegister) {
            return new DataDTO(authToken, biometry, isRegister);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataDTO)) {
                return false;
            }
            DataDTO dataDTO = (DataDTO) other;
            return Intrinsics.d(this.authToken, dataDTO.authToken) && Intrinsics.d(this.biometry, dataDTO.biometry) && Intrinsics.d(this.isRegister, dataDTO.isRegister);
        }

        @Override // ru.ozon.id.nativeauth.data.models.AuthActionDTO.a
        public AuthTokenDTO getAuthToken() {
            return this.authToken;
        }

        public final Biometry getBiometry() {
            return this.biometry;
        }

        public int hashCode() {
            AuthTokenDTO authTokenDTO = this.authToken;
            int hashCode = (authTokenDTO == null ? 0 : authTokenDTO.hashCode()) * 31;
            Biometry biometry = this.biometry;
            int hashCode2 = (hashCode + (biometry == null ? 0 : biometry.hashCode())) * 31;
            Boolean bool = this.isRegister;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isRegister() {
            return this.isRegister;
        }

        @NotNull
        public String toString() {
            AuthTokenDTO authTokenDTO = this.authToken;
            Biometry biometry = this.biometry;
            Boolean bool = this.isRegister;
            StringBuilder sb2 = new StringBuilder("DataDTO(authToken=");
            sb2.append(authTokenDTO);
            sb2.append(", biometry=");
            sb2.append(biometry);
            sb2.append(", isRegister=");
            return g.d(sb2, bool, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO;", "Landroid/os/Parcelable;", "Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO$b;", "type", "", "message", "<init>", "(Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO$b;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO$b;", "component2", "()Ljava/lang/String;", "copy", "(Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO$b;Ljava/lang/String;)Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO$b;", "getType", "Ljava/lang/String;", "getMessage", "b", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ErrorDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ErrorDTO> CREATOR = new a();
        private final String message;

        @NotNull
        private final b type;

        public static final class a implements Parcelable.Creator<ErrorDTO> {
            @Override // android.os.Parcelable.Creator
            public final ErrorDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ErrorDTO(b.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorDTO[] newArray(int i11) {
                return new ErrorDTO[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO$ErrorDTO$b;", "", "<init>", "(Ljava/lang/String;I)V", "RELOAD", "RESTRICTION", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class b {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;

            @i(name = DeleteAccountApiResponse.Error.TYPE_RELOAD)
            public static final b RELOAD = new b("RELOAD", 0);

            @i(name = DeleteAccountApiResponse.Error.TYPE_RESTRICTION)
            public static final b RESTRICTION = new b("RESTRICTION", 1);

            private static final /* synthetic */ b[] $values() {
                return new b[]{RELOAD, RESTRICTION};
            }

            static {
                b[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private b(String str, int i11) {
            }

            @NotNull
            public static Xc.a<b> getEntries() {
                return $ENTRIES;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public ErrorDTO(@NotNull b type, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.message = str;
        }

        public static /* synthetic */ ErrorDTO copy$default(ErrorDTO errorDTO, b bVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = errorDTO.type;
            }
            if ((i11 & 2) != 0) {
                str = errorDTO.message;
            }
            return errorDTO.copy(bVar, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final b getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final ErrorDTO copy(@NotNull b type, String message) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new ErrorDTO(type, message);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorDTO)) {
                return false;
            }
            ErrorDTO errorDTO = (ErrorDTO) other;
            return this.type == errorDTO.type && Intrinsics.d(this.message, errorDTO.message);
        }

        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final b getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.message;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "ErrorDTO(type=" + this.type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type.name());
            dest.writeString(this.message);
        }
    }

    public BiometryEntryActionDTO(AuthActionDTO.StatusDTO statusDTO, DataDTO dataDTO, ErrorDTO errorDTO) {
        this.status = statusDTO;
        this.data = dataDTO;
        this.error = errorDTO;
    }

    public static /* synthetic */ BiometryEntryActionDTO copy$default(BiometryEntryActionDTO biometryEntryActionDTO, AuthActionDTO.StatusDTO statusDTO, DataDTO dataDTO, ErrorDTO errorDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            statusDTO = biometryEntryActionDTO.status;
        }
        if ((i11 & 2) != 0) {
            dataDTO = biometryEntryActionDTO.data;
        }
        if ((i11 & 4) != 0) {
            errorDTO = biometryEntryActionDTO.error;
        }
        return biometryEntryActionDTO.copy(statusDTO, dataDTO, errorDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final AuthActionDTO.StatusDTO getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final DataDTO getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final ErrorDTO getError() {
        return this.error;
    }

    @NotNull
    public final BiometryEntryActionDTO copy(AuthActionDTO.StatusDTO status, DataDTO data, ErrorDTO error) {
        return new BiometryEntryActionDTO(status, data, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometryEntryActionDTO)) {
            return false;
        }
        BiometryEntryActionDTO biometryEntryActionDTO = (BiometryEntryActionDTO) other;
        return Intrinsics.d(this.status, biometryEntryActionDTO.status) && Intrinsics.d(this.data, biometryEntryActionDTO.data) && Intrinsics.d(this.error, biometryEntryActionDTO.error);
    }

    public final ErrorDTO getError() {
        return this.error;
    }

    @Override // ru.ozon.id.nativeauth.data.models.AuthActionDTO
    public AuthActionDTO.StatusDTO getStatus() {
        return this.status;
    }

    public int hashCode() {
        AuthActionDTO.StatusDTO statusDTO = this.status;
        int hashCode = (statusDTO == null ? 0 : statusDTO.hashCode()) * 31;
        DataDTO dataDTO = this.data;
        int hashCode2 = (hashCode + (dataDTO == null ? 0 : dataDTO.hashCode())) * 31;
        ErrorDTO errorDTO = this.error;
        return hashCode2 + (errorDTO != null ? errorDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BiometryEntryActionDTO(status=" + this.status + ", data=" + this.data + ", error=" + this.error + ")";
    }

    @Override // ru.ozon.id.nativeauth.data.models.AuthActionDTO
    public DataDTO getData() {
        return this.data;
    }
}
