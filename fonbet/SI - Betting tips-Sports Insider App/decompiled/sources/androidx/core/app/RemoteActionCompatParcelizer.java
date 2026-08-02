package androidx.core.app;

import a3.b;
import a3.c;
import a3.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f1256a;
        boolean z5 = true;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f1256a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f1257b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f71e);
        }
        remoteActionCompat.f1257b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1258c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f71e);
        }
        remoteActionCompat.f1258c = charSequence2;
        remoteActionCompat.f1259d = (PendingIntent) bVar.f(remoteActionCompat.f1259d, 4);
        boolean z7 = remoteActionCompat.f1260e;
        if (bVar.e(5)) {
            z7 = ((c) bVar).f71e.readInt() != 0;
        }
        remoteActionCompat.f1260e = z7;
        boolean z10 = remoteActionCompat.f1261f;
        if (!bVar.e(6)) {
            z5 = z10;
        } else if (((c) bVar).f71e.readInt() == 0) {
            z5 = false;
        }
        remoteActionCompat.f1261f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1256a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1257b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f71e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1258c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1259d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z5 = remoteActionCompat.f1260e;
        bVar.h(5);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z7 = remoteActionCompat.f1261f;
        bVar.h(6);
        parcel.writeInt(z7 ? 1 : 0);
    }
}
