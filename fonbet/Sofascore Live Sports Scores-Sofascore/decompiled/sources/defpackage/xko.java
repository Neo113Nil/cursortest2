package defpackage;

import com.google.android.gms.internal.ads.zzhbr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xko implements Runnable {
    public final zzhbr a;
    public final ddb b;

    public xko(zzhbr zzhbrVar, ddb ddbVar) {
        this.a = zzhbrVar;
        this.b = ddbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        ddb ddbVar = this.b;
        if (glo.g.e0(this.a, this, zzhbr.h(ddbVar))) {
            zzhbr.o(this.a, false);
        }
    }
}
