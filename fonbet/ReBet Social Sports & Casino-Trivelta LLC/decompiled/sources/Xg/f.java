package Xg;

import gh.AbstractC4383d;
import gh.C4387h;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class f extends AbstractC4383d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f13844g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final C4387h f13845h = new C4387h("Receive");

    /* renamed from: i, reason: collision with root package name */
    public static final C4387h f13846i = new C4387h("Parse");

    /* renamed from: j, reason: collision with root package name */
    public static final C4387h f13847j = new C4387h("Transform");

    /* renamed from: k, reason: collision with root package name */
    public static final C4387h f13848k = new C4387h("State");

    /* renamed from: l, reason: collision with root package name */
    public static final C4387h f13849l = new C4387h("After");

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13850f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4387h a() {
            return f.f13846i;
        }

        public final C4387h b() {
            return f.f13845h;
        }

        public final C4387h c() {
            return f.f13847j;
        }

        public a() {
        }
    }

    public f(boolean z10) {
        super(f13845h, f13846i, f13847j, f13848k, f13849l);
        this.f13850f = z10;
    }

    @Override // gh.AbstractC4383d
    public boolean g() {
        return this.f13850f;
    }
}
