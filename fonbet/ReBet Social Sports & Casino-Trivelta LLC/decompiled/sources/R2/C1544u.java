package R2;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* renamed from: R2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1544u extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f10066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1544u(Context mContext, int i10, int i11) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f10066c = mContext;
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (this.f68525b >= 10) {
            db2.b0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f10066c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
