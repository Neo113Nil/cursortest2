package defpackage;

import com.google.android.gms.internal.ads.zzftp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class cao implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzftp b;

    public /* synthetic */ cao(zzftp zzftpVar, int i) {
        this.a = i;
        this.b = zzftpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzftp zzftpVar = this.b;
        switch (i) {
            case 0:
                zzftpVar.l();
                break;
            case 1:
                zzftpVar.l();
                break;
            case 2:
                zzftpVar.l();
                break;
            case 3:
                zzftpVar.l();
                break;
            default:
                zzftpVar.b.set(false);
                zzftpVar.l();
                break;
        }
    }
}
