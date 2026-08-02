package v9;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.zze;

/* renamed from: v9.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6675j implements InterfaceC6676k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f67120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f67121b;

    public C6675j(String str, Bundle bundle) {
        this.f67120a = str;
        this.f67121b = bundle;
    }

    @Override // v9.InterfaceC6676k
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        Bundle zzd = zze.zzb(iBinder).zzd(this.f67120a, this.f67121b);
        AbstractC6677l.f(zzd);
        String string = zzd.getString("Error");
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new C6666a(string);
    }
}
