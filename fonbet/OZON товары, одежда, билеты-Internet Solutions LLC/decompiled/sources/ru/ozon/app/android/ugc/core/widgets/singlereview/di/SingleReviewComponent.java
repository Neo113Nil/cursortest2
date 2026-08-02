package ru.ozon.app.android.ugc.core.widgets.singlereview.di;

import DV.a;
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
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ugc.core.widgets.singlereview.SingleReviewMapper;
import ru.ozon.app.android.video.di.VideoComponentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0002\t\nJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/di/SingleReviewComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewMapper;", "mapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewMapper;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Companion", "Factory", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SingleReviewComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/di/SingleReviewComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/di/SingleReviewComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleReviewComponent getInstance$lambda$0(C7475g c7475g) {
            return DaggerSingleReviewComponent.factory().create((ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class), (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class), (RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class), (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class), (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class));
        }

        @NotNull
        public final C7473e<SingleReviewComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SingleReviewComponent.class), new a(storage, 12));
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/di/SingleReviewComponent$Factory;", "", "create", "Lru/ozon/app/android/ugc/core/widgets/singlereview/di/SingleReviewComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        SingleReviewComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull NetworkComponentApi networkComponentApi, @NotNull RetainComposerComponentApi retainComposerComponentApi, @NotNull VideoComponentApi videoComponentApi, @NotNull RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, @NotNull StorageComponentApi storageComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull ActionComponentApi actionComponentApi);
    }

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    SingleReviewMapper mapper();
}
