package ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo;

import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.RefreshByStatusEdoConfigurator$onComposerInitialized$1", f = "RefreshByStatusEdoConfigurator.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class RefreshByStatusEdoConfigurator$onComposerInitialized$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ RefreshByStatusEdoConfigurator this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.RefreshByStatusEdoConfigurator$onComposerInitialized$1$2", f = "RefreshByStatusEdoConfigurator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.RefreshByStatusEdoConfigurator$onComposerInitialized$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<Unit, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RefreshByStatusEdoConfigurator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RefreshByStatusEdoConfigurator refreshByStatusEdoConfigurator, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = refreshByStatusEdoConfigurator;
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
            this.this$0.lastEdoStateEvent = (Unit) this.L$0;
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(unit, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshByStatusEdoConfigurator$onComposerInitialized$1(RefreshByStatusEdoConfigurator refreshByStatusEdoConfigurator, d<? super RefreshByStatusEdoConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.this$0 = refreshByStatusEdoConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RefreshByStatusEdoConfigurator$onComposerInitialized$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        StatusEdoState statusEdoState;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            statusEdoState = this.this$0.statusEdoState;
            final InterfaceC2395h a11 = C5427n.a(statusEdoState.statusEdoChangedEvent(), this.this$0.getOwner().getLifecycle(), AbstractC5434v.b.CREATED);
            final RefreshByStatusEdoConfigurator refreshByStatusEdoConfigurator = this.this$0;
            C2408n0 c2408n0 = new C2408n0(new InterfaceC2395h<Unit>() { // from class: ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.RefreshByStatusEdoConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$filter$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.RefreshByStatusEdoConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ RefreshByStatusEdoConfigurator this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.RefreshByStatusEdoConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$filter$1$2", f = "RefreshByStatusEdoConfigurator.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.RefreshByStatusEdoConfigurator$onComposerInitialized$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, RefreshByStatusEdoConfigurator refreshByStatusEdoConfigurator) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = refreshByStatusEdoConfigurator;
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
                        Unit unit;
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
                                    unit = this.this$0.lastEdoStateEvent;
                                    if (!Intrinsics.d((Unit) obj, unit)) {
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
                public Object collect(InterfaceC2397i<? super Unit> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, refreshByStatusEdoConfigurator), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new AnonymousClass2(this.this$0, null));
            final RefreshByStatusEdoConfigurator refreshByStatusEdoConfigurator2 = this.this$0;
            InterfaceC2397i<? super Object> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.RefreshByStatusEdoConfigurator$onComposerInitialized$1.3
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Unit) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(Unit unit, d<? super Unit> dVar) {
                    RefreshByStatusEdoConfigurator.this.refreshPage();
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (c2408n0.collect(interfaceC2397i, this) == aVar) {
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
        return ((RefreshByStatusEdoConfigurator$onComposerInitialized$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
