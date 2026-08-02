package li;

import C.o0;
import K1.T;
import Pk0.b;
import Sc.C;
import Z1.h;
import g.C6594f;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;

/* renamed from: li.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7962a {

    /* renamed from: a, reason: collision with root package name */
    private final long f73323a;

    /* renamed from: b, reason: collision with root package name */
    private final C7807Z f73324b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final K0 f73325c;

    /* renamed from: d, reason: collision with root package name */
    private final T f73326d;

    /* renamed from: e, reason: collision with root package name */
    private final float f73327e;

    /* renamed from: f, reason: collision with root package name */
    private final float f73328f;

    /* renamed from: g, reason: collision with root package name */
    private final float f73329g;

    public C7962a(long j11, C7807Z c7807z, K0 borderBrush, T t2, float f7, float f11, float f12) {
        Intrinsics.checkNotNullParameter(borderBrush, "borderBrush");
        Intrinsics.checkNotNullParameter(borderBrush, "borderBrush");
        this.f73323a = j11;
        this.f73324b = c7807z;
        this.f73325c = borderBrush;
        this.f73326d = t2;
        this.f73327e = f7;
        this.f73328f = f11;
        this.f73329g = f12;
    }

    public final long a() {
        return this.f73323a;
    }

    @NotNull
    public final AbstractC7799Q b() {
        return this.f73325c;
    }

    public final float c() {
        return this.f73327e;
    }

    public final float d() {
        return this.f73329g;
    }

    public final float e() {
        return this.f73328f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7962a)) {
            return false;
        }
        C7962a c7962a = (C7962a) obj;
        c7962a.getClass();
        return C7807Z.p(this.f73323a, c7962a.f73323a) && this.f73324b.equals(c7962a.f73324b) && this.f73325c.equals(c7962a.f73325c) && Intrinsics.d(this.f73326d, c7962a.f73326d) && h.b(this.f73327e, c7962a.f73327e) && h.b(this.f73328f, c7962a.f73328f) && h.b(this.f73329g, c7962a.f73329g) && h.b(Float.NaN, Float.NaN);
    }

    public final C7807Z f() {
        return this.f73324b;
    }

    public final T g() {
        return this.f73326d;
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        int hashCode = (this.f73325c.hashCode() + ((Long.hashCode(this.f73324b.w()) + (Long.hashCode(this.f73323a) * 31)) * 31)) * 31;
        T t2 = this.f73326d;
        return b.a(Float.NaN, b.a(this.f73329g, b.a(this.f73328f, b.a(this.f73327e, (hashCode + (t2 == null ? 0 : t2.hashCode())) * 31, 31), 31), 31), 961);
    }

    @NotNull
    public final String toString() {
        String v11 = C7807Z.v(this.f73323a);
        String c11 = h.c(this.f73327e);
        String c12 = h.c(this.f73328f);
        String c13 = h.c(this.f73329g);
        String c14 = h.c(Float.NaN);
        StringBuilder b11 = C6594f.b("DsIconStyle(backgroundImageFitType=null, iconColor=null, backgroundColor=", v11, ", textColor=");
        b11.append(this.f73324b);
        b11.append(", borderBrush=");
        b11.append(this.f73325c);
        b11.append(", textStyle=");
        b11.append(this.f73326d);
        b11.append(", borderWidth=");
        b11.append(c11);
        b11.append(", shapeSize=");
        Nh.a.h(b11, c12, ", contentSize=", c13, ", textPadding=");
        return o0.c(b11, c14, ", iconGradientBrush=null, backgroundBrush=null)");
    }
}
