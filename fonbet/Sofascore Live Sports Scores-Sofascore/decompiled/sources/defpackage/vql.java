package defpackage;

import com.blaze.blazesdk.database.BlazeDatabaseMigrations;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vql extends njc {
    public vql() {
        super(5, 7);
    }

    @Override // defpackage.njc
    public final void b(dni dniVar) {
        dniVar.getClass();
        BlazeDatabaseMigrations.INSTANCE.migrateToVersion7(dniVar);
    }
}
