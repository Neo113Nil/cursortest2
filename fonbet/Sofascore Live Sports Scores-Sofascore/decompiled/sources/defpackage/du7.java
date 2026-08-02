package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class du7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ xtc e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ du7(int i, String str, String str2, Function0 function0, xtc xtcVar, String str3, Integer num, boolean z, boolean z2, int i2, int i3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.k = function0;
        this.e = xtcVar;
        this.l = str3;
        this.f = num;
        this.g = z;
        this.h = z2;
        this.i = i2;
        this.j = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                iu7.d(this.c, (old) this.k, this.b, (vmd) this.l, this.g, this.e, this.h, this.f, this.d, (of3) obj, aba.K(this.i | 1), this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                ehd.e(this.b, this.c, this.d, (Function0) this.k, this.e, (String) this.l, this.f, this.g, this.h, (of3) obj, aba.K(this.i | 1), this.j);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ du7(String str, old oldVar, int i, vmd vmdVar, boolean z, xtc xtcVar, boolean z2, Integer num, String str2, int i2, int i3) {
        this.c = str;
        this.k = oldVar;
        this.b = i;
        this.l = vmdVar;
        this.g = z;
        this.e = xtcVar;
        this.h = z2;
        this.f = num;
        this.d = str2;
        this.i = i2;
        this.j = i3;
    }
}
