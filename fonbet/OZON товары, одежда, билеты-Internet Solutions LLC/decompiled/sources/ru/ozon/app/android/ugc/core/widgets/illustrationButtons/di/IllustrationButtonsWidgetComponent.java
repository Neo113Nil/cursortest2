package ru.ozon.app.android.ugc.core.widgets.illustrationButtons.di;

import CW.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.ugc.core.widgets.illustrationButtons.data.IllustrationButtonsMapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/di/IllustrationButtonsWidgetComponent;", "Lhi/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsMapper;", "getIllustrationButtonsMapper", "()Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsMapper;", "illustrationButtonsMapper", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface IllustrationButtonsWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/di/IllustrationButtonsWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/di/IllustrationButtonsWidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IllustrationButtonsWidgetComponent create$lambda$0(C7475g c7475g) {
            final CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
            return new IllustrationButtonsWidgetComponent(customActionHandlersComponentApi) { // from class: ru.ozon.app.android.ugc.core.widgets.illustrationButtons.di.IllustrationButtonsWidgetComponent$Companion$create$1$1

                /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j customActionHandlersStoreFactory;

                /* renamed from: illustrationButtonsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j illustrationButtonsMapper = k.b(IllustrationButtonsWidgetComponent$Companion$create$1$1$illustrationButtonsMapper$2.INSTANCE);

                {
                    this.customActionHandlersStoreFactory = k.b(new IllustrationButtonsWidgetComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(customActionHandlersComponentApi));
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.illustrationButtons.di.IllustrationButtonsWidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return (d) this.customActionHandlersStoreFactory.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.illustrationButtons.di.IllustrationButtonsWidgetComponent
                public IllustrationButtonsMapper getIllustrationButtonsMapper() {
                    return (IllustrationButtonsMapper) this.illustrationButtonsMapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<IllustrationButtonsWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(IllustrationButtonsWidgetComponent.class), new a(storage, 4));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    IllustrationButtonsMapper getIllustrationButtonsMapper();
}
