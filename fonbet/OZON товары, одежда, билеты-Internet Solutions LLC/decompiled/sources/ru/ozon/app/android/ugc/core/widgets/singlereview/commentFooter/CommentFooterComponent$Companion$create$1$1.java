package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"ru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterMapper;", "mapper", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterMapper;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "LSc/j;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/c;", "customActionHandlersStore$delegate", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentFooterComponent$Companion$create$1$1 implements CommentFooterComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final CommentFooterMapper mapper = new CommentFooterMapper();

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(CommentFooterComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStore = k.b(new CommentFooterComponent$Companion$create$1$1$customActionHandlersStore$2(this));

    CommentFooterComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.CommentFooterComponent
    public c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.CommentFooterComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.CommentFooterComponent
    public CommentFooterMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.CommentFooterComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
