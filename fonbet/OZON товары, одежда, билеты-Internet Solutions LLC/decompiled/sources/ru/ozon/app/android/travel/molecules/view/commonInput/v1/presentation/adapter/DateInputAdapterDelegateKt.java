package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function1;", "", "", "onDateInputClicked", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "dateInputAdapterDelegate", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DateInputAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<CommonInputVO>> dateInputAdapterDelegate(Function1<? super Long, Unit> function1) {
        return new DslViewBindingListAdapterDelegate(DateInputAdapterDelegateKt$dateInputAdapterDelegate$1.INSTANCE, DateInputAdapterDelegateKt$dateInputAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new DateInputAdapterDelegateKt$dateInputAdapterDelegate$2(function1), DateInputAdapterDelegateKt$dateInputAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
