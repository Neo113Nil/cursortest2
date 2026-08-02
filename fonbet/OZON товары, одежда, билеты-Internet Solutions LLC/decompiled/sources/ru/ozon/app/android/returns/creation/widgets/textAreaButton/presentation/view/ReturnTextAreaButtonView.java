package ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.C5316f0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0015R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/textAreaButton/presentation/view/ReturnTextAreaButtonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "marinHorizontal", "textAreaViewMarginTop", "textAreaView", "Lru/ozon/uni/android/textArea/TextAreaView;", "getTextAreaView", "()Lru/ozon/uni/android/textArea/TextAreaView;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getVisibleLineCount", "()Ljava/lang/Integer;", "getLineCount", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnTextAreaButtonView extends LinearLayout {
    public static final int $stable = ButtonV3View.$stable | TextAreaView.$stable;

    @NotNull
    private final ButtonV3View button;
    private final int marinHorizontal;

    @NotNull
    private final TextAreaView textAreaView;
    private final int textAreaViewMarginTop;

    public /* synthetic */ ReturnTextAreaButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Integer getLineCount() {
        OzonTextInput ozonTextInput = (OzonTextInput) l.l(l.h(C5316f0.b(this.textAreaView), ReturnTextAreaButtonView$getLineCount$$inlined$filterIsInstance$1.INSTANCE));
        if (ozonTextInput != null) {
            return Integer.valueOf(ozonTextInput.getLineCount());
        }
        return null;
    }

    @NotNull
    public final ButtonV3View getButton() {
        return this.button;
    }

    @NotNull
    public final TextAreaView getTextAreaView() {
        return this.textAreaView;
    }

    public final Integer getVisibleLineCount() {
        Integer lineCount = getLineCount();
        if (lineCount == null) {
            return null;
        }
        int intValue = lineCount.intValue();
        return intValue < this.textAreaView.getMinLines() ? Integer.valueOf(this.textAreaView.getMinLines()) : intValue > this.textAreaView.getMaxLines() ? Integer.valueOf(this.textAreaView.getMaxLines()) : lineCount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnTextAreaButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.marinHorizontal = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.textAreaViewMarginTop = px2;
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        textAreaView.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(px, px2, px, 0);
        textAreaView.setLayoutParams(marginLayoutParams);
        textAreaView.setHasInfoIcon(false);
        textAreaView.setHasActionIcon(true);
        this.textAreaView = textAreaView;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMargins(px, px, px, px);
        buttonV3View.setLayoutParams(marginLayoutParams2);
        this.button = buttonV3View;
        setId(View.generateViewId());
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(textAreaView);
        addView(buttonV3View);
    }
}
