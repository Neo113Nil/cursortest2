package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.data.AviaBookedTicketInfoMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.presentation.AviaBookedTicketInfoViewModel;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/di/AviaBookedTicketInfoComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/di/AviaBookedTicketInfoComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoMapper;", "aviaBookedTicketInfoMapper$delegate", "LSc/j;", "getAviaBookedTicketInfoMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoMapper;", "aviaBookedTicketInfoMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/presentation/AviaBookedTicketInfoViewModel;", "aviaBookedTicketInfoViewModelProvider$delegate", "getAviaBookedTicketInfoViewModelProvider", "()LPc/a;", "aviaBookedTicketInfoViewModelProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaBookedTicketInfoComponent$Companion$create$1$1 implements AviaBookedTicketInfoComponent {

    /* renamed from: aviaBookedTicketInfoMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j aviaBookedTicketInfoMapper = k.b(AviaBookedTicketInfoComponent$Companion$create$1$1$aviaBookedTicketInfoMapper$2.INSTANCE);

    /* renamed from: aviaBookedTicketInfoViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j aviaBookedTicketInfoViewModelProvider = k.b(new AviaBookedTicketInfoComponent$Companion$create$1$1$aviaBookedTicketInfoViewModelProvider$2(this));
    private final RetainComposerComponentApi retainComposerComponentApi;

    AviaBookedTicketInfoComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.di.AviaBookedTicketInfoComponent
    public AviaBookedTicketInfoMapper getAviaBookedTicketInfoMapper() {
        return (AviaBookedTicketInfoMapper) this.aviaBookedTicketInfoMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.di.AviaBookedTicketInfoComponent
    public Pc.a<AviaBookedTicketInfoViewModel> getAviaBookedTicketInfoViewModelProvider() {
        return (Pc.a) this.aviaBookedTicketInfoViewModelProvider.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.di.AviaBookedTicketInfoComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
