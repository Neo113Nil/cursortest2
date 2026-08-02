package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.C7232a;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.R$drawable;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.R$plurals;
import ru.ozon.app.android.ugc.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0007J\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\f\u0010\u001a\u001a\u00020\u0012*\u00020\u0007H\u0002J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "progressBarColor", "", "Ljava/lang/Integer;", "cell", "Lru/ozon/uni/android/cell/CellView;", "progressBar", "Landroid/widget/ProgressBar;", "setCell", "", "dto", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "progressColor", "", "setMax", "max", "setProgress", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setProgressText", "Lru/ozon/uni/android/cell/CellView$TextView;", "min", "formattedString", "setProgressBarColor", "progressValue", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormPointsProgressView extends CardView {

    @NotNull
    private final CellView cell;

    @NotNull
    private final ProgressBar progressBar;
    private Integer progressBarColor;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormPointsProgressView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.reviewFormMobilePointsProgressCell);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        cellView.setLayoutParams(layoutParams);
        this.cell = cellView;
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        progressBar.setId(R$id.reviewFormMobilePointsProgressBar);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, ResourceExtKt.toPx(4));
        layoutParams2.gravity = 80;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setProgressDrawable(C7232a.a(context, R$drawable.custom_points_progress_bar));
        this.progressBar = progressBar;
        setId(R$id.reviewFormMobilePointsProgressCv);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setCardElevation(0.0f);
        addView(cellView);
        addView(progressBar);
    }

    private final String formattedString(int i11) {
        DecimalFormat decimalFormat = new DecimalFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator((char) 8239);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String format = decimalFormat.format(Integer.valueOf(i11));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final void setProgressBarColor(int progressValue, int progressBarColor) {
        if (progressValue == 0) {
            progressBarColor = getContext().getColor(R$color.transparent);
        }
        Drawable progressDrawable = this.progressBar.getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setTintList(ColorStateList.valueOf(progressBarColor));
        }
    }

    private final void setProgressText(CellView.TextView textView, int i11, int i12) {
        textView.setText(StringProvider.getString(R$string.review_points_progress_android, StringProvider.getQuantityString(R$plurals.reviews_points, i11, Integer.valueOf(i11)), formattedString(i12)));
    }

    public final void setCell(@NotNull CellDTO dto, @NotNull String progressColor) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(progressColor, "progressColor");
        CellHolderKt.bindOrGone$default(this.cell, dto, null, 2, null);
        setProgressText(this.cell.getCenterBlock().getTitleView(), this.progressBar.getProgress(), this.progressBar.getMax());
        setRadius(this.cell.getCellCornerRadius());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, progressColor);
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            this.progressBarColor = Integer.valueOf(intValue);
            setProgressBarColor(this.progressBar.getProgress(), intValue);
        }
    }

    public final void setMax(int max) {
        this.progressBar.setMax(max);
    }

    public final void setProgress(int value) {
        Integer num = this.progressBarColor;
        if (num != null) {
            setProgressBarColor(value, num.intValue());
        }
        this.progressBar.setProgress(value, true);
        setProgressText(this.cell.getCenterBlock().getTitleView(), value, this.progressBar.getMax());
    }
}
