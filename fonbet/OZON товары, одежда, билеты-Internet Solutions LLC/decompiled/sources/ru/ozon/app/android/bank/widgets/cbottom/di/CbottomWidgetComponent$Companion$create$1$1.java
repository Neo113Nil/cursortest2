package ru.ozon.app.android.bank.widgets.cbottom.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.bank.widgets.cbottom.core.CbottomWidgetListenersStore;
import ru.ozon.app.android.bank.widgets.cbottom.core.CbottomWidgetMapper;
import ru.ozon.app.android.bank.widgets.cbottom.di.CbottomWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.bank.widgets.cbottom.presentation.CbottomWidgetViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/bank/widgets/cbottom/di/CbottomWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/bank/widgets/cbottom/di/CbottomWidgetComponent;", "Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore;", "listenersStore$delegate", "LSc/j;", "getListenersStore", "()Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore;", "listenersStore", "Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "LPc/a;", "Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CbottomWidgetComponent$Companion$create$1$1 implements CbottomWidgetComponent {

    /* renamed from: listenersStore$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j listenersStore = k.b(CbottomWidgetComponent$Companion$create$1$1$listenersStore$2.INSTANCE);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new CbottomWidgetComponent$Companion$create$1$1$mapper$2(this));
    private final l tokenizedAnalytics;

    CbottomWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.tokenizedAnalytics = ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CbottomWidgetViewModel _get_viewModelProvider_$lambda$0(CbottomWidgetComponent$Companion$create$1$1 cbottomWidgetComponent$Companion$create$1$1) {
        return new CbottomWidgetViewModel(cbottomWidgetComponent$Companion$create$1$1.getListenersStore());
    }

    public CbottomWidgetListenersStore getListenersStore() {
        return (CbottomWidgetListenersStore) this.listenersStore.getValue();
    }

    @Override // ru.ozon.app.android.bank.widgets.cbottom.di.CbottomWidgetComponent
    public CbottomWidgetMapper getMapper() {
        return (CbottomWidgetMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.bank.widgets.cbottom.di.CbottomWidgetComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.bank.widgets.cbottom.di.CbottomWidgetComponent
    public a<CbottomWidgetViewModel> getViewModelProvider() {
        return new a() { // from class: sm.a
            @Override // Pc.a
            public final Object get() {
                CbottomWidgetViewModel _get_viewModelProvider_$lambda$0;
                _get_viewModelProvider_$lambda$0 = CbottomWidgetComponent$Companion$create$1$1._get_viewModelProvider_$lambda$0(CbottomWidgetComponent$Companion$create$1$1.this);
                return _get_viewModelProvider_$lambda$0;
            }
        };
    }
}
