package defpackage;

import com.inmobi.media.Qd;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class lif implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Qd b;

    public /* synthetic */ lif(Qd qd, int i) {
        this.a = i;
        this.b = qd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Qd qd = this.b;
        switch (i) {
            case 0:
                return Qd.a(qd);
            default:
                return Qd.b(qd);
        }
    }
}
