package ru.ozon.app.android.composer;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import a00.C4911f;
import a00.h;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.view.multiframebinder.ScrollStateListener;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bm\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010!\u001a\u00028\u0000\"\f\b\u0000\u0010\u001e*\u00060\u001cj\u0002`\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00028\u0000\"\f\b\u0000\u0010\u001e*\u00060\u001cj\u0002`\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b#\u0010\"R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R$\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R$\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00109\u0012\u0004\b<\u00101\u001a\u0004\b:\u0010;R&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010=\u0012\u0004\b@\u00101\u001a\u0004\b>\u0010?R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b!\u0010GR\u001b\u0010M\u001a\u00020I8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010F\u001a\u0004\bP\u0010QR!\u0010X\u001a\b\u0012\u0004\u0012\u00020T0S8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010F\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lru/ozon/app/android/composer/ComposerReferences;", "Ll10/e;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "Lru/ozon/app/android/composer/ComposerViewPoolProvider;", "composerViewPoolProvider", "LPc/a;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinderProvider", "LIb/a;", "Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;", "scrollStateListener", "Lk20/g;", "composerWidgetComponentStorage", "<init>", "(La00/f;La00/h;Lru/ozon/app/android/composer/ComposerNavigator;LWZ/l;LSg/a;Lru/ozon/app/android/composer/ComposerViewPoolProvider;LPc/a;LIb/a;Lk20/g;)V", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "C", "Ljava/lang/Class;", "clazz", "getComponent", "(Ljava/lang/Class;)Lhi/a;", "getWidgetComponent", "La00/f;", "getContainer", "()La00/f;", "La00/h;", "getViewModelOwnerProvider", "()La00/h;", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "getTokenizedAnalytics$annotations", "()V", "LSg/a;", "getAnalyticsScreenStorage", "()LSg/a;", "getAnalyticsScreenStorage$annotations", "Lru/ozon/app/android/composer/ComposerViewPoolProvider;", "getComposerViewPoolProvider", "()Lru/ozon/app/android/composer/ComposerViewPoolProvider;", "LPc/a;", "getFrameBinderProvider", "()LPc/a;", "getFrameBinderProvider$annotations", "LIb/a;", "getScrollStateListener", "()LIb/a;", "getScrollStateListener$annotations", "Lk20/g;", "getComposerWidgetComponentStorage", "()Lk20/g;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "component$delegate", "LSc/j;", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "component", "Ll10/b;", "controller$delegate", "getController", "()Ll10/b;", "controller", "Lru/ozon/composer/ui/widget/a;", "widgetsFactory$delegate", "getWidgetsFactory", "()Lru/ozon/composer/ui/widget/a;", "widgetsFactory", "LI00/a;", "Lru/ozon/composer/ui/widget/l;", "mapper$delegate", "getMapper", "()LI00/a;", "mapper", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerReferences implements e {
    public static final int $stable = 8;

    @NotNull
    private final Sg.a analyticsScreenStorage;

    /* renamed from: component$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j component;

    @NotNull
    private final ComposerViewPoolProvider composerViewPoolProvider;

    @NotNull
    private final C7475g composerWidgetComponentStorage;

    @NotNull
    private final C4911f container;

    /* renamed from: controller$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j controller;

    @NotNull
    private final Pc.a<FrameBinder> frameBinderProvider;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final Ib.a<ScrollStateListener> scrollStateListener;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final h viewModelOwnerProvider;

    /* renamed from: widgetsFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widgetsFactory;

    public ComposerReferences(@NotNull C4911f container, @NotNull h viewModelOwnerProvider, @NotNull ComposerNavigator navigator, @NotNull l tokenizedAnalytics, @NotNull Sg.a analyticsScreenStorage, @NotNull ComposerViewPoolProvider composerViewPoolProvider, @NotNull Pc.a<FrameBinder> frameBinderProvider, @NotNull Ib.a<ScrollStateListener> scrollStateListener, @NotNull C7475g composerWidgetComponentStorage) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(composerViewPoolProvider, "composerViewPoolProvider");
        Intrinsics.checkNotNullParameter(frameBinderProvider, "frameBinderProvider");
        Intrinsics.checkNotNullParameter(scrollStateListener, "scrollStateListener");
        Intrinsics.checkNotNullParameter(composerWidgetComponentStorage, "composerWidgetComponentStorage");
        this.container = container;
        this.viewModelOwnerProvider = viewModelOwnerProvider;
        this.navigator = navigator;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.composerViewPoolProvider = composerViewPoolProvider;
        this.frameBinderProvider = frameBinderProvider;
        this.scrollStateListener = scrollStateListener;
        this.composerWidgetComponentStorage = composerWidgetComponentStorage;
        this.component = k.b(new ComposerReferences$component$2(this));
        this.controller = k.b(new ComposerReferences$controller$2(this));
        this.widgetsFactory = k.b(new ComposerReferences$widgetsFactory$2(this));
        this.mapper = k.b(new ComposerReferences$mapper$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetainComposerComponentApi getComponent() {
        return (RetainComposerComponentApi) this.component.getValue();
    }

    @NotNull
    public final Sg.a getAnalyticsScreenStorage() {
        return this.analyticsScreenStorage;
    }

    @NotNull
    public final ComposerViewPoolProvider getComposerViewPoolProvider() {
        return this.composerViewPoolProvider;
    }

    @NotNull
    public final C7475g getComposerWidgetComponentStorage() {
        return this.composerWidgetComponentStorage;
    }

    @NotNull
    public final C4911f getContainer() {
        return this.container;
    }

    @NotNull
    public final InterfaceC7851b getController() {
        return (InterfaceC7851b) this.controller.getValue();
    }

    @NotNull
    public final Pc.a<FrameBinder> getFrameBinderProvider() {
        return this.frameBinderProvider;
    }

    @NotNull
    public final I00.a<ru.ozon.composer.ui.widget.l> getMapper() {
        return (I00.a) this.mapper.getValue();
    }

    @NotNull
    public final ComposerNavigator getNavigator() {
        return this.navigator;
    }

    @NotNull
    public final Ib.a<ScrollStateListener> getScrollStateListener() {
        return this.scrollStateListener;
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @NotNull
    public final h getViewModelOwnerProvider() {
        return this.viewModelOwnerProvider;
    }

    @NotNull
    public final <C extends InterfaceC6958a> C getWidgetComponent(@NotNull Class<C> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (C) this.composerWidgetComponentStorage.getComponent(clazz);
    }

    @NotNull
    public final ru.ozon.composer.ui.widget.a getWidgetsFactory() {
        return (ru.ozon.composer.ui.widget.a) this.widgetsFactory.getValue();
    }

    @NotNull
    public final <C extends InterfaceC6958a> C getComponent(@NotNull Class<C> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (C) this.composerWidgetComponentStorage.getComponent(clazz);
    }
}
