package ru.ozon.app.android.regulardraw.widgets.navbar.di;

import AI.c;
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
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentApi;
import ru.ozon.app.android.regulardraw.widgets.navbar.core.MorkovskNavbarMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/navbar/di/MorkovskNavBarComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavbarMapper;", "getMapper", "()Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavbarMapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "getOnboardingDelegate", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "onboardingDelegate", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MorkovskNavBarComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/navbar/di/MorkovskNavBarComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/regulardraw/widgets/navbar/di/MorkovskNavBarComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MorkovskNavBarComponent create$lambda$0(final C7475g c7475g) {
            return new MorkovskNavBarComponent(c7475g) { // from class: ru.ozon.app.android.regulardraw.widgets.navbar.di.MorkovskNavBarComponent$Companion$create$1$1
                private final CustomActionHandlersComponentApi actionHandlersApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(MorkovskNavBarComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final MorkovskOnboardingComponentApi morkovskOnboardingComponentApi;
                private final RetainComposerComponentApi retainComponentApi;

                {
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.actionHandlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.morkovskOnboardingComponentApi = (MorkovskOnboardingComponentApi) c7475g.getComponent(MorkovskOnboardingComponentApi.class);
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.navbar.di.MorkovskNavBarComponent
                public d getActionHandlersStoreFactory() {
                    return this.actionHandlersApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.navbar.di.MorkovskNavBarComponent
                public MorkovskNavbarMapper getMapper() {
                    return (MorkovskNavbarMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.navbar.di.MorkovskNavBarComponent
                public MorkovskOnboardingDelegate getOnboardingDelegate() {
                    return this.morkovskOnboardingComponentApi.getMorkovskOnboardingDelegate();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.navbar.di.MorkovskNavBarComponent
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<MorkovskNavBarComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MorkovskNavBarComponent.class), new c(storage, 8));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    MorkovskNavbarMapper getMapper();

    @NotNull
    MorkovskOnboardingDelegate getOnboardingDelegate();

    @NotNull
    l getTokenizedAnalytics();
}
