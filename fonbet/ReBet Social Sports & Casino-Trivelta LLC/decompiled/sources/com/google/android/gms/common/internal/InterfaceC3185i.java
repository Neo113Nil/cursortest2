package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3185i extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.i$a */
    public static abstract class a extends zzb implements InterfaceC3185i {
        public static InterfaceC3185i c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof InterfaceC3185i ? (InterfaceC3185i) queryLocalInterface : new s0(iBinder);
        }
    }

    void cancel();
}
