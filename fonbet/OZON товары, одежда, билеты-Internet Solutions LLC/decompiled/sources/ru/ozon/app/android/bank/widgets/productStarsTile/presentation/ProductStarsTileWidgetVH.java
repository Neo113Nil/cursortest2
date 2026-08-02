package ru.ozon.app.android.bank.widgets.productStarsTile.presentation;

import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.C4005g;
import Sc.InterfaceC4003e;
import Sc.s;
import W10.c;
import WZ.t;
import Wc.a;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileVO;", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileView;", "containerView", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileWidgetViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileView;Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileWidgetViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "extractProductId", "(Ljava/lang/String;)Ljava/lang/String;", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileView;", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileWidgetViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductStarsTileWidgetVH extends k<ProductStarsTileVO> {

    @NotNull
    private final ProductStarsTileView containerView;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final ProductStarsTileWidgetViewModel viewModel;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetVH$1", f = "ProductStarsTileWidgetVH.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetVH$1$1, reason: invalid class name and collision with other inner class name */
        /* synthetic */ class C17341 implements InterfaceC2397i, InterfaceC7732n {
            final /* synthetic */ ProductStarsTileView $tmp0;

            C17341(ProductStarsTileView productStarsTileView) {
                this.$tmp0 = productStarsTileView;
            }

            @Override // Ae.InterfaceC2397i
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return emit((String) obj, (d<? super Unit>) dVar);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                    return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC7732n
            public final InterfaceC4003e<?> getFunctionDelegate() {
                return new C7719a(2, this.$tmp0, ProductStarsTileView.class, "updateUserStars", "updateUserStars(Ljava/lang/String;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(String str, d<? super Unit> dVar) {
                Object invokeSuspend$updateUserStars = AnonymousClass1.invokeSuspend$updateUserStars(this.$tmp0, str, dVar);
                return invokeSuspend$updateUserStars == a.COROUTINE_SUSPENDED ? invokeSuspend$updateUserStars : Unit.f71690a;
            }
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$updateUserStars(ProductStarsTileView productStarsTileView, String str, d dVar) {
            productStarsTileView.updateUserStars(str);
            return Unit.f71690a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ProductStarsTileWidgetVH.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                x0<String> countItem = ProductStarsTileWidgetVH.this.viewModel.getCountItem();
                C17341 c17341 = new C17341(ProductStarsTileWidgetVH.this.containerView);
                this.label = 1;
                if (countItem.collect(c17341, this) == aVar) {
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
    public ProductStarsTileWidgetVH(@NotNull ProductStarsTileView containerView, @NotNull ProductStarsTileWidgetViewModel viewModel, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.ref = ref;
        C10727i.c(K.a(this), null, null, new AnonymousClass1(null), 3);
    }

    private final String extractProductId(String str) {
        MatchResult b11 = new Regex("product_id=(\\d+)").b(0, str);
        if (b11 != null) {
            return (String) C7714v.Q(1, b11.c());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductStarsTileVO item, @NotNull l20.d info) {
        String c11;
        String extractProductId;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        T00.a b11 = info.b();
        if (b11 != null && (c11 = b11.c()) != null && (extractProductId = extractProductId(c11)) != null) {
            this.viewModel.setProductId(extractProductId);
        }
        this.containerView.bind(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProductStarsTileVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
