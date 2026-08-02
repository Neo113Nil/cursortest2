package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockViewHolderDelegate;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/RoundedCornerVO;", "", "cornerRadii", "", "cornerRadius", "applyTo", "(Ljava/util/List;[FF)[F", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "position", "", "bindOuterBackground", "(Ljava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;)V", "Landroid/view/View;", "", "dp4", "I", "dp16", "backgroundCornerRadius", "F", "cornersCoordinates", "[F", "Landroid/graphics/drawable/GradientDrawable;", "topBackgroundLayer", "Landroid/graphics/drawable/GradientDrawable;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlockViewHolderDelegate {
    private final float backgroundCornerRadius;

    @NotNull
    private final View containerView;

    @NotNull
    private final float[] cornersCoordinates;
    private final int dp16;
    private final int dp4;

    @NotNull
    private GradientDrawable topBackgroundLayer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NaviBlockPositionVO.values().length];
            try {
                iArr[NaviBlockPositionVO.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NaviBlockPositionVO.MIDDLE_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NaviBlockPositionVO.PENULTIMATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NaviBlockPositionVO.FIRST_PENULTIMATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NaviBlockPositionVO.SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NaviBlockPositionVO.MIDDLE_ODD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NaviBlockPositionVO.LAST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NaviBlockPositionVO.SECOND_LAST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NaviBlockViewHolderDelegate(@NotNull View containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.dp4 = ResourceExtKt.toPx(4);
        this.dp16 = ResourceExtKt.toPx(16);
        this.backgroundCornerRadius = ResourceExtKt.toPxF(24);
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = 0.0f;
        }
        this.cornersCoordinates = fArr;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.topBackgroundLayer = gradientDrawable;
        View view = this.containerView;
        view.setClipToOutline(true);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        view.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(ThemeExtKt.themeColor(context2, R$attr.layerFloor0)), this.topBackgroundLayer}));
    }

    private final float[] applyTo(List<? extends RoundedCornerVO> list, float[] fArr, float f7) {
        int length = fArr.length;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, 0, length, 0.0f);
        for (RoundedCornerVO roundedCornerVO : list) {
            if (roundedCornerVO != RoundedCornerVO.NONE) {
                fArr[roundedCornerVO.getRoundedCornerX()] = f7;
                fArr[roundedCornerVO.getRoundedCornerY()] = f7;
            }
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bindOuterBackground(@NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull NaviBlockPositionVO position) {
        boolean z11;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(position, "position");
        switch (WhenMappings.$EnumSwitchMapping$0[position.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                z11 = true;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                z11 = false;
                break;
            default:
                throw new o();
        }
        this.topBackgroundLayer.setCornerRadii(applyTo(roundedCorners, this.cornersCoordinates, this.backgroundCornerRadius));
        View view = this.containerView;
        int i13 = z11 ? this.dp16 : this.dp4;
        List<? extends RoundedCornerVO> list = roundedCorners;
        boolean z12 = list instanceof Collection;
        if (!z12 || !list.isEmpty()) {
            for (RoundedCornerVO roundedCornerVO : list) {
                if (roundedCornerVO == RoundedCornerVO.TOP_LEFT || roundedCornerVO == RoundedCornerVO.TOP_RIGHT) {
                    i11 = this.dp16;
                    int i14 = z11 ? this.dp16 : this.dp4;
                    if (z12 || !list.isEmpty()) {
                        for (RoundedCornerVO roundedCornerVO2 : list) {
                            if (roundedCornerVO2 == RoundedCornerVO.BOTTOM_LEFT || roundedCornerVO2 == RoundedCornerVO.BOTTOM_RIGHT) {
                                i12 = this.dp16;
                                ViewExtKt.updatePadding(view, i13, i11, i14, i12);
                            }
                        }
                    }
                    i12 = this.dp4;
                    ViewExtKt.updatePadding(view, i13, i11, i14, i12);
                }
            }
        }
        i11 = this.dp4;
        if (z11) {
        }
        if (z12) {
        }
        while (r7.hasNext()) {
        }
        i12 = this.dp4;
        ViewExtKt.updatePadding(view, i13, i11, i14, i12);
    }
}
