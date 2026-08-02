package R2;

import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* renamed from: R2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1539o extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1539o f10043c = new C1539o();

    public C1539o() {
        super(7, 8);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
