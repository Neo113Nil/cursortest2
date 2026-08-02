package Wg;

import gh.AbstractC4383d;
import gh.C4387h;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class f extends AbstractC4383d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f13260g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final C4387h f13261h = new C4387h("Before");

    /* renamed from: i, reason: collision with root package name */
    public static final C4387h f13262i = new C4387h("State");

    /* renamed from: j, reason: collision with root package name */
    public static final C4387h f13263j = new C4387h("Transform");

    /* renamed from: k, reason: collision with root package name */
    public static final C4387h f13264k = new C4387h("Render");

    /* renamed from: l, reason: collision with root package name */
    public static final C4387h f13265l = new C4387h("Send");

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13266f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4387h a() {
            return f.f13261h;
        }

        public final C4387h b() {
            return f.f13264k;
        }

        public final C4387h c() {
            return f.f13265l;
        }

        public a() {
        }
    }

    public f(boolean z10) {
        super(f13261h, f13262i, f13263j, f13264k, f13265l);
        this.f13266f = z10;
    }

    @Override // gh.AbstractC4383d
    public boolean g() {
        return this.f13266f;
    }
}
