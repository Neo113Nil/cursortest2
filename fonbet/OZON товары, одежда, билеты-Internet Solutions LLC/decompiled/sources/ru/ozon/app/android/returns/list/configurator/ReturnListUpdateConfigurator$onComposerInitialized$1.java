package ru.ozon.app.android.returns.list.configurator;

import Ae.B0;
import Ae.InterfaceC2397i;
import Lm0.a;
import Sc.C4005g;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.returns.ui.domain.ReturnUpdateInteractor;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.list.configurator.ReturnListUpdateConfigurator$onComposerInitialized$1", f = "ReturnListUpdateConfigurator.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnListUpdateConfigurator$onComposerInitialized$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AbstractC5434v $lifecycle;
    int label;
    final /* synthetic */ ReturnListUpdateConfigurator this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.returns.list.configurator.ReturnListUpdateConfigurator$onComposerInitialized$1$1", f = "ReturnListUpdateConfigurator.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.returns.list.configurator.ReturnListUpdateConfigurator$onComposerInitialized$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReturnListUpdateConfigurator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReturnListUpdateConfigurator returnListUpdateConfigurator, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = returnListUpdateConfigurator;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ReturnUpdateInteractor returnUpdateInteractor;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                final M m11 = (M) this.L$0;
                returnUpdateInteractor = this.this$0.interactor;
                B0<Unit> observeNeedUpdate = returnUpdateInteractor.observeNeedUpdate();
                final ReturnListUpdateConfigurator returnListUpdateConfigurator = this.this$0;
                InterfaceC2397i<? super Unit> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.returns.list.configurator.ReturnListUpdateConfigurator.onComposerInitialized.1.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Unit) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Unit unit, d<? super Unit> dVar) {
                        Object a11;
                        InterfaceC7851b controller;
                        ReturnListUpdateConfigurator returnListUpdateConfigurator2 = returnListUpdateConfigurator;
                        try {
                            r.Companion companion = r.INSTANCE;
                            ConfiguratorReferences references = returnListUpdateConfigurator2.getReferences();
                            if (references == null || (controller = references.getController()) == null) {
                                a11 = null;
                            } else {
                                InterfaceC7851b.a.a(controller, null, null, null, null, 15);
                                a11 = Unit.f71690a;
                            }
                        } catch (Throwable th2) {
                            r.Companion companion2 = r.INSTANCE;
                            a11 = s.a(th2);
                        }
                        a.b bVar = Lm0.a.f17149a;
                        Throwable b11 = r.b(a11);
                        if (b11 != null) {
                            bVar.e(b11);
                        }
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (observeNeedUpdate.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnListUpdateConfigurator$onComposerInitialized$1(AbstractC5434v abstractC5434v, ReturnListUpdateConfigurator returnListUpdateConfigurator, d<? super ReturnListUpdateConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.$lifecycle = abstractC5434v;
        this.this$0 = returnListUpdateConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReturnListUpdateConfigurator$onComposerInitialized$1(this.$lifecycle, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AbstractC5434v abstractC5434v = this.$lifecycle;
            AbstractC5434v.b bVar = AbstractC5434v.b.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C5412d0.a(abstractC5434v, bVar, anonymousClass1, this) == aVar) {
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
        return ((ReturnListUpdateConfigurator$onComposerInitialized$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
