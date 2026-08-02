package R2;

import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* renamed from: R2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538n extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1538n f10042c = new C1538n();

    public C1538n() {
        super(6, 7);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
