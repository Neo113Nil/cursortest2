package H;

import B.F;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4267d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f4268e = 8;

    /* renamed from: a, reason: collision with root package name */
    public f f4269a;

    /* renamed from: b, reason: collision with root package name */
    public int f4270b;

    /* renamed from: c, reason: collision with root package name */
    public int f4271c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return h.d();
        }

        public final boolean b() {
            F f10;
            f10 = h.f4286b;
            return f10.a() != null;
        }

        public a() {
        }
    }

    public /* synthetic */ d(int i10, f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, fVar);
    }

    public int a() {
        return this.f4270b;
    }

    public f b() {
        return this.f4269a;
    }

    public abstract Function1 c();

    public abstract boolean d();

    public abstract int e();

    public abstract Function1 f();

    public abstract void g(k kVar);

    public abstract void h(int i10);

    public d(int i10, f fVar) {
        this.f4269a = fVar;
        this.f4270b = i10;
        this.f4271c = i10 != 0 ? h.m(i10, b()) : -1;
    }
}
