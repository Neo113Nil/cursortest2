package ru.ozon.app.android.storefront.core.atoms.views;

import B90.A;
import B90.B;
import N3.C3660k;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.R$layout;
import ru.ozon.app.android.storefront.core.atoms.databinding.ViewAtomFilterRangeBinding;
import ru.ozon.app.android.storefront.core.atoms.views.RangeEditTextFormatter;
import ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0003IJKB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001a\u001a\u00020\r*\u00020\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\"*\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\u000fJ\u0011\u0010)\u001a\u00020(*\u00020'¢\u0006\u0004\b)\u0010*R<\u0010,\u001a\u001c\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00106\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data;", "data", "", "initFormatter", "(Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data;)V", "Landroid/widget/EditText;", "", "newValue", "setTextWithCursor", "(Landroid/widget/EditText;Ljava/lang/String;)V", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "update", "setOnDoneClickListener", "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$InputKind;", "inputKind", "updateData", "(Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$InputKind;)Z", "correctValuesIfNeeded", "()V", "", "defaultValue", "getValue", "(Landroid/widget/EditText;F)F", "bind", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "Lkotlin/Function3;", "valuesChangeListener", "Lfd/n;", "getValuesChangeListener", "()Lfd/n;", "setValuesChangeListener", "(Lfd/n;)V", "dp8", "I", "dp12", "dp16", "dp20", "Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data;", "onDoneListener", "Lkotlin/jvm/functions/Function1;", "themedThumbBitmap", "Landroid/graphics/Bitmap;", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewAtomFilterRangeBinding;", "binding", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewAtomFilterRangeBinding;", "Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter;", "editTextFormatter", "Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter;", "Lru/ozon/app/android/storefront/core/atoms/views/NumberSeparatorTextWatcher;", "fromEtWatcher", "Lru/ozon/app/android/storefront/core/atoms/views/NumberSeparatorTextWatcher;", "toEtWatcher", "Landroid/text/method/DigitsKeyListener;", "decimalKeyListener", "Landroid/text/method/DigitsKeyListener;", "Companion", "Data", "InputKind", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RangeFilterView extends ConstraintLayout implements AtomView {

    @NotNull
    private final ViewAtomFilterRangeBinding binding;
    private Data data;

    @NotNull
    private final DigitsKeyListener decimalKeyListener;
    private final int dp12;
    private final int dp16;
    private final int dp20;
    private final int dp8;

    @NotNull
    private RangeEditTextFormatter editTextFormatter;

    @NotNull
    private NumberSeparatorTextWatcher fromEtWatcher;

    @NotNull
    private final Function1<Boolean, Unit> onDoneListener;

    @NotNull
    private final Bitmap themedThumbBitmap;

    @NotNull
    private NumberSeparatorTextWatcher toEtWatcher;
    private InterfaceC6511n<? super Float, ? super Float, ? super Boolean, Unit> valuesChangeListener;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<Boolean> {
        AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(RangeFilterView.this.updateData(InputKind.FROM));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function0<Boolean> {
        AnonymousClass4() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(RangeFilterView.this.updateData(InputKind.f93506TO));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001:\u0001+BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jn\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b#\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b'\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "units", "", "min", "max", "from", "to", "Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;", "rangeType", "step", "", "hideSlider", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFFFLru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;FZ)V", "copy", "(Ljava/lang/String;Ljava/lang/String;FFFFLru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;FZ)Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getUnits", "F", "getMin", "()F", "getMax", "getFrom", "getTo", "Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;", "getRangeType", "()Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;", "getStep", "Z", "getHideSlider", "()Z", "RangeType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {
        private final float from;
        private final boolean hideSlider;
        private final float max;
        private final float min;

        @NotNull
        private final RangeType rangeType;
        private final float step;
        private final String title;
        private final float to;
        private final String units;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;", "", "<init>", "(Ljava/lang/String;I)V", "INTEGER", "DECIMAL", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RangeType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ RangeType[] $VALUES;
            public static final RangeType INTEGER = new RangeType("INTEGER", 0);
            public static final RangeType DECIMAL = new RangeType("DECIMAL", 1);

            private static final /* synthetic */ RangeType[] $values() {
                return new RangeType[]{INTEGER, DECIMAL};
            }

            static {
                RangeType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private RangeType(String str, int i11) {
            }

            public static RangeType valueOf(String str) {
                return (RangeType) Enum.valueOf(RangeType.class, str);
            }

            public static RangeType[] values() {
                return (RangeType[]) $VALUES.clone();
            }
        }

        public Data(String str, String str2, float f7, float f11, float f12, float f13, @NotNull RangeType rangeType, float f14, boolean z11) {
            Intrinsics.checkNotNullParameter(rangeType, "rangeType");
            this.title = str;
            this.units = str2;
            this.min = f7;
            this.max = f11;
            this.from = f12;
            this.to = f13;
            this.rangeType = rangeType;
            this.step = f14;
            this.hideSlider = z11;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, float f7, float f11, float f12, float f13, RangeType rangeType, float f14, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.title;
            }
            if ((i11 & 2) != 0) {
                str2 = data.units;
            }
            if ((i11 & 4) != 0) {
                f7 = data.min;
            }
            if ((i11 & 8) != 0) {
                f11 = data.max;
            }
            if ((i11 & 16) != 0) {
                f12 = data.from;
            }
            if ((i11 & 32) != 0) {
                f13 = data.to;
            }
            if ((i11 & 64) != 0) {
                rangeType = data.rangeType;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                f14 = data.step;
            }
            if ((i11 & 256) != 0) {
                z11 = data.hideSlider;
            }
            float f15 = f14;
            boolean z12 = z11;
            float f16 = f13;
            RangeType rangeType2 = rangeType;
            float f17 = f12;
            float f18 = f7;
            return data.copy(str, str2, f18, f11, f17, f16, rangeType2, f15, z12);
        }

        @NotNull
        public final Data copy(String title, String units, float min, float max, float from, float to, @NotNull RangeType rangeType, float step, boolean hideSlider) {
            Intrinsics.checkNotNullParameter(rangeType, "rangeType");
            return new Data(title, units, min, max, from, to, rangeType, step, hideSlider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.title, data.title) && Intrinsics.d(this.units, data.units) && Float.compare(this.min, data.min) == 0 && Float.compare(this.max, data.max) == 0 && Float.compare(this.from, data.from) == 0 && Float.compare(this.to, data.to) == 0 && this.rangeType == data.rangeType && Float.compare(this.step, data.step) == 0 && this.hideSlider == data.hideSlider;
        }

        public final float getFrom() {
            return this.from;
        }

        public final boolean getHideSlider() {
            return this.hideSlider;
        }

        public final float getMax() {
            return this.max;
        }

        public final float getMin() {
            return this.min;
        }

        @NotNull
        public final RangeType getRangeType() {
            return this.rangeType;
        }

        public final float getStep() {
            return this.step;
        }

        public final String getTitle() {
            return this.title;
        }

        public final float getTo() {
            return this.to;
        }

        public final String getUnits() {
            return this.units;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.units;
            return Boolean.hashCode(this.hideSlider) + Pk0.b.a(this.step, (this.rangeType.hashCode() + Pk0.b.a(this.to, Pk0.b.a(this.from, Pk0.b.a(this.max, Pk0.b.a(this.min, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.units;
            float f7 = this.min;
            float f11 = this.max;
            float f12 = this.from;
            float f13 = this.to;
            RangeType rangeType = this.rangeType;
            float f14 = this.step;
            boolean z11 = this.hideSlider;
            StringBuilder d11 = C3660k.d("Data(title=", str, ", units=", str2, ", min=");
            d11.append(f7);
            d11.append(", max=");
            d11.append(f11);
            d11.append(", from=");
            d11.append(f12);
            d11.append(", to=");
            d11.append(f13);
            d11.append(", rangeType=");
            d11.append(rangeType);
            d11.append(", step=");
            d11.append(f14);
            d11.append(", hideSlider=");
            return Pk0.a.a(")", d11, z11);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$InputKind;", "", "<init>", "(Ljava/lang/String;I)V", "FROM", "TO", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputKind {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InputKind[] $VALUES;
        public static final InputKind FROM = new InputKind("FROM", 0);

        /* renamed from: TO, reason: collision with root package name */
        public static final InputKind f93506TO = new InputKind("TO", 1);

        private static final /* synthetic */ InputKind[] $values() {
            return new InputKind[]{FROM, f93506TO};
        }

        static {
            InputKind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private InputKind(String str, int i11) {
        }

        public static InputKind valueOf(String str) {
            return (InputKind) Enum.valueOf(InputKind.class, str);
        }

        public static InputKind[] values() {
            return (InputKind[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Data.RangeType.values().length];
            try {
                iArr[Data.RangeType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Data.RangeType.DECIMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeFilterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RangeFilterView rangeFilterView, Number number, Number number2) {
        if (rangeFilterView.binding.rangeSeekbar.isPressed()) {
            RangeEditTextFormatter rangeEditTextFormatter = rangeFilterView.editTextFormatter;
            Intrinsics.f(number);
            String numberAsFormattedString = rangeEditTextFormatter.numberAsFormattedString(number, true);
            EditText rangeFromEt = rangeFilterView.binding.rangeFromEt;
            Intrinsics.checkNotNullExpressionValue(rangeFromEt, "rangeFromEt");
            rangeFilterView.setTextWithCursor(rangeFromEt, numberAsFormattedString);
            RangeEditTextFormatter rangeEditTextFormatter2 = rangeFilterView.editTextFormatter;
            Intrinsics.f(number2);
            String numberAsFormattedString2 = rangeEditTextFormatter2.numberAsFormattedString(number2, true);
            EditText rangeToEt = rangeFilterView.binding.rangeToEt;
            Intrinsics.checkNotNullExpressionValue(rangeToEt, "rangeToEt");
            rangeFilterView.setTextWithCursor(rangeToEt, numberAsFormattedString2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(RangeFilterView rangeFilterView, Number number, Number number2) {
        float floatValue = number.floatValue();
        Data data = rangeFilterView.data;
        float max = Math.max(floatValue, data != null ? data.getMin() : 0.0f);
        float floatValue2 = number2.floatValue();
        Data data2 = rangeFilterView.data;
        float max2 = Math.max(floatValue2, data2 != null ? data2.getMin() : 0.0f);
        Data data3 = rangeFilterView.data;
        rangeFilterView.data = data3 != null ? Data.copy$default(data3, null, null, 0.0f, 0.0f, max, max2, null, 0.0f, false, 463, null) : null;
        InterfaceC6511n<? super Float, ? super Float, ? super Boolean, Unit> interfaceC6511n = rangeFilterView.valuesChangeListener;
        if (interfaceC6511n != null) {
            interfaceC6511n.invoke(Float.valueOf(max), Float.valueOf(max2), Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void correctValuesIfNeeded() {
        Data data = this.data;
        if (data == null) {
            return;
        }
        ViewAtomFilterRangeBinding viewAtomFilterRangeBinding = this.binding;
        viewAtomFilterRangeBinding.rangeFromEt.removeTextChangedListener(this.fromEtWatcher);
        viewAtomFilterRangeBinding.rangeToEt.removeTextChangedListener(this.toEtWatcher);
        EditText rangeFromEt = viewAtomFilterRangeBinding.rangeFromEt;
        Intrinsics.checkNotNullExpressionValue(rangeFromEt, "rangeFromEt");
        float value = getValue(rangeFromEt, data.getMin());
        EditText rangeToEt = viewAtomFilterRangeBinding.rangeToEt;
        Intrinsics.checkNotNullExpressionValue(rangeToEt, "rangeToEt");
        if (value > getValue(rangeToEt, data.getMax())) {
            EditText rangeFromEt2 = viewAtomFilterRangeBinding.rangeFromEt;
            Intrinsics.checkNotNullExpressionValue(rangeFromEt2, "rangeFromEt");
            if (getValue(rangeFromEt2, data.getMin()) >= data.getMin()) {
                viewAtomFilterRangeBinding.rangeToEt.setText(this.editTextFormatter.numberAsFormattedString(Float.valueOf(data.getMax()), true));
            } else {
                EditText rangeToEt2 = viewAtomFilterRangeBinding.rangeToEt;
                Intrinsics.checkNotNullExpressionValue(rangeToEt2, "rangeToEt");
                if (getValue(rangeToEt2, data.getMax()) <= data.getMax()) {
                    viewAtomFilterRangeBinding.rangeFromEt.setText(this.editTextFormatter.numberAsFormattedString(Float.valueOf(data.getMin()), true));
                }
            }
        }
        RangeEditTextFormatter rangeEditTextFormatter = this.editTextFormatter;
        EditText rangeFromEt3 = viewAtomFilterRangeBinding.rangeFromEt;
        Intrinsics.checkNotNullExpressionValue(rangeFromEt3, "rangeFromEt");
        RangeEditTextFormatter.formatEditTextString$default(rangeEditTextFormatter, rangeFromEt3, true, RangeEditTextFormatter.RangePartType.FROM, null, 8, null);
        RangeEditTextFormatter rangeEditTextFormatter2 = this.editTextFormatter;
        EditText rangeToEt3 = viewAtomFilterRangeBinding.rangeToEt;
        Intrinsics.checkNotNullExpressionValue(rangeToEt3, "rangeToEt");
        RangeEditTextFormatter.formatEditTextString$default(rangeEditTextFormatter2, rangeToEt3, true, RangeEditTextFormatter.RangePartType.f93505TO, null, 8, null);
        viewAtomFilterRangeBinding.rangeFromEt.addTextChangedListener(this.fromEtWatcher);
        viewAtomFilterRangeBinding.rangeToEt.addTextChangedListener(this.toEtWatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getValue(EditText editText, float f7) {
        Float v02 = h.v0(h.Y(new Regex("\\s").replace(editText.getText().toString(), ""), ',', '.'));
        return v02 != null ? v02.floatValue() : f7;
    }

    private final void initFormatter(Data data) {
        RangeEditTextFormatter.initWith$default(this.editTextFormatter, null, data != null ? data.getRangeType() : null, data != null ? Float.valueOf(data.getMin()) : null, data != null ? Float.valueOf(data.getMax()) : null, 1, null);
        this.binding.rangeFromEt.removeTextChangedListener(this.fromEtWatcher);
        this.binding.rangeToEt.removeTextChangedListener(this.toEtWatcher);
        this.binding.rangeFromEt.addTextChangedListener(this.fromEtWatcher);
        this.binding.rangeToEt.addTextChangedListener(this.toEtWatcher);
    }

    private final void setOnDoneClickListener(final EditText editText, final Function1<? super Boolean, Unit> function1, final Function0<Boolean> function0) {
        final RangeFilterView$setOnDoneClickListener$focusChangeListener$1 rangeFilterView$setOnDoneClickListener$focusChangeListener$1 = new RangeFilterView$setOnDoneClickListener$focusChangeListener$1(function0, this);
        editText.setOnFocusChangeListener(rangeFilterView$setOnDoneClickListener$focusChangeListener$1);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: PJ.d
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean onDoneClickListener$lambda$3;
                onDoneClickListener$lambda$3 = RangeFilterView.setOnDoneClickListener$lambda$3(Function0.this, function1, editText, rangeFilterView$setOnDoneClickListener$focusChangeListener$1, textView, i11, keyEvent);
                return onDoneClickListener$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnDoneClickListener$lambda$3(Function0 function0, Function1 function1, EditText editText, RangeFilterView$setOnDoneClickListener$focusChangeListener$1 rangeFilterView$setOnDoneClickListener$focusChangeListener$1, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        function0.invoke();
        function1.invoke(Boolean.FALSE);
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive(editText)) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        rangeFilterView$setOnDoneClickListener$focusChangeListener$1.setPrevFocusFlag(false);
        editText.clearFocus();
        return true;
    }

    private final void setTextWithCursor(EditText editText, String str) {
        editText.setText(str);
        if (editText.hasFocus()) {
            editText.setSelection(str.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean updateData(InputKind inputKind) {
        float f7;
        float f11;
        Data data = this.data;
        boolean z11 = true;
        if (data == null) {
            return true;
        }
        EditText rangeFromEt = this.binding.rangeFromEt;
        Intrinsics.checkNotNullExpressionValue(rangeFromEt, "rangeFromEt");
        float value = getValue(rangeFromEt, data.getMin());
        EditText rangeToEt = this.binding.rangeToEt;
        Intrinsics.checkNotNullExpressionValue(rangeToEt, "rangeToEt");
        float value2 = getValue(rangeToEt, data.getMax());
        if (inputKind == InputKind.FROM && value > value2) {
            f7 = value2;
        } else {
            if (inputKind != InputKind.f93506TO || value2 >= value) {
                f7 = value;
                f11 = value2;
                if (data.getFrom() == f7 && data.getTo() == f11) {
                    z11 = false;
                }
                boolean z12 = z11;
                this.data = Data.copy$default(data, null, null, 0.0f, 0.0f, f7, f11, null, 0.0f, false, 463, null);
                if (!data.getHideSlider()) {
                    this.binding.rangeSeekbar.r(f7);
                    this.binding.rangeSeekbar.o(f11);
                    this.binding.rangeSeekbar.b();
                }
                return z12;
            }
            f7 = value;
        }
        f11 = f7;
        if (data.getFrom() == f7) {
            z11 = false;
        }
        boolean z122 = z11;
        this.data = Data.copy$default(data, null, null, 0.0f, 0.0f, f7, f11, null, 0.0f, false, 463, null);
        if (!data.getHideSlider()) {
        }
        return z122;
    }

    public final void bind(@NotNull Data data) {
        int i11;
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        initFormatter(data);
        TextView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, data.getTitle());
        this.binding.rangeFromEt.setText(this.editTextFormatter.numberAsFormattedString(Float.valueOf(data.getFrom()), true));
        this.binding.rangeToEt.setText(this.editTextFormatter.numberAsFormattedString(Float.valueOf(data.getTo()), true));
        TextView rangeFromUnit = this.binding.rangeFromUnit;
        Intrinsics.checkNotNullExpressionValue(rangeFromUnit, "rangeFromUnit");
        TextViewExtKt.setTextOrGone(rangeFromUnit, data.getUnits());
        TextView rangeToUnit = this.binding.rangeToUnit;
        Intrinsics.checkNotNullExpressionValue(rangeToUnit, "rangeToUnit");
        TextViewExtKt.setTextOrGone(rangeToUnit, data.getUnits());
        if (data.getHideSlider()) {
            CrystalRangeSeekbar rangeSeekbar = this.binding.rangeSeekbar;
            Intrinsics.checkNotNullExpressionValue(rangeSeekbar, "rangeSeekbar");
            ViewExtKt.gone(rangeSeekbar);
            int i12 = this.dp16;
            setPadding(i12, this.dp12, i12, this.dp8);
        } else {
            CrystalRangeSeekbar rangeSeekbar2 = this.binding.rangeSeekbar;
            Intrinsics.checkNotNullExpressionValue(rangeSeekbar2, "rangeSeekbar");
            ViewExtKt.show(rangeSeekbar2);
            CrystalRangeSeekbar crystalRangeSeekbar = this.binding.rangeSeekbar;
            crystalRangeSeekbar.s(data.getMin());
            crystalRangeSeekbar.p(data.getMax());
            crystalRangeSeekbar.r(data.getFrom());
            crystalRangeSeekbar.o(data.getTo());
            crystalRangeSeekbar.z(data.getStep());
            int i13 = WhenMappings.$EnumSwitchMapping$0[data.getRangeType().ordinal()];
            if (i13 == 1) {
                i11 = 2;
            } else {
                if (i13 != 2) {
                    throw new o();
                }
                i11 = 3;
            }
            crystalRangeSeekbar.k(i11);
            crystalRangeSeekbar.l(this.themedThumbBitmap);
            crystalRangeSeekbar.m(this.themedThumbBitmap);
            crystalRangeSeekbar.x(this.themedThumbBitmap);
            crystalRangeSeekbar.y(this.themedThumbBitmap);
            crystalRangeSeekbar.b();
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[data.getRangeType().ordinal()];
        if (i14 == 1) {
            this.binding.rangeToEt.setInputType(2);
            this.binding.rangeFromEt.setInputType(2);
        } else {
            if (i14 != 2) {
                throw new o();
            }
            this.binding.rangeFromEt.setKeyListener(this.decimalKeyListener);
            this.binding.rangeToEt.setKeyListener(this.decimalKeyListener);
        }
    }

    public final InterfaceC6511n<Float, Float, Boolean, Unit> getValuesChangeListener() {
        return this.valuesChangeListener;
    }

    public final void setValuesChangeListener(InterfaceC6511n<? super Float, ? super Float, ? super Boolean, Unit> interfaceC6511n) {
        this.valuesChangeListener = interfaceC6511n;
    }

    @NotNull
    public final Bitmap toBitmap(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public /* synthetic */ RangeFilterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8);
        int px = ResourceExtKt.toPx(12);
        this.dp12 = px;
        int px2 = ResourceExtKt.toPx(16);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(20);
        this.dp20 = px3;
        RangeFilterView$onDoneListener$1 rangeFilterView$onDoneListener$1 = new RangeFilterView$onDoneListener$1(this);
        this.onDoneListener = rangeFilterView$onDoneListener$1;
        this.editTextFormatter = new RangeEditTextFormatter();
        DigitsKeyListener digitsKeyListener = DigitsKeyListener.getInstance("0123456789.,-+");
        Intrinsics.checkNotNullExpressionValue(digitsKeyListener, "getInstance(...)");
        this.decimalKeyListener = digitsKeyListener;
        ViewAtomFilterRangeBinding bind = ViewAtomFilterRangeBinding.bind(View.inflate(context, R$layout.view_atom_filter_range, this));
        this.binding = bind;
        setPadding(px2, px, px2, px3);
        EditText rangeFromEt = bind.rangeFromEt;
        Intrinsics.checkNotNullExpressionValue(rangeFromEt, "rangeFromEt");
        this.fromEtWatcher = new NumberSeparatorTextWatcher(rangeFromEt, this.editTextFormatter);
        EditText rangeToEt = bind.rangeToEt;
        Intrinsics.checkNotNullExpressionValue(rangeToEt, "rangeToEt");
        this.toEtWatcher = new NumberSeparatorTextWatcher(rangeToEt, this.editTextFormatter);
        bind.rangeSeekbar.v(new A(this));
        bind.rangeSeekbar.w(new B(this));
        EditText rangeFromEt2 = bind.rangeFromEt;
        Intrinsics.checkNotNullExpressionValue(rangeFromEt2, "rangeFromEt");
        setOnDoneClickListener(rangeFromEt2, rangeFilterView$onDoneListener$1, new AnonymousClass3());
        EditText rangeToEt2 = bind.rangeToEt;
        Intrinsics.checkNotNullExpressionValue(rangeToEt2, "rangeToEt");
        setOnDoneClickListener(rangeToEt2, rangeFilterView$onDoneListener$1, new AnonymousClass4());
        Drawable drawable = androidx.core.content.a.getDrawable(context, R$drawable.ic_widget_atom_range_filters_thumb);
        Intrinsics.f(drawable);
        Drawable mutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        Intrinsics.checkNotNullExpressionValue(mutate, "wrap(...)");
        androidx.core.graphics.drawable.a.i(mutate, ThemeExtKt.themeColor(context, R$attr.bgActionPrimary));
        this.themedThumbBitmap = toBitmap(mutate);
    }
}
