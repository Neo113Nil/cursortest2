package ru.ozon.app.android.geo.splitShortInfoWidgetKey;

import WZ.l;
import WZ.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.geo.databinding.WidgetSplitShortInfoBinding;
import ru.ozon.app.android.geo.splitShortInfoWidgetKey.data.SplitShortInfoVO;
import ru.ozon.app.android.geo.splitShortInfoWidgetKey.images.ImagesAdapter;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.recycler.RecyclerViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/splitShortInfoWidgetKey/SplitShortInfoWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO;", "Lru/ozon/app/android/geo/databinding/WidgetSplitShortInfoBinding;", "binding", "LWZ/l;", "tokenizedAnalytics", "", "isSelectApp", "<init>", "(Lru/ozon/app/android/geo/databinding/WidgetSplitShortInfoBinding;LWZ/l;Z)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO;Ll20/d;)V", "viewObject", "(Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO;)V", "Lru/ozon/app/android/geo/databinding/WidgetSplitShortInfoBinding;", "LWZ/l;", "wasAnalyticsSend", "Z", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/images/ImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/images/ImagesAdapter;", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/data/SplitShortInfoVO;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SplitShortInfoWidgetVH extends k<SplitShortInfoVO> {

    @NotNull
    private final WidgetSplitShortInfoBinding binding;

    @NotNull
    private final ImagesAdapter imagesAdapter;
    private SplitShortInfoVO item;

    @NotNull
    private final l tokenizedAnalytics;
    private boolean wasAnalyticsSend;

    public /* synthetic */ SplitShortInfoWidgetVH(WidgetSplitShortInfoBinding widgetSplitShortInfoBinding, l lVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(widgetSplitShortInfoBinding, lVar, (i11 & 4) != 0 ? false : z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplitShortInfoWidgetVH(@NotNull WidgetSplitShortInfoBinding binding, @NotNull l tokenizedAnalytics, boolean z11) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        ImagesAdapter imagesAdapter = new ImagesAdapter();
        this.imagesAdapter = imagesAdapter;
        binding.itemsRv.setAdapter(imagesAdapter);
        RecyclerView.o layoutManager = binding.itemsRv.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            RecyclerView itemsRv = binding.itemsRv;
            Intrinsics.checkNotNullExpressionValue(itemsRv, "itemsRv");
            RecyclerViewExtKt.setupSeparatorItemDecoration$default(itemsRv, getContext(), R$drawable.divider_transparent, ((LinearLayoutManager) layoutManager).getOrientation(), false, 8, null);
        }
        if (z11) {
            Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), UniColors.BG_DARK_KEY.getToken());
            binding.getConstraintLayout().setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SplitShortInfoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bind(item);
    }

    public final void bind(@NotNull SplitShortInfoVO viewObject) {
        t trackingInfo;
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        TextAtom title = viewObject.getTitle();
        SplitShortInfoVO splitShortInfoVO = this.item;
        if (!Intrinsics.d(title, splitShortInfoVO != null ? splitShortInfoVO.getTitle() : null)) {
            SingleAtom.bind$default(this.binding.titleSAL, viewObject.getTitle(), false, 2, null);
        }
        TextAtom subtitle = viewObject.getSubtitle();
        SplitShortInfoVO splitShortInfoVO2 = this.item;
        if (!Intrinsics.d(subtitle, splitShortInfoVO2 != null ? splitShortInfoVO2.getSubtitle() : null)) {
            SingleAtom.bind$default(this.binding.subtitleSAL, viewObject.getSubtitle(), false, 2, null);
        }
        List<SplitShortInfoVO.Item> items = viewObject.getItems();
        SplitShortInfoVO splitShortInfoVO3 = this.item;
        if (!Intrinsics.d(items, splitShortInfoVO3 != null ? splitShortInfoVO3.getItems() : null)) {
            this.imagesAdapter.setItems(viewObject.getItems());
        }
        if (!this.wasAnalyticsSend && (trackingInfo = viewObject.getTrackingInfo()) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
            this.wasAnalyticsSend = true;
        }
        this.item = viewObject;
    }
}
