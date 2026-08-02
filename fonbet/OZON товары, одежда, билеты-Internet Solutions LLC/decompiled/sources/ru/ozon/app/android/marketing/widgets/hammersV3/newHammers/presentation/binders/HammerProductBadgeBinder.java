package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3BodyVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersBodyView;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersBodyViewBuilder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u00030\tj\u0006\u0012\u0002\b\u0003`\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductBadgeBinder;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductPropertyBinder;", "<init>", "()V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;", "hammerProduct", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "", "bind", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammerProductBadgeBinder extends HammerProductPropertyBinder {
    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductPropertyBinder
    public void bind(@NotNull HammersV3BodyVO hammerProduct, @NotNull d info, @NotNull k<?> holder) {
        BadgeView bottomBadge;
        HammersBodyView hammersBodyView;
        Intrinsics.checkNotNullParameter(hammerProduct, "hammerProduct");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(hammerProduct, info, holder);
        HammersBodyView rootView = getRootView();
        if (rootView != null) {
            boolean z11 = hammerProduct.getDsBadge() != null;
            HammersBodyView rootView2 = getRootView();
            BadgeView bottomBadge2 = rootView2 != null ? rootView2.getBottomBadge() : null;
            HammersBodyViewBuilder hammersBodyViewBuilder = HammersBodyViewBuilder.INSTANCE;
            if (z11 && bottomBadge2 == null) {
                hammersBodyView = ((HammerProductPropertyBinder) this).rootView;
                bottomBadge2 = hammersBodyView != null ? hammersBodyViewBuilder.buildBadge(hammersBodyView) : null;
            }
            rootView.setBottomBadge(bottomBadge2);
        }
        HammersBodyView rootView3 = getRootView();
        if (rootView3 == null || (bottomBadge = rootView3.getBottomBadge()) == null) {
            return;
        }
        BadgeHolderKt.bindOrGone$default(bottomBadge, hammerProduct.getDsBadge(), (Function1) null, 2, (Object) null);
    }
}
