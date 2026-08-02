package android.support.v4.os;

import a3.a;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import c.b;
import c.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a(12);

    /* renamed from: a, reason: collision with root package name */
    public b f193a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        synchronized (this) {
            try {
                if (this.f193a == null) {
                    this.f193a = new c(this);
                }
                parcel.writeStrongBinder(this.f193a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
