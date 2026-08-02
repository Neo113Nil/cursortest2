package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input;

import Ej.b;
import Em0.c;
import Sc.o;
import WZ.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3TextInputView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.BirthCertificateInputV2View;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonCheckboxInputV2View;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonDateInputV2View;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonSelectorInputV2View;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ×\u0001\u00103\u001a\u00020\u00122\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00120\u001ej\u0002` 2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120\"2\u0018\b\u0002\u0010)\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010\u001e2 \u0010+\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u00120*2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u001e2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u001e2\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120.2\n\u00102\u001a\u000600j\u0002`1¢\u0006\u0004\b3\u00104R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001ej\u0004\u0018\u0001` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00107R8\u0010&\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00108R&\u0010)\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00107R2\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u0012\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00109R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00107R$\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00107R*\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010:R\u001e\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`18\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerInputsV2Adapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "<init>", "()V", "", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;ILjava/util/List;)V", "onViewDetachedFromWindow", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;)V", "list", "submitList", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/Function4;", "", "", "", "onTextInputChanged", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "LEm0/c;", "onSetFormatWatcher", "Lkotlin/Function3;", "onTextInputFocusLost", "onDateInputClicked", "onSelectorClicked", "Lkotlin/Function2;", "onCheckboxChanged", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;Lfd/o;Lkotlin/jvm/functions/Function1;Lfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LWZ/l;)V", "items", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "Lfd/o;", "Lfd/n;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddNewPassengerInputsV2Adapter extends RecyclerView.g<BaseViewHolder<? super TravelAddNewPassengerFormV3VO.InputItemVO>> {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private List<? extends TravelAddNewPassengerFormV3VO.InputItemVO> items = K.f71697a;
    private Function2<? super Integer, ? super Boolean, Unit> onCheckboxChanged;
    private Function1<? super Integer, Unit> onDateInputClicked;
    private Function1<? super Integer, Unit> onSelectorClicked;
    private Function1<? super CommonInputV2VO.TextInputV2, ? extends c> onSetFormatWatcher;
    private InterfaceC6512o<? super Integer, ? super String, ? super CharSequence, ? super Boolean, Unit> onTextInputChanged;
    private InterfaceC6511n<? super Integer, ? super String, ? super CharSequence, Unit> onTextInputFocusLost;
    private l tokenizedAnalytics;

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        TravelAddNewPassengerFormV3VO.InputItemVO inputItemVO = this.items.get(position);
        if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) {
            return R$id.inputsTextInputViewType;
        }
        if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem) {
            return R$id.inputsSelectorInputViewType;
        }
        if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.DateInputItem) {
            return R$id.inputsDateInputViewType;
        }
        if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.CheckboxInputItem) {
            return R$id.inputsCheckboxInputViewType;
        }
        if (inputItemVO instanceof TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem) {
            return R$id.inputsBirthCertificateInputViewType;
        }
        throw new o();
    }

    public final void setupCallbacks(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6512o<? super Integer, ? super String, ? super CharSequence, ? super Boolean, Unit> onTextInputChanged, Function1<? super CommonInputV2VO.TextInputV2, ? extends c> onSetFormatWatcher, @NotNull InterfaceC6511n<? super Integer, ? super String, ? super CharSequence, Unit> onTextInputFocusLost, @NotNull Function1<? super Integer, Unit> onDateInputClicked, @NotNull Function1<? super Integer, Unit> onSelectorClicked, @NotNull Function2<? super Integer, ? super Boolean, Unit> onCheckboxChanged, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        Intrinsics.checkNotNullParameter(onTextInputFocusLost, "onTextInputFocusLost");
        Intrinsics.checkNotNullParameter(onDateInputClicked, "onDateInputClicked");
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        Intrinsics.checkNotNullParameter(onCheckboxChanged, "onCheckboxChanged");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.actionHandler = actionHandler;
        this.onTextInputChanged = onTextInputChanged;
        this.onSetFormatWatcher = onSetFormatWatcher;
        this.onTextInputFocusLost = onTextInputFocusLost;
        this.onDateInputClicked = onDateInputClicked;
        this.onSelectorClicked = onSelectorClicked;
        this.onCheckboxChanged = onCheckboxChanged;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<? extends TravelAddNewPassengerFormV3VO.InputItemVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(BaseViewHolder<? super TravelAddNewPassengerFormV3VO.InputItemVO> baseViewHolder, int i11, List list) {
        onBindViewHolder2(baseViewHolder, i11, (List<? extends Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<? super TravelAddNewPassengerFormV3VO.InputItemVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$id.inputsTextInputViewType) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AddNewPassengerFormV3TextInputView addNewPassengerFormV3TextInputView = new AddNewPassengerFormV3TextInputView(context);
            addNewPassengerFormV3TextInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new TextInputV2ViewHolder(addNewPassengerFormV3TextInputView);
        }
        if (viewType == R$id.inputsSelectorInputViewType) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            CommonSelectorInputV2View commonSelectorInputV2View = new CommonSelectorInputV2View(context2, null, 0, 0, 14, null);
            commonSelectorInputV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new SelectorInputV2ViewHolder(commonSelectorInputV2View);
        }
        if (viewType == R$id.inputsDateInputViewType) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            CommonDateInputV2View commonDateInputV2View = new CommonDateInputV2View(context3, null, 0, 0, 14, null);
            commonDateInputV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new DateInputV2ViewHolder(commonDateInputV2View);
        }
        if (viewType != R$id.inputsCheckboxInputViewType) {
            if (viewType != R$id.inputsBirthCertificateInputViewType) {
                throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
            }
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            BirthCertificateInputV2View birthCertificateInputV2View = new BirthCertificateInputV2View(context4);
            birthCertificateInputV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new BirthCertificateInputV2ViewHolder(birthCertificateInputV2View);
        }
        Context context5 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        CommonCheckboxInputV2View commonCheckboxInputV2View = new CommonCheckboxInputV2View(context5, null, 0, 0, 14, null);
        commonCheckboxInputV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new CheckboxInputV2ViewHolder(commonCheckboxInputV2View);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull BaseViewHolder<? super TravelAddNewPassengerFormV3VO.InputItemVO> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof TextInputV2ViewHolder) {
            ((TextInputV2ViewHolder) holder).removeCallbacks();
        } else if (holder instanceof SelectorInputV2ViewHolder) {
            ((SelectorInputV2ViewHolder) holder).removeCallbacks();
        } else if (holder instanceof DateInputV2ViewHolder) {
            ((DateInputV2ViewHolder) holder).removeCallbacks();
        } else if (holder instanceof CheckboxInputV2ViewHolder) {
            ((CheckboxInputV2ViewHolder) holder).removeCallbacks();
        } else if (holder instanceof BirthCertificateInputV2ViewHolder) {
            ((BirthCertificateInputV2ViewHolder) holder).removeCallbacks();
        }
        super.onViewDetachedFromWindow((AddNewPassengerInputsV2Adapter) holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super TravelAddNewPassengerFormV3VO.InputItemVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        onBindViewHolder2(holder, position, (List<? extends Object>) K.f71697a);
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(@NotNull BaseViewHolder<? super TravelAddNewPassengerFormV3VO.InputItemVO> holder, int position, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (holder instanceof TextInputV2ViewHolder) {
            ((TextInputV2ViewHolder) holder).setupCallbacks(this.actionHandler, this.onTextInputChanged, this.onSetFormatWatcher, this.onTextInputFocusLost, this.tokenizedAnalytics);
        } else if (holder instanceof SelectorInputV2ViewHolder) {
            ((SelectorInputV2ViewHolder) holder).setupCallbacks(this.onSelectorClicked);
        } else if (holder instanceof DateInputV2ViewHolder) {
            ((DateInputV2ViewHolder) holder).setupCallbacks(this.onDateInputClicked);
        } else if (holder instanceof CheckboxInputV2ViewHolder) {
            ((CheckboxInputV2ViewHolder) holder).setupCallbacks(this.onCheckboxChanged);
        } else if (holder instanceof BirthCertificateInputV2ViewHolder) {
            ((BirthCertificateInputV2ViewHolder) holder).setupCallbacks(this.onTextInputChanged, this.onSelectorClicked, this.tokenizedAnalytics);
        }
        holder.bind(this.items.get(position), payloads);
    }
}
