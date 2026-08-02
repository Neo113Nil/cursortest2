package ru.ozon.uni.android.input.textinput.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001YB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u0012J\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\u0012J\u0015\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b2\u0010\u0012J\u0015\u00104\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\b4\u0010\u0012J\u0015\u00105\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\b5\u0010\u0012J\r\u00106\u001a\u00020\r¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\r¢\u0006\u0004\b8\u00107R,\u0010<\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\r0:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R*\u0010?\u001a\u00020/2\u0006\u0010>\u001a\u00020/8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u00101R\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010J\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010W¨\u0006Z"}, d2 = {"Lru/ozon/uni/android/input/textinput/ui/TextInputGroupView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "type", "setInputType", "(I)V", "getInputType", "()I", "action", "setKeyboardAction", "getKeyboardAction", "", "text", "setInputText", "(Ljava/lang/CharSequence;)V", "style", "setInputTextAppearance", "", "isActive", "setInputFocusableInTouchMode", "(Z)V", "hasFocus", "setInputFocus", "getInputHasFocused", "()Z", "Landroid/text/Editable;", "getInputText", "()Landroid/text/Editable;", "colorRestId", "setInputTextColor", "", "alpha", "setInputAlpha", "(F)V", "", "setLabelText", "(Ljava/lang/String;)V", "setLabelTextAppearance", "visibility", "setLabelVisibility", "setIconVisibility", "centringLabel", "()V", "moveLabelUpToInput", "", "Lkotlin/Function1;", "Landroid/view/View;", "locatorInitializers", "Ljava/util/Map;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "Landroidx/appcompat/widget/AppCompatImageView;", "lockImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getLockImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "inputView", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "getInputView", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "Landroidx/appcompat/widget/AppCompatTextView;", "labelView", "Landroidx/appcompat/widget/AppCompatTextView;", "getLabelView", "()Landroidx/appcompat/widget/AppCompatTextView;", "lockImageRightOffset", "I", "labelBottomMargin", "inputTextColorResId", "Ljava/lang/Integer;", "inputStyleInputId", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextInputGroupView extends ConstraintLayout implements AtomLocatableView {
    private Integer inputStyleInputId;
    private Integer inputTextColorResId;

    @NotNull
    private final OzonTextInput inputView;
    private final int labelBottomMargin;

    @NotNull
    private final AppCompatTextView labelView;

    @NotNull
    private final Map<Integer, Function1<View, Unit>> locatorInitializers;

    @NotNull
    private String locatorTag;
    private final int lockImageRightOffset;

    @NotNull
    private final AppCompatImageView lockImageView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/input/textinput/ui/TextInputGroupView$Companion;", "", "<init>", "()V", "TEXT_INPUT_GROUP_LOCATOR_TAG", "", "LOCK_IMAGE_LOCATOR_TAG", "INPUT_LOCATOR_TAG", "LABEL_LOCATOR_TAG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextInputGroupView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void centringLabel() {
        AppCompatTextView appCompatTextView = this.labelView;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41640k = -1;
        bVar.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = 0;
        appCompatTextView.setLayoutParams(bVar);
    }

    public final boolean getInputHasFocused() {
        return this.inputView.hasFocus();
    }

    public final Editable getInputText() {
        return this.inputView.getText();
    }

    public final int getInputType() {
        return this.inputView.getInputType();
    }

    @NotNull
    public final OzonTextInput getInputView() {
        return this.inputView;
    }

    public final int getKeyboardAction() {
        return this.inputView.getImeOptions();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    public final void moveLabelUpToInput() {
        AppCompatTextView appCompatTextView = this.labelView;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41642l = -1;
        bVar.f41640k = this.inputView.getId();
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = UiExtKt.toPx(2);
        appCompatTextView.setLayoutParams(bVar);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.inputTextColorResId = null;
        this.inputStyleInputId = null;
    }

    public final void setIconVisibility(int visibility) {
        this.lockImageView.setVisibility(visibility);
    }

    public final void setInputAlpha(float alpha) {
        this.inputView.setAlpha(alpha);
    }

    public final void setInputFocus(boolean hasFocus) {
        if (!hasFocus) {
            this.inputView.clearFocus();
            return;
        }
        OzonTextInput ozonTextInput = this.inputView;
        if (!ozonTextInput.hasFocus()) {
            ozonTextInput.requestFocus();
        }
        ViewExtKt.showKeyboard(ozonTextInput);
    }

    public final void setInputFocusableInTouchMode(boolean isActive) {
        this.inputView.setFocusableInTouchMode(isActive);
    }

    public final void setInputText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (h.v(this.inputView.getText(), text)) {
            return;
        }
        this.inputView.setText(text);
    }

    public final void setInputTextAppearance(int style) {
        Integer num = this.inputStyleInputId;
        if (num != null && style == num.intValue()) {
            return;
        }
        this.inputTextColorResId = null;
        this.inputStyleInputId = Integer.valueOf(style);
        this.inputView.setTextAppearance(style);
    }

    public final void setInputTextColor(int colorRestId) {
        Integer num = this.inputTextColorResId;
        if (num != null && colorRestId == num.intValue()) {
            return;
        }
        this.inputTextColorResId = Integer.valueOf(colorRestId);
        this.inputView.setTextColor(a.getColor(getContext(), colorRestId));
    }

    public final void setInputType(int type) {
        this.inputView.setInputType(type);
    }

    public final void setKeyboardAction(int action) {
        this.inputView.setImeOptions(action);
    }

    public final void setLabelText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.labelView.setText(text);
    }

    public final void setLabelTextAppearance(int style) {
        this.labelView.setTextAppearance(style);
    }

    public final void setLabelVisibility(int visibility) {
        this.labelView.setVisibility(visibility);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
        for (Map.Entry<Integer, Function1<View, Unit>> entry : this.locatorInitializers.entrySet()) {
            int intValue = entry.getKey().intValue();
            Function1<View, Unit> value2 = entry.getValue();
            View findViewById = findViewById(intValue);
            if (findViewById != null) {
                value2.invoke(findViewById);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputGroupView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Map<Integer, Function1<View, Unit>> j11 = U.j(new Pair(Integer.valueOf(R$id.inputLabel), new TextInputGroupView$locatorInitializers$1(this)), new Pair(Integer.valueOf(R$id.inputLockImage), new TextInputGroupView$locatorInitializers$2(this)), new Pair(Integer.valueOf(R$id.inputEditText), new TextInputGroupView$locatorInitializers$3(this)));
        this.locatorInitializers = j11;
        this.locatorTag = "textInputGroup";
        int px = UiExtKt.toPx(4);
        this.lockImageRightOffset = px;
        int px2 = UiExtKt.toPx(2);
        this.labelBottomMargin = px2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.inputLabel);
        appCompatTextView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41640k = R$id.inputEditText;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41604K = 2;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = px2;
        bVar.f41662z = 0;
        a.getColor(context, UniColors.TEXT_TERTIARY.getResId());
        appCompatTextView.setAlpha(0.4f);
        Function1<View, Unit> function1 = j11.get(Integer.valueOf(appCompatTextView.getId()));
        if (function1 != null) {
            function1.invoke(appCompatTextView);
        }
        addView(appCompatTextView, bVar);
        this.labelView = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.inputLockImage);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(UiExtKt.toPx(16), UiExtKt.toPx(16));
        int i12 = R$id.inputEditText;
        bVar2.f41636i = i12;
        bVar2.f41642l = i12;
        bVar2.f41656t = 0;
        bVar2.f41657u = i12;
        bVar2.setMarginEnd(px);
        bVar2.f41598E = 1.0f;
        ViewExtKt.setDrawableByNameOrGone(appCompatImageView, "ic_m_lock_closed_filled");
        appCompatImageView.setColorFilter(a.getColor(context, UniColors.GRAPHIC_TERTIARY.getResId()));
        appCompatImageView.setAlpha(0.4f);
        Function1<View, Unit> function12 = j11.get(Integer.valueOf(appCompatImageView.getId()));
        if (function12 != null) {
            function12.invoke(appCompatImageView);
        }
        addView(appCompatImageView, bVar2);
        this.lockImageView = appCompatImageView;
        OzonTextInput ozonTextInput = new OzonTextInput(context, null, 0, 6, null);
        ozonTextInput.setId(R$id.inputEditText);
        ozonTextInput.setSingleLine(true);
        ozonTextInput.setEllipsize(truncateAt);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41655s = R$id.inputLockImage;
        bVar3.f41658v = 0;
        bVar3.f41638j = R$id.inputLabel;
        bVar3.f41642l = 0;
        ozonTextInput.setPadding(0, 0, 0, 0);
        ozonTextInput.setBackground(null);
        Function1<View, Unit> function13 = j11.get(Integer.valueOf(ozonTextInput.getId()));
        if (function13 != null) {
            function13.invoke(ozonTextInput);
        }
        addView(ozonTextInput, bVar3);
        this.inputView = ozonTextInput;
        setContentDescription(getLocatorTag());
    }
}
