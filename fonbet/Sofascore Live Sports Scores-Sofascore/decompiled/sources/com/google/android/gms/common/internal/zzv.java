package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzv extends zza implements zzx {
    @Override // com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() {
        return x5n.i(J(S1(), 1));
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        Parcel J = J(S1(), 2);
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }
}
