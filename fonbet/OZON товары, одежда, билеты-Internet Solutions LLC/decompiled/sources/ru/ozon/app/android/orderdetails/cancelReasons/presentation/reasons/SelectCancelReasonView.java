package ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelReasons/presentation/reasons/SelectCancelReasonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "horizontalMargin", "cellListMarginTop", "disclaimerBottomMargin", "textAreaBottomMargin", "verticalAtomsLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getVerticalAtomsLayout", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "textAreaView", "Lru/ozon/uni/android/textArea/TextAreaView;", "getTextAreaView", "()Lru/ozon/uni/android/textArea/TextAreaView;", "disclaimerView", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "getDisclaimerView", "()Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectCancelReasonView extends LinearLayout {
    public static final int $stable = (DisclaimerView.$stable | TextAreaView.$stable) | VerticalAtomsLayout.$stable;
    private final int cellListMarginTop;
    private final int disclaimerBottomMargin;

    @NotNull
    private final DisclaimerView disclaimerView;
    private final int horizontalMargin;
    private final int textAreaBottomMargin;

    @NotNull
    private final TextAreaView textAreaView;

    @NotNull
    private final VerticalAtomsLayout verticalAtomsLayout;

    public /* synthetic */ SelectCancelReasonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final DisclaimerView getDisclaimerView() {
        return this.disclaimerView;
    }

    @NotNull
    public final TextAreaView getTextAreaView() {
        return this.textAreaView;
    }

    @NotNull
    public final VerticalAtomsLayout getVerticalAtomsLayout() {
        return this.verticalAtomsLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCancelReasonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(16, context);
        this.horizontalMargin = px;
        int px2 = UiExtKt.toPx(8, context);
        this.cellListMarginTop = px2;
        int px3 = UiExtKt.toPx(16, context);
        this.disclaimerBottomMargin = px3;
        int px4 = UiExtKt.toPx(4, context);
        this.textAreaBottomMargin = px4;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = px2;
        verticalAtomsLayout.setLayoutParams(marginLayoutParams);
        addView(verticalAtomsLayout);
        this.verticalAtomsLayout = verticalAtomsLayout;
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        textAreaView.setHasInfoIcon(false);
        textAreaView.setMaxLines(8);
        textAreaView.setScrollbarEnabled(true);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMarginStart(px);
        marginLayoutParams2.setMarginEnd(px);
        marginLayoutParams2.bottomMargin = px4;
        textAreaView.setLayoutParams(marginLayoutParams2);
        ViewExtKt.gone(textAreaView);
        addView(textAreaView);
        this.textAreaView = textAreaView;
        DisclaimerView disclaimerView = new DisclaimerView(context, null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams3.setMarginStart(px);
        marginLayoutParams3.setMarginEnd(px);
        marginLayoutParams3.bottomMargin = px3;
        disclaimerView.setLayoutParams(marginLayoutParams3);
        ViewExtKt.gone(disclaimerView);
        addView(disclaimerView);
        this.disclaimerView = disclaimerView;
        setId(View.generateViewId());
        setBackgroundColor(a.getColor(context, UniColors.LAYER_FLOOR_1.getResId()));
        setOrientation(1);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
    }
}
