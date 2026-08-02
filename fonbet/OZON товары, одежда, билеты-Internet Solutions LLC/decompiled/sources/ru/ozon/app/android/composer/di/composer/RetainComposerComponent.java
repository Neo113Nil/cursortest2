package ru.ozon.app.android.composer.di.composer;

import K00.a;
import WZ.l;
import java.util.Set;
import k20.C7475g;
import kotlin.Metadata;
import l20.c;
import m20.InterfaceC8046a;
import n20.k;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.WidgetTokenizedAnalytics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerScreenFactory;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;
import ru.ozon.app.android.composer.view.ComposerViewInitBlockProvider;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001#J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\n0\t0\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerAnalyticsComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainImagePrefetchComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerPagePerformanceComponentApi;", "LK00/a;", "getNetwork", "()LK00/a;", "Ln20/k;", "Lm20/a;", "Ll20/c;", "getWidgetStore", "()Ln20/k;", "Lru/ozon/app/android/composer/ComposerScreenFactory;", "getComposerScreenFactory", "()Lru/ozon/app/android/composer/ComposerScreenFactory;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;", "getWidgetTokenizedAnalytics", "()Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/composer/view/ComposerViewInitBlockProvider;", "getViewInitBlockProvider", "()Lru/ozon/app/android/composer/view/ComposerViewInitBlockProvider;", "Lk20/g;", "getComposerWidgetComponentStorage", "()Lk20/g;", "Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "getComposerReferencesFactory", "()Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "Factory", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RetainComposerComponent extends RetainComposerAnalyticsComponentApi, RetainComposerPerformanceComponentApi, RetainImagePrefetchComponentApi, RetainComposerPagePerformanceComponentApi {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lru/ozon/app/android/composer/di/composer/RetainComposerComponent$Factory;", "", "create", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "widgets", "", "Lru/ozon/app/android/composer/di/Widget;", "isPageViewTrackingEnabled", "", "composerComponent", "Lru/ozon/app/android/composer/di/ComposerComponent;", "composerDebugMenuHostApiComponent", "Lru/ozon/app/android/storage/di/ComposerDebugMenuHostApiComponent;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        RetainComposerComponent create(@NotNull Set<Widget> widgets, boolean isPageViewTrackingEnabled, @NotNull ComposerComponent composerComponent, @NotNull ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent);
    }

    @NotNull
    ComposerNavigator getComposerNavigator();

    @NotNull
    ComposerReferencesFactory getComposerReferencesFactory();

    @NotNull
    ComposerScreenFactory getComposerScreenFactory();

    @NotNull
    C7475g getComposerWidgetComponentStorage();

    @NotNull
    a getNetwork();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    ComposerViewInitBlockProvider getViewInitBlockProvider();

    @NotNull
    k<InterfaceC8046a<?, ? extends c>> getWidgetStore();

    @NotNull
    WidgetTokenizedAnalytics getWidgetTokenizedAnalytics();
}
