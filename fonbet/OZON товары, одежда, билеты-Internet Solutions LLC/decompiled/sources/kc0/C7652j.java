package kc0;

import Ae.C2406m0;
import Ae.C2417s0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.button.ButtonView;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$observeViewModel$lambda$11$$inlined$repeatOnStarted$1", f = "EntryCredentialsFragment.kt", l = {69}, m = "invokeSuspend")
/* renamed from: kc0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7652j extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71331d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.J f71332e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7629C f71333f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7645c f71334g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Jb0.m f71335h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$observeViewModel$lambda$11$$inlined$repeatOnStarted$1$1", f = "EntryCredentialsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kc0.j$a */
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f71336d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7629C f71337e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C7645c f71338f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Jb0.m f71339g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, C7629C c7629c, C7645c c7645c, Jb0.m mVar) {
            super(2, dVar);
            this.f71337e = c7629c;
            this.f71338f = c7645c;
            this.f71339g = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar, this.f71337e, this.f71338f, this.f71339g);
            aVar.f71336d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f71336d;
            C7629C c7629c = this.f71337e;
            C2406m0 w12 = c7629c.w1();
            C7645c c7645c = this.f71338f;
            Jb0.m mVar = this.f71339g;
            C10727i.c(m11, null, null, new C7653k(w12, null, c7645c, mVar), 3);
            C10727i.c(m11, null, null, new C7654l(c7629c.r1(), null, c7645c, mVar), 3);
            C10727i.c(m11, null, null, new C7655m(c7629c.t1(), null, c7645c, mVar), 3);
            C10727i.c(m11, null, null, new C7656n(c7629c.x1(), null, c7645c, mVar), 3);
            C10727i.c(m11, null, null, new C7657o(c7629c.C0(), null, c7645c), 3);
            C2417s0 u12 = c7629c.u1();
            ButtonView submitButton = mVar.f14508i;
            Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
            C10727i.c(m11, null, null, new C7658p(u12, null, submitButton), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7652j(androidx.lifecycle.J j11, kotlin.coroutines.d dVar, C7629C c7629c, C7645c c7645c, Jb0.m mVar) {
        super(2, dVar);
        this.f71332e = j11;
        this.f71333f = c7629c;
        this.f71334g = c7645c;
        this.f71335h = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7652j(this.f71332e, dVar, this.f71333f, this.f71334g, this.f71335h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7652j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71331d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            a aVar2 = new a(null, this.f71333f, this.f71334g, this.f71335h);
            this.f71331d = 1;
            if (C5412d0.b(this.f71332e, bVar, aVar2, this) == aVar) {
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
