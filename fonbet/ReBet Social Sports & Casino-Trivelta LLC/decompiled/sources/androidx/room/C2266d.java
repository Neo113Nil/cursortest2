package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: androidx.room.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2266d implements E2.h, InterfaceC2271i {

    /* renamed from: a, reason: collision with root package name */
    public final E2.h f23304a;

    /* renamed from: b, reason: collision with root package name */
    public final C2265c f23305b;

    /* renamed from: c, reason: collision with root package name */
    public final a f23306c;

    /* renamed from: androidx.room.d$a */
    public static final class a implements E2.g {

        /* renamed from: a, reason: collision with root package name */
        public final C2265c f23307a;

        /* renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        public static final class C0400a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final C0400a f23308d = new C0400a();

            public C0400a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(E2.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.x();
            }
        }

        /* renamed from: androidx.room.d$a$b */
        public static final class b extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f23309d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f23309d = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(E2.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.z(this.f23309d);
                return null;
            }
        }

        /* renamed from: androidx.room.d$a$c */
        public static final class c extends Lambda implements Function1 {
            final /* synthetic */ Object[] $bindArgs;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f23310d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, Object[] objArr) {
                super(1);
                this.f23310d = str;
                this.$bindArgs = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(E2.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.b0(this.f23310d, this.$bindArgs);
                return null;
            }
        }

        /* renamed from: androidx.room.d$a$d, reason: collision with other inner class name */
        public /* synthetic */ class C0401d extends FunctionReferenceImpl implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0401d f23311a = new C0401d();

            public C0401d() {
                super(1, E2.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E2.g p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return Boolean.valueOf(p02.F1());
            }
        }

        /* renamed from: androidx.room.d$a$e */
        public static final class e extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final e f23312d = new e();

            public e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E2.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Boolean.valueOf(db2.N1());
            }
        }

        /* renamed from: androidx.room.d$a$f */
        public static final class f extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final f f23313d = new f();

            public f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(E2.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.l();
            }
        }

        /* renamed from: androidx.room.d$a$g */
        public static final class g extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final g f23314d = new g();

            public g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(E2.g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        }

        /* renamed from: androidx.room.d$a$h */
        public static final class h extends Lambda implements Function1 {
            final /* synthetic */ Object[] $whereArgs;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f23315d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f23316e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ ContentValues f23317f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f23318g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f23315d = str;
                this.f23316e = i10;
                this.f23317f = contentValues;
                this.f23318g = str2;
                this.$whereArgs = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(E2.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Integer.valueOf(db2.i1(this.f23315d, this.f23316e, this.f23317f, this.f23318g, this.$whereArgs));
            }
        }

        public a(C2265c autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f23307a = autoCloser;
        }

        @Override // E2.g
        public boolean F1() {
            if (this.f23307a.h() == null) {
                return false;
            }
            return ((Boolean) this.f23307a.g(C0401d.f23311a)).booleanValue();
        }

        @Override // E2.g
        public boolean N1() {
            return ((Boolean) this.f23307a.g(e.f23312d)).booleanValue();
        }

        @Override // E2.g
        public E2.k R0(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.f23307a);
        }

        @Override // E2.g
        public Cursor S(E2.j query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f23307a.j().S(query), this.f23307a);
            } catch (Throwable th2) {
                this.f23307a.e();
                throw th2;
            }
        }

        @Override // E2.g
        public void a0() {
            Unit unit;
            E2.g h10 = this.f23307a.h();
            if (h10 != null) {
                h10.a0();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // E2.g
        public void b0(String sql, Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.f23307a.g(new c(sql, bindArgs));
        }

        @Override // E2.g
        public void c0() {
            try {
                this.f23307a.j().c0();
            } catch (Throwable th2) {
                this.f23307a.e();
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f23307a.d();
        }

        public final void d() {
            this.f23307a.g(g.f23314d);
        }

        @Override // E2.g
        public int i1(String table, int i10, ContentValues values, String str, Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f23307a.g(new h(table, i10, values, str, objArr))).intValue();
        }

        @Override // E2.g
        public boolean isOpen() {
            E2.g h10 = this.f23307a.h();
            if (h10 == null) {
                return false;
            }
            return h10.isOpen();
        }

        @Override // E2.g
        public String l() {
            return (String) this.f23307a.g(f.f23313d);
        }

        @Override // E2.g
        public void l0() {
            if (this.f23307a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                E2.g h10 = this.f23307a.h();
                Intrinsics.checkNotNull(h10);
                h10.l0();
            } finally {
                this.f23307a.e();
            }
        }

        @Override // E2.g
        public Cursor p1(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f23307a.j().p1(query), this.f23307a);
            } catch (Throwable th2) {
                this.f23307a.e();
                throw th2;
            }
        }

        @Override // E2.g
        public Cursor t0(E2.j query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f23307a.j().t0(query, cancellationSignal), this.f23307a);
            } catch (Throwable th2) {
                this.f23307a.e();
                throw th2;
            }
        }

        @Override // E2.g
        public void v() {
            try {
                this.f23307a.j().v();
            } catch (Throwable th2) {
                this.f23307a.e();
                throw th2;
            }
        }

        @Override // E2.g
        public List x() {
            return (List) this.f23307a.g(C0400a.f23308d);
        }

        @Override // E2.g
        public void z(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f23307a.g(new b(sql));
        }
    }

    /* renamed from: androidx.room.d$b */
    public static final class b implements E2.k {

        /* renamed from: a, reason: collision with root package name */
        public final String f23319a;

        /* renamed from: b, reason: collision with root package name */
        public final C2265c f23320b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f23321c;

        /* renamed from: androidx.room.d$b$a */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final a f23322d = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(E2.k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.J0());
            }
        }

        /* renamed from: androidx.room.d$b$b, reason: collision with other inner class name */
        public static final class C0402b extends Lambda implements Function1 {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Function1 f23324e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0402b(Function1 function1) {
                super(1);
                this.f23324e = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(E2.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                E2.k R02 = db2.R0(b.this.f23319a);
                b.this.r(R02);
                return this.f23324e.invoke(R02);
            }
        }

        /* renamed from: androidx.room.d$b$c */
        public static final class c extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final c f23325d = new c();

            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(E2.k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Integer.valueOf(obj.G());
            }
        }

        public b(String sql, C2265c autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f23319a = sql;
            this.f23320b = autoCloser;
            this.f23321c = new ArrayList();
        }

        public final Object B(Function1 function1) {
            return this.f23320b.g(new C0402b(function1));
        }

        @Override // E2.i
        public void C1(int i10) {
            J(i10, null);
        }

        @Override // E2.k
        public int G() {
            return ((Number) B(c.f23325d)).intValue();
        }

        public final void J(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f23321c.size() && (size = this.f23321c.size()) <= i11) {
                while (true) {
                    this.f23321c.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f23321c.set(i11, obj);
        }

        @Override // E2.k
        public long J0() {
            return ((Number) B(a.f23322d)).longValue();
        }

        @Override // E2.i
        public void M(int i10, double d10) {
            J(i10, Double.valueOf(d10));
        }

        @Override // E2.i
        public void P0(int i10, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            J(i10, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // E2.i
        public void h1(int i10, long j10) {
            J(i10, Long.valueOf(j10));
        }

        @Override // E2.i
        public void j1(int i10, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            J(i10, value);
        }

        public final void r(E2.k kVar) {
            Iterator it = this.f23321c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.f23321c.get(i10);
                if (obj == null) {
                    kVar.C1(i11);
                } else if (obj instanceof Long) {
                    kVar.h1(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.M(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.P0(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.j1(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }
    }

    /* renamed from: androidx.room.d$c */
    public static final class c implements Cursor {

        /* renamed from: a, reason: collision with root package name */
        public final Cursor f23326a;

        /* renamed from: b, reason: collision with root package name */
        public final C2265c f23327b;

        public c(Cursor delegate, C2265c autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f23326a = delegate;
            this.f23327b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f23326a.close();
            this.f23327b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f23326a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f23326a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f23326a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f23326a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f23326a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f23326a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f23326a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f23326a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f23326a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f23326a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f23326a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f23326a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f23326a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f23326a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return E2.c.a(this.f23326a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return E2.f.a(this.f23326a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f23326a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f23326a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f23326a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f23326a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f23326a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f23326a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f23326a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f23326a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f23326a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f23326a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f23326a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f23326a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f23326a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f23326a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f23326a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f23326a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f23326a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f23326a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f23326a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f23326a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f23326a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            E2.e.a(this.f23326a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f23326a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            E2.f.b(this.f23326a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f23326a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f23326a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C2266d(E2.h delegate, C2265c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f23304a = delegate;
        this.f23305b = autoCloser;
        autoCloser.k(getDelegate());
        this.f23306c = new a(autoCloser);
    }

    @Override // E2.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23306c.close();
    }

    @Override // E2.h
    public String getDatabaseName() {
        return this.f23304a.getDatabaseName();
    }

    @Override // androidx.room.InterfaceC2271i
    public E2.h getDelegate() {
        return this.f23304a;
    }

    @Override // E2.h
    public E2.g getWritableDatabase() {
        this.f23306c.d();
        return this.f23306c;
    }

    @Override // E2.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f23304a.setWriteAheadLoggingEnabled(z10);
    }
}
