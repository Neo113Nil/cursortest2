package ru.ozon.app.android.ugc.widgets.additionalReviewV2.di;

import AV.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.core.AdditionalReviewV2Mapper;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2ViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0002\r\u000eJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/di/AdditionalReviewV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewV2Mapper;", "mapper", "()Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewV2Mapper;", "LPc/a;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2ViewModel;", "viewModelProvider", "()LPc/a;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Companion", "Factory", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AdditionalReviewV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/di/AdditionalReviewV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/di/AdditionalReviewV2Component;", "getInstance", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AdditionalReviewV2Component getInstance$lambda$0(C7475g c7475g) {
            return DaggerAdditionalReviewV2Component.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class));
        }

        @NotNull
        public final C7473e<AdditionalReviewV2Component> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AdditionalReviewV2Component.class), new a(storage, 7));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/di/AdditionalReviewV2Component$Factory;", "", "create", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/di/AdditionalReviewV2Component;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        AdditionalReviewV2Component create(@NotNull NetworkComponentApi networkComponentApi, @NotNull ActionComponentApi actionComponentApi);
    }

    @NotNull
    HandlersInhibitor handlersInhibitor();

    @NotNull
    AdditionalReviewV2Mapper mapper();

    @NotNull
    Pc.a<AdditionalReviewV2ViewModel> viewModelProvider();
}
