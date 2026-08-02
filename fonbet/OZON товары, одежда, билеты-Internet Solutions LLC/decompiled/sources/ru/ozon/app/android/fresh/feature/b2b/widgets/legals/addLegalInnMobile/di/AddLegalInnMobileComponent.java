package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.di;

import Pc.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data.AddLegalInnMobileMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0002\r\u000eJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/di/AddLegalInnMobileComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/AddLegalInnMobileMapper;", "getAddLegalInnMobileMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/AddLegalInnMobileMapper;", "LPc/a;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileViewModel;", "getWidgetViewModelProvider", "()LPc/a;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Companion", "Factory", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddLegalInnMobileComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/di/AddLegalInnMobileComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/di/AddLegalInnMobileComponent;", "createComponent", "(Lk20/g;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/di/AddLegalInnMobileComponent;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final AddLegalInnMobileComponent createComponent(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return DaggerAddLegalInnMobileComponent.factory().create((NetworkComponentApi) storage.getComponent(NetworkComponentApi.class), (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/di/AddLegalInnMobileComponent$Factory;", "", "create", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/di/AddLegalInnMobileComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public interface Factory {
        @NotNull
        AddLegalInnMobileComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull RetainComposerComponentApi retainComposerComponentApi);
    }

    @NotNull
    AddLegalInnMobileMapper getAddLegalInnMobileMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    a<AddLegalInnMobileViewModel> getWidgetViewModelProvider();
}
