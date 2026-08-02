package ru.ozon.app.android.storefront.stories.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.storefront.stories.di.PlayStoriesV3Component;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.core.PlayStoriesMapper;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.StoryV3UpdateStore;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/stories/di/PlayStoriesV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/core/PlayStoriesMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/core/PlayStoriesMapper;", "mapper", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator$delegate", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LPc/a;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3ViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayStoriesV3Component implements InterfaceC6958a {

    @NotNull
    private final ComposerComponentApi composerComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j navigator;

    @NotNull
    private final a<PlayStoriesV3ViewModel> viewModelProvider;

    public PlayStoriesV3Component(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.composerComponentApi = (ComposerComponentApi) storage.getComponent(ComposerComponentApi.class);
        this.mapper = k.b(PlayStoriesV3Component$mapper$2.INSTANCE);
        this.navigator = k.b(new PlayStoriesV3Component$navigator$2(this));
        this.viewModelProvider = new a() { // from class: cK.a
            @Override // Pc.a
            public final Object get() {
                PlayStoriesV3ViewModel viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = PlayStoriesV3Component.viewModelProvider$lambda$0();
                return viewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayStoriesV3ViewModel viewModelProvider$lambda$0() {
        return new PlayStoriesV3ViewModel(new StoryV3UpdateStore());
    }

    @NotNull
    public final PlayStoriesMapper getMapper() {
        return (PlayStoriesMapper) this.mapper.getValue();
    }

    @NotNull
    public final ComposerNavigator getNavigator() {
        return (ComposerNavigator) this.navigator.getValue();
    }

    @NotNull
    public final a<PlayStoriesV3ViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
