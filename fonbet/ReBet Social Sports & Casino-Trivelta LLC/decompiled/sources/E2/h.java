package E2;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public interface h extends Closeable {

    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0065a f2947b = new C0065a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f2948a;

        /* renamed from: E2.h$a$a, reason: collision with other inner class name */
        public static final class C0065a {
            public /* synthetic */ C0065a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0065a() {
            }
        }

        public a(int i10) {
            this.f2948a = i10;
        }

        public final void a(String str) {
            if (StringsKt.equals(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                E2.b.c(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void c(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String l10 = db2.l();
                if (l10 != null) {
                    a(l10);
                    return;
                }
                return;
            }
            List list = null;
            try {
                try {
                    list = db2.x();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            } finally {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String l11 = db2.l();
                    if (l11 != null) {
                        a(l11);
                    }
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final C0066b f2949f = new C0066b(null);

        /* renamed from: a, reason: collision with root package name */
        public final Context f2950a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2951b;

        /* renamed from: c, reason: collision with root package name */
        public final a f2952c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2953d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f2954e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final Context f2955a;

            /* renamed from: b, reason: collision with root package name */
            public String f2956b;

            /* renamed from: c, reason: collision with root package name */
            public a f2957c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f2958d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f2959e;

            public a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f2955a = context;
            }

            public a a(boolean z10) {
                this.f2959e = z10;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f2957c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f2958d && ((str = this.f2956b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f2955a, this.f2956b, aVar, this.f2958d, this.f2959e);
            }

            public a c(a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f2957c = callback;
                return this;
            }

            public a d(String str) {
                this.f2956b = str;
                return this;
            }

            public a e(boolean z10) {
                this.f2958d = z10;
                return this;
            }
        }

        /* renamed from: E2.h$b$b, reason: collision with other inner class name */
        public static final class C0066b {
            public /* synthetic */ C0066b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new a(context);
            }

            public C0066b() {
            }
        }

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f2950a = context;
            this.f2951b = str;
            this.f2952c = callback;
            this.f2953d = z10;
            this.f2954e = z11;
        }

        public static final a a(Context context) {
            return f2949f.a(context);
        }
    }

    public interface c {
        h a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    g getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
