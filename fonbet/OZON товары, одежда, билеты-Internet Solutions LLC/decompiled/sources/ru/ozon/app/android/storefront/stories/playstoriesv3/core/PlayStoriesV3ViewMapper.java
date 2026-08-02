package ru.ozon.app.android.storefront.stories.playstoriesv3.core;

import Gm.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.viewpager2.widget.ViewPager2;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.storefront.stories.di.PlayStoriesV3Component;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.PlayStoriesV3DTO;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.PlayStoriesV3VO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/core/PlayStoriesV3ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/storefront/stories/di/PlayStoriesV3Component;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/PlayStoriesV3DTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/PlayStoriesV3VO;", "<init>", "()V", "Ll10/i;", "container", "Landroidx/viewpager2/widget/ViewPager2;", "createViewPager", "(Ll10/i;)Landroidx/viewpager2/widget/ViewPager2;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/PlayStoriesV3DTO;Ll20/d;)Ljava/util/List;", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayStoriesV3ViewMapper extends OverlayWidgetScreenViewItemMapper2<PlayStoriesV3Component, PlayStoriesV3DTO, PlayStoriesV3VO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final ViewPager2 createViewPager(i container) {
        ViewPager2 viewPager2 = new ViewPager2(container.L());
        viewPager2.setId(View.generateViewId());
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setClickable(false);
        viewPager2.setBackgroundResource(UniColors.BG_DARK_KEY.getResId());
        ComposerViewExtensionKt.composerContainer(container.Z()).addView(viewPager2);
        return viewPager2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayStoriesV3Component widgetComponent$lambda$1(C7475g c7475g) {
        return new PlayStoriesV3Component(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<PlayStoriesV3VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewPager2 createViewPager = createViewPager(container);
        w0 a11 = new z0(container.a0().b(), new z0.c() { // from class: ru.ozon.app.android.storefront.stories.playstoriesv3.core.PlayStoriesV3ViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PlayStoriesV3ViewModel playStoriesV3ViewModel = PlayStoriesV3ViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(playStoriesV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return playStoriesV3ViewModel;
            }
        }).a(PlayStoriesV3ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new PlayStoriesV3ViewHolder(container, createViewPager, (PlayStoriesV3ViewModel) a11, component().getNavigator());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PlayStoriesV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(PlayStoriesV3Component.class), new a(storage, 6));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PlayStoriesV3VO> map(@NotNull PlayStoriesV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
