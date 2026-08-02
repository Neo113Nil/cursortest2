package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16318a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f16319b = null;

    /* renamed from: c, reason: collision with root package name */
    public android.support.v4.os.a f16320c;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    public class b extends a.AbstractBinderC0336a {
        public b() {
        }

        @Override // android.support.v4.os.a
        public void W(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f16319b;
            if (handler != null) {
                handler.post(resultReceiver.new c(i10, bundle));
            } else {
                resultReceiver.a(i10, bundle);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f16322a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f16323b;

        public c(int i10, Bundle bundle) {
            this.f16322a = i10;
            this.f16323b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.f16322a, this.f16323b);
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f16320c = a.AbstractBinderC0336a.c(parcel.readStrongBinder());
    }

    public void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f16320c == null) {
                    this.f16320c = new b();
                }
                parcel.writeStrongBinder(this.f16320c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
