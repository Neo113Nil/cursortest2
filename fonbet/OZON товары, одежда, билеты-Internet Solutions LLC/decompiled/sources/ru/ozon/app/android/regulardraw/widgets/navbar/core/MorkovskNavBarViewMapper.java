package ru.ozon.app.android.regulardraw.widgets.navbar.core;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import c20.r;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.regulardraw.databinding.WidgetMorkovskNavbarBinding;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.CarrotNavBarVO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.MorkovskNavBarDTO;
import ru.ozon.app.android.regulardraw.widgets.navbar.di.MorkovskNavBarComponent;
import ru.ozon.app.android.regulardraw.widgets.navbar.presentation.MorkovskNavBarViewHolder;
import v10.C10183a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\f\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0016j\b\u0012\u0004\u0012\u00020\u0002`\u00172\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavBarViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/regulardraw/widgets/navbar/di/MorkovskNavBarComponent;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarDTO;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotNavBarVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavbarMapper;", "getMapper", "()Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavbarMapper;", "mapper", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MorkovskNavBarViewMapper extends OverlayWidgetScreenViewItemMapper2<MorkovskNavBarComponent, MorkovskNavBarDTO, CarrotNavBarVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final MorkovskNavbarMapper getMapper() {
        return component().getMapper();
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CarrotNavBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup Z11 = container.Z();
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(Z11);
        if (composerAppbar == null) {
            AbstractC6065b.INSTANCE.getClass();
            return AbstractC6065b.Companion.a();
        }
        CollapsingToolbarLayout d11 = C10183a.d(Z11);
        if (d11 != null) {
            d11.setFitsSystemWindows(true);
        }
        WidgetMorkovskNavbarBinding inflate = WidgetMorkovskNavbarBinding.inflate(LayoutInflater.from(container.L()), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new MorkovskNavBarViewHolder(container, composerAppbar, inflate, component().getTokenizedAnalytics(), component().getActionHandlersStoreFactory(), component().getOnboardingDelegate());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<MorkovskNavBarComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return MorkovskNavBarComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CarrotNavBarVO> map(@NotNull MorkovskNavBarDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
