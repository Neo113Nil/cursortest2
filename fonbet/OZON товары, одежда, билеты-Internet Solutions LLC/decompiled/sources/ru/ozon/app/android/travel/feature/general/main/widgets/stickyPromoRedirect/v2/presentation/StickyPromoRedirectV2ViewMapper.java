package ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.presentation;

import DQ.a;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import com.airbnb.lottie.LottieAnimationView;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.data.StickyPromoRedirectV2DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.di.StickyPromoRedirectV2Component;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/presentation/StickyPromoRedirectV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/di/StickyPromoRedirectV2Component;", "Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2DTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/presentation/StickyPromoRedirectV2VO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StickyPromoRedirectV2ViewMapper extends OverlayWidgetScreenViewItemMapper2<StickyPromoRedirectV2Component, StickyPromoRedirectV2DTO, StickyPromoRedirectV2VO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(parent.getContext());
        lottieAnimationView.setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
        lottieAnimationView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return lottieAnimationView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<StickyPromoRedirectV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new StickyPromoRedirectV2WidgetViewHolder(container, component().getCustomActionHandlersStoreFactory(), new a(0));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<StickyPromoRedirectV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return StickyPromoRedirectV2Component.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StickyPromoRedirectV2VO> map(@NotNull StickyPromoRedirectV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
