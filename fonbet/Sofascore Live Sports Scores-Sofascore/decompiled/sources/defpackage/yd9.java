package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yd9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ be9 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ yd9(Context context, be9 be9Var) {
        this.a = 0;
        this.c = context;
        this.b = be9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Context context = this.c;
        be9 be9Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                return be9.n(context, be9Var, (String) obj);
            case 1:
                return be9.o(be9Var, context, (of3) obj, ((Integer) obj2).intValue());
            default:
                return be9.p(be9Var, context, (of3) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ yd9(be9 be9Var, Context context, int i) {
        this.a = i;
        this.b = be9Var;
        this.c = context;
    }
}
