package com.vk.push.core.auth;

import B4.V;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/auth/AuthorizedResult;", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AuthorizedResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f60706a;

    /* renamed from: com.vk.push.core.auth.AuthorizedResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AuthorizedResult> {
        @Override // android.os.Parcelable.Creator
        public final AuthorizedResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthorizedResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorizedResult[] newArray(int i11) {
            return new AuthorizedResult[i11];
        }
    }

    public AuthorizedResult(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f60706a = parcel.readByte() != 0;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getF60706a() {
        return this.f60706a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthorizedResult) && this.f60706a == ((AuthorizedResult) obj).f60706a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60706a);
    }

    @NotNull
    public final String toString() {
        return V.d(new StringBuilder("AuthorizedResult(isAuthorized="), this.f60706a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeByte(this.f60706a ? (byte) 1 : (byte) 0);
    }
}
