package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AddressSearchViewModelImpl$bindInitial$1 extends C7735q implements Function1<Boolean, Unit> {
    AddressSearchViewModelImpl$bindInitial$1(Object obj) {
        super(1, obj, V.class, "postValue", "postValue(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        ((V) this.receiver).postValue(bool);
    }
}
