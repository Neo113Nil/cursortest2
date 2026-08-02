package defpackage;

import com.moloco.sdk.internal.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class h17 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h17(xtc xtcVar, String str, String str2, long j, long j2, Function0 function0, int i) {
        this.b = xtcVar;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = j2;
        this.h = function0;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                fkf.t(this.c, this.d, this.b, (dfj) obj3, this.e, this.f, (of3) obj, K, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int i2 = this.g | 1;
                xtc xtcVar = this.b;
                String str = this.c;
                String str2 = this.d;
                long j = this.e;
                long j2 = this.f;
                i0.a(xtcVar, str, str2, j, j2, (Function0) obj3, (of3) obj, i2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ h17(String str, String str2, xtc xtcVar, dfj dfjVar, long j, long j2, int i, int i2) {
        this.c = str;
        this.d = str2;
        this.b = xtcVar;
        this.h = dfjVar;
        this.e = j;
        this.f = j2;
        this.g = i2;
    }
}
