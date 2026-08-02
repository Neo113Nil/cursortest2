package ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.presentation;

import Nk.a;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$id;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonViewFactory;", "", "<init>", "()V", "create", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "createButton", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/LargeBorderlessButtonView;", "context", "Landroid/content/Context;", "createFrameLayout", "Landroid/widget/FrameLayout;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BorderlessButtonViewFactory {
    private final LargeBorderlessButtonView createButton(Context context) {
        LargeBorderlessButtonView largeBorderlessButtonView = new LargeBorderlessButtonView(context, null, 0, 6, null);
        largeBorderlessButtonView.setId(R$id.borderlessBtn);
        TextViewExtKt.applyStyle(largeBorderlessButtonView, context, R$style.LargeBorderlessButton);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int px = UiExtKt.toPx(16);
        marginLayoutParams.setMarginStart(px);
        marginLayoutParams.setMarginEnd(px);
        largeBorderlessButtonView.setLayoutParams(marginLayoutParams);
        largeBorderlessButtonView.setEllipsize(TextUtils.TruncateAt.END);
        largeBorderlessButtonView.setMaxLines(1);
        return largeBorderlessButtonView;
    }

    private final FrameLayout createFrameLayout(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setBackgroundResource(R$color.layer_floor_1);
        return frameLayout;
    }

    @NotNull
    public final View create(@NotNull ViewGroup parent) {
        FrameLayout createFrameLayout = createFrameLayout(a.a(parent, "parent", "getContext(...)"));
        Context context = createFrameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        createFrameLayout.addView(createButton(context));
        return createFrameLayout;
    }
}
