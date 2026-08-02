package of;

import We.z;
import androidx.recyclerview.widget.m;
import gf.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;
import sf.C9681g;

/* renamed from: of.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8723b implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    private C9681g f78270d;

    /* renamed from: j, reason: collision with root package name */
    private long f78276j;

    /* renamed from: k, reason: collision with root package name */
    private TimeUnit f78277k;

    /* renamed from: l, reason: collision with root package name */
    private TimeUnit f78278l;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f78279m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private s f78280n;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f78267a = "";

    /* renamed from: b, reason: collision with root package name */
    private z.a f78268b = new z.a();

    /* renamed from: c, reason: collision with root package name */
    private z.a f78269c = new z.a();

    /* renamed from: e, reason: collision with root package name */
    private long f78271e = Long.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    private long f78272f = 1;

    /* renamed from: g, reason: collision with root package name */
    private TimeUnit f78273g = TimeUnit.SECONDS;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private EnumC8731j f78274h = EnumC8731j.KEEP_OPEN;

    /* renamed from: i, reason: collision with root package name */
    private int f78275i = -1;

    public C8723b() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f78277k = timeUnit;
        this.f78278l = timeUnit;
        this.f78279m = new ArrayList();
        this.f78280n = new s();
        q(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        p(0L, "Content-Length");
    }

    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8723b clone() {
        Object clone = super.clone();
        if (clone == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.mockwebserver.MockResponse");
        }
        C8723b c8723b = (C8723b) clone;
        c8723b.f78268b = this.f78268b.e().h();
        c8723b.f78279m = C7714v.W0(this.f78279m);
        return c8723b;
    }

    public final C9681g b() {
        C9681g c9681g = this.f78270d;
        if (c9681g != null) {
            return c9681g.clone();
        }
        return null;
    }

    public final long c() {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.convert(this.f78276j, this.f78277k);
    }

    @NotNull
    public final z d() {
        return this.f78268b.e();
    }

    public final long e() {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.convert(0L, this.f78278l);
    }

    public final int f() {
        return this.f78275i;
    }

    @NotNull
    public final List<C8728g> g() {
        return this.f78279m;
    }

    @NotNull
    public final s h() {
        return this.f78280n;
    }

    @NotNull
    public final EnumC8731j i() {
        return this.f78274h;
    }

    @NotNull
    public final String j() {
        return this.f78267a;
    }

    public final long k() {
        return this.f78271e;
    }

    public final long l() {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.convert(this.f78272f, this.f78273g);
    }

    @NotNull
    public final z m() {
        return this.f78269c.e();
    }

    @NotNull
    public final void n(@NotNull String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        C9681g body2 = new C9681g();
        body2.H0(body);
        Intrinsics.checkNotNullParameter(body2, "body");
        p(Long.valueOf(body2.size()), "Content-Length");
        this.f78270d = body2.clone();
    }

    @NotNull
    public final void o() {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f78276j = 10L;
        this.f78277k = unit;
    }

    @NotNull
    public final void p(@NotNull Object value, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f78268b.h(name);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f78268b.a(name, value.toString());
    }

    @NotNull
    public final void q(int i11) {
        this.f78267a = "HTTP/1.1 " + i11 + ' ' + ((100 <= i11 && 199 >= i11) ? "Informational" : (200 <= i11 && 299 >= i11) ? DiscountCodeResponse.RESULT_OK : (300 <= i11 && 399 >= i11) ? "Redirection" : (400 <= i11 && 499 >= i11) ? "Client Error" : (500 <= i11 && 599 >= i11) ? "Server Error" : "Mock Response");
    }

    public final void r(@NotNull EnumC8731j enumC8731j) {
        Intrinsics.checkNotNullParameter(enumC8731j, "<set-?>");
        this.f78274h = enumC8731j;
    }

    public final void s() {
        Intrinsics.checkNotNullParameter("HTTP/1.1 503 shutting down", "<set-?>");
        this.f78267a = "HTTP/1.1 503 shutting down";
    }

    @NotNull
    public final String toString() {
        return this.f78267a;
    }
}
