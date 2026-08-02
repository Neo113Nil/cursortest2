package ru.ozon.app.android.marketing.widgets.stickyLadder.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import He.b;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;)V", "", "updateWidgetState", "()V", "", "asyncData", "", "id", "setData", "(Ljava/lang/String;J)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "_asyncData", "Ljava/lang/String;", "_id", "Ljava/lang/Long;", "Lxe/B0;", "job", "Lxe/B0;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel$NewState;", "widgetState", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getWidgetState", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "NewState", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyLadderAsyncViewModel extends w0 {
    private String _asyncData;
    private Long _id;
    private B0 job;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final SingleLiveEvent<NewState> widgetState;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderAsyncViewModel$1", f = "StickyLadderAsyncViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderAsyncViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartState, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return StickyLadderAsyncViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            StickyLadderAsyncViewModel.this.updateWidgetState();
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CartState cartState, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel$NewState;", "", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;", "stickyLadderVO", "<init>", "(Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;", "getStickyLadderVO", "()Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderVO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewState {

        @NotNull
        private final StickyLadderVO stickyLadderVO;

        public NewState(@NotNull StickyLadderVO stickyLadderVO) {
            Intrinsics.checkNotNullParameter(stickyLadderVO, "stickyLadderVO");
            this.stickyLadderVO = stickyLadderVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewState) && Intrinsics.d(this.stickyLadderVO, ((NewState) other).stickyLadderVO);
        }

        @NotNull
        public final StickyLadderVO getStickyLadderVO() {
            return this.stickyLadderVO;
        }

        public int hashCode() {
            return this.stickyLadderVO.hashCode();
        }

        @NotNull
        public String toString() {
            return "NewState(stickyLadderVO=" + this.stickyLadderVO + ")";
        }
    }

    public StickyLadderAsyncViewModel(@NotNull CartService cartService, @NotNull ComposerAsyncWidgetRepository repository) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.widgetState = new SingleLiveEvent<>();
        C2399j.C(new C2408n0(n.a(cartService.observeCartStateChanged(CartSource.REMOTE)), new AnonymousClass1(null)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWidgetState() {
        Long l11;
        String str = this._asyncData;
        if (str == null || (l11 = this._id) == null) {
            return;
        }
        long longValue = l11.longValue();
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.job = C10727i.c(a11, b.f10879b, null, new StickyLadderAsyncViewModel$updateWidgetState$1(this, str, longValue, null), 2);
    }

    @NotNull
    public final SingleLiveEvent<NewState> getWidgetState() {
        return this.widgetState;
    }

    public final void setData(String asyncData, long id2) {
        this._asyncData = asyncData;
        this._id = Long.valueOf(id2);
    }
}
