package defpackage;

import com.facebook.appevents.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fgi implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ fgi(int i, long j, String str, Function0 function0, xtc xtcVar, int i2) {
        this.f = i;
        this.d = j;
        this.c = str;
        this.e = function0;
        this.b = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                wba.f(this.f, this.d, this.c, this.e, this.b, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                g.d(this.b, this.c, this.d, this.e, (of3) obj, this.f | 1);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fgi(xtc xtcVar, String str, long j, Function0 function0, int i) {
        this.b = xtcVar;
        this.c = str;
        this.d = j;
        this.e = function0;
        this.f = i;
    }
}
