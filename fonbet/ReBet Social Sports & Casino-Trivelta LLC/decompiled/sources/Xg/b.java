package Xg;

import gh.AbstractC4383d;
import gh.C4387h;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class b extends AbstractC4383d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f13834g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final C4387h f13835h = new C4387h("Before");

    /* renamed from: i, reason: collision with root package name */
    public static final C4387h f13836i = new C4387h("State");

    /* renamed from: j, reason: collision with root package name */
    public static final C4387h f13837j = new C4387h("After");

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13838f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4387h a() {
            return b.f13837j;
        }

        public a() {
        }
    }

    public b(boolean z10) {
        super(f13835h, f13836i, f13837j);
        this.f13838f = z10;
    }

    @Override // gh.AbstractC4383d
    public boolean g() {
        return this.f13838f;
    }
}
