package androidx.room;

import E2.h;
import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z2.AbstractC6912b;

/* loaded from: classes.dex */
public class z extends h.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f23470g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public C2270h f23471c;

    /* renamed from: d, reason: collision with root package name */
    public final b f23472d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23473e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23474f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(E2.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor p12 = db2.p1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (p12.moveToFirst()) {
                    if (p12.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                CloseableKt.closeFinally(p12, null);
                return z10;
            } finally {
            }
        }

        public final boolean b(E2.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor p12 = db2.p1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (p12.moveToFirst()) {
                    if (p12.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                CloseableKt.closeFinally(p12, null);
                return z10;
            } finally {
            }
        }

        public a() {
        }
    }

    public static abstract class b {

        @JvmField
        public final int version;

        public b(int i10) {
            this.version = i10;
        }

        public abstract void createAllTables(E2.g gVar);

        public abstract void dropAllTables(E2.g gVar);

        public abstract void onCreate(E2.g gVar);

        public abstract void onOpen(E2.g gVar);

        public abstract void onPostMigrate(E2.g gVar);

        public abstract void onPreMigrate(E2.g gVar);

        public abstract c onValidateSchema(E2.g gVar);

        @Deprecated(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        public void validateMigration(@NotNull E2.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f23475a;

        /* renamed from: b, reason: collision with root package name */
        public final String f23476b;

        public c(boolean z10, String str) {
            this.f23475a = z10;
            this.f23476b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C2270h configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.version);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f23471c = configuration;
        this.f23472d = delegate;
        this.f23473e = identityHash;
        this.f23474f = legacyHash;
    }

    @Override // E2.h.a
    public void b(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.b(db2);
    }

    @Override // E2.h.a
    public void d(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean a10 = f23470g.a(db2);
        this.f23472d.createAllTables(db2);
        if (!a10) {
            c onValidateSchema = this.f23472d.onValidateSchema(db2);
            if (!onValidateSchema.f23475a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f23476b);
            }
        }
        j(db2);
        this.f23472d.onCreate(db2);
    }

    @Override // E2.h.a
    public void e(E2.g db2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(db2, "db");
        g(db2, i10, i11);
    }

    @Override // E2.h.a
    public void f(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.f(db2);
        h(db2);
        this.f23472d.onOpen(db2);
        this.f23471c = null;
    }

    @Override // E2.h.a
    public void g(E2.g db2, int i10, int i11) {
        List d10;
        Intrinsics.checkNotNullParameter(db2, "db");
        C2270h c2270h = this.f23471c;
        if (c2270h == null || (d10 = c2270h.f23360d.d(i10, i11)) == null) {
            C2270h c2270h2 = this.f23471c;
            if (c2270h2 != null && !c2270h2.a(i10, i11)) {
                this.f23472d.dropAllTables(db2);
                this.f23472d.createAllTables(db2);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f23472d.onPreMigrate(db2);
        Iterator it = d10.iterator();
        while (it.hasNext()) {
            ((AbstractC6912b) it.next()).a(db2);
        }
        c onValidateSchema = this.f23472d.onValidateSchema(db2);
        if (onValidateSchema.f23475a) {
            this.f23472d.onPostMigrate(db2);
            j(db2);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f23476b);
        }
    }

    public final void h(E2.g gVar) {
        if (!f23470g.b(gVar)) {
            c onValidateSchema = this.f23472d.onValidateSchema(gVar);
            if (onValidateSchema.f23475a) {
                this.f23472d.onPostMigrate(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f23476b);
            }
        }
        Cursor S10 = gVar.S(new E2.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = S10.moveToFirst() ? S10.getString(0) : null;
            CloseableKt.closeFinally(S10, null);
            if (Intrinsics.areEqual(this.f23473e, string) || Intrinsics.areEqual(this.f23474f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f23473e + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(S10, th2);
                throw th3;
            }
        }
    }

    public final void i(E2.g gVar) {
        gVar.z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void j(E2.g gVar) {
        i(gVar);
        gVar.z(y.a(this.f23473e));
    }
}
