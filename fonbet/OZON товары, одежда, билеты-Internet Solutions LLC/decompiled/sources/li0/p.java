package li0;

import J4.s;
import J4.w;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import ru.ozon.tracker.db.TrackerDataBase_Impl;
import ru.ozon.tracker.db.entities.UserData;

/* loaded from: classes7.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    private final TrackerDataBase_Impl f73368a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<UserData> f73369b;

    final class a implements Callable<UserData> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f73370a;

        a(w wVar) {
            this.f73370a = wVar;
        }

        @Override // java.util.concurrent.Callable
        public final UserData call() throws Exception {
            s sVar = p.this.f73368a;
            w wVar = this.f73370a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                UserData userData = null;
                if (b11.moveToFirst()) {
                    UserData userData2 = new UserData(b11.getInt(0), b11.getLong(1), b11.getString(2), b11.isNull(3) ? null : Integer.valueOf(b11.getInt(3)), b11.getString(4));
                    userData2.setId(b11.getLong(5));
                    userData = userData2;
                }
                return userData;
            } finally {
                b11.close();
                wVar.release();
            }
        }
    }

    public p(@NonNull TrackerDataBase_Impl trackerDataBase_Impl) {
        this.f73368a = trackerDataBase_Impl;
        this.f73369b = new n(trackerDataBase_Impl);
    }

    @Override // li0.m
    public final Object a(UserData userData, kotlin.coroutines.jvm.internal.j jVar) {
        return J4.f.c(this.f73368a, new o(this, userData), jVar);
    }

    @Override // li0.m
    public final Object b(kotlin.coroutines.d<? super UserData> dVar) {
        w j11 = w.j(0, "SELECT `user_data`.`ab_group` AS `ab_group`, `user_data`.`region_id` AS `region_id`, `user_data`.`user_id` AS `user_id`, `user_data`.`company_id` AS `company_id`, `user_data`.`user_roles` AS `user_roles`, `user_data`.`id` AS `id` FROM user_data WHERE id = 1");
        return J4.f.b(this.f73368a, new CancellationSignal(), new a(j11), dVar);
    }
}
