package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e {
    public static final Rect a(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        if (layoutCoordinates2 == null) {
            layoutCoordinates2 = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        }
        float f6 = IntSize.getWidth-impl(layoutCoordinates2.getSize-YbymL2g());
        float f10 = IntSize.getHeight-impl(layoutCoordinates2.getSize-YbymL2g());
        androidx.compose.ui.geometry.Rect localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, (Object) null);
        float left = localBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > f6) {
            left = f6;
        }
        float top = localBoundingBoxOf$default.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > f10) {
            top = f10;
        }
        float right = localBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= f6) {
            f6 = right;
        }
        float bottom = localBoundingBoxOf$default.getBottom();
        float f11 = bottom >= 0.0f ? bottom : 0.0f;
        if (f11 <= f10) {
            f10 = f11;
        }
        if (left == f6 || top == f10) {
            return new Rect();
        }
        long j = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, top));
        long j6 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f6, top));
        long j10 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f6, f10));
        long j11 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, f10));
        float f12 = Offset.getX-impl(j);
        float f13 = Offset.getX-impl(j6);
        float f14 = Offset.getX-impl(j11);
        float f15 = Offset.getX-impl(j10);
        float min = Math.min(f12, Math.min(f13, Math.min(f14, f15)));
        float max = Math.max(f12, Math.max(f13, Math.max(f14, f15)));
        float f16 = Offset.getY-impl(j);
        float f17 = Offset.getY-impl(j6);
        float f18 = Offset.getY-impl(j11);
        float f19 = Offset.getY-impl(j10);
        return new Rect((int) min, (int) Math.min(f16, Math.min(f17, Math.min(f18, f19))), (int) max, (int) Math.max(f16, Math.max(f17, Math.max(f18, f19))));
    }

    public static final Painter b(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        for (int i5 = 0; i5 < size; i5++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i5)).getModifier();
            String name = modifier.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.A(name, "Painter", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof Painter) {
                        return (Painter) obj;
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static final k c(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        Color color = null;
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i5)).getModifier();
            String name = modifier.getClass().getName();
            Intrinsics.checkNotNull(name);
            if (StringsKt.A(name, "Text", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    ColorProducer colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
                    if (colorProducer != null) {
                        color = Color.box-impl(colorProducer.invoke-0d7_KjU());
                    }
                } catch (Throwable unused) {
                }
                color = null;
            } else if (StringsKt.A(name, "Fill", false)) {
                z5 = true;
            }
        }
        return new k(color, z5);
    }
}
