package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a70;
import defpackage.f7a;
import defpackage.foh;
import defpackage.lnb;
import defpackage.p4h;
import defpackage.wib;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c implements Parcelable.ClassLoaderCreator {
    public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
        foh fohVar;
        if (classLoader == null) {
            classLoader = c.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            fohVar = f7a.k;
        } else if (readInt == 1) {
            fohVar = wib.i;
        } else {
            if (readInt != 2) {
                a70.r(lnb.k(readInt, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            fohVar = p4h.g;
        }
        return new ParcelableSnapshotMutableState(readValue, fohVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
