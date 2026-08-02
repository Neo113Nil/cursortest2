package b0;

import B.G;
import b0.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class g implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final n f24168a;

    /* renamed from: b, reason: collision with root package name */
    public final o f24169b;

    /* renamed from: c, reason: collision with root package name */
    public final u f24170c;

    /* renamed from: d, reason: collision with root package name */
    public final j f24171d;

    /* renamed from: e, reason: collision with root package name */
    public final m f24172e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f24173f;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final Object a(t it) {
            Intrinsics.checkNotNullParameter(it, "it");
            g gVar = g.this;
            t.a(it, null, null, 0, 0, null, 30, null);
            return gVar.f(null).getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b(t tVar) {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v invoke(Function1 onAsyncCompletion) {
            Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
            v a10 = g.this.f24171d.a(null, g.this.e(), onAsyncCompletion, g.this.f24173f);
            if (a10 != null) {
                return a10;
            }
            v a11 = g.this.f24172e.a(null, g.this.e(), onAsyncCompletion, g.this.f24173f);
            if (a11 != null) {
                return a11;
            }
            throw new IllegalStateException("Could not load font");
        }
    }

    public g(n platformFontLoader, o platformResolveInterceptor, u typefaceRequestCache, j fontListFontFamilyTypefaceAdapter, m platformFamilyTypefaceAdapter) {
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(platformResolveInterceptor, "platformResolveInterceptor");
        Intrinsics.checkNotNullParameter(typefaceRequestCache, "typefaceRequestCache");
        Intrinsics.checkNotNullParameter(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        Intrinsics.checkNotNullParameter(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.f24168a = platformFontLoader;
        this.f24169b = platformResolveInterceptor;
        this.f24170c = typefaceRequestCache;
        this.f24171d = fontListFontFamilyTypefaceAdapter;
        this.f24172e = platformFamilyTypefaceAdapter;
        this.f24173f = new a();
    }

    public final n e() {
        return this.f24168a;
    }

    public final G f(t tVar) {
        return this.f24170c.c(tVar, new b(tVar));
    }

    public /* synthetic */ g(n nVar, o oVar, u uVar, j jVar, m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, (i10 & 2) != 0 ? o.f24184a.a() : oVar, (i10 & 4) != 0 ? h.b() : uVar, (i10 & 8) != 0 ? new j(h.a(), null, 2, null) : jVar, (i10 & 16) != 0 ? new m() : mVar);
    }
}
