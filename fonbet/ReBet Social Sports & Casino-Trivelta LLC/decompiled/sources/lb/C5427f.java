package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.internal.zzab;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzah;
import com.google.firebase.auth.internal.zzbj;
import com.google.firebase.auth.zzan;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* renamed from: lb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5427f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        zzahv zzahvVar = null;
        zzab zzabVar = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzah zzahVar = null;
        zze zzeVar = null;
        zzbj zzbjVar = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    zzahvVar = (zzahv) E9.a.p(parcel, E10, zzahv.CREATOR);
                    break;
                case 2:
                    zzabVar = (zzab) E9.a.p(parcel, E10, zzab.CREATOR);
                    break;
                case 3:
                    str = E9.a.q(parcel, E10);
                    break;
                case 4:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 5:
                    arrayList = E9.a.u(parcel, E10, zzab.CREATOR);
                    break;
                case 6:
                    arrayList2 = E9.a.s(parcel, E10);
                    break;
                case 7:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    bool = E9.a.y(parcel, E10);
                    break;
                case 9:
                    zzahVar = (zzah) E9.a.p(parcel, E10, zzah.CREATOR);
                    break;
                case 10:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 11:
                    zzeVar = (zze) E9.a.p(parcel, E10, zze.CREATOR);
                    break;
                case 12:
                    zzbjVar = (zzbj) E9.a.p(parcel, E10, zzbj.CREATOR);
                    break;
                case 13:
                    arrayList3 = E9.a.u(parcel, E10, zzan.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new zzaf(zzahvVar, zzabVar, str, str2, arrayList, arrayList2, str3, bool, zzahVar, z10, zzeVar, zzbjVar, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaf[i10];
    }
}
