package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: IntentSenderRequest.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes11.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b();
    public final IntentSender b;
    public final Intent c;
    public final int d;
    public final int e;

    /* compiled from: IntentSenderRequest.kt */
    public static final class a {
        public final IntentSender a;
        public Intent b;
        public int c;
        public int d;

        public a(IntentSender intentSender) {
            this.a = intentSender;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.a, this.b, this.c, this.d);
        }

        public final void b(Intent intent) {
            this.b = intent;
        }

        public final void c(int i, int i2) {
            this.d = i;
            this.c = i2;
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    public static final class b implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.b = intentSender;
        this.c = intent;
        this.d = i;
        this.e = i2;
    }

    public final Intent d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.e;
    }

    public final IntentSender g() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    public IntentSenderRequest(Parcel parcel) {
        this((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
