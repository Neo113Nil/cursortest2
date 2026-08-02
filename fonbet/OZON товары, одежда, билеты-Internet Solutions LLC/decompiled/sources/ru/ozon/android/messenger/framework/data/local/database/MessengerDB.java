package ru.ozon.android.messenger.framework.data.local.database;

import J4.r;
import J4.s;
import N3.C3660k;
import Sc.r;
import U7.d;
import android.content.Context;
import bd.h;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/android/messenger/framework/data/local/database/MessengerDB;", "LJ4/s;", "<init>", "()V", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class MessengerDB extends s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f87462a = new a();

    public static final class a {
        @NotNull
        public static MessengerDB a(@NotNull Context context, @NotNull String namespace, ru.ozon.android.messenger.framework.logger.b bVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            String str = "Database.db.messenger.ozon.ru_" + namespace;
            File databasePath = context.getDatabasePath(str);
            if (!databasePath.exists()) {
                File databasePath2 = context.getDatabasePath("Database.db.messenger.ozon.ru");
                if (databasePath2.exists()) {
                    File parentFile = databasePath.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    b(databasePath2, databasePath, bVar);
                    b(new File(d.e(databasePath2.getPath(), "-wal")), new File(d.e(databasePath.getPath(), "-wal")), bVar);
                    b(new File(d.e(databasePath2.getPath(), "-shm")), new File(d.e(databasePath.getPath(), "-shm")), bVar);
                }
            }
            s.a a11 = r.a(MessengerDB.class, str, context);
            a11.b(b.a());
            a11.b(b.b());
            return (MessengerDB) a11.d();
        }

        private static void b(File file, File file2, ru.ozon.android.messenger.framework.logger.b bVar) {
            Object a11;
            Object a12;
            Object a13;
            if (file.exists() && !file2.exists()) {
                try {
                    r.Companion companion = Sc.r.INSTANCE;
                    a11 = Boolean.valueOf(file.renameTo(file2));
                } catch (Throwable th2) {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    a11 = Sc.s.a(th2);
                }
                Throwable b11 = Sc.r.b(a11);
                if (b11 != null) {
                    if (bVar != null) {
                        bVar.log("MessengerDB : Can't rename " + file.getPath() + " to {to.path}, fallback to copy, error=" + b11.getMessage());
                    }
                    a11 = Boolean.FALSE;
                }
                if (((Boolean) a11).booleanValue()) {
                    return;
                }
                try {
                    h.g(file, file2);
                    a12 = file2;
                } catch (Throwable th3) {
                    r.Companion companion3 = Sc.r.INSTANCE;
                    a12 = Sc.s.a(th3);
                }
                if (!(a12 instanceof r.b)) {
                    a aVar = MessengerDB.f87462a;
                    try {
                        a13 = Boolean.valueOf(file.delete());
                    } catch (Throwable th4) {
                        r.Companion companion4 = Sc.r.INSTANCE;
                        a13 = Sc.s.a(th4);
                    }
                    Throwable b12 = Sc.r.b(a13);
                    if (b12 != null && bVar != null) {
                        bVar.log("MessengerDB: Can't delete " + file.getPath() + ", source may remain, error=" + b12.getMessage());
                    }
                }
                Throwable b13 = Sc.r.b(a12);
                if (b13 == null || bVar == null) {
                    return;
                }
                String path = file.getPath();
                String path2 = file2.getPath();
                String message = b13.getMessage();
                StringBuilder d11 = C3660k.d("MessengerDB: Can't copy ", path, " to ", path2, ", migration may be incomplete, error=");
                d11.append(message);
                bVar.log(d11.toString());
            }
        }
    }

    @NotNull
    public abstract ru.ozon.android.messenger.framework.data.local.database.draft.b a();

    @NotNull
    public abstract ru.ozon.android.messenger.framework.data.local.database.undelivered.a b();
}
