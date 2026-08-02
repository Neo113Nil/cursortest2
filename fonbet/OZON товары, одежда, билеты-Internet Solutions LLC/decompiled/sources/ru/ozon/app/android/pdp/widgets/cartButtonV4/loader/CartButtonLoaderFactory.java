package ru.ozon.app.android.pdp.widgets.cartButtonV4.loader;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/loader/CartButtonLoaderFactory;", "", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartButtonLoaderFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/loader/CartButtonLoaderFactory$Companion;", "", "<init>", "()V", "buttonHeight", "", "getButtonHeight", "()I", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int buttonHeight = ResourceExtKt.toPx(68);

        private Companion() {
        }

        public final int getButtonHeight() {
            return buttonHeight;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        @NotNull
        public static LoaderView createLoader(@NotNull CartButtonLoaderFactory cartButtonLoaderFactory, @NotNull ViewGroup composerRootView) {
            Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
            Context context = composerRootView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            LoaderView loaderView = new LoaderView(context, null, 0, 6, null);
            loaderView.setLoaderSize(LoaderSize.LOADER_400);
            Companion companion = CartButtonLoaderFactory.INSTANCE;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, companion.getButtonHeight());
            loaderView.setElevation(1.0f);
            Dimens dimens = Dimens.INSTANCE;
            layoutParams.setMargins(dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, dimens.getDP_16(), -companion.getButtonHeight());
            loaderView.setPadding(loaderView.getPaddingLeft(), dimens.getDP_18(), loaderView.getPaddingRight(), dimens.getDP_18());
            loaderView.setLayoutParams(layoutParams);
            loaderView.setClickable(true);
            return loaderView;
        }
    }
}
