package ru.ozon.app.android.abtool.data.local;

import K4.a;
import O4.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LK4/a;", "MIGRATION_1_2", "LK4/a;", "getMIGRATION_1_2", "()LK4/a;", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MigrationsKt {

    @NotNull
    private static final a MIGRATION_1_2 = new a() { // from class: ru.ozon.app.android.abtool.data.local.MigrationsKt$MIGRATION_1_2$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE feature_entity ADD COLUMN `override_value` TEXT");
        }
    };

    @NotNull
    public static final a getMIGRATION_1_2() {
        return MIGRATION_1_2;
    }
}
