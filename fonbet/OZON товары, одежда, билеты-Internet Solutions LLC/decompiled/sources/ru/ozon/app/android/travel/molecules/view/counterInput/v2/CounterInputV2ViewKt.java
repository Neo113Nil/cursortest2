package ru.ozon.app.android.travel.molecules.view.counterInput.v2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.counterInput.v2.CounterInputV2DTO;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¨\u0006\b"}, d2 = {"bindOrGone", "", "Lru/ozon/app/android/travel/molecules/view/counterInput/v2/CounterInputV2View;", "dto", "Lru/ozon/app/android/travel/molecules/dto/counterInput/v2/CounterInputV2DTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CounterInputV2ViewKt {
    public static final void bindOrGone(@NotNull CounterInputV2View counterInputV2View, CounterInputV2DTO counterInputV2DTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(counterInputV2View, "<this>");
        if (counterInputV2DTO == null) {
            ViewExtKt.gone(counterInputV2View);
        } else {
            ViewExtKt.show(counterInputV2View);
            counterInputV2View.bind(counterInputV2DTO, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(CounterInputV2View counterInputV2View, CounterInputV2DTO counterInputV2DTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(counterInputV2View, counterInputV2DTO, function1);
    }
}
