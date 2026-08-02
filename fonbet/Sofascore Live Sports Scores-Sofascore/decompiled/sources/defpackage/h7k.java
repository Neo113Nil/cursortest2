package defpackage;

import com.inmobi.media.U;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7k implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ U b;

    public /* synthetic */ h7k(U u, int i) {
        this.a = i;
        this.b = u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        U u = this.b;
        switch (i) {
            case 0:
                return U.c(u);
            default:
                return U.b(u);
        }
    }
}
