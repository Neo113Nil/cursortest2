package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import Sc.s;
import T00.a;
import a00.C4908c;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.i;
import l20.b;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.composer.ui.widget.l;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$initLifecycleObserver$1", f = "TotalStickyV3ViewHolder.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TotalStickyV3ViewHolder$initLifecycleObserver$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TotalStickyV3ViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$initLifecycleObserver$1$1", f = "TotalStickyV3ViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewHolder$initLifecycleObserver$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ TotalStickyV3ViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TotalStickyV3ViewHolder totalStickyV3ViewHolder, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = totalStickyV3ViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ReferrerValueController referrerValueController;
            b i11;
            l20.d b11;
            a b12;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            referrerValueController = this.this$0.referrerValueController;
            l viewItem = this.this$0.getViewItem();
            referrerValueController.clearCurrentPageURLIfNeeded((viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (b12 = b11.b()) == null) ? null : b12.c());
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalStickyV3ViewHolder$initLifecycleObserver$1(TotalStickyV3ViewHolder totalStickyV3ViewHolder, d<? super TotalStickyV3ViewHolder$initLifecycleObserver$1> dVar) {
        super(2, dVar);
        this.this$0 = totalStickyV3ViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TotalStickyV3ViewHolder$initLifecycleObserver$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            iVar = this.this$0.container;
            C4908c f7 = iVar.K().f();
            AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C5412d0.b(f7, bVar, anonymousClass1, this) == aVar) {
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
        return ((TotalStickyV3ViewHolder$initLifecycleObserver$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
