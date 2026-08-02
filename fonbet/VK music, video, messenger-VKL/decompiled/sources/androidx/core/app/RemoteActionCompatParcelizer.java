package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import xsna.for0;

/* loaded from: classes11.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        for0 for0Var = remoteActionCompat.a;
        if (versionedParcel.h(1)) {
            for0Var = versionedParcel.m();
        }
        remoteActionCompat.a = (IconCompat) for0Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (versionedParcel.h(2)) {
            charSequence = versionedParcel.g();
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (versionedParcel.h(3)) {
            charSequence2 = versionedParcel.g();
        }
        remoteActionCompat.c = charSequence2;
        Parcelable parcelable = remoteActionCompat.d;
        if (versionedParcel.h(4)) {
            parcelable = versionedParcel.k();
        }
        remoteActionCompat.d = (PendingIntent) parcelable;
        boolean z = remoteActionCompat.e;
        if (versionedParcel.h(5)) {
            z = versionedParcel.e();
        }
        remoteActionCompat.e = z;
        boolean z2 = remoteActionCompat.f;
        if (versionedParcel.h(6)) {
            z2 = versionedParcel.e();
        }
        remoteActionCompat.f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        versionedParcel.n(1);
        versionedParcel.v(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        versionedParcel.n(2);
        versionedParcel.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        versionedParcel.n(3);
        versionedParcel.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        versionedParcel.n(4);
        versionedParcel.t(pendingIntent);
        boolean z = remoteActionCompat.e;
        versionedParcel.n(5);
        versionedParcel.o(z);
        boolean z2 = remoteActionCompat.f;
        versionedParcel.n(6);
        versionedParcel.o(z2);
    }
}
