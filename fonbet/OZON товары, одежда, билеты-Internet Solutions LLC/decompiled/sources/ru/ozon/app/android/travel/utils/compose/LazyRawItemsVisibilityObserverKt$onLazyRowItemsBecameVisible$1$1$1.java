package ru.ozon.app.android.travel.utils.compose;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.A1;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.s;
import Wc.a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import v0.I;
import v0.InterfaceC10174n;
import v0.y;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.compose.LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1", f = "LazyRawItemsVisibilityObserver.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ A1<Function1<Integer, Unit>> $latestCallback$delegate;
    final /* synthetic */ I $listState;
    final /* synthetic */ ItemVisibilityMode $mode;
    final /* synthetic */ InterfaceC3978p0<Set<Integer>> $previousVisibleIndexes$delegate;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.utils.compose.LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<List<? extends Integer>> {
        final /* synthetic */ I $listState;
        final /* synthetic */ ItemVisibilityMode $mode;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv0/n;", "item", "", "invoke", "(Lv0/n;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.utils.compose.LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C19351 extends AbstractC7737t implements Function1<InterfaceC10174n, Boolean> {
            final /* synthetic */ y $layoutInfo;
            final /* synthetic */ ItemVisibilityMode $mode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19351(y yVar, ItemVisibilityMode itemVisibilityMode) {
                super(1);
                this.$layoutInfo = yVar;
                this.$mode = itemVisibilityMode;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(InterfaceC10174n item) {
                boolean matchesVisibility;
                Intrinsics.checkNotNullParameter(item, "item");
                matchesVisibility = LazyRawItemsVisibilityObserverKt.matchesVisibility(item, this.$layoutInfo, this.$mode);
                return Boolean.valueOf(matchesVisibility);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv0/n;", "it", "", "invoke", "(Lv0/n;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.utils.compose.LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<InterfaceC10174n, Integer> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(InterfaceC10174n it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getIndex());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(I i11, ItemVisibilityMode itemVisibilityMode) {
            super(0);
            this.$listState = i11;
            this.$mode = itemVisibilityMode;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Integer> invoke() {
            y t2 = this.$listState.t();
            return l.C(l.v(l.h(C7714v.w(t2.g()), new C19351(t2, this.$mode)), AnonymousClass2.INSTANCE));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1(I i11, ItemVisibilityMode itemVisibilityMode, InterfaceC3978p0<Set<Integer>> interfaceC3978p0, A1<? extends Function1<? super Integer, Unit>> a12, d<? super LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1> dVar) {
        super(2, dVar);
        this.$listState = i11;
        this.$mode = itemVisibilityMode;
        this.$previousVisibleIndexes$delegate = interfaceC3978p0;
        this.$latestCallback$delegate = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1(this.$listState, this.$mode, this.$previousVisibleIndexes$delegate, this.$latestCallback$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h o11 = C2399j.o(n1.m(new AnonymousClass1(this.$listState, this.$mode)));
            final InterfaceC3978p0<Set<Integer>> interfaceC3978p0 = this.$previousVisibleIndexes$delegate;
            final A1<Function1<Integer, Unit>> a12 = this.$latestCallback$delegate;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.utils.compose.LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((List<Integer>) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(List<Integer> list, d<? super Unit> dVar) {
                    Set invoke$lambda$2;
                    Function1 invoke$lambda$0;
                    List<Integer> list2 = list;
                    Set Y02 = C7714v.Y0(list2);
                    InterfaceC3978p0<Set<Integer>> interfaceC3978p02 = interfaceC3978p0;
                    A1<Function1<Integer, Unit>> a13 = a12;
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        invoke$lambda$2 = LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1.invoke$lambda$2(interfaceC3978p02);
                        if (!invoke$lambda$2.contains(new Integer(intValue))) {
                            invoke$lambda$0 = LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1.invoke$lambda$0(a13);
                            invoke$lambda$0.invoke(new Integer(intValue));
                        }
                    }
                    interfaceC3978p0.setValue(Y02);
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (o11.collect(interfaceC2397i, this) == aVar) {
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
        return ((LazyRawItemsVisibilityObserverKt$onLazyRowItemsBecameVisible$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
