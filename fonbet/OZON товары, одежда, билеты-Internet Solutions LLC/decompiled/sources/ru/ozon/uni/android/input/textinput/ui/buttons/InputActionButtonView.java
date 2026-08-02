package ru.ozon.uni.android.input.textinput.ui.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R*\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/uni/android/input/textinput/ui/buttons/InputActionButtonView;", "Landroid/widget/FrameLayout;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "actionButton", "", "bind", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;)V", "Lkotlin/Function1;", "Landroid/view/View;", "locatorInitializer", "Lkotlin/jvm/functions/Function1;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Landroidx/appcompat/widget/AppCompatImageView;", "currentModel", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "actionButtonClickListener", "getActionButtonClickListener", "()Lkotlin/jvm/functions/Function1;", "setActionButtonClickListener", "(Lkotlin/jvm/functions/Function1;)V", "", "viewAlpha", "F", "viewWidth", "I", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InputActionButtonView extends FrameLayout implements AtomLocatableView {
    private Function1<? super OzonTextInputUIModel.ActionButton, Unit> actionButtonClickListener;
    private OzonTextInputUIModel.ActionButton currentModel;

    @NotNull
    private final AppCompatImageView icon;

    @NotNull
    private final Function1<View, Unit> locatorInitializer;

    @NotNull
    private String locatorTag;
    private final float viewAlpha;
    private final int viewWidth;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/input/textinput/ui/buttons/InputActionButtonView$Companion;", "", "<init>", "()V", "INPUT_ACTION_BUTTON_LOCATOR_TAG", "", "ICON_LOCATOR_TAG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ InputActionButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(InputActionButtonView inputActionButtonView, View view) {
        Function1<? super OzonTextInputUIModel.ActionButton, Unit> function1;
        OzonTextInputUIModel.ActionButton actionButton = inputActionButtonView.currentModel;
        if (actionButton == null || (function1 = inputActionButtonView.actionButtonClickListener) == null) {
            return;
        }
        function1.invoke(actionButton);
    }

    public final void bind(OzonTextInputUIModel.ActionButton actionButton) {
        String str;
        if (actionButton == null) {
            this.currentModel = null;
            ViewExtKt.gone(this);
            return;
        }
        ViewExtKt.show(this);
        String icon = actionButton.getIcon();
        OzonTextInputUIModel.ActionButton actionButton2 = this.currentModel;
        if (actionButton2 == null || (str = actionButton2.getIcon()) == null) {
            str = "";
        }
        if (!Intrinsics.d(icon, str)) {
            ViewExtKt.setDrawableByNameOrGone(this.icon, actionButton.getIcon());
        }
        int tintColorResId = actionButton.getTintColorResId();
        OzonTextInputUIModel.ActionButton actionButton3 = this.currentModel;
        if (tintColorResId != (actionButton3 != null ? actionButton3.getTintColorResId() : -1)) {
            this.icon.setColorFilter(a.getColor(getContext(), actionButton.getTintColorResId()));
        }
        this.currentModel = actionButton;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    public final void setActionButtonClickListener(Function1<? super OzonTextInputUIModel.ActionButton, Unit> function1) {
        this.actionButtonClickListener = function1;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription("inputActionButton");
        this.locatorInitializer.invoke(this.icon);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputActionButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        InputActionButtonView$locatorInitializer$1 inputActionButtonView$locatorInitializer$1 = new InputActionButtonView$locatorInitializer$1(this);
        this.locatorInitializer = inputActionButtonView$locatorInitializer$1;
        this.locatorTag = "inputActionButton";
        this.viewAlpha = 0.4f;
        int px = UiExtKt.toPx(24);
        this.viewWidth = px;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.inputActionButtonIcon);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(px, -2);
        layoutParams.gravity = 17;
        appCompatImageView.setAlpha(0.4f);
        inputActionButtonView$locatorInitializer$1.invoke((InputActionButtonView$locatorInitializer$1) appCompatImageView);
        addView(appCompatImageView, layoutParams);
        this.icon = appCompatImageView;
        setOnClickListener(new CX.a(this, 1));
    }
}
