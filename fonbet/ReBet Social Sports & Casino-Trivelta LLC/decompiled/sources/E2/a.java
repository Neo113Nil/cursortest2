package E2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final C0064a f2940b = new C0064a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f2941a;

    @Nullable
    private final Object[] bindArgs;

    /* renamed from: E2.a$a, reason: collision with other inner class name */
    public static final class C0064a {
        public /* synthetic */ C0064a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(i iVar, int i10, Object obj) {
            if (obj == null) {
                iVar.C1(i10);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.j1(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.M(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.M(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.h1(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.h1(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.h1(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.h1(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.P0(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.h1(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        public C0064a() {
        }
    }

    public a(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f2941a = query;
        this.bindArgs = objArr;
    }

    @Override // E2.j
    public String d() {
        return this.f2941a;
    }

    @Override // E2.j
    public void k(i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f2940b.b(statement, this.bindArgs);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
