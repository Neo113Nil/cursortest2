package defpackage;

import com.ironsource.C4221ne;
import com.ironsource.C4346ue;
import com.ironsource.C4436ze;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3n implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ C4436ze b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s3n(C4346ue c4346ue, C4436ze c4436ze) {
        this.c = c4346ue;
        this.b = c4436ze;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        C4436ze c4436ze = this.b;
        switch (i) {
            case 0:
                C4436ze.a((C4346ue) obj, c4436ze);
                break;
            default:
                C4436ze.a(c4436ze, (C4221ne) obj);
                break;
        }
    }

    public /* synthetic */ s3n(C4436ze c4436ze, C4221ne c4221ne) {
        this.b = c4436ze;
        this.c = c4221ne;
    }
}
