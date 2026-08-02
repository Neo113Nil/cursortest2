package R2;

import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* renamed from: R2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1533i extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1533i f10037c = new C1533i();

    public C1533i() {
        super(15, 16);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        db2.z("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        db2.z("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        db2.z("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        db2.z("DROP TABLE `SystemIdInfo`");
        db2.z("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
