package ru.ozon.app.android.videomolecule.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.videomolecule.databinding.VideoMoleculeRewindPanelBinding;
import ru.ozon.app.android.videomolecule.presentation.MapperKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0011R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeRewindView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "showHours", "", "oneHourInMils", "binding", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeRewindPanelBinding;", "setRewindTime", "", "mills", "", "setTotalDuration", "bindTime", "totalDuration", "position", "hideTime", "showTime", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeRewindView extends ConstraintLayout {

    @NotNull
    private final VideoMoleculeRewindPanelBinding binding;
    private final int oneHourInMils;
    private boolean showHours;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeRewindView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindTime(long totalDuration, long position) {
        this.showHours = totalDuration >= ((long) this.oneHourInMils);
        setRewindTime(position);
        setTotalDuration(totalDuration);
    }

    public final void hideTime() {
        VideoMoleculeRewindPanelBinding videoMoleculeRewindPanelBinding = this.binding;
        TextView rewindTime = videoMoleculeRewindPanelBinding.rewindTime;
        Intrinsics.checkNotNullExpressionValue(rewindTime, "rewindTime");
        ViewExtKt.gone(rewindTime);
        TextView totalTime = videoMoleculeRewindPanelBinding.totalTime;
        Intrinsics.checkNotNullExpressionValue(totalTime, "totalTime");
        ViewExtKt.gone(totalTime);
        ImageView dot = videoMoleculeRewindPanelBinding.dot;
        Intrinsics.checkNotNullExpressionValue(dot, "dot");
        ViewExtKt.gone(dot);
    }

    public final void setRewindTime(long mills) {
        this.binding.rewindTime.setText(MapperKt.toTimeString(mills, this.showHours));
    }

    public final void setTotalDuration(long mills) {
        this.binding.totalTime.setText(MapperKt.toTimeString(mills, this.showHours));
    }

    public final void showTime() {
        VideoMoleculeRewindPanelBinding videoMoleculeRewindPanelBinding = this.binding;
        TextView rewindTime = videoMoleculeRewindPanelBinding.rewindTime;
        Intrinsics.checkNotNullExpressionValue(rewindTime, "rewindTime");
        ViewExtKt.show(rewindTime);
        TextView totalTime = videoMoleculeRewindPanelBinding.totalTime;
        Intrinsics.checkNotNullExpressionValue(totalTime, "totalTime");
        ViewExtKt.show(totalTime);
        ImageView dot = videoMoleculeRewindPanelBinding.dot;
        Intrinsics.checkNotNullExpressionValue(dot, "dot");
        ViewExtKt.show(dot);
    }

    public /* synthetic */ VideoMoleculeRewindView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeRewindView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.oneHourInMils = 3600000;
        VideoMoleculeRewindPanelBinding inflate = VideoMoleculeRewindPanelBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setBackgroundColor(ResourceExtKt.color(context, R$color.oz_semantic_dimming));
    }
}
