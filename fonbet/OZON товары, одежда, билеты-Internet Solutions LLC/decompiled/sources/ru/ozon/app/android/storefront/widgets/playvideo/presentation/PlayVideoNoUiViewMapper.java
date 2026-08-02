package ru.ozon.app.android.storefront.widgets.playvideo.presentation;

import AM.a;
import android.view.LayoutInflater;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.storefront.databinding.PlayVideoWidgetBinding;
import ru.ozon.app.android.storefront.widgets.playvideo.data.models.PlayVideoDTO;
import ru.ozon.app.android.storefront.widgets.playvideo.di.PlayVideoWidgetComponent;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.models.MapperKt;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.models.PlayVideoVO;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoViewModel;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/storefront/widgets/playvideo/di/PlayVideoWidgetComponent;", "Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoDTO;", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/models/PlayVideoVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoViewHolderProvider;", "getVhProvider", "()Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoViewHolderProvider;", "vhProvider", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayVideoNoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<PlayVideoWidgetComponent, PlayVideoDTO, PlayVideoVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final PlayVideoViewHolderProvider getVhProvider() {
        return new PlayVideoViewHolderProvider(component().getVideoMoleculePlayerDelegateProvider(), component().getCustomActionHandlersFactory().create(ShareLinkActionHandler.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayVideoWidgetComponent widgetComponent$lambda$1(C7475g c7475g) {
        return new PlayVideoWidgetComponent(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<PlayVideoVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        PlayVideoWidgetBinding inflate = PlayVideoWidgetBinding.inflate(LayoutInflater.from(container.L()), container.Z(), true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return getVhProvider().provide(container, inflate, (PlayVideoViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoNoUiViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PlayVideoViewModel playVideoViewModel = PlayVideoNoUiViewMapper.this.component().getPlayVideoViewModel();
                Intrinsics.g(playVideoViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return playVideoViewModel;
            }
        }).a(PlayVideoViewModel.class));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PlayVideoWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(PlayVideoWidgetComponent.class), new a(storage, 2));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PlayVideoVO> map(@NotNull PlayVideoDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(MapperKt.toVO(state));
    }
}
