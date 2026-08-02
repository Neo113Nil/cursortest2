package Wg;

import gh.AbstractC4383d;
import gh.C4387h;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class h extends AbstractC4383d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f13274g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final C4387h f13275h = new C4387h("Before");

    /* renamed from: i, reason: collision with root package name */
    public static final C4387h f13276i = new C4387h("State");

    /* renamed from: j, reason: collision with root package name */
    public static final C4387h f13277j = new C4387h("Monitoring");

    /* renamed from: k, reason: collision with root package name */
    public static final C4387h f13278k = new C4387h("Engine");

    /* renamed from: l, reason: collision with root package name */
    public static final C4387h f13279l = new C4387h("Receive");

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13280f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4387h a() {
            return h.f13278k;
        }

        public final C4387h b() {
            return h.f13279l;
        }

        public a() {
        }
    }

    public h(boolean z10) {
        super(f13275h, f13276i, f13277j, f13278k, f13279l);
        this.f13280f = z10;
    }

    @Override // gh.AbstractC4383d
    public boolean g() {
        return this.f13280f;
    }
}
