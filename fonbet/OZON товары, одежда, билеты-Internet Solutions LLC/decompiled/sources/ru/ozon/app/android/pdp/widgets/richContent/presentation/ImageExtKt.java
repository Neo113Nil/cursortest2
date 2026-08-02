package ru.ozon.app.android.pdp.widgets.richContent.presentation;

import Sc.o;
import android.graphics.drawable.Drawable;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0000¨\u0006\u000b"}, d2 = {"setImageParams", "", "Landroid/widget/ImageView;", "positionVO", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "isParandja", "", "backgroundColor", "Lkotlin/Function0;", "Landroid/graphics/drawable/Drawable;", "isNewDrawable", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImagePositionVO.values().length];
            try {
                iArr[ImagePositionVO.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImagePositionVO.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void setImageParams(@NotNull ImageView imageView, @NotNull ImagePositionVO positionVO, boolean z11, @NotNull Function0<? extends Drawable> backgroundColor, boolean z12) {
        ImageView.ScaleType scaleType;
        Drawable.ConstantState constantState;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(positionVO, "positionVO");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        int i11 = WhenMappings.$EnumSwitchMapping$0[positionVO.ordinal()];
        if (i11 == 1) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        imageView.setScaleType(scaleType);
        imageView.setClipToOutline(true);
        if (!z11) {
            imageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            return;
        }
        Drawable invoke = backgroundColor.invoke();
        if (z12) {
            invoke = (invoke == null || (constantState = invoke.getConstantState()) == null) ? null : constantState.newDrawable();
        }
        imageView.setBackground(invoke);
    }

    public static /* synthetic */ void setImageParams$default(ImageView imageView, ImagePositionVO imagePositionVO, boolean z11, Function0 function0, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        setImageParams(imageView, imagePositionVO, z11, function0, z12);
    }
}
