package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzeu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sfe {
    public final int[] a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Object i;

    public sfe(int i) {
        switch (i) {
            case 1:
                this.i = new j9e();
                this.a = new int[NotificationCompat.FLAG_LOCAL_ONLY];
                break;
            case 2:
                this.i = new zzeu();
                this.a = new int[NotificationCompat.FLAG_LOCAL_ONLY];
                break;
            default:
                this.i = new nkk(4, false);
                this.a = new int[NotificationCompat.FLAG_LOCAL_ONLY];
                break;
        }
    }
}
