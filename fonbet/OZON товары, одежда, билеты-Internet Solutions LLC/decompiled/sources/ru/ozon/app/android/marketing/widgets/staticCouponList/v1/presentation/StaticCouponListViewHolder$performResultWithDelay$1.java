package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Sc.s;
import Wc.a;
import a00.C4911f;
import androidx.lifecycle.AbstractC5434v;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListViewHolder$performResultWithDelay$1", f = "StaticCouponListViewHolder.kt", l = {140, 141}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StaticCouponListViewHolder$performResultWithDelay$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ StaticCouponListWidgetViewModel.Result.Success $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StaticCouponListViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListViewHolder$performResultWithDelay$1$1", f = "StaticCouponListViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListViewHolder$performResultWithDelay$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ M $$this$launch;
        final /* synthetic */ StaticCouponListWidgetViewModel.Result.Success $result;
        int label;
        final /* synthetic */ StaticCouponListViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StaticCouponListWidgetViewModel.Result.Success success, StaticCouponListViewHolder staticCouponListViewHolder, M m11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$result = success;
            this.this$0 = staticCouponListViewHolder;
            this.$$this$launch = m11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$result, this.this$0, this.$$this$launch, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            StaticCouponListNotificationManager staticCouponListNotificationManager;
            C4911f c4911f;
            Function1 function1;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            AtomAction action = this.$result.getAction();
            if (action != null) {
                function1 = this.this$0.actionHandler;
                function1.invoke(action);
            }
            staticCouponListNotificationManager = this.this$0.notificationManager;
            c4911f = this.this$0.container;
            staticCouponListNotificationManager.showNotification(c4911f, this.$result.getNotification(), this.$result.getMessage());
            N.c(this.$$this$launch, null);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticCouponListViewHolder$performResultWithDelay$1(StaticCouponListViewHolder staticCouponListViewHolder, StaticCouponListWidgetViewModel.Result.Success success, d<? super StaticCouponListViewHolder$performResultWithDelay$1> dVar) {
        super(2, dVar);
        this.this$0 = staticCouponListViewHolder;
        this.$result = success;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StaticCouponListViewHolder$performResultWithDelay$1 staticCouponListViewHolder$performResultWithDelay$1 = new StaticCouponListViewHolder$performResultWithDelay$1(this.this$0, this.$result, dVar);
        staticCouponListViewHolder$performResultWithDelay$1.L$0 = obj;
        return staticCouponListViewHolder$performResultWithDelay$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (androidx.lifecycle.C5412d0.a(r9, r3, r4, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (Ke.a.a(r9, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        C4911f c4911f;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            Duration ofMillis = Duration.ofMillis(1500L);
            Intrinsics.checkNotNullExpressionValue(ofMillis, "ofMillis(...)");
            this.L$0 = m11;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        c4911f = this.this$0.container;
        AbstractC5434v lifecycle = c4911f.e().getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, this.this$0, m11, null);
        this.L$0 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((StaticCouponListViewHolder$performResultWithDelay$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
