package ru.ozon.uni.android.wrappers.main.button;

import Nk0.a;
import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TVExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.main.BackgroundWrapper;
import ru.ozon.uni.core.R$color;

@InterfaceC3999a
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u0016\u0010/\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/uni/android/wrappers/main/button/ButtonWrapper;", "Landroid/view/View;", "MV", "Lru/ozon/uni/android/wrappers/main/BackgroundWrapper;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "hasFocus", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackgroundColorDefault", "(Z)Lru/ozon/uni/android/uikitsdk/Color;", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "onButtonPressed", "()V", "onButtonDisabled", "onButtonEnabled", "isContentCentered", "setView", "(Z)V", "Lru/ozon/uni/android/wrappers/main/button/ButtonState;", "state", "setButtonState", "(Lru/ozon/uni/android/wrappers/main/button/ButtonState;)V", "backgroundColorActive", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackgroundColorActive$uni_release", "()Lru/ozon/uni/android/uikitsdk/Color;", "setBackgroundColorActive$uni_release", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "backgroundColorDefault", "getBackgroundColorDefault$uni_release", "setBackgroundColorDefault$uni_release", "backgroundColorDisabled", "getBackgroundColorDisabled$uni_release", "setBackgroundColorDisabled$uni_release", "buttonState", "Lru/ozon/uni/android/wrappers/main/button/ButtonState;", "getMainView", "()Landroid/view/View;", "mainView", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ButtonWrapper<MV extends View> extends BackgroundWrapper {

    @NotNull
    private Color backgroundColorActive;

    @NotNull
    private Color backgroundColorDefault;

    @NotNull
    private Color backgroundColorDisabled;

    @NotNull
    private ButtonState buttonState;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonState.values().length];
            try {
                iArr[ButtonState.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonState.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonState.PRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonWrapper(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ButtonWrapper buttonWrapper, View view, boolean z11) {
        buttonWrapper.setCurrentBackgroundColor(buttonWrapper.getBackgroundColorDefault(z11));
    }

    private final Color getBackgroundColorDefault(boolean hasFocus) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (!TVExtKt.isAppOpenOnTV(context) || hasFocus) ? this.backgroundColorDefault : new Color.Solid(getContext().getColor(R$color.bg_primary));
    }

    static /* synthetic */ Color getBackgroundColorDefault$default(ButtonWrapper buttonWrapper, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBackgroundColorDefault");
        }
        if ((i11 & 1) != 0) {
            z11 = buttonWrapper.isFocused();
        }
        return buttonWrapper.getBackgroundColorDefault(z11);
    }

    public static /* synthetic */ void setView$default(ButtonWrapper buttonWrapper, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setView");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        buttonWrapper.setView(z11);
    }

    @NotNull
    /* renamed from: getBackgroundColorDefault$uni_release, reason: from getter */
    public final Color getBackgroundColorDefault() {
        return this.backgroundColorDefault;
    }

    @NotNull
    public abstract MV getMainView();

    public abstract void onButtonDisabled();

    public abstract void onButtonEnabled();

    public abstract void onButtonPressed();

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ButtonState buttonState = this.buttonState;
        ButtonState buttonState2 = ButtonState.ENABLED;
        if (buttonState != buttonState2 && buttonState != ButtonState.PRESSED) {
            return super.onTouchEvent(event);
        }
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            setButtonState(ButtonState.PRESSED);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            setButtonState(buttonState2);
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            setButtonState(buttonState2);
        }
        return true;
    }

    public final void setBackgroundColorActive$uni_release(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.backgroundColorActive = color;
    }

    public final void setBackgroundColorDefault$uni_release(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.backgroundColorDefault = color;
    }

    public final void setBackgroundColorDisabled$uni_release(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "<set-?>");
        this.backgroundColorDisabled = color;
    }

    public final void setButtonState(@NotNull ButtonState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.buttonState = state;
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            setCurrentBackgroundColor(getBackgroundColorDefault$default(this, false, 1, null));
            onButtonEnabled();
        } else if (i11 == 2) {
            setCurrentBackgroundColor(this.backgroundColorDisabled);
            onButtonDisabled();
        } else {
            if (i11 != 3) {
                throw new o();
            }
            setCurrentBackgroundColor(this.backgroundColorActive);
            onButtonPressed();
        }
    }

    public void setView(boolean isContentCentered) {
        addView(getMainView(), isContentCentered);
        setButtonState(this.buttonState);
    }

    public /* synthetic */ ButtonWrapper(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWrapper(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonState buttonState = ButtonState.ENABLED;
        this.buttonState = buttonState;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonWrapper, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.buttonState = ((ButtonState[]) ButtonState.getEntries().toArray(new ButtonState[0]))[obtainStyledAttributes.getInt(R$styleable.ButtonWrapper_buttonState, buttonState.ordinal())];
        this.backgroundColorDefault = TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.ButtonWrapper_backgroundGradient, R$styleable.ButtonWrapper_backgroundColor, getDefaultBackgroundColor());
        this.backgroundColorActive = TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.ButtonWrapper_backgroundGradientActive, R$styleable.ButtonWrapper_backgroundColorActive, getDefaultBackgroundColor());
        this.backgroundColorDisabled = TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.ButtonWrapper_backgroundGradientDisabled, R$styleable.ButtonWrapper_backgroundColorDisabled, getDefaultBackgroundColor());
        obtainStyledAttributes.recycle();
        if (TVExtKt.isAppOpenOnTV(context)) {
            ViewExtKt.enableFocusable(this, attributeSet);
            setOnFocusChangeListener(new a(this, 0));
        }
    }
}
