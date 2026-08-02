package ru.ozon.uni.ozi.components.inputs;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import k1.C7460f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;
import ve.EnumC10311b;
import xe.C10740o0;
import xe.M;
import xe.N;
import z0.InterfaceC10969b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.uni.ozi.components.inputs.SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1", f = "SafeAreaInSheetOracle.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ float $bottomPaddingPx;
    final /* synthetic */ boolean $needToBringIntoView;
    final /* synthetic */ SafeAreaInSheetOracleState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1(boolean z11, SafeAreaInSheetOracleState safeAreaInSheetOracleState, float f7, d<? super SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1> dVar) {
        super(2, dVar);
        this.$needToBringIntoView = z11;
        this.$state = safeAreaInSheetOracleState;
        this.$bottomPaddingPx = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1 safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1 = new SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1(this.$needToBringIntoView, this.$state, this.$bottomPaddingPx, dVar);
        safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1.L$0 = obj;
        return safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            if (this.$needToBringIntoView) {
                w0<Unit> positionChangesFlow = this.$state.getPositionChangesFlow();
                b.Companion companion = b.INSTANCE;
                InterfaceC2395h n11 = C2399j.n(positionChangesFlow, c.g(20, EnumC10311b.MILLISECONDS));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, m11, this.$bottomPaddingPx);
                this.label = 1;
                if (n11.collect(anonymousClass1, this) == aVar) {
                    return aVar;
                }
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
        return ((SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "emit", "(Lkotlin/Unit;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.ozi.components.inputs.SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements InterfaceC2397i {
        final /* synthetic */ M $$this$LaunchedEffect;
        final /* synthetic */ float $bottomPaddingPx;
        final /* synthetic */ SafeAreaInSheetOracleState $state;

        AnonymousClass1(SafeAreaInSheetOracleState safeAreaInSheetOracleState, M m11, float f7) {
            this.$state = safeAreaInSheetOracleState;
            this.$$this$LaunchedEffect = m11;
            this.$bottomPaddingPx = f7;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Unit unit, d<? super Unit> dVar) {
            SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1 safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1;
            int i11;
            AnonymousClass1<T> anonymousClass1;
            if (dVar instanceof SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1) {
                safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1 = (SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1) dVar;
                int i12 = safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        if (this.$state.getRect() != null) {
                            C7460f c7460f = new C7460f(r8.e(), r8.g(), r8.f(), r8.c());
                            C7460f g10 = C7460f.g(c7460f, 0.0f, 0.0f, c7460f.h() + this.$bottomPaddingPx, 7);
                            InterfaceC10969b requester = this.$state.getRequester();
                            safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1.L$0 = this;
                            safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1.label = 1;
                            if (requester.a(g10, safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1) == aVar) {
                                return aVar;
                            }
                        }
                        anonymousClass1 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        anonymousClass1 = (AnonymousClass1) safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1.L$0;
                        s.b(obj);
                    }
                    N.c(anonymousClass1.$$this$LaunchedEffect, C10740o0.a("bringIntoView executed successfully", null));
                    return Unit.f71690a;
                }
            }
            safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1 = new SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1(this, dVar);
            Object obj2 = safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1.result;
            a aVar2 = a.COROUTINE_SUSPENDED;
            i11 = safeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1$1$emit$1.label;
            if (i11 != 0) {
            }
            N.c(anonymousClass1.$$this$LaunchedEffect, C10740o0.a("bringIntoView executed successfully", null));
            return Unit.f71690a;
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((Unit) obj, (d<? super Unit>) dVar);
        }
    }
}
