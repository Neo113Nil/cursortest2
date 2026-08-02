package defpackage;

import com.google.android.gms.internal.ads.zzcun;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class lwn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcun b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ lwn(zzcun zzcunVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = zzcunVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.c;
        zzcun zzcunVar = this.b;
        switch (i) {
            case 0:
                zzcunVar.b.execute(new lwn(zzcunVar, i3, i2, 1));
                break;
            default:
                zzcunVar.h(i3 - 1, i2);
                break;
        }
    }
}
