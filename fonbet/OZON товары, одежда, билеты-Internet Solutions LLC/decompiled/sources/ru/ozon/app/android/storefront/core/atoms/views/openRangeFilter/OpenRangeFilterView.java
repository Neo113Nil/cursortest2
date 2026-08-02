package ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter;

import B5.C2598b;
import B90.b0;
import Sc.o;
import U7.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.R$layout;
import ru.ozon.app.android.storefront.core.atoms.databinding.ViewAtomFilterRangeBinding;
import ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterInputListener;
import ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterInputType;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0011J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010\u0011J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010*J'\u0010/\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u0002012\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b6\u00105J\u001f\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u001d¢\u0006\u0004\b:\u0010*R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u0004\u0018\u00010G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterInputListener$Callback;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "createThumbnailBitmap", "()Landroid/graphics/Bitmap;", "", "setUpPaddings", "()V", "setUpInputs", "setUpSeekbar", "Landroid/widget/EditText;", "input", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterInputType;", "type", "setUpInput", "(Landroid/widget/EditText;Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterInputType;)V", "", "updateData", "(Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterInputType;)Z", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", "data", "updateFromValue", "(Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;)Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", "updateToValue", "updateSeekbar", "notifyValueChangedListener", "Landroid/view/View;", "isKeyboardActive", "(Landroid/view/View;)Z", "hideKeyboard", "item", "bindInputValues", "(Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;)V", "bindSeekbar", "", "fromValue", "toValue", "onSeekbarChanged", "(Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;FF)V", "", "getToValue", "(Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;I)Ljava/lang/String;", "onFocusGained", "(Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterInputType;)V", "onFocusLost", "view", "onDoneClicked", "(Landroid/view/View;Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterInputType;)V", "bind", "Lkotlin/Function1;", "valuesChangedListener", "Lkotlin/jvm/functions/Function1;", "getValuesChangedListener", "()Lkotlin/jvm/functions/Function1;", "setValuesChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewAtomFilterRangeBinding;", "binding", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewAtomFilterRangeBinding;", "thumbBitmap", "Landroid/graphics/Bitmap;", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterFormatter;", "formatter", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterFormatter;", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterValueInterpolator;", "interpolator", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterValueInterpolator;", "boundData", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpenRangeFilterView extends ConstraintLayout implements AtomView, OpenRangeFilterInputListener.Callback {

    @NotNull
    private final ViewAtomFilterRangeBinding binding;
    private OpenRangeFilterViewData boundData;

    @NotNull
    private final OpenRangeFilterFormatter formatter;
    private final InputMethodManager inputMethodManager;

    @NotNull
    private final OpenRangeFilterValueInterpolator interpolator;
    private final Bitmap thumbBitmap;
    private Function1<? super OpenRangeFilterViewData, Unit> valuesChangedListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpenRangeFilterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindInputValues(OpenRangeFilterViewData item) {
        ViewAtomFilterRangeBinding viewAtomFilterRangeBinding = this.binding;
        viewAtomFilterRangeBinding.rangeFromEt.setText(String.valueOf(item.getFromValue()));
        viewAtomFilterRangeBinding.rangeFromUnit.setText(item.getUnits());
        viewAtomFilterRangeBinding.rangeToEt.setText(String.valueOf(item.getToValue()));
        viewAtomFilterRangeBinding.rangeToUnit.setText(item.getUnits());
    }

    private final void bindSeekbar(OpenRangeFilterViewData item) {
        CrystalRangeSeekbar crystalRangeSeekbar = this.binding.rangeSeekbar;
        crystalRangeSeekbar.s(0.0f);
        crystalRangeSeekbar.p(1.0f);
        crystalRangeSeekbar.r(this.interpolator.calculateSeekbarValue(item, item.getFromValue()));
        crystalRangeSeekbar.o(this.interpolator.calculateSeekbarValue(item, item.getToValue()));
        crystalRangeSeekbar.k(3);
        Bitmap bitmap = this.thumbBitmap;
        if (bitmap != null) {
            CrystalRangeSeekbar crystalRangeSeekbar2 = this.binding.rangeSeekbar;
            crystalRangeSeekbar2.l(bitmap);
            crystalRangeSeekbar2.m(bitmap);
            crystalRangeSeekbar2.x(bitmap);
            crystalRangeSeekbar2.y(bitmap);
        }
        this.binding.rangeSeekbar.b();
    }

    private final Bitmap createThumbnailBitmap() {
        Drawable mutate;
        Drawable drawable = a.getDrawable(getContext(), R$drawable.ic_widget_atom_range_filters_thumb);
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

    private final String getToValue(OpenRangeFilterViewData item, int toValue) {
        String valueOf = String.valueOf(toValue);
        if (toValue != item.getMaxValue()) {
            return valueOf;
        }
        String maxValueSign = item.getMaxValueSign();
        if (maxValueSign == null) {
            maxValueSign = "";
        }
        return d.e(valueOf, maxValueSign);
    }

    private final void hideKeyboard() {
        InputMethodManager inputMethodManager = this.inputMethodManager;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    private final boolean isKeyboardActive(View input) {
        InputMethodManager inputMethodManager = this.inputMethodManager;
        return inputMethodManager != null && inputMethodManager.isActive(input);
    }

    private final void notifyValueChangedListener() {
        Function1<? super OpenRangeFilterViewData, Unit> function1;
        OpenRangeFilterViewData openRangeFilterViewData = this.boundData;
        if (openRangeFilterViewData == null || (function1 = this.valuesChangedListener) == null) {
            return;
        }
        function1.invoke(openRangeFilterViewData);
    }

    private final void onSeekbarChanged(OpenRangeFilterViewData item, float fromValue, float toValue) {
        int calculateInputValue = this.interpolator.calculateInputValue(item, fromValue);
        int calculateInputValue2 = this.interpolator.calculateInputValue(item, toValue);
        EditText rangeFromEt = this.binding.rangeFromEt;
        Intrinsics.checkNotNullExpressionValue(rangeFromEt, "rangeFromEt");
        EditText rangeToEt = this.binding.rangeToEt;
        Intrinsics.checkNotNullExpressionValue(rangeToEt, "rangeToEt");
        rangeFromEt.setText(String.valueOf(calculateInputValue));
        rangeToEt.setText(getToValue(item, calculateInputValue2));
        if (rangeFromEt.hasFocus()) {
            rangeFromEt.setSelection(rangeFromEt.length());
        }
        if (rangeToEt.hasFocus()) {
            rangeToEt.setSelection(rangeToEt.length());
        }
    }

    private final void setUpInput(EditText input, OpenRangeFilterInputType type) {
        OpenRangeFilterInputListener openRangeFilterInputListener = new OpenRangeFilterInputListener(this, type);
        input.setInputType(2);
        input.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        input.setOnFocusChangeListener(openRangeFilterInputListener);
        input.setOnEditorActionListener(openRangeFilterInputListener);
    }

    private final void setUpInputs() {
        ViewAtomFilterRangeBinding viewAtomFilterRangeBinding = this.binding;
        EditText rangeFromEt = viewAtomFilterRangeBinding.rangeFromEt;
        Intrinsics.checkNotNullExpressionValue(rangeFromEt, "rangeFromEt");
        setUpInput(rangeFromEt, OpenRangeFilterInputType.From.INSTANCE);
        EditText rangeToEt = viewAtomFilterRangeBinding.rangeToEt;
        Intrinsics.checkNotNullExpressionValue(rangeToEt, "rangeToEt");
        setUpInput(rangeToEt, OpenRangeFilterInputType.To.INSTANCE);
    }

    private final void setUpPaddings() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setPadding(px, ResourceExtKt.toPx(12, context2), px, 0);
    }

    private final void setUpSeekbar() {
        CrystalRangeSeekbar crystalRangeSeekbar = this.binding.rangeSeekbar;
        crystalRangeSeekbar.v(new b0(this, 2));
        crystalRangeSeekbar.w(new C2598b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpSeekbar$lambda$6$lambda$3(OpenRangeFilterView openRangeFilterView, Number number, Number number2) {
        OpenRangeFilterViewData openRangeFilterViewData = openRangeFilterView.boundData;
        if (openRangeFilterViewData != null) {
            openRangeFilterView.onSeekbarChanged(openRangeFilterViewData, number.floatValue(), number2.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpSeekbar$lambda$6$lambda$5(OpenRangeFilterView openRangeFilterView, Number number, Number number2) {
        OpenRangeFilterViewData openRangeFilterViewData = openRangeFilterView.boundData;
        openRangeFilterView.boundData = openRangeFilterViewData != null ? OpenRangeFilterViewData.copy$default(openRangeFilterViewData, null, 0, 0, 0, null, null, openRangeFilterView.interpolator.calculateInputValue(openRangeFilterViewData, number.floatValue()), openRangeFilterView.interpolator.calculateInputValue(openRangeFilterViewData, number2.floatValue()), false, false, 831, null) : null;
        openRangeFilterView.notifyValueChangedListener();
    }

    private final boolean updateData(OpenRangeFilterInputType type) {
        OpenRangeFilterViewData openRangeFilterViewData = this.boundData;
        if (openRangeFilterViewData == null) {
            return false;
        }
        if (Intrinsics.d(type, OpenRangeFilterInputType.From.INSTANCE)) {
            OpenRangeFilterViewData updateFromValue = updateFromValue(openRangeFilterViewData);
            if (updateFromValue == null) {
                return false;
            }
            this.boundData = updateFromValue;
            this.binding.rangeFromEt.setText(String.valueOf(updateFromValue.getFromValue()));
            return true;
        }
        if (!Intrinsics.d(type, OpenRangeFilterInputType.To.INSTANCE)) {
            throw new o();
        }
        OpenRangeFilterViewData updateToValue = updateToValue(openRangeFilterViewData);
        if (updateToValue == null) {
            return false;
        }
        this.boundData = updateToValue;
        this.binding.rangeToEt.setText(getToValue(updateToValue, updateToValue.getToValue()));
        return true;
    }

    private final OpenRangeFilterViewData updateFromValue(OpenRangeFilterViewData data) {
        int extractFromNumber = this.formatter.extractFromNumber(data, this.binding.rangeFromEt.getText().toString());
        if (extractFromNumber == data.getFromValue()) {
            return null;
        }
        return OpenRangeFilterViewData.copy$default(data, null, 0, 0, 0, null, null, extractFromNumber, 0, false, false, 959, null);
    }

    private final void updateSeekbar() {
        OpenRangeFilterViewData openRangeFilterViewData = this.boundData;
        if (openRangeFilterViewData != null) {
            CrystalRangeSeekbar crystalRangeSeekbar = this.binding.rangeSeekbar;
            crystalRangeSeekbar.r(this.interpolator.calculateSeekbarValue(openRangeFilterViewData, openRangeFilterViewData.getFromValue()));
            crystalRangeSeekbar.o(this.interpolator.calculateSeekbarValue(openRangeFilterViewData, openRangeFilterViewData.getToValue()));
            crystalRangeSeekbar.b();
        }
    }

    private final OpenRangeFilterViewData updateToValue(OpenRangeFilterViewData data) {
        int extractToNumber = this.formatter.extractToNumber(data, this.binding.rangeToEt.getText().toString());
        if (extractToNumber == data.getToValue()) {
            return null;
        }
        boolean z11 = extractToNumber > data.getMaxValue();
        return OpenRangeFilterViewData.copy$default(data, null, 0, z11 ? extractToNumber : data.getMaxValue(), 0, null, z11 ? null : data.getMaxValueSign(), 0, extractToNumber, false, z11, 347, null);
    }

    public final void bind(@NotNull OpenRangeFilterViewData item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundData = item;
        TextView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, item.getTitle());
        bindInputValues(item);
        bindSeekbar(item);
    }

    @Override // ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterInputListener.Callback
    public void onDoneClicked(@NotNull View view, @NotNull OpenRangeFilterInputType type) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(type, "type");
        if (updateData(type)) {
            updateSeekbar();
            notifyValueChangedListener();
        }
        if (isKeyboardActive(view)) {
            hideKeyboard();
        }
        clearFocus();
    }

    @Override // ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterInputListener.Callback
    public void onFocusGained(@NotNull OpenRangeFilterInputType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        OpenRangeFilterViewData openRangeFilterViewData = this.boundData;
        if (openRangeFilterViewData != null && Intrinsics.d(type, OpenRangeFilterInputType.To.INSTANCE) && openRangeFilterViewData.getToValue() == openRangeFilterViewData.getMaxValue() && openRangeFilterViewData.getMaxValueSign() != null) {
            Editable text = this.binding.rangeToEt.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (h.B(text, openRangeFilterViewData.getMaxValueSign())) {
                this.binding.rangeToEt.setText(String.valueOf(openRangeFilterViewData.getToValue()));
            }
        }
    }

    @Override // ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterInputListener.Callback
    public void onFocusLost(@NotNull OpenRangeFilterInputType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (updateData(type)) {
            updateSeekbar();
            notifyValueChangedListener();
            return;
        }
        OpenRangeFilterViewData openRangeFilterViewData = this.boundData;
        if (openRangeFilterViewData != null && Intrinsics.d(type, OpenRangeFilterInputType.To.INSTANCE) && openRangeFilterViewData.getToValue() == openRangeFilterViewData.getMaxValue() && openRangeFilterViewData.getMaxValueSign() != null) {
            Editable text = this.binding.rangeToEt.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (h.B(text, openRangeFilterViewData.getMaxValueSign())) {
                return;
            }
            this.binding.rangeToEt.setText(openRangeFilterViewData.getToValue() + openRangeFilterViewData.getMaxValueSign());
        }
    }

    public final void setValuesChangedListener(Function1<? super OpenRangeFilterViewData, Unit> function1) {
        this.valuesChangedListener = function1;
    }

    public /* synthetic */ OpenRangeFilterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenRangeFilterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewAtomFilterRangeBinding bind = ViewAtomFilterRangeBinding.bind(View.inflate(context, R$layout.view_atom_filter_range, this));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.thumbBitmap = createThumbnailBitmap();
        Object systemService = context.getSystemService("input_method");
        this.inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        this.formatter = new OpenRangeFilterFormatter();
        this.interpolator = new OpenRangeFilterValueInterpolator();
        setUpPaddings();
        setUpInputs();
        setUpSeekbar();
    }
}
