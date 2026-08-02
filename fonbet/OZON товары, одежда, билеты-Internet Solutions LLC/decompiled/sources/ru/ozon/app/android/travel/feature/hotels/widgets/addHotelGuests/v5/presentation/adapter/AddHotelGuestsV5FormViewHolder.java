package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.adapter;

import WZ.l;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.adapter.AddHotelGuestsV5FormsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.view.AddHotelGuestsV5FormView;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter.InputsListAdapter;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0015Jg\u0010#\u001a\u00020\u000f2\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u0017j\u0002`\u00192&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u000f0\u001b2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0015R\u0016\u0010'\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R*\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017j\u0004\u0018\u0001`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010+R8\u0010 \u001a$\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010,R*\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u0017j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "Landroid/view/View;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/recyclerview/widget/RecyclerView$u;", "sharedViewPool", "<init>", "(Landroid/view/View;LWZ/l;Landroidx/recyclerview/widget/RecyclerView$u;)V", "item", "", "payloads", "", "bindWithPayloads", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;Ljava/util/List;)V", "", "bind", "onAttach", "()V", "onDetach", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/Function4;", "", "", "", "", "onTextInputChanged", "Lkotlin/Function2;", "onSelectorClicked", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;Lfd/o;Lkotlin/jvm/functions/Function2;)V", "removeCallbacks", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/view/AddHotelGuestsV5FormView;", "formView", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/view/AddHotelGuestsV5FormView;", "boundedData", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "Lkotlin/jvm/functions/Function1;", "Lfd/o;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/presentation/listAdapter/InputsListAdapter;", "inputsAdapter", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/presentation/listAdapter/InputsListAdapter;", "processedActionHandler", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddHotelGuestsV5FormViewHolder extends BaseViewHolder<AddHotelGuestsV5VO.GuestFormVO> {
    private Function1<? super AtomAction, Unit> actionHandler;
    private AddHotelGuestsV5VO.GuestFormVO boundedData;
    private final AddHotelGuestsV5FormView formView;

    @NotNull
    private final InputsListAdapter inputsAdapter;
    private Function2<? super Integer, ? super Long, Unit> onSelectorClicked;
    private InterfaceC6512o<? super Integer, ? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormViewHolder$Companion;", "", "<init>", "()V", "KEY_FORM_ID", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddHotelGuestsV5FormViewHolder(@NotNull View view, @NotNull l tokenizedAnalytics, @NotNull RecyclerView.u sharedViewPool) {
        super(view);
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(sharedViewPool, "sharedViewPool");
        AddHotelGuestsV5FormView addHotelGuestsV5FormView = view instanceof AddHotelGuestsV5FormView ? (AddHotelGuestsV5FormView) view : null;
        this.formView = addHotelGuestsV5FormView;
        this.inputsAdapter = new InputsListAdapter(this, this.actionHandler, new AddHotelGuestsV5FormViewHolder$inputsAdapter$1(this), null, new AddHotelGuestsV5FormViewHolder$inputsAdapter$2(this), null, null, tokenizedAnalytics, 104, null);
        this.processedActionHandler = new AddHotelGuestsV5FormViewHolder$processedActionHandler$1(this);
        if (addHotelGuestsV5FormView != null) {
            recyclerView = addHotelGuestsV5FormView.inputsRv;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.addItemDecoration(new AddHotelGuestsV5InputsDecoration(context));
            recyclerView.setItemAnimator(null);
            recyclerView.setRecycledViewPool(sharedViewPool);
        }
    }

    private final void bindWithPayloads(AddHotelGuestsV5VO.GuestFormVO item, List<?> payloads) {
        AddHotelGuestsV5FormView addHotelGuestsV5FormView;
        for (Object obj : payloads) {
            if (obj instanceof List) {
                bindWithPayloads(item, (List) obj);
            } else if (obj == AddHotelGuestsV5FormsAdapter.Payload.TITLE) {
                AddHotelGuestsV5FormView addHotelGuestsV5FormView2 = this.formView;
                if (addHotelGuestsV5FormView2 != null) {
                    addHotelGuestsV5FormView2.bindTitle(item.getResultTitle());
                }
            } else if (obj == AddHotelGuestsV5FormsAdapter.Payload.INPUTS) {
                this.inputsAdapter.submitList(item.getInputs());
            } else if (obj == AddHotelGuestsV5FormsAdapter.Payload.REMOVE_BUTTON) {
                AddHotelGuestsV5FormView addHotelGuestsV5FormView3 = this.formView;
                if (addHotelGuestsV5FormView3 != null) {
                    addHotelGuestsV5FormView3.bindRemoveButton(item.getRemoveOptionalGuestButton(), this.processedActionHandler);
                }
            } else if (obj == AddHotelGuestsV5FormsAdapter.Payload.SELECT_EMPLOYEE_BUTTON && (addHotelGuestsV5FormView = this.formView) != null) {
                addHotelGuestsV5FormView.bindSelectEmployeeButton(item.getSelectEmployeeButton(), this.processedActionHandler);
            }
        }
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AddHotelGuestsV5VO.GuestFormVO guestFormVO, List list) {
        bind2(guestFormVO, (List<? extends Object>) list);
    }

    @Override // jk0.j
    public void onAttach() {
        RecyclerView recyclerView;
        super.onAttach();
        AddHotelGuestsV5FormView addHotelGuestsV5FormView = this.formView;
        if (addHotelGuestsV5FormView != null) {
            recyclerView = addHotelGuestsV5FormView.inputsRv;
            recyclerView.setAdapter(this.inputsAdapter);
        }
    }

    @Override // jk0.j
    public void onDetach() {
        RecyclerView recyclerView;
        AddHotelGuestsV5FormView addHotelGuestsV5FormView = this.formView;
        if (addHotelGuestsV5FormView != null) {
            recyclerView = addHotelGuestsV5FormView.inputsRv;
            recyclerView.setAdapter(null);
        }
        super.onDetach();
    }

    public final void removeCallbacks() {
        this.actionHandler = null;
        this.onTextInputChanged = null;
        this.onSelectorClicked = null;
    }

    public final void setupCallbacks(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6512o<? super Integer, ? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged, @NotNull Function2<? super Integer, ? super Long, Unit> onSelectorClicked) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        this.actionHandler = actionHandler;
        this.onTextInputChanged = onTextInputChanged;
        this.onSelectorClicked = onSelectorClicked;
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AddHotelGuestsV5VO.GuestFormVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        this.boundedData = item;
        if (!payloads.isEmpty()) {
            bindWithPayloads(item, payloads);
            return;
        }
        AddHotelGuestsV5FormView addHotelGuestsV5FormView = this.formView;
        if (addHotelGuestsV5FormView != null) {
            addHotelGuestsV5FormView.bind(item, this.processedActionHandler);
        }
        this.inputsAdapter.submitList(item.getInputs());
    }
}
