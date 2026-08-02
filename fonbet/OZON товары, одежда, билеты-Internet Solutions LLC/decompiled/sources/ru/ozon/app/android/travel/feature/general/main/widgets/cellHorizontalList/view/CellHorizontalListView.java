package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.view;

import Am.C2438a;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListVI;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.view.cells.CellHorizontalListItemsAdapter;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.view.cells.CellHorizontalListItemsDecoration;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsExtKt;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0014\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0007J\u0010\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\tJ\u0010\u0010)\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/CellHorizontalListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cachedSettings", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "cachedCellsAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/cells/CellHorizontalListItemsAdapter;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "cellsDecoration", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/cells/CellHorizontalListItemsDecoration;", "cellsRV", "Landroidx/recyclerview/widget/RecyclerView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;", "bindTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindCells", "cells", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellVO;", "bindCellGap", "cellGap", "", "bindSettings", "settings", "bindCellSettings", "cellSettings", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;", "setupCellsRecyclerView", "cellsAdapter", "updatePaddings", "setupRoot", "addViews", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHorizontalListView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(CellHorizontalListView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private CellHorizontalListItemsAdapter cachedCellsAdapter;
    private TravelWidgetSettingsVO cachedSettings;

    @NotNull
    private final CellHorizontalListItemsDecoration cellsDecoration;

    @NotNull
    private final RecyclerView cellsRV;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellHorizontalListView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new CellHorizontalListView$special$$inlined$preCreationViewPool$default$1(this), new CellHorizontalListView$special$$inlined$preCreationViewPool$default$2());
        CellHorizontalListItemsDecoration cellHorizontalListItemsDecoration = new CellHorizontalListItemsDecoration();
        this.cellsDecoration = cellHorizontalListItemsDecoration;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        recyclerView.addItemDecoration(cellHorizontalListItemsDecoration);
        this.cellsRV = recyclerView;
        setupRoot();
        addViews();
    }

    private final void addViews() {
        addView(getTitleTAV());
        addView(this.cellsRV);
    }

    private final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupRoot() {
        setOrientation(1);
    }

    private final void updatePaddings(TravelWidgetSettingsVO settings) {
        TravelWidgetSettingsVO.PaddingsVO paddings = settings.getPaddings();
        setPadding(0, paddings.getTopPadding(), 0, paddings.getBottomPadding());
        TextAtomV2View titleTAV = getTitleTAV();
        ViewGroup.LayoutParams layoutParams = titleTAV.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = paddings.getLeftPadding();
        marginLayoutParams.rightMargin = paddings.getRightPadding();
        titleTAV.setLayoutParams(marginLayoutParams);
        this.cellsRV.setPadding(paddings.getLeftPadding(), 0, paddings.getRightPadding(), 0);
    }

    public final void bind(@NotNull CellHorizontalListVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindTitle(item.getTitle());
        bindCells(item.getCells());
        bindCellGap(item.getCellGap());
        bindSettings(item.getSettings());
        bindCellSettings(item.getCellSettings());
    }

    public final void bindCellGap(int cellGap) {
        this.cellsDecoration.updateCellGap(cellGap);
    }

    public final void bindCellSettings(CellHorizontalListVI.CellSettingsVO cellSettings) {
        CellHorizontalListItemsAdapter cellHorizontalListItemsAdapter = this.cachedCellsAdapter;
        if (cellHorizontalListItemsAdapter != null) {
            cellHorizontalListItemsAdapter.updateCellSettings(cellSettings);
        }
    }

    public final void bindCells(@NotNull List<CellHorizontalListVI.CellVO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        CellHorizontalListItemsAdapter cellHorizontalListItemsAdapter = this.cachedCellsAdapter;
        if (cellHorizontalListItemsAdapter != null) {
            cellHorizontalListItemsAdapter.submitList(cells);
        }
    }

    public final void bindSettings(TravelWidgetSettingsVO settings) {
        if (settings == null || Intrinsics.d(this.cachedSettings, settings)) {
            return;
        }
        TravelWidgetSettingsExtKt.safeUpdateBackground$default(this, settings, this.cachedSettings, 0, 4, null);
        updatePaddings(settings);
        this.cachedSettings = settings;
    }

    public final void bindTitle(TextDTO title) {
        TextHolderKt.bindOrGone$default(getTitleTAV(), title, null, 2, null);
    }

    public final void setupCellsRecyclerView(@NotNull CellHorizontalListItemsAdapter cellsAdapter) {
        Intrinsics.checkNotNullParameter(cellsAdapter, "cellsAdapter");
        this.cellsRV.setAdapter(cellsAdapter);
        this.cachedCellsAdapter = cellsAdapter;
    }
}
