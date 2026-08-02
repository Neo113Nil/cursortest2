package R8;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0193a f10089d = new C0193a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final a f10090e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f10091f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f10092g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f10093h;

    /* renamed from: a, reason: collision with root package name */
    public final d f10094a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10095b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f10096c;

    /* renamed from: R8.a$a, reason: collision with other inner class name */
    public static final class C0193a {
        public /* synthetic */ C0193a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            return new a(d.FAILED, str, null);
        }

        public final a b(String str) {
            return new a(d.FAILED_INITIAL, str, null);
        }

        public final a c() {
            return a.f10090e;
        }

        public final a d() {
            return a.f10091f;
        }

        public final a e() {
            return a.f10092g;
        }

        public final a f() {
            return a.f10093h;
        }

        public C0193a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 2;
        f10090e = new a(d.SUCCESS, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f10091f = new a(d.SUCCESS_INITIAL, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f10092g = new a(d.RUNNING, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f10093h = new a(d.RUNNING_INITIAL, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(d dVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, str);
    }

    public final Function0 e() {
        return this.f10096c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10094a == aVar.f10094a && Intrinsics.areEqual(this.f10095b, aVar.f10095b);
    }

    public final String f() {
        return this.f10095b;
    }

    public final d g() {
        return this.f10094a;
    }

    public final void h(Function0 function0) {
        this.f10096c = function0;
    }

    public int hashCode() {
        int hashCode = this.f10094a.hashCode() * 31;
        String str = this.f10095b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NetworkState(status=" + this.f10094a + ", msg=" + this.f10095b + ')';
    }

    public a(d dVar, String str) {
        this.f10094a = dVar;
        this.f10095b = str;
    }

    public /* synthetic */ a(d dVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? null : str);
    }
}
