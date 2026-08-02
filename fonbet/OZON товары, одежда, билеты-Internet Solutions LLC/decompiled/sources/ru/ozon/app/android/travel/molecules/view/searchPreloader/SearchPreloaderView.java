package ru.ozon.app.android.travel.molecules.view.searchPreloader;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.R$styleable;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/searchPreloader/SearchPreloaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "progressBarView", "Lru/ozon/app/android/travel/molecules/view/searchPreloader/SearchProgressBarView;", "progressColor", "setProgress", "", "progress", "", "setTextColor", "color", "setProgressColor", "setTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "loaderWidth", "provideTitleTextView", "provideProgressBarView", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SearchPreloaderView extends LinearLayout {
    public static final int $stable = 8;

    @NotNull
    private final SearchProgressBarView progressBarView;
    private int progressColor;

    @NotNull
    private final AppCompatTextView titleTextView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchPreloaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SearchProgressBarView provideProgressBarView(Context context) {
        int px = ResourceExtKt.toPx(4, context);
        SearchProgressBarView searchProgressBarView = new SearchProgressBarView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, px);
        layoutParams.topMargin = px;
        searchProgressBarView.setLayoutParams(layoutParams);
        return searchProgressBarView;
    }

    private final AppCompatTextView provideTitleTextView(Context context) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        appCompatTextView.setTextAppearance(R$style.TextStyle_Caption);
        return appCompatTextView;
    }

    public final int loaderWidth() {
        return this.progressBarView.getWidth();
    }

    public final void setProgress(float progress) {
        this.progressBarView.setProgress(progress);
    }

    public final void setProgressColor(int color) {
        this.progressBarView.setProgressColor(color);
    }

    public final void setTextColor(int color) {
        this.titleTextView.setTextColor(color);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.titleTextView.setText(title);
    }

    public /* synthetic */ SearchPreloaderView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPreloaderView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView provideTitleTextView = provideTitleTextView(context);
        this.titleTextView = provideTitleTextView;
        SearchProgressBarView provideProgressBarView = provideProgressBarView(context);
        this.progressBarView = provideProgressBarView;
        this.progressColor = ThemeExtKt.themeColor(context, R$attr.graphicPositivePrimary);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SearchPreloaderView, i11, i12);
            try {
                provideTitleTextView.setTextColor(obtainStyledAttributes.getInt(R$styleable.SearchPreloaderView_spvTextColor, this.progressColor));
                provideProgressBarView.setProgressColor(obtainStyledAttributes.getInt(R$styleable.SearchPreloaderView_spvProgressLineColor, this.progressColor));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setOrientation(1);
        addView(provideTitleTextView);
        addView(provideProgressBarView);
    }
}
