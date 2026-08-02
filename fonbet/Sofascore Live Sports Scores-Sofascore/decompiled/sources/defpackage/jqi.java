package defpackage;

import com.google.android.gms.internal.ads.zzfs;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jqi implements Runnable {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ jqi(zzfs zzfsVar, boolean z, boolean z2) {
        this.d = zzfsVar;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    this.c = true;
                    ((Runnable) obj).run();
                    break;
                }
                break;
            default:
                ((zzfs) obj).a.b(this.b, this.c);
                break;
        }
    }

    public jqi(Runnable runnable) {
        this.d = runnable;
    }
}
