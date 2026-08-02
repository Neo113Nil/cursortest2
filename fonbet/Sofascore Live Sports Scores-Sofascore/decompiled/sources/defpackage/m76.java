package defpackage;

import com.sofascore.model.database.DbEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class m76 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v76 b;
    public final /* synthetic */ DbEvent c;

    public /* synthetic */ m76(v76 v76Var, DbEvent dbEvent, int i) {
        this.a = i;
        this.b = v76Var;
        this.c = dbEvent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        DbEvent dbEvent = this.c;
        v76 v76Var = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                v76Var.g.K(glgVar, dbEvent);
                return Unit.a;
            default:
                glgVar.getClass();
                return Long.valueOf(v76Var.g.L(glgVar, dbEvent));
        }
    }
}
