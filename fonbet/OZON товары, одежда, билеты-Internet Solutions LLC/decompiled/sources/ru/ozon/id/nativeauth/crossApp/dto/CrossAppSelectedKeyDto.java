package ru.ozon.id.nativeauth.crossApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;", "Landroid/os/Parcelable;", "authPublicKey", "", "authChallenge", "authAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthPublicKey", "()Ljava/lang/String;", "getAuthChallenge", "getAuthAction", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossAppSelectedKeyDto implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CrossAppSelectedKeyDto> CREATOR = new a();

    @NotNull
    private final String authAction;

    @NotNull
    private final String authChallenge;

    @NotNull
    private final String authPublicKey;

    public static final class a implements Parcelable.Creator<CrossAppSelectedKeyDto> {
        @Override // android.os.Parcelable.Creator
        public final CrossAppSelectedKeyDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CrossAppSelectedKeyDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CrossAppSelectedKeyDto[] newArray(int i11) {
            return new CrossAppSelectedKeyDto[i11];
        }
    }

    public CrossAppSelectedKeyDto(@NotNull String authPublicKey, @NotNull String authChallenge, @NotNull String authAction) {
        Intrinsics.checkNotNullParameter(authPublicKey, "authPublicKey");
        Intrinsics.checkNotNullParameter(authChallenge, "authChallenge");
        Intrinsics.checkNotNullParameter(authAction, "authAction");
        this.authPublicKey = authPublicKey;
        this.authChallenge = authChallenge;
        this.authAction = authAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getAuthAction() {
        return this.authAction;
    }

    @NotNull
    public final String getAuthChallenge() {
        return this.authChallenge;
    }

    @NotNull
    public final String getAuthPublicKey() {
        return this.authPublicKey;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.authPublicKey);
        dest.writeString(this.authChallenge);
        dest.writeString(this.authAction);
    }
}
