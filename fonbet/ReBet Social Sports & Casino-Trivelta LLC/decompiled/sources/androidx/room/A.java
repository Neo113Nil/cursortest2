package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A implements E2.j, E2.i {

    /* renamed from: e, reason: collision with root package name */
    public static final a f23242e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final TreeMap f23243f = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f23244a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f23245b;

    @NotNull
    private final int[] bindingTypes;

    /* renamed from: c, reason: collision with root package name */
    public final byte[][] f23246c;

    /* renamed from: d, reason: collision with root package name */
    public int f23247d;

    @JvmField
    @NotNull
    public final double[] doubleBindings;

    @JvmField
    @NotNull
    public final long[] longBindings;

    @JvmField
    @NotNull
    public final String[] stringBindings;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a(String query, int i10) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap treeMap = A.f23243f;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (ceilingEntry == null) {
                    Unit unit = Unit.INSTANCE;
                    A a10 = new A(i10, null);
                    a10.J(query, i10);
                    return a10;
                }
                treeMap.remove(ceilingEntry.getKey());
                A sqliteQuery = (A) ceilingEntry.getValue();
                sqliteQuery.J(query, i10);
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = A.f23243f;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ A(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static final A r(String str, int i10) {
        return f23242e.a(str, i10);
    }

    public int B() {
        return this.f23247d;
    }

    @Override // E2.i
    public void C1(int i10) {
        this.bindingTypes[i10] = 1;
    }

    public final void J(String query, int i10) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f23245b = query;
        this.f23247d = i10;
    }

    @Override // E2.i
    public void M(int i10, double d10) {
        this.bindingTypes[i10] = 3;
        this.doubleBindings[i10] = d10;
    }

    @Override // E2.i
    public void P0(int i10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[i10] = 4;
        this.stringBindings[i10] = value;
    }

    public final void U() {
        TreeMap treeMap = f23243f;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f23244a), this);
            f23242e.b();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // E2.j
    public String d() {
        String str = this.f23245b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // E2.i
    public void h1(int i10, long j10) {
        this.bindingTypes[i10] = 2;
        this.longBindings[i10] = j10;
    }

    @Override // E2.i
    public void j1(int i10, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[i10] = 5;
        this.f23246c[i10] = value;
    }

    @Override // E2.j
    public void k(E2.i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int B10 = B();
        if (1 > B10) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.bindingTypes[i10];
            if (i11 == 1) {
                statement.C1(i10);
            } else if (i11 == 2) {
                statement.h1(i10, this.longBindings[i10]);
            } else if (i11 == 3) {
                statement.M(i10, this.doubleBindings[i10]);
            } else if (i11 == 4) {
                String str = this.stringBindings[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.P0(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f23246c[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.j1(i10, bArr);
            }
            if (i10 == B10) {
                return;
            } else {
                i10++;
            }
        }
    }

    public A(int i10) {
        this.f23244a = i10;
        int i11 = i10 + 1;
        this.bindingTypes = new int[i11];
        this.longBindings = new long[i11];
        this.doubleBindings = new double[i11];
        this.stringBindings = new String[i11];
        this.f23246c = new byte[i11][];
    }
}
