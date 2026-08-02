package R2;

import z2.AbstractC6912b;

/* loaded from: classes.dex */
public final class O extends AbstractC6912b {
    public O() {
        super(17, 18);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g gVar) {
        gVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        gVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
