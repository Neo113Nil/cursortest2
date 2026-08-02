package com.vk.repository.internal.repos.stickers.database;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.vk.dto.common.id.UserId;
import java.util.HashMap;
import xsna.asu0;
import xsna.bhv0;
import xsna.dyi;
import xsna.e43;
import xsna.eyb0;
import xsna.ftq;
import xsna.i6e0;
import xsna.iaw0;
import xsna.jvf;
import xsna.k8w0;
import xsna.kyp0;
import xsna.n9l0;
import xsna.o25;
import xsna.q6n0;
import xsna.s2q;
import xsna.s3q0;
import xsna.u9f0;
import xsna.ybl0;
import xsna.z4e0;
import xsna.zvp0;

/* compiled from: StickersDatabase.kt */
/* loaded from: classes5.dex */
public abstract class StickersDatabase extends RoomDatabase {
    public static final HashMap<UserId, StickersDatabase> m = new HashMap<>();

    /* compiled from: StickersDatabase.kt */
    public static final class a {
        public static void a(UserId userId) {
            synchronized (StickersDatabase.class) {
                StickersDatabase remove = StickersDatabase.m.remove(userId);
                if (remove != null) {
                    jvf jvfVar = remove.h;
                    synchronized (jvfVar) {
                        if (jvfVar.c.compareAndSet(false, true)) {
                            s3q0 s3q0Var = s3q0.a;
                            while (jvfVar.b.get() != 0) {
                            }
                            jvfVar.a.invoke();
                        }
                    }
                }
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                context.deleteDatabase("stickers_database_" + userId.b);
            }
        }

        public static StickersDatabase b() {
            HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
            UserId c = o25.a().c();
            HashMap<UserId, StickersDatabase> hashMap2 = StickersDatabase.m;
            if (hashMap2.get(c) == null) {
                synchronized (StickersDatabase.class) {
                    try {
                        if (hashMap2.get(c) == null) {
                            String str = "stickers_database_" + c.b;
                            Context context = e43.a;
                            if (context == null) {
                                context = null;
                            }
                            RoomDatabase.a a = bhv0.a(context, str, StickersDatabase.class);
                            a.c();
                            asu0.a.getClass();
                            a.f = asu0.n();
                            hashMap2.put(c, (StickersDatabase) a.b());
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return hashMap2.get(c);
        }
    }

    public abstract ftq A();

    public abstract eyb0 B();

    public abstract z4e0 C();

    public abstract i6e0 D();

    public abstract u9f0 E();

    public abstract n9l0 F();

    public abstract ybl0 G();

    public abstract q6n0 H();

    public abstract zvp0 I();

    public abstract kyp0 J();

    public abstract k8w0 K();

    public abstract iaw0 L();

    public abstract dyi y();

    public abstract s2q z();
}
