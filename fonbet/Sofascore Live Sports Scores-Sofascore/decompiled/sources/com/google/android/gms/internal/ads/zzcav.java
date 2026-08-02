package com.google.android.gms.internal.ads;

import android.os.Parcel;
import defpackage.wo0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcav extends zzbev implements zzcaw {
    public zzcav() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzh().d("FlagsAccessedBeforeInitialized", new wo0("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
