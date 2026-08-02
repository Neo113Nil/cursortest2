package ru.ozon.id.nativeauth.data.models;

import C.o0;
import D40.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface AuthActionDTO {

    public interface a {
        AuthTokenDTO getAuthToken();
    }

    a getData();

    StatusDTO getStatus();

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006%"}, d2 = {"Lru/ozon/id/nativeauth/data/models/AuthActionDTO$StatusDTO;", "Landroid/os/Parcelable;", "deeplink", "", "isCompleted", "", "message", "otpResponseToken", "otpToken", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "getOtpResponseToken", "getOtpToken", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/id/nativeauth/data/models/AuthActionDTO$StatusDTO;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatusDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StatusDTO> CREATOR = new a();
        private final String deeplink;
        private final Boolean isCompleted;
        private final String message;
        private final String otpResponseToken;
        private final String otpToken;

        public static final class a implements Parcelable.Creator<StatusDTO> {
            @Override // android.os.Parcelable.Creator
            public final StatusDTO createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new StatusDTO(readString, valueOf, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDTO[] newArray(int i11) {
                return new StatusDTO[i11];
            }
        }

        public StatusDTO(String str, Boolean bool, String str2, String str3, String str4) {
            this.deeplink = str;
            this.isCompleted = bool;
            this.message = str2;
            this.otpResponseToken = str3;
            this.otpToken = str4;
        }

        public static /* synthetic */ StatusDTO copy$default(StatusDTO statusDTO, String str, Boolean bool, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = statusDTO.deeplink;
            }
            if ((i11 & 2) != 0) {
                bool = statusDTO.isCompleted;
            }
            if ((i11 & 4) != 0) {
                str2 = statusDTO.message;
            }
            if ((i11 & 8) != 0) {
                str3 = statusDTO.otpResponseToken;
            }
            if ((i11 & 16) != 0) {
                str4 = statusDTO.otpToken;
            }
            String str5 = str4;
            String str6 = str2;
            return statusDTO.copy(str, bool, str6, str3, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsCompleted() {
            return this.isCompleted;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOtpResponseToken() {
            return this.otpResponseToken;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOtpToken() {
            return this.otpToken;
        }

        @NotNull
        public final StatusDTO copy(String deeplink, Boolean isCompleted, String message, String otpResponseToken, String otpToken) {
            return new StatusDTO(deeplink, isCompleted, message, otpResponseToken, otpToken);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusDTO)) {
                return false;
            }
            StatusDTO statusDTO = (StatusDTO) other;
            return Intrinsics.d(this.deeplink, statusDTO.deeplink) && Intrinsics.d(this.isCompleted, statusDTO.isCompleted) && Intrinsics.d(this.message, statusDTO.message) && Intrinsics.d(this.otpResponseToken, statusDTO.otpResponseToken) && Intrinsics.d(this.otpToken, statusDTO.otpToken);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getOtpResponseToken() {
            return this.otpResponseToken;
        }

        public final String getOtpToken() {
            return this.otpToken;
        }

        public int hashCode() {
            String str = this.deeplink;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isCompleted;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.message;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.otpResponseToken;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.otpToken;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final Boolean isCompleted() {
            return this.isCompleted;
        }

        @NotNull
        public String toString() {
            String str = this.deeplink;
            Boolean bool = this.isCompleted;
            String str2 = this.message;
            String str3 = this.otpResponseToken;
            String str4 = this.otpToken;
            StringBuilder sb2 = new StringBuilder("StatusDTO(deeplink=");
            sb2.append(str);
            sb2.append(", isCompleted=");
            sb2.append(bool);
            sb2.append(", message=");
            Nh.a.h(sb2, str2, ", otpResponseToken=", str3, ", otpToken=");
            return o0.c(sb2, str4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.deeplink);
            Boolean bool = this.isCompleted;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
            dest.writeString(this.message);
            dest.writeString(this.otpResponseToken);
            dest.writeString(this.otpToken);
        }

        public /* synthetic */ StatusDTO(String str, Boolean bool, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
        }
    }
}
