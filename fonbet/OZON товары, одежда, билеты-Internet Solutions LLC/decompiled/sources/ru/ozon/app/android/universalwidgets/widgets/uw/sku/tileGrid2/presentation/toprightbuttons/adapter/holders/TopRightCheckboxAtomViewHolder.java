package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.holders;

import android.content.Context;
import android.graphics.Rect;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.decoration.OffsetsItemDecoration;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightCheckboxAtomViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/decoration/OffsetsItemDecoration$OffsetsAwareItem;", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "checkboxView", "<init>", "(Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;)V", "Landroid/graphics/Rect;", "createDecorationOffset", "()Landroid/graphics/Rect;", "", "onRecycle", "()V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;", "item", "Lkotlin/Function1;", "onCheckboxClick", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "outRect", "Landroid/graphics/Rect;", "getOutRect", "setOutRect", "(Landroid/graphics/Rect;)V", "boundData", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRightCheckboxAtomViewHolder extends j implements OffsetsItemDecoration.OffsetsAwareItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private TileGrid2CheckBoxVO boundData;

    @NotNull
    private final CheckBoxView checkboxView;

    @NotNull
    private Rect outRect;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightCheckboxAtomViewHolder$Companion;", "", "<init>", "()V", "LAYOUT_ID", "", "CHECKBOX_LOCATOR", "", "create", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/holders/TopRightCheckboxAtomViewHolder;", "context", "Landroid/content/Context;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TopRightCheckboxAtomViewHolder create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new TopRightCheckboxAtomViewHolder(new CheckBoxView(context, null, 0, 6, null), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TopRightCheckboxAtomViewHolder(CheckBoxView checkBoxView, DefaultConstructorMarker defaultConstructorMarker) {
        this(checkBoxView);
    }

    private final Rect createDecorationOffset() {
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        int topRightBtnsWidth = (tileGrid2Constants.getTopRightBtnsWidth() - tileGrid2Constants.getTopRightBtnsCheckboxAtomSize()) / 2;
        if (topRightBtnsWidth < 0) {
            topRightBtnsWidth = 0;
        }
        return new Rect(topRightBtnsWidth, tileGrid2Constants.getTopRightBtnsToggleVerticalMargin(), topRightBtnsWidth, tileGrid2Constants.getTopRightBtnsToggleVerticalMargin());
    }

    public final void bind(@NotNull TileGrid2CheckBoxVO item, @NotNull Function1<? super TileGrid2CheckBoxVO, Unit> onCheckboxClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onCheckboxClick, "onCheckboxClick");
        this.boundData = item;
        this.checkboxView.setOnStateChangeListener(new TopRightCheckboxAtomViewHolder$bind$1(onCheckboxClick, item));
        CheckBoxHolderKt.bindOrGone$default(this.checkboxView, item.getAtomDTO(), null, 2, null);
        this.checkboxView.setLocatorTag("checkbox " + (item.getAtomDTO().getStatus() == CheckBoxDTO.CheckboxStatus.SELECTED));
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.decoration.OffsetsItemDecoration.OffsetsAwareItem
    @NotNull
    public Rect getOutRect() {
        return this.outRect;
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.checkboxView.setOnStateChangeListener(null);
    }

    private TopRightCheckboxAtomViewHolder(CheckBoxView checkBoxView) {
        super(checkBoxView);
        this.checkboxView = checkBoxView;
        this.outRect = createDecorationOffset();
    }
}
