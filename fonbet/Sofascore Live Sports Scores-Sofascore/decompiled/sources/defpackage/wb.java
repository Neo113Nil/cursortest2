package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wb {
    public final Context a;
    public final long b;
    public final ob c;
    public final tb d;
    public final qb e;
    public final LinkedHashMap f;

    public wb(Context context, long j, ob obVar, tb tbVar, qb qbVar, int i) {
        j = (i & 2) != 0 ? (Float.floatToRawIntBits(100.0f) & 4294967295L) | (Float.floatToRawIntBits(100.0f) << 32) : j;
        obVar = (i & 4) != 0 ? null : obVar;
        qbVar = (i & 16) != 0 ? null : qbVar;
        context.getClass();
        this.a = context;
        this.b = j;
        this.c = obVar;
        this.d = tbVar;
        this.e = qbVar;
        this.f = new LinkedHashMap();
    }

    public final void a(ha5 ha5Var, long j, int i, float f) {
        tb tbVar = this.d;
        if (tbVar == null) {
            return;
        }
        long c = c(ha5Var, j);
        ha5.U(ha5Var, b(i), tbVar.b, c, f, e28.a, 96);
        ha5.U(ha5Var, b(tbVar.a), tbVar.b, c, f, tbVar.c, 96);
    }

    public final long b(int i) {
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new r13(hkg.b(this.a.getColor(i)));
            linkedHashMap.put(valueOf, obj);
        }
        return ((r13) obj).a;
    }

    public final long c(ha5 ha5Var, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long j2 = this.b;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) * (intBitsToFloat / Float.intBitsToFloat((int) (j2 >> 32)));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) * (Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
        return (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
    }
}
