package ru.ozon.app.android.cart.common.presentation.utils;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import De.C2862e;
import Sc.s;
import Wc.a;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.I;
import xe.M;
import xe.N;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "LAe/i;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1", f = "Extensions.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1<T> extends j implements Function2<InterfaceC2397i<? super T>, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC6511n $action$inlined;
    final /* synthetic */ CoroutineDispatcherProvider $dispatcherProvider$inlined;
    final /* synthetic */ InterfaceC2395h $this_transform;
    final /* synthetic */ View $view$inlined;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements InterfaceC2397i {
        final /* synthetic */ InterfaceC2397i<T> $$this$flow;
        final /* synthetic */ InterfaceC6511n $action$inlined;
        final /* synthetic */ CoroutineDispatcherProvider $dispatcherProvider$inlined;
        final /* synthetic */ View $view$inlined;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @e(c = "ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1$1", f = "Extensions.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 47, 49}, m = "emit")
        /* renamed from: ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C17361 extends c {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public C17361(d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= LinearLayoutManager.INVALID_OFFSET;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(InterfaceC2397i interfaceC2397i, View view, CoroutineDispatcherProvider coroutineDispatcherProvider, InterfaceC6511n interfaceC6511n) {
            this.$view$inlined = view;
            this.$dispatcherProvider$inlined = coroutineDispatcherProvider;
            this.$action$inlined = interfaceC6511n;
            this.$$this$flow = interfaceC2397i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
        
            if (r2.emit(r5, r0) != r1) goto L39;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t2, d<? super Unit> dVar) {
            C17361 c17361;
            int i11;
            Object obj;
            InterfaceC2397i<T> interfaceC2397i;
            I i12;
            Object obj2;
            M m11;
            InterfaceC2397i<T> interfaceC2397i2;
            InterfaceC2397i interfaceC2397i3;
            if (dVar instanceof C17361) {
                c17361 = (C17361) dVar;
                int i13 = c17361.label;
                if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c17361.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj3 = c17361.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = c17361.label;
                    if (i11 != 0) {
                        s.b(obj3);
                        InterfaceC2397i<T> interfaceC2397i4 = this.$$this$flow;
                        if (this.$view$inlined.isInLayout()) {
                            CoroutineDispatcherProvider coroutineDispatcherProvider = this.$dispatcherProvider$inlined;
                            if (coroutineDispatcherProvider == null || (i12 = coroutineDispatcherProvider.getMain()) == null) {
                                C10720e0 c10720e0 = C10720e0.f105451a;
                                i12 = De.s.f6650a;
                            }
                            C2862e a11 = N.a(i12);
                            B0 c11 = C10727i.c(a11, null, null, new ExtensionsKt$onEachOutOfLayoutView$1$1(this.$action$inlined, t2, this.$view$inlined, null), 3);
                            c17361.L$0 = t2;
                            c17361.L$1 = interfaceC2397i4;
                            c17361.L$2 = a11;
                            c17361.label = 1;
                            if (((H0) c11).r0(c17361) != aVar) {
                                obj2 = t2;
                                m11 = a11;
                                interfaceC2397i2 = interfaceC2397i4;
                                N.c(m11, null);
                                interfaceC2397i3 = interfaceC2397i2;
                            }
                        } else {
                            InterfaceC6511n interfaceC6511n = this.$action$inlined;
                            View view = this.$view$inlined;
                            c17361.L$0 = t2;
                            c17361.L$1 = interfaceC2397i4;
                            c17361.label = 2;
                            if (interfaceC6511n.invoke(t2, view, c17361) != aVar) {
                                obj = t2;
                                interfaceC2397i = interfaceC2397i4;
                                obj2 = obj;
                                interfaceC2397i3 = interfaceC2397i;
                            }
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        m11 = (M) c17361.L$2;
                        InterfaceC2397i<T> interfaceC2397i5 = (InterfaceC2397i) c17361.L$1;
                        obj2 = c17361.L$0;
                        s.b(obj3);
                        interfaceC2397i2 = interfaceC2397i5;
                        N.c(m11, null);
                        interfaceC2397i3 = interfaceC2397i2;
                    } else {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj3);
                            return Unit.f71690a;
                        }
                        interfaceC2397i = (InterfaceC2397i) c17361.L$1;
                        obj = c17361.L$0;
                        s.b(obj3);
                        obj2 = obj;
                        interfaceC2397i3 = interfaceC2397i;
                    }
                    c17361.L$0 = null;
                    c17361.L$1 = null;
                    c17361.L$2 = null;
                    c17361.label = 3;
                }
            }
            c17361 = new C17361(dVar);
            Object obj32 = c17361.result;
            a aVar2 = a.COROUTINE_SUSPENDED;
            i11 = c17361.label;
            if (i11 != 0) {
            }
            c17361.L$0 = null;
            c17361.L$1 = null;
            c17361.L$2 = null;
            c17361.label = 3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1(InterfaceC2395h interfaceC2395h, d dVar, View view, CoroutineDispatcherProvider coroutineDispatcherProvider, InterfaceC6511n interfaceC6511n) {
        super(2, dVar);
        this.$this_transform = interfaceC2395h;
        this.$view$inlined = view;
        this.$dispatcherProvider$inlined = coroutineDispatcherProvider;
        this.$action$inlined = interfaceC6511n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1 extensionsKt$onEachOutOfLayoutView$$inlined$transform$1 = new ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1(this.$this_transform, dVar, this.$view$inlined, this.$dispatcherProvider$inlined, this.$action$inlined);
        extensionsKt$onEachOutOfLayoutView$$inlined$transform$1.L$0 = obj;
        return extensionsKt$onEachOutOfLayoutView$$inlined$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super T> interfaceC2397i, d<? super Unit> dVar) {
        return ((ExtensionsKt$onEachOutOfLayoutView$$inlined$transform$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
            InterfaceC2395h interfaceC2395h = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC2397i, this.$view$inlined, this.$dispatcherProvider$inlined, this.$action$inlined);
            this.label = 1;
            if (interfaceC2395h.collect(anonymousClass1, this) == aVar) {
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
}
