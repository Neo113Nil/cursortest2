package f3;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends n2.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9364c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f9365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context mContext, int i5, int i10) {
        super(i5, i10);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f9365d = mContext;
    }

    @Override // n2.b
    public final void b(t2.a sqLiteDatabase) {
        int i5 = this.f9364c;
        Context context = this.f9365d;
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "db");
        switch (i5) {
            case 0:
                if (this.f20820b >= 10) {
                    sqLiteDatabase.F(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                sqLiteDatabase.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j6 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    sqLiteDatabase.m();
                    try {
                        sqLiteDatabase.F(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        sqLiteDatabase.F(new Object[]{"reschedule_needed", Long.valueOf(j6)});
                        sharedPreferences.edit().clear().apply();
                        sqLiteDatabase.G();
                    } finally {
                    }
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    sqLiteDatabase.m();
                    try {
                        sqLiteDatabase.F(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        sqLiteDatabase.F(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        sqLiteDatabase.G();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9365d = context;
    }
}
