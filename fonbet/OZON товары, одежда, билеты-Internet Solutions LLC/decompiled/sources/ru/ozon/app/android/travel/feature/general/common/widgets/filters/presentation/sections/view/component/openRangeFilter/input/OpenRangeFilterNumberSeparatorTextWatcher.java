package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input;

import android.text.Editable;
import android.widget.EditText;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.OpenRangeFilterEditTextFormatter;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterNumberSeparatorTextWatcher;", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "editText", "Landroid/widget/EditText;", "formatter", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterEditTextFormatter;", "type", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;", "<init>", "(Landroid/widget/EditText;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterEditTextFormatter;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;)V", "isFocused", "", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "setIsFocused", AppMeasurementSdk.ConditionalUserProperty.VALUE, "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OpenRangeFilterNumberSeparatorTextWatcher extends SimpleTextWatcher {

    @NotNull
    private final EditText editText;

    @NotNull
    private final OpenRangeFilterEditTextFormatter formatter;
    private boolean isFocused;

    @NotNull
    private final OpenRangeFilterInputType type;

    public OpenRangeFilterNumberSeparatorTextWatcher(@NotNull EditText editText, @NotNull OpenRangeFilterEditTextFormatter formatter, @NotNull OpenRangeFilterInputType type) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(type, "type");
        this.editText = editText;
        this.formatter = formatter;
        this.type = type;
    }

    @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
        if (editable.length() == 0) {
            return;
        }
        this.editText.removeTextChangedListener(this);
        this.formatter.formatEditTextString(this.editText, false, new OpenRangeFilterEditTextFormatter.FormattingOptions(this.type, this.isFocused));
        this.editText.addTextChangedListener(this);
    }

    public final void setIsFocused(boolean value) {
        this.isFocused = value;
    }
}
