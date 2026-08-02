package pe0;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.M0;
import De.C2862e;
import Sc.s;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.C8583b;
import ne0.InterfaceC8587f;
import oe0.o;
import org.jetbrains.annotations.NotNull;
import re0.InterfaceC9261d;
import se0.AbstractC9672a;
import se0.c;
import we0.m;
import we0.p;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* renamed from: pe0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8905a<LOCATION_RENDERER extends se0.c & InterfaceC9261d> implements InterfaceC8587f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f80413a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC9672a f80414b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8914j f80415c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<m> f80416d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final M0<Boolean> f80417e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f80418f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f80419g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private ArrayList f80420h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private C8912h f80421i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private M0<p> f80422j;

    /* renamed from: k, reason: collision with root package name */
    private B0 f80423k;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.BaseUserLocationManager$changeMyLocationVisible$1", f = "BaseUserLocationManager.kt", l = {185}, m = "invokeSuspend")
    /* renamed from: pe0.a$a, reason: collision with other inner class name */
    static final class C1356a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f80424d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC8905a<LOCATION_RENDERER> f80425e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1356a(AbstractC8905a<LOCATION_RENDERER> abstractC8905a, kotlin.coroutines.d<? super C1356a> dVar) {
            super(2, dVar);
            this.f80425e = abstractC8905a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1356a(this.f80425e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1356a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f80424d;
            if (i11 == 0) {
                s.b(obj);
                AbstractC8905a<LOCATION_RENDERER> abstractC8905a = this.f80425e;
                C8912h e11 = abstractC8905a.e();
                M d11 = abstractC8905a.d();
                this.f80424d = 1;
                if (e11.e(d11) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public AbstractC8905a(@NotNull C2862e coroutineScope, @NotNull o locationProvider, @NotNull AbstractC9672a userLocationRenderer, @NotNull C8914j components) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(userLocationRenderer, "userLocationRenderer");
        Intrinsics.checkNotNullParameter(components, "components");
        this.f80413a = coroutineScope;
        this.f80414b = userLocationRenderer;
        this.f80415c = components;
        this.f80416d = userLocationRenderer.f();
        this.f80417e = components.a().b();
        new C8583b(0);
        this.f80419g = true;
        this.f80420h = new ArrayList();
        this.f80421i = components.b();
        this.f80422j = components.c();
    }

    private final void a(boolean z11) {
        C8914j c8914j = this.f80415c;
        c8914j.g().b(z11);
        this.f80414b.o(z11);
        if (!z11) {
            this.f80421i.c();
            c8914j.e().d();
            c8914j.d().d();
            k();
            return;
        }
        this.f80420h.add(C10727i.c(this.f80413a, null, null, new C1356a(this, null), 3));
        c8914j.e().c();
        c8914j.d().c(this.f80419g);
        j();
    }

    public void b() {
        a(false);
        this.f80415c.f().h();
        this.f80421i.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final C8914j c() {
        return this.f80415c;
    }

    @NotNull
    protected final M d() {
        return this.f80413a;
    }

    @NotNull
    protected final C8912h e() {
        return this.f80421i;
    }

    @NotNull
    protected final LOCATION_RENDERER f() {
        return this.f80414b;
    }

    protected abstract void g(@NotNull p pVar);

    public final void h() {
        if (true == this.f80418f) {
            return;
        }
        this.f80418f = true;
        a(true);
    }

    public final void i(@NotNull C8583b newUserMode) {
        Intrinsics.checkNotNullParameter(newUserMode, "newUserMode");
        this.f80414b.b(newUserMode);
        this.f80415c.f().h();
    }

    protected void j() {
        this.f80423k = C2399j.C(new C2408n0(new C2406m0(this.f80422j), new C8906b(this, null)), this.f80413a);
    }

    protected void k() {
        B0 b02 = this.f80423k;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f80423k = null;
    }
}
