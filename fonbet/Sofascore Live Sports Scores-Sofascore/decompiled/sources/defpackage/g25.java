package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class g25 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ g25(String str, String str2, Function0 function0, String str3, boolean z, boolean z2, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.f = function0;
        this.i = str3;
        this.d = z;
        this.e = z2;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                dy0.n(this.b, this.c, this.f, (String) this.i, this.d, this.e, (of3) obj, aba.K(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                g6j.a(this.b, this.c, this.d, this.e, (Boolean) this.i, this.f, (of3) obj, aba.K(this.g | 1), this.h);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ g25(String str, String str2, boolean z, boolean z2, Boolean bool, Function0 function0, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.i = bool;
        this.f = function0;
        this.g = i;
        this.h = i2;
    }
}
