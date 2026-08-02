package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.drawable.GradientDrawable;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetWholesaleBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.adapter.WholeSaleAdapter;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.adapter.WholeSaleDiffUtil;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 62\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00016B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010!\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J#\u0010*\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010)\u001a\u00060'j\u0002`(H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetWholesaleBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/fresh/unsorted/databinding/WidgetWholesaleBinding;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel;)V", "", "", "params", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "addToCartAction", "(Ljava/util/Map;Ljava/util/Map;)V", "backgroundColor", "", "radius", "constructLayout", "(Ljava/lang/String;Ljava/lang/Integer;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetWholesaleBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/adapter/WholeSaleAdapter;", "adapter", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/adapter/WholeSaleAdapter;", "Landroid/graphics/drawable/GradientDrawable;", "layoutShape", "Landroid/graphics/drawable/GradientDrawable;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WholeSaleViewHolder extends k<WholeSaleVO> {

    @NotNull
    private final WholeSaleAdapter adapter;

    @NotNull
    private final WidgetWholesaleBinding binding;

    @NotNull
    private final GradientDrawable layoutShape;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final WholeSaleViewModel viewModel;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WholeSaleViewHolder(@NotNull WidgetWholesaleBinding binding, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull WholeSaleViewModel viewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        RecyclerView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        WholeSaleAdapter wholeSaleAdapter = new WholeSaleAdapter(new WholeSaleViewHolder$adapter$1(this), new WholeSaleDiffUtil(), this);
        this.adapter = wholeSaleAdapter;
        this.layoutShape = new GradientDrawable();
        binding.wholesaleList.setAdapter(wholeSaleAdapter);
        binding.wholesaleList.setRecycledViewPool(refs.getComposerViewPoolProvider().getViewPool());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addToCartAction(Map<String, String> params, Map<String, TokenizedTrackingInfo> trackingInfo) {
        String str = params.get("sku");
        Long valueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        String str2 = params.get("quantity");
        Integer valueOf2 = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
        String str3 = params.get("selectedDeliverySchema");
        Long valueOf3 = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
        if (valueOf == null || valueOf2 == null) {
            return;
        }
        WholeSaleViewModel wholeSaleViewModel = this.viewModel;
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        WholeSaleVO boundedData = getBoundedData();
        wholeSaleViewModel.addToCart(new CartItemParams(longValue, intValue, valueOf3, trackingInfo, boundedData != null ? Long.valueOf(boundedData.getId()) : null));
    }

    private final void constructLayout(String backgroundColor, Integer radius) {
        this.layoutShape.setCornerRadius(radius != null ? ResourceExtKt.toPxF(radius.intValue()) : 0.0f);
        this.layoutShape.setColor(StyleParser.INSTANCE.parseColor(getContext(), backgroundColor, R$color.bg_secondary));
        this.binding.wholesaleList.setBackground(this.layoutShape);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        this.viewModel.getActions().observe(this, new WholeSaleViewHolder$sam$androidx_lifecycle_Observer$0(new WholeSaleViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull WholeSaleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        constructLayout(item.getBackground(), item.getRadius());
        this.adapter.submitList(item.getCells());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull WholeSaleVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((WholeSaleViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
