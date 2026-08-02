package com.google.android.gms.dynamite;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzp extends zza implements IInterface {
    public final IObjectWrapper D4(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel S1 = S1();
        zzc.b(S1, objectWrapper);
        S1.writeString(str);
        S1.writeInt(i);
        zzc.b(S1, objectWrapper2);
        return x5n.i(J(S1, 8));
    }

    public final IObjectWrapper Z1(ObjectWrapper objectWrapper, String str, int i) {
        Parcel S1 = S1();
        zzc.b(S1, objectWrapper);
        S1.writeString(str);
        S1.writeInt(i);
        return x5n.i(J(S1, 2));
    }

    public final IObjectWrapper l2(ObjectWrapper objectWrapper, String str, int i) {
        Parcel S1 = S1();
        zzc.b(S1, objectWrapper);
        S1.writeString(str);
        S1.writeInt(i);
        return x5n.i(J(S1, 4));
    }
}
