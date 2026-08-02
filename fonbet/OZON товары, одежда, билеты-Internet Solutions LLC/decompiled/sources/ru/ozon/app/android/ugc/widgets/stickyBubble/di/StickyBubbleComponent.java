package ru.ozon.app.android.ugc.widgets.stickyBubble.di;

import Ap.C2441a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ugc.widgets.stickyBubble.core.StickyBubbleMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/di/StickyBubbleComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/widgets/stickyBubble/core/StickyBubbleMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/stickyBubble/core/StickyBubbleMapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StickyBubbleComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/di/StickyBubbleComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/stickyBubble/di/StickyBubbleComponent;", "create", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StickyBubbleComponent create$lambda$0(final C7475g c7475g) {
            return new StickyBubbleComponent(c7475g) { // from class: ru.ozon.app.android.ugc.widgets.stickyBubble.di.StickyBubbleComponent$Companion$create$1$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(StickyBubbleComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final RetainComposerComponentApi retainComposerComponentApi;
                private final StorageComponentApi storageComponentApi;

                {
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
                }

                @Override // ru.ozon.app.android.ugc.widgets.stickyBubble.di.StickyBubbleComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.ugc.widgets.stickyBubble.di.StickyBubbleComponent
                public StickyBubbleMapper getMapper() {
                    return (StickyBubbleMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.stickyBubble.di.StickyBubbleComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<StickyBubbleComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(StickyBubbleComponent.class), new C2441a(storage, 5));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    StickyBubbleMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
