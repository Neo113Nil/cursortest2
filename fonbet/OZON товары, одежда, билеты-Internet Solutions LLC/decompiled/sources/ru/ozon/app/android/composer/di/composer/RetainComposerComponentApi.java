package ru.ozon.app.android.composer.di.composer;

import K00.i;
import QZ.a;
import hi.InterfaceC6958a;
import j10.InterfaceC7238a;
import j10.h;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.WidgetTokenizedAnalytics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0013\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#H&¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0'H&¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;", "getWidgetTokenizedAnalytics", "()Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "getComposerStore", "()Lj10/a;", "LI00/a;", "getComposerUpdateMapper", "()LI00/a;", "Lj10/h$a;", "getComposerOverlayItemsHelper", "()Lj10/h$a;", "Lru/ozon/composer/ui/widget/a;", "getComposerWidgetFactory", "()Lru/ozon/composer/ui/widget/a;", "Ll10/b;", "getComposerController", "()Ll10/b;", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "()Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "getComposerReferencesFactory", "()Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "LQZ/a;", "Ll20/a;", "getComposer", "()LQZ/a;", "LK00/i;", "getComposerRepository", "()LK00/i;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RetainComposerComponentApi extends InterfaceC6958a {
    @NotNull
    a<? extends C7854a> getComposer();

    @NotNull
    InterfaceC7851b getComposerController();

    @NotNull
    ComposerNavigator getComposerNavigator();

    @NotNull
    h.a<l> getComposerOverlayItemsHelper();

    @NotNull
    ComposerReferencesFactory getComposerReferencesFactory();

    @NotNull
    i<l> getComposerRepository();

    @NotNull
    InterfaceC7238a<l> getComposerStore();

    @NotNull
    I00.a<l> getComposerUpdateMapper();

    @NotNull
    ru.ozon.composer.ui.widget.a getComposerWidgetFactory();

    @NotNull
    WZ.l getTokenizedAnalytics();

    @NotNull
    f getViewedPond();

    @NotNull
    WidgetTokenizedAnalytics getWidgetTokenizedAnalytics();
}
