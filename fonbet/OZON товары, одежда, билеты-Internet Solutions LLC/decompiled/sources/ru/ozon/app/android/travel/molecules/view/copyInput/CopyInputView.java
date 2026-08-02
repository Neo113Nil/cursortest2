package ru.ozon.app.android.travel.molecules.view.copyInput;

import AD.b;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019j\u0004\u0018\u0001`\u001bJ.\u0010\u001c\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019j\u0004\u0018\u0001`\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp1", "", "dp4", "dp16", "dpf16", "", "dp48", "dp56", "clickAction", "Lkotlin/Function0;", "", "inputText", "Landroidx/appcompat/widget/AppCompatTextView;", "copyInputIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "bind", "inputVO", "Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "bindOrGone", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CopyInputView extends FrameLayout {
    private Function0<Unit> clickAction;

    @NotNull
    private final AppCompatImageView copyInputIcon;
    private final int dp1;
    private final int dp16;
    private final int dp4;
    private final int dp48;
    private final int dp56;
    private final float dpf16;

    @NotNull
    private final AppCompatTextView inputText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyInputView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        int px2 = ResourceExtKt.toPx(4, context);
        this.dp4 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        int px4 = ResourceExtKt.toPx(48, context);
        this.dp48 = px4;
        int px5 = ResourceExtKt.toPx(56, context);
        this.dp56 = px5;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, px5));
        appCompatTextView.setPadding(px3, 0, px4, 0);
        appCompatTextView.setGravity(16);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setTextAppearance(UniTextStyles.BODY_500_MEDIUM.getResId());
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.inputText = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(px4, px4);
        layoutParams.rightMargin = px2;
        layoutParams.gravity = 8388629;
        appCompatImageView.setLayoutParams(layoutParams);
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicTertiary)));
        int px6 = ResourceExtKt.toPx(12, context);
        appCompatImageView.setPadding(px6, px6, px6, px6);
        this.copyInputIcon = appCompatImageView;
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), ThemeExtKt.themeColor(context, R$attr.graphicNeutral), px, pxF));
        addView(appCompatTextView);
        addView(appCompatImageView);
        setOnClickListener(new b(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(CopyInputView copyInputView, View view) {
        Function0<Unit> function0 = copyInputView.clickAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bind(@NotNull CopyInputVO inputVO, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(inputVO, "inputVO");
        this.clickAction = new CopyInputView$bind$1(inputVO, actionHandler);
        this.inputText.setText(inputVO.getValue());
        ImageViewExtKt.load$default(this.copyInputIcon, inputVO.getIconName(), null, null, null, null, false, null, 126, null);
    }

    public final void bindOrGone(CopyInputVO inputVO, Function1<? super AtomAction, Unit> actionHandler) {
        if (inputVO == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
            bind(inputVO, actionHandler);
        }
    }
}
