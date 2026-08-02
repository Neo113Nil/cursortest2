package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateButtonMapper;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/di/TranslateButtonComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/di/TranslateButtonComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonMapper;", "translateButtonMapper$delegate", "LSc/j;", "getTranslateButtonMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonMapper;", "translateButtonMapper", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel;", "translateViewModel$delegate", "getTranslateViewModel", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateViewModel;", "translateViewModel", "LVg/c;", "customActionHandlersStore$delegate", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "connectionHandler", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TranslateButtonComponent$Companion$create$1$1 implements TranslateButtonComponent {
    final /* synthetic */ RetainComposerComponentApi $retainComposerComponentApi;
    private final ConnectionHandler connectionHandler;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: translateViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j translateViewModel;

    /* renamed from: translateButtonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j translateButtonMapper = k.b(TranslateButtonComponent$Companion$create$1$1$translateButtonMapper$2.INSTANCE);

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStore = k.b(new TranslateButtonComponent$Companion$create$1$1$customActionHandlersStore$2(this));

    TranslateButtonComponent$Companion$create$1$1(C7475g c7475g, RetainComposerComponentApi retainComposerComponentApi) {
        this.$retainComposerComponentApi = retainComposerComponentApi;
        this.translateViewModel = k.b(new TranslateButtonComponent$Companion$create$1$1$translateViewModel$2(c7475g, this));
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.connectionHandler = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getInternetConnectionUtils();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.di.TranslateButtonComponent
    public c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.di.TranslateButtonComponent
    public l getTokenizedAnalytics() {
        return this.$retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.di.TranslateButtonComponent
    public TranslateButtonMapper getTranslateButtonMapper() {
        return (TranslateButtonMapper) this.translateButtonMapper.getValue();
    }
}
