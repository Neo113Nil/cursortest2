package ru.ozon.app.android.cart.domain.network;

import Bc.r;
import Bc.s;
import Sc.v;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qc.o;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cart.common.data.SummaryV2Response;
import ru.ozon.app.android.cart.domain.data.CartDomainApi;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0086\u0001\u0012<\b\u0001\u00128\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0001 \u0007*\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0001\u0018\u00010\u00040\u0004 \u0007*B\u0012<\b\u0001\u00128\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0001 \u0007*\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0001\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lru/ozon/app/android/cart/domain/network/CartUpdateRequest;", "Lkotlin/jvm/internal/EnhancedNullability;", "request", "Lio/reactivex/C;", "LSc/v;", "", "Lru/ozon/app/android/cart/common/data/SummaryV2Response;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/domain/network/CartUpdateRequest;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CartSyncService$executeCartUpdateRequests$1 extends AbstractC7737t implements Function1<CartUpdateRequest, C<? extends v<? extends Long, ? extends Long, ? extends SummaryV2Response>>> {
    final /* synthetic */ CartSyncService this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/common/data/SummaryV2Response;", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.domain.network.CartSyncService$executeCartUpdateRequests$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ActionV2Response<SummaryV2Response>, SummaryV2Response> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SummaryV2Response invoke(ActionV2Response<SummaryV2Response> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getData();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\b\u001a8\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0001 \u0005*\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0001\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/cart/common/data/SummaryV2Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "responseData", "LSc/v;", "", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/data/SummaryV2Response;)LSc/v;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.domain.network.CartSyncService$executeCartUpdateRequests$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<SummaryV2Response, v<? extends Long, ? extends Long, ? extends SummaryV2Response>> {
        final /* synthetic */ CartUpdateRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CartUpdateRequest cartUpdateRequest) {
            super(1);
            this.$request = cartUpdateRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        public final v<Long, Long, SummaryV2Response> invoke(SummaryV2Response responseData) {
            Intrinsics.checkNotNullParameter(responseData, "responseData");
            return new v<>(Long.valueOf(this.$request.getVersionCart()), Long.valueOf(this.$request.getVersionFamilyCart()), responseData);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0086\u0001\u0012<\b\u0001\u00128\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0001 \u0007*\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0001\u0018\u00010\u00040\u0004 \u0007*B\u0012<\b\u0001\u00128\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0001 \u0007*\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0001\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "LSc/v;", "", "Lru/ozon/app/android/cart/common/data/SummaryV2Response;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.domain.network.CartSyncService$executeCartUpdateRequests$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Throwable, C<? extends v<? extends Long, ? extends Long, ? extends SummaryV2Response>>> {
        final /* synthetic */ CartSyncService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(CartSyncService cartSyncService) {
            super(1);
            this.this$0 = cartSyncService;
        }

        @Override // kotlin.jvm.functions.Function1
        public final C<? extends v<Long, Long, SummaryV2Response>> invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.this$0.handleError(it);
            return s.f3440a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSyncService$executeCartUpdateRequests$1(CartSyncService cartSyncService) {
        super(1);
        this.this$0 = cartSyncService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SummaryV2Response invoke$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (SummaryV2Response) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v invoke$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (v) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C invoke$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends v<Long, Long, SummaryV2Response>> invoke(CartUpdateRequest request) {
        CartDomainApi cartDomainApi;
        Intrinsics.checkNotNullParameter(request, "request");
        cartDomainApi = this.this$0.cartApi;
        y<ActionV2Response<SummaryV2Response>> cartsV2 = cartDomainApi.getCartsV2(request.getMiniApp());
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        o oVar = new o() { // from class: ru.ozon.app.android.cart.domain.network.a
            @Override // qc.o
            public final Object apply(Object obj) {
                SummaryV2Response invoke$lambda$0;
                invoke$lambda$0 = CartSyncService$executeCartUpdateRequests$1.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        };
        cartsV2.getClass();
        r rVar = new r(cartsV2, oVar);
        final AnonymousClass2 anonymousClass2 = new AnonymousClass2(request);
        r rVar2 = new r(rVar, new o() { // from class: ru.ozon.app.android.cart.domain.network.b
            @Override // qc.o
            public final Object apply(Object obj) {
                v invoke$lambda$1;
                invoke$lambda$1 = CartSyncService$executeCartUpdateRequests$1.invoke$lambda$1(Function1.this, obj);
                return invoke$lambda$1;
            }
        });
        final AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0);
        return new Bc.v(rVar2, new o() { // from class: ru.ozon.app.android.cart.domain.network.c
            @Override // qc.o
            public final Object apply(Object obj) {
                C invoke$lambda$2;
                invoke$lambda$2 = CartSyncService$executeCartUpdateRequests$1.invoke$lambda$2(Function1.this, obj);
                return invoke$lambda$2;
            }
        });
    }
}
