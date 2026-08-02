package ru.ozon.app.android.returns.total.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.returns.total.viewMapper.ReturnDetailsTotalMapper;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0010\u001a\u00060\u000bj\u0002`\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/ozon/app/android/returns/total/di/ReturnDetailsTotalComponent$Companion$create$1$1", "Lru/ozon/app/android/returns/total/di/ReturnDetailsTotalComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/returns/total/viewMapper/ReturnDetailsTotalMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/returns/total/viewMapper/ReturnDetailsTotalMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersFactory$delegate", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsTotalComponent$Companion$create$1$1 implements ReturnDetailsTotalComponent {
    final /* synthetic */ C7475g $storage;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ReturnDetailsTotalComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: customActionHandlersFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersFactory = k.b(new ReturnDetailsTotalComponent$Companion$create$1$1$customActionHandlersFactory$2(this));

    ReturnDetailsTotalComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    @Override // ru.ozon.app.android.returns.total.di.ReturnDetailsTotalComponent
    public d getCustomActionHandlersFactory() {
        return (d) this.customActionHandlersFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.total.di.ReturnDetailsTotalComponent
    public ReturnDetailsTotalMapper getMapper() {
        return (ReturnDetailsTotalMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.total.di.ReturnDetailsTotalComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
