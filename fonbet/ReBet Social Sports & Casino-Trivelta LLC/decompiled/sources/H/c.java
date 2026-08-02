package H;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import z.q;

/* loaded from: classes.dex */
public abstract class c extends d {

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f4261f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f4262g;

    /* renamed from: h, reason: collision with root package name */
    public int f4263h;

    /* renamed from: i, reason: collision with root package name */
    public z.m f4264i;

    /* renamed from: j, reason: collision with root package name */
    public f f4265j;

    /* renamed from: k, reason: collision with root package name */
    public int f4266k;

    @NotNull
    private int[] previousPinnedSnapshots;

    /* renamed from: l, reason: collision with root package name */
    public static final a f4259l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f4260m = 8;

    @NotNull
    private static final int[] EmptyIntArray = new int[0];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(int i10, f fVar, Function1 function1, Function1 function12) {
        super(i10, fVar, null);
        this.f4261f = function1;
        this.f4262g = function12;
        this.f4265j = f.f4274d.a();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.f4266k = 1;
    }

    @Override // H.d
    public boolean d() {
        return false;
    }

    @Override // H.d
    public int e() {
        return this.f4263h;
    }

    @Override // H.d
    public Function1 f() {
        return this.f4262g;
    }

    @Override // H.d
    public void g(k kVar) {
        z.m i10 = i();
        if (i10 == null) {
            i10 = q.a();
            k(i10);
        }
        i10.f(kVar);
    }

    @Override // H.d
    public void h(int i10) {
        this.f4263h = i10;
    }

    public z.m i() {
        return this.f4264i;
    }

    @Override // H.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Function1 c() {
        return this.f4261f;
    }

    public void k(z.m mVar) {
        this.f4264i = mVar;
    }
}
