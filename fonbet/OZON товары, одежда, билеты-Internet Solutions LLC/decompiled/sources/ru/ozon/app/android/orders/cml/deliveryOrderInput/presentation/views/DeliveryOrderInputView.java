package ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.views;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0011\u001a\u00020\u00102&\u0010\u000f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/views/DeliveryOrderInputView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initView", "()V", "Lkotlin/Function4;", "", "action", "Landroid/text/TextWatcher;", "doOnTextChanged", "(Lfd/o;)Landroid/text/TextWatcher;", "Lru/ozon/uni/android/textArea/TextAreaView;", "inputTextView", "Lru/ozon/uni/android/textArea/TextAreaView;", "getInputTextView", "()Lru/ozon/uni/android/textArea/TextAreaView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "submitButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getSubmitButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderInputView extends LinearLayout {

    @NotNull
    private final TextAreaView inputTextView;

    @NotNull
    private final ButtonV3View submitButton;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = ButtonV3View.$stable | TextAreaView.$stable;
    private static final int HORIZONTAL_PADDING = ResourceExtKt.toPx(16);
    private static final int BOTTOM_PADDING = ResourceExtKt.toPx(10);
    private static final int SUBMIT_BUTTON_TOP_MARGIN = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/views/DeliveryOrderInputView$Companion;", "", "<init>", "()V", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeliveryOrderInputView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void initView() {
        setOrientation(1);
        int i11 = HORIZONTAL_PADDING;
        setPadding(i11, getPaddingTop(), i11, BOTTOM_PADDING);
        addView(this.inputTextView);
        addView(this.submitButton);
    }

    @NotNull
    public final TextWatcher doOnTextChanged(@NotNull InterfaceC6512o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return TextAreaView.INSTANCE.doOnTextChanged(this.inputTextView, action);
    }

    @NotNull
    public final TextAreaView getInputTextView() {
        return this.inputTextView;
    }

    @NotNull
    public final ButtonV3View getSubmitButton() {
        return this.submitButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryOrderInputView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        textAreaView.setId(View.generateViewId());
        textAreaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.inputTextView = textAreaView;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = SUBMIT_BUTTON_TOP_MARGIN;
        buttonV3View.setLayoutParams(layoutParams);
        this.submitButton = buttonV3View;
        initView();
    }
}
