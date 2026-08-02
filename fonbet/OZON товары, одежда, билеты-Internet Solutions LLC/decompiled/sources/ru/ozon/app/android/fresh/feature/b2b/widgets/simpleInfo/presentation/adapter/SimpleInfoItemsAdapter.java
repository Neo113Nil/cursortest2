package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data.SimpleInfoDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data.SimpleInfoImageDTO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u00172\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\u0017B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00062\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/SimpleInfoItemsAdapter;", "Landroidx/recyclerview/widget/t;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ItemViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SimpleInfoItemsAdapter extends t<Object, ItemViewHolder<?>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/SimpleInfoItemsAdapter$Companion;", "", "<init>", "()V", "TYPE_BUTTON", "", "TYPE_DISCLOSURE_TITLE_SUBTITLE_CELL", "TYPE_IMAGE", "TYPE_IMAGE_FIXED", "TYPE_SPACE", "TYPE_TEXT", "TYPE_BUTTON_V3", "TYPE_CELL", "TYPE_CELL_LIST", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleInfoItemsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new SimpleInfoDiffItemCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        Object item = getItem(position);
        if (item instanceof ButtonDTO) {
            return 1;
        }
        if (item instanceof DisclosureTitleSubtitleCellDTO) {
            return 2;
        }
        if (item instanceof ImageDTO) {
            return 4;
        }
        if (item instanceof SimpleInfoImageDTO) {
            return 3;
        }
        if (item instanceof TextDTO) {
            return 6;
        }
        if (item instanceof SimpleInfoDTO.SpaceDTO) {
            return 5;
        }
        if (item instanceof ButtonV3DTO) {
            return 7;
        }
        if (item instanceof CellDTO) {
            return 8;
        }
        return item instanceof SimpleInfoDTO.CellListDTO ? 9 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemViewHolder<?> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object item = getItem(position);
        if (holder instanceof ButtonItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.controls.button.ButtonDTO");
            ((ButtonItemViewHolder) holder).bind((ButtonDTO) item);
            return;
        }
        if (holder instanceof DisclosureTitleSubtitleCellViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO");
            ((DisclosureTitleSubtitleCellViewHolder) holder).bind((DisclosureTitleSubtitleCellDTO) item);
            return;
        }
        if (holder instanceof ImageItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data.SimpleInfoImageDTO");
            ((ImageItemViewHolder) holder).bind((SimpleInfoImageDTO) item);
            return;
        }
        if (holder instanceof ImageFixedItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.image.ImageDTO");
            ((ImageFixedItemViewHolder) holder).bind((ImageDTO) item);
            return;
        }
        if (holder instanceof SpaceItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data.SimpleInfoDTO.SpaceDTO");
            ((SpaceItemViewHolder) holder).bind((SimpleInfoDTO.SpaceDTO) item);
            return;
        }
        if (holder instanceof TextItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.text.TextDTO");
            ((TextItemViewHolder) holder).bind((TextDTO) item);
            return;
        }
        if (holder instanceof ButtonV3ItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO");
            ((ButtonV3ItemViewHolder) holder).bind((ButtonV3DTO) item);
        } else if (holder instanceof CellItemViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.dsCell.CellDTO");
            ((CellItemViewHolder) holder).bind((CellDTO) item);
        } else if (holder instanceof CellListViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data.SimpleInfoDTO.CellListDTO");
            ((CellListViewHolder) holder).bind((SimpleInfoDTO.CellListDTO) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemViewHolder<?> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        switch (viewType) {
            case 1:
                Intrinsics.f(context);
                ButtonView buttonView = new ButtonView(context, null, 0, 0, 14, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                Dimens dimens = Dimens.INSTANCE;
                marginLayoutParams.setMarginStart(dimens.getDP_16());
                marginLayoutParams.setMarginEnd(dimens.getDP_16());
                buttonView.setLayoutParams(marginLayoutParams);
                return new ButtonItemViewHolder(buttonView, this.actionHandler);
            case 2:
                Intrinsics.f(context);
                DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView = new DisclosureTitleSubtitleCellView(context, null, 0, 0, null, false, 62, null);
                disclosureTitleSubtitleCellView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                return new DisclosureTitleSubtitleCellViewHolder(disclosureTitleSubtitleCellView, this.actionHandler);
            case 3:
                Intrinsics.f(context);
                Image image = new Image(context, null, 0, 6, null);
                image.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                return new ImageItemViewHolder(image, this.actionHandler);
            case 4:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                Intrinsics.f(context);
                Image image2 = new Image(context, null, 0, 6, null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                image2.setLayoutParams(layoutParams);
                frameLayout.addView(image2);
                return new ImageFixedItemViewHolder(image2, this.actionHandler, frameLayout);
            case 5:
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                return new SpaceItemViewHolder(frameLayout2);
            case 6:
                Intrinsics.f(context);
                TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
                textAtomV2View.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                return new TextItemViewHolder(textAtomV2View, this.actionHandler);
            case 7:
                Intrinsics.f(context);
                ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                Dimens dimens2 = Dimens.INSTANCE;
                marginLayoutParams2.setMarginStart(dimens2.getDP_16());
                marginLayoutParams2.setMarginEnd(dimens2.getDP_16());
                buttonV3View.setLayoutParams(marginLayoutParams2);
                return new ButtonV3ItemViewHolder(buttonV3View, this.actionHandler);
            case 8:
                Intrinsics.f(context);
                CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
                cellView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                return new CellItemViewHolder(cellView, this.actionHandler);
            case 9:
                RecyclerView recyclerView = new RecyclerView(context);
                recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                recyclerView.setNestedScrollingEnabled(false);
                return new CellListViewHolder(recyclerView, this.actionHandler);
            default:
                throw new IllegalStateException(("Unknown view type: " + viewType).toString());
        }
    }
}
