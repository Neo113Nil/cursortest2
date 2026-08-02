package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.presentation.AviaBookedTicketInfoViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/presentation/AviaBookedTicketInfoViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaBookedTicketInfoComponent$Companion$create$1$1$aviaBookedTicketInfoViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<AviaBookedTicketInfoViewModel>> {
    final /* synthetic */ AviaBookedTicketInfoComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaBookedTicketInfoComponent$Companion$create$1$1$aviaBookedTicketInfoViewModelProvider$2(AviaBookedTicketInfoComponent$Companion$create$1$1 aviaBookedTicketInfoComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = aviaBookedTicketInfoComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AviaBookedTicketInfoViewModel invoke$lambda$0(AviaBookedTicketInfoComponent$Companion$create$1$1 aviaBookedTicketInfoComponent$Companion$create$1$1) {
        return new AviaBookedTicketInfoViewModel(aviaBookedTicketInfoComponent$Companion$create$1$1.getAviaBookedTicketInfoMapper());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<AviaBookedTicketInfoViewModel> invoke() {
        final AviaBookedTicketInfoComponent$Companion$create$1$1 aviaBookedTicketInfoComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.di.a
            @Override // Pc.a
            public final Object get() {
                AviaBookedTicketInfoViewModel invoke$lambda$0;
                invoke$lambda$0 = AviaBookedTicketInfoComponent$Companion$create$1$1$aviaBookedTicketInfoViewModelProvider$2.invoke$lambda$0(AviaBookedTicketInfoComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
