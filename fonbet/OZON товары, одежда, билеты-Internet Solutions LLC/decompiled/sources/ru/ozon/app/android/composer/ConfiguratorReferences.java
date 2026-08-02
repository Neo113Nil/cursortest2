package ru.ozon.app.android.composer;

import WZ.l;
import a00.C4911f;
import a00.h;
import j10.h;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00060\u0016j\u0002`\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010 \u001a\u00060\u001cj\u0002`\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0015\u0010)\u001a\u00060%j\u0002`&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u00106\u001a\b\u0012\u0004\u0012\u000203028F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/composer/ConfiguratorReferences;", "", "Lru/ozon/app/android/composer/ComposerFragmentController;", "fragmentController", "<init>", "(Lru/ozon/app/android/composer/ComposerFragmentController;)V", "Lru/ozon/app/android/composer/ComposerFragmentController;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "La00/f;", "getOwnerContainer", "()La00/f;", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "La00/h;", "getViewModelOwnerProvider", "()La00/h;", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LSg/a;", "getAnalyticsScreenStorage", "()LSg/a;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "getController", "()Ll10/b;", "controller", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerViewPoolProvider;", "getComposerViewPoolProvider", "()Lru/ozon/app/android/composer/ComposerViewPoolProvider;", "composerViewPoolProvider", "Lk20/g;", "getComposerWidgetComponentStorage", "()Lk20/g;", "composerWidgetComponentStorage", "Lj10/h$b;", "Lru/ozon/composer/ui/widget/l;", "getVoHelper", "()Lj10/h$b;", "voHelper", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfiguratorReferences {

    @NotNull
    private final Sg.a analyticsScreenStorage;

    @NotNull
    private final ComposerFragmentController fragmentController;

    @NotNull
    private final C4911f ownerContainer;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final h viewModelOwnerProvider;

    public ConfiguratorReferences(@NotNull ComposerFragmentController fragmentController) {
        Intrinsics.checkNotNullParameter(fragmentController, "fragmentController");
        this.fragmentController = fragmentController;
        ComposerReferences references = fragmentController.getReferences();
        this.references = references;
        this.ownerContainer = references.getContainer();
        this.viewModelOwnerProvider = references.getViewModelOwnerProvider();
        this.analyticsScreenStorage = fragmentController.getAnalyticsScreenStorage();
    }

    @NotNull
    public final Sg.a getAnalyticsScreenStorage() {
        return this.analyticsScreenStorage;
    }

    @NotNull
    public final ComposerViewPoolProvider getComposerViewPoolProvider() {
        return this.references.getComposerViewPoolProvider();
    }

    @NotNull
    public final C7475g getComposerWidgetComponentStorage() {
        return this.references.getComposerWidgetComponentStorage();
    }

    @NotNull
    public final InterfaceC7851b getController() {
        return this.references.getController();
    }

    @NotNull
    public final ComposerNavigator getNavigator() {
        return this.references.getNavigator();
    }

    @NotNull
    public final C4911f getOwnerContainer() {
        return this.ownerContainer;
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.references.getTokenizedAnalytics();
    }

    @NotNull
    public final h getViewModelOwnerProvider() {
        return this.viewModelOwnerProvider;
    }

    @NotNull
    public final h.b<ru.ozon.composer.ui.widget.l> getVoHelper() {
        return this.fragmentController.getComposerItemsHelper();
    }
}
