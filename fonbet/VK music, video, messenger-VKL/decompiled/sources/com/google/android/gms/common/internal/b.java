package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public interface b extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    public static abstract class a extends zzb implements b {
        @NonNull
        public static b f(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof b ? (b) queryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
    }

    @NonNull
    Account zzb() throws RemoteException;
}
