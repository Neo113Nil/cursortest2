package fb;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.X4;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements X4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzfb f46601a;

    public d(zzfb zzfbVar) {
        this.f46601a = zzfbVar;
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void a(String str, String str2, Bundle bundle) {
        this.f46601a.zzi(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void b(Bundle bundle) {
        this.f46601a.zzl(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void c(String str) {
        this.f46601a.zzv(str);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void d(String str) {
        this.f46601a.zzu(str);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final int e(String str) {
        return this.f46601a.zzF(str);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final Map f(String str, String str2, boolean z10) {
        return this.f46601a.zzC(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void g(String str, String str2, Bundle bundle) {
        this.f46601a.zzm(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final List h(String str, String str2) {
        return this.f46601a.zzn(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final String zzh() {
        return this.f46601a.zzA();
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final String zzi() {
        return this.f46601a.zzB();
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final String zzj() {
        return this.f46601a.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final String zzk() {
        return this.f46601a.zzx();
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final long zzl() {
        return this.f46601a.zzz();
    }
}
