package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di;

import Bz.C2680a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3BodyMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3GradientHeaderMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3HeaderMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductImageBinder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammersProductInfoBinder;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.core.OldHammersV3BodyMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders.OldHammerProductImageBinder;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders.OldHammersProductInfoBinder;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonDelegate;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 /2\u00060\u0001j\u0002`\u0002:\u0001/R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/di/HammersV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderMapper;", "getGradientHeaderMapper", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderMapper;", "gradientHeaderMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3HeaderMapper;", "getHeaderMapper", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3HeaderMapper;", "headerMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3BodyMapper;", "getBodyMapper", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3BodyMapper;", "bodyMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/core/OldHammersV3BodyMapper;", "getOldBodyMapper", "()Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/core/OldHammersV3BodyMapper;", "oldBodyMapper", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "getButtonDelegate", "()Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "buttonDelegate", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductImageBinder;", "getImageBinder", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductImageBinder;", "imageBinder", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammerProductImageBinder;", "getOldImageBinder", "()Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammerProductImageBinder;", "oldImageBinder", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammersProductInfoBinder;", "getInfoBlockBinder", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammersProductInfoBinder;", "infoBlockBinder", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammersProductInfoBinder;", "getOldInfoBlockBinder", "()Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammersProductInfoBinder;", "oldInfoBlockBinder", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HammersV3Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/di/HammersV3Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/di/HammersV3Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HammersV3Component create$lambda$0(C7475g c7475g) {
            return new HammersV3Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<HammersV3Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(HammersV3Component.class), new C2680a(storage, 0));
        }
    }

    @NotNull
    HammersV3BodyMapper getBodyMapper();

    @NotNull
    SwitchingButtonDelegate getButtonDelegate();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    HammersV3GradientHeaderMapper getGradientHeaderMapper();

    @NotNull
    HammersV3HeaderMapper getHeaderMapper();

    @NotNull
    HammerProductImageBinder getImageBinder();

    @NotNull
    HammersProductInfoBinder getInfoBlockBinder();

    @NotNull
    OldHammersV3BodyMapper getOldBodyMapper();

    @NotNull
    OldHammerProductImageBinder getOldImageBinder();

    @NotNull
    OldHammersProductInfoBinder getOldInfoBlockBinder();

    @NotNull
    StartupArgsService getStartupArgsService();
}
