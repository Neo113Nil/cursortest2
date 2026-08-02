package j1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    private boolean f68724a = true;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private r f68725b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private r f68726c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private r f68727d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private r f68728e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private r f68729f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private r f68730g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private r f68731h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private r f68732i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private Object f68733j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private Object f68734k;

    static final class a extends AbstractC7737t implements Function1<c, r> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f68735b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final r invoke(c cVar) {
            r rVar;
            cVar.d();
            rVar = r.f68738b;
            return rVar;
        }
    }

    static final class b extends AbstractC7737t implements Function1<c, r> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f68736b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final r invoke(c cVar) {
            r rVar;
            cVar.d();
            rVar = r.f68738b;
            return rVar;
        }
    }

    public n() {
        r rVar;
        r rVar2;
        r rVar3;
        r rVar4;
        r rVar5;
        r rVar6;
        r rVar7;
        r rVar8;
        rVar = r.f68738b;
        this.f68725b = rVar;
        rVar2 = r.f68738b;
        this.f68726c = rVar2;
        rVar3 = r.f68738b;
        this.f68727d = rVar3;
        rVar4 = r.f68738b;
        this.f68728e = rVar4;
        rVar5 = r.f68738b;
        this.f68729f = rVar5;
        rVar6 = r.f68738b;
        this.f68730g = rVar6;
        rVar7 = r.f68738b;
        this.f68731h = rVar7;
        rVar8 = r.f68738b;
        this.f68732i = rVar8;
        this.f68733j = a.f68735b;
        this.f68734k = b.f68736b;
    }

    @Override // j1.m
    public final void a(boolean z11) {
        this.f68724a = z11;
    }

    @Override // j1.m
    public final void b(@NotNull Function1<? super c, r> function1) {
        this.f68734k = function1;
    }

    @Override // j1.m
    public final boolean c() {
        return this.f68724a;
    }

    @Override // j1.m
    public final void d(@NotNull Function1<? super c, r> function1) {
        this.f68733j = function1;
    }

    @NotNull
    public final r e() {
        return this.f68728e;
    }

    @NotNull
    public final r f() {
        return this.f68732i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<j1.c, j1.r>] */
    @NotNull
    public final Function1<c, r> g() {
        return this.f68733j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<j1.c, j1.r>] */
    @NotNull
    public final Function1<c, r> h() {
        return this.f68734k;
    }

    @NotNull
    public final r i() {
        return this.f68729f;
    }

    @NotNull
    public final r j() {
        return this.f68725b;
    }

    @NotNull
    public final r k() {
        return this.f68726c;
    }

    @NotNull
    public final r l() {
        return this.f68730g;
    }

    @NotNull
    public final r m() {
        return this.f68731h;
    }

    @NotNull
    public final r n() {
        return this.f68727d;
    }
}
