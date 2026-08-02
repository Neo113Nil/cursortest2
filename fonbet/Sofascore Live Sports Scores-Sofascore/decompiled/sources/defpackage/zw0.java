package defpackage;

import com.ironsource.B;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class zw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ B b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ zw0(B b, int i, String str, int i2) {
        this.a = i2;
        this.b = b;
        this.c = i;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        int i2 = this.c;
        B b = this.b;
        switch (i) {
            case 0:
                B.c(b, i2, str);
                break;
            default:
                B.b(b, i2, str);
                break;
        }
    }
}
