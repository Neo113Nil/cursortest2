package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.view;

import Ez.ViewOnClickListenerC2979c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.view.PassengersDirectoryV3InputView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0014J\u0006\u0010$\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/view/PassengersDirectoryV3InputView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp10", "dp16", "dp20", "dpf24", "", "dp40", "dp46", "inputEditText", "Landroidx/appcompat/widget/AppCompatEditText;", "clearInputIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "setInputText", "", "text", "", "setInputHint", "hint", "addTextWatcher", "watcher", "Landroid/text/TextWatcher;", "removeTextWatcher", "setIsClearButtonVisible", "isVisible", "", "setInputOnFocusChangeListener", "inputOnFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "showKeyboardInput", "hideKeyboardInput", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3InputView extends FrameLayout {

    @NotNull
    private final AppCompatImageView clearInputIcon;
    private final int dp10;
    private final int dp16;
    private final int dp20;
    private final int dp40;
    private final int dp46;
    private final int dp8;
    private final float dpf24;

    @NotNull
    private final AppCompatEditText inputEditText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersDirectoryV3InputView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(10, context);
        this.dp10 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        int px4 = ResourceExtKt.toPx(20, context);
        this.dp20 = px4;
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF;
        int px5 = ResourceExtKt.toPx(40, context);
        this.dp40 = px5;
        int px6 = ResourceExtKt.toPx(46, context);
        this.dp46 = px6;
        AppCompatEditText appCompatEditText = new AppCompatEditText(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(px3, px, px3, px);
        appCompatEditText.setLayoutParams(layoutParams);
        appCompatEditText.setPadding(px2, px2, px6, px2);
        appCompatEditText.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerSurface), ResourceExtKt.toPxF(12, context)));
        Drawable drawable = a.getDrawable(context, R$drawable.ic_m_search_filled);
        if (drawable != null) {
            drawable.mutate();
            drawable.setBounds(0, 0, px4, px4);
            drawable.setTint(ThemeExtKt.themeColor(context, R$attr.graphicTertiary));
        } else {
            drawable = null;
        }
        appCompatEditText.setCompoundDrawables(drawable, null, null, null);
        appCompatEditText.setCompoundDrawablePadding(ResourceExtKt.toPx(6, context));
        appCompatEditText.setGravity(16);
        appCompatEditText.setMinimumHeight(px5);
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setInputType(1);
        appCompatEditText.setImeOptions(6);
        appCompatEditText.setTextAppearance(UniTextStyles.COMPACT_500_MEDIUM.getResId());
        appCompatEditText.setHintTextColor(ThemeExtKt.themeColor(context, R$attr.textTertiary));
        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: NN.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean inputEditText$lambda$3$lambda$2;
                inputEditText$lambda$3$lambda$2 = PassengersDirectoryV3InputView.inputEditText$lambda$3$lambda$2(PassengersDirectoryV3InputView.this, textView, i11, keyEvent);
                return inputEditText$lambda$3$lambda$2;
            }
        });
        this.inputEditText = appCompatEditText;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(px5, px5);
        layoutParams2.rightMargin = px3;
        layoutParams2.gravity = 8388629;
        appCompatImageView.setLayoutParams(layoutParams2);
        int px7 = ResourceExtKt.toPx(12, context);
        appCompatImageView.setPadding(px7, px7, px7, px7);
        appCompatImageView.setImageResource(R$drawable.ic_s_cancel_filled);
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicTertiary)));
        appCompatImageView.setOnClickListener(new ViewOnClickListenerC2979c(this, 1));
        this.clearInputIcon = appCompatImageView;
        setBackground(RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), 0.0f, 0.0f, pxF, pxF, 6, null));
        addView(appCompatEditText);
        addView(appCompatImageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearInputIcon$lambda$7$lambda$6(PassengersDirectoryV3InputView passengersDirectoryV3InputView, View view) {
        Intrinsics.f(view);
        view.setVisibility(8);
        AppCompatEditText appCompatEditText = passengersDirectoryV3InputView.inputEditText;
        appCompatEditText.requestFocus();
        appCompatEditText.setText((CharSequence) null);
        KeyboardUtilsKt.showKeyboard(appCompatEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean inputEditText$lambda$3$lambda$2(PassengersDirectoryV3InputView passengersDirectoryV3InputView, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        passengersDirectoryV3InputView.hideKeyboardInput();
        return true;
    }

    public final void addTextWatcher(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        this.inputEditText.addTextChangedListener(watcher);
    }

    public final void hideKeyboardInput() {
        AppCompatEditText appCompatEditText = this.inputEditText;
        appCompatEditText.clearFocus();
        KeyboardUtilsKt.hideKeyboard(appCompatEditText);
    }

    public final void removeTextWatcher(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        this.inputEditText.removeTextChangedListener(watcher);
    }

    public final void setInputHint(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.inputEditText.setHint(hint);
    }

    public final void setInputOnFocusChangeListener(@NotNull View.OnFocusChangeListener inputOnFocusChangeListener) {
        Intrinsics.checkNotNullParameter(inputOnFocusChangeListener, "inputOnFocusChangeListener");
        this.inputEditText.setOnFocusChangeListener(inputOnFocusChangeListener);
    }

    public final void setInputText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        AppCompatEditText appCompatEditText = this.inputEditText;
        Integer valueOf = Integer.valueOf(appCompatEditText.getSelectionStart());
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue > text.length()) {
            valueOf = null;
        }
        int intValue2 = valueOf != null ? valueOf.intValue() : text.length();
        appCompatEditText.setText(text);
        appCompatEditText.setSelection(intValue2);
    }

    public final void setIsClearButtonVisible(boolean isVisible) {
        this.clearInputIcon.setVisibility(isVisible ? 0 : 8);
        AppCompatEditText appCompatEditText = this.inputEditText;
        appCompatEditText.setPadding(appCompatEditText.getPaddingLeft(), appCompatEditText.getPaddingTop(), isVisible ? this.dp46 : this.dp10, appCompatEditText.getPaddingBottom());
    }

    public final void showKeyboardInput() {
        AppCompatEditText appCompatEditText = this.inputEditText;
        appCompatEditText.requestFocus();
        KeyboardUtilsKt.showKeyboard(appCompatEditText);
    }
}
