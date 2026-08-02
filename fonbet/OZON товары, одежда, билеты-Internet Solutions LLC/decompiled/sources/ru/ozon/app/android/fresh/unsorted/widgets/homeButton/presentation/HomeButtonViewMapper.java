package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
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
import ru.ozon.app.android.fresh.unsorted.R$drawable;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.data.HomeButtonDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.di.HomeButtonComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewMapper;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/di/HomeButtonComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/data/HomeButtonDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/data/HomeButtonDTO;Ll20/d;)Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonMapper;", "mapper", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewModel;", "viewModel", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeButtonViewMapper extends OverlayWidgetScreenViewItemMapper2<HomeButtonComponent, HomeButtonDTO, HomeButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;
    private static final int IMAGE_SIZE = UiExtKt.toPx(40);
    private static final int MARGIN_END = UiExtKt.toPx(16);
    private static final int MARGIN_BOTTOM = UiExtKt.toPx(12);
    private static final float ELEVATION = UiExtKt.toPxF(1);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i11 = IMAGE_SIZE;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 8388613;
        layoutParams.setMarginEnd(MARGIN_END);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, MARGIN_BOTTOM);
        ImageView imageView = new ImageView(it.getContext());
        imageView.setLayoutParams(layoutParams);
        imageView.setElevation(ELEVATION);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackgroundResource(R$drawable.bg_home_button);
        imageView.setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
        imageView.setContentDescription("buttonIv");
        return imageView;
    }

    private final HomeButtonMapper getMapper() {
        return component().getMapper();
    }

    private final HomeButtonViewModel getViewModel() {
        return component().getViewModel();
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<HomeButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new HomeButtonViewHolder(container, getViewModel(), new InterfaceC6068e() { // from class: sx.b
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$2;
                createHolder$lambda$2 = HomeButtonViewMapper.createHolder$lambda$2((LinearLayout) viewGroup);
                return createHolder$lambda$2;
            }
        });
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HomeButtonComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HomeButtonComponent.INSTANCE.create();
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HomeButtonVO> map(@NotNull HomeButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
