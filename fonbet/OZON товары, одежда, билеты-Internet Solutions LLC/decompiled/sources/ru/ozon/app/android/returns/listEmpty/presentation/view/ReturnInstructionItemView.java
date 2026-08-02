package ru.ozon.app.android.returns.listEmpty.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.common.presentation.untils.TextAppearanceHelper;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/view/ReturnInstructionItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "ordinalNumberTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getOrdinalNumberTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "contentTextAtomView", "getContentTextAtomView", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnInstructionItemView extends LinearLayout {
    public static final int $stable = TextAtomView.$stable;

    @NotNull
    private final TextAtomView contentTextAtomView;

    @NotNull
    private final TextAtomView ordinalNumberTextAtomView;

    public /* synthetic */ ReturnInstructionItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final TextAtomView getContentTextAtomView() {
        return this.contentTextAtomView;
    }

    @NotNull
    public final TextAtomView getOrdinalNumberTextAtomView() {
        return this.ordinalNumberTextAtomView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnInstructionItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 0.0f;
        textAtomView.setMinWidth(UiExtKt.toPx(12, context));
        textAtomView.setLayoutParams(layoutParams);
        TextAppearanceHelper textAppearanceHelper = TextAppearanceHelper.INSTANCE;
        textAppearanceHelper.setStyle(textAtomView, R$style.TextStyle_Body_M);
        this.ordinalNumberTextAtomView = textAtomView;
        TextAtomView textAtomView2 = new TextAtomView(context, null, 0, 6, null);
        textAtomView2.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, UiExtKt.toPx(6, context), ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        layoutParams2.weight = 1.0f;
        textAtomView2.setLayoutParams(layoutParams2);
        textAppearanceHelper.setStyle(textAtomView2, R$style.TextStyle_Body_M);
        this.contentTextAtomView = textAtomView2;
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        setWeightSum(1.0f);
        setLayoutParams(layoutParams3);
        setOrientation(0);
        addView(textAtomView);
        addView(textAtomView2);
    }
}
