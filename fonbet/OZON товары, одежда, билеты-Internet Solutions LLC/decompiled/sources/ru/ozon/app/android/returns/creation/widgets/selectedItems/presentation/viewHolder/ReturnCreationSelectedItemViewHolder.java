package ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewHolder;

import CG.a;
import Sc.o;
import Vg.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationSelectedItemBinding;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewHolder.ReturnCreationSelectedItemViewHolder;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewObject.Reason;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewObject.SelectedItemVO;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00102\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewHolder/ReturnCreationSelectedItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/SelectedItemVO;", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationSelectedItemBinding;", "binding", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "returnCreationEventManager", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationSelectedItemBinding;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;LVg/d;Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "updateNameTopMargin", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationSelectedItemBinding;)V", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "item", "bindCellOrReason", "(Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;)V", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "images", "bindImagesOrGone", "(Ljava/util/List;)V", "", "color", "setBackgroundColor", "(Ljava/lang/String;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/SelectedItemVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationSelectedItemBinding;", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "LVg/d;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "imagesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Landroid/view/View$OnClickListener;", "cardClickListener", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnTouchListener;", "deleteButtonTouchListener", "Landroid/view/View$OnTouchListener;", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class ReturnCreationSelectedItemViewHolder extends k<SelectedItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnCreationSelectedItemBinding binding;

    @NotNull
    private final View.OnClickListener cardClickListener;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final View.OnTouchListener deleteButtonTouchListener;

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final AtomsAdapter imagesAdapter;

    @NotNull
    private final OneTimePostRefreshHandler oneTimePostRefreshHandler;

    @NotNull
    private final ReturnCreationEventManager returnCreationEventManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int WRAPPED_MARGIN = ResourceExtKt.toPx(4);
    private static final int UNWRAPPED_MARGIN = ResourceExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewHolder/ReturnCreationSelectedItemViewHolder$Companion;", "", "<init>", "()V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReturnCreationSelectedItemViewHolder(@NotNull ReturnCreationSelectedItemBinding binding, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull d customActionHandlersStoreFactory, @NotNull ReturnCreationEventManager returnCreationEventManager, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(returnCreationEventManager, "returnCreationEventManager");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.returnCreationEventManager = returnCreationEventManager;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onPreProcess(new ReturnCreationSelectedItemViewHolder$actionHandler$1(oneTimePostRefreshHandler)).customActionHandlers(new ReturnCreationSelectedItemViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.imagesAdapter = atomsAdapter;
        a aVar = new a(this, 10);
        this.cardClickListener = aVar;
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: dH.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean deleteButtonTouchListener$lambda$1;
                deleteButtonTouchListener$lambda$1 = ReturnCreationSelectedItemViewHolder.deleteButtonTouchListener$lambda$1(ReturnCreationSelectedItemViewHolder.this, view, motionEvent);
                return deleteButtonTouchListener$lambda$1;
            }
        };
        this.deleteButtonTouchListener = onTouchListener;
        this.gradientDrawable = new GradientDrawable();
        atomsAdapter.setOnAction(buildHandler);
        binding.reasonImagesHfal.setAdapter(atomsAdapter);
        binding.getConstraintLayout().setOnClickListener(aVar);
        binding.imageIv.setOnClickListener(aVar);
        binding.pricePv.setOnClickListener(aVar);
        binding.nameTav.setOnClickListener(aVar);
        binding.descriptionTav.setOnClickListener(aVar);
        binding.validationTav.setOnClickListener(aVar);
        binding.reasonInfoContainer.setOnClickListener(aVar);
        binding.reasonTitleTav.setOnClickListener(aVar);
        binding.reasonSubtitleTav.setOnClickListener(aVar);
        binding.reasonImagesHfal.setOnClickListener(aVar);
        binding.deleteButtonIb.setOnTouchListener(onTouchListener);
    }

    private final void bindCellOrReason(Reason item) {
        ReturnCreationSelectedItemBinding returnCreationSelectedItemBinding = this.binding;
        if (item instanceof Reason.CellHolder) {
            CellView cellCv = returnCreationSelectedItemBinding.cellCv;
            Intrinsics.checkNotNullExpressionValue(cellCv, "cellCv");
            CellHolderKt.bind(cellCv, ((Reason.CellHolder) item).getCell(), this.actionHandler);
            CellView cellCv2 = returnCreationSelectedItemBinding.cellCv;
            Intrinsics.checkNotNullExpressionValue(cellCv2, "cellCv");
            ViewExtKt.show(cellCv2);
            LinearLayout reasonInfoContainer = returnCreationSelectedItemBinding.reasonInfoContainer;
            Intrinsics.checkNotNullExpressionValue(reasonInfoContainer, "reasonInfoContainer");
            ViewExtKt.gone(reasonInfoContainer);
            return;
        }
        if (!(item instanceof Reason.ReasonInfo)) {
            if (!(item instanceof Reason.None)) {
                throw new o();
            }
            CellView cellCv3 = returnCreationSelectedItemBinding.cellCv;
            Intrinsics.checkNotNullExpressionValue(cellCv3, "cellCv");
            ViewExtKt.gone(cellCv3);
            LinearLayout reasonInfoContainer2 = returnCreationSelectedItemBinding.reasonInfoContainer;
            Intrinsics.checkNotNullExpressionValue(reasonInfoContainer2, "reasonInfoContainer");
            ViewExtKt.gone(reasonInfoContainer2);
            return;
        }
        TextAtomV2View reasonTitleTav = returnCreationSelectedItemBinding.reasonTitleTav;
        Intrinsics.checkNotNullExpressionValue(reasonTitleTav, "reasonTitleTav");
        Reason.ReasonInfo reasonInfo = (Reason.ReasonInfo) item;
        TextHolderKt.bind(reasonTitleTav, reasonInfo.getTitle(), this.actionHandler);
        TextAtomV2View reasonSubtitleTav = returnCreationSelectedItemBinding.reasonSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(reasonSubtitleTav, "reasonSubtitleTav");
        TextHolderKt.bindOrGone(reasonSubtitleTav, reasonInfo.getSubtitle(), this.actionHandler);
        ButtonV3View reasonButtonBv = returnCreationSelectedItemBinding.reasonButtonBv;
        Intrinsics.checkNotNullExpressionValue(reasonButtonBv, "reasonButtonBv");
        ButtonV3HolderKt.bindOrGone(reasonButtonBv, reasonInfo.getButton(), this.actionHandler);
        bindImagesOrGone(reasonInfo.getImages());
        CellView cellCv4 = returnCreationSelectedItemBinding.cellCv;
        Intrinsics.checkNotNullExpressionValue(cellCv4, "cellCv");
        ViewExtKt.gone(cellCv4);
        LinearLayout reasonInfoContainer3 = returnCreationSelectedItemBinding.reasonInfoContainer;
        Intrinsics.checkNotNullExpressionValue(reasonInfoContainer3, "reasonInfoContainer");
        ViewExtKt.show(reasonInfoContainer3);
    }

    private final void bindImagesOrGone(List<IconDTO> images) {
        if (images == null) {
            HorizontalFlexAtomsLayout reasonImagesHfal = this.binding.reasonImagesHfal;
            Intrinsics.checkNotNullExpressionValue(reasonImagesHfal, "reasonImagesHfal");
            ViewExtKt.gone(reasonImagesHfal);
        } else {
            HorizontalFlexAtomsLayout reasonImagesHfal2 = this.binding.reasonImagesHfal;
            Intrinsics.checkNotNullExpressionValue(reasonImagesHfal2, "reasonImagesHfal");
            ViewExtKt.show(reasonImagesHfal2);
            this.imagesAdapter.bind(getContext(), images);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cardClickListener$lambda$0(ReturnCreationSelectedItemViewHolder returnCreationSelectedItemViewHolder, View view) {
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        SelectedItemVO boundedData = returnCreationSelectedItemViewHolder.getBoundedData();
        if (boundedData == null || (common = boundedData.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        returnCreationSelectedItemViewHolder.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteButtonTouchListener$lambda$1(ReturnCreationSelectedItemViewHolder returnCreationSelectedItemViewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        boolean performClick = view.performClick();
        if (performClick) {
            C10727i.c(K.a(returnCreationSelectedItemViewHolder), null, null, new ReturnCreationSelectedItemViewHolder$deleteButtonTouchListener$1$1(returnCreationSelectedItemViewHolder, null), 3);
        }
        return performClick;
    }

    private final void setBackgroundColor(String color) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        if (color == null) {
            color = UniColors.LAYER_FLOOR_1.getToken();
        }
        Integer parseColor = styleParser.parseColor(context, color);
        if (parseColor != null) {
            this.gradientDrawable.setColor(parseColor.intValue());
            this.binding.getConstraintLayout().setBackground(this.gradientDrawable);
        }
    }

    private final void updateNameTopMargin(final ReturnCreationSelectedItemBinding returnCreationSelectedItemBinding) {
        Flow priceAndSealBadgeFlow = returnCreationSelectedItemBinding.priceAndSealBadgeFlow;
        Intrinsics.checkNotNullExpressionValue(priceAndSealBadgeFlow, "priceAndSealBadgeFlow");
        if (!priceAndSealBadgeFlow.isLaidOut() || priceAndSealBadgeFlow.isLayoutRequested()) {
            priceAndSealBadgeFlow.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewHolder.ReturnCreationSelectedItemViewHolder$updateNameTopMargin$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int i11 = view.getMeasuredHeight() > Math.max(ReturnCreationSelectedItemBinding.this.pricePv.getMeasuredHeight(), ReturnCreationSelectedItemBinding.this.sealBadgeView.getMeasuredHeight()) ? ReturnCreationSelectedItemViewHolder.WRAPPED_MARGIN : ReturnCreationSelectedItemViewHolder.UNWRAPPED_MARGIN;
                    TextAtomV2View nameTav = ReturnCreationSelectedItemBinding.this.nameTav;
                    Intrinsics.checkNotNullExpressionValue(nameTav, "nameTav");
                    ViewGroup.LayoutParams layoutParams = nameTav.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    bVar.setMargins(0, i11, 0, 0);
                    nameTav.setLayoutParams(bVar);
                }
            });
            return;
        }
        int i11 = priceAndSealBadgeFlow.getMeasuredHeight() > Math.max(returnCreationSelectedItemBinding.pricePv.getMeasuredHeight(), returnCreationSelectedItemBinding.sealBadgeView.getMeasuredHeight()) ? WRAPPED_MARGIN : UNWRAPPED_MARGIN;
        TextAtomV2View nameTav = returnCreationSelectedItemBinding.nameTav;
        Intrinsics.checkNotNullExpressionValue(nameTav, "nameTav");
        ViewGroup.LayoutParams layoutParams = nameTav.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMargins(0, i11, 0, 0);
        nameTav.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectedItemVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReturnCreationSelectedItemBinding returnCreationSelectedItemBinding = this.binding;
        IconView imageIv = returnCreationSelectedItemBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        IconHolderKt.bind(imageIv, item.getImage(), this.actionHandler);
        PriceAtomView pricePv = returnCreationSelectedItemBinding.pricePv;
        Intrinsics.checkNotNullExpressionValue(pricePv, "pricePv");
        PriceAtomHolderKt.bind(pricePv, item.getPrice(), this.actionHandler);
        TextAtomV2View nameTav = returnCreationSelectedItemBinding.nameTav;
        Intrinsics.checkNotNullExpressionValue(nameTav, "nameTav");
        TextHolderKt.bind(nameTav, item.getName(), this.actionHandler);
        TextAtomV2View descriptionTav = returnCreationSelectedItemBinding.descriptionTav;
        Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
        TextHolderKt.bindOrGone(descriptionTav, item.getDescription(), this.actionHandler);
        TextAtomV2View validationTav = returnCreationSelectedItemBinding.validationTav;
        Intrinsics.checkNotNullExpressionValue(validationTav, "validationTav");
        TextHolderKt.bindOrGone(validationTav, item.getValidationText(), this.actionHandler);
        IconButtonV3View deleteButtonIb = returnCreationSelectedItemBinding.deleteButtonIb;
        Intrinsics.checkNotNullExpressionValue(deleteButtonIb, "deleteButtonIb");
        IconButtonV3HolderKt.bindOrGone(deleteButtonIb, item.getDeleteButton(), this.actionHandler);
        bindCellOrReason(item.getReason());
        setBackgroundColor(item.getBackgroundColor());
        BadgeView sealBadgeView = returnCreationSelectedItemBinding.sealBadgeView;
        Intrinsics.checkNotNullExpressionValue(sealBadgeView, "sealBadgeView");
        BadgeHolderKt.bindOrGone(sealBadgeView, item.getSealBadge(), this.actionHandler);
        updateNameTopMargin(returnCreationSelectedItemBinding);
    }
}
