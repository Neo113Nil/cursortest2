package com.vk.push.core.auth;

import B3.D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/auth/AuthTokenResult;", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AuthTokenResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f60705a;

    /* renamed from: com.vk.push.core.auth.AuthTokenResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AuthTokenResult> {
        @Override // android.os.Parcelable.Creator
        public final AuthTokenResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthTokenResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthTokenResult[] newArray(int i11) {
            return new AuthTokenResult[i11];
        }
    }

    public AuthTokenResult(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String token = parcel.readString();
        token = token == null ? "" : token;
        Intrinsics.checkNotNullParameter(token, "token");
        this.f60705a = token;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final String getF60705a() {
        return this.f60705a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthTokenResult) && Intrinsics.d(this.f60705a, ((AuthTokenResult) obj).f60705a);
    }

    public final int hashCode() {
        return this.f60705a.hashCode();
    }

    @NotNull
    public final String toString() {
        return D.c(new StringBuilder("AuthTokenResult(token="), this.f60705a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f60705a);
    }
}
