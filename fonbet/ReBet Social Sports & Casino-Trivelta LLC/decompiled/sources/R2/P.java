package R2;

import z2.AbstractC6912b;

/* loaded from: classes.dex */
public final class P extends AbstractC6912b {
    public P() {
        super(18, 19);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g gVar) {
        gVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
