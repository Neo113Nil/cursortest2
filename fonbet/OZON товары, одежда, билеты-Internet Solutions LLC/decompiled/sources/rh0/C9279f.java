package rh0;

import Sc.s;
import java.util.ArrayList;
import java.util.List;
import jh0.C7429a;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.push.sdk.external.liveactivity.model.LiveActivitySelector;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.liveactivity.domain.LiveActivityInteractorImpl$sendTokens$1", f = "LiveActivityInteractorImpl.kt", l = {93}, m = "invokeSuspend")
/* renamed from: rh0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9279f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83528d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9277d f83529e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ LiveActivitySelector f83530f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Boolean f83531g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.liveactivity.domain.LiveActivityInteractorImpl$sendTokens$1$1", f = "LiveActivityInteractorImpl.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: rh0.f$a */
    static final class a extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83532d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9277d f83533e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LiveActivitySelector f83534f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f83535g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Boolean f83536h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9277d c9277d, LiveActivitySelector liveActivitySelector, ArrayList arrayList, Boolean bool, kotlin.coroutines.d dVar) {
            super(1, dVar);
            this.f83533e = c9277d;
            this.f83534f = liveActivitySelector;
            this.f83535g = arrayList;
            this.f83536h = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            ArrayList arrayList = this.f83535g;
            return new a(this.f83533e, this.f83534f, arrayList, this.f83536h, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Nh0.a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83532d;
            if (i11 == 0) {
                s.b(obj);
                aVar = this.f83533e.f83514a;
                this.f83532d = 1;
                if (((Nh0.d) aVar).l(this.f83534f, this.f83535g, this.f83536h) == aVar2) {
                    return aVar2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9279f(C9277d c9277d, LiveActivitySelector liveActivitySelector, Boolean bool, kotlin.coroutines.d<? super C9279f> dVar) {
        super(2, dVar);
        this.f83529e = c9277d;
        this.f83530f = liveActivitySelector;
        this.f83531g = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9279f(this.f83529e, this.f83530f, this.f83531g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9279f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Nh0.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83528d;
        if (i11 == 0) {
            s.b(obj);
            bVar = this.f83529e.f83515b;
            List<C7429a> h11 = ((Nh0.d) bVar).h();
            ArrayList arrayList = new ArrayList(C7714v.z(h11, 10));
            for (C7429a c7429a : h11) {
                arrayList.add(new C7429a(c7429a.a(), c7429a.b(), jh0.c.NOT_CHANGED));
            }
            LiveActivitySelector liveActivitySelector = this.f83530f;
            C9277d c9277d = this.f83529e;
            a aVar2 = new a(c9277d, liveActivitySelector, arrayList, this.f83531g, null);
            this.f83528d = 1;
            if (C9277d.f(c9277d, aVar2, this) == aVar) {
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
