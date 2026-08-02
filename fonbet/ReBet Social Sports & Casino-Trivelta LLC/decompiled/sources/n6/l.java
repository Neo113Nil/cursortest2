package n6;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    public static l f57066h;

    /* renamed from: a, reason: collision with root package name */
    public final Class f57068a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f57069b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f57070c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f57071d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f57072e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f57073f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f57065g = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f57067i = new AtomicBoolean(false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            Class a10 = m.a("com.android.billingclient.api.SkuDetailsParams");
            Class a11 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a10 == null || a11 == null) {
                return;
            }
            Method d10 = m.d(a10, "newBuilder", new Class[0]);
            Method d11 = m.d(a11, "setType", String.class);
            Method d12 = m.d(a11, "setSkusList", List.class);
            Method d13 = m.d(a11, "build", new Class[0]);
            if (d10 == null || d11 == null || d12 == null || d13 == null) {
                return;
            }
            l.c(new l(a10, a11, d10, d11, d12, d13));
        }

        public final l b() {
            if (l.a().get()) {
                return l.b();
            }
            a();
            l.a().set(true);
            return l.b();
        }

        public a() {
        }
    }

    public l(Class skuDetailsParamsClazz, Class builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.f57068a = skuDetailsParamsClazz;
        this.f57069b = builderClazz;
        this.f57070c = newBuilderMethod;
        this.f57071d = setTypeMethod;
        this.f57072e = setSkusListMethod;
        this.f57073f = buildMethod;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (Y7.a.d(l.class)) {
            return null;
        }
        try {
            return f57067i;
        } catch (Throwable th2) {
            Y7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l b() {
        if (Y7.a.d(l.class)) {
            return null;
        }
        try {
            return f57066h;
        } catch (Throwable th2) {
            Y7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(l lVar) {
        if (Y7.a.d(l.class)) {
            return;
        }
        try {
            f57066h = lVar;
        } catch (Throwable th2) {
            Y7.a.b(th2, l.class);
        }
    }

    public final Object d(String str, List list) {
        Object e10;
        Object e11;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            m mVar = m.f57074a;
            Object e12 = m.e(this.f57068a, this.f57070c, null, new Object[0]);
            if (e12 == null || (e10 = m.e(this.f57069b, this.f57071d, e12, str)) == null || (e11 = m.e(this.f57069b, this.f57072e, e10, list)) == null) {
                return null;
            }
            return m.e(this.f57069b, this.f57073f, e11, new Object[0]);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final Class e() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return this.f57068a;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }
}
