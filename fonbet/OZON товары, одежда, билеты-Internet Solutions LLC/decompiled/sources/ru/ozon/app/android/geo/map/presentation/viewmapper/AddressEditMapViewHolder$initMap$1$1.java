package ru.ozon.app.android.geo.map.presentation.viewmapper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "loading", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewHolder$initMap$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ AddressEditMapViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewHolder$initMap$1$1(AddressEditMapViewHolder addressEditMapViewHolder) {
        super(1);
        this.this$0 = addressEditMapViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        i iVar;
        YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;
        i iVar2;
        if (z11) {
            AddressEditMapViewHolder addressEditMapViewHolder = this.this$0;
            iVar2 = addressEditMapViewHolder.container;
            addressEditMapViewHolder.showLoader(iVar2.Z());
        } else {
            AddressEditMapViewHolder addressEditMapViewHolder2 = this.this$0;
            iVar = addressEditMapViewHolder2.container;
            addressEditMapViewHolder2.hideLoader(iVar.Z());
            yandexSearchSheetSharedViewModel = this.this$0.yandexSearchSheetSharedViewModel;
            yandexSearchSheetSharedViewModel.setMapViewCreated(true);
        }
    }
}
