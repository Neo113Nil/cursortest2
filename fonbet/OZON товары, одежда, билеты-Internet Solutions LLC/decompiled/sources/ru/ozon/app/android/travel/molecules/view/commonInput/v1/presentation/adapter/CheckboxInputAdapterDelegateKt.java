package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function2;", "", "", "", "onCheckboxChanged", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "checkboxInputAdapterDelegate", "(Lkotlin/jvm/functions/Function2;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CheckboxInputAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<CommonInputVO>> checkboxInputAdapterDelegate(Function2<? super Long, ? super Boolean, Unit> function2) {
        return new DslViewBindingListAdapterDelegate(CheckboxInputAdapterDelegateKt$checkboxInputAdapterDelegate$1.INSTANCE, CheckboxInputAdapterDelegateKt$checkboxInputAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new CheckboxInputAdapterDelegateKt$checkboxInputAdapterDelegate$2(function2), CheckboxInputAdapterDelegateKt$checkboxInputAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
