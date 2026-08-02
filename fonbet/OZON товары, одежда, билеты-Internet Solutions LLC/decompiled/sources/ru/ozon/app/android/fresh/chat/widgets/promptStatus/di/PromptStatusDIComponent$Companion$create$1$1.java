package ru.ozon.app.android.fresh.chat.widgets.promptStatus.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.data.PromptStatusMapper;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/fresh/chat/widgets/promptStatus/di/PromptStatusDIComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/di/PromptStatusDIComponent;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/data/PromptStatusMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/chat/widgets/promptStatus/data/PromptStatusMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "getActionHandlersFactory", "()LVg/d;", "actionHandlersFactory", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromptStatusDIComponent$Companion$create$1$1 implements PromptStatusDIComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(PromptStatusDIComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<PromptStatusViewModel> viewModelProvider = new Tt.a(0);

    PromptStatusDIComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PromptStatusViewModel viewModelProvider$lambda$0() {
        return new PromptStatusViewModel();
    }

    @Override // ru.ozon.app.android.fresh.chat.widgets.promptStatus.di.PromptStatusDIComponent
    public d getActionHandlersFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.chat.widgets.promptStatus.di.PromptStatusDIComponent
    public PromptStatusMapper getMapper() {
        return (PromptStatusMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.chat.widgets.promptStatus.di.PromptStatusDIComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.chat.widgets.promptStatus.di.PromptStatusDIComponent
    public a<PromptStatusViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
