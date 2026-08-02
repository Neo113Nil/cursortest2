package com.vk.push.core.base;

import B3.D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mb.C8122a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/push/core/base/AidlException;", "Landroid/os/Parcelable;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AidlException implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AidlException> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f60707a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f60708b;

    public static final class a implements Parcelable.Creator<AidlException> {
        @Override // android.os.Parcelable.Creator
        public final AidlException createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            return new AidlException(readInt, readString);
        }

        @Override // android.os.Parcelable.Creator
        public final AidlException[] newArray(int i11) {
            return new AidlException[i11];
        }
    }

    public AidlException(int i11, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f60707a = i11;
        this.f60708b = message;
    }

    @NotNull
    public final RuntimeException a() {
        String message = this.f60708b;
        switch (this.f60707a) {
            case 100:
                return new RuntimeException(message);
            case 101:
                return new IllegalArgumentException(message);
            case 102:
                return new IllegalStateException(message);
            case 103:
                Intrinsics.checkNotNullParameter(message, "message");
                return new C8122a(message);
            default:
                return new RuntimeException(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AidlException)) {
            return false;
        }
        AidlException aidlException = (AidlException) obj;
        return this.f60707a == aidlException.f60707a && Intrinsics.d(this.f60708b, aidlException.f60708b);
    }

    public final int hashCode() {
        return this.f60708b.hashCode() + (Integer.hashCode(this.f60707a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AidlException(code=");
        sb2.append(this.f60707a);
        sb2.append(", message=");
        return D.c(sb2, this.f60708b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f60707a);
        parcel.writeString(this.f60708b);
    }
}
