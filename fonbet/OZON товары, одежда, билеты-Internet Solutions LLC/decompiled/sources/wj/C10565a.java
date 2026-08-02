package wj;

import Ej.p;
import android.app.Application;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOutOfMemoryException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.harLogger.HttpArchive;
import vj.C10324a;

/* renamed from: wj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10565a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static AtomicBoolean f104573c = new AtomicBoolean(true);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10324a f104574a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f104575b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: wj.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static final class EnumC2265a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC2265a[] $VALUES;
        public static final EnumC2265a ASC;
        public static final EnumC2265a DESC;

        static {
            EnumC2265a enumC2265a = new EnumC2265a("DESC", 0);
            DESC = enumC2265a;
            EnumC2265a enumC2265a2 = new EnumC2265a("ASC", 1);
            ASC = enumC2265a2;
            EnumC2265a[] enumC2265aArr = {enumC2265a, enumC2265a2};
            $VALUES = enumC2265aArr;
            $ENTRIES = Xc.b.a(enumC2265aArr);
        }

        private EnumC2265a() {
            throw null;
        }

        public static EnumC2265a valueOf(String str) {
            return (EnumC2265a) Enum.valueOf(EnumC2265a.class, str);
        }

        public static EnumC2265a[] values() {
            return (EnumC2265a[]) $VALUES.clone();
        }
    }

    public C10565a(@NotNull Application application, @NotNull C10324a harLogConfig) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(harLogConfig, "harLogConfig");
        this.f104574a = harLogConfig;
        this.f104575b = new d(application);
    }

    private final SQLiteDatabase b() {
        SQLiteDatabase writableDatabase = this.f104575b.getWritableDatabase();
        Intrinsics.checkNotNullExpressionValue(writableDatabase, "getWritableDatabase(...)");
        return writableDatabase;
    }

    public static long c(C10565a c10565a) {
        EnumC2265a sortOrder = EnumC2265a.DESC;
        c10565a.getClass();
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        Cursor rawQuery = c10565a.b().rawQuery("SELECT countSession FROM har_logs ORDER BY rowid " + sortOrder.name() + " LIMIT 1", null);
        try {
            Intrinsics.f(rawQuery);
            long d11 = f.d(rawQuery);
            rawQuery.close();
            return d11;
        } finally {
        }
    }

    private final void e(e eVar) {
        long c11;
        AtomicBoolean atomicBoolean = f104573c;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            c11 = c(this) + 1;
        } else {
            c11 = c(this);
        }
        b().insertOrThrow("har_logs", null, f.c(e.a(eVar, c11)));
        SQLiteDatabase b11 = b();
        b11.delete("har_logs", kotlin.text.h.E0("countSession <= " + (c11 - this.f104574a.d())), null);
    }

    @NotNull
    public final String a() {
        Cursor rawQuery = b().rawQuery("SELECT * FROM har_logs ORDER BY rowid ASC", null);
        try {
            Intrinsics.f(rawQuery);
            HttpArchive a11 = f.a(rawQuery, this.f104574a);
            rawQuery.close();
            return g.c(a11);
        } finally {
        }
    }

    public final void d() {
        b().delete("har_logs", "1", null);
    }

    public final void f(@NotNull e entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        try {
            e(entry);
        } catch (SQLiteOutOfMemoryException unused) {
            p.b("Running out of disk space while saving to database.");
            d();
            try {
                e(entry);
            } catch (Throwable th2) {
                p.b("Failed to save recording: " + th2.getMessage() + ".");
            }
        } catch (Throwable th3) {
            p.b("Failed to save recording: " + th3.getMessage() + ".");
        }
    }
}
