package ru.ozon.app.android.pdp.widgets.brand.presentation.dsCell;

import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.widgets.brand.presentation.BrandViewHolder;
import ru.ozon.app.android.pdp.widgets.brand.presentation.DsCellBrandVO;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/dsCell/DsCellBrandViewHolder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/BrandViewHolder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/DsCellBrandVO;", "Lru/ozon/uni/android/cell/CellView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;LWZ/l;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/brand/presentation/DsCellBrandVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/pdp/widgets/brand/presentation/dsCell/DsCellBrandBinder;", "binder", "Lru/ozon/app/android/pdp/widgets/brand/presentation/dsCell/DsCellBrandBinder;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DsCellBrandViewHolder extends BrandViewHolder<DsCellBrandVO> {

    @NotNull
    private final DsCellBrandBinder binder;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/dsCell/DsCellBrandViewHolder$Companion;", "", "<init>", "()V", "createView", "Lru/ozon/uni/android/cell/CellView;", "context", "Landroid/content/Context;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CellView createView(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            CellView cellView = (CellView) q.f64554a.i(N.b(CellView.class), context);
            if (cellView == null) {
                cellView = new CellView(context, null, 0, 0, null, 30, null);
            }
            cellView.setId(R$id.dsCellBrandCV);
            cellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return cellView;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsCellBrandViewHolder(@NotNull CellView containerView, @NotNull ComposerReferences refs, @NotNull PDPOnBoardingViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        super(containerView, refs);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        this.binder = new DsCellBrandBinder(containerView, refs, this, tokenizedAnalytics, viewModel, widgetImagePlaceholderAdapter);
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull jk0.q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DsCellBrandVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        BaseWidgetPlaceholderBinder.bind$default(this.binder, item, info, null, null, 12, null);
    }
}
