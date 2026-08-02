package ru.ozon.app.android.fresh.unsorted.widgets.navBar.di;

import I00.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarPlaceholderParser;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/di/ExpressNavBarComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LI00/a;", "Lru/ozon/composer/ui/widget/l;", "getComposerUpdateMapper", "()LI00/a;", "composerUpdateMapper", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarPlaceholderParser;", "getPlaceholderParser", "()Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarPlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarMapper;", "mapper", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ExpressNavBarComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/di/ExpressNavBarComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/di/ExpressNavBarComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExpressNavBarComponent create$lambda$0(final C7475g c7475g) {
            return new ExpressNavBarComponent() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.navBar.di.ExpressNavBarComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ExpressNavBarComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: placeholderParser$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j placeholderParser = k.b(ExpressNavBarComponent$Companion$create$1$1$placeholderParser$2.INSTANCE);
                private final RetainComposerComponentApi retainComponent;

                {
                    this.retainComponent = (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.navBar.di.ExpressNavBarComponent
                public a<l> getComposerUpdateMapper() {
                    return this.retainComponent.getComposerUpdateMapper();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.navBar.di.ExpressNavBarComponent
                public ExpressNavBarMapper getMapper() {
                    return (ExpressNavBarMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.navBar.di.ExpressNavBarComponent
                public ExpressNavBarPlaceholderParser getPlaceholderParser() {
                    return (ExpressNavBarPlaceholderParser) this.placeholderParser.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.navBar.di.ExpressNavBarComponent
                public WZ.l getTokenizedAnalytics() {
                    return this.retainComponent.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<ExpressNavBarComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ExpressNavBarComponent.class), new CA.a(storage, 12));
        }
    }

    @NotNull
    a<l> getComposerUpdateMapper();

    @NotNull
    ExpressNavBarMapper getMapper();

    @NotNull
    ExpressNavBarPlaceholderParser getPlaceholderParser();

    @NotNull
    WZ.l getTokenizedAnalytics();
}
