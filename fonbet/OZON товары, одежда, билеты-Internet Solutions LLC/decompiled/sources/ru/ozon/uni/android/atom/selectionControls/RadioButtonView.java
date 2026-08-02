package ru.ozon.uni.android.atom.selectionControls;

import D3.f;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.CompoundButton;
import androidx.vectordrawable.graphics.drawable.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.selectionControls.RadioButtonView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 _2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001_B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010#R*\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R0\u00104\u001a\u0002032\u0006\u0010)\u001a\u0002038@@@X\u0080\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010#\u001a\u0004\b6\u00107\"\u0004\b8\u00109R0\u0010;\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00168V@RX\u0096\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b@\u0010#\u001a\u0004\b;\u0010=\"\u0004\b>\u0010?R*\u0010B\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001d\u0010I\u001a\u0004\u0018\u00010D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001d\u0010L\u001a\u0004\u0018\u00010D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010HR\u001d\u0010Q\u001a\u0004\u0018\u00010M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010F\u001a\u0004\bO\u0010PR\u001d\u0010T\u001a\u0004\u0018\u00010D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010F\u001a\u0004\bS\u0010HR\u001d\u0010W\u001a\u0004\u0018\u00010D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010F\u001a\u0004\bV\u0010HR\u001d\u0010Z\u001a\u0004\u0018\u00010M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010F\u001a\u0004\bY\u0010PR\u0014\u0010^\u001a\u00020[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006`"}, d2 = {"Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "Landroid/widget/CompoundButton;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/os/Parcelable;", "state", "", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "setRadiobuttonError", "()V", "clearRadiobuttonError", "increaseTouchArea", "initListener", "refreshState", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "Landroid/graphics/Rect;", "touchArea", "Landroid/graphics/Rect;", "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;", "definedSize", "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;", "getDefinedSize$uni_release", "()Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;", "setDefinedSize$uni_release", "(Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;)V", "getDefinedSize$uni_release$annotations", "isError", "Z", "()Z", "setError", "(Z)V", "isError$annotations", "Lkotlin/Function2;", "changeStateListener", "Lkotlin/jvm/functions/Function2;", "Landroidx/vectordrawable/graphics/drawable/c;", "transitionCheckedToUnchecked500$delegate", "LSc/j;", "getTransitionCheckedToUnchecked500", "()Landroidx/vectordrawable/graphics/drawable/c;", "transitionCheckedToUnchecked500", "transitionUncheckedToChecked500$delegate", "getTransitionUncheckedToChecked500", "transitionUncheckedToChecked500", "Landroid/graphics/drawable/Drawable;", "buttonDrawable500$delegate", "getButtonDrawable500", "()Landroid/graphics/drawable/Drawable;", "buttonDrawable500", "transitionCheckedToUnchecked600$delegate", "getTransitionCheckedToUnchecked600", "transitionCheckedToUnchecked600", "transitionUncheckedToChecked600$delegate", "getTransitionUncheckedToChecked600", "transitionUncheckedToChecked600", "buttonDrawable600$delegate", "getButtonDrawable600", "buttonDrawable600", "Landroid/util/SizeF;", "getSize", "()Landroid/util/SizeF;", "size", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RadioButtonView extends CompoundButton implements AtomView, AtomLocatableView {

    @NotNull
    private static final int[] ERROR_STATE_SET_CHECKED;

    @NotNull
    private static final int[] ERROR_STATE_SET_UNCHECKED;
    private static final int EXTRA_DRAWABLE_STATE_SPACE;

    /* renamed from: buttonDrawable500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonDrawable500;

    /* renamed from: buttonDrawable600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonDrawable600;
    private Function2<? super RadioButtonView, ? super Boolean, Unit> changeStateListener;

    @NotNull
    private RadioDTO.RadioSize definedSize;
    private boolean isError;

    @NotNull
    private String locatorTag;

    @NotNull
    private Rect touchArea;

    /* renamed from: transitionCheckedToUnchecked500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionCheckedToUnchecked500;

    /* renamed from: transitionCheckedToUnchecked600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionCheckedToUnchecked600;

    /* renamed from: transitionUncheckedToChecked500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionUncheckedToChecked500;

    /* renamed from: transitionUncheckedToChecked600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionUncheckedToChecked600;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static boolean isAnimationsEnabled = true;
    private static final int SIZE_500_HIT_RECT_INC = UiExtKt.toPx(10);
    private static final int SIZE_600_HIT_RECT_INC = UiExtKt.toPx(6);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/android/atom/selectionControls/RadioButtonView$Companion;", "", "<init>", "()V", "", "isAnimationsEnabled", "Z", "()Z", "setAnimationsEnabled", "(Z)V", "", "RADIO_BUTTON_LOCATOR_TAG", "Ljava/lang/String;", "", "SIZE_500", "I", "SIZE_600", "TOUCH_AREA", "SIZE_500_HIT_RECT_INC", "SIZE_600_HIT_RECT_INC", "", "ERROR_STATE_SET_CHECKED", "[I", "ERROR_STATE_SET_UNCHECKED", "EXTRA_DRAWABLE_STATE_SPACE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isAnimationsEnabled() {
            return RadioButtonView.isAnimationsEnabled;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RadioDTO.RadioSize.values().length];
            try {
                iArr[RadioDTO.RadioSize.SIZE_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RadioDTO.RadioSize.SIZE_600.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i11 = R$attr.state_error;
        int[] iArr = {i11, R.attr.state_enabled, R.attr.state_checked};
        ERROR_STATE_SET_CHECKED = iArr;
        ERROR_STATE_SET_UNCHECKED = new int[]{i11, R.attr.state_enabled, -16842912};
        EXTRA_DRAWABLE_STATE_SPACE = iArr.length;
    }

    public /* synthetic */ RadioButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Drawable getButtonDrawable500() {
        return (Drawable) this.buttonDrawable500.getValue();
    }

    private final Drawable getButtonDrawable600() {
        return (Drawable) this.buttonDrawable600.getValue();
    }

    private final SizeF getSize() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getDefinedSize$uni_release().ordinal()];
        if (i11 == 1) {
            return new SizeF(UiExtKt.toPxF(24), UiExtKt.toPxF(24));
        }
        if (i11 == 2) {
            return new SizeF(UiExtKt.toPxF(32), UiExtKt.toPxF(32));
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionCheckedToUnchecked500() {
        return (c) this.transitionCheckedToUnchecked500.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionCheckedToUnchecked600() {
        return (c) this.transitionCheckedToUnchecked600.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionUncheckedToChecked500() {
        return (c) this.transitionUncheckedToChecked500.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionUncheckedToChecked600() {
        return (c) this.transitionUncheckedToChecked600.getValue();
    }

    private final void increaseTouchArea() {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.post(new f(2, this, view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void increaseTouchArea$lambda$1$lambda$0(RadioButtonView radioButtonView, View view) {
        radioButtonView.getHitRect(radioButtonView.touchArea);
        int i11 = WhenMappings.$EnumSwitchMapping$0[radioButtonView.getDefinedSize$uni_release().ordinal()];
        if (i11 == 1) {
            Rect rect = radioButtonView.touchArea;
            int i12 = rect.top;
            int i13 = SIZE_500_HIT_RECT_INC;
            rect.top = i12 - i13;
            rect.bottom += i13;
            rect.left -= i13;
            rect.right += i13;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            Rect rect2 = radioButtonView.touchArea;
            int i14 = rect2.top;
            int i15 = SIZE_600_HIT_RECT_INC;
            rect2.top = i14 - i15;
            rect2.bottom += i15;
            rect2.left -= i15;
            rect2.right += i15;
        }
        view.setTouchDelegate(new TouchDelegate(radioButtonView.touchArea, radioButtonView));
    }

    private final void initListener() {
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ok0.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                RadioButtonView.initListener$lambda$2(RadioButtonView.this, compoundButton, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(RadioButtonView radioButtonView, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        radioButtonView.clearRadiobuttonError();
        Function2<? super RadioButtonView, ? super Boolean, Unit> function2 = radioButtonView.changeStateListener;
        if (function2 != null) {
            function2.invoke(radioButtonView, Boolean.valueOf(z11));
        }
    }

    private final void refreshState() {
        Drawable buttonDrawable500;
        int i11 = WhenMappings.$EnumSwitchMapping$0[getDefinedSize$uni_release().ordinal()];
        if (i11 == 1) {
            buttonDrawable500 = getButtonDrawable500();
        } else {
            if (i11 != 2) {
                throw new o();
            }
            buttonDrawable500 = getButtonDrawable600();
        }
        setButtonDrawable(buttonDrawable500);
        requestLayout();
    }

    private void setError(boolean z11) {
        if (this.isError == z11) {
            return;
        }
        this.isError = z11;
        refreshDrawableState();
    }

    public void clearRadiobuttonError() {
        setError(false);
    }

    @NotNull
    public final RadioDTO.RadioSize getDefinedSize$uni_release() {
        RadioDTO.RadioSize radioSize = this.definedSize;
        return radioSize == null ? RadioDTO.RadioSize.SIZE_600 : radioSize;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    /* renamed from: isError, reason: from getter */
    public boolean getIsError() {
        return this.isError;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @NotNull
    protected int[] onCreateDrawableState(int extraSpace) {
        int[] onCreateDrawableState = super.onCreateDrawableState(extraSpace + EXTRA_DRAWABLE_STATE_SPACE);
        if (getIsError() && isEnabled()) {
            if (isChecked()) {
                View.mergeDrawableStates(onCreateDrawableState, ERROR_STATE_SET_CHECKED);
            } else {
                View.mergeDrawableStates(onCreateDrawableState, ERROR_STATE_SET_UNCHECKED);
            }
        }
        Intrinsics.f(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            increaseTouchArea();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension((int) getSize().getWidth(), (int) getSize().getHeight());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        CompoundButtonUtilsKt.safeOnRestoreInstanceState(this, new RadioButtonView$onRestoreInstanceState$1(this, state));
    }

    public final void setDefinedSize$uni_release(@NotNull RadioDTO.RadioSize value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.definedSize == value) {
            return;
        }
        this.definedSize = value;
        refreshState();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public void setRadiobuttonError() {
        setError(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = FormPageDTO.Field.FIELD_TYPE_RADIO;
        this.touchArea = new Rect();
        RadioDTO.RadioSize radioSize = RadioDTO.RadioSize.SIZE_500;
        this.definedSize = radioSize;
        n nVar = n.NONE;
        this.transitionCheckedToUnchecked500 = k.a(nVar, new RadioButtonView$transitionCheckedToUnchecked500$2(this));
        this.transitionUncheckedToChecked500 = k.a(nVar, new RadioButtonView$transitionUncheckedToChecked500$2(this));
        this.buttonDrawable500 = k.a(nVar, new RadioButtonView$buttonDrawable500$2(context, this));
        this.transitionCheckedToUnchecked600 = k.a(nVar, new RadioButtonView$transitionCheckedToUnchecked600$2(this));
        this.transitionUncheckedToChecked600 = k.a(nVar, new RadioButtonView$transitionUncheckedToChecked600$2(this));
        this.buttonDrawable600 = k.a(nVar, new RadioButtonView$buttonDrawable600$2(context, this));
        setClickable(true);
        setFocusable(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadioButtonView, i11, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setDefinedSize$uni_release(((RadioDTO.RadioSize[]) RadioDTO.RadioSize.getEntries().toArray(new RadioDTO.RadioSize[0]))[obtainStyledAttributes.getInt(R$styleable.RadioButtonView_radioButtonSize, radioSize.ordinal())]);
        setError(obtainStyledAttributes.getBoolean(R$styleable.RadioButtonView_state_error, false));
        obtainStyledAttributes.recycle();
        setContentDescription(getLocatorTag());
        initListener();
        refreshState();
    }
}
