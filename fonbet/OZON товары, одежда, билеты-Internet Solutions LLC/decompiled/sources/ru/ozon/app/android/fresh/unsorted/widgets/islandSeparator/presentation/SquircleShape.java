package ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.presentation;

import Sc.o;
import Xc.a;
import Xc.b;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.presentation.SquircleShape;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/SquircleShape;", "", "<init>", "()V", "horizontalRadius", "", "verticalRadius", "getShapeDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "view", "Landroid/view/View;", "roundedCorners", "Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/SquircleShape$SquircleRoundedCorners;", "radiusH", "radiusW", "topOffset", "createPath", "Landroid/graphics/Path;", "getSquirclePathBottomRoundedCorners", "rect", "Landroid/graphics/RectF;", "getSquirclePathTopRoundedCorners", "getSquirclePathRoundedCorners", "SquircleRoundedCorners", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SquircleShape {

    @NotNull
    public static final SquircleShape INSTANCE = new SquircleShape();
    private static final float horizontalRadius = ResourceExtKt.toPxF(28);
    private static final float verticalRadius = ResourceExtKt.toPxF(23);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/SquircleShape$SquircleRoundedCorners;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "BOTH", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SquircleRoundedCorners {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SquircleRoundedCorners[] $VALUES;
        public static final SquircleRoundedCorners TOP = new SquircleRoundedCorners("TOP", 0);
        public static final SquircleRoundedCorners BOTTOM = new SquircleRoundedCorners("BOTTOM", 1);
        public static final SquircleRoundedCorners BOTH = new SquircleRoundedCorners("BOTH", 2);

        private static final /* synthetic */ SquircleRoundedCorners[] $values() {
            return new SquircleRoundedCorners[]{TOP, BOTTOM, BOTH};
        }

        static {
            SquircleRoundedCorners[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SquircleRoundedCorners(String str, int i11) {
        }

        public static SquircleRoundedCorners valueOf(String str) {
            return (SquircleRoundedCorners) Enum.valueOf(SquircleRoundedCorners.class, str);
        }

        public static SquircleRoundedCorners[] values() {
            return (SquircleRoundedCorners[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SquircleRoundedCorners.values().length];
            try {
                iArr[SquircleRoundedCorners.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SquircleRoundedCorners.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SquircleRoundedCorners.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SquircleShape() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Path createPath(SquircleRoundedCorners roundedCorners, View view, float radiusH, float radiusW, float topOffset) {
        RectF rectF = new RectF(0.0f, topOffset + 0.0f, view.getWidth(), view.getHeight());
        int i11 = WhenMappings.$EnumSwitchMapping$0[roundedCorners.ordinal()];
        if (i11 == 1) {
            return getSquirclePathTopRoundedCorners(rectF, radiusH, radiusW);
        }
        if (i11 == 2) {
            return getSquirclePathBottomRoundedCorners(rectF, radiusH, radiusW);
        }
        if (i11 == 3) {
            return getSquirclePathRoundedCorners(rectF, radiusH, radiusW);
        }
        throw new o();
    }

    public static /* synthetic */ ShapeDrawable getShapeDrawable$default(SquircleShape squircleShape, View view, SquircleRoundedCorners squircleRoundedCorners, float f7, float f11, float f12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f7 = verticalRadius;
        }
        float f13 = f7;
        if ((i11 & 8) != 0) {
            f11 = horizontalRadius;
        }
        float f14 = f11;
        if ((i11 & 16) != 0) {
            f12 = 0.0f;
        }
        return squircleShape.getShapeDrawable(view, squircleRoundedCorners, f13, f14, f12);
    }

    private final Path getSquirclePathBottomRoundedCorners(RectF rect, float radiusH, float radiusW) {
        float f7 = rect.left;
        float f11 = rect.right;
        float f12 = rect.top;
        float f13 = rect.bottom;
        Path path = new Path();
        path.lineTo(f11, f12);
        float f14 = f13 - radiusH;
        path.lineTo(f11, f14);
        path.quadTo(f11, f13, f11 - radiusW, f13);
        path.lineTo(radiusW + f7, f13);
        path.quadTo(f7, f13, f7, f14);
        path.lineTo(f7, f13 + radiusH);
        path.close();
        return path;
    }

    private final Path getSquirclePathRoundedCorners(RectF rect, float radiusH, float radiusW) {
        float f7 = rect.left;
        float f11 = rect.right;
        float f12 = rect.top;
        float f13 = rect.bottom;
        Path path = new Path();
        float f14 = f13 - radiusH;
        path.moveTo(f7, f14);
        float f15 = radiusH + f12;
        path.lineTo(f7, f15);
        float f16 = f7 + radiusW;
        path.quadTo(f7, f12, f16, f12);
        float f17 = f11 - radiusW;
        path.lineTo(f17, f12);
        path.quadTo(f11, f12, f11, f15);
        path.lineTo(f11, f14);
        path.quadTo(f11, f13, f17, f13);
        path.lineTo(f16, f13);
        path.quadTo(f7, f13, f7, f14);
        return path;
    }

    private final Path getSquirclePathTopRoundedCorners(RectF rect, float radiusH, float radiusW) {
        float f7 = rect.left;
        float f11 = rect.right;
        float f12 = rect.top;
        float f13 = rect.bottom;
        Path path = new Path();
        path.moveTo(f7, f13);
        float f14 = radiusH + f12;
        path.lineTo(f7, f14);
        path.quadTo(f7, f12, f7 + radiusW, f12);
        path.lineTo(f11 - radiusW, f12);
        path.quadTo(f11, f12, f11, f14);
        path.lineTo(f11, f13);
        path.close();
        return path;
    }

    @NotNull
    public final ShapeDrawable getShapeDrawable(@NotNull final View view, @NotNull final SquircleRoundedCorners roundedCorners, final float radiusH, final float radiusW, final float topOffset) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        final PathShape pathShape = new PathShape(createPath(roundedCorners, view, radiusH, radiusW, topOffset), view.getWidth(), view.getHeight());
        return new ShapeDrawable(pathShape) { // from class: ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.presentation.SquircleShape$getShapeDrawable$1
            @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
            protected void onBoundsChange(Rect bounds) {
                Path createPath;
                Intrinsics.checkNotNullParameter(bounds, "bounds");
                super.onBoundsChange(bounds);
                createPath = SquircleShape.INSTANCE.createPath(SquircleShape.SquircleRoundedCorners.this, view, radiusH, radiusW, topOffset);
                setShape(new PathShape(createPath, bounds.width(), bounds.height()));
            }
        };
    }
}
