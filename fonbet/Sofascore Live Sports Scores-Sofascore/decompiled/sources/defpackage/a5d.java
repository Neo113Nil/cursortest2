package defpackage;

import com.sofascore.model.database.DbNatsEvent;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a5d implements z4d {
    public final k6g a;
    public final s82 b = new s82(10);
    public final v8c c = new v8c(3);

    public a5d(k6g k6gVar) {
        this.a = k6gVar;
    }

    public final Object b(DbNatsEvent dbNatsEvent, sq3 sq3Var) {
        Object U = gz8.U(sq3Var, this.a, false, true, new lsb(15, this, dbNatsEvent));
        return U == lu3.a ? U : Unit.a;
    }
}
