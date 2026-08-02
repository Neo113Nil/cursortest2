package R2;

import z2.AbstractC6912b;

/* loaded from: classes.dex */
public final class T extends AbstractC6912b {
    public T() {
        super(22, 23);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g gVar) {
        gVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
