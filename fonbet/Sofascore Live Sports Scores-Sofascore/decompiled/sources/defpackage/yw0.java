package defpackage;

import com.ironsource.B;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class yw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ B b;
    public final /* synthetic */ Map c;

    public /* synthetic */ yw0(B b, Map map, int i) {
        this.a = i;
        this.b = b;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Map map = this.c;
        B b = this.b;
        switch (i) {
            case 0:
                B.a(b, map);
                break;
            default:
                B.b(b, map);
                break;
        }
    }
}
