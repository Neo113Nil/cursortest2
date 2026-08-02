package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di;

import DD.a;
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
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormButtonMapper;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormMapper;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModelImpl;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \u001f2\u00060\u0001j\u0002`\u0002:\u0002\u001f J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00060\rj\u0002`\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H'¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/di/ReportAbuseFormComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/core/ReportAbuseFormMapper;", "mapper", "()Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/core/ReportAbuseFormMapper;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/core/ReportAbuseFormButtonMapper;", "buttonMapper", "()Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/core/ReportAbuseFormButtonMapper;", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModelImpl;", "getViewModel", "()LPc/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "getUgcCachedActionsSharedViewModel", "ugcCachedActionsSharedViewModel", "Companion", "Factory", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReportAbuseFormComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/di/ReportAbuseFormComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/di/ReportAbuseFormComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReportAbuseFormComponent getInstance$lambda$0(C7475g c7475g) {
            return DaggerReportAbuseFormComponent.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class), (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class), (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class));
        }

        @NotNull
        public final C7473e<ReportAbuseFormComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ReportAbuseFormComponent.class), new a(storage, 3));
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/di/ReportAbuseFormComponent$Factory;", "", "create", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/di/ReportAbuseFormComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        ReportAbuseFormComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull RetainComposerComponentApi retainComposerComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull AndroidPlatformComponentDependencies androidPlatformComponentDependencies);
    }

    @NotNull
    ReportAbuseFormButtonMapper buttonMapper();

    @NotNull
    AppType getAppType();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    Pc.a<UgcCachedActionsSharedViewModel> getUgcCachedActionsSharedViewModel();

    @NotNull
    Pc.a<ReportAbuseFormViewModelImpl> getViewModel();

    @NotNull
    ReportAbuseFormMapper mapper();
}
