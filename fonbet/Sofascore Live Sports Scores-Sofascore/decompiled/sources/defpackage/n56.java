package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class n56 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ gv9 c;
    public final /* synthetic */ znh d;

    public /* synthetic */ n56(gv9 gv9Var, Function1 function1, znh znhVar) {
        this.a = 0;
        this.c = gv9Var;
        this.b = function1;
        this.d = znhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        int i = this.a;
        znh znhVar = this.d;
        gv9 gv9Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                Iterator<E> it = gv9Var.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((mte) obj).a == znhVar.h()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                mte mteVar = (mte) obj;
                if (mteVar != null) {
                    function1.invoke(mteVar);
                }
                break;
            case 1:
                int h = znhVar.h() - 1;
                if (h < 0) {
                    h = 0;
                }
                function1.invoke(gv9Var.get(h));
                break;
            default:
                int h2 = znhVar.h() + 1;
                int i2 = b.i(gv9Var);
                if (h2 > i2) {
                    h2 = i2;
                }
                function1.invoke(gv9Var.get(h2));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ n56(Function1 function1, gv9 gv9Var, znh znhVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = gv9Var;
        this.d = znhVar;
    }
}
