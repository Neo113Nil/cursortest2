package defpackage;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzcht;
import com.google.android.gms.internal.ads.zzgbp;
import com.ironsource.C4018c8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ssn implements Runnable {
    public final /* synthetic */ int a;
    public final zzcht b;
    public boolean c;

    public ssn(zzcht zzchtVar) {
        this.a = 2;
        this.c = false;
        this.b = zzchtVar;
    }

    public void a() {
        this.c = true;
        this.b.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzcht zzchtVar = this.b;
        switch (i) {
            case 0:
                zzchtVar.c("windowVisibilityChanged", C4018c8.k, String.valueOf(this.c));
                break;
            case 1:
                zzchtVar.c("windowFocusChanged", "hasWindowFocus", String.valueOf(this.c));
                break;
            default:
                if (!this.c) {
                    zzchtVar.b();
                    zzgbp zzgbpVar = zzs.zza;
                    zzgbpVar.removeCallbacks(this);
                    zzgbpVar.postDelayed(this, 250L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ssn(zzcht zzchtVar, boolean z, int i) {
        this.a = i;
        this.c = z;
        this.b = zzchtVar;
    }
}
