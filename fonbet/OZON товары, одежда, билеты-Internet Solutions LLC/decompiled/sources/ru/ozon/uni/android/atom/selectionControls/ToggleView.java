package ru.ozon.uni.android.atom.selectionControls;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.selectionControls.ToggleSize;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001:B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001f\u001a\u00020\r2\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010)\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R*\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00103\u001a\u0002022\u0006\u0010+\u001a\u0002028\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00109¨\u0006;"}, d2 = {"Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "Landroid/widget/CompoundButton;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initListener", "()V", "Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lkotlin/Function2;", "", "changeStateListener", "setOnStateChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/graphics/drawable/Drawable;", "toggleDrawable500$delegate", "LSc/j;", "getToggleDrawable500", "()Landroid/graphics/drawable/Drawable;", "toggleDrawable500", "toggleDrawable600$delegate", "getToggleDrawable600", "toggleDrawable600", "Lru/ozon/uni/android/atom/selectionControls/ToggleSize;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "size", "Lru/ozon/uni/android/atom/selectionControls/ToggleSize;", "getSize", "()Lru/ozon/uni/android/atom/selectionControls/ToggleSize;", "setSize", "(Lru/ozon/uni/android/atom/selectionControls/ToggleSize;)V", "", "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "Lkotlin/jvm/functions/Function2;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToggleView extends CompoundButton implements AtomView, AtomLocatableView {
    private Function2<? super ToggleView, ? super Boolean, Unit> changeStateListener;

    @NotNull
    private String locatorTag;

    @NotNull
    private ToggleSize size;

    /* renamed from: toggleDrawable500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j toggleDrawable500;

    /* renamed from: toggleDrawable600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j toggleDrawable600;
    public static final int $stable = 8;

    @NotNull
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    @NotNull
    private static final int[] ENABLED_STATE_SET = {R.attr.state_enabled};

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToggleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Drawable getToggleDrawable500() {
        return (Drawable) this.toggleDrawable500.getValue();
    }

    private final Drawable getToggleDrawable600() {
        return (Drawable) this.toggleDrawable600.getValue();
    }

    private final void initListener() {
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ok0.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                ToggleView.initListener$lambda$0(ToggleView.this, compoundButton, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$0(ToggleView toggleView, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        Function2<? super ToggleView, ? super Boolean, Unit> function2 = toggleView.changeStateListener;
        if (function2 != null) {
            function2.invoke(toggleView, Boolean.valueOf(z11));
        }
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @NotNull
    protected int[] onCreateDrawableState(int extraSpace) {
        int[] onCreateDrawableState = super.onCreateDrawableState(extraSpace + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        if (isEnabled()) {
            View.mergeDrawableStates(onCreateDrawableState, ENABLED_STATE_SET);
        }
        Intrinsics.f(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(UiExtKt.toPx(this.size.getWidth()), UiExtKt.toPx(this.size.getHeight()));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        CompoundButtonUtilsKt.safeOnRestoreInstanceState(this, new ToggleView$onRestoreInstanceState$1(this, state));
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public void setOnStateChangeListener(Function2<? super ToggleView, ? super Boolean, Unit> changeStateListener) {
        this.changeStateListener = changeStateListener;
    }

    public final void setSize(@NotNull ToggleSize value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.size = value;
        setButtonDrawable(Intrinsics.d(value, ToggleSize.Toggle600.INSTANCE) ? getToggleDrawable600() : getToggleDrawable500());
    }

    public /* synthetic */ ToggleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = n.SYNCHRONIZED;
        this.toggleDrawable500 = k.a(nVar, new ToggleView$toggleDrawable500$2(context));
        this.toggleDrawable600 = k.a(nVar, new ToggleView$toggleDrawable600$2(context));
        this.size = ToggleSize.Toggle600.INSTANCE;
        this.locatorTag = "toggle";
        setButtonDrawable(getToggleDrawable600());
        setClickable(true);
        setFocusable(true);
        setContentDescription(getLocatorTag());
        initListener();
    }
}
