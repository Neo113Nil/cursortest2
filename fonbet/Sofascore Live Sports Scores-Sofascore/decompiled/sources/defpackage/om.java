package defpackage;

import com.inmobi.media.Aj;
import com.inmobi.media.C3434g3;
import com.inmobi.media.Lc;
import com.inmobi.media.V5;
import com.inmobi.media.Zc;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class om implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Zc b;

    public /* synthetic */ om(Zc zc, int i) {
        this.a = i;
        this.b = zc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean a;
        int i = this.a;
        Zc zc = this.b;
        switch (i) {
            case 0:
                a = Aj.a(zc);
                break;
            case 1:
                a = Lc.a(zc);
                break;
            case 2:
                a = V5.a(zc);
                break;
            default:
                a = C3434g3.a(zc);
                break;
        }
        return Boolean.valueOf(a);
    }
}
