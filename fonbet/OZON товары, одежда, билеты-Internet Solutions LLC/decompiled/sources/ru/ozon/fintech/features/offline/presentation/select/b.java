package ru.ozon.fintech.features.offline.presentation.select;

import Sc.o;
import Sc.s;
import android.content.Context;
import e70.InterfaceC6317d;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l70.C7892a;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.ClientPhone;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.U;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectViewModel$loadTransferData$1", f = "OfflineSelectViewModel.kt", l = {587, 588, 609}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f95779d;

    /* renamed from: e, reason: collision with root package name */
    ru.ozon.fintech.features.offline.presentation.select.a f95780e;

    /* renamed from: f, reason: collision with root package name */
    int f95781f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f95782g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ru.ozon.fintech.features.offline.presentation.select.a f95783h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectViewModel$loadTransferData$1$contactsDeferred$1", f = "OfflineSelectViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super List<? extends C7892a>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.fintech.features.offline.presentation.select.a f95784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.fintech.features.offline.presentation.select.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f95784d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f95784d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends C7892a>> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List t02;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            t02 = this.f95784d.t0();
            return t02;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectViewModel$loadTransferData$1$mainDeferred$1", f = "OfflineSelectViewModel.kt", l = {585}, m = "invokeSuspend")
    /* renamed from: ru.ozon.fintech.features.offline.presentation.select.b$b, reason: collision with other inner class name */
    static final class C2044b extends j implements Function2<M, kotlin.coroutines.d<? super InterfaceC6317d<? extends MainData, Object>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95785d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.fintech.features.offline.presentation.select.a f95786e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2044b(ru.ozon.fintech.features.offline.presentation.select.a aVar, kotlin.coroutines.d<? super C2044b> dVar) {
            super(2, dVar);
            this.f95786e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C2044b(this.f95786e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super InterfaceC6317d<? extends MainData, Object>> dVar) {
            return ((C2044b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V60.a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95785d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            aVar = this.f95786e.f95756e;
            this.f95785d = 1;
            Object n11 = aVar.n(this);
            return n11 == aVar2 ? aVar2 : n11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.select.OfflineSelectViewModel$loadTransferData$1$transferDataDeferred$1", f = "OfflineSelectViewModel.kt", l = {586}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super InterfaceC6317d<? extends TransferData, Object>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95787d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.fintech.features.offline.presentation.select.a f95788e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ru.ozon.fintech.features.offline.presentation.select.a aVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f95788e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f95788e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super InterfaceC6317d<? extends TransferData, Object>> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V60.a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95787d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            aVar = this.f95788e.f95756e;
            this.f95787d = 1;
            Object j11 = aVar.j(this);
            return j11 == aVar2 ? aVar2 : j11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(ru.ozon.fintech.features.offline.presentation.select.a aVar, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f95783h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        b bVar = new b(this.f95783h, dVar);
        bVar.f95782g = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        if (r12 != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        U u11;
        ru.ozon.fintech.features.offline.presentation.select.a aVar;
        U u12;
        U u13;
        InterfaceC6317d interfaceC6317d;
        TransferData transferData;
        Context context;
        ClientPhone clientPhone;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f95781f;
        ru.ozon.fintech.features.offline.presentation.select.a aVar3 = this.f95783h;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f95782g;
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            U a11 = C10727i.a(m11, bVar, null, new a(aVar3, null), 2);
            U a12 = C10727i.a(m11, bVar, null, new C2044b(aVar3, null), 2);
            U a13 = C10727i.a(m11, bVar, null, new c(aVar3, null), 2);
            this.f95782g = a12;
            this.f95779d = a13;
            this.f95780e = aVar3;
            this.f95781f = 1;
            Object s11 = a11.s(this);
            if (s11 != aVar2) {
                u11 = a13;
                obj = s11;
                aVar = aVar3;
                u12 = a12;
            }
            return aVar2;
        }
        if (i11 == 1) {
            aVar = this.f95780e;
            u11 = (U) this.f95779d;
            u12 = (U) this.f95782g;
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                InterfaceC6317d interfaceC6317d2 = (InterfaceC6317d) obj;
                if (interfaceC6317d2 instanceof InterfaceC6317d.b) {
                    aVar3.f95763l = Boolean.valueOf(((MainData) ((InterfaceC6317d.b) interfaceC6317d2).a()).getSbpEnabled());
                } else {
                    if (!(interfaceC6317d2 instanceof InterfaceC6317d.a)) {
                        throw new o();
                    }
                    L80.a.b("OFFLINER", "spbEnabled cant load mainData");
                }
                aVar3.handleState();
                return Unit.f71690a;
            }
            u13 = (U) this.f95782g;
            s.b(obj);
            interfaceC6317d = (InterfaceC6317d) obj;
            if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
                aVar3.f95762k = (TransferData) ((InterfaceC6317d.b) interfaceC6317d).a();
                transferData = aVar3.f95762k;
                String plain = (transferData == null || (clientPhone = transferData.getClientPhone()) == null) ? null : clientPhone.getPlain();
                if (plain != null) {
                    context = aVar3.f95752a;
                    String string = context.getString(R.string.offline_transfer_to_me);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    aVar3.f95764m = ru.ozon.fintech.features.offline.presentation.select.a.h0(aVar3, plain, string, C7892a.b.f72948ME);
                }
            } else {
                if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                    throw new o();
                }
                L80.a.b("OFFLINER", "loadTransferData cant load transferData");
            }
            this.f95782g = null;
            this.f95781f = 3;
            obj = u13.s(this);
        }
        aVar.f95766o = (List) obj;
        this.f95782g = u12;
        this.f95779d = null;
        this.f95780e = null;
        this.f95781f = 2;
        obj = u11.s(this);
        if (obj != aVar2) {
            u13 = u12;
            interfaceC6317d = (InterfaceC6317d) obj;
            if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
            }
            this.f95782g = null;
            this.f95781f = 3;
            obj = u13.s(this);
        }
        return aVar2;
    }
}
