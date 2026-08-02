package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.HotelsOrderRoomsDetailsVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.adapter.HotelsOrderRoomsDetailsCellListAdapter;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/view/HotelsOrderRoomsDetailsItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "updateTitleMargin", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/HotelsOrderRoomsDetailsVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsCellListAdapter;", "cellBlocksAdapter", "setupCellBlocksRecyclerView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsCellListAdapter;)V", "", "dp2", "I", "dp8", "dp16", "adapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/presentation/adapter/HotelsOrderRoomsDetailsCellListAdapter;", "Lru/ozon/uni/android/atom/image/Image;", "image", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroidx/recyclerview/widget/RecyclerView;", "cellBlocksRV", "Landroidx/recyclerview/widget/RecyclerView;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsOrderRoomsDetailsItemView extends LinearLayout {
    private HotelsOrderRoomsDetailsCellListAdapter adapter;

    @NotNull
    private final BadgeView badge;

    @NotNull
    private final RecyclerView cellBlocksRV;
    private final int dp16;
    private final int dp2;
    private final int dp8;

    @NotNull
    private final Image image;

    @NotNull
    private final TextAtomV2View title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsOrderRoomsDetailsItemView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        q qVar = q.f64554a;
        Image image = (Image) qVar.i(N.b(Image.class), context);
        if (image == null) {
            context2 = context;
            image = new Image(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(px, px, px, px);
        image.setLayoutParams(layoutParams);
        addView(image);
        this.image = image;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(px3, px2, px3, 0);
        textAtomV2View.setLayoutParams(layoutParams2);
        addView(g10);
        this.title = textAtomV2View;
        View g11 = qVar.g(N.b(BadgeView.class), context2);
        BadgeView badgeView = (BadgeView) g11;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(px3, px2, px3, 0);
        badgeView.setLayoutParams(layoutParams3);
        addView(g11);
        this.badge = badgeView;
        RecyclerView recyclerView = new RecyclerView(context2);
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(0, px2, 0, 0);
        recyclerView.setLayoutParams(layoutParams4);
        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 1, false));
        setOrientation(1);
        addView(recyclerView);
        this.cellBlocksRV = recyclerView;
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context2, R$attr.layerFloor1), ResourceExtKt.toPxF(24, context2)));
    }

    private final void updateTitleMargin() {
        if (this.image.getVisibility() == 8) {
            ViewExtensionsKt.safeUpdateMargins$default(this.title, Integer.valueOf(this.dp16), null, null, null, 14, null);
        } else {
            ViewExtensionsKt.safeUpdateMargins$default(this.title, Integer.valueOf(this.dp8), null, null, null, 14, null);
        }
    }

    public final void bind(@NotNull HotelsOrderRoomsDetailsVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageHolderKt.bindOrGone$default(this.image, item.getImage(), null, 2, null);
        updateTitleMargin();
        TextHolderKt.bind$default(this.title, item.getTitle(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.badge, item.getBadge(), onAction);
        HotelsOrderRoomsDetailsCellListAdapter hotelsOrderRoomsDetailsCellListAdapter = this.adapter;
        if (hotelsOrderRoomsDetailsCellListAdapter != null) {
            hotelsOrderRoomsDetailsCellListAdapter.submitList(item.getCellBlocks());
        }
    }

    public final void setupCellBlocksRecyclerView(@NotNull HotelsOrderRoomsDetailsCellListAdapter cellBlocksAdapter) {
        Intrinsics.checkNotNullParameter(cellBlocksAdapter, "cellBlocksAdapter");
        this.adapter = cellBlocksAdapter;
        this.cellBlocksRV.setAdapter(cellBlocksAdapter);
        this.cellBlocksRV.setItemAnimator(null);
    }
}
