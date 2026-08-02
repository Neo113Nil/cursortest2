package ru.ozon.app.android.search.widgets.utils;

import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.Y;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LiveDataDebounceExtKt$debounce$1$1<T> extends AbstractC7737t implements Function1<T, Unit> {
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ long $duration;
    final /* synthetic */ kotlin.jvm.internal.M<B0> $job;
    final /* synthetic */ T<T> $mld;
    final /* synthetic */ P<T> $source;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.search.widgets.utils.LiveDataDebounceExtKt$debounce$1$1$1", f = "LiveDataDebounceExt.kt", l = {20}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.search.widgets.utils.LiveDataDebounceExtKt$debounce$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ long $duration;
        final /* synthetic */ T<T> $mld;
        final /* synthetic */ P<T> $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j11, T<T> t2, P<T> p11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$duration = j11;
            this.$mld = t2;
            this.$source = p11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$duration, this.$mld, this.$source, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                long j11 = this.$duration;
                this.label = 1;
                if (Y.b(j11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            this.$mld.postValue(this.$source.getValue());
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveDataDebounceExtKt$debounce$1$1(kotlin.jvm.internal.M<B0> m11, M m12, long j11, T<T> t2, P<T> p11) {
        super(1);
        this.$job = m11;
        this.$coroutineScope = m12;
        this.$duration = j11;
        this.$mld = t2;
        this.$source = p11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((LiveDataDebounceExtKt$debounce$1$1<T>) obj);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(T t2) {
        B0 b02 = this.$job.f71787a;
        if (b02 != null) {
            b02.j(null);
        }
        this.$job.f71787a = (T) C10727i.c(this.$coroutineScope, null, null, new AnonymousClass1(this.$duration, this.$mld, this.$source, null), 3);
    }
}
