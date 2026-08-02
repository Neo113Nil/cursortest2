package ru.ozon.app.android.composer.configurators;

import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import xe.M;
import zb0.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1", f = "RefreshByUserConfigurator.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class RefreshByUserConfigurator$onComposerInitialized$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<f.b> $refreshReasonsMapped;
    int label;
    final /* synthetic */ RefreshByUserConfigurator this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzb0/f;", "it", "", "<anonymous>", "(Lzb0/f;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$2", f = "RefreshByUserConfigurator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<f, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RefreshByUserConfigurator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RefreshByUserConfigurator refreshByUserConfigurator, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = refreshByUserConfigurator;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.this$0.prevAuthCookieEvent = (f) this.L$0;
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(f fVar, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(fVar, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RefreshByUserConfigurator$onComposerInitialized$1$1(RefreshByUserConfigurator refreshByUserConfigurator, List<? extends f.b> list, d<? super RefreshByUserConfigurator$onComposerInitialized$1$1> dVar) {
        super(2, dVar);
        this.this$0 = refreshByUserConfigurator;
        this.$refreshReasonsMapped = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RefreshByUserConfigurator$onComposerInitialized$1$1(this.this$0, this.$refreshReasonsMapped, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonIdCookieEvents ozonIdCookieEvents;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ozonIdCookieEvents = this.this$0.ozonIdCookieEvents;
            final InterfaceC2395h a11 = C5427n.a(ozonIdCookieEvents.getFlow(), this.this$0.getOwner().getLifecycle(), AbstractC5434v.b.CREATED);
            final RefreshByUserConfigurator refreshByUserConfigurator = this.this$0;
            final C2408n0 c2408n0 = new C2408n0(new InterfaceC2395h<f>() { // from class: ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$invokeSuspend$$inlined$filter$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ RefreshByUserConfigurator this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$invokeSuspend$$inlined$filter$1$2", f = "RefreshByUserConfigurator.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, RefreshByUserConfigurator refreshByUserConfigurator) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = refreshByUserConfigurator;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        f fVar;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                a aVar = a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    fVar = this.this$0.prevAuthCookieEvent;
                                    if (!Intrinsics.d((f) obj, fVar)) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        a aVar2 = a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super f> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, refreshByUserConfigurator), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new AnonymousClass2(this.this$0, null));
            final List<f.b> list = this.$refreshReasonsMapped;
            InterfaceC2395h<f> interfaceC2395h = new InterfaceC2395h<f>() { // from class: ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$invokeSuspend$$inlined$filter$2

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$invokeSuspend$$inlined$filter$2$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ List $refreshReasonsMapped$inlined;
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$invokeSuspend$$inlined$filter$2$2", f = "RefreshByUserConfigurator.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1$invokeSuspend$$inlined$filter$2$2$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, List list) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.$refreshReasonsMapped$inlined = list;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                a aVar = a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    f fVar = (f) obj;
                                    if (fVar.a().a() != f.b.TokenUpdate && this.$refreshReasonsMapped$inlined.contains(fVar.a().a())) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        a aVar2 = a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super f> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, list), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            final RefreshByUserConfigurator refreshByUserConfigurator2 = this.this$0;
            InterfaceC2397i<? super f> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.composer.configurators.RefreshByUserConfigurator$onComposerInitialized$1$1.4
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((f) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(f fVar, d<? super Unit> dVar) {
                    RefreshByUserConfigurator.this.refreshPage();
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (interfaceC2395h.collect(interfaceC2397i, this) == aVar) {
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
        return ((RefreshByUserConfigurator$onComposerInitialized$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
