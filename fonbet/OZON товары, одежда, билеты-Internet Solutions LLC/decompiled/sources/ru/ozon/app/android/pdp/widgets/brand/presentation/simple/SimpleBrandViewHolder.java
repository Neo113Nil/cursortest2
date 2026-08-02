package ru.ozon.app.android.pdp.widgets.brand.presentation.simple;

import WZ.l;
import android.content.Context;
import android.widget.FrameLayout;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.brand.presentation.BrandViewHolder;
import ru.ozon.app.android.pdp.widgets.brand.presentation.SimpleBrandVO;
import ru.ozon.uni.android.controls.button.UncontainedIconLabelButtonView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/simple/SimpleBrandViewHolder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/BrandViewHolder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;", "Landroid/widget/FrameLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/pdp/widgets/brand/presentation/simple/SimpleBrandBinder;", "binder", "Lru/ozon/app/android/pdp/widgets/brand/presentation/simple/SimpleBrandBinder;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SimpleBrandViewHolder extends BrandViewHolder<SimpleBrandVO> {

    @NotNull
    private final SimpleBrandBinder binder;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/simple/SimpleBrandViewHolder$Companion;", "", "<init>", "()V", "createView", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FrameLayout createView(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            UncontainedIconLabelButtonView uncontainedIconLabelButtonView = new UncontainedIconLabelButtonView(context, null, 0, 0, 14, null);
            uncontainedIconLabelButtonView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            uncontainedIconLabelButtonView.setId(R$id.brandUncontainedButton);
            FrameLayout frameLayout = new FrameLayout(context);
            Dimens dimens = Dimens.INSTANCE;
            ViewExtKt.updatePadding(frameLayout, dimens.getDP_16(), dimens.getDP_2(), dimens.getDP_16(), dimens.getDP_2());
            frameLayout.addView(uncontainedIconLabelButtonView);
            return frameLayout;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBrandViewHolder(@NotNull FrameLayout containerView, @NotNull ComposerReferences refs, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, @NotNull l tokenizedAnalytics) {
        super(containerView, refs);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.binder = new SimpleBrandBinder(containerView, refs, this, widgetImagePlaceholderAdapter, tokenizedAnalytics);
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        this.binder.onVisibleAreaChanged(info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SimpleBrandVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        BaseWidgetPlaceholderBinder.bind$default(this.binder, item, info, null, null, 12, null);
    }
}
