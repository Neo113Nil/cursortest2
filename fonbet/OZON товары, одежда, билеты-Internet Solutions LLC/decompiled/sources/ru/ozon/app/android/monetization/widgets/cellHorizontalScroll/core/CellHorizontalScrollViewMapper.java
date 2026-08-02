package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.monetization.flags.CellHorizontalScrollComposeFlag;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.data.CellHorizontalScrollDTO;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.di.CellHorizontalScrollComponent;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.multiCell.CellHorizontalScrollVI;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.multiCell.CellHorizontalScrollViewHolder;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/core/CellHorizontalScrollViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/CellHorizontalScrollVI;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/di/CellHorizontalScrollComponent;", "component", "<init>", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/di/CellHorizontalScrollComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;Ll20/d;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/di/CellHorizontalScrollComponent;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CellHorizontalScrollViewMapper extends g<CellHorizontalScrollDTO, CellHorizontalScrollVI> {

    @NotNull
    private final CellHorizontalScrollComponent component;

    public CellHorizontalScrollViewMapper(@NotNull CellHorizontalScrollComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof CellHorizontalScrollDTO) && ((CellHorizontalScrollDTO) state).getCells().size() > 1 && !this.component.getFeatureChecker().isEnabled(CellHorizontalScrollComposeFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<CellHorizontalScrollVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new CellHorizontalScrollViewHolder(container, (RecyclerView) view, this.component.getTokenizedAnalytics(), this.component.getActionHandlerComponentApi());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public RecyclerView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setClipToPadding(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        Dimens dimens = Dimens.INSTANCE;
        recyclerView.setPadding(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
        recyclerView.addItemDecoration(new MarginItemDecoration(dimens.getDP_8(), 0));
        return recyclerView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CellHorizontalScrollVI> map(@NotNull CellHorizontalScrollDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        List<CellDTO> cells = state.getCells();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new CellHorizontalScrollVI(hashCode, cells, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTestInfo(), null, 16, null));
    }
}
