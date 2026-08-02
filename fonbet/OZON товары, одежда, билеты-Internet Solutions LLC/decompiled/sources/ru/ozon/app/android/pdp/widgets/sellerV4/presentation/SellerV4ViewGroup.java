package ru.ozon.app.android.pdp.widgets.sellerV4.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.scrollable.ScrollableAdapter;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.scrollable.ScrollableDecoration;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010.R.\u00101\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4ViewGroup;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/utils/DPS;", "Landroid/content/Context;", "context", "", "canAppendScrollableView", "canAppendWriteSellerView", "<init>", "(Landroid/content/Context;ZZ)V", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "scrollableButtons", "", "bindScrollable", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView;", "createScrollableView", "()Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/controls/button/ButtonView;", "createButtonView", "()Lru/ozon/uni/android/controls/button/ButtonView;", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "setViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4VO;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "Landroid/content/Context;", "Z", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "sellerDisclosureView", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "getSellerDisclosureView", "()Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "buttonView", "Lru/ozon/uni/android/controls/button/ButtonView;", "scrollableView", "Landroidx/recyclerview/widget/RecyclerView;", "getScrollableView", "setScrollableView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/scrollable/ScrollableAdapter;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "scrollableAdapter", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/scrollable/ScrollableAdapter;", "getScrollableAdapter", "()Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/scrollable/ScrollableAdapter;", "setScrollableAdapter", "(Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/scrollable/ScrollableAdapter;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class SellerV4ViewGroup extends LinearLayout implements DPS {
    private ButtonView buttonView;
    private final boolean canAppendScrollableView;
    private final boolean canAppendWriteSellerView;

    @NotNull
    private final Context context;
    private ScrollableAdapter scrollableAdapter;
    private RecyclerView scrollableView;

    @NotNull
    private final DisclosureIconTitleSubtitleCellView sellerDisclosureView;

    public /* synthetic */ SellerV4ViewGroup(Context context, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12);
    }

    private final void bindScrollable(List<ButtonDTO> scrollableButtons) {
        ScrollableAdapter scrollableAdapter;
        List<ButtonDTO> list = scrollableButtons;
        boolean z11 = list == null || list.isEmpty();
        boolean z12 = !z11;
        RecyclerView recyclerView = this.scrollableView;
        if (recyclerView != null) {
            ViewExtKt.showOrGone(recyclerView, Boolean.valueOf(z12));
        }
        if (z11 || (scrollableAdapter = this.scrollableAdapter) == null) {
            return;
        }
        scrollableAdapter.submitList(scrollableButtons);
    }

    private final ButtonView createButtonView() {
        if (!this.canAppendWriteSellerView) {
            return null;
        }
        ButtonView buttonView = new ButtonView(this.context, null, 0, 0, 14, null);
        buttonView.setId(R$id.writeSellerBtn);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(getDp16(), getDp8(), getDp16(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        buttonView.setLayoutParams(layoutParams);
        return buttonView;
    }

    private final RecyclerView createScrollableView() {
        if (!this.canAppendScrollableView) {
            return null;
        }
        RecyclerView recyclerView = new RecyclerView(this.context);
        recyclerView.setId(R$id.scrollableRv);
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, getDp8(), ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new ScrollableDecoration());
        return recyclerView;
    }

    public final Unit bind(@NotNull SellerV4VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setBackgroundColor(StyleParser.INSTANCE.parseColor(this.context, item.getBackgroundColor(), R$color.layer_floor_1));
        if (this.scrollableView != null) {
            bindScrollable(item.getScrollableButtons());
        }
        ButtonView buttonView = this.buttonView;
        if (buttonView == null) {
            return null;
        }
        ButtonHolderKt.bindOrGone(buttonView, item.getActionButton(), actionHandler);
        return Unit.f71690a;
    }

    public int getDp16() {
        return DPS.DefaultImpls.getDp16(this);
    }

    public int getDp8() {
        return DPS.DefaultImpls.getDp8(this);
    }

    public final RecyclerView getScrollableView() {
        return this.scrollableView;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleCellView getSellerDisclosureView() {
        return this.sellerDisclosureView;
    }

    public final void setScrollableAdapter(ScrollableAdapter scrollableAdapter) {
        RecyclerView recyclerView = this.scrollableView;
        if (recyclerView != null) {
            recyclerView.setAdapter(scrollableAdapter);
        }
        this.scrollableAdapter = scrollableAdapter;
    }

    public final void setViewPool(RecyclerView.u recycledViewPool) {
        RecyclerView recyclerView = this.scrollableView;
        if (recyclerView != null) {
            recyclerView.setRecycledViewPool(recycledViewPool);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerV4ViewGroup(@NotNull Context context, boolean z11, boolean z12) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.canAppendScrollableView = z11;
        this.canAppendWriteSellerView = z12;
        setOrientation(1);
        ViewExtKt.updatePadding$default(this, 0, getDp16(), 0, getDp16(), 5, null);
        DisclosureIconTitleSubtitleCellView createSellerDisclosureView = SellerV4DisclosureViewFactory.INSTANCE.createSellerDisclosureView(context);
        this.sellerDisclosureView = createSellerDisclosureView;
        this.scrollableView = createScrollableView();
        this.buttonView = createButtonView();
        addView(createSellerDisclosureView);
        View view = this.scrollableView;
        if (view != null) {
            addView(view);
        }
        View view2 = this.buttonView;
        if (view2 != null) {
            addView(view2);
        }
    }
}
