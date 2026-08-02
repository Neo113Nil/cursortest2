package com.google.android.gms.internal.cast;

import android.os.Parcel;
import defpackage.o4o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzfa extends zzb implements zzfb {
    public zzfa() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        parcel.readInt();
        zzc.d(parcel);
        zzet.a.a("onRemoteDisplayEnded", new Object[0]);
        ((o4o) this).a.getClass();
        return true;
    }
}
