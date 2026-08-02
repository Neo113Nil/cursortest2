package ru.ozon.app.android.travel.utils.extensions;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.K;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$launchUpdate$1", f = "RecyclerViewExtensions.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$launchUpdate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ RecyclerView.g<?> $adapter;
    final /* synthetic */ Function1<Integer, Unit> $applyNewHeightCallback;
    final /* synthetic */ K $cachedLocalMax;
    final /* synthetic */ int $itemsPerYield;
    final /* synthetic */ RecyclerView $rv;
    final /* synthetic */ int $targetItemWidth;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$launchUpdate$1(RecyclerView.g<?> gVar, int i11, RecyclerView recyclerView, int i12, K k11, Function1<? super Integer, Unit> function1, d<? super RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$launchUpdate$1> dVar) {
        super(2, dVar);
        this.$adapter = gVar;
        this.$targetItemWidth = i11;
        this.$rv = recyclerView;
        this.$itemsPerYield = i12;
        this.$cachedLocalMax = k11;
        this.$applyNewHeightCallback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$launchUpdate$1(this.$adapter, this.$targetItemWidth, this.$rv, this.$itemsPerYield, this.$cachedLocalMax, this.$applyNewHeightCallback, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object autoSetHeightFromMaxItem$updateHeightFromMaxItem;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                RecyclerView.g<?> gVar = this.$adapter;
                int i12 = this.$targetItemWidth;
                RecyclerView recyclerView = this.$rv;
                int i13 = this.$itemsPerYield;
                K k11 = this.$cachedLocalMax;
                Function1<Integer, Unit> function1 = this.$applyNewHeightCallback;
                r.Companion companion = r.INSTANCE;
                this.label = 1;
                autoSetHeightFromMaxItem$updateHeightFromMaxItem = RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$updateHeightFromMaxItem(gVar, i12, recyclerView, i13, k11, function1, this);
                if (autoSetHeightFromMaxItem$updateHeightFromMaxItem == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            Unit unit = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            s.a(th2);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$launchUpdate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
