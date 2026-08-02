package ru.ozon.app.android.storefront.core.atoms.views;

import android.os.Build;
import android.text.Editable;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.views.RangeEditTextFormatter;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/NumberSeparatorTextWatcher;", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "editText", "Landroid/widget/EditText;", "formatter", "Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter;", "<init>", "(Landroid/widget/EditText;Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter;)V", "prevLength", "", "beforeTextChanged", "", "sequence", "", "start", "count", "after", "afterTextChanged", "editable", "Landroid/text/Editable;", "handleSeparatorSymbol", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NumberSeparatorTextWatcher extends SimpleTextWatcher {

    @NotNull
    private final EditText editText;

    @NotNull
    private final RangeEditTextFormatter formatter;
    private int prevLength;

    public NumberSeparatorTextWatcher(@NotNull EditText editText, @NotNull RangeEditTextFormatter formatter) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.editText = editText;
        this.formatter = formatter;
        if (Build.VERSION.SDK_INT >= 31) {
            editText.setOnReceiveContentListener(CommaDotPasteReceiver.INSTANCE.getMIME_TYPES(), new CommaDotPasteReceiver());
        }
    }

    private final void handleSeparatorSymbol(Editable editable, EditText editText) {
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        int i11 = 0;
        for (int i12 = 0; i12 < text.length(); i12++) {
            if (C7705l.m(RangeEditTextFormatter.INSTANCE.getSEPARATORS$atoms_prodGoogleAllVendorsRelease(), Character.valueOf(text.charAt(i12)))) {
                i11++;
            }
        }
        if (i11 <= 1) {
            RangeEditTextFormatterKt.setTextWithSelection(editText, h.X(h.z0(editText.getText().toString()).toString(), ".", ",", false));
        } else {
            RangeEditTextFormatterKt.setTextWithSelection(editText, h.z(editable.toString()));
        }
    }

    @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
        if (editable.length() == 0) {
            return;
        }
        this.editText.removeTextChangedListener(this);
        char M11 = h.M(editable.toString());
        RangeEditTextFormatter.TextLengthState textLengthState = this.prevLength > editable.length() ? RangeEditTextFormatter.TextLengthState.CLEARING : this.prevLength < editable.length() ? RangeEditTextFormatter.TextLengthState.ADDING : RangeEditTextFormatter.TextLengthState.UNCHANGED;
        if (C7705l.m(RangeEditTextFormatter.INSTANCE.getSEPARATORS$atoms_prodGoogleAllVendorsRelease(), Character.valueOf(M11))) {
            handleSeparatorSymbol(editable, this.editText);
        } else {
            RangeEditTextFormatter.formatEditTextString$default(this.formatter, this.editText, false, null, textLengthState, 4, null);
        }
        this.editText.addTextChangedListener(this);
    }

    @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence sequence, int start, int count, int after) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        super.beforeTextChanged(sequence, start, count, after);
        this.prevLength = sequence.length();
    }
}
