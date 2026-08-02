package ru.ozon.fintech.features.sharing.presentation.photo;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import xe.C10720e0;
import xe.L0;
import xe.M;

@e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewViewModel$saveToGalleryActually$1", f = "PhotoPreviewViewModel.kt", l = {317, 318}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96318d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.fintech.features.sharing.presentation.photo.a f96319e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Cbottom2SnackDTO f96320f;

    @e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewViewModel$saveToGalleryActually$1$1", f = "PhotoPreviewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.fintech.features.sharing.presentation.photo.a f96321d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Cbottom2SnackDTO f96322e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.fintech.features.sharing.presentation.photo.a aVar, Cbottom2SnackDTO cbottom2SnackDTO, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f96321d = aVar;
            this.f96322e = cbottom2SnackDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f96321d, this.f96322e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            K40.a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ru.ozon.fintech.features.sharing.presentation.photo.a aVar3 = this.f96321d;
            aVar = aVar3.f96295f;
            aVar.g(this.f96322e, CbottomType.SNACK, aVar3.getUuid(), null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ru.ozon.fintech.features.sharing.presentation.photo.a aVar, Cbottom2SnackDTO cbottom2SnackDTO, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f96319e = aVar;
        this.f96320f = cbottom2SnackDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f96319e, this.f96320f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (xe.C10727i.f(r7, r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (xe.Y.b(500, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96318d;
        if (i11 == 0) {
            s.b(obj);
            this.f96318d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 l02 = De.s.f6650a;
        a aVar2 = new a(this.f96319e, this.f96320f, null);
        this.f96318d = 2;
    }
}
