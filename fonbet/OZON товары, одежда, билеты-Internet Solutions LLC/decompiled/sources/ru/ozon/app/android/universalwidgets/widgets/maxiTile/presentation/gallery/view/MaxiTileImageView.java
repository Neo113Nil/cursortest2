package ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery.view;

import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.vi.MaxiTileVI;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.view.MaxiTileView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/view/MaxiTileImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "containerWidth", "I", "ratio34Width", "ratio34Height", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem$DisplayMode;", "displayMode", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem$DisplayMode;", "getDisplayMode", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem$DisplayMode;", "setDisplayMode", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem$DisplayMode;)V", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaxiTileImageView extends AppCompatImageView {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int containerWidth;

    @NotNull
    private MaxiTileVI.Gallery.ImageItem.DisplayMode displayMode;
    private final int ratio34Height;
    private final int ratio34Width;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/view/MaxiTileImageView$Companion;", "", "<init>", "()V", "RATIO", "", "IMAGE_COUNT_PER_CONTAINER_WIDTH", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MaxiTileVI.Gallery.ImageItem.DisplayMode.values().length];
            try {
                iArr[MaxiTileVI.Gallery.ImageItem.DisplayMode.RATIO_3_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MaxiTileVI.Gallery.ImageItem.DisplayMode.FULL_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ MaxiTileImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.displayMode.ordinal()];
        if (i12 == 1) {
            i11 = this.ratio34Width;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = this.containerWidth;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(this.ratio34Height, 1073741824));
    }

    public final void setDisplayMode(@NotNull MaxiTileVI.Gallery.ImageItem.DisplayMode displayMode) {
        Intrinsics.checkNotNullParameter(displayMode, "<set-?>");
        this.displayMode = displayMode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxiTileImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int containerHorizontalMargin = context.getResources().getDisplayMetrics().widthPixels - (MaxiTileView.INSTANCE.getContainerHorizontalMargin() * 2);
        this.containerWidth = containerHorizontalMargin;
        int i12 = (int) (containerHorizontalMargin / 1.6d);
        this.ratio34Width = i12;
        this.ratio34Height = (int) (i12 * 1.3333334f);
        this.displayMode = MaxiTileVI.Gallery.ImageItem.DisplayMode.RATIO_3_4;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }
}
