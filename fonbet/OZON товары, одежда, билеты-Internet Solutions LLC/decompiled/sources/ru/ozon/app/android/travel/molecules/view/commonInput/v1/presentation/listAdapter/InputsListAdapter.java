package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter;

import Ej.b;
import Em0.c;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.InputDiffUtilItemCallback;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonCheckboxInputView;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonDateInputView;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonSelectorInputView;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001BÍ\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012$\b\u0002\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J3\u0010'\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b'\u0010,J\u001d\u0010-\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b/\u0010.R(\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00100R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00100R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00100R(\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00102R\u001c\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/commonInput/v1/presentation/listAdapter/InputsListAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/Function3;", "", "", "", "onTextInputChanged", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "LEm0/c;", "onSetFormatWatcher", "onSelectorClicked", "onDateInputClicked", "Lkotlin/Function2;", "", "onCheckboxChanged", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LWZ/l;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;ILjava/util/List;)V", "onViewAttachedToWindow", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;)V", "onViewDetachedFromWindow", "Lkotlin/jvm/functions/Function1;", "Lfd/n;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InputsListAdapter extends i<CommonInputVO, BaseViewHolder<? super CommonInputVO>> {
    private final Function1<AtomAction, Unit> actionHandler;
    private final Function2<Long, Boolean, Unit> onCheckboxChanged;
    private final Function1<Long, Unit> onDateInputClicked;
    private final Function1<Long, Unit> onSelectorClicked;
    private final Function1<CommonInputVO.TextCommonInputVO, c> onSetFormatWatcher;
    private final InterfaceC6511n<Long, String, CharSequence, Unit> onTextInputChanged;
    private final l tokenizedAnalytics;

    public /* synthetic */ InputsListAdapter(J j11, Function1 function1, InterfaceC6511n interfaceC6511n, Function1 function12, Function1 function13, Function1 function14, Function2 function2, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? null : function1, (i11 & 4) != 0 ? null : interfaceC6511n, (i11 & 8) != 0 ? null : function12, (i11 & 16) != 0 ? null : function13, (i11 & 32) != 0 ? null : function14, (i11 & 64) != 0 ? null : function2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        CommonInputVO item = getItem(position);
        if (item instanceof CommonInputVO.TextCommonInputVO) {
            return R$id.inputsListTextInputViewType;
        }
        if (item instanceof CommonInputVO.Selector) {
            return R$id.inputsListSelectorInputViewType;
        }
        if (item instanceof CommonInputVO.DateCommonInputVO) {
            return R$id.inputsListDateInputViewType;
        }
        if (item instanceof CommonInputVO.Checkbox) {
            return R$id.inputsListCheckboxInputViewType;
        }
        throw new IllegalStateException("Illegal state for item: " + item);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsListAdapter(@NotNull J lifecycleOwner, Function1<? super AtomAction, Unit> function1, InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> interfaceC6511n, Function1<? super CommonInputVO.TextCommonInputVO, ? extends c> function12, Function1<? super Long, Unit> function13, Function1<? super Long, Unit> function14, Function2<? super Long, ? super Boolean, Unit> function2, l lVar) {
        super(new InputDiffUtilItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = function1;
        this.onTextInputChanged = interfaceC6511n;
        this.onSetFormatWatcher = function12;
        this.onSelectorClicked = function13;
        this.onDateInputClicked = function14;
        this.onCheckboxChanged = function2;
        this.tokenizedAnalytics = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((BaseViewHolder<? super CommonInputVO>) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<CommonInputVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$id.inputsListTextInputViewType) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CommonTextInputView commonTextInputView = new CommonTextInputView(context, null, 0, 0, 14, null);
            commonTextInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new TextInputViewHolder(commonTextInputView);
        }
        if (viewType == R$id.inputsListSelectorInputViewType) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            CommonSelectorInputView commonSelectorInputView = new CommonSelectorInputView(context2, null, 0, 0, 14, null);
            commonSelectorInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new SelectorInputViewHolder(commonSelectorInputView);
        }
        if (viewType == R$id.inputsListDateInputViewType) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            CommonDateInputView commonDateInputView = new CommonDateInputView(context3, null, 0, 0, 14, null);
            commonDateInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new DateInputViewHolder(commonDateInputView);
        }
        if (viewType != R$id.inputsListCheckboxInputViewType) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
        }
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        CommonCheckboxInputView commonCheckboxInputView = new CommonCheckboxInputView(context4, null, 0, 0, 14, null);
        commonCheckboxInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new CheckboxInputViewHolder(commonCheckboxInputView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super CommonInputVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CommonInputVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, K.f71697a);
    }

    @Override // jk0.i
    public void onViewAttachedToWindow(@NotNull BaseViewHolder<? super CommonInputVO> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((InputsListAdapter) holder);
        if (holder instanceof TextInputViewHolder) {
            ((TextInputViewHolder) holder).setupCallbacks(this.actionHandler, this.onTextInputChanged, this.onSetFormatWatcher, this.tokenizedAnalytics);
            return;
        }
        if (holder instanceof SelectorInputViewHolder) {
            ((SelectorInputViewHolder) holder).setupCallbacks(this.onSelectorClicked);
        } else if (holder instanceof DateInputViewHolder) {
            ((DateInputViewHolder) holder).setupCallbacks(this.onDateInputClicked);
        } else if (holder instanceof CheckboxInputViewHolder) {
            ((CheckboxInputViewHolder) holder).setupCallbacks(this.onCheckboxChanged);
        }
    }

    @Override // jk0.i
    public void onViewDetachedFromWindow(@NotNull BaseViewHolder<? super CommonInputVO> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof TextInputViewHolder) {
            ((TextInputViewHolder) holder).removeCallbacks();
        } else if (holder instanceof SelectorInputViewHolder) {
            ((SelectorInputViewHolder) holder).removeCallbacks();
        } else if (holder instanceof DateInputViewHolder) {
            ((DateInputViewHolder) holder).removeCallbacks();
        } else if (holder instanceof CheckboxInputViewHolder) {
            ((CheckboxInputViewHolder) holder).removeCallbacks();
        }
        super.onViewDetachedFromWindow((InputsListAdapter) holder);
    }

    public void onBindViewHolder(@NotNull BaseViewHolder<? super CommonInputVO> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        CommonInputVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, payloads);
    }
}
