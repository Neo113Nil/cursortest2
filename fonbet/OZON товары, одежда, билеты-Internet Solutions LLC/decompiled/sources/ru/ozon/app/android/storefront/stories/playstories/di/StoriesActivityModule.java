package ru.ozon.app.android.storefront.stories.playstories.di;

import K00.i;
import android.app.Application;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerDependenciesProvider;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/di/StoriesActivityModule;", "", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class StoriesActivityModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/di/StoriesActivityModule$Companion;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "Lru/ozon/app/android/composer/di/Widget;", "widgets", "Lru/ozon/app/android/composer/ComposerDependenciesProvider;", "provideRetainComposerDependenciesProvider", "(Landroid/app/Application;Ljava/util/Set;)Lru/ozon/app/android/composer/ComposerDependenciesProvider;", "composerDependenciesProvider", "Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "provideComposerReferencesProvider", "(Lru/ozon/app/android/composer/ComposerDependenciesProvider;)Lru/ozon/app/android/composer/references/ComposerReferencesFactory;", "LK00/i;", "Lru/ozon/composer/ui/widget/l;", "provideComposerRepository", "(Lru/ozon/app/android/composer/ComposerDependenciesProvider;)LK00/i;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComposerReferencesFactory provideComposerReferencesProvider(@NotNull ComposerDependenciesProvider composerDependenciesProvider) {
            Intrinsics.checkNotNullParameter(composerDependenciesProvider, "composerDependenciesProvider");
            return composerDependenciesProvider.createComposerReferencesFactory();
        }

        @NotNull
        public final i<l> provideComposerRepository(@NotNull ComposerDependenciesProvider composerDependenciesProvider) {
            Intrinsics.checkNotNullParameter(composerDependenciesProvider, "composerDependenciesProvider");
            return composerDependenciesProvider.createComposerRepository();
        }

        @NotNull
        public final ComposerDependenciesProvider provideRetainComposerDependenciesProvider(@NotNull Application application, @NotNull Set<Widget> widgets) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(widgets, "widgets");
            return new ComposerDependenciesProvider(application, widgets, false, 4, null);
        }

        private Companion() {
        }
    }
}
