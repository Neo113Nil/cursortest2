package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/TextMeasurer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "measure", "Landroid/graphics/Point;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textStyleResId", "", "widthMeasureSpec", "heightMeasureSpec", "maxLines", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextMeasurer {

    @NotNull
    private final AppCompatTextView textView;

    public TextMeasurer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.textView = appCompatTextView;
    }

    @NotNull
    public final Point measure(@NotNull OzonSpannableString text, int textStyleResId, int widthMeasureSpec, int heightMeasureSpec, int maxLines) {
        Intrinsics.checkNotNullParameter(text, "text");
        AppCompatTextView appCompatTextView = this.textView;
        appCompatTextView.setTextAppearance(textStyleResId);
        appCompatTextView.setText(text);
        appCompatTextView.setMaxLines(maxLines);
        appCompatTextView.measure(widthMeasureSpec, heightMeasureSpec);
        return new Point(appCompatTextView.getMeasuredWidth(), appCompatTextView.getMeasuredHeight());
    }
}
