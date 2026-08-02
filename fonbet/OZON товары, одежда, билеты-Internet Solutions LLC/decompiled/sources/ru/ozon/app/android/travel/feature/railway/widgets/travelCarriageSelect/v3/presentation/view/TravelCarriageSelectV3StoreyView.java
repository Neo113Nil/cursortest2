package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view;

import Bi.a;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3VO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3StoreyView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "nameTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "schemeImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$StoreyVO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV3StoreyView extends LinearLayout {

    @NotNull
    private final TextAtomV2View nameTextView;

    @NotNull
    private final AppCompatImageView schemeImageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCarriageSelectV3StoreyView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        a.d(-2, -2, textAtomV2View);
        this.nameTextView = textAtomV2View;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ResourceExtKt.toPx(44, context));
        layoutParams.topMargin = ResourceExtKt.toPx(4, context);
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setAdjustViewBounds(true);
        this.schemeImageView = appCompatImageView;
        setOrientation(1);
        addView(textAtomV2View);
        addView(appCompatImageView);
    }

    public final void bind(@NotNull TravelCarriageSelectV3VO.StoreyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(this.nameTextView, item.getName(), null, 2, null);
        AppCompatImageView appCompatImageView = this.schemeImageView;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatImageView.setImageBitmap(ThemeExtKt.isDarkThemeActive(context) ? item.getDarkSchemeImage() : item.getLightSchemeImage());
    }
}
