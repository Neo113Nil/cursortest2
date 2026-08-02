package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d1c;
import defpackage.lok;
import defpackage.mok;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new d1c(13);
    public final mok a;

    public ParcelImpl(Parcel parcel) {
        this.a = new lok(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new lok(parcel).l(this.a);
    }

    public ParcelImpl(mok mokVar) {
        this.a = mokVar;
    }
}
