package R2;

import Y2.AbstractC1823n;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* loaded from: classes.dex */
public final class Z extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f9979c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9979c = context;
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Y2.B.c(this.f9979c, db2);
        AbstractC1823n.c(this.f9979c, db2);
    }
}
