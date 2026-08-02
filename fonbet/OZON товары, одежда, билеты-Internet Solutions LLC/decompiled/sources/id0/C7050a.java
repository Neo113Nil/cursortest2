package id0;

import De.C2862e;
import Sc.InterfaceC4008j;
import Sc.s;
import U7.m;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.tracking.TrackingApi;
import td0.f;
import xe.M;

/* renamed from: id0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7050a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<TrackingApi> f66244a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f66245b;

    @e(c = "ru.ozon.id.nativeauth.tracking.ComposerTrackingRepository$track$1", f = "ComposerTrackingRepository.kt", l = {15}, m = "invokeSuspend")
    /* renamed from: id0.a$a, reason: collision with other inner class name */
    static final class C1093a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f66246d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f66247e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C7050a f66248f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1093a(String str, C7050a c7050a, d<? super C1093a> dVar) {
            super(2, dVar);
            this.f66247e = str;
            this.f66248f = c7050a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C1093a(this.f66247e, this.f66248f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((C1093a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66246d;
            if (i11 == 0) {
                s.b(obj);
                String str = "composer-api.bx/_action/" + this.f66247e;
                TrackingApi trackingApi = (TrackingApi) this.f66248f.f66244a.getValue();
                this.f66246d = 1;
                if (trackingApi.track(str, this) == aVar) {
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

    @e(c = "ru.ozon.id.nativeauth.tracking.ComposerTrackingRepository$track$2", f = "ComposerTrackingRepository.kt", l = {22}, m = "invokeSuspend")
    /* renamed from: id0.a$b */
    static final class b extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f66249d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f66250e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C7050a f66251f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<String> function0, C7050a c7050a, d<? super b> dVar) {
            super(2, dVar);
            this.f66250e = (AbstractC7737t) function0;
            this.f66251f = c7050a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(this.f66250e, this.f66251f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66249d;
            if (i11 == 0) {
                s.b(obj);
                String b11 = m.b(this.f66250e.invoke(), "composer-api.bx/_action/");
                TrackingApi trackingApi = (TrackingApi) this.f66251f.f66244a.getValue();
                this.f66249d = 1;
                if (trackingApi.track(b11, this) == aVar) {
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

    public C7050a(@NotNull InterfaceC4008j api, @NotNull C2862e scope) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f66244a = api;
        this.f66245b = scope;
    }

    public final void b(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        f.b(this.f66245b, null, new C1093a(action, this, null));
    }

    public final void c(@NotNull Function0<String> createAction) {
        Intrinsics.checkNotNullParameter(createAction, "createAction");
        f.b(this.f66245b, null, new b(createAction, this, null));
    }
}
