package xe0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import we0.C10544C;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.placemarkscontroller.BasePlacemarkController$1", f = "BasePlacemarkController.kt", l = {47, 54, 62, 63}, m = "invokeSuspend")
/* renamed from: xe0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10763b extends kotlin.coroutines.jvm.internal.j implements Function2<C10544C, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105514d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f105515e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC10765d f105516f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.placemarkscontroller.BasePlacemarkController$1$3", f = "BasePlacemarkController.kt", l = {}, m = "invokeSuspend")
    /* renamed from: xe0.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC10765d f105517d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C10544C f105518e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC10765d abstractC10765d, C10544C c10544c, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f105517d = abstractC10765d;
            this.f105518e = c10544c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f105517d, this.f105518e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            this.f105518e.getClass();
            this.f105517d.s(null, null);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10763b(AbstractC10765d abstractC10765d, kotlin.coroutines.d<? super C10763b> dVar) {
        super(2, dVar);
        this.f105516f = abstractC10765d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C10763b c10763b = new C10763b(this.f105516f, dVar);
        c10763b.f105515e = obj;
        return c10763b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C10544C c10544c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10763b) create(c10544c, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C10544C c10544c;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105514d;
        AbstractC10765d abstractC10765d = this.f105516f;
        if (i11 == 0) {
            s.b(obj);
            c10544c = (C10544C) this.f105515e;
            if (c10544c == null) {
                abstractC10765d.getClass();
                return Unit.f71690a;
            }
            abstractC10765d.getClass();
            c10544c.getClass();
            abstractC10765d.getPlacemarkById(null);
            throw null;
        }
        if (i11 == 1) {
            s.b(obj);
            return Unit.f71690a;
        }
        if (i11 == 2) {
            c10544c = (C10544C) this.f105515e;
            s.b(obj);
            c10544c.getClass();
            abstractC10765d.getPlacemarkById(null);
            throw null;
        }
        if (i11 == 3) {
            C10544C c10544c2 = (C10544C) this.f105515e;
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 x11 = De.s.f6650a.x();
            a aVar2 = new a(abstractC10765d, c10544c2, null);
            this.f105515e = null;
            this.f105514d = 4;
            if (C10727i.f(x11, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
