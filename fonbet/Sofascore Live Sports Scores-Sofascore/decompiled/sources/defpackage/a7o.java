package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.playcore_hsdp.zza;
import com.google.android.gms.internal.playcore_hsdp.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a7o extends zza implements ako {
    public final void Z1(String str, String str2, String str3, Bundle bundle, o4n o4nVar) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        int i = zzc.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        if (o4nVar == null) {
            J.writeStrongBinder(null);
        } else {
            J.writeStrongBinder(o4nVar);
        }
        S1(J, 2);
    }
}
