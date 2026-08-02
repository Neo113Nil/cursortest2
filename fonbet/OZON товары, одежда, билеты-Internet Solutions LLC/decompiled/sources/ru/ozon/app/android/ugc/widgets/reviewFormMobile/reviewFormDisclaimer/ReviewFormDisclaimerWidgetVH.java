package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormDisclaimer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerVO;", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "view", "<init>", "(Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerVO;Ll20/d;)V", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormDisclaimerWidgetVH extends k<ReviewFormDisclaimerVO> {
    public static final int $stable = DisclaimerView.$stable;

    @NotNull
    private final DisclaimerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormDisclaimerWidgetVH(@NotNull DisclaimerView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewFormDisclaimerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        DSDisclaimerHolderKt.bind$default(this.view, item.getDisclaimer(), null, 2, null);
    }
}
