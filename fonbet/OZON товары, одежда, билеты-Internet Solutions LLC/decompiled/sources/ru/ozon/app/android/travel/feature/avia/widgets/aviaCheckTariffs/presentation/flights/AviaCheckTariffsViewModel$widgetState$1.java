package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights;

import Sc.s;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "state", "isExpand", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsViewModel$widgetState$1", f = "AviaCheckTariffsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaCheckTariffsViewModel$widgetState$1 extends j implements InterfaceC6511n<AviaCheckTariffsVO.Content, Boolean, d<? super AviaCheckTariffsVO.Content>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    AviaCheckTariffsViewModel$widgetState$1(d<? super AviaCheckTariffsViewModel$widgetState$1> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Object invoke(AviaCheckTariffsVO.Content content, Boolean bool, d<? super AviaCheckTariffsVO.Content> dVar) {
        return invoke(content, bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AviaCheckTariffsVO.Content content = (AviaCheckTariffsVO.Content) this.L$0;
        boolean z11 = this.Z$0;
        List<AviaCheckTariffsVO.TariffItem> tariffs = content.getTariffs();
        ArrayList arrayList = new ArrayList(C7714v.z(tariffs, 10));
        for (Object obj2 : tariffs) {
            if (obj2 instanceof AviaCheckTariffsVO.TariffItem.TariffVO) {
                AviaCheckTariffsVO.TariffItem.TariffVO tariffVO = (AviaCheckTariffsVO.TariffItem.TariffVO) obj2;
                AviaCheckTariffsVO.TariffItem.TariffVO tariffVO2 = (AviaCheckTariffsVO.TariffItem.TariffVO) obj2;
                List K02 = C7714v.K0(tariffVO2.getBenefits(), z11 ? tariffVO.getBenefits().size() : tariffVO.getInitiallyVisibleBenefitsCount());
                AviaCheckTariffsDTO.ShowMoreButtonDTO showMoreButton = tariffVO2.getShowMoreButton();
                if (z11) {
                    showMoreButton = null;
                }
                obj2 = tariffVO2.copy((r34 & 1) != 0 ? tariffVO2.id : 0, (r34 & 2) != 0 ? tariffVO2.title : null, (r34 & 4) != 0 ? tariffVO2.price : null, (r34 & 8) != 0 ? tariffVO2.route : null, (r34 & 16) != 0 ? tariffVO2.milesBadge : null, (r34 & 32) != 0 ? tariffVO2.benefits : null, (r34 & 64) != 0 ? tariffVO2.visibleBenefits : K02, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tariffVO2.initiallyVisibleBenefitsCount : 0, (r34 & 256) != 0 ? tariffVO2.showMoreButton : showMoreButton, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tariffVO2.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tariffVO2.backgroundColor : null, (r34 & 2048) != 0 ? tariffVO2.marketingImage : null, (r34 & 4096) != 0 ? tariffVO2.clickAction : null, (r34 & 8192) != 0 ? tariffVO2.viewTrackingInfo : null, (r34 & 16384) != 0 ? tariffVO2.isSelected : false, (r34 & 32768) != 0 ? tariffVO2.priceBlock : null);
            }
            arrayList.add(obj2);
        }
        return AviaCheckTariffsVO.Content.copy$default(content, null, arrayList, 0, null, null, null, 61, null);
    }

    public final Object invoke(AviaCheckTariffsVO.Content content, boolean z11, d<? super AviaCheckTariffsVO.Content> dVar) {
        AviaCheckTariffsViewModel$widgetState$1 aviaCheckTariffsViewModel$widgetState$1 = new AviaCheckTariffsViewModel$widgetState$1(dVar);
        aviaCheckTariffsViewModel$widgetState$1.L$0 = content;
        aviaCheckTariffsViewModel$widgetState$1.Z$0 = z11;
        return aviaCheckTariffsViewModel$widgetState$1.invokeSuspend(Unit.f71690a);
    }
}
