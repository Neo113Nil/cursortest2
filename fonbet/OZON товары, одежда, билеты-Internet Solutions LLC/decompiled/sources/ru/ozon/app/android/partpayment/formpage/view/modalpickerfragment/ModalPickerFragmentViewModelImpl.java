package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment;

import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerFragmentViewModel;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0004R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel;", "<init>", "()V", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "options", "", "bindInitial", "(Ljava/util/List;)V", "option", "onSelect", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;)V", "onComplete", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "getOptions", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalPickerFragmentViewModelImpl extends w0 implements ModalPickerFragmentViewModel {

    @NotNull
    private final V<List<FormPageVO.Field.Options.Picker>> options = new V<>();

    @NotNull
    private final BroadcastSingleLiveEvent<ModalPickerFragmentViewModel.Action> action = new BroadcastSingleLiveEvent<>();

    @NotNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);

    public void bindInitial(@NotNull List<FormPageVO.Field.Options.Picker> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.isInitialized.compareAndSet(false, true)) {
            getOptions().postValue(options);
        }
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerFragmentViewModel
    public void onComplete() {
        Object obj;
        List<FormPageVO.Field.Options.Picker> value = getOptions().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((FormPageVO.Field.Options.Picker) obj).getIsSelected()) {
                        break;
                    }
                }
            }
            FormPageVO.Field.Options.Picker picker = (FormPageVO.Field.Options.Picker) obj;
            if (picker != null) {
                getAction().setValue(new ModalPickerFragmentViewModel.Action.Complete(picker));
            }
        }
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerFragmentViewModel
    public void onSelect(@NotNull FormPageVO.Field.Options.Picker option) {
        Intrinsics.checkNotNullParameter(option, "option");
        List<FormPageVO.Field.Options.Picker> value = getOptions().getValue();
        if (value != null) {
            V<List<FormPageVO.Field.Options.Picker>> options = getOptions();
            List<FormPageVO.Field.Options.Picker> list = value;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (FormPageVO.Field.Options.Picker picker : list) {
                arrayList.add(FormPageVO.Field.Options.Picker.copy$default(picker, null, null, Intrinsics.d(picker.getValue(), option.getValue()), 3, null));
            }
            options.postValue(arrayList);
        }
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerFragmentViewModel
    @NotNull
    public BroadcastSingleLiveEvent<ModalPickerFragmentViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerFragmentViewModel
    @NotNull
    public V<List<FormPageVO.Field.Options.Picker>> getOptions() {
        return this.options;
    }
}
