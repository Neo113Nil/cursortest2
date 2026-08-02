package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import com.google.android.gms.internal.ads.zzbcp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bmn implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bmn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        switch (this.a) {
            case 0:
                zzbcp zzbcpVar = (zzbcp) this.b;
                if (z) {
                    zzbcpVar.a = System.currentTimeMillis();
                    zzbcpVar.d = true;
                    return;
                }
                long j = zzbcpVar.b;
                long currentTimeMillis = System.currentTimeMillis();
                if (j > 0) {
                    long j2 = zzbcpVar.b;
                    if (currentTimeMillis >= j2) {
                        zzbcpVar.c = currentTimeMillis - j2;
                    }
                }
                zzbcpVar.d = false;
                return;
            case 1:
                yfo yfoVar = (yfo) this.b;
                synchronized (yfoVar) {
                    try {
                        if (z) {
                            yfoVar.c = System.currentTimeMillis();
                            yfoVar.f = true;
                        } else {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long j3 = yfoVar.d;
                            if (j3 > 0 && currentTimeMillis2 >= j3) {
                                yfoVar.e = currentTimeMillis2 - j3;
                            }
                            yfoVar.f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                lso lsoVar = (lso) this.b;
                if (z) {
                    lsoVar.a = System.currentTimeMillis();
                    lsoVar.d = true;
                    return;
                }
                long j4 = lsoVar.b;
                long currentTimeMillis3 = System.currentTimeMillis();
                if (j4 > 0) {
                    long j5 = lsoVar.b;
                    if (currentTimeMillis3 >= j5) {
                        lsoVar.c = currentTimeMillis3 - j5;
                    }
                }
                lsoVar.d = false;
                return;
        }
    }
}
