package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v6n implements nap {
    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        if (z6nVar.a == Timestamp.class) {
            return new w6n(h9pVar.b(new z6n(Date.class)));
        }
        return null;
    }
}
