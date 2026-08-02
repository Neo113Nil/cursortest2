package M;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7386e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final f f7387f = new f(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f7388a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7389b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7390c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7391d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.f7387f;
        }

        public a() {
        }
    }

    public f(float f10, float f11, float f12, float f13) {
        this.f7388a = f10;
        this.f7389b = f11;
        this.f7390c = f12;
        this.f7391d = f13;
    }

    public final float b() {
        return this.f7391d;
    }

    public final float c() {
        return this.f7388a;
    }

    public final float d() {
        return this.f7390c;
    }

    public final float e() {
        return this.f7389b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f7388a, fVar.f7388a) == 0 && Float.compare(this.f7389b, fVar.f7389b) == 0 && Float.compare(this.f7390c, fVar.f7390c) == 0 && Float.compare(this.f7391d, fVar.f7391d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f7388a) * 31) + Float.hashCode(this.f7389b)) * 31) + Float.hashCode(this.f7390c)) * 31) + Float.hashCode(this.f7391d);
    }

    public String toString() {
        return "Rect.fromLTRB(" + M.a.a(this.f7388a, 1) + ", " + M.a.a(this.f7389b, 1) + ", " + M.a.a(this.f7390c, 1) + ", " + M.a.a(this.f7391d, 1) + ')';
    }
}
