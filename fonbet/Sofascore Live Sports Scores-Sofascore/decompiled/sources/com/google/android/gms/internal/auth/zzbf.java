package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ProxyResponse proxyResponse = (ProxyResponse) zzc.a(parcel, ProxyResponse.CREATOR);
            zzc.b(parcel);
            N(proxyResponse);
        } else {
            if (i != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzc.b(parcel);
            A(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
