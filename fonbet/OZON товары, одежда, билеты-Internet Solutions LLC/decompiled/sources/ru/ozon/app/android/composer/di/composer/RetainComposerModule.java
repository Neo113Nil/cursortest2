package ru.ozon.app.android.composer.di.composer;

import android.content.Context;
import gi.C6739a;
import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7474f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.k;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.imageprefetch.ComposerImagePrefetcherImpl;
import ru.ozon.app.android.composer.imageprefetch.ComposerImagePrefetcherStub;
import ru.ozon.app.android.composer.imageprefetch.flags.PrefetchImagesCountFlag;
import ru.ozon.app.android.composer.imageprefetch.flags.PrefetchImagesEnabledFlag;
import ru.ozon.app.android.composer.widgets.store.fast.FastWidgetStore;
import ru.ozon.app.android.composer.widgets.store.fast.FastWidgetStore2;
import ru.ozon.app.android.composer.widgets.store.fast.WidgetStoreDecorator;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import w10.InterfaceC10409a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/composer/di/composer/RetainComposerModule;", "", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RetainComposerModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00070\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/di/composer/RetainComposerModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Ll20/c;", "imagePrefetcherStorage", "Lw10/a;", "Lru/ozon/app/android/composer/imageprefetch/ComposerImagePrefetcher;", "provideComposerImagePrefetcher", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;)Lw10/a;", "provideImagePrefetchInfoProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore;", "widgetStore", "Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore2;", "widgetStore2", "Ln20/k;", "Lm20/a;", "provideWidgetStoreDelegate", "(Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore;Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore2;)Ln20/k;", "Landroid/content/Context;", "context", "Lk20/g;", "provideComposerWidgetComponentStorage", "(Landroid/content/Context;)Lk20/g;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC10409a provideComposerImagePrefetcher(@NotNull FeatureService featureService, @NotNull ImagePrefetchInfoProviderStorage<c> imagePrefetcherStorage) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(imagePrefetcherStorage, "imagePrefetcherStorage");
            return featureService.getBooleanKey(PrefetchImagesEnabledFlag.INSTANCE) ? new ComposerImagePrefetcherImpl(featureService, new ImagePrefetcher(featureService.getIntKey(PrefetchImagesCountFlag.INSTANCE), imagePrefetcherStorage)) : new ComposerImagePrefetcherStub();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.app.android.composer.di.composer.RetainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1] */
        @NotNull
        public final C7475g provideComposerWidgetComponentStorage(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C7475g(new InterfaceC7474f() { // from class: ru.ozon.app.android.composer.di.composer.RetainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1
                @Override // k20.InterfaceC7474f
                public <C extends InterfaceC6958a> C getComponent(Class<? extends C> key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    C cast = key.cast(C6739a.a(context, key).getDependencyStorage().b(key));
                    Intrinsics.checkNotNullExpressionValue(cast, "cast(...)");
                    return cast;
                }

                @Override // k20.InterfaceC7474f
                public <C extends InterfaceC6958a> boolean hasComponent(Class<? extends C> key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    return C6739a.a(context, key).getDependencyStorage().a(key);
                }
            });
        }

        @NotNull
        public final ImagePrefetchInfoProviderStorage<c> provideImagePrefetchInfoProviderStorage() {
            return new ImagePrefetchInfoProviderStorage<>();
        }

        @NotNull
        public final k<InterfaceC8046a<?, ? extends c>> provideWidgetStoreDelegate(@NotNull FastWidgetStore widgetStore, @NotNull FastWidgetStore2 widgetStore2) {
            Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
            Intrinsics.checkNotNullParameter(widgetStore2, "widgetStore2");
            return new WidgetStoreDecorator(widgetStore, widgetStore2);
        }

        private Companion() {
        }
    }
}
