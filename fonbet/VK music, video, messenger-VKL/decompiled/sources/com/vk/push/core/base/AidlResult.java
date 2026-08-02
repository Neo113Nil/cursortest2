package com.vk.push.core.base;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.push.core.utils.ResultExtensionsKt;
import xsna.epx;
import xsna.zcl;

/* compiled from: AidlResult.kt */
/* loaded from: classes5.dex */
public final class AidlResult<T extends Parcelable> implements Parcelable {
    public final T b;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AidlResult<? extends Parcelable>> CREATOR = new Parcelable.Creator<AidlResult<? extends Parcelable>>() { // from class: com.vk.push.core.base.AidlResult$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel, reason: merged with bridge method [inline-methods] */
        public AidlResult<? extends Parcelable> createFromParcel2(Parcel parcel) {
            Parcelable readParcelable;
            Object readParcelable2;
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
        /* renamed from: newArray, reason: merged with bridge method [inline-methods] */
        public AidlResult<? extends Parcelable>[] newArray2(int i) {
            return new AidlResult[i];
        }
    };

    /* compiled from: AidlResult.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AidlResult<AidlException> failure(Throwable th) {
            return new AidlResult<>(ResultExtensionsKt.toAidlException(th));
        }

        public final AidlResult<Success> success() {
            return new AidlResult<>(new Success());
        }

        public Companion() {
        }

        public final <T extends Parcelable> AidlResult<T> success(T t) {
            return new AidlResult<>(t);
        }
    }

    /* compiled from: AidlResult.kt */
    public static final class Success implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR(null);

        /* compiled from: AidlResult.kt */
        public static final class CREATOR implements Parcelable.Creator<Success> {
            public /* synthetic */ CREATOR(zcl zclVar) {
                this();
            }

            public CREATOR() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Success createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new Success();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Success[] newArray(int i) {
                return new Success[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public AidlResult(T t) {
        this.b = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AidlResult copy$default(AidlResult aidlResult, Parcelable parcelable, int i, Object obj) {
        if ((i & 1) != 0) {
            parcelable = aidlResult.b;
        }
        return aidlResult.copy(parcelable);
    }

    public final AidlResult<T> copy(T t) {
        return new AidlResult<>(t);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AidlResult) && epx.f(this.b, ((AidlResult) obj).b);
    }

    public final Exception exceptionOrNull() {
        T t = this.b;
        if (t instanceof AidlException) {
            return ((AidlException) t).toException();
        }
        return null;
    }

    public final T getData() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public final boolean isFailure() {
        return this.b instanceof AidlException;
    }

    public final boolean isSuccess() {
        return !(this.b instanceof AidlException);
    }

    public String toString() {
        T t = this.b;
        if (t instanceof AidlException) {
            return t.toString();
        }
        if (t instanceof Success) {
            return "Success()";
        }
        return "Success(" + t + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
