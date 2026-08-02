package ru.ozon.app.android.composer.network.join;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import We.InterfaceC4865g;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;
import ve.EnumC10311b;
import xe.M;
import xe.Y;
import xe.f1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.network.join.JoinRequestsStrategy$Enabled$await$1", f = "JoinRequestsStrategy.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class JoinRequestsStrategy$Enabled$await$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC4865g $this_await;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "LWe/g;", "<anonymous>", "(Lxe/M;)LWe/g;"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.composer.network.join.JoinRequestsStrategy$Enabled$await$1$1", f = "JoinRequestsStrategy.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.composer.network.join.JoinRequestsStrategy$Enabled$await$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super InterfaceC4865g>, Object> {
        final /* synthetic */ InterfaceC4865g $this_await;
        int label;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWe/g;", "it", "", "<anonymous>", "(LWe/g;)Z"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.composer.network.join.JoinRequestsStrategy$Enabled$await$1$1$1", f = "JoinRequestsStrategy.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.composer.network.join.JoinRequestsStrategy$Enabled$await$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17581 extends j implements Function2<InterfaceC4865g, d<? super Boolean>, Object> {
            final /* synthetic */ InterfaceC4865g $this_await;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17581(InterfaceC4865g interfaceC4865g, d<? super C17581> dVar) {
                super(2, dVar);
                this.$this_await = interfaceC4865g;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C17581 c17581 = new C17581(this.$this_await, dVar);
                c17581.L$0 = obj;
                return c17581;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC4865g interfaceC4865g, d<? super Boolean> dVar) {
                return ((C17581) create(interfaceC4865g, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Boolean.valueOf(((InterfaceC4865g) this.L$0) == this.$this_await);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC4865g interfaceC4865g, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_await = interfaceC4865g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$this_await, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            InterfaceC2395h<InterfaceC4865g> eventsFlow = CallFinishedEventBus.INSTANCE.getEventsFlow();
            C17581 c17581 = new C17581(this.$this_await, null);
            this.label = 1;
            Object v11 = C2399j.v(eventsFlow, c17581, this);
            return v11 == aVar ? aVar : v11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super InterfaceC4865g> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JoinRequestsStrategy$Enabled$await$1(InterfaceC4865g interfaceC4865g, d<? super JoinRequestsStrategy$Enabled$await$1> dVar) {
        super(2, dVar);
        this.$this_await = interfaceC4865g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new JoinRequestsStrategy$Enabled$await$1(this.$this_await, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            b.Companion companion = b.INSTANCE;
            long h11 = c.h(this.$this_await.timeout().h(), EnumC10311b.NANOSECONDS);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_await, null);
            this.label = 1;
            if (f1.c(Y.e(h11), anonymousClass1, this) == aVar) {
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
        return ((JoinRequestsStrategy$Enabled$await$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
