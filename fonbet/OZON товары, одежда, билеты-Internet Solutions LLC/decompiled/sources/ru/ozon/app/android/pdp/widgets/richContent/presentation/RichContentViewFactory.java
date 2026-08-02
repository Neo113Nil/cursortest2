package ru.ozon.app.android.pdp.widgets.richContent.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentViewFactory;", "", "<init>", "()V", "createBillboardView", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "imagesHeight", "", "(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/appcompat/widget/AppCompatImageView;", "createSpacerView", "Landroid/view/View;", "createTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentViewFactory {

    @NotNull
    public static final RichContentViewFactory INSTANCE = new RichContentViewFactory();

    private RichContentViewFactory() {
    }

    public static /* synthetic */ AppCompatImageView createBillboardView$default(RichContentViewFactory richContentViewFactory, Context context, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        return richContentViewFactory.createBillboardView(context, num);
    }

    @NotNull
    public final AppCompatImageView createBillboardView(@NotNull Context context, Integer imagesHeight) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.billboardIv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, imagesHeight != null ? imagesHeight.intValue() : 0);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMargins(dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        appCompatImageView.setLayoutParams(layoutParams);
        return appCompatImageView;
    }

    @NotNull
    public final View createSpacerView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setId(R$id.spacerV);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        Dimens dimens = Dimens.INSTANCE;
        ViewExtKt.updatePadding$default(view, dimens.getDP_16(), 0, dimens.getDP_16(), 0, 10, null);
        view.setLayoutParams(layoutParams);
        return view;
    }

    @NotNull
    public final TextAtomV2View createTextView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        textAtomV2View.setId(R$id.richContentTextTAV);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return textAtomV2View;
    }
}
