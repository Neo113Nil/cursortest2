package ru.ozon.app.android.geo.map.presentation.viewmodel;

import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AddressEditMapViewModelImpl$fetchAndMoveToLastLocation$4 extends C7735q implements Function1<AddressEditMapViewModel.Action, Unit> {
    AddressEditMapViewModelImpl$fetchAndMoveToLastLocation$4(Object obj) {
        super(1, obj, V.class, "postValue", "postValue(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressEditMapViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddressEditMapViewModel.Action action) {
        ((V) this.receiver).postValue(action);
    }
}
