package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class i43 extends dh implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i43(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = null;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                break;
            case 1:
                Context context2 = (Context) obj;
                context2.getClass();
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                la3 la3Var = (la3) this.receiver;
                la3Var.getClass();
                xw3.L(un0.z(la3Var), null, null, new ka3(la3Var, intValue, -1, false, null), 3);
                break;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                tr3 tr3Var = (tr3) this.receiver;
                tr3Var.getClass();
                xw3.L(un0.z(tr3Var), null, null, new mp1(tr3Var, booleanValue, rq3Var, 1), 3);
                break;
            case 4:
                ((i1d) this.receiver).b((xtg) obj);
                break;
            case 5:
                Object c = ((ghe) this.receiver).c((rq3) obj);
                if (c != lu3.a) {
                    break;
                }
                break;
            default:
                ((caj) this.receiver).r1(((lu9) obj).a);
                break;
        }
        return Unit.a;
    }
}
