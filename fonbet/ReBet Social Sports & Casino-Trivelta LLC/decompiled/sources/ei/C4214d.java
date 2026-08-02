package ei;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ei.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4214d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f46088a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46089b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46090c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46091d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46092e;

    /* renamed from: f, reason: collision with root package name */
    public String f46093f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46094g;

    /* renamed from: h, reason: collision with root package name */
    public String f46095h;

    /* renamed from: i, reason: collision with root package name */
    public EnumC4211a f46096i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f46097j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f46098k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f46099l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f46100m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f46101n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f46102o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46103p;

    /* renamed from: q, reason: collision with root package name */
    public gi.e f46104q;

    public C4214d(AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f46088a = json.f().i();
        this.f46089b = json.f().j();
        this.f46090c = json.f().k();
        this.f46091d = json.f().q();
        this.f46092e = json.f().m();
        this.f46093f = json.f().n();
        this.f46094g = json.f().g();
        this.f46095h = json.f().e();
        this.f46096i = json.f().f();
        this.f46097j = json.f().o();
        json.f().l();
        this.f46098k = json.f().h();
        this.f46099l = json.f().d();
        this.f46100m = json.f().a();
        this.f46101n = json.f().b();
        this.f46102o = json.f().c();
        this.f46103p = json.f().p();
        this.f46104q = json.a();
    }

    public final C4216f a() {
        if (this.f46103p) {
            if (!Intrinsics.areEqual(this.f46095h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f46096i != EnumC4211a.f46077c) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f46092e) {
            if (!Intrinsics.areEqual(this.f46093f, "    ")) {
                String str = this.f46093f;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f46093f).toString());
                    }
                }
            }
        } else if (!Intrinsics.areEqual(this.f46093f, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new C4216f(this.f46088a, this.f46090c, this.f46091d, this.f46102o, this.f46092e, this.f46089b, this.f46093f, this.f46094g, this.f46103p, this.f46095h, this.f46101n, this.f46097j, null, this.f46098k, this.f46099l, this.f46100m, this.f46096i);
    }

    public final gi.e b() {
        return this.f46104q;
    }

    public final void c(boolean z10) {
        this.f46088a = z10;
    }

    public final void d(boolean z10) {
        this.f46089b = z10;
    }

    public final void e(boolean z10) {
        this.f46090c = z10;
    }

    public final void f(boolean z10) {
        this.f46092e = z10;
    }

    public final void g(gi.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f46104q = eVar;
    }
}
