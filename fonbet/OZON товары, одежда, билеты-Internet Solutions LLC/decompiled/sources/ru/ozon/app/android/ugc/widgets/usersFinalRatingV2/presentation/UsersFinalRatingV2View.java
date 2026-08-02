package ru.ozon.app.android.ugc.widgets.usersFinalRatingV2.presentation;

import Bi.b;
import Kk.C3531a;
import android.content.Context;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersFinalRatingV2/presentation/UsersFinalRatingV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "valueText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "ratingView", "Lru/ozon/uni/android/atom/rating/RatingView;", "ratingSubtitle", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "", "item", "Lru/ozon/app/android/ugc/widgets/usersFinalRatingV2/presentation/UsersFinalRatingV2VO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsersFinalRatingV2View extends ConstraintLayout {
    public static final int $stable;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View ratingSubtitle;

    @NotNull
    private final RatingView ratingView;

    @NotNull
    private final TextAtomV2View valueText;

    static {
        int i11 = TextAtomV2View.$stable;
        $stable = i11 | RatingView.$stable | i11 | IconView.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsersFinalRatingV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.usersFinalRatingValueTv, -2, -2);
        d11.f41656t = 0;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.valueText = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.usersFinalRatingIcon, -2, -2);
        a11.f41658v = 0;
        a11.f41636i = 0;
        a11.f41642l = 0;
        iconView.setLayoutParams(a11);
        addView(iconView);
        this.iconView = iconView;
        RatingView ratingView = new RatingView(context, null, 0, 0, 14, null);
        ratingView.setId(R$id.usersFinalRatingStars);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41655s = R$id.usersFinalRatingValueTv;
        bVar.f41640k = R$id.usersFinalRatingSubtitle;
        bVar.setMarginStart(Dimens.INSTANCE.getDP_12());
        bVar.f41604K = 2;
        ratingView.setLayoutParams(bVar);
        addView(ratingView);
        this.ratingView = ratingView;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.usersFinalRatingSubtitle, -2, -2);
        int i11 = R$id.usersFinalRatingStars;
        d12.f41656t = i11;
        d12.f41657u = R$id.usersFinalRatingIcon;
        d12.f41638j = i11;
        d12.f41642l = 0;
        d12.f41616W = true;
        d12.f41598E = 0.0f;
        textAtomV2View2.setLayoutParams(d12);
        addView(textAtomV2View2);
        this.ratingSubtitle = textAtomV2View2;
    }

    public final void bind(@NotNull UsersFinalRatingV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.valueText, item.getValue(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.iconView, item.getIcon(), null, 2, null);
        DsRatingHolderKt.bind$default(this.ratingView, item.getRating(), null, 2, null);
        TextHolderKt.bind$default(this.ratingSubtitle, item.getRatingSubtitle(), null, 2, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }
}
