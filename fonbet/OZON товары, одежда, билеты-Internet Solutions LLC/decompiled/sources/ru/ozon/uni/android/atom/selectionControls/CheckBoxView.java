package ru.ozon.uni.android.atom.selectionControls;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import Sw.a;
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
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0082\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010!J1\u0010%\u001a\u00020\u000f2 \u0010$\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000fH\u0002¢\u0006\u0004\b/\u0010*J\u000f\u00100\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u0010*R*\u00103\u001a\u0002012\u0006\u00102\u001a\u0002018\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R0\u0010=\u001a\u00020<2\u0006\u00102\u001a\u00020<8@@@X\u0080\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bC\u0010*\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR0\u0010\u000e\u001a\u00020#2\u0006\u00102\u001a\u00020#8F@BX\u0086\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010D\u0012\u0004\bH\u0010*\u001a\u0004\bE\u0010F\"\u0004\bG\u0010(R0\u0010I\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00168V@RX\u0096\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bM\u0010*\u001a\u0004\bI\u0010K\"\u0004\bL\u0010.R0\u0010$\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010NR\u001d\u0010T\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010W\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010SR\u001d\u0010Z\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Q\u001a\u0004\bY\u0010SR\u001d\u0010]\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010SR\u001d\u0010`\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010Q\u001a\u0004\b_\u0010SR\u001d\u0010c\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010Q\u001a\u0004\bb\u0010SR\u001d\u0010h\u001a\u0004\u0018\u00010d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010Q\u001a\u0004\bf\u0010gR\u001d\u0010k\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010Q\u001a\u0004\bj\u0010SR\u001d\u0010n\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010Q\u001a\u0004\bm\u0010SR\u001d\u0010q\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010Q\u001a\u0004\bp\u0010SR\u001d\u0010t\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010Q\u001a\u0004\bs\u0010SR\u001d\u0010w\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010Q\u001a\u0004\bv\u0010SR\u001d\u0010z\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010Q\u001a\u0004\by\u0010SR\u001d\u0010}\u001a\u0004\u0018\u00010d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010Q\u001a\u0004\b|\u0010gR\u0016\u0010\u0081\u0001\u001a\u00020~8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0083\u0001"}, d2 = {"Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "Landroid/widget/CompoundButton;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/os/Parcelable;", "state", "", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lkotlin/Function3;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "changeStateListener", "setOnStateChangeListener", "(Lfd/n;)V", "setCheckboxState", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)V", "setCheckboxError", "()V", "clearCheckboxError", "shouldChangeFromIndeterminate", "initListener", "(Z)V", "increaseTouchArea", "refreshState", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "Landroid/graphics/Rect;", "touchArea", "Landroid/graphics/Rect;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "definedSize", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "getDefinedSize$uni_release", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "setDefinedSize$uni_release", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;)V", "getDefinedSize$uni_release$annotations", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "getState", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "setState", "getState$annotations", "isError", "Z", "()Z", "setError", "isError$annotations", "Lfd/n;", "Landroidx/vectordrawable/graphics/drawable/c;", "transitionUncheckedToChecked600$delegate", "LSc/j;", "getTransitionUncheckedToChecked600", "()Landroidx/vectordrawable/graphics/drawable/c;", "transitionUncheckedToChecked600", "transitionCheckedToUnchecked600$delegate", "getTransitionCheckedToUnchecked600", "transitionCheckedToUnchecked600", "transitionUncheckedToIndeterminate600$delegate", "getTransitionUncheckedToIndeterminate600", "transitionUncheckedToIndeterminate600", "transitionIndeterminateToUnchecked600$delegate", "getTransitionIndeterminateToUnchecked600", "transitionIndeterminateToUnchecked600", "transitionCheckedToIndeterminate600$delegate", "getTransitionCheckedToIndeterminate600", "transitionCheckedToIndeterminate600", "transitionIndeterminateToChecked600$delegate", "getTransitionIndeterminateToChecked600", "transitionIndeterminateToChecked600", "Landroid/graphics/drawable/Drawable;", "buttonDrawable600$delegate", "getButtonDrawable600", "()Landroid/graphics/drawable/Drawable;", "buttonDrawable600", "transitionUncheckedToChecked500$delegate", "getTransitionUncheckedToChecked500", "transitionUncheckedToChecked500", "transitionCheckedToUnchecked500$delegate", "getTransitionCheckedToUnchecked500", "transitionCheckedToUnchecked500", "transitionUncheckedToIndeterminate500$delegate", "getTransitionUncheckedToIndeterminate500", "transitionUncheckedToIndeterminate500", "transitionIndeterminateToUnchecked500$delegate", "getTransitionIndeterminateToUnchecked500", "transitionIndeterminateToUnchecked500", "transitionCheckedToIndeterminate500$delegate", "getTransitionCheckedToIndeterminate500", "transitionCheckedToIndeterminate500", "transitionIndeterminateToChecked500$delegate", "getTransitionIndeterminateToChecked500", "transitionIndeterminateToChecked500", "buttonDrawable500$delegate", "getButtonDrawable500", "buttonDrawable500", "Landroid/util/SizeF;", "getSize", "()Landroid/util/SizeF;", "size", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckBoxView extends CompoundButton implements AtomView, AtomLocatableView {

    @NotNull
    private static final int[] CHECKED;

    @NotNull
    private static final int[] ERROR_STATE_SET_CHECKED;

    @NotNull
    private static final int[] ERROR_STATE_SET_INDETERMINATE;

    @NotNull
    private static final int[] ERROR_STATE_SET_UNCHECKED;
    private static final int EXTRA_DRAWABLE_STATE_SPACE;

    @NotNull
    private static final int[] INDETERMINATE;

    @NotNull
    private static final int[] UNCHECKED;

    /* renamed from: buttonDrawable500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonDrawable500;

    /* renamed from: buttonDrawable600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonDrawable600;
    private InterfaceC6511n<? super CheckBoxView, ? super CheckBoxDTO.CheckboxStatus, ? super Boolean, Unit> changeStateListener;

    @NotNull
    private CheckBoxDTO.CheckBoxSize definedSize;
    private boolean isError;

    @NotNull
    private String locatorTag;

    @NotNull
    private CheckBoxDTO.CheckboxStatus state;

    @NotNull
    private Rect touchArea;

    /* renamed from: transitionCheckedToIndeterminate500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionCheckedToIndeterminate500;

    /* renamed from: transitionCheckedToIndeterminate600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionCheckedToIndeterminate600;

    /* renamed from: transitionCheckedToUnchecked500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionCheckedToUnchecked500;

    /* renamed from: transitionCheckedToUnchecked600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionCheckedToUnchecked600;

    /* renamed from: transitionIndeterminateToChecked500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionIndeterminateToChecked500;

    /* renamed from: transitionIndeterminateToChecked600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionIndeterminateToChecked600;

    /* renamed from: transitionIndeterminateToUnchecked500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionIndeterminateToUnchecked500;

    /* renamed from: transitionIndeterminateToUnchecked600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionIndeterminateToUnchecked600;

    /* renamed from: transitionUncheckedToChecked500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionUncheckedToChecked500;

    /* renamed from: transitionUncheckedToChecked600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionUncheckedToChecked600;

    /* renamed from: transitionUncheckedToIndeterminate500$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionUncheckedToIndeterminate500;

    /* renamed from: transitionUncheckedToIndeterminate600$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j transitionUncheckedToIndeterminate600;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static boolean isAnimationsEnabled = true;
    private static final int SIZE_500_HIT_RECT_INC = UiExtKt.toPx(10);
    private static final int SIZE_600_HIT_RECT_INC = UiExtKt.toPx(6);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/android/atom/selectionControls/CheckBoxView$Companion;", "", "<init>", "()V", "isAnimationsEnabled", "", "()Z", "setAnimationsEnabled", "(Z)V", "CHECKBOX_LOCATOR_TAG", "", "SIZE_500", "", "SIZE_600", "TOUCH_AREA", "SIZE_500_HIT_RECT_INC", "SIZE_600_HIT_RECT_INC", "UNCHECKED", "", "INDETERMINATE", "CHECKED", "ERROR_STATE_SET_CHECKED", "ERROR_STATE_SET_INDETERMINATE", "ERROR_STATE_SET_UNCHECKED", "EXTRA_DRAWABLE_STATE_SPACE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isAnimationsEnabled() {
            return CheckBoxView.isAnimationsEnabled;
        }

        public final void setAnimationsEnabled(boolean z11) {
            CheckBoxView.isAnimationsEnabled = z11;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CheckBoxDTO.CheckBoxSize.values().length];
            try {
                iArr[CheckBoxDTO.CheckBoxSize.SIZE_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckBoxDTO.CheckBoxSize.SIZE_600.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CheckBoxDTO.CheckboxStatus.values().length];
            try {
                iArr2[CheckBoxDTO.CheckboxStatus.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CheckBoxDTO.CheckboxStatus.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CheckBoxDTO.CheckboxStatus.INDETERMINATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        int i11 = R$attr.state_unchecked;
        UNCHECKED = new int[]{i11};
        int i12 = R$attr.state_indeterminate;
        INDETERMINATE = new int[]{i12};
        int i13 = R$attr.state_checked;
        int[] iArr = {i13};
        CHECKED = iArr;
        int i14 = R$attr.state_error;
        int[] iArr2 = {i14, R.attr.state_enabled, i13};
        ERROR_STATE_SET_CHECKED = iArr2;
        ERROR_STATE_SET_INDETERMINATE = new int[]{i14, R.attr.state_enabled, i12};
        ERROR_STATE_SET_UNCHECKED = new int[]{i14, R.attr.state_enabled, i11};
        EXTRA_DRAWABLE_STATE_SPACE = iArr2.length + iArr.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckBoxView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
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
    public final c getTransitionCheckedToIndeterminate500() {
        return (c) this.transitionCheckedToIndeterminate500.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionCheckedToIndeterminate600() {
        return (c) this.transitionCheckedToIndeterminate600.getValue();
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
    public final c getTransitionIndeterminateToChecked500() {
        return (c) this.transitionIndeterminateToChecked500.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionIndeterminateToChecked600() {
        return (c) this.transitionIndeterminateToChecked600.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionIndeterminateToUnchecked500() {
        return (c) this.transitionIndeterminateToUnchecked500.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionIndeterminateToUnchecked600() {
        return (c) this.transitionIndeterminateToUnchecked600.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionUncheckedToChecked500() {
        return (c) this.transitionUncheckedToChecked500.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionUncheckedToChecked600() {
        return (c) this.transitionUncheckedToChecked600.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionUncheckedToIndeterminate500() {
        return (c) this.transitionUncheckedToIndeterminate500.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getTransitionUncheckedToIndeterminate600() {
        return (c) this.transitionUncheckedToIndeterminate600.getValue();
    }

    private final void increaseTouchArea() {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.post(new a(1, this, view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void increaseTouchArea$lambda$1$lambda$0(CheckBoxView checkBoxView, View view) {
        checkBoxView.getHitRect(checkBoxView.touchArea);
        int i11 = WhenMappings.$EnumSwitchMapping$0[checkBoxView.getDefinedSize$uni_release().ordinal()];
        if (i11 == 1) {
            Rect rect = checkBoxView.touchArea;
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
            Rect rect2 = checkBoxView.touchArea;
            int i14 = rect2.top;
            int i15 = SIZE_600_HIT_RECT_INC;
            rect2.top = i14 - i15;
            rect2.bottom += i15;
            rect2.left -= i15;
            rect2.right += i15;
        }
        view.setTouchDelegate(new TouchDelegate(checkBoxView.touchArea, checkBoxView));
    }

    public static /* synthetic */ void initListener$default(CheckBoxView checkBoxView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        checkBoxView.initListener(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(CheckBoxView checkBoxView, boolean z11, CompoundButton compoundButton, boolean z12) {
        CheckBoxDTO.CheckboxStatus checkboxStatus;
        checkBoxView.clearCheckboxError();
        int i11 = WhenMappings.$EnumSwitchMapping$1[checkBoxView.getState().ordinal()];
        if (i11 == 1) {
            checkboxStatus = CheckBoxDTO.CheckboxStatus.SELECTED;
        } else if (i11 == 2) {
            checkboxStatus = CheckBoxDTO.CheckboxStatus.EMPTY;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            checkboxStatus = z11 ? CheckBoxDTO.CheckboxStatus.EMPTY : CheckBoxDTO.CheckboxStatus.INDETERMINATE;
        }
        checkBoxView.setState(checkboxStatus);
        InterfaceC6511n<? super CheckBoxView, ? super CheckBoxDTO.CheckboxStatus, ? super Boolean, Unit> interfaceC6511n = checkBoxView.changeStateListener;
        if (interfaceC6511n != null) {
            interfaceC6511n.invoke(checkBoxView, checkBoxView.getState(), Boolean.TRUE);
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

    private final void setState(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        if (this.state == checkboxStatus) {
            return;
        }
        this.state = checkboxStatus;
        int i11 = WhenMappings.$EnumSwitchMapping$1[checkboxStatus.ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            z11 = false;
        } else if (i11 != 2 && i11 != 3) {
            throw new o();
        }
        setChecked(z11);
        refreshDrawableState();
    }

    public void clearCheckboxError() {
        setError(false);
    }

    @NotNull
    public final CheckBoxDTO.CheckBoxSize getDefinedSize$uni_release() {
        CheckBoxDTO.CheckBoxSize checkBoxSize = this.definedSize;
        return checkBoxSize == null ? CheckBoxDTO.CheckBoxSize.SIZE_600 : checkBoxSize;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @NotNull
    public final CheckBoxDTO.CheckboxStatus getState() {
        CheckBoxDTO.CheckboxStatus checkboxStatus = this.state;
        return checkboxStatus == null ? CheckBoxDTO.CheckboxStatus.EMPTY : checkboxStatus;
    }

    public final void initListener(final boolean shouldChangeFromIndeterminate) {
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ok0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                CheckBoxView.initListener$lambda$2(CheckBoxView.this, shouldChangeFromIndeterminate, compoundButton, z11);
            }
        });
    }

    /* renamed from: isError, reason: from getter */
    public boolean getIsError() {
        return this.isError;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @NotNull
    protected int[] onCreateDrawableState(int extraSpace) {
        int[] iArr;
        int[] iArr2;
        int[] onCreateDrawableState = super.onCreateDrawableState(extraSpace + EXTRA_DRAWABLE_STATE_SPACE);
        CheckBoxDTO.CheckboxStatus state = getState();
        int[] iArr3 = WhenMappings.$EnumSwitchMapping$1;
        int i11 = iArr3[state.ordinal()];
        if (i11 == 1) {
            iArr = UNCHECKED;
        } else if (i11 == 2) {
            iArr = CHECKED;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            iArr = INDETERMINATE;
        }
        View.mergeDrawableStates(onCreateDrawableState, iArr);
        if (getIsError() && isEnabled()) {
            int i12 = iArr3[getState().ordinal()];
            if (i12 == 1) {
                iArr2 = ERROR_STATE_SET_UNCHECKED;
            } else if (i12 == 2) {
                iArr2 = ERROR_STATE_SET_CHECKED;
            } else {
                if (i12 != 3) {
                    throw new o();
                }
                iArr2 = ERROR_STATE_SET_INDETERMINATE;
            }
            View.mergeDrawableStates(onCreateDrawableState, iArr2);
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
        CompoundButtonUtilsKt.safeOnRestoreInstanceState(this, new CheckBoxView$onRestoreInstanceState$1(this, state));
    }

    public void setCheckboxError() {
        setError(true);
    }

    public void setCheckboxState(@NotNull CheckBoxDTO.CheckboxStatus state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setOnCheckedChangeListener(null);
        setState(state);
        initListener$default(this, false, 1, null);
        InterfaceC6511n<? super CheckBoxView, ? super CheckBoxDTO.CheckboxStatus, ? super Boolean, Unit> interfaceC6511n = this.changeStateListener;
        if (interfaceC6511n != null) {
            interfaceC6511n.invoke(this, state, Boolean.FALSE);
        }
    }

    public final void setDefinedSize$uni_release(@NotNull CheckBoxDTO.CheckBoxSize value) {
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

    public void setOnStateChangeListener(InterfaceC6511n<? super CheckBoxView, ? super CheckBoxDTO.CheckboxStatus, ? super Boolean, Unit> changeStateListener) {
        this.changeStateListener = changeStateListener;
    }

    public /* synthetic */ CheckBoxView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckBoxView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "checkbox";
        this.touchArea = new Rect();
        CheckBoxDTO.CheckBoxSize checkBoxSize = CheckBoxDTO.CheckBoxSize.SIZE_500;
        this.definedSize = checkBoxSize;
        CheckBoxDTO.CheckboxStatus checkboxStatus = CheckBoxDTO.CheckboxStatus.EMPTY;
        this.state = checkboxStatus;
        n nVar = n.SYNCHRONIZED;
        this.transitionUncheckedToChecked600 = k.a(nVar, new CheckBoxView$transitionUncheckedToChecked600$2(this));
        this.transitionCheckedToUnchecked600 = k.a(nVar, new CheckBoxView$transitionCheckedToUnchecked600$2(this));
        this.transitionUncheckedToIndeterminate600 = k.a(nVar, new CheckBoxView$transitionUncheckedToIndeterminate600$2(this));
        this.transitionIndeterminateToUnchecked600 = k.a(nVar, new CheckBoxView$transitionIndeterminateToUnchecked600$2(this));
        this.transitionCheckedToIndeterminate600 = k.a(nVar, new CheckBoxView$transitionCheckedToIndeterminate600$2(this));
        this.transitionIndeterminateToChecked600 = k.a(nVar, new CheckBoxView$transitionIndeterminateToChecked600$2(this));
        this.buttonDrawable600 = k.a(nVar, new CheckBoxView$buttonDrawable600$2(context, this));
        this.transitionUncheckedToChecked500 = k.a(nVar, new CheckBoxView$transitionUncheckedToChecked500$2(this));
        this.transitionCheckedToUnchecked500 = k.a(nVar, new CheckBoxView$transitionCheckedToUnchecked500$2(this));
        this.transitionUncheckedToIndeterminate500 = k.a(nVar, new CheckBoxView$transitionUncheckedToIndeterminate500$2(this));
        this.transitionIndeterminateToUnchecked500 = k.a(nVar, new CheckBoxView$transitionIndeterminateToUnchecked500$2(this));
        this.transitionCheckedToIndeterminate500 = k.a(nVar, new CheckBoxView$transitionCheckedToIndeterminate500$2(this));
        this.transitionIndeterminateToChecked500 = k.a(nVar, new CheckBoxView$transitionIndeterminateToChecked500$2(this));
        this.buttonDrawable500 = k.a(nVar, new CheckBoxView$buttonDrawable500$2(context, this));
        setClickable(true);
        setFocusable(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CheckBoxView, i11, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setDefinedSize$uni_release(((CheckBoxDTO.CheckBoxSize[]) CheckBoxDTO.CheckBoxSize.getEntries().toArray(new CheckBoxDTO.CheckBoxSize[0]))[obtainStyledAttributes.getInt(R$styleable.CheckBoxView_checkboxSize, checkBoxSize.ordinal())]);
        setState(((CheckBoxDTO.CheckboxStatus[]) CheckBoxDTO.CheckboxStatus.getEntries().toArray(new CheckBoxDTO.CheckboxStatus[0]))[obtainStyledAttributes.getInt(R$styleable.CheckBoxView_state, checkboxStatus.ordinal())]);
        setError(obtainStyledAttributes.getBoolean(R$styleable.CheckBoxView_state_error, false));
        obtainStyledAttributes.recycle();
        setContentDescription(getLocatorTag());
        initListener$default(this, false, 1, null);
        refreshState();
    }
}
