package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data.BonusExpirationRemainderRepository;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.I;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel$onCloseClicked$1", f = "BonusExpirationRemainderViewModel.kt", l = {53, 61, 61, 61}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BonusExpirationRemainderViewModel$onCloseClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $id;
    final /* synthetic */ String $key;
    final /* synthetic */ long $timestamp;
    Object L$0;
    int label;
    final /* synthetic */ BonusExpirationRemainderViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel$onCloseClicked$1$1", f = "BonusExpirationRemainderViewModel.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel$onCloseClicked$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ long $timestamp;
        int label;
        final /* synthetic */ BonusExpirationRemainderViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel, String str, long j11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = bonusExpirationRemainderViewModel;
            this.$key = str;
            this.$timestamp = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$key, this.$timestamp, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            BonusExpirationRemainderRepository bonusExpirationRemainderRepository;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                bonusExpirationRemainderRepository = this.this$0.repository;
                String str = this.$key;
                long j11 = this.$timestamp;
                this.label = 1;
                if (bonusExpirationRemainderRepository.putTimestamp(str, j11, this) == aVar) {
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
    BonusExpirationRemainderViewModel$onCloseClicked$1(BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel, long j11, String str, long j12, d<? super BonusExpirationRemainderViewModel$onCloseClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = bonusExpirationRemainderViewModel;
        this.$id = j11;
        this.$key = str;
        this.$timestamp = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BonusExpirationRemainderViewModel$onCloseClicked$1(this.this$0, this.$id, this.$key, this.$timestamp, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r14.emit(r0, r13) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (xe.C10727i.f(r14, r7, r13) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r14.emit(r0, r13) != r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [long] */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        x0 x0Var2;
        CoroutineDispatcherProvider coroutineDispatcherProvider;
        x0 x0Var3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        int i12 = 4;
        i12 = 4;
        try {
            try {
            } catch (Exception e11) {
                if (!(e11 instanceof CancellationException)) {
                    Lm0.a.f17149a.e(e11);
                }
                x0Var2 = this.this$0._resultFlow;
                BonusExpirationRemainderViewModel.RemoveWidget removeWidget = new BonusExpirationRemainderViewModel.RemoveWidget(this.$id, false);
                this.label = 3;
            }
            if (i11 == 0) {
                s.b(obj);
                coroutineDispatcherProvider = this.this$0.dispatchers;
                I io2 = coroutineDispatcherProvider.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$key, this.$timestamp, null);
                this.label = 1;
            } else {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.L$0;
                    s.b(obj);
                    throw th2;
                }
                s.b(obj);
            }
            x0Var3 = this.this$0._resultFlow;
            i12 = this.$id;
            BonusExpirationRemainderViewModel.RemoveWidget removeWidget2 = new BonusExpirationRemainderViewModel.RemoveWidget(i12, false);
            this.label = 2;
        } catch (Throwable th3) {
            x0Var = this.this$0._resultFlow;
            BonusExpirationRemainderViewModel.RemoveWidget removeWidget3 = new BonusExpirationRemainderViewModel.RemoveWidget(this.$id, false);
            this.L$0 = th3;
            this.label = i12;
            if (x0Var.emit(removeWidget3, this) != aVar) {
                throw th3;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BonusExpirationRemainderViewModel$onCloseClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
