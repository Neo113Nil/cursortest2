package defpackage;

import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzfvd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bao implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zzftp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zzfvd d;

    public /* synthetic */ bao(zzftp zzftpVar, int i, zzfvd zzfvdVar) {
        this.b = zzftpVar;
        this.c = i;
        this.d = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzfvd zzfvdVar = this.d;
        int i2 = this.c;
        zzftp zzftpVar = this.b;
        switch (i) {
            case 0:
                zzftpVar.n(zzfvdVar, i2);
                break;
            default:
                if (i2 > 0) {
                    zzftpVar.n(zzfvdVar, i2);
                }
                zzftpVar.k(0L);
                break;
        }
    }

    public /* synthetic */ bao(zzftp zzftpVar, zzfvd zzfvdVar, int i) {
        this.b = zzftpVar;
        this.d = zzfvdVar;
        this.c = i;
    }
}
