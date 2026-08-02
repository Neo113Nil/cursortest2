package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import Ge.f;
import Sc.s;
import WZ.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.AbstractC7094b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import xe.C10727i;
import xe.E0;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "atom", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "inCart", "", "widgetId", "", "onAddToCart", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", "unbind", "()V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "view", "selectedAtom", "LWZ/l;", "analytics", "bindOrGone", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;LWZ/l;Ljava/lang/Long;)V", "bind", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lxe/M;", "scope", "Lxe/M;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryV2ProductContainerButtonBinder {

    @NotNull
    private final CartService cartService;

    @NotNull
    private final M scope;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder$Companion;", "", "<init>", "()V", "ID", "", "QUANTITY", "SELECTED_DELIVERY_SCHEMA", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReviewGalleryV2ProductContainerButtonBinder(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
        this.scope = N.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(2:18|(2:43|44)(8:22|(1:42)(1:28)|29|(1:41)(1:33)|34|(1:36)(1:40)|37|(1:39)))|11|12|13))|47|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        Lm0.a.f17149a.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onAddToCart(IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, boolean z11, Long l11, d<? super Unit> dVar) {
        ReviewGalleryV2ProductContainerButtonBinder$onAddToCart$1 reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1;
        int i11;
        String str;
        String str2;
        String str3;
        Float v02;
        if (dVar instanceof ReviewGalleryV2ProductContainerButtonBinder$onAddToCart$1) {
            reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1 = (ReviewGalleryV2ProductContainerButtonBinder$onAddToCart$1) dVar;
            int i12 = reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Map<String, String> params = atomActionDTO.getParams();
                    if (params == null || (str = params.get("id")) == null) {
                        return Unit.f71690a;
                    }
                    Map<String, String> params2 = atomActionDTO.getParams();
                    int floatValue = (params2 == null || (str3 = params2.get("quantity")) == null || (v02 = h.v0(str3)) == null) ? 1 : (int) v02.floatValue();
                    Map<String, String> params3 = atomActionDTO.getParams();
                    Long y02 = (params3 == null || (str2 = params3.get("selectedDeliverySchema")) == null) ? null : h.y0(str2);
                    AbstractC7094b addProductToCart$default = !z11 ? CartService.DefaultImpls.addProductToCart$default(this.cartService, str, floatValue, y02, iconButtonV3DTO.getTrackingInfo(), l11, null, null, null, null, atomActionDTO.getParams(), 480, null) : CartService.DefaultImpls.removeProductFromCart$default(this.cartService, str, floatValue, y02, iconButtonV3DTO.getTrackingInfo(), l11, null, atomActionDTO.getParams(), 32, null);
                    reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1.label = 1;
                    if (f.a(addProductToCart$default, reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1) == aVar) {
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
        reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1 = new ReviewGalleryV2ProductContainerButtonBinder$onAddToCart$1(this, dVar);
        Object obj2 = reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = reviewGalleryV2ProductContainerButtonBinder$onAddToCart$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public final void bind(@NotNull IconButtonV3View view, @NotNull IconButtonV3DTO atom, IconButtonV3DTO selectedAtom, @NotNull l analytics, Long widgetId) {
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        Long y02;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        CommonControlSettings common = atom.getCommon();
        if (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("id")) == null || (y02 = h.y0(str)) == null) {
            return;
        }
        long longValue = y02.longValue();
        this.cartService.attach(analytics);
        C10727i.c(this.scope, null, null, new ReviewGalleryV2ProductContainerButtonBinder$bind$1(this, longValue, selectedAtom, atom, view, widgetId, null), 3);
    }

    public final void bindOrGone(@NotNull IconButtonV3View view, IconButtonV3DTO atom, IconButtonV3DTO selectedAtom, @NotNull l analytics, Long widgetId) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        if (atom == null) {
            ViewExtKt.gone(view);
        } else {
            ViewExtKt.show(view);
            bind(view, atom, selectedAtom, analytics, widgetId);
        }
    }

    public final void unbind() {
        E0.d(this.scope.getCoroutineContext());
    }
}
