package android.support.v4.os;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.an9;
import defpackage.d1c;
import defpackage.z2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new d1c(24);
    public an9 a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                an9 an9Var = this.a;
                if (an9Var == null) {
                    an9Var = new z2g(this);
                    this.a = an9Var;
                }
                parcel.writeStrongBinder(an9Var.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
