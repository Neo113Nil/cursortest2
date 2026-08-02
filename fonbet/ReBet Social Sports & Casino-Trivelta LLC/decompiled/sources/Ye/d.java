package Ye;

import Be.a;
import Ge.h;
import android.app.Application;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.C5582a;
import og.i;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14229a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f14230b = LazyKt.lazy(a.f14232d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f14231c = LazyKt.lazy(b.f14233d);

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f14232d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Be.a invoke() {
            a.C0020a c0020a = Be.a.f866b;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0020a.a(e10);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f14233d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ge.c invoke() {
            return new Ge.c(d.f14229a.g());
        }
    }

    public static final C5582a b() {
        return j().d();
    }

    public static final boolean c(De.a preferenceKey) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return i.i((Boolean) h().a(preferenceKey).b());
    }

    public static final boolean d(De.a preferenceKey) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return f(preferenceKey, false, 2, null);
    }

    public static final boolean e(De.a preferenceKey, boolean z10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        Boolean bool = (Boolean) f14229a.g().o(preferenceKey, z10).b();
        return bool != null ? bool.booleanValue() : z10;
    }

    public static /* synthetic */ boolean f(De.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(aVar, z10);
    }

    public static final Ge.c h() {
        return (Ge.c) f14231c.getValue();
    }

    public static final long i(De.a preferenceKey, long j10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        Long l10 = (Long) f14229a.g().y(preferenceKey, j10).b();
        return l10 != null ? l10.longValue() : j10;
    }

    public static final h j() {
        return new h(f14229a.g());
    }

    public static final String k(De.a preferenceKey) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return m(preferenceKey, null, 2, null);
    }

    public static final String l(De.a preferenceKey, String str) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return (String) f14229a.g().z(preferenceKey, str).b();
    }

    public static /* synthetic */ String m(De.a aVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return l(aVar, str);
    }

    public static final Set n(De.a preferenceKey, Set set) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return (Set) f14229a.g().A(preferenceKey, set).b();
    }

    public static final h o(De.a preferenceKey, boolean z10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return j().e(preferenceKey, z10);
    }

    public static final h p(De.a preferenceKey, int i10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return j().f(preferenceKey, i10);
    }

    public static final h q(De.a preferenceKey, long j10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return j().g(preferenceKey, j10);
    }

    public static final h r(De.a preferenceKey, String str) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return j().h(preferenceKey, str);
    }

    public static final h s(De.a preferenceKey, Set set) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return j().i(preferenceKey, set);
    }

    public static final C5582a t(De.a preferenceKey) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return f14229a.g().B(preferenceKey);
    }

    public final Be.a g() {
        return (Be.a) f14230b.getValue();
    }
}
