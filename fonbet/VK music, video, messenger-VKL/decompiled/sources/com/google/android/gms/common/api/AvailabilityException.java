package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.exc0;
import xsna.ttw;
import xsna.ty2;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public class AvailabilityException extends Exception {
    private final zk3 zaa;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    @NonNull
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        zk3 zk3Var = this.zaa;
        Iterator it = ((zk3.c) zk3Var.keySet()).iterator();
        boolean z = true;
        while (true) {
            ttw ttwVar = (ttw) it;
            if (!ttwVar.hasNext()) {
                break;
            }
            ty2 ty2Var = (ty2) ttwVar.next();
            ConnectionResult connectionResult = (ConnectionResult) zk3Var.get(ty2Var);
            exc0.i(connectionResult);
            z &= !connectionResult.j();
            String str = ty2Var.b.c;
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + valueOf.length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
