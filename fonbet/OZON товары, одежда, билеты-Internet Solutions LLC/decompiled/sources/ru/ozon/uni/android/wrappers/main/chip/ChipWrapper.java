package ru.ozon.uni.android.wrappers.main.chip;

import CG.c;
import Ok0.a;
import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.wrappers.main.BackgroundWrapper;

@InterfaceC3999a
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H&¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u0010-\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u001bR\"\u00102\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010;\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\"\u0010>\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u00103\u001a\u0004\b?\u00105\"\u0004\b@\u00107R\"\u0010A\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u00103\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\"\u0010D\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u00103\u001a\u0004\bE\u00105\"\u0004\bF\u00107R\"\u0010G\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u00103\u001a\u0004\bH\u00105\"\u0004\bI\u00107R\u0014\u0010L\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/ozon/uni/android/wrappers/main/chip/ChipWrapper;", "Landroid/view/View;", "MV", "Lru/ozon/uni/android/wrappers/main/BackgroundWrapper;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "onChipEnabled", "()V", "onChipDisabled", "onChipPressed", "onChipSelected", "isContentCentered", "setView", "(Z)V", "Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "state", "setChipState", "(Lru/ozon/uni/android/wrappers/main/chip/ChipState;)V", "savedState", "Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "chipState", "Lkotlin/Function0;", "onSelect", "Lkotlin/jvm/functions/Function0;", "getOnSelect", "()Lkotlin/jvm/functions/Function0;", "setOnSelect", "(Lkotlin/jvm/functions/Function0;)V", "onUnselect", "getOnUnselect", "setOnUnselect", "unselectByClick", "Z", "getUnselectByClick", "()Z", "setUnselectByClick", "backgroundColorActive", "I", "getBackgroundColorActive$uni_release", "()I", "setBackgroundColorActive$uni_release", "(I)V", "backgroundColorEnabled", "getBackgroundColorEnabled$uni_release", "setBackgroundColorEnabled$uni_release", "backgroundColorDisabled", "getBackgroundColorDisabled$uni_release", "setBackgroundColorDisabled$uni_release", "backgroundColorSelected", "getBackgroundColorSelected$uni_release", "setBackgroundColorSelected$uni_release", "chipBorderColor", "getChipBorderColor$uni_release", "setChipBorderColor$uni_release", "chipBorderColorActive", "getChipBorderColorActive$uni_release", "setChipBorderColorActive$uni_release", "chipBorderColorSelected", "getChipBorderColorSelected$uni_release", "setChipBorderColorSelected$uni_release", "getMainView", "()Landroid/view/View;", "mainView", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ChipWrapper<MV extends View> extends BackgroundWrapper {
    private int backgroundColorActive;
    private int backgroundColorDisabled;
    private int backgroundColorEnabled;
    private int backgroundColorSelected;
    private int chipBorderColor;
    private int chipBorderColorActive;
    private int chipBorderColorSelected;

    @NotNull
    private ChipState chipState;
    private Function0<Unit> onSelect;
    private Function0<Unit> onUnselect;

    @NotNull
    private ChipState savedState;
    private boolean unselectByClick;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChipState.values().length];
            try {
                iArr[ChipState.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChipState.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChipState.PRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChipState.SELECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipWrapper(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setChipState$lambda$0(ChipWrapper chipWrapper, View view) {
        Function0<Unit> function0 = chipWrapper.onUnselect;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setChipState$lambda$1(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setChipState$lambda$2(ChipWrapper chipWrapper, View view) {
        Function0<Unit> function0 = chipWrapper.onSelect;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void setView$default(ChipWrapper chipWrapper, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setView");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        chipWrapper.setView(z11);
    }

    /* renamed from: getBackgroundColorEnabled$uni_release, reason: from getter */
    public final int getBackgroundColorEnabled() {
        return this.backgroundColorEnabled;
    }

    /* renamed from: getChipBorderColor$uni_release, reason: from getter */
    public final int getChipBorderColor() {
        return this.chipBorderColor;
    }

    @NotNull
    public abstract MV getMainView();

    public abstract void onChipDisabled();

    public abstract void onChipEnabled();

    public abstract void onChipPressed();

    public abstract void onChipSelected();

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ChipState chipState = this.chipState;
        if (chipState == ChipState.DISABLED) {
            return super.onTouchEvent(event);
        }
        ChipState chipState2 = ChipState.SELECTED;
        if (chipState == chipState2 && !this.unselectByClick) {
            return super.onTouchEvent(event);
        }
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            ChipState chipState3 = this.chipState;
            ChipState chipState4 = ChipState.PRESSED;
            if (chipState3 != chipState4) {
                this.savedState = chipState3;
            }
            setChipState(chipState4);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            ChipState chipState5 = this.savedState;
            ChipState chipState6 = ChipState.ENABLED;
            if (chipState5 != chipState6) {
                chipState2 = chipState6;
            }
            setChipState(chipState2);
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            setChipState(this.savedState);
        }
        return true;
    }

    public final void setBackgroundColorActive$uni_release(int i11) {
        this.backgroundColorActive = i11;
    }

    public final void setBackgroundColorDisabled$uni_release(int i11) {
        this.backgroundColorDisabled = i11;
    }

    public final void setBackgroundColorEnabled$uni_release(int i11) {
        this.backgroundColorEnabled = i11;
    }

    public final void setBackgroundColorSelected$uni_release(int i11) {
        this.backgroundColorSelected = i11;
    }

    public final void setChipBorderColor$uni_release(int i11) {
        this.chipBorderColor = i11;
    }

    public final void setChipBorderColorActive$uni_release(int i11) {
        this.chipBorderColorActive = i11;
    }

    public final void setChipBorderColorSelected$uni_release(int i11) {
        this.chipBorderColorSelected = i11;
    }

    public final void setChipState(@NotNull ChipState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.chipState = state;
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            setOnClickListener(new c(this, 3));
            setCurrentBackgroundColor(new Color.Solid(this.backgroundColorEnabled));
            setCurrentBorderColor(Integer.valueOf(this.chipBorderColor));
            setBorderWidth(1);
            onChipEnabled();
            return;
        }
        if (i11 == 2) {
            setOnClickListener(new a());
            setCurrentBackgroundColor(new Color.Solid(this.backgroundColorDisabled));
            setBorderWidth(0);
            onChipDisabled();
            return;
        }
        if (i11 == 3) {
            setCurrentBackgroundColor(new Color.Solid(this.backgroundColorActive));
            setCurrentBorderColor(Integer.valueOf(this.chipBorderColorActive));
            setBorderWidth(1);
            onChipPressed();
            return;
        }
        if (i11 != 4) {
            throw new o();
        }
        setOnClickListener(new FG.a(this, 5));
        setCurrentBackgroundColor(new Color.Solid(this.backgroundColorSelected));
        setCurrentBorderColor(Integer.valueOf(this.chipBorderColorSelected));
        setBorderWidth(2);
        onChipSelected();
    }

    public final void setOnSelect(Function0<Unit> function0) {
        this.onSelect = function0;
    }

    public final void setOnUnselect(Function0<Unit> function0) {
        this.onUnselect = function0;
    }

    public final void setUnselectByClick(boolean z11) {
        this.unselectByClick = z11;
    }

    public void setView(boolean isContentCentered) {
        addView(getMainView(), isContentCentered);
        setChipState(this.chipState);
    }

    public /* synthetic */ ChipWrapper(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipWrapper(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ChipState chipState = ChipState.ENABLED;
        this.savedState = chipState;
        this.chipState = chipState;
        this.unselectByClick = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ChipWrapper, i11, i12);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.chipState = ((ChipState[]) ChipState.getEntries().toArray(new ChipState[0]))[obtainStyledAttributes.getInt(R$styleable.ChipWrapper_chipState, chipState.ordinal())];
        this.backgroundColorEnabled = obtainStyledAttributes.getColor(R$styleable.ChipWrapper_backgroundColor, getDefaultBackgroundColor());
        setCurrentBackgroundColor(new Color.Solid(this.backgroundColorEnabled));
        this.backgroundColorActive = obtainStyledAttributes.getColor(R$styleable.ChipWrapper_backgroundColorActive, getDefaultBackgroundColor());
        this.backgroundColorDisabled = obtainStyledAttributes.getColor(R$styleable.ChipWrapper_backgroundColorDisabled, getDefaultBackgroundColor());
        this.backgroundColorSelected = obtainStyledAttributes.getColor(R$styleable.ChipWrapper_backgroundColorSelected, getDefaultBackgroundColor());
        int color = obtainStyledAttributes.getColor(R$styleable.ChipWrapper_chipBorderColor, getDefaultBackgroundColor());
        this.chipBorderColor = color;
        setCurrentBorderColor(Integer.valueOf(color));
        this.chipBorderColorActive = obtainStyledAttributes.getColor(R$styleable.ChipWrapper_chipBorderColorActive, getDefaultBackgroundColor());
        this.chipBorderColorSelected = obtainStyledAttributes.getColor(R$styleable.ChipWrapper_chipBorderColorSelected, getDefaultBackgroundColor());
        setBorderWidth(1);
        obtainStyledAttributes.recycle();
    }
}
