package ru.ozon.app.android.composer;

import Br.d;
import K00.i;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Set;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerDependenciesProvider;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.di.composer.DaggerRetainComposerComponent;
import ru.ozon.app.android.composer.di.composer.RetainAnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerAnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponent;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentFactory;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/composer/ComposerDependenciesProvider;", "", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/composer/di/Widget;", "widgets", "", "isPageViewTrackingEnabled", "<init>", "(Landroid/content/Context;Ljava/util/Set;Z)V", "LK00/i;", "Lru/ozon/composer/ui/widget/l;", "createComposerRepository", "()LK00/i;", "Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "createComposerReferencesFactory", "()Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "retainComponent", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "repository$delegate", "LSc/j;", "getRepository", "repository", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposerDependenciesProvider {

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j repository;

    @NotNull
    private final RetainComposerComponent retainComponent;

    public ComposerDependenciesProvider(@NotNull Context context, @NotNull Set<Widget> widgets, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        RetainComposerComponent.Factory factory = DaggerRetainComposerComponent.factory();
        if (ComposerComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponent is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, ComposerComponent.class).getDependencyStorage();
        if (ComposerComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponent is not DiComponent");
        }
        ComposerComponent composerComponent = (ComposerComponent) dependencyStorage.b(ComposerComponent.class);
        if (ComposerDebugMenuHostApiComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerDebugMenuHostApiComponent is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, ComposerDebugMenuHostApiComponent.class).getDependencyStorage();
        if (ComposerDebugMenuHostApiComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerDebugMenuHostApiComponent is not DiComponent");
        }
        RetainComposerComponent create = factory.create(widgets, z11, composerComponent, (ComposerDebugMenuHostApiComponent) dependencyStorage2.b(ComposerDebugMenuHostApiComponent.class));
        this.retainComponent = create;
        this.repository = k.b(new ComposerDependenciesProvider$repository$2(this));
        final RetainComposerComponentFactory retainComposerComponentFactory = new RetainComposerComponentFactory(create);
        C7475g composerWidgetComponentStorage = create.getComposerWidgetComponentStorage();
        composerWidgetComponentStorage.b(RetainComposerComponentApi.class, new InterfaceC7469a() { // from class: Br.a
            @Override // k20.InterfaceC7469a
            public final InterfaceC6958a component() {
                InterfaceC6958a create2;
                create2 = RetainComposerComponentFactory.this.create();
                return create2;
            }
        });
        composerWidgetComponentStorage.b(RetainAnalyticsComponentApi.class, new InterfaceC7469a() { // from class: Br.b
            @Override // k20.InterfaceC7469a
            public final InterfaceC6958a component() {
                InterfaceC6958a interfaceC6958a;
                interfaceC6958a = ComposerDependenciesProvider.this.retainComponent;
                return interfaceC6958a;
            }
        });
        composerWidgetComponentStorage.b(RetainImagePrefetchComponentApi.class, new InterfaceC7469a() { // from class: Br.c
            @Override // k20.InterfaceC7469a
            public final InterfaceC6958a component() {
                InterfaceC6958a interfaceC6958a;
                interfaceC6958a = ComposerDependenciesProvider.this.retainComponent;
                return interfaceC6958a;
            }
        });
        composerWidgetComponentStorage.b(RetainComposerAnalyticsComponentApi.class, new d(this, 0));
        composerWidgetComponentStorage.b(RetainComposerPerformanceComponentApi.class, new InterfaceC7469a() { // from class: Br.e
            @Override // k20.InterfaceC7469a
            public final InterfaceC6958a component() {
                InterfaceC6958a interfaceC6958a;
                interfaceC6958a = ComposerDependenciesProvider.this.retainComponent;
                return interfaceC6958a;
            }
        });
    }

    private final i<l> getRepository() {
        return (i) this.repository.getValue();
    }

    @NotNull
    public final ComposerReferencesFactory createComposerReferencesFactory() {
        return this.retainComponent.getComposerReferencesFactory();
    }

    @NotNull
    public final i<l> createComposerRepository() {
        return getRepository();
    }

    public /* synthetic */ ComposerDependenciesProvider(Context context, Set set, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, set, (i11 & 4) != 0 ? true : z11);
    }
}
