package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class mcl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ mcl(int i, long j, String str) {
        this.a = i;
        this.b = j;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int i = this.a;
        String str = this.c;
        long j = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                V0 = glgVar.V0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    V0.q(1, j);
                    V0.L(2, str);
                    V0.U0();
                    int y = u0a.y(glgVar);
                    V0.close();
                    return Integer.valueOf(y);
                } finally {
                }
            default:
                glgVar.getClass();
                V0 = glgVar.V0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    V0.q(1, j);
                    V0.L(2, str);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
        }
    }
}
