package ru.ozon.app.android.composer.di.page;

import AI.c;
import Gr.C3126a;
import Gr.C3127b;
import Ug.a;
import android.content.Context;
import androidx.lifecycle.w0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Set;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.di.action.ActionHandlerComponent;
import ru.ozon.app.android.composer.di.composer.DaggerRetainComposerComponent;
import ru.ozon.app.android.composer.di.composer.RetainAnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerAnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponent;
import ru.ozon.app.android.composer.di.composer.RetainComposerPagePerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/composer/di/page/RetainComposerViewModel;", "Landroidx/lifecycle/w0;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/composer/di/Widget;", "widgets", "", "isPageViewTrackingEnabled", "<init>", "(Landroid/content/Context;Ljava/util/Set;Z)V", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "retainComponent", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "getRetainComponent", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "Lk20/g;", "componentStorage", "Lk20/g;", "getComponentStorage", "()Lk20/g;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetainComposerViewModel extends w0 {

    @NotNull
    private final C7475g componentStorage;

    @NotNull
    private final RetainComposerComponent retainComponent;

    public RetainComposerViewModel(@NotNull Context context, @NotNull Set<Widget> widgets, boolean z11) {
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
        C7475g composerWidgetComponentStorage = create.getComposerWidgetComponentStorage();
        this.componentStorage = composerWidgetComponentStorage;
        composerWidgetComponentStorage.b(RetainAnalyticsComponentApi.class, new C3126a(this, 0));
        composerWidgetComponentStorage.b(a.class, new C3127b(this, 0));
        composerWidgetComponentStorage.b(RetainImagePrefetchComponentApi.class, new c(this, 10));
        composerWidgetComponentStorage.b(RetainComposerAnalyticsComponentApi.class, new Gr.c(this, 0));
        composerWidgetComponentStorage.b(RetainComposerPerformanceComponentApi.class, new JS.a(this, 16));
        composerWidgetComponentStorage.b(RetainComposerPagePerformanceComponentApi.class, new CE.a(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6958a lambda$6$lambda$1(RetainComposerViewModel retainComposerViewModel) {
        return new ActionHandlerComponent(retainComposerViewModel.componentStorage);
    }

    @NotNull
    public final C7475g getComponentStorage() {
        return this.componentStorage;
    }

    @NotNull
    public final RetainComposerComponent getRetainComponent() {
        return this.retainComponent;
    }
}
