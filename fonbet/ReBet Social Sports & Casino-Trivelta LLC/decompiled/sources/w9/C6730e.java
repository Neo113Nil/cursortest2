package w9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* renamed from: w9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6730e extends zza implements InterfaceC6732g {
    public C6730e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // w9.InterfaceC6732g
    public final void Q(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(1, zza);
    }

    @Override // w9.InterfaceC6732g
    public final void t(InterfaceC6729d interfaceC6729d, Account account) {
        Parcel zza = zza();
        zzc.zzd(zza, interfaceC6729d);
        zzc.zzc(zza, account);
        zzc(3, zza);
    }

    @Override // w9.InterfaceC6732g
    public final void t0(InterfaceC6729d interfaceC6729d, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, interfaceC6729d);
        zza.writeString(str);
        zzc(2, zza);
    }
}
