package ru.ozon.app.android.videomolecule.presentation.view.controlpanel;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tH\u0002J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0003\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/view/controlpanel/VideoMoleculeTextMeasurer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "landscapeMaxTimeWidth", "", "hourInMills", "", "fatHourTime", "", "fatMinutesTime", "tv", "Landroidx/appcompat/widget/AppCompatTextView;", "getLandscapeMaxTimeWidth", "durationInMills", "measureWidthByDuration", "measureText", "Landroid/graphics/Point;", "text", "textStyleResId", "widthMeasureSpec", "heightMeasureSpec", "maxLines", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeTextMeasurer {

    @NotNull
    private final Context context;

    @NotNull
    private final String fatHourTime;

    @NotNull
    private final String fatMinutesTime;
    private final long hourInMills;
    private int landscapeMaxTimeWidth;

    @NotNull
    private final AppCompatTextView tv;

    public VideoMoleculeTextMeasurer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.landscapeMaxTimeWidth = -1;
        this.hourInMills = 3600000L;
        this.fatHourTime = "00:00:00";
        this.fatMinutesTime = "00:00";
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.tv = appCompatTextView;
    }

    private final Point measureText(String text, int textStyleResId, int widthMeasureSpec, int heightMeasureSpec, int maxLines) {
        AppCompatTextView appCompatTextView = this.tv;
        appCompatTextView.setTextAppearance(textStyleResId);
        appCompatTextView.setText(text);
        appCompatTextView.setMaxLines(maxLines);
        appCompatTextView.measure(widthMeasureSpec, heightMeasureSpec);
        return new Point(appCompatTextView.getMeasuredWidth(), appCompatTextView.getMeasuredHeight());
    }

    static /* synthetic */ Point measureText$default(VideoMoleculeTextMeasurer videoMoleculeTextMeasurer, String str, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i11 = R$style.TextStyle_Caption_Bold;
        }
        int i16 = i11;
        int i17 = (i15 & 4) != 0 ? 0 : i12;
        int i18 = (i15 & 8) != 0 ? 0 : i13;
        if ((i15 & 16) != 0) {
            i14 = 1;
        }
        return videoMoleculeTextMeasurer.measureText(str, i16, i17, i18, i14);
    }

    private final int measureWidthByDuration(long durationInMills) {
        return ((durationInMills >= this.hourInMills ? measureText$default(this, this.fatHourTime, 0, 0, 0, 0, 30, null).x : measureText$default(this, this.fatMinutesTime, 0, 0, 0, 0, 30, null).x) * 2) + ResourceExtKt.toPx(4) + measureText$default(this, "/", 0, 0, 0, 0, 30, null).x;
    }

    public final int getLandscapeMaxTimeWidth(long durationInMills) {
        if (this.landscapeMaxTimeWidth == -1) {
            this.landscapeMaxTimeWidth = measureWidthByDuration(durationInMills);
        }
        return this.landscapeMaxTimeWidth;
    }
}
