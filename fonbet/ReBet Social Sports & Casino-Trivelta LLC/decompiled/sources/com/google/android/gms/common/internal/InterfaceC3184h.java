package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3184h extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.h$a */
    public static abstract class a extends zzb implements InterfaceC3184h {
        public static InterfaceC3184h c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC3184h ? (InterfaceC3184h) queryLocalInterface : new r0(iBinder);
        }
    }

    Account zzb();
}
