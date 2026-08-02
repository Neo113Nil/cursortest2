package l10;

import A00.a;
import A00.e;
import Ae.InterfaceC2395h;
import Sc.InterfaceC3999a;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.C5429p;
import i10.h;
import i10.l;
import j10.InterfaceC7238a;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c<I extends C7854a> implements InterfaceC7851b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7238a<I> f72298a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<A00.a> f72299b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5423j f72300c;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function1<C7854a, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f72301b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f72301b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C7854a c7854a) {
            C7854a it = c7854a;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.d(it.c().c().b(), this.f72301b));
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function1<C7854a, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f72302b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(1);
            this.f72302b = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C7854a c7854a) {
            C7854a it = c7854a;
            Intrinsics.checkNotNullParameter(it, "it");
            Integer scrollWidgetKey = it.d().getScrollWidgetKey();
            return Boolean.valueOf(scrollWidgetKey != null && scrollWidgetKey.intValue() == this.f72302b);
        }
    }

    public c(@NotNull InterfaceC7238a<I> composerStore) {
        Intrinsics.checkNotNullParameter(composerStore, "composerStore");
        this.f72298a = composerStore;
        InterfaceC2395h<A00.a> events = composerStore.getEvents();
        this.f72299b = events;
        this.f72300c = C5429p.b(events);
    }

    private final void q(A00.a aVar) {
        this.f72298a.c(aVar);
    }

    @Override // l10.InterfaceC7851b
    public final void a() {
        q(a.C2364e.f206a);
    }

    @Override // l10.InterfaceC7851b
    public final void b(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, h.b bVar) {
        this.f72298a.c(new a.u.b(str, null, map, map2, false, bVar, 66));
    }

    @Override // l10.InterfaceC7851b
    public final void c(@NotNull String widgetComponent, Integer num, boolean z11) {
        Intrinsics.checkNotNullParameter(widgetComponent, "widgetComponent");
        e.a aVar = new e.a();
        aVar.a(new a(widgetComponent));
        aVar.e(true, z11);
        aVar.d(num != null ? num.intValue() : 0);
        this.f72298a.c(aVar.b());
    }

    @Override // l10.InterfaceC7851b
    public final void d(@NotNull a.J.InterfaceC0007a updateKey) {
        Intrinsics.checkNotNullParameter(updateKey, "updateKey");
        this.f72298a.c(new a.J(updateKey, false));
    }

    @Override // l10.InterfaceC7851b
    public final void e(@NotNull l.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f72298a.c(new a.I(true, type));
    }

    @Override // l10.InterfaceC7851b
    public final void f(boolean z11) {
        this.f72298a.c(new a.r.C0012a(z11));
    }

    @Override // l10.InterfaceC7851b
    public final void g() {
        q(a.u.c.f253a);
    }

    @Override // l10.InterfaceC7851b
    @NotNull
    public final C5423j getEvents() {
        return this.f72300c;
    }

    @Override // l10.InterfaceC7851b
    @NotNull
    public final InterfaceC2395h<A00.a> getEventsFlow() {
        return this.f72299b;
    }

    @Override // l10.InterfaceC7851b
    public final void h(@NotNull z00.f state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f72298a.c(new a.G(state));
    }

    @Override // l10.InterfaceC7851b
    public final void hideLoader() {
        this.f72298a.c(new a.I(false, null));
    }

    @Override // l10.InterfaceC7851b
    public final void i(int i11, @NotNull String widgetKey) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        e.a aVar = new e.a();
        aVar.a(new d(widgetKey));
        e.a.f(aVar, false);
        aVar.d(i11);
        aVar.h();
        this.f72298a.c(aVar.b());
    }

    @Override // l10.InterfaceC7851b
    @InterfaceC3999a
    public final void j(@NotNull String page, @NotNull String url, @NotNull a.C.b scrollEvent) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(scrollEvent, "scrollEvent");
        this.f72298a.c(new a.r.b(page, url, scrollEvent.d()));
    }

    @Override // l10.InterfaceC7851b
    public final void k(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.f72298a.c(new a.u.b(str, null, map, map2, true, null, 98));
    }

    @Override // l10.InterfaceC7851b
    public final void l(int i11) {
        e.a aVar = new e.a();
        aVar.g(i11);
        this.f72298a.c(aVar.b());
    }

    @Override // l10.InterfaceC7851b
    public final void m(long j11) {
        a.x.C0015a c0015a = new a.x.C0015a();
        c0015a.a(j11);
        this.f72298a.c(c0015a.c());
    }

    @Override // l10.InterfaceC7851b
    @InterfaceC3999a
    public final void n(int i11, @NotNull String page, @NotNull String url) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f72298a.c(new a.r.b(page, url, i11));
    }

    @Override // l10.InterfaceC7851b
    public final void o(int i11, int i12, boolean z11, boolean z12) {
        e.a aVar = new e.a();
        aVar.a(new b(i11));
        aVar.e(z11, z12);
        aVar.d(i12);
        aVar.h();
        this.f72298a.c(aVar.b());
    }

    @Override // l10.InterfaceC7851b
    public final void p(@NotNull String stateId) {
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        a.x.C0015a c0015a = new a.x.C0015a();
        c0015a.b(stateId);
        this.f72298a.c(c0015a.c());
    }

    @Override // l10.InterfaceC7851b
    public final void update(@NotNull a.J.InterfaceC0007a updateKey) {
        Intrinsics.checkNotNullParameter(updateKey, "updateKey");
        this.f72298a.c(new a.J(updateKey, true));
    }
}
