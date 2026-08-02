package com.vk.push.core.base;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/base/AidlResult;", "Landroid/os/Parcelable;", "T", "Success", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AidlResult<T extends Parcelable> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AidlResult<? extends Parcelable>> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f60709a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vk/push/core/base/AidlResult$Success;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Success implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: com.vk.push.core.base.AidlResult$Success$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new Success();
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i11) {
                return new Success[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i11) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    public static final class a implements Parcelable.Creator<AidlResult<? extends Parcelable>> {
        @Override // android.os.Parcelable.Creator
        public final AidlResult<? extends Parcelable> createFromParcel(Parcel parcel) {
            Parcelable readParcelable;
            Object readParcelable2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (Build.VERSION.SDK_INT >= 33) {
                readParcelable2 = parcel.readParcelable(AidlResult.class.getClassLoader(), Parcelable.class);
                readParcelable = (Parcelable) readParcelable2;
            } else {
                readParcelable = parcel.readParcelable(AidlResult.class.getClassLoader());
            }
            if (readParcelable != null) {
                return new AidlResult<>(readParcelable);
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // android.os.Parcelable.Creator
        public final AidlResult<? extends Parcelable>[] newArray(int i11) {
            return new AidlResult[i11];
        }
    }

    public AidlResult(@NotNull T data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f60709a = data;
    }

    public final RuntimeException a() {
        T t2 = this.f60709a;
        if (t2 instanceof AidlException) {
            return ((AidlException) t2).a();
        }
        return null;
    }

    @NotNull
    public final T b() {
        return this.f60709a;
    }

    public final boolean c() {
        return !(this.f60709a instanceof AidlException);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AidlResult) && Intrinsics.d(this.f60709a, ((AidlResult) obj).f60709a);
    }

    public final int hashCode() {
        return this.f60709a.hashCode();
    }

    @NotNull
    public final String toString() {
        T t2 = this.f60709a;
        if (t2 instanceof AidlException) {
            return t2.toString();
        }
        if (t2 instanceof Success) {
            return "Success()";
        }
        return "Success(" + t2 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.f60709a, i11);
    }
}
