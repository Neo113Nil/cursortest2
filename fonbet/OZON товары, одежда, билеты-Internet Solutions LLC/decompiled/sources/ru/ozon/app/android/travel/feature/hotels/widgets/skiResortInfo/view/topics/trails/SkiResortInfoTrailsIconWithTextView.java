package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.topics.trails;

import Bi.a;
import android.content.Context;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/topics/trails/SkiResortInfoTrailsIconWithTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp6", "", "iconIV", "Lru/ozon/uni/android/atom/icon/IconView;", "textTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailDetailItem;", "setupRoot", "addViews", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkiResortInfoTrailsIconWithTextView extends LinearLayout {
    public static final int $stable = TextAtomV2View.$stable | IconView.$stable;
    private final int dp6;

    @NotNull
    private final IconView iconIV;

    @NotNull
    private final TextAtomV2View textTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkiResortInfoTrailsIconWithTextView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(6, context);
        this.dp6 = px;
        q qVar = q.f64554a;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        if (iconView == null) {
            context2 = context;
            iconView = new IconView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(px);
        iconView.setLayoutParams(layoutParams);
        this.iconIV = iconView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        a.d(-2, -2, textAtomV2View);
        this.textTAV = textAtomV2View;
        setupRoot();
        addViews();
    }

    private final void addViews() {
        addView(this.iconIV);
        addView(this.textTAV);
    }

    private final void setupRoot() {
        setGravity(16);
    }

    public final void bind(@NotNull SkiResortInfoVO.TrailsVO.TrailDetailItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bindOrGone$default(this.iconIV, item.getIcon(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.textTAV, item.getText(), null, 2, null);
    }
}
