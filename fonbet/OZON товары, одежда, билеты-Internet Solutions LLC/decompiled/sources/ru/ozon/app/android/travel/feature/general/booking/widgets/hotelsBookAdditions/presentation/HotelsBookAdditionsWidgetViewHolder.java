package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation;

import BN.b;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.HotelsBookAdditionsFieldsAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.HotelsBookAdditionsFieldsDecoration;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.update.HotelsBookAdditionsUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.view.HotelsBookAdditionsView;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorBottomSheetDialog;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J#\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b$\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010\u0010J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010\u0010J)\u0010-\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0016\u00103\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModel;LWZ/l;)V", "", "subscribeToLiveData", "()V", "", "isOpen", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "fields", "sendUpdate", "(Ljava/lang/Boolean;Ljava/util/List;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "selectorItems", "showSelector", "(Ljava/lang/String;Ljava/util/List;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;Ll20/d;)V", "onAttach", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/view/HotelsBookAdditionsView;", "additionsView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/view/HotelsBookAdditionsView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/adapter/HotelsBookAdditionsFieldsAdapter;", "fieldsAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/adapter/HotelsBookAdditionsFieldsAdapter;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookAdditionsWidgetViewHolder extends k<HotelsBookAdditionsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final HotelsBookAdditionsView additionsView;

    @NotNull
    private final HotelsBookAdditionsFieldsAdapter fieldsAdapter;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsBookAdditionsViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookAdditionsWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull HotelsBookAdditionsViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        HotelsBookAdditionsView hotelsBookAdditionsView = containerView instanceof HotelsBookAdditionsView ? (HotelsBookAdditionsView) containerView : null;
        this.additionsView = hotelsBookAdditionsView;
        this.actionHandler = new ActionHandler.Builder(references, this).onClick(new HotelsBookAdditionsWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.fieldsAdapter = new HotelsBookAdditionsFieldsAdapter(new HotelsBookAdditionsWidgetViewHolder$fieldsAdapter$1(viewModel), new HotelsBookAdditionsWidgetViewHolder$fieldsAdapter$2(viewModel), tokenizedAnalytics, this);
        if (hotelsBookAdditionsView != null) {
            recyclerView = hotelsBookAdditionsView.fieldsRv;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.addItemDecoration(new HotelsBookAdditionsFieldsDecoration(context));
            recyclerView.setItemAnimator(null);
            recyclerView.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendUpdate(Boolean isOpen, List<HotelsBookAdditionsVO.FieldVO> fields) {
        this.references.getController().update(new HotelsBookAdditionsUpdate(isOpen, fields));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSelector(String title, List<SelectorItem> selectorItems) {
        ComponentCallbacksC5392m j11 = this.references.getContainer().j();
        j11.getChildFragmentManager().n1("SelectorBottomSheetDialog.RequestKey", this, new b(this, j11));
        SelectorBottomSheetDialog.INSTANCE.newInstance(title, selectorItems).show(j11.getChildFragmentManager(), "SelectorBottomSheetDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSelector$lambda$8$lambda$7(HotelsBookAdditionsWidgetViewHolder hotelsBookAdditionsWidgetViewHolder, ComponentCallbacksC5392m componentCallbacksC5392m, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        SelectorItem selectorItem = (SelectorItem) bundle.getParcelable("KEY_SELECTED_ITEM");
        if (selectorItem != null) {
            hotelsBookAdditionsWidgetViewHolder.viewModel.onSelectorItemSelected(selectorItem);
        }
        componentCallbacksC5392m.getChildFragmentManager().s("SelectorBottomSheetDialog.RequestKey");
    }

    private final void subscribeToLiveData() {
        this.viewModel.getActionLiveData().observe(this, new HotelsBookAdditionsWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new HotelsBookAdditionsWidgetViewHolder$subscribeToLiveData$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        RecyclerView recyclerView;
        super.onAttach();
        subscribeToLiveData();
        HotelsBookAdditionsView hotelsBookAdditionsView = this.additionsView;
        if (hotelsBookAdditionsView != null) {
            recyclerView = hotelsBookAdditionsView.fieldsRv;
            recyclerView.setAdapter(this.fieldsAdapter);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        RecyclerView recyclerView;
        HotelsBookAdditionsView hotelsBookAdditionsView = this.additionsView;
        if (hotelsBookAdditionsView != null) {
            recyclerView = hotelsBookAdditionsView.fieldsRv;
            recyclerView.setAdapter(null);
        }
        super.onDetach();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsBookAdditionsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsBookAdditionsVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        List list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        this.viewModel.bind(item);
        for (Object obj : list) {
            if (obj == HotelsBookAdditionsViewMapper.Payload.EXPANDED) {
                HotelsBookAdditionsView hotelsBookAdditionsView = this.additionsView;
                if (hotelsBookAdditionsView != null) {
                    hotelsBookAdditionsView.switchToExpanded();
                    hotelsBookAdditionsView.bindButton(item.getExpandedIconButton(), this.actionHandler);
                    this.fieldsAdapter.submitList(item.getFields());
                }
            } else if (obj == HotelsBookAdditionsViewMapper.Payload.COLLAPSED) {
                HotelsBookAdditionsView hotelsBookAdditionsView2 = this.additionsView;
                if (hotelsBookAdditionsView2 != null) {
                    hotelsBookAdditionsView2.switchToCollapsed();
                    hotelsBookAdditionsView2.bindButton(item.getCollapsedIconButton(), this.actionHandler);
                    this.fieldsAdapter.submitList(null);
                }
            } else if (obj == HotelsBookAdditionsViewMapper.Payload.FIELDS) {
                this.fieldsAdapter.submitList(item.getFields());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsBookAdditionsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.bind(item);
        HotelsBookAdditionsView hotelsBookAdditionsView = this.additionsView;
        if (hotelsBookAdditionsView != null) {
            hotelsBookAdditionsView.bind(item, this.actionHandler);
        }
        HotelsBookAdditionsFieldsAdapter hotelsBookAdditionsFieldsAdapter = this.fieldsAdapter;
        List<HotelsBookAdditionsVO.FieldVO> fields = item.getFields();
        if (!item.getIsOpen()) {
            fields = null;
        }
        hotelsBookAdditionsFieldsAdapter.submitList(fields);
    }
}
