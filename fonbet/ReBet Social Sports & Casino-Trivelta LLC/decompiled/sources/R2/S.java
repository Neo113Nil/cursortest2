package R2;

import z2.AbstractC6912b;

/* loaded from: classes.dex */
public final class S extends AbstractC6912b {
    public S() {
        super(20, 21);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g gVar) {
        gVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
