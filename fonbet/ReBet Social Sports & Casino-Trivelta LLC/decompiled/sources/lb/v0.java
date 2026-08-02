package lb;

import com.google.android.gms.internal.p002firebaseauthapi.zzaif;
import kb.AbstractC5217b;
import kb.InterfaceC5219d;

/* loaded from: classes3.dex */
public final class v0 implements InterfaceC5219d {

    /* renamed from: a, reason: collision with root package name */
    public final int f55801a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55802b;

    /* renamed from: c, reason: collision with root package name */
    public final String f55803c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5217b f55804d;

    public v0(zzaif zzaifVar) {
        int i10;
        this.f55802b = zzaifVar.zzg() ? zzaifVar.zzc() : zzaifVar.zzb();
        this.f55803c = zzaifVar.zzb();
        AbstractC5217b abstractC5217b = null;
        if (!zzaifVar.zzh()) {
            this.f55801a = 3;
            this.f55804d = null;
            return;
        }
        String zzd = zzaifVar.zzd();
        zzd.getClass();
        i10 = 5;
        switch (zzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i10 = 6;
                break;
            case "PASSWORD_RESET":
                i10 = 0;
                break;
            case "VERIFY_EMAIL":
                i10 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i10 = 4;
                break;
            case "RECOVER_EMAIL":
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        this.f55801a = i10;
        if (i10 == 4 || i10 == 3) {
            this.f55804d = null;
            return;
        }
        if (zzaifVar.zzf()) {
            abstractC5217b = new w0(zzaifVar.zzb(), G.a(zzaifVar.zza()));
        } else if (zzaifVar.zzg()) {
            abstractC5217b = new u0(zzaifVar.zzc(), zzaifVar.zzb());
        } else if (zzaifVar.zze()) {
            abstractC5217b = new t0(zzaifVar.zzb());
        }
        this.f55804d = abstractC5217b;
    }

    @Override // kb.InterfaceC5219d
    public final String a(int i10) {
        if (this.f55801a == 4) {
            return null;
        }
        if (i10 == 0) {
            return this.f55802b;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f55803c;
    }

    @Override // kb.InterfaceC5219d
    public final int b() {
        return this.f55801a;
    }
}
