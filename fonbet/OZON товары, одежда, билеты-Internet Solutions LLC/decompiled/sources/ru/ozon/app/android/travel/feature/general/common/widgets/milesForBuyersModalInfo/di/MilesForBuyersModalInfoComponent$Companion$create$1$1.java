package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoButtonsMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoMapper;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/di/MilesForBuyersModalInfoComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/di/MilesForBuyersModalInfoComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoButtonsMapper;", "buttonsMapper$delegate", "getButtonsMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoButtonsMapper;", "buttonsMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersModalInfoComponent$Companion$create$1$1 implements MilesForBuyersModalInfoComponent {
    private final ContextComponentDependencies contextComponentDependencies;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new MilesForBuyersModalInfoComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: buttonsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j buttonsMapper = k.b(MilesForBuyersModalInfoComponent$Companion$create$1$1$buttonsMapper$2.INSTANCE);

    MilesForBuyersModalInfoComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.di.MilesForBuyersModalInfoComponent
    public MilesForBuyersModalInfoButtonsMapper getButtonsMapper() {
        return (MilesForBuyersModalInfoButtonsMapper) this.buttonsMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.di.MilesForBuyersModalInfoComponent
    public MilesForBuyersModalInfoMapper getMapper() {
        return (MilesForBuyersModalInfoMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.di.MilesForBuyersModalInfoComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
