package lb;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzahy;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class G {
    public static MultiFactorInfo a(zzahy zzahyVar) {
        if (zzahyVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahyVar.zze())) {
            return new PhoneMultiFactorInfo(zzahyVar.zzd(), zzahyVar.zzc(), zzahyVar.zza(), AbstractC3191o.g(zzahyVar.zze()));
        }
        if (zzahyVar.zzb() != null) {
            return new TotpMultiFactorInfo(zzahyVar.zzd(), zzahyVar.zzc(), zzahyVar.zza(), (zzaiz) AbstractC3191o.n(zzahyVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo a10 = a((zzahy) it.next());
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }
}
