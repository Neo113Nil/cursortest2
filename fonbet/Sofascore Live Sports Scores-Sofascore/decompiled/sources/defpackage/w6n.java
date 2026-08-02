package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w6n extends map {
    public static final v6n b = new v6n();
    public final map a;

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ Object read(e7n e7nVar) {
        Date date = (Date) this.a.read(e7nVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.map
    public final /* synthetic */ void write(f7n f7nVar, Object obj) {
        this.a.write(f7nVar, (Timestamp) obj);
    }
}
