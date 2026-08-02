package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class pu9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ pu9(int i, String str, int i2) {
        this.a = i2;
        this.b = i;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int i = this.a;
        String str = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                l9j l9jVar = (l9j) obj;
                pej pejVar = l9jVar.f;
                if (pejVar != null) {
                    long j = pejVar.a;
                    yqo.F(l9jVar, (int) (j >> 32), (int) (j & 4294967295L), str);
                } else {
                    yqo.F(l9jVar, pej.g(l9jVar.e), pej.f(l9jVar.e), str);
                }
                int g = pej.g(l9jVar.e);
                int c = llf.c(i2 > 0 ? (g + i2) - 1 : (g + i2) - str.length(), 0, l9jVar.c.length());
                l9jVar.f(t6a.g(c, c));
                return Unit.a;
            case 1:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("DELETE FROM saved_searches_table WHERE id = ? AND entity LIKE ?");
                try {
                    V0.q(1, i2);
                    V0.L(2, str);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 2:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("UPDATE saved_searches_table SET json = ? WHERE id = ?");
                try {
                    V0.L(1, str);
                    V0.q(2, i2);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 3:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    V0.L(1, str);
                    V0.q(2, i2);
                    return V0.U0() ? new ari(V0.F0(w1a.r(V0, "work_spec_id")), (int) V0.getLong(w1a.r(V0, "generation")), (int) V0.getLong(w1a.r(V0, "system_id"))) : null;
                } finally {
                }
            case 4:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    V0.L(1, str);
                    V0.q(2, i2);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            default:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                V0 = glgVar5.V0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    V0.q(1, i2);
                    V0.L(2, str);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
        }
    }

    public /* synthetic */ pu9(String str, int i, int i2) {
        this.a = i2;
        this.c = str;
        this.b = i;
    }
}
