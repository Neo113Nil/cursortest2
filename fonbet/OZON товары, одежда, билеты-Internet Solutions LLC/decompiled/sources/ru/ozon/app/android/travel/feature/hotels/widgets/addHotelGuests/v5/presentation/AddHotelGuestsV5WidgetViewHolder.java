package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation;

import Cm.d;
import E.D;
import WZ.l;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.adapter.AddHotelGuestsV5FormsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.adapter.AddHotelGuestsV5FormsDecoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.update.AddHotelGuestsV5Update;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.update.ResetScrollFlagUpdate;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.view.AddHotelGuestsV5RoomView;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorBottomSheetDialog;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 <2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001<B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010\u0011J+\u0010*\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J#\u0010*\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&H\u0014¢\u0006\u0004\b*\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010\u0011J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010\u0011R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0016\u00103\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000f058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel;", "viewModel", "<init>", "(Landroid/view/View;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel;)V", "", "subscribeToLiveData", "()V", "", "roomId", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "forms", "", "isAddGuestButtonVisible", "sendRoomUpdate", "(ILjava/util/List;Ljava/lang/Boolean;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "selectorItems", "showSelector", "(Ljava/lang/String;Ljava/util/List;)V", "item", "bindVisibleForms", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;)V", "scrollToProblemForm", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;Ll20/d;)V", "onAttach", "onDetach", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5ViewModel;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/view/AddHotelGuestsV5RoomView;", "roomView", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/view/AddHotelGuestsV5RoomView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormsAdapter;", "formsAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormsAdapter;", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddHotelGuestsV5WidgetViewHolder extends k<AddHotelGuestsV5VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AddHotelGuestsV5FormsAdapter formsAdapter;

    @NotNull
    private final ComposerReferences references;
    private final AddHotelGuestsV5RoomView roomView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AddHotelGuestsV5ViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5WidgetViewHolder$Companion;", "", "<init>", "()V", "ADD_GUEST_ACTION_ID", "", "REMOVE_GUEST_ACTION_ID", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddHotelGuestsV5WidgetViewHolder(@NotNull View containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences references, @NotNull AddHotelGuestsV5ViewModel viewModel) {
        super(containerView);
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.references = references;
        this.viewModel = viewModel;
        AddHotelGuestsV5RoomView addHotelGuestsV5RoomView = containerView instanceof AddHotelGuestsV5RoomView ? (AddHotelGuestsV5RoomView) containerView : null;
        this.roomView = addHotelGuestsV5RoomView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).onClick(new AddHotelGuestsV5WidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.formsAdapter = new AddHotelGuestsV5FormsAdapter(buildHandler, tokenizedAnalytics, references.getComposerViewPoolProvider().getViewPool(), new AddHotelGuestsV5WidgetViewHolder$formsAdapter$1(this), new AddHotelGuestsV5WidgetViewHolder$formsAdapter$2(this), this);
        if (addHotelGuestsV5RoomView != null) {
            recyclerView = addHotelGuestsV5RoomView.formsRv;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.addItemDecoration(new AddHotelGuestsV5FormsDecoration(context));
            recyclerView.setItemAnimator(null);
            recyclerView.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
        }
    }

    private final void bindVisibleForms(AddHotelGuestsV5VO item) {
        List<AddHotelGuestsV5VO.GuestFormVO> forms = item.getForms();
        ArrayList arrayList = new ArrayList();
        for (Object obj : forms) {
            if (((AddHotelGuestsV5VO.GuestFormVO) obj).getIsFormVisible()) {
                arrayList.add(obj);
            }
        }
        this.formsAdapter.submitList(arrayList, new d(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindVisibleForms$lambda$8(final AddHotelGuestsV5WidgetViewHolder addHotelGuestsV5WidgetViewHolder) {
        View itemView = addHotelGuestsV5WidgetViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (!itemView.isLaidOut() || itemView.isLayoutRequested()) {
            itemView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5WidgetViewHolder$bindVisibleForms$lambda$8$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    AddHotelGuestsV5WidgetViewHolder.this.scrollToProblemForm();
                }
            });
        } else {
            addHotelGuestsV5WidgetViewHolder.scrollToProblemForm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToProblemForm() {
        Integer scrollToFormId;
        AddHotelGuestsV5VO boundData;
        Integer scrollWidgetKey;
        this.references.getController().d(ResetScrollFlagUpdate.INSTANCE);
        AddHotelGuestsV5VO boundData2 = getBoundData();
        if (boundData2 == null || (scrollToFormId = boundData2.getScrollToFormId()) == null) {
            return;
        }
        int intValue = scrollToFormId.intValue();
        List<AddHotelGuestsV5VO.GuestFormVO> currentList = this.formsAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<AddHotelGuestsV5VO.GuestFormVO> it = currentList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getId() == intValue) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1 || this.roomView == null || (boundData = getBoundData()) == null || (scrollWidgetKey = boundData.getScrollWidgetKey()) == null) {
            return;
        }
        InterfaceC7851b.a.b(this.references.getController(), scrollWidgetKey.intValue(), -this.roomView.getFormYByPosition(i11), false, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendRoomUpdate(int roomId, List<AddHotelGuestsV5VO.GuestFormVO> forms, Boolean isAddGuestButtonVisible) {
        this.references.getController().update(new AddHotelGuestsV5Update(roomId, forms, isAddGuestButtonVisible));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSelector(String title, List<SelectorItem> selectorItems) {
        ComponentCallbacksC5392m j11 = this.references.getContainer().j();
        j11.getChildFragmentManager().n1("SelectorBottomSheetDialog.RequestKey", this, new D(this, j11));
        SelectorBottomSheetDialog.INSTANCE.newInstance(title, selectorItems).show(j11.getChildFragmentManager(), "SelectorBottomSheetDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSelector$lambda$5$lambda$4(AddHotelGuestsV5WidgetViewHolder addHotelGuestsV5WidgetViewHolder, ComponentCallbacksC5392m componentCallbacksC5392m, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        SelectorItem selectorItem = (SelectorItem) bundle.getParcelable("KEY_SELECTED_ITEM");
        if (selectorItem != null) {
            addHotelGuestsV5WidgetViewHolder.viewModel.onSelectorItemSelected(selectorItem);
        }
        componentCallbacksC5392m.getChildFragmentManager().s("SelectorBottomSheetDialog.RequestKey");
    }

    private final void subscribeToLiveData() {
        this.viewModel.getBroadcastEventLiveData().observe(this, new AddHotelGuestsV5WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AddHotelGuestsV5WidgetViewHolder$subscribeToLiveData$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        RecyclerView recyclerView;
        super.onAttach();
        subscribeToLiveData();
        AddHotelGuestsV5RoomView addHotelGuestsV5RoomView = this.roomView;
        if (addHotelGuestsV5RoomView != null) {
            recyclerView = addHotelGuestsV5RoomView.formsRv;
            recyclerView.setAdapter(this.formsAdapter);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        RecyclerView recyclerView;
        AddHotelGuestsV5RoomView addHotelGuestsV5RoomView = this.roomView;
        if (addHotelGuestsV5RoomView != null) {
            recyclerView = addHotelGuestsV5RoomView.formsRv;
            recyclerView.setAdapter(null);
        }
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddHotelGuestsV5VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        List list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        this.viewModel.bindRoom(item);
        for (Object obj : list) {
            if (obj == AddHotelGuestsV5ViewMapper.Payload.TITLE) {
                AddHotelGuestsV5RoomView addHotelGuestsV5RoomView = this.roomView;
                if (addHotelGuestsV5RoomView != null) {
                    addHotelGuestsV5RoomView.bindTitle(item.getTitle());
                }
            } else if (obj == AddHotelGuestsV5ViewMapper.Payload.SUBTITLE) {
                AddHotelGuestsV5RoomView addHotelGuestsV5RoomView2 = this.roomView;
                if (addHotelGuestsV5RoomView2 != null) {
                    addHotelGuestsV5RoomView2.bindSubtitle(item.getSubtitle());
                }
            } else if (obj == AddHotelGuestsV5ViewMapper.Payload.FORMS) {
                bindVisibleForms(item);
            } else if (obj == AddHotelGuestsV5ViewMapper.Payload.BUTTON) {
                AddHotelGuestsV5RoomView addHotelGuestsV5RoomView3 = this.roomView;
                if (addHotelGuestsV5RoomView3 != null) {
                    addHotelGuestsV5RoomView3.bindButton(item.getAddGuestButton(), item.getIsAddGuestButtonVisible(), this.actionHandler);
                }
            } else if (obj == AddHotelGuestsV5ViewMapper.Payload.DISCLAIMER) {
                AddHotelGuestsV5RoomView addHotelGuestsV5RoomView4 = this.roomView;
                if (addHotelGuestsV5RoomView4 != null) {
                    addHotelGuestsV5RoomView4.bindDisclaimer(item.getDisclaimer());
                }
            } else if (obj == AddHotelGuestsV5ViewMapper.Payload.SCROLL) {
                scrollToProblemForm();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddHotelGuestsV5VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.bindRoom(item);
        AddHotelGuestsV5RoomView addHotelGuestsV5RoomView = this.roomView;
        if (addHotelGuestsV5RoomView != null) {
            addHotelGuestsV5RoomView.bind(item, this.actionHandler);
        }
        bindVisibleForms(item);
    }
}
