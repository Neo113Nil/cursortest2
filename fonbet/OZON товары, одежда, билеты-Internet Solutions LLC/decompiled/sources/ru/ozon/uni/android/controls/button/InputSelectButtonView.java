package ru.ozon.uni.android.controls.button;

import Al.ViewOnClickListenerC2437a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
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
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.controls.common.ButtonImageView;
import ru.ozon.uni.android.controls.common.ButtonTextView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.controls.button.InputSelectButtonDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0080\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010!\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u0018J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00104\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00105\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010,R\u0014\u00106\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010,R\u0014\u00107\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010,R\u0014\u00108\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010,R\u0014\u00109\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010,R\u0014\u0010:\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010,R\u0014\u0010;\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010,R\u0014\u0010<\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010,R\u0014\u0010=\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010,R\u0014\u0010>\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010,R\u0014\u0010?\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010,R\u0014\u0010@\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010,R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER,\u0010I\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00130G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010K\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010*R\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0016\u0010\\\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010BR*\u0010^\u001a\u00020]2\u0006\u0010\u001c\u001a\u00020]8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR*\u0010e\u001a\u00020d2\u0006\u0010\u001c\u001a\u00020d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR.\u0010k\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR*\u0010q\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010B\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR*\u0010v\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010B\u001a\u0004\bw\u0010s\"\u0004\bx\u0010uR.\u0010y\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010l\u001a\u0004\bz\u0010n\"\u0004\b{\u0010pR.\u0010|\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010l\u001a\u0004\b}\u0010n\"\u0004\b~\u0010pR\u0014\u0010\u007f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010s¨\u0006\u0081\u0001"}, d2 = {"Lru/ozon/uni/android/controls/button/InputSelectButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "inputTextValue", "labelValue", "", "isDisabled", "isReadOnly", "", "setInputState", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "Lru/ozon/uni/android/controls/common/ButtonImageView;", "showLock", "()Lru/ozon/uni/android/controls/common/ButtonImageView;", "showCopy", "showPickerIcon", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/android/controls/common/ButtonTextView;", "showValue", "(Ljava/lang/CharSequence;)Lru/ozon/uni/android/controls/common/ButtonTextView;", "showCaption", "showLabel", "createValueText", "()Lru/ozon/uni/android/controls/common/ButtonTextView;", "createLabelTextView", "createCaptionTextView", "createPrimaryIcon", "createSecondaryIcon", "text", "addTextToClipboard", "(Ljava/lang/String;)V", "errorColor", "I", "neutralStrokeColor", "disabledStrokeColor", "", "size500CornerRadius", "F", "size500InnerPadding", "size600CornerRadius", "size500InputHeight", "size600InputHeight", "dp16", "dp10", "strokeWidth", "dp4", "dp2", "readOnlyIconRes", "copyIconRes", "pickerIconRes", "regularTextColor", "secondaryTextColor", "disabledTextColor", "invalid", "Z", "Landroid/graphics/Rect;", "delegateArea", "Landroid/graphics/Rect;", "", "Lkotlin/Function1;", "Landroid/view/View;", "locatorInitializers", "Ljava/util/Map;", "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "Landroid/graphics/drawable/GradientDrawable;", "inputBackground", "Landroid/graphics/drawable/GradientDrawable;", "backgroundView", "Landroid/view/View;", "valueTextView", "Lru/ozon/uni/android/controls/common/ButtonTextView;", "inputLabelTextView", "captionLabelTextView", "primaryIconView", "Lru/ozon/uni/android/controls/common/ButtonImageView;", "secondaryIconView", "hasLabel", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO$Size;", "size", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO$Size;", "getSize", "()Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO$Size;", "setSize", "(Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO$Size;)V", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO$Status;", "status", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO$Status;", "getStatus", "()Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO$Status;", "setStatus", "(Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO$Status;)V", "caption", "Ljava/lang/CharSequence;", "getCaption", "()Ljava/lang/CharSequence;", "setCaption", "(Ljava/lang/CharSequence;)V", "disabled", "getDisabled", "()Z", "setDisabled", "(Z)V", "readOnly", "getReadOnly", "setReadOnly", "inputText", "getInputText", "setInputText", "label", "getLabel", "setLabel", "isSize600", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InputSelectButtonView extends ConstraintLayout implements AtomView, AtomLocatableView {

    @NotNull
    private View backgroundView;
    private CharSequence caption;
    private ButtonTextView captionLabelTextView;
    private final int copyIconRes;

    @NotNull
    private final Rect delegateArea;
    private boolean disabled;
    private final int disabledStrokeColor;
    private final int disabledTextColor;
    private final int dp10;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int errorColor;
    private boolean hasLabel;

    @NotNull
    private GradientDrawable inputBackground;
    private ButtonTextView inputLabelTextView;
    private CharSequence inputText;
    private boolean invalid;
    private CharSequence label;

    @NotNull
    private final Map<Integer, Function1<View, Unit>> locatorInitializers;

    @NotNull
    private String locatorTag;
    private final int neutralStrokeColor;
    private final int pickerIconRes;
    private ButtonImageView primaryIconView;
    private boolean readOnly;
    private final int readOnlyIconRes;
    private final int regularTextColor;
    private ButtonImageView secondaryIconView;
    private final int secondaryTextColor;

    @NotNull
    private InputSelectButtonDTO.Size size;
    private final float size500CornerRadius;
    private final int size500InnerPadding;
    private final int size500InputHeight;
    private final float size600CornerRadius;
    private final int size600InputHeight;

    @NotNull
    private InputSelectButtonDTO.Status status;
    private final int strokeWidth;
    private ButtonTextView valueTextView;
    public static final int $stable = 8;

    public /* synthetic */ InputSelectButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addTextToClipboard(String text) {
        if (h.K(text)) {
            return;
        }
        Object systemService = getContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(text, text));
        }
    }

    private final ButtonTextView createCaptionTextView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonTextView buttonTextView = new ButtonTextView(context, null, 0, 6, null);
        buttonTextView.setId(R$id.inputSelectButtonCaption);
        buttonTextView.setMaxLines(3);
        buttonTextView.setEllipsize(TextUtils.TruncateAt.END);
        buttonTextView.setLayoutParams(new ConstraintLayout.b(0, -2));
        Context context2 = buttonTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(buttonTextView, context2, R$style.OzonTextAppearance_Body_300xsmall);
        this.captionLabelTextView = buttonTextView;
        addView(buttonTextView);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, buttonTextView, this.backgroundView);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, buttonTextView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, buttonTextView);
        ConstraintSetExtKt.setHorizontalMargin(dVar, buttonTextView, this.dp16);
        dVar.e0(buttonTextView.getId(), 3, this.dp4);
        dVar.f(this);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(buttonTextView.getId()));
        if (function1 != null) {
            function1.invoke(buttonTextView);
        }
        return buttonTextView;
    }

    private final ButtonTextView createLabelTextView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonTextView buttonTextView = new ButtonTextView(context, null, 0, 6, null);
        buttonTextView.setId(R$id.inputSelectButtonLabel);
        buttonTextView.setMaxLines(1);
        buttonTextView.setEllipsize(TextUtils.TruncateAt.END);
        buttonTextView.setLayoutParams(new ConstraintLayout.b(0, -2));
        Context context2 = buttonTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(buttonTextView, context2, R$style.OzonTextAppearance_Body_300xsmall);
        this.inputLabelTextView = buttonTextView;
        addView(buttonTextView);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, buttonTextView);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, buttonTextView);
        int id2 = buttonTextView.getId();
        ButtonImageView buttonImageView = this.secondaryIconView;
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, id2, buttonImageView != null ? buttonImageView.getId() : 0);
        dVar.e0(buttonTextView.getId(), 3, this.size500InnerPadding);
        ConstraintSetExtKt.setHorizontalMargin(dVar, buttonTextView, this.dp16);
        dVar.f(this);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(buttonTextView.getId()));
        if (function1 != null) {
            function1.invoke(buttonTextView);
        }
        return buttonTextView;
    }

    private final ButtonImageView createPrimaryIcon() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonImageView buttonImageView = new ButtonImageView(context, null, 0, 6, null);
        buttonImageView.setId(R$id.inputSelectButtonPrimaryIcon);
        buttonImageView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        buttonImageView.setImageResource(this.readOnlyIconRes);
        this.primaryIconView = buttonImageView;
        addView(buttonImageView);
        d dVar = new d();
        dVar.p(this);
        if (this.hasLabel) {
            int id2 = buttonImageView.getId();
            View view = this.inputLabelTextView;
            if (view == null) {
                view = this.backgroundView;
            }
            ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, id2, view.getId());
            dVar.e0(buttonImageView.getId(), 3, this.dp2);
            dVar.e0(buttonImageView.getId(), 4, this.size500InnerPadding);
        } else {
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, buttonImageView);
            dVar.e0(buttonImageView.getId(), 6, this.dp16);
        }
        int id3 = buttonImageView.getId();
        ButtonTextView buttonTextView = this.inputLabelTextView;
        ConstraintSetExtKt.layoutConstraintStartToStartOf(dVar, id3, buttonTextView != null ? buttonTextView.getId() : 0);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(dVar, buttonImageView.getId(), this.backgroundView.getId());
        dVar.f(this);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(buttonImageView.getId()));
        if (function1 != null) {
            function1.invoke(buttonImageView);
        }
        Object parent = buttonImageView.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.setTouchDelegate(new TouchDelegate(this.delegateArea, this.primaryIconView));
        }
        return buttonImageView;
    }

    private final ButtonImageView createSecondaryIcon() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonImageView buttonImageView = new ButtonImageView(context, null, 0, 6, null);
        buttonImageView.setId(R$id.inputSelectButtonSecondaryIcon);
        buttonImageView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.secondaryIconView = buttonImageView;
        addView(buttonImageView);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, buttonImageView);
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, buttonImageView, this.backgroundView);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(dVar, buttonImageView, this.backgroundView);
        dVar.e0(buttonImageView.getId(), 7, isSize600() ? this.dp16 : this.dp10);
        dVar.f(this);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(buttonImageView.getId()));
        if (function1 != null) {
            function1.invoke(buttonImageView);
        }
        Object parent = buttonImageView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setTouchDelegate(new TouchDelegate(this.delegateArea, this.secondaryIconView));
        }
        return buttonImageView;
    }

    private final ButtonTextView createValueText() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonTextView buttonTextView = new ButtonTextView(context, null, 0, 6, null);
        buttonTextView.setId(R$id.inputSelectButtonValue);
        buttonTextView.setMaxLines(1);
        buttonTextView.setEllipsize(TextUtils.TruncateAt.END);
        buttonTextView.setLayoutParams(new ConstraintLayout.b(0, -2));
        Context context2 = buttonTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(buttonTextView, context2, R$style.OzonTextAppearance_Compact_500medium);
        this.valueTextView = buttonTextView;
        addView(buttonTextView);
        d dVar = new d();
        dVar.p(this);
        dVar.e0(buttonTextView.getId(), 7, this.dp16);
        int id2 = buttonTextView.getId();
        ButtonImageView buttonImageView = this.secondaryIconView;
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, id2, buttonImageView != null ? buttonImageView.getId() : 0);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, buttonTextView);
        if (this.hasLabel) {
            ButtonTextView buttonTextView2 = this.inputLabelTextView;
            if (buttonTextView2 != null) {
                ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, buttonTextView, buttonTextView2);
            }
            dVar.e0(buttonTextView.getId(), 3, this.dp16);
        }
        View view = this.primaryIconView;
        if (view == null) {
            view = this.backgroundView;
        }
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, buttonTextView, view);
        View view2 = this.primaryIconView;
        if (view2 == null) {
            view2 = this.backgroundView;
        }
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(dVar, buttonTextView, view2);
        dVar.f(this);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(buttonTextView.getId()));
        if (function1 != null) {
            function1.invoke(buttonTextView);
        }
        return buttonTextView;
    }

    private final boolean isSize600() {
        return this.size == InputSelectButtonDTO.Size.SIZE_600;
    }

    private final void setDisabled(boolean z11) {
        this.disabled = z11;
        if (z11) {
            setStatus(InputSelectButtonDTO.Status.STATUS_NEUTRAL);
            View view = this.backgroundView;
            GradientDrawable gradientDrawable = this.inputBackground;
            gradientDrawable.setStroke(this.strokeWidth, this.disabledStrokeColor);
            view.setBackground(gradientDrawable);
            ButtonTextView buttonTextView = this.valueTextView;
            if (buttonTextView != null) {
                buttonTextView.setTextColor(this.disabledTextColor);
            }
            ButtonImageView buttonImageView = this.primaryIconView;
            if (buttonImageView != null) {
                ViewExtKt.gone(buttonImageView);
            }
            ButtonImageView buttonImageView2 = this.secondaryIconView;
            if (buttonImageView2 != null) {
                ViewExtKt.gone(buttonImageView2);
            }
        }
    }

    private final void setInputText(CharSequence charSequence) {
        this.inputText = charSequence;
        if (charSequence != null && charSequence.length() != 0) {
            showValue(this.inputText);
            return;
        }
        ButtonTextView buttonTextView = this.valueTextView;
        if (buttonTextView != null) {
            ViewExtKt.gone(buttonTextView);
        }
        ButtonImageView buttonImageView = this.secondaryIconView;
        if (buttonImageView != null) {
            ViewExtKt.gone(buttonImageView);
        }
    }

    private final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
        boolean z11 = charSequence == null || charSequence.length() == 0;
        this.hasLabel = !z11;
        if (!z11) {
            showLabel(this.label);
            return;
        }
        ButtonTextView buttonTextView = this.inputLabelTextView;
        if (buttonTextView != null) {
            ViewExtKt.gone(buttonTextView);
        }
    }

    private final void setReadOnly(boolean z11) {
        this.readOnly = z11;
        if (z11) {
            setStatus(InputSelectButtonDTO.Status.STATUS_NEUTRAL);
            ButtonTextView buttonTextView = this.captionLabelTextView;
            if (buttonTextView != null) {
                buttonTextView.setTextColor(this.secondaryTextColor);
            }
            showLock();
            CharSequence charSequence = this.inputText;
            if (charSequence == null || charSequence.length() == 0) {
                return;
            }
            showCopy();
        }
    }

    private final ButtonTextView showCaption(CharSequence value) {
        ButtonTextView buttonTextView = this.captionLabelTextView;
        if (buttonTextView == null) {
            buttonTextView = createCaptionTextView();
        }
        buttonTextView.setText(value);
        buttonTextView.setTextColor(this.invalid ? this.errorColor : this.secondaryTextColor);
        ViewExtKt.show(buttonTextView);
        return buttonTextView;
    }

    private final ButtonImageView showCopy() {
        ButtonImageView buttonImageView = this.secondaryIconView;
        if (buttonImageView == null) {
            buttonImageView = createSecondaryIcon();
        }
        buttonImageView.setImageResource(this.copyIconRes);
        buttonImageView.setOnClickListener(new ViewOnClickListenerC2437a(this, 8));
        ThemeExtKt.tint(buttonImageView, Integer.valueOf(this.secondaryTextColor));
        ViewExtKt.show(buttonImageView);
        return buttonImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCopy$lambda$16$lambda$15(InputSelectButtonView inputSelectButtonView, View view) {
        inputSelectButtonView.addTextToClipboard(String.valueOf(inputSelectButtonView.inputText));
    }

    private final ButtonTextView showLabel(CharSequence value) {
        ButtonTextView buttonTextView = this.inputLabelTextView;
        if (buttonTextView == null) {
            buttonTextView = createLabelTextView();
        }
        buttonTextView.setText(value);
        buttonTextView.setTextColor(this.secondaryTextColor);
        ViewExtKt.show(buttonTextView);
        return buttonTextView;
    }

    private final ButtonImageView showLock() {
        ButtonImageView buttonImageView = this.primaryIconView;
        if (buttonImageView == null) {
            buttonImageView = createPrimaryIcon();
        }
        buttonImageView.setImageResource(this.readOnlyIconRes);
        ThemeExtKt.tint(buttonImageView, Integer.valueOf(this.secondaryTextColor));
        ViewExtKt.show(buttonImageView);
        return buttonImageView;
    }

    private final ButtonImageView showPickerIcon() {
        ButtonImageView buttonImageView = this.secondaryIconView;
        if (buttonImageView == null) {
            buttonImageView = createSecondaryIcon();
        }
        buttonImageView.setImageResource(this.pickerIconRes);
        ThemeExtKt.tint(buttonImageView, Integer.valueOf(this.secondaryTextColor));
        ViewExtKt.show(buttonImageView);
        return buttonImageView;
    }

    private final ButtonTextView showValue(CharSequence value) {
        ButtonTextView buttonTextView = this.valueTextView;
        if (buttonTextView == null) {
            buttonTextView = createValueText();
        }
        buttonTextView.setText(value);
        buttonTextView.setTextColor(this.regularTextColor);
        ViewExtKt.show(buttonTextView);
        return buttonTextView;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    public final void setCaption(CharSequence charSequence) {
        this.caption = charSequence;
        if (charSequence != null && charSequence.length() != 0) {
            showCaption(this.caption);
            return;
        }
        ButtonTextView buttonTextView = this.captionLabelTextView;
        if (buttonTextView != null) {
            ViewExtKt.gone(buttonTextView);
        }
    }

    public final void setInputState(String inputTextValue, String labelValue, boolean isDisabled, boolean isReadOnly) {
        ButtonTextView buttonTextView;
        boolean z11 = inputTextValue == null || inputTextValue.length() == 0;
        if (isReadOnly) {
            if (isSize600()) {
                setLabel(labelValue);
            }
            setInputText(inputTextValue);
        } else if (!z11) {
            if (isSize600()) {
                setLabel(labelValue);
            }
            setInputText(inputTextValue);
        } else if (z11) {
            setInputText(labelValue);
            this.hasLabel = false;
        }
        if (isReadOnly) {
            setReadOnly(true);
        } else {
            setDisabled(isDisabled);
        }
        if (!this.readOnly || (buttonTextView = this.valueTextView) == null) {
            ButtonTextView buttonTextView2 = this.valueTextView;
            if (buttonTextView2 != null) {
                ViewGroup.LayoutParams layoutParams = buttonTextView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(this.dp16);
                buttonTextView2.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        if (buttonTextView != null) {
            d dVar = new d();
            dVar.p(this);
            int id2 = buttonTextView.getId();
            ButtonImageView buttonImageView = this.primaryIconView;
            ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, id2, buttonImageView != null ? buttonImageView.getId() : 0);
            dVar.e0(buttonTextView.getId(), 6, this.dp4);
            dVar.f(this);
        }
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

    public final void setSize(@NotNull InputSelectButtonDTO.Size value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value == this.size) {
            return;
        }
        this.size = value;
        float f7 = isSize600() ? this.size600CornerRadius : this.size500CornerRadius;
        ButtonImageView buttonImageView = this.secondaryIconView;
        if (buttonImageView != null) {
            d dVar = new d();
            dVar.p(this);
            dVar.e0(buttonImageView.getId(), 7, isSize600() ? this.dp16 : this.dp10);
            dVar.f(this);
        }
        View view = this.backgroundView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = isSize600() ? this.size600InputHeight : this.size500InputHeight;
        view.setLayoutParams(layoutParams);
        d dVar2 = new d();
        dVar2.p(this);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar2, view);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar2, view);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar2, view);
        dVar2.f(this);
        this.inputBackground.setCornerRadius(f7);
        this.backgroundView.setBackground(this.inputBackground);
    }

    public final void setStatus(@NotNull InputSelectButtonDTO.Status value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.disabled && !this.readOnly) {
            this.status = value;
        }
        boolean z11 = this.status == InputSelectButtonDTO.Status.STATUS_ERROR;
        this.invalid = z11;
        int i11 = z11 ? this.errorColor : this.neutralStrokeColor;
        GradientDrawable gradientDrawable = this.inputBackground;
        gradientDrawable.setStroke(this.strokeWidth, i11);
        this.inputBackground = gradientDrawable;
        if (!Intrinsics.d(this.backgroundView.getBackground(), this.inputBackground)) {
            this.backgroundView.setBackground(this.inputBackground);
        }
        showPickerIcon();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputSelectButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.errorColor = a.getColor(context, R$color.bg_active_negative_primary);
        this.neutralStrokeColor = a.getColor(context, R$color.graphic_neutral);
        this.disabledStrokeColor = a.getColor(context, R$color.graphic_disabled);
        this.size500CornerRadius = UiExtKt.toPxF(12);
        this.size500InnerPadding = UiExtKt.toPx(9);
        float pxF = UiExtKt.toPxF(16);
        this.size600CornerRadius = pxF;
        this.size500InputHeight = UiExtKt.toPx(44);
        int px = UiExtKt.toPx(56);
        this.size600InputHeight = px;
        this.dp16 = UiExtKt.toPx(16);
        this.dp10 = UiExtKt.toPx(10);
        this.strokeWidth = UiExtKt.toPx(1);
        this.dp4 = UiExtKt.toPx(4);
        this.dp2 = UiExtKt.toPx(2);
        this.readOnlyIconRes = R$drawable.ic_s_lock_closed_filled;
        this.copyIconRes = R$drawable.ic_m_copy_filled;
        this.pickerIconRes = R$drawable.ic_m_picker;
        this.regularTextColor = a.getColor(context, R$color.text_primary);
        this.secondaryTextColor = a.getColor(context, R$color.text_tertiary);
        this.disabledTextColor = a.getColor(context, R$color.text_secondary);
        this.delegateArea = new Rect();
        this.locatorInitializers = U.j(new Pair(Integer.valueOf(R$id.inputSelectButtonValue), new InputSelectButtonView$locatorInitializers$1(this)), new Pair(Integer.valueOf(R$id.inputSelectButtonLabel), new InputSelectButtonView$locatorInitializers$2(this)), new Pair(Integer.valueOf(R$id.inputSelectButtonCaption), new InputSelectButtonView$locatorInitializers$3(this)), new Pair(Integer.valueOf(R$id.inputSelectButtonPrimaryIcon), new InputSelectButtonView$locatorInitializers$4(this)), new Pair(Integer.valueOf(R$id.inputSelectButtonSecondaryIcon), new InputSelectButtonView$locatorInitializers$5(this)));
        this.locatorTag = "inputSelectButton";
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorStateList.valueOf(a.getColor(context, ru.ozon.uni.R$color.layer_floor_1)));
        gradientDrawable.setCornerRadius(pxF);
        this.inputBackground = gradientDrawable;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(-1, px));
        view.setBackground(this.inputBackground);
        this.backgroundView = view;
        InputSelectButtonDTO.Size size = InputSelectButtonDTO.Size.SIZE_600;
        this.size = size;
        InputSelectButtonDTO.Status status = InputSelectButtonDTO.Status.STATUS_NEUTRAL;
        this.status = status;
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        addView(this.backgroundView);
        setContentDescription(getLocatorTag());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.InputSelectButtonView, i11, i12);
        setSize(((InputSelectButtonDTO.Size[]) InputSelectButtonDTO.Size.getEntries().toArray(new InputSelectButtonDTO.Size[0]))[obtainStyledAttributes.getInt(R$styleable.InputSelectButtonView_inputSelectButtonSize, size.ordinal())]);
        setStatus(((InputSelectButtonDTO.Status[]) InputSelectButtonDTO.Status.getEntries().toArray(new InputSelectButtonDTO.Status[0]))[obtainStyledAttributes.getInt(R$styleable.InputSelectButtonView_inputSelectButtonStatus, status.ordinal())]);
        setCaption(obtainStyledAttributes.getText(R$styleable.InputSelectButtonView_caption));
        obtainStyledAttributes.recycle();
    }
}
