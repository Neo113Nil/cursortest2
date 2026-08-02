package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter;

import Em0.c;
import WZ.l;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function3;", "", "", "", "onTextInputChanged", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "LEm0/c;", "onSetFormatWatcher", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "textInputAdapterDelegate", "(Lkotlin/jvm/functions/Function1;Lfd/n;Lkotlin/jvm/functions/Function1;LWZ/l;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextInputAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<CommonInputVO>> textInputAdapterDelegate(Function1<? super AtomAction, Unit> function1, InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> interfaceC6511n, Function1<? super CommonInputVO.TextCommonInputVO, ? extends c> function12, l lVar) {
        return new DslViewBindingListAdapterDelegate(TextInputAdapterDelegateKt$textInputAdapterDelegate$1.INSTANCE, TextInputAdapterDelegateKt$textInputAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new TextInputAdapterDelegateKt$textInputAdapterDelegate$2(interfaceC6511n, function1, lVar, function12), TextInputAdapterDelegateKt$textInputAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }

    public static /* synthetic */ AdapterDelegate textInputAdapterDelegate$default(Function1 function1, InterfaceC6511n interfaceC6511n, Function1 function12, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        if ((i11 & 2) != 0) {
            interfaceC6511n = null;
        }
        if ((i11 & 4) != 0) {
            function12 = null;
        }
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return textInputAdapterDelegate(function1, interfaceC6511n, function12, lVar);
    }
}
