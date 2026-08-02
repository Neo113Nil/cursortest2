package ru.ozon.app.android.storefront.core.atoms.views;

import B90.E;
import B90.F;
import Em0.c;
import G.g;
import V.e;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.storefront.core.atoms.R$layout;
import ru.ozon.app.android.storefront.core.atoms.databinding.ViewAtomFilterRangeBinding;
import ru.ozon.app.android.storefront.core.atoms.views.TimeRangeFilterView;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002IJB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020,2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b0\u00101R6\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010=\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010D\u001a\u0004\u0018\u00010C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setInputTypeToTime", "()V", "setUpTimeRangeSeekbar", "setUpInputs", "Landroid/widget/EditText;", "input", "Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterView$InputKind;", "inputKind", "setListeners", "(Landroid/widget/EditText;Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterView$InputKind;)V", "notifyValueChangeListener", "removeFormatWatchers", "", FormPageDTO.Field.FIELD_TYPE_MASK, "addFormatWatchers", "(Ljava/lang/String;)V", "LEm0/c;", "createFormatWatcher", "(Ljava/lang/String;)LEm0/c;", "Landroid/graphics/Bitmap;", "createThumbBitmap", "()Landroid/graphics/Bitmap;", "Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterViewData;", "data", "", "updateSeekbar", "(Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterViewData;Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterView$InputKind;)Z", "", "number", "numberAsTime", "(Ljava/lang/Number;)Ljava/lang/String;", "time", "", "defaultNumber", "timeAsNumber", "(Ljava/lang/String;F)F", "bind", "(Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterViewData;)V", "Lkotlin/Function2;", "valuesChangeListener", "Lkotlin/jvm/functions/Function2;", "getValuesChangeListener", "()Lkotlin/jvm/functions/Function2;", "setValuesChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "horizontalPadding", "I", "topPadding", "bottomPadding", "themedThumbBitmap", "Landroid/graphics/Bitmap;", "Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterViewData;", "fromFormatWatcher", "LEm0/c;", "toFormatWatcher", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewAtomFilterRangeBinding;", "binding", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewAtomFilterRangeBinding;", "InputKind", "TimeSlotsParser", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeRangeFilterView extends ConstraintLayout implements AtomView {

    @NotNull
    private final ViewAtomFilterRangeBinding binding;
    private final int bottomPadding;
    private TimeRangeFilterViewData data;
    private c fromFormatWatcher;
    private final int horizontalPadding;
    private final InputMethodManager inputMethodManager;
    private final Bitmap themedThumbBitmap;
    private c toFormatWatcher;
    private final int topPadding;
    private Function2<? super Integer, ? super Integer, Unit> valuesChangeListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterView$InputKind;", "", "<init>", "(Ljava/lang/String;I)V", "FROM", "TO", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputKind {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InputKind[] $VALUES;
        public static final InputKind FROM = new InputKind("FROM", 0);

        /* renamed from: TO, reason: collision with root package name */
        public static final InputKind f93507TO = new InputKind("TO", 1);

        private static final /* synthetic */ InputKind[] $values() {
            return new InputKind[]{FROM, f93507TO};
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/TimeRangeFilterView$TimeSlotsParser;", "LCm0/b;", "<init>", "()V", "", "rawMask", "", "LDm0/b;", "parseSlots", "(Ljava/lang/CharSequence;)[LDm0/b;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TimeSlotsParser implements Cm0.b {
        @Override // Cm0.b
        @NotNull
        public Dm0.b[] parseSlots(@NotNull CharSequence rawMask) {
            Intrinsics.checkNotNullParameter(rawMask, "rawMask");
            int length = rawMask.length();
            Dm0.b[] bVarArr = new Dm0.b[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVarArr[i11] = rawMask.charAt(i11) == ':' ? Dm0.a.b(':') : Dm0.a.a();
            }
            return bVarArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeRangeFilterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addFormatWatchers(String mask) {
        c createFormatWatcher = createFormatWatcher(mask);
        createFormatWatcher.c(this.binding.rangeFromEt);
        this.fromFormatWatcher = createFormatWatcher;
        c createFormatWatcher2 = createFormatWatcher(mask);
        createFormatWatcher2.c(this.binding.rangeToEt);
        this.toFormatWatcher = createFormatWatcher2;
    }

    private final c createFormatWatcher(String mask) {
        return new Em0.a(new TimeSlotsParser(), Bm0.b.h(mask));
    }

    private final Bitmap createThumbBitmap() {
        Drawable mutate;
        Drawable drawable = androidx.core.content.a.getDrawable(getContext(), R$drawable.ic_widget_atom_range_filters_thumb);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        androidx.core.graphics.drawable.a.i(mutate, ThemeExtKt.themeColor(context, R$attr.oz_semantic_accent_primary));
        Bitmap createBitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        mutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        mutate.draw(canvas);
        return createBitmap;
    }

    private final void notifyValueChangeListener() {
        Function2<? super Integer, ? super Integer, Unit> function2;
        TimeRangeFilterViewData timeRangeFilterViewData = this.data;
        if (timeRangeFilterViewData == null || (function2 = this.valuesChangeListener) == null) {
            return;
        }
        function2.invoke(Integer.valueOf((int) timeRangeFilterViewData.getFromValue()), Integer.valueOf((int) timeRangeFilterViewData.getToValue()));
    }

    private final String numberAsTime(Number number) {
        int intValue = number.intValue();
        return g.c(e.b(new Object[]{Integer.valueOf(intValue / 60)}, 1, "%02d", "format(...)"), ProductContainerDTO.RATIO_DELIMITER, e.b(new Object[]{Integer.valueOf(intValue % 60)}, 1, "%02d", "format(...)"));
    }

    private final void removeFormatWatchers() {
        c cVar = this.fromFormatWatcher;
        if (cVar != null) {
            this.binding.rangeFromEt.removeTextChangedListener(cVar);
        }
        c cVar2 = this.toFormatWatcher;
        if (cVar2 != null) {
            this.binding.rangeToEt.removeTextChangedListener(cVar2);
        }
    }

    private final void setInputTypeToTime() {
        this.binding.rangeFromEt.setInputType(32);
        this.binding.rangeToEt.setInputType(32);
    }

    private final void setListeners(final EditText input, final InputKind inputKind) {
        final I i11 = new I();
        input.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: PJ.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                TimeRangeFilterView.setListeners$lambda$4(I.this, this, inputKind, view, z11);
            }
        });
        input.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: PJ.f
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                boolean listeners$lambda$5;
                listeners$lambda$5 = TimeRangeFilterView.setListeners$lambda$5(TimeRangeFilterView.this, inputKind, input, i11, textView, i12, keyEvent);
                return listeners$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$4(I i11, TimeRangeFilterView timeRangeFilterView, InputKind inputKind, View view, boolean z11) {
        if (i11.f71783a && !z11) {
            i11.f71783a = false;
            if (timeRangeFilterView.updateSeekbar(timeRangeFilterView.data, inputKind)) {
                timeRangeFilterView.notifyValueChangeListener();
            }
        }
        i11.f71783a = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setListeners$lambda$5(TimeRangeFilterView timeRangeFilterView, InputKind inputKind, EditText editText, I i11, TextView textView, int i12, KeyEvent keyEvent) {
        boolean z11 = i12 == 6;
        if (z11) {
            if (timeRangeFilterView.updateSeekbar(timeRangeFilterView.data, inputKind)) {
                timeRangeFilterView.notifyValueChangeListener();
            }
            InputMethodManager inputMethodManager = timeRangeFilterView.inputMethodManager;
            if (inputMethodManager != null && inputMethodManager.isActive(editText)) {
                timeRangeFilterView.inputMethodManager.hideSoftInputFromWindow(timeRangeFilterView.getWindowToken(), 0);
            }
            i11.f71783a = false;
            timeRangeFilterView.clearFocus();
        }
        return z11;
    }

    private final void setUpInputs() {
        EditText rangeFromEt = this.binding.rangeFromEt;
        Intrinsics.checkNotNullExpressionValue(rangeFromEt, "rangeFromEt");
        setListeners(rangeFromEt, InputKind.FROM);
        EditText rangeToEt = this.binding.rangeToEt;
        Intrinsics.checkNotNullExpressionValue(rangeToEt, "rangeToEt");
        setListeners(rangeToEt, InputKind.f93507TO);
    }

    private final void setUpTimeRangeSeekbar() {
        int i11 = 2;
        this.binding.rangeSeekbar.v(new E(this, i11));
        this.binding.rangeSeekbar.w(new F(this, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpTimeRangeSeekbar$lambda$2(TimeRangeFilterView timeRangeFilterView, Number number, Number number2) {
        EditText editText = timeRangeFilterView.binding.rangeFromEt;
        Intrinsics.f(number);
        editText.setText(timeRangeFilterView.numberAsTime(number));
        EditText editText2 = timeRangeFilterView.binding.rangeToEt;
        Intrinsics.f(number2);
        editText2.setText(timeRangeFilterView.numberAsTime(number2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpTimeRangeSeekbar$lambda$3(TimeRangeFilterView timeRangeFilterView, Number number, Number number2) {
        float floatValue = number.floatValue();
        TimeRangeFilterViewData timeRangeFilterViewData = timeRangeFilterView.data;
        float max = Math.max(floatValue, timeRangeFilterViewData != null ? timeRangeFilterViewData.getMinValue() : 0.0f);
        float floatValue2 = number2.floatValue();
        TimeRangeFilterViewData timeRangeFilterViewData2 = timeRangeFilterView.data;
        float max2 = Math.max(floatValue2, timeRangeFilterViewData2 != null ? timeRangeFilterViewData2.getMinValue() : 0.0f);
        TimeRangeFilterViewData timeRangeFilterViewData3 = timeRangeFilterView.data;
        timeRangeFilterView.data = timeRangeFilterViewData3 != null ? TimeRangeFilterViewData.copy$default(timeRangeFilterViewData3, null, 0.0f, 0.0f, max, max2, 0.0f, null, null, 231, null) : null;
        Function2<? super Integer, ? super Integer, Unit> function2 = timeRangeFilterView.valuesChangeListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf((int) max), Integer.valueOf((int) max2));
        }
    }

    private final float timeAsNumber(String time, float defaultNumber) {
        List l11;
        try {
            l11 = h.l(time, new char[]{':'}, 0, 6);
        } catch (Throwable unused) {
        }
        if (l11.isEmpty()) {
            return defaultNumber;
        }
        int parseInt = Integer.parseInt((String) l11.get(0));
        if (parseInt >= 24) {
            parseInt = 23;
        }
        long minutes = TimeUnit.HOURS.toMinutes(parseInt);
        if (l11.size() > 1) {
            int parseInt2 = Integer.parseInt((String) l11.get(1));
            if (parseInt2 >= 60) {
                parseInt2 = 59;
            }
            minutes += parseInt2;
        }
        return minutes;
    }

    private final boolean updateSeekbar(TimeRangeFilterViewData data, InputKind inputKind) {
        float f7;
        float f11;
        if (data == null) {
            return false;
        }
        float timeAsNumber = timeAsNumber(this.binding.rangeFromEt.getText().toString(), data.getMinValue());
        float timeAsNumber2 = timeAsNumber(this.binding.rangeToEt.getText().toString(), data.getMaxValue());
        if (timeAsNumber == data.getFromValue() && timeAsNumber2 == data.getToValue()) {
            return false;
        }
        if (inputKind == InputKind.FROM && timeAsNumber > timeAsNumber2) {
            f7 = timeAsNumber2;
        } else {
            if (inputKind != InputKind.f93507TO || timeAsNumber2 >= timeAsNumber) {
                f7 = timeAsNumber;
                f11 = timeAsNumber2;
                this.data = TimeRangeFilterViewData.copy$default(data, null, 0.0f, 0.0f, f7, f11, 0.0f, null, null, 231, null);
                CrystalRangeSeekbar crystalRangeSeekbar = this.binding.rangeSeekbar;
                crystalRangeSeekbar.r(f7);
                crystalRangeSeekbar.o(f11);
                crystalRangeSeekbar.b();
                return true;
            }
            f7 = timeAsNumber;
        }
        f11 = f7;
        this.data = TimeRangeFilterViewData.copy$default(data, null, 0.0f, 0.0f, f7, f11, 0.0f, null, null, 231, null);
        CrystalRangeSeekbar crystalRangeSeekbar2 = this.binding.rangeSeekbar;
        crystalRangeSeekbar2.r(f7);
        crystalRangeSeekbar2.o(f11);
        crystalRangeSeekbar2.b();
        return true;
    }

    public final void bind(@NotNull TimeRangeFilterViewData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        removeFormatWatchers();
        addFormatWatchers(data.getInputMask());
        TextView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, data.getTitle());
        this.binding.rangeFromEt.setText(numberAsTime(Float.valueOf(data.getFromValue())));
        this.binding.rangeToEt.setText(numberAsTime(Float.valueOf(data.getToValue())));
        CrystalRangeSeekbar crystalRangeSeekbar = this.binding.rangeSeekbar;
        crystalRangeSeekbar.s(data.getMinValue());
        crystalRangeSeekbar.p(data.getMaxValue());
        crystalRangeSeekbar.r(data.getFromValue());
        crystalRangeSeekbar.o(data.getToValue());
        crystalRangeSeekbar.z(data.getStep());
        crystalRangeSeekbar.k(3);
        Bitmap bitmap = this.themedThumbBitmap;
        if (bitmap != null) {
            CrystalRangeSeekbar crystalRangeSeekbar2 = this.binding.rangeSeekbar;
            crystalRangeSeekbar2.l(bitmap);
            crystalRangeSeekbar2.m(bitmap);
            crystalRangeSeekbar2.x(bitmap);
            crystalRangeSeekbar2.y(this.themedThumbBitmap);
        }
        this.binding.rangeSeekbar.b();
    }

    public final void setValuesChangeListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.valuesChangeListener = function2;
    }

    public /* synthetic */ TimeRangeFilterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeRangeFilterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.horizontalPadding = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.topPadding = px2;
        int px3 = ResourceExtKt.toPx(20, context);
        this.bottomPadding = px3;
        Object systemService = context.getSystemService("input_method");
        this.inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        this.binding = ViewAtomFilterRangeBinding.bind(View.inflate(context, R$layout.view_atom_filter_range, this));
        setPadding(px, px2, px, px3);
        setInputTypeToTime();
        setUpTimeRangeSeekbar();
        setUpInputs();
        this.themedThumbBitmap = createThumbBitmap();
    }
}
