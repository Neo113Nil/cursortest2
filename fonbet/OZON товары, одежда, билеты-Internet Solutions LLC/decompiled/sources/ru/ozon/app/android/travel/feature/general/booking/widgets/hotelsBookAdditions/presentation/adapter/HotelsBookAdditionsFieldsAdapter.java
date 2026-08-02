package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter;

import WZ.l;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.view.HotelsBookAdditionsSelectorFieldView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.view.HotelsBookAdditionsTextFieldView;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001(BM\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b\u001c\u0010!J\u001d\u0010\"\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010#R.\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/adapter/HotelsBookAdditionsFieldsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lkotlin/Function3;", "", "", "", "", "onTextInputChanged", "Lkotlin/Function1;", "onSelectorClicked", "LWZ/l;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lfd/n;Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/lifecycle/J;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;ILjava/util/List;)V", "onViewAttachedToWindow", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;)V", "onViewDetachedFromWindow", "Lfd/n;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Payload", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookAdditionsFieldsAdapter extends i<HotelsBookAdditionsVO.FieldVO, BaseViewHolder<? super HotelsBookAdditionsVO.FieldVO>> {

    @NotNull
    private final Function1<Long, Unit> onSelectorClicked;

    @NotNull
    private final InterfaceC6511n<Long, String, CharSequence, Unit> onTextInputChanged;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/adapter/HotelsBookAdditionsFieldsAdapter$Payload;", "", "<init>", "(Ljava/lang/String;I)V", "SUBTITLE", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Payload {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload SUBTITLE = new Payload("SUBTITLE", 0);

        private static final /* synthetic */ Payload[] $values() {
            return new Payload[]{SUBTITLE};
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
    public HotelsBookAdditionsFieldsAdapter(@NotNull InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged, @NotNull Function1<? super Long, Unit> onSelectorClicked, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(new i.d<HotelsBookAdditionsVO.FieldVO>() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.adapter.HotelsBookAdditionsFieldsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(HotelsBookAdditionsVO.FieldVO oldItem, HotelsBookAdditionsVO.FieldVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(HotelsBookAdditionsVO.FieldVO oldItem, HotelsBookAdditionsVO.FieldVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public List<Object> getChangePayload(HotelsBookAdditionsVO.FieldVO oldItem, HotelsBookAdditionsVO.FieldVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                ArrayList arrayList = new ArrayList();
                if (!Intrinsics.d(oldItem.getInput(), newItem.getInput())) {
                    InputPayload inputPayload = !Intrinsics.d(oldItem.getInput().getValue(), newItem.getInput().getValue()) ? InputPayload.CHANGE_VALUE : null;
                    if (!Intrinsics.d(oldItem.getInput().getError(), newItem.getInput().getError()) || oldItem.getInput().getIsErrorVisible() != newItem.getInput().getIsErrorVisible()) {
                        inputPayload = inputPayload == null ? InputPayload.ERROR : InputPayload.CHANGE_VALUE_WITH_ERROR;
                    }
                    if (inputPayload != null) {
                        arrayList.add(inputPayload);
                    }
                }
                if (!Intrinsics.d(oldItem.getSubtitle(), newItem.getSubtitle())) {
                    arrayList.add(Payload.SUBTITLE);
                }
                return arrayList;
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.onTextInputChanged = onTextInputChanged;
        this.onSelectorClicked = onSelectorClicked;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        HotelsBookAdditionsVO.FieldVO item = getItem(position);
        CommonInputVO input = item.getInput();
        if (input instanceof CommonInputVO.TextCommonInputVO) {
            return R$id.hotelsBookAdditionsTextFieldViewType;
        }
        if (input instanceof CommonInputVO.Selector) {
            return R$id.hotelsBookAdditionsSelectorFieldViewType;
        }
        throw new IllegalStateException("Illegal state for item: " + item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((BaseViewHolder<? super HotelsBookAdditionsVO.FieldVO>) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<HotelsBookAdditionsVO.FieldVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$id.hotelsBookAdditionsTextFieldViewType) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            HotelsBookAdditionsTextFieldView hotelsBookAdditionsTextFieldView = new HotelsBookAdditionsTextFieldView(context, null, 0, 0, 14, null);
            hotelsBookAdditionsTextFieldView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new HotelsBookAdditionsTextFieldViewHolder(hotelsBookAdditionsTextFieldView);
        }
        if (viewType != R$id.hotelsBookAdditionsSelectorFieldViewType) {
            throw new IllegalArgumentException(Ej.b.a(viewType, "Unknown viewType: "));
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        HotelsBookAdditionsSelectorFieldView hotelsBookAdditionsSelectorFieldView = new HotelsBookAdditionsSelectorFieldView(context2, null, 0, 0, 14, null);
        hotelsBookAdditionsSelectorFieldView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new HotelsBookAdditionsSelectorFieldViewHolder(hotelsBookAdditionsSelectorFieldView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super HotelsBookAdditionsVO.FieldVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsBookAdditionsVO.FieldVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, K.f71697a);
    }

    @Override // jk0.i
    public void onViewAttachedToWindow(@NotNull BaseViewHolder<? super HotelsBookAdditionsVO.FieldVO> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((HotelsBookAdditionsFieldsAdapter) holder);
        if (holder instanceof HotelsBookAdditionsTextFieldViewHolder) {
            ((HotelsBookAdditionsTextFieldViewHolder) holder).setupCallbacks(this.onTextInputChanged, this.tokenizedAnalytics);
        } else if (holder instanceof HotelsBookAdditionsSelectorFieldViewHolder) {
            ((HotelsBookAdditionsSelectorFieldViewHolder) holder).setupCallbacks(this.onSelectorClicked);
        }
    }

    @Override // jk0.i
    public void onViewDetachedFromWindow(@NotNull BaseViewHolder<? super HotelsBookAdditionsVO.FieldVO> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HotelsBookAdditionsTextFieldViewHolder) {
            ((HotelsBookAdditionsTextFieldViewHolder) holder).removeCallbacks();
        } else if (holder instanceof HotelsBookAdditionsSelectorFieldViewHolder) {
            ((HotelsBookAdditionsSelectorFieldViewHolder) holder).removeCallbacks();
        }
        super.onViewDetachedFromWindow((HotelsBookAdditionsFieldsAdapter) holder);
    }

    public void onBindViewHolder(@NotNull BaseViewHolder<? super HotelsBookAdditionsVO.FieldVO> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        HotelsBookAdditionsVO.FieldVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, payloads);
    }
}
