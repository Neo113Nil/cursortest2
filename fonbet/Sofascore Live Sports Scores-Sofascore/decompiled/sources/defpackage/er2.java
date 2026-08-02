package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class er2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ er2(int i, int i2, long j, long j2) {
        this.a = i2;
        this.b = j;
        this.c = i;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int y;
        int i = this.a;
        long j = this.d;
        int i2 = this.c;
        long j2 = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                V0 = glgVar.V0("UPDATE chat_message_table SET voteTimestamp = ? WHERE eventId = ? AND messageTimestamp = ?");
                try {
                    V0.q(1, j2);
                    V0.q(2, i2);
                    V0.q(3, j);
                    V0.U0();
                    y = u0a.y(glgVar);
                    V0.close();
                    break;
                } finally {
                }
            default:
                glgVar.getClass();
                V0 = glgVar.V0("UPDATE chat_message_table SET reportTimestamp = ? WHERE eventId = ? AND messageTimestamp = ?");
                try {
                    V0.q(1, j2);
                    V0.q(2, i2);
                    V0.q(3, j);
                    V0.U0();
                    y = u0a.y(glgVar);
                    break;
                } finally {
                }
        }
        return Integer.valueOf(y);
    }
}
