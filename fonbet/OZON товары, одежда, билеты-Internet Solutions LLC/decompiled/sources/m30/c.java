package m30;

import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import m90.b;
import n30.C8438b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements InterfaceC8075b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8438b f74386a;

    /* renamed from: b, reason: collision with root package name */
    private String f74387b;

    /* renamed from: c, reason: collision with root package name */
    private String f74388c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C8074a f74389d;

    public c(@NotNull C8438b ozonTrackerPlugin) {
        Intrinsics.checkNotNullParameter(ozonTrackerPlugin, "ozonTrackerPlugin");
        this.f74386a = ozonTrackerPlugin;
    }

    @Override // m30.InterfaceC8075b
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f74388c = url;
        Ns.b.c("overrideUrl ", url, "WebPerfAnalyticInteractorImpl");
    }

    @Override // m30.InterfaceC8075b
    public final void b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.d(url, this.f74387b) || Intrinsics.d(url, this.f74388c)) {
            this.f74389d = new C8074a(System.currentTimeMillis(), 0L, 0L);
            Ns.b.c("startLoadResource ", url, "WebPerfAnalyticInteractorImpl");
        }
    }

    @Override // m30.InterfaceC8075b
    public final void c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f74387b = null;
        this.f74389d = null;
        this.f74388c = null;
        this.f74387b = url;
        this.f74386a.b(url, "finance_web_page");
        L80.a.a("WebPerfAnalyticInteractorImpl", "webViewInvokeLoadUrl ".concat(url));
    }

    @Override // m30.InterfaceC8075b
    public final void d(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        L80.a.a("WebPerfAnalyticInteractorImpl", "pageFinished " + url + " " + this.f74389d);
        String str = this.f74388c;
        if (str == null || str.equals(url)) {
            C8074a c8074a = this.f74389d;
            if (c8074a != null && c8074a.c() == 0) {
                this.f74389d = C8074a.a(c8074a, 0L, System.currentTimeMillis(), 3);
            }
            L80.a.a("WebPerfAnalyticInteractorImpl", "pageFinished into if " + this.f74389d);
        }
    }

    @Override // m30.InterfaceC8075b
    public final void e() {
        L80.a.a("WebPerfAnalyticInteractorImpl", "pageStarted " + this.f74389d);
        C8074a c8074a = this.f74389d;
        if (c8074a != null) {
            this.f74389d = C8074a.a(c8074a, System.currentTimeMillis(), 0L, 5);
        }
    }

    @Override // m30.InterfaceC8075b
    public final void f(@NotNull String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        String str2 = this.f74387b;
        C8438b.a(this.f74386a, str2 == null ? url : str2, false, str, null, 8);
        this.f74387b = null;
        this.f74389d = null;
        this.f74388c = null;
    }

    @Override // m30.InterfaceC8075b
    public final void g(@NotNull String url) {
        C8074a c8074a;
        Intrinsics.checkNotNullParameter(url, "url");
        L80.a.a("WebPerfAnalyticInteractorImpl", "webPageFinished " + url + " pagePerf " + this.f74389d);
        if ((Intrinsics.d(url, this.f74387b) || Intrinsics.d(url, this.f74388c)) && (c8074a = this.f74389d) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long c11 = c8074a.c() == 0 ? currentTimeMillis : c8074a.c();
            long b11 = c11 - c8074a.b();
            long j11 = currentTimeMillis - c11;
            String str = this.f74387b;
            if (str != null) {
                C8438b.a(this.f74386a, str, true, null, C7714v.b0(new m90.b(b.a.HTML_PROCESSED, b11), new m90.b(b.a.JS_PROCESSED, j11)), 4);
            }
        }
        this.f74387b = null;
        this.f74389d = null;
        this.f74388c = null;
    }
}
