package ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.view;

import FK.a;
import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.databinding.ViewPointsInputBinding;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.presentation.PointsInputVO;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000eR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/view/PointsInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewPointsInputBinding;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/presentation/PointsInputVO;", "addSearchQueryTextWatcher", "watcher", "Landroid/text/TextWatcher;", "removeSearchQueryTextWatcher", "isClearQueryIconVisible", "isVisible", "", "toggleKeyboard", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PointsInputView extends ConstraintLayout {

    @NotNull
    private final ViewPointsInputBinding binding;

    public /* synthetic */ PointsInputView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PointsInputView pointsInputView, View view) {
        AppCompatImageView pointsInputClearSearchIcon = pointsInputView.binding.pointsInputClearSearchIcon;
        Intrinsics.checkNotNullExpressionValue(pointsInputClearSearchIcon, "pointsInputClearSearchIcon");
        pointsInputClearSearchIcon.setVisibility(8);
        pointsInputView.binding.pointsInputEditText.setText((CharSequence) null);
    }

    public final void addSearchQueryTextWatcher(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        this.binding.pointsInputEditText.addTextChangedListener(watcher);
    }

    public final void bind(@NotNull PointsInputVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.pointsInputTitleTextView.setText(item.getTitle());
        this.binding.pointsInputEditText.setHint(item.getHint());
    }

    public final void isClearQueryIconVisible(boolean isVisible) {
        AppCompatImageView pointsInputClearSearchIcon = this.binding.pointsInputClearSearchIcon;
        Intrinsics.checkNotNullExpressionValue(pointsInputClearSearchIcon, "pointsInputClearSearchIcon");
        pointsInputClearSearchIcon.setVisibility(isVisible ? 0 : 8);
    }

    public final void removeSearchQueryTextWatcher(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        this.binding.pointsInputEditText.removeTextChangedListener(watcher);
    }

    public final void toggleKeyboard() {
        AppCompatEditText appCompatEditText = this.binding.pointsInputEditText;
        appCompatEditText.requestFocus();
        KeyboardUtilsKt.showKeyboard(appCompatEditText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointsInputView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewPointsInputBinding inflate = ViewPointsInputBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        inflate.pointsInputClearSearchIcon.setOnClickListener(new a(this, 16));
    }
}
