package kc0;

import Ae.C2417s0;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.android.controls.button.ButtonView;
import td0.C9863c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$observeViewModel$lambda$11$lambda$10$$inlined$collectFlow$6", f = "EntryCredentialsFragment.kt", l = {80}, m = "invokeSuspend")
/* renamed from: kc0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7658p extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71368d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2417s0 f71369e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ButtonView f71370f;

    /* renamed from: kc0.p$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ButtonView f71371a;

        public a(ButtonView buttonView) {
            this.f71371a = buttonView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            C9863c.a(this.f71371a, ((Boolean) t2).booleanValue());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7658p(C2417s0 c2417s0, kotlin.coroutines.d dVar, ButtonView buttonView) {
        super(2, dVar);
        this.f71369e = c2417s0;
        this.f71370f = buttonView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7658p(this.f71369e, dVar, this.f71370f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7658p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71368d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f71370f);
            this.f71368d = 1;
            if (this.f71369e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
