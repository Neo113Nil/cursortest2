package ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.view;

import Ar.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.view.TravelSearchBarInputView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0016J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u000e\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u001aJ\u0006\u0010(\u001a\u00020\u001aR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/view/TravelSearchBarInputView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp8", "dp10", "dp16", "dp20", "dp40", "dp46", "inputEditText", "Landroidx/appcompat/widget/AppCompatEditText;", "clearInputIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "onInterceptTouchEvent", "", "motionEvent", "Landroid/view/MotionEvent;", "setInputText", "", "text", "", "setInputHint", "hint", "setIsEnabled", "isEnabled", "addTextWatcher", "watcher", "Landroid/text/TextWatcher;", "removeTextWatcher", "setIsClearButtonVisible", "isVisible", "showKeyboard", "hideKeyboard", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelSearchBarInputView extends FrameLayout {

    @NotNull
    private final AppCompatImageView clearInputIcon;
    private final int dp10;
    private final int dp16;
    private final int dp20;
    private final int dp40;
    private final int dp46;
    private final int dp8;

    @NotNull
    private final AppCompatEditText inputEditText;

    public /* synthetic */ TravelSearchBarInputView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearInputIcon$lambda$7$lambda$6(TravelSearchBarInputView travelSearchBarInputView, View view) {
        Intrinsics.f(view);
        view.setVisibility(8);
        AppCompatEditText appCompatEditText = travelSearchBarInputView.inputEditText;
        appCompatEditText.requestFocus();
        appCompatEditText.setText((CharSequence) null);
        KeyboardUtilsKt.showKeyboard(appCompatEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean inputEditText$lambda$3$lambda$2(TravelSearchBarInputView travelSearchBarInputView, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        travelSearchBarInputView.hideKeyboard();
        return true;
    }

    public final void addTextWatcher(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        this.inputEditText.addTextChangedListener(watcher);
    }

    public final void hideKeyboard() {
        AppCompatEditText appCompatEditText = this.inputEditText;
        appCompatEditText.clearFocus();
        KeyboardUtilsKt.hideKeyboard(appCompatEditText);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.inputEditText.isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void removeTextWatcher(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        this.inputEditText.removeTextChangedListener(watcher);
    }

    public final void setInputHint(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.inputEditText.setHint(hint);
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

    public final void setIsEnabled(boolean isEnabled) {
        this.inputEditText.setEnabled(isEnabled);
    }

    public final void showKeyboard() {
        AppCompatEditText appCompatEditText = this.inputEditText;
        appCompatEditText.requestFocus();
        KeyboardUtilsKt.showKeyboard(appCompatEditText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelSearchBarInputView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(10, context);
        this.dp10 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        int px4 = ResourceExtKt.toPx(20, context);
        this.dp20 = px4;
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
        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: NQ.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                boolean inputEditText$lambda$3$lambda$2;
                inputEditText$lambda$3$lambda$2 = TravelSearchBarInputView.inputEditText$lambda$3$lambda$2(TravelSearchBarInputView.this, textView, i13, keyEvent);
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
        appCompatImageView.setOnClickListener(new d(this, 2));
        this.clearInputIcon = appCompatImageView;
        addView(appCompatEditText);
        addView(appCompatImageView);
    }
}
