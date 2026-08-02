package l40;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.k;
import Sc.n;
import Sc.s;
import d80.C6101b;
import g30.InterfaceC6618a;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.u;

/* loaded from: classes3.dex */
public final class h implements InterfaceC7871a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M90.a f72786a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f72787b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f72788c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final l40.b f72789d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f72790e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appreview.service.RustoreReviewService$needAppReview$1", f = "RustoreReviewService.kt", l = {51}, m = "invokeSuspend")
    static final class a extends j implements Function2<u<? super Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f72791d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f72792e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = h.this.new a(dVar);
            aVar.f72792e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super Boolean> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f72791d;
            if (i11 == 0) {
                s.b(obj);
                final u uVar = (u) this.f72792e;
                final h hVar = h.this;
                M90.a aVar2 = hVar.f72786a;
                Function2 callback = new Function2() { // from class: l40.g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        InterfaceC6618a interfaceC6618a;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        String str = (String) obj3;
                        h hVar2 = h.this;
                        if (!booleanValue && str != null) {
                            interfaceC6618a = hVar2.f72788c;
                            interfaceC6618a.M(hVar2.g().name(), str);
                        }
                        u uVar2 = uVar;
                        if (!uVar2.g()) {
                            uVar2.b(Boolean.valueOf(booleanValue && h.f(hVar2)));
                            uVar2.l(null);
                        }
                        return Unit.f71690a;
                    }
                };
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(callback, "callback");
                callback.invoke(Boolean.FALSE, null);
                this.f72791d = 1;
                a11 = ze.s.a(uVar, new Q90.b(2), this);
                if (a11 == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appreview.service.RustoreReviewService$startReview$1", f = "RustoreReviewService.kt", l = {72}, m = "invokeSuspend")
    static final class b extends j implements Function2<u<? super Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f72794d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f72795e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = h.this.new b(dVar);
            bVar.f72795e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super Boolean> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f72794d;
            if (i11 == 0) {
                s.b(obj);
                u uVar = (u) this.f72795e;
                h.this.f72786a.getClass();
                this.f72794d = 1;
                a11 = ze.s.a(uVar, new Q90.b(2), this);
                if (a11 == aVar) {
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

    public h(@NotNull M90.a rustoreInteractor, @NotNull Q90.c featureToggles, @NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(rustoreInteractor, "rustoreInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f72786a = rustoreInteractor;
        this.f72787b = featureToggles;
        this.f72788c = analyticInteractor;
        this.f72789d = l40.b.RUSTORE;
        this.f72790e = k.a(n.PUBLICATION, new C6101b(this, 1));
    }

    public static boolean c(h hVar) {
        List<String> stringArrayData = hVar.f72787b.q(S90.c.MOB_SHOW_REVIEW_APP).b().getStringArrayData();
        if (stringArrayData != null) {
            return stringArrayData.contains(hVar.f72789d.name());
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final boolean f(h hVar) {
        return ((Boolean) hVar.f72790e.getValue()).booleanValue();
    }

    @Override // l40.InterfaceC7871a
    @NotNull
    public final InterfaceC2395h<Boolean> a() {
        return C2399j.e(new b(null));
    }

    @Override // l40.InterfaceC7871a
    @NotNull
    public final InterfaceC2395h<Boolean> b() {
        return C2399j.e(new a(null));
    }

    @NotNull
    public final l40.b g() {
        return this.f72789d;
    }
}
