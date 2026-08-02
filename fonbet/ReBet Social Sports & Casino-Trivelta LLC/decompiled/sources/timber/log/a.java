package timber.log;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class a {
    private static final b[] TREE_ARRAY_EMPTY;

    /* renamed from: a, reason: collision with root package name */
    public static final List f65905a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final b f65906b = new C0916a();
    static volatile b[] forestAsArray;

    /* renamed from: timber.log.a$a, reason: collision with other inner class name */
    public static class C0916a extends b {
        @Override // timber.log.a.b
        public void a(String str, Object... objArr) {
            for (b bVar : a.forestAsArray) {
                bVar.a(str, objArr);
            }
        }

        @Override // timber.log.a.b
        public void b(String str, Object... objArr) {
            for (b bVar : a.forestAsArray) {
                bVar.b(str, objArr);
            }
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadLocal f65907a = new ThreadLocal();

        public abstract void a(String str, Object... objArr);

        public abstract void b(String str, Object... objArr);
    }

    static {
        b[] bVarArr = new b[0];
        TREE_ARRAY_EMPTY = bVarArr;
        forestAsArray = bVarArr;
    }

    public static void a(String str, Object... objArr) {
        f65906b.a(str, objArr);
    }

    public static void b(String str, Object... objArr) {
        f65906b.b(str, objArr);
    }
}
