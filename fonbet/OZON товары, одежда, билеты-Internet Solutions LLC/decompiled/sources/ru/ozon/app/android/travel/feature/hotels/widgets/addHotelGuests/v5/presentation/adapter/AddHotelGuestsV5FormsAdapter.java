package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.adapter;

import WZ.l;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import fd.InterfaceC6512o;
import java.util.ArrayList;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.view.AddHotelGuestsV5FormView;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B}\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012&\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J-\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b#\u0010(J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010*R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R4\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/recyclerview/widget/RecyclerView$u;", "sharedViewPool", "Lkotlin/Function4;", "", "", "", "", "onTextInputChanged", "Lkotlin/Function2;", "onSelectorClicked", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/recyclerview/widget/RecyclerView$u;Lfd/o;Lkotlin/jvm/functions/Function2;Landroidx/lifecycle/J;)V", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormViewHolder;ILjava/util/List;)V", "onViewAttachedToWindow", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormViewHolder;)V", "onViewDetachedFromWindow", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Landroidx/recyclerview/widget/RecyclerView$u;", "Lfd/o;", "Lkotlin/jvm/functions/Function2;", "Payload", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddHotelGuestsV5FormsAdapter extends i<AddHotelGuestsV5VO.GuestFormVO, AddHotelGuestsV5FormViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function2<Integer, Long, Unit> onSelectorClicked;

    @NotNull
    private final InterfaceC6512o<Integer, Long, String, CharSequence, Unit> onTextInputChanged;

    @NotNull
    private final RecyclerView.u sharedViewPool;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/adapter/AddHotelGuestsV5FormsAdapter$Payload;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "REMOVE_BUTTON", "INPUTS", "SELECT_EMPLOYEE_BUTTON", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Payload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload TITLE = new Payload(SelectionItemDescriptionDTO.TITLE, 0);
        public static final Payload REMOVE_BUTTON = new Payload("REMOVE_BUTTON", 1);
        public static final Payload INPUTS = new Payload("INPUTS", 2);
        public static final Payload SELECT_EMPLOYEE_BUTTON = new Payload("SELECT_EMPLOYEE_BUTTON", 3);

        private static final /* synthetic */ Payload[] $values() {
            return new Payload[]{TITLE, REMOVE_BUTTON, INPUTS, SELECT_EMPLOYEE_BUTTON};
        }

        static {
            Payload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Payload(String str, int i11) {
        }

        public static Payload valueOf(String str) {
            return (Payload) Enum.valueOf(Payload.class, str);
        }

        public static Payload[] values() {
            return (Payload[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddHotelGuestsV5FormsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull RecyclerView.u sharedViewPool, @NotNull InterfaceC6512o<? super Integer, ? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged, @NotNull Function2<? super Integer, ? super Long, Unit> onSelectorClicked, @NotNull J lifecycleOwner) {
        super(new i.d<AddHotelGuestsV5VO.GuestFormVO>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.adapter.AddHotelGuestsV5FormsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AddHotelGuestsV5VO.GuestFormVO oldItem, AddHotelGuestsV5VO.GuestFormVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AddHotelGuestsV5VO.GuestFormVO oldItem, AddHotelGuestsV5VO.GuestFormVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public List<Payload> getChangePayload(AddHotelGuestsV5VO.GuestFormVO oldItem, AddHotelGuestsV5VO.GuestFormVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                ArrayList arrayList = new ArrayList();
                if (!Intrinsics.d(oldItem.getResultTitle(), newItem.getResultTitle())) {
                    arrayList.add(Payload.TITLE);
                }
                if (!Intrinsics.d(oldItem.getRemoveOptionalGuestButton(), newItem.getRemoveOptionalGuestButton())) {
                    arrayList.add(Payload.REMOVE_BUTTON);
                }
                if (!CollectionExtKt.deepEquals(oldItem.getInputs(), newItem.getInputs())) {
                    arrayList.add(Payload.INPUTS);
                }
                if (!Intrinsics.d(oldItem.getSelectEmployeeButton(), newItem.getSelectEmployeeButton())) {
                    arrayList.add(Payload.SELECT_EMPLOYEE_BUTTON);
                }
                return arrayList;
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(sharedViewPool, "sharedViewPool");
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.sharedViewPool = sharedViewPool;
        this.onTextInputChanged = onTextInputChanged;
        this.onSelectorClicked = onSelectorClicked;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.addHotelGuestsV5FormViewType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((AddHotelGuestsV5FormViewHolder) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AddHotelGuestsV5FormViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AddHotelGuestsV5FormView addHotelGuestsV5FormView = new AddHotelGuestsV5FormView(context, null, 0, 0, 14, null);
        addHotelGuestsV5FormView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new AddHotelGuestsV5FormViewHolder(addHotelGuestsV5FormView, this.tokenizedAnalytics, this.sharedViewPool);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AddHotelGuestsV5FormViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AddHotelGuestsV5VO.GuestFormVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind2(item, (List<? extends Object>) K.f71697a);
    }

    @Override // jk0.i
    public void onViewAttachedToWindow(@NotNull AddHotelGuestsV5FormViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((AddHotelGuestsV5FormsAdapter) holder);
        holder.setupCallbacks(this.actionHandler, this.onTextInputChanged, this.onSelectorClicked);
    }

    @Override // jk0.i
    public void onViewDetachedFromWindow(@NotNull AddHotelGuestsV5FormViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.removeCallbacks();
        super.onViewDetachedFromWindow((AddHotelGuestsV5FormsAdapter) holder);
    }

    public void onBindViewHolder(@NotNull AddHotelGuestsV5FormViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        AddHotelGuestsV5VO.GuestFormVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind2(item, (List<? extends Object>) payloads);
    }
}
