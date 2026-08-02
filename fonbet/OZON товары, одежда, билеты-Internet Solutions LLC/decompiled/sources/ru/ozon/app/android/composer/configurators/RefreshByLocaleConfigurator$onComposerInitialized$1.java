package ru.ozon.app.android.composer.configurators;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.account.locale.app.data.AppLocaleChangedEventBus;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.configurators.RefreshByLocaleConfigurator$onComposerInitialized$1", f = "RefreshByLocaleConfigurator.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class RefreshByLocaleConfigurator$onComposerInitialized$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ RefreshByLocaleConfigurator this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.composer.configurators.RefreshByLocaleConfigurator$onComposerInitialized$1$1", f = "RefreshByLocaleConfigurator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.composer.configurators.RefreshByLocaleConfigurator$onComposerInitialized$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Unit, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ RefreshByLocaleConfigurator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RefreshByLocaleConfigurator refreshByLocaleConfigurator, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = refreshByLocaleConfigurator;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC7851b controller;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ConfiguratorReferences references = this.this$0.getReferences();
            if (references != null && (controller = references.getController()) != null) {
                InterfaceC7851b.a.e(controller, null, null, null, 7);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(unit, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshByLocaleConfigurator$onComposerInitialized$1(RefreshByLocaleConfigurator refreshByLocaleConfigurator, d<? super RefreshByLocaleConfigurator$onComposerInitialized$1> dVar) {
        super(2, dVar);
        this.this$0 = refreshByLocaleConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RefreshByLocaleConfigurator$onComposerInitialized$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AppLocaleChangedEventBus appLocaleChangedEventBus;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            appLocaleChangedEventBus = this.this$0.appLocaleChangedEventBus;
            InterfaceC2395h a11 = C5427n.a(appLocaleChangedEventBus.getFlow(), this.this$0.getOwner().getLifecycle(), AbstractC5434v.b.CREATED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C2399j.h(a11, anonymousClass1, this) == aVar) {
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
        return ((RefreshByLocaleConfigurator$onComposerInitialized$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
