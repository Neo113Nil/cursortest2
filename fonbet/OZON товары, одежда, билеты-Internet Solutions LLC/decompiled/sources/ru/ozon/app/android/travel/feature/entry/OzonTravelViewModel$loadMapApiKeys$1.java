package ru.ozon.app.android.travel.feature.entry;

import He.b;
import Sc.s;
import Wc.a;
import ae0.i;
import android.content.Context;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.entry.OzonTravelViewModel$loadMapApiKeys$1", f = "OzonTravelViewModel.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OzonTravelViewModel$loadMapApiKeys$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OzonTravelViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.entry.OzonTravelViewModel$loadMapApiKeys$1$1", f = "OzonTravelViewModel.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.entry.OzonTravelViewModel$loadMapApiKeys$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ OzonTravelViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OzonTravelViewModel ozonTravelViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = ozonTravelViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Context context;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                i iVar = i.f36650a;
                context = this.this$0.appContext;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                if (iVar.e(applicationContext, this) == aVar) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonTravelViewModel$loadMapApiKeys$1(OzonTravelViewModel ozonTravelViewModel, d<? super OzonTravelViewModel$loadMapApiKeys$1> dVar) {
        super(2, dVar);
        this.this$0 = ozonTravelViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonTravelViewModel$loadMapApiKeys$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            b bVar = b.f10879b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C10727i.f(bVar, anonymousClass1, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OzonTravelViewModel$loadMapApiKeys$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
