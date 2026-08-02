package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import android.content.Context;
import android.view.ViewGroup;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7SimpleHeaderVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "view", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7SimpleHeaderBinder;", "binder", "Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7SimpleHeaderBinder;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerV7SimpleHeaderVH extends k<SellerV7VO> {

    @NotNull
    private final SellerV7SimpleHeaderBinder binder;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7SimpleHeaderVH$Companion;", "", "<init>", "()V", "createView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "context", "Landroid/content/Context;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextAtomV2View createView(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
            if (textAtomV2View == null) {
                textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            }
            textAtomV2View.setId(R$id.sellerV7Title);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            Dimens dimens = Dimens.INSTANCE;
            marginLayoutParams.leftMargin = dimens.getDP_16();
            marginLayoutParams.rightMargin = dimens.getDP_16();
            textAtomV2View.setLayoutParams(marginLayoutParams);
            return textAtomV2View;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerV7SimpleHeaderVH(@NotNull TextAtomV2View view, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        this.binder = new SellerV7SimpleHeaderBinder(view, widgetImagePlaceholderAdapter, this);
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull jk0.q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        this.binder.onVisibleAreaChanged(info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerV7VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        BaseWidgetPlaceholderBinder.bind$default(this.binder, item, info, null, null, 12, null);
    }
}
