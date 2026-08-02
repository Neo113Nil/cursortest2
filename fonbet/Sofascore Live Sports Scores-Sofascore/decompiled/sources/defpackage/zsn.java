package defpackage;

import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzcix;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zsn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zsn(Object obj, boolean z, long j, int i) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((zzcix) obj).c.L(j, z);
                break;
            default:
                ((zzcif) obj).L(j, z);
                break;
        }
    }
}
