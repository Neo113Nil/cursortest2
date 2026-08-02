package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class i67 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ImageVector e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;

    public /* synthetic */ i67(xtc xtcVar, String str, String str2, ImageVector imageVector, boolean z, Function0 function0, int i) {
        this.b = xtcVar;
        this.c = str;
        this.d = str2;
        this.e = imageVector;
        this.f = z;
        this.g = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                hz8.l(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d, this.g, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                wnn.v(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d, this.g, this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i67(String str, String str2, ImageVector imageVector, boolean z, Function0 function0, xtc xtcVar, int i) {
        this.c = str;
        this.d = str2;
        this.e = imageVector;
        this.f = z;
        this.g = function0;
        this.b = xtcVar;
    }
}
