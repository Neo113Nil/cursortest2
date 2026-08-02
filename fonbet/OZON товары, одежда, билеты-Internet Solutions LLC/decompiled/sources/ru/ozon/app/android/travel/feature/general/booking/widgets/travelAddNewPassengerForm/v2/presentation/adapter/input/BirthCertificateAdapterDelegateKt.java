package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input;

import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function3;", "", "", "", "", "onTextInputChanged", "Lkotlin/Function1;", "onSelectorClicked", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "birthCertificateAdapterDelegate", "(Lfd/n;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "booking_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BirthCertificateAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<CommonInputVO>> birthCertificateAdapterDelegate(@NotNull InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged, @NotNull Function1<? super Long, Unit> onSelectorClicked) {
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        return new DslViewBindingListAdapterDelegate(BirthCertificateAdapterDelegateKt$birthCertificateAdapterDelegate$1.INSTANCE, BirthCertificateAdapterDelegateKt$birthCertificateAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new BirthCertificateAdapterDelegateKt$birthCertificateAdapterDelegate$2(onTextInputChanged, onSelectorClicked), BirthCertificateAdapterDelegateKt$birthCertificateAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
