package xe0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import De.C2862e;
import Sc.s;
import ce0.InterfaceC5817a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.u;
import we0.z;
import xe.C10727i;
import xe.H0;
import xe.M;

/* renamed from: xe0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10765d implements InterfaceC10766e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC5817a f105520a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f105521b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0 f105522c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final B0<u> f105523d;

    /* renamed from: e, reason: collision with root package name */
    private long f105524e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f105525f;

    /* renamed from: g, reason: collision with root package name */
    private xe.B0 f105526g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.placemarkscontroller.BasePlacemarkController$processMapPlacemarkClicked$1", f = "BasePlacemarkController.kt", l = {164}, m = "invokeSuspend")
    /* renamed from: xe0.d$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105527d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f105529f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f105529f = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AbstractC10765d.this.new a(this.f105529f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105527d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = AbstractC10765d.this.f105522c;
                this.f105527d = 1;
                if (c02.emit(this.f105529f, this) == aVar) {
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

    public AbstractC10765d(boolean z11, @NotNull j pinSelectSynchronizer, @NotNull InterfaceC5817a cameraController, @NotNull C2862e scope) {
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f105520a = cameraController;
        this.f105521b = scope;
        C0 b11 = E0.b(0, 0, null, 7);
        this.f105522c = b11;
        this.f105523d = C2399j.a(b11);
        this.f105524e = 200L;
        this.f105525f = z11;
        xe.B0 b02 = this.f105526g;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f105526g = C2399j.C(new C2408n0(pinSelectSynchronizer.d(), new C10763b(this, null)), scope);
        pinSelectSynchronizer.f(new C10764c(this));
    }

    @Override // xe0.InterfaceC10766e
    public final void clear() {
        d(this.f105525f ? this.f105524e : 0L);
    }

    @Override // xe0.InterfaceC10766e
    public void d(long j11) {
        List<u> a11 = a();
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(((u) it.next()).e());
        }
        l(arrayList);
    }

    @Override // xe0.InterfaceC10766e
    public final void e(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        b(this.f105525f ? this.f105524e : 0L, id2);
    }

    @Override // xe0.InterfaceC10766e
    public final void f() {
        this.f105525f = false;
    }

    @Override // xe0.InterfaceC10766e
    public void g(long j11, @NotNull List placemarks, long j12) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        c(j11, placemarks);
    }

    @Override // xe0.InterfaceC10766e
    public final void h(long j11, @NotNull List placemarks) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        g(this.f105525f ? this.f105524e : 0L, placemarks, j11);
    }

    @Override // xe0.InterfaceC10766e
    public final void insertPlacemark(@NotNull u placemark) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        m(placemark, this.f105525f ? this.f105524e : 0L);
    }

    @Override // xe0.InterfaceC10766e
    @NotNull
    public final B0<u> k() {
        return this.f105523d;
    }

    @Override // xe0.InterfaceC10766e
    public final void l(@NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        j(this.f105525f ? this.f105524e : 0L, ids);
    }

    @Override // xe0.InterfaceC10766e
    public final void n() {
        this.f105525f = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final M q() {
        return this.f105521b;
    }

    protected final xe.B0 r() {
        return this.f105526g;
    }

    public abstract void s(@NotNull String str, @NotNull z zVar);

    public void t() {
        xe.B0 b02 = this.f105526g;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    public final void u(@NotNull u placemark) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        if (placemark.l()) {
            C10727i.c(this.f105521b, null, null, new a(placemark, null), 3);
        }
        Function0<Unit> j11 = placemark.j();
        if (j11 != null) {
            j11.invoke();
        }
    }
}
