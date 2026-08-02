package ru.ozon.app.android.composer.references;

import Sg.a;
import WZ.l;
import a00.C4911f;
import a00.h;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.ComposerViewPoolProviderImpl;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.view.multiframebinder.ScrollStateListener;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u001a\u001a\u00020\u00192\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/composer/references/ComposerReferencesFactoryImpl;", "Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LWZ/l;", "tokenizedAnalytics", "Lk20/g;", "composerWidgetComponentStorage", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LPc/a;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinderProvider", "LIb/a;", "Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;", "scrollStateListener", "<init>", "(Lru/ozon/app/android/composer/ComposerNavigator;LWZ/l;Lk20/g;LSg/a;LPc/a;LIb/a;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "create", "(La00/f;La00/h;)Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/ComposerNavigator;", "LWZ/l;", "Lk20/g;", "LSg/a;", "LPc/a;", "LIb/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerReferencesFactoryImpl implements ComposerReferencesFactory {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final C7475g composerWidgetComponentStorage;

    @NotNull
    private final Pc.a<FrameBinder> frameBinderProvider;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final Ib.a<ScrollStateListener> scrollStateListener;

    @NotNull
    private final l tokenizedAnalytics;

    public ComposerReferencesFactoryImpl(@NotNull ComposerNavigator navigator, @NotNull l tokenizedAnalytics, @NotNull C7475g composerWidgetComponentStorage, @NotNull a analyticsScreenStorage, @NotNull Pc.a<FrameBinder> frameBinderProvider, @NotNull Ib.a<ScrollStateListener> scrollStateListener) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerWidgetComponentStorage, "composerWidgetComponentStorage");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(frameBinderProvider, "frameBinderProvider");
        Intrinsics.checkNotNullParameter(scrollStateListener, "scrollStateListener");
        this.navigator = navigator;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.composerWidgetComponentStorage = composerWidgetComponentStorage;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.frameBinderProvider = frameBinderProvider;
        this.scrollStateListener = scrollStateListener;
    }

    @Override // ru.ozon.app.android.composer.references.ComposerReferencesFactory
    @NotNull
    public ComposerReferences create(@NotNull C4911f container, @NotNull h viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        return new ComposerReferences(container, viewModelOwnerProvider, this.navigator, this.tokenizedAnalytics, this.analyticsScreenStorage, new ComposerViewPoolProviderImpl(), this.frameBinderProvider, this.scrollStateListener, this.composerWidgetComponentStorage);
    }
}
