package c90;

import We.B;
import We.G;
import We.L;
import a90.C4966d;
import android.net.Uri;
import d90.C6113a;
import d90.C6115c;
import d90.C6116d;
import d90.C6118f;
import d90.C6119g;
import d90.C6120h;
import d90.C6122j;
import d90.l;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

/* renamed from: c90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5775c implements InterfaceC5773a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6116d f56821b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6115c f56822c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C6118f f56823d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C6122j f56824e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final l f56825f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C6113a f56826g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final f f56827h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C4966d f56828i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C5777e f56829j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C6120h f56830k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C6119g f56831l;

    public C5775c(@NotNull C6116d meshHeaderInjector, @NotNull C6115c loginHeaderInjector, @NotNull C6118f passwordHeaderInjector, @NotNull C6122j testingFeaturesV1HeaderInjector, @NotNull l testingFeaturesV2HeaderInjector, @NotNull C6113a autotestsHeaderInjector, @NotNull f headerTokenService, @NotNull C4966d networkMockInterceptor, @NotNull C5777e headerABVariantsService, @NotNull C6120h sessionDurationHeaderInjector, @NotNull C6119g sampleTraceHeaderInjector) {
        Intrinsics.checkNotNullParameter(meshHeaderInjector, "meshHeaderInjector");
        Intrinsics.checkNotNullParameter(loginHeaderInjector, "loginHeaderInjector");
        Intrinsics.checkNotNullParameter(passwordHeaderInjector, "passwordHeaderInjector");
        Intrinsics.checkNotNullParameter(testingFeaturesV1HeaderInjector, "testingFeaturesV1HeaderInjector");
        Intrinsics.checkNotNullParameter(testingFeaturesV2HeaderInjector, "testingFeaturesV2HeaderInjector");
        Intrinsics.checkNotNullParameter(autotestsHeaderInjector, "autotestsHeaderInjector");
        Intrinsics.checkNotNullParameter(headerTokenService, "headerTokenService");
        Intrinsics.checkNotNullParameter(networkMockInterceptor, "networkMockInterceptor");
        Intrinsics.checkNotNullParameter(headerABVariantsService, "headerABVariantsService");
        Intrinsics.checkNotNullParameter(sessionDurationHeaderInjector, "sessionDurationHeaderInjector");
        Intrinsics.checkNotNullParameter(sampleTraceHeaderInjector, "sampleTraceHeaderInjector");
        this.f56821b = meshHeaderInjector;
        this.f56822c = loginHeaderInjector;
        this.f56823d = passwordHeaderInjector;
        this.f56824e = testingFeaturesV1HeaderInjector;
        this.f56825f = testingFeaturesV2HeaderInjector;
        this.f56826g = autotestsHeaderInjector;
        this.f56827h = headerTokenService;
        this.f56828i = networkMockInterceptor;
        this.f56829j = headerABVariantsService;
        this.f56830k = sessionDurationHeaderInjector;
        this.f56831l = sampleTraceHeaderInjector;
    }

    public static L t(C5775c c5775c, B.a aVar) {
        G.a requestBuilder = new G.a(Ek.a.a(aVar, "chain"));
        String a11 = c5775c.f56821b.a();
        if (a11 != null) {
            requestBuilder.d("x-o3-meshversion", a11);
        }
        requestBuilder.d("ob-testing-features", c5775c.f56824e.b());
        String b11 = c5775c.f56825f.b();
        if (b11 != null) {
            requestBuilder.d("ob-testing-features-v2", b11);
        }
        String a12 = c5775c.f56822c.a();
        if (a12 != null) {
            requestBuilder.d("x-ob-test-login", a12);
        }
        String a13 = c5775c.f56823d.a();
        if (a13 != null) {
            requestBuilder.d("x-ob-test-password", a13);
        }
        String a14 = c5775c.f56831l.a();
        if (a14 != null) {
            requestBuilder.d("x-o3-sample-trace", a14);
        }
        C6113a c6113a = c5775c.f56826g;
        c6113a.getClass();
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        requestBuilder.d("is-mobile-autotests", String.valueOf(c6113a.a()));
        String b12 = c6113a.b();
        if (b12 == null || b12.length() == 0) {
            b12 = null;
        }
        if (b12 != null) {
            requestBuilder.d("x-o3-test-name", b12);
        }
        requestBuilder.d("x-o3-internal-headers-token", c5775c.f56827h.a());
        String a15 = c5775c.f56829j.a();
        if (a15 != null) {
            requestBuilder.d("x-o3-ab-variants", a15);
        }
        String a16 = c5775c.f56830k.a();
        if (a16 != null) {
            requestBuilder.d("x-o3-ob-testing-auth-ttl", a16);
        }
        return aVar.proceed(requestBuilder.b());
    }

    private static String u(Uri uri) {
        if (uri.isHierarchical()) {
            return uri.getAuthority();
        }
        return null;
    }

    private static String v(Uri uri, String str) {
        if (uri.isHierarchical()) {
            return uri.getQueryParameter(str);
        }
        return null;
    }

    @Override // c90.InterfaceC5773a
    public final void a(@NotNull String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        this.f56823d.b(password);
    }

    @Override // c90.InterfaceC5773a
    public final String b() {
        return this.f56830k.a();
    }

    @Override // c90.InterfaceC5773a
    public final void c() {
        this.f56825f.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6 != null ? u(r6) : null, "x-o3-test-name") != false) goto L38;
     */
    @Override // c90.InterfaceC5773a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean canHandle(Uri uri) {
        boolean z11 = true;
        if (Intrinsics.d(uri != null ? u(uri) : null, "mesh")) {
            String v11 = v(uri, "version");
            if (v11 != null) {
                this.f56821b.b(v11);
            }
            z11 = false;
        } else {
            boolean d11 = Intrinsics.d(uri != null ? u(uri) : null, "testing-features");
            C6122j c6122j = this.f56824e;
            if (d11) {
                String v12 = v(uri, "testing-features-version");
                if (v12 != null) {
                    c6122j.d(v12);
                }
                z11 = false;
            } else {
                if (Intrinsics.d(uri != null ? u(uri) : null, "mock-features")) {
                    String v13 = v(uri, "features");
                    if (v13 != null) {
                        c6122j.e(v13);
                    }
                    z11 = false;
                } else {
                    if (!Intrinsics.d(uri != null ? u(uri) : null, "is-mobile-autotests")) {
                    }
                    String v14 = v(uri, "is-mobile-autotests");
                    C6113a c6113a = this.f56826g;
                    if (v14 != null) {
                        c6113a.d(Boolean.parseBoolean(v14));
                    }
                    String v15 = v(uri, "x-o3-test-name");
                    if (v15 != null) {
                        c6113a.e(v15);
                    }
                    String v16 = v(uri, "host-name");
                    if (v16 != null) {
                        c6113a.f(v16);
                    }
                }
            }
        }
        L80.a.a("FintechTestEnvironmentManager", "canHandle: " + z11 + " " + uri);
        return z11;
    }

    @Override // c90.InterfaceC5773a
    public final String d() {
        return this.f56831l.a();
    }

    @Override // c90.InterfaceC5773a
    public final void e() {
        this.f56830k.b("");
    }

    @Override // c90.InterfaceC5773a
    public final void f() {
        Intrinsics.checkNotNullParameter("", "token");
        this.f56827h.b();
    }

    @Override // c90.InterfaceC5773a
    public final void g(@NotNull String login) {
        Intrinsics.checkNotNullParameter(login, "login");
        this.f56822c.b(login);
    }

    @Override // c90.InterfaceC5773a
    public final String getABVariantsHeader() {
        return this.f56829j.a();
    }

    @Override // c90.InterfaceC5773a
    @NotNull
    public final String getHeaderToken() {
        return this.f56827h.a();
    }

    @Override // c90.InterfaceC5773a
    public final boolean getIsAutotestsHeader() {
        return this.f56826g.a();
    }

    @Override // c90.InterfaceC5773a
    public final String getLoginHeader() {
        return this.f56822c.a();
    }

    @Override // c90.InterfaceC5773a
    public final String getMeshHeader() {
        return this.f56821b.a();
    }

    @Override // c90.InterfaceC5773a
    public final String getPasswordHeader() {
        return this.f56823d.a();
    }

    @Override // c90.InterfaceC5773a
    @NotNull
    public final String getTestingFeaturesHeader() {
        return this.f56824e.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c90.b] */
    @Override // c90.InterfaceC5773a
    @NotNull
    public final C5774b h() {
        return new B() { // from class: c90.b
            @Override // We.B
            public final L intercept(B.a aVar) {
                return C5775c.t(C5775c.this, aVar);
            }
        };
    }

    @Override // c90.InterfaceC5773a
    public final String i() {
        return this.f56826g.c();
    }

    @Override // c90.InterfaceC5773a
    @NotNull
    public final C4966d j() {
        return this.f56828i;
    }

    @Override // c90.InterfaceC5773a
    public final void k(@NotNull String features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f56824e.d(features);
    }

    @Override // c90.InterfaceC5773a
    public final void l(@NotNull String seconds) {
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        this.f56830k.b(seconds);
    }

    @Override // c90.InterfaceC5773a
    public final void m() {
        Intrinsics.checkNotNullParameter("", "mesh");
        this.f56821b.b("");
    }

    @Override // c90.InterfaceC5773a
    public final String n() {
        return this.f56825f.b();
    }

    @Override // c90.InterfaceC5773a
    public final void o() {
        Intrinsics.checkNotNullParameter("", CommentV3DTO.HEADER_FIELD_NAME);
        this.f56829j.b();
    }

    @Override // c90.InterfaceC5773a
    public final void p(@NotNull List<String> deleteFeatures, @NotNull List<String> deleteSwitches, @NotNull Map<String, ? extends Object> editFeatures) {
        Intrinsics.checkNotNullParameter(deleteFeatures, "deleteFeatures");
        Intrinsics.checkNotNullParameter(deleteSwitches, "deleteSwitches");
        Intrinsics.checkNotNullParameter(editFeatures, "editFeatures");
        this.f56825f.c(deleteFeatures, deleteSwitches, editFeatures);
    }

    @Override // c90.InterfaceC5773a
    public final void q() {
        this.f56824e.a();
    }

    @Override // c90.InterfaceC5773a
    @NotNull
    public final String r() {
        return this.f56824e.c();
    }

    @Override // c90.InterfaceC5773a
    public final String s() {
        return this.f56826g.b();
    }
}
