package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewGallery;

import Sc.InterfaceC4008j;
import a00.C4911f;
import android.content.res.Configuration;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import gk0.o;
import gk0.p;
import gk0.q;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdpvideomolecule.R$layout;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$id;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewGallery/ReviewGalleryV2Configurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "preCreateView", "", "isEnabled", "setupFullScreen", "(Z)V", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder$delegate", "LSc/j;", "getReportAbuseResultNotificationBinder", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewGallery/FullScreenController;", "fullScreenController$delegate", "getFullScreenController", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewGallery/FullScreenController;", "fullScreenController", "", "", "socialHeaderCellSubViewsSet", "Ljava/util/Set;", "", "getFragmentTag", "()Ljava/lang/String;", "fragmentTag", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReviewGalleryV2Configurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final Set<Integer> socialHeaderCellSubViewsSet;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: reportAbuseResultNotificationBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j reportAbuseResultNotificationBinder = DelegatesKt.lazyUnsafe(new ReviewGalleryV2Configurator$reportAbuseResultNotificationBinder$2(this));

    /* renamed from: fullScreenController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fullScreenController = LazyUtilsKt.unsafeLazy(ReviewGalleryV2Configurator$fullScreenController$2.INSTANCE);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewGallery/ReviewGalleryV2Configurator$Companion;", "", "<init>", "()V", "PRE_CREATE_VIEW_COUNT", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReviewGalleryV2Configurator() {
        Integer[] elements = {Integer.valueOf(R$id.cell_left_icon), Integer.valueOf(R$id.cell_center_title), Integer.valueOf(R$id.cell_right_button)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.socialHeaderCellSubViewsSet = C7705l.j0(elements);
    }

    private final String getFragmentTag() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) {
            return null;
        }
        return c11.toString();
    }

    private final FullScreenController getFullScreenController() {
        return (FullScreenController) this.fullScreenController.getValue();
    }

    private final ReportAbuseResultNotificationBinder getReportAbuseResultNotificationBinder() {
        return (ReportAbuseResultNotificationBinder) this.reportAbuseResultNotificationBinder.getValue();
    }

    private final void preCreateView() {
        String fragmentTag = getFragmentTag();
        if (fragmentTag != null) {
            r i11 = getContainer().i();
            q.f64554a.f(fragmentTag, C7714v.b0(new p(6, new ReviewGalleryV2Configurator$preCreateView$1$infos$1(i11, this)), new o(R$layout.view_video_molecule_player, 6, i11)));
        }
    }

    private final void setupFullScreen(boolean isEnabled) {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) {
            return;
        }
        if (isEnabled) {
            FullScreenController.clearWindow$default(getFullScreenController(), c11, true, false, 4, null);
        } else {
            getFullScreenController().restoreWindow(c11);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        preCreateView();
        getReportAbuseResultNotificationBinder().setupFragmentResultListener(false);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        View view;
        RecyclerView composerRecyclerViewOrNull;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        setupFullScreen(true);
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null || (view = c11.getView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) {
            return;
        }
        composerRecyclerViewOrNull.invalidateItemDecorations();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getReportAbuseResultNotificationBinder().clearFragmentResultListener();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setupFullScreen(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setupFullScreen(false);
    }
}
