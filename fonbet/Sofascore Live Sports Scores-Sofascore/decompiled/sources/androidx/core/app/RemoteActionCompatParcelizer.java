package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.kok;
import defpackage.lok;
import defpackage.mok;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(kok kokVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        mok mokVar = remoteActionCompat.a;
        boolean z = true;
        if (kokVar.e(1)) {
            mokVar = kokVar.h();
        }
        remoteActionCompat.a = (IconCompat) mokVar;
        CharSequence charSequence = remoteActionCompat.b;
        if (kokVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((lok) kokVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (kokVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((lok) kokVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) kokVar.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (kokVar.e(5)) {
            z2 = ((lok) kokVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!kokVar.e(6)) {
            z = z3;
        } else if (((lok) kokVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, kok kokVar) {
        kokVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        kokVar.i(1);
        kokVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        kokVar.i(2);
        Parcel parcel = ((lok) kokVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        kokVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        kokVar.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        kokVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        kokVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
